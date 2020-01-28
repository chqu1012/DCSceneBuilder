package de.dc.javafx.mm.editor.control;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.beans.PojoProperties;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.internal.ui.JavaPlugin;
import org.eclipse.jdt.internal.ui.actions.ActionMessages;
import org.eclipse.jdt.internal.ui.dialogs.OpenTypeSelectionDialog;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import de.dc.javafx.mm.EBean;
import de.dc.javafx.mm.EField;
import de.dc.javafx.mm.ENode;
import de.dc.javafx.mm.ETableColumn;
import de.dc.javafx.mm.ETableView;
import de.dc.javafx.mm.EmfModel;
import de.dc.javafx.mm.MmFactory;
import de.dc.javafx.mm.model.ExtEmfModel;
import de.dc.javafx.mm.presentation.MmEditor;

public class SwtTableView extends Composite{

	private ExtEmfModel extEmfModel;
	private DataBindingContext m_bindingContext;

	private Text txtTableViewId;
	private Text textColumnId;
	private Text textTableModelName;
	private Text textTableModelInstanceName;
	private Text textModelFieldName;
	private Text textColumnName;
	private Text textColumnWidth;

	private ETableView eTableView;
	private EBean eBean;
	private ETableColumn eTableColumn;
	private EField eField;
	private Button buttonTableModelGenerate;
	private List listModelField;
	private List listTableColumn;
	private ComboViewer comboAssociatedFieldViewer;
	private ListViewer listModelFieldViewer;

	private ListViewer listTableColumnViewer;
	private Combo textModelFieldDatatype;
	private EmfModel model;
	
	public SwtTableView(Composite parent, int style) {
		super(parent, style);
		initModel();
		initExtEmfModel();
		initControls(this);
		
		setLayout(new GridLayout(2, false));
		new Label(this, SWT.NONE);
	}

	private void initExtEmfModel() {
		IEditorPart activeEditor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if (activeEditor instanceof MmEditor) {
			MmEditor editor = (MmEditor) activeEditor;
			
			Object editorInput = editor.getViewer().getInput();
			if (editorInput instanceof ResourceSet) {
				ResourceSet input = (ResourceSet) editorInput;
				Resource resource = input.getResources().get(0);
				if (resource instanceof XMIResource) {
					XMIResource xmiResource = (XMIResource) resource;
					EObject content = xmiResource.getContents().get(0);
					if (content instanceof EmfModel) {
						
						model = (EmfModel) content;
						extEmfModel = new ExtEmfModel(model);
					}
				}
			}
		}
	}

	private void initModel() {
		eTableView = MmFactory.eINSTANCE.createETableView();
		eTableView.setId("tableViewName");
		eBean = MmFactory.eINSTANCE.createEBean();
		eTableView.setModel(eBean);
		eTableColumn = MmFactory.eINSTANCE.createETableColumn();
		eField = MmFactory.eINSTANCE.createEField();		
	}

