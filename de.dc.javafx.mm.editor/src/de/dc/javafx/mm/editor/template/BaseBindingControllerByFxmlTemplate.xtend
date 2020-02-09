package de.dc.javafx.mm.editor.template

import de.dc.javafx.mm.editor.model.FxmlModel
import javafx.scene.control.ComboBox
import javafx.scene.control.ListView
import javafx.scene.control.TableView
import javafx.scene.control.TextField
import javafx.scene.control.TableColumn

class BaseBindingControllerByFxmlTemplate implements IGenerator<FxmlModel> {

	override gen(FxmlModel t) '''
	package «t.basePackage».controller;
	
	import «t.basePackage».model.*;
	import javafx.scene.control.TableCell;
	import javafx.scene.control.TableColumn;
	import javafx.scene.control.cell.PropertyValueFactory;

	public abstract class BaseBinding«t.name»Controller extends Base«t.name»Controller{
		
		protected «t.name»Binding binding = new «t.name»Binding();
		
		@Override
		public void initialize() {
			«FOR fxmo : t.document.fxomRoot.collectFxIds.entrySet»
			«val control = fxmo.value.sceneGraphObject»
			«val name = fxmo.key.toFirstUpper»
			«IF control instanceof TextField»
			«fxmo.key».textProperty().bindBidirectional(binding.«fxmo.key»Property());
			«ELSEIF control instanceof TableColumn»
			// TODO: Property not init yet!
			column«name».setCellValueFactory(new PropertyValueFactory<>(""));
			«ELSEIF control instanceof TableView || control instanceof ListView || control instanceof ComboBox»
			«fxmo.key».setItems(binding.sortedData«name»());
			binding.selectedData«name»().bind(«fxmo.key».getSelectionModel().selectedItemProperty());
			«ENDIF»
			«ENDFOR»
		}
	}
	'''
}
