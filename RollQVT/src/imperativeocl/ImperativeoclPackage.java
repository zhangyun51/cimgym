/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package imperativeocl;

import emof.EmofPackage;

import essentialocl.EssentialoclPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see imperativeocl.ImperativeoclFactory
 * @model kind="package"
 * @generated
 */
public interface ImperativeoclPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "imperativeocl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.schema.omg.org/spec/QVT/1.0/imperativeocl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "imperativeocl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImperativeoclPackage eINSTANCE = imperativeocl.impl.ImperativeoclPackageImpl.init();

	/**
	 * The meta object id for the '{@link imperativeocl.impl.ImperativeExpressionImpl <em>Imperative Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imperativeocl.impl.ImperativeExpressionImpl
	 * @see imperativeocl.impl.ImperativeoclPackageImpl#getImperativeExpression()
	 * @generated
	 */
	int IMPERATIVE_EXPRESSION = 24;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_EXPRESSION__TAG = EssentialoclPackage.OCL_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_EXPRESSION__OWNED_COMMENT = EssentialoclPackage.OCL_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_EXPRESSION__NAME = EssentialoclPackage.OCL_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_EXPRESSION__TYPE = EssentialoclPackage.OCL_EXPRESSION__TYPE;

	/**
	 * The number of structural features of the '<em>Imperative Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_EXPRESSION_FEATURE_COUNT = EssentialoclPackage.OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link imperativeocl.impl.AssignExpImpl <em>Assign Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imperativeocl.impl.AssignExpImpl
	 * @see imperativeocl.impl.ImperativeoclPackageImpl#getAssignExp()
	 * @generated
	 */
	int ASSIGN_EXP = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP__TAG = IMPERATIVE_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP__OWNED_COMMENT = IMPERATIVE_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP__NAME = IMPERATIVE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP__TYPE = IMPERATIVE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP__VALUE = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP__LEFT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP__DEFAULT_VALUE = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Reset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP__IS_RESET = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Assign Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_EXP_FEATURE_COUNT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link imperativeocl.impl.BlockExpImpl <em>Block Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imperativeocl.impl.BlockExpImpl
	 * @see imperativeocl.impl.ImperativeoclPackageImpl#getBlockExp()
	 * @generated
	 */
	int BLOCK_EXP = 1;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXP__TAG = IMPERATIVE_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXP__OWNED_COMMENT = IMPERATIVE_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXP__NAME = IMPERATIVE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXP__TYPE = IMPERATIVE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXP__BODY = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_EXP_FEATURE_COUNT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link imperativeocl.impl.SwitchExpImpl <em>Switch Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imperativeocl.impl.SwitchExpImpl
	 * @see imperativeocl.impl.ImperativeoclPackageImpl#getSwitchExp()
	 * @generated
	 */
	int SWITCH_EXP = 2;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP__TAG = EssentialoclPackage.CALL_EXP__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP__OWNED_COMMENT = EssentialoclPackage.CALL_EXP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP__NAME = EssentialoclPackage.CALL_EXP__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP__TYPE = EssentialoclPackage.CALL_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP__SOURCE = EssentialoclPackage.CALL_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Alternative Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP__ALTERNATIVE_PART = EssentialoclPackage.CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP__ELSE_PART = EssentialoclPackage.CALL_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Switch Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXP_FEATURE_COUNT = EssentialoclPackage.CALL_EXP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link imperativeocl.impl.VariableInitExpImpl <em>Variable Init Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imperativeocl.impl.VariableInitExpImpl
	 * @see imperativeocl.impl.ImperativeoclPackageImpl#getVariableInitExp()
	 * @generated
	 */
	int VARIABLE_INIT_EXP = 3;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INIT_EXP__TAG = IMPERATIVE_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INIT_EXP__OWNED_COMMENT = IMPERATIVE_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INIT_EXP__NAME = IMPERATIVE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INIT_EXP__TYPE = IMPERATIVE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Referred Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INIT_EXP__REFERRED_VARIABLE = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>With Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INIT_EXP__WITH_RESULT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Init Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_INIT_EXP_FEATURE_COUNT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link imperativeocl.impl.WhileExpImpl <em>While Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imperativeocl.impl.WhileExpImpl
	 * @see imperativeocl.impl.ImperativeoclPackageImpl#getWhileExp()
	 * @generated
	 */
	int WHILE_EXP = 4;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP__TAG = IMPERATIVE_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP__OWNED_COMMENT = IMPERATIVE_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP__NAME = IMPERATIVE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP__TYPE = IMPERATIVE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP__CONDITION = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP__BODY = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>While Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_EXP_FEATURE_COUNT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link imperativeocl.impl.ComputeExpImpl <em>Compute Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imperativeocl.impl.ComputeExpImpl
	 * @see imperativeocl.impl.ImperativeoclPackageImpl#getComputeExp()
	 * @generated
	 */
	int COMPUTE_EXP = 5;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_EXP__TAG = IMPERATIVE_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_EXP__OWNED_COMMENT = IMPERATIVE_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_EXP__NAME = IMPERATIVE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_EXP__TYPE = IMPERATIVE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Returned Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_EXP__RETURNED_ELEMENT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_EXP__BODY = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compute Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_EXP_FEATURE_COUNT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link imperativeocl.impl.AltExpImpl <em>Alt Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imperativeocl.impl.AltExpImpl
	 * @see imperativeocl.impl.ImperativeoclPackageImpl#getAltExp()
	 * @generated
	 */
	int ALT_EXP = 6;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_EXP__TAG = IMPERATIVE_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_EXP__OWNED_COMMENT = IMPERATIVE_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_EXP__NAME = IMPERATIVE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_EXP__TYPE = IMPERATIVE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_EXP__CONDITION = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_EXP__BODY = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Alt Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALT_EXP_FEATURE_COUNT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link imperativeocl.impl.UnlinkExpImpl <em>Unlink Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imperativeocl.impl.UnlinkExpImpl
	 * @see imperativeocl.impl.ImperativeoclPackageImpl#getUnlinkExp()
	 * @generated
	 */
	int UNLINK_EXP = 7;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLINK_EXP__TAG = IMPERATIVE_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLINK_EXP__OWNED_COMMENT = IMPERATIVE_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLINK_EXP__NAME = IMPERATIVE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLINK_EXP__TYPE = IMPERATIVE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLINK_EXP__TARGET = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLINK_EXP__ITEM = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unlink Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLINK_EXP_FEATURE_COUNT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link imperativeocl.impl.ReturnExpImpl <em>Return Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imperativeocl.impl.ReturnExpImpl
	 * @see imperativeocl.impl.ImperativeoclPackageImpl#getReturnExp()
	 * @generated
	 */
	int RETURN_EXP = 8;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_EXP__TAG = IMPERATIVE_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_EXP__OWNED_COMMENT = IMPERATIVE_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_EXP__NAME = IMPERATIVE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_EXP__TYPE = IMPERATIVE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_EXP__VALUE = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_EXP_FEATURE_COUNT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link imperativeocl.impl.BreakExpImpl <em>Break Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imperativeocl.impl.BreakExpImpl
	 * @see imperativeocl.impl.ImperativeoclPackageImpl#getBreakExp()
	 * @generated
	 */
	int BREAK_EXP = 9;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_EXP__TAG = IMPERATIVE_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_EXP__OWNED_COMMENT = IMPERATIVE_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_EXP__NAME = IMPERATIVE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_EXP__TYPE = IMPERATIVE_EXPRESSION__TYPE;

	/**
	 * The number of structural features of the '<em>Break Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_EXP_FEATURE_COUNT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link imperativeocl.impl.TryExpImpl <em>Try Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imperativeocl.impl.TryExpImpl
	 * @see imperativeocl.impl.ImperativeoclPackageImpl#getTryExp()
	 * @generated
	 */
	int TRY_EXP = 10;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_EXP__TAG = IMPERATIVE_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_EXP__OWNED_COMMENT = IMPERATIVE_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_EXP__NAME = IMPERATIVE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_EXP__TYPE = IMPERATIVE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Try Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_EXP__TRY_BODY = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Catch Clause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_EXP__CATCH_CLAUSE = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Try Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_EXP_FEATURE_COUNT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link imperativeocl.impl.RaiseExpImpl <em>Raise Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imperativeocl.impl.RaiseExpImpl
	 * @see imperativeocl.impl.ImperativeoclPackageImpl#getRaiseExp()
	 * @generated
	 */
	int RAISE_EXP = 11;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXP__TAG = IMPERATIVE_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXP__OWNED_COMMENT = IMPERATIVE_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXP__NAME = IMPERATIVE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXP__TYPE = IMPERATIVE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXP__EXCEPTION = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXP__ARGUMENT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Raise Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXP_FEATURE_COUNT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link imperativeocl.impl.ContinueExpImpl <em>Continue Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imperativeocl.impl.ContinueExpImpl
	 * @see imperativeocl.impl.ImperativeoclPackageImpl#getContinueExp()
	 * @generated
	 */
	int CONTINUE_EXP = 12;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_EXP__TAG = IMPERATIVE_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_EXP__OWNED_COMMENT = IMPERATIVE_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_EXP__NAME = IMPERATIVE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_EXP__TYPE = IMPERATIVE_EXPRESSION__TYPE;

	/**
	 * The number of structural features of the '<em>Continue Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_EXP_FEATURE_COUNT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link imperativeocl.impl.ImperativeLoopExpImpl <em>Imperative Loop Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imperativeocl.impl.ImperativeLoopExpImpl
	 * @see imperativeocl.impl.ImperativeoclPackageImpl#getImperativeLoopExp()
	 * @generated
	 */
	int IMPERATIVE_LOOP_EXP = 22;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP__TAG = EssentialoclPackage.LOOP_EXP__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP__OWNED_COMMENT = EssentialoclPackage.LOOP_EXP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP__NAME = EssentialoclPackage.LOOP_EXP__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP__TYPE = EssentialoclPackage.LOOP_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP__SOURCE = EssentialoclPackage.LOOP_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP__BODY = EssentialoclPackage.LOOP_EXP__BODY;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP__ITERATOR = EssentialoclPackage.LOOP_EXP__ITERATOR;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP__CONDITION = EssentialoclPackage.LOOP_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Imperative Loop Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_LOOP_EXP_FEATURE_COUNT = EssentialoclPackage.LOOP_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link imperativeocl.impl.ForExpImpl <em>For Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imperativeocl.impl.ForExpImpl
	 * @see imperativeocl.impl.ImperativeoclPackageImpl#getForExp()
	 * @generated
	 */
	int FOR_EXP = 13;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP__TAG = IMPERATIVE_LOOP_EXP__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP__OWNED_COMMENT = IMPERATIVE_LOOP_EXP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP__NAME = IMPERATIVE_LOOP_EXP__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP__TYPE = IMPERATIVE_LOOP_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP__SOURCE = IMPERATIVE_LOOP_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP__BODY = IMPERATIVE_LOOP_EXP__BODY;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP__ITERATOR = IMPERATIVE_LOOP_EXP__ITERATOR;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP__CONDITION = IMPERATIVE_LOOP_EXP__CONDITION;

	/**
	 * The number of structural features of the '<em>For Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EXP_FEATURE_COUNT = IMPERATIVE_LOOP_EXP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link imperativeocl.impl.TypedefImpl <em>Typedef</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imperativeocl.impl.TypedefImpl
	 * @see imperativeocl.impl.ImperativeoclPackageImpl#getTypedef()
	 * @generated
	 */
	int TYPEDEF = 14;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF__TAG = EmofPackage.CLASS__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF__OWNED_COMMENT = EmofPackage.CLASS__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF__NAME = EmofPackage.CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF__PACKAGE = EmofPackage.CLASS__PACKAGE;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF__OWNED_ATTRIBUTE = EmofPackage.CLASS__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF__OWNED_OPERATION = EmofPackage.CLASS__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF__SUPER_CLASS = EmofPackage.CLASS__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF__IS_ABSTRACT = EmofPackage.CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF__BASE = EmofPackage.CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF__CONDITION = EmofPackage.CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Typedef</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPEDEF_FEATURE_COUNT = EmofPackage.CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link imperativeocl.impl.InstantiationExpImpl <em>Instantiation Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imperativeocl.impl.InstantiationExpImpl
	 * @see imperativeocl.impl.ImperativeoclPackageImpl#getInstantiationExp()
	 * @generated
	 */
	int INSTANTIATION_EXP = 15;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_EXP__TAG = IMPERATIVE_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_EXP__OWNED_COMMENT = IMPERATIVE_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_EXP__NAME = IMPERATIVE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_EXP__TYPE = IMPERATIVE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Instantiated Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_EXP__INSTANTIATED_CLASS = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_EXP__EXTENT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_EXP__ARGUMENT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Instantiation Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_EXP_FEATURE_COUNT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link imperativeocl.impl.DictionaryTypeImpl <em>Dictionary Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imperativeocl.impl.DictionaryTypeImpl
	 * @see imperativeocl.impl.ImperativeoclPackageImpl#getDictionaryType()
	 * @generated
	 */
	int DICTIONARY_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE__TAG = EssentialoclPackage.COLLECTION_TYPE__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE__OWNED_COMMENT = EssentialoclPackage.COLLECTION_TYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE__NAME = EssentialoclPackage.COLLECTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE__PACKAGE = EssentialoclPackage.COLLECTION_TYPE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE__ELEMENT_TYPE = EssentialoclPackage.COLLECTION_TYPE__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Key Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE__KEY_TYPE = EssentialoclPackage.COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dictionary Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE_FEATURE_COUNT = EssentialoclPackage.COLLECTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link imperativeocl.impl.DictLiteralExpImpl <em>Dict Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imperativeocl.impl.DictLiteralExpImpl
	 * @see imperativeocl.impl.ImperativeoclPackageImpl#getDictLiteralExp()
	 * @generated
	 */
	int DICT_LITERAL_EXP = 17;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_EXP__TAG = EssentialoclPackage.LITERAL_EXP__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_EXP__OWNED_COMMENT = EssentialoclPackage.LITERAL_EXP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_EXP__NAME = EssentialoclPackage.LITERAL_EXP__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_EXP__TYPE = EssentialoclPackage.LITERAL_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_EXP__PART = EssentialoclPackage.LITERAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dict Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_EXP_FEATURE_COUNT = EssentialoclPackage.LITERAL_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link imperativeocl.impl.DictLiteralPartImpl <em>Dict Literal Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imperativeocl.impl.DictLiteralPartImpl
	 * @see imperativeocl.impl.ImperativeoclPackageImpl#getDictLiteralPart()
	 * @generated
	 */
	int DICT_LITERAL_PART = 18;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_PART__TAG = EmofPackage.ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_PART__OWNED_COMMENT = EmofPackage.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_PART__KEY = EmofPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_PART__VALUE = EmofPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dict Literal Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICT_LITERAL_PART_FEATURE_COUNT = EmofPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link imperativeocl.impl.TemplateParameterTypeImpl <em>Template Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imperativeocl.impl.TemplateParameterTypeImpl
	 * @see imperativeocl.impl.ImperativeoclPackageImpl#getTemplateParameterType()
	 * @generated
	 */
	int TEMPLATE_PARAMETER_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_TYPE__TAG = EmofPackage.TYPE__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_TYPE__OWNED_COMMENT = EmofPackage.TYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_TYPE__NAME = EmofPackage.TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_TYPE__PACKAGE = EmofPackage.TYPE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_TYPE__SPECIFICATION = EmofPackage.TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_PARAMETER_TYPE_FEATURE_COUNT = EmofPackage.TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link imperativeocl.impl.LogExpImpl <em>Log Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imperativeocl.impl.LogExpImpl
	 * @see imperativeocl.impl.ImperativeoclPackageImpl#getLogExp()
	 * @generated
	 */
	int LOG_EXP = 20;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP__TAG = EssentialoclPackage.OPERATION_CALL_EXP__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP__OWNED_COMMENT = EssentialoclPackage.OPERATION_CALL_EXP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP__NAME = EssentialoclPackage.OPERATION_CALL_EXP__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP__TYPE = EssentialoclPackage.OPERATION_CALL_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP__SOURCE = EssentialoclPackage.OPERATION_CALL_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP__ARGUMENT = EssentialoclPackage.OPERATION_CALL_EXP__ARGUMENT;

	/**
	 * The feature id for the '<em><b>Referred Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP__REFERRED_OPERATION = EssentialoclPackage.OPERATION_CALL_EXP__REFERRED_OPERATION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP__CONDITION = EssentialoclPackage.OPERATION_CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Log Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_EXP_FEATURE_COUNT = EssentialoclPackage.OPERATION_CALL_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link imperativeocl.impl.AssertExpImpl <em>Assert Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imperativeocl.impl.AssertExpImpl
	 * @see imperativeocl.impl.ImperativeoclPackageImpl#getAssertExp()
	 * @generated
	 */
	int ASSERT_EXP = 21;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EXP__TAG = IMPERATIVE_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EXP__OWNED_COMMENT = IMPERATIVE_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EXP__NAME = IMPERATIVE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EXP__TYPE = IMPERATIVE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EXP__SEVERITY = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Log</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EXP__LOG = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EXP__ASSERTION = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Assert Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_EXP_FEATURE_COUNT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link imperativeocl.impl.ImperativeIterateExpImpl <em>Imperative Iterate Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imperativeocl.impl.ImperativeIterateExpImpl
	 * @see imperativeocl.impl.ImperativeoclPackageImpl#getImperativeIterateExp()
	 * @generated
	 */
	int IMPERATIVE_ITERATE_EXP = 23;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP__TAG = IMPERATIVE_LOOP_EXP__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP__OWNED_COMMENT = IMPERATIVE_LOOP_EXP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP__NAME = IMPERATIVE_LOOP_EXP__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP__TYPE = IMPERATIVE_LOOP_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP__SOURCE = IMPERATIVE_LOOP_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP__BODY = IMPERATIVE_LOOP_EXP__BODY;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP__ITERATOR = IMPERATIVE_LOOP_EXP__ITERATOR;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP__CONDITION = IMPERATIVE_LOOP_EXP__CONDITION;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP__TARGET = IMPERATIVE_LOOP_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Imperative Iterate Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_ITERATE_EXP_FEATURE_COUNT = IMPERATIVE_LOOP_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link imperativeocl.impl.UnpackExpImpl <em>Unpack Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imperativeocl.impl.UnpackExpImpl
	 * @see imperativeocl.impl.ImperativeoclPackageImpl#getUnpackExp()
	 * @generated
	 */
	int UNPACK_EXP = 25;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPACK_EXP__TAG = IMPERATIVE_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPACK_EXP__OWNED_COMMENT = IMPERATIVE_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPACK_EXP__NAME = IMPERATIVE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPACK_EXP__TYPE = IMPERATIVE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Target Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPACK_EXP__TARGET_VARIABLE = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPACK_EXP__SOURCE = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unpack Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPACK_EXP_FEATURE_COUNT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link imperativeocl.impl.OrderedTupleTypeImpl <em>Ordered Tuple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imperativeocl.impl.OrderedTupleTypeImpl
	 * @see imperativeocl.impl.ImperativeoclPackageImpl#getOrderedTupleType()
	 * @generated
	 */
	int ORDERED_TUPLE_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_TYPE__TAG = EmofPackage.CLASS__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_TYPE__OWNED_COMMENT = EmofPackage.CLASS__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_TYPE__NAME = EmofPackage.CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_TYPE__PACKAGE = EmofPackage.CLASS__PACKAGE;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_TYPE__OWNED_ATTRIBUTE = EmofPackage.CLASS__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_TYPE__OWNED_OPERATION = EmofPackage.CLASS__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_TYPE__SUPER_CLASS = EmofPackage.CLASS__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_TYPE__IS_ABSTRACT = EmofPackage.CLASS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_TYPE__ELEMENT_TYPE = EmofPackage.CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ordered Tuple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_TYPE_FEATURE_COUNT = EmofPackage.CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link imperativeocl.impl.OrderedTupleLiteralExpImpl <em>Ordered Tuple Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imperativeocl.impl.OrderedTupleLiteralExpImpl
	 * @see imperativeocl.impl.ImperativeoclPackageImpl#getOrderedTupleLiteralExp()
	 * @generated
	 */
	int ORDERED_TUPLE_LITERAL_EXP = 27;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_LITERAL_EXP__TAG = EssentialoclPackage.LITERAL_EXP__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_LITERAL_EXP__OWNED_COMMENT = EssentialoclPackage.LITERAL_EXP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_LITERAL_EXP__NAME = EssentialoclPackage.LITERAL_EXP__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_LITERAL_EXP__TYPE = EssentialoclPackage.LITERAL_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_LITERAL_EXP__PART = EssentialoclPackage.LITERAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ordered Tuple Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_LITERAL_EXP_FEATURE_COUNT = EssentialoclPackage.LITERAL_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link imperativeocl.impl.OrderedTupleLiteralPartImpl <em>Ordered Tuple Literal Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imperativeocl.impl.OrderedTupleLiteralPartImpl
	 * @see imperativeocl.impl.ImperativeoclPackageImpl#getOrderedTupleLiteralPart()
	 * @generated
	 */
	int ORDERED_TUPLE_LITERAL_PART = 28;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_LITERAL_PART__TAG = EmofPackage.ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_LITERAL_PART__OWNED_COMMENT = EmofPackage.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_LITERAL_PART__VALUE = EmofPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ordered Tuple Literal Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_TUPLE_LITERAL_PART_FEATURE_COUNT = EmofPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link imperativeocl.impl.ListTypeImpl <em>List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imperativeocl.impl.ListTypeImpl
	 * @see imperativeocl.impl.ImperativeoclPackageImpl#getListType()
	 * @generated
	 */
	int LIST_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__TAG = EssentialoclPackage.COLLECTION_TYPE__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__OWNED_COMMENT = EssentialoclPackage.COLLECTION_TYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__NAME = EssentialoclPackage.COLLECTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__PACKAGE = EssentialoclPackage.COLLECTION_TYPE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE__ELEMENT_TYPE = EssentialoclPackage.COLLECTION_TYPE__ELEMENT_TYPE;

	/**
	 * The number of structural features of the '<em>List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_TYPE_FEATURE_COUNT = EssentialoclPackage.COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link imperativeocl.impl.CatchExpImpl <em>Catch Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imperativeocl.impl.CatchExpImpl
	 * @see imperativeocl.impl.ImperativeoclPackageImpl#getCatchExp()
	 * @generated
	 */
	int CATCH_EXP = 30;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EXP__TAG = IMPERATIVE_EXPRESSION__TAG;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EXP__OWNED_COMMENT = IMPERATIVE_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EXP__NAME = IMPERATIVE_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EXP__TYPE = IMPERATIVE_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EXP__BODY = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EXP__EXCEPTION = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Catch Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EXP_FEATURE_COUNT = IMPERATIVE_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link imperativeocl.SeverityKind <em>Severity Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imperativeocl.SeverityKind
	 * @see imperativeocl.impl.ImperativeoclPackageImpl#getSeverityKind()
	 * @generated
	 */
	int SEVERITY_KIND = 31;


	/**
	 * Returns the meta object for class '{@link imperativeocl.AssignExp <em>Assign Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign Exp</em>'.
	 * @see imperativeocl.AssignExp
	 * @generated
	 */
	EClass getAssignExp();

	/**
	 * Returns the meta object for the containment reference list '{@link imperativeocl.AssignExp#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see imperativeocl.AssignExp#getValue()
	 * @see #getAssignExp()
	 * @generated
	 */
	EReference getAssignExp_Value();

	/**
	 * Returns the meta object for the containment reference '{@link imperativeocl.AssignExp#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see imperativeocl.AssignExp#getLeft()
	 * @see #getAssignExp()
	 * @generated
	 */
	EReference getAssignExp_Left();

	/**
	 * Returns the meta object for the containment reference '{@link imperativeocl.AssignExp#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see imperativeocl.AssignExp#getDefaultValue()
	 * @see #getAssignExp()
	 * @generated
	 */
	EReference getAssignExp_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link imperativeocl.AssignExp#getIsReset <em>Is Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Reset</em>'.
	 * @see imperativeocl.AssignExp#getIsReset()
	 * @see #getAssignExp()
	 * @generated
	 */
	EAttribute getAssignExp_IsReset();

	/**
	 * Returns the meta object for class '{@link imperativeocl.BlockExp <em>Block Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Exp</em>'.
	 * @see imperativeocl.BlockExp
	 * @generated
	 */
	EClass getBlockExp();

	/**
	 * Returns the meta object for the containment reference list '{@link imperativeocl.BlockExp#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see imperativeocl.BlockExp#getBody()
	 * @see #getBlockExp()
	 * @generated
	 */
	EReference getBlockExp_Body();

	/**
	 * Returns the meta object for class '{@link imperativeocl.SwitchExp <em>Switch Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Exp</em>'.
	 * @see imperativeocl.SwitchExp
	 * @generated
	 */
	EClass getSwitchExp();

	/**
	 * Returns the meta object for the containment reference list '{@link imperativeocl.SwitchExp#getAlternativePart <em>Alternative Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternative Part</em>'.
	 * @see imperativeocl.SwitchExp#getAlternativePart()
	 * @see #getSwitchExp()
	 * @generated
	 */
	EReference getSwitchExp_AlternativePart();

	/**
	 * Returns the meta object for the containment reference '{@link imperativeocl.SwitchExp#getElsePart <em>Else Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Part</em>'.
	 * @see imperativeocl.SwitchExp#getElsePart()
	 * @see #getSwitchExp()
	 * @generated
	 */
	EReference getSwitchExp_ElsePart();

	/**
	 * Returns the meta object for class '{@link imperativeocl.VariableInitExp <em>Variable Init Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Init Exp</em>'.
	 * @see imperativeocl.VariableInitExp
	 * @generated
	 */
	EClass getVariableInitExp();

	/**
	 * Returns the meta object for the containment reference '{@link imperativeocl.VariableInitExp#getReferredVariable <em>Referred Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Referred Variable</em>'.
	 * @see imperativeocl.VariableInitExp#getReferredVariable()
	 * @see #getVariableInitExp()
	 * @generated
	 */
	EReference getVariableInitExp_ReferredVariable();

	/**
	 * Returns the meta object for the attribute '{@link imperativeocl.VariableInitExp#getWithResult <em>With Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>With Result</em>'.
	 * @see imperativeocl.VariableInitExp#getWithResult()
	 * @see #getVariableInitExp()
	 * @generated
	 */
	EAttribute getVariableInitExp_WithResult();

	/**
	 * Returns the meta object for class '{@link imperativeocl.WhileExp <em>While Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Exp</em>'.
	 * @see imperativeocl.WhileExp
	 * @generated
	 */
	EClass getWhileExp();

	/**
	 * Returns the meta object for the containment reference '{@link imperativeocl.WhileExp#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see imperativeocl.WhileExp#getCondition()
	 * @see #getWhileExp()
	 * @generated
	 */
	EReference getWhileExp_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link imperativeocl.WhileExp#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see imperativeocl.WhileExp#getBody()
	 * @see #getWhileExp()
	 * @generated
	 */
	EReference getWhileExp_Body();

	/**
	 * Returns the meta object for class '{@link imperativeocl.ComputeExp <em>Compute Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compute Exp</em>'.
	 * @see imperativeocl.ComputeExp
	 * @generated
	 */
	EClass getComputeExp();

	/**
	 * Returns the meta object for the containment reference '{@link imperativeocl.ComputeExp#getReturnedElement <em>Returned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Returned Element</em>'.
	 * @see imperativeocl.ComputeExp#getReturnedElement()
	 * @see #getComputeExp()
	 * @generated
	 */
	EReference getComputeExp_ReturnedElement();

	/**
	 * Returns the meta object for the containment reference '{@link imperativeocl.ComputeExp#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see imperativeocl.ComputeExp#getBody()
	 * @see #getComputeExp()
	 * @generated
	 */
	EReference getComputeExp_Body();

	/**
	 * Returns the meta object for class '{@link imperativeocl.AltExp <em>Alt Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alt Exp</em>'.
	 * @see imperativeocl.AltExp
	 * @generated
	 */
	EClass getAltExp();

	/**
	 * Returns the meta object for the containment reference '{@link imperativeocl.AltExp#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see imperativeocl.AltExp#getCondition()
	 * @see #getAltExp()
	 * @generated
	 */
	EReference getAltExp_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link imperativeocl.AltExp#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see imperativeocl.AltExp#getBody()
	 * @see #getAltExp()
	 * @generated
	 */
	EReference getAltExp_Body();

	/**
	 * Returns the meta object for class '{@link imperativeocl.UnlinkExp <em>Unlink Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unlink Exp</em>'.
	 * @see imperativeocl.UnlinkExp
	 * @generated
	 */
	EClass getUnlinkExp();

	/**
	 * Returns the meta object for the containment reference '{@link imperativeocl.UnlinkExp#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see imperativeocl.UnlinkExp#getTarget()
	 * @see #getUnlinkExp()
	 * @generated
	 */
	EReference getUnlinkExp_Target();

	/**
	 * Returns the meta object for the containment reference '{@link imperativeocl.UnlinkExp#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item</em>'.
	 * @see imperativeocl.UnlinkExp#getItem()
	 * @see #getUnlinkExp()
	 * @generated
	 */
	EReference getUnlinkExp_Item();

	/**
	 * Returns the meta object for class '{@link imperativeocl.ReturnExp <em>Return Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Exp</em>'.
	 * @see imperativeocl.ReturnExp
	 * @generated
	 */
	EClass getReturnExp();

	/**
	 * Returns the meta object for the containment reference '{@link imperativeocl.ReturnExp#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see imperativeocl.ReturnExp#getValue()
	 * @see #getReturnExp()
	 * @generated
	 */
	EReference getReturnExp_Value();

	/**
	 * Returns the meta object for class '{@link imperativeocl.BreakExp <em>Break Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Break Exp</em>'.
	 * @see imperativeocl.BreakExp
	 * @generated
	 */
	EClass getBreakExp();

	/**
	 * Returns the meta object for class '{@link imperativeocl.TryExp <em>Try Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Try Exp</em>'.
	 * @see imperativeocl.TryExp
	 * @generated
	 */
	EClass getTryExp();

	/**
	 * Returns the meta object for the containment reference list '{@link imperativeocl.TryExp#getTryBody <em>Try Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Try Body</em>'.
	 * @see imperativeocl.TryExp#getTryBody()
	 * @see #getTryExp()
	 * @generated
	 */
	EReference getTryExp_TryBody();

	/**
	 * Returns the meta object for the containment reference list '{@link imperativeocl.TryExp#getCatchClause <em>Catch Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catch Clause</em>'.
	 * @see imperativeocl.TryExp#getCatchClause()
	 * @see #getTryExp()
	 * @generated
	 */
	EReference getTryExp_CatchClause();

	/**
	 * Returns the meta object for class '{@link imperativeocl.RaiseExp <em>Raise Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raise Exp</em>'.
	 * @see imperativeocl.RaiseExp
	 * @generated
	 */
	EClass getRaiseExp();

	/**
	 * Returns the meta object for the reference '{@link imperativeocl.RaiseExp#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exception</em>'.
	 * @see imperativeocl.RaiseExp#getException()
	 * @see #getRaiseExp()
	 * @generated
	 */
	EReference getRaiseExp_Exception();

	/**
	 * Returns the meta object for the containment reference '{@link imperativeocl.RaiseExp#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument</em>'.
	 * @see imperativeocl.RaiseExp#getArgument()
	 * @see #getRaiseExp()
	 * @generated
	 */
	EReference getRaiseExp_Argument();

	/**
	 * Returns the meta object for class '{@link imperativeocl.ContinueExp <em>Continue Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continue Exp</em>'.
	 * @see imperativeocl.ContinueExp
	 * @generated
	 */
	EClass getContinueExp();

	/**
	 * Returns the meta object for class '{@link imperativeocl.ForExp <em>For Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Exp</em>'.
	 * @see imperativeocl.ForExp
	 * @generated
	 */
	EClass getForExp();

	/**
	 * Returns the meta object for class '{@link imperativeocl.Typedef <em>Typedef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typedef</em>'.
	 * @see imperativeocl.Typedef
	 * @generated
	 */
	EClass getTypedef();

	/**
	 * Returns the meta object for the reference '{@link imperativeocl.Typedef#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base</em>'.
	 * @see imperativeocl.Typedef#getBase()
	 * @see #getTypedef()
	 * @generated
	 */
	EReference getTypedef_Base();

	/**
	 * Returns the meta object for the containment reference '{@link imperativeocl.Typedef#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see imperativeocl.Typedef#getCondition()
	 * @see #getTypedef()
	 * @generated
	 */
	EReference getTypedef_Condition();

	/**
	 * Returns the meta object for class '{@link imperativeocl.InstantiationExp <em>Instantiation Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instantiation Exp</em>'.
	 * @see imperativeocl.InstantiationExp
	 * @generated
	 */
	EClass getInstantiationExp();

	/**
	 * Returns the meta object for the reference '{@link imperativeocl.InstantiationExp#getInstantiatedClass <em>Instantiated Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instantiated Class</em>'.
	 * @see imperativeocl.InstantiationExp#getInstantiatedClass()
	 * @see #getInstantiationExp()
	 * @generated
	 */
	EReference getInstantiationExp_InstantiatedClass();

	/**
	 * Returns the meta object for the reference '{@link imperativeocl.InstantiationExp#getExtent <em>Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extent</em>'.
	 * @see imperativeocl.InstantiationExp#getExtent()
	 * @see #getInstantiationExp()
	 * @generated
	 */
	EReference getInstantiationExp_Extent();

	/**
	 * Returns the meta object for the containment reference list '{@link imperativeocl.InstantiationExp#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument</em>'.
	 * @see imperativeocl.InstantiationExp#getArgument()
	 * @see #getInstantiationExp()
	 * @generated
	 */
	EReference getInstantiationExp_Argument();

	/**
	 * Returns the meta object for class '{@link imperativeocl.DictionaryType <em>Dictionary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dictionary Type</em>'.
	 * @see imperativeocl.DictionaryType
	 * @generated
	 */
	EClass getDictionaryType();

	/**
	 * Returns the meta object for the reference '{@link imperativeocl.DictionaryType#getKeyType <em>Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key Type</em>'.
	 * @see imperativeocl.DictionaryType#getKeyType()
	 * @see #getDictionaryType()
	 * @generated
	 */
	EReference getDictionaryType_KeyType();

	/**
	 * Returns the meta object for class '{@link imperativeocl.DictLiteralExp <em>Dict Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dict Literal Exp</em>'.
	 * @see imperativeocl.DictLiteralExp
	 * @generated
	 */
	EClass getDictLiteralExp();

	/**
	 * Returns the meta object for the containment reference list '{@link imperativeocl.DictLiteralExp#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part</em>'.
	 * @see imperativeocl.DictLiteralExp#getPart()
	 * @see #getDictLiteralExp()
	 * @generated
	 */
	EReference getDictLiteralExp_Part();

	/**
	 * Returns the meta object for class '{@link imperativeocl.DictLiteralPart <em>Dict Literal Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dict Literal Part</em>'.
	 * @see imperativeocl.DictLiteralPart
	 * @generated
	 */
	EClass getDictLiteralPart();

	/**
	 * Returns the meta object for the containment reference '{@link imperativeocl.DictLiteralPart#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see imperativeocl.DictLiteralPart#getKey()
	 * @see #getDictLiteralPart()
	 * @generated
	 */
	EReference getDictLiteralPart_Key();

	/**
	 * Returns the meta object for the containment reference '{@link imperativeocl.DictLiteralPart#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see imperativeocl.DictLiteralPart#getValue()
	 * @see #getDictLiteralPart()
	 * @generated
	 */
	EReference getDictLiteralPart_Value();

	/**
	 * Returns the meta object for class '{@link imperativeocl.TemplateParameterType <em>Template Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Parameter Type</em>'.
	 * @see imperativeocl.TemplateParameterType
	 * @generated
	 */
	EClass getTemplateParameterType();

	/**
	 * Returns the meta object for the attribute '{@link imperativeocl.TemplateParameterType#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specification</em>'.
	 * @see imperativeocl.TemplateParameterType#getSpecification()
	 * @see #getTemplateParameterType()
	 * @generated
	 */
	EAttribute getTemplateParameterType_Specification();

	/**
	 * Returns the meta object for class '{@link imperativeocl.LogExp <em>Log Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Exp</em>'.
	 * @see imperativeocl.LogExp
	 * @generated
	 */
	EClass getLogExp();

	/**
	 * Returns the meta object for the containment reference '{@link imperativeocl.LogExp#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see imperativeocl.LogExp#getCondition()
	 * @see #getLogExp()
	 * @generated
	 */
	EReference getLogExp_Condition();

	/**
	 * Returns the meta object for class '{@link imperativeocl.AssertExp <em>Assert Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assert Exp</em>'.
	 * @see imperativeocl.AssertExp
	 * @generated
	 */
	EClass getAssertExp();

	/**
	 * Returns the meta object for the attribute '{@link imperativeocl.AssertExp#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see imperativeocl.AssertExp#getSeverity()
	 * @see #getAssertExp()
	 * @generated
	 */
	EAttribute getAssertExp_Severity();

	/**
	 * Returns the meta object for the containment reference '{@link imperativeocl.AssertExp#getLog <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Log</em>'.
	 * @see imperativeocl.AssertExp#getLog()
	 * @see #getAssertExp()
	 * @generated
	 */
	EReference getAssertExp_Log();

	/**
	 * Returns the meta object for the containment reference '{@link imperativeocl.AssertExp#getAssertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assertion</em>'.
	 * @see imperativeocl.AssertExp#getAssertion()
	 * @see #getAssertExp()
	 * @generated
	 */
	EReference getAssertExp_Assertion();

	/**
	 * Returns the meta object for class '{@link imperativeocl.ImperativeLoopExp <em>Imperative Loop Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imperative Loop Exp</em>'.
	 * @see imperativeocl.ImperativeLoopExp
	 * @generated
	 */
	EClass getImperativeLoopExp();

	/**
	 * Returns the meta object for the containment reference '{@link imperativeocl.ImperativeLoopExp#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see imperativeocl.ImperativeLoopExp#getCondition()
	 * @see #getImperativeLoopExp()
	 * @generated
	 */
	EReference getImperativeLoopExp_Condition();

	/**
	 * Returns the meta object for class '{@link imperativeocl.ImperativeIterateExp <em>Imperative Iterate Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imperative Iterate Exp</em>'.
	 * @see imperativeocl.ImperativeIterateExp
	 * @generated
	 */
	EClass getImperativeIterateExp();

	/**
	 * Returns the meta object for the containment reference '{@link imperativeocl.ImperativeIterateExp#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see imperativeocl.ImperativeIterateExp#getTarget()
	 * @see #getImperativeIterateExp()
	 * @generated
	 */
	EReference getImperativeIterateExp_Target();

	/**
	 * Returns the meta object for class '{@link imperativeocl.ImperativeExpression <em>Imperative Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imperative Expression</em>'.
	 * @see imperativeocl.ImperativeExpression
	 * @generated
	 */
	EClass getImperativeExpression();

	/**
	 * Returns the meta object for class '{@link imperativeocl.UnpackExp <em>Unpack Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unpack Exp</em>'.
	 * @see imperativeocl.UnpackExp
	 * @generated
	 */
	EClass getUnpackExp();

	/**
	 * Returns the meta object for the containment reference list '{@link imperativeocl.UnpackExp#getTargetVariable <em>Target Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Variable</em>'.
	 * @see imperativeocl.UnpackExp#getTargetVariable()
	 * @see #getUnpackExp()
	 * @generated
	 */
	EReference getUnpackExp_TargetVariable();

	/**
	 * Returns the meta object for the containment reference '{@link imperativeocl.UnpackExp#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see imperativeocl.UnpackExp#getSource()
	 * @see #getUnpackExp()
	 * @generated
	 */
	EReference getUnpackExp_Source();

	/**
	 * Returns the meta object for class '{@link imperativeocl.OrderedTupleType <em>Ordered Tuple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Tuple Type</em>'.
	 * @see imperativeocl.OrderedTupleType
	 * @generated
	 */
	EClass getOrderedTupleType();

	/**
	 * Returns the meta object for the reference list '{@link imperativeocl.OrderedTupleType#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Element Type</em>'.
	 * @see imperativeocl.OrderedTupleType#getElementType()
	 * @see #getOrderedTupleType()
	 * @generated
	 */
	EReference getOrderedTupleType_ElementType();

	/**
	 * Returns the meta object for class '{@link imperativeocl.OrderedTupleLiteralExp <em>Ordered Tuple Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Tuple Literal Exp</em>'.
	 * @see imperativeocl.OrderedTupleLiteralExp
	 * @generated
	 */
	EClass getOrderedTupleLiteralExp();

	/**
	 * Returns the meta object for the containment reference list '{@link imperativeocl.OrderedTupleLiteralExp#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part</em>'.
	 * @see imperativeocl.OrderedTupleLiteralExp#getPart()
	 * @see #getOrderedTupleLiteralExp()
	 * @generated
	 */
	EReference getOrderedTupleLiteralExp_Part();

	/**
	 * Returns the meta object for class '{@link imperativeocl.OrderedTupleLiteralPart <em>Ordered Tuple Literal Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Tuple Literal Part</em>'.
	 * @see imperativeocl.OrderedTupleLiteralPart
	 * @generated
	 */
	EClass getOrderedTupleLiteralPart();

	/**
	 * Returns the meta object for the containment reference '{@link imperativeocl.OrderedTupleLiteralPart#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see imperativeocl.OrderedTupleLiteralPart#getValue()
	 * @see #getOrderedTupleLiteralPart()
	 * @generated
	 */
	EReference getOrderedTupleLiteralPart_Value();

	/**
	 * Returns the meta object for class '{@link imperativeocl.ListType <em>List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Type</em>'.
	 * @see imperativeocl.ListType
	 * @generated
	 */
	EClass getListType();

	/**
	 * Returns the meta object for class '{@link imperativeocl.CatchExp <em>Catch Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catch Exp</em>'.
	 * @see imperativeocl.CatchExp
	 * @generated
	 */
	EClass getCatchExp();

	/**
	 * Returns the meta object for the containment reference list '{@link imperativeocl.CatchExp#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see imperativeocl.CatchExp#getBody()
	 * @see #getCatchExp()
	 * @generated
	 */
	EReference getCatchExp_Body();

	/**
	 * Returns the meta object for the reference list '{@link imperativeocl.CatchExp#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exception</em>'.
	 * @see imperativeocl.CatchExp#getException()
	 * @see #getCatchExp()
	 * @generated
	 */
	EReference getCatchExp_Exception();

	/**
	 * Returns the meta object for enum '{@link imperativeocl.SeverityKind <em>Severity Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Severity Kind</em>'.
	 * @see imperativeocl.SeverityKind
	 * @generated
	 */
	EEnum getSeverityKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImperativeoclFactory getImperativeoclFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link imperativeocl.impl.AssignExpImpl <em>Assign Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imperativeocl.impl.AssignExpImpl
		 * @see imperativeocl.impl.ImperativeoclPackageImpl#getAssignExp()
		 * @generated
		 */
		EClass ASSIGN_EXP = eINSTANCE.getAssignExp();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN_EXP__VALUE = eINSTANCE.getAssignExp_Value();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN_EXP__LEFT = eINSTANCE.getAssignExp_Left();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN_EXP__DEFAULT_VALUE = eINSTANCE.getAssignExp_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Is Reset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGN_EXP__IS_RESET = eINSTANCE.getAssignExp_IsReset();

		/**
		 * The meta object literal for the '{@link imperativeocl.impl.BlockExpImpl <em>Block Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imperativeocl.impl.BlockExpImpl
		 * @see imperativeocl.impl.ImperativeoclPackageImpl#getBlockExp()
		 * @generated
		 */
		EClass BLOCK_EXP = eINSTANCE.getBlockExp();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_EXP__BODY = eINSTANCE.getBlockExp_Body();

		/**
		 * The meta object literal for the '{@link imperativeocl.impl.SwitchExpImpl <em>Switch Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imperativeocl.impl.SwitchExpImpl
		 * @see imperativeocl.impl.ImperativeoclPackageImpl#getSwitchExp()
		 * @generated
		 */
		EClass SWITCH_EXP = eINSTANCE.getSwitchExp();

		/**
		 * The meta object literal for the '<em><b>Alternative Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_EXP__ALTERNATIVE_PART = eINSTANCE.getSwitchExp_AlternativePart();

		/**
		 * The meta object literal for the '<em><b>Else Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_EXP__ELSE_PART = eINSTANCE.getSwitchExp_ElsePart();

		/**
		 * The meta object literal for the '{@link imperativeocl.impl.VariableInitExpImpl <em>Variable Init Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imperativeocl.impl.VariableInitExpImpl
		 * @see imperativeocl.impl.ImperativeoclPackageImpl#getVariableInitExp()
		 * @generated
		 */
		EClass VARIABLE_INIT_EXP = eINSTANCE.getVariableInitExp();

		/**
		 * The meta object literal for the '<em><b>Referred Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_INIT_EXP__REFERRED_VARIABLE = eINSTANCE.getVariableInitExp_ReferredVariable();

		/**
		 * The meta object literal for the '<em><b>With Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_INIT_EXP__WITH_RESULT = eINSTANCE.getVariableInitExp_WithResult();

		/**
		 * The meta object literal for the '{@link imperativeocl.impl.WhileExpImpl <em>While Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imperativeocl.impl.WhileExpImpl
		 * @see imperativeocl.impl.ImperativeoclPackageImpl#getWhileExp()
		 * @generated
		 */
		EClass WHILE_EXP = eINSTANCE.getWhileExp();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_EXP__CONDITION = eINSTANCE.getWhileExp_Condition();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_EXP__BODY = eINSTANCE.getWhileExp_Body();

		/**
		 * The meta object literal for the '{@link imperativeocl.impl.ComputeExpImpl <em>Compute Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imperativeocl.impl.ComputeExpImpl
		 * @see imperativeocl.impl.ImperativeoclPackageImpl#getComputeExp()
		 * @generated
		 */
		EClass COMPUTE_EXP = eINSTANCE.getComputeExp();

		/**
		 * The meta object literal for the '<em><b>Returned Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTE_EXP__RETURNED_ELEMENT = eINSTANCE.getComputeExp_ReturnedElement();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTE_EXP__BODY = eINSTANCE.getComputeExp_Body();

		/**
		 * The meta object literal for the '{@link imperativeocl.impl.AltExpImpl <em>Alt Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imperativeocl.impl.AltExpImpl
		 * @see imperativeocl.impl.ImperativeoclPackageImpl#getAltExp()
		 * @generated
		 */
		EClass ALT_EXP = eINSTANCE.getAltExp();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALT_EXP__CONDITION = eINSTANCE.getAltExp_Condition();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALT_EXP__BODY = eINSTANCE.getAltExp_Body();

		/**
		 * The meta object literal for the '{@link imperativeocl.impl.UnlinkExpImpl <em>Unlink Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imperativeocl.impl.UnlinkExpImpl
		 * @see imperativeocl.impl.ImperativeoclPackageImpl#getUnlinkExp()
		 * @generated
		 */
		EClass UNLINK_EXP = eINSTANCE.getUnlinkExp();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNLINK_EXP__TARGET = eINSTANCE.getUnlinkExp_Target();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNLINK_EXP__ITEM = eINSTANCE.getUnlinkExp_Item();

		/**
		 * The meta object literal for the '{@link imperativeocl.impl.ReturnExpImpl <em>Return Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imperativeocl.impl.ReturnExpImpl
		 * @see imperativeocl.impl.ImperativeoclPackageImpl#getReturnExp()
		 * @generated
		 */
		EClass RETURN_EXP = eINSTANCE.getReturnExp();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_EXP__VALUE = eINSTANCE.getReturnExp_Value();

		/**
		 * The meta object literal for the '{@link imperativeocl.impl.BreakExpImpl <em>Break Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imperativeocl.impl.BreakExpImpl
		 * @see imperativeocl.impl.ImperativeoclPackageImpl#getBreakExp()
		 * @generated
		 */
		EClass BREAK_EXP = eINSTANCE.getBreakExp();

		/**
		 * The meta object literal for the '{@link imperativeocl.impl.TryExpImpl <em>Try Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imperativeocl.impl.TryExpImpl
		 * @see imperativeocl.impl.ImperativeoclPackageImpl#getTryExp()
		 * @generated
		 */
		EClass TRY_EXP = eINSTANCE.getTryExp();

		/**
		 * The meta object literal for the '<em><b>Try Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRY_EXP__TRY_BODY = eINSTANCE.getTryExp_TryBody();

		/**
		 * The meta object literal for the '<em><b>Catch Clause</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRY_EXP__CATCH_CLAUSE = eINSTANCE.getTryExp_CatchClause();

		/**
		 * The meta object literal for the '{@link imperativeocl.impl.RaiseExpImpl <em>Raise Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imperativeocl.impl.RaiseExpImpl
		 * @see imperativeocl.impl.ImperativeoclPackageImpl#getRaiseExp()
		 * @generated
		 */
		EClass RAISE_EXP = eINSTANCE.getRaiseExp();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAISE_EXP__EXCEPTION = eINSTANCE.getRaiseExp_Exception();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAISE_EXP__ARGUMENT = eINSTANCE.getRaiseExp_Argument();

		/**
		 * The meta object literal for the '{@link imperativeocl.impl.ContinueExpImpl <em>Continue Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imperativeocl.impl.ContinueExpImpl
		 * @see imperativeocl.impl.ImperativeoclPackageImpl#getContinueExp()
		 * @generated
		 */
		EClass CONTINUE_EXP = eINSTANCE.getContinueExp();

		/**
		 * The meta object literal for the '{@link imperativeocl.impl.ForExpImpl <em>For Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imperativeocl.impl.ForExpImpl
		 * @see imperativeocl.impl.ImperativeoclPackageImpl#getForExp()
		 * @generated
		 */
		EClass FOR_EXP = eINSTANCE.getForExp();

		/**
		 * The meta object literal for the '{@link imperativeocl.impl.TypedefImpl <em>Typedef</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imperativeocl.impl.TypedefImpl
		 * @see imperativeocl.impl.ImperativeoclPackageImpl#getTypedef()
		 * @generated
		 */
		EClass TYPEDEF = eINSTANCE.getTypedef();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPEDEF__BASE = eINSTANCE.getTypedef_Base();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPEDEF__CONDITION = eINSTANCE.getTypedef_Condition();

		/**
		 * The meta object literal for the '{@link imperativeocl.impl.InstantiationExpImpl <em>Instantiation Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imperativeocl.impl.InstantiationExpImpl
		 * @see imperativeocl.impl.ImperativeoclPackageImpl#getInstantiationExp()
		 * @generated
		 */
		EClass INSTANTIATION_EXP = eINSTANCE.getInstantiationExp();

		/**
		 * The meta object literal for the '<em><b>Instantiated Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANTIATION_EXP__INSTANTIATED_CLASS = eINSTANCE.getInstantiationExp_InstantiatedClass();

		/**
		 * The meta object literal for the '<em><b>Extent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANTIATION_EXP__EXTENT = eINSTANCE.getInstantiationExp_Extent();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANTIATION_EXP__ARGUMENT = eINSTANCE.getInstantiationExp_Argument();

		/**
		 * The meta object literal for the '{@link imperativeocl.impl.DictionaryTypeImpl <em>Dictionary Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imperativeocl.impl.DictionaryTypeImpl
		 * @see imperativeocl.impl.ImperativeoclPackageImpl#getDictionaryType()
		 * @generated
		 */
		EClass DICTIONARY_TYPE = eINSTANCE.getDictionaryType();

		/**
		 * The meta object literal for the '<em><b>Key Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICTIONARY_TYPE__KEY_TYPE = eINSTANCE.getDictionaryType_KeyType();

		/**
		 * The meta object literal for the '{@link imperativeocl.impl.DictLiteralExpImpl <em>Dict Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imperativeocl.impl.DictLiteralExpImpl
		 * @see imperativeocl.impl.ImperativeoclPackageImpl#getDictLiteralExp()
		 * @generated
		 */
		EClass DICT_LITERAL_EXP = eINSTANCE.getDictLiteralExp();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICT_LITERAL_EXP__PART = eINSTANCE.getDictLiteralExp_Part();

		/**
		 * The meta object literal for the '{@link imperativeocl.impl.DictLiteralPartImpl <em>Dict Literal Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imperativeocl.impl.DictLiteralPartImpl
		 * @see imperativeocl.impl.ImperativeoclPackageImpl#getDictLiteralPart()
		 * @generated
		 */
		EClass DICT_LITERAL_PART = eINSTANCE.getDictLiteralPart();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICT_LITERAL_PART__KEY = eINSTANCE.getDictLiteralPart_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICT_LITERAL_PART__VALUE = eINSTANCE.getDictLiteralPart_Value();

		/**
		 * The meta object literal for the '{@link imperativeocl.impl.TemplateParameterTypeImpl <em>Template Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imperativeocl.impl.TemplateParameterTypeImpl
		 * @see imperativeocl.impl.ImperativeoclPackageImpl#getTemplateParameterType()
		 * @generated
		 */
		EClass TEMPLATE_PARAMETER_TYPE = eINSTANCE.getTemplateParameterType();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_PARAMETER_TYPE__SPECIFICATION = eINSTANCE.getTemplateParameterType_Specification();

		/**
		 * The meta object literal for the '{@link imperativeocl.impl.LogExpImpl <em>Log Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imperativeocl.impl.LogExpImpl
		 * @see imperativeocl.impl.ImperativeoclPackageImpl#getLogExp()
		 * @generated
		 */
		EClass LOG_EXP = eINSTANCE.getLogExp();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_EXP__CONDITION = eINSTANCE.getLogExp_Condition();

		/**
		 * The meta object literal for the '{@link imperativeocl.impl.AssertExpImpl <em>Assert Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imperativeocl.impl.AssertExpImpl
		 * @see imperativeocl.impl.ImperativeoclPackageImpl#getAssertExp()
		 * @generated
		 */
		EClass ASSERT_EXP = eINSTANCE.getAssertExp();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERT_EXP__SEVERITY = eINSTANCE.getAssertExp_Severity();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERT_EXP__LOG = eINSTANCE.getAssertExp_Log();

		/**
		 * The meta object literal for the '<em><b>Assertion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERT_EXP__ASSERTION = eINSTANCE.getAssertExp_Assertion();

		/**
		 * The meta object literal for the '{@link imperativeocl.impl.ImperativeLoopExpImpl <em>Imperative Loop Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imperativeocl.impl.ImperativeLoopExpImpl
		 * @see imperativeocl.impl.ImperativeoclPackageImpl#getImperativeLoopExp()
		 * @generated
		 */
		EClass IMPERATIVE_LOOP_EXP = eINSTANCE.getImperativeLoopExp();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPERATIVE_LOOP_EXP__CONDITION = eINSTANCE.getImperativeLoopExp_Condition();

		/**
		 * The meta object literal for the '{@link imperativeocl.impl.ImperativeIterateExpImpl <em>Imperative Iterate Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imperativeocl.impl.ImperativeIterateExpImpl
		 * @see imperativeocl.impl.ImperativeoclPackageImpl#getImperativeIterateExp()
		 * @generated
		 */
		EClass IMPERATIVE_ITERATE_EXP = eINSTANCE.getImperativeIterateExp();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPERATIVE_ITERATE_EXP__TARGET = eINSTANCE.getImperativeIterateExp_Target();

		/**
		 * The meta object literal for the '{@link imperativeocl.impl.ImperativeExpressionImpl <em>Imperative Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imperativeocl.impl.ImperativeExpressionImpl
		 * @see imperativeocl.impl.ImperativeoclPackageImpl#getImperativeExpression()
		 * @generated
		 */
		EClass IMPERATIVE_EXPRESSION = eINSTANCE.getImperativeExpression();

		/**
		 * The meta object literal for the '{@link imperativeocl.impl.UnpackExpImpl <em>Unpack Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imperativeocl.impl.UnpackExpImpl
		 * @see imperativeocl.impl.ImperativeoclPackageImpl#getUnpackExp()
		 * @generated
		 */
		EClass UNPACK_EXP = eINSTANCE.getUnpackExp();

		/**
		 * The meta object literal for the '<em><b>Target Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNPACK_EXP__TARGET_VARIABLE = eINSTANCE.getUnpackExp_TargetVariable();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNPACK_EXP__SOURCE = eINSTANCE.getUnpackExp_Source();

		/**
		 * The meta object literal for the '{@link imperativeocl.impl.OrderedTupleTypeImpl <em>Ordered Tuple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imperativeocl.impl.OrderedTupleTypeImpl
		 * @see imperativeocl.impl.ImperativeoclPackageImpl#getOrderedTupleType()
		 * @generated
		 */
		EClass ORDERED_TUPLE_TYPE = eINSTANCE.getOrderedTupleType();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDERED_TUPLE_TYPE__ELEMENT_TYPE = eINSTANCE.getOrderedTupleType_ElementType();

		/**
		 * The meta object literal for the '{@link imperativeocl.impl.OrderedTupleLiteralExpImpl <em>Ordered Tuple Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imperativeocl.impl.OrderedTupleLiteralExpImpl
		 * @see imperativeocl.impl.ImperativeoclPackageImpl#getOrderedTupleLiteralExp()
		 * @generated
		 */
		EClass ORDERED_TUPLE_LITERAL_EXP = eINSTANCE.getOrderedTupleLiteralExp();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDERED_TUPLE_LITERAL_EXP__PART = eINSTANCE.getOrderedTupleLiteralExp_Part();

		/**
		 * The meta object literal for the '{@link imperativeocl.impl.OrderedTupleLiteralPartImpl <em>Ordered Tuple Literal Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imperativeocl.impl.OrderedTupleLiteralPartImpl
		 * @see imperativeocl.impl.ImperativeoclPackageImpl#getOrderedTupleLiteralPart()
		 * @generated
		 */
		EClass ORDERED_TUPLE_LITERAL_PART = eINSTANCE.getOrderedTupleLiteralPart();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDERED_TUPLE_LITERAL_PART__VALUE = eINSTANCE.getOrderedTupleLiteralPart_Value();

		/**
		 * The meta object literal for the '{@link imperativeocl.impl.ListTypeImpl <em>List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imperativeocl.impl.ListTypeImpl
		 * @see imperativeocl.impl.ImperativeoclPackageImpl#getListType()
		 * @generated
		 */
		EClass LIST_TYPE = eINSTANCE.getListType();

		/**
		 * The meta object literal for the '{@link imperativeocl.impl.CatchExpImpl <em>Catch Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imperativeocl.impl.CatchExpImpl
		 * @see imperativeocl.impl.ImperativeoclPackageImpl#getCatchExp()
		 * @generated
		 */
		EClass CATCH_EXP = eINSTANCE.getCatchExp();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATCH_EXP__BODY = eINSTANCE.getCatchExp_Body();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATCH_EXP__EXCEPTION = eINSTANCE.getCatchExp_Exception();

		/**
		 * The meta object literal for the '{@link imperativeocl.SeverityKind <em>Severity Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imperativeocl.SeverityKind
		 * @see imperativeocl.impl.ImperativeoclPackageImpl#getSeverityKind()
		 * @generated
		 */
		EEnum SEVERITY_KIND = eINSTANCE.getSeverityKind();

	}

} //ImperativeoclPackage
