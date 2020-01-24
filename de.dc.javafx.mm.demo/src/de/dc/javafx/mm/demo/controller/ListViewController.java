package de.dc.javafx.mm.demo.controller;

import javafx.beans.value.*;
import javafx.event.*;
import javafx.scene.control.cell.*;
import org.apache.log4j.*;
import de.dc.javafx.mm.demo.model.*;

public class ListViewController extends BaseListViewController{
	
	private Logger log = Logger.getLogger(ListViewController.class);
	
	private ListViewBinding model = new ListViewBinding();
	
	@Override
	public void initialize() {
		super.initialize();
		log.info("Initialize  ListViewController");
		
		initDatabinding();
		initListView();
	}
	
	private void initDatabinding() {
		textName.textProperty().bindBidirectional(model.nameProperty());
		textForename.textProperty().bindBidirectional(model.forenameProperty());
		textAge.textProperty().bindBidirectional(model.ageProperty());
		textEmail.textProperty().bindBidirectional(model.emailProperty());
	}
	
	
	private void initListView() {
		listView.setItems(model.sortedDataPerson());
		listView.getSelectionModel().selectedItemProperty().addListener(this::onViewPersonSelectionChanged);
		model.selectedPerson.bind(listView.getSelectionModel().selectedItemProperty());
	}
	
	
	private void onViewPersonSelectionChanged(ObservableValue<? extends Person> observable, Person oldValue, Person newValue) {
		if (newValue!=null) {
			// TODO: not impleted yet!
		}
	}
	
	@Override
	public void onButtonAction(ActionEvent event) {
		Object source = event.getSource();
		if (source == buttonCreate) {
			Person person = new Person();
			person.setAge(model.getAge());
			person.setEmail(model.getEmail());
			person.setForename(model.getForename());
			person.setName(model.getName());
			model.addPerson(person);
		}
	}
	
}
