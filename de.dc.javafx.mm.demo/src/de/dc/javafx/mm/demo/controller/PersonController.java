package de.dc.javafx.mm.demo.controller;

import javafx.event.*;
import org.apache.log4j.*;

public class PersonController extends BasePersonController{
	
	private Logger log = Logger.getLogger(PersonController.class);
	
	@Override
	public void initialize() {
		log.info("Initialize  PersonController");
	}
	
	@Override
	public void onRefreshButtonClicked(ActionEvent event) {}
	
	@Override
	public void onAddButtonClicked(ActionEvent event) {}
	
	@Override
	public void onDeleteButtonClicked(ActionEvent event) {}
	
	@Override
	public void onButtonClicked(ActionEvent event) {}
	
}
