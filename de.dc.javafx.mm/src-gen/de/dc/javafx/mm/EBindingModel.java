/**
 */
package de.dc.javafx.mm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EBinding Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.EBindingModel#getBindings <em>Bindings</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.mm.MmPackage#getEBindingModel()
 * @model
 * @generated
 */
public interface EBindingModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.mm.EBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see de.dc.javafx.mm.MmPackage#getEBindingModel_Bindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<EBinding> getBindings();

} // EBindingModel
