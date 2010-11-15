/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import robot.Alternative;
import robot.Backward;
import robot.Echo;
import robot.Event;
import robot.Forward;
import robot.Operation;
import robot.RobotPackage;
import robot.Sequence;
import robot.TurnLeft;
import robot.TurnRight;
import robot.Var;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends CDOObjectImpl implements Operation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	 /**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated NOT
	*/
	public String toUrbiString(String indent){
		String retour = "";
		if (this instanceof Var)
		{
			Var variable = (Var) this;
			String value = variable.getValue().toUrbiString();
			retour = indent + "var "+variable.getName()+" = "+value+";";
		}
		else if (this instanceof Echo)
		{
			Echo echo = (Echo)this;
			String value = echo.getParam();
			retour = indent + "echo(\""+value+"\");\n";
		}
		else if (this instanceof Event)
		{
			Event event = (Event)this;
			retour = "Not Implemented yet (Event)";
		}
		else if (this instanceof Alternative)
		{
			Alternative alternative = (Alternative) this;
			retour = "Not Implemented yet (Alternative)";
		}
		else if (this instanceof TurnLeft)
		{
			retour = ((TurnLeft)this).toUrbiString(indent);
		}
		else if (this instanceof TurnRight)
		{
			retour = ((TurnRight)this).toUrbiString(indent);
		}
		else if (this instanceof Backward)
		{
			retour = ((Backward)this).toUrbiString(indent);
		}
		else if (this instanceof Forward)
		{
		retour = ((Forward)this).toUrbiString(indent);
		}
		else if (this instanceof Sequence)
		{
			retour += indent + "{\n";
			for (Operation ope : ((Sequence)this).getOperations()) {
				retour+= ope.toUrbiString(indent+"\t");
			}
			retour += "\n" + indent + "}";
		}
		return retour;
	}
} //OperationImpl
