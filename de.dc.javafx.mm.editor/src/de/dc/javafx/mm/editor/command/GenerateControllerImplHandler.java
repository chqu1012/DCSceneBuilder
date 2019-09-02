package de.dc.javafx.mm.editor.command;

import de.dc.javafx.mm.EmfModel;
import de.dc.javafx.mm.editor.template.ControllerImplTemplate;

public class GenerateControllerImplHandler extends BaseGenerateHandler {

	@Override
	protected String getGeneratedContent(EmfModel model) {
		return new ControllerImplTemplate().gen(model);
	}

	@Override
	protected String getGeneratedFileName(EmfModel model) {
		return model.getName() + "Controller.java";
	}

	@Override
	protected String getGeneratedPackage(EmfModel model) {
		return model.getBasePackage() + ".controller";
	}
}