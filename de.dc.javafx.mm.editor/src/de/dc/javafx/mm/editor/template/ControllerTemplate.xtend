package de.dc.javafx.mm.editor.template;

import de.dc.javafx.mm.EBean
import de.dc.javafx.mm.ENode
import de.dc.javafx.mm.EmfModel
import org.eclipse.emf.ecore.util.EcoreUtil

class ControllerTemplate implements IGenerator<EmfModel> {

	StringBuffer fieldBuffer = new StringBuffer
	StringBuffer onActionBuffer = new StringBuffer

	ControllerFieldInitializer fieldInitializer = new ControllerFieldInitializer(ControllerGenType.FIELD)
	ControllerFieldInitializer onActionInitializer = new ControllerFieldInitializer(ControllerGenType.ON_ACTION)
	
	override gen(EmfModel t) '''
	package �t.basePackage�.controller;
	
	�FOR node : EcoreUtil.getAllContents(t, true).filter(EBean).toList�
	import �node.instanceName�;
	�ENDFOR�
	
	import de.dc.javafx.mm.control.*;
	import javafx.event.*;
	import javafx.fxml.*;
	import javafx.scene.control.*;
	import javafx.scene.layout.*;
	
	public abstract class Base�t.name.toFirstUpper�Controller{
		
		public void initialize(){}
		
		�t.root.initField�
		�fieldBuffer.toString�
		�onActionBuffer.toString�
	}
	'''

	def void getInitField(ENode node) {
		if (node !== null) {
			if (!node.id.isNullOrEmpty) {
				println(node.id)
				fieldBuffer.append = '''�fieldInitializer.doSwitch(node)�'''
				val content = onActionInitializer.doSwitch(node)
				if(!onActionBuffer?.toString.contains(content)){
					onActionBuffer.append = content
				}
			}
			node.children.forEach[ e | e.initField ]
		}
	}
}