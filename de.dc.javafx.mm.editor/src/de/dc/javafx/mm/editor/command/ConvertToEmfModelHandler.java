package de.dc.javafx.mm.editor.command;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;

import com.oracle.javafx.scenebuilder.kit.editor.EditorController;
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMDocument;
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMInstance;
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMObject;
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMProperty;
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMPropertyC;
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMPropertyT;
import com.oracle.javafx.scenebuilder.kit.metadata.util.PropertyName;

import de.dc.javafx.mm.EmfModel;
import de.dc.javafx.mm.file.FxmlFile;
import javafx.embed.swing.JFXPanel;

public class ConvertToEmfModelHandler extends AbstractHandler {

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
					FXOMObject root = fxomDocument.getFxomRoot();
					browseObject(root);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	private void browseObject(FXOMObject o) {
		if (o instanceof FXOMInstance) {
			FXOMInstance instance = (FXOMInstance) o;
			Class<?> declaredClass = instance.getDeclaredClass();
			// PrefWidth, PrefHeight, Stylesheets
			// Here: center and left
			Map<PropertyName, FXOMProperty> properties = instance.getProperties();			
			System.out.println("declaredClass: "+declaredClass);
			System.out.println("controller: "+instance.getFxController());
			System.out.println("constant: "+instance.getFxConstant());
			System.out.println("value: "+instance.getFxValue());
			System.out.println("id: "+instance.getFxId());
			for (Entry<PropertyName, FXOMProperty> entry : properties.entrySet()) {
				FXOMProperty property = entry.getValue();
				String value ="";
				if (property instanceof FXOMPropertyC) {
					FXOMPropertyC c = (FXOMPropertyC) property;
					value="C:"+c.getValues().toString();
					
				}else if (property instanceof FXOMPropertyT) {
					FXOMPropertyT t = (FXOMPropertyT) property;
					value="T:"+t.getValue();
					
				}
				System.out.println("Key: "+entry.getKey().getName()+", value: "+value);			
			}
			System.out.println("************************************************************");
		}
		o.getChildObjects().forEach(this::browseObject);
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