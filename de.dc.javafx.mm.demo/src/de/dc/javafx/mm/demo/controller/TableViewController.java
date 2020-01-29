package de.dc.javafx.mm.demo.controller;

import javafx.beans.value.*;
import javafx.event.*;
import javafx.scene.control.cell.*;
import org.apache.log4j.*;
import de.dc.javafx.mm.demo.model.*;

public class TableViewController extends BaseTableViewController{
	
	private Logger log = Logger.getLogger(TableViewController.class);
	
	private TableViewBinding model = new TableViewBinding();
	
	@Override
	public void initialize() {
		super.initialize();
		log.info("Initialize  TableViewController");
		
		initDatabinding();
		initTableViewName();
	}
	
	private void initDatabinding() {
	}
	
	private void initTableViewName() {
		model.sortedDataPerson().comparatorProperty().bind(tableViewName.comparatorProperty());			
		tableViewName.setItems(model.sortedDataPerson());
		tableViewName.getSelectionModel().selectedItemProperty().addListener(this::onViewPersonSelectionChanged);
		model.selectedPerson.bind(tableViewName.getSelectionModel().selectedItemProperty());
		
		columnPersonName.setCellValueFactory(new PropertyValueFactory<>("name"));
		columnPersonForename.setCellValueFactory(new PropertyValueFactory<>("forename"));
		columnPersonAge.setCellValueFactory(new PropertyValueFactory<>("age"));
		columnPersonEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
	}
	
	
	private void onViewPersonSelectionChanged(ObservableValue<? extends Person> observable, Person oldValue, Person newValue) {
		if (newValue!=null) {
			// TODO: not impleted yet!
		}
	}
	
	
}
