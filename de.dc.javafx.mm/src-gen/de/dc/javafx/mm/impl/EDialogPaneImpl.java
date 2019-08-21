/**
 */
package de.dc.javafx.mm.impl;

import de.dc.javafx.mm.EDialogPane;
import de.dc.javafx.mm.ENode;
import de.dc.javafx.mm.MmPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EDialog Pane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.javafx.mm.impl.EDialogPaneImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.EDialogPaneImpl#getHeaderText <em>Header Text</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.EDialogPaneImpl#getContentText <em>Content Text</em>}</li>
 *   <li>{@link de.dc.javafx.mm.impl.EDialogPaneImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EDialogPaneImpl extends EPaneImpl implements EDialogPane {
	/**
	 * The default value of the '{@link #getHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected String header = HEADER_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeaderText() <em>Header Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderText()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeaderText() <em>Header Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderText()
	 * @generated
	 * @ordered
	 */
	protected String headerText = HEADER_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentText() <em>Content Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentText()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentText() <em>Content Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentText()
	 * @generated
	 * @ordered
	 */
	protected String contentText = CONTENT_TEXT_EDEFAULT;

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
	protected EDialogPaneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmPackage.Literals.EDIALOG_PANE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeader(String newHeader) {
		String oldHeader = header;
		header = newHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.EDIALOG_PANE__HEADER, oldHeader, header));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeaderText() {
		return headerText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeaderText(String newHeaderText) {
		String oldHeaderText = headerText;
		headerText = newHeaderText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.EDIALOG_PANE__HEADER_TEXT, oldHeaderText,
					headerText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentText() {
		return contentText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentText(String newContentText) {
		String oldContentText = contentText;
		contentText = newContentText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.EDIALOG_PANE__CONTENT_TEXT, oldContentText,
					contentText));
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
					MmPackage.EDIALOG_PANE__CONTENT, oldContent, newContent);
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
						EOPPOSITE_FEATURE_BASE - MmPackage.EDIALOG_PANE__CONTENT, null, msgs);
			if (newContent != null)
				msgs = ((InternalEObject) newContent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MmPackage.EDIALOG_PANE__CONTENT, null, msgs);
			msgs = basicSetContent(newContent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmPackage.EDIALOG_PANE__CONTENT, newContent,
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
		case MmPackage.EDIALOG_PANE__CONTENT:
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
		case MmPackage.EDIALOG_PANE__HEADER:
			return getHeader();
		case MmPackage.EDIALOG_PANE__HEADER_TEXT:
			return getHeaderText();
		case MmPackage.EDIALOG_PANE__CONTENT_TEXT:
			return getContentText();
		case MmPackage.EDIALOG_PANE__CONTENT:
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
		case MmPackage.EDIALOG_PANE__HEADER:
			setHeader((String) newValue);
			return;
		case MmPackage.EDIALOG_PANE__HEADER_TEXT:
			setHeaderText((String) newValue);
			return;
		case MmPackage.EDIALOG_PANE__CONTENT_TEXT:
			setContentText((String) newValue);
			return;
		case MmPackage.EDIALOG_PANE__CONTENT:
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
		case MmPackage.EDIALOG_PANE__HEADER:
			setHeader(HEADER_EDEFAULT);
			return;
		case MmPackage.EDIALOG_PANE__HEADER_TEXT:
			setHeaderText(HEADER_TEXT_EDEFAULT);
			return;
		case MmPackage.EDIALOG_PANE__CONTENT_TEXT:
			setContentText(CONTENT_TEXT_EDEFAULT);
			return;
		case MmPackage.EDIALOG_PANE__CONTENT:
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
		case MmPackage.EDIALOG_PANE__HEADER:
			return HEADER_EDEFAULT == null ? header != null : !HEADER_EDEFAULT.equals(header);
		case MmPackage.EDIALOG_PANE__HEADER_TEXT:
			return HEADER_TEXT_EDEFAULT == null ? headerText != null : !HEADER_TEXT_EDEFAULT.equals(headerText);
		case MmPackage.EDIALOG_PANE__CONTENT_TEXT:
			return CONTENT_TEXT_EDEFAULT == null ? contentText != null : !CONTENT_TEXT_EDEFAULT.equals(contentText);
		case MmPackage.EDIALOG_PANE__CONTENT:
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
		result.append(" (header: ");
		result.append(header);
		result.append(", headerText: ");
		result.append(headerText);
		result.append(", contentText: ");
		result.append(contentText);
		result.append(')');
		return result.toString();
	}

} //EDialogPaneImpl
