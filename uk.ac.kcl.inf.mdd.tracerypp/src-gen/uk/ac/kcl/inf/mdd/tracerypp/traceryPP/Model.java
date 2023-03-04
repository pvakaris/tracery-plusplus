/**
 * generated by Xtext 2.29.0
 */
package uk.ac.kcl.inf.mdd.tracerypp.traceryPP;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.tracerypp.traceryPP.Model#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mdd.tracerypp.traceryPP.TraceryPPPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.mdd.tracerypp.traceryPP.Statement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see uk.ac.kcl.inf.mdd.tracerypp.traceryPP.TraceryPPPackage#getModel_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // Model
