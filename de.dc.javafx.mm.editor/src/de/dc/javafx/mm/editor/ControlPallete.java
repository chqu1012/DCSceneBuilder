package de.dc.javafx.mm.editor;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.part.ViewPart;

import de.dc.javafx.mm.EBinding;
import de.dc.javafx.mm.EBindingType;
import de.dc.javafx.mm.EControlBinding;
import de.dc.javafx.mm.ENode;
import de.dc.javafx.mm.EmfModel;
import de.dc.javafx.mm.editor.control.SwtFormBindingSwitch;
import de.dc.javafx.mm.editor.control.SwtTableView;
import de.dc.javafx.mm.editor.control.SwtTextField;
import de.dc.javafx.mm.presentation.MmEditor;

public class ControlPallete extends ViewPart {
	
	public static final String ID = "de.dc.javafx.mm.editor.ControlPallete";
	
	private Composite compositeForm;
	private Composite parent;

	private SwtFormBindingSwitch bindingSwitch = new SwtFormBindingSwitch();
	
	public ControlPallete() {
	}

	@Override
	public void createPartControl(Composite parent) {
		this.parent = parent;
		parent.setLayout(new GridLayout(1, false));
		
		TabFolder tabFolder = new TabFolder(parent, SWT.NONE);
		GridData gd_tabFolder = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_tabFolder.heightHint = 146;
		tabFolder.setLayoutData(gd_tabFolder);
		
		TabItem tbtmLayout = new TabItem(tabFolder, SWT.NONE);
		tbtmLayout.setText("Layout");
		
		TabItem tbtmControls = new TabItem(tabFolder, SWT.NONE);
		tbtmControls.setText("Controls");
		
		Group groupControls = new Group(tabFolder, SWT.NONE);
		tbtmControls.setControl(groupControls);
		groupControls.setLayout(new GridLayout(1, false));
		
		Button btnEText = new Button(groupControls, SWT.NONE);
		btnEText.setText("EText");
		btnEText.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				for (Control control : compositeForm.getChildren()) {
					control.dispose();
				}
				new SwtTextField(compositeForm, SWT.NONE);
				compositeForm.layout();
			}
		});
		
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
		
		TabItem tbtmBinding = new TabItem(tabFolder, SWT.NONE);
		tbtmBinding.setText("Binding");
		
		Group groupBinding = new Group(tabFolder, SWT.NONE);
		tbtmBinding.setControl(groupBinding);
		groupBinding.setLayout(new GridLayout(1, false));
		
		Button btnTextproperty = new Button(groupBinding, SWT.NONE);
		btnTextproperty.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IEditorPart activeEditor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
				if (activeEditor instanceof MmEditor) {
					MmEditor editor = (MmEditor) activeEditor;
					ISelection selection = editor.getSelection();
					if (selection instanceof IStructuredSelection) {
						IStructuredSelection ss = (IStructuredSelection) selection;
						ENode control = (ENode) ss.getFirstElement();
						ResourceSet root = (ResourceSet) EcoreUtil.getRoot(control, true);						
						EmfModel emfModel = (EmfModel) root.getResources().get(0).getContents().get(0);
						EBinding newBinding = bindingSwitch.doSwitch(control);
						
						ENode alreadyBindedNode = null;
						boolean alreadyBinded = false;
						for (EBinding binding : emfModel.getBindingModel().getBindings()) {
							if (binding.getNode()==control && binding.getBinding()==EControlBinding.TEXT_PROPERTY) {
								alreadyBinded = true;
								alreadyBindedNode = binding.getNode();
							}
						}
						if (alreadyBinded) {
							MessageDialog.openInformation(new Shell(), "Control already binded!", control.eClass().getName()+" "+control.getId()+" already binded!");
							editor.getViewer().setSelection(new StructuredSelection(alreadyBindedNode), true);
						}else {
							emfModel.getBindingModel().getBindings().add(newBinding);
							editor.getViewer().setSelection(new StructuredSelection(newBinding), true);
						}
						
					}
				}
			}
		});
		btnTextproperty.setText("TextProperty");
		
		TabItem tbtmGeneration = new TabItem(tabFolder, SWT.NONE);
		tbtmGeneration.setText("Generation");
		
		Group groupGeneration = new Group(tabFolder, SWT.NONE);
		tbtmGeneration.setControl(groupGeneration);
		groupGeneration.setLayout(new GridLayout(2, false));
		
		Button btnGenerateModel = new Button(groupGeneration, SWT.NONE);
		btnGenerateModel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				executeCommand("de.dc.javafx.mm.editor.command.generateModelClass");
			}
		});
		btnGenerateModel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnGenerateModel.setText("Generate Model");
		
		Button btnGenerateBinding = new Button(groupGeneration, SWT.NONE);
		btnGenerateBinding.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				executeCommand("de.dc.javafx.mm.editor.command.generateBindingClass");
			}
		});
		btnGenerateBinding.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnGenerateBinding.setText("Generate Binding");
		
		Button btnGenerateController = new Button(groupGeneration, SWT.NONE);
		btnGenerateController.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				executeCommand("de.dc.javafx.mm.editor.command.generateControllerClass");
			}
		});
		btnGenerateController.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnGenerateController.setBounds(0, 0, 75, 25);
		btnGenerateController.setText("Generate Base Controller");
		
		Button btnGenerateApplication = new Button(groupGeneration, SWT.NONE);
		btnGenerateApplication.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				executeCommand("de.dc.javafx.mm.editor.command.generateApplication");
			}
		});
		btnGenerateApplication.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnGenerateApplication.setText("Generate Application");
		
		Button btnGenerateExtendedcontrollerr = new Button(groupGeneration, SWT.NONE);
		btnGenerateExtendedcontrollerr.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				executeCommand("de.dc.javafx.mm.editor.command.generateControllerImplClass");
			}
		});
		btnGenerateExtendedcontrollerr.setBounds(0, 0, 75, 25);
		btnGenerateExtendedcontrollerr.setText("Generate Extended Controller");
		
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

	private void executeCommand(String commandId) {
		// Retrieve the corresponding Services
		IHandlerService handlerService = (IHandlerService) getSite().getService(IHandlerService.class);
		ICommandService commandService = (ICommandService) getSite().getService(ICommandService.class);
		
		// Retrieve the command
		Command generateCmd = commandService.getCommand(commandId);

		// Create an ExecutionEvent
		ExecutionEvent executionEvent = handlerService.createExecutionEvent(generateCmd, new Event());

		// Launch the command
		try {
			generateCmd.executeWithChecks(executionEvent);
		} catch (ExecutionException | NotDefinedException | NotEnabledException | NotHandledException e1) {
			e1.printStackTrace();
		}		
	}
	
	@Override
	public void setFocus() {
	}
}