package de.dc.javafx.mm.editor.template;

import de.dc.javafx.mm.EBorderPane;
import de.dc.javafx.mm.EButton;
import de.dc.javafx.mm.EFilteredTableView;
import de.dc.javafx.mm.EHBox;
import de.dc.javafx.mm.ELabel;
import de.dc.javafx.mm.EListView;
import de.dc.javafx.mm.ENode;
import de.dc.javafx.mm.ESplitPane;
import de.dc.javafx.mm.EStackPane;
import de.dc.javafx.mm.ETableColumn;
import de.dc.javafx.mm.ETableView;
import de.dc.javafx.mm.EText;
import de.dc.javafx.mm.EVBox;
import de.dc.javafx.mm.util.MmSwitch;

public class ControllerFieldInitializer extends MmSwitch<String> {

	private static final String FIELD_INIT = "@FXML\nprotected %s %s;\n\n";
	private static final String ON_ACTION_INIT = "@FXML\npublic abstract void %s(ActionEvent event);\n\n";
	private static final String ON_ACTION_IMPL_INIT = "@Override\npublic void %s(ActionEvent event) {}\n\n";
	
	private ControllerGenType type;
	
	public ControllerFieldInitializer(ControllerGenType type) {
		this.type = type;
	}
	
	@Override public String caseEBorderPane(EBorderPane object) { return init(object); }
	@Override public String caseEVBox(EVBox object) { return init(object); }
	@Override public String caseEHBox(EHBox object) { return init(object); }
	@Override public String caseESplitPane(ESplitPane object) { return init(object); }
	@Override public String caseEStackPane(EStackPane object) { return init(object); }
	@Override public String caseEFilteredTableView(EFilteredTableView object) { return init(object); }
	@Override public String caseETableView(ETableView object) { return init(object); }
	@Override public String caseETableColumn(ETableColumn object) { return initTableColumn(object); }
	@Override public String caseEListView(EListView object) { return init(object); }
	@Override public String caseEButton(EButton object) { return init(object); }
	@Override public String caseEText(EText object) { return init(object); }
	@Override public String caseELabel(ELabel object) { return init(object); }

	private String init(ENode object) {
		switch (type) {
		case FIELD:
			return initField(object);
		case ON_ACTION:
			return initOnAction(object);
		case ON_ACTION_IMPL:
			return initOnActionImpl(object);
		default:
			return "";
		}
	}
	
	private String initTableColumn(ETableColumn object) {
		String name = object.getClass().getSimpleName().replace("E", "").replace("Impl", "");
		
		ETableView tableView = (ETableView) object.eContainer();
		String modelName = tableView.getModel().getName();
		modelName = modelName == null ? "?" : modelName;
		
		String datatype = object.getAssociatedField()==null?"" :object.getAssociatedField().getDatatype();
		datatype = datatype == null ? "?" : datatype;
		
		name = String.format(name+"<%s,%s>", modelName, datatype);
		return String.format(FIELD_INIT, name, object.getId());
	}
	
	private String initOnActionImpl(ENode node) {
		if (node.getOnAction()==null) return "";
		return String.format(ON_ACTION_IMPL_INIT, node.getOnAction());
	}

	private String initOnAction(ENode node) {
		return initOnAction(node, node.getOnAction());
	}

	private String initOnAction(ENode node, String eventName) {
		if (node.getOnAction()==null) return "";
		return String.format(ON_ACTION_INIT, eventName);
	}
	
	private String initField(ENode node) {
		String name = node.getClass().getSimpleName().replace("E", "").replace("Impl", "");
		if (node instanceof EText) {
			return initField(node, "TextField");
		}else if (node instanceof EFilteredTableView) {
			EFilteredTableView view = (EFilteredTableView) node;
			String modelName = view.getModel()==null? null: view.getModel().getName();
			modelName = modelName == null ? "?" : modelName;
			StringBuilder sb = new StringBuilder(initField(node, name+"<"+modelName+">"));
			for (ETableColumn column : view.getColumns()) {
				String content = doSwitch(column);
				sb.append(content);
			}
			return sb.toString();
		}else if (node instanceof ETableView) {
			ETableView view = (ETableView) node;
			String modelName = view.getModel()==null? null: view.getModel().getName();
			modelName = modelName == null ? "?" : modelName;
			StringBuilder sb = new StringBuilder(initField(node, name+"<"+modelName+">"));
			for (ETableColumn column : view.getColumns()) {
				String content = doSwitch(column);
				sb.append(content);
			}
			return sb.toString();
		}
		return initField(node, name);
	}

	private String initField(ENode node, String controlName) {
		if (node.getId() == null)
			return "";
		return String.format(FIELD_INIT, controlName, node.getId());
	}
}