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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'The'", "'story'", "'can'", "'have'", "'values'", "'be'", "'has'", "'There'", "'is'", "'are'", "'a'", "'an'", "'attributes'", "'from'", "'.'", "'He'", "'She'", "'It'", "'They'", "'they'", "'them'", "'their'", "'theirs'", "'.capitalize'", "'.CAPITALIZE'", "'.s'", "'.a'", "'.ed'", "'='", "':'", "'-'", "'-->'", "'equal'", "'to'", "','", "'or'", "'||'", "'and'", "'&&'"
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
    public static final int T__48=48;
    public static final int T__49=49;
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
    // InternalTraceryPlusPlus.g:128:1: ruleStatement returns [EObject current=null] : this_Variable_0= ruleVariable ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:134:2: (this_Variable_0= ruleVariable )
            // InternalTraceryPlusPlus.g:135:2: this_Variable_0= ruleVariable
            {

            		newCompositeNode(grammarAccess.getStatementAccess().getVariableParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Variable_0=ruleVariable();

            state._fsp--;


            		current = this_Variable_0;
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


    // $ANTLR start "entryRuleVariable"
    // InternalTraceryPlusPlus.g:146:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalTraceryPlusPlus.g:146:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalTraceryPlusPlus.g:147:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalTraceryPlusPlus.g:153:1: ruleVariable returns [EObject current=null] : (this_ListDeclaration_0= ruleListDeclaration | this_ObjectDeclaration_1= ruleObjectDeclaration ) ;
    public final EObject ruleVariable() throws RecognitionException {
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

                    			newCompositeNode(grammarAccess.getVariableAccess().getListDeclarationParserRuleCall_0());
                    		
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

                    			newCompositeNode(grammarAccess.getVariableAccess().getObjectDeclarationParserRuleCall_1());
                    		
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
    // $ANTLR end "ruleVariable"


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
    // InternalTraceryPlusPlus.g:189:1: ruleStory returns [EObject current=null] : ( () otherlv_1= 'The' otherlv_2= 'story' ( ruleAssignmentOperator )? ( ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleListVariable | lv_story_4_3= ruleObjectAttribute ) ) )* ) ;
    public final EObject ruleStory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_story_4_1 = null;

        EObject lv_story_4_2 = null;

        EObject lv_story_4_3 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:195:2: ( ( () otherlv_1= 'The' otherlv_2= 'story' ( ruleAssignmentOperator )? ( ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleListVariable | lv_story_4_3= ruleObjectAttribute ) ) )* ) )
            // InternalTraceryPlusPlus.g:196:2: ( () otherlv_1= 'The' otherlv_2= 'story' ( ruleAssignmentOperator )? ( ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleListVariable | lv_story_4_3= ruleObjectAttribute ) ) )* )
            {
            // InternalTraceryPlusPlus.g:196:2: ( () otherlv_1= 'The' otherlv_2= 'story' ( ruleAssignmentOperator )? ( ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleListVariable | lv_story_4_3= ruleObjectAttribute ) ) )* )
            // InternalTraceryPlusPlus.g:197:3: () otherlv_1= 'The' otherlv_2= 'story' ( ruleAssignmentOperator )? ( ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleListVariable | lv_story_4_3= ruleObjectAttribute ) ) )*
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

            if ( ((LA3_0>=39 && LA3_0<=43)) ) {
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

            // InternalTraceryPlusPlus.g:221:3: ( ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleListVariable | lv_story_4_3= ruleObjectAttribute ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_STRING)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:222:4: ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleListVariable | lv_story_4_3= ruleObjectAttribute ) )
            	    {
            	    // InternalTraceryPlusPlus.g:222:4: ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleListVariable | lv_story_4_3= ruleObjectAttribute ) )
            	    // InternalTraceryPlusPlus.g:223:5: (lv_story_4_1= ruleWord | lv_story_4_2= ruleListVariable | lv_story_4_3= ruleObjectAttribute )
            	    {
            	    // InternalTraceryPlusPlus.g:223:5: (lv_story_4_1= ruleWord | lv_story_4_2= ruleListVariable | lv_story_4_3= ruleObjectAttribute )
            	    int alt4=3;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==RULE_STRING) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==RULE_ID) ) {
            	        int LA4_2 = input.LA(2);

            	        if ( (LA4_2==25) ) {
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
            	            // InternalTraceryPlusPlus.g:240:6: lv_story_4_2= ruleListVariable
            	            {

            	            						newCompositeNode(grammarAccess.getStoryAccess().getStoryListVariableParserRuleCall_4_0_1());
            	            					
            	            pushFollow(FOLLOW_6);
            	            lv_story_4_2=ruleListVariable();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getStoryRule());
            	            						}
            	            						add(
            	            							current,
            	            							"story",
            	            							lv_story_4_2,
            	            							"tracerypp.TraceryPlusPlus.ListVariable");
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
    // InternalTraceryPlusPlus.g:285:1: ruleListDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' ) | (otherlv_4= 'can' otherlv_5= 'be' ) | ( (otherlv_6= 'has' | otherlv_7= 'have' ) otherlv_8= 'values' ) ) ( ruleAssignmentOperator )? ( (lv_list_10_0= ruleWordList ) ) ) ;
    public final EObject ruleListDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_list_10_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:291:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' ) | (otherlv_4= 'can' otherlv_5= 'be' ) | ( (otherlv_6= 'has' | otherlv_7= 'have' ) otherlv_8= 'values' ) ) ( ruleAssignmentOperator )? ( (lv_list_10_0= ruleWordList ) ) ) )
            // InternalTraceryPlusPlus.g:292:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' ) | (otherlv_4= 'can' otherlv_5= 'be' ) | ( (otherlv_6= 'has' | otherlv_7= 'have' ) otherlv_8= 'values' ) ) ( ruleAssignmentOperator )? ( (lv_list_10_0= ruleWordList ) ) )
            {
            // InternalTraceryPlusPlus.g:292:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' ) | (otherlv_4= 'can' otherlv_5= 'be' ) | ( (otherlv_6= 'has' | otherlv_7= 'have' ) otherlv_8= 'values' ) ) ( ruleAssignmentOperator )? ( (lv_list_10_0= ruleWordList ) ) )
            // InternalTraceryPlusPlus.g:293:3: ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' ) | (otherlv_4= 'can' otherlv_5= 'be' ) | ( (otherlv_6= 'has' | otherlv_7= 'have' ) otherlv_8= 'values' ) ) ( ruleAssignmentOperator )? ( (lv_list_10_0= ruleWordList ) )
            {
            // InternalTraceryPlusPlus.g:293:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTraceryPlusPlus.g:294:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:294:4: (lv_name_0_0= RULE_ID )
            // InternalTraceryPlusPlus.g:295:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getListDeclarationAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalTraceryPlusPlus.g:311:3: ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' ) | (otherlv_4= 'can' otherlv_5= 'be' ) | ( (otherlv_6= 'has' | otherlv_7= 'have' ) otherlv_8= 'values' ) )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==14) ) {
                    alt7=1;
                }
                else if ( (LA7_1==16) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==14||LA7_0==17) ) {
                alt7=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTraceryPlusPlus.g:312:4: (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' )
                    {
                    // InternalTraceryPlusPlus.g:312:4: (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' )
                    // InternalTraceryPlusPlus.g:313:5: otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values'
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
                    // InternalTraceryPlusPlus.g:327:4: (otherlv_4= 'can' otherlv_5= 'be' )
                    {
                    // InternalTraceryPlusPlus.g:327:4: (otherlv_4= 'can' otherlv_5= 'be' )
                    // InternalTraceryPlusPlus.g:328:5: otherlv_4= 'can' otherlv_5= 'be'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_11); 

                    					newLeafNode(otherlv_4, grammarAccess.getListDeclarationAccess().getCanKeyword_1_1_0());
                    				
                    otherlv_5=(Token)match(input,16,FOLLOW_10); 

                    					newLeafNode(otherlv_5, grammarAccess.getListDeclarationAccess().getBeKeyword_1_1_1());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:338:4: ( (otherlv_6= 'has' | otherlv_7= 'have' ) otherlv_8= 'values' )
                    {
                    // InternalTraceryPlusPlus.g:338:4: ( (otherlv_6= 'has' | otherlv_7= 'have' ) otherlv_8= 'values' )
                    // InternalTraceryPlusPlus.g:339:5: (otherlv_6= 'has' | otherlv_7= 'have' ) otherlv_8= 'values'
                    {
                    // InternalTraceryPlusPlus.g:339:5: (otherlv_6= 'has' | otherlv_7= 'have' )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==17) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==14) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalTraceryPlusPlus.g:340:6: otherlv_6= 'has'
                            {
                            otherlv_6=(Token)match(input,17,FOLLOW_9); 

                            						newLeafNode(otherlv_6, grammarAccess.getListDeclarationAccess().getHasKeyword_1_2_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalTraceryPlusPlus.g:345:6: otherlv_7= 'have'
                            {
                            otherlv_7=(Token)match(input,14,FOLLOW_9); 

                            						newLeafNode(otherlv_7, grammarAccess.getListDeclarationAccess().getHaveKeyword_1_2_0_1());
                            					

                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,15,FOLLOW_10); 

                    					newLeafNode(otherlv_8, grammarAccess.getListDeclarationAccess().getValuesKeyword_1_2_1());
                    				

                    }


                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:356:3: ( ruleAssignmentOperator )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=39 && LA8_0<=43)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTraceryPlusPlus.g:357:4: ruleAssignmentOperator
                    {

                    				newCompositeNode(grammarAccess.getListDeclarationAccess().getAssignmentOperatorParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_10);
                    ruleAssignmentOperator();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:365:3: ( (lv_list_10_0= ruleWordList ) )
            // InternalTraceryPlusPlus.g:366:4: (lv_list_10_0= ruleWordList )
            {
            // InternalTraceryPlusPlus.g:366:4: (lv_list_10_0= ruleWordList )
            // InternalTraceryPlusPlus.g:367:5: lv_list_10_0= ruleWordList
            {

            					newCompositeNode(grammarAccess.getListDeclarationAccess().getListWordListParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_list_10_0=ruleWordList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListDeclarationRule());
            					}
            					set(
            						current,
            						"list",
            						lv_list_10_0,
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
    // InternalTraceryPlusPlus.g:388:1: entryRuleObjectDeclaration returns [EObject current=null] : iv_ruleObjectDeclaration= ruleObjectDeclaration EOF ;
    public final EObject entryRuleObjectDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectDeclaration = null;


        try {
            // InternalTraceryPlusPlus.g:388:58: (iv_ruleObjectDeclaration= ruleObjectDeclaration EOF )
            // InternalTraceryPlusPlus.g:389:2: iv_ruleObjectDeclaration= ruleObjectDeclaration EOF
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
    // InternalTraceryPlusPlus.g:395:1: ruleObjectDeclaration returns [EObject current=null] : (otherlv_0= 'There' (otherlv_1= 'is' | otherlv_2= 'are' ) (otherlv_3= 'a' | otherlv_4= 'an' )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_pronouns_6_0= rulePronouns ) ) (otherlv_7= 'has' | otherlv_8= 'have' ) (otherlv_9= 'attributes' )? ( ruleAssignmentOperator )? ( (lv_attributes_11_0= ruleAttributeList ) ) ) ;
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
            // InternalTraceryPlusPlus.g:401:2: ( (otherlv_0= 'There' (otherlv_1= 'is' | otherlv_2= 'are' ) (otherlv_3= 'a' | otherlv_4= 'an' )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_pronouns_6_0= rulePronouns ) ) (otherlv_7= 'has' | otherlv_8= 'have' ) (otherlv_9= 'attributes' )? ( ruleAssignmentOperator )? ( (lv_attributes_11_0= ruleAttributeList ) ) ) )
            // InternalTraceryPlusPlus.g:402:2: (otherlv_0= 'There' (otherlv_1= 'is' | otherlv_2= 'are' ) (otherlv_3= 'a' | otherlv_4= 'an' )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_pronouns_6_0= rulePronouns ) ) (otherlv_7= 'has' | otherlv_8= 'have' ) (otherlv_9= 'attributes' )? ( ruleAssignmentOperator )? ( (lv_attributes_11_0= ruleAttributeList ) ) )
            {
            // InternalTraceryPlusPlus.g:402:2: (otherlv_0= 'There' (otherlv_1= 'is' | otherlv_2= 'are' ) (otherlv_3= 'a' | otherlv_4= 'an' )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_pronouns_6_0= rulePronouns ) ) (otherlv_7= 'has' | otherlv_8= 'have' ) (otherlv_9= 'attributes' )? ( ruleAssignmentOperator )? ( (lv_attributes_11_0= ruleAttributeList ) ) )
            // InternalTraceryPlusPlus.g:403:3: otherlv_0= 'There' (otherlv_1= 'is' | otherlv_2= 'are' ) (otherlv_3= 'a' | otherlv_4= 'an' )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_pronouns_6_0= rulePronouns ) ) (otherlv_7= 'has' | otherlv_8= 'have' ) (otherlv_9= 'attributes' )? ( ruleAssignmentOperator )? ( (lv_attributes_11_0= ruleAttributeList ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectDeclarationAccess().getThereKeyword_0());
            		
            // InternalTraceryPlusPlus.g:407:3: (otherlv_1= 'is' | otherlv_2= 'are' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            else if ( (LA9_0==20) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalTraceryPlusPlus.g:408:4: otherlv_1= 'is'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getObjectDeclarationAccess().getIsKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:413:4: otherlv_2= 'are'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getObjectDeclarationAccess().getAreKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:418:3: (otherlv_3= 'a' | otherlv_4= 'an' )?
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            else if ( (LA10_0==22) ) {
                alt10=2;
            }
            switch (alt10) {
                case 1 :
                    // InternalTraceryPlusPlus.g:419:4: otherlv_3= 'a'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getObjectDeclarationAccess().getAKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:424:4: otherlv_4= 'an'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getObjectDeclarationAccess().getAnKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:429:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalTraceryPlusPlus.g:430:4: (lv_name_5_0= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:430:4: (lv_name_5_0= RULE_ID )
            // InternalTraceryPlusPlus.g:431:5: lv_name_5_0= RULE_ID
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

            // InternalTraceryPlusPlus.g:447:3: ( (lv_pronouns_6_0= rulePronouns ) )
            // InternalTraceryPlusPlus.g:448:4: (lv_pronouns_6_0= rulePronouns )
            {
            // InternalTraceryPlusPlus.g:448:4: (lv_pronouns_6_0= rulePronouns )
            // InternalTraceryPlusPlus.g:449:5: lv_pronouns_6_0= rulePronouns
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

            // InternalTraceryPlusPlus.g:466:3: (otherlv_7= 'has' | otherlv_8= 'have' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            else if ( (LA11_0==14) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalTraceryPlusPlus.g:467:4: otherlv_7= 'has'
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getObjectDeclarationAccess().getHasKeyword_5_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:472:4: otherlv_8= 'have'
                    {
                    otherlv_8=(Token)match(input,14,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getObjectDeclarationAccess().getHaveKeyword_5_1());
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:477:3: (otherlv_9= 'attributes' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTraceryPlusPlus.g:478:4: otherlv_9= 'attributes'
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getObjectDeclarationAccess().getAttributesKeyword_6());
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:483:3: ( ruleAssignmentOperator )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=39 && LA13_0<=43)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTraceryPlusPlus.g:484:4: ruleAssignmentOperator
                    {

                    				newCompositeNode(grammarAccess.getObjectDeclarationAccess().getAssignmentOperatorParserRuleCall_7());
                    			
                    pushFollow(FOLLOW_17);
                    ruleAssignmentOperator();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:492:3: ( (lv_attributes_11_0= ruleAttributeList ) )
            // InternalTraceryPlusPlus.g:493:4: (lv_attributes_11_0= ruleAttributeList )
            {
            // InternalTraceryPlusPlus.g:493:4: (lv_attributes_11_0= ruleAttributeList )
            // InternalTraceryPlusPlus.g:494:5: lv_attributes_11_0= ruleAttributeList
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
    // InternalTraceryPlusPlus.g:515:1: entryRuleWord returns [EObject current=null] : iv_ruleWord= ruleWord EOF ;
    public final EObject entryRuleWord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWord = null;


        try {
            // InternalTraceryPlusPlus.g:515:45: (iv_ruleWord= ruleWord EOF )
            // InternalTraceryPlusPlus.g:516:2: iv_ruleWord= ruleWord EOF
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
    // InternalTraceryPlusPlus.g:522:1: ruleWord returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleWord() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:528:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalTraceryPlusPlus.g:529:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalTraceryPlusPlus.g:529:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalTraceryPlusPlus.g:530:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalTraceryPlusPlus.g:530:3: (lv_name_0_0= RULE_STRING )
            // InternalTraceryPlusPlus.g:531:4: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getWordAccess().getNameSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getWordRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
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


    // $ANTLR start "entryRuleListVariable"
    // InternalTraceryPlusPlus.g:550:1: entryRuleListVariable returns [EObject current=null] : iv_ruleListVariable= ruleListVariable EOF ;
    public final EObject entryRuleListVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListVariable = null;


        try {
            // InternalTraceryPlusPlus.g:550:53: (iv_ruleListVariable= ruleListVariable EOF )
            // InternalTraceryPlusPlus.g:551:2: iv_ruleListVariable= ruleListVariable EOF
            {
             newCompositeNode(grammarAccess.getListVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListVariable=ruleListVariable();

            state._fsp--;

             current =iv_ruleListVariable; 
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
    // $ANTLR end "entryRuleListVariable"


    // $ANTLR start "ruleListVariable"
    // InternalTraceryPlusPlus.g:557:1: ruleListVariable returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )* ) ;
    public final EObject ruleListVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_modifiers_1_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:563:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )* ) )
            // InternalTraceryPlusPlus.g:564:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )* )
            {
            // InternalTraceryPlusPlus.g:564:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )* )
            // InternalTraceryPlusPlus.g:565:3: ( (otherlv_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )*
            {
            // InternalTraceryPlusPlus.g:565:3: ( (otherlv_0= RULE_ID ) )
            // InternalTraceryPlusPlus.g:566:4: (otherlv_0= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:566:4: (otherlv_0= RULE_ID )
            // InternalTraceryPlusPlus.g:567:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListVariableRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_0, grammarAccess.getListVariableAccess().getVariableListDeclarationCrossReference_0_0());
            				

            }


            }

            // InternalTraceryPlusPlus.g:578:3: ( (lv_modifiers_1_0= ruleModifier ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=34 && LA14_0<=38)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:579:4: (lv_modifiers_1_0= ruleModifier )
            	    {
            	    // InternalTraceryPlusPlus.g:579:4: (lv_modifiers_1_0= ruleModifier )
            	    // InternalTraceryPlusPlus.g:580:5: lv_modifiers_1_0= ruleModifier
            	    {

            	    					newCompositeNode(grammarAccess.getListVariableAccess().getModifiersModifierParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_modifiers_1_0=ruleModifier();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListVariableRule());
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
    // $ANTLR end "ruleListVariable"


    // $ANTLR start "entryRuleAttribute"
    // InternalTraceryPlusPlus.g:601:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalTraceryPlusPlus.g:601:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalTraceryPlusPlus.g:602:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalTraceryPlusPlus.g:608:1: ruleAttribute returns [EObject current=null] : (this_JustNameAttribute_0= ruleJustNameAttribute | this_NameExistingListAttribute_1= ruleNameExistingListAttribute | this_NameValueAttribute_2= ruleNameValueAttribute ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_JustNameAttribute_0 = null;

        EObject this_NameExistingListAttribute_1 = null;

        EObject this_NameValueAttribute_2 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:614:2: ( (this_JustNameAttribute_0= ruleJustNameAttribute | this_NameExistingListAttribute_1= ruleNameExistingListAttribute | this_NameValueAttribute_2= ruleNameValueAttribute ) )
            // InternalTraceryPlusPlus.g:615:2: (this_JustNameAttribute_0= ruleJustNameAttribute | this_NameExistingListAttribute_1= ruleNameExistingListAttribute | this_NameValueAttribute_2= ruleNameValueAttribute )
            {
            // InternalTraceryPlusPlus.g:615:2: (this_JustNameAttribute_0= ruleJustNameAttribute | this_NameExistingListAttribute_1= ruleNameExistingListAttribute | this_NameValueAttribute_2= ruleNameValueAttribute )
            int alt15=3;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalTraceryPlusPlus.g:616:3: this_JustNameAttribute_0= ruleJustNameAttribute
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
                    // InternalTraceryPlusPlus.g:625:3: this_NameExistingListAttribute_1= ruleNameExistingListAttribute
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
                    // InternalTraceryPlusPlus.g:634:3: this_NameValueAttribute_2= ruleNameValueAttribute
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


    // $ANTLR start "entryRuleJustNameAttribute"
    // InternalTraceryPlusPlus.g:646:1: entryRuleJustNameAttribute returns [EObject current=null] : iv_ruleJustNameAttribute= ruleJustNameAttribute EOF ;
    public final EObject entryRuleJustNameAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJustNameAttribute = null;


        try {
            // InternalTraceryPlusPlus.g:646:58: (iv_ruleJustNameAttribute= ruleJustNameAttribute EOF )
            // InternalTraceryPlusPlus.g:647:2: iv_ruleJustNameAttribute= ruleJustNameAttribute EOF
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
    // InternalTraceryPlusPlus.g:653:1: ruleJustNameAttribute returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleJustNameAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:659:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:660:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:660:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalTraceryPlusPlus.g:661:3: (lv_name_0_0= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:661:3: (lv_name_0_0= RULE_ID )
            // InternalTraceryPlusPlus.g:662:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getJustNameAttributeAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getJustNameAttributeRule());
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
    // $ANTLR end "ruleJustNameAttribute"


    // $ANTLR start "entryRuleNameExistingListAttribute"
    // InternalTraceryPlusPlus.g:681:1: entryRuleNameExistingListAttribute returns [EObject current=null] : iv_ruleNameExistingListAttribute= ruleNameExistingListAttribute EOF ;
    public final EObject entryRuleNameExistingListAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExistingListAttribute = null;


        try {
            // InternalTraceryPlusPlus.g:681:66: (iv_ruleNameExistingListAttribute= ruleNameExistingListAttribute EOF )
            // InternalTraceryPlusPlus.g:682:2: iv_ruleNameExistingListAttribute= ruleNameExistingListAttribute EOF
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
    // InternalTraceryPlusPlus.g:688:1: ruleNameExistingListAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ruleAssignmentOperator | otherlv_2= 'from' )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleNameExistingListAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:694:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ruleAssignmentOperator | otherlv_2= 'from' )? ( (otherlv_3= RULE_ID ) ) ) )
            // InternalTraceryPlusPlus.g:695:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ruleAssignmentOperator | otherlv_2= 'from' )? ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalTraceryPlusPlus.g:695:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ruleAssignmentOperator | otherlv_2= 'from' )? ( (otherlv_3= RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:696:3: ( (lv_name_0_0= RULE_ID ) ) ( ruleAssignmentOperator | otherlv_2= 'from' )? ( (otherlv_3= RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:696:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTraceryPlusPlus.g:697:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:697:4: (lv_name_0_0= RULE_ID )
            // InternalTraceryPlusPlus.g:698:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_0_0, grammarAccess.getNameExistingListAttributeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNameExistingListAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalTraceryPlusPlus.g:714:3: ( ruleAssignmentOperator | otherlv_2= 'from' )?
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=39 && LA16_0<=43)) ) {
                alt16=1;
            }
            else if ( (LA16_0==24) ) {
                alt16=2;
            }
            switch (alt16) {
                case 1 :
                    // InternalTraceryPlusPlus.g:715:4: ruleAssignmentOperator
                    {

                    				newCompositeNode(grammarAccess.getNameExistingListAttributeAccess().getAssignmentOperatorParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_14);
                    ruleAssignmentOperator();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:723:4: otherlv_2= 'from'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getNameExistingListAttributeAccess().getFromKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:728:3: ( (otherlv_3= RULE_ID ) )
            // InternalTraceryPlusPlus.g:729:4: (otherlv_3= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:729:4: (otherlv_3= RULE_ID )
            // InternalTraceryPlusPlus.g:730:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNameExistingListAttributeRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getNameExistingListAttributeAccess().getValueListDeclarationCrossReference_2_0());
            				

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
    // InternalTraceryPlusPlus.g:745:1: entryRuleNameValueAttribute returns [EObject current=null] : iv_ruleNameValueAttribute= ruleNameValueAttribute EOF ;
    public final EObject entryRuleNameValueAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameValueAttribute = null;


        try {
            // InternalTraceryPlusPlus.g:745:59: (iv_ruleNameValueAttribute= ruleNameValueAttribute EOF )
            // InternalTraceryPlusPlus.g:746:2: iv_ruleNameValueAttribute= ruleNameValueAttribute EOF
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
    // InternalTraceryPlusPlus.g:752:1: ruleNameValueAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ruleAssignmentOperator )? ( (lv_value_2_0= ruleWord ) ) ) ;
    public final EObject ruleNameValueAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:758:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ruleAssignmentOperator )? ( (lv_value_2_0= ruleWord ) ) ) )
            // InternalTraceryPlusPlus.g:759:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ruleAssignmentOperator )? ( (lv_value_2_0= ruleWord ) ) )
            {
            // InternalTraceryPlusPlus.g:759:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ruleAssignmentOperator )? ( (lv_value_2_0= ruleWord ) ) )
            // InternalTraceryPlusPlus.g:760:3: ( (lv_name_0_0= RULE_ID ) ) ( ruleAssignmentOperator )? ( (lv_value_2_0= ruleWord ) )
            {
            // InternalTraceryPlusPlus.g:760:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTraceryPlusPlus.g:761:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:761:4: (lv_name_0_0= RULE_ID )
            // InternalTraceryPlusPlus.g:762:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getNameValueAttributeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNameValueAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalTraceryPlusPlus.g:778:3: ( ruleAssignmentOperator )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=39 && LA17_0<=43)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTraceryPlusPlus.g:779:4: ruleAssignmentOperator
                    {

                    				newCompositeNode(grammarAccess.getNameValueAttributeAccess().getAssignmentOperatorParserRuleCall_1());
                    			
                    pushFollow(FOLLOW_20);
                    ruleAssignmentOperator();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:787:3: ( (lv_value_2_0= ruleWord ) )
            // InternalTraceryPlusPlus.g:788:4: (lv_value_2_0= ruleWord )
            {
            // InternalTraceryPlusPlus.g:788:4: (lv_value_2_0= ruleWord )
            // InternalTraceryPlusPlus.g:789:5: lv_value_2_0= ruleWord
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
    // InternalTraceryPlusPlus.g:810:1: entryRuleObjectAttribute returns [EObject current=null] : iv_ruleObjectAttribute= ruleObjectAttribute EOF ;
    public final EObject entryRuleObjectAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectAttribute = null;


        try {
            // InternalTraceryPlusPlus.g:810:56: (iv_ruleObjectAttribute= ruleObjectAttribute EOF )
            // InternalTraceryPlusPlus.g:811:2: iv_ruleObjectAttribute= ruleObjectAttribute EOF
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
    // InternalTraceryPlusPlus.g:817:1: ruleObjectAttribute returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_pronoun_3_0= rulePronounIdentifier ) ) ) ( (lv_modifiers_4_0= ruleModifier ) )* ) ;
    public final EObject ruleObjectAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_pronoun_3_0 = null;

        AntlrDatatypeRuleToken lv_modifiers_4_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:823:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_pronoun_3_0= rulePronounIdentifier ) ) ) ( (lv_modifiers_4_0= ruleModifier ) )* ) )
            // InternalTraceryPlusPlus.g:824:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_pronoun_3_0= rulePronounIdentifier ) ) ) ( (lv_modifiers_4_0= ruleModifier ) )* )
            {
            // InternalTraceryPlusPlus.g:824:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_pronoun_3_0= rulePronounIdentifier ) ) ) ( (lv_modifiers_4_0= ruleModifier ) )* )
            // InternalTraceryPlusPlus.g:825:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_pronoun_3_0= rulePronounIdentifier ) ) ) ( (lv_modifiers_4_0= ruleModifier ) )*
            {
            // InternalTraceryPlusPlus.g:825:3: ( (otherlv_0= RULE_ID ) )
            // InternalTraceryPlusPlus.g:826:4: (otherlv_0= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:826:4: (otherlv_0= RULE_ID )
            // InternalTraceryPlusPlus.g:827:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectAttributeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_0, grammarAccess.getObjectAttributeAccess().getObjectObjectDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectAttributeAccess().getFullStopKeyword_1());
            		
            // InternalTraceryPlusPlus.g:842:3: ( ( (otherlv_2= RULE_ID ) ) | ( (lv_pronoun_3_0= rulePronounIdentifier ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=30 && LA18_0<=33)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalTraceryPlusPlus.g:843:4: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalTraceryPlusPlus.g:843:4: ( (otherlv_2= RULE_ID ) )
                    // InternalTraceryPlusPlus.g:844:5: (otherlv_2= RULE_ID )
                    {
                    // InternalTraceryPlusPlus.g:844:5: (otherlv_2= RULE_ID )
                    // InternalTraceryPlusPlus.g:845:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjectAttributeRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_2, grammarAccess.getObjectAttributeAccess().getAttributeAttributeCrossReference_2_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:857:4: ( (lv_pronoun_3_0= rulePronounIdentifier ) )
                    {
                    // InternalTraceryPlusPlus.g:857:4: ( (lv_pronoun_3_0= rulePronounIdentifier ) )
                    // InternalTraceryPlusPlus.g:858:5: (lv_pronoun_3_0= rulePronounIdentifier )
                    {
                    // InternalTraceryPlusPlus.g:858:5: (lv_pronoun_3_0= rulePronounIdentifier )
                    // InternalTraceryPlusPlus.g:859:6: lv_pronoun_3_0= rulePronounIdentifier
                    {

                    						newCompositeNode(grammarAccess.getObjectAttributeAccess().getPronounPronounIdentifierParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_pronoun_3_0=rulePronounIdentifier();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjectAttributeRule());
                    						}
                    						set(
                    							current,
                    							"pronoun",
                    							lv_pronoun_3_0,
                    							"tracerypp.TraceryPlusPlus.PronounIdentifier");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:877:3: ( (lv_modifiers_4_0= ruleModifier ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=34 && LA19_0<=38)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:878:4: (lv_modifiers_4_0= ruleModifier )
            	    {
            	    // InternalTraceryPlusPlus.g:878:4: (lv_modifiers_4_0= ruleModifier )
            	    // InternalTraceryPlusPlus.g:879:5: lv_modifiers_4_0= ruleModifier
            	    {

            	    					newCompositeNode(grammarAccess.getObjectAttributeAccess().getModifiersModifierParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_modifiers_4_0=ruleModifier();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getObjectAttributeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"modifiers",
            	    						lv_modifiers_4_0,
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
    // InternalTraceryPlusPlus.g:900:1: entryRuleWordList returns [EObject current=null] : iv_ruleWordList= ruleWordList EOF ;
    public final EObject entryRuleWordList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordList = null;


        try {
            // InternalTraceryPlusPlus.g:900:49: (iv_ruleWordList= ruleWordList EOF )
            // InternalTraceryPlusPlus.g:901:2: iv_ruleWordList= ruleWordList EOF
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
    // InternalTraceryPlusPlus.g:907:1: ruleWordList returns [EObject current=null] : ( ( (lv_words_0_0= ruleWord ) ) ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )* ) ;
    public final EObject ruleWordList() throws RecognitionException {
        EObject current = null;

        EObject lv_words_0_0 = null;

        EObject lv_words_2_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:913:2: ( ( ( (lv_words_0_0= ruleWord ) ) ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )* ) )
            // InternalTraceryPlusPlus.g:914:2: ( ( (lv_words_0_0= ruleWord ) ) ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )* )
            {
            // InternalTraceryPlusPlus.g:914:2: ( ( (lv_words_0_0= ruleWord ) ) ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )* )
            // InternalTraceryPlusPlus.g:915:3: ( (lv_words_0_0= ruleWord ) ) ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )*
            {
            // InternalTraceryPlusPlus.g:915:3: ( (lv_words_0_0= ruleWord ) )
            // InternalTraceryPlusPlus.g:916:4: (lv_words_0_0= ruleWord )
            {
            // InternalTraceryPlusPlus.g:916:4: (lv_words_0_0= ruleWord )
            // InternalTraceryPlusPlus.g:917:5: lv_words_0_0= ruleWord
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

            // InternalTraceryPlusPlus.g:934:3: ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=45 && LA20_0<=47)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:935:4: ruleSeparatorOr ( (lv_words_2_0= ruleWord ) )
            	    {

            	    				newCompositeNode(grammarAccess.getWordListAccess().getSeparatorOrParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_20);
            	    ruleSeparatorOr();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalTraceryPlusPlus.g:942:4: ( (lv_words_2_0= ruleWord ) )
            	    // InternalTraceryPlusPlus.g:943:5: (lv_words_2_0= ruleWord )
            	    {
            	    // InternalTraceryPlusPlus.g:943:5: (lv_words_2_0= ruleWord )
            	    // InternalTraceryPlusPlus.g:944:6: lv_words_2_0= ruleWord
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
    // InternalTraceryPlusPlus.g:966:1: entryRuleAttributeList returns [EObject current=null] : iv_ruleAttributeList= ruleAttributeList EOF ;
    public final EObject entryRuleAttributeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeList = null;


        try {
            // InternalTraceryPlusPlus.g:966:54: (iv_ruleAttributeList= ruleAttributeList EOF )
            // InternalTraceryPlusPlus.g:967:2: iv_ruleAttributeList= ruleAttributeList EOF
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
    // InternalTraceryPlusPlus.g:973:1: ruleAttributeList returns [EObject current=null] : ( ( (lv_attributes_0_0= ruleAttribute ) ) ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )* ) ;
    public final EObject ruleAttributeList() throws RecognitionException {
        EObject current = null;

        EObject lv_attributes_0_0 = null;

        EObject lv_attributes_2_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:979:2: ( ( ( (lv_attributes_0_0= ruleAttribute ) ) ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )* ) )
            // InternalTraceryPlusPlus.g:980:2: ( ( (lv_attributes_0_0= ruleAttribute ) ) ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )* )
            {
            // InternalTraceryPlusPlus.g:980:2: ( ( (lv_attributes_0_0= ruleAttribute ) ) ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )* )
            // InternalTraceryPlusPlus.g:981:3: ( (lv_attributes_0_0= ruleAttribute ) ) ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )*
            {
            // InternalTraceryPlusPlus.g:981:3: ( (lv_attributes_0_0= ruleAttribute ) )
            // InternalTraceryPlusPlus.g:982:4: (lv_attributes_0_0= ruleAttribute )
            {
            // InternalTraceryPlusPlus.g:982:4: (lv_attributes_0_0= ruleAttribute )
            // InternalTraceryPlusPlus.g:983:5: lv_attributes_0_0= ruleAttribute
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

            // InternalTraceryPlusPlus.g:1000:3: ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==45||(LA21_0>=48 && LA21_0<=49)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1001:4: ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) )
            	    {

            	    				newCompositeNode(grammarAccess.getAttributeListAccess().getSeparatorAndParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_17);
            	    ruleSeparatorAnd();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalTraceryPlusPlus.g:1008:4: ( (lv_attributes_2_0= ruleAttribute ) )
            	    // InternalTraceryPlusPlus.g:1009:5: (lv_attributes_2_0= ruleAttribute )
            	    {
            	    // InternalTraceryPlusPlus.g:1009:5: (lv_attributes_2_0= ruleAttribute )
            	    // InternalTraceryPlusPlus.g:1010:6: lv_attributes_2_0= ruleAttribute
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
    // InternalTraceryPlusPlus.g:1032:1: entryRulePronouns returns [EObject current=null] : iv_rulePronouns= rulePronouns EOF ;
    public final EObject entryRulePronouns() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePronouns = null;


        try {
            // InternalTraceryPlusPlus.g:1032:49: (iv_rulePronouns= rulePronouns EOF )
            // InternalTraceryPlusPlus.g:1033:2: iv_rulePronouns= rulePronouns EOF
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
    // InternalTraceryPlusPlus.g:1039:1: rulePronouns returns [EObject current=null] : ( ( (lv_value_0_0= 'He' ) ) | ( (lv_value_1_0= 'She' ) ) | ( (lv_value_2_0= 'It' ) ) | ( (lv_value_3_0= 'They' ) ) ) ;
    public final EObject rulePronouns() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1045:2: ( ( ( (lv_value_0_0= 'He' ) ) | ( (lv_value_1_0= 'She' ) ) | ( (lv_value_2_0= 'It' ) ) | ( (lv_value_3_0= 'They' ) ) ) )
            // InternalTraceryPlusPlus.g:1046:2: ( ( (lv_value_0_0= 'He' ) ) | ( (lv_value_1_0= 'She' ) ) | ( (lv_value_2_0= 'It' ) ) | ( (lv_value_3_0= 'They' ) ) )
            {
            // InternalTraceryPlusPlus.g:1046:2: ( ( (lv_value_0_0= 'He' ) ) | ( (lv_value_1_0= 'She' ) ) | ( (lv_value_2_0= 'It' ) ) | ( (lv_value_3_0= 'They' ) ) )
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
                    // InternalTraceryPlusPlus.g:1047:3: ( (lv_value_0_0= 'He' ) )
                    {
                    // InternalTraceryPlusPlus.g:1047:3: ( (lv_value_0_0= 'He' ) )
                    // InternalTraceryPlusPlus.g:1048:4: (lv_value_0_0= 'He' )
                    {
                    // InternalTraceryPlusPlus.g:1048:4: (lv_value_0_0= 'He' )
                    // InternalTraceryPlusPlus.g:1049:5: lv_value_0_0= 'He'
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
                    // InternalTraceryPlusPlus.g:1062:3: ( (lv_value_1_0= 'She' ) )
                    {
                    // InternalTraceryPlusPlus.g:1062:3: ( (lv_value_1_0= 'She' ) )
                    // InternalTraceryPlusPlus.g:1063:4: (lv_value_1_0= 'She' )
                    {
                    // InternalTraceryPlusPlus.g:1063:4: (lv_value_1_0= 'She' )
                    // InternalTraceryPlusPlus.g:1064:5: lv_value_1_0= 'She'
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
                    // InternalTraceryPlusPlus.g:1077:3: ( (lv_value_2_0= 'It' ) )
                    {
                    // InternalTraceryPlusPlus.g:1077:3: ( (lv_value_2_0= 'It' ) )
                    // InternalTraceryPlusPlus.g:1078:4: (lv_value_2_0= 'It' )
                    {
                    // InternalTraceryPlusPlus.g:1078:4: (lv_value_2_0= 'It' )
                    // InternalTraceryPlusPlus.g:1079:5: lv_value_2_0= 'It'
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
                    // InternalTraceryPlusPlus.g:1092:3: ( (lv_value_3_0= 'They' ) )
                    {
                    // InternalTraceryPlusPlus.g:1092:3: ( (lv_value_3_0= 'They' ) )
                    // InternalTraceryPlusPlus.g:1093:4: (lv_value_3_0= 'They' )
                    {
                    // InternalTraceryPlusPlus.g:1093:4: (lv_value_3_0= 'They' )
                    // InternalTraceryPlusPlus.g:1094:5: lv_value_3_0= 'They'
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
    // InternalTraceryPlusPlus.g:1110:1: entryRulePronounIdentifier returns [EObject current=null] : iv_rulePronounIdentifier= rulePronounIdentifier EOF ;
    public final EObject entryRulePronounIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePronounIdentifier = null;


        try {
            // InternalTraceryPlusPlus.g:1110:58: (iv_rulePronounIdentifier= rulePronounIdentifier EOF )
            // InternalTraceryPlusPlus.g:1111:2: iv_rulePronounIdentifier= rulePronounIdentifier EOF
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
    // InternalTraceryPlusPlus.g:1117:1: rulePronounIdentifier returns [EObject current=null] : ( ( (lv_name_0_1= 'they' | lv_name_0_2= 'them' | lv_name_0_3= 'their' | lv_name_0_4= 'theirs' ) ) ) ;
    public final EObject rulePronounIdentifier() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1123:2: ( ( ( (lv_name_0_1= 'they' | lv_name_0_2= 'them' | lv_name_0_3= 'their' | lv_name_0_4= 'theirs' ) ) ) )
            // InternalTraceryPlusPlus.g:1124:2: ( ( (lv_name_0_1= 'they' | lv_name_0_2= 'them' | lv_name_0_3= 'their' | lv_name_0_4= 'theirs' ) ) )
            {
            // InternalTraceryPlusPlus.g:1124:2: ( ( (lv_name_0_1= 'they' | lv_name_0_2= 'them' | lv_name_0_3= 'their' | lv_name_0_4= 'theirs' ) ) )
            // InternalTraceryPlusPlus.g:1125:3: ( (lv_name_0_1= 'they' | lv_name_0_2= 'them' | lv_name_0_3= 'their' | lv_name_0_4= 'theirs' ) )
            {
            // InternalTraceryPlusPlus.g:1125:3: ( (lv_name_0_1= 'they' | lv_name_0_2= 'them' | lv_name_0_3= 'their' | lv_name_0_4= 'theirs' ) )
            // InternalTraceryPlusPlus.g:1126:4: (lv_name_0_1= 'they' | lv_name_0_2= 'them' | lv_name_0_3= 'their' | lv_name_0_4= 'theirs' )
            {
            // InternalTraceryPlusPlus.g:1126:4: (lv_name_0_1= 'they' | lv_name_0_2= 'them' | lv_name_0_3= 'their' | lv_name_0_4= 'theirs' )
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
                    // InternalTraceryPlusPlus.g:1127:5: lv_name_0_1= 'they'
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
                    // InternalTraceryPlusPlus.g:1138:5: lv_name_0_2= 'them'
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
                    // InternalTraceryPlusPlus.g:1149:5: lv_name_0_3= 'their'
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
                    // InternalTraceryPlusPlus.g:1160:5: lv_name_0_4= 'theirs'
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
    // InternalTraceryPlusPlus.g:1176:1: entryRuleModifier returns [String current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final String entryRuleModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModifier = null;


        try {
            // InternalTraceryPlusPlus.g:1176:48: (iv_ruleModifier= ruleModifier EOF )
            // InternalTraceryPlusPlus.g:1177:2: iv_ruleModifier= ruleModifier EOF
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
    // InternalTraceryPlusPlus.g:1183:1: ruleModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CapitalizationModifier_0= ruleCapitalizationModifier | this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier | this_PluralityModifier_2= rulePluralityModifier | this_ArticleModifier_3= ruleArticleModifier | this_PastTenseModifier_4= rulePastTenseModifier ) ;
    public final AntlrDatatypeRuleToken ruleModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_CapitalizationModifier_0 = null;

        AntlrDatatypeRuleToken this_FullCapitalizationModifier_1 = null;

        AntlrDatatypeRuleToken this_PluralityModifier_2 = null;

        AntlrDatatypeRuleToken this_ArticleModifier_3 = null;

        AntlrDatatypeRuleToken this_PastTenseModifier_4 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1189:2: ( (this_CapitalizationModifier_0= ruleCapitalizationModifier | this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier | this_PluralityModifier_2= rulePluralityModifier | this_ArticleModifier_3= ruleArticleModifier | this_PastTenseModifier_4= rulePastTenseModifier ) )
            // InternalTraceryPlusPlus.g:1190:2: (this_CapitalizationModifier_0= ruleCapitalizationModifier | this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier | this_PluralityModifier_2= rulePluralityModifier | this_ArticleModifier_3= ruleArticleModifier | this_PastTenseModifier_4= rulePastTenseModifier )
            {
            // InternalTraceryPlusPlus.g:1190:2: (this_CapitalizationModifier_0= ruleCapitalizationModifier | this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier | this_PluralityModifier_2= rulePluralityModifier | this_ArticleModifier_3= ruleArticleModifier | this_PastTenseModifier_4= rulePastTenseModifier )
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
                    // InternalTraceryPlusPlus.g:1191:3: this_CapitalizationModifier_0= ruleCapitalizationModifier
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
                    // InternalTraceryPlusPlus.g:1202:3: this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier
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
                    // InternalTraceryPlusPlus.g:1213:3: this_PluralityModifier_2= rulePluralityModifier
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
                    // InternalTraceryPlusPlus.g:1224:3: this_ArticleModifier_3= ruleArticleModifier
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
                    // InternalTraceryPlusPlus.g:1235:3: this_PastTenseModifier_4= rulePastTenseModifier
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
    // InternalTraceryPlusPlus.g:1249:1: entryRuleCapitalizationModifier returns [String current=null] : iv_ruleCapitalizationModifier= ruleCapitalizationModifier EOF ;
    public final String entryRuleCapitalizationModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCapitalizationModifier = null;


        try {
            // InternalTraceryPlusPlus.g:1249:62: (iv_ruleCapitalizationModifier= ruleCapitalizationModifier EOF )
            // InternalTraceryPlusPlus.g:1250:2: iv_ruleCapitalizationModifier= ruleCapitalizationModifier EOF
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
    // InternalTraceryPlusPlus.g:1256:1: ruleCapitalizationModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.capitalize' ;
    public final AntlrDatatypeRuleToken ruleCapitalizationModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1262:2: (kw= '.capitalize' )
            // InternalTraceryPlusPlus.g:1263:2: kw= '.capitalize'
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
    // InternalTraceryPlusPlus.g:1271:1: entryRuleFullCapitalizationModifier returns [String current=null] : iv_ruleFullCapitalizationModifier= ruleFullCapitalizationModifier EOF ;
    public final String entryRuleFullCapitalizationModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFullCapitalizationModifier = null;


        try {
            // InternalTraceryPlusPlus.g:1271:66: (iv_ruleFullCapitalizationModifier= ruleFullCapitalizationModifier EOF )
            // InternalTraceryPlusPlus.g:1272:2: iv_ruleFullCapitalizationModifier= ruleFullCapitalizationModifier EOF
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
    // InternalTraceryPlusPlus.g:1278:1: ruleFullCapitalizationModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.CAPITALIZE' ;
    public final AntlrDatatypeRuleToken ruleFullCapitalizationModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1284:2: (kw= '.CAPITALIZE' )
            // InternalTraceryPlusPlus.g:1285:2: kw= '.CAPITALIZE'
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
    // InternalTraceryPlusPlus.g:1293:1: entryRulePluralityModifier returns [String current=null] : iv_rulePluralityModifier= rulePluralityModifier EOF ;
    public final String entryRulePluralityModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePluralityModifier = null;


        try {
            // InternalTraceryPlusPlus.g:1293:57: (iv_rulePluralityModifier= rulePluralityModifier EOF )
            // InternalTraceryPlusPlus.g:1294:2: iv_rulePluralityModifier= rulePluralityModifier EOF
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
    // InternalTraceryPlusPlus.g:1300:1: rulePluralityModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.s' ;
    public final AntlrDatatypeRuleToken rulePluralityModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1306:2: (kw= '.s' )
            // InternalTraceryPlusPlus.g:1307:2: kw= '.s'
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
    // InternalTraceryPlusPlus.g:1315:1: entryRuleArticleModifier returns [String current=null] : iv_ruleArticleModifier= ruleArticleModifier EOF ;
    public final String entryRuleArticleModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArticleModifier = null;


        try {
            // InternalTraceryPlusPlus.g:1315:55: (iv_ruleArticleModifier= ruleArticleModifier EOF )
            // InternalTraceryPlusPlus.g:1316:2: iv_ruleArticleModifier= ruleArticleModifier EOF
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
    // InternalTraceryPlusPlus.g:1322:1: ruleArticleModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.a' ;
    public final AntlrDatatypeRuleToken ruleArticleModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1328:2: (kw= '.a' )
            // InternalTraceryPlusPlus.g:1329:2: kw= '.a'
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
    // InternalTraceryPlusPlus.g:1337:1: entryRulePastTenseModifier returns [String current=null] : iv_rulePastTenseModifier= rulePastTenseModifier EOF ;
    public final String entryRulePastTenseModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePastTenseModifier = null;


        try {
            // InternalTraceryPlusPlus.g:1337:57: (iv_rulePastTenseModifier= rulePastTenseModifier EOF )
            // InternalTraceryPlusPlus.g:1338:2: iv_rulePastTenseModifier= rulePastTenseModifier EOF
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
    // InternalTraceryPlusPlus.g:1344:1: rulePastTenseModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.ed' ;
    public final AntlrDatatypeRuleToken rulePastTenseModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1350:2: (kw= '.ed' )
            // InternalTraceryPlusPlus.g:1351:2: kw= '.ed'
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
    // InternalTraceryPlusPlus.g:1359:1: entryRuleAssignmentOperator returns [String current=null] : iv_ruleAssignmentOperator= ruleAssignmentOperator EOF ;
    public final String entryRuleAssignmentOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAssignmentOperator = null;


        try {
            // InternalTraceryPlusPlus.g:1359:58: (iv_ruleAssignmentOperator= ruleAssignmentOperator EOF )
            // InternalTraceryPlusPlus.g:1360:2: iv_ruleAssignmentOperator= ruleAssignmentOperator EOF
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
    // InternalTraceryPlusPlus.g:1366:1: ruleAssignmentOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= ':' | kw= '-' | kw= '-->' | (kw= 'equal' kw= 'to' ) ) ;
    public final AntlrDatatypeRuleToken ruleAssignmentOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1372:2: ( (kw= '=' | kw= ':' | kw= '-' | kw= '-->' | (kw= 'equal' kw= 'to' ) ) )
            // InternalTraceryPlusPlus.g:1373:2: (kw= '=' | kw= ':' | kw= '-' | kw= '-->' | (kw= 'equal' kw= 'to' ) )
            {
            // InternalTraceryPlusPlus.g:1373:2: (kw= '=' | kw= ':' | kw= '-' | kw= '-->' | (kw= 'equal' kw= 'to' ) )
            int alt25=5;
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
            case 43:
                {
                alt25=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1374:3: kw= '='
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1380:3: kw= ':'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getColonKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1386:3: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getHyphenMinusKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalTraceryPlusPlus.g:1392:3: kw= '-->'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalTraceryPlusPlus.g:1398:3: (kw= 'equal' kw= 'to' )
                    {
                    // InternalTraceryPlusPlus.g:1398:3: (kw= 'equal' kw= 'to' )
                    // InternalTraceryPlusPlus.g:1399:4: kw= 'equal' kw= 'to'
                    {
                    kw=(Token)match(input,43,FOLLOW_25); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getEqualKeyword_4_0());
                    			
                    kw=(Token)match(input,44,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getToKeyword_4_1());
                    			

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
    // $ANTLR end "ruleAssignmentOperator"


    // $ANTLR start "entryRuleSeparatorOr"
    // InternalTraceryPlusPlus.g:1414:1: entryRuleSeparatorOr returns [String current=null] : iv_ruleSeparatorOr= ruleSeparatorOr EOF ;
    public final String entryRuleSeparatorOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSeparatorOr = null;


        try {
            // InternalTraceryPlusPlus.g:1414:51: (iv_ruleSeparatorOr= ruleSeparatorOr EOF )
            // InternalTraceryPlusPlus.g:1415:2: iv_ruleSeparatorOr= ruleSeparatorOr EOF
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
    // InternalTraceryPlusPlus.g:1421:1: ruleSeparatorOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ',' | kw= 'or' | kw= '||' ) ;
    public final AntlrDatatypeRuleToken ruleSeparatorOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1427:2: ( (kw= ',' | kw= 'or' | kw= '||' ) )
            // InternalTraceryPlusPlus.g:1428:2: (kw= ',' | kw= 'or' | kw= '||' )
            {
            // InternalTraceryPlusPlus.g:1428:2: (kw= ',' | kw= 'or' | kw= '||' )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt26=1;
                }
                break;
            case 46:
                {
                alt26=2;
                }
                break;
            case 47:
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
                    // InternalTraceryPlusPlus.g:1429:3: kw= ','
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSeparatorOrAccess().getCommaKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1435:3: kw= 'or'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSeparatorOrAccess().getOrKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1441:3: kw= '||'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

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
    // InternalTraceryPlusPlus.g:1450:1: entryRuleSeparatorAnd returns [String current=null] : iv_ruleSeparatorAnd= ruleSeparatorAnd EOF ;
    public final String entryRuleSeparatorAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSeparatorAnd = null;


        try {
            // InternalTraceryPlusPlus.g:1450:52: (iv_ruleSeparatorAnd= ruleSeparatorAnd EOF )
            // InternalTraceryPlusPlus.g:1451:2: iv_ruleSeparatorAnd= ruleSeparatorAnd EOF
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
    // InternalTraceryPlusPlus.g:1457:1: ruleSeparatorAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ',' | kw= 'and' | kw= '&&' ) ;
    public final AntlrDatatypeRuleToken ruleSeparatorAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1463:2: ( (kw= ',' | kw= 'and' | kw= '&&' ) )
            // InternalTraceryPlusPlus.g:1464:2: (kw= ',' | kw= 'and' | kw= '&&' )
            {
            // InternalTraceryPlusPlus.g:1464:2: (kw= ',' | kw= 'and' | kw= '&&' )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt27=1;
                }
                break;
            case 48:
                {
                alt27=2;
                }
                break;
            case 49:
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
                    // InternalTraceryPlusPlus.g:1465:3: kw= ','
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSeparatorAndAccess().getCommaKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1471:3: kw= 'and'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSeparatorAndAccess().getAndKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1477:3: kw= '&&'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

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


    protected DFA15 dfa15 = new DFA15(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\1\12\6\uffff\1\7\3\uffff";
    static final String dfa_3s = "\6\4\1\54\1\uffff\1\4\2\uffff\1\4";
    static final String dfa_4s = "\1\4\1\61\4\5\1\54\1\uffff\1\61\2\uffff\1\5";
    static final String dfa_5s = "\7\uffff\1\2\1\uffff\1\3\1\1\1\uffff";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\10\1\11\5\uffff\1\12\6\uffff\1\12\5\uffff\1\7\16\uffff\1\2\1\3\1\4\1\5\1\6\1\uffff\1\12\2\uffff\2\12",
            "\1\7\1\11",
            "\1\7\1\11",
            "\1\7\1\11",
            "\1\7\1\11",
            "\1\13",
            "",
            "\1\7\6\uffff\1\7\1\uffff\2\12\2\uffff\1\12\1\7\32\uffff\1\7\2\uffff\2\7",
            "",
            "",
            "\1\7\1\11"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "615:2: (this_JustNameAttribute_0= ruleJustNameAttribute | this_NameExistingListAttribute_1= ruleNameExistingListAttribute | this_NameValueAttribute_2= ruleNameValueAttribute )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040810L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000F8000000032L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000026000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000F8000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000600010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000F8000800010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000007C00000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000F8001000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000003C0000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000E00000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0003200000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000000000L});

}