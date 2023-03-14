/**
 * generated by Xtext 2.30.0
 */
package tracerypp.validation;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import tracerypp.traceryPlusPlus.Attribute;
import tracerypp.traceryPlusPlus.ListDeclaration;
import tracerypp.traceryPlusPlus.NameExistingListAttribute;
import tracerypp.traceryPlusPlus.NameValueAttribute;
import tracerypp.traceryPlusPlus.ObjectDeclaration;
import tracerypp.traceryPlusPlus.SubstoryDeclaration;
import tracerypp.traceryPlusPlus.Variable;

/**
 * This class contains custom validation rules.
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 * 
 * Author: Vakaris Paulavicius
 * Version 1.0
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
  public void checkUniqueVariableName(final Variable variable) {
    final String variableName = variable.getName();
    final List<Variable> model = IterableExtensions.<Variable>toList(Iterables.<Variable>filter(variable.eContainer().eContents(), Variable.class));
    int count = 0;
    for (final Variable obj : model) {
      String _name = obj.getName();
      boolean _equals = Objects.equal(_name, variableName);
      if (_equals) {
        int _count = count;
        count = (_count + 1);
        if ((count > 1)) {
          String _type = this.getType(obj);
          String _plus = (_type + " with name \'");
          String _name_1 = obj.getName();
          String _plus_1 = (_plus + _name_1);
          String _plus_2 = (_plus_1 + "\' already exists. Please choose other name.");
          this.error(_plus_2, null);
        }
      }
    }
  }

  @Check
  public void checkUniqueObjectName(final ObjectDeclaration object) {
    this.checkUniqueVariableName(object);
  }

  @Check
  public void checkUniqueListName(final ListDeclaration list) {
    this.checkUniqueVariableName(list);
  }

  @Check
  public void checkUniqueSubstoryName(final SubstoryDeclaration substory) {
    this.checkUniqueVariableName(substory);
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
          this.error(_plus_3, null);
        }
      }
    }
  }

  /**
   * Was used before because the structure for retrieving the attribute name was different for
   * different ways of defining the attribute
   */
  public String getAttributeName(final Attribute attribute) {
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
  public String getType(final Variable obj) {
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
