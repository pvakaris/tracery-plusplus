/*
 * generated by Xtext 2.29.0
 */
package uk.ac.kcl.inf.mdd.tracerypp.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import uk.ac.kcl.inf.mdd.tracerypp.services.TraceryPPGrammarAccess;

@SuppressWarnings("all")
public class TraceryPPSyntacticSequencer extends AbstractSyntacticSequencer {

	protected TraceryPPGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ListDefinition_CanBeKeyword_1_1_or_CanHaveValuesKeyword_1_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (TraceryPPGrammarAccess) access;
		match_ListDefinition_CanBeKeyword_1_1_or_CanHaveValuesKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getListDefinitionAccess().getCanBeKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getListDefinitionAccess().getCanHaveValuesKeyword_1_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_ListDefinition_CanBeKeyword_1_1_or_CanHaveValuesKeyword_1_0.equals(syntax))
				emit_ListDefinition_CanBeKeyword_1_1_or_CanHaveValuesKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ' can have values: ' | ' can be: '
	 *
	 * This ambiguous syntax occurs at:
	 *     start_symbol=Variable (ambiguity) list=List
	 
	 * </pre>
	 */
	protected void emit_ListDefinition_CanBeKeyword_1_1_or_CanHaveValuesKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
