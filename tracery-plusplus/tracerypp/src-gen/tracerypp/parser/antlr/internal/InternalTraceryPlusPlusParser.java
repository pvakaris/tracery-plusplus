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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTraceryPlusPlusParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'The'", "'story'", "'can'", "'have'", "'values'", "'be'", "'has'", "'There'", "'is'", "'are'", "'a'", "'an'", "'attributes'", "'define'", "'substory'", "':'", "'end-substory'", "'from'", "'use'", "'sub'", "'.'", "'He'", "'She'", "'It'", "'They'", "'='", "'-'", "'-->'", "'equal'", "'to'", "','", "'or'", "'||'", "'and'", "'&&'", "':they'", "':them'", "':their'", "':theirs'", "'-capitalize'", "'-CAPITALIZE'", "'-s'", "'-a'", "'-ed'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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
    // InternalTraceryPlusPlus.g:65:1: entryRuleTraceryPlusPlusProgram returns [EObject current=null] : iv_ruleTraceryPlusPlusProgram= ruleTraceryPlusPlusProgram EOF ;
    public final EObject entryRuleTraceryPlusPlusProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceryPlusPlusProgram = null;


        try {
            // InternalTraceryPlusPlus.g:65:63: (iv_ruleTraceryPlusPlusProgram= ruleTraceryPlusPlusProgram EOF )
            // InternalTraceryPlusPlus.g:66:2: iv_ruleTraceryPlusPlusProgram= ruleTraceryPlusPlusProgram EOF
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
    // InternalTraceryPlusPlus.g:72:1: ruleTraceryPlusPlusProgram returns [EObject current=null] : ( ( (lv_statements_0_0= ruleStatement ) )* ( (lv_story_1_0= ruleStory ) )? ) ;
    public final EObject ruleTraceryPlusPlusProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;

        EObject lv_story_1_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:78:2: ( ( ( (lv_statements_0_0= ruleStatement ) )* ( (lv_story_1_0= ruleStory ) )? ) )
            // InternalTraceryPlusPlus.g:79:2: ( ( (lv_statements_0_0= ruleStatement ) )* ( (lv_story_1_0= ruleStory ) )? )
            {
            // InternalTraceryPlusPlus.g:79:2: ( ( (lv_statements_0_0= ruleStatement ) )* ( (lv_story_1_0= ruleStory ) )? )
            // InternalTraceryPlusPlus.g:80:3: ( (lv_statements_0_0= ruleStatement ) )* ( (lv_story_1_0= ruleStory ) )?
            {
            // InternalTraceryPlusPlus.g:80:3: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==18||(LA1_0>=24 && LA1_0<=25)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:81:4: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalTraceryPlusPlus.g:81:4: (lv_statements_0_0= ruleStatement )
            	    // InternalTraceryPlusPlus.g:82:5: lv_statements_0_0= ruleStatement
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

            // InternalTraceryPlusPlus.g:99:3: ( (lv_story_1_0= ruleStory ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalTraceryPlusPlus.g:100:4: (lv_story_1_0= ruleStory )
                    {
                    // InternalTraceryPlusPlus.g:100:4: (lv_story_1_0= ruleStory )
                    // InternalTraceryPlusPlus.g:101:5: lv_story_1_0= ruleStory
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
                    break;

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
    // InternalTraceryPlusPlus.g:122:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalTraceryPlusPlus.g:122:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalTraceryPlusPlus.g:123:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalTraceryPlusPlus.g:129:1: ruleStatement returns [EObject current=null] : this_Variable_0= ruleVariable ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:135:2: (this_Variable_0= ruleVariable )
            // InternalTraceryPlusPlus.g:136:2: this_Variable_0= ruleVariable
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
    // InternalTraceryPlusPlus.g:147:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalTraceryPlusPlus.g:147:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalTraceryPlusPlus.g:148:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalTraceryPlusPlus.g:154:1: ruleVariable returns [EObject current=null] : (this_ListDeclaration_0= ruleListDeclaration | this_ObjectDeclaration_1= ruleObjectDeclaration | this_SubstoryDeclaration_2= ruleSubstoryDeclaration ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_ListDeclaration_0 = null;

        EObject this_ObjectDeclaration_1 = null;

        EObject this_SubstoryDeclaration_2 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:160:2: ( (this_ListDeclaration_0= ruleListDeclaration | this_ObjectDeclaration_1= ruleObjectDeclaration | this_SubstoryDeclaration_2= ruleSubstoryDeclaration ) )
            // InternalTraceryPlusPlus.g:161:2: (this_ListDeclaration_0= ruleListDeclaration | this_ObjectDeclaration_1= ruleObjectDeclaration | this_SubstoryDeclaration_2= ruleSubstoryDeclaration )
            {
            // InternalTraceryPlusPlus.g:161:2: (this_ListDeclaration_0= ruleListDeclaration | this_ObjectDeclaration_1= ruleObjectDeclaration | this_SubstoryDeclaration_2= ruleSubstoryDeclaration )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 24:
            case 25:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalTraceryPlusPlus.g:162:3: this_ListDeclaration_0= ruleListDeclaration
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
                    // InternalTraceryPlusPlus.g:171:3: this_ObjectDeclaration_1= ruleObjectDeclaration
                    {

                    			newCompositeNode(grammarAccess.getVariableAccess().getObjectDeclarationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectDeclaration_1=ruleObjectDeclaration();

                    state._fsp--;


                    			current = this_ObjectDeclaration_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:180:3: this_SubstoryDeclaration_2= ruleSubstoryDeclaration
                    {

                    			newCompositeNode(grammarAccess.getVariableAccess().getSubstoryDeclarationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SubstoryDeclaration_2=ruleSubstoryDeclaration();

                    state._fsp--;


                    			current = this_SubstoryDeclaration_2;
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


    // $ANTLR start "entryRuleVariableUse"
    // InternalTraceryPlusPlus.g:192:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalTraceryPlusPlus.g:192:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalTraceryPlusPlus.g:193:2: iv_ruleVariableUse= ruleVariableUse EOF
            {
             newCompositeNode(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableUse=ruleVariableUse();

            state._fsp--;

             current =iv_ruleVariableUse; 
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
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalTraceryPlusPlus.g:199:1: ruleVariableUse returns [EObject current=null] : (this_ListUse_0= ruleListUse | this_ObjectUse_1= ruleObjectUse | this_SubstoryUse_2= ruleSubstoryUse ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject this_ListUse_0 = null;

        EObject this_ObjectUse_1 = null;

        EObject this_SubstoryUse_2 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:205:2: ( (this_ListUse_0= ruleListUse | this_ObjectUse_1= ruleObjectUse | this_SubstoryUse_2= ruleSubstoryUse ) )
            // InternalTraceryPlusPlus.g:206:2: (this_ListUse_0= ruleListUse | this_ObjectUse_1= ruleObjectUse | this_SubstoryUse_2= ruleSubstoryUse )
            {
            // InternalTraceryPlusPlus.g:206:2: (this_ListUse_0= ruleListUse | this_ObjectUse_1= ruleObjectUse | this_SubstoryUse_2= ruleSubstoryUse )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==31||(LA4_1>=46 && LA4_1<=49)) ) {
                    alt4=2;
                }
                else if ( (LA4_1==EOF||(LA4_1>=RULE_ID && LA4_1<=RULE_STRING)||LA4_1==27||LA4_1==29||(LA4_1>=50 && LA4_1<=54)) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==29) ) {
                alt4=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTraceryPlusPlus.g:207:3: this_ListUse_0= ruleListUse
                    {

                    			newCompositeNode(grammarAccess.getVariableUseAccess().getListUseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListUse_0=ruleListUse();

                    state._fsp--;


                    			current = this_ListUse_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:216:3: this_ObjectUse_1= ruleObjectUse
                    {

                    			newCompositeNode(grammarAccess.getVariableUseAccess().getObjectUseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectUse_1=ruleObjectUse();

                    state._fsp--;


                    			current = this_ObjectUse_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:225:3: this_SubstoryUse_2= ruleSubstoryUse
                    {

                    			newCompositeNode(grammarAccess.getVariableUseAccess().getSubstoryUseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SubstoryUse_2=ruleSubstoryUse();

                    state._fsp--;


                    			current = this_SubstoryUse_2;
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
    // $ANTLR end "ruleVariableUse"


    // $ANTLR start "entryRuleStory"
    // InternalTraceryPlusPlus.g:237:1: entryRuleStory returns [EObject current=null] : iv_ruleStory= ruleStory EOF ;
    public final EObject entryRuleStory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStory = null;


        try {
            // InternalTraceryPlusPlus.g:237:46: (iv_ruleStory= ruleStory EOF )
            // InternalTraceryPlusPlus.g:238:2: iv_ruleStory= ruleStory EOF
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
    // InternalTraceryPlusPlus.g:244:1: ruleStory returns [EObject current=null] : ( () otherlv_1= 'The' otherlv_2= 'story' ( ruleAssignmentOperator )? ( ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleVariableUse ) ) )* ) ;
    public final EObject ruleStory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_story_4_1 = null;

        EObject lv_story_4_2 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:250:2: ( ( () otherlv_1= 'The' otherlv_2= 'story' ( ruleAssignmentOperator )? ( ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleVariableUse ) ) )* ) )
            // InternalTraceryPlusPlus.g:251:2: ( () otherlv_1= 'The' otherlv_2= 'story' ( ruleAssignmentOperator )? ( ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleVariableUse ) ) )* )
            {
            // InternalTraceryPlusPlus.g:251:2: ( () otherlv_1= 'The' otherlv_2= 'story' ( ruleAssignmentOperator )? ( ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleVariableUse ) ) )* )
            // InternalTraceryPlusPlus.g:252:3: () otherlv_1= 'The' otherlv_2= 'story' ( ruleAssignmentOperator )? ( ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleVariableUse ) ) )*
            {
            // InternalTraceryPlusPlus.g:252:3: ()
            // InternalTraceryPlusPlus.g:253:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStoryAccess().getStoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getStoryAccess().getTheKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getStoryAccess().getStoryKeyword_2());
            		
            // InternalTraceryPlusPlus.g:267:3: ( ruleAssignmentOperator )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19||LA5_0==26||(LA5_0>=36 && LA5_0<=39)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTraceryPlusPlus.g:268:4: ruleAssignmentOperator
                    {

                    				newCompositeNode(grammarAccess.getStoryAccess().getAssignmentOperatorParserRuleCall_3());
                    			
                    pushFollow(FOLLOW_6);
                    ruleAssignmentOperator();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:276:3: ( ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleVariableUse ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_STRING)||LA7_0==29) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:277:4: ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleVariableUse ) )
            	    {
            	    // InternalTraceryPlusPlus.g:277:4: ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleVariableUse ) )
            	    // InternalTraceryPlusPlus.g:278:5: (lv_story_4_1= ruleWord | lv_story_4_2= ruleVariableUse )
            	    {
            	    // InternalTraceryPlusPlus.g:278:5: (lv_story_4_1= ruleWord | lv_story_4_2= ruleVariableUse )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==RULE_STRING) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==RULE_ID||LA6_0==29) ) {
            	        alt6=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalTraceryPlusPlus.g:279:6: lv_story_4_1= ruleWord
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
            	            // InternalTraceryPlusPlus.g:295:6: lv_story_4_2= ruleVariableUse
            	            {

            	            						newCompositeNode(grammarAccess.getStoryAccess().getStoryVariableUseParserRuleCall_4_0_1());
            	            					
            	            pushFollow(FOLLOW_6);
            	            lv_story_4_2=ruleVariableUse();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getStoryRule());
            	            						}
            	            						add(
            	            							current,
            	            							"story",
            	            							lv_story_4_2,
            	            							"tracerypp.TraceryPlusPlus.VariableUse");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

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
    // $ANTLR end "ruleStory"


    // $ANTLR start "entryRuleListDeclaration"
    // InternalTraceryPlusPlus.g:317:1: entryRuleListDeclaration returns [EObject current=null] : iv_ruleListDeclaration= ruleListDeclaration EOF ;
    public final EObject entryRuleListDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListDeclaration = null;


        try {
            // InternalTraceryPlusPlus.g:317:56: (iv_ruleListDeclaration= ruleListDeclaration EOF )
            // InternalTraceryPlusPlus.g:318:2: iv_ruleListDeclaration= ruleListDeclaration EOF
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
    // InternalTraceryPlusPlus.g:324:1: ruleListDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' ) | (otherlv_4= 'can' otherlv_5= 'be' ) | ( (otherlv_6= 'has' | otherlv_7= 'have' ) otherlv_8= 'values' ) ) ( ruleAssignmentOperator )? ( (lv_list_10_0= ruleWordList ) ) ) ;
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
            // InternalTraceryPlusPlus.g:330:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' ) | (otherlv_4= 'can' otherlv_5= 'be' ) | ( (otherlv_6= 'has' | otherlv_7= 'have' ) otherlv_8= 'values' ) ) ( ruleAssignmentOperator )? ( (lv_list_10_0= ruleWordList ) ) ) )
            // InternalTraceryPlusPlus.g:331:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' ) | (otherlv_4= 'can' otherlv_5= 'be' ) | ( (otherlv_6= 'has' | otherlv_7= 'have' ) otherlv_8= 'values' ) ) ( ruleAssignmentOperator )? ( (lv_list_10_0= ruleWordList ) ) )
            {
            // InternalTraceryPlusPlus.g:331:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' ) | (otherlv_4= 'can' otherlv_5= 'be' ) | ( (otherlv_6= 'has' | otherlv_7= 'have' ) otherlv_8= 'values' ) ) ( ruleAssignmentOperator )? ( (lv_list_10_0= ruleWordList ) ) )
            // InternalTraceryPlusPlus.g:332:3: ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' ) | (otherlv_4= 'can' otherlv_5= 'be' ) | ( (otherlv_6= 'has' | otherlv_7= 'have' ) otherlv_8= 'values' ) ) ( ruleAssignmentOperator )? ( (lv_list_10_0= ruleWordList ) )
            {
            // InternalTraceryPlusPlus.g:332:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTraceryPlusPlus.g:333:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:333:4: (lv_name_0_0= RULE_ID )
            // InternalTraceryPlusPlus.g:334:5: lv_name_0_0= RULE_ID
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

            // InternalTraceryPlusPlus.g:350:3: ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' ) | (otherlv_4= 'can' otherlv_5= 'be' ) | ( (otherlv_6= 'has' | otherlv_7= 'have' ) otherlv_8= 'values' ) )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==16) ) {
                    alt9=2;
                }
                else if ( (LA9_1==14) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA9_0==14||LA9_0==17) ) {
                alt9=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalTraceryPlusPlus.g:351:4: (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' )
                    {
                    // InternalTraceryPlusPlus.g:351:4: (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' )
                    // InternalTraceryPlusPlus.g:352:5: otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values'
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
                    // InternalTraceryPlusPlus.g:366:4: (otherlv_4= 'can' otherlv_5= 'be' )
                    {
                    // InternalTraceryPlusPlus.g:366:4: (otherlv_4= 'can' otherlv_5= 'be' )
                    // InternalTraceryPlusPlus.g:367:5: otherlv_4= 'can' otherlv_5= 'be'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_11); 

                    					newLeafNode(otherlv_4, grammarAccess.getListDeclarationAccess().getCanKeyword_1_1_0());
                    				
                    otherlv_5=(Token)match(input,16,FOLLOW_10); 

                    					newLeafNode(otherlv_5, grammarAccess.getListDeclarationAccess().getBeKeyword_1_1_1());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:377:4: ( (otherlv_6= 'has' | otherlv_7= 'have' ) otherlv_8= 'values' )
                    {
                    // InternalTraceryPlusPlus.g:377:4: ( (otherlv_6= 'has' | otherlv_7= 'have' ) otherlv_8= 'values' )
                    // InternalTraceryPlusPlus.g:378:5: (otherlv_6= 'has' | otherlv_7= 'have' ) otherlv_8= 'values'
                    {
                    // InternalTraceryPlusPlus.g:378:5: (otherlv_6= 'has' | otherlv_7= 'have' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==17) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==14) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalTraceryPlusPlus.g:379:6: otherlv_6= 'has'
                            {
                            otherlv_6=(Token)match(input,17,FOLLOW_9); 

                            						newLeafNode(otherlv_6, grammarAccess.getListDeclarationAccess().getHasKeyword_1_2_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalTraceryPlusPlus.g:384:6: otherlv_7= 'have'
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

            // InternalTraceryPlusPlus.g:395:3: ( ruleAssignmentOperator )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19||LA10_0==26||(LA10_0>=36 && LA10_0<=39)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTraceryPlusPlus.g:396:4: ruleAssignmentOperator
                    {

                    				newCompositeNode(grammarAccess.getListDeclarationAccess().getAssignmentOperatorParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_10);
                    ruleAssignmentOperator();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:404:3: ( (lv_list_10_0= ruleWordList ) )
            // InternalTraceryPlusPlus.g:405:4: (lv_list_10_0= ruleWordList )
            {
            // InternalTraceryPlusPlus.g:405:4: (lv_list_10_0= ruleWordList )
            // InternalTraceryPlusPlus.g:406:5: lv_list_10_0= ruleWordList
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
    // InternalTraceryPlusPlus.g:427:1: entryRuleObjectDeclaration returns [EObject current=null] : iv_ruleObjectDeclaration= ruleObjectDeclaration EOF ;
    public final EObject entryRuleObjectDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectDeclaration = null;


        try {
            // InternalTraceryPlusPlus.g:427:58: (iv_ruleObjectDeclaration= ruleObjectDeclaration EOF )
            // InternalTraceryPlusPlus.g:428:2: iv_ruleObjectDeclaration= ruleObjectDeclaration EOF
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
    // InternalTraceryPlusPlus.g:434:1: ruleObjectDeclaration returns [EObject current=null] : (otherlv_0= 'There' (otherlv_1= 'is' | otherlv_2= 'are' ) (otherlv_3= 'a' | otherlv_4= 'an' )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_pronouns_6_0= rulePronouns ) ) (otherlv_7= 'has' | otherlv_8= 'have' ) (otherlv_9= 'attributes' )? ( ruleAssignmentOperator )? ( (lv_attributes_11_0= ruleAttributeList ) ) ) ;
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
            // InternalTraceryPlusPlus.g:440:2: ( (otherlv_0= 'There' (otherlv_1= 'is' | otherlv_2= 'are' ) (otherlv_3= 'a' | otherlv_4= 'an' )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_pronouns_6_0= rulePronouns ) ) (otherlv_7= 'has' | otherlv_8= 'have' ) (otherlv_9= 'attributes' )? ( ruleAssignmentOperator )? ( (lv_attributes_11_0= ruleAttributeList ) ) ) )
            // InternalTraceryPlusPlus.g:441:2: (otherlv_0= 'There' (otherlv_1= 'is' | otherlv_2= 'are' ) (otherlv_3= 'a' | otherlv_4= 'an' )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_pronouns_6_0= rulePronouns ) ) (otherlv_7= 'has' | otherlv_8= 'have' ) (otherlv_9= 'attributes' )? ( ruleAssignmentOperator )? ( (lv_attributes_11_0= ruleAttributeList ) ) )
            {
            // InternalTraceryPlusPlus.g:441:2: (otherlv_0= 'There' (otherlv_1= 'is' | otherlv_2= 'are' ) (otherlv_3= 'a' | otherlv_4= 'an' )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_pronouns_6_0= rulePronouns ) ) (otherlv_7= 'has' | otherlv_8= 'have' ) (otherlv_9= 'attributes' )? ( ruleAssignmentOperator )? ( (lv_attributes_11_0= ruleAttributeList ) ) )
            // InternalTraceryPlusPlus.g:442:3: otherlv_0= 'There' (otherlv_1= 'is' | otherlv_2= 'are' ) (otherlv_3= 'a' | otherlv_4= 'an' )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_pronouns_6_0= rulePronouns ) ) (otherlv_7= 'has' | otherlv_8= 'have' ) (otherlv_9= 'attributes' )? ( ruleAssignmentOperator )? ( (lv_attributes_11_0= ruleAttributeList ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectDeclarationAccess().getThereKeyword_0());
            		
            // InternalTraceryPlusPlus.g:446:3: (otherlv_1= 'is' | otherlv_2= 'are' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            else if ( (LA11_0==20) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalTraceryPlusPlus.g:447:4: otherlv_1= 'is'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getObjectDeclarationAccess().getIsKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:452:4: otherlv_2= 'are'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getObjectDeclarationAccess().getAreKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:457:3: (otherlv_3= 'a' | otherlv_4= 'an' )?
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            else if ( (LA12_0==22) ) {
                alt12=2;
            }
            switch (alt12) {
                case 1 :
                    // InternalTraceryPlusPlus.g:458:4: otherlv_3= 'a'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getObjectDeclarationAccess().getAKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:463:4: otherlv_4= 'an'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getObjectDeclarationAccess().getAnKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:468:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalTraceryPlusPlus.g:469:4: (lv_name_5_0= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:469:4: (lv_name_5_0= RULE_ID )
            // InternalTraceryPlusPlus.g:470:5: lv_name_5_0= RULE_ID
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

            // InternalTraceryPlusPlus.g:486:3: ( (lv_pronouns_6_0= rulePronouns ) )
            // InternalTraceryPlusPlus.g:487:4: (lv_pronouns_6_0= rulePronouns )
            {
            // InternalTraceryPlusPlus.g:487:4: (lv_pronouns_6_0= rulePronouns )
            // InternalTraceryPlusPlus.g:488:5: lv_pronouns_6_0= rulePronouns
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

            // InternalTraceryPlusPlus.g:505:3: (otherlv_7= 'has' | otherlv_8= 'have' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            else if ( (LA13_0==14) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalTraceryPlusPlus.g:506:4: otherlv_7= 'has'
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getObjectDeclarationAccess().getHasKeyword_5_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:511:4: otherlv_8= 'have'
                    {
                    otherlv_8=(Token)match(input,14,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getObjectDeclarationAccess().getHaveKeyword_5_1());
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:516:3: (otherlv_9= 'attributes' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTraceryPlusPlus.g:517:4: otherlv_9= 'attributes'
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getObjectDeclarationAccess().getAttributesKeyword_6());
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:522:3: ( ruleAssignmentOperator )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19||LA15_0==26||(LA15_0>=36 && LA15_0<=39)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTraceryPlusPlus.g:523:4: ruleAssignmentOperator
                    {

                    				newCompositeNode(grammarAccess.getObjectDeclarationAccess().getAssignmentOperatorParserRuleCall_7());
                    			
                    pushFollow(FOLLOW_17);
                    ruleAssignmentOperator();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:531:3: ( (lv_attributes_11_0= ruleAttributeList ) )
            // InternalTraceryPlusPlus.g:532:4: (lv_attributes_11_0= ruleAttributeList )
            {
            // InternalTraceryPlusPlus.g:532:4: (lv_attributes_11_0= ruleAttributeList )
            // InternalTraceryPlusPlus.g:533:5: lv_attributes_11_0= ruleAttributeList
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


    // $ANTLR start "entryRuleSubstoryDeclaration"
    // InternalTraceryPlusPlus.g:554:1: entryRuleSubstoryDeclaration returns [EObject current=null] : iv_ruleSubstoryDeclaration= ruleSubstoryDeclaration EOF ;
    public final EObject entryRuleSubstoryDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstoryDeclaration = null;


        try {
            // InternalTraceryPlusPlus.g:554:60: (iv_ruleSubstoryDeclaration= ruleSubstoryDeclaration EOF )
            // InternalTraceryPlusPlus.g:555:2: iv_ruleSubstoryDeclaration= ruleSubstoryDeclaration EOF
            {
             newCompositeNode(grammarAccess.getSubstoryDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubstoryDeclaration=ruleSubstoryDeclaration();

            state._fsp--;

             current =iv_ruleSubstoryDeclaration; 
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
    // $ANTLR end "entryRuleSubstoryDeclaration"


    // $ANTLR start "ruleSubstoryDeclaration"
    // InternalTraceryPlusPlus.g:561:1: ruleSubstoryDeclaration returns [EObject current=null] : ( (otherlv_0= 'define' )? otherlv_1= 'substory' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleVariableUse ) ) )* otherlv_5= 'end-substory' ) ;
    public final EObject ruleSubstoryDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_story_4_1 = null;

        EObject lv_story_4_2 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:567:2: ( ( (otherlv_0= 'define' )? otherlv_1= 'substory' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleVariableUse ) ) )* otherlv_5= 'end-substory' ) )
            // InternalTraceryPlusPlus.g:568:2: ( (otherlv_0= 'define' )? otherlv_1= 'substory' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleVariableUse ) ) )* otherlv_5= 'end-substory' )
            {
            // InternalTraceryPlusPlus.g:568:2: ( (otherlv_0= 'define' )? otherlv_1= 'substory' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleVariableUse ) ) )* otherlv_5= 'end-substory' )
            // InternalTraceryPlusPlus.g:569:3: (otherlv_0= 'define' )? otherlv_1= 'substory' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleVariableUse ) ) )* otherlv_5= 'end-substory'
            {
            // InternalTraceryPlusPlus.g:569:3: (otherlv_0= 'define' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTraceryPlusPlus.g:570:4: otherlv_0= 'define'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_18); 

                    				newLeafNode(otherlv_0, grammarAccess.getSubstoryDeclarationAccess().getDefineKeyword_0());
                    			

                    }
                    break;

            }

            otherlv_1=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getSubstoryDeclarationAccess().getSubstoryKeyword_1());
            		
            // InternalTraceryPlusPlus.g:579:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalTraceryPlusPlus.g:580:4: (lv_name_2_0= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:580:4: (lv_name_2_0= RULE_ID )
            // InternalTraceryPlusPlus.g:581:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSubstoryDeclarationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubstoryDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getSubstoryDeclarationAccess().getColonKeyword_3());
            		
            // InternalTraceryPlusPlus.g:601:3: ( ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleVariableUse ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_STRING)||LA18_0==29) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:602:4: ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleVariableUse ) )
            	    {
            	    // InternalTraceryPlusPlus.g:602:4: ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleVariableUse ) )
            	    // InternalTraceryPlusPlus.g:603:5: (lv_story_4_1= ruleWord | lv_story_4_2= ruleVariableUse )
            	    {
            	    // InternalTraceryPlusPlus.g:603:5: (lv_story_4_1= ruleWord | lv_story_4_2= ruleVariableUse )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==RULE_STRING) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==RULE_ID||LA17_0==29) ) {
            	        alt17=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalTraceryPlusPlus.g:604:6: lv_story_4_1= ruleWord
            	            {

            	            						newCompositeNode(grammarAccess.getSubstoryDeclarationAccess().getStoryWordParserRuleCall_4_0_0());
            	            					
            	            pushFollow(FOLLOW_20);
            	            lv_story_4_1=ruleWord();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getSubstoryDeclarationRule());
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
            	            // InternalTraceryPlusPlus.g:620:6: lv_story_4_2= ruleVariableUse
            	            {

            	            						newCompositeNode(grammarAccess.getSubstoryDeclarationAccess().getStoryVariableUseParserRuleCall_4_0_1());
            	            					
            	            pushFollow(FOLLOW_20);
            	            lv_story_4_2=ruleVariableUse();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getSubstoryDeclarationRule());
            	            						}
            	            						add(
            	            							current,
            	            							"story",
            	            							lv_story_4_2,
            	            							"tracerypp.TraceryPlusPlus.VariableUse");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_5=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSubstoryDeclarationAccess().getEndSubstoryKeyword_5());
            		

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
    // $ANTLR end "ruleSubstoryDeclaration"


    // $ANTLR start "entryRuleWord"
    // InternalTraceryPlusPlus.g:646:1: entryRuleWord returns [EObject current=null] : iv_ruleWord= ruleWord EOF ;
    public final EObject entryRuleWord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWord = null;


        try {
            // InternalTraceryPlusPlus.g:646:45: (iv_ruleWord= ruleWord EOF )
            // InternalTraceryPlusPlus.g:647:2: iv_ruleWord= ruleWord EOF
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
    // InternalTraceryPlusPlus.g:653:1: ruleWord returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleWord() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:659:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalTraceryPlusPlus.g:660:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalTraceryPlusPlus.g:660:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalTraceryPlusPlus.g:661:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalTraceryPlusPlus.g:661:3: (lv_value_0_0= RULE_STRING )
            // InternalTraceryPlusPlus.g:662:4: lv_value_0_0= RULE_STRING
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


    // $ANTLR start "entryRuleAttribute"
    // InternalTraceryPlusPlus.g:681:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalTraceryPlusPlus.g:681:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalTraceryPlusPlus.g:682:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalTraceryPlusPlus.g:688:1: ruleAttribute returns [EObject current=null] : (this_NameExistingListAttribute_0= ruleNameExistingListAttribute | this_NameValueAttribute_1= ruleNameValueAttribute ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_NameExistingListAttribute_0 = null;

        EObject this_NameValueAttribute_1 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:694:2: ( (this_NameExistingListAttribute_0= ruleNameExistingListAttribute | this_NameValueAttribute_1= ruleNameValueAttribute ) )
            // InternalTraceryPlusPlus.g:695:2: (this_NameExistingListAttribute_0= ruleNameExistingListAttribute | this_NameValueAttribute_1= ruleNameValueAttribute )
            {
            // InternalTraceryPlusPlus.g:695:2: (this_NameExistingListAttribute_0= ruleNameExistingListAttribute | this_NameValueAttribute_1= ruleNameValueAttribute )
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalTraceryPlusPlus.g:696:3: this_NameExistingListAttribute_0= ruleNameExistingListAttribute
                    {

                    			newCompositeNode(grammarAccess.getAttributeAccess().getNameExistingListAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NameExistingListAttribute_0=ruleNameExistingListAttribute();

                    state._fsp--;


                    			current = this_NameExistingListAttribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:705:3: this_NameValueAttribute_1= ruleNameValueAttribute
                    {

                    			newCompositeNode(grammarAccess.getAttributeAccess().getNameValueAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NameValueAttribute_1=ruleNameValueAttribute();

                    state._fsp--;


                    			current = this_NameValueAttribute_1;
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
    // InternalTraceryPlusPlus.g:724:1: ruleNameExistingListAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ruleAssignmentOperator | otherlv_2= 'from' )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleNameExistingListAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:730:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ruleAssignmentOperator | otherlv_2= 'from' )? ( (otherlv_3= RULE_ID ) ) ) )
            // InternalTraceryPlusPlus.g:731:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ruleAssignmentOperator | otherlv_2= 'from' )? ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalTraceryPlusPlus.g:731:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ruleAssignmentOperator | otherlv_2= 'from' )? ( (otherlv_3= RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:732:3: ( (lv_name_0_0= RULE_ID ) ) ( ruleAssignmentOperator | otherlv_2= 'from' )? ( (otherlv_3= RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:732:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTraceryPlusPlus.g:733:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:733:4: (lv_name_0_0= RULE_ID )
            // InternalTraceryPlusPlus.g:734:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_21); 

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

            // InternalTraceryPlusPlus.g:750:3: ( ruleAssignmentOperator | otherlv_2= 'from' )?
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==19||LA20_0==26||(LA20_0>=36 && LA20_0<=39)) ) {
                alt20=1;
            }
            else if ( (LA20_0==28) ) {
                alt20=2;
            }
            switch (alt20) {
                case 1 :
                    // InternalTraceryPlusPlus.g:751:4: ruleAssignmentOperator
                    {

                    				newCompositeNode(grammarAccess.getNameExistingListAttributeAccess().getAssignmentOperatorParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_14);
                    ruleAssignmentOperator();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:759:4: otherlv_2= 'from'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getNameExistingListAttributeAccess().getFromKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:764:3: ( (otherlv_3= RULE_ID ) )
            // InternalTraceryPlusPlus.g:765:4: (otherlv_3= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:765:4: (otherlv_3= RULE_ID )
            // InternalTraceryPlusPlus.g:766:5: otherlv_3= RULE_ID
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
    // InternalTraceryPlusPlus.g:788:1: ruleNameValueAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ruleAssignmentOperator )? ( (lv_value_2_0= ruleWord ) ) ) ;
    public final EObject ruleNameValueAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:794:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ruleAssignmentOperator )? ( (lv_value_2_0= ruleWord ) ) ) )
            // InternalTraceryPlusPlus.g:795:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ruleAssignmentOperator )? ( (lv_value_2_0= ruleWord ) ) )
            {
            // InternalTraceryPlusPlus.g:795:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ruleAssignmentOperator )? ( (lv_value_2_0= ruleWord ) ) )
            // InternalTraceryPlusPlus.g:796:3: ( (lv_name_0_0= RULE_ID ) ) ( ruleAssignmentOperator )? ( (lv_value_2_0= ruleWord ) )
            {
            // InternalTraceryPlusPlus.g:796:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTraceryPlusPlus.g:797:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:797:4: (lv_name_0_0= RULE_ID )
            // InternalTraceryPlusPlus.g:798:5: lv_name_0_0= RULE_ID
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

            // InternalTraceryPlusPlus.g:814:3: ( ruleAssignmentOperator )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==19||LA21_0==26||(LA21_0>=36 && LA21_0<=39)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTraceryPlusPlus.g:815:4: ruleAssignmentOperator
                    {

                    				newCompositeNode(grammarAccess.getNameValueAttributeAccess().getAssignmentOperatorParserRuleCall_1());
                    			
                    pushFollow(FOLLOW_22);
                    ruleAssignmentOperator();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:823:3: ( (lv_value_2_0= ruleWord ) )
            // InternalTraceryPlusPlus.g:824:4: (lv_value_2_0= ruleWord )
            {
            // InternalTraceryPlusPlus.g:824:4: (lv_value_2_0= ruleWord )
            // InternalTraceryPlusPlus.g:825:5: lv_value_2_0= ruleWord
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


    // $ANTLR start "entryRuleListUse"
    // InternalTraceryPlusPlus.g:846:1: entryRuleListUse returns [EObject current=null] : iv_ruleListUse= ruleListUse EOF ;
    public final EObject entryRuleListUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListUse = null;


        try {
            // InternalTraceryPlusPlus.g:846:48: (iv_ruleListUse= ruleListUse EOF )
            // InternalTraceryPlusPlus.g:847:2: iv_ruleListUse= ruleListUse EOF
            {
             newCompositeNode(grammarAccess.getListUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListUse=ruleListUse();

            state._fsp--;

             current =iv_ruleListUse; 
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
    // $ANTLR end "entryRuleListUse"


    // $ANTLR start "ruleListUse"
    // InternalTraceryPlusPlus.g:853:1: ruleListUse returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifierList ) ) ) ;
    public final EObject ruleListUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_modifiers_1_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:859:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifierList ) ) ) )
            // InternalTraceryPlusPlus.g:860:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifierList ) ) )
            {
            // InternalTraceryPlusPlus.g:860:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifierList ) ) )
            // InternalTraceryPlusPlus.g:861:3: ( (otherlv_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifierList ) )
            {
            // InternalTraceryPlusPlus.g:861:3: ( (otherlv_0= RULE_ID ) )
            // InternalTraceryPlusPlus.g:862:4: (otherlv_0= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:862:4: (otherlv_0= RULE_ID )
            // InternalTraceryPlusPlus.g:863:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListUseRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_0, grammarAccess.getListUseAccess().getVariableListDeclarationCrossReference_0_0());
            				

            }


            }

            // InternalTraceryPlusPlus.g:874:3: ( (lv_modifiers_1_0= ruleModifierList ) )
            // InternalTraceryPlusPlus.g:875:4: (lv_modifiers_1_0= ruleModifierList )
            {
            // InternalTraceryPlusPlus.g:875:4: (lv_modifiers_1_0= ruleModifierList )
            // InternalTraceryPlusPlus.g:876:5: lv_modifiers_1_0= ruleModifierList
            {

            					newCompositeNode(grammarAccess.getListUseAccess().getModifiersModifierListParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_modifiers_1_0=ruleModifierList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListUseRule());
            					}
            					set(
            						current,
            						"modifiers",
            						lv_modifiers_1_0,
            						"tracerypp.TraceryPlusPlus.ModifierList");
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
    // $ANTLR end "ruleListUse"


    // $ANTLR start "entryRuleSubstoryUse"
    // InternalTraceryPlusPlus.g:897:1: entryRuleSubstoryUse returns [EObject current=null] : iv_ruleSubstoryUse= ruleSubstoryUse EOF ;
    public final EObject entryRuleSubstoryUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstoryUse = null;


        try {
            // InternalTraceryPlusPlus.g:897:52: (iv_ruleSubstoryUse= ruleSubstoryUse EOF )
            // InternalTraceryPlusPlus.g:898:2: iv_ruleSubstoryUse= ruleSubstoryUse EOF
            {
             newCompositeNode(grammarAccess.getSubstoryUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubstoryUse=ruleSubstoryUse();

            state._fsp--;

             current =iv_ruleSubstoryUse; 
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
    // $ANTLR end "entryRuleSubstoryUse"


    // $ANTLR start "ruleSubstoryUse"
    // InternalTraceryPlusPlus.g:904:1: ruleSubstoryUse returns [EObject current=null] : (otherlv_0= 'use' (otherlv_1= 'substory' | otherlv_2= 'sub' )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleSubstoryUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:910:2: ( (otherlv_0= 'use' (otherlv_1= 'substory' | otherlv_2= 'sub' )? ( (otherlv_3= RULE_ID ) ) ) )
            // InternalTraceryPlusPlus.g:911:2: (otherlv_0= 'use' (otherlv_1= 'substory' | otherlv_2= 'sub' )? ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalTraceryPlusPlus.g:911:2: (otherlv_0= 'use' (otherlv_1= 'substory' | otherlv_2= 'sub' )? ( (otherlv_3= RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:912:3: otherlv_0= 'use' (otherlv_1= 'substory' | otherlv_2= 'sub' )? ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getSubstoryUseAccess().getUseKeyword_0());
            		
            // InternalTraceryPlusPlus.g:916:3: (otherlv_1= 'substory' | otherlv_2= 'sub' )?
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                alt22=1;
            }
            else if ( (LA22_0==30) ) {
                alt22=2;
            }
            switch (alt22) {
                case 1 :
                    // InternalTraceryPlusPlus.g:917:4: otherlv_1= 'substory'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getSubstoryUseAccess().getSubstoryKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:922:4: otherlv_2= 'sub'
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getSubstoryUseAccess().getSubKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:927:3: ( (otherlv_3= RULE_ID ) )
            // InternalTraceryPlusPlus.g:928:4: (otherlv_3= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:928:4: (otherlv_3= RULE_ID )
            // InternalTraceryPlusPlus.g:929:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubstoryUseRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getSubstoryUseAccess().getVariableSubstoryDeclarationCrossReference_2_0());
            				

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
    // $ANTLR end "ruleSubstoryUse"


    // $ANTLR start "entryRuleObjectUse"
    // InternalTraceryPlusPlus.g:944:1: entryRuleObjectUse returns [EObject current=null] : iv_ruleObjectUse= ruleObjectUse EOF ;
    public final EObject entryRuleObjectUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectUse = null;


        try {
            // InternalTraceryPlusPlus.g:944:50: (iv_ruleObjectUse= ruleObjectUse EOF )
            // InternalTraceryPlusPlus.g:945:2: iv_ruleObjectUse= ruleObjectUse EOF
            {
             newCompositeNode(grammarAccess.getObjectUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectUse=ruleObjectUse();

            state._fsp--;

             current =iv_ruleObjectUse; 
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
    // $ANTLR end "entryRuleObjectUse"


    // $ANTLR start "ruleObjectUse"
    // InternalTraceryPlusPlus.g:951:1: ruleObjectUse returns [EObject current=null] : (this_ObjectAttribute_0= ruleObjectAttribute | this_ObjectPronoun_1= ruleObjectPronoun ) ;
    public final EObject ruleObjectUse() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectAttribute_0 = null;

        EObject this_ObjectPronoun_1 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:957:2: ( (this_ObjectAttribute_0= ruleObjectAttribute | this_ObjectPronoun_1= ruleObjectPronoun ) )
            // InternalTraceryPlusPlus.g:958:2: (this_ObjectAttribute_0= ruleObjectAttribute | this_ObjectPronoun_1= ruleObjectPronoun )
            {
            // InternalTraceryPlusPlus.g:958:2: (this_ObjectAttribute_0= ruleObjectAttribute | this_ObjectPronoun_1= ruleObjectPronoun )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==31) ) {
                    alt23=1;
                }
                else if ( ((LA23_1>=46 && LA23_1<=49)) ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalTraceryPlusPlus.g:959:3: this_ObjectAttribute_0= ruleObjectAttribute
                    {

                    			newCompositeNode(grammarAccess.getObjectUseAccess().getObjectAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectAttribute_0=ruleObjectAttribute();

                    state._fsp--;


                    			current = this_ObjectAttribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:968:3: this_ObjectPronoun_1= ruleObjectPronoun
                    {

                    			newCompositeNode(grammarAccess.getObjectUseAccess().getObjectPronounParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectPronoun_1=ruleObjectPronoun();

                    state._fsp--;


                    			current = this_ObjectPronoun_1;
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
    // $ANTLR end "ruleObjectUse"


    // $ANTLR start "entryRuleObjectAttribute"
    // InternalTraceryPlusPlus.g:980:1: entryRuleObjectAttribute returns [EObject current=null] : iv_ruleObjectAttribute= ruleObjectAttribute EOF ;
    public final EObject entryRuleObjectAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectAttribute = null;


        try {
            // InternalTraceryPlusPlus.g:980:56: (iv_ruleObjectAttribute= ruleObjectAttribute EOF )
            // InternalTraceryPlusPlus.g:981:2: iv_ruleObjectAttribute= ruleObjectAttribute EOF
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
    // InternalTraceryPlusPlus.g:987:1: ruleObjectAttribute returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ( (lv_modifiers_3_0= ruleModifierList ) ) ) ;
    public final EObject ruleObjectAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_modifiers_3_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:993:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ( (lv_modifiers_3_0= ruleModifierList ) ) ) )
            // InternalTraceryPlusPlus.g:994:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ( (lv_modifiers_3_0= ruleModifierList ) ) )
            {
            // InternalTraceryPlusPlus.g:994:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ( (lv_modifiers_3_0= ruleModifierList ) ) )
            // InternalTraceryPlusPlus.g:995:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ( (lv_modifiers_3_0= ruleModifierList ) )
            {
            // InternalTraceryPlusPlus.g:995:3: ( (otherlv_0= RULE_ID ) )
            // InternalTraceryPlusPlus.g:996:4: (otherlv_0= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:996:4: (otherlv_0= RULE_ID )
            // InternalTraceryPlusPlus.g:997:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectAttributeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_0, grammarAccess.getObjectAttributeAccess().getObjectObjectDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectAttributeAccess().getFullStopKeyword_1());
            		
            // InternalTraceryPlusPlus.g:1012:3: ( (otherlv_2= RULE_ID ) )
            // InternalTraceryPlusPlus.g:1013:4: (otherlv_2= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:1013:4: (otherlv_2= RULE_ID )
            // InternalTraceryPlusPlus.g:1014:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectAttributeRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_2, grammarAccess.getObjectAttributeAccess().getAttributeAttributeCrossReference_2_0());
            				

            }


            }

            // InternalTraceryPlusPlus.g:1025:3: ( (lv_modifiers_3_0= ruleModifierList ) )
            // InternalTraceryPlusPlus.g:1026:4: (lv_modifiers_3_0= ruleModifierList )
            {
            // InternalTraceryPlusPlus.g:1026:4: (lv_modifiers_3_0= ruleModifierList )
            // InternalTraceryPlusPlus.g:1027:5: lv_modifiers_3_0= ruleModifierList
            {

            					newCompositeNode(grammarAccess.getObjectAttributeAccess().getModifiersModifierListParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_modifiers_3_0=ruleModifierList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectAttributeRule());
            					}
            					set(
            						current,
            						"modifiers",
            						lv_modifiers_3_0,
            						"tracerypp.TraceryPlusPlus.ModifierList");
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
    // $ANTLR end "ruleObjectAttribute"


    // $ANTLR start "entryRuleObjectPronoun"
    // InternalTraceryPlusPlus.g:1048:1: entryRuleObjectPronoun returns [EObject current=null] : iv_ruleObjectPronoun= ruleObjectPronoun EOF ;
    public final EObject entryRuleObjectPronoun() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectPronoun = null;


        try {
            // InternalTraceryPlusPlus.g:1048:54: (iv_ruleObjectPronoun= ruleObjectPronoun EOF )
            // InternalTraceryPlusPlus.g:1049:2: iv_ruleObjectPronoun= ruleObjectPronoun EOF
            {
             newCompositeNode(grammarAccess.getObjectPronounRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectPronoun=ruleObjectPronoun();

            state._fsp--;

             current =iv_ruleObjectPronoun; 
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
    // $ANTLR end "entryRuleObjectPronoun"


    // $ANTLR start "ruleObjectPronoun"
    // InternalTraceryPlusPlus.g:1055:1: ruleObjectPronoun returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_pronoun_1_0= rulePronounIdentifier ) ) ) ;
    public final EObject ruleObjectPronoun() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_pronoun_1_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1061:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_pronoun_1_0= rulePronounIdentifier ) ) ) )
            // InternalTraceryPlusPlus.g:1062:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_pronoun_1_0= rulePronounIdentifier ) ) )
            {
            // InternalTraceryPlusPlus.g:1062:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_pronoun_1_0= rulePronounIdentifier ) ) )
            // InternalTraceryPlusPlus.g:1063:3: ( (otherlv_0= RULE_ID ) ) ( (lv_pronoun_1_0= rulePronounIdentifier ) )
            {
            // InternalTraceryPlusPlus.g:1063:3: ( (otherlv_0= RULE_ID ) )
            // InternalTraceryPlusPlus.g:1064:4: (otherlv_0= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:1064:4: (otherlv_0= RULE_ID )
            // InternalTraceryPlusPlus.g:1065:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectPronounRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_0, grammarAccess.getObjectPronounAccess().getObjectObjectDeclarationCrossReference_0_0());
            				

            }


            }

            // InternalTraceryPlusPlus.g:1076:3: ( (lv_pronoun_1_0= rulePronounIdentifier ) )
            // InternalTraceryPlusPlus.g:1077:4: (lv_pronoun_1_0= rulePronounIdentifier )
            {
            // InternalTraceryPlusPlus.g:1077:4: (lv_pronoun_1_0= rulePronounIdentifier )
            // InternalTraceryPlusPlus.g:1078:5: lv_pronoun_1_0= rulePronounIdentifier
            {

            					newCompositeNode(grammarAccess.getObjectPronounAccess().getPronounPronounIdentifierEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_pronoun_1_0=rulePronounIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectPronounRule());
            					}
            					set(
            						current,
            						"pronoun",
            						lv_pronoun_1_0,
            						"tracerypp.TraceryPlusPlus.PronounIdentifier");
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
    // $ANTLR end "ruleObjectPronoun"


    // $ANTLR start "entryRuleWordList"
    // InternalTraceryPlusPlus.g:1099:1: entryRuleWordList returns [EObject current=null] : iv_ruleWordList= ruleWordList EOF ;
    public final EObject entryRuleWordList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordList = null;


        try {
            // InternalTraceryPlusPlus.g:1099:49: (iv_ruleWordList= ruleWordList EOF )
            // InternalTraceryPlusPlus.g:1100:2: iv_ruleWordList= ruleWordList EOF
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
    // InternalTraceryPlusPlus.g:1106:1: ruleWordList returns [EObject current=null] : ( ( (lv_words_0_0= ruleWord ) ) ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )* ) ;
    public final EObject ruleWordList() throws RecognitionException {
        EObject current = null;

        EObject lv_words_0_0 = null;

        EObject lv_words_2_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1112:2: ( ( ( (lv_words_0_0= ruleWord ) ) ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )* ) )
            // InternalTraceryPlusPlus.g:1113:2: ( ( (lv_words_0_0= ruleWord ) ) ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )* )
            {
            // InternalTraceryPlusPlus.g:1113:2: ( ( (lv_words_0_0= ruleWord ) ) ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )* )
            // InternalTraceryPlusPlus.g:1114:3: ( (lv_words_0_0= ruleWord ) ) ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )*
            {
            // InternalTraceryPlusPlus.g:1114:3: ( (lv_words_0_0= ruleWord ) )
            // InternalTraceryPlusPlus.g:1115:4: (lv_words_0_0= ruleWord )
            {
            // InternalTraceryPlusPlus.g:1115:4: (lv_words_0_0= ruleWord )
            // InternalTraceryPlusPlus.g:1116:5: lv_words_0_0= ruleWord
            {

            					newCompositeNode(grammarAccess.getWordListAccess().getWordsWordParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalTraceryPlusPlus.g:1133:3: ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=41 && LA24_0<=43)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1134:4: ruleSeparatorOr ( (lv_words_2_0= ruleWord ) )
            	    {

            	    				newCompositeNode(grammarAccess.getWordListAccess().getSeparatorOrParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_22);
            	    ruleSeparatorOr();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalTraceryPlusPlus.g:1141:4: ( (lv_words_2_0= ruleWord ) )
            	    // InternalTraceryPlusPlus.g:1142:5: (lv_words_2_0= ruleWord )
            	    {
            	    // InternalTraceryPlusPlus.g:1142:5: (lv_words_2_0= ruleWord )
            	    // InternalTraceryPlusPlus.g:1143:6: lv_words_2_0= ruleWord
            	    {

            	    						newCompositeNode(grammarAccess.getWordListAccess().getWordsWordParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
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
            	    break loop24;
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
    // InternalTraceryPlusPlus.g:1165:1: entryRuleAttributeList returns [EObject current=null] : iv_ruleAttributeList= ruleAttributeList EOF ;
    public final EObject entryRuleAttributeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeList = null;


        try {
            // InternalTraceryPlusPlus.g:1165:54: (iv_ruleAttributeList= ruleAttributeList EOF )
            // InternalTraceryPlusPlus.g:1166:2: iv_ruleAttributeList= ruleAttributeList EOF
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
    // InternalTraceryPlusPlus.g:1172:1: ruleAttributeList returns [EObject current=null] : ( ( (lv_attributes_0_0= ruleAttribute ) ) ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )* ) ;
    public final EObject ruleAttributeList() throws RecognitionException {
        EObject current = null;

        EObject lv_attributes_0_0 = null;

        EObject lv_attributes_2_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1178:2: ( ( ( (lv_attributes_0_0= ruleAttribute ) ) ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )* ) )
            // InternalTraceryPlusPlus.g:1179:2: ( ( (lv_attributes_0_0= ruleAttribute ) ) ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )* )
            {
            // InternalTraceryPlusPlus.g:1179:2: ( ( (lv_attributes_0_0= ruleAttribute ) ) ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )* )
            // InternalTraceryPlusPlus.g:1180:3: ( (lv_attributes_0_0= ruleAttribute ) ) ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )*
            {
            // InternalTraceryPlusPlus.g:1180:3: ( (lv_attributes_0_0= ruleAttribute ) )
            // InternalTraceryPlusPlus.g:1181:4: (lv_attributes_0_0= ruleAttribute )
            {
            // InternalTraceryPlusPlus.g:1181:4: (lv_attributes_0_0= ruleAttribute )
            // InternalTraceryPlusPlus.g:1182:5: lv_attributes_0_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_28);
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

            // InternalTraceryPlusPlus.g:1199:3: ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==41||(LA25_0>=44 && LA25_0<=45)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1200:4: ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) )
            	    {

            	    				newCompositeNode(grammarAccess.getAttributeListAccess().getSeparatorAndParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_17);
            	    ruleSeparatorAnd();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalTraceryPlusPlus.g:1207:4: ( (lv_attributes_2_0= ruleAttribute ) )
            	    // InternalTraceryPlusPlus.g:1208:5: (lv_attributes_2_0= ruleAttribute )
            	    {
            	    // InternalTraceryPlusPlus.g:1208:5: (lv_attributes_2_0= ruleAttribute )
            	    // InternalTraceryPlusPlus.g:1209:6: lv_attributes_2_0= ruleAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
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
            	    break loop25;
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
    // InternalTraceryPlusPlus.g:1231:1: entryRulePronouns returns [EObject current=null] : iv_rulePronouns= rulePronouns EOF ;
    public final EObject entryRulePronouns() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePronouns = null;


        try {
            // InternalTraceryPlusPlus.g:1231:49: (iv_rulePronouns= rulePronouns EOF )
            // InternalTraceryPlusPlus.g:1232:2: iv_rulePronouns= rulePronouns EOF
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
    // InternalTraceryPlusPlus.g:1238:1: rulePronouns returns [EObject current=null] : ( ( (lv_value_0_1= 'He' | lv_value_0_2= 'She' | lv_value_0_3= 'It' | lv_value_0_4= 'They' ) ) ) ;
    public final EObject rulePronouns() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1244:2: ( ( ( (lv_value_0_1= 'He' | lv_value_0_2= 'She' | lv_value_0_3= 'It' | lv_value_0_4= 'They' ) ) ) )
            // InternalTraceryPlusPlus.g:1245:2: ( ( (lv_value_0_1= 'He' | lv_value_0_2= 'She' | lv_value_0_3= 'It' | lv_value_0_4= 'They' ) ) )
            {
            // InternalTraceryPlusPlus.g:1245:2: ( ( (lv_value_0_1= 'He' | lv_value_0_2= 'She' | lv_value_0_3= 'It' | lv_value_0_4= 'They' ) ) )
            // InternalTraceryPlusPlus.g:1246:3: ( (lv_value_0_1= 'He' | lv_value_0_2= 'She' | lv_value_0_3= 'It' | lv_value_0_4= 'They' ) )
            {
            // InternalTraceryPlusPlus.g:1246:3: ( (lv_value_0_1= 'He' | lv_value_0_2= 'She' | lv_value_0_3= 'It' | lv_value_0_4= 'They' ) )
            // InternalTraceryPlusPlus.g:1247:4: (lv_value_0_1= 'He' | lv_value_0_2= 'She' | lv_value_0_3= 'It' | lv_value_0_4= 'They' )
            {
            // InternalTraceryPlusPlus.g:1247:4: (lv_value_0_1= 'He' | lv_value_0_2= 'She' | lv_value_0_3= 'It' | lv_value_0_4= 'They' )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt26=1;
                }
                break;
            case 33:
                {
                alt26=2;
                }
                break;
            case 34:
                {
                alt26=3;
                }
                break;
            case 35:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1248:5: lv_value_0_1= 'He'
                    {
                    lv_value_0_1=(Token)match(input,32,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getPronounsAccess().getValueHeKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPronounsRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1259:5: lv_value_0_2= 'She'
                    {
                    lv_value_0_2=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getPronounsAccess().getValueSheKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPronounsRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1270:5: lv_value_0_3= 'It'
                    {
                    lv_value_0_3=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_value_0_3, grammarAccess.getPronounsAccess().getValueItKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPronounsRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalTraceryPlusPlus.g:1281:5: lv_value_0_4= 'They'
                    {
                    lv_value_0_4=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_value_0_4, grammarAccess.getPronounsAccess().getValueTheyKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPronounsRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_4, null);
                    				

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
    // $ANTLR end "rulePronouns"


    // $ANTLR start "entryRuleModifierList"
    // InternalTraceryPlusPlus.g:1297:1: entryRuleModifierList returns [EObject current=null] : iv_ruleModifierList= ruleModifierList EOF ;
    public final EObject entryRuleModifierList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifierList = null;


        try {
            // InternalTraceryPlusPlus.g:1297:53: (iv_ruleModifierList= ruleModifierList EOF )
            // InternalTraceryPlusPlus.g:1298:2: iv_ruleModifierList= ruleModifierList EOF
            {
             newCompositeNode(grammarAccess.getModifierListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModifierList=ruleModifierList();

            state._fsp--;

             current =iv_ruleModifierList; 
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
    // $ANTLR end "entryRuleModifierList"


    // $ANTLR start "ruleModifierList"
    // InternalTraceryPlusPlus.g:1304:1: ruleModifierList returns [EObject current=null] : ( () ( (lv_modifiers_1_0= ruleModifier ) )* ) ;
    public final EObject ruleModifierList() throws RecognitionException {
        EObject current = null;

        Enumerator lv_modifiers_1_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1310:2: ( ( () ( (lv_modifiers_1_0= ruleModifier ) )* ) )
            // InternalTraceryPlusPlus.g:1311:2: ( () ( (lv_modifiers_1_0= ruleModifier ) )* )
            {
            // InternalTraceryPlusPlus.g:1311:2: ( () ( (lv_modifiers_1_0= ruleModifier ) )* )
            // InternalTraceryPlusPlus.g:1312:3: () ( (lv_modifiers_1_0= ruleModifier ) )*
            {
            // InternalTraceryPlusPlus.g:1312:3: ()
            // InternalTraceryPlusPlus.g:1313:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModifierListAccess().getModifierListAction_0(),
            					current);
            			

            }

            // InternalTraceryPlusPlus.g:1319:3: ( (lv_modifiers_1_0= ruleModifier ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=50 && LA27_0<=54)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1320:4: (lv_modifiers_1_0= ruleModifier )
            	    {
            	    // InternalTraceryPlusPlus.g:1320:4: (lv_modifiers_1_0= ruleModifier )
            	    // InternalTraceryPlusPlus.g:1321:5: lv_modifiers_1_0= ruleModifier
            	    {

            	    					newCompositeNode(grammarAccess.getModifierListAccess().getModifiersModifierEnumRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_modifiers_1_0=ruleModifier();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModifierListRule());
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
            	    break loop27;
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
    // $ANTLR end "ruleModifierList"


    // $ANTLR start "entryRuleAssignmentOperator"
    // InternalTraceryPlusPlus.g:1342:1: entryRuleAssignmentOperator returns [String current=null] : iv_ruleAssignmentOperator= ruleAssignmentOperator EOF ;
    public final String entryRuleAssignmentOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAssignmentOperator = null;


        try {
            // InternalTraceryPlusPlus.g:1342:58: (iv_ruleAssignmentOperator= ruleAssignmentOperator EOF )
            // InternalTraceryPlusPlus.g:1343:2: iv_ruleAssignmentOperator= ruleAssignmentOperator EOF
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
    // InternalTraceryPlusPlus.g:1349:1: ruleAssignmentOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= ':' | kw= '-' | kw= '-->' | ( (kw= 'is' )? kw= 'equal' kw= 'to' ) | kw= 'is' ) ;
    public final AntlrDatatypeRuleToken ruleAssignmentOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1355:2: ( (kw= '=' | kw= ':' | kw= '-' | kw= '-->' | ( (kw= 'is' )? kw= 'equal' kw= 'to' ) | kw= 'is' ) )
            // InternalTraceryPlusPlus.g:1356:2: (kw= '=' | kw= ':' | kw= '-' | kw= '-->' | ( (kw= 'is' )? kw= 'equal' kw= 'to' ) | kw= 'is' )
            {
            // InternalTraceryPlusPlus.g:1356:2: (kw= '=' | kw= ':' | kw= '-' | kw= '-->' | ( (kw= 'is' )? kw= 'equal' kw= 'to' ) | kw= 'is' )
            int alt29=6;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt29=1;
                }
                break;
            case 26:
                {
                alt29=2;
                }
                break;
            case 37:
                {
                alt29=3;
                }
                break;
            case 38:
                {
                alt29=4;
                }
                break;
            case 19:
                {
                int LA29_5 = input.LA(2);

                if ( (LA29_5==39) ) {
                    alt29=5;
                }
                else if ( (LA29_5==EOF||(LA29_5>=RULE_ID && LA29_5<=RULE_STRING)||LA29_5==29) ) {
                    alt29=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 5, input);

                    throw nvae;
                }
                }
                break;
            case 39:
                {
                alt29=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1357:3: kw= '='
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1363:3: kw= ':'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getColonKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1369:3: kw= '-'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getHyphenMinusKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalTraceryPlusPlus.g:1375:3: kw= '-->'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalTraceryPlusPlus.g:1381:3: ( (kw= 'is' )? kw= 'equal' kw= 'to' )
                    {
                    // InternalTraceryPlusPlus.g:1381:3: ( (kw= 'is' )? kw= 'equal' kw= 'to' )
                    // InternalTraceryPlusPlus.g:1382:4: (kw= 'is' )? kw= 'equal' kw= 'to'
                    {
                    // InternalTraceryPlusPlus.g:1382:4: (kw= 'is' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==19) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalTraceryPlusPlus.g:1383:5: kw= 'is'
                            {
                            kw=(Token)match(input,19,FOLLOW_30); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getIsKeyword_4_0());
                            				

                            }
                            break;

                    }

                    kw=(Token)match(input,39,FOLLOW_31); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getEqualKeyword_4_1());
                    			
                    kw=(Token)match(input,40,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getToKeyword_4_2());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalTraceryPlusPlus.g:1401:3: kw= 'is'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getIsKeyword_5());
                    		

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
    // InternalTraceryPlusPlus.g:1410:1: entryRuleSeparatorOr returns [String current=null] : iv_ruleSeparatorOr= ruleSeparatorOr EOF ;
    public final String entryRuleSeparatorOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSeparatorOr = null;


        try {
            // InternalTraceryPlusPlus.g:1410:51: (iv_ruleSeparatorOr= ruleSeparatorOr EOF )
            // InternalTraceryPlusPlus.g:1411:2: iv_ruleSeparatorOr= ruleSeparatorOr EOF
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
    // InternalTraceryPlusPlus.g:1417:1: ruleSeparatorOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ',' | kw= 'or' | kw= '||' ) ;
    public final AntlrDatatypeRuleToken ruleSeparatorOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1423:2: ( (kw= ',' | kw= 'or' | kw= '||' ) )
            // InternalTraceryPlusPlus.g:1424:2: (kw= ',' | kw= 'or' | kw= '||' )
            {
            // InternalTraceryPlusPlus.g:1424:2: (kw= ',' | kw= 'or' | kw= '||' )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt30=1;
                }
                break;
            case 42:
                {
                alt30=2;
                }
                break;
            case 43:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1425:3: kw= ','
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSeparatorOrAccess().getCommaKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1431:3: kw= 'or'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSeparatorOrAccess().getOrKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1437:3: kw= '||'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

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
    // InternalTraceryPlusPlus.g:1446:1: entryRuleSeparatorAnd returns [String current=null] : iv_ruleSeparatorAnd= ruleSeparatorAnd EOF ;
    public final String entryRuleSeparatorAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSeparatorAnd = null;


        try {
            // InternalTraceryPlusPlus.g:1446:52: (iv_ruleSeparatorAnd= ruleSeparatorAnd EOF )
            // InternalTraceryPlusPlus.g:1447:2: iv_ruleSeparatorAnd= ruleSeparatorAnd EOF
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
    // InternalTraceryPlusPlus.g:1453:1: ruleSeparatorAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ',' | kw= 'and' | kw= '&&' ) ;
    public final AntlrDatatypeRuleToken ruleSeparatorAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1459:2: ( (kw= ',' | kw= 'and' | kw= '&&' ) )
            // InternalTraceryPlusPlus.g:1460:2: (kw= ',' | kw= 'and' | kw= '&&' )
            {
            // InternalTraceryPlusPlus.g:1460:2: (kw= ',' | kw= 'and' | kw= '&&' )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt31=1;
                }
                break;
            case 44:
                {
                alt31=2;
                }
                break;
            case 45:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1461:3: kw= ','
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSeparatorAndAccess().getCommaKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1467:3: kw= 'and'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSeparatorAndAccess().getAndKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1473:3: kw= '&&'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

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


    // $ANTLR start "rulePronounIdentifier"
    // InternalTraceryPlusPlus.g:1482:1: rulePronounIdentifier returns [Enumerator current=null] : ( (enumLiteral_0= ':they' ) | (enumLiteral_1= ':them' ) | (enumLiteral_2= ':their' ) | (enumLiteral_3= ':theirs' ) ) ;
    public final Enumerator rulePronounIdentifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1488:2: ( ( (enumLiteral_0= ':they' ) | (enumLiteral_1= ':them' ) | (enumLiteral_2= ':their' ) | (enumLiteral_3= ':theirs' ) ) )
            // InternalTraceryPlusPlus.g:1489:2: ( (enumLiteral_0= ':they' ) | (enumLiteral_1= ':them' ) | (enumLiteral_2= ':their' ) | (enumLiteral_3= ':theirs' ) )
            {
            // InternalTraceryPlusPlus.g:1489:2: ( (enumLiteral_0= ':they' ) | (enumLiteral_1= ':them' ) | (enumLiteral_2= ':their' ) | (enumLiteral_3= ':theirs' ) )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt32=1;
                }
                break;
            case 47:
                {
                alt32=2;
                }
                break;
            case 48:
                {
                alt32=3;
                }
                break;
            case 49:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1490:3: (enumLiteral_0= ':they' )
                    {
                    // InternalTraceryPlusPlus.g:1490:3: (enumLiteral_0= ':they' )
                    // InternalTraceryPlusPlus.g:1491:4: enumLiteral_0= ':they'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getPronounIdentifierAccess().getTheyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPronounIdentifierAccess().getTheyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1498:3: (enumLiteral_1= ':them' )
                    {
                    // InternalTraceryPlusPlus.g:1498:3: (enumLiteral_1= ':them' )
                    // InternalTraceryPlusPlus.g:1499:4: enumLiteral_1= ':them'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getPronounIdentifierAccess().getThemEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPronounIdentifierAccess().getThemEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1506:3: (enumLiteral_2= ':their' )
                    {
                    // InternalTraceryPlusPlus.g:1506:3: (enumLiteral_2= ':their' )
                    // InternalTraceryPlusPlus.g:1507:4: enumLiteral_2= ':their'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getPronounIdentifierAccess().getTheirEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPronounIdentifierAccess().getTheirEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTraceryPlusPlus.g:1514:3: (enumLiteral_3= ':theirs' )
                    {
                    // InternalTraceryPlusPlus.g:1514:3: (enumLiteral_3= ':theirs' )
                    // InternalTraceryPlusPlus.g:1515:4: enumLiteral_3= ':theirs'
                    {
                    enumLiteral_3=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getPronounIdentifierAccess().getTheirsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPronounIdentifierAccess().getTheirsEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "rulePronounIdentifier"


    // $ANTLR start "ruleModifier"
    // InternalTraceryPlusPlus.g:1525:1: ruleModifier returns [Enumerator current=null] : ( (enumLiteral_0= '-capitalize' ) | (enumLiteral_1= '-CAPITALIZE' ) | (enumLiteral_2= '-s' ) | (enumLiteral_3= '-a' ) | (enumLiteral_4= '-ed' ) ) ;
    public final Enumerator ruleModifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1531:2: ( ( (enumLiteral_0= '-capitalize' ) | (enumLiteral_1= '-CAPITALIZE' ) | (enumLiteral_2= '-s' ) | (enumLiteral_3= '-a' ) | (enumLiteral_4= '-ed' ) ) )
            // InternalTraceryPlusPlus.g:1532:2: ( (enumLiteral_0= '-capitalize' ) | (enumLiteral_1= '-CAPITALIZE' ) | (enumLiteral_2= '-s' ) | (enumLiteral_3= '-a' ) | (enumLiteral_4= '-ed' ) )
            {
            // InternalTraceryPlusPlus.g:1532:2: ( (enumLiteral_0= '-capitalize' ) | (enumLiteral_1= '-CAPITALIZE' ) | (enumLiteral_2= '-s' ) | (enumLiteral_3= '-a' ) | (enumLiteral_4= '-ed' ) )
            int alt33=5;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt33=1;
                }
                break;
            case 51:
                {
                alt33=2;
                }
                break;
            case 52:
                {
                alt33=3;
                }
                break;
            case 53:
                {
                alt33=4;
                }
                break;
            case 54:
                {
                alt33=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1533:3: (enumLiteral_0= '-capitalize' )
                    {
                    // InternalTraceryPlusPlus.g:1533:3: (enumLiteral_0= '-capitalize' )
                    // InternalTraceryPlusPlus.g:1534:4: enumLiteral_0= '-capitalize'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getModifierAccess().getCapitalizeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getModifierAccess().getCapitalizeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1541:3: (enumLiteral_1= '-CAPITALIZE' )
                    {
                    // InternalTraceryPlusPlus.g:1541:3: (enumLiteral_1= '-CAPITALIZE' )
                    // InternalTraceryPlusPlus.g:1542:4: enumLiteral_1= '-CAPITALIZE'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getModifierAccess().getFullCapitalizeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getModifierAccess().getFullCapitalizeEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1549:3: (enumLiteral_2= '-s' )
                    {
                    // InternalTraceryPlusPlus.g:1549:3: (enumLiteral_2= '-s' )
                    // InternalTraceryPlusPlus.g:1550:4: enumLiteral_2= '-s'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getModifierAccess().getPluralEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getModifierAccess().getPluralEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTraceryPlusPlus.g:1557:3: (enumLiteral_3= '-a' )
                    {
                    // InternalTraceryPlusPlus.g:1557:3: (enumLiteral_3= '-a' )
                    // InternalTraceryPlusPlus.g:1558:4: enumLiteral_3= '-a'
                    {
                    enumLiteral_3=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getModifierAccess().getArticleEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getModifierAccess().getArticleEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalTraceryPlusPlus.g:1565:3: (enumLiteral_4= '-ed' )
                    {
                    // InternalTraceryPlusPlus.g:1565:3: (enumLiteral_4= '-ed' )
                    // InternalTraceryPlusPlus.g:1566:4: enumLiteral_4= '-ed'
                    {
                    enumLiteral_4=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getModifierAccess().getPastTenseEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getModifierAccess().getPastTenseEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleModifier"

    // Delegated rules


    protected DFA19 dfa19 = new DFA19(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\7\4\1\50\2\uffff\1\4";
    static final String dfa_3s = "\1\4\1\47\4\5\1\47\1\50\2\uffff\1\5";
    static final String dfa_4s = "\10\uffff\1\1\1\2\1\uffff";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\10\1\11\15\uffff\1\6\6\uffff\1\3\1\uffff\1\10\7\uffff\1\2\1\4\1\5\1\7",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11\41\uffff\1\7",
            "\1\12",
            "",
            "",
            "\1\10\1\11"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "695:2: (this_NameExistingListAttribute_0= ruleNameExistingListAttribute | this_NameValueAttribute_1= ruleNameValueAttribute )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000003040812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000F024080032L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000020000032L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000026000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000F004080020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000600010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000F00000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000F004880010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000028000030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000F014080010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x007C000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000042000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0003C00000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000E0000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000320000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x007C000000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});

}