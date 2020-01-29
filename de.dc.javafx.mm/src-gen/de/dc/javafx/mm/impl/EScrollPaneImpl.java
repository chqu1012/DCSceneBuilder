/**
 */
package de.dc.javafx.mm.impl;

import de.dc.javafx.mm.ENode;
import de.dc.javafx.mm.EScrollPane;
import de.dc.javafx.mm.MmPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EScroll Pane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.impl.EScrollPaneImpl#isIsPannable <em>Is Pannable</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.EScrollPaneImpl#isFitToWidth <em>Fit To Width</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.EScrollPaneImpl#isFitToHeight <em>Fit To Height</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.EScrollPaneImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EScrollPaneImpl extends EPaneImpl implements EScrollPane {
	/**
	 * The default value of the '{@link #isIsPannable() <em>Is Pannable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPannable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PANNABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsPannable() <em>Is Pannable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPannable()
	 * @generated
	 * @ordered
	 */
	protected boolean isPannable = IS_PANNABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isFitToWidth() <em>Fit To Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFitToWidth()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIT_TO_WIDTH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFitToWidth() <em>Fit To Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFitToWidth()
	 * @generated
	 * @ordered
	 */
	protected boolean fitToWidth = FIT_TO_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #isFitToHeight() <em>Fit To Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFitToHeight()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIT_TO_HEIGHT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFitToHeight() <em>Fit To Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFitToHeight()
	 * @generated
	 * @ordered
	 */
	protected boolean fitToHeight = FIT_TO_HEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected ENode content;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EScrollPaneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmPackage.Literals.ESCROLL_PANE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsPannable() {
		return isPannable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPannable(boolean newIsPannable) {
		boolean oldIsPannable = isPannable;
		isPannable = newIsPannable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.ESCROLL_PANE__IS_PANNABLE, oldIsPannable,
					isPannable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFitToWidth() {
		return fitToWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFitToWidth(boolean newFitToWidth) {
		boolean oldFitToWidth = fitToWidth;
		fitToWidth = newFitToWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.ESCROLL_PANE__FIT_TO_WIDTH, oldFitToWidth,
					fitToWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFitToHeight() {
		return fitToHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFitToHeight(boolean newFitToHeight) {
		boolean oldFitToHeight = fitToHeight;
		fitToHeight = newFitToHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.ESCROLL_PANE__FIT_TO_HEIGHT, oldFitToHeight,
					fitToHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ENode getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContent(ENode newContent, NotificationChain msgs) {
		ENode oldContent = content;
		content = newContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MmPackage.ESCROLL_PANE__CONTENT, oldContent, newContent);
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
	public void setContent(ENode newContent) {
		if (newContent != content) {
			NotificationChain msgs = null;
			if (content != null)
				msgs = ((InternalEObject) content).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MmPackage.ESCROLL_PANE__CONTENT, null, msgs);
			if (newContent != null)
				msgs = ((InternalEObject) newContent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MmPackage.ESCROLL_PANE__CONTENT, null, msgs);
			msgs = basicSetContent(newContent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.ESCROLL_PANE__CONTENT, newContent,
					newContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MmPackage.ESCROLL_PANE__CONTENT:
			return basicSetContent(null, msgs);
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
		case MmPackage.ESCROLL_PANE__IS_PANNABLE:
			return isIsPannable();
		case MmPackage.ESCROLL_PANE__FIT_TO_WIDTH:
			return isFitToWidth();
		case MmPackage.ESCROLL_PANE__FIT_TO_HEIGHT:
			return isFitToHeight();
		case MmPackage.ESCROLL_PANE__CONTENT:
			return getContent();
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
		case MmPackage.ESCROLL_PANE__IS_PANNABLE:
			setIsPannable((Boolean) newValue);
			return;
		case MmPackage.ESCROLL_PANE__FIT_TO_WIDTH:
			setFitToWidth((Boolean) newValue);
			return;
		case MmPackage.ESCROLL_PANE__FIT_TO_HEIGHT:
			setFitToHeight((Boolean) newValue);
			return;
		case MmPackage.ESCROLL_PANE__CONTENT:
			setContent((ENode) newValue);
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
		case MmPackage.ESCROLL_PANE__IS_PANNABLE:
			setIsPannable(IS_PANNABLE_EDEFAULT);
			return;
		case MmPackage.ESCROLL_PANE__FIT_TO_WIDTH:
			setFitToWidth(FIT_TO_WIDTH_EDEFAULT);
			return;
		case MmPackage.ESCROLL_PANE__FIT_TO_HEIGHT:
			setFitToHeight(FIT_TO_HEIGHT_EDEFAULT);
			return;
		case MmPackage.ESCROLL_PANE__CONTENT:
			setContent((ENode) null);
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
		case MmPackage.ESCROLL_PANE__IS_PANNABLE:
			return isPannable != IS_PANNABLE_EDEFAULT;
		case MmPackage.ESCROLL_PANE__FIT_TO_WIDTH:
			return fitToWidth != FIT_TO_WIDTH_EDEFAULT;
		case MmPackage.ESCROLL_PANE__FIT_TO_HEIGHT:
			return fitToHeight != FIT_TO_HEIGHT_EDEFAULT;
		case MmPackage.ESCROLL_PANE__CONTENT:
			return content != null;
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
		result.append(" (isPannable: ");
		result.append(isPannable);
		result.append(", fitToWidth: ");
		result.append(fitToWidth);
		result.append(", fitToHeight: ");
		result.append(fitToHeight);
		result.append(')');
		return result.toString();
	}

} //EScrollPaneImpl
