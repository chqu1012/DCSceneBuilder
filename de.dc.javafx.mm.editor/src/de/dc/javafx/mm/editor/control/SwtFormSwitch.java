package de.dc.javafx.mm.editor.control;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import de.dc.javafx.mm.ETableView;
import de.dc.javafx.mm.util.MmSwitch;

public class SwtFormSwitch extends MmSwitch<Control>{

	private Composite parent;
	
	public SwtFormSwitch(Composite parent) {
		this.parent = parent;
	}

	@Override
	public Control caseETableView(ETableView object) {
		return super.caseETableView(object);
	}
}