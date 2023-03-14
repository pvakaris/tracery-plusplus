/*
 * generated by Xtext 2.30.0
 */
grammar InternalTraceryPlusPlus;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package tracerypp.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package tracerypp.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import tracerypp.services.TraceryPlusPlusGrammarAccess;

}

@parser::members {

 	private TraceryPlusPlusGrammarAccess grammarAccess;

    public InternalTraceryPlusPlusParser(TokenStream input, TraceryPlusPlusGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "TraceryPlusPlusProgram";
   	}

   	@Override
   	protected TraceryPlusPlusGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleTraceryPlusPlusProgram
entryRuleTraceryPlusPlusProgram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTraceryPlusPlusProgramRule()); }
	iv_ruleTraceryPlusPlusProgram=ruleTraceryPlusPlusProgram
	{ $current=$iv_ruleTraceryPlusPlusProgram.current; }
	EOF;

// Rule TraceryPlusPlusProgram
ruleTraceryPlusPlusProgram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getTraceryPlusPlusProgramAccess().getStatementsStatementParserRuleCall_0_0());
				}
				lv_statements_0_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTraceryPlusPlusProgramRule());
					}
					add(
						$current,
						"statements",
						lv_statements_0_0,
						"tracerypp.TraceryPlusPlus.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getTraceryPlusPlusProgramAccess().getStoryStoryParserRuleCall_1_0());
				}
				lv_story_1_0=ruleStory
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTraceryPlusPlusProgramRule());
					}
					set(
						$current,
						"story",
						lv_story_1_0,
						"tracerypp.TraceryPlusPlus.Story");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current; }
	EOF;

// Rule Statement
ruleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getStatementAccess().getVariableParserRuleCall());
	}
	this_Variable_0=ruleVariable
	{
		$current = $this_Variable_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleVariable
entryRuleVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	iv_ruleVariable=ruleVariable
	{ $current=$iv_ruleVariable.current; }
	EOF;

// Rule Variable
ruleVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getVariableAccess().getListDeclarationParserRuleCall_0());
		}
		this_ListDeclaration_0=ruleListDeclaration
		{
			$current = $this_ListDeclaration_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getVariableAccess().getObjectDeclarationParserRuleCall_1());
		}
		this_ObjectDeclaration_1=ruleObjectDeclaration
		{
			$current = $this_ObjectDeclaration_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getVariableAccess().getSubstoryDeclarationParserRuleCall_2());
		}
		this_SubstoryDeclaration_2=ruleSubstoryDeclaration
		{
			$current = $this_SubstoryDeclaration_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleVariableUse
entryRuleVariableUse returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableUseRule()); }
	iv_ruleVariableUse=ruleVariableUse
	{ $current=$iv_ruleVariableUse.current; }
	EOF;

// Rule VariableUse
ruleVariableUse returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getVariableUseAccess().getListUseParserRuleCall_0());
		}
		this_ListUse_0=ruleListUse
		{
			$current = $this_ListUse_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getVariableUseAccess().getObjectUseParserRuleCall_1());
		}
		this_ObjectUse_1=ruleObjectUse
		{
			$current = $this_ObjectUse_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getVariableUseAccess().getSubstoryUseParserRuleCall_2());
		}
		this_SubstoryUse_2=ruleSubstoryUse
		{
			$current = $this_SubstoryUse_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleStory
entryRuleStory returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStoryRule()); }
	iv_ruleStory=ruleStory
	{ $current=$iv_ruleStory.current; }
	EOF;

// Rule Story
ruleStory returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getStoryAccess().getStoryAction_0(),
					$current);
			}
		)
		otherlv_1='The'
		{
			newLeafNode(otherlv_1, grammarAccess.getStoryAccess().getTheKeyword_1());
		}
		otherlv_2='story'
		{
			newLeafNode(otherlv_2, grammarAccess.getStoryAccess().getStoryKeyword_2());
		}
		(
			{
				newCompositeNode(grammarAccess.getStoryAccess().getAssignmentOperatorParserRuleCall_3());
			}
			ruleAssignmentOperator
			{
				afterParserOrEnumRuleCall();
			}
		)?
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getStoryAccess().getStoryWordParserRuleCall_4_0_0());
					}
					lv_story_4_1=ruleWord
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStoryRule());
						}
						add(
							$current,
							"story",
							lv_story_4_1,
							"tracerypp.TraceryPlusPlus.Word");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getStoryAccess().getStoryVariableUseParserRuleCall_4_0_1());
					}
					lv_story_4_2=ruleVariableUse
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStoryRule());
						}
						add(
							$current,
							"story",
							lv_story_4_2,
							"tracerypp.TraceryPlusPlus.VariableUse");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleListDeclaration
entryRuleListDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getListDeclarationRule()); }
	iv_ruleListDeclaration=ruleListDeclaration
	{ $current=$iv_ruleListDeclaration.current; }
	EOF;

// Rule ListDeclaration
ruleListDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getListDeclarationAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getListDeclarationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				otherlv_1='can'
				{
					newLeafNode(otherlv_1, grammarAccess.getListDeclarationAccess().getCanKeyword_1_0_0());
				}
				otherlv_2='have'
				{
					newLeafNode(otherlv_2, grammarAccess.getListDeclarationAccess().getHaveKeyword_1_0_1());
				}
				otherlv_3='values'
				{
					newLeafNode(otherlv_3, grammarAccess.getListDeclarationAccess().getValuesKeyword_1_0_2());
				}
			)
			    |
			(
				otherlv_4='can'
				{
					newLeafNode(otherlv_4, grammarAccess.getListDeclarationAccess().getCanKeyword_1_1_0());
				}
				otherlv_5='be'
				{
					newLeafNode(otherlv_5, grammarAccess.getListDeclarationAccess().getBeKeyword_1_1_1());
				}
			)
			    |
			(
				(
					otherlv_6='has'
					{
						newLeafNode(otherlv_6, grammarAccess.getListDeclarationAccess().getHasKeyword_1_2_0_0());
					}
					    |
					otherlv_7='have'
					{
						newLeafNode(otherlv_7, grammarAccess.getListDeclarationAccess().getHaveKeyword_1_2_0_1());
					}
				)
				otherlv_8='values'
				{
					newLeafNode(otherlv_8, grammarAccess.getListDeclarationAccess().getValuesKeyword_1_2_1());
				}
			)
		)
		(
			{
				newCompositeNode(grammarAccess.getListDeclarationAccess().getAssignmentOperatorParserRuleCall_2());
			}
			ruleAssignmentOperator
			{
				afterParserOrEnumRuleCall();
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getListDeclarationAccess().getListWordListParserRuleCall_3_0());
				}
				lv_list_10_0=ruleWordList
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getListDeclarationRule());
					}
					set(
						$current,
						"list",
						lv_list_10_0,
						"tracerypp.TraceryPlusPlus.WordList");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleObjectDeclaration
entryRuleObjectDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getObjectDeclarationRule()); }
	iv_ruleObjectDeclaration=ruleObjectDeclaration
	{ $current=$iv_ruleObjectDeclaration.current; }
	EOF;

// Rule ObjectDeclaration
ruleObjectDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='There'
		{
			newLeafNode(otherlv_0, grammarAccess.getObjectDeclarationAccess().getThereKeyword_0());
		}
		(
			otherlv_1='is'
			{
				newLeafNode(otherlv_1, grammarAccess.getObjectDeclarationAccess().getIsKeyword_1_0());
			}
			    |
			otherlv_2='are'
			{
				newLeafNode(otherlv_2, grammarAccess.getObjectDeclarationAccess().getAreKeyword_1_1());
			}
		)
		(
			otherlv_3='a'
			{
				newLeafNode(otherlv_3, grammarAccess.getObjectDeclarationAccess().getAKeyword_2_0());
			}
			    |
			otherlv_4='an'
			{
				newLeafNode(otherlv_4, grammarAccess.getObjectDeclarationAccess().getAnKeyword_2_1());
			}
		)?
		(
			(
				lv_name_5_0=RULE_ID
				{
					newLeafNode(lv_name_5_0, grammarAccess.getObjectDeclarationAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObjectDeclarationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_5_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getObjectDeclarationAccess().getPronounsPronounsParserRuleCall_4_0());
				}
				lv_pronouns_6_0=rulePronouns
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getObjectDeclarationRule());
					}
					set(
						$current,
						"pronouns",
						lv_pronouns_6_0,
						"tracerypp.TraceryPlusPlus.Pronouns");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_7='has'
			{
				newLeafNode(otherlv_7, grammarAccess.getObjectDeclarationAccess().getHasKeyword_5_0());
			}
			    |
			otherlv_8='have'
			{
				newLeafNode(otherlv_8, grammarAccess.getObjectDeclarationAccess().getHaveKeyword_5_1());
			}
		)
		(
			otherlv_9='attributes'
			{
				newLeafNode(otherlv_9, grammarAccess.getObjectDeclarationAccess().getAttributesKeyword_6());
			}
		)?
		(
			{
				newCompositeNode(grammarAccess.getObjectDeclarationAccess().getAssignmentOperatorParserRuleCall_7());
			}
			ruleAssignmentOperator
			{
				afterParserOrEnumRuleCall();
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getObjectDeclarationAccess().getAttributesAttributeListParserRuleCall_8_0());
				}
				lv_attributes_11_0=ruleAttributeList
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getObjectDeclarationRule());
					}
					set(
						$current,
						"attributes",
						lv_attributes_11_0,
						"tracerypp.TraceryPlusPlus.AttributeList");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSubstoryDeclaration
entryRuleSubstoryDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSubstoryDeclarationRule()); }
	iv_ruleSubstoryDeclaration=ruleSubstoryDeclaration
	{ $current=$iv_ruleSubstoryDeclaration.current; }
	EOF;

// Rule SubstoryDeclaration
ruleSubstoryDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='define'
			{
				newLeafNode(otherlv_0, grammarAccess.getSubstoryDeclarationAccess().getDefineKeyword_0());
			}
		)?
		otherlv_1='substory'
		{
			newLeafNode(otherlv_1, grammarAccess.getSubstoryDeclarationAccess().getSubstoryKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getSubstoryDeclarationAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSubstoryDeclarationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getSubstoryDeclarationAccess().getColonKeyword_3());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getSubstoryDeclarationAccess().getStoryWordParserRuleCall_4_0_0());
					}
					lv_story_4_1=ruleWord
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSubstoryDeclarationRule());
						}
						add(
							$current,
							"story",
							lv_story_4_1,
							"tracerypp.TraceryPlusPlus.Word");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getSubstoryDeclarationAccess().getStoryVariableUseParserRuleCall_4_0_1());
					}
					lv_story_4_2=ruleVariableUse
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSubstoryDeclarationRule());
						}
						add(
							$current,
							"story",
							lv_story_4_2,
							"tracerypp.TraceryPlusPlus.VariableUse");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_5='end-substory'
		{
			newLeafNode(otherlv_5, grammarAccess.getSubstoryDeclarationAccess().getEndSubstoryKeyword_5());
		}
	)
;

// Entry rule entryRuleWord
entryRuleWord returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWordRule()); }
	iv_ruleWord=ruleWord
	{ $current=$iv_ruleWord.current; }
	EOF;

// Rule Word
ruleWord returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0=RULE_STRING
			{
				newLeafNode(lv_value_0_0, grammarAccess.getWordAccess().getValueSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getWordRule());
				}
				setWithLastConsumed(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
		)
	)
;

// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	iv_ruleAttribute=ruleAttribute
	{ $current=$iv_ruleAttribute.current; }
	EOF;

// Rule Attribute
ruleAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAttributeAccess().getNameExistingListAttributeParserRuleCall_0());
		}
		this_NameExistingListAttribute_0=ruleNameExistingListAttribute
		{
			$current = $this_NameExistingListAttribute_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAttributeAccess().getNameValueAttributeParserRuleCall_1());
		}
		this_NameValueAttribute_1=ruleNameValueAttribute
		{
			$current = $this_NameValueAttribute_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleNameExistingListAttribute
entryRuleNameExistingListAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNameExistingListAttributeRule()); }
	iv_ruleNameExistingListAttribute=ruleNameExistingListAttribute
	{ $current=$iv_ruleNameExistingListAttribute.current; }
	EOF;

