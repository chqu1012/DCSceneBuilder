package de.dc.javafx.mm.control.viewer.provider;

import javafx.scene.image.Image;

public class LabelProvider implements ILabelProvider<Object>{

	@Override
	public String getText(Object element) {
		return element == null ? "" : element.toString();
	}

	@Override
	public Image getImage(Object element) {
		return null;
	}
}
