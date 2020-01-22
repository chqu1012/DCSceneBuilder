package de.dc.javafx.mm.editor;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.ui.part.ViewPart;

import de.dc.javafx.mm.editor.control.SwtTableView;

public class ControlPallete extends ViewPart{
	private Composite compositeForm;

	public ControlPallete() {
	}

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new GridLayout(1, false));
		
		TabFolder tabFolder = new TabFolder(parent, SWT.NONE);
		GridData gd_tabFolder = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_tabFolder.heightHint = 146;
		tabFolder.setLayoutData(gd_tabFolder);
		
		TabItem tbtmLayout = new TabItem(tabFolder, SWT.NONE);
		tbtmLayout.setText("Layout");
		
		TabItem tbtmControls = new TabItem(tabFolder, SWT.NONE);
		tbtmControls.setText("Controls");
		
		TabItem tbtmViewers = new TabItem(tabFolder, SWT.NONE);
		tbtmViewers.setText("Viewers");
		
		Group group = new Group(tabFolder, SWT.NONE);
		tbtmViewers.setControl(group);
		group.setLayout(new GridLayout(2, false));
		
		Button btnEtableview = new Button(group, SWT.NONE);
		btnEtableview.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				for (Control control : compositeForm.getChildren()) {
					control.dispose();
				}
				new SwtTableView(compositeForm, SWT.NONE);
				compositeForm.layout();
			}
		});
		btnEtableview.setText("ETableView");
		
		Button btnEfilteredtableview = new Button(group, SWT.NONE);
		btnEfilteredtableview.setText("EFilteredTableView");
		
		Button btnEtreeview = new Button(group, SWT.NONE);
		btnEtreeview.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnEtreeview.setText("ETreeView");
		
		Button btnEfilteredtreeview = new Button(group, SWT.NONE);
		btnEfilteredtreeview.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnEfilteredtreeview.setText("EFilteredTreeView");
		
		Button btnElistview = new Button(group, SWT.NONE);
		btnElistview.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnElistview.setText("EListView");
		
		Button btnEfilteredlistview = new Button(group, SWT.NONE);
		btnEfilteredlistview.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnEfilteredlistview.setText("EFilteredListView");
		
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		Label lblNewLabel = new Label(composite, SWT.CENTER);
		GridData gd_lblNewLabel = new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1);
		gd_lblNewLabel.heightHint = 27;
		lblNewLabel.setLayoutData(gd_lblNewLabel);
		lblNewLabel.setText("Control Formular");
		
		compositeForm = new Composite(composite, SWT.NONE);
		compositeForm.setLayout(new FillLayout(SWT.HORIZONTAL));
		compositeForm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
	}

	@Override
	public void setFocus() {
	}
}