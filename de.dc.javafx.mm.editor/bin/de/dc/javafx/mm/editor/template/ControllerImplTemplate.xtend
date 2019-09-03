package de.dc.javafx.mm.editor.template

import de.dc.javafx.mm.EBorderPane
import de.dc.javafx.mm.ENode
import de.dc.javafx.mm.EmfModel

class ControllerImplTemplate implements IGenerator<EmfModel> {

	StringBuffer onActionBuffer = new StringBuffer

	ControllerFieldInitializer onActionInitializer = new ControllerFieldInitializer(ControllerGenType.ON_ACTION_IMPL)

	override gen(EmfModel t) '''
	package «t.basePackage».controller;
	
	import javafx.event.*;
	import org.apache.log4j.*;
	
	public class «t.name.toFirstUpper»Controller extends Base«t.name.toFirstUpper»Controller{
		
		private Logger log = Logger.getLogger(PersonController.class);
		
		@Override
		public void initialize() {
			log.info("Initialize  «t.name.toFirstUpper»Controller");
		}
		
		«t.root.initField»
		«onActionBuffer.toString»
	}
	'''

	def void getInitField(ENode node) {
		if (node !== null) {
			onActionBuffer.append = '''«onActionInitializer.doSwitch(node)»'''
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
