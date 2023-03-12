/**
 * generated by Xtext 2.30.0
 */
package tracerypp.traceryPlusPlus;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tracerypp.traceryPlusPlus.TraceryPlusPlusPackage
 * @generated
 */
public interface TraceryPlusPlusFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TraceryPlusPlusFactory eINSTANCE = tracerypp.traceryPlusPlus.impl.TraceryPlusPlusFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Program</em>'.
   * @generated
   */
  TraceryPlusPlusProgram createTraceryPlusPlusProgram();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable</em>'.
   * @generated
   */
  Variable createVariable();

  /**
   * Returns a new object of class '<em>Story</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Story</em>'.
   * @generated
   */
  Story createStory();

  /**
   * Returns a new object of class '<em>List Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Declaration</em>'.
   * @generated
   */
  ListDeclaration createListDeclaration();

  /**
   * Returns a new object of class '<em>Object Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Declaration</em>'.
   * @generated
   */
  ObjectDeclaration createObjectDeclaration();

  /**
   * Returns a new object of class '<em>Word</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Word</em>'.
   * @generated
   */
  Word createWord();

  /**
   * Returns a new object of class '<em>List Use</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Use</em>'.
   * @generated
   */
  ListUse createListUse();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Name Existing List Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Name Existing List Attribute</em>'.
   * @generated
   */
  NameExistingListAttribute createNameExistingListAttribute();

  /**
   * Returns a new object of class '<em>Name Value Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Name Value Attribute</em>'.
   * @generated
   */
  NameValueAttribute createNameValueAttribute();

  /**
   * Returns a new object of class '<em>Object Use</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Use</em>'.
   * @generated
   */
  ObjectUse createObjectUse();

  /**
   * Returns a new object of class '<em>Object Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Attribute</em>'.
   * @generated
   */
  ObjectAttribute createObjectAttribute();

  /**
   * Returns a new object of class '<em>Object Pronoun</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Object Pronoun</em>'.
   * @generated
   */
  ObjectPronoun createObjectPronoun();

  /**
   * Returns a new object of class '<em>Word List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Word List</em>'.
   * @generated
   */
  WordList createWordList();

  /**
   * Returns a new object of class '<em>Attribute List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute List</em>'.
   * @generated
   */
  AttributeList createAttributeList();

  /**
   * Returns a new object of class '<em>Pronouns</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pronouns</em>'.
   * @generated
   */
  Pronouns createPronouns();

  /**
   * Returns a new object of class '<em>Pronoun Identifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pronoun Identifier</em>'.
   * @generated
   */
  PronounIdentifier createPronounIdentifier();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TraceryPlusPlusPackage getTraceryPlusPlusPackage();

} //TraceryPlusPlusFactory
