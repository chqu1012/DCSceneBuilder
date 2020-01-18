package de.dc.javafx.mm.editor.command;

import de.dc.javafx.mm.EmfModel;
import de.dc.javafx.mm.editor.template.BindingTemplate;

public class GenerateBindingHandler extends BaseGenerateHandler {

	@Override
	protected String getGeneratedContent(EmfModel model) {
		return new BindingTemplate().gen(model);
	}

	@Override
	protected String getGeneratedFileName(EmfModel model) {
		return model.getName() + "Binding.java";
	}

	@Override
	protected String getGeneratedPackage(EmfModel model) {
		return model.getBasePackage()+".model";
	}
}
