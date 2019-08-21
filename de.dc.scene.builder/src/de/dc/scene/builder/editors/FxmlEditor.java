package de.dc.scene.builder.editors;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.List;

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
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMObject;

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
				System.out.println(root);
				List<FXOMObject> childObjects = root.getChildObjects();
				for (FXOMObject fxomObject : childObjects) {
					System.out.println(fxomObject);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
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
		text.forceFocus();
	}
}
