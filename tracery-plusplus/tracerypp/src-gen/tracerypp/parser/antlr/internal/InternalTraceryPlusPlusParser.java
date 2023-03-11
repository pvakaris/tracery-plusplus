package tracerypp.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import tracerypp.services.TraceryPlusPlusGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTraceryPlusPlusParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'The'", "'story:'", "'can'", "'have'", "'values'", "'be'", "'There'", "'is'", "'are'", "'a'", "'an'", "'He'", "'She'", "'It'", "'They'", "'has'", "'attributes'", "'.'", "'.capitalize'", "'.CAPITALIZE'", "'.s'", "'.a'", "'.ed'", "'='", "':'", "'-'", "','", "'or'", "'and'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
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


        public InternalTraceryPlusPlusParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTraceryPlusPlusParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTraceryPlusPlusParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTraceryPlusPlus.g"; }



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




    // $ANTLR start "entryRuleTraceryPlusPlusProgram"
    // InternalTraceryPlusPlus.g:64:1: entryRuleTraceryPlusPlusProgram returns [EObject current=null] : iv_ruleTraceryPlusPlusProgram= ruleTraceryPlusPlusProgram EOF ;
    public final EObject entryRuleTraceryPlusPlusProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceryPlusPlusProgram = null;


        try {
            // InternalTraceryPlusPlus.g:64:63: (iv_ruleTraceryPlusPlusProgram= ruleTraceryPlusPlusProgram EOF )
            // InternalTraceryPlusPlus.g:65:2: iv_ruleTraceryPlusPlusProgram= ruleTraceryPlusPlusProgram EOF
            {
             newCompositeNode(grammarAccess.getTraceryPlusPlusProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTraceryPlusPlusProgram=ruleTraceryPlusPlusProgram();

            state._fsp--;

             current =iv_ruleTraceryPlusPlusProgram; 
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
    // $ANTLR end "entryRuleTraceryPlusPlusProgram"


    // $ANTLR start "ruleTraceryPlusPlusProgram"
    // InternalTraceryPlusPlus.g:71:1: ruleTraceryPlusPlusProgram returns [EObject current=null] : ( ( (lv_statements_0_0= ruleStatement ) )* ( (lv_story_1_0= ruleStory ) ) ) ;
    public final EObject ruleTraceryPlusPlusProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;

        EObject lv_story_1_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:77:2: ( ( ( (lv_statements_0_0= ruleStatement ) )* ( (lv_story_1_0= ruleStory ) ) ) )
            // InternalTraceryPlusPlus.g:78:2: ( ( (lv_statements_0_0= ruleStatement ) )* ( (lv_story_1_0= ruleStory ) ) )
            {
            // InternalTraceryPlusPlus.g:78:2: ( ( (lv_statements_0_0= ruleStatement ) )* ( (lv_story_1_0= ruleStory ) ) )
            // InternalTraceryPlusPlus.g:79:3: ( (lv_statements_0_0= ruleStatement ) )* ( (lv_story_1_0= ruleStory ) )
            {
            // InternalTraceryPlusPlus.g:79:3: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:80:4: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalTraceryPlusPlus.g:80:4: (lv_statements_0_0= ruleStatement )
            	    // InternalTraceryPlusPlus.g:81:5: lv_statements_0_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getTraceryPlusPlusProgramAccess().getStatementsStatementParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTraceryPlusPlusProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_0_0,
            	    						"tracerypp.TraceryPlusPlus.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalTraceryPlusPlus.g:98:3: ( (lv_story_1_0= ruleStory ) )
            // InternalTraceryPlusPlus.g:99:4: (lv_story_1_0= ruleStory )
            {
            // InternalTraceryPlusPlus.g:99:4: (lv_story_1_0= ruleStory )
            // InternalTraceryPlusPlus.g:100:5: lv_story_1_0= ruleStory
            {

            					newCompositeNode(grammarAccess.getTraceryPlusPlusProgramAccess().getStoryStoryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_story_1_0=ruleStory();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTraceryPlusPlusProgramRule());
            					}
            					set(
            						current,
            						"story",
            						lv_story_1_0,
            						"tracerypp.TraceryPlusPlus.Story");
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
    // $ANTLR end "ruleTraceryPlusPlusProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalTraceryPlusPlus.g:121:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalTraceryPlusPlus.g:121:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalTraceryPlusPlus.g:122:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalTraceryPlusPlus.g:128:1: ruleStatement returns [EObject current=null] : this_Declaration_0= ruleDeclaration ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Declaration_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:134:2: (this_Declaration_0= ruleDeclaration )
            // InternalTraceryPlusPlus.g:135:2: this_Declaration_0= ruleDeclaration
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
    // InternalTraceryPlusPlus.g:146:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalTraceryPlusPlus.g:146:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalTraceryPlusPlus.g:147:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // InternalTraceryPlusPlus.g:153:1: ruleDeclaration returns [EObject current=null] : (this_ListDeclaration_0= ruleListDeclaration | this_ObjectDeclaration_1= ruleObjectDeclaration ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_ListDeclaration_0 = null;

        EObject this_ObjectDeclaration_1 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:159:2: ( (this_ListDeclaration_0= ruleListDeclaration | this_ObjectDeclaration_1= ruleObjectDeclaration ) )
            // InternalTraceryPlusPlus.g:160:2: (this_ListDeclaration_0= ruleListDeclaration | this_ObjectDeclaration_1= ruleObjectDeclaration )
            {
            // InternalTraceryPlusPlus.g:160:2: (this_ListDeclaration_0= ruleListDeclaration | this_ObjectDeclaration_1= ruleObjectDeclaration )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTraceryPlusPlus.g:161:3: this_ListDeclaration_0= ruleListDeclaration
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
                    // InternalTraceryPlusPlus.g:170:3: this_ObjectDeclaration_1= ruleObjectDeclaration
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
    // InternalTraceryPlusPlus.g:182:1: entryRuleStory returns [EObject current=null] : iv_ruleStory= ruleStory EOF ;
    public final EObject entryRuleStory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStory = null;


        try {
            // InternalTraceryPlusPlus.g:182:46: (iv_ruleStory= ruleStory EOF )
            // InternalTraceryPlusPlus.g:183:2: iv_ruleStory= ruleStory EOF
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
    // InternalTraceryPlusPlus.g:189:1: ruleStory returns [EObject current=null] : ( () otherlv_1= 'The' otherlv_2= 'story:' ( ( (lv_story_3_1= ruleWord | lv_story_3_2= ruleStoryVariable | lv_story_3_3= ruleObjectAttribute ) ) )* ) ;
    public final EObject ruleStory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_story_3_1 = null;

        EObject lv_story_3_2 = null;

        EObject lv_story_3_3 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:195:2: ( ( () otherlv_1= 'The' otherlv_2= 'story:' ( ( (lv_story_3_1= ruleWord | lv_story_3_2= ruleStoryVariable | lv_story_3_3= ruleObjectAttribute ) ) )* ) )
            // InternalTraceryPlusPlus.g:196:2: ( () otherlv_1= 'The' otherlv_2= 'story:' ( ( (lv_story_3_1= ruleWord | lv_story_3_2= ruleStoryVariable | lv_story_3_3= ruleObjectAttribute ) ) )* )
            {
            // InternalTraceryPlusPlus.g:196:2: ( () otherlv_1= 'The' otherlv_2= 'story:' ( ( (lv_story_3_1= ruleWord | lv_story_3_2= ruleStoryVariable | lv_story_3_3= ruleObjectAttribute ) ) )* )
            // InternalTraceryPlusPlus.g:197:3: () otherlv_1= 'The' otherlv_2= 'story:' ( ( (lv_story_3_1= ruleWord | lv_story_3_2= ruleStoryVariable | lv_story_3_3= ruleObjectAttribute ) ) )*
            {
            // InternalTraceryPlusPlus.g:197:3: ()
            // InternalTraceryPlusPlus.g:198:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStoryAccess().getStoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getStoryAccess().getTheKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getStoryAccess().getStoryKeyword_2());
            		
            // InternalTraceryPlusPlus.g:212:3: ( ( (lv_story_3_1= ruleWord | lv_story_3_2= ruleStoryVariable | lv_story_3_3= ruleObjectAttribute ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_STRING)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:213:4: ( (lv_story_3_1= ruleWord | lv_story_3_2= ruleStoryVariable | lv_story_3_3= ruleObjectAttribute ) )
            	    {
            	    // InternalTraceryPlusPlus.g:213:4: ( (lv_story_3_1= ruleWord | lv_story_3_2= ruleStoryVariable | lv_story_3_3= ruleObjectAttribute ) )
            	    // InternalTraceryPlusPlus.g:214:5: (lv_story_3_1= ruleWord | lv_story_3_2= ruleStoryVariable | lv_story_3_3= ruleObjectAttribute )
            	    {
            	    // InternalTraceryPlusPlus.g:214:5: (lv_story_3_1= ruleWord | lv_story_3_2= ruleStoryVariable | lv_story_3_3= ruleObjectAttribute )
            	    int alt3=3;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==RULE_STRING) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==RULE_ID) ) {
            	        int LA3_2 = input.LA(2);

            	        if ( (LA3_2==EOF||(LA3_2>=RULE_ID && LA3_2<=RULE_STRING)||(LA3_2>=29 && LA3_2<=33)) ) {
            	            alt3=2;
            	        }
            	        else if ( (LA3_2==28) ) {
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
            	            // InternalTraceryPlusPlus.g:215:6: lv_story_3_1= ruleWord
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
            	            							"tracerypp.TraceryPlusPlus.Word");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalTraceryPlusPlus.g:231:6: lv_story_3_2= ruleStoryVariable
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
            	            							"tracerypp.TraceryPlusPlus.StoryVariable");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalTraceryPlusPlus.g:247:6: lv_story_3_3= ruleObjectAttribute
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
            	            							"tracerypp.TraceryPlusPlus.ObjectAttribute");
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
    // InternalTraceryPlusPlus.g:269:1: entryRuleListDeclaration returns [EObject current=null] : iv_ruleListDeclaration= ruleListDeclaration EOF ;
    public final EObject entryRuleListDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListDeclaration = null;


        try {
            // InternalTraceryPlusPlus.g:269:56: (iv_ruleListDeclaration= ruleListDeclaration EOF )
            // InternalTraceryPlusPlus.g:270:2: iv_ruleListDeclaration= ruleListDeclaration EOF
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
    // InternalTraceryPlusPlus.g:276:1: ruleListDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= ruleVariable ) ) ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' ) | (otherlv_4= 'can' otherlv_5= 'be' ) ) ruleAssignmentOperator ( (lv_list_7_0= ruleWordList ) ) ) ;
    public final EObject ruleListDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_name_0_0 = null;

        EObject lv_list_7_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:282:2: ( ( ( (lv_name_0_0= ruleVariable ) ) ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' ) | (otherlv_4= 'can' otherlv_5= 'be' ) ) ruleAssignmentOperator ( (lv_list_7_0= ruleWordList ) ) ) )
            // InternalTraceryPlusPlus.g:283:2: ( ( (lv_name_0_0= ruleVariable ) ) ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' ) | (otherlv_4= 'can' otherlv_5= 'be' ) ) ruleAssignmentOperator ( (lv_list_7_0= ruleWordList ) ) )
            {
            // InternalTraceryPlusPlus.g:283:2: ( ( (lv_name_0_0= ruleVariable ) ) ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' ) | (otherlv_4= 'can' otherlv_5= 'be' ) ) ruleAssignmentOperator ( (lv_list_7_0= ruleWordList ) ) )
            // InternalTraceryPlusPlus.g:284:3: ( (lv_name_0_0= ruleVariable ) ) ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' ) | (otherlv_4= 'can' otherlv_5= 'be' ) ) ruleAssignmentOperator ( (lv_list_7_0= ruleWordList ) )
            {
            // InternalTraceryPlusPlus.g:284:3: ( (lv_name_0_0= ruleVariable ) )
            // InternalTraceryPlusPlus.g:285:4: (lv_name_0_0= ruleVariable )
            {
            // InternalTraceryPlusPlus.g:285:4: (lv_name_0_0= ruleVariable )
            // InternalTraceryPlusPlus.g:286:5: lv_name_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getListDeclarationAccess().getNameVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_0_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"tracerypp.TraceryPlusPlus.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTraceryPlusPlus.g:303:3: ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' ) | (otherlv_4= 'can' otherlv_5= 'be' ) )
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
                    // InternalTraceryPlusPlus.g:304:4: (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' )
                    {
                    // InternalTraceryPlusPlus.g:304:4: (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' )
                    // InternalTraceryPlusPlus.g:305:5: otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values'
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
                    // InternalTraceryPlusPlus.g:319:4: (otherlv_4= 'can' otherlv_5= 'be' )
                    {
                    // InternalTraceryPlusPlus.g:319:4: (otherlv_4= 'can' otherlv_5= 'be' )
                    // InternalTraceryPlusPlus.g:320:5: otherlv_4= 'can' otherlv_5= 'be'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_10); 

                    					newLeafNode(otherlv_4, grammarAccess.getListDeclarationAccess().getCanKeyword_1_1_0());
                    				
                    otherlv_5=(Token)match(input,16,FOLLOW_9); 

                    					newLeafNode(otherlv_5, grammarAccess.getListDeclarationAccess().getBeKeyword_1_1_1());
                    				

                    }


                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getListDeclarationAccess().getAssignmentOperatorParserRuleCall_2());
            		
            pushFollow(FOLLOW_11);
            ruleAssignmentOperator();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalTraceryPlusPlus.g:337:3: ( (lv_list_7_0= ruleWordList ) )
            // InternalTraceryPlusPlus.g:338:4: (lv_list_7_0= ruleWordList )
            {
            // InternalTraceryPlusPlus.g:338:4: (lv_list_7_0= ruleWordList )
            // InternalTraceryPlusPlus.g:339:5: lv_list_7_0= ruleWordList
            {

            					newCompositeNode(grammarAccess.getListDeclarationAccess().getListWordListParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_list_7_0=ruleWordList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListDeclarationRule());
            					}
            					set(
            						current,
            						"list",
            						lv_list_7_0,
            						"tracerypp.TraceryPlusPlus.WordList");
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
    // InternalTraceryPlusPlus.g:360:1: entryRuleObjectDeclaration returns [EObject current=null] : iv_ruleObjectDeclaration= ruleObjectDeclaration EOF ;
    public final EObject entryRuleObjectDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectDeclaration = null;


        try {
            // InternalTraceryPlusPlus.g:360:58: (iv_ruleObjectDeclaration= ruleObjectDeclaration EOF )
            // InternalTraceryPlusPlus.g:361:2: iv_ruleObjectDeclaration= ruleObjectDeclaration EOF
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
    // InternalTraceryPlusPlus.g:367:1: ruleObjectDeclaration returns [EObject current=null] : (otherlv_0= 'There' (otherlv_1= 'is' | otherlv_2= 'are' ) (otherlv_3= 'a' | otherlv_4= 'an' )? ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'He' | otherlv_7= 'She' | otherlv_8= 'It' | otherlv_9= 'They' ) (otherlv_10= 'has' | otherlv_11= 'have' ) otherlv_12= 'attributes' ruleAssignmentOperator ( (lv_attributes_14_0= ruleAttributeList ) ) ) ;
    public final EObject ruleObjectDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_attributes_14_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:373:2: ( (otherlv_0= 'There' (otherlv_1= 'is' | otherlv_2= 'are' ) (otherlv_3= 'a' | otherlv_4= 'an' )? ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'He' | otherlv_7= 'She' | otherlv_8= 'It' | otherlv_9= 'They' ) (otherlv_10= 'has' | otherlv_11= 'have' ) otherlv_12= 'attributes' ruleAssignmentOperator ( (lv_attributes_14_0= ruleAttributeList ) ) ) )
            // InternalTraceryPlusPlus.g:374:2: (otherlv_0= 'There' (otherlv_1= 'is' | otherlv_2= 'are' ) (otherlv_3= 'a' | otherlv_4= 'an' )? ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'He' | otherlv_7= 'She' | otherlv_8= 'It' | otherlv_9= 'They' ) (otherlv_10= 'has' | otherlv_11= 'have' ) otherlv_12= 'attributes' ruleAssignmentOperator ( (lv_attributes_14_0= ruleAttributeList ) ) )
            {
            // InternalTraceryPlusPlus.g:374:2: (otherlv_0= 'There' (otherlv_1= 'is' | otherlv_2= 'are' ) (otherlv_3= 'a' | otherlv_4= 'an' )? ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'He' | otherlv_7= 'She' | otherlv_8= 'It' | otherlv_9= 'They' ) (otherlv_10= 'has' | otherlv_11= 'have' ) otherlv_12= 'attributes' ruleAssignmentOperator ( (lv_attributes_14_0= ruleAttributeList ) ) )
            // InternalTraceryPlusPlus.g:375:3: otherlv_0= 'There' (otherlv_1= 'is' | otherlv_2= 'are' ) (otherlv_3= 'a' | otherlv_4= 'an' )? ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'He' | otherlv_7= 'She' | otherlv_8= 'It' | otherlv_9= 'They' ) (otherlv_10= 'has' | otherlv_11= 'have' ) otherlv_12= 'attributes' ruleAssignmentOperator ( (lv_attributes_14_0= ruleAttributeList ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectDeclarationAccess().getThereKeyword_0());
            		
            // InternalTraceryPlusPlus.g:379:3: (otherlv_1= 'is' | otherlv_2= 'are' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTraceryPlusPlus.g:380:4: otherlv_1= 'is'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getObjectDeclarationAccess().getIsKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:385:4: otherlv_2= 'are'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getObjectDeclarationAccess().getAreKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:390:3: (otherlv_3= 'a' | otherlv_4= 'an' )?
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            else if ( (LA7_0==21) ) {
                alt7=2;
            }
            switch (alt7) {
                case 1 :
                    // InternalTraceryPlusPlus.g:391:4: otherlv_3= 'a'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getObjectDeclarationAccess().getAKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:396:4: otherlv_4= 'an'
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getObjectDeclarationAccess().getAnKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:401:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalTraceryPlusPlus.g:402:4: (lv_name_5_0= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:402:4: (lv_name_5_0= RULE_ID )
            // InternalTraceryPlusPlus.g:403:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_5_0, grammarAccess.getObjectDeclarationAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalTraceryPlusPlus.g:419:3: (otherlv_6= 'He' | otherlv_7= 'She' | otherlv_8= 'It' | otherlv_9= 'They' )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case 24:
                {
                alt8=3;
                }
                break;
            case 25:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalTraceryPlusPlus.g:420:4: otherlv_6= 'He'
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getObjectDeclarationAccess().getHeKeyword_4_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:425:4: otherlv_7= 'She'
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getObjectDeclarationAccess().getSheKeyword_4_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:430:4: otherlv_8= 'It'
                    {
                    otherlv_8=(Token)match(input,24,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getObjectDeclarationAccess().getItKeyword_4_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalTraceryPlusPlus.g:435:4: otherlv_9= 'They'
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_16); 

                    				newLeafNode(otherlv_9, grammarAccess.getObjectDeclarationAccess().getTheyKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:440:3: (otherlv_10= 'has' | otherlv_11= 'have' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            else if ( (LA9_0==14) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalTraceryPlusPlus.g:441:4: otherlv_10= 'has'
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_17); 

                    				newLeafNode(otherlv_10, grammarAccess.getObjectDeclarationAccess().getHasKeyword_5_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:446:4: otherlv_11= 'have'
                    {
                    otherlv_11=(Token)match(input,14,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getObjectDeclarationAccess().getHaveKeyword_5_1());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_12, grammarAccess.getObjectDeclarationAccess().getAttributesKeyword_6());
            		

            			newCompositeNode(grammarAccess.getObjectDeclarationAccess().getAssignmentOperatorParserRuleCall_7());
            		
            pushFollow(FOLLOW_14);
            ruleAssignmentOperator();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalTraceryPlusPlus.g:462:3: ( (lv_attributes_14_0= ruleAttributeList ) )
            // InternalTraceryPlusPlus.g:463:4: (lv_attributes_14_0= ruleAttributeList )
            {
            // InternalTraceryPlusPlus.g:463:4: (lv_attributes_14_0= ruleAttributeList )
            // InternalTraceryPlusPlus.g:464:5: lv_attributes_14_0= ruleAttributeList
            {

            					newCompositeNode(grammarAccess.getObjectDeclarationAccess().getAttributesAttributeListParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_attributes_14_0=ruleAttributeList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectDeclarationRule());
            					}
            					set(
            						current,
            						"attributes",
            						lv_attributes_14_0,
            						"tracerypp.TraceryPlusPlus.AttributeList");
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
    // InternalTraceryPlusPlus.g:485:1: entryRuleWord returns [EObject current=null] : iv_ruleWord= ruleWord EOF ;
    public final EObject entryRuleWord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWord = null;


        try {
            // InternalTraceryPlusPlus.g:485:45: (iv_ruleWord= ruleWord EOF )
            // InternalTraceryPlusPlus.g:486:2: iv_ruleWord= ruleWord EOF
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
    // InternalTraceryPlusPlus.g:492:1: ruleWord returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleWord() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:498:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalTraceryPlusPlus.g:499:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalTraceryPlusPlus.g:499:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalTraceryPlusPlus.g:500:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalTraceryPlusPlus.g:500:3: (lv_value_0_0= RULE_STRING )
            // InternalTraceryPlusPlus.g:501:4: lv_value_0_0= RULE_STRING
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
    // InternalTraceryPlusPlus.g:520:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalTraceryPlusPlus.g:520:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalTraceryPlusPlus.g:521:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalTraceryPlusPlus.g:527:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:533:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:534:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:534:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalTraceryPlusPlus.g:535:3: (lv_name_0_0= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:535:3: (lv_name_0_0= RULE_ID )
            // InternalTraceryPlusPlus.g:536:4: lv_name_0_0= RULE_ID
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
    // InternalTraceryPlusPlus.g:555:1: entryRuleStoryVariable returns [EObject current=null] : iv_ruleStoryVariable= ruleStoryVariable EOF ;
    public final EObject entryRuleStoryVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStoryVariable = null;


        try {
            // InternalTraceryPlusPlus.g:555:54: (iv_ruleStoryVariable= ruleStoryVariable EOF )
            // InternalTraceryPlusPlus.g:556:2: iv_ruleStoryVariable= ruleStoryVariable EOF
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
    // InternalTraceryPlusPlus.g:562:1: ruleStoryVariable returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )* ) ;
    public final EObject ruleStoryVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_modifiers_1_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:568:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )* ) )
            // InternalTraceryPlusPlus.g:569:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )* )
            {
            // InternalTraceryPlusPlus.g:569:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )* )
            // InternalTraceryPlusPlus.g:570:3: ( (otherlv_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )*
            {
            // InternalTraceryPlusPlus.g:570:3: ( (otherlv_0= RULE_ID ) )
            // InternalTraceryPlusPlus.g:571:4: (otherlv_0= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:571:4: (otherlv_0= RULE_ID )
            // InternalTraceryPlusPlus.g:572:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStoryVariableRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_0, grammarAccess.getStoryVariableAccess().getVariableVariableCrossReference_0_0());
            				

            }


            }

            // InternalTraceryPlusPlus.g:583:3: ( (lv_modifiers_1_0= ruleModifier ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=29 && LA10_0<=33)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:584:4: (lv_modifiers_1_0= ruleModifier )
            	    {
            	    // InternalTraceryPlusPlus.g:584:4: (lv_modifiers_1_0= ruleModifier )
            	    // InternalTraceryPlusPlus.g:585:5: lv_modifiers_1_0= ruleModifier
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
            	    						"tracerypp.TraceryPlusPlus.Modifier");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // $ANTLR end "ruleStoryVariable"


    // $ANTLR start "entryRuleAttribute"
    // InternalTraceryPlusPlus.g:606:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalTraceryPlusPlus.g:606:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalTraceryPlusPlus.g:607:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalTraceryPlusPlus.g:613:1: ruleAttribute returns [EObject current=null] : (this_JustNameAttribute_0= ruleJustNameAttribute | this_NameExistingListAttribute_1= ruleNameExistingListAttribute | this_NameValueAttribute_2= ruleNameValueAttribute ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_JustNameAttribute_0 = null;

        EObject this_NameExistingListAttribute_1 = null;

        EObject this_NameValueAttribute_2 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:619:2: ( (this_JustNameAttribute_0= ruleJustNameAttribute | this_NameExistingListAttribute_1= ruleNameExistingListAttribute | this_NameValueAttribute_2= ruleNameValueAttribute ) )
            // InternalTraceryPlusPlus.g:620:2: (this_JustNameAttribute_0= ruleJustNameAttribute | this_NameExistingListAttribute_1= ruleNameExistingListAttribute | this_NameValueAttribute_2= ruleNameValueAttribute )
            {
            // InternalTraceryPlusPlus.g:620:2: (this_JustNameAttribute_0= ruleJustNameAttribute | this_NameExistingListAttribute_1= ruleNameExistingListAttribute | this_NameValueAttribute_2= ruleNameValueAttribute )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_ID:
                case 11:
                case 17:
                case 37:
                case 39:
                    {
                    alt11=1;
                    }
                    break;
                case 34:
                    {
                    int LA11_3 = input.LA(3);

                    if ( (LA11_3==RULE_STRING) ) {
                        alt11=3;
                    }
                    else if ( (LA11_3==RULE_ID) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 35:
                    {
                    int LA11_4 = input.LA(3);

                    if ( (LA11_4==RULE_STRING) ) {
                        alt11=3;
                    }
                    else if ( (LA11_4==RULE_ID) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 36:
                    {
                    int LA11_5 = input.LA(3);

                    if ( (LA11_5==RULE_STRING) ) {
                        alt11=3;
                    }
                    else if ( (LA11_5==RULE_ID) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalTraceryPlusPlus.g:621:3: this_JustNameAttribute_0= ruleJustNameAttribute
                    {

                    			newCompositeNode(grammarAccess.getAttributeAccess().getJustNameAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_JustNameAttribute_0=ruleJustNameAttribute();

                    state._fsp--;


                    			current = this_JustNameAttribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:630:3: this_NameExistingListAttribute_1= ruleNameExistingListAttribute
                    {

                    			newCompositeNode(grammarAccess.getAttributeAccess().getNameExistingListAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NameExistingListAttribute_1=ruleNameExistingListAttribute();

                    state._fsp--;


                    			current = this_NameExistingListAttribute_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:639:3: this_NameValueAttribute_2= ruleNameValueAttribute
                    {

                    			newCompositeNode(grammarAccess.getAttributeAccess().getNameValueAttributeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NameValueAttribute_2=ruleNameValueAttribute();

                    state._fsp--;


                    			current = this_NameValueAttribute_2;
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleExistingVariable"
    // InternalTraceryPlusPlus.g:651:1: entryRuleExistingVariable returns [EObject current=null] : iv_ruleExistingVariable= ruleExistingVariable EOF ;
    public final EObject entryRuleExistingVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistingVariable = null;


        try {
            // InternalTraceryPlusPlus.g:651:57: (iv_ruleExistingVariable= ruleExistingVariable EOF )
            // InternalTraceryPlusPlus.g:652:2: iv_ruleExistingVariable= ruleExistingVariable EOF
            {
             newCompositeNode(grammarAccess.getExistingVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExistingVariable=ruleExistingVariable();

            state._fsp--;

             current =iv_ruleExistingVariable; 
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
    // $ANTLR end "entryRuleExistingVariable"


    // $ANTLR start "ruleExistingVariable"
    // InternalTraceryPlusPlus.g:658:1: ruleExistingVariable returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleExistingVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:664:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:665:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:665:2: ( (otherlv_0= RULE_ID ) )
            // InternalTraceryPlusPlus.g:666:3: (otherlv_0= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:666:3: (otherlv_0= RULE_ID )
            // InternalTraceryPlusPlus.g:667:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getExistingVariableRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getExistingVariableAccess().getPointerVariableCrossReference_0());
            			

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
    // $ANTLR end "ruleExistingVariable"


    // $ANTLR start "entryRuleJustNameAttribute"
    // InternalTraceryPlusPlus.g:681:1: entryRuleJustNameAttribute returns [EObject current=null] : iv_ruleJustNameAttribute= ruleJustNameAttribute EOF ;
    public final EObject entryRuleJustNameAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJustNameAttribute = null;


        try {
            // InternalTraceryPlusPlus.g:681:58: (iv_ruleJustNameAttribute= ruleJustNameAttribute EOF )
            // InternalTraceryPlusPlus.g:682:2: iv_ruleJustNameAttribute= ruleJustNameAttribute EOF
            {
             newCompositeNode(grammarAccess.getJustNameAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJustNameAttribute=ruleJustNameAttribute();

            state._fsp--;

             current =iv_ruleJustNameAttribute; 
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
    // $ANTLR end "entryRuleJustNameAttribute"


    // $ANTLR start "ruleJustNameAttribute"
    // InternalTraceryPlusPlus.g:688:1: ruleJustNameAttribute returns [EObject current=null] : ( (lv_name_0_0= ruleExistingVariable ) ) ;
    public final EObject ruleJustNameAttribute() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:694:2: ( ( (lv_name_0_0= ruleExistingVariable ) ) )
            // InternalTraceryPlusPlus.g:695:2: ( (lv_name_0_0= ruleExistingVariable ) )
            {
            // InternalTraceryPlusPlus.g:695:2: ( (lv_name_0_0= ruleExistingVariable ) )
            // InternalTraceryPlusPlus.g:696:3: (lv_name_0_0= ruleExistingVariable )
            {
            // InternalTraceryPlusPlus.g:696:3: (lv_name_0_0= ruleExistingVariable )
            // InternalTraceryPlusPlus.g:697:4: lv_name_0_0= ruleExistingVariable
            {

            				newCompositeNode(grammarAccess.getJustNameAttributeAccess().getNameExistingVariableParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleExistingVariable();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getJustNameAttributeRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"tracerypp.TraceryPlusPlus.ExistingVariable");
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
    // $ANTLR end "ruleJustNameAttribute"


    // $ANTLR start "entryRuleNameExistingListAttribute"
    // InternalTraceryPlusPlus.g:717:1: entryRuleNameExistingListAttribute returns [EObject current=null] : iv_ruleNameExistingListAttribute= ruleNameExistingListAttribute EOF ;
    public final EObject entryRuleNameExistingListAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExistingListAttribute = null;


        try {
            // InternalTraceryPlusPlus.g:717:66: (iv_ruleNameExistingListAttribute= ruleNameExistingListAttribute EOF )
            // InternalTraceryPlusPlus.g:718:2: iv_ruleNameExistingListAttribute= ruleNameExistingListAttribute EOF
            {
             newCompositeNode(grammarAccess.getNameExistingListAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNameExistingListAttribute=ruleNameExistingListAttribute();

            state._fsp--;

             current =iv_ruleNameExistingListAttribute; 
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
    // $ANTLR end "entryRuleNameExistingListAttribute"


    // $ANTLR start "ruleNameExistingListAttribute"
    // InternalTraceryPlusPlus.g:724:1: ruleNameExistingListAttribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleVariable ) ) ruleAssignmentOperator ( (lv_value_2_0= ruleExistingVariable ) ) ) ;
    public final EObject ruleNameExistingListAttribute() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:730:2: ( ( ( (lv_name_0_0= ruleVariable ) ) ruleAssignmentOperator ( (lv_value_2_0= ruleExistingVariable ) ) ) )
            // InternalTraceryPlusPlus.g:731:2: ( ( (lv_name_0_0= ruleVariable ) ) ruleAssignmentOperator ( (lv_value_2_0= ruleExistingVariable ) ) )
            {
            // InternalTraceryPlusPlus.g:731:2: ( ( (lv_name_0_0= ruleVariable ) ) ruleAssignmentOperator ( (lv_value_2_0= ruleExistingVariable ) ) )
            // InternalTraceryPlusPlus.g:732:3: ( (lv_name_0_0= ruleVariable ) ) ruleAssignmentOperator ( (lv_value_2_0= ruleExistingVariable ) )
            {
            // InternalTraceryPlusPlus.g:732:3: ( (lv_name_0_0= ruleVariable ) )
            // InternalTraceryPlusPlus.g:733:4: (lv_name_0_0= ruleVariable )
            {
            // InternalTraceryPlusPlus.g:733:4: (lv_name_0_0= ruleVariable )
            // InternalTraceryPlusPlus.g:734:5: lv_name_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getNameExistingListAttributeAccess().getNameVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_0_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNameExistingListAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"tracerypp.TraceryPlusPlus.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getNameExistingListAttributeAccess().getAssignmentOperatorParserRuleCall_1());
            		
            pushFollow(FOLLOW_14);
            ruleAssignmentOperator();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalTraceryPlusPlus.g:758:3: ( (lv_value_2_0= ruleExistingVariable ) )
            // InternalTraceryPlusPlus.g:759:4: (lv_value_2_0= ruleExistingVariable )
            {
            // InternalTraceryPlusPlus.g:759:4: (lv_value_2_0= ruleExistingVariable )
            // InternalTraceryPlusPlus.g:760:5: lv_value_2_0= ruleExistingVariable
            {

            					newCompositeNode(grammarAccess.getNameExistingListAttributeAccess().getValueExistingVariableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleExistingVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNameExistingListAttributeRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"tracerypp.TraceryPlusPlus.ExistingVariable");
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
    // $ANTLR end "ruleNameExistingListAttribute"


    // $ANTLR start "entryRuleNameValueAttribute"
    // InternalTraceryPlusPlus.g:781:1: entryRuleNameValueAttribute returns [EObject current=null] : iv_ruleNameValueAttribute= ruleNameValueAttribute EOF ;
    public final EObject entryRuleNameValueAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameValueAttribute = null;


        try {
            // InternalTraceryPlusPlus.g:781:59: (iv_ruleNameValueAttribute= ruleNameValueAttribute EOF )
            // InternalTraceryPlusPlus.g:782:2: iv_ruleNameValueAttribute= ruleNameValueAttribute EOF
            {
             newCompositeNode(grammarAccess.getNameValueAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNameValueAttribute=ruleNameValueAttribute();

            state._fsp--;

             current =iv_ruleNameValueAttribute; 
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
    // $ANTLR end "entryRuleNameValueAttribute"


    // $ANTLR start "ruleNameValueAttribute"
    // InternalTraceryPlusPlus.g:788:1: ruleNameValueAttribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleVariable ) ) ruleAssignmentOperator ( (lv_value_2_0= ruleWord ) ) ) ;
    public final EObject ruleNameValueAttribute() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:794:2: ( ( ( (lv_name_0_0= ruleVariable ) ) ruleAssignmentOperator ( (lv_value_2_0= ruleWord ) ) ) )
            // InternalTraceryPlusPlus.g:795:2: ( ( (lv_name_0_0= ruleVariable ) ) ruleAssignmentOperator ( (lv_value_2_0= ruleWord ) ) )
            {
            // InternalTraceryPlusPlus.g:795:2: ( ( (lv_name_0_0= ruleVariable ) ) ruleAssignmentOperator ( (lv_value_2_0= ruleWord ) ) )
            // InternalTraceryPlusPlus.g:796:3: ( (lv_name_0_0= ruleVariable ) ) ruleAssignmentOperator ( (lv_value_2_0= ruleWord ) )
            {
            // InternalTraceryPlusPlus.g:796:3: ( (lv_name_0_0= ruleVariable ) )
            // InternalTraceryPlusPlus.g:797:4: (lv_name_0_0= ruleVariable )
            {
            // InternalTraceryPlusPlus.g:797:4: (lv_name_0_0= ruleVariable )
            // InternalTraceryPlusPlus.g:798:5: lv_name_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getNameValueAttributeAccess().getNameVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_0_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNameValueAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"tracerypp.TraceryPlusPlus.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getNameValueAttributeAccess().getAssignmentOperatorParserRuleCall_1());
            		
            pushFollow(FOLLOW_11);
            ruleAssignmentOperator();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalTraceryPlusPlus.g:822:3: ( (lv_value_2_0= ruleWord ) )
            // InternalTraceryPlusPlus.g:823:4: (lv_value_2_0= ruleWord )
            {
            // InternalTraceryPlusPlus.g:823:4: (lv_value_2_0= ruleWord )
            // InternalTraceryPlusPlus.g:824:5: lv_value_2_0= ruleWord
            {

            					newCompositeNode(grammarAccess.getNameValueAttributeAccess().getValueWordParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleWord();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNameValueAttributeRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"tracerypp.TraceryPlusPlus.Word");
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
    // $ANTLR end "ruleNameValueAttribute"


    // $ANTLR start "entryRuleObjectAttribute"
    // InternalTraceryPlusPlus.g:845:1: entryRuleObjectAttribute returns [EObject current=null] : iv_ruleObjectAttribute= ruleObjectAttribute EOF ;
    public final EObject entryRuleObjectAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectAttribute = null;


        try {
            // InternalTraceryPlusPlus.g:845:56: (iv_ruleObjectAttribute= ruleObjectAttribute EOF )
            // InternalTraceryPlusPlus.g:846:2: iv_ruleObjectAttribute= ruleObjectAttribute EOF
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
    // InternalTraceryPlusPlus.g:852:1: ruleObjectAttribute returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ( (lv_modifiers_3_0= ruleModifier ) )* ) ;
    public final EObject ruleObjectAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_modifiers_3_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:858:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ( (lv_modifiers_3_0= ruleModifier ) )* ) )
            // InternalTraceryPlusPlus.g:859:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ( (lv_modifiers_3_0= ruleModifier ) )* )
            {
            // InternalTraceryPlusPlus.g:859:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ( (lv_modifiers_3_0= ruleModifier ) )* )
            // InternalTraceryPlusPlus.g:860:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ( (lv_modifiers_3_0= ruleModifier ) )*
            {
            // InternalTraceryPlusPlus.g:860:3: ( (otherlv_0= RULE_ID ) )
            // InternalTraceryPlusPlus.g:861:4: (otherlv_0= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:861:4: (otherlv_0= RULE_ID )
            // InternalTraceryPlusPlus.g:862:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectAttributeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_0, grammarAccess.getObjectAttributeAccess().getObjectObjectDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectAttributeAccess().getFullStopKeyword_1());
            		
            // InternalTraceryPlusPlus.g:877:3: ( (otherlv_2= RULE_ID ) )
            // InternalTraceryPlusPlus.g:878:4: (otherlv_2= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:878:4: (otherlv_2= RULE_ID )
            // InternalTraceryPlusPlus.g:879:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectAttributeRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_2, grammarAccess.getObjectAttributeAccess().getAttributeVariableCrossReference_2_0());
            				

            }


            }

            // InternalTraceryPlusPlus.g:890:3: ( (lv_modifiers_3_0= ruleModifier ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=29 && LA12_0<=33)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:891:4: (lv_modifiers_3_0= ruleModifier )
            	    {
            	    // InternalTraceryPlusPlus.g:891:4: (lv_modifiers_3_0= ruleModifier )
            	    // InternalTraceryPlusPlus.g:892:5: lv_modifiers_3_0= ruleModifier
            	    {

            	    					newCompositeNode(grammarAccess.getObjectAttributeAccess().getModifiersModifierParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_modifiers_3_0=ruleModifier();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getObjectAttributeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"modifiers",
            	    						lv_modifiers_3_0,
            	    						"tracerypp.TraceryPlusPlus.Modifier");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleObjectAttribute"


    // $ANTLR start "entryRuleWordList"
    // InternalTraceryPlusPlus.g:913:1: entryRuleWordList returns [EObject current=null] : iv_ruleWordList= ruleWordList EOF ;
    public final EObject entryRuleWordList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordList = null;


        try {
            // InternalTraceryPlusPlus.g:913:49: (iv_ruleWordList= ruleWordList EOF )
            // InternalTraceryPlusPlus.g:914:2: iv_ruleWordList= ruleWordList EOF
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
    // InternalTraceryPlusPlus.g:920:1: ruleWordList returns [EObject current=null] : ( ( (lv_words_0_0= ruleWord ) ) ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )* ) ;
    public final EObject ruleWordList() throws RecognitionException {
        EObject current = null;

        EObject lv_words_0_0 = null;

        EObject lv_words_2_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:926:2: ( ( ( (lv_words_0_0= ruleWord ) ) ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )* ) )
            // InternalTraceryPlusPlus.g:927:2: ( ( (lv_words_0_0= ruleWord ) ) ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )* )
            {
            // InternalTraceryPlusPlus.g:927:2: ( ( (lv_words_0_0= ruleWord ) ) ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )* )
            // InternalTraceryPlusPlus.g:928:3: ( (lv_words_0_0= ruleWord ) ) ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )*
            {
            // InternalTraceryPlusPlus.g:928:3: ( (lv_words_0_0= ruleWord ) )
            // InternalTraceryPlusPlus.g:929:4: (lv_words_0_0= ruleWord )
            {
            // InternalTraceryPlusPlus.g:929:4: (lv_words_0_0= ruleWord )
            // InternalTraceryPlusPlus.g:930:5: lv_words_0_0= ruleWord
            {

            					newCompositeNode(grammarAccess.getWordListAccess().getWordsWordParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_words_0_0=ruleWord();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWordListRule());
            					}
            					add(
            						current,
            						"words",
            						lv_words_0_0,
            						"tracerypp.TraceryPlusPlus.Word");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTraceryPlusPlus.g:947:3: ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=37 && LA13_0<=38)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:948:4: ruleSeparatorOr ( (lv_words_2_0= ruleWord ) )
            	    {

            	    				newCompositeNode(grammarAccess.getWordListAccess().getSeparatorOrParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_11);
            	    ruleSeparatorOr();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalTraceryPlusPlus.g:955:4: ( (lv_words_2_0= ruleWord ) )
            	    // InternalTraceryPlusPlus.g:956:5: (lv_words_2_0= ruleWord )
            	    {
            	    // InternalTraceryPlusPlus.g:956:5: (lv_words_2_0= ruleWord )
            	    // InternalTraceryPlusPlus.g:957:6: lv_words_2_0= ruleWord
            	    {

            	    						newCompositeNode(grammarAccess.getWordListAccess().getWordsWordParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_words_2_0=ruleWord();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWordListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"words",
            	    							lv_words_2_0,
            	    							"tracerypp.TraceryPlusPlus.Word");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalTraceryPlusPlus.g:979:1: entryRuleAttributeList returns [EObject current=null] : iv_ruleAttributeList= ruleAttributeList EOF ;
    public final EObject entryRuleAttributeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeList = null;


        try {
            // InternalTraceryPlusPlus.g:979:54: (iv_ruleAttributeList= ruleAttributeList EOF )
            // InternalTraceryPlusPlus.g:980:2: iv_ruleAttributeList= ruleAttributeList EOF
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
    // InternalTraceryPlusPlus.g:986:1: ruleAttributeList returns [EObject current=null] : ( ( (lv_attributes_0_0= ruleAttribute ) ) ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )* ) ;
    public final EObject ruleAttributeList() throws RecognitionException {
        EObject current = null;

        EObject lv_attributes_0_0 = null;

        EObject lv_attributes_2_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:992:2: ( ( ( (lv_attributes_0_0= ruleAttribute ) ) ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )* ) )
            // InternalTraceryPlusPlus.g:993:2: ( ( (lv_attributes_0_0= ruleAttribute ) ) ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )* )
            {
            // InternalTraceryPlusPlus.g:993:2: ( ( (lv_attributes_0_0= ruleAttribute ) ) ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )* )
            // InternalTraceryPlusPlus.g:994:3: ( (lv_attributes_0_0= ruleAttribute ) ) ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )*
            {
            // InternalTraceryPlusPlus.g:994:3: ( (lv_attributes_0_0= ruleAttribute ) )
            // InternalTraceryPlusPlus.g:995:4: (lv_attributes_0_0= ruleAttribute )
            {
            // InternalTraceryPlusPlus.g:995:4: (lv_attributes_0_0= ruleAttribute )
            // InternalTraceryPlusPlus.g:996:5: lv_attributes_0_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_attributes_0_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeListRule());
            					}
            					add(
            						current,
            						"attributes",
            						lv_attributes_0_0,
            						"tracerypp.TraceryPlusPlus.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTraceryPlusPlus.g:1013:3: ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==37||LA14_0==39) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1014:4: ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) )
            	    {

            	    				newCompositeNode(grammarAccess.getAttributeListAccess().getSeparatorAndParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_14);
            	    ruleSeparatorAnd();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalTraceryPlusPlus.g:1021:4: ( (lv_attributes_2_0= ruleAttribute ) )
            	    // InternalTraceryPlusPlus.g:1022:5: (lv_attributes_2_0= ruleAttribute )
            	    {
            	    // InternalTraceryPlusPlus.g:1022:5: (lv_attributes_2_0= ruleAttribute )
            	    // InternalTraceryPlusPlus.g:1023:6: lv_attributes_2_0= ruleAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_attributes_2_0=ruleAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAttributeListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attributes",
            	    							lv_attributes_2_0,
            	    							"tracerypp.TraceryPlusPlus.Attribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalTraceryPlusPlus.g:1045:1: entryRuleModifier returns [String current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final String entryRuleModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModifier = null;


        try {
            // InternalTraceryPlusPlus.g:1045:48: (iv_ruleModifier= ruleModifier EOF )
            // InternalTraceryPlusPlus.g:1046:2: iv_ruleModifier= ruleModifier EOF
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
    // InternalTraceryPlusPlus.g:1052:1: ruleModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CapitalizationModifier_0= ruleCapitalizationModifier | this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier | this_PluralityModifier_2= rulePluralityModifier | this_ArticleModifier_3= ruleArticleModifier | this_PastTenseModifier_4= rulePastTenseModifier ) ;
    public final AntlrDatatypeRuleToken ruleModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_CapitalizationModifier_0 = null;

        AntlrDatatypeRuleToken this_FullCapitalizationModifier_1 = null;

        AntlrDatatypeRuleToken this_PluralityModifier_2 = null;

        AntlrDatatypeRuleToken this_ArticleModifier_3 = null;

        AntlrDatatypeRuleToken this_PastTenseModifier_4 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1058:2: ( (this_CapitalizationModifier_0= ruleCapitalizationModifier | this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier | this_PluralityModifier_2= rulePluralityModifier | this_ArticleModifier_3= ruleArticleModifier | this_PastTenseModifier_4= rulePastTenseModifier ) )
            // InternalTraceryPlusPlus.g:1059:2: (this_CapitalizationModifier_0= ruleCapitalizationModifier | this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier | this_PluralityModifier_2= rulePluralityModifier | this_ArticleModifier_3= ruleArticleModifier | this_PastTenseModifier_4= rulePastTenseModifier )
            {
            // InternalTraceryPlusPlus.g:1059:2: (this_CapitalizationModifier_0= ruleCapitalizationModifier | this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier | this_PluralityModifier_2= rulePluralityModifier | this_ArticleModifier_3= ruleArticleModifier | this_PastTenseModifier_4= rulePastTenseModifier )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt15=1;
                }
                break;
            case 30:
                {
                alt15=2;
                }
                break;
            case 31:
                {
                alt15=3;
                }
                break;
            case 32:
                {
                alt15=4;
                }
                break;
            case 33:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1060:3: this_CapitalizationModifier_0= ruleCapitalizationModifier
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
                    // InternalTraceryPlusPlus.g:1071:3: this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier
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
                    // InternalTraceryPlusPlus.g:1082:3: this_PluralityModifier_2= rulePluralityModifier
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
                    // InternalTraceryPlusPlus.g:1093:3: this_ArticleModifier_3= ruleArticleModifier
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
                    // InternalTraceryPlusPlus.g:1104:3: this_PastTenseModifier_4= rulePastTenseModifier
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
    // InternalTraceryPlusPlus.g:1118:1: entryRuleCapitalizationModifier returns [String current=null] : iv_ruleCapitalizationModifier= ruleCapitalizationModifier EOF ;
    public final String entryRuleCapitalizationModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCapitalizationModifier = null;


        try {
            // InternalTraceryPlusPlus.g:1118:62: (iv_ruleCapitalizationModifier= ruleCapitalizationModifier EOF )
            // InternalTraceryPlusPlus.g:1119:2: iv_ruleCapitalizationModifier= ruleCapitalizationModifier EOF
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
    // InternalTraceryPlusPlus.g:1125:1: ruleCapitalizationModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.capitalize' ;
    public final AntlrDatatypeRuleToken ruleCapitalizationModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1131:2: (kw= '.capitalize' )
            // InternalTraceryPlusPlus.g:1132:2: kw= '.capitalize'
            {
            kw=(Token)match(input,29,FOLLOW_2); 

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
    // InternalTraceryPlusPlus.g:1140:1: entryRuleFullCapitalizationModifier returns [String current=null] : iv_ruleFullCapitalizationModifier= ruleFullCapitalizationModifier EOF ;
    public final String entryRuleFullCapitalizationModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFullCapitalizationModifier = null;


        try {
            // InternalTraceryPlusPlus.g:1140:66: (iv_ruleFullCapitalizationModifier= ruleFullCapitalizationModifier EOF )
            // InternalTraceryPlusPlus.g:1141:2: iv_ruleFullCapitalizationModifier= ruleFullCapitalizationModifier EOF
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
    // InternalTraceryPlusPlus.g:1147:1: ruleFullCapitalizationModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.CAPITALIZE' ;
    public final AntlrDatatypeRuleToken ruleFullCapitalizationModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1153:2: (kw= '.CAPITALIZE' )
            // InternalTraceryPlusPlus.g:1154:2: kw= '.CAPITALIZE'
            {
            kw=(Token)match(input,30,FOLLOW_2); 

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
    // InternalTraceryPlusPlus.g:1162:1: entryRulePluralityModifier returns [String current=null] : iv_rulePluralityModifier= rulePluralityModifier EOF ;
    public final String entryRulePluralityModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePluralityModifier = null;


        try {
            // InternalTraceryPlusPlus.g:1162:57: (iv_rulePluralityModifier= rulePluralityModifier EOF )
            // InternalTraceryPlusPlus.g:1163:2: iv_rulePluralityModifier= rulePluralityModifier EOF
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
    // InternalTraceryPlusPlus.g:1169:1: rulePluralityModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.s' ;
    public final AntlrDatatypeRuleToken rulePluralityModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1175:2: (kw= '.s' )
            // InternalTraceryPlusPlus.g:1176:2: kw= '.s'
            {
            kw=(Token)match(input,31,FOLLOW_2); 

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
    // InternalTraceryPlusPlus.g:1184:1: entryRuleArticleModifier returns [String current=null] : iv_ruleArticleModifier= ruleArticleModifier EOF ;
    public final String entryRuleArticleModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArticleModifier = null;


        try {
            // InternalTraceryPlusPlus.g:1184:55: (iv_ruleArticleModifier= ruleArticleModifier EOF )
            // InternalTraceryPlusPlus.g:1185:2: iv_ruleArticleModifier= ruleArticleModifier EOF
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
    // InternalTraceryPlusPlus.g:1191:1: ruleArticleModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.a' ;
    public final AntlrDatatypeRuleToken ruleArticleModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1197:2: (kw= '.a' )
            // InternalTraceryPlusPlus.g:1198:2: kw= '.a'
            {
            kw=(Token)match(input,32,FOLLOW_2); 

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
    // InternalTraceryPlusPlus.g:1206:1: entryRulePastTenseModifier returns [String current=null] : iv_rulePastTenseModifier= rulePastTenseModifier EOF ;
    public final String entryRulePastTenseModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePastTenseModifier = null;


        try {
            // InternalTraceryPlusPlus.g:1206:57: (iv_rulePastTenseModifier= rulePastTenseModifier EOF )
            // InternalTraceryPlusPlus.g:1207:2: iv_rulePastTenseModifier= rulePastTenseModifier EOF
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
    // InternalTraceryPlusPlus.g:1213:1: rulePastTenseModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.ed' ;
    public final AntlrDatatypeRuleToken rulePastTenseModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1219:2: (kw= '.ed' )
            // InternalTraceryPlusPlus.g:1220:2: kw= '.ed'
            {
            kw=(Token)match(input,33,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAssignmentOperator"
    // InternalTraceryPlusPlus.g:1228:1: entryRuleAssignmentOperator returns [String current=null] : iv_ruleAssignmentOperator= ruleAssignmentOperator EOF ;
    public final String entryRuleAssignmentOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAssignmentOperator = null;


        try {
            // InternalTraceryPlusPlus.g:1228:58: (iv_ruleAssignmentOperator= ruleAssignmentOperator EOF )
            // InternalTraceryPlusPlus.g:1229:2: iv_ruleAssignmentOperator= ruleAssignmentOperator EOF
            {
             newCompositeNode(grammarAccess.getAssignmentOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignmentOperator=ruleAssignmentOperator();

            state._fsp--;

             current =iv_ruleAssignmentOperator.getText(); 
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
    // $ANTLR end "entryRuleAssignmentOperator"


    // $ANTLR start "ruleAssignmentOperator"
    // InternalTraceryPlusPlus.g:1235:1: ruleAssignmentOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= ':' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleAssignmentOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1241:2: ( (kw= '=' | kw= ':' | kw= '-' ) )
            // InternalTraceryPlusPlus.g:1242:2: (kw= '=' | kw= ':' | kw= '-' )
            {
            // InternalTraceryPlusPlus.g:1242:2: (kw= '=' | kw= ':' | kw= '-' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt16=1;
                }
                break;
            case 35:
                {
                alt16=2;
                }
                break;
            case 36:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1243:3: kw= '='
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1249:3: kw= ':'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getColonKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1255:3: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getHyphenMinusKeyword_2());
                    		

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
    // $ANTLR end "ruleAssignmentOperator"


    // $ANTLR start "entryRuleSeparatorOr"
    // InternalTraceryPlusPlus.g:1264:1: entryRuleSeparatorOr returns [String current=null] : iv_ruleSeparatorOr= ruleSeparatorOr EOF ;
    public final String entryRuleSeparatorOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSeparatorOr = null;


        try {
            // InternalTraceryPlusPlus.g:1264:51: (iv_ruleSeparatorOr= ruleSeparatorOr EOF )
            // InternalTraceryPlusPlus.g:1265:2: iv_ruleSeparatorOr= ruleSeparatorOr EOF
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
    // InternalTraceryPlusPlus.g:1271:1: ruleSeparatorOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ',' | kw= 'or' ) ;
    public final AntlrDatatypeRuleToken ruleSeparatorOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1277:2: ( (kw= ',' | kw= 'or' ) )
            // InternalTraceryPlusPlus.g:1278:2: (kw= ',' | kw= 'or' )
            {
            // InternalTraceryPlusPlus.g:1278:2: (kw= ',' | kw= 'or' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            else if ( (LA17_0==38) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1279:3: kw= ','
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSeparatorOrAccess().getCommaKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1285:3: kw= 'or'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

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
    // InternalTraceryPlusPlus.g:1294:1: entryRuleSeparatorAnd returns [String current=null] : iv_ruleSeparatorAnd= ruleSeparatorAnd EOF ;
    public final String entryRuleSeparatorAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSeparatorAnd = null;


        try {
            // InternalTraceryPlusPlus.g:1294:52: (iv_ruleSeparatorAnd= ruleSeparatorAnd EOF )
            // InternalTraceryPlusPlus.g:1295:2: iv_ruleSeparatorAnd= ruleSeparatorAnd EOF
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
    // InternalTraceryPlusPlus.g:1301:1: ruleSeparatorAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ',' | kw= 'and' ) ;
    public final AntlrDatatypeRuleToken ruleSeparatorAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1307:2: ( (kw= ',' | kw= 'and' ) )
            // InternalTraceryPlusPlus.g:1308:2: (kw= ',' | kw= 'and' )
            {
            // InternalTraceryPlusPlus.g:1308:2: (kw= ',' | kw= 'and' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            else if ( (LA18_0==39) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1309:3: kw= ','
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSeparatorAndAccess().getCommaKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1315:3: kw= 'and'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020810L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000300010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000003E0000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000A000000002L});

}