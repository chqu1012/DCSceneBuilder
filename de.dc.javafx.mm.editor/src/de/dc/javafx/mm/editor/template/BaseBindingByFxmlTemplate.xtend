package de.dc.javafx.mm.editor.template

import de.dc.javafx.mm.editor.model.FxmlModel
import javafx.scene.control.TextField

class BaseBindingByFxmlTemplate implements IGenerator<FxmlModel> {

	override gen(FxmlModel t) '''
		package «t.basePackage».model;
		
		import javafx.beans.property.*;
		import javafx.collections.*;
		import javafx.collections.transformation.*;
		
		public class BaseText«t.name»Binding  extends BaseSelection«t.name»Binding{
			«FOR node : t.document.fxomRoot.collectFxIds.entrySet»
			«IF node.value.sceneGraphObject instanceof TextField»
			private StringProperty «node.key» = new SimpleStringProperty();
			«ENDIF»
			«ENDFOR»
			
			«FOR node : t.document.fxomRoot.collectFxIds.entrySet»
			«IF node.value.sceneGraphObject instanceof TextField»
			«val name = node.key.toFirstLower»
			public String get«name.toFirstUpper»(){
				return this.«name».get();
			}
			
			public void set«name.toFirstUpper»(String «name»){
				this.«name».set(«name»);
			}
			
			public StringProperty «name»Property(){
				return this.«name»;
			}
			
			public void set«name.toFirstUpper»Property(StringProperty «name»){
				this.«name»=«name»;
			}
			«ENDIF»
			«ENDFOR»
			
			@Override
			public String toString() {
				StringBuilder sb = new StringBuilder();
				«FOR node : t.document.fxomRoot.collectFxIds.entrySet»
				«IF node.value.sceneGraphObject instanceof TextField»
				«val name = node.key»
				sb.append("«name»: ").append(«name».get()+",\t");
				«ENDIF»
				«ENDFOR»
				return super.toString();
			}
		}
	'''
}
