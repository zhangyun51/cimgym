/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.OperationalLimits.util;

import CPSM.Core.IdentifiedObject;

import CPSM.Element;

import CPSM.OperationalLimits.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see CPSM.OperationalLimits.OperationalLimitsPackage
 * @generated
 */
public class OperationalLimitsSwitch<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OperationalLimitsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalLimitsSwitch() {
		if (modelPackage == null) {
			modelPackage = OperationalLimitsPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OperationalLimitsPackage.OPERATIONAL_LIMIT: {
				OperationalLimit operationalLimit = (OperationalLimit)theEObject;
				T result = caseOperationalLimit(operationalLimit);
				if (result == null) result = caseIdentifiedObject(operationalLimit);
				if (result == null) result = caseElement(operationalLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationalLimitsPackage.OPERATIONAL_LIMIT_SET: {
				OperationalLimitSet operationalLimitSet = (OperationalLimitSet)theEObject;
				T result = caseOperationalLimitSet(operationalLimitSet);
				if (result == null) result = caseIdentifiedObject(operationalLimitSet);
				if (result == null) result = caseElement(operationalLimitSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationalLimitsPackage.ACTIVE_POWER_LIMIT: {
				ActivePowerLimit activePowerLimit = (ActivePowerLimit)theEObject;
				T result = caseActivePowerLimit(activePowerLimit);
				if (result == null) result = caseOperationalLimit(activePowerLimit);
				if (result == null) result = caseIdentifiedObject(activePowerLimit);
				if (result == null) result = caseElement(activePowerLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationalLimitsPackage.APPARENT_POWER_LIMIT: {
				ApparentPowerLimit apparentPowerLimit = (ApparentPowerLimit)theEObject;
				T result = caseApparentPowerLimit(apparentPowerLimit);
				if (result == null) result = caseOperationalLimit(apparentPowerLimit);
				if (result == null) result = caseIdentifiedObject(apparentPowerLimit);
				if (result == null) result = caseElement(apparentPowerLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationalLimitsPackage.VOLTAGE_LIMIT: {
				VoltageLimit voltageLimit = (VoltageLimit)theEObject;
				T result = caseVoltageLimit(voltageLimit);
				if (result == null) result = caseOperationalLimit(voltageLimit);
				if (result == null) result = caseIdentifiedObject(voltageLimit);
				if (result == null) result = caseElement(voltageLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationalLimitsPackage.CURRENT_LIMIT: {
				CurrentLimit currentLimit = (CurrentLimit)theEObject;
				T result = caseCurrentLimit(currentLimit);
				if (result == null) result = caseOperationalLimit(currentLimit);
				if (result == null) result = caseIdentifiedObject(currentLimit);
				if (result == null) result = caseElement(currentLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalLimit(OperationalLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Limit Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Limit Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalLimitSet(OperationalLimitSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Active Power Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Active Power Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivePowerLimit(ActivePowerLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apparent Power Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apparent Power Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApparentPowerLimit(ApparentPowerLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Voltage Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Voltage Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoltageLimit(VoltageLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Current Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Current Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrentLimit(CurrentLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedObject(IdentifiedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //OperationalLimitsSwitch