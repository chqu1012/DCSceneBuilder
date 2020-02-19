package de.dc.javafx.mm.editor.command;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFolder;

public class ConvertToXmiHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
//		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
//		ISelection selection = selectionService.getSelection();
//		if (selection instanceof TreeSelection) {
//			TreeSelection ss = (TreeSelection) selection;
//			Object firstElement = ss.getFirstElement();
//			if (firstElement instanceof IFile) {
//				IFile model = (IFile) firstElement;
//				IFolder parent = (IFolder) model.getParent();
//				
//				String fileName = model.getName();
//				Injector injector = new MmDslStandaloneSetup().createInjectorAndDoEMFRegistration();
//				
//				XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
//				URI uri = URI.createFileURI(model.getRawLocation().toPortableString());
//				Resource xtextResource = resourceSet.getResource(uri, true);
//				
//				EcoreUtil.resolveAll(xtextResource);
//				
//				EObject root = xtextResource.getContents().get(0);
//				if (root instanceof EmfModel) {
//					EmfModel emfModel = (EmfModel) root;
//					
//					IProject project = parent.getProject();
//					IFolder srcFolder = project.getFolder("src");
//					IFolder genFolder = getFolder(srcFolder, emfModel.getBasePackage().split("\\."));
//					System.out.println(genFolder.getRawLocation().toPortableString());
//					
//					Resource xmiResource = resourceSet.createResource(URI.createURI("file:///"+parent.getRawLocation().toOSString()+"/"+fileName.replace(".javafxl", ".javafx")));
//					xmiResource.getContents().add(root);
//					try {
//						xmiResource.save(null);
//					} catch (IOException e) {
//						e.printStackTrace();
//					}
//					
//					try {
//						parent.refreshLocal(IResource.DEPTH_INFINITE, null);
//					} catch (CoreException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//		}
		
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
