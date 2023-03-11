/**
 * generated by Xtext 2.30.0
 */
package tracerypp.traceryPlusPlus;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tracerypp.traceryPlusPlus.ObjectAttribute#getObject <em>Object</em>}</li>
 *   <li>{@link tracerypp.traceryPlusPlus.ObjectAttribute#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link tracerypp.traceryPlusPlus.ObjectAttribute#getPronoun <em>Pronoun</em>}</li>
 *   <li>{@link tracerypp.traceryPlusPlus.ObjectAttribute#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 *
 * @see tracerypp.traceryPlusPlus.TraceryPlusPlusPackage#getObjectAttribute()
 * @model
 * @generated
 */
public interface ObjectAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object</em>' reference.
   * @see #setObject(ObjectDeclaration)
   * @see tracerypp.traceryPlusPlus.TraceryPlusPlusPackage#getObjectAttribute_Object()
   * @model
   * @generated
   */
  ObjectDeclaration getObject();

  /**
   * Sets the value of the '{@link tracerypp.traceryPlusPlus.ObjectAttribute#getObject <em>Object</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object</em>' reference.
   * @see #getObject()
   * @generated
   */
  void setObject(ObjectDeclaration value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' reference.
   * @see #setAttribute(Variable)
   * @see tracerypp.traceryPlusPlus.TraceryPlusPlusPackage#getObjectAttribute_Attribute()
   * @model
   * @generated
   */
  Variable getAttribute();

  /**
   * Sets the value of the '{@link tracerypp.traceryPlusPlus.ObjectAttribute#getAttribute <em>Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(Variable value);

  /**
   * Returns the value of the '<em><b>Pronoun</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pronoun</em>' containment reference.
   * @see #setPronoun(PronounIdentifier)
   * @see tracerypp.traceryPlusPlus.TraceryPlusPlusPackage#getObjectAttribute_Pronoun()
   * @model containment="true"
   * @generated
   */
  PronounIdentifier getPronoun();

  /**
   * Sets the value of the '{@link tracerypp.traceryPlusPlus.ObjectAttribute#getPronoun <em>Pronoun</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pronoun</em>' containment reference.
   * @see #getPronoun()
   * @generated
   */
  void setPronoun(PronounIdentifier value);

  /**
   * Returns the value of the '<em><b>Modifiers</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifiers</em>' attribute list.
   * @see tracerypp.traceryPlusPlus.TraceryPlusPlusPackage#getObjectAttribute_Modifiers()
   * @model unique="false"
   * @generated
   */
  EList<String> getModifiers();

} // ObjectAttribute
