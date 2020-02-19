package de.dc.uhade.taumi.client.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;

public class BaseSelectionReservierungenBinding{
	// Binding init for comboBoxGeschlecht
	private ObservableList masterDataComboBoxGeschlecht = FXCollections.observableArrayList();
	private FilteredList filteredDataComboBoxGeschlecht = new FilteredList<>(masterDataComboBoxGeschlecht);
	private SortedList sortedDataComboBoxGeschlecht = new SortedList<>(filteredDataComboBoxGeschlecht);
	private ObjectProperty selectedDataComboBoxGeschlecht = new SimpleObjectProperty<>();
	public ObservableList masterDataComboBoxGeschlecht() { return masterDataComboBoxGeschlecht; }
	public FilteredList filteredDataComboBoxGeschlecht() { return filteredDataComboBoxGeschlecht; }
	public SortedList sortedDataComboBoxGeschlecht() { return sortedDataComboBoxGeschlecht; }
	public ObjectProperty selectedDataComboBoxGeschlecht() { return selectedDataComboBoxGeschlecht;}
	
	// Binding init for comboBoxLocation
	private ObservableList masterDataComboBoxLocation = FXCollections.observableArrayList();
	private FilteredList filteredDataComboBoxLocation = new FilteredList<>(masterDataComboBoxLocation);
	private SortedList sortedDataComboBoxLocation = new SortedList<>(filteredDataComboBoxLocation);
	private ObjectProperty selectedDataComboBoxLocation = new SimpleObjectProperty<>();
	public ObservableList masterDataComboBoxLocation() { return masterDataComboBoxLocation; }
	public FilteredList filteredDataComboBoxLocation() { return filteredDataComboBoxLocation; }
	public SortedList sortedDataComboBoxLocation() { return sortedDataComboBoxLocation; }
	public ObjectProperty selectedDataComboBoxLocation() { return selectedDataComboBoxLocation;}
	
	// Binding init for tableView
	private ObservableList masterDataTableView = FXCollections.observableArrayList();
	private FilteredList filteredDataTableView = new FilteredList<>(masterDataTableView);
	private SortedList sortedDataTableView = new SortedList<>(filteredDataTableView);
	private ObjectProperty selectedDataTableView = new SimpleObjectProperty<>();
	public ObservableList masterDataTableView() { return masterDataTableView; }
	public FilteredList filteredDataTableView() { return filteredDataTableView; }
	public SortedList sortedDataTableView() { return sortedDataTableView; }
	public ObjectProperty selectedDataTableView() { return selectedDataTableView;}
	
	// Binding init for comboboxLocation
	private ObservableList masterDataComboboxLocation = FXCollections.observableArrayList();
	private FilteredList filteredDataComboboxLocation = new FilteredList<>(masterDataComboboxLocation);
	private SortedList sortedDataComboboxLocation = new SortedList<>(filteredDataComboboxLocation);
	private ObjectProperty selectedDataComboboxLocation = new SimpleObjectProperty<>();
	public ObservableList masterDataComboboxLocation() { return masterDataComboboxLocation; }
	public FilteredList filteredDataComboboxLocation() { return filteredDataComboboxLocation; }
	public SortedList sortedDataComboboxLocation() { return sortedDataComboboxLocation; }
	public ObjectProperty selectedDataComboboxLocation() { return selectedDataComboboxLocation;}
	
}
