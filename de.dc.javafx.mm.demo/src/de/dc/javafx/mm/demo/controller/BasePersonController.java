package de.dc.javafx.mm.demo.controller;

import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;

public abstract class BasePersonController{
	
	public void initialize(){}
	
	@FXML
	protected Button refreshButton;
	
	@FXML
	protected Button addButton;
	
	@FXML
	protected Button deleteButton;
	
	@FXML
	protected Button createButton;
	
	@FXML
	protected TableView ContactTableView;
	
	@FXML
	public abstract void onRefreshButtonClicked(ActionEvent event);
	
	@FXML
	public abstract void onAddButtonClicked(ActionEvent event);
	
	@FXML
	public abstract void onDeleteButtonClicked(ActionEvent event);
	
	@FXML
	public abstract void onButtonClicked(ActionEvent event);
	
}
