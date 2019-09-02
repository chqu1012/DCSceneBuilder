package de.dc.javafx.mm.renderer.controller;

import de.dc.javafx.mm.di.EmfPlatform;
import de.dc.javafx.mm.renderer.FxmlRenderer;
import de.dc.javafx.mm.renderer.model.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class PersonController {

	private FxmlRenderer renderer;

	ObservableList<Person> masterData = FXCollections.observableArrayList();

	public void initialize() {
		System.out.println("INITIALIZE CONTROLLER");
		
		renderer = EmfPlatform.getInstance(FxmlRenderer.class);
		TableView<Person> tableView = renderer.findNodeBy("TableView");
		tableView.setItems(masterData);
		
		TableColumn<Person, String> nameColumn = renderer.findColumnBy("Name");
		nameColumn.setCellValueFactory(new PropertyValueFactory<>("firstname"));

		TableColumn<Person, String> lastnameColumn = renderer.findColumnBy("Lastname");
		lastnameColumn.setCellValueFactory(new PropertyValueFactory<>("lastname"));
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
