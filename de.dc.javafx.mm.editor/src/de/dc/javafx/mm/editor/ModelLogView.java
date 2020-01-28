package de.dc.javafx.mm.editor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.part.ViewPart;

import de.dc.javafx.mm.editor.filter.ModelLogEntryFilter;
import de.dc.javafx.mm.editor.model.ModelLogEntry;
import de.dc.javafx.mm.presentation.MmEditor;

public class ModelLogView extends ViewPart {

	public static final String ID = "de.dc.javafx.mm.editor.ModelLogView";

	private List<ModelLogEntry> entries = new ArrayList<>();

	private Text text;
	private Table table;

	private TableViewer tableViewer;

	private ModelLogEntryFilter filter = new ModelLogEntryFilter();
	
	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new GridLayout(3, false));

		text = new Text(parent, SWT.BORDER | SWT.SEARCH);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		text.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent ke) {
				filter.setSearchText(text.getText());
				tableViewer.refresh();
			}
		});
		
		Button btnCheckActiveEditor = new Button(parent, SWT.NONE);
		btnCheckActiveEditor.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// Retrieve the corresponding Services
				IHandlerService handlerService = (IHandlerService) getSite().getService(IHandlerService.class);
				ICommandService commandService = (ICommandService) getSite().getService(ICommandService.class);
				
				// Retrieve the command
				Command generateCmd = commandService.getCommand("de.dc.javafx.mm.editor.ValidateEmfModel");

				// Create an ExecutionEvent
				ExecutionEvent executionEvent = handlerService.createExecutionEvent(generateCmd, new Event());

				// Launch the command
				try {
					generateCmd.executeWithChecks(executionEvent);
				} catch (ExecutionException | NotDefinedException | NotEnabledException | NotHandledException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnCheckActiveEditor.setText("Check Active Editor");

		Button btnClear = new Button(parent, SWT.NONE);
		btnClear.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				entries.clear();
				tableViewer.refresh();
			}
		});
		btnClear.setText("Clear");

		tableViewer = new TableViewer(parent, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1));
		tableViewer.setContentProvider(ArrayContentProvider.getInstance());

		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnName = tableViewerColumn.getColumn();
		tblclmnName.setWidth(145);
		tblclmnName.setText("Timestamp");

		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnMessage = tableViewerColumn_1.getColumn();
		tblclmnMessage.setWidth(290);
		tblclmnMessage.setText("Message");

		TableViewerColumn tableViewerColumn_2 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnEtype = tableViewerColumn_2.getColumn();
		tblclmnEtype.setWidth(100);
		tblclmnEtype.setText("EType");

//		tableViewer.setLabelProvider(new ModelLogLabelProvider());
		tableViewer.setInput(entries);

		tableViewer.addSelectionChangedListener(e -> {
			IEditorPart activeEditor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
					.getActiveEditor();
			if (activeEditor instanceof MmEditor) {
				MmEditor editor = (MmEditor) activeEditor;
				ISelection selection = e.getSelection();
				if (selection instanceof IStructuredSelection) {
					IStructuredSelection ss = (IStructuredSelection) selection;
					Object firstElement = ss.getFirstElement();
					if (firstElement instanceof ModelLogEntry) {
						ModelLogEntry entry = (ModelLogEntry) firstElement;
						if (entry.getNode()!=null) {
							StructuredSelection sel = new StructuredSelection(entry.getNode());
							editor.setFocus();
							editor.getViewer().setSelection(sel, true);
							editor.getSite().getSelectionProvider().setSelection(sel);
						}
					}
				}
			}
		});

		tableViewer.addFilter(filter);
	}

	@Override
	public void setFocus() {
		tableViewer.getTable().setFocus();
	}

	public void add(EObject node, String message) {
		ModelLogEntry entry = new ModelLogEntry();
		entry.setMessage(message);
		entry.setNode(node);
		entry.setTimestamp(LocalDateTime.now());
		entries.add(entry);
		tableViewer.refresh();
	}

	public void clearEntries() {
		entries.clear();
		tableViewer.refresh();
	}
}
