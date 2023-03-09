/**
 * generated by Xtext 2.30.0
 */
package tracerypp.traceryPlusPlus;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tracerypp.traceryPlusPlus.TraceryPlusPlusFactory
 * @model kind="package"
 * @generated
 */
public interface TraceryPlusPlusPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "traceryPlusPlus";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.TraceryPlusPlus.tracerypp";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "traceryPlusPlus";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TraceryPlusPlusPackage eINSTANCE = tracerypp.traceryPlusPlus.impl.TraceryPlusPlusPackageImpl.init();

  /**
   * The meta object id for the '{@link tracerypp.traceryPlusPlus.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tracerypp.traceryPlusPlus.impl.ModelImpl
   * @see tracerypp.traceryPlusPlus.impl.TraceryPlusPlusPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__STATEMENTS = 0;

  /**
   * The feature id for the '<em><b>Story</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__STORY = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link tracerypp.traceryPlusPlus.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tracerypp.traceryPlusPlus.impl.StatementImpl
   * @see tracerypp.traceryPlusPlus.impl.TraceryPlusPlusPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 1;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link tracerypp.traceryPlusPlus.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tracerypp.traceryPlusPlus.impl.DeclarationImpl
   * @see tracerypp.traceryPlusPlus.impl.TraceryPlusPlusPackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 2;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link tracerypp.traceryPlusPlus.impl.StoryImpl <em>Story</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tracerypp.traceryPlusPlus.impl.StoryImpl
   * @see tracerypp.traceryPlusPlus.impl.TraceryPlusPlusPackageImpl#getStory()
   * @generated
   */
  int STORY = 3;

  /**
   * The feature id for the '<em><b>Story</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORY__STORY = 0;

  /**
   * The number of structural features of the '<em>Story</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link tracerypp.traceryPlusPlus.impl.ListDeclarationImpl <em>List Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tracerypp.traceryPlusPlus.impl.ListDeclarationImpl
   * @see tracerypp.traceryPlusPlus.impl.TraceryPlusPlusPackageImpl#getListDeclaration()
   * @generated
   */
  int LIST_DECLARATION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_DECLARATION__NAME = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_DECLARATION__LIST = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>List Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link tracerypp.traceryPlusPlus.impl.ObjectDeclarationImpl <em>Object Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tracerypp.traceryPlusPlus.impl.ObjectDeclarationImpl
   * @see tracerypp.traceryPlusPlus.impl.TraceryPlusPlusPackageImpl#getObjectDeclaration()
   * @generated
   */
  int OBJECT_DECLARATION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_DECLARATION__NAME = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_DECLARATION__ATTRIBUTES = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Object Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link tracerypp.traceryPlusPlus.impl.WordImpl <em>Word</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tracerypp.traceryPlusPlus.impl.WordImpl
   * @see tracerypp.traceryPlusPlus.impl.TraceryPlusPlusPackageImpl#getWord()
   * @generated
   */
  int WORD = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORD__VALUE = 0;

  /**
   * The number of structural features of the '<em>Word</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link tracerypp.traceryPlusPlus.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tracerypp.traceryPlusPlus.impl.VariableImpl
   * @see tracerypp.traceryPlusPlus.impl.TraceryPlusPlusPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = 0;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link tracerypp.traceryPlusPlus.impl.StoryVariableImpl <em>Story Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tracerypp.traceryPlusPlus.impl.StoryVariableImpl
   * @see tracerypp.traceryPlusPlus.impl.TraceryPlusPlusPackageImpl#getStoryVariable()
   * @generated
   */
  int STORY_VARIABLE = 8;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORY_VARIABLE__VARIABLE = 0;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORY_VARIABLE__MODIFIERS = 1;

  /**
   * The number of structural features of the '<em>Story Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORY_VARIABLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link tracerypp.traceryPlusPlus.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tracerypp.traceryPlusPlus.impl.AttributeImpl
   * @see tracerypp.traceryPlusPlus.impl.TraceryPlusPlusPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link tracerypp.traceryPlusPlus.impl.ExistingVariableImpl <em>Existing Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tracerypp.traceryPlusPlus.impl.ExistingVariableImpl
   * @see tracerypp.traceryPlusPlus.impl.TraceryPlusPlusPackageImpl#getExistingVariable()
   * @generated
   */
  int EXISTING_VARIABLE = 10;

  /**
   * The feature id for the '<em><b>Pointer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTING_VARIABLE__POINTER = 0;

  /**
   * The number of structural features of the '<em>Existing Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTING_VARIABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link tracerypp.traceryPlusPlus.impl.ObjectAttributeImpl <em>Object Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tracerypp.traceryPlusPlus.impl.ObjectAttributeImpl
   * @see tracerypp.traceryPlusPlus.impl.TraceryPlusPlusPackageImpl#getObjectAttribute()
   * @generated
   */
  int OBJECT_ATTRIBUTE = 11;

  /**
   * The feature id for the '<em><b>Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_ATTRIBUTE__OBJECT = 0;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_ATTRIBUTE__ATTRIBUTE = 1;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_ATTRIBUTE__MODIFIERS = 2;

  /**
   * The number of structural features of the '<em>Object Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_ATTRIBUTE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link tracerypp.traceryPlusPlus.impl.WordListImpl <em>Word List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tracerypp.traceryPlusPlus.impl.WordListImpl
   * @see tracerypp.traceryPlusPlus.impl.TraceryPlusPlusPackageImpl#getWordList()
   * @generated
   */
  int WORD_LIST = 12;

  /**
   * The feature id for the '<em><b>Words</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORD_LIST__WORDS = 0;

  /**
   * The number of structural features of the '<em>Word List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORD_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link tracerypp.traceryPlusPlus.impl.AttributeListImpl <em>Attribute List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tracerypp.traceryPlusPlus.impl.AttributeListImpl
   * @see tracerypp.traceryPlusPlus.impl.TraceryPlusPlusPackageImpl#getAttributeList()
   * @generated
   */
  int ATTRIBUTE_LIST = 13;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_LIST__ATTRIBUTES = 0;

  /**
   * The number of structural features of the '<em>Attribute List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_LIST_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link tracerypp.traceryPlusPlus.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see tracerypp.traceryPlusPlus.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link tracerypp.traceryPlusPlus.Model#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see tracerypp.traceryPlusPlus.Model#getStatements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Statements();

  /**
   * Returns the meta object for the containment reference '{@link tracerypp.traceryPlusPlus.Model#getStory <em>Story</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Story</em>'.
   * @see tracerypp.traceryPlusPlus.Model#getStory()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Story();

  /**
   * Returns the meta object for class '{@link tracerypp.traceryPlusPlus.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see tracerypp.traceryPlusPlus.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link tracerypp.traceryPlusPlus.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see tracerypp.traceryPlusPlus.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for class '{@link tracerypp.traceryPlusPlus.Story <em>Story</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Story</em>'.
   * @see tracerypp.traceryPlusPlus.Story
   * @generated
   */
  EClass getStory();

  /**
   * Returns the meta object for the containment reference list '{@link tracerypp.traceryPlusPlus.Story#getStory <em>Story</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Story</em>'.
   * @see tracerypp.traceryPlusPlus.Story#getStory()
   * @see #getStory()
   * @generated
   */
  EReference getStory_Story();

  /**
   * Returns the meta object for class '{@link tracerypp.traceryPlusPlus.ListDeclaration <em>List Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Declaration</em>'.
   * @see tracerypp.traceryPlusPlus.ListDeclaration
   * @generated
   */
  EClass getListDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link tracerypp.traceryPlusPlus.ListDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see tracerypp.traceryPlusPlus.ListDeclaration#getName()
   * @see #getListDeclaration()
   * @generated
   */
  EReference getListDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link tracerypp.traceryPlusPlus.ListDeclaration#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>List</em>'.
   * @see tracerypp.traceryPlusPlus.ListDeclaration#getList()
   * @see #getListDeclaration()
   * @generated
   */
  EReference getListDeclaration_List();

  /**
   * Returns the meta object for class '{@link tracerypp.traceryPlusPlus.ObjectDeclaration <em>Object Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Declaration</em>'.
   * @see tracerypp.traceryPlusPlus.ObjectDeclaration
   * @generated
   */
  EClass getObjectDeclaration();

  /**
   * Returns the meta object for the attribute '{@link tracerypp.traceryPlusPlus.ObjectDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see tracerypp.traceryPlusPlus.ObjectDeclaration#getName()
   * @see #getObjectDeclaration()
   * @generated
   */
  EAttribute getObjectDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link tracerypp.traceryPlusPlus.ObjectDeclaration#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attributes</em>'.
   * @see tracerypp.traceryPlusPlus.ObjectDeclaration#getAttributes()
   * @see #getObjectDeclaration()
   * @generated
   */
  EReference getObjectDeclaration_Attributes();

  /**
   * Returns the meta object for class '{@link tracerypp.traceryPlusPlus.Word <em>Word</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Word</em>'.
   * @see tracerypp.traceryPlusPlus.Word
   * @generated
   */
  EClass getWord();

  /**
   * Returns the meta object for the attribute '{@link tracerypp.traceryPlusPlus.Word#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see tracerypp.traceryPlusPlus.Word#getValue()
   * @see #getWord()
   * @generated
   */
  EAttribute getWord_Value();

  /**
   * Returns the meta object for class '{@link tracerypp.traceryPlusPlus.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see tracerypp.traceryPlusPlus.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link tracerypp.traceryPlusPlus.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see tracerypp.traceryPlusPlus.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the meta object for class '{@link tracerypp.traceryPlusPlus.StoryVariable <em>Story Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Story Variable</em>'.
   * @see tracerypp.traceryPlusPlus.StoryVariable
   * @generated
   */
  EClass getStoryVariable();

  /**
   * Returns the meta object for the reference '{@link tracerypp.traceryPlusPlus.StoryVariable#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see tracerypp.traceryPlusPlus.StoryVariable#getVariable()
   * @see #getStoryVariable()
   * @generated
   */
  EReference getStoryVariable_Variable();

  /**
   * Returns the meta object for the attribute list '{@link tracerypp.traceryPlusPlus.StoryVariable#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Modifiers</em>'.
   * @see tracerypp.traceryPlusPlus.StoryVariable#getModifiers()
   * @see #getStoryVariable()
   * @generated
   */
  EAttribute getStoryVariable_Modifiers();

  /**
   * Returns the meta object for class '{@link tracerypp.traceryPlusPlus.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see tracerypp.traceryPlusPlus.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the containment reference '{@link tracerypp.traceryPlusPlus.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see tracerypp.traceryPlusPlus.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link tracerypp.traceryPlusPlus.Attribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see tracerypp.traceryPlusPlus.Attribute#getValue()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Value();

  /**
   * Returns the meta object for class '{@link tracerypp.traceryPlusPlus.ExistingVariable <em>Existing Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Existing Variable</em>'.
   * @see tracerypp.traceryPlusPlus.ExistingVariable
   * @generated
   */
  EClass getExistingVariable();

  /**
   * Returns the meta object for the reference '{@link tracerypp.traceryPlusPlus.ExistingVariable#getPointer <em>Pointer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Pointer</em>'.
   * @see tracerypp.traceryPlusPlus.ExistingVariable#getPointer()
   * @see #getExistingVariable()
   * @generated
   */
  EReference getExistingVariable_Pointer();

  /**
   * Returns the meta object for class '{@link tracerypp.traceryPlusPlus.ObjectAttribute <em>Object Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Attribute</em>'.
   * @see tracerypp.traceryPlusPlus.ObjectAttribute
   * @generated
   */
  EClass getObjectAttribute();

  /**
   * Returns the meta object for the reference '{@link tracerypp.traceryPlusPlus.ObjectAttribute#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Object</em>'.
   * @see tracerypp.traceryPlusPlus.ObjectAttribute#getObject()
   * @see #getObjectAttribute()
   * @generated
   */
  EReference getObjectAttribute_Object();

  /**
   * Returns the meta object for the reference '{@link tracerypp.traceryPlusPlus.ObjectAttribute#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attribute</em>'.
   * @see tracerypp.traceryPlusPlus.ObjectAttribute#getAttribute()
   * @see #getObjectAttribute()
   * @generated
   */
  EReference getObjectAttribute_Attribute();

  /**
   * Returns the meta object for the attribute list '{@link tracerypp.traceryPlusPlus.ObjectAttribute#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Modifiers</em>'.
   * @see tracerypp.traceryPlusPlus.ObjectAttribute#getModifiers()
   * @see #getObjectAttribute()
   * @generated
   */
  EAttribute getObjectAttribute_Modifiers();

  /**
   * Returns the meta object for class '{@link tracerypp.traceryPlusPlus.WordList <em>Word List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Word List</em>'.
   * @see tracerypp.traceryPlusPlus.WordList
   * @generated
   */
  EClass getWordList();

  /**
   * Returns the meta object for the containment reference list '{@link tracerypp.traceryPlusPlus.WordList#getWords <em>Words</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Words</em>'.
   * @see tracerypp.traceryPlusPlus.WordList#getWords()
   * @see #getWordList()
   * @generated
   */
  EReference getWordList_Words();

  /**
   * Returns the meta object for class '{@link tracerypp.traceryPlusPlus.AttributeList <em>Attribute List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute List</em>'.
   * @see tracerypp.traceryPlusPlus.AttributeList
   * @generated
   */
  EClass getAttributeList();

  /**
   * Returns the meta object for the containment reference list '{@link tracerypp.traceryPlusPlus.AttributeList#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see tracerypp.traceryPlusPlus.AttributeList#getAttributes()
   * @see #getAttributeList()
   * @generated
   */
  EReference getAttributeList_Attributes();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TraceryPlusPlusFactory getTraceryPlusPlusFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link tracerypp.traceryPlusPlus.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tracerypp.traceryPlusPlus.impl.ModelImpl
     * @see tracerypp.traceryPlusPlus.impl.TraceryPlusPlusPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__STATEMENTS = eINSTANCE.getModel_Statements();

    /**
     * The meta object literal for the '<em><b>Story</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__STORY = eINSTANCE.getModel_Story();

    /**
     * The meta object literal for the '{@link tracerypp.traceryPlusPlus.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tracerypp.traceryPlusPlus.impl.StatementImpl
     * @see tracerypp.traceryPlusPlus.impl.TraceryPlusPlusPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link tracerypp.traceryPlusPlus.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tracerypp.traceryPlusPlus.impl.DeclarationImpl
     * @see tracerypp.traceryPlusPlus.impl.TraceryPlusPlusPackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '{@link tracerypp.traceryPlusPlus.impl.StoryImpl <em>Story</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tracerypp.traceryPlusPlus.impl.StoryImpl
     * @see tracerypp.traceryPlusPlus.impl.TraceryPlusPlusPackageImpl#getStory()
     * @generated
     */
    EClass STORY = eINSTANCE.getStory();

    /**
     * The meta object literal for the '<em><b>Story</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STORY__STORY = eINSTANCE.getStory_Story();

    /**
     * The meta object literal for the '{@link tracerypp.traceryPlusPlus.impl.ListDeclarationImpl <em>List Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tracerypp.traceryPlusPlus.impl.ListDeclarationImpl
     * @see tracerypp.traceryPlusPlus.impl.TraceryPlusPlusPackageImpl#getListDeclaration()
     * @generated
     */
    EClass LIST_DECLARATION = eINSTANCE.getListDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_DECLARATION__NAME = eINSTANCE.getListDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_DECLARATION__LIST = eINSTANCE.getListDeclaration_List();

    /**
     * The meta object literal for the '{@link tracerypp.traceryPlusPlus.impl.ObjectDeclarationImpl <em>Object Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tracerypp.traceryPlusPlus.impl.ObjectDeclarationImpl
     * @see tracerypp.traceryPlusPlus.impl.TraceryPlusPlusPackageImpl#getObjectDeclaration()
     * @generated
     */
    EClass OBJECT_DECLARATION = eINSTANCE.getObjectDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_DECLARATION__NAME = eINSTANCE.getObjectDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_DECLARATION__ATTRIBUTES = eINSTANCE.getObjectDeclaration_Attributes();

    /**
     * The meta object literal for the '{@link tracerypp.traceryPlusPlus.impl.WordImpl <em>Word</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tracerypp.traceryPlusPlus.impl.WordImpl
     * @see tracerypp.traceryPlusPlus.impl.TraceryPlusPlusPackageImpl#getWord()
     * @generated
     */
    EClass WORD = eINSTANCE.getWord();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORD__VALUE = eINSTANCE.getWord_Value();

    /**
     * The meta object literal for the '{@link tracerypp.traceryPlusPlus.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tracerypp.traceryPlusPlus.impl.VariableImpl
     * @see tracerypp.traceryPlusPlus.impl.TraceryPlusPlusPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

    /**
     * The meta object literal for the '{@link tracerypp.traceryPlusPlus.impl.StoryVariableImpl <em>Story Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tracerypp.traceryPlusPlus.impl.StoryVariableImpl
     * @see tracerypp.traceryPlusPlus.impl.TraceryPlusPlusPackageImpl#getStoryVariable()
     * @generated
     */
    EClass STORY_VARIABLE = eINSTANCE.getStoryVariable();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STORY_VARIABLE__VARIABLE = eINSTANCE.getStoryVariable_Variable();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STORY_VARIABLE__MODIFIERS = eINSTANCE.getStoryVariable_Modifiers();

    /**
     * The meta object literal for the '{@link tracerypp.traceryPlusPlus.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tracerypp.traceryPlusPlus.impl.AttributeImpl
     * @see tracerypp.traceryPlusPlus.impl.TraceryPlusPlusPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

    /**
     * The meta object literal for the '{@link tracerypp.traceryPlusPlus.impl.ExistingVariableImpl <em>Existing Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tracerypp.traceryPlusPlus.impl.ExistingVariableImpl
     * @see tracerypp.traceryPlusPlus.impl.TraceryPlusPlusPackageImpl#getExistingVariable()
     * @generated
     */
    EClass EXISTING_VARIABLE = eINSTANCE.getExistingVariable();

    /**
     * The meta object literal for the '<em><b>Pointer</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXISTING_VARIABLE__POINTER = eINSTANCE.getExistingVariable_Pointer();

    /**
     * The meta object literal for the '{@link tracerypp.traceryPlusPlus.impl.ObjectAttributeImpl <em>Object Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tracerypp.traceryPlusPlus.impl.ObjectAttributeImpl
     * @see tracerypp.traceryPlusPlus.impl.TraceryPlusPlusPackageImpl#getObjectAttribute()
     * @generated
     */
    EClass OBJECT_ATTRIBUTE = eINSTANCE.getObjectAttribute();

    /**
     * The meta object literal for the '<em><b>Object</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_ATTRIBUTE__OBJECT = eINSTANCE.getObjectAttribute_Object();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getObjectAttribute_Attribute();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_ATTRIBUTE__MODIFIERS = eINSTANCE.getObjectAttribute_Modifiers();

    /**
     * The meta object literal for the '{@link tracerypp.traceryPlusPlus.impl.WordListImpl <em>Word List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tracerypp.traceryPlusPlus.impl.WordListImpl
     * @see tracerypp.traceryPlusPlus.impl.TraceryPlusPlusPackageImpl#getWordList()
     * @generated
     */
    EClass WORD_LIST = eINSTANCE.getWordList();

    /**
     * The meta object literal for the '<em><b>Words</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORD_LIST__WORDS = eINSTANCE.getWordList_Words();

    /**
     * The meta object literal for the '{@link tracerypp.traceryPlusPlus.impl.AttributeListImpl <em>Attribute List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tracerypp.traceryPlusPlus.impl.AttributeListImpl
     * @see tracerypp.traceryPlusPlus.impl.TraceryPlusPlusPackageImpl#getAttributeList()
     * @generated
     */
    EClass ATTRIBUTE_LIST = eINSTANCE.getAttributeList();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_LIST__ATTRIBUTES = eINSTANCE.getAttributeList_Attributes();

  }

} //TraceryPlusPlusPackage
