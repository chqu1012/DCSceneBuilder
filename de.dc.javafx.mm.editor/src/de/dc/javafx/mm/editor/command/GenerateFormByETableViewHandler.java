package de.dc.javafx.mm.editor.command;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import de.dc.javafx.mm.EBinding;
import de.dc.javafx.mm.EBindingDirection;
import de.dc.javafx.mm.EControlBinding;
import de.dc.javafx.mm.ELabel;
import de.dc.javafx.mm.EPane;
import de.dc.javafx.mm.ETableColumn;
import de.dc.javafx.mm.ETableView;
import de.dc.javafx.mm.EText;
import de.dc.javafx.mm.EVBox;
import de.dc.javafx.mm.EmfModel;
import de.dc.javafx.mm.MmFactory;
import de.dc.javafx.mm.presentation.MmEditor;

public class GenerateFormByETableViewHandler extends AbstractHandler{

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEditorPart activeEditor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if (activeEditor instanceof MmEditor) {
			MmEditor editor = (MmEditor) activeEditor;
			Object firstElement = editor.getViewer().getInput();
			ResourceSet resourceSet = (ResourceSet) firstElement;
			EObject resource = resourceSet.getResources().get(0).getContents().get(0);
				
			ISelection selection = editor.getSelection();	
			if (selection instanceof IStructuredSelection) {
				IStructuredSelection ss = (IStructuredSelection) selection;
				if (ss.getFirstElement() instanceof ETableView) {
					ETableView tableView = (ETableView) ss.getFirstElement();
					EVBox vbox = MmFactory.eINSTANCE.createEVBox();
					vbox.setId("vbox"+StringUtils.capitalize(tableView.getId())+"Form");
					
					for (ETableColumn column : tableView.getColumns()) {
						ELabel label = MmFactory.eINSTANCE.createELabel();
						label.setText(column.getName());
						
						EText text = MmFactory.eINSTANCE.createEText();
						text.setPromtText("Please enter a "+column.getName());
						text.setId("text"+StringUtils.capitalize(column.getId()));
						
						EBinding binding = MmFactory.eINSTANCE.createEBinding();
						binding.setBinding(EControlBinding.TEXT_PROPERTY);
						binding.setDirection(EBindingDirection.BIND_BIDIRECTIONAL);
						binding.setName("text"+StringUtils.capitalize(column.getId()));
						binding.setNode(text);
						
						vbox.getChildren().add(label);
						vbox.getChildren().add(text);
						
						if (resource instanceof EmfModel) {
							EmfModel model = (EmfModel) resource;
							model.getBindingModel().getBindings().add(binding);
						}
					}
					
					EPane pane = (EPane) tableView.eContainer();
					pane.getChildren().add(vbox);
				}
			}
		}
		return null;
	}

}
