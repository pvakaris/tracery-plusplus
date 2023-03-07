/*
 * generated by Xtext 2.30.0
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
			builder.put(grammarAccess.getDeclarationAccess().getAlternatives(), "rule__Declaration__Alternatives");
			builder.put(grammarAccess.getStoryAccess().getStoryAlternatives_3_0(), "rule__Story__StoryAlternatives_3_0");
			builder.put(grammarAccess.getListDeclarationAccess().getAlternatives_1(), "rule__ListDeclaration__Alternatives_1");
			builder.put(grammarAccess.getAttributeAccess().getAlternatives(), "rule__Attribute__Alternatives");
			builder.put(grammarAccess.getSeparatorAccess().getAlternatives(), "rule__Separator__Alternatives");
			builder.put(grammarAccess.getModifierAccess().getAlternatives(), "rule__Modifier__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getStoryAccess().getGroup(), "rule__Story__Group__0");
			builder.put(grammarAccess.getListDeclarationAccess().getGroup(), "rule__ListDeclaration__Group__0");
			builder.put(grammarAccess.getListDeclarationAccess().getGroup_1_0(), "rule__ListDeclaration__Group_1_0__0");
			builder.put(grammarAccess.getListDeclarationAccess().getGroup_1_1(), "rule__ListDeclaration__Group_1_1__0");
			builder.put(grammarAccess.getObjectDeclarationAccess().getGroup(), "rule__ObjectDeclaration__Group__0");
			builder.put(grammarAccess.getStoryVariableAccess().getGroup(), "rule__StoryVariable__Group__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup_1(), "rule__Attribute__Group_1__0");
			builder.put(grammarAccess.getObjectAttributeAccess().getGroup(), "rule__ObjectAttribute__Group__0");
			builder.put(grammarAccess.getWordListAccess().getGroup(), "rule__WordList__Group__0");
			builder.put(grammarAccess.getWordListAccess().getGroup_1(), "rule__WordList__Group_1__0");
			builder.put(grammarAccess.getAttributeListAccess().getGroup(), "rule__AttributeList__Group__0");
			builder.put(grammarAccess.getAttributeListAccess().getGroup_1(), "rule__AttributeList__Group_1__0");
			builder.put(grammarAccess.getModelAccess().getStatementsAssignment_0(), "rule__Model__StatementsAssignment_0");
			builder.put(grammarAccess.getModelAccess().getStoryAssignment_1(), "rule__Model__StoryAssignment_1");
			builder.put(grammarAccess.getStoryAccess().getStoryAssignment_3(), "rule__Story__StoryAssignment_3");
			builder.put(grammarAccess.getListDeclarationAccess().getStart_symbolAssignment_0(), "rule__ListDeclaration__Start_symbolAssignment_0");
			builder.put(grammarAccess.getListDeclarationAccess().getListAssignment_2(), "rule__ListDeclaration__ListAssignment_2");
			builder.put(grammarAccess.getObjectDeclarationAccess().getNameAssignment_0(), "rule__ObjectDeclaration__NameAssignment_0");
			builder.put(grammarAccess.getObjectDeclarationAccess().getAttributesAssignment_8(), "rule__ObjectDeclaration__AttributesAssignment_8");
			builder.put(grammarAccess.getWordAccess().getValueAssignment(), "rule__Word__ValueAssignment");
			builder.put(grammarAccess.getVariableAccess().getNameAssignment(), "rule__Variable__NameAssignment");
			builder.put(grammarAccess.getStoryVariableAccess().getVariableAssignment_0(), "rule__StoryVariable__VariableAssignment_0");
			builder.put(grammarAccess.getStoryVariableAccess().getModifiersAssignment_1(), "rule__StoryVariable__ModifiersAssignment_1");
			builder.put(grammarAccess.getAttributeAccess().getNameAssignment_0(), "rule__Attribute__NameAssignment_0");
			builder.put(grammarAccess.getAttributeAccess().getNameAssignment_1_0(), "rule__Attribute__NameAssignment_1_0");
			builder.put(grammarAccess.getAttributeAccess().getValueAssignment_1_2(), "rule__Attribute__ValueAssignment_1_2");
			builder.put(grammarAccess.getObjectAttributeAccess().getObjectAssignment_0(), "rule__ObjectAttribute__ObjectAssignment_0");
			builder.put(grammarAccess.getObjectAttributeAccess().getAttributeAssignment_2(), "rule__ObjectAttribute__AttributeAssignment_2");
			builder.put(grammarAccess.getWordListAccess().getWordsAssignment_0(), "rule__WordList__WordsAssignment_0");
			builder.put(grammarAccess.getWordListAccess().getWordsAssignment_1_1(), "rule__WordList__WordsAssignment_1_1");
			builder.put(grammarAccess.getAttributeListAccess().getAttributesAssignment_0(), "rule__AttributeList__AttributesAssignment_0");
			builder.put(grammarAccess.getAttributeListAccess().getAttributesAssignment_1_1(), "rule__AttributeList__AttributesAssignment_1_1");
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
