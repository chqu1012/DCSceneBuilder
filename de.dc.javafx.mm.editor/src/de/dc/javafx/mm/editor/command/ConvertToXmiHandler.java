package de.dc.javafx.mm.editor.command;

import java.io.IOException;
import java.util.Spliterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import de.dc.javafx.mm.EmfModel;
import de.dc.javafx.mm.lang.MmDslStandaloneSetup;

public class ConvertToXmiHandler extends AbstractHandler {

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
				
				String fileName = model.getName();
				Injector injector = new MmDslStandaloneSetup().createInjectorAndDoEMFRegistration();
				
				XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
				URI uri = URI.createFileURI(model.getRawLocation().toPortableString());
				Resource xtextResource = resourceSet.getResource(uri, true);
				
				EcoreUtil.resolveAll(xtextResource);
				
				EObject root = xtextResource.getContents().get(0);
				if (root instanceof EmfModel) {
					EmfModel emfModel = (EmfModel) root;
					
					IProject project = parent.getProject();
					IFolder srcFolder = project.getFolder("src");
					IFolder genFolder = getFolder(srcFolder, emfModel.getBasePackage().split("\\."));
					System.out.println(genFolder.getRawLocation().toPortableString());
					
					Resource xmiResource = resourceSet.createResource(URI.createURI("file:///"+parent.getRawLocation().toOSString()+"/"+fileName.replace(".javafxl", ".javafx")));
					xmiResource.getContents().add(root);
					try {
						xmiResource.save(null);
					} catch (IOException e) {
						e.printStackTrace();
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
			if (currentFolder!=null) {
				currentFolder = currentFolder.getFolder(pack);
			}else {
				currentFolder = folder.getFolder(pack);
			}
		}		
		return currentFolder;
	}
}
