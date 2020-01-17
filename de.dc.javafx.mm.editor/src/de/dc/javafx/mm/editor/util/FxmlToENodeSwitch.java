package de.dc.javafx.mm.editor.util;

import static java.lang.String.format;

import java.util.Map.Entry;

import com.oracle.javafx.scenebuilder.kit.fxom.FXOMInstance;
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMProperty;
import com.oracle.javafx.scenebuilder.kit.metadata.util.PropertyName;

import de.dc.javafx.mm.EAnchorPane;
import de.dc.javafx.mm.EBorderPane;
import de.dc.javafx.mm.EHBox;
import de.dc.javafx.mm.ENode;
import de.dc.javafx.mm.ESplitPane;
import de.dc.javafx.mm.EStackPane;
import de.dc.javafx.mm.EVBox;
import de.dc.javafx.mm.util.MmSwitch;

public class FxmlToENodeSwitch extends MmSwitch<ENode> {

	private FXOMInstance fxmObj;
	private ENode child;

	@Override
	public ENode caseEBorderPane(EBorderPane parent) {
		for (Entry<PropertyName, FXOMProperty> entry : fxmObj.getProperties().entrySet()) {
			if (entry.getKey().getName().equals("left")) {
				parent.setLeft(child);
			} else if (entry.getKey().getName().equals("right")) {
				parent.setRight(child);
			} else if (entry.getKey().getName().equals("center")) {
				parent.setCenter(child);
			} else if (entry.getKey().getName().equals("bottom")) {
				parent.setBottom(child);
			} else if (entry.getKey().getName().equals("top")) {
				parent.setTop(child);
			} else {
				System.err.println(format("%s not created, because no mapping in caseEBorderPane", entry.getKey().getName()));
			}
		}

		return parent;
	}
	
	@Override public ENode caseEStackPane(EStackPane parent) { return addChild(parent); }
	@Override public ENode caseEVBox(EVBox parent) { return addChild(parent); }
	@Override public ENode caseEHBox(EHBox parent) { return addChild(parent); }
	@Override public ENode caseEAnchorPane(EAnchorPane parent) { return addChild(parent); }
	@Override public ENode caseESplitPane(ESplitPane parent) { return addChild(parent); }

	protected ENode addChild(ENode parent) {
		parent.getChildren().add(child);
		return parent;
	}
	
	public void setFxmObject(FXOMInstance fxmObj, ENode child) {
		this.fxmObj = fxmObj;
		this.child = child;
	}

}
