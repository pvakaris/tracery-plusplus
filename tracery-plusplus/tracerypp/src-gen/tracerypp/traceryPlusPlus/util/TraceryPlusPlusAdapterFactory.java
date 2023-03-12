/**
 * generated by Xtext 2.30.0
 */
package tracerypp.traceryPlusPlus.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tracerypp.traceryPlusPlus.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tracerypp.traceryPlusPlus.TraceryPlusPlusPackage
 * @generated
 */
public class TraceryPlusPlusAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TraceryPlusPlusPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TraceryPlusPlusAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = TraceryPlusPlusPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TraceryPlusPlusSwitch<Adapter> modelSwitch =
    new TraceryPlusPlusSwitch<Adapter>()
    {
      @Override
      public Adapter caseTraceryPlusPlusProgram(TraceryPlusPlusProgram object)
      {
        return createTraceryPlusPlusProgramAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter caseStory(Story object)
      {
        return createStoryAdapter();
      }
      @Override
      public Adapter caseListDeclaration(ListDeclaration object)
      {
        return createListDeclarationAdapter();
      }
      @Override
      public Adapter caseObjectDeclaration(ObjectDeclaration object)
      {
        return createObjectDeclarationAdapter();
      }
      @Override
      public Adapter caseWord(Word object)
      {
        return createWordAdapter();
      }
      @Override
      public Adapter caseListUse(ListUse object)
      {
        return createListUseAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseNameExistingListAttribute(NameExistingListAttribute object)
      {
        return createNameExistingListAttributeAdapter();
      }
      @Override
      public Adapter caseNameValueAttribute(NameValueAttribute object)
      {
        return createNameValueAttributeAdapter();
      }
      @Override
      public Adapter caseObjectUse(ObjectUse object)
      {
        return createObjectUseAdapter();
      }
      @Override
      public Adapter caseObjectAttribute(ObjectAttribute object)
      {
        return createObjectAttributeAdapter();
      }
      @Override
      public Adapter caseObjectPronoun(ObjectPronoun object)
      {
        return createObjectPronounAdapter();
      }
      @Override
      public Adapter caseWordList(WordList object)
      {
        return createWordListAdapter();
      }
      @Override
      public Adapter caseAttributeList(AttributeList object)
      {
        return createAttributeListAdapter();
      }
      @Override
      public Adapter casePronouns(Pronouns object)
      {
        return createPronounsAdapter();
      }
      @Override
      public Adapter casePronounIdentifier(PronounIdentifier object)
      {
        return createPronounIdentifierAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link tracerypp.traceryPlusPlus.TraceryPlusPlusProgram <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tracerypp.traceryPlusPlus.TraceryPlusPlusProgram
   * @generated
   */
  public Adapter createTraceryPlusPlusProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tracerypp.traceryPlusPlus.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tracerypp.traceryPlusPlus.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tracerypp.traceryPlusPlus.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tracerypp.traceryPlusPlus.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tracerypp.traceryPlusPlus.Story <em>Story</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tracerypp.traceryPlusPlus.Story
   * @generated
   */
  public Adapter createStoryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tracerypp.traceryPlusPlus.ListDeclaration <em>List Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tracerypp.traceryPlusPlus.ListDeclaration
   * @generated
   */
  public Adapter createListDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tracerypp.traceryPlusPlus.ObjectDeclaration <em>Object Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tracerypp.traceryPlusPlus.ObjectDeclaration
   * @generated
   */
  public Adapter createObjectDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tracerypp.traceryPlusPlus.Word <em>Word</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tracerypp.traceryPlusPlus.Word
   * @generated
   */
  public Adapter createWordAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tracerypp.traceryPlusPlus.ListUse <em>List Use</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tracerypp.traceryPlusPlus.ListUse
   * @generated
   */
  public Adapter createListUseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tracerypp.traceryPlusPlus.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tracerypp.traceryPlusPlus.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tracerypp.traceryPlusPlus.NameExistingListAttribute <em>Name Existing List Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tracerypp.traceryPlusPlus.NameExistingListAttribute
   * @generated
   */
  public Adapter createNameExistingListAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tracerypp.traceryPlusPlus.NameValueAttribute <em>Name Value Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tracerypp.traceryPlusPlus.NameValueAttribute
   * @generated
   */
  public Adapter createNameValueAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tracerypp.traceryPlusPlus.ObjectUse <em>Object Use</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tracerypp.traceryPlusPlus.ObjectUse
   * @generated
   */
  public Adapter createObjectUseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tracerypp.traceryPlusPlus.ObjectAttribute <em>Object Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tracerypp.traceryPlusPlus.ObjectAttribute
   * @generated
   */
  public Adapter createObjectAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tracerypp.traceryPlusPlus.ObjectPronoun <em>Object Pronoun</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tracerypp.traceryPlusPlus.ObjectPronoun
   * @generated
   */
  public Adapter createObjectPronounAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tracerypp.traceryPlusPlus.WordList <em>Word List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tracerypp.traceryPlusPlus.WordList
   * @generated
   */
  public Adapter createWordListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tracerypp.traceryPlusPlus.AttributeList <em>Attribute List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tracerypp.traceryPlusPlus.AttributeList
   * @generated
   */
  public Adapter createAttributeListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tracerypp.traceryPlusPlus.Pronouns <em>Pronouns</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tracerypp.traceryPlusPlus.Pronouns
   * @generated
   */
  public Adapter createPronounsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tracerypp.traceryPlusPlus.PronounIdentifier <em>Pronoun Identifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tracerypp.traceryPlusPlus.PronounIdentifier
   * @generated
   */
  public Adapter createPronounIdentifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //TraceryPlusPlusAdapterFactory
