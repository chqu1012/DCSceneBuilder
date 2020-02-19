package de.dc.javafx.mm.editor.dialog;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.apt.ui.internal.util.ExceptionHandler;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.internal.core.PackageFragment;
import org.eclipse.jdt.internal.ui.preferences.PreferencesMessages;
import org.eclipse.jdt.internal.ui.util.BusyIndicatorRunnableContext;
import org.eclipse.jdt.internal.ui.wizards.NewClassCreationWizard;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jdt.ui.wizards.NewClassWizardPage;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SelectionDialog;

import com.oracle.javafx.scenebuilder.kit.editor.EditorController;
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMDocument;
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMObject;

import de.dc.javafx.mm.editor.model.FxmlModel;
import de.dc.javafx.mm.editor.provider.FXOMObjectLabelProvider;
import de.dc.javafx.mm.editor.template.BaseBindingByFxmlTemplate;
import de.dc.javafx.mm.editor.template.BaseBindingControllerByFxmlTemplate;
import de.dc.javafx.mm.editor.template.BaseSelectionBindingByFxmlTemplate;
import de.dc.javafx.mm.editor.template.BindingByFxmlTemplate;
import de.dc.javafx.mm.editor.template.ControllerByFxmlTemplate;
import de.dc.javafx.mm.editor.template.ControllerImplByFxmlTemplate;
import javafx.embed.swing.JFXPanel;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;

public class GenerateCodeByFxmlDialog extends TitleAreaDialog {
	private Text textBasePackage;
	private Label labelModelPackage;
	private Label labelControllerPackage;
	private IPackageFragment fragment = null;
	private FXOMDocument fxomDocument;
	private IFolder srcFolder;
	private IFile model;
	private IJavaProject jp;
	private Table table;

	private List<FXOMObject> viewerElements = new ArrayList<>();
	private TableViewer tableViewer;
	private IFolder srcGen;
	private Button btnUseSrcmainjavaStructure;
	private Button btnUseSpringAnnotation;
	
