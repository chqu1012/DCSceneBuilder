package de.dc.javafx.mm.demo.controller;

import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public abstract class BaseMainController{
	
	public void initialize(){}
	
	@FXML
	protected BorderPane root;
	
	@FXML
	protected VBox vbox1;
	
	@FXML
	protected HBox hbox1;
	
}
