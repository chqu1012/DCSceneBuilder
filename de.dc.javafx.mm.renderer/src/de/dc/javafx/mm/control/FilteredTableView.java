package de.dc.javafx.mm.control;

import java.util.Comparator;

import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import javafx.scene.control.TableView.TableViewSelectionModel;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class FilteredTableView<T> extends VBox{

	private TableView<T> tableView = new TableView<>();
	private TextField textField = new TextField();

	public FilteredTableView() {
		setSpacing(5.0d);
		getChildren().add(textField);
		getChildren().add(tableView);
		
		setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
	}
	
	public ReadOnlyObjectProperty<Comparator<T>> comparatorProperty() {
		return tableView.comparatorProperty();
	}

	public void addSearchChangeListener(ChangeListener<String> listener) {
		textField.textProperty().addListener(listener);
	}
	
	public TextField getSearchText() {
		return textField;
	}
	
	public void setItems(ObservableList<T> items) {
		tableView.setItems(items);
	}
	
	public TableViewSelectionModel<T> getSelectionModel() {
		return tableView.getSelectionModel();
	}
	
	public TableView getTableView() {
		return tableView;
	}
}