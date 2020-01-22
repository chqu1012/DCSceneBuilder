package de.dc.javafx.mm.editor;

import de.dc.javafx.mm.presentation.MmEditor;

public class ExtendedMmEditor extends MmEditor{

	@Override
	public void createPages() {
		super.createPages();
//		selectionViewer.addDoubleClickListener(event -> {
//			ETableViewDialog dialog = new ETableViewDialog(new Shell());
//			int code = dialog.open();
//			if (code==0) {
//				ETableView result = dialog.getResult();
//				ISelection selection = event.getSelection();
//				if (selection instanceof IStructuredSelection) {
//					IStructuredSelection ss = (IStructuredSelection) selection;
//					if (ss.getFirstElement() instanceof ENode) {
//						ENode eNode = (ENode) ss.getFirstElement();
//						eNode.getChildren().add(result);
//					}
//				}
//			}
//		});
	}
}
