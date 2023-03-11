/**
 * generated by Xtext 2.30.0
 */
package tracerypp.traceryPlusPlus.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tracerypp.traceryPlusPlus.Attribute;
import tracerypp.traceryPlusPlus.AttributeList;
import tracerypp.traceryPlusPlus.Declaration;
import tracerypp.traceryPlusPlus.ExistingVariable;
import tracerypp.traceryPlusPlus.JustNameAttribute;
import tracerypp.traceryPlusPlus.ListDeclaration;
import tracerypp.traceryPlusPlus.NameExistingListAttribute;
import tracerypp.traceryPlusPlus.NameValueAttribute;
import tracerypp.traceryPlusPlus.ObjectAttribute;
import tracerypp.traceryPlusPlus.ObjectDeclaration;
import tracerypp.traceryPlusPlus.PronounIdentifier;
import tracerypp.traceryPlusPlus.Pronouns;
import tracerypp.traceryPlusPlus.Statement;
import tracerypp.traceryPlusPlus.Story;
import tracerypp.traceryPlusPlus.StoryVariable;
import tracerypp.traceryPlusPlus.TraceryPlusPlusFactory;
import tracerypp.traceryPlusPlus.TraceryPlusPlusPackage;
import tracerypp.traceryPlusPlus.TraceryPlusPlusProgram;
import tracerypp.traceryPlusPlus.Variable;
import tracerypp.traceryPlusPlus.Word;
import tracerypp.traceryPlusPlus.WordList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TraceryPlusPlusPackageImpl extends EPackageImpl implements TraceryPlusPlusPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass traceryPlusPlusProgramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass storyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wordEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass storyVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass existingVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass justNameAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameExistingListAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameValueAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wordListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pronounsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pronounIdentifierEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see tracerypp.traceryPlusPlus.TraceryPlusPlusPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TraceryPlusPlusPackageImpl()
  {
    super(eNS_URI, TraceryPlusPlusFactory.eINSTANCE);
  }
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link TraceryPlusPlusPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TraceryPlusPlusPackage init()
  {
    if (isInited) return (TraceryPlusPlusPackage)EPackage.Registry.INSTANCE.getEPackage(TraceryPlusPlusPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredTraceryPlusPlusPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    TraceryPlusPlusPackageImpl theTraceryPlusPlusPackage = registeredTraceryPlusPlusPackage instanceof TraceryPlusPlusPackageImpl ? (TraceryPlusPlusPackageImpl)registeredTraceryPlusPlusPackage : new TraceryPlusPlusPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theTraceryPlusPlusPackage.createPackageContents();

    // Initialize created meta-data
    theTraceryPlusPlusPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTraceryPlusPlusPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TraceryPlusPlusPackage.eNS_URI, theTraceryPlusPlusPackage);
    return theTraceryPlusPlusPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTraceryPlusPlusProgram()
  {
    return traceryPlusPlusProgramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTraceryPlusPlusProgram_Statements()
  {
    return (EReference)traceryPlusPlusProgramEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTraceryPlusPlusProgram_Story()
  {
    return (EReference)traceryPlusPlusProgramEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDeclaration()
  {
    return declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStory()
  {
    return storyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getStory_Story()
  {
    return (EReference)storyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getListDeclaration()
  {
    return listDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getListDeclaration_Name()
  {
    return (EReference)listDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getListDeclaration_List()
  {
    return (EReference)listDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getObjectDeclaration()
  {
    return objectDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getObjectDeclaration_Name()
  {
    return (EAttribute)objectDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getObjectDeclaration_Pronouns()
  {
    return (EReference)objectDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getObjectDeclaration_Attributes()
  {
    return (EReference)objectDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getWord()
  {
    return wordEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getWord_Value()
  {
    return (EAttribute)wordEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getVariable()
  {
    return variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getVariable_Name()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStoryVariable()
  {
    return storyVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getStoryVariable_Variable()
  {
    return (EReference)storyVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getStoryVariable_Modifiers()
  {
    return (EAttribute)storyVariableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExistingVariable()
  {
    return existingVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExistingVariable_Pointer()
  {
    return (EReference)existingVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getJustNameAttribute()
  {
    return justNameAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getJustNameAttribute_Name()
  {
    return (EReference)justNameAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getNameExistingListAttribute()
  {
    return nameExistingListAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getNameExistingListAttribute_Name()
  {
    return (EReference)nameExistingListAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getNameExistingListAttribute_Value()
  {
    return (EReference)nameExistingListAttributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getNameValueAttribute()
  {
    return nameValueAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getNameValueAttribute_Name()
  {
    return (EReference)nameValueAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getNameValueAttribute_Value()
  {
    return (EReference)nameValueAttributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getObjectAttribute()
  {
    return objectAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getObjectAttribute_Object()
  {
    return (EReference)objectAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getObjectAttribute_Attribute()
  {
    return (EReference)objectAttributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getObjectAttribute_Pronoun()
  {
    return (EReference)objectAttributeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getObjectAttribute_Modifiers()
  {
    return (EAttribute)objectAttributeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getWordList()
  {
    return wordListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getWordList_Words()
  {
    return (EReference)wordListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAttributeList()
  {
    return attributeListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAttributeList_Attributes()
  {
    return (EReference)attributeListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPronouns()
  {
    return pronounsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPronouns_Value()
  {
    return (EAttribute)pronounsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPronounIdentifier()
  {
    return pronounIdentifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPronounIdentifier_Name()
  {
    return (EAttribute)pronounIdentifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TraceryPlusPlusFactory getTraceryPlusPlusFactory()
  {
    return (TraceryPlusPlusFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    traceryPlusPlusProgramEClass = createEClass(TRACERY_PLUS_PLUS_PROGRAM);
    createEReference(traceryPlusPlusProgramEClass, TRACERY_PLUS_PLUS_PROGRAM__STATEMENTS);
    createEReference(traceryPlusPlusProgramEClass, TRACERY_PLUS_PLUS_PROGRAM__STORY);

    statementEClass = createEClass(STATEMENT);

    declarationEClass = createEClass(DECLARATION);

    storyEClass = createEClass(STORY);
    createEReference(storyEClass, STORY__STORY);

    listDeclarationEClass = createEClass(LIST_DECLARATION);
    createEReference(listDeclarationEClass, LIST_DECLARATION__NAME);
    createEReference(listDeclarationEClass, LIST_DECLARATION__LIST);

    objectDeclarationEClass = createEClass(OBJECT_DECLARATION);
    createEAttribute(objectDeclarationEClass, OBJECT_DECLARATION__NAME);
    createEReference(objectDeclarationEClass, OBJECT_DECLARATION__PRONOUNS);
    createEReference(objectDeclarationEClass, OBJECT_DECLARATION__ATTRIBUTES);

    wordEClass = createEClass(WORD);
    createEAttribute(wordEClass, WORD__VALUE);

    variableEClass = createEClass(VARIABLE);
    createEAttribute(variableEClass, VARIABLE__NAME);

    storyVariableEClass = createEClass(STORY_VARIABLE);
    createEReference(storyVariableEClass, STORY_VARIABLE__VARIABLE);
    createEAttribute(storyVariableEClass, STORY_VARIABLE__MODIFIERS);

    attributeEClass = createEClass(ATTRIBUTE);

    existingVariableEClass = createEClass(EXISTING_VARIABLE);
    createEReference(existingVariableEClass, EXISTING_VARIABLE__POINTER);

    justNameAttributeEClass = createEClass(JUST_NAME_ATTRIBUTE);
    createEReference(justNameAttributeEClass, JUST_NAME_ATTRIBUTE__NAME);

    nameExistingListAttributeEClass = createEClass(NAME_EXISTING_LIST_ATTRIBUTE);
    createEReference(nameExistingListAttributeEClass, NAME_EXISTING_LIST_ATTRIBUTE__NAME);
    createEReference(nameExistingListAttributeEClass, NAME_EXISTING_LIST_ATTRIBUTE__VALUE);

    nameValueAttributeEClass = createEClass(NAME_VALUE_ATTRIBUTE);
    createEReference(nameValueAttributeEClass, NAME_VALUE_ATTRIBUTE__NAME);
    createEReference(nameValueAttributeEClass, NAME_VALUE_ATTRIBUTE__VALUE);

    objectAttributeEClass = createEClass(OBJECT_ATTRIBUTE);
    createEReference(objectAttributeEClass, OBJECT_ATTRIBUTE__OBJECT);
    createEReference(objectAttributeEClass, OBJECT_ATTRIBUTE__ATTRIBUTE);
    createEReference(objectAttributeEClass, OBJECT_ATTRIBUTE__PRONOUN);
    createEAttribute(objectAttributeEClass, OBJECT_ATTRIBUTE__MODIFIERS);

    wordListEClass = createEClass(WORD_LIST);
    createEReference(wordListEClass, WORD_LIST__WORDS);

    attributeListEClass = createEClass(ATTRIBUTE_LIST);
    createEReference(attributeListEClass, ATTRIBUTE_LIST__ATTRIBUTES);

    pronounsEClass = createEClass(PRONOUNS);
    createEAttribute(pronounsEClass, PRONOUNS__VALUE);

    pronounIdentifierEClass = createEClass(PRONOUN_IDENTIFIER);
    createEAttribute(pronounIdentifierEClass, PRONOUN_IDENTIFIER__NAME);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    declarationEClass.getESuperTypes().add(this.getStatement());
    listDeclarationEClass.getESuperTypes().add(this.getDeclaration());
    objectDeclarationEClass.getESuperTypes().add(this.getDeclaration());
    justNameAttributeEClass.getESuperTypes().add(this.getAttribute());
    nameExistingListAttributeEClass.getESuperTypes().add(this.getAttribute());
    nameValueAttributeEClass.getESuperTypes().add(this.getAttribute());

    // Initialize classes and features; add operations and parameters
    initEClass(traceryPlusPlusProgramEClass, TraceryPlusPlusProgram.class, "TraceryPlusPlusProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTraceryPlusPlusProgram_Statements(), this.getStatement(), null, "statements", null, 0, -1, TraceryPlusPlusProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTraceryPlusPlusProgram_Story(), this.getStory(), null, "story", null, 0, 1, TraceryPlusPlusProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(declarationEClass, Declaration.class, "Declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(storyEClass, Story.class, "Story", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStory_Story(), ecorePackage.getEObject(), null, "story", null, 0, -1, Story.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listDeclarationEClass, ListDeclaration.class, "ListDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getListDeclaration_Name(), this.getVariable(), null, "name", null, 0, 1, ListDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getListDeclaration_List(), this.getWordList(), null, "list", null, 0, 1, ListDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectDeclarationEClass, ObjectDeclaration.class, "ObjectDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getObjectDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, ObjectDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjectDeclaration_Pronouns(), this.getPronouns(), null, "pronouns", null, 0, 1, ObjectDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjectDeclaration_Attributes(), this.getAttributeList(), null, "attributes", null, 0, 1, ObjectDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wordEClass, Word.class, "Word", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWord_Value(), ecorePackage.getEString(), "value", null, 0, 1, Word.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(storyVariableEClass, StoryVariable.class, "StoryVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStoryVariable_Variable(), this.getVariable(), null, "variable", null, 0, 1, StoryVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStoryVariable_Modifiers(), ecorePackage.getEString(), "modifiers", null, 0, -1, StoryVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(existingVariableEClass, ExistingVariable.class, "ExistingVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExistingVariable_Pointer(), this.getVariable(), null, "pointer", null, 0, 1, ExistingVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(justNameAttributeEClass, JustNameAttribute.class, "JustNameAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJustNameAttribute_Name(), this.getExistingVariable(), null, "name", null, 0, 1, JustNameAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nameExistingListAttributeEClass, NameExistingListAttribute.class, "NameExistingListAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNameExistingListAttribute_Name(), this.getVariable(), null, "name", null, 0, 1, NameExistingListAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNameExistingListAttribute_Value(), this.getExistingVariable(), null, "value", null, 0, 1, NameExistingListAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nameValueAttributeEClass, NameValueAttribute.class, "NameValueAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNameValueAttribute_Name(), this.getVariable(), null, "name", null, 0, 1, NameValueAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNameValueAttribute_Value(), this.getWord(), null, "value", null, 0, 1, NameValueAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectAttributeEClass, ObjectAttribute.class, "ObjectAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectAttribute_Object(), this.getObjectDeclaration(), null, "object", null, 0, 1, ObjectAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjectAttribute_Attribute(), this.getVariable(), null, "attribute", null, 0, 1, ObjectAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjectAttribute_Pronoun(), this.getPronounIdentifier(), null, "pronoun", null, 0, 1, ObjectAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getObjectAttribute_Modifiers(), ecorePackage.getEString(), "modifiers", null, 0, -1, ObjectAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wordListEClass, WordList.class, "WordList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWordList_Words(), this.getWord(), null, "words", null, 0, -1, WordList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeListEClass, AttributeList.class, "AttributeList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttributeList_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, AttributeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pronounsEClass, Pronouns.class, "Pronouns", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPronouns_Value(), ecorePackage.getEString(), "value", null, 0, 1, Pronouns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pronounIdentifierEClass, PronounIdentifier.class, "PronounIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPronounIdentifier_Name(), ecorePackage.getEString(), "name", null, 0, 1, PronounIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //TraceryPlusPlusPackageImpl
