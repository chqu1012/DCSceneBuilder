package de.dc.javafx.mm.editor;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import de.dc.javafx.mm.ENode;
import de.dc.javafx.mm.EmfModel;
import de.dc.javafx.mm.renderer.FxmlRenderer;
import javafx.embed.swt.FXCanvas;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class EmfModelPreview extends ViewPart implements ISelectionListener {

	public static final String ID = "";

	private FxmlRenderer renderer = new FxmlRenderer();

	private FXCanvas fxCanvas;

	@Override
	public void createPartControl(Composite parent) {
		fxCanvas = new FXCanvas(parent, SWT.NONE) {
			public Point computeSize(int wHint, int hHint, boolean changed) {
				getScene().getWindow().sizeToScene();
				int width = (int) getScene().getWidth();
				int height = (int) getScene().getHeight();
				return new Point(width, height);
			}
		};
		fxCanvas.setScene(new Scene(new Group()));
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().addSelectionListener(this);
	}

	@Override
	public void setFocus() {
		fxCanvas.setFocus();
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ss = (IStructuredSelection) selection;
			if (ss.getFirstElement() instanceof EmfModel) {
				EmfModel emfModel = (EmfModel) ss.getFirstElement();
				fxCanvas.setScene(new Scene((Parent) renderer.doSwitch(emfModel)));
			} else if (ss.getFirstElement() instanceof ENode) {
				ENode node = (ENode) ss.getFirstElement();
				fxCanvas.setScene(new Scene((Parent) renderer.doSwitch(node)));
			}
		}
	}
}
