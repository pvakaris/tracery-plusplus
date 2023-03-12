/*
 * generated by Xtext 2.30.0
 */
package tracerypp.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import tracerypp.traceryPlusPlus.TraceryPlusPlusProgram
import tracerypp.traceryPlusPlus.ListDeclaration
import tracerypp.traceryPlusPlus.Word
import tracerypp.traceryPlusPlus.ObjectAttribute
import tracerypp.traceryPlusPlus.ObjectDeclaration
import java.util.List
import tracerypp.traceryPlusPlus.Statement
import tracerypp.traceryPlusPlus.Attribute
import tracerypp.traceryPlusPlus.NameExistingListAttribute
import tracerypp.traceryPlusPlus.NameValueAttribute
import tracerypp.traceryPlusPlus.Pronouns
import tracerypp.traceryPlusPlus.Variable
import tracerypp.traceryPlusPlus.ListUse
import tracerypp.traceryPlusPlus.ObjectUse
import tracerypp.traceryPlusPlus.ObjectPronoun

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class TraceryPlusPlusGenerator extends AbstractGenerator {

	// File generation method
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var model = resource.contents.head as TraceryPlusPlusProgram
		fsa.generateFile(deriveTargetFilenameFor(model, resource), model.generate)
	}
	
	// Specify the generated file name	
	def deriveTargetFilenameFor(TraceryPlusPlusProgram program, Resource resource) {
		// TraceryPlusPlusProgram and Resource are imported for future use
		return 'translated_tracerypp_grammar.json'
	}
	
	
	// Generate the content of the file
	def CharSequence generate(TraceryPlusPlusProgram program) {
		// A JSON object
		return '''
			{
				«program.statements.filter(Variable).map[generateJsonDeclaration].join('\n')»
				"story": ["«program.story.story.map[generateJsonStoryEntry].join("")»"],
				"origin": ["#«FOR entry : getObjectDeclarationSetters(program.statements) »[#«entry»#]«ENDFOR»story#"]
			}
		'''
	}
	
	// Get setter names for all objects to be used in "origin"
	def getObjectDeclarationSetters(List<Statement> statements) {
		var objectDeclarations = statements.filter(Variable).filter(ObjectDeclaration)
		val setters = objectDeclarations.map[declaration | 
		    val name = declaration.name.toString
		    "set" + name.substring(0, 1).toUpperCase() + name.substring(1)
		]
		return setters
	}
	
	dispatch def generateJsonStoryEntry(ObjectUse object) {
		val objectName = object.object.name
		if(object instanceof ObjectAttribute) {
			val attribute = getAttributeName(object.attribute)
			return '''#«objectName + attribute.substring(0, 1).toUpperCase() + attribute.substring(1)»« FOR mod : object.modifiers »« mod »« ENDFOR »#'''
		}
		else if(object instanceof ObjectPronoun) {
			val attribute = object.pronoun.name
			return '''#«objectName + attribute.substring(0, 1).toUpperCase() + attribute.substring(1)»« FOR mod : object.modifiers »« mod »« ENDFOR »#'''
		}
		
	}	
	
	// Retrieve the plain string value
	dispatch def generateJsonStoryEntry(Word word) {
		return '''«word.value»'''
	}
	
	// Generates reference to an attribute and adds specified modifiers
	dispatch def generateJsonStoryEntry(ListUse storyVariable) {
		return '''#«storyVariable.variable.name»« FOR mod : storyVariable.modifiers »« mod »« ENDFOR »#'''
	}
	
	// Get lists with attributes
	dispatch def generateJsonDeclaration(ListDeclaration listDeclaration) {
		return '''"«listDeclaration.name»": [« FOR word : listDeclaration.list.words SEPARATOR ', ' »"« word.value »"« ENDFOR »],'''
	}
	
	// Get object specification
	dispatch def generateJsonDeclaration(ObjectDeclaration objectDeclaration) {
		// If the object was called "hero", generate a name "setHero"
		val name = objectDeclaration.name.toString
		val setter = "set" + name.substring(0, 1).toUpperCase() + name.substring(1)
		val pronouns = matchPronouns(objectDeclaration.pronouns, name)
		
		return '''"«setter»": ["« FOR attribute : objectDeclaration.attributes.attributes »« getStringForAttribute(attribute, name) »« ENDFOR »«pronouns»"],'''
	}
	
	
	def getStringForAttribute(Attribute attribute, String objectName) {
    	if (attribute instanceof NameValueAttribute) {
    		// Example: hero has attributes - name = "John
    		// This will give ---> [heroName:John]
    		val variableName = attribute.name
    		return '''[«objectName + variableName.substring(0, 1).toUpperCase() + variableName.substring(1)»:«attribute.value.value»]'''
    	}
//    	else if(attribute instanceof JustNameAttribute) {
//    		// Example: hero has attributes - occupation
//    		// This will give ---> [heroOccupation:#occupation#]
//    		val variableName = attribute.name.name
//    		return '''[«objectName + variableName.substring(0, 1).toUpperCase() + variableName.substring(1)»:#«variableName»#]'''
//    	}
    	else if(attribute instanceof NameExistingListAttribute) {
    		// Example: hero has attributes - name = princeNames
    		// This will give ---> [heroName:#princeNames#]
    		val variableName = attribute.name
    		val list = attribute.value
    		return '''[«objectName + variableName.substring(0, 1).toUpperCase() + variableName.substring(1)»:#«list.name»#]'''
    	}
    	else {
    		// This place should never be reached
    		return ''''''
    	}
	}
	
	// The default text for Declaration
	dispatch def generateJsonDeclaration(Variable listDeclaration) ''''''
	
	def getAttributeName(Attribute attribute) {
    	if(attribute instanceof NameExistingListAttribute) {
    		return attribute.name
    	}
    	else if(attribute instanceof NameValueAttribute) {
    		return attribute.name
    	}
//    	else if (attribute instanceof JustNameAttribute) {
//    		return attribute.pointer.name
//    	}
	}
	
	// Method to match the pronouns
	def matchPronouns(Pronouns pronouns, String name) {
		val value = pronouns.value
		if (value == "He") {
			return "[" + name + "They:he][" + name + "Them:him][" + name + "Their:his][" + name + "Theirs:his]"
		}
		else if (value == "She") {
			return "[" + name + "They:she][" + name + "Them:her][" + name + "Their:her][" + name + "Theirs:hers]"
		}
		else if (value == "It") {
			return "[" + name + "They:it][" + name + "Them:it][" + name + "Their:its][" + name + "Theirs:its]"
		}
		else if (value == "They") {
			return "[" + name + "They:they][" + name + "Them:them][" + name + "Their:their][" + name + "Theirs:theirs]"
		}
		else {
			return "unknown"
		}
	}
	
//	// Method to match the pronouns
//	def matchPronouns(Pronouns pronouns, String name) {
//		val value = pronouns.value
//		val pronounMap = #{ 
//		  "He" -> "[" + name + "They:he][" + name + "Them:him][" + name + "Their:his][" + name + "Theirs:his]", 
//		  "She" -> "[" + name + "They:she][" + name + "Them:her][" + name + "Their:her][" + name + "Theirs:hers]", 
//		  "It" -> "[" + name + "They:it][" + name + "Them:it][" + name + "Their:its][" + name + "Theirs:its]",
//		  "They" -> "[" + name + "They:they][" + name + "Them:them][" + name + "Their:their][" + name + "Theirs:theirs]"
//		}
//		return pronounMap.getOrElse(value, "unknown")
//		
//	}
}
