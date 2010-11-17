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
import robot.Sleep;
import robot.Stop;
import robot.TurnLeft;
import robot.TurnRight;
import robot.Var;
import robot.Whenever;
import robot.While;

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

	@Override
	public String toUrbiString(String indent) {
		if (this instanceof Sequence)
			return ((Sequence)this).toUrbiString(indent);
		else if (this instanceof Echo)
			return ((Echo)this).toUrbiString(indent);
		else if (this instanceof Event)
			return ((Event)this).toUrbiString(indent);
		else if (this instanceof Whenever)
			return ((Whenever)this).toUrbiString(indent);
		else if (this instanceof Alternative)
			return ((Alternative)this).toUrbiString(indent);
		else if (this instanceof While)
			return ((While)this).toUrbiString(indent);
		else if (this instanceof Var)
			return ((Var)this).toUrbiString(indent);
		else if (this instanceof Sleep)
			return ((Sleep)this).toUrbiString(indent);
		else if (this instanceof Forward)
			return ((Forward)this).toUrbiString(indent);
		else if (this instanceof Backward)
			return ((Backward)this).toUrbiString(indent);
		else if (this instanceof TurnRight)
			return ((TurnRight)this).toUrbiString(indent);
		else if (this instanceof TurnLeft)
			return ((TurnLeft)this).toUrbiString(indent);
		else if (this instanceof Stop)
			return ((Stop)this).toUrbiString(indent);
		else
			return "Not implemented yet";
	}

} //OperationImpl
