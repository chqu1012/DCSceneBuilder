package de.dc.javafx.mm.editor.template

import de.dc.javafx.mm.editor.model.FxmlModel

class BindingByFxmlTemplate implements IGenerator<FxmlModel> {

	override gen(FxmlModel t) '''
	package «t.basePackage».model;
	
	public class «t.name»Binding extends BaseText«t.name»Binding{
	}
	'''
}