package de.dc.javafx.mm.editor.template

import de.dc.javafx.mm.EmfModel
import org.eclipse.emf.ecore.util.EcoreUtil
import de.dc.javafx.mm.ETableView
import de.dc.javafx.mm.ETableViewModel

class BindingTemplate implements IGenerator<EmfModel>{
	
	override gen(EmfModel t)'''
	package «t.basePackage».model;
	
	import javafx.beans.property.*;
	import javafx.collections.*;
	import javafx.collections.transformation.*;
	
	public class «t.name.toFirstUpper»Binding{

		«FOR node : EcoreUtil.getAllContents(t, true).filter(ETableViewModel).toList»
		«val name = node.name.toFirstUpper»
		// Binding for TableView «name»
		private ObservableList<«name»> data«name» = FXCollections.observableArrayList(); 
		private FilteredList<«name»> filteredData«name» = new FilteredList<>(data«name»,p->true); 
		private SortedList<«name»> sortedData«name» = new SortedList<>(filteredData«name»); 
		public ObjectProperty<«name»> selected«name» = new SimpleObjectProperty<>();
		public ObservableList<«name»> data«name»(){ return data«name»;}
		public FilteredList<«name»> filteredData«name»(){ return filteredData«name»;}
		public SortedList<«name»> sortedData«name»(){return sortedData«name»;}; 
		public ObjectProperty<«name»> selected«name»(){return selected«name»;}; 
		public void add«name»(«name» «name.toFirstLower»){ this.data«name».add(«name.toFirstLower»);}
		public void remove«name»(«name» «name.toFirstLower»){ this.data«name».remove(«name.toFirstLower»);}
		«ENDFOR»
		
		«IF t.bindingModel!==null»
			«FOR b : t.bindingModel.bindings»
			«val name = b.name.toFirstLower»
			private «b.bindingType» «name» = new Simple«b.bindingType»();
		«ENDFOR»
		
		«FOR b : t.bindingModel.bindings»
		«val name = b.name.toFirstLower»
		public «b.bindingType.toString.replace('Property', '')» get«name.toFirstUpper»(){
			return this.«name».get();
		}
		
		public void set«name.toFirstUpper»(«b.bindingType.toString.replace('Property', '')» «name»){
			this.«name».set(«name»);
		}
		
		public «b.bindingType» «name»Property(){
			return this.«name»;
		}
		
		public void set«name.toFirstUpper»Property(«b.bindingType» «name»){
			this.«name»=«name»;
		}
		«ENDFOR»
		
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			«FOR b : t.bindingModel.bindings»
			«val name = b.name.toFirstLower»
			sb.append("«name»: ").append(«name».get()).append(",");
			«ENDFOR»
			return sb.toString();
		}
		«ENDIF»
	}
	'''
	
}