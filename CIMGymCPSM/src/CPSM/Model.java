/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.Model#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link CPSM.Element}.
	 * It is bidirectional and its opposite is '{@link CPSM.Element#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see CPSM.CPSMPackage#getModel_Elements()
	 * @see CPSM.Element#getModel
	 * @model opposite="Model" containment="true"
	 * @generated
	 */
	EList<Element> getElements();

} // Model