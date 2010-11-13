/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

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
import robot.Alternative;

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
	public String toString(){
		String retour = "";
		if (this instanceof Var)
		{
			Var variable = (Var) this;
			String value = variable.getValue().toString();
			retour = "var "+variable.getName()+" = "+value+";";
		}
		else if (this instanceof Echo)
		{
			Echo echo = (Echo)this;
			String value = echo.getParam().toString();
			retour = "echo(\""+value+"\");";
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
			retour = ((TurnLeft)this).toString();
		}
		else if (this instanceof TurnRight)
		{
			retour = ((TurnRight)this).toString();
		}
		else if (this instanceof Backward)
		{
			retour = ((Backward)this).toString();
		}
		else if (this instanceof Forward)
		{
			retour = ((Forward)this).toString();
		}
		else if (this instanceof Sequence)
		{
			retour += "{\n";
			retour += ((Sequence)this).toString();
			retour += "}";
		}
		return retour;
	}

} //OperationImpl
