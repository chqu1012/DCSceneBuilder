/**
 */
package de.dc.javafx.mm.provider;

import de.dc.javafx.mm.ENode;
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
 * This is the item provider adapter for a {@link de.dc.javafx.mm.ENode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ENodeItemProvider extends StyleableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENodeItemProvider(AdapterFactory adapterFactory) {
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

			addOnActionPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addOpacityPropertyDescriptor(object);
			addVisiblePropertyDescriptor(object);
			addDisablePropertyDescriptor(object);
			addStylePropertyDescriptor(object);
			addStyleClassPropertyDescriptor(object);
			addLayoutXPropertyDescriptor(object);
			addLayoutYPropertyDescriptor(object);
			addMaxHeightPropertyDescriptor(object);
			addMinHeightPropertyDescriptor(object);
			addPrefHeightPropertyDescriptor(object);
			addMaxWidthPropertyDescriptor(object);
			addMinWidthPropertyDescriptor(object);
			addPrefWidthPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the On Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EEvents_onAction_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EEvents_onAction_feature",
								"_UI_EEvents_type"),
						MmPackage.Literals.EEVENTS__ON_ACTION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_EventsPropertyCategory"), null));
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
						getResourceLocator(), getString("_UI_ENode_id_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ENode_id_feature", "_UI_ENode_type"),
						MmPackage.Literals.ENODE__ID, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						getString("_UI_BasePropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Layout X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayoutXPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ENode_layoutX_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ENode_layoutX_feature", "_UI_ENode_type"),
						MmPackage.Literals.ENODE__LAYOUT_X, true, false, false, ItemPropertyDescriptor.REAL_VALUE_IMAGE,
						getString("_UI_LayoutPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Layout Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayoutYPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ENode_layoutY_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ENode_layoutY_feature", "_UI_ENode_type"),
						MmPackage.Literals.ENODE__LAYOUT_Y, true, false, false, ItemPropertyDescriptor.REAL_VALUE_IMAGE,
						getString("_UI_LayoutPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Opacity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOpacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ENode_opacity_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ENode_opacity_feature", "_UI_ENode_type"),
						MmPackage.Literals.ENODE__OPACITY, true, false, false, ItemPropertyDescriptor.REAL_VALUE_IMAGE,
						getString("_UI_BasePropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ENode_style_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ENode_style_feature", "_UI_ENode_type"),
						MmPackage.Literals.ENODE__STYLE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						getString("_UI_BasePropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Style Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStyleClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ENode_styleClass_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ENode_styleClass_feature",
								"_UI_ENode_type"),
						MmPackage.Literals.ENODE__STYLE_CLASS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_BasePropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Visible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ENode_visible_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ENode_visible_feature", "_UI_ENode_type"),
						MmPackage.Literals.ENODE__VISIBLE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString("_UI_BasePropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Disable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisablePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ENode_disable_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ENode_disable_feature", "_UI_ENode_type"),
						MmPackage.Literals.ENODE__DISABLE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, getString("_UI_BasePropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Max Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ENode_maxHeight_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ENode_maxHeight_feature",
								"_UI_ENode_type"),
						MmPackage.Literals.ENODE__MAX_HEIGHT, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, getString("_UI_LayoutPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Min Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ENode_minHeight_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ENode_minHeight_feature",
								"_UI_ENode_type"),
						MmPackage.Literals.ENODE__MIN_HEIGHT, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, getString("_UI_LayoutPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Pref Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrefHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ENode_prefHeight_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ENode_prefHeight_feature",
								"_UI_ENode_type"),
						MmPackage.Literals.ENODE__PREF_HEIGHT, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, getString("_UI_LayoutPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Max Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ENode_maxWidth_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ENode_maxWidth_feature", "_UI_ENode_type"),
						MmPackage.Literals.ENODE__MAX_WIDTH, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, getString("_UI_LayoutPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Min Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ENode_minWidth_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ENode_minWidth_feature", "_UI_ENode_type"),
						MmPackage.Literals.ENODE__MIN_WIDTH, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, getString("_UI_LayoutPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Pref Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrefWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ENode_prefWidth_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ENode_prefWidth_feature",
								"_UI_ENode_type"),
						MmPackage.Literals.ENODE__PREF_WIDTH, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, getString("_UI_LayoutPropertyCategory"), null));
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
			childrenFeatures.add(MmPackage.Literals.ENODE__MARGIN);
			childrenFeatures.add(MmPackage.Literals.ENODE__PADDING);
			childrenFeatures.add(MmPackage.Literals.ENODE__CHILDREN);
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
		String label = ((ENode) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_ENode_type")
				: getString("_UI_ENode_type") + " " + label;
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

		switch (notification.getFeatureID(ENode.class)) {
		case MmPackage.ENODE__ON_ACTION:
		case MmPackage.ENODE__ID:
		case MmPackage.ENODE__OPACITY:
		case MmPackage.ENODE__VISIBLE:
		case MmPackage.ENODE__DISABLE:
		case MmPackage.ENODE__STYLE:
		case MmPackage.ENODE__STYLE_CLASS:
		case MmPackage.ENODE__LAYOUT_X:
		case MmPackage.ENODE__LAYOUT_Y:
		case MmPackage.ENODE__MAX_HEIGHT:
		case MmPackage.ENODE__MIN_HEIGHT:
		case MmPackage.ENODE__PREF_HEIGHT:
		case MmPackage.ENODE__MAX_WIDTH:
		case MmPackage.ENODE__MIN_WIDTH:
		case MmPackage.ENODE__PREF_WIDTH:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case MmPackage.ENODE__MARGIN:
		case MmPackage.ENODE__PADDING:
		case MmPackage.ENODE__CHILDREN:
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
				.add(createChildParameter(MmPackage.Literals.ENODE__MARGIN, MmFactory.eINSTANCE.createEInsets()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ENODE__PADDING, MmFactory.eINSTANCE.createEInsets()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createEGroup()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createEText()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createELabel()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createEButton()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createECheckBox()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createEHyperlink()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createEMenuButton()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createESplitMenuButton()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createEToogleButton()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createETableView()));

		newChildDescriptors.add(createChildParameter(MmPackage.Literals.ENODE__CHILDREN,
				MmFactory.eINSTANCE.createEFilteredTableView()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createEListView()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createERadioButton()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createECatgeoryAxis()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createEValueAxis()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createEPieChart()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createEXYChart()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createEPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createEStackPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createEDialogPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createEGridPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createEHBox()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createEVBox()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createEFlowPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createESplitPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createETilePane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createEAnchorPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createEBorderPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createEImageView()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createEScrollPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createEWebView()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createETabPane()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createEAreaChart()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createEBarChart()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createEBubbleChart()));

		newChildDescriptors
				.add(createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createELineChart()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createEScatterChart()));

		newChildDescriptors.add(createChildParameter(MmPackage.Literals.ENODE__CHILDREN,
				MmFactory.eINSTANCE.createEStackedAreaChart()));

		newChildDescriptors.add(
				createChildParameter(MmPackage.Literals.ENODE__CHILDREN, MmFactory.eINSTANCE.createEStackedBarChart()));
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
				|| childFeature == MmPackage.Literals.ENODE__PADDING;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
