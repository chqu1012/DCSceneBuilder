package de.dc.javafx.mm.editor.template;

import de.dc.javafx.mm.ETableViewModel

class ModelTemplate implements IGenerator<ETableViewModel> {

	override gen(ETableViewModel t) '''
	package «t.instanceName.replace("."+t.name, '')»;
	
	public class «t.name»{
		
		«FOR field : t.fields»
		private «field.datatype» «field.name.toFirstLower»;
		«ENDFOR»

		«FOR field : t.fields»
		public void set«field.name.toFirstUpper»(«field.datatype» «field.name.toFirstLower»){
			this.«field.name.toFirstLower»=«field.name.toFirstLower»;
		}

		public «field.datatype» get«field.name.toFirstUpper»(){
			return this.«field.name.toFirstLower»;
		}
		«ENDFOR»
		
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder("«t.name» -> ");
			«FOR b : t.fields»
			«val name = b.name.toFirstLower»
			sb.append("«name»: ").append(«name»).append(",");
			«ENDFOR»
			return sb.toString();
		}
	}
	'''
}
