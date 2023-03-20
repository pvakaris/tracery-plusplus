/*
 * generated by Xtext 2.30.0
 */
package tracerypp.validation

import org.eclipse.xtext.validation.Check
import tracerypp.traceryPlusPlus.ObjectDeclaration
import tracerypp.traceryPlusPlus.Attribute
import tracerypp.traceryPlusPlus.NameExistingListAttribute
import tracerypp.traceryPlusPlus.NameValueAttribute
import tracerypp.traceryPlusPlus.ListDeclaration
import tracerypp.traceryPlusPlus.Variable
import tracerypp.traceryPlusPlus.SubstoryDeclaration
import tracerypp.traceryPlusPlus.ModifierList
import tracerypp.traceryPlusPlus.TraceryPlusPlusPackage

/**
 * This class contains custom validation rules. 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 * 
 * Author: Vakaris Paulavicius
 * Version 1.1
 */
class TraceryPlusPlusValidator extends AbstractTraceryPlusPlusValidator {

	/*
	 * The variable name 'story' is reserved and thus cannot be specified as any variable name
	 */
	@Check
	def disallowStoryName(Variable variable) {
	    if (variable.name == "story") {
	    	error("The name 'story' is reserved and cannot be used as a variable name.", null)
	    }
	}
	
	/*
	 * Check that there are no identical variable names
	 */
	@Check
	def checkUniqueVariableName(Variable variable) {
	   val variableName = variable.name
	   val model = variable.eContainer().eContents.filter(Variable).toList
	   var count = 0
	   for (obj : model) {
	        if (obj.name == variableName) {
	            count += 1;
	            if (count > 1) {
	                error(getType(obj) + " with name '" + obj.name + "' already exists. Please choose other name.", variable, TraceryPlusPlusPackage.Literals.VARIABLE__NAME)
	            }
	        }
	   }
	}
	
	@Check
	def checkUniqueObjectName(ObjectDeclaration object) {
	    checkUniqueVariableName(object)
	}
	
	@Check
	def checkUniqueListName(ListDeclaration list) {
	    checkUniqueVariableName(list)
	}
	
	@Check
	def checkUniqueSubstoryName(SubstoryDeclaration substory) {
	    checkUniqueVariableName(substory)
	}
	
	/*
	 * Check that no two attributes defined for the same object have the same name
	 */
	@Check
	def checkUniqueObjectAttribute(ObjectDeclaration object) {
	   val objectAttributes = object.attributes.attributes
	   for (var i = 0; i < objectAttributes.size; i++) {
	      for (var j = i + 1; j < objectAttributes.size; j++) {
	         if (getAttributeName(objectAttributes.get(i)) == getAttributeName(objectAttributes.get(j))) {
	            error("Attribute '" + getAttributeName(objectAttributes.get(i)) + "' is used more than once when defining the object '" + object.name + "'.", objectAttributes.get(j), TraceryPlusPlusPackage.Literals.ATTRIBUTE__NAME)
	         }
	      }
	   }
	}
	
	
	
	/*
	 * Was used before because the structure for retrieving the attribute name was different for
	 * different ways of defining the attribute
	 */
	def getAttributeName(Attribute attribute) {
    	if(attribute instanceof NameExistingListAttribute) {
    		return attribute.name
    	}
    	else if(attribute instanceof NameValueAttribute) {
    		return attribute.name
    	}
//    	else if(attribute instanceof JustNameAttribute) {
//    		return attribute.name.name
//    	}
	}
	
	/*
	 * Used to get the text to be showed to the user when a mistake is detected defining a variable
	 */
	def getType(Variable obj) {
        switch (obj) {
	        ObjectDeclaration: return "Object"
	        ListDeclaration: return "List"
	        SubstoryDeclaration: return "Substory"
	        default: return "Variable"
    	}
	}
}
