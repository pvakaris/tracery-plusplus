/**
 * generated by Xtext 2.30.0
 */
package uk.ac.kcl.inf.mdd.tracerypp.traceryPP.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.kcl.inf.mdd.tracerypp.traceryPP.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TraceryPPFactoryImpl extends EFactoryImpl implements TraceryPPFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TraceryPPFactory init()
  {
    try
    {
      TraceryPPFactory theTraceryPPFactory = (TraceryPPFactory)EPackage.Registry.INSTANCE.getEFactory(TraceryPPPackage.eNS_URI);
      if (theTraceryPPFactory != null)
      {
        return theTraceryPPFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TraceryPPFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TraceryPPFactoryImpl()
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
      case TraceryPPPackage.MODEL: return createModel();
      case TraceryPPPackage.STATEMENT: return createStatement();
      case TraceryPPPackage.DECLARATION: return createDeclaration();
      case TraceryPPPackage.STORY: return createStory();
      case TraceryPPPackage.LIST_DECLARATION: return createListDeclaration();
      case TraceryPPPackage.OBJECT_DECLARATION: return createObjectDeclaration();
      case TraceryPPPackage.WORD: return createWord();
      case TraceryPPPackage.VARIABLE: return createVariable();
      case TraceryPPPackage.STORY_VARIABLE: return createStoryVariable();
      case TraceryPPPackage.ATTRIBUTE: return createAttribute();
      case TraceryPPPackage.EXISTING_VARIABLE: return createExistingVariable();
      case TraceryPPPackage.OBJECT_ATTRIBUTE: return createObjectAttribute();
      case TraceryPPPackage.WORD_LIST: return createWordList();
      case TraceryPPPackage.ATTRIBUTE_LIST: return createAttributeList();
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
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
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
  public TraceryPPPackage getTraceryPPPackage()
  {
    return (TraceryPPPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TraceryPPPackage getPackage()
  {
    return TraceryPPPackage.eINSTANCE;
  }

} //TraceryPPFactoryImpl
