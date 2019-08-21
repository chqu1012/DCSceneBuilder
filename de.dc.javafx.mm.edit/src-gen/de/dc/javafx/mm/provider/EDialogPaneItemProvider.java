/**
 */
package de.dc.javafx.mm.provider;

import de.dc.javafx.mm.EDialogPane;
import de.dc.javafx.mm.MmFactory;
import de.dc.javafx.mm.MmPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dc.javafx.mm.EDialogPane} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EDialogPaneItemProvider extends EPaneItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDialogPaneItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addHeaderPropertyDescriptor(object);
			addHeaderTextPropertyDescriptor(object);
			addContentTextPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Header feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeaderPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EDialogPane_header_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EDialogPane_header_feature",
								"_UI_EDialogPane_type"),
						MmPackage.Literals.EDIALOG_PANE__HEADER, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Header Text feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeaderTextPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EDialogPane_headerText_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EDialogPane_headerText_feature",
								"_UI_EDialogPane_type"),
						MmPackage.Literals.EDIALOG_PANE__HEADER_TEXT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Content Text feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentTextPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EDialogPane_contentText_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EDialogPane_contentText_feature",
								"_UI_EDialogPane_type"),
						MmPackage.Literals.EDIALOG_PANE__CONTENT_TEXT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MmPackage.Literals.EDIALOG_PANE__CONTENT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns EDialogPane.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EDialogPane"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		EDialogPane eDialogPane = (EDialogPane) object;
		return getString("_UI_EDialogPane_type") + " " + eDialogPane.getLayoutX();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(EDialogPane.class)) {
		case MmPackage.EDIALOG_PANE__HEADER:
		case MmPackage.EDIALOG_PANE__HEADER_TEXT:
		case MmPackage.EDIALOG_PANE__CONTENT_TEXT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case MmPackage.EDIALOG_PANE__CONTENT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EDIALOG_PANE__CONTENT, MmFactory.eINSTANCE.createERegion()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EDIALOG_PANE__CONTENT, MmFactory.eINSTANCE.createEGroup()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EDIALOG_PANE__CONTENT, MmFactory.eINSTANCE.createEWebView()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EDIALOG_PANE__CONTENT, MmFactory.eINSTANCE.createELabel()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EDIALOG_PANE__CONTENT, MmFactory.eINSTANCE.createEButton()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EDIALOG_PANE__CONTENT, MmFactory.eINSTANCE.createECheckBox()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EDIALOG_PANE__CONTENT, MmFactory.eINSTANCE.createEHyperlink()));

		newChildDescriptors.add(createChildParameter(MmPackage.Literals.EDIALOG_PANE__CONTENT,
				MmFactory.eINSTANCE.createEMenuButton()));

		newChildDescriptors.add(createChildParameter(MmPackage.Literals.EDIALOG_PANE__CONTENT,
				MmFactory.eINSTANCE.createESplitMenuButton()));

		newChildDescriptors.add(createChildParameter(MmPackage.Literals.EDIALOG_PANE__CONTENT,
				MmFactory.eINSTANCE.createEToogleButton()));

		newChildDescriptors.add(createChildParameter(MmPackage.Literals.EDIALOG_PANE__CONTENT,
				MmFactory.eINSTANCE.createERadioButton()));

		newChildDescriptors.add(createChildParameter(MmPackage.Literals.EDIALOG_PANE__CONTENT,
				MmFactory.eINSTANCE.createECatgeoryAxis()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EDIALOG_PANE__CONTENT, MmFactory.eINSTANCE.createEValueAxis()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EDIALOG_PANE__CONTENT, MmFactory.eINSTANCE.createEPieChart()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EDIALOG_PANE__CONTENT, MmFactory.eINSTANCE.createEXYChart()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EDIALOG_PANE__CONTENT, MmFactory.eINSTANCE.createEPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EDIALOG_PANE__CONTENT, MmFactory.eINSTANCE.createEStackPane()));

		newChildDescriptors.add(createChildParameter(MmPackage.Literals.EDIALOG_PANE__CONTENT,
				MmFactory.eINSTANCE.createEDialogPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EDIALOG_PANE__CONTENT, MmFactory.eINSTANCE.createEGridPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EDIALOG_PANE__CONTENT, MmFactory.eINSTANCE.createEHBox()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.EDIALOG_PANE__CONTENT, MmFactory.eINSTANCE.createEVBox()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EDIALOG_PANE__CONTENT, MmFactory.eINSTANCE.createEFlowPane()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.EDIALOG_PANE__CONTENT, MmFactory.eINSTANCE.createETilePane()));

		newChildDescriptors.add(createChildParameter(MmPackage.Literals.EDIALOG_PANE__CONTENT,
				MmFactory.eINSTANCE.createEAnchorPane()));

		newChildDescriptors.add(createChildParameter(MmPackage.Literals.EDIALOG_PANE__CONTENT,
				MmFactory.eINSTANCE.createEBorderPane()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == MmPackage.Literals.ENODE__MARGIN
				|| childFeature == MmPackage.Literals.EREGION__PADDING
				|| childFeature == MmPackage.Literals.EPARENT__CHILDREN
				|| childFeature == MmPackage.Literals.EDIALOG_PANE__CONTENT;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
