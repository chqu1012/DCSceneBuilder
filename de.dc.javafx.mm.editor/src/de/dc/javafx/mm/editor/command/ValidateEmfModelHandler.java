package de.dc.javafx.mm.editor.command;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import de.dc.javafx.mm.editor.validation.ENodeValidator;
import de.dc.javafx.mm.presentation.MmEditor;

public class ValidateEmfModelHandler extends AbstractHandler{

	private ENodeValidator validator = new ENodeValidator();
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEditorPart activeEditor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if (activeEditor instanceof MmEditor) {
			MmEditor editor = (MmEditor) activeEditor;
				Object firstElement = editor.getViewer().getInput();
				ResourceSet resourceSet = (ResourceSet) firstElement;
				EObject resource = resourceSet.getResources().get(0).getContents().get(0);
				TreeIterator<Object> root = EcoreUtil.getAllContents(resource, true);
				validator.clearLog();
				validator.doSwitch(resource);
				
				while (root.hasNext()) {
					validator.doSwitch((EObject) root.next());
				}
		}
		
		return null;
	}
}