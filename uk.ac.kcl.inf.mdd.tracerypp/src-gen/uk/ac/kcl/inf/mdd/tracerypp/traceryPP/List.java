/**
 * generated by Xtext 2.29.0
 */
package uk.ac.kcl.inf.mdd.tracerypp.traceryPP;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.tracerypp.traceryPP.List#getWords <em>Words</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.tracerypp.traceryPP.List#getSep <em>Sep</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.tracerypp.traceryPP.List#getWord <em>Word</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mdd.tracerypp.traceryPP.TraceryPPPackage#getList()
 * @model
 * @generated
 */
public interface List extends EObject
{
  /**
   * Returns the value of the '<em><b>Words</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.mdd.tracerypp.traceryPP.Word}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Words</em>' containment reference list.
   * @see uk.ac.kcl.inf.mdd.tracerypp.traceryPP.TraceryPPPackage#getList_Words()
   * @model containment="true"
   * @generated
   */
  EList<Word> getWords();

  /**
   * Returns the value of the '<em><b>Sep</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sep</em>' attribute.
   * @see #setSep(String)
   * @see uk.ac.kcl.inf.mdd.tracerypp.traceryPP.TraceryPPPackage#getList_Sep()
   * @model
   * @generated
   */
  String getSep();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.mdd.tracerypp.traceryPP.List#getSep <em>Sep</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sep</em>' attribute.
   * @see #getSep()
   * @generated
   */
  void setSep(String value);

  /**
   * Returns the value of the '<em><b>Word</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Word</em>' containment reference.
   * @see #setWord(Word)
   * @see uk.ac.kcl.inf.mdd.tracerypp.traceryPP.TraceryPPPackage#getList_Word()
   * @model containment="true"
   * @generated
   */
  Word getWord();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.mdd.tracerypp.traceryPP.List#getWord <em>Word</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Word</em>' containment reference.
   * @see #getWord()
   * @generated
   */
  void setWord(Word value);

} // List
