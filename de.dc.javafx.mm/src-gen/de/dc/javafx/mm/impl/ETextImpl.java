/**
 */
package de.dc.javafx.mm.impl;

import de.dc.javafx.mm.EText;
import de.dc.javafx.mm.MmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EText</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.impl.ETextImpl#getPromtText <em>Promt Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ETextImpl extends ELabeledImpl implements EText {
	/**
	 * The default value of the '{@link #getPromtText() <em>Promt Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromtText()
	 * @generated
	 * @ordered
	 */
	protected static final String PROMT_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPromtText() <em>Promt Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromtText()
	 * @generated
	 * @ordered
	 */
	protected String promtText = PROMT_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ETextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmPackage.Literals.ETEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPromtText() {
		return promtText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPromtText(String newPromtText) {
		String oldPromtText = promtText;
		promtText = newPromtText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.ETEXT__PROMT_TEXT, oldPromtText,
					promtText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MmPackage.ETEXT__PROMT_TEXT:
			return getPromtText();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MmPackage.ETEXT__PROMT_TEXT:
			setPromtText((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MmPackage.ETEXT__PROMT_TEXT:
			setPromtText(PROMT_TEXT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MmPackage.ETEXT__PROMT_TEXT:
			return PROMT_TEXT_EDEFAULT == null ? promtText != null : !PROMT_TEXT_EDEFAULT.equals(promtText);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (promtText: ");
		result.append(promtText);
		result.append(')');
		return result.toString();
	}

} //ETextImpl
