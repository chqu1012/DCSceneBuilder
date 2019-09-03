package de.dc.javafx.mm.demo;

import de.dc.javafx.mm.EmfApplication;
import de.dc.javafx.mm.di.EmfPlatform;
import de.dc.javafx.mm.renderer.FxmlRenderer;

public class FxmlRenderApplication extends EmfApplication{

	@Override
	protected String getJavaFXFilePath() {
		return "/FxmlRendererApplication.javafx";
	}

	@Override
	protected FxmlRenderer getRenderer() {
		return EmfPlatform.getInstance(FxmlRenderer.class);
	}
	
	public static void main(String[] args) {
		EmfPlatform.init();
		
		launch(args);
	}

}
