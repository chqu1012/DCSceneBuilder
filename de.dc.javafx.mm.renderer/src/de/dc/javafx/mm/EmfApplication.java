package de.dc.javafx.mm;

import de.dc.javafx.mm.di.EmfPlatform;
import de.dc.javafx.mm.file.FxmlFile;
import de.dc.javafx.mm.renderer.FxmlChartRenderer;
import de.dc.javafx.mm.renderer.FxmlRenderer;
import de.dc.javafx.mm.renderer.FxmlRendererApplication;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public abstract class EmfApplication extends Application {

	protected FxmlFile file = new FxmlFile();
	protected FxmlChartRenderer renderer;

	@Override
	public void start(Stage primaryStage) throws Exception {
		EmfPlatform.init();
		renderer = getRenderer();
		Parent root = getRoot(getJavaFXFilePath());
		primaryStage.setScene(new Scene(root, getWidth(), getHeight()));
		primaryStage.show();
	}

	protected abstract String getJavaFXFilePath();

	private double getHeight() {
		return 800;
	}

	private double getWidth() {
		return 1200;
	}

	protected FxmlChartRenderer getRenderer() {
		return EmfPlatform.getInstance(FxmlChartRenderer.class);
	}

	protected Parent getRoot(String path) {
		EmfModel model = file.load(FxmlRendererApplication.class.getResource(path).getFile());
		return (Parent) renderer.doSwitch(model);
	}
}