package de.dc.javafx.mm.editor.template

import de.dc.javafx.mm.EViewModel
import de.dc.javafx.mm.EmfModel
import de.dc.javafx.mm.editor.template.util.ViewerContent
import org.eclipse.emf.ecore.util.EcoreUtil

class BindingTemplate implements IGenerator<EmfModel>{
	
	override gen(EmfModel t)'''
	package «t.basePackage».model;
	
	import javafx.beans.property.*;
	import javafx.collections.*;
	import javafx.collections.transformation.*;
	
	public class «t.name.toFirstUpper»Binding{

		«FOR node : EcoreUtil.getAllContents(t, true).filter(EViewModel).toList»
		«val name = node.name.toFirstUpper»
		«ViewerContent.createContent(name)»
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