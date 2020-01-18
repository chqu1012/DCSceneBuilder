/**
 */
package de.dc.javafx.mm.impl;

import de.dc.javafx.mm.EBinding;
import de.dc.javafx.mm.EBindingDirection;
import de.dc.javafx.mm.EBindingType;
import de.dc.javafx.mm.EControlBinding;
import de.dc.javafx.mm.ENode;
import de.dc.javafx.mm.MmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EBinding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.impl.EBindingImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.EBindingImpl#getNode <em>Node</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.EBindingImpl#getBindingType <em>Binding Type</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.EBindingImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.EBindingImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EBindingImpl extends MinimalEObjectImpl.Container implements EBinding {
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
	 * The cached value of the '{@link #getNode() <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected ENode node;

	/**
	 * The default value of the '{@link #getBindingType() <em>Binding Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingType()
	 * @generated
	 * @ordered
	 */
	protected static final EBindingType BINDING_TYPE_EDEFAULT = EBindingType.STRING_PROPERTY;

	/**
	 * The cached value of the '{@link #getBindingType() <em>Binding Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingType()
	 * @generated
	 * @ordered
	 */
	protected EBindingType bindingType = BINDING_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBinding() <em>Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected static final EControlBinding BINDING_EDEFAULT = EControlBinding.TEXT_PROPERTY;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected EControlBinding binding = BINDING_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final EBindingDirection DIRECTION_EDEFAULT = EBindingDirection.BIND;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected EBindingDirection direction = DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmPackage.Literals.EBINDING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.EBINDING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ENode getNode() {
		if (node != null && node.eIsProxy()) {
			InternalEObject oldNode = (InternalEObject) node;
			node = (ENode) eResolveProxy(oldNode);
			if (node != oldNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MmPackage.EBINDING__NODE, oldNode, node));
			}
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENode basicGetNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNode(ENode newNode) {
		ENode oldNode = node;
		node = newNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.EBINDING__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EBindingType getBindingType() {
		return bindingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBindingType(EBindingType newBindingType) {
		EBindingType oldBindingType = bindingType;
		bindingType = newBindingType == null ? BINDING_TYPE_EDEFAULT : newBindingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.EBINDING__BINDING_TYPE, oldBindingType,
					bindingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EControlBinding getBinding() {
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBinding(EControlBinding newBinding) {
		EControlBinding oldBinding = binding;
		binding = newBinding == null ? BINDING_EDEFAULT : newBinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.EBINDING__BINDING, oldBinding, binding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EBindingDirection getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirection(EBindingDirection newDirection) {
		EBindingDirection oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.EBINDING__DIRECTION, oldDirection,
					direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MmPackage.EBINDING__NAME:
			return getName();
		case MmPackage.EBINDING__NODE:
			if (resolve)
				return getNode();
			return basicGetNode();
		case MmPackage.EBINDING__BINDING_TYPE:
			return getBindingType();
		case MmPackage.EBINDING__BINDING:
			return getBinding();
		case MmPackage.EBINDING__DIRECTION:
			return getDirection();
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
		case MmPackage.EBINDING__NAME:
			setName((String) newValue);
			return;
		case MmPackage.EBINDING__NODE:
			setNode((ENode) newValue);
			return;
		case MmPackage.EBINDING__BINDING_TYPE:
			setBindingType((EBindingType) newValue);
			return;
		case MmPackage.EBINDING__BINDING:
			setBinding((EControlBinding) newValue);
			return;
		case MmPackage.EBINDING__DIRECTION:
			setDirection((EBindingDirection) newValue);
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
		case MmPackage.EBINDING__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MmPackage.EBINDING__NODE:
			setNode((ENode) null);
			return;
		case MmPackage.EBINDING__BINDING_TYPE:
			setBindingType(BINDING_TYPE_EDEFAULT);
			return;
		case MmPackage.EBINDING__BINDING:
			setBinding(BINDING_EDEFAULT);
			return;
		case MmPackage.EBINDING__DIRECTION:
			setDirection(DIRECTION_EDEFAULT);
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
		case MmPackage.EBINDING__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MmPackage.EBINDING__NODE:
			return node != null;
		case MmPackage.EBINDING__BINDING_TYPE:
			return bindingType != BINDING_TYPE_EDEFAULT;
		case MmPackage.EBINDING__BINDING:
			return binding != BINDING_EDEFAULT;
		case MmPackage.EBINDING__DIRECTION:
			return direction != DIRECTION_EDEFAULT;
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
		result.append(", bindingType: ");
		result.append(bindingType);
		result.append(", binding: ");
		result.append(binding);
		result.append(", direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //EBindingImpl
