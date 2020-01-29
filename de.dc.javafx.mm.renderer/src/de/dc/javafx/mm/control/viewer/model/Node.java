package de.dc.javafx.mm.control.viewer.model;

import java.util.ArrayList;
import java.util.List;

public class Node {

	private String name;
	private Node parent;
	private List<Node> children = new ArrayList<>();

	public Node(Node parent) {
		if (parent!=null) {
			this.parent = parent;
			this.parent.children.add(this);
		}
	}

	public void add(Node child) {
		children.add(child);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public List<Node> getChildren() {
		return children;
	}

	public void setChildren(List<Node> children) {
		this.children = children;
	}

}