	public GenerateCodeByFxmlDialog() {
		super(new Shell());
		setShellStyle(SWT.DIALOG_TRIM | SWT.RESIZE);
		setBlockOnOpen(false);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		setTitle("Generate Code from FXML");
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayout(new GridLayout(3, false));
		container.setLayoutData(new GridData(GridData.FILL_BOTH));

		Label lblBasePackage = new Label(container, SWT.NONE);
		lblBasePackage.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblBasePackage.setText("Base Package");

		textBasePackage = new Text(container, SWT.BORDER);
		textBasePackage.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				labelModelPackage.setText(textBasePackage.getText() + ".model");
				labelControllerPackage.setText(textBasePackage.getText() + ".controller");
			}
		});
		textBasePackage.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Button buttonOpenPackageDialog = new Button(container, SWT.NONE);
		buttonOpenPackageDialog.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					SelectionDialog dialog = JavaUI.createPackageDialog(new Shell(), jp.getPackageFragmentRoot(srcFolder));
					int code = dialog.open();
					if (code == 0) {
						for (Object object : dialog.getResult()) {
							if (object instanceof PackageFragment) {
								fragment = (PackageFragment) object;
								String basePackage = fragment.getElementName();
								textBasePackage.setText(basePackage);
								labelModelPackage.setText(basePackage + ".model");
								labelControllerPackage.setText(basePackage + ".controller");
							}
						}
	
					}
				} catch (JavaModelException e1) {
					e1.printStackTrace();
				}
			}
		});
		buttonOpenPackageDialog.setText("...");

		Label lblModelPackage = new Label(container, SWT.NONE);
		lblModelPackage.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblModelPackage.setText("Model Package:");

		labelModelPackage = new Label(container, SWT.NONE);
		labelModelPackage.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		new Label(container, SWT.NONE);

		Label lblControllerPackage = new Label(container, SWT.NONE);
		lblControllerPackage.setText("Controller Package:");

		labelControllerPackage = new Label(container, SWT.NONE);
		labelControllerPackage.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		btnUseSrcmainjavaStructure = new Button(container, SWT.CHECK);
		btnUseSrcmainjavaStructure.setSelection(true);
		btnUseSrcmainjavaStructure.setText("use src/main/java structure");
		new Label(container, SWT.NONE);
		btnUseSrcmainjavaStructure = new Button(container, SWT.CHECK);
		btnUseSrcmainjavaStructure.setSelection(true);
		btnUseSrcmainjavaStructure.setText("use src/main/java structure");
		new Label(container, SWT.NONE);

		btnUseSpringAnnotation = new Button(container, SWT.CHECK);
		btnUseSpringAnnotation.setSelection(true);
		btnUseSpringAnnotation.setText("use Spring Annotation");
		new Label(container, SWT.NONE);
		
		initModel();
		new Label(container, SWT.NONE);
		
		tableViewer = new TableViewer(container, SWT.BORDER | SWT.FULL_SELECTION);
		tableViewer.addDoubleClickListener(event -> chooseModel());
		table = tableViewer.getTable();
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		GridData gd_table = new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1);
		gd_table.minimumHeight = 200;
		table.setLayoutData(gd_table);
		
		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnViewer = tableViewerColumn.getColumn();
		tblclmnViewer.setWidth(157);
		tblclmnViewer.setText("Viewer");
		
		TableViewerColumn tableViewerColumn_2 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnId = tableViewerColumn_2.getColumn();
		tblclmnId.setWidth(157);
		tblclmnId.setText("Id");
		
		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnModel = tableViewerColumn_1.getColumn();
		tblclmnModel.setWidth(225);
		tblclmnModel.setText("Model");
		
		Menu menu = new Menu(table);
		table.setMenu(menu);
		
		MenuItem mntmSetModel = new MenuItem(menu, SWT.NONE);
		mntmSetModel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				chooseModel();
			}
		});
		mntmSetModel.setText("Set Model");
		
		MenuItem mntmCreateNewModel = new MenuItem(menu, SWT.NONE);
		mntmCreateNewModel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				NewClassWizardPage fPage = new NewClassWizardPage();
				NewClassCreationWizard wizard = new NewClassCreationWizard(fPage, false);
				 WizardDialog wd = new  WizardDialog(Display.getCurrent()
					       .getActiveShell(), wizard);
				 int code = wd.open();
				 if (code==0) {
					try {
						IJavaElement createdElement = wizard.getCreatedElement();
						IPackageFragment f = jp.findPackageFragment(createdElement.getResource().getParent().getFullPath());
						String className = createdElement.getElementName();
						String packagePath = f.getElementName();
						ISelection selection = tableViewer.getSelection();
						if (selection instanceof IStructuredSelection) {
							IStructuredSelection ss = (IStructuredSelection) selection;
							if (ss.getFirstElement() instanceof FXOMObject) {
								FXOMObject obj = (FXOMObject) ss.getFirstElement();
								obj.setFxValue(packagePath+"."+className);
								tableViewer.refresh();
							}
						}
					} catch (JavaModelException e1) {
						e1.printStackTrace();
					}
					
				}
			}
		});
		mntmCreateNewModel.setText("Create new Model");
		
		tableViewer.setContentProvider(ArrayContentProvider.getInstance());
		tableViewer.setLabelProvider(new FXOMObjectLabelProvider());
		tableViewer.setInput(viewerElements);
		
		return area;
	}
	
	private void chooseModel() {
		IRunnableContext context= new BusyIndicatorRunnableContext();
		IJavaSearchScope scope= SearchEngine.createWorkspaceScope();
		int style= IJavaElementSearchConstants.CONSIDER_ALL_TYPES;
		try {
			SelectionDialog dialog= JavaUI.createTypeDialog(getShell(), context, scope, style, false);
			dialog.setTitle("Choose a model class");
			dialog.setMessage("Set Model for the viewer");
			if (dialog.open() == Window.OK) {
				IType res= (IType) dialog.getResult()[0];
				ISelection selection = tableViewer.getSelection();
				if (selection instanceof IStructuredSelection) {
					IStructuredSelection ss = (IStructuredSelection) selection;
					if (ss.getFirstElement() instanceof FXOMObject) {
						FXOMObject obj = (FXOMObject) ss.getFirstElement();
						obj.setFxValue(res.getFullyQualifiedName('.'));
						tableViewer.refresh();
					}
					
				}
			}
		} catch (JavaModelException e1) {
			ExceptionHandler.handle(e1, getShell(), PreferencesMessages.NullAnnotationsConfigurationDialog_error_title, PreferencesMessages.NullAnnotationsConfigurationDialog_error_message);
		}
	}
	private void initModel(){
		if (model != null) {
			return;
		}
		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		ISelection selection = selectionService.getSelection();
		if (selection instanceof TreeSelection) {
			TreeSelection ss = (TreeSelection) selection;
			Object firstElement = ss.getFirstElement();
			if (firstElement instanceof IFile) {
				model = (IFile) firstElement;
				IFolder parent = (IFolder) model.getParent();
				
				String fxmlText = fileToString(model.getRawLocation().toPortableString());
				new JFXPanel();
				EditorController editorController = new EditorController();
				URL fxmlLocation;

				IProject project = parent.getProject();
				jp = JavaCore.create(project);

				srcFolder = project.getFolder("src");
				srcGen = project.getFolder("src-gen");
				if (!srcGen.exists()) {
					try {
						srcGen.create(true, true, new NullProgressMonitor());
						createSrcGenFolder();
					} catch (CoreException e) {
						e.printStackTrace();
					}
				}else {
					try {
						createSrcGenFolder();
					} catch (CoreException e) {
						e.printStackTrace();
					}
				}

				IFolder mainFolder = srcFolder.getFolder("main");
				if (mainFolder.exists()) {
					srcFolder = mainFolder.getFolder("java");
				}
				
				try {
					fxmlLocation = model.getLocation().toFile().toURI().toURL();
					editorController.setFxmlTextAndLocation(fxmlText, fxmlLocation);

					fxomDocument = editorController.getFxomDocument();
					for (Entry<String, FXOMObject> entry : fxomDocument.collectFxIds().entrySet()) {
						Object control = entry.getValue().getSceneGraphObject();
						boolean isTableView = control instanceof TableView;
						boolean isCombo = control instanceof ListView;
						boolean isListView = control instanceof ComboBox;
						if (isTableView || isListView || isCombo) {
							viewerElements.add(entry.getValue());
						}
					}
				} catch (MalformedURLException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}

	private void createSrcGenFolder() throws CoreException {
		if (btnUseSrcmainjavaStructure.getSelection()) {
			IFolder mainFolder = srcGen.getFolder("main");
			if (!mainFolder.exists()) {
				mainFolder.create(true, true, new NullProgressMonitor());
				srcGen = mainFolder.getFolder("java");
				if (!srcGen.exists()) {
					srcGen.create(true, true, new NullProgressMonitor());
					addIFolderToClasspath(srcGen);
				}
			}else {
				srcGen = mainFolder.getFolder("java");
			}
		}
	}

	@Override
	protected void buttonPressed(int buttonId) {
		if (buttonId == OK) {
			initModel();
			initFragment();
			String fileName = model.getName().replace(".fxml", "");
			String basePackage = fragment.getElementName();
			FxmlModel fxmlModel = new FxmlModel(fileName, basePackage, fxomDocument, btnUseSpringAnnotation.getSelection());

			String controllerContent = new ControllerByFxmlTemplate().gen(fxmlModel);
			String controllerName = "Base" + fileName + "Controller.java";
			String controllerPackage = basePackage + ".controller";

			String controllerImplContent = new ControllerImplByFxmlTemplate().gen(fxmlModel);
			String controllerImplName = fileName + "Controller.java";

			String baseBindingControllerContent = new BaseBindingControllerByFxmlTemplate().gen(fxmlModel);
			String baseBindingControllerName = "BaseBinding" + fileName + "Controller.java";

			String baseTextBindingContent = new BaseBindingByFxmlTemplate().gen(fxmlModel);
			String baseTextBindingName = "BaseText" + fileName + "Binding.java";
			String baseTextBindingPackage = basePackage + ".model";

			String baseSelectionBindingContent = new BaseSelectionBindingByFxmlTemplate().gen(fxmlModel);
			String baseSelectionBindingName = "BaseSelection" + fileName + "Binding.java";
			String baseSelectionBindingPackage = basePackage + ".model";

			String textBindingContent = new BindingByFxmlTemplate().gen(fxmlModel);
			String textBindingName = fileName + "Binding.java";
			String textBindingPackage = basePackage + ".model";

			generateFile(srcGen, controllerContent, controllerName, controllerPackage);
			generateFile(srcFolder, controllerImplContent, controllerImplName, controllerPackage);
			generateFile(srcGen, baseBindingControllerContent, baseBindingControllerName, controllerPackage);
			generateFile(srcGen, baseSelectionBindingContent, baseSelectionBindingName, baseSelectionBindingPackage);
			generateFile(srcGen, baseTextBindingContent, baseTextBindingName, baseTextBindingPackage);
			generateFile(srcFolder, textBindingContent, textBindingName, textBindingPackage);
		}
		super.buttonPressed(buttonId);
	}

	private void addIFolderToClasspath(IFolder sourceFolder) {
		try {
			IClasspathEntry[] oldEntries = jp.getRawClasspath();
			IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length + 1];
			System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
			newEntries[oldEntries.length] = JavaCore.newSourceEntry(sourceFolder.getFullPath());
			jp.setRawClasspath(newEntries, null);
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
	}
	
	private void initFragment() {
		if (fragment==null) {
			try {
				IFolder folder = getFolder(srcFolder, textBasePackage.getText().split("\\."));
				fragment = jp.findPackageFragment(folder.getFullPath());
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}

	private void generateFile(IFolder generatedFolder, String controllerContent, String baseController, String controllerPackage) {
		try {
			IFolder genFolder = getFolder(generatedFolder, controllerPackage.split("\\."));
			if (!genFolder.exists()) {
				genFolder.create(true, true, null);
			}
			IFile ifile = genFolder.getFile(baseController);
			if (ifile.exists()) {
				ifile.delete(true, null);
			}
			ifile.create(new ByteArrayInputStream(controllerContent.getBytes()), IResource.NONE, null);
			genFolder.refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e1) {
			e1.printStackTrace();
		}
	}

	public String fileToString(String path) {
		FileInputStream fileinput = null;
		try {
			fileinput = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int filetmp = 0;
		try {
			filetmp = fileinput.available();
		} catch (IOException e) {
			e.printStackTrace();
		}
		byte bitstream[] = new byte[filetmp];
		try {
			fileinput.read(bitstream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new String(bitstream);
	}

	public IFolder getFolder(IFolder folder, String[] basePackage) throws CoreException {
		IFolder currentFolder = null;
		for (String pack : basePackage) {
			if (currentFolder != null) {
				currentFolder = currentFolder.getFolder(pack);
			} else {
				currentFolder = folder.getFolder(pack);
			}
			if (!currentFolder.exists()) {
				currentFolder.create(true, true, null);
			}
		}
		return currentFolder;
	}
}
