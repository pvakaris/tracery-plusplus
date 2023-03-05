/*
 * generated by Xtext 2.29.0
 */
package uk.ac.kcl.inf.mdd.tracerypp.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import uk.ac.kcl.inf.mdd.tracerypp.ide.contentassist.antlr.internal.InternalTraceryPPParser;
import uk.ac.kcl.inf.mdd.tracerypp.services.TraceryPPGrammarAccess;

public class TraceryPPParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(TraceryPPGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, TraceryPPGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getDefinitionAccess().getAlternatives(), "rule__Definition__Alternatives");
			builder.put(grammarAccess.getStoryAccess().getStoryAlternatives_1_0(), "rule__Story__StoryAlternatives_1_0");
			builder.put(grammarAccess.getListDefinitionAccess().getAlternatives_1(), "rule__ListDefinition__Alternatives_1");
			builder.put(grammarAccess.getAttributeListAccess().getAttributesAlternatives_0_0(), "rule__AttributeList__AttributesAlternatives_0_0");
			builder.put(grammarAccess.getAttributeListAccess().getAttributeAlternatives_1_1_0(), "rule__AttributeList__AttributeAlternatives_1_1_0");
			builder.put(grammarAccess.getSeparatorAccess().getAlternatives(), "rule__Separator__Alternatives");
			builder.put(grammarAccess.getModifierAccess().getAlternatives(), "rule__Modifier__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getStoryAccess().getGroup(), "rule__Story__Group__0");
			builder.put(grammarAccess.getListDefinitionAccess().getGroup(), "rule__ListDefinition__Group__0");
			builder.put(grammarAccess.getObjectDefinitionAccess().getGroup(), "rule__ObjectDefinition__Group__0");
			builder.put(grammarAccess.getStoryVariableAccess().getGroup(), "rule__StoryVariable__Group__0");
			builder.put(grammarAccess.getAdvancedAttributeAccess().getGroup(), "rule__AdvancedAttribute__Group__0");
			builder.put(grammarAccess.getObjectAttributeAccess().getGroup(), "rule__ObjectAttribute__Group__0");
			builder.put(grammarAccess.getWordListAccess().getGroup(), "rule__WordList__Group__0");
			builder.put(grammarAccess.getWordListAccess().getGroup_1(), "rule__WordList__Group_1__0");
			builder.put(grammarAccess.getAttributeListAccess().getGroup(), "rule__AttributeList__Group__0");
			builder.put(grammarAccess.getAttributeListAccess().getGroup_1(), "rule__AttributeList__Group_1__0");
			builder.put(grammarAccess.getModelAccess().getStatementsAssignment_0(), "rule__Model__StatementsAssignment_0");
			builder.put(grammarAccess.getModelAccess().getStoryAssignment_1(), "rule__Model__StoryAssignment_1");
			builder.put(grammarAccess.getStoryAccess().getStoryAssignment_1(), "rule__Story__StoryAssignment_1");
			builder.put(grammarAccess.getListDefinitionAccess().getStart_symbolAssignment_0(), "rule__ListDefinition__Start_symbolAssignment_0");
			builder.put(grammarAccess.getListDefinitionAccess().getListAssignment_2(), "rule__ListDefinition__ListAssignment_2");
			builder.put(grammarAccess.getObjectDefinitionAccess().getObjectAssignment_0(), "rule__ObjectDefinition__ObjectAssignment_0");
			builder.put(grammarAccess.getObjectDefinitionAccess().getAttributesAssignment_3(), "rule__ObjectDefinition__AttributesAssignment_3");
			builder.put(grammarAccess.getWordAccess().getValueAssignment(), "rule__Word__ValueAssignment");
			builder.put(grammarAccess.getVariableAccess().getValueAssignment(), "rule__Variable__ValueAssignment");
			builder.put(grammarAccess.getStoryVariableAccess().getValueAssignment_0(), "rule__StoryVariable__ValueAssignment_0");
			builder.put(grammarAccess.getStoryVariableAccess().getModifiersAssignment_1(), "rule__StoryVariable__ModifiersAssignment_1");
			builder.put(grammarAccess.getAttributeAccess().getDefinitionAssignment(), "rule__Attribute__DefinitionAssignment");
			builder.put(grammarAccess.getAdvancedAttributeAccess().getDefinitionAssignment_0(), "rule__AdvancedAttribute__DefinitionAssignment_0");
			builder.put(grammarAccess.getAdvancedAttributeAccess().getValueAssignment_2(), "rule__AdvancedAttribute__ValueAssignment_2");
			builder.put(grammarAccess.getObjectAttributeAccess().getObjectAssignment_0(), "rule__ObjectAttribute__ObjectAssignment_0");
			builder.put(grammarAccess.getObjectAttributeAccess().getAttributeAssignment_2(), "rule__ObjectAttribute__AttributeAssignment_2");
			builder.put(grammarAccess.getWordListAccess().getWordsAssignment_0(), "rule__WordList__WordsAssignment_0");
			builder.put(grammarAccess.getWordListAccess().getSepAssignment_1_0(), "rule__WordList__SepAssignment_1_0");
			builder.put(grammarAccess.getWordListAccess().getWordAssignment_1_1(), "rule__WordList__WordAssignment_1_1");
			builder.put(grammarAccess.getAttributeListAccess().getAttributesAssignment_0(), "rule__AttributeList__AttributesAssignment_0");
			builder.put(grammarAccess.getAttributeListAccess().getSepAssignment_1_0(), "rule__AttributeList__SepAssignment_1_0");
			builder.put(grammarAccess.getAttributeListAccess().getAttributeAssignment_1_1(), "rule__AttributeList__AttributeAssignment_1_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private TraceryPPGrammarAccess grammarAccess;

	@Override
	protected InternalTraceryPPParser createParser() {
		InternalTraceryPPParser result = new InternalTraceryPPParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public TraceryPPGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TraceryPPGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
