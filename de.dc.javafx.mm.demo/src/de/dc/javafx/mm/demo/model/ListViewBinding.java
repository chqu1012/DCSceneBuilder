package de.dc.javafx.mm.demo.model;

import javafx.beans.property.*;
import javafx.collections.*;
import javafx.collections.transformation.*;

public class ListViewBinding{

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
	
	private StringProperty name = new SimpleStringProperty();
	private StringProperty forename = new SimpleStringProperty();
	private StringProperty age = new SimpleStringProperty();
	private StringProperty email = new SimpleStringProperty();
	
	public String getName(){
		return this.name.get();
	}
	
	public void setName(String name){
		this.name.set(name);
	}
	
	public StringProperty nameProperty(){
		return this.name;
	}
	
	public void setNameProperty(StringProperty name){
		this.name=name;
	}
	public String getForename(){
		return this.forename.get();
	}
	
	public void setForename(String forename){
		this.forename.set(forename);
	}
	
	public StringProperty forenameProperty(){
		return this.forename;
	}
	
	public void setForenameProperty(StringProperty forename){
		this.forename=forename;
	}
	public String getAge(){
		return this.age.get();
	}
	
	public void setAge(String age){
		this.age.set(age);
	}
	
	public StringProperty ageProperty(){
		return this.age;
	}
	
	public void setAgeProperty(StringProperty age){
		this.age=age;
	}
	public String getEmail(){
		return this.email.get();
	}
	
	public void setEmail(String email){
		this.email.set(email);
	}
	
	public StringProperty emailProperty(){
		return this.email;
	}
	
	public void setEmailProperty(StringProperty email){
		this.email=email;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("name: ").append(name.get()).append(",");
		sb.append("forename: ").append(forename.get()).append(",");
		sb.append("age: ").append(age.get()).append(",");
		sb.append("email: ").append(email.get()).append(",");
		return sb.toString();
	}
}
