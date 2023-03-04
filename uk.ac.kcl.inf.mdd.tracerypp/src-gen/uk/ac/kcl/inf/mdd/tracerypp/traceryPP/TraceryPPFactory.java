/**
 * generated by Xtext 2.29.0
 */
package uk.ac.kcl.inf.mdd.tracerypp.traceryPP;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.mdd.tracerypp.traceryPP.TraceryPPPackage
 * @generated
 */
public interface TraceryPPFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TraceryPPFactory eINSTANCE = uk.ac.kcl.inf.mdd.tracerypp.traceryPP.impl.TraceryPPFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Title</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Title</em>'.
   * @generated
   */
  Title createTitle();

  /**
   * Returns a new object of class '<em>Start Symbol</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Start Symbol</em>'.
   * @generated
   */
  StartSymbol createStartSymbol();

  /**
   * Returns a new object of class '<em>List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List</em>'.
   * @generated
   */
  List createList();

  /**
   * Returns a new object of class '<em>Word</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Word</em>'.
   * @generated
   */
  Word createWord();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TraceryPPPackage getTraceryPPPackage();

} //TraceryPPFactory
