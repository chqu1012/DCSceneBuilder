package de.dc.javafx.mm.demo.model;

import javafx.beans.property.*;

public class MainBinding{
	
	private StringProperty name;
	
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
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("name: ").append(name.get()).append(",");
		return sb.toString();
	}
}
