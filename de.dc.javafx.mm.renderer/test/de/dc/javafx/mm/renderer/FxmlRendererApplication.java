package de.dc.javafx.mm.renderer;

import de.dc.javafx.mm.EmfApplication;
import de.dc.javafx.mm.di.EmfPlatform;

public class FxmlRendererApplication extends EmfApplication {

	public static void main(String[] args) {
		EmfPlatform.init();
		
		launch(args);
	}

	@Override
	protected String getJavaFXFilePath() {
		return "/de/dc/javafx/mm/renderer/FxmlRendererApplication.javafx";
	}

	@Override
	protected FxmlChartRenderer getRenderer() {
		return EmfPlatform.getInstance(FxmlChartRenderer.class);
	}
}