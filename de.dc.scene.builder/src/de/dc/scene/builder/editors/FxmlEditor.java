package de.dc.scene.builder.editors;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.IDocument;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.part.FileEditorInput;

import com.oracle.javafx.scenebuilder.kit.editor.EditorController;
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMDocument;
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMInstance;
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMObject;
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMProperty;
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMPropertyC;
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMPropertyT;
import com.oracle.javafx.scenebuilder.kit.metadata.util.PropertyName;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;

public class FxmlEditor extends TextEditor {

	private ColorManager colorManager;
	private EditorController editorController;
	private Text text;
	private String fxmlText;

	public FxmlEditor() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new XMLConfiguration(colorManager));
		setDocumentProvider(new XMLDocumentProvider());
	}

	@Override
	public void init(IEditorSite site, IEditorInput editorInput) throws PartInitException {
		super.init(site, editorInput);
		new JFXPanel();

		if (!(editorInput instanceof IFileEditorInput))
			throw new PartInitException("Invalid Input: Must be IFileEditorInput");

		FileEditorInput fileInputEditor = (FileEditorInput) editorInput;

		IFile ifile = fileInputEditor.getFile();
		IPath location = ifile.getLocation();

		fxmlText = fileToString(location.toOSString());

		Platform.runLater(() -> {
			try {
				editorController = new EditorController();
				URL fxmlLocation = location.toFile().toURI().toURL();
				editorController.setFxmlTextAndLocation(fxmlText, fxmlLocation);

				IDocument document = getDocumentProvider().getDocument(editorInput);

				Display.getDefault().asyncExec(() -> {
					document.set(fxmlText);
				});

				FXOMDocument fxomDocument = editorController.getFxomDocument();
				FXOMObject root = fxomDocument.getFxomRoot();
				browseObject(root);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
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
	
	@Override
	public void dispose() {
		colorManager.dispose();
		super.dispose();
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

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isDirty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setFocus() {
		if (text!=null) {
			text.forceFocus();
		}
	}
}
