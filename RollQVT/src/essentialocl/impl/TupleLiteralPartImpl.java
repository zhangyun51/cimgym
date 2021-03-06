/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package essentialocl.impl;

import emof.Property;

import emof.impl.TypedElementImpl;

import essentialocl.EssentialoclPackage;
import essentialocl.OclExpression;
import essentialocl.TupleLiteralExp;
import essentialocl.TupleLiteralPart;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tuple Literal Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link essentialocl.impl.TupleLiteralPartImpl#getTupleLiteralExp <em>Tuple Literal Exp</em>}</li>
 *   <li>{@link essentialocl.impl.TupleLiteralPartImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link essentialocl.impl.TupleLiteralPartImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TupleLiteralPartImpl extends TypedElementImpl implements TupleLiteralPart {
	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected Property attribute;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected OclExpression value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TupleLiteralPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssentialoclPackage.Literals.TUPLE_LITERAL_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleLiteralExp getTupleLiteralExp() {
		if (eContainerFeatureID() != EssentialoclPackage.TUPLE_LITERAL_PART__TUPLE_LITERAL_EXP) return null;
		return (TupleLiteralExp)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTupleLiteralExp(TupleLiteralExp newTupleLiteralExp, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTupleLiteralExp, EssentialoclPackage.TUPLE_LITERAL_PART__TUPLE_LITERAL_EXP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTupleLiteralExp(TupleLiteralExp newTupleLiteralExp) {
		if (newTupleLiteralExp != eInternalContainer() || (eContainerFeatureID() != EssentialoclPackage.TUPLE_LITERAL_PART__TUPLE_LITERAL_EXP && newTupleLiteralExp != null)) {
			if (EcoreUtil.isAncestor(this, newTupleLiteralExp))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTupleLiteralExp != null)
				msgs = ((InternalEObject)newTupleLiteralExp).eInverseAdd(this, EssentialoclPackage.TUPLE_LITERAL_EXP__PART, TupleLiteralExp.class, msgs);
			msgs = basicSetTupleLiteralExp(newTupleLiteralExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssentialoclPackage.TUPLE_LITERAL_PART__TUPLE_LITERAL_EXP, newTupleLiteralExp, newTupleLiteralExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttribute(Property newAttribute, NotificationChain msgs) {
		Property oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssentialoclPackage.TUPLE_LITERAL_PART__ATTRIBUTE, oldAttribute, newAttribute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(Property newAttribute) {
		if (newAttribute != attribute) {
			NotificationChain msgs = null;
			if (attribute != null)
				msgs = ((InternalEObject)attribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssentialoclPackage.TUPLE_LITERAL_PART__ATTRIBUTE, null, msgs);
			if (newAttribute != null)
				msgs = ((InternalEObject)newAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssentialoclPackage.TUPLE_LITERAL_PART__ATTRIBUTE, null, msgs);
			msgs = basicSetAttribute(newAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssentialoclPackage.TUPLE_LITERAL_PART__ATTRIBUTE, newAttribute, newAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclExpression getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(OclExpression newValue, NotificationChain msgs) {
		OclExpression oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssentialoclPackage.TUPLE_LITERAL_PART__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(OclExpression newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssentialoclPackage.TUPLE_LITERAL_PART__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssentialoclPackage.TUPLE_LITERAL_PART__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssentialoclPackage.TUPLE_LITERAL_PART__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssentialoclPackage.TUPLE_LITERAL_PART__TUPLE_LITERAL_EXP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTupleLiteralExp((TupleLiteralExp)otherEnd, msgs);
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
			case EssentialoclPackage.TUPLE_LITERAL_PART__TUPLE_LITERAL_EXP:
				return basicSetTupleLiteralExp(null, msgs);
			case EssentialoclPackage.TUPLE_LITERAL_PART__ATTRIBUTE:
				return basicSetAttribute(null, msgs);
			case EssentialoclPackage.TUPLE_LITERAL_PART__VALUE:
				return basicSetValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case EssentialoclPackage.TUPLE_LITERAL_PART__TUPLE_LITERAL_EXP:
				return eInternalContainer().eInverseRemove(this, EssentialoclPackage.TUPLE_LITERAL_EXP__PART, TupleLiteralExp.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EssentialoclPackage.TUPLE_LITERAL_PART__TUPLE_LITERAL_EXP:
				return getTupleLiteralExp();
			case EssentialoclPackage.TUPLE_LITERAL_PART__ATTRIBUTE:
				return getAttribute();
			case EssentialoclPackage.TUPLE_LITERAL_PART__VALUE:
				return getValue();
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
			case EssentialoclPackage.TUPLE_LITERAL_PART__TUPLE_LITERAL_EXP:
				setTupleLiteralExp((TupleLiteralExp)newValue);
				return;
			case EssentialoclPackage.TUPLE_LITERAL_PART__ATTRIBUTE:
				setAttribute((Property)newValue);
				return;
			case EssentialoclPackage.TUPLE_LITERAL_PART__VALUE:
				setValue((OclExpression)newValue);
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
			case EssentialoclPackage.TUPLE_LITERAL_PART__TUPLE_LITERAL_EXP:
				setTupleLiteralExp((TupleLiteralExp)null);
				return;
			case EssentialoclPackage.TUPLE_LITERAL_PART__ATTRIBUTE:
				setAttribute((Property)null);
				return;
			case EssentialoclPackage.TUPLE_LITERAL_PART__VALUE:
				setValue((OclExpression)null);
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
			case EssentialoclPackage.TUPLE_LITERAL_PART__TUPLE_LITERAL_EXP:
				return getTupleLiteralExp() != null;
			case EssentialoclPackage.TUPLE_LITERAL_PART__ATTRIBUTE:
				return attribute != null;
			case EssentialoclPackage.TUPLE_LITERAL_PART__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}

} //TupleLiteralPartImpl
