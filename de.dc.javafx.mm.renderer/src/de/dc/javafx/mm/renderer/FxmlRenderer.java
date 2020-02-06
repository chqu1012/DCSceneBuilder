package de.dc.javafx.mm.renderer;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;

import de.dc.javafx.mm.EAnchorPane;
import de.dc.javafx.mm.EBorderData;
import de.dc.javafx.mm.EBorderDirection;
import de.dc.javafx.mm.EBorderPane;
import de.dc.javafx.mm.EButton;
import de.dc.javafx.mm.ECheckBox;
import de.dc.javafx.mm.EFilteredTableView;
import de.dc.javafx.mm.EFlowPane;
import de.dc.javafx.mm.EGridPane;
import de.dc.javafx.mm.EHBox;
import de.dc.javafx.mm.EHyperlink;
import de.dc.javafx.mm.EInsets;
import de.dc.javafx.mm.ELabel;
import de.dc.javafx.mm.EListView;
import de.dc.javafx.mm.ENode;
import de.dc.javafx.mm.EPane;
import de.dc.javafx.mm.ERadioButton;
import de.dc.javafx.mm.EScrollPane;
import de.dc.javafx.mm.ESplitPane;
import de.dc.javafx.mm.EStackPane;
import de.dc.javafx.mm.ETabPane;
import de.dc.javafx.mm.ETableColumn;
import de.dc.javafx.mm.ETableView;
import de.dc.javafx.mm.EText;
import de.dc.javafx.mm.ETilePane;
import de.dc.javafx.mm.EToogleButton;
import de.dc.javafx.mm.EVBox;
import de.dc.javafx.mm.EWebView;
import de.dc.javafx.mm.EmfModel;
import de.dc.javafx.mm.control.FilteredTableView;
import de.dc.javafx.mm.util.MmSwitch;
import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.util.Callback;

public class FxmlRenderer extends MmSwitch<Node> {

	private static final Logger LOG = Logger.getLogger(FxmlRenderer.class);

	private Map<String, Node> controlRegistry = new HashMap<>();
	private Map<String, TableColumn> columnsRegistry = new HashMap<>();
	private Map<String, Field> fieldsMapper = new HashMap<>();

	private Class<?> controller;
	private Object controllerInstance;

	private BorderPane node;

	@SuppressWarnings("unchecked")
	public <T extends Node> T findNodeBy(String id) {
		return (T) controlRegistry.get(id);
	}

	@Override
	public Node caseEmfModel(EmfModel object) {
		Node root = doSwitch(object.getRoot());
		if (StringUtils.isNotBlank(object.getController())) {
			try {
				controller = Class.forName(object.getController());
				controllerInstance = controller.newInstance();

				for (Field field : controllerInstance.getClass().getSuperclass().getDeclaredFields()) {
					if (field.isAnnotationPresent(javafx.fxml.FXML.class)) {
						field.setAccessible(true);
						fieldsMapper.put(field.getName(), field);
					}
				}
				initFields();

				Method initializeMethod = controller.getMethod("initialize");
				initializeMethod.invoke(controllerInstance, null);
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				LOG.error("Failed to init EmfModel", e);
			} catch (ClassNotFoundException e) {
				LOG.error("Failed to init EmfModel, controller class not found "+object.getController(), e);
			} catch (NoSuchMethodException e) {
				LOG.error("No initialize method defined in controller "+object.getController(), e);
			} catch (SecurityException e) {
				LOG.error("No initialize method defined in controller "+object.getController(), e);
			}
		}
		return root;
	}
	
	@Override
	public Node caseEFilteredTableView(EFilteredTableView object) {
		FilteredTableView<Object> tableView = new FilteredTableView<>();
		object.getColumns().forEach(e -> addColumn(tableView.getTableView(), e));
		controlRegistry.put(object.getId(), tableView);
		return tableView;
	}

	@Override
	public Node caseEListView(EListView object) {
		ListView<Object> listView = new ListView<>();
		controlRegistry.put(object.getId(), listView);
		return listView;
	}
	
	@Override
	public Node caseETableView(ETableView object) {
		TableView<Object> tableView = new TableView<>();
		object.getColumns().forEach(e -> addColumn(tableView, e));
		controlRegistry.put(object.getId(), tableView);
		return tableView;
	}

