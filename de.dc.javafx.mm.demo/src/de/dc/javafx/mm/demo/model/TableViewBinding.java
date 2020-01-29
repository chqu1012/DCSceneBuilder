package de.dc.javafx.mm.demo.model;

import javafx.beans.property.*;
import javafx.collections.*;
import javafx.collections.transformation.*;

public class TableViewBinding{

	// Binding for view Person
	private ObservableList<Person> dataPerson = FXCollections.observableArrayList(); 
	private FilteredList<Person> filteredDataPerson = new FilteredList<>(dataPerson,p->true); 
	private SortedList<Person> sortedDataPerson = new SortedList<>(filteredDataPerson); 
	public ObjectProperty<Person> selectedPerson = new SimpleObjectProperty<>();
	public ObservableList<Person> dataPerson(){ return dataPerson;}
	public FilteredList<Person> filteredDataPerson(){ return filteredDataPerson;}
	public SortedList<Person> sortedDataPerson(){return sortedDataPerson;}; 
	public ObjectProperty<Person> selectedPerson(){return selectedPerson;}; 
	public void addPerson(Person person){ this.dataPerson.add(person);}
	public void removePerson(Person person){ this.dataPerson.remove(person);}
	
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		return sb.toString();
	}
}
