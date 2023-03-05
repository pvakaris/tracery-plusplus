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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'The story looks like this:'", "' can have values: '", "' can be: '", "' is an object.'", "'It has these attributes: '", "'='", "'.'", "','", "'or'", "'.capitalize'", "'.CAPITALIZE'", "'.s'", "'.a'", "'.ed'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalTraceryPP.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_statements_0_0= ruleStatement ) )* ( (lv_story_1_0= ruleStory ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;

        EObject lv_story_1_0 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:77:2: ( ( ( (lv_statements_0_0= ruleStatement ) )* ( (lv_story_1_0= ruleStory ) ) ) )
            // InternalTraceryPP.g:78:2: ( ( (lv_statements_0_0= ruleStatement ) )* ( (lv_story_1_0= ruleStory ) ) )
            {
            // InternalTraceryPP.g:78:2: ( ( (lv_statements_0_0= ruleStatement ) )* ( (lv_story_1_0= ruleStory ) ) )
            // InternalTraceryPP.g:79:3: ( (lv_statements_0_0= ruleStatement ) )* ( (lv_story_1_0= ruleStory ) )
            {
            // InternalTraceryPP.g:79:3: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTraceryPP.g:80:4: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalTraceryPP.g:80:4: (lv_statements_0_0= ruleStatement )
            	    // InternalTraceryPP.g:81:5: lv_statements_0_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0_0());
            	    				
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

            // InternalTraceryPP.g:98:3: ( (lv_story_1_0= ruleStory ) )
            // InternalTraceryPP.g:99:4: (lv_story_1_0= ruleStory )
            {
            // InternalTraceryPP.g:99:4: (lv_story_1_0= ruleStory )
            // InternalTraceryPP.g:100:5: lv_story_1_0= ruleStory
            {

            					newCompositeNode(grammarAccess.getModelAccess().getStoryStoryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_story_1_0=ruleStory();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"story",
            						lv_story_1_0,
            						"uk.ac.kcl.inf.mdd.tracerypp.TraceryPP.Story");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStatement"
    // InternalTraceryPP.g:121:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalTraceryPP.g:121:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalTraceryPP.g:122:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalTraceryPP.g:128:1: ruleStatement returns [EObject current=null] : this_Definition_0= ruleDefinition ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Definition_0 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:134:2: (this_Definition_0= ruleDefinition )
            // InternalTraceryPP.g:135:2: this_Definition_0= ruleDefinition
            {

            		newCompositeNode(grammarAccess.getStatementAccess().getDefinitionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Definition_0=ruleDefinition();

            state._fsp--;


            		current = this_Definition_0;
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


    // $ANTLR start "entryRuleDefinition"
    // InternalTraceryPP.g:146:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalTraceryPP.g:146:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalTraceryPP.g:147:2: iv_ruleDefinition= ruleDefinition EOF
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
    // InternalTraceryPP.g:153:1: ruleDefinition returns [EObject current=null] : (this_ListDefinition_0= ruleListDefinition | this_ObjectDefinition_1= ruleObjectDefinition ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_ListDefinition_0 = null;

        EObject this_ObjectDefinition_1 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:159:2: ( (this_ListDefinition_0= ruleListDefinition | this_ObjectDefinition_1= ruleObjectDefinition ) )
            // InternalTraceryPP.g:160:2: (this_ListDefinition_0= ruleListDefinition | this_ObjectDefinition_1= ruleObjectDefinition )
            {
            // InternalTraceryPP.g:160:2: (this_ListDefinition_0= ruleListDefinition | this_ObjectDefinition_1= ruleObjectDefinition )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==14) ) {
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
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTraceryPP.g:161:3: this_ListDefinition_0= ruleListDefinition
                    {

                    			newCompositeNode(grammarAccess.getDefinitionAccess().getListDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListDefinition_0=ruleListDefinition();

                    state._fsp--;


                    			current = this_ListDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:170:3: this_ObjectDefinition_1= ruleObjectDefinition
                    {

                    			newCompositeNode(grammarAccess.getDefinitionAccess().getObjectDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectDefinition_1=ruleObjectDefinition();

                    state._fsp--;


                    			current = this_ObjectDefinition_1;
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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleStory"
    // InternalTraceryPP.g:182:1: entryRuleStory returns [EObject current=null] : iv_ruleStory= ruleStory EOF ;
    public final EObject entryRuleStory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStory = null;


        try {
            // InternalTraceryPP.g:182:46: (iv_ruleStory= ruleStory EOF )
            // InternalTraceryPP.g:183:2: iv_ruleStory= ruleStory EOF
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
    // InternalTraceryPP.g:189:1: ruleStory returns [EObject current=null] : (otherlv_0= 'The story looks like this:' ( ( (lv_story_1_1= ruleWord | lv_story_1_2= ruleStoryVariable | lv_story_1_3= ruleObjectAttribute ) ) )* ) ;
    public final EObject ruleStory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_story_1_1 = null;

        EObject lv_story_1_2 = null;

        EObject lv_story_1_3 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:195:2: ( (otherlv_0= 'The story looks like this:' ( ( (lv_story_1_1= ruleWord | lv_story_1_2= ruleStoryVariable | lv_story_1_3= ruleObjectAttribute ) ) )* ) )
            // InternalTraceryPP.g:196:2: (otherlv_0= 'The story looks like this:' ( ( (lv_story_1_1= ruleWord | lv_story_1_2= ruleStoryVariable | lv_story_1_3= ruleObjectAttribute ) ) )* )
            {
            // InternalTraceryPP.g:196:2: (otherlv_0= 'The story looks like this:' ( ( (lv_story_1_1= ruleWord | lv_story_1_2= ruleStoryVariable | lv_story_1_3= ruleObjectAttribute ) ) )* )
            // InternalTraceryPP.g:197:3: otherlv_0= 'The story looks like this:' ( ( (lv_story_1_1= ruleWord | lv_story_1_2= ruleStoryVariable | lv_story_1_3= ruleObjectAttribute ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStoryAccess().getTheStoryLooksLikeThisKeyword_0());
            		
            // InternalTraceryPP.g:201:3: ( ( (lv_story_1_1= ruleWord | lv_story_1_2= ruleStoryVariable | lv_story_1_3= ruleObjectAttribute ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTraceryPP.g:202:4: ( (lv_story_1_1= ruleWord | lv_story_1_2= ruleStoryVariable | lv_story_1_3= ruleObjectAttribute ) )
            	    {
            	    // InternalTraceryPP.g:202:4: ( (lv_story_1_1= ruleWord | lv_story_1_2= ruleStoryVariable | lv_story_1_3= ruleObjectAttribute ) )
            	    // InternalTraceryPP.g:203:5: (lv_story_1_1= ruleWord | lv_story_1_2= ruleStoryVariable | lv_story_1_3= ruleObjectAttribute )
            	    {
            	    // InternalTraceryPP.g:203:5: (lv_story_1_1= ruleWord | lv_story_1_2= ruleStoryVariable | lv_story_1_3= ruleObjectAttribute )
            	    int alt3=3;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==RULE_STRING) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==RULE_ID) ) {
            	        int LA3_2 = input.LA(2);

            	        if ( (LA3_2==17) ) {
            	            alt3=3;
            	        }
            	        else if ( (LA3_2==EOF||(LA3_2>=RULE_STRING && LA3_2<=RULE_ID)||(LA3_2>=20 && LA3_2<=24)) ) {
            	            alt3=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 3, 2, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalTraceryPP.g:204:6: lv_story_1_1= ruleWord
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
            	            // InternalTraceryPP.g:220:6: lv_story_1_2= ruleStoryVariable
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
            	        case 3 :
            	            // InternalTraceryPP.g:236:6: lv_story_1_3= ruleObjectAttribute
            	            {

            	            						newCompositeNode(grammarAccess.getStoryAccess().getStoryObjectAttributeParserRuleCall_1_0_2());
            	            					
            	            pushFollow(FOLLOW_4);
            	            lv_story_1_3=ruleObjectAttribute();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getStoryRule());
            	            						}
            	            						add(
            	            							current,
            	            							"story",
            	            							lv_story_1_3,
            	            							"uk.ac.kcl.inf.mdd.tracerypp.TraceryPP.ObjectAttribute");
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
    // InternalTraceryPP.g:258:1: entryRuleListDefinition returns [EObject current=null] : iv_ruleListDefinition= ruleListDefinition EOF ;
    public final EObject entryRuleListDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListDefinition = null;


        try {
            // InternalTraceryPP.g:258:55: (iv_ruleListDefinition= ruleListDefinition EOF )
            // InternalTraceryPP.g:259:2: iv_ruleListDefinition= ruleListDefinition EOF
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
    // InternalTraceryPP.g:265:1: ruleListDefinition returns [EObject current=null] : ( ( (lv_start_symbol_0_0= ruleVariable ) ) (otherlv_1= ' can have values: ' | otherlv_2= ' can be: ' ) ( (lv_list_3_0= ruleWordList ) ) ) ;
    public final EObject ruleListDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_start_symbol_0_0 = null;

        EObject lv_list_3_0 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:271:2: ( ( ( (lv_start_symbol_0_0= ruleVariable ) ) (otherlv_1= ' can have values: ' | otherlv_2= ' can be: ' ) ( (lv_list_3_0= ruleWordList ) ) ) )
            // InternalTraceryPP.g:272:2: ( ( (lv_start_symbol_0_0= ruleVariable ) ) (otherlv_1= ' can have values: ' | otherlv_2= ' can be: ' ) ( (lv_list_3_0= ruleWordList ) ) )
            {
            // InternalTraceryPP.g:272:2: ( ( (lv_start_symbol_0_0= ruleVariable ) ) (otherlv_1= ' can have values: ' | otherlv_2= ' can be: ' ) ( (lv_list_3_0= ruleWordList ) ) )
            // InternalTraceryPP.g:273:3: ( (lv_start_symbol_0_0= ruleVariable ) ) (otherlv_1= ' can have values: ' | otherlv_2= ' can be: ' ) ( (lv_list_3_0= ruleWordList ) )
            {
            // InternalTraceryPP.g:273:3: ( (lv_start_symbol_0_0= ruleVariable ) )
            // InternalTraceryPP.g:274:4: (lv_start_symbol_0_0= ruleVariable )
            {
            // InternalTraceryPP.g:274:4: (lv_start_symbol_0_0= ruleVariable )
            // InternalTraceryPP.g:275:5: lv_start_symbol_0_0= ruleVariable
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

            // InternalTraceryPP.g:292:3: (otherlv_1= ' can have values: ' | otherlv_2= ' can be: ' )
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
                    // InternalTraceryPP.g:293:4: otherlv_1= ' can have values: '
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getListDefinitionAccess().getCanHaveValuesKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:298:4: otherlv_2= ' can be: '
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getListDefinitionAccess().getCanBeKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalTraceryPP.g:303:3: ( (lv_list_3_0= ruleWordList ) )
            // InternalTraceryPP.g:304:4: (lv_list_3_0= ruleWordList )
            {
            // InternalTraceryPP.g:304:4: (lv_list_3_0= ruleWordList )
            // InternalTraceryPP.g:305:5: lv_list_3_0= ruleWordList
            {

            					newCompositeNode(grammarAccess.getListDefinitionAccess().getListWordListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_list_3_0=ruleWordList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListDefinitionRule());
            					}
            					set(
            						current,
            						"list",
            						lv_list_3_0,
            						"uk.ac.kcl.inf.mdd.tracerypp.TraceryPP.WordList");
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


    // $ANTLR start "entryRuleObjectDefinition"
    // InternalTraceryPP.g:326:1: entryRuleObjectDefinition returns [EObject current=null] : iv_ruleObjectDefinition= ruleObjectDefinition EOF ;
    public final EObject entryRuleObjectDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectDefinition = null;


        try {
            // InternalTraceryPP.g:326:57: (iv_ruleObjectDefinition= ruleObjectDefinition EOF )
            // InternalTraceryPP.g:327:2: iv_ruleObjectDefinition= ruleObjectDefinition EOF
            {
             newCompositeNode(grammarAccess.getObjectDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectDefinition=ruleObjectDefinition();

            state._fsp--;

             current =iv_ruleObjectDefinition; 
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
    // $ANTLR end "entryRuleObjectDefinition"


    // $ANTLR start "ruleObjectDefinition"
    // InternalTraceryPP.g:333:1: ruleObjectDefinition returns [EObject current=null] : ( ( (lv_object_0_0= ruleVariable ) ) otherlv_1= ' is an object.' otherlv_2= 'It has these attributes: ' ( (lv_attributes_3_0= ruleAttributeList ) ) ) ;
    public final EObject ruleObjectDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_object_0_0 = null;

        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:339:2: ( ( ( (lv_object_0_0= ruleVariable ) ) otherlv_1= ' is an object.' otherlv_2= 'It has these attributes: ' ( (lv_attributes_3_0= ruleAttributeList ) ) ) )
            // InternalTraceryPP.g:340:2: ( ( (lv_object_0_0= ruleVariable ) ) otherlv_1= ' is an object.' otherlv_2= 'It has these attributes: ' ( (lv_attributes_3_0= ruleAttributeList ) ) )
            {
            // InternalTraceryPP.g:340:2: ( ( (lv_object_0_0= ruleVariable ) ) otherlv_1= ' is an object.' otherlv_2= 'It has these attributes: ' ( (lv_attributes_3_0= ruleAttributeList ) ) )
            // InternalTraceryPP.g:341:3: ( (lv_object_0_0= ruleVariable ) ) otherlv_1= ' is an object.' otherlv_2= 'It has these attributes: ' ( (lv_attributes_3_0= ruleAttributeList ) )
            {
            // InternalTraceryPP.g:341:3: ( (lv_object_0_0= ruleVariable ) )
            // InternalTraceryPP.g:342:4: (lv_object_0_0= ruleVariable )
            {
            // InternalTraceryPP.g:342:4: (lv_object_0_0= ruleVariable )
            // InternalTraceryPP.g:343:5: lv_object_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getObjectDefinitionAccess().getObjectVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_object_0_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectDefinitionRule());
            					}
            					set(
            						current,
            						"object",
            						lv_object_0_0,
            						"uk.ac.kcl.inf.mdd.tracerypp.TraceryPP.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectDefinitionAccess().getIsAnObjectKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getObjectDefinitionAccess().getItHasTheseAttributesKeyword_2());
            		
            // InternalTraceryPP.g:368:3: ( (lv_attributes_3_0= ruleAttributeList ) )
            // InternalTraceryPP.g:369:4: (lv_attributes_3_0= ruleAttributeList )
            {
            // InternalTraceryPP.g:369:4: (lv_attributes_3_0= ruleAttributeList )
            // InternalTraceryPP.g:370:5: lv_attributes_3_0= ruleAttributeList
            {

            					newCompositeNode(grammarAccess.getObjectDefinitionAccess().getAttributesAttributeListParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_attributes_3_0=ruleAttributeList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectDefinitionRule());
            					}
            					set(
            						current,
            						"attributes",
            						lv_attributes_3_0,
            						"uk.ac.kcl.inf.mdd.tracerypp.TraceryPP.AttributeList");
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
    // $ANTLR end "ruleObjectDefinition"


    // $ANTLR start "entryRuleWord"
    // InternalTraceryPP.g:391:1: entryRuleWord returns [EObject current=null] : iv_ruleWord= ruleWord EOF ;
    public final EObject entryRuleWord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWord = null;


        try {
            // InternalTraceryPP.g:391:45: (iv_ruleWord= ruleWord EOF )
            // InternalTraceryPP.g:392:2: iv_ruleWord= ruleWord EOF
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
    // InternalTraceryPP.g:398:1: ruleWord returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleWord() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:404:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalTraceryPP.g:405:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalTraceryPP.g:405:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalTraceryPP.g:406:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalTraceryPP.g:406:3: (lv_value_0_0= RULE_STRING )
            // InternalTraceryPP.g:407:4: lv_value_0_0= RULE_STRING
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


    // $ANTLR start "entryRuleVariable"
    // InternalTraceryPP.g:426:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalTraceryPP.g:426:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalTraceryPP.g:427:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalTraceryPP.g:433:1: ruleVariable returns [EObject current=null] : ( (lv_value_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:439:2: ( ( (lv_value_0_0= RULE_ID ) ) )
            // InternalTraceryPP.g:440:2: ( (lv_value_0_0= RULE_ID ) )
            {
            // InternalTraceryPP.g:440:2: ( (lv_value_0_0= RULE_ID ) )
            // InternalTraceryPP.g:441:3: (lv_value_0_0= RULE_ID )
            {
            // InternalTraceryPP.g:441:3: (lv_value_0_0= RULE_ID )
            // InternalTraceryPP.g:442:4: lv_value_0_0= RULE_ID
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


    // $ANTLR start "entryRuleStoryVariable"
    // InternalTraceryPP.g:461:1: entryRuleStoryVariable returns [EObject current=null] : iv_ruleStoryVariable= ruleStoryVariable EOF ;
    public final EObject entryRuleStoryVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStoryVariable = null;


        try {
            // InternalTraceryPP.g:461:54: (iv_ruleStoryVariable= ruleStoryVariable EOF )
            // InternalTraceryPP.g:462:2: iv_ruleStoryVariable= ruleStoryVariable EOF
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
    // InternalTraceryPP.g:468:1: ruleStoryVariable returns [EObject current=null] : ( ( (lv_value_0_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )* ) ;
    public final EObject ruleStoryVariable() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        AntlrDatatypeRuleToken lv_modifiers_1_0 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:474:2: ( ( ( (lv_value_0_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )* ) )
            // InternalTraceryPP.g:475:2: ( ( (lv_value_0_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )* )
            {
            // InternalTraceryPP.g:475:2: ( ( (lv_value_0_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )* )
            // InternalTraceryPP.g:476:3: ( (lv_value_0_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )*
            {
            // InternalTraceryPP.g:476:3: ( (lv_value_0_0= RULE_ID ) )
            // InternalTraceryPP.g:477:4: (lv_value_0_0= RULE_ID )
            {
            // InternalTraceryPP.g:477:4: (lv_value_0_0= RULE_ID )
            // InternalTraceryPP.g:478:5: lv_value_0_0= RULE_ID
            {
            lv_value_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            // InternalTraceryPP.g:494:3: ( (lv_modifiers_1_0= ruleModifier ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=20 && LA6_0<=24)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTraceryPP.g:495:4: (lv_modifiers_1_0= ruleModifier )
            	    {
            	    // InternalTraceryPP.g:495:4: (lv_modifiers_1_0= ruleModifier )
            	    // InternalTraceryPP.g:496:5: lv_modifiers_1_0= ruleModifier
            	    {

            	    					newCompositeNode(grammarAccess.getStoryVariableAccess().getModifiersModifierParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_10);
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
    // $ANTLR end "ruleStoryVariable"


    // $ANTLR start "entryRuleAttribute"
    // InternalTraceryPP.g:517:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalTraceryPP.g:517:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalTraceryPP.g:518:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalTraceryPP.g:524:1: ruleAttribute returns [EObject current=null] : ( (lv_definition_0_0= RULE_ID ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_definition_0_0=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:530:2: ( ( (lv_definition_0_0= RULE_ID ) ) )
            // InternalTraceryPP.g:531:2: ( (lv_definition_0_0= RULE_ID ) )
            {
            // InternalTraceryPP.g:531:2: ( (lv_definition_0_0= RULE_ID ) )
            // InternalTraceryPP.g:532:3: (lv_definition_0_0= RULE_ID )
            {
            // InternalTraceryPP.g:532:3: (lv_definition_0_0= RULE_ID )
            // InternalTraceryPP.g:533:4: lv_definition_0_0= RULE_ID
            {
            lv_definition_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_definition_0_0, grammarAccess.getAttributeAccess().getDefinitionIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAttributeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"definition",
            					lv_definition_0_0,
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAdvancedAttribute"
    // InternalTraceryPP.g:552:1: entryRuleAdvancedAttribute returns [EObject current=null] : iv_ruleAdvancedAttribute= ruleAdvancedAttribute EOF ;
    public final EObject entryRuleAdvancedAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdvancedAttribute = null;


        try {
            // InternalTraceryPP.g:552:58: (iv_ruleAdvancedAttribute= ruleAdvancedAttribute EOF )
            // InternalTraceryPP.g:553:2: iv_ruleAdvancedAttribute= ruleAdvancedAttribute EOF
            {
             newCompositeNode(grammarAccess.getAdvancedAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdvancedAttribute=ruleAdvancedAttribute();

            state._fsp--;

             current =iv_ruleAdvancedAttribute; 
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
    // $ANTLR end "entryRuleAdvancedAttribute"


    // $ANTLR start "ruleAdvancedAttribute"
    // InternalTraceryPP.g:559:1: ruleAdvancedAttribute returns [EObject current=null] : ( ( (lv_definition_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleAdvancedAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_definition_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:565:2: ( ( ( (lv_definition_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalTraceryPP.g:566:2: ( ( (lv_definition_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalTraceryPP.g:566:2: ( ( (lv_definition_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalTraceryPP.g:567:3: ( (lv_definition_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalTraceryPP.g:567:3: ( (lv_definition_0_0= RULE_ID ) )
            // InternalTraceryPP.g:568:4: (lv_definition_0_0= RULE_ID )
            {
            // InternalTraceryPP.g:568:4: (lv_definition_0_0= RULE_ID )
            // InternalTraceryPP.g:569:5: lv_definition_0_0= RULE_ID
            {
            lv_definition_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_definition_0_0, grammarAccess.getAdvancedAttributeAccess().getDefinitionIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAdvancedAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"definition",
            						lv_definition_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAdvancedAttributeAccess().getEqualsSignKeyword_1());
            		
            // InternalTraceryPP.g:589:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalTraceryPP.g:590:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalTraceryPP.g:590:4: (lv_value_2_0= RULE_STRING )
            // InternalTraceryPP.g:591:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getAdvancedAttributeAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAdvancedAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleAdvancedAttribute"


    // $ANTLR start "entryRuleObjectAttribute"
    // InternalTraceryPP.g:611:1: entryRuleObjectAttribute returns [EObject current=null] : iv_ruleObjectAttribute= ruleObjectAttribute EOF ;
    public final EObject entryRuleObjectAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectAttribute = null;


        try {
            // InternalTraceryPP.g:611:56: (iv_ruleObjectAttribute= ruleObjectAttribute EOF )
            // InternalTraceryPP.g:612:2: iv_ruleObjectAttribute= ruleObjectAttribute EOF
            {
             newCompositeNode(grammarAccess.getObjectAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectAttribute=ruleObjectAttribute();

            state._fsp--;

             current =iv_ruleObjectAttribute; 
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
    // $ANTLR end "entryRuleObjectAttribute"


    // $ANTLR start "ruleObjectAttribute"
    // InternalTraceryPP.g:618:1: ruleObjectAttribute returns [EObject current=null] : ( ( (lv_object_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_attribute_2_0= RULE_ID ) ) ) ;
    public final EObject ruleObjectAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_object_0_0=null;
        Token otherlv_1=null;
        Token lv_attribute_2_0=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:624:2: ( ( ( (lv_object_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_attribute_2_0= RULE_ID ) ) ) )
            // InternalTraceryPP.g:625:2: ( ( (lv_object_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_attribute_2_0= RULE_ID ) ) )
            {
            // InternalTraceryPP.g:625:2: ( ( (lv_object_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_attribute_2_0= RULE_ID ) ) )
            // InternalTraceryPP.g:626:3: ( (lv_object_0_0= RULE_ID ) ) otherlv_1= '.' ( (lv_attribute_2_0= RULE_ID ) )
            {
            // InternalTraceryPP.g:626:3: ( (lv_object_0_0= RULE_ID ) )
            // InternalTraceryPP.g:627:4: (lv_object_0_0= RULE_ID )
            {
            // InternalTraceryPP.g:627:4: (lv_object_0_0= RULE_ID )
            // InternalTraceryPP.g:628:5: lv_object_0_0= RULE_ID
            {
            lv_object_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_object_0_0, grammarAccess.getObjectAttributeAccess().getObjectIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"object",
            						lv_object_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectAttributeAccess().getFullStopKeyword_1());
            		
            // InternalTraceryPP.g:648:3: ( (lv_attribute_2_0= RULE_ID ) )
            // InternalTraceryPP.g:649:4: (lv_attribute_2_0= RULE_ID )
            {
            // InternalTraceryPP.g:649:4: (lv_attribute_2_0= RULE_ID )
            // InternalTraceryPP.g:650:5: lv_attribute_2_0= RULE_ID
            {
            lv_attribute_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_attribute_2_0, grammarAccess.getObjectAttributeAccess().getAttributeIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"attribute",
            						lv_attribute_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleObjectAttribute"


    // $ANTLR start "entryRuleWordList"
    // InternalTraceryPP.g:670:1: entryRuleWordList returns [EObject current=null] : iv_ruleWordList= ruleWordList EOF ;
    public final EObject entryRuleWordList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordList = null;


        try {
            // InternalTraceryPP.g:670:49: (iv_ruleWordList= ruleWordList EOF )
            // InternalTraceryPP.g:671:2: iv_ruleWordList= ruleWordList EOF
            {
             newCompositeNode(grammarAccess.getWordListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWordList=ruleWordList();

            state._fsp--;

             current =iv_ruleWordList; 
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
    // $ANTLR end "entryRuleWordList"


    // $ANTLR start "ruleWordList"
    // InternalTraceryPP.g:677:1: ruleWordList returns [EObject current=null] : ( ( (lv_words_0_0= ruleWord ) ) ( ( (lv_sep_1_0= ruleSeparator ) ) ( (lv_word_2_0= ruleWord ) ) )* ) ;
    public final EObject ruleWordList() throws RecognitionException {
        EObject current = null;

        EObject lv_words_0_0 = null;

        AntlrDatatypeRuleToken lv_sep_1_0 = null;

        EObject lv_word_2_0 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:683:2: ( ( ( (lv_words_0_0= ruleWord ) ) ( ( (lv_sep_1_0= ruleSeparator ) ) ( (lv_word_2_0= ruleWord ) ) )* ) )
            // InternalTraceryPP.g:684:2: ( ( (lv_words_0_0= ruleWord ) ) ( ( (lv_sep_1_0= ruleSeparator ) ) ( (lv_word_2_0= ruleWord ) ) )* )
            {
            // InternalTraceryPP.g:684:2: ( ( (lv_words_0_0= ruleWord ) ) ( ( (lv_sep_1_0= ruleSeparator ) ) ( (lv_word_2_0= ruleWord ) ) )* )
            // InternalTraceryPP.g:685:3: ( (lv_words_0_0= ruleWord ) ) ( ( (lv_sep_1_0= ruleSeparator ) ) ( (lv_word_2_0= ruleWord ) ) )*
            {
            // InternalTraceryPP.g:685:3: ( (lv_words_0_0= ruleWord ) )
            // InternalTraceryPP.g:686:4: (lv_words_0_0= ruleWord )
            {
            // InternalTraceryPP.g:686:4: (lv_words_0_0= ruleWord )
            // InternalTraceryPP.g:687:5: lv_words_0_0= ruleWord
            {

            					newCompositeNode(grammarAccess.getWordListAccess().getWordsWordParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_words_0_0=ruleWord();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWordListRule());
            					}
            					add(
            						current,
            						"words",
            						lv_words_0_0,
            						"uk.ac.kcl.inf.mdd.tracerypp.TraceryPP.Word");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTraceryPP.g:704:3: ( ( (lv_sep_1_0= ruleSeparator ) ) ( (lv_word_2_0= ruleWord ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=18 && LA7_0<=19)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTraceryPP.g:705:4: ( (lv_sep_1_0= ruleSeparator ) ) ( (lv_word_2_0= ruleWord ) )
            	    {
            	    // InternalTraceryPP.g:705:4: ( (lv_sep_1_0= ruleSeparator ) )
            	    // InternalTraceryPP.g:706:5: (lv_sep_1_0= ruleSeparator )
            	    {
            	    // InternalTraceryPP.g:706:5: (lv_sep_1_0= ruleSeparator )
            	    // InternalTraceryPP.g:707:6: lv_sep_1_0= ruleSeparator
            	    {

            	    						newCompositeNode(grammarAccess.getWordListAccess().getSepSeparatorParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_sep_1_0=ruleSeparator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWordListRule());
            	    						}
            	    						set(
            	    							current,
            	    							"sep",
            	    							lv_sep_1_0,
            	    							"uk.ac.kcl.inf.mdd.tracerypp.TraceryPP.Separator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalTraceryPP.g:724:4: ( (lv_word_2_0= ruleWord ) )
            	    // InternalTraceryPP.g:725:5: (lv_word_2_0= ruleWord )
            	    {
            	    // InternalTraceryPP.g:725:5: (lv_word_2_0= ruleWord )
            	    // InternalTraceryPP.g:726:6: lv_word_2_0= ruleWord
            	    {

            	    						newCompositeNode(grammarAccess.getWordListAccess().getWordWordParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_word_2_0=ruleWord();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWordListRule());
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
            	    break loop7;
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
    // $ANTLR end "ruleWordList"


    // $ANTLR start "entryRuleAttributeList"
    // InternalTraceryPP.g:748:1: entryRuleAttributeList returns [EObject current=null] : iv_ruleAttributeList= ruleAttributeList EOF ;
    public final EObject entryRuleAttributeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeList = null;


        try {
            // InternalTraceryPP.g:748:54: (iv_ruleAttributeList= ruleAttributeList EOF )
            // InternalTraceryPP.g:749:2: iv_ruleAttributeList= ruleAttributeList EOF
            {
             newCompositeNode(grammarAccess.getAttributeListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeList=ruleAttributeList();

            state._fsp--;

             current =iv_ruleAttributeList; 
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
    // $ANTLR end "entryRuleAttributeList"


    // $ANTLR start "ruleAttributeList"
    // InternalTraceryPP.g:755:1: ruleAttributeList returns [EObject current=null] : ( ( ( (lv_attributes_0_1= ruleAttribute | lv_attributes_0_2= ruleAdvancedAttribute ) ) ) ( ( (lv_sep_1_0= ruleSeparator ) ) ( ( (lv_attribute_2_1= ruleAttribute | lv_attribute_2_2= ruleAdvancedAttribute ) ) ) )* ) ;
    public final EObject ruleAttributeList() throws RecognitionException {
        EObject current = null;

        EObject lv_attributes_0_1 = null;

        EObject lv_attributes_0_2 = null;

        AntlrDatatypeRuleToken lv_sep_1_0 = null;

        EObject lv_attribute_2_1 = null;

        EObject lv_attribute_2_2 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:761:2: ( ( ( ( (lv_attributes_0_1= ruleAttribute | lv_attributes_0_2= ruleAdvancedAttribute ) ) ) ( ( (lv_sep_1_0= ruleSeparator ) ) ( ( (lv_attribute_2_1= ruleAttribute | lv_attribute_2_2= ruleAdvancedAttribute ) ) ) )* ) )
            // InternalTraceryPP.g:762:2: ( ( ( (lv_attributes_0_1= ruleAttribute | lv_attributes_0_2= ruleAdvancedAttribute ) ) ) ( ( (lv_sep_1_0= ruleSeparator ) ) ( ( (lv_attribute_2_1= ruleAttribute | lv_attribute_2_2= ruleAdvancedAttribute ) ) ) )* )
            {
            // InternalTraceryPP.g:762:2: ( ( ( (lv_attributes_0_1= ruleAttribute | lv_attributes_0_2= ruleAdvancedAttribute ) ) ) ( ( (lv_sep_1_0= ruleSeparator ) ) ( ( (lv_attribute_2_1= ruleAttribute | lv_attribute_2_2= ruleAdvancedAttribute ) ) ) )* )
            // InternalTraceryPP.g:763:3: ( ( (lv_attributes_0_1= ruleAttribute | lv_attributes_0_2= ruleAdvancedAttribute ) ) ) ( ( (lv_sep_1_0= ruleSeparator ) ) ( ( (lv_attribute_2_1= ruleAttribute | lv_attribute_2_2= ruleAdvancedAttribute ) ) ) )*
            {
            // InternalTraceryPP.g:763:3: ( ( (lv_attributes_0_1= ruleAttribute | lv_attributes_0_2= ruleAdvancedAttribute ) ) )
            // InternalTraceryPP.g:764:4: ( (lv_attributes_0_1= ruleAttribute | lv_attributes_0_2= ruleAdvancedAttribute ) )
            {
            // InternalTraceryPP.g:764:4: ( (lv_attributes_0_1= ruleAttribute | lv_attributes_0_2= ruleAdvancedAttribute ) )
            // InternalTraceryPP.g:765:5: (lv_attributes_0_1= ruleAttribute | lv_attributes_0_2= ruleAdvancedAttribute )
            {
            // InternalTraceryPP.g:765:5: (lv_attributes_0_1= ruleAttribute | lv_attributes_0_2= ruleAdvancedAttribute )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==EOF||LA8_1==RULE_ID||LA8_1==11||(LA8_1>=18 && LA8_1<=19)) ) {
                    alt8=1;
                }
                else if ( (LA8_1==16) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTraceryPP.g:766:6: lv_attributes_0_1= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_attributes_0_1=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeListRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_0_1,
                    							"uk.ac.kcl.inf.mdd.tracerypp.TraceryPP.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:782:6: lv_attributes_0_2= ruleAdvancedAttribute
                    {

                    						newCompositeNode(grammarAccess.getAttributeListAccess().getAttributesAdvancedAttributeParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_13);
                    lv_attributes_0_2=ruleAdvancedAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeListRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_0_2,
                    							"uk.ac.kcl.inf.mdd.tracerypp.TraceryPP.AdvancedAttribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalTraceryPP.g:800:3: ( ( (lv_sep_1_0= ruleSeparator ) ) ( ( (lv_attribute_2_1= ruleAttribute | lv_attribute_2_2= ruleAdvancedAttribute ) ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=18 && LA10_0<=19)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTraceryPP.g:801:4: ( (lv_sep_1_0= ruleSeparator ) ) ( ( (lv_attribute_2_1= ruleAttribute | lv_attribute_2_2= ruleAdvancedAttribute ) ) )
            	    {
            	    // InternalTraceryPP.g:801:4: ( (lv_sep_1_0= ruleSeparator ) )
            	    // InternalTraceryPP.g:802:5: (lv_sep_1_0= ruleSeparator )
            	    {
            	    // InternalTraceryPP.g:802:5: (lv_sep_1_0= ruleSeparator )
            	    // InternalTraceryPP.g:803:6: lv_sep_1_0= ruleSeparator
            	    {

            	    						newCompositeNode(grammarAccess.getAttributeListAccess().getSepSeparatorParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_sep_1_0=ruleSeparator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAttributeListRule());
            	    						}
            	    						set(
            	    							current,
            	    							"sep",
            	    							lv_sep_1_0,
            	    							"uk.ac.kcl.inf.mdd.tracerypp.TraceryPP.Separator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalTraceryPP.g:820:4: ( ( (lv_attribute_2_1= ruleAttribute | lv_attribute_2_2= ruleAdvancedAttribute ) ) )
            	    // InternalTraceryPP.g:821:5: ( (lv_attribute_2_1= ruleAttribute | lv_attribute_2_2= ruleAdvancedAttribute ) )
            	    {
            	    // InternalTraceryPP.g:821:5: ( (lv_attribute_2_1= ruleAttribute | lv_attribute_2_2= ruleAdvancedAttribute ) )
            	    // InternalTraceryPP.g:822:6: (lv_attribute_2_1= ruleAttribute | lv_attribute_2_2= ruleAdvancedAttribute )
            	    {
            	    // InternalTraceryPP.g:822:6: (lv_attribute_2_1= ruleAttribute | lv_attribute_2_2= ruleAdvancedAttribute )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==RULE_ID) ) {
            	        int LA9_1 = input.LA(2);

            	        if ( (LA9_1==16) ) {
            	            alt9=2;
            	        }
            	        else if ( (LA9_1==EOF||LA9_1==RULE_ID||LA9_1==11||(LA9_1>=18 && LA9_1<=19)) ) {
            	            alt9=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 9, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalTraceryPP.g:823:7: lv_attribute_2_1= ruleAttribute
            	            {

            	            							newCompositeNode(grammarAccess.getAttributeListAccess().getAttributeAttributeParserRuleCall_1_1_0_0());
            	            						
            	            pushFollow(FOLLOW_13);
            	            lv_attribute_2_1=ruleAttribute();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getAttributeListRule());
            	            							}
            	            							set(
            	            								current,
            	            								"attribute",
            	            								lv_attribute_2_1,
            	            								"uk.ac.kcl.inf.mdd.tracerypp.TraceryPP.Attribute");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalTraceryPP.g:839:7: lv_attribute_2_2= ruleAdvancedAttribute
            	            {

            	            							newCompositeNode(grammarAccess.getAttributeListAccess().getAttributeAdvancedAttributeParserRuleCall_1_1_0_1());
            	            						
            	            pushFollow(FOLLOW_13);
            	            lv_attribute_2_2=ruleAdvancedAttribute();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getAttributeListRule());
            	            							}
            	            							set(
            	            								current,
            	            								"attribute",
            	            								lv_attribute_2_2,
            	            								"uk.ac.kcl.inf.mdd.tracerypp.TraceryPP.AdvancedAttribute");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleAttributeList"


    // $ANTLR start "entryRuleSeparator"
    // InternalTraceryPP.g:862:1: entryRuleSeparator returns [String current=null] : iv_ruleSeparator= ruleSeparator EOF ;
    public final String entryRuleSeparator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSeparator = null;


        try {
            // InternalTraceryPP.g:862:49: (iv_ruleSeparator= ruleSeparator EOF )
            // InternalTraceryPP.g:863:2: iv_ruleSeparator= ruleSeparator EOF
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
    // InternalTraceryPP.g:869:1: ruleSeparator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ',' | kw= 'or' ) ;
    public final AntlrDatatypeRuleToken ruleSeparator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:875:2: ( (kw= ',' | kw= 'or' ) )
            // InternalTraceryPP.g:876:2: (kw= ',' | kw= 'or' )
            {
            // InternalTraceryPP.g:876:2: (kw= ',' | kw= 'or' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            else if ( (LA11_0==19) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalTraceryPP.g:877:3: kw= ','
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSeparatorAccess().getCommaKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:883:3: kw= 'or'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

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


    // $ANTLR start "entryRuleModifier"
    // InternalTraceryPP.g:892:1: entryRuleModifier returns [String current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final String entryRuleModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModifier = null;


        try {
            // InternalTraceryPP.g:892:48: (iv_ruleModifier= ruleModifier EOF )
            // InternalTraceryPP.g:893:2: iv_ruleModifier= ruleModifier EOF
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
    // InternalTraceryPP.g:899:1: ruleModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CapitalizationModifier_0= ruleCapitalizationModifier | this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier | this_PluralityModifier_2= rulePluralityModifier | this_ArticleModifier_3= ruleArticleModifier | this_PastTenseModifier_4= rulePastTenseModifier ) ;
    public final AntlrDatatypeRuleToken ruleModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_CapitalizationModifier_0 = null;

        AntlrDatatypeRuleToken this_FullCapitalizationModifier_1 = null;

        AntlrDatatypeRuleToken this_PluralityModifier_2 = null;

        AntlrDatatypeRuleToken this_ArticleModifier_3 = null;

        AntlrDatatypeRuleToken this_PastTenseModifier_4 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:905:2: ( (this_CapitalizationModifier_0= ruleCapitalizationModifier | this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier | this_PluralityModifier_2= rulePluralityModifier | this_ArticleModifier_3= ruleArticleModifier | this_PastTenseModifier_4= rulePastTenseModifier ) )
            // InternalTraceryPP.g:906:2: (this_CapitalizationModifier_0= ruleCapitalizationModifier | this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier | this_PluralityModifier_2= rulePluralityModifier | this_ArticleModifier_3= ruleArticleModifier | this_PastTenseModifier_4= rulePastTenseModifier )
            {
            // InternalTraceryPP.g:906:2: (this_CapitalizationModifier_0= ruleCapitalizationModifier | this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier | this_PluralityModifier_2= rulePluralityModifier | this_ArticleModifier_3= ruleArticleModifier | this_PastTenseModifier_4= rulePastTenseModifier )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt12=1;
                }
                break;
            case 21:
                {
                alt12=2;
                }
                break;
            case 22:
                {
                alt12=3;
                }
                break;
            case 23:
                {
                alt12=4;
                }
                break;
            case 24:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalTraceryPP.g:907:3: this_CapitalizationModifier_0= ruleCapitalizationModifier
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
                    // InternalTraceryPP.g:918:3: this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier
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
                    // InternalTraceryPP.g:929:3: this_PluralityModifier_2= rulePluralityModifier
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
                    // InternalTraceryPP.g:940:3: this_ArticleModifier_3= ruleArticleModifier
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
                    // InternalTraceryPP.g:951:3: this_PastTenseModifier_4= rulePastTenseModifier
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
    // InternalTraceryPP.g:965:1: entryRuleCapitalizationModifier returns [String current=null] : iv_ruleCapitalizationModifier= ruleCapitalizationModifier EOF ;
    public final String entryRuleCapitalizationModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCapitalizationModifier = null;


        try {
            // InternalTraceryPP.g:965:62: (iv_ruleCapitalizationModifier= ruleCapitalizationModifier EOF )
            // InternalTraceryPP.g:966:2: iv_ruleCapitalizationModifier= ruleCapitalizationModifier EOF
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
    // InternalTraceryPP.g:972:1: ruleCapitalizationModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.capitalize' ;
    public final AntlrDatatypeRuleToken ruleCapitalizationModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:978:2: (kw= '.capitalize' )
            // InternalTraceryPP.g:979:2: kw= '.capitalize'
            {
            kw=(Token)match(input,20,FOLLOW_2); 

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
    // InternalTraceryPP.g:987:1: entryRuleFullCapitalizationModifier returns [String current=null] : iv_ruleFullCapitalizationModifier= ruleFullCapitalizationModifier EOF ;
    public final String entryRuleFullCapitalizationModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFullCapitalizationModifier = null;


        try {
            // InternalTraceryPP.g:987:66: (iv_ruleFullCapitalizationModifier= ruleFullCapitalizationModifier EOF )
            // InternalTraceryPP.g:988:2: iv_ruleFullCapitalizationModifier= ruleFullCapitalizationModifier EOF
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
    // InternalTraceryPP.g:994:1: ruleFullCapitalizationModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.CAPITALIZE' ;
    public final AntlrDatatypeRuleToken ruleFullCapitalizationModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:1000:2: (kw= '.CAPITALIZE' )
            // InternalTraceryPP.g:1001:2: kw= '.CAPITALIZE'
            {
            kw=(Token)match(input,21,FOLLOW_2); 

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
    // InternalTraceryPP.g:1009:1: entryRulePluralityModifier returns [String current=null] : iv_rulePluralityModifier= rulePluralityModifier EOF ;
    public final String entryRulePluralityModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePluralityModifier = null;


        try {
            // InternalTraceryPP.g:1009:57: (iv_rulePluralityModifier= rulePluralityModifier EOF )
            // InternalTraceryPP.g:1010:2: iv_rulePluralityModifier= rulePluralityModifier EOF
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
    // InternalTraceryPP.g:1016:1: rulePluralityModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.s' ;
    public final AntlrDatatypeRuleToken rulePluralityModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:1022:2: (kw= '.s' )
            // InternalTraceryPP.g:1023:2: kw= '.s'
            {
            kw=(Token)match(input,22,FOLLOW_2); 

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
    // InternalTraceryPP.g:1031:1: entryRuleArticleModifier returns [String current=null] : iv_ruleArticleModifier= ruleArticleModifier EOF ;
    public final String entryRuleArticleModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArticleModifier = null;


        try {
            // InternalTraceryPP.g:1031:55: (iv_ruleArticleModifier= ruleArticleModifier EOF )
            // InternalTraceryPP.g:1032:2: iv_ruleArticleModifier= ruleArticleModifier EOF
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
    // InternalTraceryPP.g:1038:1: ruleArticleModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.a' ;
    public final AntlrDatatypeRuleToken ruleArticleModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:1044:2: (kw= '.a' )
            // InternalTraceryPP.g:1045:2: kw= '.a'
            {
            kw=(Token)match(input,23,FOLLOW_2); 

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
    // InternalTraceryPP.g:1053:1: entryRulePastTenseModifier returns [String current=null] : iv_rulePastTenseModifier= rulePastTenseModifier EOF ;
    public final String entryRulePastTenseModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePastTenseModifier = null;


        try {
            // InternalTraceryPP.g:1053:57: (iv_rulePastTenseModifier= rulePastTenseModifier EOF )
            // InternalTraceryPP.g:1054:2: iv_rulePastTenseModifier= rulePastTenseModifier EOF
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
    // InternalTraceryPP.g:1060:1: rulePastTenseModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.ed' ;
    public final AntlrDatatypeRuleToken rulePastTenseModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:1066:2: (kw= '.ed' )
            // InternalTraceryPP.g:1067:2: kw= '.ed'
            {
            kw=(Token)match(input,24,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001F00002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C0002L});

}