	private void initFields() {
		for (Entry<String, Node> node : controlRegistry.entrySet()) {
			if (fieldsMapper.get(node.getKey()) != null) {
				try {
					fieldsMapper.get(node.getKey()).set(controllerInstance, node.getValue());
				} catch (IllegalArgumentException | IllegalAccessException e1) {
					e1.printStackTrace();
				}
			}
		}

		for (Entry<String, TableColumn> columnEntry : columnsRegistry.entrySet()) {
			if (columnsRegistry.get(columnEntry.getKey()) != null) {
				try {
					fieldsMapper.get(columnEntry.getKey()).set(controllerInstance, columnEntry.getValue());
				} catch (IllegalArgumentException | IllegalAccessException e1) {
					e1.printStackTrace();
				}
			}
		}
	}

	public TableColumn findColumnBy(String id) {
		return columnsRegistry.get(id);
	}

	private Optional<Node> createBorderPaneItem(ENode mNode) {
		if (mNode != null) {
			Optional<Node> node = Optional.ofNullable(doSwitch(mNode));
			BorderPane.setMargin(node.get(), createInsets(mNode.getMargin()));
			return node;
		}
		return Optional.empty();
	}

	private Insets createInsets(EInsets mMargin) {
		if (mMargin == null) {
			return new Insets(5);
		}
		return new Insets(mMargin.getLeft(), mMargin.getRight(), mMargin.getTop(), mMargin.getBottom());
	}

	private void addChild(Pane node, ENode eNode) {
		Node current = doSwitch(eNode);
		initSize(eNode, node);
		controlRegistry.put(eNode.getId(), current);
		node.getChildren().add(current);
	}

	private void invokeMethod(String name, Event event) {
		if (controller != null) {
			Method initializeMethod;
			try {
				initializeMethod = controller.getMethod(name, event.getClass());
				initializeMethod.invoke(controllerInstance, event);
			} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				LOG.error("Failed to invoke method " + name, e);
			}
		}
	}

	@Override
	public Node caseEScrollPane(EScrollPane object) {
		ScrollPane node = new ScrollPane();
		node.setContent(doSwitch(object.getContent()));
		node.setFitToHeight(object.isFitToHeight());
		node.setFitToWidth(object.isFitToWidth());
		node.setPannable(object.isIsPannable());
		initSize(object, node);
		return node;
	}

	@Override
	public Node caseETabPane(ETabPane object) {
		TabPane node = new TabPane();
		object.getTabs().forEach(e->node.getTabs().add(new Tab(e.getName(), doSwitch(e.getContent()))));
		initSize(object, node);
		return node;
	}

@Override
	public Node caseECheckBox(ECheckBox object) {
		CheckBox node = new CheckBox(object.getText());
		initSize(object, node);
		return node;
	}
	
	@Override
	public Node caseEHyperlink(EHyperlink object) {
		Hyperlink node = new Hyperlink(object.getText());
		initSize(object, node);
		return node;
	}
	
	@Override
	public Node caseERadioButton(ERadioButton object) {
		RadioButton node = new RadioButton(object.getText());
		initSize(object, node);
		return node;
	}
	
	@Override
	public Node caseEToogleButton(EToogleButton object) {
		ToggleButton node = new ToggleButton(object.getText());
		initSize(object, node);
		return node;
	}
	
	@Override
	public Node caseEWebView(EWebView object) {
		WebView node = new WebView();
		node.getEngine().load(object.getUrl());
		node.setContextMenuEnabled(object.isContextMenuEnabled());
		initId(object, node);
		initMargin(object, node);
		return node;
	}

	@Override
	public Node caseETilePane(ETilePane object) {
		TitledPane node = new TitledPane();
		initSize(object, node);
		return node;
	}

	@Override
	public Node caseEPane(EPane object) {
		Pane node = new Pane();
		initSize(object, node);
		return node;
	}

	@Override
	public Node caseEFlowPane(EFlowPane object) {
		FlowPane node = new FlowPane();
		initSize(object, node);
		return node;
	}

	@Override
	public Node caseEGridPane(EGridPane object) {
		GridPane node = new GridPane();
		initSize(object, node);
		return node;
	}

@Override
	public Node caseEAnchorPane(EAnchorPane object) {
		AnchorPane node = new AnchorPane();
		initSize(object, node);
		return node;
	}
	
	@Override
	public Node caseESplitPane(ESplitPane object) {
		SplitPane node = new SplitPane();
		initSize(object, node);
		return node;
	}
	
	@Override
	public Node caseEStackPane(EStackPane object) {
		StackPane node = new StackPane();
		initSize(object, node);
		return node;
	}


