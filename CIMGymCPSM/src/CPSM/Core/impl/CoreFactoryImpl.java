/**
 * Copyright (c) 2009 Richard Lincoln
 *
 * $Id$
 */
package CPSM.Core.impl;

import CPSM.Core.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreFactoryImpl extends EFactoryImpl implements CoreFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009 Richard Lincoln";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoreFactory init() {
		try {
			CoreFactory theCoreFactory = (CoreFactory)EPackage.Registry.INSTANCE.getEFactory("http://iec.ch/TC57/2008/CIM-schema-cim13#Package_Core"); 
			if (theCoreFactory != null) {
				return theCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CorePackage.IDENTIFIED_OBJECT: return createIdentifiedObject();
			case CorePackage.TERMINAL: return createTerminal();
			case CorePackage.BASE_VOLTAGE: return createBaseVoltage();
			case CorePackage.REGULAR_INTERVAL_SCHEDULE: return createRegularIntervalSchedule();
			case CorePackage.CONNECTIVITY_NODE_CONTAINER: return createConnectivityNodeContainer();
			case CorePackage.UNIT: return createUnit();
			case CorePackage.EQUIPMENT_CONTAINER: return createEquipmentContainer();
			case CorePackage.VOLTAGE_LEVEL: return createVoltageLevel();
			case CorePackage.BAY: return createBay();
			case CorePackage.SUB_GEOGRAPHICAL_REGION: return createSubGeographicalRegion();
			case CorePackage.REGULAR_TIME_POINT: return createRegularTimePoint();
			case CorePackage.EQUIPMENT: return createEquipment();
			case CorePackage.SUBSTATION: return createSubstation();
			case CorePackage.CURVE: return createCurve();
			case CorePackage.POWER_SYSTEM_RESOURCE: return createPowerSystemResource();
			case CorePackage.BASIC_INTERVAL_SCHEDULE: return createBasicIntervalSchedule();
			case CorePackage.CURVE_DATA: return createCurveData();
			case CorePackage.GEOGRAPHICAL_REGION: return createGeographicalRegion();
			case CorePackage.CONDUCTING_EQUIPMENT: return createConductingEquipment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CorePackage.CURVE_STYLE:
				return createCurveStyleFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CorePackage.CURVE_STYLE:
				return convertCurveStyleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifiedObject createIdentifiedObject() {
		IdentifiedObjectImpl identifiedObject = new IdentifiedObjectImpl();
		return identifiedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal createTerminal() {
		TerminalImpl terminal = new TerminalImpl();
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseVoltage createBaseVoltage() {
		BaseVoltageImpl baseVoltage = new BaseVoltageImpl();
		return baseVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularIntervalSchedule createRegularIntervalSchedule() {
		RegularIntervalScheduleImpl regularIntervalSchedule = new RegularIntervalScheduleImpl();
		return regularIntervalSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectivityNodeContainer createConnectivityNodeContainer() {
		ConnectivityNodeContainerImpl connectivityNodeContainer = new ConnectivityNodeContainerImpl();
		return connectivityNodeContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit createUnit() {
		UnitImpl unit = new UnitImpl();
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquipmentContainer createEquipmentContainer() {
		EquipmentContainerImpl equipmentContainer = new EquipmentContainerImpl();
		return equipmentContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageLevel createVoltageLevel() {
		VoltageLevelImpl voltageLevel = new VoltageLevelImpl();
		return voltageLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bay createBay() {
		BayImpl bay = new BayImpl();
		return bay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubGeographicalRegion createSubGeographicalRegion() {
		SubGeographicalRegionImpl subGeographicalRegion = new SubGeographicalRegionImpl();
		return subGeographicalRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegularTimePoint createRegularTimePoint() {
		RegularTimePointImpl regularTimePoint = new RegularTimePointImpl();
		return regularTimePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equipment createEquipment() {
		EquipmentImpl equipment = new EquipmentImpl();
		return equipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substation createSubstation() {
		SubstationImpl substation = new SubstationImpl();
		return substation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Curve createCurve() {
		CurveImpl curve = new CurveImpl();
		return curve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerSystemResource createPowerSystemResource() {
		PowerSystemResourceImpl powerSystemResource = new PowerSystemResourceImpl();
		return powerSystemResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicIntervalSchedule createBasicIntervalSchedule() {
		BasicIntervalScheduleImpl basicIntervalSchedule = new BasicIntervalScheduleImpl();
		return basicIntervalSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveData createCurveData() {
		CurveDataImpl curveData = new CurveDataImpl();
		return curveData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeographicalRegion createGeographicalRegion() {
		GeographicalRegionImpl geographicalRegion = new GeographicalRegionImpl();
		return geographicalRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConductingEquipment createConductingEquipment() {
		ConductingEquipmentImpl conductingEquipment = new ConductingEquipmentImpl();
		return conductingEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveStyle createCurveStyleFromString(EDataType eDataType, String initialValue) {
		CurveStyle result = CurveStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCurveStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorePackage getCorePackage() {
		return (CorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CorePackage getPackage() {
		return CorePackage.eINSTANCE;
	}

} //CoreFactoryImpl