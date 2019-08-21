package de.dc.javafx.mm.renderer;

import de.dc.javafx.mm.EBorderPane;
import de.dc.javafx.mm.EButton;
import de.dc.javafx.mm.ENode;
import de.dc.javafx.mm.EVBox;
import de.dc.javafx.mm.MmFactory;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FxmlRendererApplication extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FxmlRenderer renderer = new FxmlRenderer();

		EBorderPane eRoot = MmFactory.eINSTANCE.createEBorderPane();
		eRoot.setLeft(createVBox());
		eRoot.setRight(createButton("Right Button"));
		eRoot.setTop(createButton("Top Button"));
		eRoot.setBottom(createButton("Bottom Button"));

		for (int j = 0; j < 10; j++) {
			eRoot.getChildren().add(createButton("Button " + j));
		}

		Parent root = (Parent) renderer.doSwitch(eRoot);
		primaryStage.setScene(new Scene(root, 1000, 700));
		primaryStage.show();
	}

	private ENode createVBox() {
		EVBox vbox = MmFactory.eINSTANCE.createEVBox();
		vbox.setSpacing(5);
		vbox.setMaxHeight(Double.MAX_VALUE);
		vbox.setMaxWidth(Double.MAX_VALUE);
		for (int i = 0; i < 10; i++) {
			EButton button = MmFactory.eINSTANCE.createEButton();
			button.setText("Button " + i);
			vbox.getChildren().add(button);
		}
		return vbox;
	}

	private EButton createButton(String text) {
		EButton leftButton = MmFactory.eINSTANCE.createEButton();
		leftButton.setText(text);
		leftButton.setMaxHeight(Double.MAX_VALUE);
		leftButton.setMaxWidth(Double.MAX_VALUE);
		return leftButton;
	}
}