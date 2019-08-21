package de.dc.javafx.mm.renderer;

import java.util.Optional;

import de.dc.javafx.mm.EBorderPane;
import de.dc.javafx.mm.EButton;
import de.dc.javafx.mm.EInsets;
import de.dc.javafx.mm.ENode;
import de.dc.javafx.mm.ERegion;
import de.dc.javafx.mm.EVBox;
import de.dc.javafx.mm.util.MmSwitch;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

public class FxmlRenderer extends MmSwitch<Node> {

	private Optional<Node> createBorderPaneItem(ENode mNode) {
		Optional<Node> node = Optional.ofNullable(doSwitch(mNode));
		BorderPane.setMargin(node.get(), createInsets(mNode.getMargin()));
		return node;
	}

	private Insets createInsets(EInsets mMargin) {
		if (mMargin==null) {
			return new Insets(5);
		}
		return new Insets(mMargin.getLeft(), mMargin.getRight(), mMargin.getTop(), mMargin.getBottom());
	}
	
	private void addChild(Pane node, ENode eNode) {
		Node current = doSwitch(eNode);
		
		initSize(eNode, node);
		
		node.getChildren().add(current);
	}
	
	@Override
	public Node caseEBorderPane(EBorderPane object) {
		BorderPane node = new BorderPane();
		node.setLayoutX(object.getLayoutX());
		node.setLayoutY(object.getLayoutY());
		
		initSize(object, node);
		
		createBorderPaneItem(object.getLeft()).ifPresent(e->node.setLeft(e));
		createBorderPaneItem(object.getRight()).ifPresent(e->node.setRight(e));
		createBorderPaneItem(object.getTop()).ifPresent(e->node.setTop(e));
		createBorderPaneItem(object.getBottom()).ifPresent(e->node.setBottom(e));

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
		node.setMinHeight(object.getMinHeight()==0? Double.MIN_VALUE : object.getMinHeight());
		node.setMinWidth(object.getMinWidth()==0? Double.MIN_VALUE : object.getMinWidth());
		node.setMaxHeight(object.getMaxHeight()==0? Double.MAX_VALUE : object.getMaxHeight());
		node.setMaxWidth(object.getMaxWidth()==0? Double.MAX_VALUE : object.getMaxWidth());
		if (object.getPrefHeight()>0) {
			node.setPrefHeight(object.getPrefHeight());
		}
		if (object.getPrefWidth()>0) {
			node.setPrefWidth(object.getPrefWidth());
		}
	}

	@Override
	public Node caseEButton(EButton object) {
		Button node = new Button();
		node.setText(object.getText());
		
		initSize(object, node);
		
		return node;
	}
}