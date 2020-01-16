package de.dc.javafx.mm.editor.util;

import java.util.Map.Entry;

import com.oracle.javafx.scenebuilder.kit.fxom.FXOMInstance;
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMProperty;
import com.oracle.javafx.scenebuilder.kit.metadata.util.PropertyName;

import de.dc.javafx.mm.EBorderPane;
import de.dc.javafx.mm.ENode;
import de.dc.javafx.mm.util.MmSwitch;

public class FxmlToENodeSwitch extends MmSwitch<ENode>{

	private FXOMInstance fxmObj;
	
	@Override
	public ENode caseEBorderPane(EBorderPane object) {
//		FXOMProperty maxHeight = fxmObj.getProperties().get("maxHeight");
//		FXOMProperty maxWidth = fxmObj.getProperties().get("maxWidth");
//		FXOMProperty minHeight = fxmObj.getProperties().get("minHeight");
//		FXOMProperty minWidth = fxmObj.getProperties().get("minWidth");
//		FXOMProperty prefHeight = fxmObj.getProperties().get("prefHeight");
//		FXOMProperty prefWidth = fxmObj.getProperties().get("prefWidth");
		for (Entry<PropertyName, FXOMProperty> entry : fxmObj.getProperties().entrySet()) {
			System.out.println(entry.getKey().getName()+":\t\t"+entry.getValue().getName());
		}
		
		return super.caseEBorderPane(object);
	}
	
	public void setFxmObject(FXOMInstance fxmObj) {
		this.fxmObj=fxmObj;
	}
}
