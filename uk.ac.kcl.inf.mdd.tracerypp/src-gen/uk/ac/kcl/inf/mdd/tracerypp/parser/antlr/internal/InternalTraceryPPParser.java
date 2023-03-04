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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'can have values: '", "', '", "','"
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

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)) ) {
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
    // InternalTraceryPP.g:107:1: ruleStatement returns [EObject current=null] : (this_Title_0= ruleTitle | this_Sentence_1= ruleSentence ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Title_0 = null;

        EObject this_Sentence_1 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:113:2: ( (this_Title_0= ruleTitle | this_Sentence_1= ruleSentence ) )
            // InternalTraceryPP.g:114:2: (this_Title_0= ruleTitle | this_Sentence_1= ruleSentence )
            {
            // InternalTraceryPP.g:114:2: (this_Title_0= ruleTitle | this_Sentence_1= ruleSentence )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_STRING) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTraceryPP.g:115:3: this_Title_0= ruleTitle
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getTitleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Title_0=ruleTitle();

                    state._fsp--;


                    			current = this_Title_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:124:3: this_Sentence_1= ruleSentence
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSentenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sentence_1=ruleSentence();

                    state._fsp--;


                    			current = this_Sentence_1;
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


    // $ANTLR start "entryRuleTitle"
    // InternalTraceryPP.g:136:1: entryRuleTitle returns [EObject current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final EObject entryRuleTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitle = null;


        try {
            // InternalTraceryPP.g:136:46: (iv_ruleTitle= ruleTitle EOF )
            // InternalTraceryPP.g:137:2: iv_ruleTitle= ruleTitle EOF
            {
             newCompositeNode(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTitle=ruleTitle();

            state._fsp--;

             current =iv_ruleTitle; 
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
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // InternalTraceryPP.g:143:1: ruleTitle returns [EObject current=null] : ( ( (lv_start_symbol_0_0= ruleStartSymbol ) ) otherlv_1= 'can have values: ' ( (lv_list_2_0= ruleList ) ) ) ;
    public final EObject ruleTitle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_start_symbol_0_0 = null;

        EObject lv_list_2_0 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:149:2: ( ( ( (lv_start_symbol_0_0= ruleStartSymbol ) ) otherlv_1= 'can have values: ' ( (lv_list_2_0= ruleList ) ) ) )
            // InternalTraceryPP.g:150:2: ( ( (lv_start_symbol_0_0= ruleStartSymbol ) ) otherlv_1= 'can have values: ' ( (lv_list_2_0= ruleList ) ) )
            {
            // InternalTraceryPP.g:150:2: ( ( (lv_start_symbol_0_0= ruleStartSymbol ) ) otherlv_1= 'can have values: ' ( (lv_list_2_0= ruleList ) ) )
            // InternalTraceryPP.g:151:3: ( (lv_start_symbol_0_0= ruleStartSymbol ) ) otherlv_1= 'can have values: ' ( (lv_list_2_0= ruleList ) )
            {
            // InternalTraceryPP.g:151:3: ( (lv_start_symbol_0_0= ruleStartSymbol ) )
            // InternalTraceryPP.g:152:4: (lv_start_symbol_0_0= ruleStartSymbol )
            {
            // InternalTraceryPP.g:152:4: (lv_start_symbol_0_0= ruleStartSymbol )
            // InternalTraceryPP.g:153:5: lv_start_symbol_0_0= ruleStartSymbol
            {

            					newCompositeNode(grammarAccess.getTitleAccess().getStart_symbolStartSymbolParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_start_symbol_0_0=ruleStartSymbol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTitleRule());
            					}
            					set(
            						current,
            						"start_symbol",
            						lv_start_symbol_0_0,
            						"uk.ac.kcl.inf.mdd.tracerypp.TraceryPP.StartSymbol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTitleAccess().getCanHaveValuesKeyword_1());
            		
            // InternalTraceryPP.g:174:3: ( (lv_list_2_0= ruleList ) )
            // InternalTraceryPP.g:175:4: (lv_list_2_0= ruleList )
            {
            // InternalTraceryPP.g:175:4: (lv_list_2_0= ruleList )
            // InternalTraceryPP.g:176:5: lv_list_2_0= ruleList
            {

            					newCompositeNode(grammarAccess.getTitleAccess().getListListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_list_2_0=ruleList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTitleRule());
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
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleStartSymbol"
    // InternalTraceryPP.g:197:1: entryRuleStartSymbol returns [EObject current=null] : iv_ruleStartSymbol= ruleStartSymbol EOF ;
    public final EObject entryRuleStartSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartSymbol = null;


        try {
            // InternalTraceryPP.g:197:52: (iv_ruleStartSymbol= ruleStartSymbol EOF )
            // InternalTraceryPP.g:198:2: iv_ruleStartSymbol= ruleStartSymbol EOF
            {
             newCompositeNode(grammarAccess.getStartSymbolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartSymbol=ruleStartSymbol();

            state._fsp--;

             current =iv_ruleStartSymbol; 
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
    // $ANTLR end "entryRuleStartSymbol"


    // $ANTLR start "ruleStartSymbol"
    // InternalTraceryPP.g:204:1: ruleStartSymbol returns [EObject current=null] : ( (lv_title_0_0= RULE_ID ) ) ;
    public final EObject ruleStartSymbol() throws RecognitionException {
        EObject current = null;

        Token lv_title_0_0=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:210:2: ( ( (lv_title_0_0= RULE_ID ) ) )
            // InternalTraceryPP.g:211:2: ( (lv_title_0_0= RULE_ID ) )
            {
            // InternalTraceryPP.g:211:2: ( (lv_title_0_0= RULE_ID ) )
            // InternalTraceryPP.g:212:3: (lv_title_0_0= RULE_ID )
            {
            // InternalTraceryPP.g:212:3: (lv_title_0_0= RULE_ID )
            // InternalTraceryPP.g:213:4: lv_title_0_0= RULE_ID
            {
            lv_title_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_title_0_0, grammarAccess.getStartSymbolAccess().getTitleIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStartSymbolRule());
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
    // $ANTLR end "ruleStartSymbol"


    // $ANTLR start "entryRuleList"
    // InternalTraceryPP.g:232:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalTraceryPP.g:232:45: (iv_ruleList= ruleList EOF )
            // InternalTraceryPP.g:233:2: iv_ruleList= ruleList EOF
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
    // InternalTraceryPP.g:239:1: ruleList returns [EObject current=null] : ( ( (lv_word_0_0= ruleWord ) ) ( (otherlv_1= ', ' | otherlv_2= ',' ) ( (lv_word_3_0= ruleWord ) ) )* ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_word_0_0 = null;

        EObject lv_word_3_0 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:245:2: ( ( ( (lv_word_0_0= ruleWord ) ) ( (otherlv_1= ', ' | otherlv_2= ',' ) ( (lv_word_3_0= ruleWord ) ) )* ) )
            // InternalTraceryPP.g:246:2: ( ( (lv_word_0_0= ruleWord ) ) ( (otherlv_1= ', ' | otherlv_2= ',' ) ( (lv_word_3_0= ruleWord ) ) )* )
            {
            // InternalTraceryPP.g:246:2: ( ( (lv_word_0_0= ruleWord ) ) ( (otherlv_1= ', ' | otherlv_2= ',' ) ( (lv_word_3_0= ruleWord ) ) )* )
            // InternalTraceryPP.g:247:3: ( (lv_word_0_0= ruleWord ) ) ( (otherlv_1= ', ' | otherlv_2= ',' ) ( (lv_word_3_0= ruleWord ) ) )*
            {
            // InternalTraceryPP.g:247:3: ( (lv_word_0_0= ruleWord ) )
            // InternalTraceryPP.g:248:4: (lv_word_0_0= ruleWord )
            {
            // InternalTraceryPP.g:248:4: (lv_word_0_0= ruleWord )
            // InternalTraceryPP.g:249:5: lv_word_0_0= ruleWord
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

            // InternalTraceryPP.g:266:3: ( (otherlv_1= ', ' | otherlv_2= ',' ) ( (lv_word_3_0= ruleWord ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=12 && LA4_0<=13)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTraceryPP.g:267:4: (otherlv_1= ', ' | otherlv_2= ',' ) ( (lv_word_3_0= ruleWord ) )
            	    {
            	    // InternalTraceryPP.g:267:4: (otherlv_1= ', ' | otherlv_2= ',' )
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
            	            // InternalTraceryPP.g:268:5: otherlv_1= ', '
            	            {
            	            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            	            					newLeafNode(otherlv_1, grammarAccess.getListAccess().getCommaSpaceKeyword_1_0_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalTraceryPP.g:273:5: otherlv_2= ','
            	            {
            	            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            	            					newLeafNode(otherlv_2, grammarAccess.getListAccess().getCommaKeyword_1_0_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalTraceryPP.g:278:4: ( (lv_word_3_0= ruleWord ) )
            	    // InternalTraceryPP.g:279:5: (lv_word_3_0= ruleWord )
            	    {
            	    // InternalTraceryPP.g:279:5: (lv_word_3_0= ruleWord )
            	    // InternalTraceryPP.g:280:6: lv_word_3_0= ruleWord
            	    {

            	    						newCompositeNode(grammarAccess.getListAccess().getWordWordParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_word_3_0=ruleWord();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getListRule());
            	    						}
            	    						set(
            	    							current,
            	    							"word",
            	    							lv_word_3_0,
            	    							"uk.ac.kcl.inf.mdd.tracerypp.TraceryPP.Word");
            	    						afterParserOrEnumRuleCall();
            	    					

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
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleWord"
    // InternalTraceryPP.g:302:1: entryRuleWord returns [EObject current=null] : iv_ruleWord= ruleWord EOF ;
    public final EObject entryRuleWord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWord = null;


        try {
            // InternalTraceryPP.g:302:45: (iv_ruleWord= ruleWord EOF )
            // InternalTraceryPP.g:303:2: iv_ruleWord= ruleWord EOF
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
    // InternalTraceryPP.g:309:1: ruleWord returns [EObject current=null] : ( (lv_word_0_0= RULE_STRING ) ) ;
    public final EObject ruleWord() throws RecognitionException {
        EObject current = null;

        Token lv_word_0_0=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:315:2: ( ( (lv_word_0_0= RULE_STRING ) ) )
            // InternalTraceryPP.g:316:2: ( (lv_word_0_0= RULE_STRING ) )
            {
            // InternalTraceryPP.g:316:2: ( (lv_word_0_0= RULE_STRING ) )
            // InternalTraceryPP.g:317:3: (lv_word_0_0= RULE_STRING )
            {
            // InternalTraceryPP.g:317:3: (lv_word_0_0= RULE_STRING )
            // InternalTraceryPP.g:318:4: lv_word_0_0= RULE_STRING
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


    // $ANTLR start "entryRuleSentence"
    // InternalTraceryPP.g:337:1: entryRuleSentence returns [EObject current=null] : iv_ruleSentence= ruleSentence EOF ;
    public final EObject entryRuleSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentence = null;


        try {
            // InternalTraceryPP.g:337:49: (iv_ruleSentence= ruleSentence EOF )
            // InternalTraceryPP.g:338:2: iv_ruleSentence= ruleSentence EOF
            {
             newCompositeNode(grammarAccess.getSentenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSentence=ruleSentence();

            state._fsp--;

             current =iv_ruleSentence; 
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
    // $ANTLR end "entryRuleSentence"


    // $ANTLR start "ruleSentence"
    // InternalTraceryPP.g:344:1: ruleSentence returns [EObject current=null] : ( (lv_word_0_0= RULE_STRING ) ) ;
    public final EObject ruleSentence() throws RecognitionException {
        EObject current = null;

        Token lv_word_0_0=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:350:2: ( ( (lv_word_0_0= RULE_STRING ) ) )
            // InternalTraceryPP.g:351:2: ( (lv_word_0_0= RULE_STRING ) )
            {
            // InternalTraceryPP.g:351:2: ( (lv_word_0_0= RULE_STRING ) )
            // InternalTraceryPP.g:352:3: (lv_word_0_0= RULE_STRING )
            {
            // InternalTraceryPP.g:352:3: (lv_word_0_0= RULE_STRING )
            // InternalTraceryPP.g:353:4: lv_word_0_0= RULE_STRING
            {
            lv_word_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_word_0_0, grammarAccess.getSentenceAccess().getWordSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSentenceRule());
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
    // $ANTLR end "ruleSentence"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000003002L});

}