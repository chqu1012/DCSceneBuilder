package de.dc.javafx.mm.control.viewer.provider;

import java.util.List;

public interface IContentProvider<T> {

	List<T> getChildren(T input);

	List<T> getElements(T input);

	T getParent(T input);

	boolean hasChildren(T input);
}
