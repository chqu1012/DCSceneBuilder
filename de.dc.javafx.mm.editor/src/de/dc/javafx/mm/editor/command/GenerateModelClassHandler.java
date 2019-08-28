package de.dc.javafx.mm.editor.command;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;

import de.dc.javafx.mm.EmfModel;
import de.dc.javafx.mm.editor.util.ResourceManager;
import de.dc.javafx.mm.file.FxmlFile;

public class GenerateModelClassHandler extends AbstractHandler {

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

				FxmlFile fxmlFile = new FxmlFile();
				EObject root = fxmlFile.load(model.getRawLocation().toPortableString());
				if (root instanceof EmfModel) {
					EmfModel emfModel = (EmfModel) root;

					IProject project = parent.getProject();
					IFolder srcFolder = project.getFolder("src");
					IFolder genFolder = getFolder(srcFolder, emfModel.getBasePackage().split("\\.")).getFolder("model");

					try {
						if (!genFolder.exists()) {
							genFolder.create(true, true, null);
						}
						IFile ifile = genFolder.getFile(emfModel.getName() + ".java");
						ifile.create(new ByteArrayInputStream("Hello World".getBytes()), IResource.NONE, null);
					} catch (CoreException e1) {
						e1.printStackTrace();
					}

					try {
						parent.refreshLocal(IResource.DEPTH_INFINITE, null);
					} catch (CoreException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return null;
	}

	public IFolder getFolder(IFolder folder, String[] basePackage) {
		IFolder currentFolder = null;
		for (String pack : basePackage) {
			if (currentFolder != null) {
				currentFolder = currentFolder.getFolder(pack);
			} else {
				currentFolder = folder.getFolder(pack);
			}
		}
		return currentFolder;
	}

}
