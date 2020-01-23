package de.dc.javafx.mm.editor.template

import de.dc.javafx.mm.EBorderPane
import de.dc.javafx.mm.ENode
import de.dc.javafx.mm.ETableView
import de.dc.javafx.mm.EmfModel
import org.eclipse.emf.ecore.util.EcoreUtil

class ControllerImplTemplate implements IGenerator<EmfModel> {

	StringBuffer fieldBuffer = new StringBuffer
	StringBuffer onActionBuffer = new StringBuffer

	ControllerFieldInitializer fieldInitializer = new ControllerFieldInitializer(ControllerGenType.FIELD)
	ControllerFieldInitializer onActionInitializer = new ControllerFieldInitializer(ControllerGenType.ON_ACTION)
	
	override gen(EmfModel t) '''
	package «t.basePackage».controller;
	
	import de.dc.javafx.mm.control.*;
	import javafx.beans.value.*;
	import javafx.event.*;
	import org.apache.log4j.*;
	import «t.basePackage».model.*;
	
	public class «t.name.toFirstUpper»Controller extends Base«t.name.toFirstUpper»Controller{
		
		private Logger log = Logger.getLogger(«t.name.toFirstUpper»Controller.class);
		
		private «t.name»Binding model = new «t.name»Binding();
		
		@Override
		public void initialize() {
			super.initialize();
			log.info("Initialize  «t.name.toFirstUpper»Controller");
			
			«FOR node : EcoreUtil.getAllContents(t, true).filter(ETableView).toList»
			«val modelName = node.model?.name.toFirstUpper»
			«IF !modelName.isNullOrEmpty»
			model.sortedData«modelName»().comparatorProperty().bind(«node.id.toFirstLower».comparatorProperty());			
			«node.id.toFirstLower».setItems(model.sortedData«node.model.name.toFirstUpper»());
			«node.id.toFirstLower».getSelectionModel().selectedItemProperty().addListener(this::onTableView«node.model.name.toFirstUpper»SelectionChanged);
			model.selected«node.model.name.toFirstUpper».bind(«node.id.toFirstLower».getSelectionModel().selectedItemProperty());
			«ENDIF»
			«ENDFOR»
		}
		
		«FOR node : EcoreUtil.getAllContents(t, true).filter(ETableView).toList»
		«val name = node.model?.name.toFirstUpper»
		«IF !name.isNullOrEmpty»
		private void onTableView«name»SelectionChanged(ObservableValue<? extends «name»> observable, «name» oldValue, «name» newValue) {
			if (newValue!=null) {
				// TODO: not impleted yet!
			}
		}
		«ENDIF»
		«ENDFOR»
		
		«t.root.initField»
		«onActionBuffer.toString»
	}
	'''

	def void getInitField(ENode node) {
		if (node !== null) {
			if (!node.id.isNullOrEmpty) {
				fieldBuffer.append = '''«fieldInitializer.doSwitch(node)»'''
				onActionBuffer.append = '''«onActionInitializer.doSwitch(node)»'''
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
