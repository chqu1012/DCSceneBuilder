package de.dc.javafx.mm.editor.command;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.core.PackageFragment;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SelectionDialog;

import com.oracle.javafx.scenebuilder.kit.editor.EditorController;
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMDocument;

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

					IProject project = parent.getProject();
					IFolder srcFolder = project.getFolder("src");
					
					IJavaProject jp = JavaCore.create(project);
					try {
						SelectionDialog dialog = JavaUI.createPackageDialog(new Shell(), jp.getPackageFragmentRoot(srcFolder));
						int code = dialog.open();
						if (code == 0) {
							for (Object object : dialog.getResult()) {
								if (object instanceof PackageFragment) {
									PackageFragment fragment = (PackageFragment) object;

									FxmlModel fxmlModel = new FxmlModel(model.getName().replace(".fxml", ""), fragment.getElementName(), fxomDocument);
									String controllerContent = new ControllerByFxmlTemplate().gen(fxmlModel);
									System.out.println(controllerContent);
								}
							}
							
						}
					} catch (JavaModelException e) {
						e.printStackTrace();
					}
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
