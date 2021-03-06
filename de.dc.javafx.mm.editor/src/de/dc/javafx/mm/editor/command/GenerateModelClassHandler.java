package de.dc.javafx.mm.editor.command;

import java.io.ByteArrayInputStream;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;

import de.dc.javafx.mm.EBean;
import de.dc.javafx.mm.ETableView;
import de.dc.javafx.mm.EmfModel;
import de.dc.javafx.mm.editor.template.ModelTemplate;
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

					TreeIterator<Object> contents = EcoreUtil.getAllContents(emfModel, true);
					contents.forEachRemaining(e->{
						if (e instanceof EBean) {
							EBean tableViewModel = (EBean) e;
							
							boolean validInstanceName = tableViewModel.getInstanceName()!=null && !tableViewModel.getInstanceName().isEmpty();
							boolean validName = tableViewModel.getName()!=null && !tableViewModel.getName().isEmpty();
							if (validName && validInstanceName) {
								try {
									if (!genFolder.exists()) {
										genFolder.create(true, true, null);
									}
									IFile ifile = genFolder.getFile(tableViewModel.getName() + ".java");
									ifile.create(new ByteArrayInputStream(new ModelTemplate().gen(tableViewModel).getBytes()), IResource.NONE, null);
									parent.refreshLocal(IResource.DEPTH_INFINITE, null);
								} catch (CoreException e1) {
									e1.printStackTrace();
								}
							}else {
								ETableView table = (ETableView) tableViewModel.eContainer();
								MessageDialog.openError(new Shell(), "Model not generated for ETableView(id:"+table.getId()+")!", "Name or InstanceName should not be null or empty!");
							}
						}
					});
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
