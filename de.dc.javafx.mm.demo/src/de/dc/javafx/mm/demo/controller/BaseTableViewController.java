package de.dc.javafx.mm.demo.controller;

import de.dc.javafx.mm.demo.model.Person;

import de.dc.javafx.mm.control.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public abstract class BaseTableViewController{
	
	public void initialize(){}
	
	@FXML
	protected VBox root;
	
	@FXML
	protected TableView<Person> tableViewName;
	
	@FXML
	protected TableColumn<Person,String> columnPersonName;
	
	@FXML
	protected TableColumn<Person,String> columnPersonForename;
	
	@FXML
	protected TableColumn<Person,String> columnPersonAge;
	
	@FXML
	protected TableColumn<Person,String> columnPersonEmail;
	
}
