/**
 */
package de.dc.javafx.mm.impl;

import de.dc.javafx.mm.EViewModel;
import de.dc.javafx.mm.MmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EView Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.impl.EViewModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.EViewModelImpl#getInstanceName <em>Instance Name</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.EViewModelImpl#isGenerateClass <em>Generate Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EViewModelImpl extends MinimalEObjectImpl.Container implements EViewModel {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceName() <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceName()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceName() <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceName()
	 * @generated
	 * @ordered
	 */
	protected String instanceName = INSTANCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateClass() <em>Generate Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateClass()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_CLASS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGenerateClass() <em>Generate Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateClass()
	 * @generated
	 * @ordered
	 */
	protected boolean generateClass = GENERATE_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmPackage.Literals.EVIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.EVIEW_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstanceName() {
		return instanceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstanceName(String newInstanceName) {
		String oldInstanceName = instanceName;
		instanceName = newInstanceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.EVIEW_MODEL__INSTANCE_NAME, oldInstanceName,
					instanceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGenerateClass() {
		return generateClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerateClass(boolean newGenerateClass) {
		boolean oldGenerateClass = generateClass;
		generateClass = newGenerateClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.EVIEW_MODEL__GENERATE_CLASS,
					oldGenerateClass, generateClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MmPackage.EVIEW_MODEL__NAME:
			return getName();
		case MmPackage.EVIEW_MODEL__INSTANCE_NAME:
			return getInstanceName();
		case MmPackage.EVIEW_MODEL__GENERATE_CLASS:
			return isGenerateClass();
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
		case MmPackage.EVIEW_MODEL__NAME:
			setName((String) newValue);
			return;
		case MmPackage.EVIEW_MODEL__INSTANCE_NAME:
			setInstanceName((String) newValue);
			return;
		case MmPackage.EVIEW_MODEL__GENERATE_CLASS:
			setGenerateClass((Boolean) newValue);
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
		case MmPackage.EVIEW_MODEL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MmPackage.EVIEW_MODEL__INSTANCE_NAME:
			setInstanceName(INSTANCE_NAME_EDEFAULT);
			return;
		case MmPackage.EVIEW_MODEL__GENERATE_CLASS:
			setGenerateClass(GENERATE_CLASS_EDEFAULT);
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
		case MmPackage.EVIEW_MODEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MmPackage.EVIEW_MODEL__INSTANCE_NAME:
			return INSTANCE_NAME_EDEFAULT == null ? instanceName != null : !INSTANCE_NAME_EDEFAULT.equals(instanceName);
		case MmPackage.EVIEW_MODEL__GENERATE_CLASS:
			return generateClass != GENERATE_CLASS_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", instanceName: ");
		result.append(instanceName);
		result.append(", generateClass: ");
		result.append(generateClass);
		result.append(')');
		return result.toString();
	}

} //EViewModelImpl
