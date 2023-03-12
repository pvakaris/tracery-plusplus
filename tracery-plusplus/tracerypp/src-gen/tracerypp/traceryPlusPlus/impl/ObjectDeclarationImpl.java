/**
 * generated by Xtext 2.30.0
 */
package tracerypp.traceryPlusPlus.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tracerypp.traceryPlusPlus.AttributeList;
import tracerypp.traceryPlusPlus.ObjectDeclaration;
import tracerypp.traceryPlusPlus.Pronouns;
import tracerypp.traceryPlusPlus.TraceryPlusPlusPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tracerypp.traceryPlusPlus.impl.ObjectDeclarationImpl#getPronouns <em>Pronouns</em>}</li>
 *   <li>{@link tracerypp.traceryPlusPlus.impl.ObjectDeclarationImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectDeclarationImpl extends VariableImpl implements ObjectDeclaration
{
  /**
   * The cached value of the '{@link #getPronouns() <em>Pronouns</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPronouns()
   * @generated
   * @ordered
   */
  protected Pronouns pronouns;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected AttributeList attributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectDeclarationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TraceryPlusPlusPackage.Literals.OBJECT_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Pronouns getPronouns()
  {
    return pronouns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPronouns(Pronouns newPronouns, NotificationChain msgs)
  {
    Pronouns oldPronouns = pronouns;
    pronouns = newPronouns;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TraceryPlusPlusPackage.OBJECT_DECLARATION__PRONOUNS, oldPronouns, newPronouns);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPronouns(Pronouns newPronouns)
  {
    if (newPronouns != pronouns)
    {
      NotificationChain msgs = null;
      if (pronouns != null)
        msgs = ((InternalEObject)pronouns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TraceryPlusPlusPackage.OBJECT_DECLARATION__PRONOUNS, null, msgs);
      if (newPronouns != null)
        msgs = ((InternalEObject)newPronouns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TraceryPlusPlusPackage.OBJECT_DECLARATION__PRONOUNS, null, msgs);
      msgs = basicSetPronouns(newPronouns, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TraceryPlusPlusPackage.OBJECT_DECLARATION__PRONOUNS, newPronouns, newPronouns));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AttributeList getAttributes()
  {
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttributes(AttributeList newAttributes, NotificationChain msgs)
  {
    AttributeList oldAttributes = attributes;
    attributes = newAttributes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TraceryPlusPlusPackage.OBJECT_DECLARATION__ATTRIBUTES, oldAttributes, newAttributes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAttributes(AttributeList newAttributes)
  {
    if (newAttributes != attributes)
    {
      NotificationChain msgs = null;
      if (attributes != null)
        msgs = ((InternalEObject)attributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TraceryPlusPlusPackage.OBJECT_DECLARATION__ATTRIBUTES, null, msgs);
      if (newAttributes != null)
        msgs = ((InternalEObject)newAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TraceryPlusPlusPackage.OBJECT_DECLARATION__ATTRIBUTES, null, msgs);
      msgs = basicSetAttributes(newAttributes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TraceryPlusPlusPackage.OBJECT_DECLARATION__ATTRIBUTES, newAttributes, newAttributes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TraceryPlusPlusPackage.OBJECT_DECLARATION__PRONOUNS:
        return basicSetPronouns(null, msgs);
      case TraceryPlusPlusPackage.OBJECT_DECLARATION__ATTRIBUTES:
        return basicSetAttributes(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TraceryPlusPlusPackage.OBJECT_DECLARATION__PRONOUNS:
        return getPronouns();
      case TraceryPlusPlusPackage.OBJECT_DECLARATION__ATTRIBUTES:
        return getAttributes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TraceryPlusPlusPackage.OBJECT_DECLARATION__PRONOUNS:
        setPronouns((Pronouns)newValue);
        return;
      case TraceryPlusPlusPackage.OBJECT_DECLARATION__ATTRIBUTES:
        setAttributes((AttributeList)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TraceryPlusPlusPackage.OBJECT_DECLARATION__PRONOUNS:
        setPronouns((Pronouns)null);
        return;
      case TraceryPlusPlusPackage.OBJECT_DECLARATION__ATTRIBUTES:
        setAttributes((AttributeList)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TraceryPlusPlusPackage.OBJECT_DECLARATION__PRONOUNS:
        return pronouns != null;
      case TraceryPlusPlusPackage.OBJECT_DECLARATION__ATTRIBUTES:
        return attributes != null;
    }
    return super.eIsSet(featureID);
  }

} //ObjectDeclarationImpl
