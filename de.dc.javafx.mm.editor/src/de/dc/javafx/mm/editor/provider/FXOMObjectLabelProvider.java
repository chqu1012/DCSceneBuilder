package de.dc.javafx.mm.editor.provider;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import com.oracle.javafx.scenebuilder.kit.fxom.FXOMObject;

public class FXOMObjectLabelProvider extends LabelProvider implements ITableLabelProvider {

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		FXOMObject obj = (FXOMObject) element;
		switch (columnIndex) {
		case 0:
			return obj.getSceneGraphObject().getClass().getSimpleName();
		case 1:
			return obj.getFxId();
		case 2:
			return obj.getFxValue();
		default:
			return "";
		}
	}

}
