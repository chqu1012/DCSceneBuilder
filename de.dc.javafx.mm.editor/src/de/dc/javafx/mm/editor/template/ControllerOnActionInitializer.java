package de.dc.javafx.mm.editor.template;

import de.dc.javafx.mm.EBorderPane;
import de.dc.javafx.mm.EButton;
import de.dc.javafx.mm.ENode;
import de.dc.javafx.mm.ETableView;
import de.dc.javafx.mm.EText;
import de.dc.javafx.mm.util.MmSwitch;

public class ControllerOnActionInitializer extends MmSwitch<String>{

	private static final String ON_ACTION_INIT = "@FXML\nprotected void %s(ActionEvent event) {\n\n}\n\n";
	
	@Override public String caseEBorderPane(EBorderPane object) { return initControl(object);}
	@Override public String caseETableView(ETableView object) {return initControl(object);}
	@Override public String caseEButton(EButton object) { return initControl(object);}
	@Override public String caseEText(EText object) { return initControl(object, "TextField");}
	
	private String initControl(ENode node) {
		return initControl(node, node.getOnAction());
	}

	private String initControl(ENode node, String eventName) {
		if (node.getOnAction()==null) return "";
		return String.format(ON_ACTION_INIT, eventName);
	}
}
