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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "' can have values: '", "','", "'or'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int EOF=-1;

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

                if ( (LA1_0==RULE_ID) ) {
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
    // InternalTraceryPP.g:107:1: ruleStatement returns [EObject current=null] : this_Rule_0= ruleRule ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Rule_0 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:113:2: (this_Rule_0= ruleRule )
            // InternalTraceryPP.g:114:2: this_Rule_0= ruleRule
            {

            		newCompositeNode(grammarAccess.getStatementAccess().getRuleParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Rule_0=ruleRule();

            state._fsp--;


            		current = this_Rule_0;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleRule"
    // InternalTraceryPP.g:125:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalTraceryPP.g:125:45: (iv_ruleRule= ruleRule EOF )
            // InternalTraceryPP.g:126:2: iv_ruleRule= ruleRule EOF
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
    // InternalTraceryPP.g:132:1: ruleRule returns [EObject current=null] : ( ( (lv_start_symbol_0_0= ruleVariable ) ) otherlv_1= ' can have values: ' ( (lv_list_2_0= ruleList ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_start_symbol_0_0 = null;

        EObject lv_list_2_0 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:138:2: ( ( ( (lv_start_symbol_0_0= ruleVariable ) ) otherlv_1= ' can have values: ' ( (lv_list_2_0= ruleList ) ) ) )
            // InternalTraceryPP.g:139:2: ( ( (lv_start_symbol_0_0= ruleVariable ) ) otherlv_1= ' can have values: ' ( (lv_list_2_0= ruleList ) ) )
            {
            // InternalTraceryPP.g:139:2: ( ( (lv_start_symbol_0_0= ruleVariable ) ) otherlv_1= ' can have values: ' ( (lv_list_2_0= ruleList ) ) )
            // InternalTraceryPP.g:140:3: ( (lv_start_symbol_0_0= ruleVariable ) ) otherlv_1= ' can have values: ' ( (lv_list_2_0= ruleList ) )
            {
            // InternalTraceryPP.g:140:3: ( (lv_start_symbol_0_0= ruleVariable ) )
            // InternalTraceryPP.g:141:4: (lv_start_symbol_0_0= ruleVariable )
            {
            // InternalTraceryPP.g:141:4: (lv_start_symbol_0_0= ruleVariable )
            // InternalTraceryPP.g:142:5: lv_start_symbol_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getStart_symbolVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_start_symbol_0_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"start_symbol",
            						lv_start_symbol_0_0,
            						"uk.ac.kcl.inf.mdd.tracerypp.TraceryPP.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getCanHaveValuesKeyword_1());
            		
            // InternalTraceryPP.g:163:3: ( (lv_list_2_0= ruleList ) )
            // InternalTraceryPP.g:164:4: (lv_list_2_0= ruleList )
            {
            // InternalTraceryPP.g:164:4: (lv_list_2_0= ruleList )
            // InternalTraceryPP.g:165:5: lv_list_2_0= ruleList
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getListListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_list_2_0=ruleList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"list",
            						lv_list_2_0,
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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleVariable"
    // InternalTraceryPP.g:186:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalTraceryPP.g:186:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalTraceryPP.g:187:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalTraceryPP.g:193:1: ruleVariable returns [EObject current=null] : ( (lv_title_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_title_0_0=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:199:2: ( ( (lv_title_0_0= RULE_ID ) ) )
            // InternalTraceryPP.g:200:2: ( (lv_title_0_0= RULE_ID ) )
            {
            // InternalTraceryPP.g:200:2: ( (lv_title_0_0= RULE_ID ) )
            // InternalTraceryPP.g:201:3: (lv_title_0_0= RULE_ID )
            {
            // InternalTraceryPP.g:201:3: (lv_title_0_0= RULE_ID )
            // InternalTraceryPP.g:202:4: lv_title_0_0= RULE_ID
            {
            lv_title_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_title_0_0, grammarAccess.getVariableAccess().getTitleIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"title",
            					lv_title_0_0,
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
    // InternalTraceryPP.g:221:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalTraceryPP.g:221:45: (iv_ruleList= ruleList EOF )
            // InternalTraceryPP.g:222:2: iv_ruleList= ruleList EOF
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
    // InternalTraceryPP.g:228:1: ruleList returns [EObject current=null] : ( ( (lv_word_0_0= ruleWord ) ) ( ( (lv_sep_1_0= ruleSeparator ) ) ( (lv_word_2_0= ruleWord ) ) )* ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        EObject lv_word_0_0 = null;

        AntlrDatatypeRuleToken lv_sep_1_0 = null;

        EObject lv_word_2_0 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:234:2: ( ( ( (lv_word_0_0= ruleWord ) ) ( ( (lv_sep_1_0= ruleSeparator ) ) ( (lv_word_2_0= ruleWord ) ) )* ) )
            // InternalTraceryPP.g:235:2: ( ( (lv_word_0_0= ruleWord ) ) ( ( (lv_sep_1_0= ruleSeparator ) ) ( (lv_word_2_0= ruleWord ) ) )* )
            {
            // InternalTraceryPP.g:235:2: ( ( (lv_word_0_0= ruleWord ) ) ( ( (lv_sep_1_0= ruleSeparator ) ) ( (lv_word_2_0= ruleWord ) ) )* )
            // InternalTraceryPP.g:236:3: ( (lv_word_0_0= ruleWord ) ) ( ( (lv_sep_1_0= ruleSeparator ) ) ( (lv_word_2_0= ruleWord ) ) )*
            {
            // InternalTraceryPP.g:236:3: ( (lv_word_0_0= ruleWord ) )
            // InternalTraceryPP.g:237:4: (lv_word_0_0= ruleWord )
            {
            // InternalTraceryPP.g:237:4: (lv_word_0_0= ruleWord )
            // InternalTraceryPP.g:238:5: lv_word_0_0= ruleWord
            {

            					newCompositeNode(grammarAccess.getListAccess().getWordWordParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_word_0_0=ruleWord();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListRule());
            					}
            					set(
            						current,
            						"word",
            						lv_word_0_0,
            						"uk.ac.kcl.inf.mdd.tracerypp.TraceryPP.Word");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTraceryPP.g:255:3: ( ( (lv_sep_1_0= ruleSeparator ) ) ( (lv_word_2_0= ruleWord ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=12 && LA2_0<=13)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTraceryPP.g:256:4: ( (lv_sep_1_0= ruleSeparator ) ) ( (lv_word_2_0= ruleWord ) )
            	    {
            	    // InternalTraceryPP.g:256:4: ( (lv_sep_1_0= ruleSeparator ) )
            	    // InternalTraceryPP.g:257:5: (lv_sep_1_0= ruleSeparator )
            	    {
            	    // InternalTraceryPP.g:257:5: (lv_sep_1_0= ruleSeparator )
            	    // InternalTraceryPP.g:258:6: lv_sep_1_0= ruleSeparator
            	    {

            	    						newCompositeNode(grammarAccess.getListAccess().getSepSeparatorParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_5);
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

            	    // InternalTraceryPP.g:275:4: ( (lv_word_2_0= ruleWord ) )
            	    // InternalTraceryPP.g:276:5: (lv_word_2_0= ruleWord )
            	    {
            	    // InternalTraceryPP.g:276:5: (lv_word_2_0= ruleWord )
            	    // InternalTraceryPP.g:277:6: lv_word_2_0= ruleWord
            	    {

            	    						newCompositeNode(grammarAccess.getListAccess().getWordWordParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
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
            	    break loop2;
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
    // InternalTraceryPP.g:299:1: entryRuleSeparator returns [String current=null] : iv_ruleSeparator= ruleSeparator EOF ;
    public final String entryRuleSeparator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSeparator = null;


        try {
            // InternalTraceryPP.g:299:49: (iv_ruleSeparator= ruleSeparator EOF )
            // InternalTraceryPP.g:300:2: iv_ruleSeparator= ruleSeparator EOF
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
    // InternalTraceryPP.g:306:1: ruleSeparator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ',' | kw= 'or' ) ;
    public final AntlrDatatypeRuleToken ruleSeparator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:312:2: ( (kw= ',' | kw= 'or' ) )
            // InternalTraceryPP.g:313:2: (kw= ',' | kw= 'or' )
            {
            // InternalTraceryPP.g:313:2: (kw= ',' | kw= 'or' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTraceryPP.g:314:3: kw= ','
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSeparatorAccess().getCommaKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:320:3: kw= 'or'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

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


    // $ANTLR start "entryRuleWord"
    // InternalTraceryPP.g:329:1: entryRuleWord returns [EObject current=null] : iv_ruleWord= ruleWord EOF ;
    public final EObject entryRuleWord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWord = null;


        try {
            // InternalTraceryPP.g:329:45: (iv_ruleWord= ruleWord EOF )
            // InternalTraceryPP.g:330:2: iv_ruleWord= ruleWord EOF
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
    // InternalTraceryPP.g:336:1: ruleWord returns [EObject current=null] : ( (lv_word_0_0= RULE_STRING ) ) ;
    public final EObject ruleWord() throws RecognitionException {
        EObject current = null;

        Token lv_word_0_0=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:342:2: ( ( (lv_word_0_0= RULE_STRING ) ) )
            // InternalTraceryPP.g:343:2: ( (lv_word_0_0= RULE_STRING ) )
            {
            // InternalTraceryPP.g:343:2: ( (lv_word_0_0= RULE_STRING ) )
            // InternalTraceryPP.g:344:3: (lv_word_0_0= RULE_STRING )
            {
            // InternalTraceryPP.g:344:3: (lv_word_0_0= RULE_STRING )
            // InternalTraceryPP.g:345:4: lv_word_0_0= RULE_STRING
            {
            lv_word_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_word_0_0, grammarAccess.getWordAccess().getWordSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getWordRule());
            				}
            				setWithLastConsumed(
            					current,
            					"word",
            					lv_word_0_0,
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000003002L});

}