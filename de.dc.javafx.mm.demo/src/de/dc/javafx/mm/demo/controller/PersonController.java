package de.dc.javafx.mm.demo.controller;

import javafx.beans.value.*;
import javafx.event.*;
import org.apache.log4j.*;
import de.dc.javafx.mm.demo.model.*;

public class PersonController extends BasePersonController{
	
	private Logger log = Logger.getLogger(PersonController.class);
	
	private PersonBinding model = new PersonBinding();
	
	@Override
	public void initialize() {
		super.initialize();
		log.info("Initialize  PersonController");
		
		model.sortedDataPerson().comparatorProperty().bind(tableViewPerson.comparatorProperty());			
		tableViewPerson.setItems(model.sortedDataPerson());
		tableViewPerson.getSelectionModel().selectedItemProperty().addListener(this::onTableViewPersonSelectionChanged);
		model.selectedPerson.bind(tableViewPerson.getSelectionModel().selectedItemProperty());
	}
	
	private void onTableViewPersonSelectionChanged(ObservableValue<? extends Person> observable, Person oldValue, Person newValue) {
		if (newValue!=null) {
			// TODO: not impleted yet!
		}
	}
	
}
