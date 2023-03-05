package uk.ac.kcl.inf.mdd.tracerypp.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.inf.mdd.tracerypp.services.TraceryPPGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTraceryPPParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'The story looks like this:'", "' can have values: '", "' can be: '", "','", "'or'", "'.capitalize'", "'.CAPITALIZE'", "'.s'", "'.a'", "'.ed'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalTraceryPPParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTraceryPPParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTraceryPPParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTraceryPP.g"; }



     	private TraceryPPGrammarAccess grammarAccess;

        public InternalTraceryPPParser(TokenStream input, TraceryPPGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected TraceryPPGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalTraceryPP.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalTraceryPP.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalTraceryPP.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalTraceryPP.g:71:1: ruleModel returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:77:2: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // InternalTraceryPP.g:78:2: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // InternalTraceryPP.g:78:2: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTraceryPP.g:79:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalTraceryPP.g:79:3: (lv_statements_0_0= ruleStatement )
            	    // InternalTraceryPP.g:80:4: lv_statements_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statements",
            	    					lv_statements_0_0,
            	    					"uk.ac.kcl.inf.mdd.tracerypp.TraceryPP.Statement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStatement"
    // InternalTraceryPP.g:100:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalTraceryPP.g:100:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalTraceryPP.g:101:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalTraceryPP.g:107:1: ruleStatement returns [EObject current=null] : (this_Definition_0= ruleDefinition | this_Rule_1= ruleRule | this_Story_2= ruleStory ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Definition_0 = null;

        EObject this_Rule_1 = null;

        EObject this_Story_2 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:113:2: ( (this_Definition_0= ruleDefinition | this_Rule_1= ruleRule | this_Story_2= ruleStory ) )
            // InternalTraceryPP.g:114:2: (this_Definition_0= ruleDefinition | this_Rule_1= ruleRule | this_Story_2= ruleStory )
            {
            // InternalTraceryPP.g:114:2: (this_Definition_0= ruleDefinition | this_Rule_1= ruleRule | this_Story_2= ruleStory )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||LA2_1==RULE_ID||LA2_1==11) ) {
                    alt2=2;
                }
                else if ( ((LA2_1>=12 && LA2_1<=13)) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==11) ) {
                alt2=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTraceryPP.g:115:3: this_Definition_0= ruleDefinition
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Definition_0=ruleDefinition();

                    state._fsp--;


                    			current = this_Definition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:124:3: this_Rule_1= ruleRule
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getRuleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rule_1=ruleRule();

                    state._fsp--;


                    			current = this_Rule_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTraceryPP.g:133:3: this_Story_2= ruleStory
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getStoryParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Story_2=ruleStory();

                    state._fsp--;


                    			current = this_Story_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleDefinition"
    // InternalTraceryPP.g:145:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalTraceryPP.g:145:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalTraceryPP.g:146:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalTraceryPP.g:152:1: ruleDefinition returns [EObject current=null] : this_ListDefinition_0= ruleListDefinition ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_ListDefinition_0 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:158:2: (this_ListDefinition_0= ruleListDefinition )
            // InternalTraceryPP.g:159:2: this_ListDefinition_0= ruleListDefinition
            {

            		newCompositeNode(grammarAccess.getDefinitionAccess().getListDefinitionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ListDefinition_0=ruleListDefinition();

            state._fsp--;


            		current = this_ListDefinition_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleRule"
    // InternalTraceryPP.g:170:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalTraceryPP.g:170:45: (iv_ruleRule= ruleRule EOF )
            // InternalTraceryPP.g:171:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalTraceryPP.g:177:1: ruleRule returns [EObject current=null] : this_SentenceRule_0= ruleSentenceRule ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        EObject this_SentenceRule_0 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:183:2: (this_SentenceRule_0= ruleSentenceRule )
            // InternalTraceryPP.g:184:2: this_SentenceRule_0= ruleSentenceRule
            {

            		newCompositeNode(grammarAccess.getRuleAccess().getSentenceRuleParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_SentenceRule_0=ruleSentenceRule();

            state._fsp--;


            		current = this_SentenceRule_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleStory"
    // InternalTraceryPP.g:195:1: entryRuleStory returns [EObject current=null] : iv_ruleStory= ruleStory EOF ;
    public final EObject entryRuleStory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStory = null;


        try {
            // InternalTraceryPP.g:195:46: (iv_ruleStory= ruleStory EOF )
            // InternalTraceryPP.g:196:2: iv_ruleStory= ruleStory EOF
            {
             newCompositeNode(grammarAccess.getStoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStory=ruleStory();

            state._fsp--;

             current =iv_ruleStory; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStory"


    // $ANTLR start "ruleStory"
    // InternalTraceryPP.g:202:1: ruleStory returns [EObject current=null] : (otherlv_0= 'The story looks like this:' ( ( (lv_story_1_1= ruleWord | lv_story_1_2= ruleStoryVariable ) ) )* ) ;
    public final EObject ruleStory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_story_1_1 = null;

        EObject lv_story_1_2 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:208:2: ( (otherlv_0= 'The story looks like this:' ( ( (lv_story_1_1= ruleWord | lv_story_1_2= ruleStoryVariable ) ) )* ) )
            // InternalTraceryPP.g:209:2: (otherlv_0= 'The story looks like this:' ( ( (lv_story_1_1= ruleWord | lv_story_1_2= ruleStoryVariable ) ) )* )
            {
            // InternalTraceryPP.g:209:2: (otherlv_0= 'The story looks like this:' ( ( (lv_story_1_1= ruleWord | lv_story_1_2= ruleStoryVariable ) ) )* )
            // InternalTraceryPP.g:210:3: otherlv_0= 'The story looks like this:' ( ( (lv_story_1_1= ruleWord | lv_story_1_2= ruleStoryVariable ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStoryAccess().getTheStoryLooksLikeThisKeyword_0());
            		
            // InternalTraceryPP.g:214:3: ( ( (lv_story_1_1= ruleWord | lv_story_1_2= ruleStoryVariable ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_STRING)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTraceryPP.g:215:4: ( (lv_story_1_1= ruleWord | lv_story_1_2= ruleStoryVariable ) )
            	    {
            	    // InternalTraceryPP.g:215:4: ( (lv_story_1_1= ruleWord | lv_story_1_2= ruleStoryVariable ) )
            	    // InternalTraceryPP.g:216:5: (lv_story_1_1= ruleWord | lv_story_1_2= ruleStoryVariable )
            	    {
            	    // InternalTraceryPP.g:216:5: (lv_story_1_1= ruleWord | lv_story_1_2= ruleStoryVariable )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==RULE_STRING) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==RULE_ID) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalTraceryPP.g:217:6: lv_story_1_1= ruleWord
            	            {

            	            						newCompositeNode(grammarAccess.getStoryAccess().getStoryWordParserRuleCall_1_0_0());
            	            					
            	            pushFollow(FOLLOW_4);
            	            lv_story_1_1=ruleWord();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getStoryRule());
            	            						}
            	            						add(
            	            							current,
            	            							"story",
            	            							lv_story_1_1,
            	            							"uk.ac.kcl.inf.mdd.tracerypp.TraceryPP.Word");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalTraceryPP.g:233:6: lv_story_1_2= ruleStoryVariable
            	            {

            	            						newCompositeNode(grammarAccess.getStoryAccess().getStoryStoryVariableParserRuleCall_1_0_1());
            	            					
            	            pushFollow(FOLLOW_4);
            	            lv_story_1_2=ruleStoryVariable();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getStoryRule());
            	            						}
            	            						add(
            	            							current,
            	            							"story",
            	            							lv_story_1_2,
            	            							"uk.ac.kcl.inf.mdd.tracerypp.TraceryPP.StoryVariable");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStory"


    // $ANTLR start "entryRuleListDefinition"
    // InternalTraceryPP.g:255:1: entryRuleListDefinition returns [EObject current=null] : iv_ruleListDefinition= ruleListDefinition EOF ;
    public final EObject entryRuleListDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListDefinition = null;


        try {
            // InternalTraceryPP.g:255:55: (iv_ruleListDefinition= ruleListDefinition EOF )
            // InternalTraceryPP.g:256:2: iv_ruleListDefinition= ruleListDefinition EOF
            {
             newCompositeNode(grammarAccess.getListDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListDefinition=ruleListDefinition();

            state._fsp--;

             current =iv_ruleListDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListDefinition"


    // $ANTLR start "ruleListDefinition"
    // InternalTraceryPP.g:262:1: ruleListDefinition returns [EObject current=null] : ( ( (lv_start_symbol_0_0= ruleVariable ) ) (otherlv_1= ' can have values: ' | otherlv_2= ' can be: ' ) ( (lv_list_3_0= ruleList ) ) ) ;
    public final EObject ruleListDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_start_symbol_0_0 = null;

        EObject lv_list_3_0 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:268:2: ( ( ( (lv_start_symbol_0_0= ruleVariable ) ) (otherlv_1= ' can have values: ' | otherlv_2= ' can be: ' ) ( (lv_list_3_0= ruleList ) ) ) )
            // InternalTraceryPP.g:269:2: ( ( (lv_start_symbol_0_0= ruleVariable ) ) (otherlv_1= ' can have values: ' | otherlv_2= ' can be: ' ) ( (lv_list_3_0= ruleList ) ) )
            {
            // InternalTraceryPP.g:269:2: ( ( (lv_start_symbol_0_0= ruleVariable ) ) (otherlv_1= ' can have values: ' | otherlv_2= ' can be: ' ) ( (lv_list_3_0= ruleList ) ) )
            // InternalTraceryPP.g:270:3: ( (lv_start_symbol_0_0= ruleVariable ) ) (otherlv_1= ' can have values: ' | otherlv_2= ' can be: ' ) ( (lv_list_3_0= ruleList ) )
            {
            // InternalTraceryPP.g:270:3: ( (lv_start_symbol_0_0= ruleVariable ) )
            // InternalTraceryPP.g:271:4: (lv_start_symbol_0_0= ruleVariable )
            {
            // InternalTraceryPP.g:271:4: (lv_start_symbol_0_0= ruleVariable )
            // InternalTraceryPP.g:272:5: lv_start_symbol_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getListDefinitionAccess().getStart_symbolVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_start_symbol_0_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListDefinitionRule());
            					}
            					set(
            						current,
            						"start_symbol",
            						lv_start_symbol_0_0,
            						"uk.ac.kcl.inf.mdd.tracerypp.TraceryPP.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTraceryPP.g:289:3: (otherlv_1= ' can have values: ' | otherlv_2= ' can be: ' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTraceryPP.g:290:4: otherlv_1= ' can have values: '
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getListDefinitionAccess().getCanHaveValuesKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:295:4: otherlv_2= ' can be: '
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getListDefinitionAccess().getCanBeKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalTraceryPP.g:300:3: ( (lv_list_3_0= ruleList ) )
            // InternalTraceryPP.g:301:4: (lv_list_3_0= ruleList )
            {
            // InternalTraceryPP.g:301:4: (lv_list_3_0= ruleList )
            // InternalTraceryPP.g:302:5: lv_list_3_0= ruleList
            {

            					newCompositeNode(grammarAccess.getListDefinitionAccess().getListListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_list_3_0=ruleList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListDefinitionRule());
            					}
            					set(
            						current,
            						"list",
            						lv_list_3_0,
            						"uk.ac.kcl.inf.mdd.tracerypp.TraceryPP.List");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListDefinition"


    // $ANTLR start "entryRuleSentenceRule"
    // InternalTraceryPP.g:323:1: entryRuleSentenceRule returns [EObject current=null] : iv_ruleSentenceRule= ruleSentenceRule EOF ;
    public final EObject entryRuleSentenceRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentenceRule = null;


        try {
            // InternalTraceryPP.g:323:53: (iv_ruleSentenceRule= ruleSentenceRule EOF )
            // InternalTraceryPP.g:324:2: iv_ruleSentenceRule= ruleSentenceRule EOF
            {
             newCompositeNode(grammarAccess.getSentenceRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSentenceRule=ruleSentenceRule();

            state._fsp--;

             current =iv_ruleSentenceRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSentenceRule"


    // $ANTLR start "ruleSentenceRule"
    // InternalTraceryPP.g:330:1: ruleSentenceRule returns [EObject current=null] : ( (lv_start_symbol_0_0= ruleVariable ) ) ;
    public final EObject ruleSentenceRule() throws RecognitionException {
        EObject current = null;

        EObject lv_start_symbol_0_0 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:336:2: ( ( (lv_start_symbol_0_0= ruleVariable ) ) )
            // InternalTraceryPP.g:337:2: ( (lv_start_symbol_0_0= ruleVariable ) )
            {
            // InternalTraceryPP.g:337:2: ( (lv_start_symbol_0_0= ruleVariable ) )
            // InternalTraceryPP.g:338:3: (lv_start_symbol_0_0= ruleVariable )
            {
            // InternalTraceryPP.g:338:3: (lv_start_symbol_0_0= ruleVariable )
            // InternalTraceryPP.g:339:4: lv_start_symbol_0_0= ruleVariable
            {

            				newCompositeNode(grammarAccess.getSentenceRuleAccess().getStart_symbolVariableParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_start_symbol_0_0=ruleVariable();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getSentenceRuleRule());
            				}
            				set(
            					current,
            					"start_symbol",
            					lv_start_symbol_0_0,
            					"uk.ac.kcl.inf.mdd.tracerypp.TraceryPP.Variable");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSentenceRule"


    // $ANTLR start "entryRuleVariable"
    // InternalTraceryPP.g:359:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalTraceryPP.g:359:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalTraceryPP.g:360:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalTraceryPP.g:366:1: ruleVariable returns [EObject current=null] : ( (lv_value_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:372:2: ( ( (lv_value_0_0= RULE_ID ) ) )
            // InternalTraceryPP.g:373:2: ( (lv_value_0_0= RULE_ID ) )
            {
            // InternalTraceryPP.g:373:2: ( (lv_value_0_0= RULE_ID ) )
            // InternalTraceryPP.g:374:3: (lv_value_0_0= RULE_ID )
            {
            // InternalTraceryPP.g:374:3: (lv_value_0_0= RULE_ID )
            // InternalTraceryPP.g:375:4: lv_value_0_0= RULE_ID
            {
            lv_value_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getVariableAccess().getValueIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleList"
    // InternalTraceryPP.g:394:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalTraceryPP.g:394:45: (iv_ruleList= ruleList EOF )
            // InternalTraceryPP.g:395:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalTraceryPP.g:401:1: ruleList returns [EObject current=null] : ( ( (lv_words_0_0= ruleWord ) ) ( ( (lv_sep_1_0= ruleSeparator ) ) ( (lv_word_2_0= ruleWord ) ) )* ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        EObject lv_words_0_0 = null;

        AntlrDatatypeRuleToken lv_sep_1_0 = null;

        EObject lv_word_2_0 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:407:2: ( ( ( (lv_words_0_0= ruleWord ) ) ( ( (lv_sep_1_0= ruleSeparator ) ) ( (lv_word_2_0= ruleWord ) ) )* ) )
            // InternalTraceryPP.g:408:2: ( ( (lv_words_0_0= ruleWord ) ) ( ( (lv_sep_1_0= ruleSeparator ) ) ( (lv_word_2_0= ruleWord ) ) )* )
            {
            // InternalTraceryPP.g:408:2: ( ( (lv_words_0_0= ruleWord ) ) ( ( (lv_sep_1_0= ruleSeparator ) ) ( (lv_word_2_0= ruleWord ) ) )* )
            // InternalTraceryPP.g:409:3: ( (lv_words_0_0= ruleWord ) ) ( ( (lv_sep_1_0= ruleSeparator ) ) ( (lv_word_2_0= ruleWord ) ) )*
            {
            // InternalTraceryPP.g:409:3: ( (lv_words_0_0= ruleWord ) )
            // InternalTraceryPP.g:410:4: (lv_words_0_0= ruleWord )
            {
            // InternalTraceryPP.g:410:4: (lv_words_0_0= ruleWord )
            // InternalTraceryPP.g:411:5: lv_words_0_0= ruleWord
            {

            					newCompositeNode(grammarAccess.getListAccess().getWordsWordParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_words_0_0=ruleWord();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListRule());
            					}
            					add(
            						current,
            						"words",
            						lv_words_0_0,
            						"uk.ac.kcl.inf.mdd.tracerypp.TraceryPP.Word");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTraceryPP.g:428:3: ( ( (lv_sep_1_0= ruleSeparator ) ) ( (lv_word_2_0= ruleWord ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=14 && LA6_0<=15)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTraceryPP.g:429:4: ( (lv_sep_1_0= ruleSeparator ) ) ( (lv_word_2_0= ruleWord ) )
            	    {
            	    // InternalTraceryPP.g:429:4: ( (lv_sep_1_0= ruleSeparator ) )
            	    // InternalTraceryPP.g:430:5: (lv_sep_1_0= ruleSeparator )
            	    {
            	    // InternalTraceryPP.g:430:5: (lv_sep_1_0= ruleSeparator )
            	    // InternalTraceryPP.g:431:6: lv_sep_1_0= ruleSeparator
            	    {

            	    						newCompositeNode(grammarAccess.getListAccess().getSepSeparatorParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_sep_1_0=ruleSeparator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getListRule());
            	    						}
            	    						set(
            	    							current,
            	    							"sep",
            	    							lv_sep_1_0,
            	    							"uk.ac.kcl.inf.mdd.tracerypp.TraceryPP.Separator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalTraceryPP.g:448:4: ( (lv_word_2_0= ruleWord ) )
            	    // InternalTraceryPP.g:449:5: (lv_word_2_0= ruleWord )
            	    {
            	    // InternalTraceryPP.g:449:5: (lv_word_2_0= ruleWord )
            	    // InternalTraceryPP.g:450:6: lv_word_2_0= ruleWord
            	    {

            	    						newCompositeNode(grammarAccess.getListAccess().getWordWordParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_word_2_0=ruleWord();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getListRule());
            	    						}
            	    						set(
            	    							current,
            	    							"word",
            	    							lv_word_2_0,
            	    							"uk.ac.kcl.inf.mdd.tracerypp.TraceryPP.Word");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleSeparator"
    // InternalTraceryPP.g:472:1: entryRuleSeparator returns [String current=null] : iv_ruleSeparator= ruleSeparator EOF ;
    public final String entryRuleSeparator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSeparator = null;


        try {
            // InternalTraceryPP.g:472:49: (iv_ruleSeparator= ruleSeparator EOF )
            // InternalTraceryPP.g:473:2: iv_ruleSeparator= ruleSeparator EOF
            {
             newCompositeNode(grammarAccess.getSeparatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeparator=ruleSeparator();

            state._fsp--;

             current =iv_ruleSeparator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSeparator"


    // $ANTLR start "ruleSeparator"
    // InternalTraceryPP.g:479:1: ruleSeparator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ',' | kw= 'or' ) ;
    public final AntlrDatatypeRuleToken ruleSeparator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:485:2: ( (kw= ',' | kw= 'or' ) )
            // InternalTraceryPP.g:486:2: (kw= ',' | kw= 'or' )
            {
            // InternalTraceryPP.g:486:2: (kw= ',' | kw= 'or' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTraceryPP.g:487:3: kw= ','
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSeparatorAccess().getCommaKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:493:3: kw= 'or'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSeparatorAccess().getOrKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSeparator"


    // $ANTLR start "entryRuleStoryVariable"
    // InternalTraceryPP.g:502:1: entryRuleStoryVariable returns [EObject current=null] : iv_ruleStoryVariable= ruleStoryVariable EOF ;
    public final EObject entryRuleStoryVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStoryVariable = null;


        try {
            // InternalTraceryPP.g:502:54: (iv_ruleStoryVariable= ruleStoryVariable EOF )
            // InternalTraceryPP.g:503:2: iv_ruleStoryVariable= ruleStoryVariable EOF
            {
             newCompositeNode(grammarAccess.getStoryVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStoryVariable=ruleStoryVariable();

            state._fsp--;

             current =iv_ruleStoryVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStoryVariable"


    // $ANTLR start "ruleStoryVariable"
    // InternalTraceryPP.g:509:1: ruleStoryVariable returns [EObject current=null] : ( ( (lv_value_0_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )* ) ;
    public final EObject ruleStoryVariable() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        AntlrDatatypeRuleToken lv_modifiers_1_0 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:515:2: ( ( ( (lv_value_0_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )* ) )
            // InternalTraceryPP.g:516:2: ( ( (lv_value_0_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )* )
            {
            // InternalTraceryPP.g:516:2: ( ( (lv_value_0_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )* )
            // InternalTraceryPP.g:517:3: ( (lv_value_0_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )*
            {
            // InternalTraceryPP.g:517:3: ( (lv_value_0_0= RULE_ID ) )
            // InternalTraceryPP.g:518:4: (lv_value_0_0= RULE_ID )
            {
            // InternalTraceryPP.g:518:4: (lv_value_0_0= RULE_ID )
            // InternalTraceryPP.g:519:5: lv_value_0_0= RULE_ID
            {
            lv_value_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_value_0_0, grammarAccess.getStoryVariableAccess().getValueIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStoryVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalTraceryPP.g:535:3: ( (lv_modifiers_1_0= ruleModifier ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=16 && LA8_0<=20)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTraceryPP.g:536:4: (lv_modifiers_1_0= ruleModifier )
            	    {
            	    // InternalTraceryPP.g:536:4: (lv_modifiers_1_0= ruleModifier )
            	    // InternalTraceryPP.g:537:5: lv_modifiers_1_0= ruleModifier
            	    {

            	    					newCompositeNode(grammarAccess.getStoryVariableAccess().getModifiersModifierParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_modifiers_1_0=ruleModifier();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStoryVariableRule());
            	    					}
            	    					add(
            	    						current,
            	    						"modifiers",
            	    						lv_modifiers_1_0,
            	    						"uk.ac.kcl.inf.mdd.tracerypp.TraceryPP.Modifier");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStoryVariable"


    // $ANTLR start "entryRuleModifier"
    // InternalTraceryPP.g:558:1: entryRuleModifier returns [String current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final String entryRuleModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModifier = null;


        try {
            // InternalTraceryPP.g:558:48: (iv_ruleModifier= ruleModifier EOF )
            // InternalTraceryPP.g:559:2: iv_ruleModifier= ruleModifier EOF
            {
             newCompositeNode(grammarAccess.getModifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModifier=ruleModifier();

            state._fsp--;

             current =iv_ruleModifier.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModifier"


    // $ANTLR start "ruleModifier"
    // InternalTraceryPP.g:565:1: ruleModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CapitalizationModifier_0= ruleCapitalizationModifier | this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier | this_PluralityModifier_2= rulePluralityModifier | this_ArticleModifier_3= ruleArticleModifier | this_PastTenseModifier_4= rulePastTenseModifier ) ;
    public final AntlrDatatypeRuleToken ruleModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_CapitalizationModifier_0 = null;

        AntlrDatatypeRuleToken this_FullCapitalizationModifier_1 = null;

        AntlrDatatypeRuleToken this_PluralityModifier_2 = null;

        AntlrDatatypeRuleToken this_ArticleModifier_3 = null;

        AntlrDatatypeRuleToken this_PastTenseModifier_4 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:571:2: ( (this_CapitalizationModifier_0= ruleCapitalizationModifier | this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier | this_PluralityModifier_2= rulePluralityModifier | this_ArticleModifier_3= ruleArticleModifier | this_PastTenseModifier_4= rulePastTenseModifier ) )
            // InternalTraceryPP.g:572:2: (this_CapitalizationModifier_0= ruleCapitalizationModifier | this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier | this_PluralityModifier_2= rulePluralityModifier | this_ArticleModifier_3= ruleArticleModifier | this_PastTenseModifier_4= rulePastTenseModifier )
            {
            // InternalTraceryPP.g:572:2: (this_CapitalizationModifier_0= ruleCapitalizationModifier | this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier | this_PluralityModifier_2= rulePluralityModifier | this_ArticleModifier_3= ruleArticleModifier | this_PastTenseModifier_4= rulePastTenseModifier )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt9=1;
                }
                break;
            case 17:
                {
                alt9=2;
                }
                break;
            case 18:
                {
                alt9=3;
                }
                break;
            case 19:
                {
                alt9=4;
                }
                break;
            case 20:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalTraceryPP.g:573:3: this_CapitalizationModifier_0= ruleCapitalizationModifier
                    {

                    			newCompositeNode(grammarAccess.getModifierAccess().getCapitalizationModifierParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CapitalizationModifier_0=ruleCapitalizationModifier();

                    state._fsp--;


                    			current.merge(this_CapitalizationModifier_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:584:3: this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier
                    {

                    			newCompositeNode(grammarAccess.getModifierAccess().getFullCapitalizationModifierParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FullCapitalizationModifier_1=ruleFullCapitalizationModifier();

                    state._fsp--;


                    			current.merge(this_FullCapitalizationModifier_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTraceryPP.g:595:3: this_PluralityModifier_2= rulePluralityModifier
                    {

                    			newCompositeNode(grammarAccess.getModifierAccess().getPluralityModifierParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PluralityModifier_2=rulePluralityModifier();

                    state._fsp--;


                    			current.merge(this_PluralityModifier_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTraceryPP.g:606:3: this_ArticleModifier_3= ruleArticleModifier
                    {

                    			newCompositeNode(grammarAccess.getModifierAccess().getArticleModifierParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArticleModifier_3=ruleArticleModifier();

                    state._fsp--;


                    			current.merge(this_ArticleModifier_3);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalTraceryPP.g:617:3: this_PastTenseModifier_4= rulePastTenseModifier
                    {

                    			newCompositeNode(grammarAccess.getModifierAccess().getPastTenseModifierParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_PastTenseModifier_4=rulePastTenseModifier();

                    state._fsp--;


                    			current.merge(this_PastTenseModifier_4);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModifier"


    // $ANTLR start "entryRuleCapitalizationModifier"
    // InternalTraceryPP.g:631:1: entryRuleCapitalizationModifier returns [String current=null] : iv_ruleCapitalizationModifier= ruleCapitalizationModifier EOF ;
    public final String entryRuleCapitalizationModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCapitalizationModifier = null;


        try {
            // InternalTraceryPP.g:631:62: (iv_ruleCapitalizationModifier= ruleCapitalizationModifier EOF )
            // InternalTraceryPP.g:632:2: iv_ruleCapitalizationModifier= ruleCapitalizationModifier EOF
            {
             newCompositeNode(grammarAccess.getCapitalizationModifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCapitalizationModifier=ruleCapitalizationModifier();

            state._fsp--;

             current =iv_ruleCapitalizationModifier.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCapitalizationModifier"


    // $ANTLR start "ruleCapitalizationModifier"
    // InternalTraceryPP.g:638:1: ruleCapitalizationModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.capitalize' ;
    public final AntlrDatatypeRuleToken ruleCapitalizationModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:644:2: (kw= '.capitalize' )
            // InternalTraceryPP.g:645:2: kw= '.capitalize'
            {
            kw=(Token)match(input,16,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getCapitalizationModifierAccess().getCapitalizeKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCapitalizationModifier"


    // $ANTLR start "entryRuleFullCapitalizationModifier"
    // InternalTraceryPP.g:653:1: entryRuleFullCapitalizationModifier returns [String current=null] : iv_ruleFullCapitalizationModifier= ruleFullCapitalizationModifier EOF ;
    public final String entryRuleFullCapitalizationModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFullCapitalizationModifier = null;


        try {
            // InternalTraceryPP.g:653:66: (iv_ruleFullCapitalizationModifier= ruleFullCapitalizationModifier EOF )
            // InternalTraceryPP.g:654:2: iv_ruleFullCapitalizationModifier= ruleFullCapitalizationModifier EOF
            {
             newCompositeNode(grammarAccess.getFullCapitalizationModifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFullCapitalizationModifier=ruleFullCapitalizationModifier();

            state._fsp--;

             current =iv_ruleFullCapitalizationModifier.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFullCapitalizationModifier"


    // $ANTLR start "ruleFullCapitalizationModifier"
    // InternalTraceryPP.g:660:1: ruleFullCapitalizationModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.CAPITALIZE' ;
    public final AntlrDatatypeRuleToken ruleFullCapitalizationModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:666:2: (kw= '.CAPITALIZE' )
            // InternalTraceryPP.g:667:2: kw= '.CAPITALIZE'
            {
            kw=(Token)match(input,17,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getFullCapitalizationModifierAccess().getCAPITALIZEKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFullCapitalizationModifier"


    // $ANTLR start "entryRulePluralityModifier"
    // InternalTraceryPP.g:675:1: entryRulePluralityModifier returns [String current=null] : iv_rulePluralityModifier= rulePluralityModifier EOF ;
    public final String entryRulePluralityModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePluralityModifier = null;


        try {
            // InternalTraceryPP.g:675:57: (iv_rulePluralityModifier= rulePluralityModifier EOF )
            // InternalTraceryPP.g:676:2: iv_rulePluralityModifier= rulePluralityModifier EOF
            {
             newCompositeNode(grammarAccess.getPluralityModifierRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePluralityModifier=rulePluralityModifier();

            state._fsp--;

             current =iv_rulePluralityModifier.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePluralityModifier"


    // $ANTLR start "rulePluralityModifier"
    // InternalTraceryPP.g:682:1: rulePluralityModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.s' ;
    public final AntlrDatatypeRuleToken rulePluralityModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:688:2: (kw= '.s' )
            // InternalTraceryPP.g:689:2: kw= '.s'
            {
            kw=(Token)match(input,18,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getPluralityModifierAccess().getSKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePluralityModifier"


    // $ANTLR start "entryRuleArticleModifier"
    // InternalTraceryPP.g:697:1: entryRuleArticleModifier returns [String current=null] : iv_ruleArticleModifier= ruleArticleModifier EOF ;
    public final String entryRuleArticleModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArticleModifier = null;


        try {
            // InternalTraceryPP.g:697:55: (iv_ruleArticleModifier= ruleArticleModifier EOF )
            // InternalTraceryPP.g:698:2: iv_ruleArticleModifier= ruleArticleModifier EOF
            {
             newCompositeNode(grammarAccess.getArticleModifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArticleModifier=ruleArticleModifier();

            state._fsp--;

             current =iv_ruleArticleModifier.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArticleModifier"


    // $ANTLR start "ruleArticleModifier"
    // InternalTraceryPP.g:704:1: ruleArticleModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.a' ;
    public final AntlrDatatypeRuleToken ruleArticleModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:710:2: (kw= '.a' )
            // InternalTraceryPP.g:711:2: kw= '.a'
            {
            kw=(Token)match(input,19,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getArticleModifierAccess().getAKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArticleModifier"


    // $ANTLR start "entryRulePastTenseModifier"
    // InternalTraceryPP.g:719:1: entryRulePastTenseModifier returns [String current=null] : iv_rulePastTenseModifier= rulePastTenseModifier EOF ;
    public final String entryRulePastTenseModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePastTenseModifier = null;


        try {
            // InternalTraceryPP.g:719:57: (iv_rulePastTenseModifier= rulePastTenseModifier EOF )
            // InternalTraceryPP.g:720:2: iv_rulePastTenseModifier= rulePastTenseModifier EOF
            {
             newCompositeNode(grammarAccess.getPastTenseModifierRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePastTenseModifier=rulePastTenseModifier();

            state._fsp--;

             current =iv_rulePastTenseModifier.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePastTenseModifier"


    // $ANTLR start "rulePastTenseModifier"
    // InternalTraceryPP.g:726:1: rulePastTenseModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.ed' ;
    public final AntlrDatatypeRuleToken rulePastTenseModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:732:2: (kw= '.ed' )
            // InternalTraceryPP.g:733:2: kw= '.ed'
            {
            kw=(Token)match(input,20,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getPastTenseModifierAccess().getEdKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePastTenseModifier"


    // $ANTLR start "entryRuleWord"
    // InternalTraceryPP.g:741:1: entryRuleWord returns [EObject current=null] : iv_ruleWord= ruleWord EOF ;
    public final EObject entryRuleWord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWord = null;


        try {
            // InternalTraceryPP.g:741:45: (iv_ruleWord= ruleWord EOF )
            // InternalTraceryPP.g:742:2: iv_ruleWord= ruleWord EOF
            {
             newCompositeNode(grammarAccess.getWordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWord=ruleWord();

            state._fsp--;

             current =iv_ruleWord; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWord"


    // $ANTLR start "ruleWord"
    // InternalTraceryPP.g:748:1: ruleWord returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleWord() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:754:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalTraceryPP.g:755:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalTraceryPP.g:755:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalTraceryPP.g:756:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalTraceryPP.g:756:3: (lv_value_0_0= RULE_STRING )
            // InternalTraceryPP.g:757:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getWordAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getWordRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWord"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001F0002L});

}