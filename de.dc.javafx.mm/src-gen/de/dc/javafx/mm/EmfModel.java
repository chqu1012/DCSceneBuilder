/**
 */
package de.dc.javafx.mm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emf Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.EmfModel#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link de.dc.javafx.mm.EmfModel#getController <em>Controller</em>}</li>
 *   <li>{@link de.dc.javafx.mm.EmfModel#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.mm.EmfModel#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link de.dc.javafx.mm.EmfModel#getBindingModel <em>Binding Model</em>}</li>
 *   <li>{@link de.dc.javafx.mm.EmfModel#getRoot <em>Root</em>}</li>
 *   <li>{@link de.dc.javafx.mm.EmfModel#getBeans <em>Beans</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.mm.MmPackage#getEmfModel()
 * @model
 * @generated
 */
public interface EmfModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' attribute.
	 * @see #setBasePackage(String)
	 * @see de.dc.javafx.mm.MmPackage#getEmfModel_BasePackage()
	 * @model unique="false"
	 * @generated
	 */
	String getBasePackage();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EmfModel#getBasePackage <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' attribute.
	 * @see #getBasePackage()
	 * @generated
	 */
	void setBasePackage(String value);

	/**
	 * Returns the value of the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' attribute.
	 * @see #setController(String)
	 * @see de.dc.javafx.mm.MmPackage#getEmfModel_Controller()
	 * @model unique="false"
	 * @generated
	 */
	String getController();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EmfModel#getController <em>Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller</em>' attribute.
	 * @see #getController()
	 * @generated
	 */
	void setController(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.javafx.mm.MmPackage#getEmfModel_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EmfModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Style Class</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Class</em>' attribute list.
	 * @see de.dc.javafx.mm.MmPackage#getEmfModel_StyleClass()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getStyleClass();

	/**
	 * Returns the value of the '<em><b>Binding Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Model</em>' containment reference.
	 * @see #setBindingModel(EBindingModel)
	 * @see de.dc.javafx.mm.MmPackage#getEmfModel_BindingModel()
	 * @model containment="true"
	 * @generated
	 */
	EBindingModel getBindingModel();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EmfModel#getBindingModel <em>Binding Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Model</em>' containment reference.
	 * @see #getBindingModel()
	 * @generated
	 */
	void setBindingModel(EBindingModel value);

	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(ENode)
	 * @see de.dc.javafx.mm.MmPackage#getEmfModel_Root()
	 * @model containment="true"
	 * @generated
	 */
	ENode getRoot();

	/**
	 * Sets the value of the '{@link de.dc.javafx.mm.EmfModel#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(ENode value);

	/**
	 * Returns the value of the '<em><b>Beans</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.mm.EBean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beans</em>' containment reference list.
	 * @see de.dc.javafx.mm.MmPackage#getEmfModel_Beans()
	 * @model containment="true"
	 * @generated
	 */
	EList<EBean> getBeans();

} // EmfModel
