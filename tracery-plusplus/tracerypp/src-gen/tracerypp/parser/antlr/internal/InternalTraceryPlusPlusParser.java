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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'The'", "'story'", "'can'", "'have'", "'values'", "'be'", "'has'", "'There'", "'is'", "'are'", "'a'", "'an'", "'attributes'", "'from'", "'.'", "'He'", "'She'", "'It'", "'They'", "'they'", "'them'", "'their'", "'theirs'", "'.capitalize'", "'.CAPITALIZE'", "'.s'", "'.a'", "'.ed'", "'='", "':'", "'-'", "'-->'", "','", "'or'", "'||'", "'and'", "'&&'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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

                if ( (LA1_0==RULE_ID||LA1_0==18) ) {
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
            else if ( (LA2_0==18) ) {
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
    // InternalTraceryPlusPlus.g:189:1: ruleStory returns [EObject current=null] : ( () otherlv_1= 'The' otherlv_2= 'story' ( ruleAssignmentOperator )? ( ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleStoryVariable | lv_story_4_3= ruleObjectAttribute ) ) )* ) ;
    public final EObject ruleStory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_story_4_1 = null;

        EObject lv_story_4_2 = null;

        EObject lv_story_4_3 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:195:2: ( ( () otherlv_1= 'The' otherlv_2= 'story' ( ruleAssignmentOperator )? ( ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleStoryVariable | lv_story_4_3= ruleObjectAttribute ) ) )* ) )
            // InternalTraceryPlusPlus.g:196:2: ( () otherlv_1= 'The' otherlv_2= 'story' ( ruleAssignmentOperator )? ( ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleStoryVariable | lv_story_4_3= ruleObjectAttribute ) ) )* )
            {
            // InternalTraceryPlusPlus.g:196:2: ( () otherlv_1= 'The' otherlv_2= 'story' ( ruleAssignmentOperator )? ( ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleStoryVariable | lv_story_4_3= ruleObjectAttribute ) ) )* )
            // InternalTraceryPlusPlus.g:197:3: () otherlv_1= 'The' otherlv_2= 'story' ( ruleAssignmentOperator )? ( ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleStoryVariable | lv_story_4_3= ruleObjectAttribute ) ) )*
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
            		
            // InternalTraceryPlusPlus.g:212:3: ( ruleAssignmentOperator )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=39 && LA3_0<=42)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTraceryPlusPlus.g:213:4: ruleAssignmentOperator
                    {

                    				newCompositeNode(grammarAccess.getStoryAccess().getAssignmentOperatorParserRuleCall_3());
                    			
                    pushFollow(FOLLOW_6);
                    ruleAssignmentOperator();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:221:3: ( ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleStoryVariable | lv_story_4_3= ruleObjectAttribute ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_STRING)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:222:4: ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleStoryVariable | lv_story_4_3= ruleObjectAttribute ) )
            	    {
            	    // InternalTraceryPlusPlus.g:222:4: ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleStoryVariable | lv_story_4_3= ruleObjectAttribute ) )
            	    // InternalTraceryPlusPlus.g:223:5: (lv_story_4_1= ruleWord | lv_story_4_2= ruleStoryVariable | lv_story_4_3= ruleObjectAttribute )
            	    {
            	    // InternalTraceryPlusPlus.g:223:5: (lv_story_4_1= ruleWord | lv_story_4_2= ruleStoryVariable | lv_story_4_3= ruleObjectAttribute )
            	    int alt4=3;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==RULE_STRING) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==RULE_ID) ) {
            	        int LA4_2 = input.LA(2);

            	        if ( (LA4_2==25||(LA4_2>=30 && LA4_2<=33)) ) {
            	            alt4=3;
            	        }
            	        else if ( (LA4_2==EOF||(LA4_2>=RULE_ID && LA4_2<=RULE_STRING)||(LA4_2>=34 && LA4_2<=38)) ) {
            	            alt4=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 4, 2, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalTraceryPlusPlus.g:224:6: lv_story_4_1= ruleWord
            	            {

            	            						newCompositeNode(grammarAccess.getStoryAccess().getStoryWordParserRuleCall_4_0_0());
            	            					
            	            pushFollow(FOLLOW_6);
            	            lv_story_4_1=ruleWord();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getStoryRule());
            	            						}
            	            						add(
            	            							current,
            	            							"story",
            	            							lv_story_4_1,
            	            							"tracerypp.TraceryPlusPlus.Word");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalTraceryPlusPlus.g:240:6: lv_story_4_2= ruleStoryVariable
            	            {

            	            						newCompositeNode(grammarAccess.getStoryAccess().getStoryStoryVariableParserRuleCall_4_0_1());
            	            					
            	            pushFollow(FOLLOW_6);
            	            lv_story_4_2=ruleStoryVariable();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getStoryRule());
            	            						}
            	            						add(
            	            							current,
            	            							"story",
            	            							lv_story_4_2,
            	            							"tracerypp.TraceryPlusPlus.StoryVariable");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalTraceryPlusPlus.g:256:6: lv_story_4_3= ruleObjectAttribute
            	            {

            	            						newCompositeNode(grammarAccess.getStoryAccess().getStoryObjectAttributeParserRuleCall_4_0_2());
            	            					
            	            pushFollow(FOLLOW_6);
            	            lv_story_4_3=ruleObjectAttribute();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getStoryRule());
            	            						}
            	            						add(
            	            							current,
            	            							"story",
            	            							lv_story_4_3,
            	            							"tracerypp.TraceryPlusPlus.ObjectAttribute");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalTraceryPlusPlus.g:278:1: entryRuleListDeclaration returns [EObject current=null] : iv_ruleListDeclaration= ruleListDeclaration EOF ;
    public final EObject entryRuleListDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListDeclaration = null;


        try {
            // InternalTraceryPlusPlus.g:278:56: (iv_ruleListDeclaration= ruleListDeclaration EOF )
            // InternalTraceryPlusPlus.g:279:2: iv_ruleListDeclaration= ruleListDeclaration EOF
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
    // InternalTraceryPlusPlus.g:285:1: ruleListDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= ruleVariable ) ) ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' ) | (otherlv_4= 'can' otherlv_5= 'be' ) | (otherlv_6= 'has' otherlv_7= 'values' ) ) ( ruleAssignmentOperator )? ( (lv_list_9_0= ruleWordList ) ) ) ;
    public final EObject ruleListDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_name_0_0 = null;

        EObject lv_list_9_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:291:2: ( ( ( (lv_name_0_0= ruleVariable ) ) ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' ) | (otherlv_4= 'can' otherlv_5= 'be' ) | (otherlv_6= 'has' otherlv_7= 'values' ) ) ( ruleAssignmentOperator )? ( (lv_list_9_0= ruleWordList ) ) ) )
            // InternalTraceryPlusPlus.g:292:2: ( ( (lv_name_0_0= ruleVariable ) ) ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' ) | (otherlv_4= 'can' otherlv_5= 'be' ) | (otherlv_6= 'has' otherlv_7= 'values' ) ) ( ruleAssignmentOperator )? ( (lv_list_9_0= ruleWordList ) ) )
            {
            // InternalTraceryPlusPlus.g:292:2: ( ( (lv_name_0_0= ruleVariable ) ) ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' ) | (otherlv_4= 'can' otherlv_5= 'be' ) | (otherlv_6= 'has' otherlv_7= 'values' ) ) ( ruleAssignmentOperator )? ( (lv_list_9_0= ruleWordList ) ) )
            // InternalTraceryPlusPlus.g:293:3: ( (lv_name_0_0= ruleVariable ) ) ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' ) | (otherlv_4= 'can' otherlv_5= 'be' ) | (otherlv_6= 'has' otherlv_7= 'values' ) ) ( ruleAssignmentOperator )? ( (lv_list_9_0= ruleWordList ) )
            {
            // InternalTraceryPlusPlus.g:293:3: ( (lv_name_0_0= ruleVariable ) )
            // InternalTraceryPlusPlus.g:294:4: (lv_name_0_0= ruleVariable )
            {
            // InternalTraceryPlusPlus.g:294:4: (lv_name_0_0= ruleVariable )
            // InternalTraceryPlusPlus.g:295:5: lv_name_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getListDeclarationAccess().getNameVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
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

            // InternalTraceryPlusPlus.g:312:3: ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' ) | (otherlv_4= 'can' otherlv_5= 'be' ) | (otherlv_6= 'has' otherlv_7= 'values' ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==16) ) {
                    alt6=2;
                }
                else if ( (LA6_1==14) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==17) ) {
                alt6=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTraceryPlusPlus.g:313:4: (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' )
                    {
                    // InternalTraceryPlusPlus.g:313:4: (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' )
                    // InternalTraceryPlusPlus.g:314:5: otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_8); 

                    					newLeafNode(otherlv_1, grammarAccess.getListDeclarationAccess().getCanKeyword_1_0_0());
                    				
                    otherlv_2=(Token)match(input,14,FOLLOW_9); 

                    					newLeafNode(otherlv_2, grammarAccess.getListDeclarationAccess().getHaveKeyword_1_0_1());
                    				
                    otherlv_3=(Token)match(input,15,FOLLOW_10); 

                    					newLeafNode(otherlv_3, grammarAccess.getListDeclarationAccess().getValuesKeyword_1_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:328:4: (otherlv_4= 'can' otherlv_5= 'be' )
                    {
                    // InternalTraceryPlusPlus.g:328:4: (otherlv_4= 'can' otherlv_5= 'be' )
                    // InternalTraceryPlusPlus.g:329:5: otherlv_4= 'can' otherlv_5= 'be'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_11); 

                    					newLeafNode(otherlv_4, grammarAccess.getListDeclarationAccess().getCanKeyword_1_1_0());
                    				
                    otherlv_5=(Token)match(input,16,FOLLOW_10); 

                    					newLeafNode(otherlv_5, grammarAccess.getListDeclarationAccess().getBeKeyword_1_1_1());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:339:4: (otherlv_6= 'has' otherlv_7= 'values' )
                    {
                    // InternalTraceryPlusPlus.g:339:4: (otherlv_6= 'has' otherlv_7= 'values' )
                    // InternalTraceryPlusPlus.g:340:5: otherlv_6= 'has' otherlv_7= 'values'
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_9); 

                    					newLeafNode(otherlv_6, grammarAccess.getListDeclarationAccess().getHasKeyword_1_2_0());
                    				
                    otherlv_7=(Token)match(input,15,FOLLOW_10); 

                    					newLeafNode(otherlv_7, grammarAccess.getListDeclarationAccess().getValuesKeyword_1_2_1());
                    				

                    }


                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:350:3: ( ruleAssignmentOperator )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=39 && LA7_0<=42)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTraceryPlusPlus.g:351:4: ruleAssignmentOperator
                    {

                    				newCompositeNode(grammarAccess.getListDeclarationAccess().getAssignmentOperatorParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_10);
                    ruleAssignmentOperator();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:359:3: ( (lv_list_9_0= ruleWordList ) )
            // InternalTraceryPlusPlus.g:360:4: (lv_list_9_0= ruleWordList )
            {
            // InternalTraceryPlusPlus.g:360:4: (lv_list_9_0= ruleWordList )
            // InternalTraceryPlusPlus.g:361:5: lv_list_9_0= ruleWordList
            {

            					newCompositeNode(grammarAccess.getListDeclarationAccess().getListWordListParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_list_9_0=ruleWordList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListDeclarationRule());
            					}
            					set(
            						current,
            						"list",
            						lv_list_9_0,
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
    // InternalTraceryPlusPlus.g:382:1: entryRuleObjectDeclaration returns [EObject current=null] : iv_ruleObjectDeclaration= ruleObjectDeclaration EOF ;
    public final EObject entryRuleObjectDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectDeclaration = null;


        try {
            // InternalTraceryPlusPlus.g:382:58: (iv_ruleObjectDeclaration= ruleObjectDeclaration EOF )
            // InternalTraceryPlusPlus.g:383:2: iv_ruleObjectDeclaration= ruleObjectDeclaration EOF
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
    // InternalTraceryPlusPlus.g:389:1: ruleObjectDeclaration returns [EObject current=null] : (otherlv_0= 'There' (otherlv_1= 'is' | otherlv_2= 'are' ) (otherlv_3= 'a' | otherlv_4= 'an' )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_pronouns_6_0= rulePronouns ) ) (otherlv_7= 'has' | otherlv_8= 'have' ) (otherlv_9= 'attributes' )? ( ruleAssignmentOperator )? ( (lv_attributes_11_0= ruleAttributeList ) ) ) ;
    public final EObject ruleObjectDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_pronouns_6_0 = null;

        EObject lv_attributes_11_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:395:2: ( (otherlv_0= 'There' (otherlv_1= 'is' | otherlv_2= 'are' ) (otherlv_3= 'a' | otherlv_4= 'an' )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_pronouns_6_0= rulePronouns ) ) (otherlv_7= 'has' | otherlv_8= 'have' ) (otherlv_9= 'attributes' )? ( ruleAssignmentOperator )? ( (lv_attributes_11_0= ruleAttributeList ) ) ) )
            // InternalTraceryPlusPlus.g:396:2: (otherlv_0= 'There' (otherlv_1= 'is' | otherlv_2= 'are' ) (otherlv_3= 'a' | otherlv_4= 'an' )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_pronouns_6_0= rulePronouns ) ) (otherlv_7= 'has' | otherlv_8= 'have' ) (otherlv_9= 'attributes' )? ( ruleAssignmentOperator )? ( (lv_attributes_11_0= ruleAttributeList ) ) )
            {
            // InternalTraceryPlusPlus.g:396:2: (otherlv_0= 'There' (otherlv_1= 'is' | otherlv_2= 'are' ) (otherlv_3= 'a' | otherlv_4= 'an' )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_pronouns_6_0= rulePronouns ) ) (otherlv_7= 'has' | otherlv_8= 'have' ) (otherlv_9= 'attributes' )? ( ruleAssignmentOperator )? ( (lv_attributes_11_0= ruleAttributeList ) ) )
            // InternalTraceryPlusPlus.g:397:3: otherlv_0= 'There' (otherlv_1= 'is' | otherlv_2= 'are' ) (otherlv_3= 'a' | otherlv_4= 'an' )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_pronouns_6_0= rulePronouns ) ) (otherlv_7= 'has' | otherlv_8= 'have' ) (otherlv_9= 'attributes' )? ( ruleAssignmentOperator )? ( (lv_attributes_11_0= ruleAttributeList ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectDeclarationAccess().getThereKeyword_0());
            		
            // InternalTraceryPlusPlus.g:401:3: (otherlv_1= 'is' | otherlv_2= 'are' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTraceryPlusPlus.g:402:4: otherlv_1= 'is'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getObjectDeclarationAccess().getIsKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:407:4: otherlv_2= 'are'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getObjectDeclarationAccess().getAreKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:412:3: (otherlv_3= 'a' | otherlv_4= 'an' )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // InternalTraceryPlusPlus.g:413:4: otherlv_3= 'a'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getObjectDeclarationAccess().getAKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:418:4: otherlv_4= 'an'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getObjectDeclarationAccess().getAnKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:423:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalTraceryPlusPlus.g:424:4: (lv_name_5_0= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:424:4: (lv_name_5_0= RULE_ID )
            // InternalTraceryPlusPlus.g:425:5: lv_name_5_0= RULE_ID
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

            // InternalTraceryPlusPlus.g:441:3: ( (lv_pronouns_6_0= rulePronouns ) )
            // InternalTraceryPlusPlus.g:442:4: (lv_pronouns_6_0= rulePronouns )
            {
            // InternalTraceryPlusPlus.g:442:4: (lv_pronouns_6_0= rulePronouns )
            // InternalTraceryPlusPlus.g:443:5: lv_pronouns_6_0= rulePronouns
            {

            					newCompositeNode(grammarAccess.getObjectDeclarationAccess().getPronounsPronounsParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_16);
            lv_pronouns_6_0=rulePronouns();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectDeclarationRule());
            					}
            					set(
            						current,
            						"pronouns",
            						lv_pronouns_6_0,
            						"tracerypp.TraceryPlusPlus.Pronouns");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTraceryPlusPlus.g:460:3: (otherlv_7= 'has' | otherlv_8= 'have' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            else if ( (LA10_0==14) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalTraceryPlusPlus.g:461:4: otherlv_7= 'has'
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getObjectDeclarationAccess().getHasKeyword_5_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:466:4: otherlv_8= 'have'
                    {
                    otherlv_8=(Token)match(input,14,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getObjectDeclarationAccess().getHaveKeyword_5_1());
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:471:3: (otherlv_9= 'attributes' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTraceryPlusPlus.g:472:4: otherlv_9= 'attributes'
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getObjectDeclarationAccess().getAttributesKeyword_6());
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:477:3: ( ruleAssignmentOperator )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=39 && LA12_0<=42)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTraceryPlusPlus.g:478:4: ruleAssignmentOperator
                    {

                    				newCompositeNode(grammarAccess.getObjectDeclarationAccess().getAssignmentOperatorParserRuleCall_7());
                    			
                    pushFollow(FOLLOW_17);
                    ruleAssignmentOperator();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:486:3: ( (lv_attributes_11_0= ruleAttributeList ) )
            // InternalTraceryPlusPlus.g:487:4: (lv_attributes_11_0= ruleAttributeList )
            {
            // InternalTraceryPlusPlus.g:487:4: (lv_attributes_11_0= ruleAttributeList )
            // InternalTraceryPlusPlus.g:488:5: lv_attributes_11_0= ruleAttributeList
            {

            					newCompositeNode(grammarAccess.getObjectDeclarationAccess().getAttributesAttributeListParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_attributes_11_0=ruleAttributeList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectDeclarationRule());
            					}
            					set(
            						current,
            						"attributes",
            						lv_attributes_11_0,
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
    // InternalTraceryPlusPlus.g:509:1: entryRuleWord returns [EObject current=null] : iv_ruleWord= ruleWord EOF ;
    public final EObject entryRuleWord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWord = null;


        try {
            // InternalTraceryPlusPlus.g:509:45: (iv_ruleWord= ruleWord EOF )
            // InternalTraceryPlusPlus.g:510:2: iv_ruleWord= ruleWord EOF
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
    // InternalTraceryPlusPlus.g:516:1: ruleWord returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleWord() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:522:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalTraceryPlusPlus.g:523:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalTraceryPlusPlus.g:523:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalTraceryPlusPlus.g:524:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalTraceryPlusPlus.g:524:3: (lv_value_0_0= RULE_STRING )
            // InternalTraceryPlusPlus.g:525:4: lv_value_0_0= RULE_STRING
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
    // InternalTraceryPlusPlus.g:544:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalTraceryPlusPlus.g:544:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalTraceryPlusPlus.g:545:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalTraceryPlusPlus.g:551:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:557:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:558:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:558:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalTraceryPlusPlus.g:559:3: (lv_name_0_0= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:559:3: (lv_name_0_0= RULE_ID )
            // InternalTraceryPlusPlus.g:560:4: lv_name_0_0= RULE_ID
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
    // InternalTraceryPlusPlus.g:579:1: entryRuleStoryVariable returns [EObject current=null] : iv_ruleStoryVariable= ruleStoryVariable EOF ;
    public final EObject entryRuleStoryVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStoryVariable = null;


        try {
            // InternalTraceryPlusPlus.g:579:54: (iv_ruleStoryVariable= ruleStoryVariable EOF )
            // InternalTraceryPlusPlus.g:580:2: iv_ruleStoryVariable= ruleStoryVariable EOF
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
    // InternalTraceryPlusPlus.g:586:1: ruleStoryVariable returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )* ) ;
    public final EObject ruleStoryVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_modifiers_1_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:592:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )* ) )
            // InternalTraceryPlusPlus.g:593:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )* )
            {
            // InternalTraceryPlusPlus.g:593:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )* )
            // InternalTraceryPlusPlus.g:594:3: ( (otherlv_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )*
            {
            // InternalTraceryPlusPlus.g:594:3: ( (otherlv_0= RULE_ID ) )
            // InternalTraceryPlusPlus.g:595:4: (otherlv_0= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:595:4: (otherlv_0= RULE_ID )
            // InternalTraceryPlusPlus.g:596:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStoryVariableRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_0, grammarAccess.getStoryVariableAccess().getVariableVariableCrossReference_0_0());
            				

            }


            }

            // InternalTraceryPlusPlus.g:607:3: ( (lv_modifiers_1_0= ruleModifier ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=34 && LA13_0<=38)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:608:4: (lv_modifiers_1_0= ruleModifier )
            	    {
            	    // InternalTraceryPlusPlus.g:608:4: (lv_modifiers_1_0= ruleModifier )
            	    // InternalTraceryPlusPlus.g:609:5: lv_modifiers_1_0= ruleModifier
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
    // $ANTLR end "ruleStoryVariable"


    // $ANTLR start "entryRuleAttribute"
    // InternalTraceryPlusPlus.g:630:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalTraceryPlusPlus.g:630:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalTraceryPlusPlus.g:631:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalTraceryPlusPlus.g:637:1: ruleAttribute returns [EObject current=null] : (this_JustNameAttribute_0= ruleJustNameAttribute | this_NameExistingListAttribute_1= ruleNameExistingListAttribute | this_NameValueAttribute_2= ruleNameValueAttribute ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_JustNameAttribute_0 = null;

        EObject this_NameExistingListAttribute_1 = null;

        EObject this_NameValueAttribute_2 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:643:2: ( (this_JustNameAttribute_0= ruleJustNameAttribute | this_NameExistingListAttribute_1= ruleNameExistingListAttribute | this_NameValueAttribute_2= ruleNameValueAttribute ) )
            // InternalTraceryPlusPlus.g:644:2: (this_JustNameAttribute_0= ruleJustNameAttribute | this_NameExistingListAttribute_1= ruleNameExistingListAttribute | this_NameValueAttribute_2= ruleNameValueAttribute )
            {
            // InternalTraceryPlusPlus.g:644:2: (this_JustNameAttribute_0= ruleJustNameAttribute | this_NameExistingListAttribute_1= ruleNameExistingListAttribute | this_NameValueAttribute_2= ruleNameValueAttribute )
            int alt14=3;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalTraceryPlusPlus.g:645:3: this_JustNameAttribute_0= ruleJustNameAttribute
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
                    // InternalTraceryPlusPlus.g:654:3: this_NameExistingListAttribute_1= ruleNameExistingListAttribute
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
                    // InternalTraceryPlusPlus.g:663:3: this_NameValueAttribute_2= ruleNameValueAttribute
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
    // InternalTraceryPlusPlus.g:675:1: entryRuleExistingVariable returns [EObject current=null] : iv_ruleExistingVariable= ruleExistingVariable EOF ;
    public final EObject entryRuleExistingVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistingVariable = null;


        try {
            // InternalTraceryPlusPlus.g:675:57: (iv_ruleExistingVariable= ruleExistingVariable EOF )
            // InternalTraceryPlusPlus.g:676:2: iv_ruleExistingVariable= ruleExistingVariable EOF
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
    // InternalTraceryPlusPlus.g:682:1: ruleExistingVariable returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleExistingVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:688:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:689:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:689:2: ( (otherlv_0= RULE_ID ) )
            // InternalTraceryPlusPlus.g:690:3: (otherlv_0= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:690:3: (otherlv_0= RULE_ID )
            // InternalTraceryPlusPlus.g:691:4: otherlv_0= RULE_ID
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
    // InternalTraceryPlusPlus.g:705:1: entryRuleJustNameAttribute returns [EObject current=null] : iv_ruleJustNameAttribute= ruleJustNameAttribute EOF ;
    public final EObject entryRuleJustNameAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJustNameAttribute = null;


        try {
            // InternalTraceryPlusPlus.g:705:58: (iv_ruleJustNameAttribute= ruleJustNameAttribute EOF )
            // InternalTraceryPlusPlus.g:706:2: iv_ruleJustNameAttribute= ruleJustNameAttribute EOF
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
    // InternalTraceryPlusPlus.g:712:1: ruleJustNameAttribute returns [EObject current=null] : ( (lv_name_0_0= ruleExistingVariable ) ) ;
    public final EObject ruleJustNameAttribute() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:718:2: ( ( (lv_name_0_0= ruleExistingVariable ) ) )
            // InternalTraceryPlusPlus.g:719:2: ( (lv_name_0_0= ruleExistingVariable ) )
            {
            // InternalTraceryPlusPlus.g:719:2: ( (lv_name_0_0= ruleExistingVariable ) )
            // InternalTraceryPlusPlus.g:720:3: (lv_name_0_0= ruleExistingVariable )
            {
            // InternalTraceryPlusPlus.g:720:3: (lv_name_0_0= ruleExistingVariable )
            // InternalTraceryPlusPlus.g:721:4: lv_name_0_0= ruleExistingVariable
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
    // InternalTraceryPlusPlus.g:741:1: entryRuleNameExistingListAttribute returns [EObject current=null] : iv_ruleNameExistingListAttribute= ruleNameExistingListAttribute EOF ;
    public final EObject entryRuleNameExistingListAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExistingListAttribute = null;


        try {
            // InternalTraceryPlusPlus.g:741:66: (iv_ruleNameExistingListAttribute= ruleNameExistingListAttribute EOF )
            // InternalTraceryPlusPlus.g:742:2: iv_ruleNameExistingListAttribute= ruleNameExistingListAttribute EOF
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
    // InternalTraceryPlusPlus.g:748:1: ruleNameExistingListAttribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleVariable ) ) ( ruleAssignmentOperator | otherlv_2= 'from' )? ( (lv_value_3_0= ruleExistingVariable ) ) ) ;
    public final EObject ruleNameExistingListAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_name_0_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:754:2: ( ( ( (lv_name_0_0= ruleVariable ) ) ( ruleAssignmentOperator | otherlv_2= 'from' )? ( (lv_value_3_0= ruleExistingVariable ) ) ) )
            // InternalTraceryPlusPlus.g:755:2: ( ( (lv_name_0_0= ruleVariable ) ) ( ruleAssignmentOperator | otherlv_2= 'from' )? ( (lv_value_3_0= ruleExistingVariable ) ) )
            {
            // InternalTraceryPlusPlus.g:755:2: ( ( (lv_name_0_0= ruleVariable ) ) ( ruleAssignmentOperator | otherlv_2= 'from' )? ( (lv_value_3_0= ruleExistingVariable ) ) )
            // InternalTraceryPlusPlus.g:756:3: ( (lv_name_0_0= ruleVariable ) ) ( ruleAssignmentOperator | otherlv_2= 'from' )? ( (lv_value_3_0= ruleExistingVariable ) )
            {
            // InternalTraceryPlusPlus.g:756:3: ( (lv_name_0_0= ruleVariable ) )
            // InternalTraceryPlusPlus.g:757:4: (lv_name_0_0= ruleVariable )
            {
            // InternalTraceryPlusPlus.g:757:4: (lv_name_0_0= ruleVariable )
            // InternalTraceryPlusPlus.g:758:5: lv_name_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getNameExistingListAttributeAccess().getNameVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalTraceryPlusPlus.g:775:3: ( ruleAssignmentOperator | otherlv_2= 'from' )?
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=39 && LA15_0<=42)) ) {
                alt15=1;
            }
            else if ( (LA15_0==24) ) {
                alt15=2;
            }
            switch (alt15) {
                case 1 :
                    // InternalTraceryPlusPlus.g:776:4: ruleAssignmentOperator
                    {

                    				newCompositeNode(grammarAccess.getNameExistingListAttributeAccess().getAssignmentOperatorParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_14);
                    ruleAssignmentOperator();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:784:4: otherlv_2= 'from'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getNameExistingListAttributeAccess().getFromKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:789:3: ( (lv_value_3_0= ruleExistingVariable ) )
            // InternalTraceryPlusPlus.g:790:4: (lv_value_3_0= ruleExistingVariable )
            {
            // InternalTraceryPlusPlus.g:790:4: (lv_value_3_0= ruleExistingVariable )
            // InternalTraceryPlusPlus.g:791:5: lv_value_3_0= ruleExistingVariable
            {

            					newCompositeNode(grammarAccess.getNameExistingListAttributeAccess().getValueExistingVariableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleExistingVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNameExistingListAttributeRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
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
    // InternalTraceryPlusPlus.g:812:1: entryRuleNameValueAttribute returns [EObject current=null] : iv_ruleNameValueAttribute= ruleNameValueAttribute EOF ;
    public final EObject entryRuleNameValueAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameValueAttribute = null;


        try {
            // InternalTraceryPlusPlus.g:812:59: (iv_ruleNameValueAttribute= ruleNameValueAttribute EOF )
            // InternalTraceryPlusPlus.g:813:2: iv_ruleNameValueAttribute= ruleNameValueAttribute EOF
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
    // InternalTraceryPlusPlus.g:819:1: ruleNameValueAttribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleVariable ) ) ( ruleAssignmentOperator )? ( (lv_value_2_0= ruleWord ) ) ) ;
    public final EObject ruleNameValueAttribute() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:825:2: ( ( ( (lv_name_0_0= ruleVariable ) ) ( ruleAssignmentOperator )? ( (lv_value_2_0= ruleWord ) ) ) )
            // InternalTraceryPlusPlus.g:826:2: ( ( (lv_name_0_0= ruleVariable ) ) ( ruleAssignmentOperator )? ( (lv_value_2_0= ruleWord ) ) )
            {
            // InternalTraceryPlusPlus.g:826:2: ( ( (lv_name_0_0= ruleVariable ) ) ( ruleAssignmentOperator )? ( (lv_value_2_0= ruleWord ) ) )
            // InternalTraceryPlusPlus.g:827:3: ( (lv_name_0_0= ruleVariable ) ) ( ruleAssignmentOperator )? ( (lv_value_2_0= ruleWord ) )
            {
            // InternalTraceryPlusPlus.g:827:3: ( (lv_name_0_0= ruleVariable ) )
            // InternalTraceryPlusPlus.g:828:4: (lv_name_0_0= ruleVariable )
            {
            // InternalTraceryPlusPlus.g:828:4: (lv_name_0_0= ruleVariable )
            // InternalTraceryPlusPlus.g:829:5: lv_name_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getNameValueAttributeAccess().getNameVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalTraceryPlusPlus.g:846:3: ( ruleAssignmentOperator )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=39 && LA16_0<=42)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTraceryPlusPlus.g:847:4: ruleAssignmentOperator
                    {

                    				newCompositeNode(grammarAccess.getNameValueAttributeAccess().getAssignmentOperatorParserRuleCall_1());
                    			
                    pushFollow(FOLLOW_20);
                    ruleAssignmentOperator();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:855:3: ( (lv_value_2_0= ruleWord ) )
            // InternalTraceryPlusPlus.g:856:4: (lv_value_2_0= ruleWord )
            {
            // InternalTraceryPlusPlus.g:856:4: (lv_value_2_0= ruleWord )
            // InternalTraceryPlusPlus.g:857:5: lv_value_2_0= ruleWord
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
    // InternalTraceryPlusPlus.g:878:1: entryRuleObjectAttribute returns [EObject current=null] : iv_ruleObjectAttribute= ruleObjectAttribute EOF ;
    public final EObject entryRuleObjectAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectAttribute = null;


        try {
            // InternalTraceryPlusPlus.g:878:56: (iv_ruleObjectAttribute= ruleObjectAttribute EOF )
            // InternalTraceryPlusPlus.g:879:2: iv_ruleObjectAttribute= ruleObjectAttribute EOF
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
    // InternalTraceryPlusPlus.g:885:1: ruleObjectAttribute returns [EObject current=null] : ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '.' )? ( (lv_pronoun_5_0= rulePronounIdentifier ) ) ) ) ( (lv_modifiers_6_0= ruleModifier ) )* ) ;
    public final EObject ruleObjectAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_pronoun_5_0 = null;

        AntlrDatatypeRuleToken lv_modifiers_6_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:891:2: ( ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '.' )? ( (lv_pronoun_5_0= rulePronounIdentifier ) ) ) ) ( (lv_modifiers_6_0= ruleModifier ) )* ) )
            // InternalTraceryPlusPlus.g:892:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '.' )? ( (lv_pronoun_5_0= rulePronounIdentifier ) ) ) ) ( (lv_modifiers_6_0= ruleModifier ) )* )
            {
            // InternalTraceryPlusPlus.g:892:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '.' )? ( (lv_pronoun_5_0= rulePronounIdentifier ) ) ) ) ( (lv_modifiers_6_0= ruleModifier ) )* )
            // InternalTraceryPlusPlus.g:893:3: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '.' )? ( (lv_pronoun_5_0= rulePronounIdentifier ) ) ) ) ( (lv_modifiers_6_0= ruleModifier ) )*
            {
            // InternalTraceryPlusPlus.g:893:3: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) | ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '.' )? ( (lv_pronoun_5_0= rulePronounIdentifier ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==25) ) {
                    int LA18_2 = input.LA(3);

                    if ( ((LA18_2>=30 && LA18_2<=33)) ) {
                        alt18=2;
                    }
                    else if ( (LA18_2==RULE_ID) ) {
                        alt18=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 2, input);

                        throw nvae;
                    }
                }
                else if ( ((LA18_1>=30 && LA18_1<=33)) ) {
                    alt18=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalTraceryPlusPlus.g:894:4: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // InternalTraceryPlusPlus.g:894:4: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
                    // InternalTraceryPlusPlus.g:895:5: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalTraceryPlusPlus.g:895:5: ( (otherlv_0= RULE_ID ) )
                    // InternalTraceryPlusPlus.g:896:6: (otherlv_0= RULE_ID )
                    {
                    // InternalTraceryPlusPlus.g:896:6: (otherlv_0= RULE_ID )
                    // InternalTraceryPlusPlus.g:897:7: otherlv_0= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getObjectAttributeRule());
                    							}
                    						
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_21); 

                    							newLeafNode(otherlv_0, grammarAccess.getObjectAttributeAccess().getObjectObjectDeclarationCrossReference_0_0_0_0());
                    						

                    }


                    }

                    otherlv_1=(Token)match(input,25,FOLLOW_14); 

                    					newLeafNode(otherlv_1, grammarAccess.getObjectAttributeAccess().getFullStopKeyword_0_0_1());
                    				
                    // InternalTraceryPlusPlus.g:912:5: ( (otherlv_2= RULE_ID ) )
                    // InternalTraceryPlusPlus.g:913:6: (otherlv_2= RULE_ID )
                    {
                    // InternalTraceryPlusPlus.g:913:6: (otherlv_2= RULE_ID )
                    // InternalTraceryPlusPlus.g:914:7: otherlv_2= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getObjectAttributeRule());
                    							}
                    						
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_18); 

                    							newLeafNode(otherlv_2, grammarAccess.getObjectAttributeAccess().getAttributeVariableCrossReference_0_0_2_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:927:4: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '.' )? ( (lv_pronoun_5_0= rulePronounIdentifier ) ) )
                    {
                    // InternalTraceryPlusPlus.g:927:4: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '.' )? ( (lv_pronoun_5_0= rulePronounIdentifier ) ) )
                    // InternalTraceryPlusPlus.g:928:5: ( (otherlv_3= RULE_ID ) ) (otherlv_4= '.' )? ( (lv_pronoun_5_0= rulePronounIdentifier ) )
                    {
                    // InternalTraceryPlusPlus.g:928:5: ( (otherlv_3= RULE_ID ) )
                    // InternalTraceryPlusPlus.g:929:6: (otherlv_3= RULE_ID )
                    {
                    // InternalTraceryPlusPlus.g:929:6: (otherlv_3= RULE_ID )
                    // InternalTraceryPlusPlus.g:930:7: otherlv_3= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getObjectAttributeRule());
                    							}
                    						
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_22); 

                    							newLeafNode(otherlv_3, grammarAccess.getObjectAttributeAccess().getObjectObjectDeclarationCrossReference_0_1_0_0());
                    						

                    }


                    }

                    // InternalTraceryPlusPlus.g:941:5: (otherlv_4= '.' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==25) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalTraceryPlusPlus.g:942:6: otherlv_4= '.'
                            {
                            otherlv_4=(Token)match(input,25,FOLLOW_22); 

                            						newLeafNode(otherlv_4, grammarAccess.getObjectAttributeAccess().getFullStopKeyword_0_1_1());
                            					

                            }
                            break;

                    }

                    // InternalTraceryPlusPlus.g:947:5: ( (lv_pronoun_5_0= rulePronounIdentifier ) )
                    // InternalTraceryPlusPlus.g:948:6: (lv_pronoun_5_0= rulePronounIdentifier )
                    {
                    // InternalTraceryPlusPlus.g:948:6: (lv_pronoun_5_0= rulePronounIdentifier )
                    // InternalTraceryPlusPlus.g:949:7: lv_pronoun_5_0= rulePronounIdentifier
                    {

                    							newCompositeNode(grammarAccess.getObjectAttributeAccess().getPronounPronounIdentifierParserRuleCall_0_1_2_0());
                    						
                    pushFollow(FOLLOW_18);
                    lv_pronoun_5_0=rulePronounIdentifier();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getObjectAttributeRule());
                    							}
                    							set(
                    								current,
                    								"pronoun",
                    								lv_pronoun_5_0,
                    								"tracerypp.TraceryPlusPlus.PronounIdentifier");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:968:3: ( (lv_modifiers_6_0= ruleModifier ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=34 && LA19_0<=38)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:969:4: (lv_modifiers_6_0= ruleModifier )
            	    {
            	    // InternalTraceryPlusPlus.g:969:4: (lv_modifiers_6_0= ruleModifier )
            	    // InternalTraceryPlusPlus.g:970:5: lv_modifiers_6_0= ruleModifier
            	    {

            	    					newCompositeNode(grammarAccess.getObjectAttributeAccess().getModifiersModifierParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_modifiers_6_0=ruleModifier();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getObjectAttributeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"modifiers",
            	    						lv_modifiers_6_0,
            	    						"tracerypp.TraceryPlusPlus.Modifier");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalTraceryPlusPlus.g:991:1: entryRuleWordList returns [EObject current=null] : iv_ruleWordList= ruleWordList EOF ;
    public final EObject entryRuleWordList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordList = null;


        try {
            // InternalTraceryPlusPlus.g:991:49: (iv_ruleWordList= ruleWordList EOF )
            // InternalTraceryPlusPlus.g:992:2: iv_ruleWordList= ruleWordList EOF
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
    // InternalTraceryPlusPlus.g:998:1: ruleWordList returns [EObject current=null] : ( ( (lv_words_0_0= ruleWord ) ) ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )* ) ;
    public final EObject ruleWordList() throws RecognitionException {
        EObject current = null;

        EObject lv_words_0_0 = null;

        EObject lv_words_2_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1004:2: ( ( ( (lv_words_0_0= ruleWord ) ) ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )* ) )
            // InternalTraceryPlusPlus.g:1005:2: ( ( (lv_words_0_0= ruleWord ) ) ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )* )
            {
            // InternalTraceryPlusPlus.g:1005:2: ( ( (lv_words_0_0= ruleWord ) ) ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )* )
            // InternalTraceryPlusPlus.g:1006:3: ( (lv_words_0_0= ruleWord ) ) ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )*
            {
            // InternalTraceryPlusPlus.g:1006:3: ( (lv_words_0_0= ruleWord ) )
            // InternalTraceryPlusPlus.g:1007:4: (lv_words_0_0= ruleWord )
            {
            // InternalTraceryPlusPlus.g:1007:4: (lv_words_0_0= ruleWord )
            // InternalTraceryPlusPlus.g:1008:5: lv_words_0_0= ruleWord
            {

            					newCompositeNode(grammarAccess.getWordListAccess().getWordsWordParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
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

            // InternalTraceryPlusPlus.g:1025:3: ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=43 && LA20_0<=45)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1026:4: ruleSeparatorOr ( (lv_words_2_0= ruleWord ) )
            	    {

            	    				newCompositeNode(grammarAccess.getWordListAccess().getSeparatorOrParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_20);
            	    ruleSeparatorOr();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalTraceryPlusPlus.g:1033:4: ( (lv_words_2_0= ruleWord ) )
            	    // InternalTraceryPlusPlus.g:1034:5: (lv_words_2_0= ruleWord )
            	    {
            	    // InternalTraceryPlusPlus.g:1034:5: (lv_words_2_0= ruleWord )
            	    // InternalTraceryPlusPlus.g:1035:6: lv_words_2_0= ruleWord
            	    {

            	    						newCompositeNode(grammarAccess.getWordListAccess().getWordsWordParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
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
            	    break loop20;
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
    // InternalTraceryPlusPlus.g:1057:1: entryRuleAttributeList returns [EObject current=null] : iv_ruleAttributeList= ruleAttributeList EOF ;
    public final EObject entryRuleAttributeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeList = null;


        try {
            // InternalTraceryPlusPlus.g:1057:54: (iv_ruleAttributeList= ruleAttributeList EOF )
            // InternalTraceryPlusPlus.g:1058:2: iv_ruleAttributeList= ruleAttributeList EOF
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
    // InternalTraceryPlusPlus.g:1064:1: ruleAttributeList returns [EObject current=null] : ( ( (lv_attributes_0_0= ruleAttribute ) ) ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )* ) ;
    public final EObject ruleAttributeList() throws RecognitionException {
        EObject current = null;

        EObject lv_attributes_0_0 = null;

        EObject lv_attributes_2_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1070:2: ( ( ( (lv_attributes_0_0= ruleAttribute ) ) ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )* ) )
            // InternalTraceryPlusPlus.g:1071:2: ( ( (lv_attributes_0_0= ruleAttribute ) ) ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )* )
            {
            // InternalTraceryPlusPlus.g:1071:2: ( ( (lv_attributes_0_0= ruleAttribute ) ) ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )* )
            // InternalTraceryPlusPlus.g:1072:3: ( (lv_attributes_0_0= ruleAttribute ) ) ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )*
            {
            // InternalTraceryPlusPlus.g:1072:3: ( (lv_attributes_0_0= ruleAttribute ) )
            // InternalTraceryPlusPlus.g:1073:4: (lv_attributes_0_0= ruleAttribute )
            {
            // InternalTraceryPlusPlus.g:1073:4: (lv_attributes_0_0= ruleAttribute )
            // InternalTraceryPlusPlus.g:1074:5: lv_attributes_0_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalTraceryPlusPlus.g:1091:3: ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==43||(LA21_0>=46 && LA21_0<=47)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1092:4: ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) )
            	    {

            	    				newCompositeNode(grammarAccess.getAttributeListAccess().getSeparatorAndParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_17);
            	    ruleSeparatorAnd();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalTraceryPlusPlus.g:1099:4: ( (lv_attributes_2_0= ruleAttribute ) )
            	    // InternalTraceryPlusPlus.g:1100:5: (lv_attributes_2_0= ruleAttribute )
            	    {
            	    // InternalTraceryPlusPlus.g:1100:5: (lv_attributes_2_0= ruleAttribute )
            	    // InternalTraceryPlusPlus.g:1101:6: lv_attributes_2_0= ruleAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
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
            	    break loop21;
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


    // $ANTLR start "entryRulePronouns"
    // InternalTraceryPlusPlus.g:1123:1: entryRulePronouns returns [EObject current=null] : iv_rulePronouns= rulePronouns EOF ;
    public final EObject entryRulePronouns() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePronouns = null;


        try {
            // InternalTraceryPlusPlus.g:1123:49: (iv_rulePronouns= rulePronouns EOF )
            // InternalTraceryPlusPlus.g:1124:2: iv_rulePronouns= rulePronouns EOF
            {
             newCompositeNode(grammarAccess.getPronounsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePronouns=rulePronouns();

            state._fsp--;

             current =iv_rulePronouns; 
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
    // $ANTLR end "entryRulePronouns"


    // $ANTLR start "rulePronouns"
    // InternalTraceryPlusPlus.g:1130:1: rulePronouns returns [EObject current=null] : ( ( (lv_value_0_0= 'He' ) ) | ( (lv_value_1_0= 'She' ) ) | ( (lv_value_2_0= 'It' ) ) | ( (lv_value_3_0= 'They' ) ) ) ;
    public final EObject rulePronouns() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1136:2: ( ( ( (lv_value_0_0= 'He' ) ) | ( (lv_value_1_0= 'She' ) ) | ( (lv_value_2_0= 'It' ) ) | ( (lv_value_3_0= 'They' ) ) ) )
            // InternalTraceryPlusPlus.g:1137:2: ( ( (lv_value_0_0= 'He' ) ) | ( (lv_value_1_0= 'She' ) ) | ( (lv_value_2_0= 'It' ) ) | ( (lv_value_3_0= 'They' ) ) )
            {
            // InternalTraceryPlusPlus.g:1137:2: ( ( (lv_value_0_0= 'He' ) ) | ( (lv_value_1_0= 'She' ) ) | ( (lv_value_2_0= 'It' ) ) | ( (lv_value_3_0= 'They' ) ) )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt22=1;
                }
                break;
            case 27:
                {
                alt22=2;
                }
                break;
            case 28:
                {
                alt22=3;
                }
                break;
            case 29:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1138:3: ( (lv_value_0_0= 'He' ) )
                    {
                    // InternalTraceryPlusPlus.g:1138:3: ( (lv_value_0_0= 'He' ) )
                    // InternalTraceryPlusPlus.g:1139:4: (lv_value_0_0= 'He' )
                    {
                    // InternalTraceryPlusPlus.g:1139:4: (lv_value_0_0= 'He' )
                    // InternalTraceryPlusPlus.g:1140:5: lv_value_0_0= 'He'
                    {
                    lv_value_0_0=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_value_0_0, grammarAccess.getPronounsAccess().getValueHeKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPronounsRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_0, "He");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1153:3: ( (lv_value_1_0= 'She' ) )
                    {
                    // InternalTraceryPlusPlus.g:1153:3: ( (lv_value_1_0= 'She' ) )
                    // InternalTraceryPlusPlus.g:1154:4: (lv_value_1_0= 'She' )
                    {
                    // InternalTraceryPlusPlus.g:1154:4: (lv_value_1_0= 'She' )
                    // InternalTraceryPlusPlus.g:1155:5: lv_value_1_0= 'She'
                    {
                    lv_value_1_0=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_value_1_0, grammarAccess.getPronounsAccess().getValueSheKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPronounsRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_1_0, "She");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1168:3: ( (lv_value_2_0= 'It' ) )
                    {
                    // InternalTraceryPlusPlus.g:1168:3: ( (lv_value_2_0= 'It' ) )
                    // InternalTraceryPlusPlus.g:1169:4: (lv_value_2_0= 'It' )
                    {
                    // InternalTraceryPlusPlus.g:1169:4: (lv_value_2_0= 'It' )
                    // InternalTraceryPlusPlus.g:1170:5: lv_value_2_0= 'It'
                    {
                    lv_value_2_0=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_value_2_0, grammarAccess.getPronounsAccess().getValueItKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPronounsRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_2_0, "It");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalTraceryPlusPlus.g:1183:3: ( (lv_value_3_0= 'They' ) )
                    {
                    // InternalTraceryPlusPlus.g:1183:3: ( (lv_value_3_0= 'They' ) )
                    // InternalTraceryPlusPlus.g:1184:4: (lv_value_3_0= 'They' )
                    {
                    // InternalTraceryPlusPlus.g:1184:4: (lv_value_3_0= 'They' )
                    // InternalTraceryPlusPlus.g:1185:5: lv_value_3_0= 'They'
                    {
                    lv_value_3_0=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(lv_value_3_0, grammarAccess.getPronounsAccess().getValueTheyKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPronounsRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_3_0, "They");
                    				

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
    // $ANTLR end "rulePronouns"


    // $ANTLR start "entryRulePronounIdentifier"
    // InternalTraceryPlusPlus.g:1201:1: entryRulePronounIdentifier returns [EObject current=null] : iv_rulePronounIdentifier= rulePronounIdentifier EOF ;
    public final EObject entryRulePronounIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePronounIdentifier = null;


        try {
            // InternalTraceryPlusPlus.g:1201:58: (iv_rulePronounIdentifier= rulePronounIdentifier EOF )
            // InternalTraceryPlusPlus.g:1202:2: iv_rulePronounIdentifier= rulePronounIdentifier EOF
            {
             newCompositeNode(grammarAccess.getPronounIdentifierRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePronounIdentifier=rulePronounIdentifier();

            state._fsp--;

             current =iv_rulePronounIdentifier; 
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
    // $ANTLR end "entryRulePronounIdentifier"


    // $ANTLR start "rulePronounIdentifier"
    // InternalTraceryPlusPlus.g:1208:1: rulePronounIdentifier returns [EObject current=null] : ( ( (lv_name_0_1= 'they' | lv_name_0_2= 'them' | lv_name_0_3= 'their' | lv_name_0_4= 'theirs' ) ) ) ;
    public final EObject rulePronounIdentifier() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1214:2: ( ( ( (lv_name_0_1= 'they' | lv_name_0_2= 'them' | lv_name_0_3= 'their' | lv_name_0_4= 'theirs' ) ) ) )
            // InternalTraceryPlusPlus.g:1215:2: ( ( (lv_name_0_1= 'they' | lv_name_0_2= 'them' | lv_name_0_3= 'their' | lv_name_0_4= 'theirs' ) ) )
            {
            // InternalTraceryPlusPlus.g:1215:2: ( ( (lv_name_0_1= 'they' | lv_name_0_2= 'them' | lv_name_0_3= 'their' | lv_name_0_4= 'theirs' ) ) )
            // InternalTraceryPlusPlus.g:1216:3: ( (lv_name_0_1= 'they' | lv_name_0_2= 'them' | lv_name_0_3= 'their' | lv_name_0_4= 'theirs' ) )
            {
            // InternalTraceryPlusPlus.g:1216:3: ( (lv_name_0_1= 'they' | lv_name_0_2= 'them' | lv_name_0_3= 'their' | lv_name_0_4= 'theirs' ) )
            // InternalTraceryPlusPlus.g:1217:4: (lv_name_0_1= 'they' | lv_name_0_2= 'them' | lv_name_0_3= 'their' | lv_name_0_4= 'theirs' )
            {
            // InternalTraceryPlusPlus.g:1217:4: (lv_name_0_1= 'they' | lv_name_0_2= 'them' | lv_name_0_3= 'their' | lv_name_0_4= 'theirs' )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt23=1;
                }
                break;
            case 31:
                {
                alt23=2;
                }
                break;
            case 32:
                {
                alt23=3;
                }
                break;
            case 33:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1218:5: lv_name_0_1= 'they'
                    {
                    lv_name_0_1=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getPronounIdentifierAccess().getNameTheyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPronounIdentifierRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1229:5: lv_name_0_2= 'them'
                    {
                    lv_name_0_2=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getPronounIdentifierAccess().getNameThemKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPronounIdentifierRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1240:5: lv_name_0_3= 'their'
                    {
                    lv_name_0_3=(Token)match(input,32,FOLLOW_2); 

                    					newLeafNode(lv_name_0_3, grammarAccess.getPronounIdentifierAccess().getNameTheirKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPronounIdentifierRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalTraceryPlusPlus.g:1251:5: lv_name_0_4= 'theirs'
                    {
                    lv_name_0_4=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(lv_name_0_4, grammarAccess.getPronounIdentifierAccess().getNameTheirsKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPronounIdentifierRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_4, null);
                    				

                    }
                    break;

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
    // $ANTLR end "rulePronounIdentifier"


    // $ANTLR start "entryRuleModifier"
    // InternalTraceryPlusPlus.g:1267:1: entryRuleModifier returns [String current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final String entryRuleModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModifier = null;


        try {
            // InternalTraceryPlusPlus.g:1267:48: (iv_ruleModifier= ruleModifier EOF )
            // InternalTraceryPlusPlus.g:1268:2: iv_ruleModifier= ruleModifier EOF
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
    // InternalTraceryPlusPlus.g:1274:1: ruleModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CapitalizationModifier_0= ruleCapitalizationModifier | this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier | this_PluralityModifier_2= rulePluralityModifier | this_ArticleModifier_3= ruleArticleModifier | this_PastTenseModifier_4= rulePastTenseModifier ) ;
    public final AntlrDatatypeRuleToken ruleModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_CapitalizationModifier_0 = null;

        AntlrDatatypeRuleToken this_FullCapitalizationModifier_1 = null;

        AntlrDatatypeRuleToken this_PluralityModifier_2 = null;

        AntlrDatatypeRuleToken this_ArticleModifier_3 = null;

        AntlrDatatypeRuleToken this_PastTenseModifier_4 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1280:2: ( (this_CapitalizationModifier_0= ruleCapitalizationModifier | this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier | this_PluralityModifier_2= rulePluralityModifier | this_ArticleModifier_3= ruleArticleModifier | this_PastTenseModifier_4= rulePastTenseModifier ) )
            // InternalTraceryPlusPlus.g:1281:2: (this_CapitalizationModifier_0= ruleCapitalizationModifier | this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier | this_PluralityModifier_2= rulePluralityModifier | this_ArticleModifier_3= ruleArticleModifier | this_PastTenseModifier_4= rulePastTenseModifier )
            {
            // InternalTraceryPlusPlus.g:1281:2: (this_CapitalizationModifier_0= ruleCapitalizationModifier | this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier | this_PluralityModifier_2= rulePluralityModifier | this_ArticleModifier_3= ruleArticleModifier | this_PastTenseModifier_4= rulePastTenseModifier )
            int alt24=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt24=1;
                }
                break;
            case 35:
                {
                alt24=2;
                }
                break;
            case 36:
                {
                alt24=3;
                }
                break;
            case 37:
                {
                alt24=4;
                }
                break;
            case 38:
                {
                alt24=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1282:3: this_CapitalizationModifier_0= ruleCapitalizationModifier
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
                    // InternalTraceryPlusPlus.g:1293:3: this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier
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
                    // InternalTraceryPlusPlus.g:1304:3: this_PluralityModifier_2= rulePluralityModifier
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
                    // InternalTraceryPlusPlus.g:1315:3: this_ArticleModifier_3= ruleArticleModifier
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
                    // InternalTraceryPlusPlus.g:1326:3: this_PastTenseModifier_4= rulePastTenseModifier
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
    // InternalTraceryPlusPlus.g:1340:1: entryRuleCapitalizationModifier returns [String current=null] : iv_ruleCapitalizationModifier= ruleCapitalizationModifier EOF ;
    public final String entryRuleCapitalizationModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCapitalizationModifier = null;


        try {
            // InternalTraceryPlusPlus.g:1340:62: (iv_ruleCapitalizationModifier= ruleCapitalizationModifier EOF )
            // InternalTraceryPlusPlus.g:1341:2: iv_ruleCapitalizationModifier= ruleCapitalizationModifier EOF
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
    // InternalTraceryPlusPlus.g:1347:1: ruleCapitalizationModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.capitalize' ;
    public final AntlrDatatypeRuleToken ruleCapitalizationModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1353:2: (kw= '.capitalize' )
            // InternalTraceryPlusPlus.g:1354:2: kw= '.capitalize'
            {
            kw=(Token)match(input,34,FOLLOW_2); 

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
    // InternalTraceryPlusPlus.g:1362:1: entryRuleFullCapitalizationModifier returns [String current=null] : iv_ruleFullCapitalizationModifier= ruleFullCapitalizationModifier EOF ;
    public final String entryRuleFullCapitalizationModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFullCapitalizationModifier = null;


        try {
            // InternalTraceryPlusPlus.g:1362:66: (iv_ruleFullCapitalizationModifier= ruleFullCapitalizationModifier EOF )
            // InternalTraceryPlusPlus.g:1363:2: iv_ruleFullCapitalizationModifier= ruleFullCapitalizationModifier EOF
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
    // InternalTraceryPlusPlus.g:1369:1: ruleFullCapitalizationModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.CAPITALIZE' ;
    public final AntlrDatatypeRuleToken ruleFullCapitalizationModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1375:2: (kw= '.CAPITALIZE' )
            // InternalTraceryPlusPlus.g:1376:2: kw= '.CAPITALIZE'
            {
            kw=(Token)match(input,35,FOLLOW_2); 

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
    // InternalTraceryPlusPlus.g:1384:1: entryRulePluralityModifier returns [String current=null] : iv_rulePluralityModifier= rulePluralityModifier EOF ;
    public final String entryRulePluralityModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePluralityModifier = null;


        try {
            // InternalTraceryPlusPlus.g:1384:57: (iv_rulePluralityModifier= rulePluralityModifier EOF )
            // InternalTraceryPlusPlus.g:1385:2: iv_rulePluralityModifier= rulePluralityModifier EOF
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
    // InternalTraceryPlusPlus.g:1391:1: rulePluralityModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.s' ;
    public final AntlrDatatypeRuleToken rulePluralityModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1397:2: (kw= '.s' )
            // InternalTraceryPlusPlus.g:1398:2: kw= '.s'
            {
            kw=(Token)match(input,36,FOLLOW_2); 

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
    // InternalTraceryPlusPlus.g:1406:1: entryRuleArticleModifier returns [String current=null] : iv_ruleArticleModifier= ruleArticleModifier EOF ;
    public final String entryRuleArticleModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArticleModifier = null;


        try {
            // InternalTraceryPlusPlus.g:1406:55: (iv_ruleArticleModifier= ruleArticleModifier EOF )
            // InternalTraceryPlusPlus.g:1407:2: iv_ruleArticleModifier= ruleArticleModifier EOF
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
    // InternalTraceryPlusPlus.g:1413:1: ruleArticleModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.a' ;
    public final AntlrDatatypeRuleToken ruleArticleModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1419:2: (kw= '.a' )
            // InternalTraceryPlusPlus.g:1420:2: kw= '.a'
            {
            kw=(Token)match(input,37,FOLLOW_2); 

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
    // InternalTraceryPlusPlus.g:1428:1: entryRulePastTenseModifier returns [String current=null] : iv_rulePastTenseModifier= rulePastTenseModifier EOF ;
    public final String entryRulePastTenseModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePastTenseModifier = null;


        try {
            // InternalTraceryPlusPlus.g:1428:57: (iv_rulePastTenseModifier= rulePastTenseModifier EOF )
            // InternalTraceryPlusPlus.g:1429:2: iv_rulePastTenseModifier= rulePastTenseModifier EOF
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
    // InternalTraceryPlusPlus.g:1435:1: rulePastTenseModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.ed' ;
    public final AntlrDatatypeRuleToken rulePastTenseModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1441:2: (kw= '.ed' )
            // InternalTraceryPlusPlus.g:1442:2: kw= '.ed'
            {
            kw=(Token)match(input,38,FOLLOW_2); 

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
    // InternalTraceryPlusPlus.g:1450:1: entryRuleAssignmentOperator returns [String current=null] : iv_ruleAssignmentOperator= ruleAssignmentOperator EOF ;
    public final String entryRuleAssignmentOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAssignmentOperator = null;


        try {
            // InternalTraceryPlusPlus.g:1450:58: (iv_ruleAssignmentOperator= ruleAssignmentOperator EOF )
            // InternalTraceryPlusPlus.g:1451:2: iv_ruleAssignmentOperator= ruleAssignmentOperator EOF
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
    // InternalTraceryPlusPlus.g:1457:1: ruleAssignmentOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= ':' | kw= '-' | kw= '-->' ) ;
    public final AntlrDatatypeRuleToken ruleAssignmentOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1463:2: ( (kw= '=' | kw= ':' | kw= '-' | kw= '-->' ) )
            // InternalTraceryPlusPlus.g:1464:2: (kw= '=' | kw= ':' | kw= '-' | kw= '-->' )
            {
            // InternalTraceryPlusPlus.g:1464:2: (kw= '=' | kw= ':' | kw= '-' | kw= '-->' )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt25=1;
                }
                break;
            case 40:
                {
                alt25=2;
                }
                break;
            case 41:
                {
                alt25=3;
                }
                break;
            case 42:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1465:3: kw= '='
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1471:3: kw= ':'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getColonKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1477:3: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getHyphenMinusKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalTraceryPlusPlus.g:1483:3: kw= '-->'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_3());
                    		

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
    // InternalTraceryPlusPlus.g:1492:1: entryRuleSeparatorOr returns [String current=null] : iv_ruleSeparatorOr= ruleSeparatorOr EOF ;
    public final String entryRuleSeparatorOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSeparatorOr = null;


        try {
            // InternalTraceryPlusPlus.g:1492:51: (iv_ruleSeparatorOr= ruleSeparatorOr EOF )
            // InternalTraceryPlusPlus.g:1493:2: iv_ruleSeparatorOr= ruleSeparatorOr EOF
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
    // InternalTraceryPlusPlus.g:1499:1: ruleSeparatorOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ',' | kw= 'or' | kw= '||' ) ;
    public final AntlrDatatypeRuleToken ruleSeparatorOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1505:2: ( (kw= ',' | kw= 'or' | kw= '||' ) )
            // InternalTraceryPlusPlus.g:1506:2: (kw= ',' | kw= 'or' | kw= '||' )
            {
            // InternalTraceryPlusPlus.g:1506:2: (kw= ',' | kw= 'or' | kw= '||' )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt26=1;
                }
                break;
            case 44:
                {
                alt26=2;
                }
                break;
            case 45:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1507:3: kw= ','
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSeparatorOrAccess().getCommaKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1513:3: kw= 'or'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSeparatorOrAccess().getOrKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1519:3: kw= '||'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSeparatorOrAccess().getVerticalLineVerticalLineKeyword_2());
                    		

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
    // InternalTraceryPlusPlus.g:1528:1: entryRuleSeparatorAnd returns [String current=null] : iv_ruleSeparatorAnd= ruleSeparatorAnd EOF ;
    public final String entryRuleSeparatorAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSeparatorAnd = null;


        try {
            // InternalTraceryPlusPlus.g:1528:52: (iv_ruleSeparatorAnd= ruleSeparatorAnd EOF )
            // InternalTraceryPlusPlus.g:1529:2: iv_ruleSeparatorAnd= ruleSeparatorAnd EOF
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
    // InternalTraceryPlusPlus.g:1535:1: ruleSeparatorAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ',' | kw= 'and' | kw= '&&' ) ;
    public final AntlrDatatypeRuleToken ruleSeparatorAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1541:2: ( (kw= ',' | kw= 'and' | kw= '&&' ) )
            // InternalTraceryPlusPlus.g:1542:2: (kw= ',' | kw= 'and' | kw= '&&' )
            {
            // InternalTraceryPlusPlus.g:1542:2: (kw= ',' | kw= 'and' | kw= '&&' )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt27=1;
                }
                break;
            case 46:
                {
                alt27=2;
                }
                break;
            case 47:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1543:3: kw= ','
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSeparatorAndAccess().getCommaKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1549:3: kw= 'and'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSeparatorAndAccess().getAndKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1555:3: kw= '&&'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSeparatorAndAccess().getAmpersandAmpersandKeyword_2());
                    		

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


    protected DFA14 dfa14 = new DFA14(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\uffff\1\11\5\uffff\1\6\2\uffff";
    static final String dfa_3s = "\6\4\1\uffff\1\4\2\uffff";
    static final String dfa_4s = "\1\4\1\57\4\5\1\uffff\1\57\2\uffff";
    static final String dfa_5s = "\6\uffff\1\2\1\uffff\1\3\1\1";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\7\1\10\5\uffff\1\11\6\uffff\1\11\5\uffff\1\6\16\uffff\1\2\1\3\1\4\1\5\1\11\2\uffff\2\11",
            "\1\6\1\10",
            "\1\6\1\10",
            "\1\6\1\10",
            "\1\6\1\10",
            "",
            "\1\6\6\uffff\1\6\1\uffff\1\11\3\uffff\1\11\1\6\30\uffff\1\6\2\uffff\2\6",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "644:2: (this_JustNameAttribute_0= ruleJustNameAttribute | this_NameExistingListAttribute_1= ruleNameExistingListAttribute | this_NameValueAttribute_2= ruleNameValueAttribute )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040810L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000078000000032L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000078000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000600010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000078000800010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000007C00000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000078001000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000003C2000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000380000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000C80000000002L});

}