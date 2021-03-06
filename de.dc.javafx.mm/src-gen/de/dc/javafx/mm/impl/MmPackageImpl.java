/**
 */
package de.dc.javafx.mm.impl;

import de.dc.javafx.mm.EAnchorPane;
import de.dc.javafx.mm.EAreaChart;
import de.dc.javafx.mm.EAxis;
import de.dc.javafx.mm.EBarChart;
import de.dc.javafx.mm.EBaseView;
import de.dc.javafx.mm.EBean;
import de.dc.javafx.mm.EBinding;
import de.dc.javafx.mm.EBindingDirection;
import de.dc.javafx.mm.EBindingModel;
import de.dc.javafx.mm.EBindingType;
import de.dc.javafx.mm.EBorderData;
import de.dc.javafx.mm.EBorderDirection;
import de.dc.javafx.mm.EBorderPane;
import de.dc.javafx.mm.EBubbleChart;
import de.dc.javafx.mm.EButton;
import de.dc.javafx.mm.EButtonBase;
import de.dc.javafx.mm.ECatgeoryAxis;
import de.dc.javafx.mm.EChart;
import de.dc.javafx.mm.ECheckBox;
import de.dc.javafx.mm.EControl;
import de.dc.javafx.mm.EControlBinding;
import de.dc.javafx.mm.EDialogPane;
import de.dc.javafx.mm.EEvents;
import de.dc.javafx.mm.EField;
import de.dc.javafx.mm.EFilteredTableView;
import de.dc.javafx.mm.EFlowPane;
import de.dc.javafx.mm.EGridPane;
import de.dc.javafx.mm.EGroup;
import de.dc.javafx.mm.EHBox;
import de.dc.javafx.mm.EHBoxData;
import de.dc.javafx.mm.EHyperlink;
import de.dc.javafx.mm.EImageView;
import de.dc.javafx.mm.EInsets;
import de.dc.javafx.mm.ELabel;
import de.dc.javafx.mm.ELabeled;
import de.dc.javafx.mm.ELayoutData;
import de.dc.javafx.mm.ELineChart;
import de.dc.javafx.mm.EListView;
import de.dc.javafx.mm.EMenuButton;
import de.dc.javafx.mm.ENode;
import de.dc.javafx.mm.EPane;
import de.dc.javafx.mm.EPieChart;
import de.dc.javafx.mm.ERadioButton;
import de.dc.javafx.mm.EScatterChart;
import de.dc.javafx.mm.EScrollPane;
import de.dc.javafx.mm.ESide;
import de.dc.javafx.mm.ESplitMenuButton;
import de.dc.javafx.mm.ESplitPane;
import de.dc.javafx.mm.EStackPane;
import de.dc.javafx.mm.EStackedAreaChart;
import de.dc.javafx.mm.EStackedBarChart;
import de.dc.javafx.mm.ETab;
import de.dc.javafx.mm.ETabPane;
import de.dc.javafx.mm.ETableColumn;
import de.dc.javafx.mm.ETableView;
import de.dc.javafx.mm.EText;
import de.dc.javafx.mm.ETilePane;
import de.dc.javafx.mm.EToogleButton;
import de.dc.javafx.mm.EVBox;
import de.dc.javafx.mm.EVBoxData;
import de.dc.javafx.mm.EValueAxis;
import de.dc.javafx.mm.EWebView;
import de.dc.javafx.mm.EXYChart;
import de.dc.javafx.mm.EmfModel;
import de.dc.javafx.mm.MmFactory;
import de.dc.javafx.mm.MmPackage;
import de.dc.javafx.mm.Skinnable;
import de.dc.javafx.mm.Styleable;

