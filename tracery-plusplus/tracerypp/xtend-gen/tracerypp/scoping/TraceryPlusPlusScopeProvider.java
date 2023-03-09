/**
 * generated by Xtext 2.30.0
 */
package tracerypp.scoping;

import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import tracerypp.traceryPlusPlus.Attribute;
import tracerypp.traceryPlusPlus.ExistingVariable;
import tracerypp.traceryPlusPlus.ObjectAttribute;
import tracerypp.traceryPlusPlus.ObjectDeclaration;
import tracerypp.traceryPlusPlus.Variable;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class TraceryPlusPlusScopeProvider extends AbstractDeclarativeScopeProvider {
  public IScope scope_ObjectAttribute_attribute(final ObjectAttribute context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final ObjectDeclaration objectDeclaration = context.getObject();
      IScope _xifexpression = null;
      if ((objectDeclaration != null)) {
        IScope _xblockexpression_1 = null;
        {
          final EList<Attribute> attributeContainer = objectDeclaration.getAttributes().getAttributes();
          final ArrayList<Variable> list = CollectionLiterals.<Variable>newArrayList();
          for (final Attribute attribute : attributeContainer) {
            {
              final EObject variable = attribute.getName();
              if ((variable instanceof Variable)) {
                list.add(((Variable)variable));
              } else {
                if ((variable instanceof ExistingVariable)) {
                  list.add(((ExistingVariable)variable).getPointer());
                }
              }
            }
          }
          _xblockexpression_1 = Scopes.scopeFor(list);
        }
        _xifexpression = _xblockexpression_1;
      } else {
        _xifexpression = IScope.NULLSCOPE;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
