package de.dc.javafx.mm.control.viewer.provider;

import java.util.ArrayList;
import java.util.List;

import de.dc.javafx.mm.control.viewer.model.Node;

public class ContentProvider implements IContentProvider<Node>{

	@Override
	public List<Node> getChildren(Node input) {
		return input.getChildren();
	}

	@Override
	public List<Node> getElements(Node input) {
		List<Node> elements = new ArrayList<>();
		return elements;
	}

	@Override
	public Node getParent(Node input) {
		return input.getParent();
	}

	@Override
	public boolean hasChildren(Node input) {
		return !input.getChildren().isEmpty();
	}


}
