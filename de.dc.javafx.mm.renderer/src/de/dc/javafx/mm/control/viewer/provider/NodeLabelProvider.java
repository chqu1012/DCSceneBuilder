package de.dc.javafx.mm.control.viewer.provider;

import de.dc.javafx.mm.control.viewer.model.Node;

public class NodeLabelProvider extends LabelProvider{

	@Override
	public String getText(Object element) {
		if (element instanceof Node) {
			Node node = (Node) element;
			return node.getName();
		}
		return super.getText(element);
	}
}
