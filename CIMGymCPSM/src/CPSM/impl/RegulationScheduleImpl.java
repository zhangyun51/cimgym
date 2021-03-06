/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM.impl;

import CPSM.CPSMPackage;
import CPSM.RegulatingControl;
import CPSM.RegulationSchedule;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regulation Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CPSM.impl.RegulationScheduleImpl#getRegulatingControl <em>Regulating Control</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegulationScheduleImpl extends RegularIntervalScheduleImpl implements RegulationSchedule {
	/**
	 * The cached value of the '{@link #getRegulatingControl() <em>Regulating Control</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulatingControl()
	 * @generated
	 * @ordered
	 */
	protected EList<RegulatingControl> regulatingControl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegulationScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CPSMPackage.Literals.REGULATION_SCHEDULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RegulatingControl> getRegulatingControl() {
		if (regulatingControl == null) {
			regulatingControl = new EObjectWithInverseResolvingEList<RegulatingControl>(RegulatingControl.class, this, CPSMPackage.REGULATION_SCHEDULE__REGULATING_CONTROL, CPSMPackage.REGULATING_CONTROL__REGULATION_SCHEDULE);
		}
		return regulatingControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CPSMPackage.REGULATION_SCHEDULE__REGULATING_CONTROL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRegulatingControl()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CPSMPackage.REGULATION_SCHEDULE__REGULATING_CONTROL:
				return ((InternalEList<?>)getRegulatingControl()).basicRemove(otherEnd, msgs);
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
			case CPSMPackage.REGULATION_SCHEDULE__REGULATING_CONTROL:
				return getRegulatingControl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CPSMPackage.REGULATION_SCHEDULE__REGULATING_CONTROL:
				getRegulatingControl().clear();
				getRegulatingControl().addAll((Collection<? extends RegulatingControl>)newValue);
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
			case CPSMPackage.REGULATION_SCHEDULE__REGULATING_CONTROL:
				getRegulatingControl().clear();
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
			case CPSMPackage.REGULATION_SCHEDULE__REGULATING_CONTROL:
				return regulatingControl != null && !regulatingControl.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RegulationScheduleImpl
