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

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class TraceryPlusPlusValidator extends AbstractTraceryPlusPlusValidator {
  @Check
  public void checkUniqueObjectName(final ObjectDeclaration object) {
    final String objectName = object.getName();
    final List<ObjectDeclaration> model = IterableExtensions.<ObjectDeclaration>toList(Iterables.<ObjectDeclaration>filter(object.eContainer().eContents(), ObjectDeclaration.class));
    int count = 0;
    for (final ObjectDeclaration obj : model) {
      String _name = obj.getName();
      boolean _equals = Objects.equal(_name, objectName);
      if (_equals) {
        int _count = count;
        count = (_count + 1);
      }
    }
    if ((count > 1)) {
      this.error((("Object with name \'" + objectName) + "\' already exists."), null);
    }
  }

  @Check
  public void checkUniqueListName(final ListDeclaration list) {
    final String listName = list.getName();
    final List<ListDeclaration> model = IterableExtensions.<ListDeclaration>toList(Iterables.<ListDeclaration>filter(list.eContainer().eContents(), ListDeclaration.class));
    int count = 0;
    for (final ListDeclaration obj : model) {
      String _name = obj.getName();
      boolean _equals = Objects.equal(_name, listName);
      if (_equals) {
        int _count = count;
        count = (_count + 1);
      }
    }
    if ((count > 1)) {
      this.error((("List with name \'" + listName) + "\' already exists."), null);
    }
  }

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
          String _plus_1 = (_plus + "\' is used more than once.");
          this.error(_plus_1, null);
        }
      }
    }
  }

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
}
