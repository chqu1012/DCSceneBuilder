package de.dc.javafx.mm.demo.controller;

import javafx.beans.value.*;
import javafx.event.*;
import javafx.scene.control.cell.*;
import org.apache.log4j.*;
import de.dc.javafx.mm.demo.model.*;

public class ListViewController extends BaseListItemController{
	
	private Logger log = Logger.getLogger(ListViewController.class);
	
	private ListItemBinding model = new ListItemBinding();
	
	@Override
	public void initialize() {
		super.initialize();
		log.info("Initialize  ListItemController");
		
		initDatabinding();
	}
	
	private void initDatabinding() {
	}
	
	
	
}
