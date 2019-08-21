/**
 */
package de.dc.javafx.mm.impl;

import de.dc.javafx.mm.EBorderPane;
import de.dc.javafx.mm.ENode;
import de.dc.javafx.mm.MmPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EBorder Pane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.impl.EBorderPaneImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.EBorderPaneImpl#getRight <em>Right</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.EBorderPaneImpl#getTop <em>Top</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.EBorderPaneImpl#getBottom <em>Bottom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EBorderPaneImpl extends EPaneImpl implements EBorderPane {
	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected ENode left;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected ENode right;

	/**
	 * The cached value of the '{@link #getTop() <em>Top</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTop()
	 * @generated
	 * @ordered
	 */
	protected ENode top;

	/**
	 * The cached value of the '{@link #getBottom() <em>Bottom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottom()
	 * @generated
	 * @ordered
	 */
	protected ENode bottom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EBorderPaneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmPackage.Literals.EBORDER_PANE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ENode getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(ENode newLeft, NotificationChain msgs) {
		ENode oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MmPackage.EBORDER_PANE__LEFT,
					oldLeft, newLeft);
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
	public void setLeft(ENode newLeft) {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject) left).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MmPackage.EBORDER_PANE__LEFT, null, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject) newLeft).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MmPackage.EBORDER_PANE__LEFT, null, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.EBORDER_PANE__LEFT, newLeft, newLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ENode getRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRight(ENode newRight, NotificationChain msgs) {
		ENode oldRight = right;
		right = newRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MmPackage.EBORDER_PANE__RIGHT, oldRight, newRight);
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
	public void setRight(ENode newRight) {
		if (newRight != right) {
			NotificationChain msgs = null;
			if (right != null)
				msgs = ((InternalEObject) right).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MmPackage.EBORDER_PANE__RIGHT, null, msgs);
			if (newRight != null)
				msgs = ((InternalEObject) newRight).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MmPackage.EBORDER_PANE__RIGHT, null, msgs);
			msgs = basicSetRight(newRight, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.EBORDER_PANE__RIGHT, newRight, newRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ENode getTop() {
		return top;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTop(ENode newTop, NotificationChain msgs) {
		ENode oldTop = top;
		top = newTop;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MmPackage.EBORDER_PANE__TOP,
					oldTop, newTop);
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
	public void setTop(ENode newTop) {
		if (newTop != top) {
			NotificationChain msgs = null;
			if (top != null)
				msgs = ((InternalEObject) top).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MmPackage.EBORDER_PANE__TOP, null, msgs);
			if (newTop != null)
				msgs = ((InternalEObject) newTop).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MmPackage.EBORDER_PANE__TOP, null, msgs);
			msgs = basicSetTop(newTop, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.EBORDER_PANE__TOP, newTop, newTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ENode getBottom() {
		return bottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBottom(ENode newBottom, NotificationChain msgs) {
		ENode oldBottom = bottom;
		bottom = newBottom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MmPackage.EBORDER_PANE__BOTTOM, oldBottom, newBottom);
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
	public void setBottom(ENode newBottom) {
		if (newBottom != bottom) {
			NotificationChain msgs = null;
			if (bottom != null)
				msgs = ((InternalEObject) bottom).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MmPackage.EBORDER_PANE__BOTTOM, null, msgs);
			if (newBottom != null)
				msgs = ((InternalEObject) newBottom).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MmPackage.EBORDER_PANE__BOTTOM, null, msgs);
			msgs = basicSetBottom(newBottom, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.EBORDER_PANE__BOTTOM, newBottom,
					newBottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MmPackage.EBORDER_PANE__LEFT:
			return basicSetLeft(null, msgs);
		case MmPackage.EBORDER_PANE__RIGHT:
			return basicSetRight(null, msgs);
		case MmPackage.EBORDER_PANE__TOP:
			return basicSetTop(null, msgs);
		case MmPackage.EBORDER_PANE__BOTTOM:
			return basicSetBottom(null, msgs);
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
		case MmPackage.EBORDER_PANE__LEFT:
			return getLeft();
		case MmPackage.EBORDER_PANE__RIGHT:
			return getRight();
		case MmPackage.EBORDER_PANE__TOP:
			return getTop();
		case MmPackage.EBORDER_PANE__BOTTOM:
			return getBottom();
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
		case MmPackage.EBORDER_PANE__LEFT:
			setLeft((ENode) newValue);
			return;
		case MmPackage.EBORDER_PANE__RIGHT:
			setRight((ENode) newValue);
			return;
		case MmPackage.EBORDER_PANE__TOP:
			setTop((ENode) newValue);
			return;
		case MmPackage.EBORDER_PANE__BOTTOM:
			setBottom((ENode) newValue);
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
		case MmPackage.EBORDER_PANE__LEFT:
			setLeft((ENode) null);
			return;
		case MmPackage.EBORDER_PANE__RIGHT:
			setRight((ENode) null);
			return;
		case MmPackage.EBORDER_PANE__TOP:
			setTop((ENode) null);
			return;
		case MmPackage.EBORDER_PANE__BOTTOM:
			setBottom((ENode) null);
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
		case MmPackage.EBORDER_PANE__LEFT:
			return left != null;
		case MmPackage.EBORDER_PANE__RIGHT:
			return right != null;
		case MmPackage.EBORDER_PANE__TOP:
			return top != null;
		case MmPackage.EBORDER_PANE__BOTTOM:
			return bottom != null;
		}
		return super.eIsSet(featureID);
	}

} //EBorderPaneImpl
