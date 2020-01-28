package de.dc.javafx.mm.control;

import java.util.HashMap;
import java.util.Map;

import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class FilteredTableViewForm<T> extends SplitPane{

	private FilteredTableView<T> tableView = new FilteredTableView<>();
	private VBox form = new VBox(5.0d);
	
	private Map<String, Control> controlMap = new HashMap<>(); 
	
	public FilteredTableViewForm() {
		getChildren().add(tableView);
		getChildren().add(form);
	}
	
	public Control findById(String id) {
		return controlMap.get(id);
	}
	
	public void addFormField(String text) {
		form.getChildren().add(new Label(text));
		TextField textField = new TextField("Enter a "+text);
		form.getChildren().add(textField);
		
		controlMap.put(text, textField);
	}
}