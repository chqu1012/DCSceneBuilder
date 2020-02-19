package de.dc.uhade.taumi.client.controller;

import de.dc.uhade.taumi.client.model.*;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

public abstract class BaseBindingReservierungenController extends BaseReservierungenController{
	
	protected ReservierungenBinding binding = new ReservierungenBinding();
	
	@Override
	public void initialize() {
		textAbsender.textProperty().bindBidirectional(binding.textAbsenderProperty());
		textEmpfaenger.textProperty().bindBidirectional(binding.textEmpfaengerProperty());
		textBetreff.textProperty().bindBidirectional(binding.textBetreffProperty());
		comboBoxGeschlecht.setItems(binding.sortedDataComboBoxGeschlecht());
		binding.selectedDataComboBoxGeschlecht().bind(comboBoxGeschlecht.getSelectionModel().selectedItemProperty());
		comboBoxLocation.setItems(binding.sortedDataComboBoxLocation());
		binding.selectedDataComboBoxLocation().bind(comboBoxLocation.getSelectionModel().selectedItemProperty());
		textSearchReservation.textProperty().bindBidirectional(binding.textSearchReservationProperty());
		tableView.setItems(binding.sortedDataTableView());
		binding.selectedDataTableView().bind(tableView.getSelectionModel().selectedItemProperty());
		// TODO: Property not init yet!
		columnColumnLocation.setCellValueFactory(new PropertyValueFactory<>(""));
		// TODO: Property not init yet!
		columnColumnName.setCellValueFactory(new PropertyValueFactory<>(""));
		// TODO: Property not init yet!
		columnColumnEmail.setCellValueFactory(new PropertyValueFactory<>(""));
		// TODO: Property not init yet!
		columnColumnMobile.setCellValueFactory(new PropertyValueFactory<>(""));
		// TODO: Property not init yet!
		columnColumnPersonCount.setCellValueFactory(new PropertyValueFactory<>(""));
		// TODO: Property not init yet!
		columnColumnDate.setCellValueFactory(new PropertyValueFactory<>(""));
		// TODO: Property not init yet!
		columnColumnTime.setCellValueFactory(new PropertyValueFactory<>(""));
		// TODO: Property not init yet!
		columnFeedback.setCellValueFactory(new PropertyValueFactory<>(""));
		comboboxLocation.setItems(binding.sortedDataComboboxLocation());
		binding.selectedDataComboboxLocation().bind(comboboxLocation.getSelectionModel().selectedItemProperty());
		textForename.textProperty().bindBidirectional(binding.textForenameProperty());
		textName.textProperty().bindBidirectional(binding.textNameProperty());
		textEmail.textProperty().bindBidirectional(binding.textEmailProperty());
		textMobile.textProperty().bindBidirectional(binding.textMobileProperty());
		textTime.textProperty().bindBidirectional(binding.textTimeProperty());
	}
}
