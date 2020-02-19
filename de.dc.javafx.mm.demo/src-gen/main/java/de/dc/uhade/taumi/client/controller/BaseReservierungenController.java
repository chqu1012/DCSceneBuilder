package de.dc.uhade.taumi.client.controller;
	
import javafx.scene.image.ImageView;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.input.MouseEvent;
import javafx.event.ActionEvent;
public abstract class BaseReservierungenController{
	
	@FXML protected VBox formEmail;
	@FXML protected TextField textAbsender;
	@FXML protected TextField textEmpfaenger;
	@FXML protected TextField textBetreff;
	@FXML protected ComboBox comboBoxGeschlecht;
	@FXML protected TextArea textAreaInhalt;
	@FXML protected Button buttonEmailCancel;
	@FXML protected Button buttonEmailSend;
	@FXML protected ComboBox comboBoxLocation;
	@FXML protected TextField textSearchReservation;
	@FXML protected TableView tableView;
	@FXML protected TableColumn<Object,?> columnLocation;
	@FXML protected TableColumn<Object,?> columnName;
	@FXML protected TableColumn<Object,?> columnEmail;
	@FXML protected TableColumn<Object,?> columnMobile;
	@FXML protected TableColumn<Object,?> columnPersonCount;
	@FXML protected TableColumn<Object,?> columnDate;
	@FXML protected TableColumn<Object,?> columnTime;
	@FXML protected TableColumn<Object,?> columnFeedback;
	@FXML protected MenuItem menuitemImportReservation;
	@FXML protected MenuItem menuitemSendEmail;
	@FXML protected ProgressBar progressbar;
	@FXML protected ComboBox comboboxLocation;
	@FXML protected TextField textForename;
	@FXML protected TextField textName;
	@FXML protected TextField textEmail;
	@FXML protected TextField textMobile;
	@FXML protected DatePicker datePicker;
	@FXML protected TextField textTime;
	@FXML protected Button buttonOk;
	@FXML protected Button buttonClearReservation;
	
	public void initialize(){}
	
	@FXML
	    protected abstract void onButtonAction(ActionEvent event);
	
	@FXML
	    protected abstract void onMouseClicked(MouseEvent event);
	
}
