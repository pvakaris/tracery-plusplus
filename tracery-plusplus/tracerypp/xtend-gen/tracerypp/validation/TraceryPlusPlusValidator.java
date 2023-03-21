/**
 * generated by Xtext 2.30.0
 */
package tracerypp.validation;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import tracerypp.traceryPlusPlus.Attribute;
import tracerypp.traceryPlusPlus.ListDeclaration;
import tracerypp.traceryPlusPlus.Modifier;
import tracerypp.traceryPlusPlus.ModifierList;
import tracerypp.traceryPlusPlus.NameExistingListAttribute;
import tracerypp.traceryPlusPlus.NameValueAttribute;
import tracerypp.traceryPlusPlus.ObjectDeclaration;
import tracerypp.traceryPlusPlus.Story;
import tracerypp.traceryPlusPlus.SubstoryDeclaration;
import tracerypp.traceryPlusPlus.TraceryPlusPlusPackage;
import tracerypp.traceryPlusPlus.TraceryPlusPlusProgram;
import tracerypp.traceryPlusPlus.Variable;

/**
 * This class contains custom validation rules.
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 * 
 * Author: Vakaris Paulavicius
 * Version 1.1
 */
@SuppressWarnings("all")
public class TraceryPlusPlusValidator extends AbstractTraceryPlusPlusValidator {
  /**
   * The variable name 'story' is reserved and thus cannot be specified as any variable name
   */
  @Check
  public void disallowStoryName(final Variable variable) {
    String _name = variable.getName();
    boolean _equals = Objects.equal(_name, "story");
    if (_equals) {
      this.error("The name \'story\' is reserved and cannot be used as a variable name.", null);
    }
  }

  /**
   * Check that there are no identical variable names
   */
  @Check
  public void checkUniqueVariableName(final TraceryPlusPlusProgram program) {
    final Iterable<Variable> variables = Iterables.<Variable>filter(program.getStatements(), Variable.class);
    for (int i = 0; (i < IterableExtensions.size(variables)); i++) {
      for (int j = (i + 1); (j < IterableExtensions.size(variables)); j++) {
        String _name = (((Variable[])Conversions.unwrapArray(variables, Variable.class))[i]).getName();
        String _name_1 = (((Variable[])Conversions.unwrapArray(variables, Variable.class))[j]).getName();
        boolean _equals = Objects.equal(_name, _name_1);
        if (_equals) {
          final Variable obj = ((Variable[])Conversions.unwrapArray(variables, Variable.class))[i];
          String _type = this.getType(obj);
          String _plus = (_type + " with name \'");
          String _name_2 = obj.getName();
          String _plus_1 = (_plus + _name_2);
          String _plus_2 = (_plus_1 + "\' already exists. Please choose other name.");
          this.error(_plus_2, ((EObject[])Conversions.unwrapArray(variables, EObject.class))[j], 
            TraceryPlusPlusPackage.Literals.VARIABLE__NAME);
        }
      }
    }
  }

  /**
   * Check that no two attributes defined for the same object have the same name
   */
  @Check
  public void checkUniqueObjectAttribute(final ObjectDeclaration object) {
    final EList<Attribute> objectAttributes = object.getAttributes().getAttributes();
    for (int i = 0; (i < objectAttributes.size()); i++) {
      for (int j = (i + 1); (j < objectAttributes.size()); j++) {
        String _attributeName = this.getAttributeName(objectAttributes.get(i));
        String _attributeName_1 = this.getAttributeName(objectAttributes.get(j));
        boolean _equals = Objects.equal(_attributeName, _attributeName_1);
        if (_equals) {
          String _attributeName_2 = this.getAttributeName(objectAttributes.get(i));
          String _plus = ("Attribute \'" + _attributeName_2);
          String _plus_1 = (_plus + "\' is used more than once when defining the object \'");
          String _name = object.getName();
          String _plus_2 = (_plus_1 + _name);
          String _plus_3 = (_plus_2 + "\'.");
          this.error(_plus_3, objectAttributes.get(j), TraceryPlusPlusPackage.Literals.ATTRIBUTE__NAME);
        }
      }
    }
  }

  @Check
  public void checkDuplicateModifiers(final ModifierList modifiers) {
    final EList<Modifier> mods = modifiers.getModifiers();
    for (int i = 0; (i < mods.size()); i++) {
      for (int j = (i + 1); (j < mods.size()); j++) {
        Modifier _get = mods.get(i);
        Modifier _get_1 = mods.get(j);
        boolean _equals = Objects.equal(_get, _get_1);
        if (_equals) {
          Modifier _get_2 = mods.get(i);
          String _plus = ("Modifier \'" + _get_2);
          String _plus_1 = (_plus + "\' is used more than once.");
          this.error(_plus_1, null);
        }
      }
    }
  }

  /**
   * Validation rule to check if the story is defined. The Story is left optional with the purpose to provide a better
   * message to the user
   */
  @Check(CheckType.NORMAL)
  public void checkIfStoryIsDefined(final TraceryPlusPlusProgram program) {
    Story _story = program.getStory();
    boolean _tripleEquals = (_story == null);
    if (_tripleEquals) {
      this.warning("Define your story. This can be done by writing \'The story\'", program.getStory(), TraceryPlusPlusPackage.Literals.TRACERY_PLUS_PLUS_PROGRAM__STORY);
    }
  }

  /**
   * Was used before because the structure for retrieving the attribute name was different for
   * different ways of defining the attribute
   */
  private String getAttributeName(final Attribute attribute) {
    if ((attribute instanceof NameExistingListAttribute)) {
      return ((NameExistingListAttribute)attribute).getName();
    } else {
      if ((attribute instanceof NameValueAttribute)) {
        return ((NameValueAttribute)attribute).getName();
      }
    }
    return null;
  }

  /**
   * Used to get the text to be showed to the user when a mistake is detected defining a variable
   */
  private String getType(final Variable obj) {
    boolean _matched = false;
    if (obj instanceof ObjectDeclaration) {
      _matched=true;
      return "Object";
    }
    if (!_matched) {
      if (obj instanceof ListDeclaration) {
        _matched=true;
        return "List";
      }
    }
    if (!_matched) {
      if (obj instanceof SubstoryDeclaration) {
        _matched=true;
        return "Substory";
      }
    }
    return "Variable";
  }
}
