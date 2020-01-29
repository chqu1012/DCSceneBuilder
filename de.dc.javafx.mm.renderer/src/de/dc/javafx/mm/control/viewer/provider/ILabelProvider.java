package de.dc.javafx.mm.control.viewer.provider;

import javafx.scene.image.Image;

public interface ILabelProvider<T> {

	Image getImage(T element);
	
	String getText(T element);
}