	private void initControls(Composite parent) {
		Label lblName = new Label(parent, SWT.NONE);
		lblName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblName.setText("TableView ID");

		txtTableViewId = new Text(parent, SWT.BORDER);
		txtTableViewId.setText("tableView");
		txtTableViewId.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		TabFolder tabFolder = new TabFolder(parent, SWT.NONE);
		tabFolder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));

		TabItem tbtmNewItem = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem.setText("Table Model");

		Group group_1 = new Group(tabFolder, SWT.NONE);
		tbtmNewItem.setControl(group_1);
		group_1.setLayout(new GridLayout(3, false));

		Label lblName_1 = new Label(group_1, SWT.NONE);
		lblName_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblName_1.setText("Name");

		textTableModelName = new Text(group_1, SWT.BORDER);
		textTableModelName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(group_1, SWT.NONE);

		Label lblInstancename = new Label(group_1, SWT.NONE);
		lblInstancename.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblInstancename.setText("InstanceName");

		textTableModelInstanceName = new Text(group_1, SWT.BORDER);
		textTableModelInstanceName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button buttonOpenType = new Button(group_1, SWT.NONE);
		buttonOpenType.addSelectionListener(new SelectionAdapter() {
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
					eBean.setName(type.getElementName());
					eBean.setInstanceName(type.getFullyQualifiedName());
					
					textTableModelName.setText(type.getElementName());
					textTableModelInstanceName.setText(type.getFullyQualifiedName());
					
					try {
						for (IField field : type.getFields()) {
							String fieldName = field.getElementName();
							String fieldType = Signature.getSignatureSimpleName(field.getTypeSignature());
							
							EField sfield = EcoreUtil.copy(eField);
							sfield.setName(fieldName);
							sfield.setDatatype(fieldType);
							eBean.getFields().add(sfield);
							
							ETableColumn column = EcoreUtil.copy(eTableColumn);
							column.setAssociatedField(sfield);
							column.setId("column"+eBean.getName()+StringUtils.capitalize(sfield.getName()));
							column.setName(StringUtils.capitalize(sfield.getName()));
							eTableView.getColumns().add(column);
							
							model.getBeans().add(eBean);
							
							listTableColumnViewer.refresh();
							listModelFieldViewer.refresh();
							comboAssociatedFieldViewer.refresh();
						}
					} catch (JavaModelException e1) {
						e1.printStackTrace();
					}
					
				}
			}
		});
		buttonOpenType.setText("...");
		new Label(group_1, SWT.NONE);

		buttonTableModelGenerate = new Button(group_1, SWT.CHECK);
		buttonTableModelGenerate.setSelection(true);
		buttonTableModelGenerate.setText("Generate Class");
		new Label(group_1, SWT.NONE);

		Label label = new Label(group_1, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		new Label(group_1, SWT.NONE);

		Label lblModelAttributes = new Label(group_1, SWT.NONE);
		lblModelAttributes.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		lblModelAttributes.setText("Model Attributes");
		new Label(group_1, SWT.NONE);

		Label lblDatatype = new Label(group_1, SWT.NONE);
		lblDatatype.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblDatatype.setText("Datatype");
		
		textModelFieldDatatype = new Combo(group_1, SWT.NONE);
		textModelFieldDatatype.setItems(new String[] {"String", "Integer", "Long", "Boolean", "java.time.LocalDate", "java.time.LocalDateTime", "Float"});
		textModelFieldDatatype.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(group_1, SWT.NONE);

		Label lblName_2 = new Label(group_1, SWT.NONE);
		lblName_2.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblName_2.setText("Name");

		textModelFieldName = new Text(group_1, SWT.BORDER);
		textModelFieldName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(group_1, SWT.NONE);
		new Label(group_1, SWT.NONE);
		
		Button btnCreateAssoicatedColumn = new Button(group_1, SWT.CHECK);
		btnCreateAssoicatedColumn.setSelection(true);
		btnCreateAssoicatedColumn.setText("create assoicated column");
		new Label(group_1, SWT.NONE);
		new Label(group_1, SWT.NONE);

		listModelFieldViewer = new ListViewer(group_1, SWT.BORDER | SWT.V_SCROLL);
		listModelField = listModelFieldViewer.getList();
		listModelField.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		Composite composite = new Composite(group_1, SWT.NONE);
		composite.setLayout(new GridLayout(1, false));
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
				
		Button buttonModelAdd = new Button(composite, SWT.NONE);
		buttonModelAdd.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		buttonModelAdd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				EField field = EcoreUtil.copy(eField);
				eBean.getFields().add(field);
				if (btnCreateAssoicatedColumn.getSelection()) {
					ETableColumn column = EcoreUtil.copy(eTableColumn);
					column.setAssociatedField(field);
					column.setId("column"+eBean.getName()+StringUtils.capitalize(field.getName()));
					column.setName(StringUtils.capitalize(field.getName()));
					eTableView.getColumns().add(column);
					listTableColumnViewer.refresh();
				}
				listModelFieldViewer.refresh();
				comboAssociatedFieldViewer.refresh();
			}
		});
		buttonModelAdd.setText("Add");
		
		Button btnRemove = new Button(composite, SWT.NONE);
		btnRemove.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnRemove.setText("Remove");
		
		listModelFieldViewer.setContentProvider(new ArrayContentProvider());

		TabItem tbtmColumn = new TabItem(tabFolder, SWT.NONE);
		tbtmColumn.setText("Table Column");

		Group group = new Group(tabFolder, SWT.NONE);
		tbtmColumn.setControl(group);
		group.setLayout(new GridLayout(2, false));

		Label lblId = new Label(group, SWT.NONE);
		lblId.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblId.setText("ID");

		textColumnId = new Text(group, SWT.BORDER);
		textColumnId.setText("tableColumn");
		textColumnId.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblName_3 = new Label(group, SWT.NONE);
		lblName_3.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblName_3.setText("Name");

		textColumnName = new Text(group, SWT.BORDER);
		textColumnName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblWidth = new Label(group, SWT.NONE);
		lblWidth.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblWidth.setText("Width");

		textColumnWidth = new Text(group, SWT.BORDER);
		textColumnWidth.setText("150.0");
		textColumnWidth.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblUsedField = new Label(group, SWT.NONE);
		lblUsedField.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblUsedField.setText("Used Field");

		comboAssociatedFieldViewer = new ComboViewer(group, SWT.READ_ONLY);
		comboAssociatedFieldViewer.setUseHashlookup(true);
		Combo comboAssociatedField = comboAssociatedFieldViewer.getCombo();
		comboAssociatedField.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		comboAssociatedFieldViewer.setContentProvider(new ArrayContentProvider());
		new Label(group, SWT.NONE);

		Button buttonColumnAdd = new Button(group, SWT.NONE);
		buttonColumnAdd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ETableColumn copiedColumn = EcoreUtil.copy(eTableColumn);
				IStructuredSelection selection = (IStructuredSelection) comboAssociatedFieldViewer.getSelection();
				copiedColumn.setAssociatedField((EField) selection.getFirstElement());
				eTableView.getColumns().add(copiedColumn);
				listTableColumnViewer.refresh();
			}
		});
		buttonColumnAdd.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		buttonColumnAdd.setText("Add");
		new Label(group, SWT.NONE);

		listTableColumnViewer = new ListViewer(group, SWT.BORDER | SWT.V_SCROLL);
		listTableColumn = listTableColumnViewer.getList();
		listTableColumn.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		listTableColumnViewer.setContentProvider(new ArrayContentProvider());	
		
		m_bindingContext = initDataBindings();
		
		Button buttonCreate = new Button(parent, SWT.PUSH);
		buttonCreate.setText("Create TableView");
		buttonCreate.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String tableViewId = eTableView.getId();
				if (tableViewId==null || tableViewId.isEmpty()) {
					MessageDialog.openError(new Shell(), "Error invalid values!", "Required ETableView Id must be filled!");
					return;
				}
				if (extEmfModel.existId(tableViewId)) {
					MessageDialog.openError(new Shell(), "Error invalid values!", "Required ETableView Id already exist in EmfModel!");
					return;
				}
				
				
				IEditorPart activeEditor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
				if (activeEditor instanceof MmEditor) {
					MmEditor editor = (MmEditor) activeEditor;
					ISelection selection = editor.getSelection();					
					if (selection instanceof IStructuredSelection) {
						IStructuredSelection ss = (IStructuredSelection) selection;
						if (ss.getFirstElement() instanceof ENode) {
							ENode eNode = (ENode) ss.getFirstElement();
							eNode.getChildren().add(eTableView);				
							dispose();
						}
					}
				}
			}
		});
	}
	
	public ETableView getResult() {
		return eTableView;
	}

	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeTextTextTableModelNameObserveWidget = WidgetProperties.text(SWT.Modify)
				.observe(textTableModelName);
		IObservableValue nameETableViewModelObserveValue = PojoProperties.value("name").observe(eBean);
		bindingContext.bindValue(observeTextTextTableModelNameObserveWidget, nameETableViewModelObserveValue, null,
				null);
		//
		IObservableValue observeTextTextTableModelInstanceNameObserveWidget = WidgetProperties.text(SWT.Modify)
				.observe(textTableModelInstanceName);
		IObservableValue instanceNameETableViewModelObserveValue = PojoProperties.value("instanceName")
				.observe(eBean);
		bindingContext.bindValue(observeTextTextTableModelInstanceNameObserveWidget,
				instanceNameETableViewModelObserveValue, null, null);
		//
		IObservableValue observeSelectionButtonTableModelGenerateObserveWidget = WidgetProperties.selection()
				.observe(buttonTableModelGenerate);
		IObservableValue generateClassETableViewModelObserveValue = PojoProperties.value("generateClass")
				.observe(eBean);
		bindingContext.bindValue(observeSelectionButtonTableModelGenerateObserveWidget,
				generateClassETableViewModelObserveValue, null, null);
		//
		IObservableValue observeTextTextModelFieldDatatypeObserveWidget = WidgetProperties.text().observe(textModelFieldDatatype);
		IObservableValue datatypeETableViewModelFieldObserveValue = PojoProperties.value("datatype").observe(eField);
		bindingContext.bindValue(observeTextTextModelFieldDatatypeObserveWidget, datatypeETableViewModelFieldObserveValue, null, null);
		//
		IObservableValue observeTextTextModelFieldNameObserveWidget = WidgetProperties.text(SWT.Modify)
				.observe(textModelFieldName);
		IObservableValue nameETableViewModelFieldObserveValue = PojoProperties.value("name")
				.observe(eField);
		bindingContext.bindValue(observeTextTextModelFieldNameObserveWidget, nameETableViewModelFieldObserveValue, null,
				null);
		//
		IObservableValue observeTextTextColumnIdObserveWidget = WidgetProperties.text(SWT.Modify).observe(textColumnId);
		IObservableValue idETableColumnObserveValue = PojoProperties.value("id").observe(eTableColumn);
		bindingContext.bindValue(observeTextTextColumnIdObserveWidget, idETableColumnObserveValue, null, null);
		//
		IObservableValue observeTextTextColumnNameObserveWidget = WidgetProperties.text(SWT.Modify)
				.observe(textColumnName);
		IObservableValue nameETableColumnObserveValue = PojoProperties.value("name").observe(eTableColumn);
		bindingContext.bindValue(observeTextTextColumnNameObserveWidget, nameETableColumnObserveValue, null, null);
		//
		IObservableValue observeTextTextColumnWidthObserveWidget = WidgetProperties.text(SWT.Modify)
				.observe(textColumnWidth);
		IObservableValue widthETableColumnObserveValue = PojoProperties.value("width").observe(eTableColumn);
		bindingContext.bindValue(observeTextTextColumnWidthObserveWidget, widthETableColumnObserveValue, null, null);
		//
		IObservableValue observeTextTxtTableViewIdObserveWidget = WidgetProperties.text(SWT.Modify)
				.observe(txtTableViewId);
		IObservableValue idETableViewObserveValue = PojoProperties.value("id").observe(eTableView);
		bindingContext.bindValue(observeTextTxtTableViewIdObserveWidget, idETableViewObserveValue, null, null);
		//
		IObservableList itemsListModelFieldObserveWidget = WidgetProperties.items().observe(listModelField);
		IObservableList fieldsETableViewModelObserveList = PojoProperties.list("fields").observe(eBean);
		bindingContext.bindList(itemsListModelFieldObserveWidget, fieldsETableViewModelObserveList, null, null);
		//
		IObservableList itemsListTableColumnObserveWidget = WidgetProperties.items().observe(listTableColumn);
		IObservableList columnsETableViewObserveList = PojoProperties.list("columns").observe(eTableView);
		bindingContext.bindList(itemsListTableColumnObserveWidget, columnsETableViewObserveList, null, null);
		//
		ObservableListContentProvider listContentProvider = new ObservableListContentProvider();
		IObservableMap observeMap = PojoObservables.observeMap(listContentProvider.getKnownElements(),
				EField.class, "name");
		comboAssociatedFieldViewer.setLabelProvider(new ObservableMapLabelProvider(observeMap));
		comboAssociatedFieldViewer.setContentProvider(listContentProvider);
		//
		comboAssociatedFieldViewer.setInput(fieldsETableViewModelObserveList);
		//
		ObservableListContentProvider listContentProvider_1 = new ObservableListContentProvider();
		IObservableMap observeMap_1 = PojoObservables.observeMap(listContentProvider_1.getKnownElements(),
				EField.class, "name");
		listModelFieldViewer.setLabelProvider(new ObservableMapLabelProvider(observeMap_1));
		listModelFieldViewer.setContentProvider(listContentProvider_1);
		//
		listModelFieldViewer.setInput(fieldsETableViewModelObserveList);
		//
		ObservableListContentProvider listContentProvider_2 = new ObservableListContentProvider();
		IObservableMap observeMap_2 = PojoObservables.observeMap(listContentProvider_2.getKnownElements(),
				ETableColumn.class, "name");
		listTableColumnViewer.setLabelProvider(new ObservableMapLabelProvider(observeMap_2));
		listTableColumnViewer.setContentProvider(listContentProvider_2);
		//
//		listTableColumnViewer.setLabelProvider(new LabelProvider() {
//			@Override
//			public String getText(Object element) {
//				if (element instanceof ETableColumn) {
//					ETableColumn column = (ETableColumn) element;
//					return column.getName();
//				}
//				return super.getText(element);
//			}
//		});
//		comboAssociatedFieldViewer.setLabelProvider(new LabelProvider() {
//			@Override
//			public String getText(Object element) {
//				if (element instanceof EField) {
//					EField field = (EField) element;
//					return field.getName();
//				}
//				return super.getText(element);
//			}
//		});
//		listModelFieldViewer.setLabelProvider(new LabelProvider() {
//			@Override
//			public String getText(Object element) {
//				if (element instanceof EField) {
//					EField field = (EField) element;
//					return field.getName();
//				}
//				return super.getText(element);
//			}
//		});
		listTableColumnViewer.setInput(columnsETableViewObserveList);
		//
		return bindingContext;
	}
	
}