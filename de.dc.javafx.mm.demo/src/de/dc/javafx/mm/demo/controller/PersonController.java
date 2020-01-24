package de.dc.javafx.mm.demo.controller;

import javafx.beans.value.*;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.cell.*;
import org.apache.log4j.*;
import de.dc.javafx.mm.demo.model.*;

public class PersonController extends BasePersonController{
	
	private Logger log = Logger.getLogger(PersonController.class);
	
	private PersonBinding model = new PersonBinding();
	
	@Override
	public void initialize() {
		super.initialize();
		log.info("Initialize  PersonController");
		
		initPerson();
	}
	
	private void initPerson() {
		model.sortedDataPerson().comparatorProperty().bind(tableViewPerson.comparatorProperty());			
		tableViewPerson.setItems(model.sortedDataPerson());
		tableViewPerson.getSelectionModel().selectedItemProperty().addListener(this::onTableViewPersonSelectionChanged);
		model.selectedPerson.bind(tableViewPerson.getSelectionModel().selectedItemProperty());
		
		columName.setCellValueFactory(new PropertyValueFactory<>("name"));
		columForename.setCellValueFactory(new PropertyValueFactory<>("forename"));
		columAge.setCellValueFactory(new PropertyValueFactory<>("age"));
		columEmail.setCellValueFactory(new PropertyValueFactory<>("age"));
		
		tableViewPerson.addSearchChangeListener((obs, oldV, newV)->{
			if (newV!=null) {
				model.filteredDataPerson().setPredicate(p->p.getName().toLowerCase().contains(newV.toLowerCase()));
			}
		});
	}
	
	private void onTableViewPersonSelectionChanged(ObservableValue<? extends Person> observable, Person oldValue, Person newValue) {
		if (newValue!=null) {
			// TODO: not impleted yet!
		}
	}
	
	@FXML
	public void onButtonAction(ActionEvent event) {
		Object source = event.getSource();
		if (source == buttonCreate) {
			Person person = new Person();
			person.setAge("11");
			person.setEmail("james.bond@mail.com");
			person.setForename("James");
			person.setName("Bond");
			model.addPerson(person);
		}
	}
	
}
