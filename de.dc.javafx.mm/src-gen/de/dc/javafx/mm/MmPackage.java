/**
 */
package de.dc.javafx.mm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dc.javafx.mm.MmFactory
 * @model kind="package"
 * @generated
 */
public interface MmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.frateranatis.org/javafx";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MmPackage eINSTANCE = de.dc.javafx.mm.impl.MmPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.EmfModelImpl <em>Emf Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.EmfModelImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEmfModel()
	 * @generated
	 */
	int EMF_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_MODEL__BASE_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_MODEL__CONTROLLER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_MODEL__NAME = 2;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_MODEL__STYLE_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Binding Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_MODEL__BINDING_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_MODEL__ROOT = 5;

	/**
	 * The feature id for the '<em><b>Beans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_MODEL__BEANS = 6;

	/**
	 * The number of structural features of the '<em>Emf Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_MODEL_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Emf Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMF_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.EBeanImpl <em>EBean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.EBeanImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEBean()
	 * @generated
	 */
	int EBEAN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBEAN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBEAN__INSTANCE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Generate Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBEAN__GENERATE_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBEAN__FIELDS = 3;

	/**
	 * The number of structural features of the '<em>EBean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBEAN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>EBean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBEAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.EFieldImpl <em>EField</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.EFieldImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEField()
	 * @generated
	 */
	int EFIELD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFIELD__DATATYPE = 1;

	/**
	 * The number of structural features of the '<em>EField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFIELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.EBindingModelImpl <em>EBinding Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.EBindingModelImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEBindingModel()
	 * @generated
	 */
	int EBINDING_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDING_MODEL__BINDINGS = 0;

	/**
	 * The number of structural features of the '<em>EBinding Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDING_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>EBinding Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDING_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.EBindingImpl <em>EBinding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.EBindingImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEBinding()
	 * @generated
	 */
	int EBINDING = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDING__NAME = 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDING__NODE = 1;

	/**
	 * The feature id for the '<em><b>Binding Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDING__BINDING_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDING__BINDING = 3;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDING__DIRECTION = 4;

	/**
	 * The number of structural features of the '<em>EBinding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDING_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>EBinding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.EEventsImpl <em>EEvents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.EEventsImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEEvents()
	 * @generated
	 */
	int EEVENTS = 5;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEVENTS__ON_ACTION = 0;

	/**
	 * The number of structural features of the '<em>EEvents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEVENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>EEvents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEVENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.StyleableImpl <em>Styleable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.StyleableImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getStyleable()
	 * @generated
	 */
	int STYLEABLE = 6;

	/**
	 * The number of structural features of the '<em>Styleable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLEABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Styleable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLEABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.SkinnableImpl <em>Skinnable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.SkinnableImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getSkinnable()
	 * @generated
	 */
	int SKINNABLE = 7;

	/**
	 * The number of structural features of the '<em>Skinnable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKINNABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Skinnable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKINNABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.ENodeImpl <em>ENode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.ENodeImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getENode()
	 * @generated
	 */
	int ENODE = 8;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENODE__ON_ACTION = STYLEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENODE__ID = STYLEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENODE__LAYOUT_X = STYLEABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENODE__LAYOUT_Y = STYLEABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENODE__OPACITY = STYLEABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENODE__STYLE = STYLEABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENODE__STYLE_CLASS = STYLEABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENODE__VISIBLE = STYLEABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENODE__DISABLE = STYLEABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENODE__MARGIN = STYLEABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENODE__MAX_HEIGHT = STYLEABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENODE__MIN_HEIGHT = STYLEABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENODE__PREF_HEIGHT = STYLEABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENODE__MAX_WIDTH = STYLEABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENODE__MIN_WIDTH = STYLEABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENODE__PREF_WIDTH = STYLEABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENODE__PADDING = STYLEABLE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENODE__CHILDREN = STYLEABLE_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>ENode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENODE_FEATURE_COUNT = STYLEABLE_FEATURE_COUNT + 18;

	/**
	 * The number of operations of the '<em>ENode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENODE_OPERATION_COUNT = STYLEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.EInsetsImpl <em>EInsets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.EInsetsImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEInsets()
	 * @generated
	 */
	int EINSETS = 9;

	/**
	 * The feature id for the '<em><b>Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINSETS__TOP = 0;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINSETS__BOTTOM = 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINSETS__RIGHT = 2;

	/**
	 * The feature id for the '<em><b>Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINSETS__LEFT = 3;

	/**
	 * The number of structural features of the '<em>EInsets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINSETS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>EInsets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINSETS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.EGroupImpl <em>EGroup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.EGroupImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEGroup()
	 * @generated
	 */
	int EGROUP = 10;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGROUP__ON_ACTION = ENODE__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGROUP__ID = ENODE__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGROUP__LAYOUT_X = ENODE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGROUP__LAYOUT_Y = ENODE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGROUP__OPACITY = ENODE__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGROUP__STYLE = ENODE__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGROUP__STYLE_CLASS = ENODE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGROUP__VISIBLE = ENODE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGROUP__DISABLE = ENODE__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGROUP__MARGIN = ENODE__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGROUP__MAX_HEIGHT = ENODE__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGROUP__MIN_HEIGHT = ENODE__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGROUP__PREF_HEIGHT = ENODE__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGROUP__MAX_WIDTH = ENODE__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGROUP__MIN_WIDTH = ENODE__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGROUP__PREF_WIDTH = ENODE__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGROUP__PADDING = ENODE__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGROUP__CHILDREN = ENODE__CHILDREN;

	/**
	 * The number of structural features of the '<em>EGroup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGROUP_FEATURE_COUNT = ENODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EGroup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGROUP_OPERATION_COUNT = ENODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.EWebViewImpl <em>EWeb View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.EWebViewImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEWebView()
	 * @generated
	 */
	int EWEB_VIEW = 11;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWEB_VIEW__ON_ACTION = ENODE__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWEB_VIEW__ID = ENODE__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWEB_VIEW__LAYOUT_X = ENODE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWEB_VIEW__LAYOUT_Y = ENODE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWEB_VIEW__OPACITY = ENODE__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWEB_VIEW__STYLE = ENODE__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWEB_VIEW__STYLE_CLASS = ENODE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWEB_VIEW__VISIBLE = ENODE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWEB_VIEW__DISABLE = ENODE__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWEB_VIEW__MARGIN = ENODE__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWEB_VIEW__MAX_HEIGHT = ENODE__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWEB_VIEW__MIN_HEIGHT = ENODE__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWEB_VIEW__PREF_HEIGHT = ENODE__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWEB_VIEW__MAX_WIDTH = ENODE__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWEB_VIEW__MIN_WIDTH = ENODE__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWEB_VIEW__PREF_WIDTH = ENODE__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWEB_VIEW__PADDING = ENODE__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWEB_VIEW__CHILDREN = ENODE__CHILDREN;

	/**
	 * The number of structural features of the '<em>EWeb View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWEB_VIEW_FEATURE_COUNT = ENODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EWeb View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EWEB_VIEW_OPERATION_COUNT = ENODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.EControlImpl <em>EControl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.EControlImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEControl()
	 * @generated
	 */
	int ECONTROL = 12;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROL__ON_ACTION = ENODE__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROL__ID = ENODE__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROL__LAYOUT_X = ENODE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROL__LAYOUT_Y = ENODE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROL__OPACITY = ENODE__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROL__STYLE = ENODE__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROL__STYLE_CLASS = ENODE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROL__VISIBLE = ENODE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROL__DISABLE = ENODE__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROL__MARGIN = ENODE__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROL__MAX_HEIGHT = ENODE__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROL__MIN_HEIGHT = ENODE__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROL__PREF_HEIGHT = ENODE__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROL__MAX_WIDTH = ENODE__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROL__MIN_WIDTH = ENODE__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROL__PREF_WIDTH = ENODE__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROL__PADDING = ENODE__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROL__CHILDREN = ENODE__CHILDREN;

	/**
	 * The number of structural features of the '<em>EControl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROL_FEATURE_COUNT = ENODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EControl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROL_OPERATION_COUNT = ENODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.ELabeledImpl <em>ELabeled</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.ELabeledImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getELabeled()
	 * @generated
	 */
	int ELABELED = 13;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABELED__ON_ACTION = ECONTROL__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABELED__ID = ECONTROL__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABELED__LAYOUT_X = ECONTROL__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABELED__LAYOUT_Y = ECONTROL__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABELED__OPACITY = ECONTROL__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABELED__STYLE = ECONTROL__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABELED__STYLE_CLASS = ECONTROL__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABELED__VISIBLE = ECONTROL__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABELED__DISABLE = ECONTROL__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABELED__MARGIN = ECONTROL__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABELED__MAX_HEIGHT = ECONTROL__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABELED__MIN_HEIGHT = ECONTROL__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABELED__PREF_HEIGHT = ECONTROL__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABELED__MAX_WIDTH = ECONTROL__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABELED__MIN_WIDTH = ECONTROL__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABELED__PREF_WIDTH = ECONTROL__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABELED__PADDING = ECONTROL__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABELED__CHILDREN = ECONTROL__CHILDREN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABELED__TEXT = ECONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ELabeled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABELED_FEATURE_COUNT = ECONTROL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ELabeled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABELED_OPERATION_COUNT = ECONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.ETextImpl <em>EText</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.ETextImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEText()
	 * @generated
	 */
	int ETEXT = 14;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETEXT__ON_ACTION = ELABELED__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETEXT__ID = ELABELED__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETEXT__LAYOUT_X = ELABELED__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETEXT__LAYOUT_Y = ELABELED__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETEXT__OPACITY = ELABELED__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETEXT__STYLE = ELABELED__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETEXT__STYLE_CLASS = ELABELED__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETEXT__VISIBLE = ELABELED__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETEXT__DISABLE = ELABELED__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETEXT__MARGIN = ELABELED__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETEXT__MAX_HEIGHT = ELABELED__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETEXT__MIN_HEIGHT = ELABELED__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETEXT__PREF_HEIGHT = ELABELED__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETEXT__MAX_WIDTH = ELABELED__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETEXT__MIN_WIDTH = ELABELED__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETEXT__PREF_WIDTH = ELABELED__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETEXT__PADDING = ELABELED__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETEXT__CHILDREN = ELABELED__CHILDREN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETEXT__TEXT = ELABELED__TEXT;

	/**
	 * The feature id for the '<em><b>Promt Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETEXT__PROMT_TEXT = ELABELED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EText</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETEXT_FEATURE_COUNT = ELABELED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EText</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETEXT_OPERATION_COUNT = ELABELED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.ELabelImpl <em>ELabel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.ELabelImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getELabel()
	 * @generated
	 */
	int ELABEL = 15;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABEL__ON_ACTION = ELABELED__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABEL__ID = ELABELED__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABEL__LAYOUT_X = ELABELED__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABEL__LAYOUT_Y = ELABELED__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABEL__OPACITY = ELABELED__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABEL__STYLE = ELABELED__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABEL__STYLE_CLASS = ELABELED__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABEL__VISIBLE = ELABELED__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABEL__DISABLE = ELABELED__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABEL__MARGIN = ELABELED__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABEL__MAX_HEIGHT = ELABELED__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABEL__MIN_HEIGHT = ELABELED__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABEL__PREF_HEIGHT = ELABELED__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABEL__MAX_WIDTH = ELABELED__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABEL__MIN_WIDTH = ELABELED__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABEL__PREF_WIDTH = ELABELED__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABEL__PADDING = ELABELED__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABEL__CHILDREN = ELABELED__CHILDREN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABEL__TEXT = ELABELED__TEXT;

	/**
	 * The number of structural features of the '<em>ELabel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABEL_FEATURE_COUNT = ELABELED_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ELabel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELABEL_OPERATION_COUNT = ELABELED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.EButtonBaseImpl <em>EButton Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.EButtonBaseImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEButtonBase()
	 * @generated
	 */
	int EBUTTON_BASE = 16;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON_BASE__ON_ACTION = ELABELED__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON_BASE__ID = ELABELED__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON_BASE__LAYOUT_X = ELABELED__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON_BASE__LAYOUT_Y = ELABELED__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON_BASE__OPACITY = ELABELED__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON_BASE__STYLE = ELABELED__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON_BASE__STYLE_CLASS = ELABELED__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON_BASE__VISIBLE = ELABELED__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON_BASE__DISABLE = ELABELED__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON_BASE__MARGIN = ELABELED__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON_BASE__MAX_HEIGHT = ELABELED__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON_BASE__MIN_HEIGHT = ELABELED__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON_BASE__PREF_HEIGHT = ELABELED__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON_BASE__MAX_WIDTH = ELABELED__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON_BASE__MIN_WIDTH = ELABELED__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON_BASE__PREF_WIDTH = ELABELED__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON_BASE__PADDING = ELABELED__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON_BASE__CHILDREN = ELABELED__CHILDREN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON_BASE__TEXT = ELABELED__TEXT;

	/**
	 * The number of structural features of the '<em>EButton Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON_BASE_FEATURE_COUNT = ELABELED_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EButton Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON_BASE_OPERATION_COUNT = ELABELED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.EButtonImpl <em>EButton</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.EButtonImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEButton()
	 * @generated
	 */
	int EBUTTON = 17;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON__ON_ACTION = EBUTTON_BASE__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON__ID = EBUTTON_BASE__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON__LAYOUT_X = EBUTTON_BASE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON__LAYOUT_Y = EBUTTON_BASE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON__OPACITY = EBUTTON_BASE__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON__STYLE = EBUTTON_BASE__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON__STYLE_CLASS = EBUTTON_BASE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON__VISIBLE = EBUTTON_BASE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON__DISABLE = EBUTTON_BASE__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON__MARGIN = EBUTTON_BASE__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON__MAX_HEIGHT = EBUTTON_BASE__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON__MIN_HEIGHT = EBUTTON_BASE__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON__PREF_HEIGHT = EBUTTON_BASE__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON__MAX_WIDTH = EBUTTON_BASE__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON__MIN_WIDTH = EBUTTON_BASE__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON__PREF_WIDTH = EBUTTON_BASE__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON__PADDING = EBUTTON_BASE__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON__CHILDREN = EBUTTON_BASE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON__TEXT = EBUTTON_BASE__TEXT;

	/**
	 * The number of structural features of the '<em>EButton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON_FEATURE_COUNT = EBUTTON_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EButton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBUTTON_OPERATION_COUNT = EBUTTON_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.ECheckBoxImpl <em>ECheck Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.ECheckBoxImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getECheckBox()
	 * @generated
	 */
	int ECHECK_BOX = 18;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHECK_BOX__ON_ACTION = EBUTTON_BASE__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHECK_BOX__ID = EBUTTON_BASE__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHECK_BOX__LAYOUT_X = EBUTTON_BASE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHECK_BOX__LAYOUT_Y = EBUTTON_BASE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHECK_BOX__OPACITY = EBUTTON_BASE__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHECK_BOX__STYLE = EBUTTON_BASE__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHECK_BOX__STYLE_CLASS = EBUTTON_BASE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHECK_BOX__VISIBLE = EBUTTON_BASE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHECK_BOX__DISABLE = EBUTTON_BASE__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHECK_BOX__MARGIN = EBUTTON_BASE__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHECK_BOX__MAX_HEIGHT = EBUTTON_BASE__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHECK_BOX__MIN_HEIGHT = EBUTTON_BASE__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHECK_BOX__PREF_HEIGHT = EBUTTON_BASE__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHECK_BOX__MAX_WIDTH = EBUTTON_BASE__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHECK_BOX__MIN_WIDTH = EBUTTON_BASE__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHECK_BOX__PREF_WIDTH = EBUTTON_BASE__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHECK_BOX__PADDING = EBUTTON_BASE__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHECK_BOX__CHILDREN = EBUTTON_BASE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHECK_BOX__TEXT = EBUTTON_BASE__TEXT;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHECK_BOX__SELECTED = EBUTTON_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ECheck Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHECK_BOX_FEATURE_COUNT = EBUTTON_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ECheck Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHECK_BOX_OPERATION_COUNT = EBUTTON_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.EHyperlinkImpl <em>EHyperlink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.EHyperlinkImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEHyperlink()
	 * @generated
	 */
	int EHYPERLINK = 19;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EHYPERLINK__ON_ACTION = EBUTTON_BASE__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EHYPERLINK__ID = EBUTTON_BASE__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EHYPERLINK__LAYOUT_X = EBUTTON_BASE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EHYPERLINK__LAYOUT_Y = EBUTTON_BASE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EHYPERLINK__OPACITY = EBUTTON_BASE__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EHYPERLINK__STYLE = EBUTTON_BASE__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EHYPERLINK__STYLE_CLASS = EBUTTON_BASE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EHYPERLINK__VISIBLE = EBUTTON_BASE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EHYPERLINK__DISABLE = EBUTTON_BASE__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EHYPERLINK__MARGIN = EBUTTON_BASE__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EHYPERLINK__MAX_HEIGHT = EBUTTON_BASE__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EHYPERLINK__MIN_HEIGHT = EBUTTON_BASE__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EHYPERLINK__PREF_HEIGHT = EBUTTON_BASE__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EHYPERLINK__MAX_WIDTH = EBUTTON_BASE__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EHYPERLINK__MIN_WIDTH = EBUTTON_BASE__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EHYPERLINK__PREF_WIDTH = EBUTTON_BASE__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EHYPERLINK__PADDING = EBUTTON_BASE__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EHYPERLINK__CHILDREN = EBUTTON_BASE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EHYPERLINK__TEXT = EBUTTON_BASE__TEXT;

	/**
	 * The feature id for the '<em><b>Visited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EHYPERLINK__VISITED = EBUTTON_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EHyperlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EHYPERLINK_FEATURE_COUNT = EBUTTON_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EHyperlink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EHYPERLINK_OPERATION_COUNT = EBUTTON_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.EMenuButtonImpl <em>EMenu Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.EMenuButtonImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEMenuButton()
	 * @generated
	 */
	int EMENU_BUTTON = 20;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMENU_BUTTON__ON_ACTION = EBUTTON_BASE__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMENU_BUTTON__ID = EBUTTON_BASE__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMENU_BUTTON__LAYOUT_X = EBUTTON_BASE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMENU_BUTTON__LAYOUT_Y = EBUTTON_BASE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMENU_BUTTON__OPACITY = EBUTTON_BASE__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMENU_BUTTON__STYLE = EBUTTON_BASE__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMENU_BUTTON__STYLE_CLASS = EBUTTON_BASE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMENU_BUTTON__VISIBLE = EBUTTON_BASE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMENU_BUTTON__DISABLE = EBUTTON_BASE__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMENU_BUTTON__MARGIN = EBUTTON_BASE__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMENU_BUTTON__MAX_HEIGHT = EBUTTON_BASE__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMENU_BUTTON__MIN_HEIGHT = EBUTTON_BASE__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMENU_BUTTON__PREF_HEIGHT = EBUTTON_BASE__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMENU_BUTTON__MAX_WIDTH = EBUTTON_BASE__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMENU_BUTTON__MIN_WIDTH = EBUTTON_BASE__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMENU_BUTTON__PREF_WIDTH = EBUTTON_BASE__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMENU_BUTTON__PADDING = EBUTTON_BASE__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMENU_BUTTON__CHILDREN = EBUTTON_BASE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMENU_BUTTON__TEXT = EBUTTON_BASE__TEXT;

	/**
	 * The number of structural features of the '<em>EMenu Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMENU_BUTTON_FEATURE_COUNT = EBUTTON_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EMenu Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMENU_BUTTON_OPERATION_COUNT = EBUTTON_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.ESplitMenuButtonImpl <em>ESplit Menu Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.ESplitMenuButtonImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getESplitMenuButton()
	 * @generated
	 */
	int ESPLIT_MENU_BUTTON = 21;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_MENU_BUTTON__ON_ACTION = EBUTTON_BASE__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_MENU_BUTTON__ID = EBUTTON_BASE__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_MENU_BUTTON__LAYOUT_X = EBUTTON_BASE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_MENU_BUTTON__LAYOUT_Y = EBUTTON_BASE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_MENU_BUTTON__OPACITY = EBUTTON_BASE__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_MENU_BUTTON__STYLE = EBUTTON_BASE__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_MENU_BUTTON__STYLE_CLASS = EBUTTON_BASE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_MENU_BUTTON__VISIBLE = EBUTTON_BASE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_MENU_BUTTON__DISABLE = EBUTTON_BASE__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_MENU_BUTTON__MARGIN = EBUTTON_BASE__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_MENU_BUTTON__MAX_HEIGHT = EBUTTON_BASE__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_MENU_BUTTON__MIN_HEIGHT = EBUTTON_BASE__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_MENU_BUTTON__PREF_HEIGHT = EBUTTON_BASE__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_MENU_BUTTON__MAX_WIDTH = EBUTTON_BASE__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_MENU_BUTTON__MIN_WIDTH = EBUTTON_BASE__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_MENU_BUTTON__PREF_WIDTH = EBUTTON_BASE__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_MENU_BUTTON__PADDING = EBUTTON_BASE__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_MENU_BUTTON__CHILDREN = EBUTTON_BASE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_MENU_BUTTON__TEXT = EBUTTON_BASE__TEXT;

	/**
	 * The number of structural features of the '<em>ESplit Menu Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_MENU_BUTTON_FEATURE_COUNT = EBUTTON_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ESplit Menu Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_MENU_BUTTON_OPERATION_COUNT = EBUTTON_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.EToogleButtonImpl <em>EToogle Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.EToogleButtonImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEToogleButton()
	 * @generated
	 */
	int ETOOGLE_BUTTON = 22;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETOOGLE_BUTTON__ON_ACTION = EBUTTON_BASE__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETOOGLE_BUTTON__ID = EBUTTON_BASE__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETOOGLE_BUTTON__LAYOUT_X = EBUTTON_BASE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETOOGLE_BUTTON__LAYOUT_Y = EBUTTON_BASE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETOOGLE_BUTTON__OPACITY = EBUTTON_BASE__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETOOGLE_BUTTON__STYLE = EBUTTON_BASE__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETOOGLE_BUTTON__STYLE_CLASS = EBUTTON_BASE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETOOGLE_BUTTON__VISIBLE = EBUTTON_BASE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETOOGLE_BUTTON__DISABLE = EBUTTON_BASE__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETOOGLE_BUTTON__MARGIN = EBUTTON_BASE__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETOOGLE_BUTTON__MAX_HEIGHT = EBUTTON_BASE__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETOOGLE_BUTTON__MIN_HEIGHT = EBUTTON_BASE__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETOOGLE_BUTTON__PREF_HEIGHT = EBUTTON_BASE__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETOOGLE_BUTTON__MAX_WIDTH = EBUTTON_BASE__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETOOGLE_BUTTON__MIN_WIDTH = EBUTTON_BASE__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETOOGLE_BUTTON__PREF_WIDTH = EBUTTON_BASE__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETOOGLE_BUTTON__PADDING = EBUTTON_BASE__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETOOGLE_BUTTON__CHILDREN = EBUTTON_BASE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETOOGLE_BUTTON__TEXT = EBUTTON_BASE__TEXT;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETOOGLE_BUTTON__SELECTED = EBUTTON_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EToogle Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETOOGLE_BUTTON_FEATURE_COUNT = EBUTTON_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EToogle Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETOOGLE_BUTTON_OPERATION_COUNT = EBUTTON_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.EBaseViewImpl <em>EBase View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.EBaseViewImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEBaseView()
	 * @generated
	 */
	int EBASE_VIEW = 23;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBASE_VIEW__ON_ACTION = ECONTROL__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBASE_VIEW__ID = ECONTROL__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBASE_VIEW__LAYOUT_X = ECONTROL__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBASE_VIEW__LAYOUT_Y = ECONTROL__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBASE_VIEW__OPACITY = ECONTROL__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBASE_VIEW__STYLE = ECONTROL__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBASE_VIEW__STYLE_CLASS = ECONTROL__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBASE_VIEW__VISIBLE = ECONTROL__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBASE_VIEW__DISABLE = ECONTROL__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBASE_VIEW__MARGIN = ECONTROL__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBASE_VIEW__MAX_HEIGHT = ECONTROL__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBASE_VIEW__MIN_HEIGHT = ECONTROL__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBASE_VIEW__PREF_HEIGHT = ECONTROL__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBASE_VIEW__MAX_WIDTH = ECONTROL__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBASE_VIEW__MIN_WIDTH = ECONTROL__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBASE_VIEW__PREF_WIDTH = ECONTROL__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBASE_VIEW__PADDING = ECONTROL__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBASE_VIEW__CHILDREN = ECONTROL__CHILDREN;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBASE_VIEW__MODEL = ECONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EBase View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBASE_VIEW_FEATURE_COUNT = ECONTROL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EBase View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBASE_VIEW_OPERATION_COUNT = ECONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.ETableViewImpl <em>ETable View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.ETableViewImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getETableView()
	 * @generated
	 */
	int ETABLE_VIEW = 25;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE_VIEW__ON_ACTION = EBASE_VIEW__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE_VIEW__ID = EBASE_VIEW__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE_VIEW__LAYOUT_X = EBASE_VIEW__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE_VIEW__LAYOUT_Y = EBASE_VIEW__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE_VIEW__OPACITY = EBASE_VIEW__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE_VIEW__STYLE = EBASE_VIEW__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE_VIEW__STYLE_CLASS = EBASE_VIEW__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE_VIEW__VISIBLE = EBASE_VIEW__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE_VIEW__DISABLE = EBASE_VIEW__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE_VIEW__MARGIN = EBASE_VIEW__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE_VIEW__MAX_HEIGHT = EBASE_VIEW__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE_VIEW__MIN_HEIGHT = EBASE_VIEW__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE_VIEW__PREF_HEIGHT = EBASE_VIEW__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE_VIEW__MAX_WIDTH = EBASE_VIEW__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE_VIEW__MIN_WIDTH = EBASE_VIEW__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE_VIEW__PREF_WIDTH = EBASE_VIEW__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE_VIEW__PADDING = EBASE_VIEW__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE_VIEW__CHILDREN = EBASE_VIEW__CHILDREN;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE_VIEW__MODEL = EBASE_VIEW__MODEL;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE_VIEW__COLUMNS = EBASE_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ETable View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE_VIEW_FEATURE_COUNT = EBASE_VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ETable View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE_VIEW_OPERATION_COUNT = EBASE_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.EFilteredTableViewImpl <em>EFiltered Table View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.EFilteredTableViewImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEFilteredTableView()
	 * @generated
	 */
	int EFILTERED_TABLE_VIEW = 24;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFILTERED_TABLE_VIEW__ON_ACTION = ETABLE_VIEW__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFILTERED_TABLE_VIEW__ID = ETABLE_VIEW__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFILTERED_TABLE_VIEW__LAYOUT_X = ETABLE_VIEW__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFILTERED_TABLE_VIEW__LAYOUT_Y = ETABLE_VIEW__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFILTERED_TABLE_VIEW__OPACITY = ETABLE_VIEW__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFILTERED_TABLE_VIEW__STYLE = ETABLE_VIEW__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFILTERED_TABLE_VIEW__STYLE_CLASS = ETABLE_VIEW__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFILTERED_TABLE_VIEW__VISIBLE = ETABLE_VIEW__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFILTERED_TABLE_VIEW__DISABLE = ETABLE_VIEW__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFILTERED_TABLE_VIEW__MARGIN = ETABLE_VIEW__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFILTERED_TABLE_VIEW__MAX_HEIGHT = ETABLE_VIEW__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFILTERED_TABLE_VIEW__MIN_HEIGHT = ETABLE_VIEW__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFILTERED_TABLE_VIEW__PREF_HEIGHT = ETABLE_VIEW__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFILTERED_TABLE_VIEW__MAX_WIDTH = ETABLE_VIEW__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFILTERED_TABLE_VIEW__MIN_WIDTH = ETABLE_VIEW__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFILTERED_TABLE_VIEW__PREF_WIDTH = ETABLE_VIEW__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFILTERED_TABLE_VIEW__PADDING = ETABLE_VIEW__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFILTERED_TABLE_VIEW__CHILDREN = ETABLE_VIEW__CHILDREN;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFILTERED_TABLE_VIEW__MODEL = ETABLE_VIEW__MODEL;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFILTERED_TABLE_VIEW__COLUMNS = ETABLE_VIEW__COLUMNS;

	/**
	 * The number of structural features of the '<em>EFiltered Table View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFILTERED_TABLE_VIEW_FEATURE_COUNT = ETABLE_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EFiltered Table View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFILTERED_TABLE_VIEW_OPERATION_COUNT = ETABLE_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.ETableColumnImpl <em>ETable Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.ETableColumnImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getETableColumn()
	 * @generated
	 */
	int ETABLE_COLUMN = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE_COLUMN__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE_COLUMN__NAME = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE_COLUMN__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Cell Value Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE_COLUMN__CELL_VALUE_FACTORY = 3;

	/**
	 * The feature id for the '<em><b>Cell Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE_COLUMN__CELL_FACTORY = 4;

	/**
	 * The feature id for the '<em><b>Associated Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE_COLUMN__ASSOCIATED_FIELD = 5;

	/**
	 * The number of structural features of the '<em>ETable Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE_COLUMN_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>ETable Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLE_COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.EListViewImpl <em>EList View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.EListViewImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEListView()
	 * @generated
	 */
	int ELIST_VIEW = 27;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_VIEW__ON_ACTION = EBASE_VIEW__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_VIEW__ID = EBASE_VIEW__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_VIEW__LAYOUT_X = EBASE_VIEW__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_VIEW__LAYOUT_Y = EBASE_VIEW__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_VIEW__OPACITY = EBASE_VIEW__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_VIEW__STYLE = EBASE_VIEW__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_VIEW__STYLE_CLASS = EBASE_VIEW__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_VIEW__VISIBLE = EBASE_VIEW__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_VIEW__DISABLE = EBASE_VIEW__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_VIEW__MARGIN = EBASE_VIEW__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_VIEW__MAX_HEIGHT = EBASE_VIEW__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_VIEW__MIN_HEIGHT = EBASE_VIEW__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_VIEW__PREF_HEIGHT = EBASE_VIEW__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_VIEW__MAX_WIDTH = EBASE_VIEW__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_VIEW__MIN_WIDTH = EBASE_VIEW__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_VIEW__PREF_WIDTH = EBASE_VIEW__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_VIEW__PADDING = EBASE_VIEW__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_VIEW__CHILDREN = EBASE_VIEW__CHILDREN;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_VIEW__MODEL = EBASE_VIEW__MODEL;

	/**
	 * The number of structural features of the '<em>EList View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_VIEW_FEATURE_COUNT = EBASE_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EList View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIST_VIEW_OPERATION_COUNT = EBASE_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.ERadioButtonImpl <em>ERadio Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.ERadioButtonImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getERadioButton()
	 * @generated
	 */
	int ERADIO_BUTTON = 28;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERADIO_BUTTON__ON_ACTION = ETOOGLE_BUTTON__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERADIO_BUTTON__ID = ETOOGLE_BUTTON__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERADIO_BUTTON__LAYOUT_X = ETOOGLE_BUTTON__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERADIO_BUTTON__LAYOUT_Y = ETOOGLE_BUTTON__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERADIO_BUTTON__OPACITY = ETOOGLE_BUTTON__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERADIO_BUTTON__STYLE = ETOOGLE_BUTTON__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERADIO_BUTTON__STYLE_CLASS = ETOOGLE_BUTTON__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERADIO_BUTTON__VISIBLE = ETOOGLE_BUTTON__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERADIO_BUTTON__DISABLE = ETOOGLE_BUTTON__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERADIO_BUTTON__MARGIN = ETOOGLE_BUTTON__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERADIO_BUTTON__MAX_HEIGHT = ETOOGLE_BUTTON__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERADIO_BUTTON__MIN_HEIGHT = ETOOGLE_BUTTON__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERADIO_BUTTON__PREF_HEIGHT = ETOOGLE_BUTTON__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERADIO_BUTTON__MAX_WIDTH = ETOOGLE_BUTTON__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERADIO_BUTTON__MIN_WIDTH = ETOOGLE_BUTTON__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERADIO_BUTTON__PREF_WIDTH = ETOOGLE_BUTTON__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERADIO_BUTTON__PADDING = ETOOGLE_BUTTON__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERADIO_BUTTON__CHILDREN = ETOOGLE_BUTTON__CHILDREN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERADIO_BUTTON__TEXT = ETOOGLE_BUTTON__TEXT;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERADIO_BUTTON__SELECTED = ETOOGLE_BUTTON__SELECTED;

	/**
	 * The number of structural features of the '<em>ERadio Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERADIO_BUTTON_FEATURE_COUNT = ETOOGLE_BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ERadio Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERADIO_BUTTON_OPERATION_COUNT = ETOOGLE_BUTTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.EAxisImpl <em>EAxis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.EAxisImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEAxis()
	 * @generated
	 */
	int EAXIS = 29;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXIS__ON_ACTION = ENODE__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXIS__ID = ENODE__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXIS__LAYOUT_X = ENODE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXIS__LAYOUT_Y = ENODE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXIS__OPACITY = ENODE__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXIS__STYLE = ENODE__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXIS__STYLE_CLASS = ENODE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXIS__VISIBLE = ENODE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXIS__DISABLE = ENODE__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXIS__MARGIN = ENODE__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXIS__MAX_HEIGHT = ENODE__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXIS__MIN_HEIGHT = ENODE__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXIS__PREF_HEIGHT = ENODE__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXIS__MAX_WIDTH = ENODE__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXIS__MIN_WIDTH = ENODE__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXIS__PREF_WIDTH = ENODE__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXIS__PADDING = ENODE__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXIS__CHILDREN = ENODE__CHILDREN;

	/**
	 * The number of structural features of the '<em>EAxis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXIS_FEATURE_COUNT = ENODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EAxis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAXIS_OPERATION_COUNT = ENODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.ECatgeoryAxisImpl <em>ECatgeory Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.ECatgeoryAxisImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getECatgeoryAxis()
	 * @generated
	 */
	int ECATGEORY_AXIS = 30;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECATGEORY_AXIS__ON_ACTION = EAXIS__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECATGEORY_AXIS__ID = EAXIS__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECATGEORY_AXIS__LAYOUT_X = EAXIS__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECATGEORY_AXIS__LAYOUT_Y = EAXIS__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECATGEORY_AXIS__OPACITY = EAXIS__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECATGEORY_AXIS__STYLE = EAXIS__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECATGEORY_AXIS__STYLE_CLASS = EAXIS__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECATGEORY_AXIS__VISIBLE = EAXIS__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECATGEORY_AXIS__DISABLE = EAXIS__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECATGEORY_AXIS__MARGIN = EAXIS__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECATGEORY_AXIS__MAX_HEIGHT = EAXIS__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECATGEORY_AXIS__MIN_HEIGHT = EAXIS__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECATGEORY_AXIS__PREF_HEIGHT = EAXIS__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECATGEORY_AXIS__MAX_WIDTH = EAXIS__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECATGEORY_AXIS__MIN_WIDTH = EAXIS__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECATGEORY_AXIS__PREF_WIDTH = EAXIS__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECATGEORY_AXIS__PADDING = EAXIS__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECATGEORY_AXIS__CHILDREN = EAXIS__CHILDREN;

	/**
	 * The number of structural features of the '<em>ECatgeory Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECATGEORY_AXIS_FEATURE_COUNT = EAXIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ECatgeory Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECATGEORY_AXIS_OPERATION_COUNT = EAXIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.EValueAxisImpl <em>EValue Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.EValueAxisImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEValueAxis()
	 * @generated
	 */
	int EVALUE_AXIS = 31;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUE_AXIS__ON_ACTION = EAXIS__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUE_AXIS__ID = EAXIS__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUE_AXIS__LAYOUT_X = EAXIS__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUE_AXIS__LAYOUT_Y = EAXIS__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUE_AXIS__OPACITY = EAXIS__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUE_AXIS__STYLE = EAXIS__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUE_AXIS__STYLE_CLASS = EAXIS__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUE_AXIS__VISIBLE = EAXIS__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUE_AXIS__DISABLE = EAXIS__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUE_AXIS__MARGIN = EAXIS__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUE_AXIS__MAX_HEIGHT = EAXIS__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUE_AXIS__MIN_HEIGHT = EAXIS__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUE_AXIS__PREF_HEIGHT = EAXIS__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUE_AXIS__MAX_WIDTH = EAXIS__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUE_AXIS__MIN_WIDTH = EAXIS__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUE_AXIS__PREF_WIDTH = EAXIS__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUE_AXIS__PADDING = EAXIS__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUE_AXIS__CHILDREN = EAXIS__CHILDREN;

	/**
	 * The number of structural features of the '<em>EValue Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUE_AXIS_FEATURE_COUNT = EAXIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EValue Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUE_AXIS_OPERATION_COUNT = EAXIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.EChartImpl <em>EChart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.EChartImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEChart()
	 * @generated
	 */
	int ECHART = 32;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHART__ON_ACTION = ENODE__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHART__ID = ENODE__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHART__LAYOUT_X = ENODE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHART__LAYOUT_Y = ENODE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHART__OPACITY = ENODE__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHART__STYLE = ENODE__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHART__STYLE_CLASS = ENODE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHART__VISIBLE = ENODE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHART__DISABLE = ENODE__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHART__MARGIN = ENODE__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHART__MAX_HEIGHT = ENODE__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHART__MIN_HEIGHT = ENODE__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHART__PREF_HEIGHT = ENODE__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHART__MAX_WIDTH = ENODE__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHART__MIN_WIDTH = ENODE__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHART__PREF_WIDTH = ENODE__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHART__PADDING = ENODE__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHART__CHILDREN = ENODE__CHILDREN;

	/**
	 * The number of structural features of the '<em>EChart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHART_FEATURE_COUNT = ENODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EChart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHART_OPERATION_COUNT = ENODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.EPieChartImpl <em>EPie Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.EPieChartImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEPieChart()
	 * @generated
	 */
	int EPIE_CHART = 33;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIE_CHART__ON_ACTION = ECHART__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIE_CHART__ID = ECHART__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIE_CHART__LAYOUT_X = ECHART__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIE_CHART__LAYOUT_Y = ECHART__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIE_CHART__OPACITY = ECHART__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIE_CHART__STYLE = ECHART__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIE_CHART__STYLE_CLASS = ECHART__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIE_CHART__VISIBLE = ECHART__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIE_CHART__DISABLE = ECHART__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIE_CHART__MARGIN = ECHART__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIE_CHART__MAX_HEIGHT = ECHART__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIE_CHART__MIN_HEIGHT = ECHART__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIE_CHART__PREF_HEIGHT = ECHART__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIE_CHART__MAX_WIDTH = ECHART__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIE_CHART__MIN_WIDTH = ECHART__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIE_CHART__PREF_WIDTH = ECHART__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIE_CHART__PADDING = ECHART__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIE_CHART__CHILDREN = ECHART__CHILDREN;

	/**
	 * The number of structural features of the '<em>EPie Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIE_CHART_FEATURE_COUNT = ECHART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EPie Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIE_CHART_OPERATION_COUNT = ECHART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.EXYChartImpl <em>EXY Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.EXYChartImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEXYChart()
	 * @generated
	 */
	int EXY_CHART = 34;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXY_CHART__ON_ACTION = ECHART__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXY_CHART__ID = ECHART__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXY_CHART__LAYOUT_X = ECHART__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXY_CHART__LAYOUT_Y = ECHART__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXY_CHART__OPACITY = ECHART__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXY_CHART__STYLE = ECHART__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXY_CHART__STYLE_CLASS = ECHART__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXY_CHART__VISIBLE = ECHART__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXY_CHART__DISABLE = ECHART__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXY_CHART__MARGIN = ECHART__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXY_CHART__MAX_HEIGHT = ECHART__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXY_CHART__MIN_HEIGHT = ECHART__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXY_CHART__PREF_HEIGHT = ECHART__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXY_CHART__MAX_WIDTH = ECHART__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXY_CHART__MIN_WIDTH = ECHART__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXY_CHART__PREF_WIDTH = ECHART__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXY_CHART__PADDING = ECHART__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXY_CHART__CHILDREN = ECHART__CHILDREN;

	/**
	 * The number of structural features of the '<em>EXY Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXY_CHART_FEATURE_COUNT = ECHART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EXY Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXY_CHART_OPERATION_COUNT = ECHART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.EPaneImpl <em>EPane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.EPaneImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEPane()
	 * @generated
	 */
	int EPANE = 35;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPANE__ON_ACTION = ENODE__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPANE__ID = ENODE__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPANE__LAYOUT_X = ENODE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPANE__LAYOUT_Y = ENODE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPANE__OPACITY = ENODE__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPANE__STYLE = ENODE__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPANE__STYLE_CLASS = ENODE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPANE__VISIBLE = ENODE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPANE__DISABLE = ENODE__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPANE__MARGIN = ENODE__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPANE__MAX_HEIGHT = ENODE__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPANE__MIN_HEIGHT = ENODE__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPANE__PREF_HEIGHT = ENODE__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPANE__MAX_WIDTH = ENODE__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPANE__MIN_WIDTH = ENODE__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPANE__PREF_WIDTH = ENODE__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPANE__PADDING = ENODE__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPANE__CHILDREN = ENODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPANE__POS = ENODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EPane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPANE_FEATURE_COUNT = ENODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EPane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPANE_OPERATION_COUNT = ENODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.EStackPaneImpl <em>EStack Pane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.EStackPaneImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEStackPane()
	 * @generated
	 */
	int ESTACK_PANE = 36;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTACK_PANE__ON_ACTION = EPANE__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTACK_PANE__ID = EPANE__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTACK_PANE__LAYOUT_X = EPANE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTACK_PANE__LAYOUT_Y = EPANE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTACK_PANE__OPACITY = EPANE__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTACK_PANE__STYLE = EPANE__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTACK_PANE__STYLE_CLASS = EPANE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTACK_PANE__VISIBLE = EPANE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTACK_PANE__DISABLE = EPANE__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTACK_PANE__MARGIN = EPANE__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTACK_PANE__MAX_HEIGHT = EPANE__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTACK_PANE__MIN_HEIGHT = EPANE__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTACK_PANE__PREF_HEIGHT = EPANE__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTACK_PANE__MAX_WIDTH = EPANE__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTACK_PANE__MIN_WIDTH = EPANE__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTACK_PANE__PREF_WIDTH = EPANE__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTACK_PANE__PADDING = EPANE__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTACK_PANE__CHILDREN = EPANE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTACK_PANE__POS = EPANE__POS;

	/**
	 * The number of structural features of the '<em>EStack Pane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTACK_PANE_FEATURE_COUNT = EPANE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EStack Pane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTACK_PANE_OPERATION_COUNT = EPANE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.EDialogPaneImpl <em>EDialog Pane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.EDialogPaneImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEDialogPane()
	 * @generated
	 */
	int EDIALOG_PANE = 37;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIALOG_PANE__ON_ACTION = EPANE__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIALOG_PANE__ID = EPANE__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIALOG_PANE__LAYOUT_X = EPANE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIALOG_PANE__LAYOUT_Y = EPANE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIALOG_PANE__OPACITY = EPANE__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIALOG_PANE__STYLE = EPANE__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIALOG_PANE__STYLE_CLASS = EPANE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIALOG_PANE__VISIBLE = EPANE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIALOG_PANE__DISABLE = EPANE__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIALOG_PANE__MARGIN = EPANE__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIALOG_PANE__MAX_HEIGHT = EPANE__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIALOG_PANE__MIN_HEIGHT = EPANE__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIALOG_PANE__PREF_HEIGHT = EPANE__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIALOG_PANE__MAX_WIDTH = EPANE__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIALOG_PANE__MIN_WIDTH = EPANE__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIALOG_PANE__PREF_WIDTH = EPANE__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIALOG_PANE__PADDING = EPANE__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIALOG_PANE__CHILDREN = EPANE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIALOG_PANE__POS = EPANE__POS;

	/**
	 * The feature id for the '<em><b>Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIALOG_PANE__HEADER = EPANE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Header Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIALOG_PANE__HEADER_TEXT = EPANE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Content Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIALOG_PANE__CONTENT_TEXT = EPANE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIALOG_PANE__CONTENT = EPANE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EDialog Pane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIALOG_PANE_FEATURE_COUNT = EPANE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>EDialog Pane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIALOG_PANE_OPERATION_COUNT = EPANE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.EGridPaneImpl <em>EGrid Pane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.EGridPaneImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEGridPane()
	 * @generated
	 */
	int EGRID_PANE = 38;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID_PANE__ON_ACTION = EPANE__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID_PANE__ID = EPANE__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID_PANE__LAYOUT_X = EPANE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID_PANE__LAYOUT_Y = EPANE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID_PANE__OPACITY = EPANE__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID_PANE__STYLE = EPANE__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID_PANE__STYLE_CLASS = EPANE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID_PANE__VISIBLE = EPANE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID_PANE__DISABLE = EPANE__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID_PANE__MARGIN = EPANE__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID_PANE__MAX_HEIGHT = EPANE__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID_PANE__MIN_HEIGHT = EPANE__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID_PANE__PREF_HEIGHT = EPANE__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID_PANE__MAX_WIDTH = EPANE__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID_PANE__MIN_WIDTH = EPANE__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID_PANE__PREF_WIDTH = EPANE__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID_PANE__PADDING = EPANE__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID_PANE__CHILDREN = EPANE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID_PANE__POS = EPANE__POS;

	/**
	 * The number of structural features of the '<em>EGrid Pane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID_PANE_FEATURE_COUNT = EPANE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EGrid Pane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGRID_PANE_OPERATION_COUNT = EPANE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.EHBoxImpl <em>EH Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.EHBoxImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEHBox()
	 * @generated
	 */
	int EH_BOX = 39;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EH_BOX__ON_ACTION = EPANE__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EH_BOX__ID = EPANE__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EH_BOX__LAYOUT_X = EPANE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EH_BOX__LAYOUT_Y = EPANE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EH_BOX__OPACITY = EPANE__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EH_BOX__STYLE = EPANE__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EH_BOX__STYLE_CLASS = EPANE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EH_BOX__VISIBLE = EPANE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EH_BOX__DISABLE = EPANE__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EH_BOX__MARGIN = EPANE__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EH_BOX__MAX_HEIGHT = EPANE__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EH_BOX__MIN_HEIGHT = EPANE__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EH_BOX__PREF_HEIGHT = EPANE__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EH_BOX__MAX_WIDTH = EPANE__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EH_BOX__MIN_WIDTH = EPANE__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EH_BOX__PREF_WIDTH = EPANE__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EH_BOX__PADDING = EPANE__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EH_BOX__CHILDREN = EPANE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EH_BOX__POS = EPANE__POS;

	/**
	 * The feature id for the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EH_BOX__SPACING = EPANE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EH Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EH_BOX_FEATURE_COUNT = EPANE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EH Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EH_BOX_OPERATION_COUNT = EPANE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.EVBoxImpl <em>EV Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.EVBoxImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEVBox()
	 * @generated
	 */
	int EV_BOX = 40;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_BOX__ON_ACTION = EPANE__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_BOX__ID = EPANE__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_BOX__LAYOUT_X = EPANE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_BOX__LAYOUT_Y = EPANE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_BOX__OPACITY = EPANE__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_BOX__STYLE = EPANE__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_BOX__STYLE_CLASS = EPANE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_BOX__VISIBLE = EPANE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_BOX__DISABLE = EPANE__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_BOX__MARGIN = EPANE__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_BOX__MAX_HEIGHT = EPANE__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_BOX__MIN_HEIGHT = EPANE__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_BOX__PREF_HEIGHT = EPANE__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_BOX__MAX_WIDTH = EPANE__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_BOX__MIN_WIDTH = EPANE__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_BOX__PREF_WIDTH = EPANE__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_BOX__PADDING = EPANE__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_BOX__CHILDREN = EPANE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_BOX__POS = EPANE__POS;

	/**
	 * The feature id for the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_BOX__SPACING = EPANE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EV Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_BOX_FEATURE_COUNT = EPANE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EV Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EV_BOX_OPERATION_COUNT = EPANE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.EFlowPaneImpl <em>EFlow Pane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.EFlowPaneImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEFlowPane()
	 * @generated
	 */
	int EFLOW_PANE = 41;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFLOW_PANE__ON_ACTION = EPANE__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFLOW_PANE__ID = EPANE__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFLOW_PANE__LAYOUT_X = EPANE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFLOW_PANE__LAYOUT_Y = EPANE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFLOW_PANE__OPACITY = EPANE__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFLOW_PANE__STYLE = EPANE__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFLOW_PANE__STYLE_CLASS = EPANE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFLOW_PANE__VISIBLE = EPANE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFLOW_PANE__DISABLE = EPANE__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFLOW_PANE__MARGIN = EPANE__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFLOW_PANE__MAX_HEIGHT = EPANE__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFLOW_PANE__MIN_HEIGHT = EPANE__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFLOW_PANE__PREF_HEIGHT = EPANE__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFLOW_PANE__MAX_WIDTH = EPANE__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFLOW_PANE__MIN_WIDTH = EPANE__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFLOW_PANE__PREF_WIDTH = EPANE__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFLOW_PANE__PADDING = EPANE__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFLOW_PANE__CHILDREN = EPANE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFLOW_PANE__POS = EPANE__POS;

	/**
	 * The number of structural features of the '<em>EFlow Pane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFLOW_PANE_FEATURE_COUNT = EPANE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EFlow Pane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFLOW_PANE_OPERATION_COUNT = EPANE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.ESplitPaneImpl <em>ESplit Pane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.ESplitPaneImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getESplitPane()
	 * @generated
	 */
	int ESPLIT_PANE = 42;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_PANE__ON_ACTION = EPANE__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_PANE__ID = EPANE__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_PANE__LAYOUT_X = EPANE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_PANE__LAYOUT_Y = EPANE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_PANE__OPACITY = EPANE__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_PANE__STYLE = EPANE__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_PANE__STYLE_CLASS = EPANE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_PANE__VISIBLE = EPANE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_PANE__DISABLE = EPANE__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_PANE__MARGIN = EPANE__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_PANE__MAX_HEIGHT = EPANE__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_PANE__MIN_HEIGHT = EPANE__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_PANE__PREF_HEIGHT = EPANE__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_PANE__MAX_WIDTH = EPANE__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_PANE__MIN_WIDTH = EPANE__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_PANE__PREF_WIDTH = EPANE__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_PANE__PADDING = EPANE__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_PANE__CHILDREN = EPANE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_PANE__POS = EPANE__POS;

	/**
	 * The number of structural features of the '<em>ESplit Pane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_PANE_FEATURE_COUNT = EPANE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ESplit Pane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPLIT_PANE_OPERATION_COUNT = EPANE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.ETilePaneImpl <em>ETile Pane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.ETilePaneImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getETilePane()
	 * @generated
	 */
	int ETILE_PANE = 43;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETILE_PANE__ON_ACTION = EPANE__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETILE_PANE__ID = EPANE__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETILE_PANE__LAYOUT_X = EPANE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETILE_PANE__LAYOUT_Y = EPANE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETILE_PANE__OPACITY = EPANE__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETILE_PANE__STYLE = EPANE__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETILE_PANE__STYLE_CLASS = EPANE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETILE_PANE__VISIBLE = EPANE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETILE_PANE__DISABLE = EPANE__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETILE_PANE__MARGIN = EPANE__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETILE_PANE__MAX_HEIGHT = EPANE__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETILE_PANE__MIN_HEIGHT = EPANE__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETILE_PANE__PREF_HEIGHT = EPANE__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETILE_PANE__MAX_WIDTH = EPANE__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETILE_PANE__MIN_WIDTH = EPANE__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETILE_PANE__PREF_WIDTH = EPANE__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETILE_PANE__PADDING = EPANE__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETILE_PANE__CHILDREN = EPANE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETILE_PANE__POS = EPANE__POS;

	/**
	 * The number of structural features of the '<em>ETile Pane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETILE_PANE_FEATURE_COUNT = EPANE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ETile Pane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETILE_PANE_OPERATION_COUNT = EPANE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.EAnchorPaneImpl <em>EAnchor Pane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.EAnchorPaneImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEAnchorPane()
	 * @generated
	 */
	int EANCHOR_PANE = 44;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANCHOR_PANE__ON_ACTION = EPANE__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANCHOR_PANE__ID = EPANE__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANCHOR_PANE__LAYOUT_X = EPANE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANCHOR_PANE__LAYOUT_Y = EPANE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANCHOR_PANE__OPACITY = EPANE__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANCHOR_PANE__STYLE = EPANE__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANCHOR_PANE__STYLE_CLASS = EPANE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANCHOR_PANE__VISIBLE = EPANE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANCHOR_PANE__DISABLE = EPANE__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANCHOR_PANE__MARGIN = EPANE__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANCHOR_PANE__MAX_HEIGHT = EPANE__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANCHOR_PANE__MIN_HEIGHT = EPANE__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANCHOR_PANE__PREF_HEIGHT = EPANE__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANCHOR_PANE__MAX_WIDTH = EPANE__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANCHOR_PANE__MIN_WIDTH = EPANE__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANCHOR_PANE__PREF_WIDTH = EPANE__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANCHOR_PANE__PADDING = EPANE__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANCHOR_PANE__CHILDREN = EPANE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANCHOR_PANE__POS = EPANE__POS;

	/**
	 * The number of structural features of the '<em>EAnchor Pane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANCHOR_PANE_FEATURE_COUNT = EPANE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EAnchor Pane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANCHOR_PANE_OPERATION_COUNT = EPANE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.impl.EBorderPaneImpl <em>EBorder Pane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.impl.EBorderPaneImpl
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEBorderPane()
	 * @generated
	 */
	int EBORDER_PANE = 45;

	/**
	 * The feature id for the '<em><b>On Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBORDER_PANE__ON_ACTION = EPANE__ON_ACTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBORDER_PANE__ID = EPANE__ID;

	/**
	 * The feature id for the '<em><b>Layout X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBORDER_PANE__LAYOUT_X = EPANE__LAYOUT_X;

	/**
	 * The feature id for the '<em><b>Layout Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBORDER_PANE__LAYOUT_Y = EPANE__LAYOUT_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBORDER_PANE__OPACITY = EPANE__OPACITY;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBORDER_PANE__STYLE = EPANE__STYLE;

	/**
	 * The feature id for the '<em><b>Style Class</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBORDER_PANE__STYLE_CLASS = EPANE__STYLE_CLASS;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBORDER_PANE__VISIBLE = EPANE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBORDER_PANE__DISABLE = EPANE__DISABLE;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBORDER_PANE__MARGIN = EPANE__MARGIN;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBORDER_PANE__MAX_HEIGHT = EPANE__MAX_HEIGHT;

	/**
	 * The feature id for the '<em><b>Min Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBORDER_PANE__MIN_HEIGHT = EPANE__MIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Pref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBORDER_PANE__PREF_HEIGHT = EPANE__PREF_HEIGHT;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBORDER_PANE__MAX_WIDTH = EPANE__MAX_WIDTH;

	/**
	 * The feature id for the '<em><b>Min Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBORDER_PANE__MIN_WIDTH = EPANE__MIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Pref Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBORDER_PANE__PREF_WIDTH = EPANE__PREF_WIDTH;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBORDER_PANE__PADDING = EPANE__PADDING;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBORDER_PANE__CHILDREN = EPANE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBORDER_PANE__POS = EPANE__POS;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBORDER_PANE__LEFT = EPANE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBORDER_PANE__RIGHT = EPANE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Top</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBORDER_PANE__TOP = EPANE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBORDER_PANE__BOTTOM = EPANE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBORDER_PANE__CENTER = EPANE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>EBorder Pane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBORDER_PANE_FEATURE_COUNT = EPANE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>EBorder Pane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBORDER_PANE_OPERATION_COUNT = EPANE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.EControlBinding <em>EControl Binding</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.EControlBinding
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEControlBinding()
	 * @generated
	 */
	int ECONTROL_BINDING = 46;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.EBindingType <em>EBinding Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.EBindingType
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEBindingType()
	 * @generated
	 */
	int EBINDING_TYPE = 47;

	/**
	 * The meta object id for the '{@link de.dc.javafx.mm.EBindingDirection <em>EBinding Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.javafx.mm.EBindingDirection
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEBindingDirection()
	 * @generated
	 */
	int EBINDING_DIRECTION = 48;

	/**
	 * The meta object id for the '<em>EPos</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javafx.geometry.Pos
	 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEPos()
	 * @generated
	 */
	int EPOS = 49;

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.EmfModel <em>Emf Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emf Model</em>'.
	 * @see de.dc.javafx.mm.EmfModel
	 * @generated
	 */
	EClass getEmfModel();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.EmfModel#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see de.dc.javafx.mm.EmfModel#getBasePackage()
	 * @see #getEmfModel()
	 * @generated
	 */
	EAttribute getEmfModel_BasePackage();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.EmfModel#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controller</em>'.
	 * @see de.dc.javafx.mm.EmfModel#getController()
	 * @see #getEmfModel()
	 * @generated
	 */
	EAttribute getEmfModel_Controller();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.EmfModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.javafx.mm.EmfModel#getName()
	 * @see #getEmfModel()
	 * @generated
	 */
	EAttribute getEmfModel_Name();

	/**
	 * Returns the meta object for the attribute list '{@link de.dc.javafx.mm.EmfModel#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Style Class</em>'.
	 * @see de.dc.javafx.mm.EmfModel#getStyleClass()
	 * @see #getEmfModel()
	 * @generated
	 */
	EAttribute getEmfModel_StyleClass();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.javafx.mm.EmfModel#getBindingModel <em>Binding Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding Model</em>'.
	 * @see de.dc.javafx.mm.EmfModel#getBindingModel()
	 * @see #getEmfModel()
	 * @generated
	 */
	EReference getEmfModel_BindingModel();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.javafx.mm.EmfModel#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see de.dc.javafx.mm.EmfModel#getRoot()
	 * @see #getEmfModel()
	 * @generated
	 */
	EReference getEmfModel_Root();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.mm.EmfModel#getBeans <em>Beans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Beans</em>'.
	 * @see de.dc.javafx.mm.EmfModel#getBeans()
	 * @see #getEmfModel()
	 * @generated
	 */
	EReference getEmfModel_Beans();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.EBean <em>EBean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EBean</em>'.
	 * @see de.dc.javafx.mm.EBean
	 * @generated
	 */
	EClass getEBean();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.EBean#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.javafx.mm.EBean#getName()
	 * @see #getEBean()
	 * @generated
	 */
	EAttribute getEBean_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.EBean#getInstanceName <em>Instance Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Name</em>'.
	 * @see de.dc.javafx.mm.EBean#getInstanceName()
	 * @see #getEBean()
	 * @generated
	 */
	EAttribute getEBean_InstanceName();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.EBean#isGenerateClass <em>Generate Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Class</em>'.
	 * @see de.dc.javafx.mm.EBean#isGenerateClass()
	 * @see #getEBean()
	 * @generated
	 */
	EAttribute getEBean_GenerateClass();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.mm.EBean#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see de.dc.javafx.mm.EBean#getFields()
	 * @see #getEBean()
	 * @generated
	 */
	EReference getEBean_Fields();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.EField <em>EField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EField</em>'.
	 * @see de.dc.javafx.mm.EField
	 * @generated
	 */
	EClass getEField();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.EField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.javafx.mm.EField#getName()
	 * @see #getEField()
	 * @generated
	 */
	EAttribute getEField_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.EField#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datatype</em>'.
	 * @see de.dc.javafx.mm.EField#getDatatype()
	 * @see #getEField()
	 * @generated
	 */
	EAttribute getEField_Datatype();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.EBindingModel <em>EBinding Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EBinding Model</em>'.
	 * @see de.dc.javafx.mm.EBindingModel
	 * @generated
	 */
	EClass getEBindingModel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.mm.EBindingModel#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see de.dc.javafx.mm.EBindingModel#getBindings()
	 * @see #getEBindingModel()
	 * @generated
	 */
	EReference getEBindingModel_Bindings();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.EBinding <em>EBinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EBinding</em>'.
	 * @see de.dc.javafx.mm.EBinding
	 * @generated
	 */
	EClass getEBinding();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.EBinding#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.javafx.mm.EBinding#getName()
	 * @see #getEBinding()
	 * @generated
	 */
	EAttribute getEBinding_Name();

	/**
	 * Returns the meta object for the reference '{@link de.dc.javafx.mm.EBinding#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see de.dc.javafx.mm.EBinding#getNode()
	 * @see #getEBinding()
	 * @generated
	 */
	EReference getEBinding_Node();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.EBinding#getBindingType <em>Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding Type</em>'.
	 * @see de.dc.javafx.mm.EBinding#getBindingType()
	 * @see #getEBinding()
	 * @generated
	 */
	EAttribute getEBinding_BindingType();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.EBinding#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding</em>'.
	 * @see de.dc.javafx.mm.EBinding#getBinding()
	 * @see #getEBinding()
	 * @generated
	 */
	EAttribute getEBinding_Binding();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.EBinding#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see de.dc.javafx.mm.EBinding#getDirection()
	 * @see #getEBinding()
	 * @generated
	 */
	EAttribute getEBinding_Direction();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.EEvents <em>EEvents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEvents</em>'.
	 * @see de.dc.javafx.mm.EEvents
	 * @generated
	 */
	EClass getEEvents();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.EEvents#getOnAction <em>On Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Action</em>'.
	 * @see de.dc.javafx.mm.EEvents#getOnAction()
	 * @see #getEEvents()
	 * @generated
	 */
	EAttribute getEEvents_OnAction();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.Styleable <em>Styleable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Styleable</em>'.
	 * @see de.dc.javafx.mm.Styleable
	 * @generated
	 */
	EClass getStyleable();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.Skinnable <em>Skinnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skinnable</em>'.
	 * @see de.dc.javafx.mm.Skinnable
	 * @generated
	 */
	EClass getSkinnable();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.ENode <em>ENode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ENode</em>'.
	 * @see de.dc.javafx.mm.ENode
	 * @generated
	 */
	EClass getENode();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.ENode#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dc.javafx.mm.ENode#getId()
	 * @see #getENode()
	 * @generated
	 */
	EAttribute getENode_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.ENode#getLayoutX <em>Layout X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout X</em>'.
	 * @see de.dc.javafx.mm.ENode#getLayoutX()
	 * @see #getENode()
	 * @generated
	 */
	EAttribute getENode_LayoutX();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.ENode#getLayoutY <em>Layout Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout Y</em>'.
	 * @see de.dc.javafx.mm.ENode#getLayoutY()
	 * @see #getENode()
	 * @generated
	 */
	EAttribute getENode_LayoutY();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.ENode#getOpacity <em>Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opacity</em>'.
	 * @see de.dc.javafx.mm.ENode#getOpacity()
	 * @see #getENode()
	 * @generated
	 */
	EAttribute getENode_Opacity();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.ENode#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see de.dc.javafx.mm.ENode#getStyle()
	 * @see #getENode()
	 * @generated
	 */
	EAttribute getENode_Style();

	/**
	 * Returns the meta object for the attribute list '{@link de.dc.javafx.mm.ENode#getStyleClass <em>Style Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Style Class</em>'.
	 * @see de.dc.javafx.mm.ENode#getStyleClass()
	 * @see #getENode()
	 * @generated
	 */
	EAttribute getENode_StyleClass();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.ENode#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see de.dc.javafx.mm.ENode#isVisible()
	 * @see #getENode()
	 * @generated
	 */
	EAttribute getENode_Visible();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.ENode#isDisable <em>Disable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disable</em>'.
	 * @see de.dc.javafx.mm.ENode#isDisable()
	 * @see #getENode()
	 * @generated
	 */
	EAttribute getENode_Disable();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.javafx.mm.ENode#getMargin <em>Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Margin</em>'.
	 * @see de.dc.javafx.mm.ENode#getMargin()
	 * @see #getENode()
	 * @generated
	 */
	EReference getENode_Margin();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.ENode#getMaxHeight <em>Max Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Height</em>'.
	 * @see de.dc.javafx.mm.ENode#getMaxHeight()
	 * @see #getENode()
	 * @generated
	 */
	EAttribute getENode_MaxHeight();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.ENode#getMinHeight <em>Min Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Height</em>'.
	 * @see de.dc.javafx.mm.ENode#getMinHeight()
	 * @see #getENode()
	 * @generated
	 */
	EAttribute getENode_MinHeight();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.ENode#getPrefHeight <em>Pref Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pref Height</em>'.
	 * @see de.dc.javafx.mm.ENode#getPrefHeight()
	 * @see #getENode()
	 * @generated
	 */
	EAttribute getENode_PrefHeight();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.ENode#getMaxWidth <em>Max Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Width</em>'.
	 * @see de.dc.javafx.mm.ENode#getMaxWidth()
	 * @see #getENode()
	 * @generated
	 */
	EAttribute getENode_MaxWidth();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.ENode#getMinWidth <em>Min Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Width</em>'.
	 * @see de.dc.javafx.mm.ENode#getMinWidth()
	 * @see #getENode()
	 * @generated
	 */
	EAttribute getENode_MinWidth();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.ENode#getPrefWidth <em>Pref Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pref Width</em>'.
	 * @see de.dc.javafx.mm.ENode#getPrefWidth()
	 * @see #getENode()
	 * @generated
	 */
	EAttribute getENode_PrefWidth();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.javafx.mm.ENode#getPadding <em>Padding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Padding</em>'.
	 * @see de.dc.javafx.mm.ENode#getPadding()
	 * @see #getENode()
	 * @generated
	 */
	EReference getENode_Padding();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.mm.ENode#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see de.dc.javafx.mm.ENode#getChildren()
	 * @see #getENode()
	 * @generated
	 */
	EReference getENode_Children();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.EInsets <em>EInsets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EInsets</em>'.
	 * @see de.dc.javafx.mm.EInsets
	 * @generated
	 */
	EClass getEInsets();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.EInsets#getTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top</em>'.
	 * @see de.dc.javafx.mm.EInsets#getTop()
	 * @see #getEInsets()
	 * @generated
	 */
	EAttribute getEInsets_Top();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.EInsets#getBottom <em>Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottom</em>'.
	 * @see de.dc.javafx.mm.EInsets#getBottom()
	 * @see #getEInsets()
	 * @generated
	 */
	EAttribute getEInsets_Bottom();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.EInsets#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right</em>'.
	 * @see de.dc.javafx.mm.EInsets#getRight()
	 * @see #getEInsets()
	 * @generated
	 */
	EAttribute getEInsets_Right();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.EInsets#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left</em>'.
	 * @see de.dc.javafx.mm.EInsets#getLeft()
	 * @see #getEInsets()
	 * @generated
	 */
	EAttribute getEInsets_Left();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.EGroup <em>EGroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EGroup</em>'.
	 * @see de.dc.javafx.mm.EGroup
	 * @generated
	 */
	EClass getEGroup();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.EWebView <em>EWeb View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EWeb View</em>'.
	 * @see de.dc.javafx.mm.EWebView
	 * @generated
	 */
	EClass getEWebView();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.EControl <em>EControl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EControl</em>'.
	 * @see de.dc.javafx.mm.EControl
	 * @generated
	 */
	EClass getEControl();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.ELabeled <em>ELabeled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ELabeled</em>'.
	 * @see de.dc.javafx.mm.ELabeled
	 * @generated
	 */
	EClass getELabeled();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.ELabeled#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.dc.javafx.mm.ELabeled#getText()
	 * @see #getELabeled()
	 * @generated
	 */
	EAttribute getELabeled_Text();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.EText <em>EText</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EText</em>'.
	 * @see de.dc.javafx.mm.EText
	 * @generated
	 */
	EClass getEText();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.EText#getPromtText <em>Promt Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Promt Text</em>'.
	 * @see de.dc.javafx.mm.EText#getPromtText()
	 * @see #getEText()
	 * @generated
	 */
	EAttribute getEText_PromtText();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.ELabel <em>ELabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ELabel</em>'.
	 * @see de.dc.javafx.mm.ELabel
	 * @generated
	 */
	EClass getELabel();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.EButtonBase <em>EButton Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EButton Base</em>'.
	 * @see de.dc.javafx.mm.EButtonBase
	 * @generated
	 */
	EClass getEButtonBase();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.EButton <em>EButton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EButton</em>'.
	 * @see de.dc.javafx.mm.EButton
	 * @generated
	 */
	EClass getEButton();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.ECheckBox <em>ECheck Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECheck Box</em>'.
	 * @see de.dc.javafx.mm.ECheckBox
	 * @generated
	 */
	EClass getECheckBox();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.ECheckBox#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see de.dc.javafx.mm.ECheckBox#isSelected()
	 * @see #getECheckBox()
	 * @generated
	 */
	EAttribute getECheckBox_Selected();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.EHyperlink <em>EHyperlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EHyperlink</em>'.
	 * @see de.dc.javafx.mm.EHyperlink
	 * @generated
	 */
	EClass getEHyperlink();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.EHyperlink#isVisited <em>Visited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visited</em>'.
	 * @see de.dc.javafx.mm.EHyperlink#isVisited()
	 * @see #getEHyperlink()
	 * @generated
	 */
	EAttribute getEHyperlink_Visited();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.EMenuButton <em>EMenu Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMenu Button</em>'.
	 * @see de.dc.javafx.mm.EMenuButton
	 * @generated
	 */
	EClass getEMenuButton();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.ESplitMenuButton <em>ESplit Menu Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ESplit Menu Button</em>'.
	 * @see de.dc.javafx.mm.ESplitMenuButton
	 * @generated
	 */
	EClass getESplitMenuButton();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.EToogleButton <em>EToogle Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EToogle Button</em>'.
	 * @see de.dc.javafx.mm.EToogleButton
	 * @generated
	 */
	EClass getEToogleButton();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.EToogleButton#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see de.dc.javafx.mm.EToogleButton#isSelected()
	 * @see #getEToogleButton()
	 * @generated
	 */
	EAttribute getEToogleButton_Selected();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.EBaseView <em>EBase View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EBase View</em>'.
	 * @see de.dc.javafx.mm.EBaseView
	 * @generated
	 */
	EClass getEBaseView();

	/**
	 * Returns the meta object for the reference '{@link de.dc.javafx.mm.EBaseView#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see de.dc.javafx.mm.EBaseView#getModel()
	 * @see #getEBaseView()
	 * @generated
	 */
	EReference getEBaseView_Model();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.EFilteredTableView <em>EFiltered Table View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EFiltered Table View</em>'.
	 * @see de.dc.javafx.mm.EFilteredTableView
	 * @generated
	 */
	EClass getEFilteredTableView();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.ETableView <em>ETable View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ETable View</em>'.
	 * @see de.dc.javafx.mm.ETableView
	 * @generated
	 */
	EClass getETableView();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.javafx.mm.ETableView#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see de.dc.javafx.mm.ETableView#getColumns()
	 * @see #getETableView()
	 * @generated
	 */
	EReference getETableView_Columns();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.ETableColumn <em>ETable Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ETable Column</em>'.
	 * @see de.dc.javafx.mm.ETableColumn
	 * @generated
	 */
	EClass getETableColumn();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.ETableColumn#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.dc.javafx.mm.ETableColumn#getId()
	 * @see #getETableColumn()
	 * @generated
	 */
	EAttribute getETableColumn_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.ETableColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.javafx.mm.ETableColumn#getName()
	 * @see #getETableColumn()
	 * @generated
	 */
	EAttribute getETableColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.ETableColumn#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see de.dc.javafx.mm.ETableColumn#getWidth()
	 * @see #getETableColumn()
	 * @generated
	 */
	EAttribute getETableColumn_Width();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.ETableColumn#getCellValueFactory <em>Cell Value Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cell Value Factory</em>'.
	 * @see de.dc.javafx.mm.ETableColumn#getCellValueFactory()
	 * @see #getETableColumn()
	 * @generated
	 */
	EAttribute getETableColumn_CellValueFactory();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.ETableColumn#getCellFactory <em>Cell Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cell Factory</em>'.
	 * @see de.dc.javafx.mm.ETableColumn#getCellFactory()
	 * @see #getETableColumn()
	 * @generated
	 */
	EAttribute getETableColumn_CellFactory();

	/**
	 * Returns the meta object for the reference '{@link de.dc.javafx.mm.ETableColumn#getAssociatedField <em>Associated Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Associated Field</em>'.
	 * @see de.dc.javafx.mm.ETableColumn#getAssociatedField()
	 * @see #getETableColumn()
	 * @generated
	 */
	EReference getETableColumn_AssociatedField();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.EListView <em>EList View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EList View</em>'.
	 * @see de.dc.javafx.mm.EListView
	 * @generated
	 */
	EClass getEListView();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.ERadioButton <em>ERadio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERadio Button</em>'.
	 * @see de.dc.javafx.mm.ERadioButton
	 * @generated
	 */
	EClass getERadioButton();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.EAxis <em>EAxis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAxis</em>'.
	 * @see de.dc.javafx.mm.EAxis
	 * @generated
	 */
	EClass getEAxis();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.ECatgeoryAxis <em>ECatgeory Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECatgeory Axis</em>'.
	 * @see de.dc.javafx.mm.ECatgeoryAxis
	 * @generated
	 */
	EClass getECatgeoryAxis();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.EValueAxis <em>EValue Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EValue Axis</em>'.
	 * @see de.dc.javafx.mm.EValueAxis
	 * @generated
	 */
	EClass getEValueAxis();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.EChart <em>EChart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EChart</em>'.
	 * @see de.dc.javafx.mm.EChart
	 * @generated
	 */
	EClass getEChart();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.EPieChart <em>EPie Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPie Chart</em>'.
	 * @see de.dc.javafx.mm.EPieChart
	 * @generated
	 */
	EClass getEPieChart();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.EXYChart <em>EXY Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EXY Chart</em>'.
	 * @see de.dc.javafx.mm.EXYChart
	 * @generated
	 */
	EClass getEXYChart();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.EPane <em>EPane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPane</em>'.
	 * @see de.dc.javafx.mm.EPane
	 * @generated
	 */
	EClass getEPane();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.EPane#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos</em>'.
	 * @see de.dc.javafx.mm.EPane#getPos()
	 * @see #getEPane()
	 * @generated
	 */
	EAttribute getEPane_Pos();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.EStackPane <em>EStack Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EStack Pane</em>'.
	 * @see de.dc.javafx.mm.EStackPane
	 * @generated
	 */
	EClass getEStackPane();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.EDialogPane <em>EDialog Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDialog Pane</em>'.
	 * @see de.dc.javafx.mm.EDialogPane
	 * @generated
	 */
	EClass getEDialogPane();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.EDialogPane#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header</em>'.
	 * @see de.dc.javafx.mm.EDialogPane#getHeader()
	 * @see #getEDialogPane()
	 * @generated
	 */
	EAttribute getEDialogPane_Header();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.EDialogPane#getHeaderText <em>Header Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Text</em>'.
	 * @see de.dc.javafx.mm.EDialogPane#getHeaderText()
	 * @see #getEDialogPane()
	 * @generated
	 */
	EAttribute getEDialogPane_HeaderText();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.EDialogPane#getContentText <em>Content Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Text</em>'.
	 * @see de.dc.javafx.mm.EDialogPane#getContentText()
	 * @see #getEDialogPane()
	 * @generated
	 */
	EAttribute getEDialogPane_ContentText();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.javafx.mm.EDialogPane#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see de.dc.javafx.mm.EDialogPane#getContent()
	 * @see #getEDialogPane()
	 * @generated
	 */
	EReference getEDialogPane_Content();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.EGridPane <em>EGrid Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EGrid Pane</em>'.
	 * @see de.dc.javafx.mm.EGridPane
	 * @generated
	 */
	EClass getEGridPane();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.EHBox <em>EH Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EH Box</em>'.
	 * @see de.dc.javafx.mm.EHBox
	 * @generated
	 */
	EClass getEHBox();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.EHBox#getSpacing <em>Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spacing</em>'.
	 * @see de.dc.javafx.mm.EHBox#getSpacing()
	 * @see #getEHBox()
	 * @generated
	 */
	EAttribute getEHBox_Spacing();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.EVBox <em>EV Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EV Box</em>'.
	 * @see de.dc.javafx.mm.EVBox
	 * @generated
	 */
	EClass getEVBox();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.javafx.mm.EVBox#getSpacing <em>Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spacing</em>'.
	 * @see de.dc.javafx.mm.EVBox#getSpacing()
	 * @see #getEVBox()
	 * @generated
	 */
	EAttribute getEVBox_Spacing();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.EFlowPane <em>EFlow Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EFlow Pane</em>'.
	 * @see de.dc.javafx.mm.EFlowPane
	 * @generated
	 */
	EClass getEFlowPane();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.ESplitPane <em>ESplit Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ESplit Pane</em>'.
	 * @see de.dc.javafx.mm.ESplitPane
	 * @generated
	 */
	EClass getESplitPane();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.ETilePane <em>ETile Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ETile Pane</em>'.
	 * @see de.dc.javafx.mm.ETilePane
	 * @generated
	 */
	EClass getETilePane();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.EAnchorPane <em>EAnchor Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAnchor Pane</em>'.
	 * @see de.dc.javafx.mm.EAnchorPane
	 * @generated
	 */
	EClass getEAnchorPane();

	/**
	 * Returns the meta object for class '{@link de.dc.javafx.mm.EBorderPane <em>EBorder Pane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EBorder Pane</em>'.
	 * @see de.dc.javafx.mm.EBorderPane
	 * @generated
	 */
	EClass getEBorderPane();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.javafx.mm.EBorderPane#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see de.dc.javafx.mm.EBorderPane#getLeft()
	 * @see #getEBorderPane()
	 * @generated
	 */
	EReference getEBorderPane_Left();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.javafx.mm.EBorderPane#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see de.dc.javafx.mm.EBorderPane#getRight()
	 * @see #getEBorderPane()
	 * @generated
	 */
	EReference getEBorderPane_Right();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.javafx.mm.EBorderPane#getTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Top</em>'.
	 * @see de.dc.javafx.mm.EBorderPane#getTop()
	 * @see #getEBorderPane()
	 * @generated
	 */
	EReference getEBorderPane_Top();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.javafx.mm.EBorderPane#getBottom <em>Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bottom</em>'.
	 * @see de.dc.javafx.mm.EBorderPane#getBottom()
	 * @see #getEBorderPane()
	 * @generated
	 */
	EReference getEBorderPane_Bottom();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.javafx.mm.EBorderPane#getCenter <em>Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Center</em>'.
	 * @see de.dc.javafx.mm.EBorderPane#getCenter()
	 * @see #getEBorderPane()
	 * @generated
	 */
	EReference getEBorderPane_Center();

	/**
	 * Returns the meta object for enum '{@link de.dc.javafx.mm.EControlBinding <em>EControl Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EControl Binding</em>'.
	 * @see de.dc.javafx.mm.EControlBinding
	 * @generated
	 */
	EEnum getEControlBinding();

	/**
	 * Returns the meta object for enum '{@link de.dc.javafx.mm.EBindingType <em>EBinding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EBinding Type</em>'.
	 * @see de.dc.javafx.mm.EBindingType
	 * @generated
	 */
	EEnum getEBindingType();

	/**
	 * Returns the meta object for enum '{@link de.dc.javafx.mm.EBindingDirection <em>EBinding Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EBinding Direction</em>'.
	 * @see de.dc.javafx.mm.EBindingDirection
	 * @generated
	 */
	EEnum getEBindingDirection();

	/**
	 * Returns the meta object for data type '{@link javafx.geometry.Pos <em>EPos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EPos</em>'.
	 * @see javafx.geometry.Pos
	 * @model instanceClass="javafx.geometry.Pos"
	 * @generated
	 */
	EDataType getEPos();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MmFactory getMmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.EmfModelImpl <em>Emf Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.EmfModelImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEmfModel()
		 * @generated
		 */
		EClass EMF_MODEL = eINSTANCE.getEmfModel();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMF_MODEL__BASE_PACKAGE = eINSTANCE.getEmfModel_BasePackage();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMF_MODEL__CONTROLLER = eINSTANCE.getEmfModel_Controller();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMF_MODEL__NAME = eINSTANCE.getEmfModel_Name();

		/**
		 * The meta object literal for the '<em><b>Style Class</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMF_MODEL__STYLE_CLASS = eINSTANCE.getEmfModel_StyleClass();

		/**
		 * The meta object literal for the '<em><b>Binding Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_MODEL__BINDING_MODEL = eINSTANCE.getEmfModel_BindingModel();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_MODEL__ROOT = eINSTANCE.getEmfModel_Root();

		/**
		 * The meta object literal for the '<em><b>Beans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMF_MODEL__BEANS = eINSTANCE.getEmfModel_Beans();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.EBeanImpl <em>EBean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.EBeanImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEBean()
		 * @generated
		 */
		EClass EBEAN = eINSTANCE.getEBean();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBEAN__NAME = eINSTANCE.getEBean_Name();

		/**
		 * The meta object literal for the '<em><b>Instance Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBEAN__INSTANCE_NAME = eINSTANCE.getEBean_InstanceName();

		/**
		 * The meta object literal for the '<em><b>Generate Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBEAN__GENERATE_CLASS = eINSTANCE.getEBean_GenerateClass();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EBEAN__FIELDS = eINSTANCE.getEBean_Fields();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.EFieldImpl <em>EField</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.EFieldImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEField()
		 * @generated
		 */
		EClass EFIELD = eINSTANCE.getEField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFIELD__NAME = eINSTANCE.getEField_Name();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFIELD__DATATYPE = eINSTANCE.getEField_Datatype();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.EBindingModelImpl <em>EBinding Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.EBindingModelImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEBindingModel()
		 * @generated
		 */
		EClass EBINDING_MODEL = eINSTANCE.getEBindingModel();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EBINDING_MODEL__BINDINGS = eINSTANCE.getEBindingModel_Bindings();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.EBindingImpl <em>EBinding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.EBindingImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEBinding()
		 * @generated
		 */
		EClass EBINDING = eINSTANCE.getEBinding();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBINDING__NAME = eINSTANCE.getEBinding_Name();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EBINDING__NODE = eINSTANCE.getEBinding_Node();

		/**
		 * The meta object literal for the '<em><b>Binding Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBINDING__BINDING_TYPE = eINSTANCE.getEBinding_BindingType();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBINDING__BINDING = eINSTANCE.getEBinding_Binding();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBINDING__DIRECTION = eINSTANCE.getEBinding_Direction();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.EEventsImpl <em>EEvents</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.EEventsImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEEvents()
		 * @generated
		 */
		EClass EEVENTS = eINSTANCE.getEEvents();

		/**
		 * The meta object literal for the '<em><b>On Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEVENTS__ON_ACTION = eINSTANCE.getEEvents_OnAction();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.StyleableImpl <em>Styleable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.StyleableImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getStyleable()
		 * @generated
		 */
		EClass STYLEABLE = eINSTANCE.getStyleable();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.SkinnableImpl <em>Skinnable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.SkinnableImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getSkinnable()
		 * @generated
		 */
		EClass SKINNABLE = eINSTANCE.getSkinnable();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.ENodeImpl <em>ENode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.ENodeImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getENode()
		 * @generated
		 */
		EClass ENODE = eINSTANCE.getENode();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENODE__ID = eINSTANCE.getENode_Id();

		/**
		 * The meta object literal for the '<em><b>Layout X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENODE__LAYOUT_X = eINSTANCE.getENode_LayoutX();

		/**
		 * The meta object literal for the '<em><b>Layout Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENODE__LAYOUT_Y = eINSTANCE.getENode_LayoutY();

		/**
		 * The meta object literal for the '<em><b>Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENODE__OPACITY = eINSTANCE.getENode_Opacity();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENODE__STYLE = eINSTANCE.getENode_Style();

		/**
		 * The meta object literal for the '<em><b>Style Class</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENODE__STYLE_CLASS = eINSTANCE.getENode_StyleClass();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENODE__VISIBLE = eINSTANCE.getENode_Visible();

		/**
		 * The meta object literal for the '<em><b>Disable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENODE__DISABLE = eINSTANCE.getENode_Disable();

		/**
		 * The meta object literal for the '<em><b>Margin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENODE__MARGIN = eINSTANCE.getENode_Margin();

		/**
		 * The meta object literal for the '<em><b>Max Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENODE__MAX_HEIGHT = eINSTANCE.getENode_MaxHeight();

		/**
		 * The meta object literal for the '<em><b>Min Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENODE__MIN_HEIGHT = eINSTANCE.getENode_MinHeight();

		/**
		 * The meta object literal for the '<em><b>Pref Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENODE__PREF_HEIGHT = eINSTANCE.getENode_PrefHeight();

		/**
		 * The meta object literal for the '<em><b>Max Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENODE__MAX_WIDTH = eINSTANCE.getENode_MaxWidth();

		/**
		 * The meta object literal for the '<em><b>Min Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENODE__MIN_WIDTH = eINSTANCE.getENode_MinWidth();

		/**
		 * The meta object literal for the '<em><b>Pref Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENODE__PREF_WIDTH = eINSTANCE.getENode_PrefWidth();

		/**
		 * The meta object literal for the '<em><b>Padding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENODE__PADDING = eINSTANCE.getENode_Padding();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENODE__CHILDREN = eINSTANCE.getENode_Children();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.EInsetsImpl <em>EInsets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.EInsetsImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEInsets()
		 * @generated
		 */
		EClass EINSETS = eINSTANCE.getEInsets();

		/**
		 * The meta object literal for the '<em><b>Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINSETS__TOP = eINSTANCE.getEInsets_Top();

		/**
		 * The meta object literal for the '<em><b>Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINSETS__BOTTOM = eINSTANCE.getEInsets_Bottom();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINSETS__RIGHT = eINSTANCE.getEInsets_Right();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINSETS__LEFT = eINSTANCE.getEInsets_Left();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.EGroupImpl <em>EGroup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.EGroupImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEGroup()
		 * @generated
		 */
		EClass EGROUP = eINSTANCE.getEGroup();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.EWebViewImpl <em>EWeb View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.EWebViewImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEWebView()
		 * @generated
		 */
		EClass EWEB_VIEW = eINSTANCE.getEWebView();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.EControlImpl <em>EControl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.EControlImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEControl()
		 * @generated
		 */
		EClass ECONTROL = eINSTANCE.getEControl();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.ELabeledImpl <em>ELabeled</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.ELabeledImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getELabeled()
		 * @generated
		 */
		EClass ELABELED = eINSTANCE.getELabeled();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELABELED__TEXT = eINSTANCE.getELabeled_Text();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.ETextImpl <em>EText</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.ETextImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEText()
		 * @generated
		 */
		EClass ETEXT = eINSTANCE.getEText();

		/**
		 * The meta object literal for the '<em><b>Promt Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETEXT__PROMT_TEXT = eINSTANCE.getEText_PromtText();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.ELabelImpl <em>ELabel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.ELabelImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getELabel()
		 * @generated
		 */
		EClass ELABEL = eINSTANCE.getELabel();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.EButtonBaseImpl <em>EButton Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.EButtonBaseImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEButtonBase()
		 * @generated
		 */
		EClass EBUTTON_BASE = eINSTANCE.getEButtonBase();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.EButtonImpl <em>EButton</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.EButtonImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEButton()
		 * @generated
		 */
		EClass EBUTTON = eINSTANCE.getEButton();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.ECheckBoxImpl <em>ECheck Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.ECheckBoxImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getECheckBox()
		 * @generated
		 */
		EClass ECHECK_BOX = eINSTANCE.getECheckBox();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECHECK_BOX__SELECTED = eINSTANCE.getECheckBox_Selected();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.EHyperlinkImpl <em>EHyperlink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.EHyperlinkImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEHyperlink()
		 * @generated
		 */
		EClass EHYPERLINK = eINSTANCE.getEHyperlink();

		/**
		 * The meta object literal for the '<em><b>Visited</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EHYPERLINK__VISITED = eINSTANCE.getEHyperlink_Visited();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.EMenuButtonImpl <em>EMenu Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.EMenuButtonImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEMenuButton()
		 * @generated
		 */
		EClass EMENU_BUTTON = eINSTANCE.getEMenuButton();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.ESplitMenuButtonImpl <em>ESplit Menu Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.ESplitMenuButtonImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getESplitMenuButton()
		 * @generated
		 */
		EClass ESPLIT_MENU_BUTTON = eINSTANCE.getESplitMenuButton();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.EToogleButtonImpl <em>EToogle Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.EToogleButtonImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEToogleButton()
		 * @generated
		 */
		EClass ETOOGLE_BUTTON = eINSTANCE.getEToogleButton();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETOOGLE_BUTTON__SELECTED = eINSTANCE.getEToogleButton_Selected();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.EBaseViewImpl <em>EBase View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.EBaseViewImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEBaseView()
		 * @generated
		 */
		EClass EBASE_VIEW = eINSTANCE.getEBaseView();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EBASE_VIEW__MODEL = eINSTANCE.getEBaseView_Model();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.EFilteredTableViewImpl <em>EFiltered Table View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.EFilteredTableViewImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEFilteredTableView()
		 * @generated
		 */
		EClass EFILTERED_TABLE_VIEW = eINSTANCE.getEFilteredTableView();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.ETableViewImpl <em>ETable View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.ETableViewImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getETableView()
		 * @generated
		 */
		EClass ETABLE_VIEW = eINSTANCE.getETableView();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETABLE_VIEW__COLUMNS = eINSTANCE.getETableView_Columns();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.ETableColumnImpl <em>ETable Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.ETableColumnImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getETableColumn()
		 * @generated
		 */
		EClass ETABLE_COLUMN = eINSTANCE.getETableColumn();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETABLE_COLUMN__ID = eINSTANCE.getETableColumn_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETABLE_COLUMN__NAME = eINSTANCE.getETableColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETABLE_COLUMN__WIDTH = eINSTANCE.getETableColumn_Width();

		/**
		 * The meta object literal for the '<em><b>Cell Value Factory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETABLE_COLUMN__CELL_VALUE_FACTORY = eINSTANCE.getETableColumn_CellValueFactory();

		/**
		 * The meta object literal for the '<em><b>Cell Factory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETABLE_COLUMN__CELL_FACTORY = eINSTANCE.getETableColumn_CellFactory();

		/**
		 * The meta object literal for the '<em><b>Associated Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETABLE_COLUMN__ASSOCIATED_FIELD = eINSTANCE.getETableColumn_AssociatedField();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.EListViewImpl <em>EList View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.EListViewImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEListView()
		 * @generated
		 */
		EClass ELIST_VIEW = eINSTANCE.getEListView();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.ERadioButtonImpl <em>ERadio Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.ERadioButtonImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getERadioButton()
		 * @generated
		 */
		EClass ERADIO_BUTTON = eINSTANCE.getERadioButton();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.EAxisImpl <em>EAxis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.EAxisImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEAxis()
		 * @generated
		 */
		EClass EAXIS = eINSTANCE.getEAxis();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.ECatgeoryAxisImpl <em>ECatgeory Axis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.ECatgeoryAxisImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getECatgeoryAxis()
		 * @generated
		 */
		EClass ECATGEORY_AXIS = eINSTANCE.getECatgeoryAxis();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.EValueAxisImpl <em>EValue Axis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.EValueAxisImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEValueAxis()
		 * @generated
		 */
		EClass EVALUE_AXIS = eINSTANCE.getEValueAxis();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.EChartImpl <em>EChart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.EChartImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEChart()
		 * @generated
		 */
		EClass ECHART = eINSTANCE.getEChart();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.EPieChartImpl <em>EPie Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.EPieChartImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEPieChart()
		 * @generated
		 */
		EClass EPIE_CHART = eINSTANCE.getEPieChart();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.EXYChartImpl <em>EXY Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.EXYChartImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEXYChart()
		 * @generated
		 */
		EClass EXY_CHART = eINSTANCE.getEXYChart();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.EPaneImpl <em>EPane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.EPaneImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEPane()
		 * @generated
		 */
		EClass EPANE = eINSTANCE.getEPane();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPANE__POS = eINSTANCE.getEPane_Pos();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.EStackPaneImpl <em>EStack Pane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.EStackPaneImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEStackPane()
		 * @generated
		 */
		EClass ESTACK_PANE = eINSTANCE.getEStackPane();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.EDialogPaneImpl <em>EDialog Pane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.EDialogPaneImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEDialogPane()
		 * @generated
		 */
		EClass EDIALOG_PANE = eINSTANCE.getEDialogPane();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDIALOG_PANE__HEADER = eINSTANCE.getEDialogPane_Header();

		/**
		 * The meta object literal for the '<em><b>Header Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDIALOG_PANE__HEADER_TEXT = eINSTANCE.getEDialogPane_HeaderText();

		/**
		 * The meta object literal for the '<em><b>Content Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDIALOG_PANE__CONTENT_TEXT = eINSTANCE.getEDialogPane_ContentText();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIALOG_PANE__CONTENT = eINSTANCE.getEDialogPane_Content();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.EGridPaneImpl <em>EGrid Pane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.EGridPaneImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEGridPane()
		 * @generated
		 */
		EClass EGRID_PANE = eINSTANCE.getEGridPane();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.EHBoxImpl <em>EH Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.EHBoxImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEHBox()
		 * @generated
		 */
		EClass EH_BOX = eINSTANCE.getEHBox();

		/**
		 * The meta object literal for the '<em><b>Spacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EH_BOX__SPACING = eINSTANCE.getEHBox_Spacing();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.EVBoxImpl <em>EV Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.EVBoxImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEVBox()
		 * @generated
		 */
		EClass EV_BOX = eINSTANCE.getEVBox();

		/**
		 * The meta object literal for the '<em><b>Spacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EV_BOX__SPACING = eINSTANCE.getEVBox_Spacing();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.EFlowPaneImpl <em>EFlow Pane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.EFlowPaneImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEFlowPane()
		 * @generated
		 */
		EClass EFLOW_PANE = eINSTANCE.getEFlowPane();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.ESplitPaneImpl <em>ESplit Pane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.ESplitPaneImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getESplitPane()
		 * @generated
		 */
		EClass ESPLIT_PANE = eINSTANCE.getESplitPane();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.ETilePaneImpl <em>ETile Pane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.ETilePaneImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getETilePane()
		 * @generated
		 */
		EClass ETILE_PANE = eINSTANCE.getETilePane();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.EAnchorPaneImpl <em>EAnchor Pane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.EAnchorPaneImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEAnchorPane()
		 * @generated
		 */
		EClass EANCHOR_PANE = eINSTANCE.getEAnchorPane();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.impl.EBorderPaneImpl <em>EBorder Pane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.impl.EBorderPaneImpl
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEBorderPane()
		 * @generated
		 */
		EClass EBORDER_PANE = eINSTANCE.getEBorderPane();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EBORDER_PANE__LEFT = eINSTANCE.getEBorderPane_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EBORDER_PANE__RIGHT = eINSTANCE.getEBorderPane_Right();

		/**
		 * The meta object literal for the '<em><b>Top</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EBORDER_PANE__TOP = eINSTANCE.getEBorderPane_Top();

		/**
		 * The meta object literal for the '<em><b>Bottom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EBORDER_PANE__BOTTOM = eINSTANCE.getEBorderPane_Bottom();

		/**
		 * The meta object literal for the '<em><b>Center</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EBORDER_PANE__CENTER = eINSTANCE.getEBorderPane_Center();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.EControlBinding <em>EControl Binding</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.EControlBinding
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEControlBinding()
		 * @generated
		 */
		EEnum ECONTROL_BINDING = eINSTANCE.getEControlBinding();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.EBindingType <em>EBinding Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.EBindingType
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEBindingType()
		 * @generated
		 */
		EEnum EBINDING_TYPE = eINSTANCE.getEBindingType();

		/**
		 * The meta object literal for the '{@link de.dc.javafx.mm.EBindingDirection <em>EBinding Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.javafx.mm.EBindingDirection
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEBindingDirection()
		 * @generated
		 */
		EEnum EBINDING_DIRECTION = eINSTANCE.getEBindingDirection();

		/**
		 * The meta object literal for the '<em>EPos</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javafx.geometry.Pos
		 * @see de.dc.javafx.mm.impl.MmPackageImpl#getEPos()
		 * @generated
		 */
		EDataType EPOS = eINSTANCE.getEPos();

	}

} //MmPackage