// Rule NameExistingListAttribute
ruleNameExistingListAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getNameExistingListAttributeAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNameExistingListAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			{
				newCompositeNode(grammarAccess.getNameExistingListAttributeAccess().getAssignmentOperatorParserRuleCall_1_0());
			}
			ruleAssignmentOperator
			{
				afterParserOrEnumRuleCall();
			}
			    |
			otherlv_2='from'
			{
				newLeafNode(otherlv_2, grammarAccess.getNameExistingListAttributeAccess().getFromKeyword_1_1());
			}
		)?
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNameExistingListAttributeRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getNameExistingListAttributeAccess().getValueListDeclarationCrossReference_2_0());
				}
			)
		)
	)
;

// Entry rule entryRuleNameValueAttribute
entryRuleNameValueAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNameValueAttributeRule()); }
	iv_ruleNameValueAttribute=ruleNameValueAttribute
	{ $current=$iv_ruleNameValueAttribute.current; }
	EOF;

// Rule NameValueAttribute
ruleNameValueAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getNameValueAttributeAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNameValueAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			{
				newCompositeNode(grammarAccess.getNameValueAttributeAccess().getAssignmentOperatorParserRuleCall_1());
			}
			ruleAssignmentOperator
			{
				afterParserOrEnumRuleCall();
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getNameValueAttributeAccess().getValueWordParserRuleCall_2_0());
				}
				lv_value_2_0=ruleWord
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNameValueAttributeRule());
					}
					set(
						$current,
						"value",
						lv_value_2_0,
						"tracerypp.TraceryPlusPlus.Word");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleListUse
entryRuleListUse returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getListUseRule()); }
	iv_ruleListUse=ruleListUse
	{ $current=$iv_ruleListUse.current; }
	EOF;

// Rule ListUse
ruleListUse returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getListUseRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getListUseAccess().getVariableListDeclarationCrossReference_0_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getListUseAccess().getModifiersModifierListParserRuleCall_1_0());
				}
				lv_modifiers_1_0=ruleModifierList
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getListUseRule());
					}
					set(
						$current,
						"modifiers",
						lv_modifiers_1_0,
						"tracerypp.TraceryPlusPlus.ModifierList");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSubstoryUse
entryRuleSubstoryUse returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSubstoryUseRule()); }
	iv_ruleSubstoryUse=ruleSubstoryUse
	{ $current=$iv_ruleSubstoryUse.current; }
	EOF;

// Rule SubstoryUse
ruleSubstoryUse returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='use'
		{
			newLeafNode(otherlv_0, grammarAccess.getSubstoryUseAccess().getUseKeyword_0());
		}
		(
			otherlv_1='substory'
			{
				newLeafNode(otherlv_1, grammarAccess.getSubstoryUseAccess().getSubstoryKeyword_1_0());
			}
			    |
			otherlv_2='sub'
			{
				newLeafNode(otherlv_2, grammarAccess.getSubstoryUseAccess().getSubKeyword_1_1());
			}
		)?
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSubstoryUseRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getSubstoryUseAccess().getVariableSubstoryDeclarationCrossReference_2_0());
				}
			)
		)
	)
;

// Entry rule entryRuleObjectUse
entryRuleObjectUse returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getObjectUseRule()); }
	iv_ruleObjectUse=ruleObjectUse
	{ $current=$iv_ruleObjectUse.current; }
	EOF;

// Rule ObjectUse
ruleObjectUse returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getObjectUseAccess().getObjectAttributeParserRuleCall_0());
		}
		this_ObjectAttribute_0=ruleObjectAttribute
		{
			$current = $this_ObjectAttribute_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getObjectUseAccess().getObjectPronounParserRuleCall_1());
		}
		this_ObjectPronoun_1=ruleObjectPronoun
		{
			$current = $this_ObjectPronoun_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleObjectAttribute
entryRuleObjectAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getObjectAttributeRule()); }
	iv_ruleObjectAttribute=ruleObjectAttribute
	{ $current=$iv_ruleObjectAttribute.current; }
	EOF;

// Rule ObjectAttribute
ruleObjectAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObjectAttributeRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getObjectAttributeAccess().getObjectObjectDeclarationCrossReference_0_0());
				}
			)
		)
		otherlv_1='.'
		{
			newLeafNode(otherlv_1, grammarAccess.getObjectAttributeAccess().getFullStopKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObjectAttributeRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getObjectAttributeAccess().getAttributeAttributeCrossReference_2_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getObjectAttributeAccess().getModifiersModifierListParserRuleCall_3_0());
				}
				lv_modifiers_3_0=ruleModifierList
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getObjectAttributeRule());
					}
					set(
						$current,
						"modifiers",
						lv_modifiers_3_0,
						"tracerypp.TraceryPlusPlus.ModifierList");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleObjectPronoun
entryRuleObjectPronoun returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getObjectPronounRule()); }
	iv_ruleObjectPronoun=ruleObjectPronoun
	{ $current=$iv_ruleObjectPronoun.current; }
	EOF;

// Rule ObjectPronoun
ruleObjectPronoun returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObjectPronounRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getObjectPronounAccess().getObjectObjectDeclarationCrossReference_0_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getObjectPronounAccess().getPronounPronounIdentifierEnumRuleCall_1_0());
				}
				lv_pronoun_1_0=rulePronounIdentifier
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getObjectPronounRule());
					}
					set(
						$current,
						"pronoun",
						lv_pronoun_1_0,
						"tracerypp.TraceryPlusPlus.PronounIdentifier");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleWordList
entryRuleWordList returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWordListRule()); }
	iv_ruleWordList=ruleWordList
	{ $current=$iv_ruleWordList.current; }
	EOF;

// Rule WordList
ruleWordList returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getWordListAccess().getWordsWordParserRuleCall_0_0());
				}
				lv_words_0_0=ruleWord
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWordListRule());
					}
					add(
						$current,
						"words",
						lv_words_0_0,
						"tracerypp.TraceryPlusPlus.Word");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			{
				newCompositeNode(grammarAccess.getWordListAccess().getSeparatorOrParserRuleCall_1_0());
			}
			ruleSeparatorOr
			{
				afterParserOrEnumRuleCall();
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getWordListAccess().getWordsWordParserRuleCall_1_1_0());
					}
					lv_words_2_0=ruleWord
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getWordListRule());
						}
						add(
							$current,
							"words",
							lv_words_2_0,
							"tracerypp.TraceryPlusPlus.Word");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAttributeList
entryRuleAttributeList returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeListRule()); }
	iv_ruleAttributeList=ruleAttributeList
	{ $current=$iv_ruleAttributeList.current; }
	EOF;

// Rule AttributeList
ruleAttributeList returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_0_0());
				}
				lv_attributes_0_0=ruleAttribute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeListRule());
					}
					add(
						$current,
						"attributes",
						lv_attributes_0_0,
						"tracerypp.TraceryPlusPlus.Attribute");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			{
				newCompositeNode(grammarAccess.getAttributeListAccess().getSeparatorAndParserRuleCall_1_0());
			}
			ruleSeparatorAnd
			{
				afterParserOrEnumRuleCall();
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_1_1_0());
					}
					lv_attributes_2_0=ruleAttribute
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAttributeListRule());
						}
						add(
							$current,
							"attributes",
							lv_attributes_2_0,
							"tracerypp.TraceryPlusPlus.Attribute");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePronouns
entryRulePronouns returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPronounsRule()); }
	iv_rulePronouns=rulePronouns
	{ $current=$iv_rulePronouns.current; }
	EOF;

// Rule Pronouns
rulePronouns returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_value_0_1='He'
				{
					newLeafNode(lv_value_0_1, grammarAccess.getPronounsAccess().getValueHeKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPronounsRule());
					}
					setWithLastConsumed($current, "value", lv_value_0_1, null);
				}
				    |
				lv_value_0_2='She'
				{
					newLeafNode(lv_value_0_2, grammarAccess.getPronounsAccess().getValueSheKeyword_0_1());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPronounsRule());
					}
					setWithLastConsumed($current, "value", lv_value_0_2, null);
				}
				    |
				lv_value_0_3='It'
				{
					newLeafNode(lv_value_0_3, grammarAccess.getPronounsAccess().getValueItKeyword_0_2());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPronounsRule());
					}
					setWithLastConsumed($current, "value", lv_value_0_3, null);
				}
				    |
				lv_value_0_4='They'
				{
					newLeafNode(lv_value_0_4, grammarAccess.getPronounsAccess().getValueTheyKeyword_0_3());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPronounsRule());
					}
					setWithLastConsumed($current, "value", lv_value_0_4, null);
				}
			)
		)
	)
