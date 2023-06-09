/*
 * generated by Xtext 2.30.0
 */
package tracerypp.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import tracerypp.services.TraceryPlusPlusGrammarAccess;

@SuppressWarnings("all")
public class TraceryPlusPlusSyntacticSequencer extends AbstractSyntacticSequencer {

	protected TraceryPlusPlusGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ListDeclaration_AssignmentOperatorParserRuleCall_2_q;
	protected AbstractElementAlias match_ListDeclaration___CanKeyword_1_0_0_HaveKeyword_1_0_1_ValuesKeyword_1_0_2___or___CanKeyword_1_1_0_BeKeyword_1_1_1___or_____HasKeyword_1_2_0_0_or_HaveKeyword_1_2_0_1___ValuesKeyword_1_2_1__;
	protected AbstractElementAlias match_NameExistingListAttribute___AssignmentOperatorParserRuleCall_1_0_or_FromKeyword_1_1__q;
	protected AbstractElementAlias match_NameValueAttribute_AssignmentOperatorParserRuleCall_1_q;
	protected AbstractElementAlias match_ObjectDeclaration_AreKeyword_1_1_or_IsKeyword_1_0;
	protected AbstractElementAlias match_ObjectDeclaration_AssignmentOperatorParserRuleCall_7_q;
	protected AbstractElementAlias match_ObjectDeclaration_AttributesKeyword_6_q;
	protected AbstractElementAlias match_ObjectDeclaration_HasKeyword_5_0_or_HaveKeyword_5_1;
	protected AbstractElementAlias match_ObjectDeclaration___AKeyword_2_0_or_AnKeyword_2_1__q;
	protected AbstractElementAlias match_Story_AssignmentOperatorParserRuleCall_3_q;
	protected AbstractElementAlias match_SubstoryDeclaration_DefineKeyword_0_q;
	protected AbstractElementAlias match_SubstoryUse___SubKeyword_1_1_or_SubstoryKeyword_1_0__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (TraceryPlusPlusGrammarAccess) access;
		match_ListDeclaration_AssignmentOperatorParserRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getListDeclarationAccess().getAssignmentOperatorParserRuleCall_2());
		match_ListDeclaration___CanKeyword_1_0_0_HaveKeyword_1_0_1_ValuesKeyword_1_0_2___or___CanKeyword_1_1_0_BeKeyword_1_1_1___or_____HasKeyword_1_2_0_0_or_HaveKeyword_1_2_0_1___ValuesKeyword_1_2_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getListDeclarationAccess().getHasKeyword_1_2_0_0()), new TokenAlias(false, false, grammarAccess.getListDeclarationAccess().getHaveKeyword_1_2_0_1())), new TokenAlias(false, false, grammarAccess.getListDeclarationAccess().getValuesKeyword_1_2_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getListDeclarationAccess().getCanKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getListDeclarationAccess().getHaveKeyword_1_0_1()), new TokenAlias(false, false, grammarAccess.getListDeclarationAccess().getValuesKeyword_1_0_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getListDeclarationAccess().getCanKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getListDeclarationAccess().getBeKeyword_1_1_1())));
		match_NameExistingListAttribute___AssignmentOperatorParserRuleCall_1_0_or_FromKeyword_1_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getNameExistingListAttributeAccess().getAssignmentOperatorParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getNameExistingListAttributeAccess().getFromKeyword_1_1()));
		match_NameValueAttribute_AssignmentOperatorParserRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getNameValueAttributeAccess().getAssignmentOperatorParserRuleCall_1());
		match_ObjectDeclaration_AreKeyword_1_1_or_IsKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getObjectDeclarationAccess().getAreKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getObjectDeclarationAccess().getIsKeyword_1_0()));
		match_ObjectDeclaration_AssignmentOperatorParserRuleCall_7_q = new TokenAlias(false, true, grammarAccess.getObjectDeclarationAccess().getAssignmentOperatorParserRuleCall_7());
		match_ObjectDeclaration_AttributesKeyword_6_q = new TokenAlias(false, true, grammarAccess.getObjectDeclarationAccess().getAttributesKeyword_6());
		match_ObjectDeclaration_HasKeyword_5_0_or_HaveKeyword_5_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getObjectDeclarationAccess().getHasKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getObjectDeclarationAccess().getHaveKeyword_5_1()));
		match_ObjectDeclaration___AKeyword_2_0_or_AnKeyword_2_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getObjectDeclarationAccess().getAKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getObjectDeclarationAccess().getAnKeyword_2_1()));
		match_Story_AssignmentOperatorParserRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getStoryAccess().getAssignmentOperatorParserRuleCall_3());
		match_SubstoryDeclaration_DefineKeyword_0_q = new TokenAlias(false, true, grammarAccess.getSubstoryDeclarationAccess().getDefineKeyword_0());
		match_SubstoryUse___SubKeyword_1_1_or_SubstoryKeyword_1_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getSubstoryUseAccess().getSubKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getSubstoryUseAccess().getSubstoryKeyword_1_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getAssignmentOperatorRule())
			return getAssignmentOperatorToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSeparatorAndRule())
			return getSeparatorAndToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSeparatorOrRule())
			return getSeparatorOrToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * AssignmentOperator:
	 * 	"=" | ":" | "-" | "-->" | "is"? "equal" "to" | "is"
	 * ;
	 */
	protected String getAssignmentOperatorToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	/**
	 * SeparatorAnd:
	 * 	',' | "and" | "&&"
	 * ;
	 */
	protected String getSeparatorAndToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	
	/**
	 * SeparatorOr:
	 * 	"," | "or" | "||"
	 * ;
	 */
	protected String getSeparatorOrToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_ListDeclaration_AssignmentOperatorParserRuleCall_2_q.equals(syntax))
				emit_ListDeclaration_AssignmentOperatorParserRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ListDeclaration___CanKeyword_1_0_0_HaveKeyword_1_0_1_ValuesKeyword_1_0_2___or___CanKeyword_1_1_0_BeKeyword_1_1_1___or_____HasKeyword_1_2_0_0_or_HaveKeyword_1_2_0_1___ValuesKeyword_1_2_1__.equals(syntax))
				emit_ListDeclaration___CanKeyword_1_0_0_HaveKeyword_1_0_1_ValuesKeyword_1_0_2___or___CanKeyword_1_1_0_BeKeyword_1_1_1___or_____HasKeyword_1_2_0_0_or_HaveKeyword_1_2_0_1___ValuesKeyword_1_2_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NameExistingListAttribute___AssignmentOperatorParserRuleCall_1_0_or_FromKeyword_1_1__q.equals(syntax))
				emit_NameExistingListAttribute___AssignmentOperatorParserRuleCall_1_0_or_FromKeyword_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NameValueAttribute_AssignmentOperatorParserRuleCall_1_q.equals(syntax))
				emit_NameValueAttribute_AssignmentOperatorParserRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ObjectDeclaration_AreKeyword_1_1_or_IsKeyword_1_0.equals(syntax))
				emit_ObjectDeclaration_AreKeyword_1_1_or_IsKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ObjectDeclaration_AssignmentOperatorParserRuleCall_7_q.equals(syntax))
				emit_ObjectDeclaration_AssignmentOperatorParserRuleCall_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ObjectDeclaration_AttributesKeyword_6_q.equals(syntax))
				emit_ObjectDeclaration_AttributesKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ObjectDeclaration_HasKeyword_5_0_or_HaveKeyword_5_1.equals(syntax))
				emit_ObjectDeclaration_HasKeyword_5_0_or_HaveKeyword_5_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ObjectDeclaration___AKeyword_2_0_or_AnKeyword_2_1__q.equals(syntax))
				emit_ObjectDeclaration___AKeyword_2_0_or_AnKeyword_2_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Story_AssignmentOperatorParserRuleCall_3_q.equals(syntax))
				emit_Story_AssignmentOperatorParserRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SubstoryDeclaration_DefineKeyword_0_q.equals(syntax))
				emit_SubstoryDeclaration_DefineKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SubstoryUse___SubKeyword_1_1_or_SubstoryKeyword_1_0__q.equals(syntax))
				emit_SubstoryUse___SubKeyword_1_1_or_SubstoryKeyword_1_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     AssignmentOperator?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (('can' 'have' 'values') | ('can' 'be') | (('has' | 'have') 'values')) (ambiguity) list=WordList
	 
	 * </pre>
	 */
	protected void emit_ListDeclaration_AssignmentOperatorParserRuleCall_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('can' 'have' 'values') | ('can' 'be') | (('has' | 'have') 'values')
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) AssignmentOperator? list=WordList
	 
	 * </pre>
	 */
	protected void emit_ListDeclaration___CanKeyword_1_0_0_HaveKeyword_1_0_1_ValuesKeyword_1_0_2___or___CanKeyword_1_1_0_BeKeyword_1_1_1___or_____HasKeyword_1_2_0_0_or_HaveKeyword_1_2_0_1___ValuesKeyword_1_2_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (AssignmentOperator | 'from')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) value=[ListDeclaration|ID]
	 
	 * </pre>
	 */
	protected void emit_NameExistingListAttribute___AssignmentOperatorParserRuleCall_1_0_or_FromKeyword_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     AssignmentOperator?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) value=Word
	 
	 * </pre>
	 */
	protected void emit_NameValueAttribute_AssignmentOperatorParserRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'is' | 'are'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'There' (ambiguity) ('a' | 'an')? name=ID
	 
	 * </pre>
	 */
	protected void emit_ObjectDeclaration_AreKeyword_1_1_or_IsKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     AssignmentOperator?
	 *
	 * This ambiguous syntax occurs at:
	 *     pronouns=Pronouns ('has' | 'have') 'attributes'? (ambiguity) attributes=AttributeList
	 
	 * </pre>
	 */
	protected void emit_ObjectDeclaration_AssignmentOperatorParserRuleCall_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'attributes'?
	 *
	 * This ambiguous syntax occurs at:
	 *     pronouns=Pronouns ('has' | 'have') (ambiguity) AssignmentOperator? attributes=AttributeList
	 
	 * </pre>
	 */
	protected void emit_ObjectDeclaration_AttributesKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'has' | 'have'
	 *
	 * This ambiguous syntax occurs at:
	 *     pronouns=Pronouns (ambiguity) 'attributes'? AssignmentOperator? attributes=AttributeList
	 
	 * </pre>
	 */
	protected void emit_ObjectDeclaration_HasKeyword_5_0_or_HaveKeyword_5_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('a' | 'an')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'There' ('is' | 'are') (ambiguity) name=ID
	 
	 * </pre>
	 */
	protected void emit_ObjectDeclaration___AKeyword_2_0_or_AnKeyword_2_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     AssignmentOperator?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'The' 'story' (ambiguity) (rule start)
	 *     (rule start) 'The' 'story' (ambiguity) story+=VariableUse
	 *     (rule start) 'The' 'story' (ambiguity) story+=Word
	 
	 * </pre>
	 */
	protected void emit_Story_AssignmentOperatorParserRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'define'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'substory' name=ID
	 
	 * </pre>
	 */
	protected void emit_SubstoryDeclaration_DefineKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('substory' | 'sub')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'use' (ambiguity) variable=[SubstoryDeclaration|ID]
	 
	 * </pre>
	 */
	protected void emit_SubstoryUse___SubKeyword_1_1_or_SubstoryKeyword_1_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