import javafx.geometry.Pos;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MmPackageImpl extends EPackageImpl implements MmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eBeanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eBindingModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skinnableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eInsetsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eLabeledEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eButtonBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eCheckBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eHyperlinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eMenuButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eSplitMenuButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eToogleButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eBaseViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFilteredTableViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eTableViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eTableColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eListViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eRadioButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAxisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eCatgeoryAxisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eValueAxisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ePieChartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exyChartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ePaneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStackPaneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eDialogPaneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eGridPaneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ehBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFlowPaneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eSplitPaneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eTilePaneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAnchorPaneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eBorderPaneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eChartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eImageViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eScrollPaneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eEventsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eWebViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eTabPaneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eTabEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eLayoutDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eBorderDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evBoxDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ehBoxDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAreaChartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eBarChartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eBubbleChartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eLineChartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eScatterChartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStackedAreaChartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStackedBarChartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eSideEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eBorderDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eControlBindingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eBindingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eBindingDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ePosEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.dc.javafx.mm.MmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MmPackageImpl() {
		super(eNS_URI, MmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MmPackage init() {
		if (isInited)
			return (MmPackage) EPackage.Registry.INSTANCE.getEPackage(MmPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMmPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MmPackageImpl theMmPackage = registeredMmPackage instanceof MmPackageImpl ? (MmPackageImpl) registeredMmPackage
				: new MmPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMmPackage.createPackageContents();

		// Initialize created meta-data
		theMmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMmPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MmPackage.eNS_URI, theMmPackage);
		return theMmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmfModel() {
		return emfModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmfModel_BasePackage() {
		return (EAttribute) emfModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmfModel_Controller() {
		return (EAttribute) emfModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmfModel_Name() {
		return (EAttribute) emfModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmfModel_StyleClass() {
		return (EAttribute) emfModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmfModel_BindingModel() {
		return (EReference) emfModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmfModel_Root() {
		return (EReference) emfModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmfModel_Beans() {
		return (EReference) emfModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEBean() {
		return eBeanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEBean_Name() {
		return (EAttribute) eBeanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEBean_InstanceName() {
		return (EAttribute) eBeanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEBean_GenerateClass() {
		return (EAttribute) eBeanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEBean_Fields() {
		return (EReference) eBeanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEField() {
		return eFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEField_Name() {
		return (EAttribute) eFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEField_Datatype() {
		return (EAttribute) eFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEField_IsMadatory() {
		return (EAttribute) eFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEBindingModel() {
		return eBindingModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEBindingModel_Bindings() {
		return (EReference) eBindingModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEBinding() {
		return eBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEBinding_Name() {
		return (EAttribute) eBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEBinding_Node() {
		return (EReference) eBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEBinding_BindingType() {
		return (EAttribute) eBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEBinding_Binding() {
		return (EAttribute) eBindingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEBinding_Direction() {
		return (EAttribute) eBindingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStyleable() {
		return styleableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSkinnable() {
		return skinnableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEInsets() {
		return eInsetsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEInsets_Top() {
		return (EAttribute) eInsetsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEInsets_Bottom() {
		return (EAttribute) eInsetsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEInsets_Right() {
		return (EAttribute) eInsetsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEInsets_Left() {
		return (EAttribute) eInsetsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEGroup() {
		return eGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEControl() {
		return eControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getELabeled() {
		return eLabeledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getELabeled_Text() {
		return (EAttribute) eLabeledEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEText() {
		return eTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEText_PromtText() {
		return (EAttribute) eTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getELabel() {
		return eLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEButtonBase() {
		return eButtonBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEButton() {
		return eButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getECheckBox() {
		return eCheckBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getECheckBox_Selected() {
		return (EAttribute) eCheckBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEHyperlink() {
		return eHyperlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEHyperlink_Visited() {
		return (EAttribute) eHyperlinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEMenuButton() {
		return eMenuButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getESplitMenuButton() {
		return eSplitMenuButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEToogleButton() {
		return eToogleButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEToogleButton_Selected() {
		return (EAttribute) eToogleButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEBaseView() {
		return eBaseViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEBaseView_Model() {
		return (EReference) eBaseViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEFilteredTableView() {
		return eFilteredTableViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getETableView() {
		return eTableViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETableView_Columns() {
		return (EReference) eTableViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getETableColumn() {
		return eTableColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getETableColumn_Id() {
		return (EAttribute) eTableColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getETableColumn_Name() {
		return (EAttribute) eTableColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getETableColumn_Width() {
		return (EAttribute) eTableColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getETableColumn_CellValueFactory() {
		return (EAttribute) eTableColumnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getETableColumn_CellFactory() {
		return (EAttribute) eTableColumnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETableColumn_AssociatedField() {
		return (EReference) eTableColumnEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getETableColumn_IsEditable() {
		return (EAttribute) eTableColumnEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEListView() {
		return eListViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getERadioButton() {
		return eRadioButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEAxis() {
		return eAxisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getECatgeoryAxis() {
		return eCatgeoryAxisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEValueAxis() {
		return eValueAxisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEPieChart() {
		return ePieChartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEXYChart() {
		return exyChartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEPane() {
		return ePaneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEPane_Pos() {
		return (EAttribute) ePaneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEStackPane() {
		return eStackPaneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEDialogPane() {
		return eDialogPaneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEDialogPane_Header() {
		return (EAttribute) eDialogPaneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEDialogPane_HeaderText() {
		return (EAttribute) eDialogPaneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEDialogPane_ContentText() {
		return (EAttribute) eDialogPaneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEDialogPane_Content() {
		return (EReference) eDialogPaneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEGridPane() {
		return eGridPaneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEHBox() {
		return ehBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEHBox_Spacing() {
		return (EAttribute) ehBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEVBox() {
		return evBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEVBox_Spacing() {
		return (EAttribute) evBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEFlowPane() {
		return eFlowPaneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getESplitPane() {
		return eSplitPaneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getETilePane() {
		return eTilePaneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEAnchorPane() {
		return eAnchorPaneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEBorderPane() {
		return eBorderPaneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEBorderPane_Left() {
		return (EReference) eBorderPaneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEBorderPane_Right() {
		return (EReference) eBorderPaneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEBorderPane_Top() {
		return (EReference) eBorderPaneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEBorderPane_Bottom() {
		return (EReference) eBorderPaneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEBorderPane_Center() {
		return (EReference) eBorderPaneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEChart() {
		return eChartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEChart_Animated() {
		return (EAttribute) eChartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEChart_LegendVisible() {
		return (EAttribute) eChartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEChart_Title() {
		return (EAttribute) eChartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEChart_LegendSide() {
		return (EAttribute) eChartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEImageView() {
		return eImageViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEImageView_ImagePath() {
		return (EAttribute) eImageViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEScrollPane() {
		return eScrollPaneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEScrollPane_IsPannable() {
		return (EAttribute) eScrollPaneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEScrollPane_FitToWidth() {
		return (EAttribute) eScrollPaneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEScrollPane_FitToHeight() {
		return (EAttribute) eScrollPaneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEScrollPane_Content() {
		return (EReference) eScrollPaneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEvents() {
		return eEventsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEEvents_OnAction() {
		return (EAttribute) eEventsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEWebView() {
		return eWebViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEWebView_Url() {
		return (EAttribute) eWebViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEWebView_ContextMenuEnabled() {
		return (EAttribute) eWebViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getENode() {
		return eNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getENode_Id() {
		return (EAttribute) eNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getENode_Opacity() {
		return (EAttribute) eNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getENode_Visible() {
		return (EAttribute) eNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getENode_Disable() {
		return (EAttribute) eNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getENode_Style() {
		return (EAttribute) eNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getENode_StyleClass() {
		return (EAttribute) eNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getENode_Margin() {
		return (EReference) eNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getENode_LayoutX() {
		return (EAttribute) eNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getENode_LayoutY() {
		return (EAttribute) eNodeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getENode_MaxHeight() {
		return (EAttribute) eNodeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getENode_MinHeight() {
		return (EAttribute) eNodeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getENode_PrefHeight() {
		return (EAttribute) eNodeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getENode_MaxWidth() {
		return (EAttribute) eNodeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getENode_MinWidth() {
		return (EAttribute) eNodeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getENode_PrefWidth() {
		return (EAttribute) eNodeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getENode_Padding() {
		return (EReference) eNodeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getENode_Children() {
		return (EReference) eNodeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getENode_LayoutData() {
		return (EReference) eNodeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getETabPane() {
		return eTabPaneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETabPane_Tabs() {
		return (EReference) eTabPaneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getETab() {
		return eTabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getETab_Id() {
		return (EAttribute) eTabEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getETab_Name() {
		return (EAttribute) eTabEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getETab_Content() {
		return (EReference) eTabEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getELayoutData() {
		return eLayoutDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEBorderData() {
		return eBorderDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEBorderData_Direction() {
		return (EAttribute) eBorderDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEVBoxData() {
		return evBoxDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEHBoxData() {
		return ehBoxDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEAreaChart() {
		return eAreaChartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEBarChart() {
		return eBarChartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEBubbleChart() {
		return eBubbleChartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getELineChart() {
		return eLineChartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEScatterChart() {
		return eScatterChartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEStackedAreaChart() {
		return eStackedAreaChartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEStackedBarChart() {
		return eStackedBarChartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getESide() {
		return eSideEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEBorderDirection() {
		return eBorderDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEControlBinding() {
		return eControlBindingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEBindingType() {
		return eBindingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEBindingDirection() {
		return eBindingDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEPos() {
		return ePosEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MmFactory getMmFactory() {
		return (MmFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		emfModelEClass = createEClass(EMF_MODEL);
		createEAttribute(emfModelEClass, EMF_MODEL__BASE_PACKAGE);
		createEAttribute(emfModelEClass, EMF_MODEL__CONTROLLER);
		createEAttribute(emfModelEClass, EMF_MODEL__NAME);
		createEAttribute(emfModelEClass, EMF_MODEL__STYLE_CLASS);
		createEReference(emfModelEClass, EMF_MODEL__BINDING_MODEL);
		createEReference(emfModelEClass, EMF_MODEL__ROOT);
		createEReference(emfModelEClass, EMF_MODEL__BEANS);

		eBeanEClass = createEClass(EBEAN);
		createEAttribute(eBeanEClass, EBEAN__NAME);
		createEAttribute(eBeanEClass, EBEAN__INSTANCE_NAME);
		createEAttribute(eBeanEClass, EBEAN__GENERATE_CLASS);
		createEReference(eBeanEClass, EBEAN__FIELDS);

		eFieldEClass = createEClass(EFIELD);
		createEAttribute(eFieldEClass, EFIELD__NAME);
		createEAttribute(eFieldEClass, EFIELD__DATATYPE);
		createEAttribute(eFieldEClass, EFIELD__IS_MADATORY);

		eBindingModelEClass = createEClass(EBINDING_MODEL);
		createEReference(eBindingModelEClass, EBINDING_MODEL__BINDINGS);

		eBindingEClass = createEClass(EBINDING);
		createEAttribute(eBindingEClass, EBINDING__NAME);
		createEReference(eBindingEClass, EBINDING__NODE);
		createEAttribute(eBindingEClass, EBINDING__BINDING_TYPE);
		createEAttribute(eBindingEClass, EBINDING__BINDING);
		createEAttribute(eBindingEClass, EBINDING__DIRECTION);

		styleableEClass = createEClass(STYLEABLE);

		skinnableEClass = createEClass(SKINNABLE);

		eInsetsEClass = createEClass(EINSETS);
		createEAttribute(eInsetsEClass, EINSETS__TOP);
		createEAttribute(eInsetsEClass, EINSETS__BOTTOM);
		createEAttribute(eInsetsEClass, EINSETS__RIGHT);
		createEAttribute(eInsetsEClass, EINSETS__LEFT);

		eGroupEClass = createEClass(EGROUP);

		eControlEClass = createEClass(ECONTROL);

		eLabeledEClass = createEClass(ELABELED);
		createEAttribute(eLabeledEClass, ELABELED__TEXT);

		eTextEClass = createEClass(ETEXT);
		createEAttribute(eTextEClass, ETEXT__PROMT_TEXT);

		eLabelEClass = createEClass(ELABEL);

		eButtonBaseEClass = createEClass(EBUTTON_BASE);

		eButtonEClass = createEClass(EBUTTON);

		eCheckBoxEClass = createEClass(ECHECK_BOX);
		createEAttribute(eCheckBoxEClass, ECHECK_BOX__SELECTED);

		eHyperlinkEClass = createEClass(EHYPERLINK);
		createEAttribute(eHyperlinkEClass, EHYPERLINK__VISITED);

		eMenuButtonEClass = createEClass(EMENU_BUTTON);

		eSplitMenuButtonEClass = createEClass(ESPLIT_MENU_BUTTON);

		eToogleButtonEClass = createEClass(ETOOGLE_BUTTON);
		createEAttribute(eToogleButtonEClass, ETOOGLE_BUTTON__SELECTED);

		eBaseViewEClass = createEClass(EBASE_VIEW);
		createEReference(eBaseViewEClass, EBASE_VIEW__MODEL);

		eFilteredTableViewEClass = createEClass(EFILTERED_TABLE_VIEW);

		eTableViewEClass = createEClass(ETABLE_VIEW);
		createEReference(eTableViewEClass, ETABLE_VIEW__COLUMNS);

		eTableColumnEClass = createEClass(ETABLE_COLUMN);
		createEAttribute(eTableColumnEClass, ETABLE_COLUMN__ID);
		createEAttribute(eTableColumnEClass, ETABLE_COLUMN__NAME);
		createEAttribute(eTableColumnEClass, ETABLE_COLUMN__WIDTH);
		createEAttribute(eTableColumnEClass, ETABLE_COLUMN__CELL_VALUE_FACTORY);
		createEAttribute(eTableColumnEClass, ETABLE_COLUMN__CELL_FACTORY);
		createEReference(eTableColumnEClass, ETABLE_COLUMN__ASSOCIATED_FIELD);
		createEAttribute(eTableColumnEClass, ETABLE_COLUMN__IS_EDITABLE);

		eListViewEClass = createEClass(ELIST_VIEW);

		eRadioButtonEClass = createEClass(ERADIO_BUTTON);

		eAxisEClass = createEClass(EAXIS);

		eCatgeoryAxisEClass = createEClass(ECATGEORY_AXIS);

		eValueAxisEClass = createEClass(EVALUE_AXIS);

		ePieChartEClass = createEClass(EPIE_CHART);

		exyChartEClass = createEClass(EXY_CHART);

		ePaneEClass = createEClass(EPANE);
		createEAttribute(ePaneEClass, EPANE__POS);

		eStackPaneEClass = createEClass(ESTACK_PANE);

		eDialogPaneEClass = createEClass(EDIALOG_PANE);
		createEAttribute(eDialogPaneEClass, EDIALOG_PANE__HEADER);
		createEAttribute(eDialogPaneEClass, EDIALOG_PANE__HEADER_TEXT);
		createEAttribute(eDialogPaneEClass, EDIALOG_PANE__CONTENT_TEXT);
		createEReference(eDialogPaneEClass, EDIALOG_PANE__CONTENT);

		eGridPaneEClass = createEClass(EGRID_PANE);

		ehBoxEClass = createEClass(EH_BOX);
		createEAttribute(ehBoxEClass, EH_BOX__SPACING);

		evBoxEClass = createEClass(EV_BOX);
		createEAttribute(evBoxEClass, EV_BOX__SPACING);

		eFlowPaneEClass = createEClass(EFLOW_PANE);

		eSplitPaneEClass = createEClass(ESPLIT_PANE);

		eTilePaneEClass = createEClass(ETILE_PANE);

		eAnchorPaneEClass = createEClass(EANCHOR_PANE);

		eBorderPaneEClass = createEClass(EBORDER_PANE);
		createEReference(eBorderPaneEClass, EBORDER_PANE__LEFT);
		createEReference(eBorderPaneEClass, EBORDER_PANE__RIGHT);
		createEReference(eBorderPaneEClass, EBORDER_PANE__TOP);
		createEReference(eBorderPaneEClass, EBORDER_PANE__BOTTOM);
		createEReference(eBorderPaneEClass, EBORDER_PANE__CENTER);

		eChartEClass = createEClass(ECHART);
		createEAttribute(eChartEClass, ECHART__ANIMATED);
		createEAttribute(eChartEClass, ECHART__LEGEND_VISIBLE);
		createEAttribute(eChartEClass, ECHART__TITLE);
		createEAttribute(eChartEClass, ECHART__LEGEND_SIDE);

		eImageViewEClass = createEClass(EIMAGE_VIEW);
		createEAttribute(eImageViewEClass, EIMAGE_VIEW__IMAGE_PATH);

		eScrollPaneEClass = createEClass(ESCROLL_PANE);
		createEAttribute(eScrollPaneEClass, ESCROLL_PANE__IS_PANNABLE);
		createEAttribute(eScrollPaneEClass, ESCROLL_PANE__FIT_TO_WIDTH);
		createEAttribute(eScrollPaneEClass, ESCROLL_PANE__FIT_TO_HEIGHT);
		createEReference(eScrollPaneEClass, ESCROLL_PANE__CONTENT);

		eEventsEClass = createEClass(EEVENTS);
		createEAttribute(eEventsEClass, EEVENTS__ON_ACTION);

		eWebViewEClass = createEClass(EWEB_VIEW);
		createEAttribute(eWebViewEClass, EWEB_VIEW__URL);
		createEAttribute(eWebViewEClass, EWEB_VIEW__CONTEXT_MENU_ENABLED);

		eNodeEClass = createEClass(ENODE);
		createEAttribute(eNodeEClass, ENODE__ID);
		createEAttribute(eNodeEClass, ENODE__OPACITY);
		createEAttribute(eNodeEClass, ENODE__VISIBLE);
		createEAttribute(eNodeEClass, ENODE__DISABLE);
		createEAttribute(eNodeEClass, ENODE__STYLE);
		createEAttribute(eNodeEClass, ENODE__STYLE_CLASS);
		createEReference(eNodeEClass, ENODE__MARGIN);
		createEAttribute(eNodeEClass, ENODE__LAYOUT_X);
		createEAttribute(eNodeEClass, ENODE__LAYOUT_Y);
		createEAttribute(eNodeEClass, ENODE__MAX_HEIGHT);
		createEAttribute(eNodeEClass, ENODE__MIN_HEIGHT);
		createEAttribute(eNodeEClass, ENODE__PREF_HEIGHT);
		createEAttribute(eNodeEClass, ENODE__MAX_WIDTH);
		createEAttribute(eNodeEClass, ENODE__MIN_WIDTH);
		createEAttribute(eNodeEClass, ENODE__PREF_WIDTH);
		createEReference(eNodeEClass, ENODE__PADDING);
		createEReference(eNodeEClass, ENODE__CHILDREN);
		createEReference(eNodeEClass, ENODE__LAYOUT_DATA);

		eTabPaneEClass = createEClass(ETAB_PANE);
		createEReference(eTabPaneEClass, ETAB_PANE__TABS);

		eTabEClass = createEClass(ETAB);
		createEAttribute(eTabEClass, ETAB__ID);
		createEAttribute(eTabEClass, ETAB__NAME);
		createEReference(eTabEClass, ETAB__CONTENT);

		eLayoutDataEClass = createEClass(ELAYOUT_DATA);

		eBorderDataEClass = createEClass(EBORDER_DATA);
		createEAttribute(eBorderDataEClass, EBORDER_DATA__DIRECTION);

		evBoxDataEClass = createEClass(EV_BOX_DATA);

		ehBoxDataEClass = createEClass(EH_BOX_DATA);

		eAreaChartEClass = createEClass(EAREA_CHART);

		eBarChartEClass = createEClass(EBAR_CHART);

		eBubbleChartEClass = createEClass(EBUBBLE_CHART);

		eLineChartEClass = createEClass(ELINE_CHART);

		eScatterChartEClass = createEClass(ESCATTER_CHART);

		eStackedAreaChartEClass = createEClass(ESTACKED_AREA_CHART);

		eStackedBarChartEClass = createEClass(ESTACKED_BAR_CHART);

		// Create enums
		eSideEEnum = createEEnum(ESIDE);
		eBorderDirectionEEnum = createEEnum(EBORDER_DIRECTION);
		eControlBindingEEnum = createEEnum(ECONTROL_BINDING);
		eBindingTypeEEnum = createEEnum(EBINDING_TYPE);
		eBindingDirectionEEnum = createEEnum(EBINDING_DIRECTION);

		// Create data types
		ePosEDataType = createEDataType(EPOS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eGroupEClass.getESuperTypes().add(this.getENode());
		eControlEClass.getESuperTypes().add(this.getENode());
		eLabeledEClass.getESuperTypes().add(this.getEControl());
		eTextEClass.getESuperTypes().add(this.getELabeled());
		eLabelEClass.getESuperTypes().add(this.getELabeled());
		eButtonBaseEClass.getESuperTypes().add(this.getELabeled());
		eButtonEClass.getESuperTypes().add(this.getEButtonBase());
		eCheckBoxEClass.getESuperTypes().add(this.getEButtonBase());
		eHyperlinkEClass.getESuperTypes().add(this.getEButtonBase());
		eMenuButtonEClass.getESuperTypes().add(this.getEButtonBase());
		eSplitMenuButtonEClass.getESuperTypes().add(this.getEButtonBase());
		eToogleButtonEClass.getESuperTypes().add(this.getEButtonBase());
		eBaseViewEClass.getESuperTypes().add(this.getEControl());
		eFilteredTableViewEClass.getESuperTypes().add(this.getETableView());
		eTableViewEClass.getESuperTypes().add(this.getEBaseView());
		eListViewEClass.getESuperTypes().add(this.getEBaseView());
		eRadioButtonEClass.getESuperTypes().add(this.getEToogleButton());
		eAxisEClass.getESuperTypes().add(this.getENode());
		eCatgeoryAxisEClass.getESuperTypes().add(this.getEAxis());
		eValueAxisEClass.getESuperTypes().add(this.getEAxis());
		ePieChartEClass.getESuperTypes().add(this.getEChart());
		exyChartEClass.getESuperTypes().add(this.getEChart());
		ePaneEClass.getESuperTypes().add(this.getENode());
		eStackPaneEClass.getESuperTypes().add(this.getEPane());
		eDialogPaneEClass.getESuperTypes().add(this.getEPane());
		eGridPaneEClass.getESuperTypes().add(this.getEPane());
		ehBoxEClass.getESuperTypes().add(this.getEPane());
		evBoxEClass.getESuperTypes().add(this.getEPane());
		eFlowPaneEClass.getESuperTypes().add(this.getEPane());
		eSplitPaneEClass.getESuperTypes().add(this.getEPane());
		eTilePaneEClass.getESuperTypes().add(this.getEPane());
		eAnchorPaneEClass.getESuperTypes().add(this.getEPane());
		eBorderPaneEClass.getESuperTypes().add(this.getEPane());
		eChartEClass.getESuperTypes().add(this.getENode());
		eImageViewEClass.getESuperTypes().add(this.getENode());
		eScrollPaneEClass.getESuperTypes().add(this.getEPane());
		eWebViewEClass.getESuperTypes().add(this.getENode());
		eNodeEClass.getESuperTypes().add(this.getStyleable());
		eNodeEClass.getESuperTypes().add(this.getSkinnable());
		eNodeEClass.getESuperTypes().add(this.getEEvents());
		eTabPaneEClass.getESuperTypes().add(this.getEPane());
		eBorderDataEClass.getESuperTypes().add(this.getELayoutData());
		evBoxDataEClass.getESuperTypes().add(this.getELayoutData());
		ehBoxDataEClass.getESuperTypes().add(this.getELayoutData());
		eAreaChartEClass.getESuperTypes().add(this.getEXYChart());
		eBarChartEClass.getESuperTypes().add(this.getEXYChart());
		eBubbleChartEClass.getESuperTypes().add(this.getEXYChart());
		eLineChartEClass.getESuperTypes().add(this.getEXYChart());
		eScatterChartEClass.getESuperTypes().add(this.getEXYChart());
		eStackedAreaChartEClass.getESuperTypes().add(this.getEXYChart());
		eStackedBarChartEClass.getESuperTypes().add(this.getEXYChart());

		// Initialize classes, features, and operations; add parameters
		initEClass(emfModelEClass, EmfModel.class, "EmfModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmfModel_BasePackage(), theEcorePackage.getEString(), "basePackage", null, 0, 1,
				EmfModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmfModel_Controller(), theEcorePackage.getEString(), "controller", null, 0, 1, EmfModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEmfModel_Name(), theEcorePackage.getEString(), "name", null, 0, 1, EmfModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEmfModel_StyleClass(), theEcorePackage.getEString(), "styleClass", null, 0, -1,
				EmfModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEmfModel_BindingModel(), this.getEBindingModel(), null, "bindingModel", null, 0, 1,
				EmfModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmfModel_Root(), this.getENode(), null, "root", null, 0, 1, EmfModel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getEmfModel_Beans(), this.getEBean(), null, "beans", null, 0, -1, EmfModel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eBeanEClass, EBean.class, "EBean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEBean_Name(), theEcorePackage.getEString(), "name", null, 0, 1, EBean.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEBean_InstanceName(), theEcorePackage.getEString(), "instanceName", null, 0, 1, EBean.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEBean_GenerateClass(), theEcorePackage.getEBoolean(), "generateClass", "true", 0, 1,
				EBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEBean_Fields(), this.getEField(), null, "fields", null, 0, -1, EBean.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eFieldEClass, EField.class, "EField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEField_Name(), theEcorePackage.getEString(), "name", null, 0, 1, EField.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEField_Datatype(), theEcorePackage.getEString(), "datatype", "String", 0, 1, EField.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEField_IsMadatory(), theEcorePackage.getEBoolean(), "isMadatory", "true", 0, 1, EField.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eBindingModelEClass, EBindingModel.class, "EBindingModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEBindingModel_Bindings(), this.getEBinding(), null, "bindings", null, 0, -1,
				EBindingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eBindingEClass, EBinding.class, "EBinding", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEBinding_Name(), theEcorePackage.getEString(), "name", null, 0, 1, EBinding.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getEBinding_Node(), this.getENode(), null, "node", null, 0, 1, EBinding.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEBinding_BindingType(), this.getEBindingType(), "bindingType", "StringProperty", 0, 1,
				EBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEBinding_Binding(), this.getEControlBinding(), "binding", "TextProperty", 0, 1,
				EBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEBinding_Direction(), this.getEBindingDirection(), "direction", "Bind", 0, 1, EBinding.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(styleableEClass, Styleable.class, "Styleable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(skinnableEClass, Skinnable.class, "Skinnable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eInsetsEClass, EInsets.class, "EInsets", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEInsets_Top(), theEcorePackage.getEDouble(), "top", "0.0", 0, 1, EInsets.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEInsets_Bottom(), theEcorePackage.getEDouble(), "bottom", "0.0", 0, 1, EInsets.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEInsets_Right(), theEcorePackage.getEDouble(), "right", "0.0", 0, 1, EInsets.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEInsets_Left(), theEcorePackage.getEDouble(), "left", "0.0", 0, 1, EInsets.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eGroupEClass, EGroup.class, "EGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eControlEClass, EControl.class, "EControl", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eLabeledEClass, ELabeled.class, "ELabeled", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getELabeled_Text(), theEcorePackage.getEString(), "text", null, 0, 1, ELabeled.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eTextEClass, EText.class, "EText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEText_PromtText(), theEcorePackage.getEString(), "promtText", null, 0, 1, EText.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eLabelEClass, ELabel.class, "ELabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eButtonBaseEClass, EButtonBase.class, "EButtonBase", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eButtonEClass, EButton.class, "EButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eCheckBoxEClass, ECheckBox.class, "ECheckBox", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getECheckBox_Selected(), theEcorePackage.getEBoolean(), "selected", null, 0, 1, ECheckBox.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eHyperlinkEClass, EHyperlink.class, "EHyperlink", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEHyperlink_Visited(), theEcorePackage.getEBoolean(), "visited", null, 0, 1, EHyperlink.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eMenuButtonEClass, EMenuButton.class, "EMenuButton", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eSplitMenuButtonEClass, ESplitMenuButton.class, "ESplitMenuButton", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eToogleButtonEClass, EToogleButton.class, "EToogleButton", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEToogleButton_Selected(), theEcorePackage.getEBoolean(), "selected", null, 0, 1,
				EToogleButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(eBaseViewEClass, EBaseView.class, "EBaseView", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEBaseView_Model(), this.getEBean(), null, "model", null, 0, 1, EBaseView.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eFilteredTableViewEClass, EFilteredTableView.class, "EFilteredTableView", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eTableViewEClass, ETableView.class, "ETableView", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getETableView_Columns(), this.getETableColumn(), null, "columns", null, 0, -1, ETableView.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eTableColumnEClass, ETableColumn.class, "ETableColumn", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getETableColumn_Id(), theEcorePackage.getEString(), "id", null, 0, 1, ETableColumn.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getETableColumn_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ETableColumn.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getETableColumn_Width(), theEcorePackage.getEDouble(), "width", "150", 0, 1, ETableColumn.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getETableColumn_CellValueFactory(), theEcorePackage.getEString(), "cellValueFactory", null, 0, 1,
				ETableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getETableColumn_CellFactory(), theEcorePackage.getEString(), "cellFactory", null, 0, 1,
				ETableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getETableColumn_AssociatedField(), this.getEField(), null, "associatedField", null, 0, 1,
				ETableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getETableColumn_IsEditable(), theEcorePackage.getEBoolean(), "isEditable", "false", 0, 1,
				ETableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(eListViewEClass, EListView.class, "EListView", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eRadioButtonEClass, ERadioButton.class, "ERadioButton", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eAxisEClass, EAxis.class, "EAxis", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eCatgeoryAxisEClass, ECatgeoryAxis.class, "ECatgeoryAxis", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eValueAxisEClass, EValueAxis.class, "EValueAxis", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(ePieChartEClass, EPieChart.class, "EPieChart", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(exyChartEClass, EXYChart.class, "EXYChart", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(ePaneEClass, EPane.class, "EPane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEPane_Pos(), this.getEPos(), "pos", null, 0, 1, EPane.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eStackPaneEClass, EStackPane.class, "EStackPane", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eDialogPaneEClass, EDialogPane.class, "EDialogPane", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEDialogPane_Header(), theEcorePackage.getEString(), "header", null, 0, 1, EDialogPane.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEDialogPane_HeaderText(), theEcorePackage.getEString(), "headerText", null, 0, 1,
				EDialogPane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEDialogPane_ContentText(), theEcorePackage.getEString(), "contentText", null, 0, 1,
				EDialogPane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEDialogPane_Content(), this.getENode(), null, "content", null, 0, 1, EDialogPane.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eGridPaneEClass, EGridPane.class, "EGridPane", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(ehBoxEClass, EHBox.class, "EHBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEHBox_Spacing(), theEcorePackage.getEDouble(), "spacing", "0", 0, 1, EHBox.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(evBoxEClass, EVBox.class, "EVBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEVBox_Spacing(), theEcorePackage.getEDouble(), "spacing", "0", 0, 1, EVBox.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eFlowPaneEClass, EFlowPane.class, "EFlowPane", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eSplitPaneEClass, ESplitPane.class, "ESplitPane", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eTilePaneEClass, ETilePane.class, "ETilePane", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eAnchorPaneEClass, EAnchorPane.class, "EAnchorPane", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eBorderPaneEClass, EBorderPane.class, "EBorderPane", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEBorderPane_Left(), this.getENode(), null, "left", null, 0, 1, EBorderPane.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEBorderPane_Right(), this.getENode(), null, "right", null, 0, 1, EBorderPane.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEBorderPane_Top(), this.getENode(), null, "top", null, 0, 1, EBorderPane.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getEBorderPane_Bottom(), this.getENode(), null, "bottom", null, 0, 1, EBorderPane.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEBorderPane_Center(), this.getENode(), null, "center", null, 0, 1, EBorderPane.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eChartEClass, EChart.class, "EChart", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEChart_Animated(), theEcorePackage.getEBoolean(), "animated", "true", 0, 1, EChart.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEChart_LegendVisible(), theEcorePackage.getEBoolean(), "legendVisible", "true", 0, 1,
				EChart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEChart_Title(), theEcorePackage.getEString(), "title", null, 0, 1, EChart.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEChart_LegendSide(), this.getESide(), "legendSide", null, 0, 1, EChart.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eImageViewEClass, EImageView.class, "EImageView", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEImageView_ImagePath(), theEcorePackage.getEString(), "imagePath", null, 0, 1,
				EImageView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(eScrollPaneEClass, EScrollPane.class, "EScrollPane", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEScrollPane_IsPannable(), theEcorePackage.getEBoolean(), "isPannable", "true", 0, 1,
				EScrollPane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEScrollPane_FitToWidth(), theEcorePackage.getEBoolean(), "fitToWidth", "false", 0, 1,
				EScrollPane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEScrollPane_FitToHeight(), theEcorePackage.getEBoolean(), "fitToHeight", "false", 0, 1,
				EScrollPane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEScrollPane_Content(), this.getENode(), null, "content", null, 0, 1, EScrollPane.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eEventsEClass, EEvents.class, "EEvents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEvents_OnAction(), theEcorePackage.getEString(), "onAction", null, 0, 1, EEvents.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eWebViewEClass, EWebView.class, "EWebView", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEWebView_Url(), theEcorePackage.getEString(), "url", null, 0, 1, EWebView.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEWebView_ContextMenuEnabled(), theEcorePackage.getEBoolean(), "contextMenuEnabled", "false",
				0, 1, EWebView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(eNodeEClass, ENode.class, "ENode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getENode_Id(), theEcorePackage.getEString(), "id", null, 0, 1, ENode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getENode_Opacity(), theEcorePackage.getEDouble(), "opacity", null, 0, 1, ENode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getENode_Visible(), theEcorePackage.getEBoolean(), "visible", null, 0, 1, ENode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getENode_Disable(), theEcorePackage.getEBoolean(), "disable", null, 0, 1, ENode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getENode_Style(), theEcorePackage.getEString(), "style", null, 0, 1, ENode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getENode_StyleClass(), theEcorePackage.getEString(), "styleClass", null, 0, -1, ENode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getENode_Margin(), this.getEInsets(), null, "margin", null, 0, 1, ENode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getENode_LayoutX(), theEcorePackage.getEDouble(), "layoutX", null, 0, 1, ENode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getENode_LayoutY(), theEcorePackage.getEDouble(), "layoutY", null, 0, 1, ENode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getENode_MaxHeight(), theEcorePackage.getEDouble(), "maxHeight", null, 0, 1, ENode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getENode_MinHeight(), theEcorePackage.getEDouble(), "minHeight", null, 0, 1, ENode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getENode_PrefHeight(), theEcorePackage.getEDouble(), "prefHeight", null, 0, 1, ENode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getENode_MaxWidth(), theEcorePackage.getEDouble(), "maxWidth", null, 0, 1, ENode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getENode_MinWidth(), theEcorePackage.getEDouble(), "minWidth", null, 0, 1, ENode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getENode_PrefWidth(), theEcorePackage.getEDouble(), "prefWidth", null, 0, 1, ENode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getENode_Padding(), this.getEInsets(), null, "padding", null, 0, 1, ENode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getENode_Children(), this.getENode(), null, "children", null, 0, -1, ENode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getENode_LayoutData(), this.getELayoutData(), null, "layoutData", null, 0, 1, ENode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eTabPaneEClass, ETabPane.class, "ETabPane", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getETabPane_Tabs(), this.getETab(), null, "tabs", null, 0, -1, ETabPane.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eTabEClass, ETab.class, "ETab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getETab_Id(), theEcorePackage.getEString(), "id", null, 0, 1, ETab.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getETab_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ETab.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getETab_Content(), this.getENode(), null, "content", null, 0, 1, ETab.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eLayoutDataEClass, ELayoutData.class, "ELayoutData", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eBorderDataEClass, EBorderData.class, "EBorderData", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEBorderData_Direction(), this.getEBorderDirection(), "direction", null, 0, 1,
				EBorderData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(evBoxDataEClass, EVBoxData.class, "EVBoxData", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(ehBoxDataEClass, EHBoxData.class, "EHBoxData", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eAreaChartEClass, EAreaChart.class, "EAreaChart", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eBarChartEClass, EBarChart.class, "EBarChart", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eBubbleChartEClass, EBubbleChart.class, "EBubbleChart", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eLineChartEClass, ELineChart.class, "ELineChart", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eScatterChartEClass, EScatterChart.class, "EScatterChart", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eStackedAreaChartEClass, EStackedAreaChart.class, "EStackedAreaChart", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eStackedBarChartEClass, EStackedBarChart.class, "EStackedBarChart", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(eSideEEnum, ESide.class, "ESide");
		addEEnumLiteral(eSideEEnum, ESide.LEFT);
		addEEnumLiteral(eSideEEnum, ESide.RIGHT);
		addEEnumLiteral(eSideEEnum, ESide.TOP);
		addEEnumLiteral(eSideEEnum, ESide.BOTTOM);

		initEEnum(eBorderDirectionEEnum, EBorderDirection.class, "EBorderDirection");
		addEEnumLiteral(eBorderDirectionEEnum, EBorderDirection.TOP);
		addEEnumLiteral(eBorderDirectionEEnum, EBorderDirection.BOTTOM);
		addEEnumLiteral(eBorderDirectionEEnum, EBorderDirection.LEFT);
		addEEnumLiteral(eBorderDirectionEEnum, EBorderDirection.RIGHT);
		addEEnumLiteral(eBorderDirectionEEnum, EBorderDirection.CENTER);

		initEEnum(eControlBindingEEnum, EControlBinding.class, "EControlBinding");
		addEEnumLiteral(eControlBindingEEnum, EControlBinding.BACKGROUND_PROPERTY);
		addEEnumLiteral(eControlBindingEEnum, EControlBinding.BORDER_PROPERTY);
		addEEnumLiteral(eControlBindingEEnum, EControlBinding.DISABLE_PROPERTY);
		addEEnumLiteral(eControlBindingEEnum, EControlBinding.FOCUSED_PROPERTY);
		addEEnumLiteral(eControlBindingEEnum, EControlBinding.FONT_PROPERTY);
		addEEnumLiteral(eControlBindingEEnum, EControlBinding.TEXT_PROPERTY);
		addEEnumLiteral(eControlBindingEEnum, EControlBinding.LAYOUT_XPROPERTY);
		addEEnumLiteral(eControlBindingEEnum, EControlBinding.LAYOUT_YPROPERTY);
		addEEnumLiteral(eControlBindingEEnum, EControlBinding.MAX_HEIGHT_PROPERTY);
		addEEnumLiteral(eControlBindingEEnum, EControlBinding.MAX_WIDTH_PROPERTY);
		addEEnumLiteral(eControlBindingEEnum, EControlBinding.MIN_HEIGHT_PROPERTY);
		addEEnumLiteral(eControlBindingEEnum, EControlBinding.MIN_WIDTH_PROPERTY);
		addEEnumLiteral(eControlBindingEEnum, EControlBinding.PREF_HEIGHT_PROPERTY);
		addEEnumLiteral(eControlBindingEEnum, EControlBinding.MIN_PREF_WIDTH_PROPERTY);
		addEEnumLiteral(eControlBindingEEnum, EControlBinding.SCALE_XPROPERTY);
		addEEnumLiteral(eControlBindingEEnum, EControlBinding.SCALE_YPROPERTY);
		addEEnumLiteral(eControlBindingEEnum, EControlBinding.SCALE_ZPROPERTY);
		addEEnumLiteral(eControlBindingEEnum, EControlBinding.TRANSLATE_XPROPERTY);
		addEEnumLiteral(eControlBindingEEnum, EControlBinding.TRANSLATE_YPROPERTY);
		addEEnumLiteral(eControlBindingEEnum, EControlBinding.TRANSLATE_ZPROPERTY);

		initEEnum(eBindingTypeEEnum, EBindingType.class, "EBindingType");
		addEEnumLiteral(eBindingTypeEEnum, EBindingType.BOOLEAN_PROPERTY);
		addEEnumLiteral(eBindingTypeEEnum, EBindingType.FLOAT_PROPERTY);
		addEEnumLiteral(eBindingTypeEEnum, EBindingType.DOUBLE_PROPERTY);
		addEEnumLiteral(eBindingTypeEEnum, EBindingType.INTEGER_PROPERTY);
		addEEnumLiteral(eBindingTypeEEnum, EBindingType.LONG_PROPERTY);
		addEEnumLiteral(eBindingTypeEEnum, EBindingType.STRING_PROPERTY);
		addEEnumLiteral(eBindingTypeEEnum, EBindingType.OBJECT_PROPERTY);
		addEEnumLiteral(eBindingTypeEEnum, EBindingType.LIST_PROPERTY);
		addEEnumLiteral(eBindingTypeEEnum, EBindingType.SET_PROPERTY);
		addEEnumLiteral(eBindingTypeEEnum, EBindingType.MAP_PROPERTY);

		initEEnum(eBindingDirectionEEnum, EBindingDirection.class, "EBindingDirection");
		addEEnumLiteral(eBindingDirectionEEnum, EBindingDirection.BIND);
		addEEnumLiteral(eBindingDirectionEEnum, EBindingDirection.BIND_BIDIRECTIONAL);
		addEEnumLiteral(eBindingDirectionEEnum, EBindingDirection.UNBIND);
		addEEnumLiteral(eBindingDirectionEEnum, EBindingDirection.UNBIND_BIDIRECTIONAL);

		// Initialize data types
		initEDataType(ePosEDataType, Pos.class, "EPos", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MmPackageImpl
