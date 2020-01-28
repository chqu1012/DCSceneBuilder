package de.dc.javafx.mm.editor.provider;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import de.dc.javafx.mm.editor.model.ModelLogEntry;

public class ModelLogLabelProvider extends LabelProvider implements ITableLabelProvider{

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		if (element instanceof ModelLogEntry) {
			ModelLogEntry e = (ModelLogEntry) element;
			switch (columnIndex) {
			case 0:
				return e.getTimestamp().toString();
			case 1:
				return e.getMessage();
			case 2:
				if (e.getNode()==null) {
					return StringUtils.EMPTY;
				}
				return e.getNode().eClass().getName();
			default:
				return StringUtils.EMPTY;
			}
		}
		return StringUtils.EMPTY;
	}
}