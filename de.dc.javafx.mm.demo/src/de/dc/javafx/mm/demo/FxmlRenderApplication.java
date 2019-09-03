package de.dc.javafx.mm.demo;

import de.dc.javafx.mm.EmfApplication;

public class FxmlRenderApplication extends EmfApplication{

	@Override
	protected String getJavaFXFilePath() {
		return "/FxmlRendererApplication.javafx";
	}

	public static void main(String[] args) {
		launch(args);
	}

}
