/*
 * generated by Xtext 2.30.0
 */
package tracerypp.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import tracerypp.ide.contentassist.antlr.internal.InternalTraceryPlusPlusParser;
import tracerypp.services.TraceryPlusPlusGrammarAccess;

public class TraceryPlusPlusParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(TraceryPlusPlusGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, TraceryPlusPlusGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getDeclarationAccess().getAlternatives(), "rule__Declaration__Alternatives");
			builder.put(grammarAccess.getStoryAccess().getStoryAlternatives_4_0(), "rule__Story__StoryAlternatives_4_0");
			builder.put(grammarAccess.getListDeclarationAccess().getAlternatives_1(), "rule__ListDeclaration__Alternatives_1");
			builder.put(grammarAccess.getObjectDeclarationAccess().getAlternatives_1(), "rule__ObjectDeclaration__Alternatives_1");
			builder.put(grammarAccess.getObjectDeclarationAccess().getAlternatives_2(), "rule__ObjectDeclaration__Alternatives_2");
			builder.put(grammarAccess.getObjectDeclarationAccess().getAlternatives_5(), "rule__ObjectDeclaration__Alternatives_5");
			builder.put(grammarAccess.getAttributeAccess().getAlternatives(), "rule__Attribute__Alternatives");
			builder.put(grammarAccess.getNameExistingListAttributeAccess().getAlternatives_1(), "rule__NameExistingListAttribute__Alternatives_1");
			builder.put(grammarAccess.getObjectAttributeAccess().getAlternatives_0(), "rule__ObjectAttribute__Alternatives_0");
			builder.put(grammarAccess.getPronounsAccess().getAlternatives(), "rule__Pronouns__Alternatives");
			builder.put(grammarAccess.getPronounIdentifierAccess().getNameAlternatives_0(), "rule__PronounIdentifier__NameAlternatives_0");
			builder.put(grammarAccess.getModifierAccess().getAlternatives(), "rule__Modifier__Alternatives");
			builder.put(grammarAccess.getAssignmentOperatorAccess().getAlternatives(), "rule__AssignmentOperator__Alternatives");
			builder.put(grammarAccess.getSeparatorOrAccess().getAlternatives(), "rule__SeparatorOr__Alternatives");
			builder.put(grammarAccess.getSeparatorAndAccess().getAlternatives(), "rule__SeparatorAnd__Alternatives");
			builder.put(grammarAccess.getTraceryPlusPlusProgramAccess().getGroup(), "rule__TraceryPlusPlusProgram__Group__0");
			builder.put(grammarAccess.getStoryAccess().getGroup(), "rule__Story__Group__0");
			builder.put(grammarAccess.getListDeclarationAccess().getGroup(), "rule__ListDeclaration__Group__0");
			builder.put(grammarAccess.getListDeclarationAccess().getGroup_1_0(), "rule__ListDeclaration__Group_1_0__0");
			builder.put(grammarAccess.getListDeclarationAccess().getGroup_1_1(), "rule__ListDeclaration__Group_1_1__0");
			builder.put(grammarAccess.getListDeclarationAccess().getGroup_1_2(), "rule__ListDeclaration__Group_1_2__0");
			builder.put(grammarAccess.getObjectDeclarationAccess().getGroup(), "rule__ObjectDeclaration__Group__0");
			builder.put(grammarAccess.getStoryVariableAccess().getGroup(), "rule__StoryVariable__Group__0");
			builder.put(grammarAccess.getNameExistingListAttributeAccess().getGroup(), "rule__NameExistingListAttribute__Group__0");
			builder.put(grammarAccess.getNameValueAttributeAccess().getGroup(), "rule__NameValueAttribute__Group__0");
			builder.put(grammarAccess.getObjectAttributeAccess().getGroup(), "rule__ObjectAttribute__Group__0");
			builder.put(grammarAccess.getObjectAttributeAccess().getGroup_0_0(), "rule__ObjectAttribute__Group_0_0__0");
			builder.put(grammarAccess.getObjectAttributeAccess().getGroup_0_1(), "rule__ObjectAttribute__Group_0_1__0");
			builder.put(grammarAccess.getWordListAccess().getGroup(), "rule__WordList__Group__0");
			builder.put(grammarAccess.getWordListAccess().getGroup_1(), "rule__WordList__Group_1__0");
			builder.put(grammarAccess.getAttributeListAccess().getGroup(), "rule__AttributeList__Group__0");
			builder.put(grammarAccess.getAttributeListAccess().getGroup_1(), "rule__AttributeList__Group_1__0");
			builder.put(grammarAccess.getTraceryPlusPlusProgramAccess().getStatementsAssignment_0(), "rule__TraceryPlusPlusProgram__StatementsAssignment_0");
			builder.put(grammarAccess.getTraceryPlusPlusProgramAccess().getStoryAssignment_1(), "rule__TraceryPlusPlusProgram__StoryAssignment_1");
			builder.put(grammarAccess.getStoryAccess().getStoryAssignment_4(), "rule__Story__StoryAssignment_4");
			builder.put(grammarAccess.getListDeclarationAccess().getNameAssignment_0(), "rule__ListDeclaration__NameAssignment_0");
			builder.put(grammarAccess.getListDeclarationAccess().getListAssignment_3(), "rule__ListDeclaration__ListAssignment_3");
			builder.put(grammarAccess.getObjectDeclarationAccess().getNameAssignment_3(), "rule__ObjectDeclaration__NameAssignment_3");
			builder.put(grammarAccess.getObjectDeclarationAccess().getPronounsAssignment_4(), "rule__ObjectDeclaration__PronounsAssignment_4");
			builder.put(grammarAccess.getObjectDeclarationAccess().getAttributesAssignment_8(), "rule__ObjectDeclaration__AttributesAssignment_8");
			builder.put(grammarAccess.getWordAccess().getValueAssignment(), "rule__Word__ValueAssignment");
			builder.put(grammarAccess.getVariableAccess().getNameAssignment(), "rule__Variable__NameAssignment");
			builder.put(grammarAccess.getStoryVariableAccess().getVariableAssignment_0(), "rule__StoryVariable__VariableAssignment_0");
			builder.put(grammarAccess.getStoryVariableAccess().getModifiersAssignment_1(), "rule__StoryVariable__ModifiersAssignment_1");
			builder.put(grammarAccess.getExistingVariableAccess().getPointerAssignment(), "rule__ExistingVariable__PointerAssignment");
			builder.put(grammarAccess.getJustNameAttributeAccess().getNameAssignment(), "rule__JustNameAttribute__NameAssignment");
			builder.put(grammarAccess.getNameExistingListAttributeAccess().getNameAssignment_0(), "rule__NameExistingListAttribute__NameAssignment_0");
			builder.put(grammarAccess.getNameExistingListAttributeAccess().getValueAssignment_2(), "rule__NameExistingListAttribute__ValueAssignment_2");
			builder.put(grammarAccess.getNameValueAttributeAccess().getNameAssignment_0(), "rule__NameValueAttribute__NameAssignment_0");
			builder.put(grammarAccess.getNameValueAttributeAccess().getValueAssignment_2(), "rule__NameValueAttribute__ValueAssignment_2");
			builder.put(grammarAccess.getObjectAttributeAccess().getObjectAssignment_0_0_0(), "rule__ObjectAttribute__ObjectAssignment_0_0_0");
			builder.put(grammarAccess.getObjectAttributeAccess().getAttributeAssignment_0_0_2(), "rule__ObjectAttribute__AttributeAssignment_0_0_2");
			builder.put(grammarAccess.getObjectAttributeAccess().getObjectAssignment_0_1_0(), "rule__ObjectAttribute__ObjectAssignment_0_1_0");
			builder.put(grammarAccess.getObjectAttributeAccess().getPronounAssignment_0_1_2(), "rule__ObjectAttribute__PronounAssignment_0_1_2");
			builder.put(grammarAccess.getObjectAttributeAccess().getModifiersAssignment_1(), "rule__ObjectAttribute__ModifiersAssignment_1");
			builder.put(grammarAccess.getWordListAccess().getWordsAssignment_0(), "rule__WordList__WordsAssignment_0");
			builder.put(grammarAccess.getWordListAccess().getWordsAssignment_1_1(), "rule__WordList__WordsAssignment_1_1");
			builder.put(grammarAccess.getAttributeListAccess().getAttributesAssignment_0(), "rule__AttributeList__AttributesAssignment_0");
			builder.put(grammarAccess.getAttributeListAccess().getAttributesAssignment_1_1(), "rule__AttributeList__AttributesAssignment_1_1");
			builder.put(grammarAccess.getPronounsAccess().getValueAssignment_0(), "rule__Pronouns__ValueAssignment_0");
			builder.put(grammarAccess.getPronounsAccess().getValueAssignment_1(), "rule__Pronouns__ValueAssignment_1");
			builder.put(grammarAccess.getPronounsAccess().getValueAssignment_2(), "rule__Pronouns__ValueAssignment_2");
			builder.put(grammarAccess.getPronounsAccess().getValueAssignment_3(), "rule__Pronouns__ValueAssignment_3");
			builder.put(grammarAccess.getPronounIdentifierAccess().getNameAssignment(), "rule__PronounIdentifier__NameAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private TraceryPlusPlusGrammarAccess grammarAccess;

	@Override
	protected InternalTraceryPlusPlusParser createParser() {
		InternalTraceryPlusPlusParser result = new InternalTraceryPlusPlusParser(null);
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

	public TraceryPlusPlusGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TraceryPlusPlusGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
