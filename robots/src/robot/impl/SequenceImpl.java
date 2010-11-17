/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package robot.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import robot.Operation;
import robot.RobotPackage;
import robot.Sequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link robot.impl.SequenceImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceImpl extends OperationImpl implements Sequence {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotPackage.Literals.SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Operation> getOperations() {
		return (EList<Operation>)eGet(RobotPackage.Literals.SEQUENCE__OPERATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Code correspondant à une séquence d'instructions
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toUrbiString(String indent) {
		String retour = "";
		retour += indent + "{\n";
		for (Operation ope : ((Sequence)this).getOperations()) {
			retour+= ope.toUrbiString(indent+"\t");
		}
		retour += "\n" + indent + "}";
		return retour;
	}
} //SequenceImpl