private void initId(ENode object, Node node) {
		if (object.getId()!=null) {
			controlRegistry.put(object.getId(), node);
		}
	}
	
	private void initMargin(ENode object, Parent node) {
		EInsets margin = object.getMargin();
		if (margin!=null) {
			Insets marginInsets = new Insets(margin.getTop(), margin.getRight(), margin.getBottom(), margin.getLeft());
			if (node instanceof VBox) {
				VBox.setMargin(node, marginInsets);
			}else if (node instanceof GridPane) {
				GridPane.setMargin(node, marginInsets);
			}else if (node instanceof HBox) {
				HBox.setMargin(node, marginInsets);
			}else if (node instanceof BorderPane) {
				BorderPane.setMargin(node, marginInsets);
			}else if (node instanceof FlowPane) {
				FlowPane.setMargin(node, marginInsets);
			}else if (node instanceof StackPane) {
				StackPane.setMargin(node, marginInsets);
			}else if (node instanceof TilePane) {
				TilePane.setMargin(node, marginInsets);
			}
		}
	}

	protected void initSize(ENode object, Region node) {
		node.setMinHeight(object.getMinHeight() == 0 ? Double.MIN_VALUE : object.getMinHeight());
		node.setMinWidth(object.getMinWidth() == 0 ? Double.MIN_VALUE : object.getMinWidth());
		node.setMaxHeight(object.getMaxHeight() == 0 ? Double.MAX_VALUE : object.getMaxHeight());
		node.setMaxWidth(object.getMaxWidth() == 0 ? Double.MAX_VALUE : object.getMaxWidth());
		if (object.getPrefHeight() > 0) {
			node.setPrefHeight(object.getPrefHeight());
		}
		if (object.getPrefWidth() > 0) {
			node.setPrefWidth(object.getPrefWidth());
		}
		if (object.getPadding()!=null) {
			EInsets padding = object.getPadding();
			node.setPadding(new Insets(padding.getTop(), padding.getRight(), padding.getBottom(), padding.getLeft()));
		}
		if (node instanceof Pane) {
			initMargin(object, (Pane) node);
		}
	}
	
	@Override
	public Node caseEText(EText object) {
		TextField node = new TextField();
		node.setPromptText(object.getPromtText());
		initSize(object, node);
		return node;
	}

	@Override
	public Node caseELabel(ELabel object) {
		Label node = new Label(object.getText());
		initSize(object, node);
		return node;
	}

	@Override
	public Node caseEHBox(EHBox object) {
		HBox node = new HBox(object.getSpacing());
		object.getChildren().forEach(e -> node.getChildren().add(doSwitch(e)));
		initSize(object, node);
		return node;
	}

	@Override
	public Node caseEButton(EButton object) {
		Button node = new Button();
		node.setText(object.getText());

		if (isNotBlank(object.getOnAction())) {
			node.setOnAction(e -> invokeMethod(object.getOnAction(), e));
		}

		initSize(object, node);
		controlRegistry.put(object.getId(), node);
		return node;
	}

	private void addColumn(TableView<Object> view, ETableColumn e) {
		TableColumn column = new TableColumn(e.getName());
		if (StringUtils.isNotBlank(e.getCellFactory())) {
			try {
				Class<?> c = Class.forName(e.getCellFactory());
				Object instance = c.newInstance();
				if (instance instanceof Callback) {
					Callback feature = (Callback) instance;
					column.setCellFactory(feature);
				}
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e1) {
				LOG.error("Failed to init cell factory", e1);
			}
		}

		String id = e.getId() == null ? e.getName() : e.getId();
		columnsRegistry.put(id, column);

		view.getColumns().add(column);
	}

	@Override
	public Node caseEBorderPane(EBorderPane object) {
		node = new BorderPane();
		node.setLayoutX(object.getLayoutX());
		node.setLayoutY(object.getLayoutY());

		initSize(object, node);

		object.getChildren().forEach(e->{
			if (e.getLayoutData()!=null) {
				doSwitch(e.getLayoutData());
			}else {
				node.setCenter(doSwitch(e));
			}
		});
		return node;
	}
	
	@Override
	public Node caseEBorderData(EBorderData object) {
		EBorderDirection direction = object.getDirection();
		EObject parent = object.eContainer();
		Node child = doSwitch(parent);
		switch (direction) {
		case BOTTOM:
			node.setBottom(child);
			break;
		case TOP:
			node.setTop(child);
			break;
		case LEFT:
			node.setLeft(child);
			break;
		case RIGHT:
			node.setRight(child);
			break;
		case CENTER:
			node.setCenter(child);
			break;
		default:
			node.setCenter(child);
			break;
		}
		return super.caseEBorderData(object);
	}

	@Override
	public Node caseEVBox(EVBox object) {
		VBox node = new VBox();
		node.setSpacing(object.getSpacing());

		initSize(object, node);

		object.getChildren().forEach(e -> addChild(node, e));
		return node;
	}
}