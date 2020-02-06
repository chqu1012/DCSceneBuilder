package de.dc.javafx.mm.editor.template

import de.dc.javafx.mm.editor.model.FxmlModel
import javafx.scene.control.ComboBox
import javafx.scene.control.ListView
import javafx.scene.control.TableView

class BaseSelectionBindingByFxmlTemplate implements IGenerator<FxmlModel> {

	override gen(FxmlModel t) '''
		package «t.basePackage».model;
		
		import javafx.beans.property.ObjectProperty;
		import javafx.beans.property.SimpleObjectProperty;
		import javafx.collections.FXCollections;
		import javafx.collections.ObservableList;
		import javafx.collections.transformation.FilteredList;
		import javafx.collections.transformation.SortedList;
		
		public class BaseSelection«t.name»Binding{
			«FOR node : t.document.fxomRoot.collectFxIds.entrySet»
			«val isTableView = node.value.sceneGraphObject instanceof TableView»
			«val isListView = node.value.sceneGraphObject instanceof ListView»
			«val isComboBox = node.value.sceneGraphObject instanceof ComboBox»
			«IF isTableView || isListView || isComboBox»
			«val name = node.key.toFirstUpper»
			«val type = '''«IF node.value.fxValue !== null»<«node.value.fxValue»>«ELSE»«ENDIF»'''»
			// Binding init for «node.key»
			private ObservableList«type» masterData«name» = FXCollections.observableArrayList();
			private FilteredList«type» filteredData«name» = new FilteredList<>(masterData«name»);
			private SortedList«type» sortedData«name» = new SortedList<>(filteredData«name»);
			private ObjectProperty«type» selectedData«name» = new SimpleObjectProperty<>();
			public ObservableList«type» masterData«name»() { return masterData«name»; }
			public FilteredList«type» filteredData«name»() { return filteredData«name»; }
			public SortedList«type» sortedData«name»() { return sortedData«name»; }
			public ObjectProperty«type» selectedData«name»() { return selectedData«name»;}
			
			«ENDIF»
			«ENDFOR»
		}
	'''
}
