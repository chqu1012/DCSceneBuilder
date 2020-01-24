package de.dc.javafx.mm.demo.controller;


import de.dc.javafx.mm.control.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public abstract class BaseListItemController{
	
	public void initialize(){}
	
	@FXML
	protected BorderPane root;
	
	@FXML
	protected ListView listView;
	
}
