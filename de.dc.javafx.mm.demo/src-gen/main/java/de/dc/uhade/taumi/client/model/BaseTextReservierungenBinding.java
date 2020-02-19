package de.dc.uhade.taumi.client.model;

import javafx.beans.property.*;
import javafx.collections.*;
import javafx.collections.transformation.*;

public class BaseTextReservierungenBinding  extends BaseSelectionReservierungenBinding{
	private StringProperty textAbsender = new SimpleStringProperty();
	private StringProperty textEmpfaenger = new SimpleStringProperty();
	private StringProperty textBetreff = new SimpleStringProperty();
	private StringProperty textSearchReservation = new SimpleStringProperty();
	private StringProperty textForename = new SimpleStringProperty();
	private StringProperty textName = new SimpleStringProperty();
	private StringProperty textEmail = new SimpleStringProperty();
	private StringProperty textMobile = new SimpleStringProperty();
	private StringProperty textTime = new SimpleStringProperty();
	
	public String getTextAbsender(){
		return this.textAbsender.get();
	}
	
	public void setTextAbsender(String textAbsender){
		this.textAbsender.set(textAbsender);
	}
	
	public StringProperty textAbsenderProperty(){
		return this.textAbsender;
	}
	
	public void setTextAbsenderProperty(StringProperty textAbsender){
		this.textAbsender=textAbsender;
	}
	public String getTextEmpfaenger(){
		return this.textEmpfaenger.get();
	}
	
	public void setTextEmpfaenger(String textEmpfaenger){
		this.textEmpfaenger.set(textEmpfaenger);
	}
	
	public StringProperty textEmpfaengerProperty(){
		return this.textEmpfaenger;
	}
	
	public void setTextEmpfaengerProperty(StringProperty textEmpfaenger){
		this.textEmpfaenger=textEmpfaenger;
	}
	public String getTextBetreff(){
		return this.textBetreff.get();
	}
	
	public void setTextBetreff(String textBetreff){
		this.textBetreff.set(textBetreff);
	}
	
	public StringProperty textBetreffProperty(){
		return this.textBetreff;
	}
	
	public void setTextBetreffProperty(StringProperty textBetreff){
		this.textBetreff=textBetreff;
	}
	public String getTextSearchReservation(){
		return this.textSearchReservation.get();
	}
	
	public void setTextSearchReservation(String textSearchReservation){
		this.textSearchReservation.set(textSearchReservation);
	}
	
	public StringProperty textSearchReservationProperty(){
		return this.textSearchReservation;
	}
	
	public void setTextSearchReservationProperty(StringProperty textSearchReservation){
		this.textSearchReservation=textSearchReservation;
	}
	public String getTextForename(){
		return this.textForename.get();
	}
	
	public void setTextForename(String textForename){
		this.textForename.set(textForename);
	}
	
	public StringProperty textForenameProperty(){
		return this.textForename;
	}
	
	public void setTextForenameProperty(StringProperty textForename){
		this.textForename=textForename;
	}
	public String getTextName(){
		return this.textName.get();
	}
	
	public void setTextName(String textName){
		this.textName.set(textName);
	}
	
	public StringProperty textNameProperty(){
		return this.textName;
	}
	
	public void setTextNameProperty(StringProperty textName){
		this.textName=textName;
	}
	public String getTextEmail(){
		return this.textEmail.get();
	}
	
	public void setTextEmail(String textEmail){
		this.textEmail.set(textEmail);
	}
	
	public StringProperty textEmailProperty(){
		return this.textEmail;
	}
	
	public void setTextEmailProperty(StringProperty textEmail){
		this.textEmail=textEmail;
	}
	public String getTextMobile(){
		return this.textMobile.get();
	}
	
	public void setTextMobile(String textMobile){
		this.textMobile.set(textMobile);
	}
	
	public StringProperty textMobileProperty(){
		return this.textMobile;
	}
	
	public void setTextMobileProperty(StringProperty textMobile){
		this.textMobile=textMobile;
	}
	public String getTextTime(){
		return this.textTime.get();
	}
	
	public void setTextTime(String textTime){
		this.textTime.set(textTime);
	}
	
	public StringProperty textTimeProperty(){
		return this.textTime;
	}
	
	public void setTextTimeProperty(StringProperty textTime){
		this.textTime=textTime;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("textAbsender: ").append(textAbsender.get()+",\t");
		sb.append("textEmpfaenger: ").append(textEmpfaenger.get()+",\t");
		sb.append("textBetreff: ").append(textBetreff.get()+",\t");
		sb.append("textSearchReservation: ").append(textSearchReservation.get()+",\t");
		sb.append("textForename: ").append(textForename.get()+",\t");
		sb.append("textName: ").append(textName.get()+",\t");
		sb.append("textEmail: ").append(textEmail.get()+",\t");
		sb.append("textMobile: ").append(textMobile.get()+",\t");
		sb.append("textTime: ").append(textTime.get()+",\t");
		return super.toString();
	}
}
