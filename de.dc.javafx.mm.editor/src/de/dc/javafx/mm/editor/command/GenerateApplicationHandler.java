package de.dc.javafx.mm.editor.command;

import de.dc.javafx.mm.EmfModel;
import de.dc.javafx.mm.editor.template.ApplicationTemplate;

public class GenerateApplicationHandler extends BaseGenerateHandler {

	@Override
	protected String getGeneratedContent(EmfModel model) {
		String className = currentFileSelection.getName().replace(".javafx", "");
		return new ApplicationTemplate(className).gen(model);
	}

	@Override
	protected String getGeneratedFileName(EmfModel model) {
		return currentFileSelection.getName().replace("javafx", "java");
	}

	@Override
	protected String getGeneratedPackage(EmfModel model) {
		return model.getBasePackage();
	}
}
