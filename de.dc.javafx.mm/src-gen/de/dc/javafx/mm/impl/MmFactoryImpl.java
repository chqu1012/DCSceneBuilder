/**
 */
package de.dc.javafx.mm.impl;

import de.dc.javafx.mm.*;

import javafx.geometry.Pos;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MmFactoryImpl extends EFactoryImpl implements MmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MmFactory init() {
		try {
			MmFactory theMmFactory = (MmFactory) EPackage.Registry.INSTANCE.getEFactory(MmPackage.eNS_URI);
			if (theMmFactory != null) {
				return theMmFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MmPackage.EMF_MODEL:
			return createEmfModel();
		case MmPackage.STYLEABLE:
			return createStyleable();
		case MmPackage.SKINNABLE:
			return createSkinnable();
		case MmPackage.EREGION:
			return createERegion();
		case MmPackage.EINSETS:
			return createEInsets();
		case MmPackage.EGROUP:
			return createEGroup();
		case MmPackage.EWEB_VIEW:
			return createEWebView();
		case MmPackage.ELABEL:
			return createELabel();
		case MmPackage.EBUTTON:
			return createEButton();
		case MmPackage.ECHECK_BOX:
			return createECheckBox();
		case MmPackage.EHYPERLINK:
			return createEHyperlink();
		case MmPackage.EMENU_BUTTON:
			return createEMenuButton();
		case MmPackage.ESPLIT_MENU_BUTTON:
			return createESplitMenuButton();
		case MmPackage.ETOOGLE_BUTTON:
			return createEToogleButton();
		case MmPackage.ERADIO_BUTTON:
			return createERadioButton();
		case MmPackage.ECATGEORY_AXIS:
			return createECatgeoryAxis();
		case MmPackage.EVALUE_AXIS:
			return createEValueAxis();
		case MmPackage.EPIE_CHART:
			return createEPieChart();
		case MmPackage.EXY_CHART:
			return createEXYChart();
		case MmPackage.EPANE:
			return createEPane();
		case MmPackage.ESTACK_PANE:
			return createEStackPane();
		case MmPackage.EDIALOG_PANE:
			return createEDialogPane();
		case MmPackage.EGRID_PANE:
			return createEGridPane();
		case MmPackage.EH_BOX:
			return createEHBox();
		case MmPackage.EV_BOX:
			return createEVBox();
		case MmPackage.EFLOW_PANE:
			return createEFlowPane();
		case MmPackage.ETILE_PANE:
			return createETilePane();
		case MmPackage.EANCHOR_PANE:
			return createEAnchorPane();
		case MmPackage.EBORDER_PANE:
			return createEBorderPane();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case MmPackage.EPOS:
			return createEPosFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case MmPackage.EPOS:
			return convertEPosToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmfModel createEmfModel() {
		EmfModelImpl emfModel = new EmfModelImpl();
		return emfModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Styleable createStyleable() {
		StyleableImpl styleable = new StyleableImpl();
		return styleable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Skinnable createSkinnable() {
		SkinnableImpl skinnable = new SkinnableImpl();
		return skinnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ERegion createERegion() {
		ERegionImpl eRegion = new ERegionImpl();
		return eRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EInsets createEInsets() {
		EInsetsImpl eInsets = new EInsetsImpl();
		return eInsets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EGroup createEGroup() {
		EGroupImpl eGroup = new EGroupImpl();
		return eGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EWebView createEWebView() {
		EWebViewImpl eWebView = new EWebViewImpl();
		return eWebView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ELabel createELabel() {
		ELabelImpl eLabel = new ELabelImpl();
		return eLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EButton createEButton() {
		EButtonImpl eButton = new EButtonImpl();
		return eButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ECheckBox createECheckBox() {
		ECheckBoxImpl eCheckBox = new ECheckBoxImpl();
		return eCheckBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EHyperlink createEHyperlink() {
		EHyperlinkImpl eHyperlink = new EHyperlinkImpl();
		return eHyperlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMenuButton createEMenuButton() {
		EMenuButtonImpl eMenuButton = new EMenuButtonImpl();
		return eMenuButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ESplitMenuButton createESplitMenuButton() {
		ESplitMenuButtonImpl eSplitMenuButton = new ESplitMenuButtonImpl();
		return eSplitMenuButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EToogleButton createEToogleButton() {
		EToogleButtonImpl eToogleButton = new EToogleButtonImpl();
		return eToogleButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ERadioButton createERadioButton() {
		ERadioButtonImpl eRadioButton = new ERadioButtonImpl();
		return eRadioButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ECatgeoryAxis createECatgeoryAxis() {
		ECatgeoryAxisImpl eCatgeoryAxis = new ECatgeoryAxisImpl();
		return eCatgeoryAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EValueAxis createEValueAxis() {
		EValueAxisImpl eValueAxis = new EValueAxisImpl();
		return eValueAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EPieChart createEPieChart() {
		EPieChartImpl ePieChart = new EPieChartImpl();
		return ePieChart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EXYChart createEXYChart() {
		EXYChartImpl exyChart = new EXYChartImpl();
		return exyChart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EPane createEPane() {
		EPaneImpl ePane = new EPaneImpl();
		return ePane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EStackPane createEStackPane() {
		EStackPaneImpl eStackPane = new EStackPaneImpl();
		return eStackPane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDialogPane createEDialogPane() {
		EDialogPaneImpl eDialogPane = new EDialogPaneImpl();
		return eDialogPane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EGridPane createEGridPane() {
		EGridPaneImpl eGridPane = new EGridPaneImpl();
		return eGridPane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EHBox createEHBox() {
		EHBoxImpl ehBox = new EHBoxImpl();
		return ehBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EVBox createEVBox() {
		EVBoxImpl evBox = new EVBoxImpl();
		return evBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EFlowPane createEFlowPane() {
		EFlowPaneImpl eFlowPane = new EFlowPaneImpl();
		return eFlowPane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETilePane createETilePane() {
		ETilePaneImpl eTilePane = new ETilePaneImpl();
		return eTilePane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAnchorPane createEAnchorPane() {
		EAnchorPaneImpl eAnchorPane = new EAnchorPaneImpl();
		return eAnchorPane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EBorderPane createEBorderPane() {
		EBorderPaneImpl eBorderPane = new EBorderPaneImpl();
		return eBorderPane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pos createEPos(final String it) {
		Pos _xifexpression = null;
		if ((it != null)) {
			_xifexpression = Pos.valueOf(it);
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pos createEPosFromString(EDataType eDataType, String initialValue) {
		return createEPos(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertEPos(final Pos it) {
		String _xifexpression = null;
		if ((it != null)) {
			_xifexpression = it.name();
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEPosToString(EDataType eDataType, Object instanceValue) {
		return convertEPos((Pos) instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MmPackage getMmPackage() {
		return (MmPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MmPackage getPackage() {
		return MmPackage.eINSTANCE;
	}

} //MmFactoryImpl
