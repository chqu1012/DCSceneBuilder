package de.dc.javafx.mm.control.viewer;

import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;

import de.dc.javafx.mm.control.viewer.model.Node;
import de.dc.javafx.mm.control.viewer.provider.IContentProvider;
import de.dc.javafx.mm.control.viewer.provider.ILabelProvider;
import javafx.scene.control.Label;
import javafx.scene.control.TreeCell;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class TreeViewer<T extends Node> extends TreeView<T> implements IViewer<T>{

	private IContentProvider<T> contentProvider;
	
	private TreeItem<T> root;
	
	public TreeViewer() {
		setShowRoot(true);
	}
	
	@Override
	public void setLabelProvider(ILabelProvider labelProvider) {
		setCellFactory(e->{
			return new TreeCell<T>() {
				@Override
                protected void updateItem(T item, boolean empty) {
					super.updateItem(item, empty);
					if (item==null || empty) {
						setText(null);
						setGraphic(null);
					}else {
						HBox value = new HBox(5.0d);
						String content = Optional.of(labelProvider.getText(item)).orElse(StringUtils.EMPTY);
						if(labelProvider.getImage(item)!=null) {
							value.getChildren().add(new ImageView(labelProvider.getImage(item)));
						}
						value.getChildren().add(new Label(content));
						setGraphic(value);
					}
				};
			};
		});
	}

	@Override
	public void setContentProvider(IContentProvider<T> contentProvider) {
		this.contentProvider = contentProvider;
	}

	@Override
	public void setInput(T input) {
		root = new TreeItem<T>(input);
		buildTree(root, input);
		setRoot(root);
	}
	
	private void buildTree(TreeItem<T> parent, T input) {
		if (contentProvider.hasChildren(input)) {
			List<T> children = contentProvider.getChildren(input);
			for (T e : children) {
				System.out.println(e);
				TreeItem<T> treeItem = new TreeItem<T>(e);
				parent.getChildren().add(treeItem);
				if (contentProvider.hasChildren(e)) {
					buildTree(treeItem, e);
				}
			}
		}
	}
}
