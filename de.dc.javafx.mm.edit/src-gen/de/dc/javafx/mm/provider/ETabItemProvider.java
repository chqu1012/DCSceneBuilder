/**
 */
package de.dc.javafx.mm.provider;

import de.dc.javafx.mm.ETab;
import de.dc.javafx.mm.MmFactory;
import de.dc.javafx.mm.MmPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dc.javafx.mm.ETab} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ETabItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETabItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ETab_id_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ETab_id_feature", "_UI_ETab_type"),
						MmPackage.Literals.ETAB__ID, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ETab_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ETab_name_feature", "_UI_ETab_type"),
						MmPackage.Literals.ETAB__NAME, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						null, null));
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
			childrenFeatures.add(MmPackage.Literals.ETAB__CONTENT);
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
	 * This returns ETab.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ETab"));
	}

	/**
	 * This returns <code>getImage(object)</code> for the column index <code>0</code> or <code>super.getImage(object)</code> otherwise.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText(Object)
	 * @see #getColumnText(Object, int)
	 * @generated
	 */
	@Override
	public Object getColumnImage(Object object, int columnIndex) {
		// TODO: implement this method to return appropriate information for each column.
		// Ensure that you remove @generated or mark it @generated NOT
		return columnIndex == 0 ? getImage(object) : super.getImage(object);
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
		String label = ((ETab) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ETab_type")
				: getString("_UI_ETab_type") + " " + label;
	}

	/**
	 * This returns <code>getText(object)</code> for the column index <code>0</code> or <code>super.getText(object)</code> otherwise.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage(Object)
	 * @see #getColumnImage(Object, int)
	 * @generated
	 */
	@Override
	public String getColumnText(Object object, int columnIndex) {
		// TODO: implement this method to return appropriate information for each column.
		// Ensure that you remove @generated or mark it @generated NOT
		return columnIndex == 0 ? getText(object) : super.getText(object);
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

		switch (notification.getFeatureID(ETab.class)) {
		case MmPackage.ETAB__ID:
		case MmPackage.ETAB__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case MmPackage.ETAB__CONTENT:
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

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createEGroup()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createEText()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createELabel()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createEButton()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createECheckBox()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createEHyperlink()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createEMenuButton()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createESplitMenuButton()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createEToogleButton()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createETableView()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createEFilteredTableView()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createEListView()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createERadioButton()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createECatgeoryAxis()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createEValueAxis()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createEPieChart()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createEXYChart()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createEPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createEStackPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createEDialogPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createEGridPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createEHBox()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createEVBox()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createEFlowPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createESplitPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createETilePane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createEAnchorPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createEBorderPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createEImageView()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createEScrollPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createEWebView()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createETabPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createEAreaChart()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createEBarChart()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createEBubbleChart()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createELineChart()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createEScatterChart()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createEStackedAreaChart()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.ETAB__CONTENT, MmFactory.eINSTANCE.createEStackedBarChart()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MmEditPlugin.INSTANCE;
	}

}
