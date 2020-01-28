package de.dc.javafx.mm.editor.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PlatformUI;

import de.dc.javafx.mm.EBean;
import de.dc.javafx.mm.ETableView;
import de.dc.javafx.mm.EmfModel;
import de.dc.javafx.mm.editor.ModelLogView;
import de.dc.javafx.mm.util.MmSwitch;

public class ENodeValidator extends MmSwitch<EObject> {

	private ModelLogView modelLog;
	
	public ENodeValidator() {
		IViewPart viewPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(ModelLogView.ID);
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().activate(viewPart);
		modelLog = (ModelLogView) viewPart;
	}

	@Override
	public EObject caseEmfModel(EmfModel object) {
		checkValueEmpty(object, "BasePackae", object.getBasePackage());
		checkValueEmpty(object, "Controller", object.getController());
		return object;
	}
	
	@Override
	public EObject caseETableView(ETableView object) {
		checkValueEmpty(object, "ID", object.getId());
		return object;
	}
	
	@Override
	public EObject caseEBean(EBean object) {
		checkValueEmpty(object, "InstanceName", object.getInstanceName());
		checkValueEmpty(object, "Name", object.getName());
		return object;
	}

	private boolean checkValueEmpty(EObject obj, String attribute, String value) {
		boolean valueEmpty = value == null || value.isEmpty();
		if (valueEmpty) {
			String message = "%s %s is not defined!";
			message = String.format(message, obj.eClass().getName(), attribute);
			modelLog.add(obj, message);
		}
		return valueEmpty;
	}
	
	public void clearLog() {
		modelLog.clearEntries();
	}
}
