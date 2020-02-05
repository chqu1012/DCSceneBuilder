package de.dc.javafx.mm.editor.command;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;

import com.oracle.javafx.scenebuilder.kit.editor.EditorController;
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMDocument;
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMInstance;
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMObject;
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMPropertyT;

import de.dc.javafx.mm.ENode;
import de.dc.javafx.mm.MmFactory;
import de.dc.javafx.mm.MmPackage;
import de.dc.javafx.mm.editor.model.FxmlModel;
import de.dc.javafx.mm.editor.template.ControllerByFxmlTemplate;
import javafx.embed.swing.JFXPanel;

public class GenerateControllerFromFxmlHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		ISelection selection = selectionService.getSelection();
		if (selection instanceof TreeSelection) {
			TreeSelection ss = (TreeSelection) selection;
			Object firstElement = ss.getFirstElement();
			if (firstElement instanceof IFile) {
				IFile model = (IFile) firstElement;
				IFolder parent = (IFolder) model.getParent();

				String fxmlText = fileToString(model.getRawLocation().toPortableString());
				new JFXPanel();
				EditorController editorController = new EditorController();
				URL fxmlLocation;

				try {
					fxmlLocation = model.getLocation().toFile().toURI().toURL();
					editorController.setFxmlTextAndLocation(fxmlText, fxmlLocation);

					FXOMDocument fxomDocument = editorController.getFxomDocument();

					FxmlModel fxmlModel = new FxmlModel(model.getName().replace(".fxml", ""), "", fxomDocument);
					String controllerContent = new ControllerByFxmlTemplate().gen(fxmlModel);
					System.out.println(controllerContent);
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	public String fileToString(String path) {
		FileInputStream fileinput = null;
		try {
			fileinput = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int filetmp = 0;
		try {
			filetmp = fileinput.available();
		} catch (IOException e) {
			e.printStackTrace();
		}
		byte bitstream[] = new byte[filetmp];
		try {
			fileinput.read(bitstream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new String(bitstream);
	}

	public IFolder getFolder(IFolder folder, String[] basePackage) throws CoreException {
		IFolder currentFolder = null;
		for (String pack : basePackage) {
			if (currentFolder != null) {
				currentFolder = currentFolder.getFolder(pack);
			} else {
				currentFolder = folder.getFolder(pack);
				currentFolder.create(true, true, null);
			}
		}
		return currentFolder;
	}
}
