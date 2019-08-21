package de.dc.javafx.mm.renderer;

import static java.util.Objects.nonNull;

import de.dc.javafx.mm.EBorderPane;
import de.dc.javafx.mm.EButton;
import de.dc.javafx.mm.EVBox;
import de.dc.javafx.mm.util.MmSwitch;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class FxmlRenderer extends MmSwitch<Node> {

	@Override
	public Node caseEBorderPane(EBorderPane object) {
		BorderPane node = new BorderPane();
		node.setLayoutX(object.getLayoutX());
		node.setLayoutY(object.getLayoutY());
		if (nonNull(object.getLeft())) {
			node.setLeft(doSwitch(object.getLeft()));
		}
		if (nonNull(object.getRight())) {
			node.setRight(doSwitch(object.getRight()));
		}
		if (nonNull(object.getTop())) {
			node.setTop(doSwitch(object.getTop()));
		}
		if (nonNull(object.getBottom())) {
			node.setBottom(doSwitch(object.getBottom()));
		}

		object.getChildren().forEach(e -> {
			Node current = doSwitch(e);
			node.getChildren().add(current);
		});
		return node;
	}

	@Override
	public Node caseEVBox(EVBox object) {
		VBox node = new VBox();
		node.setSpacing(object.getSpacing());
		node.setMaxHeight(object.getMaxHeight());
		node.setMaxWidth(object.getMaxWidth());

		object.getChildren().forEach(e -> {
			Node current = doSwitch(e);
			node.getChildren().add(current);
		});
		return node;
	}

	@Override
	public Node caseEButton(EButton object) {
		Button node = new Button();
		node.setText(object.getText());
		node.setMaxHeight(object.getMaxHeight());
		node.setMaxWidth(object.getMaxWidth());
		return node;
	}
}