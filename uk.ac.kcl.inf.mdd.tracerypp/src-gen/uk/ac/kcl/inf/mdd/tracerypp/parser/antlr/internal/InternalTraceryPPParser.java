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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'The'", "'story:'", "'can'", "'have'", "'values:'", "'be:'", "'is'", "'an'", "'object.'", "'It'", "'has'", "'attributes:'", "'='", "'.'", "'.capitalize'", "'.CAPITALIZE'", "'.s'", "'.a'", "'.ed'", "','", "'or'", "'and'"
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
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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
    // InternalTraceryPP.g:128:1: ruleStatement returns [EObject current=null] : this_Declaration_0= ruleDeclaration ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Declaration_0 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:134:2: (this_Declaration_0= ruleDeclaration )
            // InternalTraceryPP.g:135:2: this_Declaration_0= ruleDeclaration
            {

            		newCompositeNode(grammarAccess.getStatementAccess().getDeclarationParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Declaration_0=ruleDeclaration();

            state._fsp--;


            		current = this_Declaration_0;
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


    // $ANTLR start "entryRuleDeclaration"
    // InternalTraceryPP.g:146:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalTraceryPP.g:146:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalTraceryPP.g:147:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalTraceryPP.g:153:1: ruleDeclaration returns [EObject current=null] : (this_ListDeclaration_0= ruleListDeclaration | this_ObjectDeclaration_1= ruleObjectDeclaration ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_ListDeclaration_0 = null;

        EObject this_ObjectDeclaration_1 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:159:2: ( (this_ListDeclaration_0= ruleListDeclaration | this_ObjectDeclaration_1= ruleObjectDeclaration ) )
            // InternalTraceryPP.g:160:2: (this_ListDeclaration_0= ruleListDeclaration | this_ObjectDeclaration_1= ruleObjectDeclaration )
            {
            // InternalTraceryPP.g:160:2: (this_ListDeclaration_0= ruleListDeclaration | this_ObjectDeclaration_1= ruleObjectDeclaration )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==17) ) {
                    alt2=2;
                }
                else if ( (LA2_1==13) ) {
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
                    // InternalTraceryPP.g:161:3: this_ListDeclaration_0= ruleListDeclaration
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getListDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListDeclaration_0=ruleListDeclaration();

                    state._fsp--;


                    			current = this_ListDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:170:3: this_ObjectDeclaration_1= ruleObjectDeclaration
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getObjectDeclarationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectDeclaration_1=ruleObjectDeclaration();

                    state._fsp--;


                    			current = this_ObjectDeclaration_1;
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
    // $ANTLR end "ruleDeclaration"


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
    // InternalTraceryPP.g:189:1: ruleStory returns [EObject current=null] : ( () otherlv_1= 'The' otherlv_2= 'story:' ( ( (lv_story_3_1= ruleWord | lv_story_3_2= ruleStoryVariable | lv_story_3_3= ruleObjectAttribute ) ) )* ) ;
    public final EObject ruleStory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_story_3_1 = null;

        EObject lv_story_3_2 = null;

        EObject lv_story_3_3 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:195:2: ( ( () otherlv_1= 'The' otherlv_2= 'story:' ( ( (lv_story_3_1= ruleWord | lv_story_3_2= ruleStoryVariable | lv_story_3_3= ruleObjectAttribute ) ) )* ) )
            // InternalTraceryPP.g:196:2: ( () otherlv_1= 'The' otherlv_2= 'story:' ( ( (lv_story_3_1= ruleWord | lv_story_3_2= ruleStoryVariable | lv_story_3_3= ruleObjectAttribute ) ) )* )
            {
            // InternalTraceryPP.g:196:2: ( () otherlv_1= 'The' otherlv_2= 'story:' ( ( (lv_story_3_1= ruleWord | lv_story_3_2= ruleStoryVariable | lv_story_3_3= ruleObjectAttribute ) ) )* )
            // InternalTraceryPP.g:197:3: () otherlv_1= 'The' otherlv_2= 'story:' ( ( (lv_story_3_1= ruleWord | lv_story_3_2= ruleStoryVariable | lv_story_3_3= ruleObjectAttribute ) ) )*
            {
            // InternalTraceryPP.g:197:3: ()
            // InternalTraceryPP.g:198:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStoryAccess().getStoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getStoryAccess().getTheKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getStoryAccess().getStoryKeyword_2());
            		
            // InternalTraceryPP.g:212:3: ( ( (lv_story_3_1= ruleWord | lv_story_3_2= ruleStoryVariable | lv_story_3_3= ruleObjectAttribute ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_STRING)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTraceryPP.g:213:4: ( (lv_story_3_1= ruleWord | lv_story_3_2= ruleStoryVariable | lv_story_3_3= ruleObjectAttribute ) )
            	    {
            	    // InternalTraceryPP.g:213:4: ( (lv_story_3_1= ruleWord | lv_story_3_2= ruleStoryVariable | lv_story_3_3= ruleObjectAttribute ) )
            	    // InternalTraceryPP.g:214:5: (lv_story_3_1= ruleWord | lv_story_3_2= ruleStoryVariable | lv_story_3_3= ruleObjectAttribute )
            	    {
            	    // InternalTraceryPP.g:214:5: (lv_story_3_1= ruleWord | lv_story_3_2= ruleStoryVariable | lv_story_3_3= ruleObjectAttribute )
            	    int alt3=3;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==RULE_STRING) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==RULE_ID) ) {
            	        int LA3_2 = input.LA(2);

            	        if ( (LA3_2==EOF||(LA3_2>=RULE_ID && LA3_2<=RULE_STRING)||(LA3_2>=25 && LA3_2<=29)) ) {
            	            alt3=2;
            	        }
            	        else if ( (LA3_2==24) ) {
            	            alt3=3;
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
            	            // InternalTraceryPP.g:215:6: lv_story_3_1= ruleWord
            	            {

            	            						newCompositeNode(grammarAccess.getStoryAccess().getStoryWordParserRuleCall_3_0_0());
            	            					
            	            pushFollow(FOLLOW_5);
            	            lv_story_3_1=ruleWord();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getStoryRule());
            	            						}
            	            						add(
            	            							current,
            	            							"story",
            	            							lv_story_3_1,
            	            							"uk.ac.kcl.inf.mdd.tracerypp.TraceryPP.Word");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalTraceryPP.g:231:6: lv_story_3_2= ruleStoryVariable
            	            {

            	            						newCompositeNode(grammarAccess.getStoryAccess().getStoryStoryVariableParserRuleCall_3_0_1());
            	            					
            	            pushFollow(FOLLOW_5);
            	            lv_story_3_2=ruleStoryVariable();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getStoryRule());
            	            						}
            	            						add(
            	            							current,
            	            							"story",
            	            							lv_story_3_2,
            	            							"uk.ac.kcl.inf.mdd.tracerypp.TraceryPP.StoryVariable");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalTraceryPP.g:247:6: lv_story_3_3= ruleObjectAttribute
            	            {

            	            						newCompositeNode(grammarAccess.getStoryAccess().getStoryObjectAttributeParserRuleCall_3_0_2());
            	            					
            	            pushFollow(FOLLOW_5);
            	            lv_story_3_3=ruleObjectAttribute();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getStoryRule());
            	            						}
            	            						add(
            	            							current,
            	            							"story",
            	            							lv_story_3_3,
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


    // $ANTLR start "entryRuleListDeclaration"
    // InternalTraceryPP.g:269:1: entryRuleListDeclaration returns [EObject current=null] : iv_ruleListDeclaration= ruleListDeclaration EOF ;
    public final EObject entryRuleListDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListDeclaration = null;


        try {
            // InternalTraceryPP.g:269:56: (iv_ruleListDeclaration= ruleListDeclaration EOF )
            // InternalTraceryPP.g:270:2: iv_ruleListDeclaration= ruleListDeclaration EOF
            {
             newCompositeNode(grammarAccess.getListDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListDeclaration=ruleListDeclaration();

            state._fsp--;

             current =iv_ruleListDeclaration; 
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
    // $ANTLR end "entryRuleListDeclaration"


    // $ANTLR start "ruleListDeclaration"
    // InternalTraceryPP.g:276:1: ruleListDeclaration returns [EObject current=null] : ( ( (lv_start_symbol_0_0= ruleVariable ) ) ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values:' ) | (otherlv_4= 'can' otherlv_5= 'be:' ) ) ( (lv_list_6_0= ruleWordList ) ) ) ;
    public final EObject ruleListDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_start_symbol_0_0 = null;

        EObject lv_list_6_0 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:282:2: ( ( ( (lv_start_symbol_0_0= ruleVariable ) ) ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values:' ) | (otherlv_4= 'can' otherlv_5= 'be:' ) ) ( (lv_list_6_0= ruleWordList ) ) ) )
            // InternalTraceryPP.g:283:2: ( ( (lv_start_symbol_0_0= ruleVariable ) ) ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values:' ) | (otherlv_4= 'can' otherlv_5= 'be:' ) ) ( (lv_list_6_0= ruleWordList ) ) )
            {
            // InternalTraceryPP.g:283:2: ( ( (lv_start_symbol_0_0= ruleVariable ) ) ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values:' ) | (otherlv_4= 'can' otherlv_5= 'be:' ) ) ( (lv_list_6_0= ruleWordList ) ) )
            // InternalTraceryPP.g:284:3: ( (lv_start_symbol_0_0= ruleVariable ) ) ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values:' ) | (otherlv_4= 'can' otherlv_5= 'be:' ) ) ( (lv_list_6_0= ruleWordList ) )
            {
            // InternalTraceryPP.g:284:3: ( (lv_start_symbol_0_0= ruleVariable ) )
            // InternalTraceryPP.g:285:4: (lv_start_symbol_0_0= ruleVariable )
            {
            // InternalTraceryPP.g:285:4: (lv_start_symbol_0_0= ruleVariable )
            // InternalTraceryPP.g:286:5: lv_start_symbol_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getListDeclarationAccess().getStart_symbolVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_start_symbol_0_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListDeclarationRule());
            					}
            					set(
            						current,
            						"start_symbol",
            						lv_start_symbol_0_0,
            						"uk.ac.kcl.inf.mdd.tracerypp.TraceryPP.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTraceryPP.g:303:3: ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values:' ) | (otherlv_4= 'can' otherlv_5= 'be:' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==16) ) {
                    alt5=2;
                }
                else if ( (LA5_1==14) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTraceryPP.g:304:4: (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values:' )
                    {
                    // InternalTraceryPP.g:304:4: (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values:' )
                    // InternalTraceryPP.g:305:5: otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values:'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_7); 

                    					newLeafNode(otherlv_1, grammarAccess.getListDeclarationAccess().getCanKeyword_1_0_0());
                    				
                    otherlv_2=(Token)match(input,14,FOLLOW_8); 

                    					newLeafNode(otherlv_2, grammarAccess.getListDeclarationAccess().getHaveKeyword_1_0_1());
                    				
                    otherlv_3=(Token)match(input,15,FOLLOW_9); 

                    					newLeafNode(otherlv_3, grammarAccess.getListDeclarationAccess().getValuesKeyword_1_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:319:4: (otherlv_4= 'can' otherlv_5= 'be:' )
                    {
                    // InternalTraceryPP.g:319:4: (otherlv_4= 'can' otherlv_5= 'be:' )
                    // InternalTraceryPP.g:320:5: otherlv_4= 'can' otherlv_5= 'be:'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_10); 

                    					newLeafNode(otherlv_4, grammarAccess.getListDeclarationAccess().getCanKeyword_1_1_0());
                    				
                    otherlv_5=(Token)match(input,16,FOLLOW_9); 

                    					newLeafNode(otherlv_5, grammarAccess.getListDeclarationAccess().getBeKeyword_1_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalTraceryPP.g:330:3: ( (lv_list_6_0= ruleWordList ) )
            // InternalTraceryPP.g:331:4: (lv_list_6_0= ruleWordList )
            {
            // InternalTraceryPP.g:331:4: (lv_list_6_0= ruleWordList )
            // InternalTraceryPP.g:332:5: lv_list_6_0= ruleWordList
            {

            					newCompositeNode(grammarAccess.getListDeclarationAccess().getListWordListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_list_6_0=ruleWordList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListDeclarationRule());
            					}
            					set(
            						current,
            						"list",
            						lv_list_6_0,
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
    // $ANTLR end "ruleListDeclaration"


    // $ANTLR start "entryRuleObjectDeclaration"
    // InternalTraceryPP.g:353:1: entryRuleObjectDeclaration returns [EObject current=null] : iv_ruleObjectDeclaration= ruleObjectDeclaration EOF ;
    public final EObject entryRuleObjectDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectDeclaration = null;


        try {
            // InternalTraceryPP.g:353:58: (iv_ruleObjectDeclaration= ruleObjectDeclaration EOF )
            // InternalTraceryPP.g:354:2: iv_ruleObjectDeclaration= ruleObjectDeclaration EOF
            {
             newCompositeNode(grammarAccess.getObjectDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectDeclaration=ruleObjectDeclaration();

            state._fsp--;

             current =iv_ruleObjectDeclaration; 
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
    // $ANTLR end "entryRuleObjectDeclaration"


    // $ANTLR start "ruleObjectDeclaration"
    // InternalTraceryPP.g:360:1: ruleObjectDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'is' otherlv_2= 'an' otherlv_3= 'object.' otherlv_4= 'It' otherlv_5= 'has' otherlv_6= 'attributes:' ( (lv_attributes_7_0= ruleAttributeList ) ) ) ;
    public final EObject ruleObjectDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_attributes_7_0 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:366:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'is' otherlv_2= 'an' otherlv_3= 'object.' otherlv_4= 'It' otherlv_5= 'has' otherlv_6= 'attributes:' ( (lv_attributes_7_0= ruleAttributeList ) ) ) )
            // InternalTraceryPP.g:367:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'is' otherlv_2= 'an' otherlv_3= 'object.' otherlv_4= 'It' otherlv_5= 'has' otherlv_6= 'attributes:' ( (lv_attributes_7_0= ruleAttributeList ) ) )
            {
            // InternalTraceryPP.g:367:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'is' otherlv_2= 'an' otherlv_3= 'object.' otherlv_4= 'It' otherlv_5= 'has' otherlv_6= 'attributes:' ( (lv_attributes_7_0= ruleAttributeList ) ) )
            // InternalTraceryPP.g:368:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'is' otherlv_2= 'an' otherlv_3= 'object.' otherlv_4= 'It' otherlv_5= 'has' otherlv_6= 'attributes:' ( (lv_attributes_7_0= ruleAttributeList ) )
            {
            // InternalTraceryPP.g:368:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTraceryPP.g:369:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTraceryPP.g:369:4: (lv_name_0_0= RULE_ID )
            // InternalTraceryPP.g:370:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_0_0, grammarAccess.getObjectDeclarationAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectDeclarationAccess().getIsKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getObjectDeclarationAccess().getAnKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getObjectDeclarationAccess().getObjectKeyword_3());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getObjectDeclarationAccess().getItKeyword_4());
            		
            otherlv_5=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getObjectDeclarationAccess().getHasKeyword_5());
            		
            otherlv_6=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getObjectDeclarationAccess().getAttributesKeyword_6());
            		
            // InternalTraceryPP.g:410:3: ( (lv_attributes_7_0= ruleAttributeList ) )
            // InternalTraceryPP.g:411:4: (lv_attributes_7_0= ruleAttributeList )
            {
            // InternalTraceryPP.g:411:4: (lv_attributes_7_0= ruleAttributeList )
            // InternalTraceryPP.g:412:5: lv_attributes_7_0= ruleAttributeList
            {

            					newCompositeNode(grammarAccess.getObjectDeclarationAccess().getAttributesAttributeListParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_attributes_7_0=ruleAttributeList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectDeclarationRule());
            					}
            					set(
            						current,
            						"attributes",
            						lv_attributes_7_0,
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
    // $ANTLR end "ruleObjectDeclaration"


    // $ANTLR start "entryRuleWord"
    // InternalTraceryPP.g:433:1: entryRuleWord returns [EObject current=null] : iv_ruleWord= ruleWord EOF ;
    public final EObject entryRuleWord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWord = null;


        try {
            // InternalTraceryPP.g:433:45: (iv_ruleWord= ruleWord EOF )
            // InternalTraceryPP.g:434:2: iv_ruleWord= ruleWord EOF
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
    // InternalTraceryPP.g:440:1: ruleWord returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleWord() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:446:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalTraceryPP.g:447:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalTraceryPP.g:447:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalTraceryPP.g:448:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalTraceryPP.g:448:3: (lv_value_0_0= RULE_STRING )
            // InternalTraceryPP.g:449:4: lv_value_0_0= RULE_STRING
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
    // InternalTraceryPP.g:468:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalTraceryPP.g:468:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalTraceryPP.g:469:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalTraceryPP.g:475:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:481:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalTraceryPP.g:482:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalTraceryPP.g:482:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalTraceryPP.g:483:3: (lv_name_0_0= RULE_ID )
            {
            // InternalTraceryPP.g:483:3: (lv_name_0_0= RULE_ID )
            // InternalTraceryPP.g:484:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
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
    // InternalTraceryPP.g:503:1: entryRuleStoryVariable returns [EObject current=null] : iv_ruleStoryVariable= ruleStoryVariable EOF ;
    public final EObject entryRuleStoryVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStoryVariable = null;


        try {
            // InternalTraceryPP.g:503:54: (iv_ruleStoryVariable= ruleStoryVariable EOF )
            // InternalTraceryPP.g:504:2: iv_ruleStoryVariable= ruleStoryVariable EOF
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
    // InternalTraceryPP.g:510:1: ruleStoryVariable returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )* ) ;
    public final EObject ruleStoryVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_modifiers_1_0 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:516:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )* ) )
            // InternalTraceryPP.g:517:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )* )
            {
            // InternalTraceryPP.g:517:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )* )
            // InternalTraceryPP.g:518:3: ( (otherlv_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )*
            {
            // InternalTraceryPP.g:518:3: ( (otherlv_0= RULE_ID ) )
            // InternalTraceryPP.g:519:4: (otherlv_0= RULE_ID )
            {
            // InternalTraceryPP.g:519:4: (otherlv_0= RULE_ID )
            // InternalTraceryPP.g:520:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStoryVariableRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_0, grammarAccess.getStoryVariableAccess().getVariableVariableCrossReference_0_0());
            				

            }


            }

            // InternalTraceryPP.g:531:3: ( (lv_modifiers_1_0= ruleModifier ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=25 && LA6_0<=29)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTraceryPP.g:532:4: (lv_modifiers_1_0= ruleModifier )
            	    {
            	    // InternalTraceryPP.g:532:4: (lv_modifiers_1_0= ruleModifier )
            	    // InternalTraceryPP.g:533:5: lv_modifiers_1_0= ruleModifier
            	    {

            	    					newCompositeNode(grammarAccess.getStoryVariableAccess().getModifiersModifierParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_18);
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
    // InternalTraceryPP.g:554:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalTraceryPP.g:554:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalTraceryPP.g:555:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalTraceryPP.g:561:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:567:2: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) ) )
            // InternalTraceryPP.g:568:2: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) )
            {
            // InternalTraceryPP.g:568:2: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==23) ) {
                    alt7=2;
                }
                else if ( (LA7_1==EOF||LA7_1==RULE_ID||LA7_1==11||LA7_1==30||LA7_1==32) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTraceryPP.g:569:3: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // InternalTraceryPP.g:569:3: ( (lv_name_0_0= RULE_ID ) )
                    // InternalTraceryPP.g:570:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalTraceryPP.g:570:4: (lv_name_0_0= RULE_ID )
                    // InternalTraceryPP.g:571:5: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:588:3: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalTraceryPP.g:588:3: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalTraceryPP.g:589:4: ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalTraceryPP.g:589:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalTraceryPP.g:590:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalTraceryPP.g:590:5: (lv_name_1_0= RULE_ID )
                    // InternalTraceryPP.g:591:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,23,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getEqualsSignKeyword_1_1());
                    			
                    // InternalTraceryPP.g:611:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalTraceryPP.g:612:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalTraceryPP.g:612:5: (lv_value_3_0= RULE_STRING )
                    // InternalTraceryPP.g:613:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleObjectAttribute"
    // InternalTraceryPP.g:634:1: entryRuleObjectAttribute returns [EObject current=null] : iv_ruleObjectAttribute= ruleObjectAttribute EOF ;
    public final EObject entryRuleObjectAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectAttribute = null;


        try {
            // InternalTraceryPP.g:634:56: (iv_ruleObjectAttribute= ruleObjectAttribute EOF )
            // InternalTraceryPP.g:635:2: iv_ruleObjectAttribute= ruleObjectAttribute EOF
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
    // InternalTraceryPP.g:641:1: ruleObjectAttribute returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleObjectAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:647:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalTraceryPP.g:648:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalTraceryPP.g:648:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalTraceryPP.g:649:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // InternalTraceryPP.g:649:3: ( (otherlv_0= RULE_ID ) )
            // InternalTraceryPP.g:650:4: (otherlv_0= RULE_ID )
            {
            // InternalTraceryPP.g:650:4: (otherlv_0= RULE_ID )
            // InternalTraceryPP.g:651:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectAttributeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_0, grammarAccess.getObjectAttributeAccess().getObjectObjectDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectAttributeAccess().getFullStopKeyword_1());
            		
            // InternalTraceryPP.g:666:3: ( (otherlv_2= RULE_ID ) )
            // InternalTraceryPP.g:667:4: (otherlv_2= RULE_ID )
            {
            // InternalTraceryPP.g:667:4: (otherlv_2= RULE_ID )
            // InternalTraceryPP.g:668:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectAttributeRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getObjectAttributeAccess().getAttributeAttributeCrossReference_2_0());
            				

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
    // InternalTraceryPP.g:683:1: entryRuleWordList returns [EObject current=null] : iv_ruleWordList= ruleWordList EOF ;
    public final EObject entryRuleWordList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordList = null;


        try {
            // InternalTraceryPP.g:683:49: (iv_ruleWordList= ruleWordList EOF )
            // InternalTraceryPP.g:684:2: iv_ruleWordList= ruleWordList EOF
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
    // InternalTraceryPP.g:690:1: ruleWordList returns [EObject current=null] : ( ( (lv_words_0_0= ruleWord ) ) ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )* ) ;
    public final EObject ruleWordList() throws RecognitionException {
        EObject current = null;

        EObject lv_words_0_0 = null;

        EObject lv_words_2_0 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:696:2: ( ( ( (lv_words_0_0= ruleWord ) ) ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )* ) )
            // InternalTraceryPP.g:697:2: ( ( (lv_words_0_0= ruleWord ) ) ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )* )
            {
            // InternalTraceryPP.g:697:2: ( ( (lv_words_0_0= ruleWord ) ) ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )* )
            // InternalTraceryPP.g:698:3: ( (lv_words_0_0= ruleWord ) ) ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )*
            {
            // InternalTraceryPP.g:698:3: ( (lv_words_0_0= ruleWord ) )
            // InternalTraceryPP.g:699:4: (lv_words_0_0= ruleWord )
            {
            // InternalTraceryPP.g:699:4: (lv_words_0_0= ruleWord )
            // InternalTraceryPP.g:700:5: lv_words_0_0= ruleWord
            {

            					newCompositeNode(grammarAccess.getWordListAccess().getWordsWordParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalTraceryPP.g:717:3: ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=30 && LA8_0<=31)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTraceryPP.g:718:4: ruleSeparatorOr ( (lv_words_2_0= ruleWord ) )
            	    {

            	    				newCompositeNode(grammarAccess.getWordListAccess().getSeparatorOrParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_9);
            	    ruleSeparatorOr();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalTraceryPP.g:725:4: ( (lv_words_2_0= ruleWord ) )
            	    // InternalTraceryPP.g:726:5: (lv_words_2_0= ruleWord )
            	    {
            	    // InternalTraceryPP.g:726:5: (lv_words_2_0= ruleWord )
            	    // InternalTraceryPP.g:727:6: lv_words_2_0= ruleWord
            	    {

            	    						newCompositeNode(grammarAccess.getWordListAccess().getWordsWordParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_words_2_0=ruleWord();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWordListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"words",
            	    							lv_words_2_0,
            	    							"uk.ac.kcl.inf.mdd.tracerypp.TraceryPP.Word");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


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
    // $ANTLR end "ruleWordList"


    // $ANTLR start "entryRuleAttributeList"
    // InternalTraceryPP.g:749:1: entryRuleAttributeList returns [EObject current=null] : iv_ruleAttributeList= ruleAttributeList EOF ;
    public final EObject entryRuleAttributeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeList = null;


        try {
            // InternalTraceryPP.g:749:54: (iv_ruleAttributeList= ruleAttributeList EOF )
            // InternalTraceryPP.g:750:2: iv_ruleAttributeList= ruleAttributeList EOF
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
    // InternalTraceryPP.g:756:1: ruleAttributeList returns [EObject current=null] : ( ( (lv_attributes_0_0= ruleAttribute ) ) ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )* ) ;
    public final EObject ruleAttributeList() throws RecognitionException {
        EObject current = null;

        EObject lv_attributes_0_0 = null;

        EObject lv_attributes_2_0 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:762:2: ( ( ( (lv_attributes_0_0= ruleAttribute ) ) ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )* ) )
            // InternalTraceryPP.g:763:2: ( ( (lv_attributes_0_0= ruleAttribute ) ) ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )* )
            {
            // InternalTraceryPP.g:763:2: ( ( (lv_attributes_0_0= ruleAttribute ) ) ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )* )
            // InternalTraceryPP.g:764:3: ( (lv_attributes_0_0= ruleAttribute ) ) ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )*
            {
            // InternalTraceryPP.g:764:3: ( (lv_attributes_0_0= ruleAttribute ) )
            // InternalTraceryPP.g:765:4: (lv_attributes_0_0= ruleAttribute )
            {
            // InternalTraceryPP.g:765:4: (lv_attributes_0_0= ruleAttribute )
            // InternalTraceryPP.g:766:5: lv_attributes_0_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_attributes_0_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeListRule());
            					}
            					add(
            						current,
            						"attributes",
            						lv_attributes_0_0,
            						"uk.ac.kcl.inf.mdd.tracerypp.TraceryPP.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTraceryPP.g:783:3: ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==30||LA9_0==32) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTraceryPP.g:784:4: ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) )
            	    {

            	    				newCompositeNode(grammarAccess.getAttributeListAccess().getSeparatorAndParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_17);
            	    ruleSeparatorAnd();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalTraceryPP.g:791:4: ( (lv_attributes_2_0= ruleAttribute ) )
            	    // InternalTraceryPP.g:792:5: (lv_attributes_2_0= ruleAttribute )
            	    {
            	    // InternalTraceryPP.g:792:5: (lv_attributes_2_0= ruleAttribute )
            	    // InternalTraceryPP.g:793:6: lv_attributes_2_0= ruleAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_attributes_2_0=ruleAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAttributeListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attributes",
            	    							lv_attributes_2_0,
            	    							"uk.ac.kcl.inf.mdd.tracerypp.TraceryPP.Attribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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


    // $ANTLR start "entryRuleModifier"
    // InternalTraceryPP.g:815:1: entryRuleModifier returns [String current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final String entryRuleModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModifier = null;


        try {
            // InternalTraceryPP.g:815:48: (iv_ruleModifier= ruleModifier EOF )
            // InternalTraceryPP.g:816:2: iv_ruleModifier= ruleModifier EOF
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
    // InternalTraceryPP.g:822:1: ruleModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CapitalizationModifier_0= ruleCapitalizationModifier | this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier | this_PluralityModifier_2= rulePluralityModifier | this_ArticleModifier_3= ruleArticleModifier | this_PastTenseModifier_4= rulePastTenseModifier ) ;
    public final AntlrDatatypeRuleToken ruleModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_CapitalizationModifier_0 = null;

        AntlrDatatypeRuleToken this_FullCapitalizationModifier_1 = null;

        AntlrDatatypeRuleToken this_PluralityModifier_2 = null;

        AntlrDatatypeRuleToken this_ArticleModifier_3 = null;

        AntlrDatatypeRuleToken this_PastTenseModifier_4 = null;



        	enterRule();

        try {
            // InternalTraceryPP.g:828:2: ( (this_CapitalizationModifier_0= ruleCapitalizationModifier | this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier | this_PluralityModifier_2= rulePluralityModifier | this_ArticleModifier_3= ruleArticleModifier | this_PastTenseModifier_4= rulePastTenseModifier ) )
            // InternalTraceryPP.g:829:2: (this_CapitalizationModifier_0= ruleCapitalizationModifier | this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier | this_PluralityModifier_2= rulePluralityModifier | this_ArticleModifier_3= ruleArticleModifier | this_PastTenseModifier_4= rulePastTenseModifier )
            {
            // InternalTraceryPP.g:829:2: (this_CapitalizationModifier_0= ruleCapitalizationModifier | this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier | this_PluralityModifier_2= rulePluralityModifier | this_ArticleModifier_3= ruleArticleModifier | this_PastTenseModifier_4= rulePastTenseModifier )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt10=1;
                }
                break;
            case 26:
                {
                alt10=2;
                }
                break;
            case 27:
                {
                alt10=3;
                }
                break;
            case 28:
                {
                alt10=4;
                }
                break;
            case 29:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalTraceryPP.g:830:3: this_CapitalizationModifier_0= ruleCapitalizationModifier
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
                    // InternalTraceryPP.g:841:3: this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier
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
                    // InternalTraceryPP.g:852:3: this_PluralityModifier_2= rulePluralityModifier
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
                    // InternalTraceryPP.g:863:3: this_ArticleModifier_3= ruleArticleModifier
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
                    // InternalTraceryPP.g:874:3: this_PastTenseModifier_4= rulePastTenseModifier
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
    // InternalTraceryPP.g:888:1: entryRuleCapitalizationModifier returns [String current=null] : iv_ruleCapitalizationModifier= ruleCapitalizationModifier EOF ;
    public final String entryRuleCapitalizationModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCapitalizationModifier = null;


        try {
            // InternalTraceryPP.g:888:62: (iv_ruleCapitalizationModifier= ruleCapitalizationModifier EOF )
            // InternalTraceryPP.g:889:2: iv_ruleCapitalizationModifier= ruleCapitalizationModifier EOF
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
    // InternalTraceryPP.g:895:1: ruleCapitalizationModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.capitalize' ;
    public final AntlrDatatypeRuleToken ruleCapitalizationModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:901:2: (kw= '.capitalize' )
            // InternalTraceryPP.g:902:2: kw= '.capitalize'
            {
            kw=(Token)match(input,25,FOLLOW_2); 

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
    // InternalTraceryPP.g:910:1: entryRuleFullCapitalizationModifier returns [String current=null] : iv_ruleFullCapitalizationModifier= ruleFullCapitalizationModifier EOF ;
    public final String entryRuleFullCapitalizationModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFullCapitalizationModifier = null;


        try {
            // InternalTraceryPP.g:910:66: (iv_ruleFullCapitalizationModifier= ruleFullCapitalizationModifier EOF )
            // InternalTraceryPP.g:911:2: iv_ruleFullCapitalizationModifier= ruleFullCapitalizationModifier EOF
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
    // InternalTraceryPP.g:917:1: ruleFullCapitalizationModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.CAPITALIZE' ;
    public final AntlrDatatypeRuleToken ruleFullCapitalizationModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:923:2: (kw= '.CAPITALIZE' )
            // InternalTraceryPP.g:924:2: kw= '.CAPITALIZE'
            {
            kw=(Token)match(input,26,FOLLOW_2); 

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
    // InternalTraceryPP.g:932:1: entryRulePluralityModifier returns [String current=null] : iv_rulePluralityModifier= rulePluralityModifier EOF ;
    public final String entryRulePluralityModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePluralityModifier = null;


        try {
            // InternalTraceryPP.g:932:57: (iv_rulePluralityModifier= rulePluralityModifier EOF )
            // InternalTraceryPP.g:933:2: iv_rulePluralityModifier= rulePluralityModifier EOF
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
    // InternalTraceryPP.g:939:1: rulePluralityModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.s' ;
    public final AntlrDatatypeRuleToken rulePluralityModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:945:2: (kw= '.s' )
            // InternalTraceryPP.g:946:2: kw= '.s'
            {
            kw=(Token)match(input,27,FOLLOW_2); 

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
    // InternalTraceryPP.g:954:1: entryRuleArticleModifier returns [String current=null] : iv_ruleArticleModifier= ruleArticleModifier EOF ;
    public final String entryRuleArticleModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArticleModifier = null;


        try {
            // InternalTraceryPP.g:954:55: (iv_ruleArticleModifier= ruleArticleModifier EOF )
            // InternalTraceryPP.g:955:2: iv_ruleArticleModifier= ruleArticleModifier EOF
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
    // InternalTraceryPP.g:961:1: ruleArticleModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.a' ;
    public final AntlrDatatypeRuleToken ruleArticleModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:967:2: (kw= '.a' )
            // InternalTraceryPP.g:968:2: kw= '.a'
            {
            kw=(Token)match(input,28,FOLLOW_2); 

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
    // InternalTraceryPP.g:976:1: entryRulePastTenseModifier returns [String current=null] : iv_rulePastTenseModifier= rulePastTenseModifier EOF ;
    public final String entryRulePastTenseModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePastTenseModifier = null;


        try {
            // InternalTraceryPP.g:976:57: (iv_rulePastTenseModifier= rulePastTenseModifier EOF )
            // InternalTraceryPP.g:977:2: iv_rulePastTenseModifier= rulePastTenseModifier EOF
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
    // InternalTraceryPP.g:983:1: rulePastTenseModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.ed' ;
    public final AntlrDatatypeRuleToken rulePastTenseModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:989:2: (kw= '.ed' )
            // InternalTraceryPP.g:990:2: kw= '.ed'
            {
            kw=(Token)match(input,29,FOLLOW_2); 

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


    // $ANTLR start "entryRuleSeparatorOr"
    // InternalTraceryPP.g:998:1: entryRuleSeparatorOr returns [String current=null] : iv_ruleSeparatorOr= ruleSeparatorOr EOF ;
    public final String entryRuleSeparatorOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSeparatorOr = null;


        try {
            // InternalTraceryPP.g:998:51: (iv_ruleSeparatorOr= ruleSeparatorOr EOF )
            // InternalTraceryPP.g:999:2: iv_ruleSeparatorOr= ruleSeparatorOr EOF
            {
             newCompositeNode(grammarAccess.getSeparatorOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeparatorOr=ruleSeparatorOr();

            state._fsp--;

             current =iv_ruleSeparatorOr.getText(); 
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
    // $ANTLR end "entryRuleSeparatorOr"


    // $ANTLR start "ruleSeparatorOr"
    // InternalTraceryPP.g:1005:1: ruleSeparatorOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ',' | kw= 'or' ) ;
    public final AntlrDatatypeRuleToken ruleSeparatorOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:1011:2: ( (kw= ',' | kw= 'or' ) )
            // InternalTraceryPP.g:1012:2: (kw= ',' | kw= 'or' )
            {
            // InternalTraceryPP.g:1012:2: (kw= ',' | kw= 'or' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            else if ( (LA11_0==31) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalTraceryPP.g:1013:3: kw= ','
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSeparatorOrAccess().getCommaKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:1019:3: kw= 'or'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSeparatorOrAccess().getOrKeyword_1());
                    		

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
    // $ANTLR end "ruleSeparatorOr"


    // $ANTLR start "entryRuleSeparatorAnd"
    // InternalTraceryPP.g:1028:1: entryRuleSeparatorAnd returns [String current=null] : iv_ruleSeparatorAnd= ruleSeparatorAnd EOF ;
    public final String entryRuleSeparatorAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSeparatorAnd = null;


        try {
            // InternalTraceryPP.g:1028:52: (iv_ruleSeparatorAnd= ruleSeparatorAnd EOF )
            // InternalTraceryPP.g:1029:2: iv_ruleSeparatorAnd= ruleSeparatorAnd EOF
            {
             newCompositeNode(grammarAccess.getSeparatorAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeparatorAnd=ruleSeparatorAnd();

            state._fsp--;

             current =iv_ruleSeparatorAnd.getText(); 
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
    // $ANTLR end "entryRuleSeparatorAnd"


    // $ANTLR start "ruleSeparatorAnd"
    // InternalTraceryPP.g:1035:1: ruleSeparatorAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ',' | kw= 'and' ) ;
    public final AntlrDatatypeRuleToken ruleSeparatorAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPP.g:1041:2: ( (kw= ',' | kw= 'and' ) )
            // InternalTraceryPP.g:1042:2: (kw= ',' | kw= 'and' )
            {
            // InternalTraceryPP.g:1042:2: (kw= ',' | kw= 'and' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            else if ( (LA12_0==32) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalTraceryPP.g:1043:3: kw= ','
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSeparatorAndAccess().getCommaKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:1049:3: kw= 'and'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSeparatorAndAccess().getAndKeyword_1());
                    		

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
    // $ANTLR end "ruleSeparatorAnd"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000003E000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000140000002L});

}