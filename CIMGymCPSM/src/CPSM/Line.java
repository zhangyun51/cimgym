/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.Line#getRegion <em>Region</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getLine()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A component part of a system extending between adjacent substations or from a substation to an adjacent interconnection point.'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A component part of a system extending between adjacent substations or from a substation to an adjacent interconnection point.'"
 * @generated
 */
public interface Line extends EquipmentContainer {
	/**
	 * Returns the value of the '<em><b>Region</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CPSM.SubGeographicalRegion#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' reference.
	 * @see #setRegion(SubGeographicalRegion)
	 * @see CPSM.CPSMPackage#getLine_Region()
	 * @see CPSM.SubGeographicalRegion#getLines
	 * @model opposite="Lines" required="true"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A Line can be contained by a SubGeographical Region.'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A Line can be contained by a SubGeographical Region.'"
	 * @generated
	 */
	SubGeographicalRegion getRegion();

	/**
	 * Sets the value of the '{@link CPSM.Line#getRegion <em>Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' reference.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(SubGeographicalRegion value);

} // Line
