package de.dc.javafx.mm.renderer;

import de.dc.javafx.mm.EBorderPane;
import de.dc.javafx.mm.EButton;
import de.dc.javafx.mm.ENode;
import de.dc.javafx.mm.ETableColumn;
import de.dc.javafx.mm.ETableView;
import de.dc.javafx.mm.EVBox;
import de.dc.javafx.mm.EmfModel;
import de.dc.javafx.mm.MmFactory;
import de.dc.javafx.mm.file.FxmlFile;
import de.dc.javafx.mm.renderer.di.DIPlatform;
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
		DIPlatform.init();
		
		FxmlRenderer renderer = DIPlatform.getInstance(FxmlRenderer.class);

//		EmfModel model = MmFactory.eINSTANCE.createEmfModel();
//		model.setController("de.dc.javafx.mm.renderer.controller.PersonController");
//		
//		EBorderPane eRoot = MmFactory.eINSTANCE.createEBorderPane();
//		eRoot.setLeft(createVBox());
//		eRoot.setRight(createButton("Right Button"));
//		eRoot.setTop(createButton("Top Button"));
//		eRoot.setBottom(createButton("Bottom Button"));
//		eRoot.setCenter(creatTable());
//
//		for (int j = 0; j < 10; j++) {
//			EButton button = createButton("Button " + j);
//			eRoot.getChildren().add(button);
//		}
//
//		model.setRoot(eRoot);
		
		FxmlFile file = new FxmlFile();
		EmfModel model = file.load(FxmlRendererApplication.class.getResource("/de/dc/javafx/mm/renderer/FxmlRendererApplication.javafx").getFile());
		Parent root = (Parent) renderer.doSwitch(model);
		primaryStage.setScene(new Scene(root, 1000, 700));
		primaryStage.show();
	}

	private ENode creatTable() {
		ETableView tableView = MmFactory.eINSTANCE.createETableView();
		
		ETableColumn nameCol = MmFactory.eINSTANCE.createETableColumn();
		nameCol.setName("Name");

		ETableColumn lastnameCol = MmFactory.eINSTANCE.createETableColumn();
		lastnameCol.setName("Lastname");
		
		tableView.getColumns().add(nameCol);
		tableView.getColumns().add(lastnameCol);
		
		return tableView;
	}

	private ENode createVBox() {
		EVBox vbox = MmFactory.eINSTANCE.createEVBox();
		vbox.setSpacing(5);
		vbox.setMaxHeight(Double.MAX_VALUE);
		vbox.setMaxWidth(Double.MAX_VALUE);
		for (int i = 0; i < 10; i++) {
			EButton button = MmFactory.eINSTANCE.createEButton();
			button.setId("BUTTON"+i);
			button.setOnAction("onButtonClicked");
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