package de.dc.javafx.mm.control;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class FilteredTableViewForm<T> extends SplitPane{

	private FilteredTableView<T> tableView = new FilteredTableView<>();
	private VBox form = new VBox(5.0d);
	private Button buttonCreate = new Button("Create");
	
	private Map<String, TextField> controlMap = new HashMap<>(); 
	
	public FilteredTableViewForm() {
		getItems().add(tableView);
		
		form.setPadding(new Insets(10d));
		form.getChildren().add(buttonCreate);
		getItems().add(form);
		
		setDividerPosition(0, 0.8d);
	}
	
	public Control findById(String id) {
		return controlMap.get(id);
	}
	
	public Optional<TextField> findTextFieldByName(String name){
		return Optional.ofNullable(controlMap.get(name));
	}
	
	public void addFormField(String text) {
		form.getChildren().add(form.getChildren().size()-1, new Label(text));
		TextField textField = new TextField();
		textField.setPromptText("Enter a "+text);
		controlMap.put(text, textField);
		
		form.getChildren().add(form.getChildren().size()-1, textField);
		
		controlMap.put(text, textField);
	}
	
	public TableView<T> getTableView(){
		return tableView.getTableView();
	}
}