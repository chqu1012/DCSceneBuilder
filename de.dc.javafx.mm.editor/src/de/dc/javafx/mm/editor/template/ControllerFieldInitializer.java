package de.dc.javafx.mm.editor.template;

import de.dc.javafx.mm.EBorderPane;
import de.dc.javafx.mm.EButton;
import de.dc.javafx.mm.ENode;
import de.dc.javafx.mm.ETableView;
import de.dc.javafx.mm.EText;
import de.dc.javafx.mm.util.MmSwitch;

public class ControllerFieldInitializer extends MmSwitch<String> {

	private static final String FIELD_INIT = "@FXML\nprotected %s %s;\n\n";
	private static final String ON_ACTION_INIT = "@FXML\nprotected void %s(ActionEvent event) {\n\n}\n\n";
	
	private ControllerGenType type;
	
	public ControllerFieldInitializer(ControllerGenType type) {
		this.type = type;
	}
	
	@Override public String caseEBorderPane(EBorderPane object) { return init(object); }
	@Override public String caseETableView(ETableView object) { return init(object); }
	@Override public String caseEButton(EButton object) { return init(object); }
	@Override public String caseEText(EText object) { return init(object); }

	private String init(ENode object) {
		switch (type) {
		case FIELD:
			return initField(object);
		case ON_ACTION:
			return initOnAction(object);
		default:
			return "";
		}
	}
	
	private String initOnAction(ENode node) {
		return initOnAction(node, node.getOnAction());
	}

	private String initOnAction(ENode node, String eventName) {
		if (node.getOnAction()==null) return "";
		return String.format(ON_ACTION_INIT, eventName);
	}
	
	private String initField(ENode node) {
		if (node instanceof EText) {
			return initField(node, "TextField");
		}
		String name = node.getClass().getSimpleName().replace("E", "").replace("Impl", "");
		return initField(node, name);
	}

	private String initField(ENode node, String controlName) {
		if (node.getId() == null)
			return "";
		return String.format(FIELD_INIT, controlName, node.getId());
	}
}