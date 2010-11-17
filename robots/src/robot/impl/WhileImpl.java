/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot.impl;

import org.eclipse.emf.ecore.EClass;

import robot.Condition;
import robot.Operation;
import robot.RobotPackage;
import robot.While;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link robot.impl.WhileImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link robot.impl.WhileImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhileImpl extends OperationImpl implements While {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotPackage.Literals.WHILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation() {
		return (Operation)eGet(RobotPackage.Literals.WHILE__OPERATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(Operation newOperation) {
		eSet(RobotPackage.Literals.WHILE__OPERATION, newOperation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		return (Condition)eGet(RobotPackage.Literals.WHILE__CONDITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		eSet(RobotPackage.Literals.WHILE__CONDITION, newCondition);
	}

	 /**
	* <!-- begin-user-doc -->
	* Code correspondant au While
	* <!-- end-user-doc -->
	* @generated NOT
	*/
	public String toUrbiString(String indent) {
		String returnvalue = "";
	
		returnvalue += indent+"while"+this.getCondition().toUrbiString()+"\n";
		returnvalue += indent+"{\n";
		returnvalue += this.getOperation().toUrbiString(indent+"\t")+"\n";
		returnvalue += indent+"};\n";
		return returnvalue;
	}
	
	
} //WhileImpl
