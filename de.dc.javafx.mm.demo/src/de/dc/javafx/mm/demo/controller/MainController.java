package de.dc.javafx.mm.demo.controller;

import javafx.event.*;
import org.apache.log4j.*;

public class MainController extends BaseMainController{
	
	private Logger log = Logger.getLogger(PersonController.class);
	
	@Override
	public void initialize() {
		log.info("Initialize  MainController");
	}
	
}
