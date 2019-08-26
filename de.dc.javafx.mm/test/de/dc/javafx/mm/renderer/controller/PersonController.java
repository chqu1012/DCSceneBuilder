package de.dc.javafx.mm.renderer.controller;

import de.dc.javafx.mm.renderer.FxmlRenderer;
import de.dc.javafx.mm.renderer.di.DIPlatform;
import de.dc.javafx.mm.renderer.model.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.TableView;

public class PersonController {

	private FxmlRenderer renderer;

	ObservableList<Person> masterData = FXCollections.observableArrayList();

	public void initialize() {
		System.out.println("INITIALIZE CONTROLLER");
		
		renderer = DIPlatform.getInstance(FxmlRenderer.class);
		TableView<Person> tableView = renderer.findNodeBy("TableView");
		tableView.setItems(masterData);
	}

	public void onButtonClicked(ActionEvent e) {
		Node buttonCreate = renderer.findNodeBy("buttonCreate");
		if (e.getSource() == buttonCreate) {
			Person person = new Person();
			person.setFirstname("Peter");
			person.setLastname("Parker");
			masterData.add(person);
		}
	}
}
