/**
 */
package de.dc.javafx.mm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EBinding Direction</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dc.javafx.mm.MmPackage#getEBindingDirection()
 * @model
 * @generated
 */
public enum EBindingDirection implements Enumerator {
	/**
	 * The '<em><b>Bind</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIND_VALUE
	 * @generated
	 * @ordered
	 */
	BIND(0, "Bind", "Bind"),

	/**
	 * The '<em><b>Bind Bidirectional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIND_BIDIRECTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	BIND_BIDIRECTIONAL(0, "BindBidirectional", "BindBidirectional"),

	/**
	 * The '<em><b>Unbind</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNBIND_VALUE
	 * @generated
	 * @ordered
	 */
	UNBIND(0, "Unbind", "Unbind"),

	/**
	 * The '<em><b>Unbind Bidirectional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNBIND_BIDIRECTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	UNBIND_BIDIRECTIONAL(0, "UnbindBidirectional", "UnbindBidirectional");

	/**
	 * The '<em><b>Bind</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIND
	 * @model name="Bind"
	 * @generated
	 * @ordered
	 */
	public static final int BIND_VALUE = 0;

	/**
	 * The '<em><b>Bind Bidirectional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIND_BIDIRECTIONAL
	 * @model name="BindBidirectional"
	 * @generated
	 * @ordered
	 */
	public static final int BIND_BIDIRECTIONAL_VALUE = 0;

	/**
	 * The '<em><b>Unbind</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNBIND
	 * @model name="Unbind"
	 * @generated
	 * @ordered
	 */
	public static final int UNBIND_VALUE = 0;

	/**
	 * The '<em><b>Unbind Bidirectional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNBIND_BIDIRECTIONAL
	 * @model name="UnbindBidirectional"
	 * @generated
	 * @ordered
	 */
	public static final int UNBIND_BIDIRECTIONAL_VALUE = 0;

	/**
	 * An array of all the '<em><b>EBinding Direction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EBindingDirection[] VALUES_ARRAY = new EBindingDirection[] { BIND, BIND_BIDIRECTIONAL, UNBIND,
			UNBIND_BIDIRECTIONAL, };

	/**
	 * A public read-only list of all the '<em><b>EBinding Direction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EBindingDirection> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EBinding Direction</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EBindingDirection get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EBindingDirection result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EBinding Direction</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EBindingDirection getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EBindingDirection result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EBinding Direction</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EBindingDirection get(int value) {
		switch (value) {
		case BIND_VALUE:
			return BIND;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EBindingDirection(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
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
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //EBindingDirection
