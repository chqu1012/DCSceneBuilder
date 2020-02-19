package de.dc.javafx.mm.editor.template

import com.oracle.javafx.scenebuilder.app.util.eventnames.EventNames
import com.oracle.javafx.scenebuilder.app.util.eventnames.FindEventNamesUtil
import com.oracle.javafx.scenebuilder.app.util.eventnames.ImportBuilder
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMPropertyT
import de.dc.javafx.mm.editor.model.FxmlModel
import java.util.HashSet
import java.util.Map
import java.util.Set
import java.util.TreeMap

class ControllerImplByFxmlTemplate implements IGenerator<FxmlModel> {

	Set<String> imports = new HashSet
	StringBuilder handlers = new StringBuilder
	
	override gen(FxmlModel t) '''
	package «t.basePackage».controller;
	«mapMethods(t)»
		
	«FOR imp : imports»
	«imp»
	«ENDFOR»
	«IF t.useSpring»
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	
	@Controller
	«ENDIF»
	public class «t.name»Controller extends BaseBinding«t.name»Controller{
		
		@Override
		public void initialize(){
			super.initialize();
		}
		
		«handlers.toString»
	}
	'''
	
	def generateControllerSkeleton(String methodName, String eventTypeName) {
        handlers.append("@Override ").append("protected void ")
        val methodNamePured = methodName.replace("#", "")
        handlers.append(methodNamePured);
        val eventName = FindEventNamesUtil.findEventName(eventTypeName);
        handlers.append("(").append(eventName).append(" event){\n}\n\n"); //NOI18N
        addImportsForEvents(eventName);
    }
    
    def addImportsForEvents(String eventName) {
        if(EventNames.ACTION_EVENT.equals(eventName)) {
            ImportBuilder.add(ImportBuilder.IMPORT_STATEMENT.concat(ImportBuilder.EVENT_PACKAGE), eventName);
        }
        else {
            ImportBuilder.add(ImportBuilder.IMPORT_STATEMENT.concat(ImportBuilder.INPUT_PACKAGE), eventName);
        }
        buildAndCollectImports();
    }

	def mapMethods(FxmlModel model){
		 val Map<String, String> methodsAndEvents = new TreeMap
        // need to initialize the internal events map
        FindEventNamesUtil.initializeEventsMap();
        for (FXOMPropertyT handler : model.document.getFxomRoot().collectEventHandlers()) {
            val eventTypeName = handler.getName().getName();
            methodsAndEvents.put(handler.getValue(), eventTypeName);
        }
        for(m : methodsAndEvents.entrySet){
        	generateControllerSkeleton(m.key , m.value)
        }
	}

	def addImportsFor(Class<?>... classes) {
		for (Class<?> c : classes) {
			ImportBuilder.add(ImportBuilder.IMPORT_STATEMENT, c.getName().replace("$", "."));
			buildAndCollectImports();
		}
		// need an import statement for @FXML, too
		ImportBuilder.add(ImportBuilder.IMPORT_STATEMENT, ImportBuilder.FXML_PACKAGE);
		buildAndCollectImports();
	}
	
	 def buildAndCollectImports() {
        imports.add(ImportBuilder.build());
        ImportBuilder.reset();
    }

}
