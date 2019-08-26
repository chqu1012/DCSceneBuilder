package de.dc.javafx.mm.renderer.controller;

import de.dc.javafx.mm.renderer.FxmlRenderer;
import de.dc.javafx.mm.renderer.di.DIPlatform;
import javafx.event.ActionEvent;
import javafx.scene.Node;

public class PersonController {

	public void initialize() {
		System.out.println("INITIALIZE CONTROLLER");
	}

	public void onButtonClicked(ActionEvent e) {
		Node node = DIPlatform.getInstance(FxmlRenderer.class).findNodeBy("BUTTON1");
		if (e.getSource() == node) {
			System.out.println("Clicked!" + e);
		}
	}
}
