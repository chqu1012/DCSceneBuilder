package de.dc.javafx.mm.control.viewer;

import de.dc.javafx.mm.control.viewer.provider.IContentProvider;
import de.dc.javafx.mm.control.viewer.provider.ILabelProvider;

public interface IViewer<T> {

	void setLabelProvider(ILabelProvider<T> labelProvider);

	void setContentProvider(IContentProvider<T> contentProvider);
	
	void setInput(T input);
}
