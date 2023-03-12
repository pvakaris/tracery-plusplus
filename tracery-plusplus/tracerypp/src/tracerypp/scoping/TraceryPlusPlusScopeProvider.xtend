/*
 * generated by Xtext 2.30.0
 */
package tracerypp.scoping
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.scoping.IScope
import org.eclipse.emf.ecore.EReference
import static org.eclipse.xtext.scoping.Scopes.*
import tracerypp.traceryPlusPlus.ObjectAttribute

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class TraceryPlusPlusScopeProvider extends AbstractDeclarativeScopeProvider {
	
	
	// Scope for accessing object attributes in the story
	def IScope scope_ObjectAttribute_attribute(ObjectAttribute context, EReference ref) {
        val objectDeclaration = context.object
        if (objectDeclaration !== null) {        	
        	scopeFor(objectDeclaration.attributes.attributes)
        }
        else {
            IScope.NULLSCOPE
        }
    }
	    
}