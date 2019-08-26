package de.dc.javafx.mm.renderer;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;

import com.sun.xml.internal.ws.api.pipe.NextAction;

import de.dc.javafx.mm.EBorderPane;
import de.dc.javafx.mm.EButton;
import de.dc.javafx.mm.EEvents;
import de.dc.javafx.mm.EHBox;
import de.dc.javafx.mm.EInsets;
import de.dc.javafx.mm.ELabel;
import de.dc.javafx.mm.ENode;
import de.dc.javafx.mm.ETableColumn;
import de.dc.javafx.mm.ETableView;
import de.dc.javafx.mm.EText;
import de.dc.javafx.mm.EVBox;
import de.dc.javafx.mm.EmfModel;
import de.dc.javafx.mm.util.MmSwitch;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.util.Callback;

public class FxmlRenderer extends MmSwitch<Node> {

	private Map<String, Node> controlRegistry = new HashMap<>();
	private Map<String, TableColumn<?,?>> columnsRegistry = new HashMap<>();
	
	private Class<?> controller;
	private Object controllerInstance;

	@SuppressWarnings("unchecked")
	public <T extends Node> T findNodeBy(String id) {
		return (T) controlRegistry.get(id);
	}

	public TableColumn<?,?> findColumnBy(String id) {
		return columnsRegistry.get(id);
	}
	
	private Optional<Node> createBorderPaneItem(ENode mNode) {
		if (mNode!=null) {
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

		node.getChildren().add(current);
	}

	private void invokeMethod(String name) {
		Method initializeMethod;
		try {
			initializeMethod = controller.getMethod(name);
			initializeMethod.invoke(controllerInstance,null);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	private void invokeMethod(String name, Event event) {
		Method initializeMethod;
		try {
			initializeMethod = controller.getMethod(name,event.getClass());
			initializeMethod.invoke(controllerInstance, event);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
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
		object.getChildren().forEach(e->node.getChildren().add(doSwitch(e)));
		initSize(object, node);
		return node;
	}
	
	@Override
	public Node caseEButton(EButton object) {
		Button node = new Button();
		node.setText(object.getText());
		
		if (isNotBlank(object.getOnAction())) {
			node.setOnAction(e->invokeMethod(object.getOnAction(),e));
		}
		
		initSize(object, node);
		controlRegistry.put(object.getId(), node);
		return node;
	}
	
	@Override
	public Node caseEmfModel(EmfModel object) {
		Node root = doSwitch(object.getRoot());
		if (object.getController()!=null) {
			try {
				controller = Class.forName(object.getController());
				controllerInstance = controller.newInstance();
				Method initializeMethod = controller.getMethod("initialize");
				initializeMethod.invoke(controllerInstance,null);
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | SecurityException | IllegalArgumentException | InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		return root;
	}

	@Override
	public Node caseETableView(ETableView object) {
		TableView<Object> tableView = new TableView<>();
		object.getColumns().forEach(e -> addColumn(tableView, e));
		controlRegistry.put(object.getId(), tableView);
		return tableView;
	}

	private void addColumn(TableView<Object> view, ETableColumn e) {
		TableColumn<Object, Object> column = new TableColumn<>(e.getName());
		if (StringUtils.isNotBlank(e.getCellFactory())) {
			try {
				Class<?> c = Class.forName(e.getCellFactory());
				Object instance = c.newInstance();
				if (instance instanceof Callback) {
					Callback feature = (Callback) instance;
					column.setCellFactory(feature);
				}
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e1) {
				e1.printStackTrace();
			}
		}
		view.getColumns().add(column);
	}

	@Override
	public Node caseEBorderPane(EBorderPane object) {
		BorderPane node = new BorderPane();
		node.setLayoutX(object.getLayoutX());
		node.setLayoutY(object.getLayoutY());

		initSize(object, node);

		createBorderPaneItem(object.getLeft()).ifPresent(e -> node.setLeft(e));
		createBorderPaneItem(object.getRight()).ifPresent(e -> node.setRight(e));
		createBorderPaneItem(object.getTop()).ifPresent(e -> node.setTop(e));
		createBorderPaneItem(object.getBottom()).ifPresent(e -> node.setBottom(e));
		createBorderPaneItem(object.getCenter()).ifPresent(e -> node.setCenter(e));

		object.getChildren().forEach(e -> addChild(node, e));
		return node;
	}

	@Override
	public Node caseEVBox(EVBox object) {
		VBox node = new VBox();
		node.setSpacing(object.getSpacing());

		initSize(object, node);

		object.getChildren().forEach(e -> addChild(node, e));
		return node;
	}

	private void initSize(ENode object, Region node) {
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
	}
}