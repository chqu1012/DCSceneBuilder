/**
 */
package de.dc.javafx.mm;

import javafx.geometry.Pos;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dc.javafx.mm.MmPackage
 * @generated
 */
public interface MmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MmFactory eINSTANCE = de.dc.javafx.mm.impl.MmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Emf Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emf Model</em>'.
	 * @generated
	 */
	EmfModel createEmfModel();

	/**
	 * Returns a new object of class '<em>Styleable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Styleable</em>'.
	 * @generated
	 */
	Styleable createStyleable();

	/**
	 * Returns a new object of class '<em>Skinnable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Skinnable</em>'.
	 * @generated
	 */
	Skinnable createSkinnable();

	/**
	 * Returns a new object of class '<em>ERegion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ERegion</em>'.
	 * @generated
	 */
	ERegion createERegion();

	/**
	 * Returns a new object of class '<em>EInsets</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EInsets</em>'.
	 * @generated
	 */
	EInsets createEInsets();

	/**
	 * Returns a new object of class '<em>EGroup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EGroup</em>'.
	 * @generated
	 */
	EGroup createEGroup();

	/**
	 * Returns a new object of class '<em>EWeb View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EWeb View</em>'.
	 * @generated
	 */
	EWebView createEWebView();

	/**
	 * Returns a new object of class '<em>ELabel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ELabel</em>'.
	 * @generated
	 */
	ELabel createELabel();

	/**
	 * Returns a new object of class '<em>EButton</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EButton</em>'.
	 * @generated
	 */
	EButton createEButton();

	/**
	 * Returns a new object of class '<em>ECheck Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ECheck Box</em>'.
	 * @generated
	 */
	ECheckBox createECheckBox();

	/**
	 * Returns a new object of class '<em>EHyperlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EHyperlink</em>'.
	 * @generated
	 */
	EHyperlink createEHyperlink();

	/**
	 * Returns a new object of class '<em>EMenu Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EMenu Button</em>'.
	 * @generated
	 */
	EMenuButton createEMenuButton();

	/**
	 * Returns a new object of class '<em>ESplit Menu Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ESplit Menu Button</em>'.
	 * @generated
	 */
	ESplitMenuButton createESplitMenuButton();

	/**
	 * Returns a new object of class '<em>EToogle Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EToogle Button</em>'.
	 * @generated
	 */
	EToogleButton createEToogleButton();

	/**
	 * Returns a new object of class '<em>ETable View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ETable View</em>'.
	 * @generated
	 */
	ETableView createETableView();

	/**
	 * Returns a new object of class '<em>ETable Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ETable Column</em>'.
	 * @generated
	 */
	ETableColumn createETableColumn();

	/**
	 * Returns a new object of class '<em>ERadio Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ERadio Button</em>'.
	 * @generated
	 */
	ERadioButton createERadioButton();

	/**
	 * Returns a new object of class '<em>ECatgeory Axis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ECatgeory Axis</em>'.
	 * @generated
	 */
	ECatgeoryAxis createECatgeoryAxis();

	/**
	 * Returns a new object of class '<em>EValue Axis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EValue Axis</em>'.
	 * @generated
	 */
	EValueAxis createEValueAxis();

	/**
	 * Returns a new object of class '<em>EPie Chart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EPie Chart</em>'.
	 * @generated
	 */
	EPieChart createEPieChart();

	/**
	 * Returns a new object of class '<em>EXY Chart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EXY Chart</em>'.
	 * @generated
	 */
	EXYChart createEXYChart();

	/**
	 * Returns a new object of class '<em>EPane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EPane</em>'.
	 * @generated
	 */
	EPane createEPane();

	/**
	 * Returns a new object of class '<em>EStack Pane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EStack Pane</em>'.
	 * @generated
	 */
	EStackPane createEStackPane();

	/**
	 * Returns a new object of class '<em>EDialog Pane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EDialog Pane</em>'.
	 * @generated
	 */
	EDialogPane createEDialogPane();

	/**
	 * Returns a new object of class '<em>EGrid Pane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EGrid Pane</em>'.
	 * @generated
	 */
	EGridPane createEGridPane();

	/**
	 * Returns a new object of class '<em>EH Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EH Box</em>'.
	 * @generated
	 */
	EHBox createEHBox();

	/**
	 * Returns a new object of class '<em>EV Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EV Box</em>'.
	 * @generated
	 */
	EVBox createEVBox();

	/**
	 * Returns a new object of class '<em>EFlow Pane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EFlow Pane</em>'.
	 * @generated
	 */
	EFlowPane createEFlowPane();

	/**
	 * Returns a new object of class '<em>ETile Pane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ETile Pane</em>'.
	 * @generated
	 */
	ETilePane createETilePane();

	/**
	 * Returns a new object of class '<em>EAnchor Pane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EAnchor Pane</em>'.
	 * @generated
	 */
	EAnchorPane createEAnchorPane();

	/**
	 * Returns a new object of class '<em>EBorder Pane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EBorder Pane</em>'.
	 * @generated
	 */
	EBorderPane createEBorderPane();

	/**
	 * Returns an instance of data type '<em>EPos</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	Pos createEPos(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>EPos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertEPos(Pos instanceValue);

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MmPackage getMmPackage();

} //MmFactory