;

// Entry rule entryRuleModifierList
entryRuleModifierList returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModifierListRule()); }
	iv_ruleModifierList=ruleModifierList
	{ $current=$iv_ruleModifierList.current; }
	EOF;

// Rule ModifierList
ruleModifierList returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getModifierListAccess().getModifierListAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getModifierListAccess().getModifiersModifierEnumRuleCall_1_0());
				}
				lv_modifiers_1_0=ruleModifier
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModifierListRule());
					}
					add(
						$current,
						"modifiers",
						lv_modifiers_1_0,
						"tracerypp.TraceryPlusPlus.Modifier");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleAssignmentOperator
entryRuleAssignmentOperator returns [String current=null]:
	{ newCompositeNode(grammarAccess.getAssignmentOperatorRule()); }
	iv_ruleAssignmentOperator=ruleAssignmentOperator
	{ $current=$iv_ruleAssignmentOperator.current.getText(); }
	EOF;

// Rule AssignmentOperator
ruleAssignmentOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getEqualsSignKeyword_0());
		}
		    |
		kw=':'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getColonKeyword_1());
		}
		    |
		kw='-'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getHyphenMinusKeyword_2());
		}
		    |
		kw='-->'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_3());
		}
		    |
		(
			(
				kw='is'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getIsKeyword_4_0());
				}
			)?
			kw='equal'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getEqualKeyword_4_1());
			}
			kw='to'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getToKeyword_4_2());
			}
		)
		    |
		kw='is'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getIsKeyword_5());
		}
	)
;

// Entry rule entryRuleSeparatorOr
entryRuleSeparatorOr returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSeparatorOrRule()); }
	iv_ruleSeparatorOr=ruleSeparatorOr
	{ $current=$iv_ruleSeparatorOr.current.getText(); }
	EOF;

// Rule SeparatorOr
ruleSeparatorOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw=','
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getSeparatorOrAccess().getCommaKeyword_0());
		}
		    |
		kw='or'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getSeparatorOrAccess().getOrKeyword_1());
		}
		    |
		kw='||'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getSeparatorOrAccess().getVerticalLineVerticalLineKeyword_2());
		}
	)
;

// Entry rule entryRuleSeparatorAnd
entryRuleSeparatorAnd returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSeparatorAndRule()); }
	iv_ruleSeparatorAnd=ruleSeparatorAnd
	{ $current=$iv_ruleSeparatorAnd.current.getText(); }
	EOF;

// Rule SeparatorAnd
ruleSeparatorAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw=','
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getSeparatorAndAccess().getCommaKeyword_0());
		}
		    |
		kw='and'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getSeparatorAndAccess().getAndKeyword_1());
		}
		    |
		kw='&&'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getSeparatorAndAccess().getAmpersandAmpersandKeyword_2());
		}
	)
;

// Rule PronounIdentifier
rulePronounIdentifier returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0=':they'
			{
				$current = grammarAccess.getPronounIdentifierAccess().getTheyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getPronounIdentifierAccess().getTheyEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1=':them'
			{
				$current = grammarAccess.getPronounIdentifierAccess().getThemEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getPronounIdentifierAccess().getThemEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2=':their'
			{
				$current = grammarAccess.getPronounIdentifierAccess().getTheirEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getPronounIdentifierAccess().getTheirEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3=':theirs'
			{
				$current = grammarAccess.getPronounIdentifierAccess().getTheirsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getPronounIdentifierAccess().getTheirsEnumLiteralDeclaration_3());
			}
		)
	)
;

// Rule Modifier
ruleModifier returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='-capitalize'
			{
				$current = grammarAccess.getModifierAccess().getCapitalizeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getModifierAccess().getCapitalizeEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='-CAPITALIZE'
			{
				$current = grammarAccess.getModifierAccess().getFullCapitalizeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getModifierAccess().getFullCapitalizeEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='-s'
			{
				$current = grammarAccess.getModifierAccess().getPluralEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getModifierAccess().getPluralEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='-a'
			{
				$current = grammarAccess.getModifierAccess().getArticleEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getModifierAccess().getArticleEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='-ed'
			{
				$current = grammarAccess.getModifierAccess().getPastTenseEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getModifierAccess().getPastTenseEnumLiteralDeclaration_4());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
