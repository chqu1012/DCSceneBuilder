/**
 */
package de.dc.javafx.mm.impl;

import de.dc.javafx.mm.EBean;
import de.dc.javafx.mm.EField;
import de.dc.javafx.mm.MmPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EBean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.impl.EBeanImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.EBeanImpl#getInstanceName <em>Instance Name</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.EBeanImpl#isGenerateClass <em>Generate Class</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.EBeanImpl#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EBeanImpl extends MinimalEObjectImpl.Container implements EBean {
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
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<EField> fields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EBeanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmPackage.Literals.EBEAN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.EBEAN__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.EBEAN__INSTANCE_NAME, oldInstanceName,
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
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.EBEAN__GENERATE_CLASS, oldGenerateClass,
					generateClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<EField>(EField.class, this, MmPackage.EBEAN__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MmPackage.EBEAN__FIELDS:
			return ((InternalEList<?>) getFields()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MmPackage.EBEAN__NAME:
			return getName();
		case MmPackage.EBEAN__INSTANCE_NAME:
			return getInstanceName();
		case MmPackage.EBEAN__GENERATE_CLASS:
			return isGenerateClass();
		case MmPackage.EBEAN__FIELDS:
			return getFields();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MmPackage.EBEAN__NAME:
			setName((String) newValue);
			return;
		case MmPackage.EBEAN__INSTANCE_NAME:
			setInstanceName((String) newValue);
			return;
		case MmPackage.EBEAN__GENERATE_CLASS:
			setGenerateClass((Boolean) newValue);
			return;
		case MmPackage.EBEAN__FIELDS:
			getFields().clear();
			getFields().addAll((Collection<? extends EField>) newValue);
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
		case MmPackage.EBEAN__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MmPackage.EBEAN__INSTANCE_NAME:
			setInstanceName(INSTANCE_NAME_EDEFAULT);
			return;
		case MmPackage.EBEAN__GENERATE_CLASS:
			setGenerateClass(GENERATE_CLASS_EDEFAULT);
			return;
		case MmPackage.EBEAN__FIELDS:
			getFields().clear();
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
		case MmPackage.EBEAN__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MmPackage.EBEAN__INSTANCE_NAME:
			return INSTANCE_NAME_EDEFAULT == null ? instanceName != null : !INSTANCE_NAME_EDEFAULT.equals(instanceName);
		case MmPackage.EBEAN__GENERATE_CLASS:
			return generateClass != GENERATE_CLASS_EDEFAULT;
		case MmPackage.EBEAN__FIELDS:
			return fields != null && !fields.isEmpty();
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

} //EBeanImpl
