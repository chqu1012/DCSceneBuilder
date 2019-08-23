/**
 */
package de.dc.javafx.mm.impl;

import de.dc.javafx.mm.EAnchorPane;
import de.dc.javafx.mm.EAxis;
import de.dc.javafx.mm.EBaseView;
import de.dc.javafx.mm.EBorderPane;
import de.dc.javafx.mm.EButton;
import de.dc.javafx.mm.EButtonBase;
import de.dc.javafx.mm.ECatgeoryAxis;
import de.dc.javafx.mm.EChart;
import de.dc.javafx.mm.ECheckBox;
import de.dc.javafx.mm.EControl;
import de.dc.javafx.mm.EDialogPane;
import de.dc.javafx.mm.EEvents;
import de.dc.javafx.mm.EFlowPane;
import de.dc.javafx.mm.EGridPane;
import de.dc.javafx.mm.EGroup;
import de.dc.javafx.mm.EHBox;
import de.dc.javafx.mm.EHyperlink;
import de.dc.javafx.mm.EInsets;
import de.dc.javafx.mm.ELabel;
import de.dc.javafx.mm.ELabeled;
import de.dc.javafx.mm.EMenuButton;
import de.dc.javafx.mm.ENode;
import de.dc.javafx.mm.EPane;
import de.dc.javafx.mm.EParent;
import de.dc.javafx.mm.EPieChart;
import de.dc.javafx.mm.ERadioButton;
import de.dc.javafx.mm.ERegion;
import de.dc.javafx.mm.ESplitMenuButton;
import de.dc.javafx.mm.EStackPane;
import de.dc.javafx.mm.ETableColumn;
import de.dc.javafx.mm.ETableView;
import de.dc.javafx.mm.ETilePane;
import de.dc.javafx.mm.EToogleButton;
import de.dc.javafx.mm.EVBox;
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
	private EClass eEventsEClass = null;

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
	private EClass eNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eParentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eRegionEClass = null;

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
	private EClass eWebViewEClass = null;

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
	private EClass eChartEClass = null;

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
	public EAttribute getEmfModel_Controller() {
		return (EAttribute) emfModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmfModel_StyleClass() {
		return (EAttribute) emfModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmfModel_Root() {
		return (EReference) emfModelEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getENode_LayoutX() {
		return (EAttribute) eNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getENode_LayoutY() {
		return (EAttribute) eNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getENode_Opacity() {
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
	public EAttribute getENode_Visible() {
		return (EAttribute) eNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getENode_Disable() {
		return (EAttribute) eNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getENode_Margin() {
		return (EReference) eNodeEClass.getEStructuralFeatures().get(8);
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
	public EClass getEParent() {
		return eParentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEParent_Children() {
		return (EReference) eParentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getERegion() {
		return eRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getERegion_Padding() {
		return (EReference) eRegionEClass.getEStructuralFeatures().get(0);
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
	public EClass getEWebView() {
		return eWebViewEClass;
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
	public EAttribute getETableColumn_Name() {
		return (EAttribute) eTableColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getETableColumn_Width() {
		return (EAttribute) eTableColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getETableColumn_CellValueFactory() {
		return (EAttribute) eTableColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getETableColumn_CellFactory() {
		return (EAttribute) eTableColumnEClass.getEStructuralFeatures().get(3);
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
	public EClass getEChart() {
		return eChartEClass;
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
		createEAttribute(emfModelEClass, EMF_MODEL__CONTROLLER);
		createEAttribute(emfModelEClass, EMF_MODEL__STYLE_CLASS);
		createEReference(emfModelEClass, EMF_MODEL__ROOT);

		eEventsEClass = createEClass(EEVENTS);
		createEAttribute(eEventsEClass, EEVENTS__ON_ACTION);

		styleableEClass = createEClass(STYLEABLE);

		skinnableEClass = createEClass(SKINNABLE);

		eNodeEClass = createEClass(ENODE);
		createEAttribute(eNodeEClass, ENODE__ID);
		createEAttribute(eNodeEClass, ENODE__LAYOUT_X);
		createEAttribute(eNodeEClass, ENODE__LAYOUT_Y);
		createEAttribute(eNodeEClass, ENODE__OPACITY);
		createEAttribute(eNodeEClass, ENODE__STYLE);
		createEAttribute(eNodeEClass, ENODE__STYLE_CLASS);
		createEAttribute(eNodeEClass, ENODE__VISIBLE);
		createEAttribute(eNodeEClass, ENODE__DISABLE);
		createEReference(eNodeEClass, ENODE__MARGIN);
		createEAttribute(eNodeEClass, ENODE__MAX_HEIGHT);
		createEAttribute(eNodeEClass, ENODE__MIN_HEIGHT);
		createEAttribute(eNodeEClass, ENODE__PREF_HEIGHT);
		createEAttribute(eNodeEClass, ENODE__MAX_WIDTH);
		createEAttribute(eNodeEClass, ENODE__MIN_WIDTH);
		createEAttribute(eNodeEClass, ENODE__PREF_WIDTH);

		eParentEClass = createEClass(EPARENT);
		createEReference(eParentEClass, EPARENT__CHILDREN);

		eRegionEClass = createEClass(EREGION);
		createEReference(eRegionEClass, EREGION__PADDING);

		eInsetsEClass = createEClass(EINSETS);
		createEAttribute(eInsetsEClass, EINSETS__TOP);
		createEAttribute(eInsetsEClass, EINSETS__BOTTOM);
		createEAttribute(eInsetsEClass, EINSETS__RIGHT);
		createEAttribute(eInsetsEClass, EINSETS__LEFT);

		eGroupEClass = createEClass(EGROUP);

		eWebViewEClass = createEClass(EWEB_VIEW);

		eControlEClass = createEClass(ECONTROL);

		eLabeledEClass = createEClass(ELABELED);
		createEAttribute(eLabeledEClass, ELABELED__TEXT);

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

		eTableViewEClass = createEClass(ETABLE_VIEW);
		createEReference(eTableViewEClass, ETABLE_VIEW__COLUMNS);

		eTableColumnEClass = createEClass(ETABLE_COLUMN);
		createEAttribute(eTableColumnEClass, ETABLE_COLUMN__NAME);
		createEAttribute(eTableColumnEClass, ETABLE_COLUMN__WIDTH);
		createEAttribute(eTableColumnEClass, ETABLE_COLUMN__CELL_VALUE_FACTORY);
		createEAttribute(eTableColumnEClass, ETABLE_COLUMN__CELL_FACTORY);

		eRadioButtonEClass = createEClass(ERADIO_BUTTON);

		eAxisEClass = createEClass(EAXIS);

		eCatgeoryAxisEClass = createEClass(ECATGEORY_AXIS);

		eValueAxisEClass = createEClass(EVALUE_AXIS);

		eChartEClass = createEClass(ECHART);

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

		eTilePaneEClass = createEClass(ETILE_PANE);

		eAnchorPaneEClass = createEClass(EANCHOR_PANE);

		eBorderPaneEClass = createEClass(EBORDER_PANE);
		createEReference(eBorderPaneEClass, EBORDER_PANE__LEFT);
		createEReference(eBorderPaneEClass, EBORDER_PANE__RIGHT);
		createEReference(eBorderPaneEClass, EBORDER_PANE__TOP);
		createEReference(eBorderPaneEClass, EBORDER_PANE__BOTTOM);
		createEReference(eBorderPaneEClass, EBORDER_PANE__CENTER);

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
		eNodeEClass.getESuperTypes().add(this.getStyleable());
		eNodeEClass.getESuperTypes().add(this.getSkinnable());
		eNodeEClass.getESuperTypes().add(this.getEEvents());
		eParentEClass.getESuperTypes().add(this.getENode());
		eRegionEClass.getESuperTypes().add(this.getEParent());
		eGroupEClass.getESuperTypes().add(this.getENode());
		eWebViewEClass.getESuperTypes().add(this.getENode());
		eControlEClass.getESuperTypes().add(this.getERegion());
		eLabeledEClass.getESuperTypes().add(this.getEControl());
		eLabelEClass.getESuperTypes().add(this.getELabeled());
		eButtonBaseEClass.getESuperTypes().add(this.getELabeled());
		eButtonEClass.getESuperTypes().add(this.getEButtonBase());
		eCheckBoxEClass.getESuperTypes().add(this.getEButtonBase());
		eHyperlinkEClass.getESuperTypes().add(this.getEButtonBase());
		eMenuButtonEClass.getESuperTypes().add(this.getEButtonBase());
		eSplitMenuButtonEClass.getESuperTypes().add(this.getEButtonBase());
		eToogleButtonEClass.getESuperTypes().add(this.getEButtonBase());
		eBaseViewEClass.getESuperTypes().add(this.getEControl());
		eTableViewEClass.getESuperTypes().add(this.getEBaseView());
		eRadioButtonEClass.getESuperTypes().add(this.getEToogleButton());
		eAxisEClass.getESuperTypes().add(this.getERegion());
		eCatgeoryAxisEClass.getESuperTypes().add(this.getEAxis());
		eValueAxisEClass.getESuperTypes().add(this.getEAxis());
		eChartEClass.getESuperTypes().add(this.getERegion());
		ePieChartEClass.getESuperTypes().add(this.getEChart());
		exyChartEClass.getESuperTypes().add(this.getEChart());
		ePaneEClass.getESuperTypes().add(this.getERegion());
		eStackPaneEClass.getESuperTypes().add(this.getEPane());
		eDialogPaneEClass.getESuperTypes().add(this.getEPane());
		eGridPaneEClass.getESuperTypes().add(this.getEPane());
		ehBoxEClass.getESuperTypes().add(this.getEPane());
		evBoxEClass.getESuperTypes().add(this.getEPane());
		eFlowPaneEClass.getESuperTypes().add(this.getEPane());
		eTilePaneEClass.getESuperTypes().add(this.getEPane());
		eAnchorPaneEClass.getESuperTypes().add(this.getEPane());
		eBorderPaneEClass.getESuperTypes().add(this.getEPane());

		// Initialize classes, features, and operations; add parameters
		initEClass(emfModelEClass, EmfModel.class, "EmfModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmfModel_Controller(), theEcorePackage.getEString(), "controller", null, 0, 1, EmfModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEmfModel_StyleClass(), theEcorePackage.getEString(), "styleClass", null, 0, -1,
				EmfModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEmfModel_Root(), this.getENode(), null, "root", null, 0, 1, EmfModel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eEventsEClass, EEvents.class, "EEvents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEvents_OnAction(), theEcorePackage.getEString(), "onAction", null, 0, 1, EEvents.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(styleableEClass, Styleable.class, "Styleable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(skinnableEClass, Skinnable.class, "Skinnable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eNodeEClass, ENode.class, "ENode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getENode_Id(), theEcorePackage.getEString(), "id", null, 0, 1, ENode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getENode_LayoutX(), theEcorePackage.getEDouble(), "layoutX", null, 0, 1, ENode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getENode_LayoutY(), theEcorePackage.getEDouble(), "layoutY", null, 0, 1, ENode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getENode_Opacity(), theEcorePackage.getEDouble(), "opacity", null, 0, 1, ENode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getENode_Style(), theEcorePackage.getEString(), "style", null, 0, 1, ENode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getENode_StyleClass(), theEcorePackage.getEString(), "styleClass", null, 0, -1, ENode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getENode_Visible(), theEcorePackage.getEBoolean(), "visible", null, 0, 1, ENode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getENode_Disable(), theEcorePackage.getEBoolean(), "disable", null, 0, 1, ENode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getENode_Margin(), this.getEInsets(), null, "margin", null, 0, 1, ENode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
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

		initEClass(eParentEClass, EParent.class, "EParent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEParent_Children(), this.getENode(), null, "children", null, 0, -1, EParent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eRegionEClass, ERegion.class, "ERegion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getERegion_Padding(), this.getEInsets(), null, "padding", null, 0, 1, ERegion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(eWebViewEClass, EWebView.class, "EWebView", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eControlEClass, EControl.class, "EControl", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eLabeledEClass, ELabeled.class, "ELabeled", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getELabeled_Text(), theEcorePackage.getEString(), "text", null, 0, 1, ELabeled.class,
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

		initEClass(eTableViewEClass, ETableView.class, "ETableView", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getETableView_Columns(), this.getETableColumn(), null, "columns", null, 0, -1, ETableView.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eTableColumnEClass, ETableColumn.class, "ETableColumn", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
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

		initEClass(eRadioButtonEClass, ERadioButton.class, "ERadioButton", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eAxisEClass, EAxis.class, "EAxis", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eCatgeoryAxisEClass, ECatgeoryAxis.class, "ECatgeoryAxis", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eValueAxisEClass, EValueAxis.class, "EValueAxis", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eChartEClass, EChart.class, "EChart", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

		// Initialize data types
		initEDataType(ePosEDataType, Pos.class, "EPos", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MmPackageImpl
