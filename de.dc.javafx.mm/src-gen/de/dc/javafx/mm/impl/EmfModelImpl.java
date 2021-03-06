/**
 */
package de.dc.javafx.mm.impl;

import de.dc.javafx.mm.EBean;
import de.dc.javafx.mm.EBindingModel;
import de.dc.javafx.mm.ENode;
import de.dc.javafx.mm.EmfModel;
import de.dc.javafx.mm.MmPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emf Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.impl.EmfModelImpl#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.EmfModelImpl#getController <em>Controller</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.EmfModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.EmfModelImpl#getStyleClass <em>Style Class</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.EmfModelImpl#getBindingModel <em>Binding Model</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.EmfModelImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.EmfModelImpl#getBeans <em>Beans</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmfModelImpl extends MinimalEObjectImpl.Container implements EmfModel {
	/**
	 * The default value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected String basePackage = BASE_PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getController() <em>Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROLLER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getController() <em>Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected String controller = CONTROLLER_EDEFAULT;

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
	 * The cached value of the '{@link #getStyleClass() <em>Style Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleClass()
	 * @generated
	 * @ordered
	 */
	protected EList<String> styleClass;

	/**
	 * The cached value of the '{@link #getBindingModel() <em>Binding Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingModel()
	 * @generated
	 * @ordered
	 */
	protected EBindingModel bindingModel;

	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected ENode root;

	/**
	 * The cached value of the '{@link #getBeans() <em>Beans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeans()
	 * @generated
	 * @ordered
	 */
	protected EList<EBean> beans;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmfModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmPackage.Literals.EMF_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBasePackage() {
		return basePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBasePackage(String newBasePackage) {
		String oldBasePackage = basePackage;
		basePackage = newBasePackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.EMF_MODEL__BASE_PACKAGE, oldBasePackage,
					basePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getController() {
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setController(String newController) {
		String oldController = controller;
		controller = newController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.EMF_MODEL__CONTROLLER, oldController,
					controller));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.EMF_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getStyleClass() {
		if (styleClass == null) {
			styleClass = new EDataTypeEList<String>(String.class, this, MmPackage.EMF_MODEL__STYLE_CLASS);
		}
		return styleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EBindingModel getBindingModel() {
		return bindingModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBindingModel(EBindingModel newBindingModel, NotificationChain msgs) {
		EBindingModel oldBindingModel = bindingModel;
		bindingModel = newBindingModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MmPackage.EMF_MODEL__BINDING_MODEL, oldBindingModel, newBindingModel);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBindingModel(EBindingModel newBindingModel) {
		if (newBindingModel != bindingModel) {
			NotificationChain msgs = null;
			if (bindingModel != null)
				msgs = ((InternalEObject) bindingModel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MmPackage.EMF_MODEL__BINDING_MODEL, null, msgs);
			if (newBindingModel != null)
				msgs = ((InternalEObject) newBindingModel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MmPackage.EMF_MODEL__BINDING_MODEL, null, msgs);
			msgs = basicSetBindingModel(newBindingModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.EMF_MODEL__BINDING_MODEL, newBindingModel,
					newBindingModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ENode getRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot(ENode newRoot, NotificationChain msgs) {
		ENode oldRoot = root;
		root = newRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MmPackage.EMF_MODEL__ROOT,
					oldRoot, newRoot);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoot(ENode newRoot) {
		if (newRoot != root) {
			NotificationChain msgs = null;
			if (root != null)
				msgs = ((InternalEObject) root).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MmPackage.EMF_MODEL__ROOT,
						null, msgs);
			if (newRoot != null)
				msgs = ((InternalEObject) newRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MmPackage.EMF_MODEL__ROOT,
						null, msgs);
			msgs = basicSetRoot(newRoot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.EMF_MODEL__ROOT, newRoot, newRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EBean> getBeans() {
		if (beans == null) {
			beans = new EObjectContainmentEList<EBean>(EBean.class, this, MmPackage.EMF_MODEL__BEANS);
		}
		return beans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MmPackage.EMF_MODEL__BINDING_MODEL:
			return basicSetBindingModel(null, msgs);
		case MmPackage.EMF_MODEL__ROOT:
			return basicSetRoot(null, msgs);
		case MmPackage.EMF_MODEL__BEANS:
			return ((InternalEList<?>) getBeans()).basicRemove(otherEnd, msgs);
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
		case MmPackage.EMF_MODEL__BASE_PACKAGE:
			return getBasePackage();
		case MmPackage.EMF_MODEL__CONTROLLER:
			return getController();
		case MmPackage.EMF_MODEL__NAME:
			return getName();
		case MmPackage.EMF_MODEL__STYLE_CLASS:
			return getStyleClass();
		case MmPackage.EMF_MODEL__BINDING_MODEL:
			return getBindingModel();
		case MmPackage.EMF_MODEL__ROOT:
			return getRoot();
		case MmPackage.EMF_MODEL__BEANS:
			return getBeans();
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
		case MmPackage.EMF_MODEL__BASE_PACKAGE:
			setBasePackage((String) newValue);
			return;
		case MmPackage.EMF_MODEL__CONTROLLER:
			setController((String) newValue);
			return;
		case MmPackage.EMF_MODEL__NAME:
			setName((String) newValue);
			return;
		case MmPackage.EMF_MODEL__STYLE_CLASS:
			getStyleClass().clear();
			getStyleClass().addAll((Collection<? extends String>) newValue);
			return;
		case MmPackage.EMF_MODEL__BINDING_MODEL:
			setBindingModel((EBindingModel) newValue);
			return;
		case MmPackage.EMF_MODEL__ROOT:
			setRoot((ENode) newValue);
			return;
		case MmPackage.EMF_MODEL__BEANS:
			getBeans().clear();
			getBeans().addAll((Collection<? extends EBean>) newValue);
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
		case MmPackage.EMF_MODEL__BASE_PACKAGE:
			setBasePackage(BASE_PACKAGE_EDEFAULT);
			return;
		case MmPackage.EMF_MODEL__CONTROLLER:
			setController(CONTROLLER_EDEFAULT);
			return;
		case MmPackage.EMF_MODEL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MmPackage.EMF_MODEL__STYLE_CLASS:
			getStyleClass().clear();
			return;
		case MmPackage.EMF_MODEL__BINDING_MODEL:
			setBindingModel((EBindingModel) null);
			return;
		case MmPackage.EMF_MODEL__ROOT:
			setRoot((ENode) null);
			return;
		case MmPackage.EMF_MODEL__BEANS:
			getBeans().clear();
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
		case MmPackage.EMF_MODEL__BASE_PACKAGE:
			return BASE_PACKAGE_EDEFAULT == null ? basePackage != null : !BASE_PACKAGE_EDEFAULT.equals(basePackage);
		case MmPackage.EMF_MODEL__CONTROLLER:
			return CONTROLLER_EDEFAULT == null ? controller != null : !CONTROLLER_EDEFAULT.equals(controller);
		case MmPackage.EMF_MODEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MmPackage.EMF_MODEL__STYLE_CLASS:
			return styleClass != null && !styleClass.isEmpty();
		case MmPackage.EMF_MODEL__BINDING_MODEL:
			return bindingModel != null;
		case MmPackage.EMF_MODEL__ROOT:
			return root != null;
		case MmPackage.EMF_MODEL__BEANS:
			return beans != null && !beans.isEmpty();
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
		result.append(" (basePackage: ");
		result.append(basePackage);
		result.append(", controller: ");
		result.append(controller);
		result.append(", name: ");
		result.append(name);
		result.append(", styleClass: ");
		result.append(styleClass);
		result.append(')');
		return result.toString();
	}

} //EmfModelImpl
