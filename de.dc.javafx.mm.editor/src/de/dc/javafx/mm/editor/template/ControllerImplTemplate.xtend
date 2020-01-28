package de.dc.javafx.mm.editor.template

import de.dc.javafx.mm.EBaseView
import de.dc.javafx.mm.EBinding
import de.dc.javafx.mm.EBorderPane
import de.dc.javafx.mm.EListView
import de.dc.javafx.mm.ENode
import de.dc.javafx.mm.ETableView
import de.dc.javafx.mm.EmfModel
import org.eclipse.emf.ecore.util.EcoreUtil

class ControllerImplTemplate implements IGenerator<EmfModel> {

	StringBuffer fieldBuffer = new StringBuffer
	StringBuffer onActionBuffer = new StringBuffer

	ControllerFieldInitializer fieldInitializer = new ControllerFieldInitializer(ControllerGenType.FIELD)
	ControllerFieldInitializer onActionInitializer = new ControllerFieldInitializer(ControllerGenType.ON_ACTION_IMPL)
	
	override gen(EmfModel t) '''
	package «t.basePackage».controller;
	
	import javafx.beans.value.*;
	import javafx.event.*;
	import javafx.scene.control.cell.*;
	import org.apache.log4j.*;
	import «t.basePackage».model.*;
	
	public class «t.name.toFirstUpper»Controller extends Base«t.name.toFirstUpper»Controller{
		
		private Logger log = Logger.getLogger(«t.name.toFirstUpper»Controller.class);
		
		private «t.name»Binding model = new «t.name»Binding();
		
		@Override
		public void initialize() {
			super.initialize();
			log.info("Initialize  «t.name.toFirstUpper»Controller");
			
			initDatabinding();
			«FOR node : EcoreUtil.getAllContents(t, true).filter(EBaseView).toList»
			«val nodeId = node.id.toFirstUpper»
			init«nodeId»();
			«ENDFOR»
		}
		
		private void initDatabinding() {
			«FOR binding : EcoreUtil.getAllContents(t, true).filter(EBinding).toList»
			«binding.node.id».«binding.binding.toString.toFirstLower»().«binding.direction.toString.toFirstLower»(model.«binding.name»Property());
			«ENDFOR»
		}
		
		«FOR node : EcoreUtil.getAllContents(t, true).filter(ETableView).toList»
		«val modelName = node.model?.name.toFirstUpper»
		«val nodeId = node.id.toFirstLower»
		private void init«nodeId.toFirstUpper»() {
			«IF !modelName.isNullOrEmpty»
			model.sortedData«modelName»().comparatorProperty().bind(«nodeId».comparatorProperty());			
			«nodeId».setItems(model.sortedData«modelName»());
			«nodeId».getSelectionModel().selectedItemProperty().addListener(this::onView«modelName»SelectionChanged);
			model.selected«modelName».bind(«nodeId».getSelectionModel().selectedItemProperty());
			«ENDIF»
			
			«FOR column : node.columns»
			«column.id.toFirstLower».setCellValueFactory(new PropertyValueFactory<>("«column.associatedField.name»"));
			«ENDFOR»
		}
		«ENDFOR»
		
		«FOR node : EcoreUtil.getAllContents(t, true).filter(EListView).toList»
		«val modelName = node.model?.name.toFirstUpper»
		«val nodeId = node.id.toFirstLower»
		private void init«nodeId.toFirstUpper»() {
			«nodeId».setItems(model.sortedData«modelName»());
			«nodeId».getSelectionModel().selectedItemProperty().addListener(this::onView«modelName»SelectionChanged);
			model.selected«modelName».bind(«nodeId».getSelectionModel().selectedItemProperty());
		}
		«ENDFOR»
		
		«FOR node : EcoreUtil.getAllContents(t, true).filter(ETableView).toList»
		«val name = node.model?.name.toFirstUpper»
		«IF !name.isNullOrEmpty»
		private void onView«name»SelectionChanged(ObservableValue<? extends «name»> observable, «name» oldValue, «name» newValue) {
			if (newValue!=null) {
				// TODO: not impleted yet!
			}
		}
		«ENDIF»
		«ENDFOR»
		
		«FOR node : EcoreUtil.getAllContents(t, true).filter(EListView).toList»
		«val name = node.model?.name.toFirstUpper»
		«IF !name.isNullOrEmpty»
		private void onView«name»SelectionChanged(ObservableValue<? extends «name»> observable, «name» oldValue, «name» newValue) {
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
				val content = onActionInitializer.doSwitch(node)
				if(!onActionBuffer.toString.contains(content)){
					onActionBuffer.append = content
				}
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
