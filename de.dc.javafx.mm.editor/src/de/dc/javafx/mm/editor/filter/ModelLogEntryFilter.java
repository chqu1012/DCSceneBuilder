package de.dc.javafx.mm.editor.filter;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import de.dc.javafx.mm.editor.model.ModelLogEntry;

public class ModelLogEntryFilter extends ViewerFilter {

	private String searchString;

	public void setSearchText(String s) {
		this.searchString = s.toLowerCase();
	}

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		if (searchString == null || searchString.length() == 0) {
			return true;
		}
		ModelLogEntry p = (ModelLogEntry) element;
		if (p.getMessage().toLowerCase().contains(searchString)) {
			return true;
		}
		if (p.getNode().eClass().getName().toLowerCase().contains(searchString)) {
			return true;
		}
		return false;
	}
}