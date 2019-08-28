package de.dc.javafx.mm.editor.template;

import de.dc.javafx.mm.EBorderPane;
import de.dc.javafx.mm.ETableView;
import de.dc.javafx.mm.util.MmSwitch;

public class ControllerFieldInitializer extends MmSwitch<String>{

	private static final String FIELD_INIT = "@FXML\nprotected %s %s;\n\n";

	@Override
	public String caseEBorderPane(EBorderPane object) {
		if (object.getId()==null) return "";
		return String.format(FIELD_INIT, "BorderPane", object.getId());
	}

	@Override
	public String caseETableView(ETableView object) {
		if (object.getId()==null) return "";
		return String.format(FIELD_INIT, "TableView", object.getId());
	}
}