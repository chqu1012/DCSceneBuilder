/**
 */
package de.dc.javafx.mm.util;

import de.dc.javafx.mm.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dc.javafx.mm.MmPackage
 * @generated
 */
public class MmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MmSwitch() {
		if (modelPackage == null) {
			modelPackage = MmPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case MmPackage.EMF_MODEL: {
			EmfModel emfModel = (EmfModel) theEObject;
			T result = caseEmfModel(emfModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.STYLEABLE: {
			Styleable styleable = (Styleable) theEObject;
			T result = caseStyleable(styleable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.SKINNABLE: {
			Skinnable skinnable = (Skinnable) theEObject;
			T result = caseSkinnable(skinnable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.ENODE: {
			ENode eNode = (ENode) theEObject;
			T result = caseENode(eNode);
			if (result == null)
				result = caseStyleable(eNode);
			if (result == null)
				result = caseSkinnable(eNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.EPARENT: {
			EParent eParent = (EParent) theEObject;
			T result = caseEParent(eParent);
			if (result == null)
				result = caseENode(eParent);
			if (result == null)
				result = caseStyleable(eParent);
			if (result == null)
				result = caseSkinnable(eParent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.EREGION: {
			ERegion eRegion = (ERegion) theEObject;
			T result = caseERegion(eRegion);
			if (result == null)
				result = caseEParent(eRegion);
			if (result == null)
				result = caseENode(eRegion);
			if (result == null)
				result = caseStyleable(eRegion);
			if (result == null)
				result = caseSkinnable(eRegion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.EINSETS: {
			EInsets eInsets = (EInsets) theEObject;
			T result = caseEInsets(eInsets);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.EGROUP: {
			EGroup eGroup = (EGroup) theEObject;
			T result = caseEGroup(eGroup);
			if (result == null)
				result = caseENode(eGroup);
			if (result == null)
				result = caseStyleable(eGroup);
			if (result == null)
				result = caseSkinnable(eGroup);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.EWEB_VIEW: {
			EWebView eWebView = (EWebView) theEObject;
			T result = caseEWebView(eWebView);
			if (result == null)
				result = caseENode(eWebView);
			if (result == null)
				result = caseStyleable(eWebView);
			if (result == null)
				result = caseSkinnable(eWebView);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.ECONTROL: {
			EControl eControl = (EControl) theEObject;
			T result = caseEControl(eControl);
			if (result == null)
				result = caseERegion(eControl);
			if (result == null)
				result = caseEParent(eControl);
			if (result == null)
				result = caseENode(eControl);
			if (result == null)
				result = caseStyleable(eControl);
			if (result == null)
				result = caseSkinnable(eControl);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.ELABELED: {
			ELabeled eLabeled = (ELabeled) theEObject;
			T result = caseELabeled(eLabeled);
			if (result == null)
				result = caseEControl(eLabeled);
			if (result == null)
				result = caseERegion(eLabeled);
			if (result == null)
				result = caseEParent(eLabeled);
			if (result == null)
				result = caseENode(eLabeled);
			if (result == null)
				result = caseStyleable(eLabeled);
			if (result == null)
				result = caseSkinnable(eLabeled);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.ELABEL: {
			ELabel eLabel = (ELabel) theEObject;
			T result = caseELabel(eLabel);
			if (result == null)
				result = caseELabeled(eLabel);
			if (result == null)
				result = caseEControl(eLabel);
			if (result == null)
				result = caseERegion(eLabel);
			if (result == null)
				result = caseEParent(eLabel);
			if (result == null)
				result = caseENode(eLabel);
			if (result == null)
				result = caseStyleable(eLabel);
			if (result == null)
				result = caseSkinnable(eLabel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.EBUTTON_BASE: {
			EButtonBase eButtonBase = (EButtonBase) theEObject;
			T result = caseEButtonBase(eButtonBase);
			if (result == null)
				result = caseELabeled(eButtonBase);
			if (result == null)
				result = caseEControl(eButtonBase);
			if (result == null)
				result = caseERegion(eButtonBase);
			if (result == null)
				result = caseEParent(eButtonBase);
			if (result == null)
				result = caseENode(eButtonBase);
			if (result == null)
				result = caseStyleable(eButtonBase);
			if (result == null)
				result = caseSkinnable(eButtonBase);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.EBUTTON: {
			EButton eButton = (EButton) theEObject;
			T result = caseEButton(eButton);
			if (result == null)
				result = caseEButtonBase(eButton);
			if (result == null)
				result = caseELabeled(eButton);
			if (result == null)
				result = caseEControl(eButton);
			if (result == null)
				result = caseERegion(eButton);
			if (result == null)
				result = caseEParent(eButton);
			if (result == null)
				result = caseENode(eButton);
			if (result == null)
				result = caseStyleable(eButton);
			if (result == null)
				result = caseSkinnable(eButton);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.ECHECK_BOX: {
			ECheckBox eCheckBox = (ECheckBox) theEObject;
			T result = caseECheckBox(eCheckBox);
			if (result == null)
				result = caseEButtonBase(eCheckBox);
			if (result == null)
				result = caseELabeled(eCheckBox);
			if (result == null)
				result = caseEControl(eCheckBox);
			if (result == null)
				result = caseERegion(eCheckBox);
			if (result == null)
				result = caseEParent(eCheckBox);
			if (result == null)
				result = caseENode(eCheckBox);
			if (result == null)
				result = caseStyleable(eCheckBox);
			if (result == null)
				result = caseSkinnable(eCheckBox);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.EHYPERLINK: {
			EHyperlink eHyperlink = (EHyperlink) theEObject;
			T result = caseEHyperlink(eHyperlink);
			if (result == null)
				result = caseEButtonBase(eHyperlink);
			if (result == null)
				result = caseELabeled(eHyperlink);
			if (result == null)
				result = caseEControl(eHyperlink);
			if (result == null)
				result = caseERegion(eHyperlink);
			if (result == null)
				result = caseEParent(eHyperlink);
			if (result == null)
				result = caseENode(eHyperlink);
			if (result == null)
				result = caseStyleable(eHyperlink);
			if (result == null)
				result = caseSkinnable(eHyperlink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.EMENU_BUTTON: {
			EMenuButton eMenuButton = (EMenuButton) theEObject;
			T result = caseEMenuButton(eMenuButton);
			if (result == null)
				result = caseEButtonBase(eMenuButton);
			if (result == null)
				result = caseELabeled(eMenuButton);
			if (result == null)
				result = caseEControl(eMenuButton);
			if (result == null)
				result = caseERegion(eMenuButton);
			if (result == null)
				result = caseEParent(eMenuButton);
			if (result == null)
				result = caseENode(eMenuButton);
			if (result == null)
				result = caseStyleable(eMenuButton);
			if (result == null)
				result = caseSkinnable(eMenuButton);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.ESPLIT_MENU_BUTTON: {
			ESplitMenuButton eSplitMenuButton = (ESplitMenuButton) theEObject;
			T result = caseESplitMenuButton(eSplitMenuButton);
			if (result == null)
				result = caseEButtonBase(eSplitMenuButton);
			if (result == null)
				result = caseELabeled(eSplitMenuButton);
			if (result == null)
				result = caseEControl(eSplitMenuButton);
			if (result == null)
				result = caseERegion(eSplitMenuButton);
			if (result == null)
				result = caseEParent(eSplitMenuButton);
			if (result == null)
				result = caseENode(eSplitMenuButton);
			if (result == null)
				result = caseStyleable(eSplitMenuButton);
			if (result == null)
				result = caseSkinnable(eSplitMenuButton);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.ETOOGLE_BUTTON: {
			EToogleButton eToogleButton = (EToogleButton) theEObject;
			T result = caseEToogleButton(eToogleButton);
			if (result == null)
				result = caseEButtonBase(eToogleButton);
			if (result == null)
				result = caseELabeled(eToogleButton);
			if (result == null)
				result = caseEControl(eToogleButton);
			if (result == null)
				result = caseERegion(eToogleButton);
			if (result == null)
				result = caseEParent(eToogleButton);
			if (result == null)
				result = caseENode(eToogleButton);
			if (result == null)
				result = caseStyleable(eToogleButton);
			if (result == null)
				result = caseSkinnable(eToogleButton);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.ERADIO_BUTTON: {
			ERadioButton eRadioButton = (ERadioButton) theEObject;
			T result = caseERadioButton(eRadioButton);
			if (result == null)
				result = caseEToogleButton(eRadioButton);
			if (result == null)
				result = caseEButtonBase(eRadioButton);
			if (result == null)
				result = caseELabeled(eRadioButton);
			if (result == null)
				result = caseEControl(eRadioButton);
			if (result == null)
				result = caseERegion(eRadioButton);
			if (result == null)
				result = caseEParent(eRadioButton);
			if (result == null)
				result = caseENode(eRadioButton);
			if (result == null)
				result = caseStyleable(eRadioButton);
			if (result == null)
				result = caseSkinnable(eRadioButton);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.EAXIS: {
			EAxis eAxis = (EAxis) theEObject;
			T result = caseEAxis(eAxis);
			if (result == null)
				result = caseERegion(eAxis);
			if (result == null)
				result = caseEParent(eAxis);
			if (result == null)
				result = caseENode(eAxis);
			if (result == null)
				result = caseStyleable(eAxis);
			if (result == null)
				result = caseSkinnable(eAxis);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.ECATGEORY_AXIS: {
			ECatgeoryAxis eCatgeoryAxis = (ECatgeoryAxis) theEObject;
			T result = caseECatgeoryAxis(eCatgeoryAxis);
			if (result == null)
				result = caseEAxis(eCatgeoryAxis);
			if (result == null)
				result = caseERegion(eCatgeoryAxis);
			if (result == null)
				result = caseEParent(eCatgeoryAxis);
			if (result == null)
				result = caseENode(eCatgeoryAxis);
			if (result == null)
				result = caseStyleable(eCatgeoryAxis);
			if (result == null)
				result = caseSkinnable(eCatgeoryAxis);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.EVALUE_AXIS: {
			EValueAxis eValueAxis = (EValueAxis) theEObject;
			T result = caseEValueAxis(eValueAxis);
			if (result == null)
				result = caseEAxis(eValueAxis);
			if (result == null)
				result = caseERegion(eValueAxis);
			if (result == null)
				result = caseEParent(eValueAxis);
			if (result == null)
				result = caseENode(eValueAxis);
			if (result == null)
				result = caseStyleable(eValueAxis);
			if (result == null)
				result = caseSkinnable(eValueAxis);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.ECHART: {
			EChart eChart = (EChart) theEObject;
			T result = caseEChart(eChart);
			if (result == null)
				result = caseERegion(eChart);
			if (result == null)
				result = caseEParent(eChart);
			if (result == null)
				result = caseENode(eChart);
			if (result == null)
				result = caseStyleable(eChart);
			if (result == null)
				result = caseSkinnable(eChart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.EPIE_CHART: {
			EPieChart ePieChart = (EPieChart) theEObject;
			T result = caseEPieChart(ePieChart);
			if (result == null)
				result = caseEChart(ePieChart);
			if (result == null)
				result = caseERegion(ePieChart);
			if (result == null)
				result = caseEParent(ePieChart);
			if (result == null)
				result = caseENode(ePieChart);
			if (result == null)
				result = caseStyleable(ePieChart);
			if (result == null)
				result = caseSkinnable(ePieChart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.EXY_CHART: {
			EXYChart exyChart = (EXYChart) theEObject;
			T result = caseEXYChart(exyChart);
			if (result == null)
				result = caseEChart(exyChart);
			if (result == null)
				result = caseERegion(exyChart);
			if (result == null)
				result = caseEParent(exyChart);
			if (result == null)
				result = caseENode(exyChart);
			if (result == null)
				result = caseStyleable(exyChart);
			if (result == null)
				result = caseSkinnable(exyChart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.EPANE: {
			EPane ePane = (EPane) theEObject;
			T result = caseEPane(ePane);
			if (result == null)
				result = caseERegion(ePane);
			if (result == null)
				result = caseEParent(ePane);
			if (result == null)
				result = caseENode(ePane);
			if (result == null)
				result = caseStyleable(ePane);
			if (result == null)
				result = caseSkinnable(ePane);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.ESTACK_PANE: {
			EStackPane eStackPane = (EStackPane) theEObject;
			T result = caseEStackPane(eStackPane);
			if (result == null)
				result = caseEPane(eStackPane);
			if (result == null)
				result = caseERegion(eStackPane);
			if (result == null)
				result = caseEParent(eStackPane);
			if (result == null)
				result = caseENode(eStackPane);
			if (result == null)
				result = caseStyleable(eStackPane);
			if (result == null)
				result = caseSkinnable(eStackPane);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.EDIALOG_PANE: {
			EDialogPane eDialogPane = (EDialogPane) theEObject;
			T result = caseEDialogPane(eDialogPane);
			if (result == null)
				result = caseEPane(eDialogPane);
			if (result == null)
				result = caseERegion(eDialogPane);
			if (result == null)
				result = caseEParent(eDialogPane);
			if (result == null)
				result = caseENode(eDialogPane);
			if (result == null)
				result = caseStyleable(eDialogPane);
			if (result == null)
				result = caseSkinnable(eDialogPane);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.EGRID_PANE: {
			EGridPane eGridPane = (EGridPane) theEObject;
			T result = caseEGridPane(eGridPane);
			if (result == null)
				result = caseEPane(eGridPane);
			if (result == null)
				result = caseERegion(eGridPane);
			if (result == null)
				result = caseEParent(eGridPane);
			if (result == null)
				result = caseENode(eGridPane);
			if (result == null)
				result = caseStyleable(eGridPane);
			if (result == null)
				result = caseSkinnable(eGridPane);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.EH_BOX: {
			EHBox ehBox = (EHBox) theEObject;
			T result = caseEHBox(ehBox);
			if (result == null)
				result = caseEPane(ehBox);
			if (result == null)
				result = caseERegion(ehBox);
			if (result == null)
				result = caseEParent(ehBox);
			if (result == null)
				result = caseENode(ehBox);
			if (result == null)
				result = caseStyleable(ehBox);
			if (result == null)
				result = caseSkinnable(ehBox);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.EV_BOX: {
			EVBox evBox = (EVBox) theEObject;
			T result = caseEVBox(evBox);
			if (result == null)
				result = caseEPane(evBox);
			if (result == null)
				result = caseERegion(evBox);
			if (result == null)
				result = caseEParent(evBox);
			if (result == null)
				result = caseENode(evBox);
			if (result == null)
				result = caseStyleable(evBox);
			if (result == null)
				result = caseSkinnable(evBox);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.EFLOW_PANE: {
			EFlowPane eFlowPane = (EFlowPane) theEObject;
			T result = caseEFlowPane(eFlowPane);
			if (result == null)
				result = caseEPane(eFlowPane);
			if (result == null)
				result = caseERegion(eFlowPane);
			if (result == null)
				result = caseEParent(eFlowPane);
			if (result == null)
				result = caseENode(eFlowPane);
			if (result == null)
				result = caseStyleable(eFlowPane);
			if (result == null)
				result = caseSkinnable(eFlowPane);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.ETILE_PANE: {
			ETilePane eTilePane = (ETilePane) theEObject;
			T result = caseETilePane(eTilePane);
			if (result == null)
				result = caseEPane(eTilePane);
			if (result == null)
				result = caseERegion(eTilePane);
			if (result == null)
				result = caseEParent(eTilePane);
			if (result == null)
				result = caseENode(eTilePane);
			if (result == null)
				result = caseStyleable(eTilePane);
			if (result == null)
				result = caseSkinnable(eTilePane);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.EANCHOR_PANE: {
			EAnchorPane eAnchorPane = (EAnchorPane) theEObject;
			T result = caseEAnchorPane(eAnchorPane);
			if (result == null)
				result = caseEPane(eAnchorPane);
			if (result == null)
				result = caseERegion(eAnchorPane);
			if (result == null)
				result = caseEParent(eAnchorPane);
			if (result == null)
				result = caseENode(eAnchorPane);
			if (result == null)
				result = caseStyleable(eAnchorPane);
			if (result == null)
				result = caseSkinnable(eAnchorPane);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MmPackage.EBORDER_PANE: {
			EBorderPane eBorderPane = (EBorderPane) theEObject;
			T result = caseEBorderPane(eBorderPane);
			if (result == null)
				result = caseEPane(eBorderPane);
			if (result == null)
				result = caseERegion(eBorderPane);
			if (result == null)
				result = caseEParent(eBorderPane);
			if (result == null)
				result = caseENode(eBorderPane);
			if (result == null)
				result = caseStyleable(eBorderPane);
			if (result == null)
				result = caseSkinnable(eBorderPane);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emf Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emf Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmfModel(EmfModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Styleable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Styleable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleable(Styleable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skinnable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skinnable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkinnable(Skinnable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ENode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ENode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseENode(ENode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EParent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EParent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEParent(EParent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ERegion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ERegion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseERegion(ERegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EInsets</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EInsets</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEInsets(EInsets object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EGroup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EGroup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEGroup(EGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EWeb View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EWeb View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEWebView(EWebView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EControl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EControl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEControl(EControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ELabeled</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ELabeled</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseELabeled(ELabeled object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ELabel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ELabel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseELabel(ELabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EButton Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EButton Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEButtonBase(EButtonBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EButton</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EButton</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEButton(EButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ECheck Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ECheck Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseECheckBox(ECheckBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EHyperlink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EHyperlink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEHyperlink(EHyperlink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMenu Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMenu Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMenuButton(EMenuButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ESplit Menu Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ESplit Menu Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESplitMenuButton(ESplitMenuButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EToogle Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EToogle Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEToogleButton(EToogleButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ERadio Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ERadio Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseERadioButton(ERadioButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EAxis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAxis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAxis(EAxis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ECatgeory Axis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ECatgeory Axis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseECatgeoryAxis(ECatgeoryAxis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EValue Axis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EValue Axis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEValueAxis(EValueAxis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EChart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EChart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEChart(EChart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EPie Chart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EPie Chart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEPieChart(EPieChart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EXY Chart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EXY Chart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEXYChart(EXYChart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EPane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EPane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEPane(EPane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EStack Pane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EStack Pane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStackPane(EStackPane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDialog Pane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDialog Pane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDialogPane(EDialogPane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EGrid Pane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EGrid Pane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEGridPane(EGridPane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EH Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EH Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEHBox(EHBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EV Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EV Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEVBox(EVBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EFlow Pane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EFlow Pane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEFlowPane(EFlowPane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ETile Pane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETile Pane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETilePane(ETilePane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EAnchor Pane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAnchor Pane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAnchorPane(EAnchorPane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EBorder Pane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EBorder Pane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEBorderPane(EBorderPane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MmSwitch
