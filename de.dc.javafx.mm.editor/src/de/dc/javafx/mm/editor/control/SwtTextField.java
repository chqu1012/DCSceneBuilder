package de.dc.javafx.mm.editor.control;

import java.util.Arrays;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.PojoProperties;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.internal.ui.JavaPlugin;
import org.eclipse.jdt.internal.ui.actions.ActionMessages;
import org.eclipse.jdt.internal.ui.dialogs.OpenTypeSelectionDialog;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import de.dc.javafx.mm.EBinding;
import de.dc.javafx.mm.EBindingType;
import de.dc.javafx.mm.EControlBinding;
import de.dc.javafx.mm.ENode;
import de.dc.javafx.mm.EText;
import de.dc.javafx.mm.EmfModel;
import de.dc.javafx.mm.MmFactory;
import de.dc.javafx.mm.presentation.MmEditor;

public class SwtTextField extends Composite {
	private DataBindingContext m_bindingContext;
	
	private Text textId;
	private Text textPromptText;
	private Text textValue;

	private EText eText = MmFactory.eINSTANCE.createEText();
	
	private Label lblTextfieldConventionStarts;
	private Label lblNewLabel;
	private Label lblBinding;
	private Label lblBinding_1;
	private Combo comboBinding;
	private Label lblPropertyName;
	private Label lblModel;
	private Text textModel;
	private Button buttonPojo;
	private Combo comboProperty;
	
	public SwtTextField(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(3, false));
		new Label(this, SWT.NONE);
		
		lblTextfieldConventionStarts = new Label(this, SWT.NONE);
		lblTextfieldConventionStarts.setText("TextField convention starts with text, e.g. textPersonName");
		new Label(this, SWT.NONE);
		
		Label lblId = new Label(this, SWT.NONE);
		lblId.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblId.setText("Id*");
		
		textId = new Text(this, SWT.BORDER);
		textId.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (!textId.getText().startsWith("text")) {
					lblTextfieldConventionStarts.setText("Id should start with text, eg. textPersonName!");
				}else {
					lblTextfieldConventionStarts.setText("");
				}
			}
		});
		textId.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(this, SWT.NONE);
		
		Label lblPromptText = new Label(this, SWT.NONE);
		lblPromptText.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblPromptText.setText("Prompt Text");
		
		textPromptText = new Text(this, SWT.BORDER);
		textPromptText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(this, SWT.NONE);
		
		Label lblText = new Label(this, SWT.NONE);
		lblText.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblText.setText("Text");
		
		textValue = new Text(this, SWT.BORDER);
		textValue.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(this, SWT.NONE);
		
		lblNewLabel = new Label(this, SWT.SEPARATOR | SWT.HORIZONTAL);
		lblNewLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
		lblNewLabel.setText("New Label");
		new Label(this, SWT.NONE);
		
		lblBinding = new Label(this, SWT.NONE);
		lblBinding.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
		lblBinding.setText("Binding");
		new Label(this, SWT.NONE);
		
		lblBinding_1 = new Label(this, SWT.NONE);
		lblBinding_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblBinding_1.setText("Binding");
		
		comboBinding = new Combo(this, SWT.NONE);
		comboBinding.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		comboBinding.setItems(Arrays.stream(EBindingType.values()).map(e->e.getLiteral()).toArray(String[]::new));
		comboBinding.select(5);
		new Label(this, SWT.NONE);
		
		lblModel = new Label(this, SWT.NONE);
		lblModel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblModel.setText("Model");
		
		textModel = new Text(this, SWT.BORDER);
		textModel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		buttonPojo = new Button(this, SWT.NONE);
		buttonPojo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Shell parent= JavaPlugin.getActiveWorkbenchShell();
				OpenTypeSelectionDialog dialog= new OpenTypeSelectionDialog(parent, false,
					PlatformUI.getWorkbench().getProgressService(),
					SearchEngine.createWorkspaceScope(), IJavaSearchConstants.TYPE);

				dialog.setTitle(ActionMessages.OpenTypeInHierarchyAction_dialogTitle);
				dialog.setMessage(ActionMessages.OpenTypeInHierarchyAction_dialogMessage);
				int result= dialog.open();
				if (result != IDialogConstants.OK_ID)
					return;

				Object[] types= dialog.getResult();
				if (types != null && types.length > 0) {
					IType type= (IType)types[0];
					textModel.setText(type.getElementName());
					try {
						comboProperty.setItems(Arrays.stream(type.getFields()).map(e1->e1.getElementName()).toArray(String[]::new));
						comboProperty.select(0);
					} catch (JavaModelException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		buttonPojo.setText("...");
		lblPropertyName = new Label(this, SWT.NONE);
		lblPropertyName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblPropertyName.setText("Property Name");
		
		comboProperty = new Combo(this, SWT.NONE);
		comboProperty.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);
		
		Button btnCreate = new Button(this, SWT.NONE);
		btnCreate.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IEditorPart activeEditor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
				if (activeEditor instanceof MmEditor) {
					MmEditor editor = (MmEditor) activeEditor;
					ISelection selection = editor.getSelection();					
					if (selection instanceof IStructuredSelection) {
						IStructuredSelection ss = (IStructuredSelection) selection;
						if (ss.getFirstElement() instanceof ENode) {
							ENode eNode = (ENode) ss.getFirstElement();
							ResourceSet resourceSet = (ResourceSet) EcoreUtil.getRoot(eNode, true);
							EmfModel emfModel = (EmfModel) resourceSet.getResources().get(0).getContents().get(0);
							EText newText = EcoreUtil.copy(eText);

							EBinding binding =MmFactory.eINSTANCE.createEBinding();
							binding.setBindingType(EBindingType.get(comboBinding.getText()));
							binding.setBinding(EControlBinding.TEXT_PROPERTY);
							binding.setName(comboProperty.getText());
							binding.setNode(newText);
							
							emfModel.getBindingModel().getBindings().add(binding);
							eNode.getChildren().add(newText);				
							dispose();
						}
					}
				}
			}
		});
		btnCreate.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnCreate.setText("Create");
		new Label(this, SWT.NONE);
		m_bindingContext = initDataBindings();

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeTextTextIdObserveWidget = WidgetProperties.text(SWT.Modify).observe(textId);
		IObservableValue idETextObserveValue = PojoProperties.value("id").observe(eText);
		bindingContext.bindValue(observeTextTextIdObserveWidget, idETextObserveValue, null, null);
		//
		IObservableValue observeTextTextPromptTextObserveWidget = WidgetProperties.text(SWT.Modify).observe(textPromptText);
		IObservableValue promtTextETextObserveValue = PojoProperties.value("promtText").observe(eText);
		bindingContext.bindValue(observeTextTextPromptTextObserveWidget, promtTextETextObserveValue, null, null);
		//
		IObservableValue observeTextTextValueObserveWidget = WidgetProperties.text(SWT.Modify).observe(textValue);
		IObservableValue textETextObserveValue = PojoProperties.value("text").observe(eText);
		bindingContext.bindValue(observeTextTextValueObserveWidget, textETextObserveValue, null, null);
		//
		return bindingContext;
	}
}
