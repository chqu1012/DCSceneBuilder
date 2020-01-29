package de.dc.javafx.mm.control.viewer.provider;

import java.util.ArrayList;
import java.util.List;

import de.dc.javafx.mm.control.viewer.model.Node;

public class NodeContentProvider implements IContentProvider<Node>{

	@Override
	public List<Node> getChildren(Node input) {
		return input.getChildren();
	}

	@Override
	public List<Node> getElements(Node input) {
		ArrayList<Node> result = new ArrayList<>();
		return result;
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
