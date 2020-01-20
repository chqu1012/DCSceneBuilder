/**
 */
package de.dc.javafx.mm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETable View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.ETableViewModel#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see de.dc.javafx.mm.MmPackage#getETableViewModel()
 * @model
 * @generated
 */
public interface ETableViewModel extends EViewModel {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.javafx.mm.ETableViewModelField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see de.dc.javafx.mm.MmPackage#getETableViewModel_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<ETableViewModelField> getFields();

} // ETableViewModel
