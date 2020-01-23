package de.dc.javafx.mm.demo.controller;

import de.dc.javafx.mm.demo.model.Person;

import de.dc.javafx.mm.control.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public abstract class BasePersonController{
	
	public void initialize(){}
	
	@FXML
	protected BorderPane root;
	
	@FXML
	protected FilteredTableView<Person> tableViewPerson;
	
	@FXML
	protected TableColumn<Person,String> columName;
	
	@FXML
	protected TableColumn<Person,String> columForename;
	
	@FXML
	protected TableColumn<Person,String> columAge;
	
	@FXML
	protected TableColumn<Person,String> columEmail;
	
}
