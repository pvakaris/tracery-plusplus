/**
 * generated by Xtext 2.30.0
 */
package tracerypp.traceryPlusPlus.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tracerypp.traceryPlusPlus.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TraceryPlusPlusFactoryImpl extends EFactoryImpl implements TraceryPlusPlusFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TraceryPlusPlusFactory init()
  {
    try
    {
      TraceryPlusPlusFactory theTraceryPlusPlusFactory = (TraceryPlusPlusFactory)EPackage.Registry.INSTANCE.getEFactory(TraceryPlusPlusPackage.eNS_URI);
      if (theTraceryPlusPlusFactory != null)
      {
        return theTraceryPlusPlusFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TraceryPlusPlusFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TraceryPlusPlusFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TraceryPlusPlusPackage.TRACERY_PLUS_PLUS_PROGRAM: return createTraceryPlusPlusProgram();
      case TraceryPlusPlusPackage.STATEMENT: return createStatement();
      case TraceryPlusPlusPackage.DECLARATION: return createDeclaration();
      case TraceryPlusPlusPackage.STORY: return createStory();
      case TraceryPlusPlusPackage.LIST_DECLARATION: return createListDeclaration();
      case TraceryPlusPlusPackage.OBJECT_DECLARATION: return createObjectDeclaration();
      case TraceryPlusPlusPackage.WORD: return createWord();
      case TraceryPlusPlusPackage.VARIABLE: return createVariable();
      case TraceryPlusPlusPackage.STORY_VARIABLE: return createStoryVariable();
      case TraceryPlusPlusPackage.ATTRIBUTE: return createAttribute();
      case TraceryPlusPlusPackage.EXISTING_VARIABLE: return createExistingVariable();
      case TraceryPlusPlusPackage.JUST_NAME_ATTRIBUTE: return createJustNameAttribute();
      case TraceryPlusPlusPackage.NAME_EXISTING_LIST_ATTRIBUTE: return createNameExistingListAttribute();
      case TraceryPlusPlusPackage.NAME_VALUE_ATTRIBUTE: return createNameValueAttribute();
      case TraceryPlusPlusPackage.OBJECT_ATTRIBUTE: return createObjectAttribute();
      case TraceryPlusPlusPackage.WORD_LIST: return createWordList();
      case TraceryPlusPlusPackage.ATTRIBUTE_LIST: return createAttributeList();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TraceryPlusPlusProgram createTraceryPlusPlusProgram()
  {
    TraceryPlusPlusProgramImpl traceryPlusPlusProgram = new TraceryPlusPlusProgramImpl();
    return traceryPlusPlusProgram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Story createStory()
  {
    StoryImpl story = new StoryImpl();
    return story;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ListDeclaration createListDeclaration()
  {
    ListDeclarationImpl listDeclaration = new ListDeclarationImpl();
    return listDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ObjectDeclaration createObjectDeclaration()
  {
    ObjectDeclarationImpl objectDeclaration = new ObjectDeclarationImpl();
    return objectDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Word createWord()
  {
    WordImpl word = new WordImpl();
    return word;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StoryVariable createStoryVariable()
  {
    StoryVariableImpl storyVariable = new StoryVariableImpl();
    return storyVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExistingVariable createExistingVariable()
  {
    ExistingVariableImpl existingVariable = new ExistingVariableImpl();
    return existingVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JustNameAttribute createJustNameAttribute()
  {
    JustNameAttributeImpl justNameAttribute = new JustNameAttributeImpl();
    return justNameAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NameExistingListAttribute createNameExistingListAttribute()
  {
    NameExistingListAttributeImpl nameExistingListAttribute = new NameExistingListAttributeImpl();
    return nameExistingListAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NameValueAttribute createNameValueAttribute()
  {
    NameValueAttributeImpl nameValueAttribute = new NameValueAttributeImpl();
    return nameValueAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ObjectAttribute createObjectAttribute()
  {
    ObjectAttributeImpl objectAttribute = new ObjectAttributeImpl();
    return objectAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WordList createWordList()
  {
    WordListImpl wordList = new WordListImpl();
    return wordList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AttributeList createAttributeList()
  {
    AttributeListImpl attributeList = new AttributeListImpl();
    return attributeList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TraceryPlusPlusPackage getTraceryPlusPlusPackage()
  {
    return (TraceryPlusPlusPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TraceryPlusPlusPackage getPackage()
  {
    return TraceryPlusPlusPackage.eINSTANCE;
  }

} //TraceryPlusPlusFactoryImpl
