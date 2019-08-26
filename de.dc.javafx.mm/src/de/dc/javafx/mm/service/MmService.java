package de.dc.javafx.mm.service;

import de.dc.javafx.mm.ETableView;
import de.dc.javafx.mm.MmFactory;

public class MmService implements IMmService{

	@Override
	public ETableView createTableView(String id) {
		ETableView control = MmFactory.eINSTANCE.createETableView();
		control.setId(id);
		return control;
	}

}
