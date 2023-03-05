/*
 * generated by Xtext 2.29.0
 */
package uk.ac.kcl.inf.mdd.tracerypp.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import uk.ac.kcl.inf.mdd.tracerypp.services.TraceryPPGrammarAccess;
import uk.ac.kcl.inf.mdd.tracerypp.traceryPP.AdvancedAttribute;
import uk.ac.kcl.inf.mdd.tracerypp.traceryPP.Attribute;
import uk.ac.kcl.inf.mdd.tracerypp.traceryPP.AttributeList;
import uk.ac.kcl.inf.mdd.tracerypp.traceryPP.ListDefinition;
import uk.ac.kcl.inf.mdd.tracerypp.traceryPP.Model;
import uk.ac.kcl.inf.mdd.tracerypp.traceryPP.ObjectAttribute;
import uk.ac.kcl.inf.mdd.tracerypp.traceryPP.ObjectDefinition;
import uk.ac.kcl.inf.mdd.tracerypp.traceryPP.Story;
import uk.ac.kcl.inf.mdd.tracerypp.traceryPP.StoryVariable;
import uk.ac.kcl.inf.mdd.tracerypp.traceryPP.TraceryPPPackage;
import uk.ac.kcl.inf.mdd.tracerypp.traceryPP.Variable;
import uk.ac.kcl.inf.mdd.tracerypp.traceryPP.Word;
import uk.ac.kcl.inf.mdd.tracerypp.traceryPP.WordList;

