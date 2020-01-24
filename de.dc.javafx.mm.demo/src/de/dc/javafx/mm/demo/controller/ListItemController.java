package de.dc.javafx.mm.demo.controller;

import org.apache.log4j.Logger;

import de.dc.javafx.mm.demo.model.ListItemBinding;
import de.dc.javafx.mm.demo.model.Person;
import javafx.event.ActionEvent;

public class ListItemController extends BaseListItemController{
	
	private Logger log = Logger.getLogger(ListItemController.class);
	
	private ListItemBinding model = new ListItemBinding();
	
	@Override
	public void initialize() {
		super.initialize();
		log.info("Initialize  ListItemController");
		
		initDatabinding();
	}
	
	private void initDatabinding() {
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
