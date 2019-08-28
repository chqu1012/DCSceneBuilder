package de.dc.javafx.mm.editor.template;

import de.dc.javafx.mm.ENode;
import de.dc.javafx.mm.EmfModel;
import de.dc.javafx.mm.EBorderPane

class ControllerTemplate implements IGenerator<EmfModel> {

	StringBuffer sb = new StringBuffer
	ControllerFieldInitializer fieldInitializer = new ControllerFieldInitializer

	override gen(EmfModel t) '''
package «t.basePackage».controller;

public class «t.name.toFirstUpper»Controller{
	
	public void initialize(){}
	
	«t.root.initField»«sb.toString»
}
'''

	def void getInitField(ENode node) {
		if (node !== null) {
			if (!node.id.isNullOrEmpty) {
				sb.append = '''«fieldInitializer.doSwitch(node)»'''
			}
			if (node instanceof EBorderPane) {
				node.left.initField
				node.right.initField
				node.top.initField
				node.bottom.initField
				node.center.initField
			} else {
				node.children.forEach[e|e.initField]
			}
		}
	}
}
