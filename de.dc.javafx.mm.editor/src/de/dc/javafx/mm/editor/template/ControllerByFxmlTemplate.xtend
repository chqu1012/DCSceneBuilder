package de.dc.javafx.mm.editor.template

import com.oracle.javafx.scenebuilder.app.util.eventnames.EventNames
import com.oracle.javafx.scenebuilder.app.util.eventnames.FindEventNamesUtil
import com.oracle.javafx.scenebuilder.app.util.eventnames.ImportBuilder
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMDocument
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMPropertyT
import de.dc.javafx.mm.editor.model.FxmlModel
import java.util.HashSet
import java.util.Map
import java.util.Set
import java.util.TreeMap
import javafx.scene.control.TableView
import javafx.scene.control.TableColumn

class ControllerByFxmlTemplate implements IGenerator<FxmlModel> {

	final String INDENT = "    "
	static final String FXML_ANNOTATION = "@FXML\n"
	
	Set<String> imports = new HashSet
	StringBuilder handlers = new StringBuilder
	
	override gen(FxmlModel t) '''
		package «t.basePackage».controller;
		«mapMethods(t)»
			
		import javafx.scene.image.ImageView;
		import javafx.event.*;
		import javafx.fxml.*;
		import javafx.scene.control.*;
		import javafx.scene.layout.*;
		«FOR imp : imports»
		«imp»
		«ENDFOR»
		public abstract class Base«t.name»Controller{
			
			«FOR fxmo : t.document.fxomRoot.collectFxIds.entrySet»
			«val control = fxmo.value.sceneGraphObject»
			«IF control instanceof TableView»
			«val model = '''«IF fxmo.value.fxValue===null»«ELSE»<«fxmo.value.fxValue»>«ENDIF»'''»
			@FXML protected TableView«model» «fxmo.key»;
			«ELSEIF control instanceof TableColumn»
			«val parent = '''«IF fxmo.value.parentObject.fxValue===null»Object«ELSE»«fxmo.value.parentObject.fxValue»«ENDIF»'''»
			«val tableColumn = control as TableColumn»
			@FXML protected TableColumn<«parent»,?> «fxmo.key»;
			«ELSE»
			@FXML protected «fxmo.value.sceneGraphObject.class.simpleName» «fxmo.key»;
			«ENDIF»
			«ENDFOR»
			
			public void initialize(){}
			
			«handlers.toString»
		}
	'''
	
	def generateControllerSkeleton(String methodName, String eventTypeName) {
        handlers.append(FXML_ANNOTATION).append(INDENT).append("protected abstract void ")
        val methodNamePured = methodName.replace("#", "")
        handlers.append(methodNamePured);
        val eventName = FindEventNamesUtil.findEventName(eventTypeName);
        handlers.append("(").append(eventName).append(" event);\n\n"); //NOI18N
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

	def String constructPackageLine(FXOMDocument doc) {
		val controller = doc.getFxomRoot().getFxController();
		var packageLine = new StringBuffer
		if (controller !== null && !controller.isEmpty && controller.contains(".") && !controller.contains("$")) {
			packageLine.append("package ")
			packageLine.append(controller.substring(0, controller.lastIndexOf('.')))
			packageLine.append(";")
		}
		packageLine.toString
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
