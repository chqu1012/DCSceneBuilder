package de.dc.javafx.mm.editor;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;

import de.dc.javafx.mm.ENode;
import de.dc.javafx.mm.ETableView;
import de.dc.javafx.mm.editor.dialog.ETableViewDialog;
import de.dc.javafx.mm.presentation.MmEditor;

public class ExtendedMmEditor extends MmEditor{

	@Override
	public void createPages() {
		super.createPages();
		selectionViewer.addDoubleClickListener(event -> {
			ETableViewDialog dialog = new ETableViewDialog(new Shell());
			int code = dialog.open();
			if (code==0) {
				ETableView result = dialog.getResult();
				ISelection selection = event.getSelection();
				if (selection instanceof IStructuredSelection) {
					IStructuredSelection ss = (IStructuredSelection) selection;
					if (ss.getFirstElement() instanceof ENode) {
						ENode eNode = (ENode) ss.getFirstElement();
						eNode.getChildren().add(result);
					}
				}
			}
		});
	}
}