@SuppressWarnings("all")
public class TraceryPPSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TraceryPPGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == TraceryPPPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TraceryPPPackage.ADVANCED_ATTRIBUTE:
				sequence_AdvancedAttribute(context, (AdvancedAttribute) semanticObject); 
				return; 
			case TraceryPPPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case TraceryPPPackage.ATTRIBUTE_LIST:
				sequence_AttributeList(context, (AttributeList) semanticObject); 
				return; 
			case TraceryPPPackage.LIST_DEFINITION:
				sequence_ListDefinition(context, (ListDefinition) semanticObject); 
				return; 
			case TraceryPPPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case TraceryPPPackage.OBJECT_ATTRIBUTE:
				sequence_ObjectAttribute(context, (ObjectAttribute) semanticObject); 
				return; 
			case TraceryPPPackage.OBJECT_DEFINITION:
				sequence_ObjectDefinition(context, (ObjectDefinition) semanticObject); 
				return; 
			case TraceryPPPackage.STORY:
				sequence_Story(context, (Story) semanticObject); 
				return; 
			case TraceryPPPackage.STORY_VARIABLE:
				sequence_StoryVariable(context, (StoryVariable) semanticObject); 
				return; 
			case TraceryPPPackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			case TraceryPPPackage.WORD:
				sequence_Word(context, (Word) semanticObject); 
				return; 
			case TraceryPPPackage.WORD_LIST:
				sequence_WordList(context, (WordList) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     AdvancedAttribute returns AdvancedAttribute
	 *
	 * Constraint:
	 *     (definition=ID value=STRING)
	 * </pre>
	 */
	protected void sequence_AdvancedAttribute(ISerializationContext context, AdvancedAttribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TraceryPPPackage.Literals.ADVANCED_ATTRIBUTE__DEFINITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraceryPPPackage.Literals.ADVANCED_ATTRIBUTE__DEFINITION));
			if (transientValues.isValueTransient(semanticObject, TraceryPPPackage.Literals.ADVANCED_ATTRIBUTE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraceryPPPackage.Literals.ADVANCED_ATTRIBUTE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAdvancedAttributeAccess().getDefinitionIDTerminalRuleCall_0_0(), semanticObject.getDefinition());
		feeder.accept(grammarAccess.getAdvancedAttributeAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AttributeList returns AttributeList
	 *
	 * Constraint:
	 *     ((attributes+=Attribute | attributes+=AdvancedAttribute) (sep=Separator (attribute=Attribute | attribute=AdvancedAttribute))*)
	 * </pre>
	 */
	protected void sequence_AttributeList(ISerializationContext context, AttributeList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     definition=ID
	 * </pre>
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TraceryPPPackage.Literals.ATTRIBUTE__DEFINITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraceryPPPackage.Literals.ATTRIBUTE__DEFINITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeAccess().getDefinitionIDTerminalRuleCall_0(), semanticObject.getDefinition());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns ListDefinition
	 *     Definition returns ListDefinition
	 *     ListDefinition returns ListDefinition
	 *
	 * Constraint:
	 *     (start_symbol=Variable list=WordList)
	 * </pre>
	 */
	protected void sequence_ListDefinition(ISerializationContext context, ListDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TraceryPPPackage.Literals.LIST_DEFINITION__START_SYMBOL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraceryPPPackage.Literals.LIST_DEFINITION__START_SYMBOL));
			if (transientValues.isValueTransient(semanticObject, TraceryPPPackage.Literals.LIST_DEFINITION__LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraceryPPPackage.Literals.LIST_DEFINITION__LIST));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getListDefinitionAccess().getStart_symbolVariableParserRuleCall_0_0(), semanticObject.getStart_symbol());
		feeder.accept(grammarAccess.getListDefinitionAccess().getListWordListParserRuleCall_2_0(), semanticObject.getList());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (statements+=Statement* story=Story)
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ObjectAttribute returns ObjectAttribute
	 *
	 * Constraint:
	 *     (object=ID attribute=ID)
	 * </pre>
	 */
	protected void sequence_ObjectAttribute(ISerializationContext context, ObjectAttribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TraceryPPPackage.Literals.OBJECT_ATTRIBUTE__OBJECT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraceryPPPackage.Literals.OBJECT_ATTRIBUTE__OBJECT));
			if (transientValues.isValueTransient(semanticObject, TraceryPPPackage.Literals.OBJECT_ATTRIBUTE__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraceryPPPackage.Literals.OBJECT_ATTRIBUTE__ATTRIBUTE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getObjectAttributeAccess().getObjectIDTerminalRuleCall_0_0(), semanticObject.getObject());
		feeder.accept(grammarAccess.getObjectAttributeAccess().getAttributeIDTerminalRuleCall_2_0(), semanticObject.getAttribute());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns ObjectDefinition
	 *     Definition returns ObjectDefinition
	 *     ObjectDefinition returns ObjectDefinition
	 *
	 * Constraint:
	 *     (object=Variable attributes=AttributeList)
	 * </pre>
	 */
	protected void sequence_ObjectDefinition(ISerializationContext context, ObjectDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TraceryPPPackage.Literals.OBJECT_DEFINITION__OBJECT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraceryPPPackage.Literals.OBJECT_DEFINITION__OBJECT));
			if (transientValues.isValueTransient(semanticObject, TraceryPPPackage.Literals.OBJECT_DEFINITION__ATTRIBUTES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraceryPPPackage.Literals.OBJECT_DEFINITION__ATTRIBUTES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getObjectDefinitionAccess().getObjectVariableParserRuleCall_0_0(), semanticObject.getObject());
		feeder.accept(grammarAccess.getObjectDefinitionAccess().getAttributesAttributeListParserRuleCall_3_0(), semanticObject.getAttributes());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     StoryVariable returns StoryVariable
	 *
	 * Constraint:
	 *     (value=ID modifiers+=Modifier*)
	 * </pre>
	 */
	protected void sequence_StoryVariable(ISerializationContext context, StoryVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Story returns Story
	 *
	 * Constraint:
	 *     (story+=Word | story+=StoryVariable | story+=ObjectAttribute)+
	 * </pre>
	 */
	protected void sequence_Story(ISerializationContext context, Story semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     value=ID
	 * </pre>
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TraceryPPPackage.Literals.VARIABLE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraceryPPPackage.Literals.VARIABLE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableAccess().getValueIDTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     WordList returns WordList
	 *
	 * Constraint:
	 *     (words+=Word (sep=Separator word=Word)*)
	 * </pre>
	 */
	protected void sequence_WordList(ISerializationContext context, WordList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Word returns Word
	 *
	 * Constraint:
	 *     value=STRING
	 * </pre>
	 */
	protected void sequence_Word(ISerializationContext context, Word semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TraceryPPPackage.Literals.WORD__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TraceryPPPackage.Literals.WORD__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWordAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
}
