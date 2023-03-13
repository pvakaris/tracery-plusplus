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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'The'", "'story'", "'can'", "'have'", "'values'", "'be'", "'has'", "'There'", "'is'", "'are'", "'a'", "'an'", "'attributes'", "'substory'", "':'", "'end-substory'", "'from'", "'.'", "'He'", "'She'", "'It'", "'They'", "'they'", "'them'", "'their'", "'theirs'", "'.capitalize'", "'.CAPITALIZE'", "'.s'", "'.a'", "'.ed'", "'='", "'-'", "'-->'", "'equal'", "'to'", "','", "'or'", "'||'", "'and'", "'&&'"
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

                if ( (LA1_0==RULE_ID||LA1_0==18||LA1_0==24) ) {
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
    // InternalTraceryPlusPlus.g:153:1: ruleVariable returns [EObject current=null] : (this_ListDeclaration_0= ruleListDeclaration | this_ObjectDeclaration_1= ruleObjectDeclaration | this_SubstoryDeclaration_2= ruleSubstoryDeclaration ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_ListDeclaration_0 = null;

        EObject this_ObjectDeclaration_1 = null;

        EObject this_SubstoryDeclaration_2 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:159:2: ( (this_ListDeclaration_0= ruleListDeclaration | this_ObjectDeclaration_1= ruleObjectDeclaration | this_SubstoryDeclaration_2= ruleSubstoryDeclaration ) )
            // InternalTraceryPlusPlus.g:160:2: (this_ListDeclaration_0= ruleListDeclaration | this_ObjectDeclaration_1= ruleObjectDeclaration | this_SubstoryDeclaration_2= ruleSubstoryDeclaration )
            {
            // InternalTraceryPlusPlus.g:160:2: (this_ListDeclaration_0= ruleListDeclaration | this_ObjectDeclaration_1= ruleObjectDeclaration | this_SubstoryDeclaration_2= ruleSubstoryDeclaration )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            default:
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
                case 3 :
                    // InternalTraceryPlusPlus.g:179:3: this_SubstoryDeclaration_2= ruleSubstoryDeclaration
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
    // InternalTraceryPlusPlus.g:191:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalTraceryPlusPlus.g:191:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalTraceryPlusPlus.g:192:2: iv_ruleVariableUse= ruleVariableUse EOF
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
    // InternalTraceryPlusPlus.g:198:1: ruleVariableUse returns [EObject current=null] : (this_ListUse_0= ruleListUse | this_ObjectUse_1= ruleObjectUse | this_SubstoryUse_2= ruleSubstoryUse ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject this_ListUse_0 = null;

        EObject this_ObjectUse_1 = null;

        EObject this_SubstoryUse_2 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:204:2: ( (this_ListUse_0= ruleListUse | this_ObjectUse_1= ruleObjectUse | this_SubstoryUse_2= ruleSubstoryUse ) )
            // InternalTraceryPlusPlus.g:205:2: (this_ListUse_0= ruleListUse | this_ObjectUse_1= ruleObjectUse | this_SubstoryUse_2= ruleSubstoryUse )
            {
            // InternalTraceryPlusPlus.g:205:2: (this_ListUse_0= ruleListUse | this_ObjectUse_1= ruleObjectUse | this_SubstoryUse_2= ruleSubstoryUse )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||(LA3_1>=RULE_ID && LA3_1<=RULE_STRING)||LA3_1==24||LA3_1==26||(LA3_1>=37 && LA3_1<=41)) ) {
                    alt3=1;
                }
                else if ( (LA3_1==28) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==24) ) {
                alt3=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTraceryPlusPlus.g:206:3: this_ListUse_0= ruleListUse
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
                    // InternalTraceryPlusPlus.g:215:3: this_ObjectUse_1= ruleObjectUse
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
                    // InternalTraceryPlusPlus.g:224:3: this_SubstoryUse_2= ruleSubstoryUse
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
    // InternalTraceryPlusPlus.g:236:1: entryRuleStory returns [EObject current=null] : iv_ruleStory= ruleStory EOF ;
    public final EObject entryRuleStory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStory = null;


        try {
            // InternalTraceryPlusPlus.g:236:46: (iv_ruleStory= ruleStory EOF )
            // InternalTraceryPlusPlus.g:237:2: iv_ruleStory= ruleStory EOF
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
    // InternalTraceryPlusPlus.g:243:1: ruleStory returns [EObject current=null] : ( () otherlv_1= 'The' otherlv_2= 'story' ( ruleAssignmentOperator )? ( ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleVariableUse ) ) )* ) ;
    public final EObject ruleStory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_story_4_1 = null;

        EObject lv_story_4_2 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:249:2: ( ( () otherlv_1= 'The' otherlv_2= 'story' ( ruleAssignmentOperator )? ( ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleVariableUse ) ) )* ) )
            // InternalTraceryPlusPlus.g:250:2: ( () otherlv_1= 'The' otherlv_2= 'story' ( ruleAssignmentOperator )? ( ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleVariableUse ) ) )* )
            {
            // InternalTraceryPlusPlus.g:250:2: ( () otherlv_1= 'The' otherlv_2= 'story' ( ruleAssignmentOperator )? ( ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleVariableUse ) ) )* )
            // InternalTraceryPlusPlus.g:251:3: () otherlv_1= 'The' otherlv_2= 'story' ( ruleAssignmentOperator )? ( ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleVariableUse ) ) )*
            {
            // InternalTraceryPlusPlus.g:251:3: ()
            // InternalTraceryPlusPlus.g:252:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStoryAccess().getStoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getStoryAccess().getTheKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getStoryAccess().getStoryKeyword_2());
            		
            // InternalTraceryPlusPlus.g:266:3: ( ruleAssignmentOperator )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25||(LA4_0>=42 && LA4_0<=45)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTraceryPlusPlus.g:267:4: ruleAssignmentOperator
                    {

                    				newCompositeNode(grammarAccess.getStoryAccess().getAssignmentOperatorParserRuleCall_3());
                    			
                    pushFollow(FOLLOW_6);
                    ruleAssignmentOperator();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:275:3: ( ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleVariableUse ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_STRING)||LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:276:4: ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleVariableUse ) )
            	    {
            	    // InternalTraceryPlusPlus.g:276:4: ( (lv_story_4_1= ruleWord | lv_story_4_2= ruleVariableUse ) )
            	    // InternalTraceryPlusPlus.g:277:5: (lv_story_4_1= ruleWord | lv_story_4_2= ruleVariableUse )
            	    {
            	    // InternalTraceryPlusPlus.g:277:5: (lv_story_4_1= ruleWord | lv_story_4_2= ruleVariableUse )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==RULE_STRING) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==RULE_ID||LA5_0==24) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalTraceryPlusPlus.g:278:6: lv_story_4_1= ruleWord
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
            	            // InternalTraceryPlusPlus.g:294:6: lv_story_4_2= ruleVariableUse
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
    // $ANTLR end "ruleStory"


    // $ANTLR start "entryRuleListDeclaration"
    // InternalTraceryPlusPlus.g:316:1: entryRuleListDeclaration returns [EObject current=null] : iv_ruleListDeclaration= ruleListDeclaration EOF ;
    public final EObject entryRuleListDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListDeclaration = null;


        try {
            // InternalTraceryPlusPlus.g:316:56: (iv_ruleListDeclaration= ruleListDeclaration EOF )
            // InternalTraceryPlusPlus.g:317:2: iv_ruleListDeclaration= ruleListDeclaration EOF
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
    // InternalTraceryPlusPlus.g:323:1: ruleListDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' ) | (otherlv_4= 'can' otherlv_5= 'be' ) | ( (otherlv_6= 'has' | otherlv_7= 'have' ) otherlv_8= 'values' ) ) ( ruleAssignmentOperator )? ( (lv_list_10_0= ruleWordList ) ) ) ;
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
            // InternalTraceryPlusPlus.g:329:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' ) | (otherlv_4= 'can' otherlv_5= 'be' ) | ( (otherlv_6= 'has' | otherlv_7= 'have' ) otherlv_8= 'values' ) ) ( ruleAssignmentOperator )? ( (lv_list_10_0= ruleWordList ) ) ) )
            // InternalTraceryPlusPlus.g:330:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' ) | (otherlv_4= 'can' otherlv_5= 'be' ) | ( (otherlv_6= 'has' | otherlv_7= 'have' ) otherlv_8= 'values' ) ) ( ruleAssignmentOperator )? ( (lv_list_10_0= ruleWordList ) ) )
            {
            // InternalTraceryPlusPlus.g:330:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' ) | (otherlv_4= 'can' otherlv_5= 'be' ) | ( (otherlv_6= 'has' | otherlv_7= 'have' ) otherlv_8= 'values' ) ) ( ruleAssignmentOperator )? ( (lv_list_10_0= ruleWordList ) ) )
            // InternalTraceryPlusPlus.g:331:3: ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' ) | (otherlv_4= 'can' otherlv_5= 'be' ) | ( (otherlv_6= 'has' | otherlv_7= 'have' ) otherlv_8= 'values' ) ) ( ruleAssignmentOperator )? ( (lv_list_10_0= ruleWordList ) )
            {
            // InternalTraceryPlusPlus.g:331:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTraceryPlusPlus.g:332:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:332:4: (lv_name_0_0= RULE_ID )
            // InternalTraceryPlusPlus.g:333:5: lv_name_0_0= RULE_ID
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

            // InternalTraceryPlusPlus.g:349:3: ( (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' ) | (otherlv_4= 'can' otherlv_5= 'be' ) | ( (otherlv_6= 'has' | otherlv_7= 'have' ) otherlv_8= 'values' ) )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==14) ) {
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
            else if ( (LA8_0==14||LA8_0==17) ) {
                alt8=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTraceryPlusPlus.g:350:4: (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' )
                    {
                    // InternalTraceryPlusPlus.g:350:4: (otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values' )
                    // InternalTraceryPlusPlus.g:351:5: otherlv_1= 'can' otherlv_2= 'have' otherlv_3= 'values'
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
                    // InternalTraceryPlusPlus.g:365:4: (otherlv_4= 'can' otherlv_5= 'be' )
                    {
                    // InternalTraceryPlusPlus.g:365:4: (otherlv_4= 'can' otherlv_5= 'be' )
                    // InternalTraceryPlusPlus.g:366:5: otherlv_4= 'can' otherlv_5= 'be'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_11); 

                    					newLeafNode(otherlv_4, grammarAccess.getListDeclarationAccess().getCanKeyword_1_1_0());
                    				
                    otherlv_5=(Token)match(input,16,FOLLOW_10); 

                    					newLeafNode(otherlv_5, grammarAccess.getListDeclarationAccess().getBeKeyword_1_1_1());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:376:4: ( (otherlv_6= 'has' | otherlv_7= 'have' ) otherlv_8= 'values' )
                    {
                    // InternalTraceryPlusPlus.g:376:4: ( (otherlv_6= 'has' | otherlv_7= 'have' ) otherlv_8= 'values' )
                    // InternalTraceryPlusPlus.g:377:5: (otherlv_6= 'has' | otherlv_7= 'have' ) otherlv_8= 'values'
                    {
                    // InternalTraceryPlusPlus.g:377:5: (otherlv_6= 'has' | otherlv_7= 'have' )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==17) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==14) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalTraceryPlusPlus.g:378:6: otherlv_6= 'has'
                            {
                            otherlv_6=(Token)match(input,17,FOLLOW_9); 

                            						newLeafNode(otherlv_6, grammarAccess.getListDeclarationAccess().getHasKeyword_1_2_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalTraceryPlusPlus.g:383:6: otherlv_7= 'have'
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

            // InternalTraceryPlusPlus.g:394:3: ( ruleAssignmentOperator )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25||(LA9_0>=42 && LA9_0<=45)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTraceryPlusPlus.g:395:4: ruleAssignmentOperator
                    {

                    				newCompositeNode(grammarAccess.getListDeclarationAccess().getAssignmentOperatorParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_10);
                    ruleAssignmentOperator();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:403:3: ( (lv_list_10_0= ruleWordList ) )
            // InternalTraceryPlusPlus.g:404:4: (lv_list_10_0= ruleWordList )
            {
            // InternalTraceryPlusPlus.g:404:4: (lv_list_10_0= ruleWordList )
            // InternalTraceryPlusPlus.g:405:5: lv_list_10_0= ruleWordList
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
    // InternalTraceryPlusPlus.g:426:1: entryRuleObjectDeclaration returns [EObject current=null] : iv_ruleObjectDeclaration= ruleObjectDeclaration EOF ;
    public final EObject entryRuleObjectDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectDeclaration = null;


        try {
            // InternalTraceryPlusPlus.g:426:58: (iv_ruleObjectDeclaration= ruleObjectDeclaration EOF )
            // InternalTraceryPlusPlus.g:427:2: iv_ruleObjectDeclaration= ruleObjectDeclaration EOF
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
    // InternalTraceryPlusPlus.g:433:1: ruleObjectDeclaration returns [EObject current=null] : (otherlv_0= 'There' (otherlv_1= 'is' | otherlv_2= 'are' ) (otherlv_3= 'a' | otherlv_4= 'an' )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_pronouns_6_0= rulePronouns ) ) (otherlv_7= 'has' | otherlv_8= 'have' ) (otherlv_9= 'attributes' )? ( ruleAssignmentOperator )? ( (lv_attributes_11_0= ruleAttributeList ) ) ) ;
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
            // InternalTraceryPlusPlus.g:439:2: ( (otherlv_0= 'There' (otherlv_1= 'is' | otherlv_2= 'are' ) (otherlv_3= 'a' | otherlv_4= 'an' )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_pronouns_6_0= rulePronouns ) ) (otherlv_7= 'has' | otherlv_8= 'have' ) (otherlv_9= 'attributes' )? ( ruleAssignmentOperator )? ( (lv_attributes_11_0= ruleAttributeList ) ) ) )
            // InternalTraceryPlusPlus.g:440:2: (otherlv_0= 'There' (otherlv_1= 'is' | otherlv_2= 'are' ) (otherlv_3= 'a' | otherlv_4= 'an' )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_pronouns_6_0= rulePronouns ) ) (otherlv_7= 'has' | otherlv_8= 'have' ) (otherlv_9= 'attributes' )? ( ruleAssignmentOperator )? ( (lv_attributes_11_0= ruleAttributeList ) ) )
            {
            // InternalTraceryPlusPlus.g:440:2: (otherlv_0= 'There' (otherlv_1= 'is' | otherlv_2= 'are' ) (otherlv_3= 'a' | otherlv_4= 'an' )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_pronouns_6_0= rulePronouns ) ) (otherlv_7= 'has' | otherlv_8= 'have' ) (otherlv_9= 'attributes' )? ( ruleAssignmentOperator )? ( (lv_attributes_11_0= ruleAttributeList ) ) )
            // InternalTraceryPlusPlus.g:441:3: otherlv_0= 'There' (otherlv_1= 'is' | otherlv_2= 'are' ) (otherlv_3= 'a' | otherlv_4= 'an' )? ( (lv_name_5_0= RULE_ID ) ) ( (lv_pronouns_6_0= rulePronouns ) ) (otherlv_7= 'has' | otherlv_8= 'have' ) (otherlv_9= 'attributes' )? ( ruleAssignmentOperator )? ( (lv_attributes_11_0= ruleAttributeList ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getObjectDeclarationAccess().getThereKeyword_0());
            		
            // InternalTraceryPlusPlus.g:445:3: (otherlv_1= 'is' | otherlv_2= 'are' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            else if ( (LA10_0==20) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalTraceryPlusPlus.g:446:4: otherlv_1= 'is'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getObjectDeclarationAccess().getIsKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:451:4: otherlv_2= 'are'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getObjectDeclarationAccess().getAreKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:456:3: (otherlv_3= 'a' | otherlv_4= 'an' )?
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            else if ( (LA11_0==22) ) {
                alt11=2;
            }
            switch (alt11) {
                case 1 :
                    // InternalTraceryPlusPlus.g:457:4: otherlv_3= 'a'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getObjectDeclarationAccess().getAKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:462:4: otherlv_4= 'an'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getObjectDeclarationAccess().getAnKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:467:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalTraceryPlusPlus.g:468:4: (lv_name_5_0= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:468:4: (lv_name_5_0= RULE_ID )
            // InternalTraceryPlusPlus.g:469:5: lv_name_5_0= RULE_ID
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

            // InternalTraceryPlusPlus.g:485:3: ( (lv_pronouns_6_0= rulePronouns ) )
            // InternalTraceryPlusPlus.g:486:4: (lv_pronouns_6_0= rulePronouns )
            {
            // InternalTraceryPlusPlus.g:486:4: (lv_pronouns_6_0= rulePronouns )
            // InternalTraceryPlusPlus.g:487:5: lv_pronouns_6_0= rulePronouns
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

            // InternalTraceryPlusPlus.g:504:3: (otherlv_7= 'has' | otherlv_8= 'have' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            else if ( (LA12_0==14) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalTraceryPlusPlus.g:505:4: otherlv_7= 'has'
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getObjectDeclarationAccess().getHasKeyword_5_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:510:4: otherlv_8= 'have'
                    {
                    otherlv_8=(Token)match(input,14,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getObjectDeclarationAccess().getHaveKeyword_5_1());
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:515:3: (otherlv_9= 'attributes' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTraceryPlusPlus.g:516:4: otherlv_9= 'attributes'
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getObjectDeclarationAccess().getAttributesKeyword_6());
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:521:3: ( ruleAssignmentOperator )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25||(LA14_0>=42 && LA14_0<=45)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTraceryPlusPlus.g:522:4: ruleAssignmentOperator
                    {

                    				newCompositeNode(grammarAccess.getObjectDeclarationAccess().getAssignmentOperatorParserRuleCall_7());
                    			
                    pushFollow(FOLLOW_17);
                    ruleAssignmentOperator();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:530:3: ( (lv_attributes_11_0= ruleAttributeList ) )
            // InternalTraceryPlusPlus.g:531:4: (lv_attributes_11_0= ruleAttributeList )
            {
            // InternalTraceryPlusPlus.g:531:4: (lv_attributes_11_0= ruleAttributeList )
            // InternalTraceryPlusPlus.g:532:5: lv_attributes_11_0= ruleAttributeList
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
    // InternalTraceryPlusPlus.g:553:1: entryRuleSubstoryDeclaration returns [EObject current=null] : iv_ruleSubstoryDeclaration= ruleSubstoryDeclaration EOF ;
    public final EObject entryRuleSubstoryDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstoryDeclaration = null;


        try {
            // InternalTraceryPlusPlus.g:553:60: (iv_ruleSubstoryDeclaration= ruleSubstoryDeclaration EOF )
            // InternalTraceryPlusPlus.g:554:2: iv_ruleSubstoryDeclaration= ruleSubstoryDeclaration EOF
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
    // InternalTraceryPlusPlus.g:560:1: ruleSubstoryDeclaration returns [EObject current=null] : (otherlv_0= 'substory' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_story_3_1= ruleWord | lv_story_3_2= ruleVariableUse ) ) )* otherlv_4= 'end-substory' ) ;
    public final EObject ruleSubstoryDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_story_3_1 = null;

        EObject lv_story_3_2 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:566:2: ( (otherlv_0= 'substory' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_story_3_1= ruleWord | lv_story_3_2= ruleVariableUse ) ) )* otherlv_4= 'end-substory' ) )
            // InternalTraceryPlusPlus.g:567:2: (otherlv_0= 'substory' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_story_3_1= ruleWord | lv_story_3_2= ruleVariableUse ) ) )* otherlv_4= 'end-substory' )
            {
            // InternalTraceryPlusPlus.g:567:2: (otherlv_0= 'substory' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_story_3_1= ruleWord | lv_story_3_2= ruleVariableUse ) ) )* otherlv_4= 'end-substory' )
            // InternalTraceryPlusPlus.g:568:3: otherlv_0= 'substory' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_story_3_1= ruleWord | lv_story_3_2= ruleVariableUse ) ) )* otherlv_4= 'end-substory'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getSubstoryDeclarationAccess().getSubstoryKeyword_0());
            		
            // InternalTraceryPlusPlus.g:572:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTraceryPlusPlus.g:573:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:573:4: (lv_name_1_0= RULE_ID )
            // InternalTraceryPlusPlus.g:574:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSubstoryDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubstoryDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getSubstoryDeclarationAccess().getColonKeyword_2());
            		
            // InternalTraceryPlusPlus.g:594:3: ( ( (lv_story_3_1= ruleWord | lv_story_3_2= ruleVariableUse ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING)||LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:595:4: ( (lv_story_3_1= ruleWord | lv_story_3_2= ruleVariableUse ) )
            	    {
            	    // InternalTraceryPlusPlus.g:595:4: ( (lv_story_3_1= ruleWord | lv_story_3_2= ruleVariableUse ) )
            	    // InternalTraceryPlusPlus.g:596:5: (lv_story_3_1= ruleWord | lv_story_3_2= ruleVariableUse )
            	    {
            	    // InternalTraceryPlusPlus.g:596:5: (lv_story_3_1= ruleWord | lv_story_3_2= ruleVariableUse )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==RULE_STRING) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==RULE_ID||LA15_0==24) ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalTraceryPlusPlus.g:597:6: lv_story_3_1= ruleWord
            	            {

            	            						newCompositeNode(grammarAccess.getSubstoryDeclarationAccess().getStoryWordParserRuleCall_3_0_0());
            	            					
            	            pushFollow(FOLLOW_19);
            	            lv_story_3_1=ruleWord();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getSubstoryDeclarationRule());
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
            	            // InternalTraceryPlusPlus.g:613:6: lv_story_3_2= ruleVariableUse
            	            {

            	            						newCompositeNode(grammarAccess.getSubstoryDeclarationAccess().getStoryVariableUseParserRuleCall_3_0_1());
            	            					
            	            pushFollow(FOLLOW_19);
            	            lv_story_3_2=ruleVariableUse();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getSubstoryDeclarationRule());
            	            						}
            	            						add(
            	            							current,
            	            							"story",
            	            							lv_story_3_2,
            	            							"tracerypp.TraceryPlusPlus.VariableUse");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_4=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSubstoryDeclarationAccess().getEndSubstoryKeyword_4());
            		

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
    // InternalTraceryPlusPlus.g:639:1: entryRuleWord returns [EObject current=null] : iv_ruleWord= ruleWord EOF ;
    public final EObject entryRuleWord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWord = null;


        try {
            // InternalTraceryPlusPlus.g:639:45: (iv_ruleWord= ruleWord EOF )
            // InternalTraceryPlusPlus.g:640:2: iv_ruleWord= ruleWord EOF
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
    // InternalTraceryPlusPlus.g:646:1: ruleWord returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleWord() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:652:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalTraceryPlusPlus.g:653:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalTraceryPlusPlus.g:653:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalTraceryPlusPlus.g:654:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalTraceryPlusPlus.g:654:3: (lv_value_0_0= RULE_STRING )
            // InternalTraceryPlusPlus.g:655:4: lv_value_0_0= RULE_STRING
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


    // $ANTLR start "entryRuleListUse"
    // InternalTraceryPlusPlus.g:674:1: entryRuleListUse returns [EObject current=null] : iv_ruleListUse= ruleListUse EOF ;
    public final EObject entryRuleListUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListUse = null;


        try {
            // InternalTraceryPlusPlus.g:674:48: (iv_ruleListUse= ruleListUse EOF )
            // InternalTraceryPlusPlus.g:675:2: iv_ruleListUse= ruleListUse EOF
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
    // InternalTraceryPlusPlus.g:681:1: ruleListUse returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )* ) ;
    public final EObject ruleListUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_modifiers_1_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:687:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )* ) )
            // InternalTraceryPlusPlus.g:688:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )* )
            {
            // InternalTraceryPlusPlus.g:688:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )* )
            // InternalTraceryPlusPlus.g:689:3: ( (otherlv_0= RULE_ID ) ) ( (lv_modifiers_1_0= ruleModifier ) )*
            {
            // InternalTraceryPlusPlus.g:689:3: ( (otherlv_0= RULE_ID ) )
            // InternalTraceryPlusPlus.g:690:4: (otherlv_0= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:690:4: (otherlv_0= RULE_ID )
            // InternalTraceryPlusPlus.g:691:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListUseRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_0, grammarAccess.getListUseAccess().getVariableListDeclarationCrossReference_0_0());
            				

            }


            }

            // InternalTraceryPlusPlus.g:702:3: ( (lv_modifiers_1_0= ruleModifier ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=37 && LA17_0<=41)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:703:4: (lv_modifiers_1_0= ruleModifier )
            	    {
            	    // InternalTraceryPlusPlus.g:703:4: (lv_modifiers_1_0= ruleModifier )
            	    // InternalTraceryPlusPlus.g:704:5: lv_modifiers_1_0= ruleModifier
            	    {

            	    					newCompositeNode(grammarAccess.getListUseAccess().getModifiersModifierParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_modifiers_1_0=ruleModifier();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListUseRule());
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
            	    break loop17;
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
    // $ANTLR end "ruleListUse"


    // $ANTLR start "entryRuleSubstoryUse"
    // InternalTraceryPlusPlus.g:725:1: entryRuleSubstoryUse returns [EObject current=null] : iv_ruleSubstoryUse= ruleSubstoryUse EOF ;
    public final EObject entryRuleSubstoryUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstoryUse = null;


        try {
            // InternalTraceryPlusPlus.g:725:52: (iv_ruleSubstoryUse= ruleSubstoryUse EOF )
            // InternalTraceryPlusPlus.g:726:2: iv_ruleSubstoryUse= ruleSubstoryUse EOF
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
    // InternalTraceryPlusPlus.g:732:1: ruleSubstoryUse returns [EObject current=null] : (otherlv_0= 'substory' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSubstoryUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:738:2: ( (otherlv_0= 'substory' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalTraceryPlusPlus.g:739:2: (otherlv_0= 'substory' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalTraceryPlusPlus.g:739:2: (otherlv_0= 'substory' ( (otherlv_1= RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:740:3: otherlv_0= 'substory' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getSubstoryUseAccess().getSubstoryKeyword_0());
            		
            // InternalTraceryPlusPlus.g:744:3: ( (otherlv_1= RULE_ID ) )
            // InternalTraceryPlusPlus.g:745:4: (otherlv_1= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:745:4: (otherlv_1= RULE_ID )
            // InternalTraceryPlusPlus.g:746:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubstoryUseRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getSubstoryUseAccess().getVariableSubstoryDeclarationCrossReference_1_0());
            				

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


    // $ANTLR start "entryRuleAttribute"
    // InternalTraceryPlusPlus.g:761:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalTraceryPlusPlus.g:761:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalTraceryPlusPlus.g:762:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalTraceryPlusPlus.g:768:1: ruleAttribute returns [EObject current=null] : (this_NameExistingListAttribute_0= ruleNameExistingListAttribute | this_NameValueAttribute_1= ruleNameValueAttribute ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_NameExistingListAttribute_0 = null;

        EObject this_NameValueAttribute_1 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:774:2: ( (this_NameExistingListAttribute_0= ruleNameExistingListAttribute | this_NameValueAttribute_1= ruleNameValueAttribute ) )
            // InternalTraceryPlusPlus.g:775:2: (this_NameExistingListAttribute_0= ruleNameExistingListAttribute | this_NameValueAttribute_1= ruleNameValueAttribute )
            {
            // InternalTraceryPlusPlus.g:775:2: (this_NameExistingListAttribute_0= ruleNameExistingListAttribute | this_NameValueAttribute_1= ruleNameValueAttribute )
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalTraceryPlusPlus.g:776:3: this_NameExistingListAttribute_0= ruleNameExistingListAttribute
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
                    // InternalTraceryPlusPlus.g:785:3: this_NameValueAttribute_1= ruleNameValueAttribute
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
    // InternalTraceryPlusPlus.g:797:1: entryRuleNameExistingListAttribute returns [EObject current=null] : iv_ruleNameExistingListAttribute= ruleNameExistingListAttribute EOF ;
    public final EObject entryRuleNameExistingListAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExistingListAttribute = null;


        try {
            // InternalTraceryPlusPlus.g:797:66: (iv_ruleNameExistingListAttribute= ruleNameExistingListAttribute EOF )
            // InternalTraceryPlusPlus.g:798:2: iv_ruleNameExistingListAttribute= ruleNameExistingListAttribute EOF
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
    // InternalTraceryPlusPlus.g:804:1: ruleNameExistingListAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ruleAssignmentOperator | otherlv_2= 'from' )? ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleNameExistingListAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:810:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ruleAssignmentOperator | otherlv_2= 'from' )? ( (otherlv_3= RULE_ID ) ) ) )
            // InternalTraceryPlusPlus.g:811:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ruleAssignmentOperator | otherlv_2= 'from' )? ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalTraceryPlusPlus.g:811:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ruleAssignmentOperator | otherlv_2= 'from' )? ( (otherlv_3= RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:812:3: ( (lv_name_0_0= RULE_ID ) ) ( ruleAssignmentOperator | otherlv_2= 'from' )? ( (otherlv_3= RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:812:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTraceryPlusPlus.g:813:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:813:4: (lv_name_0_0= RULE_ID )
            // InternalTraceryPlusPlus.g:814:5: lv_name_0_0= RULE_ID
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

            // InternalTraceryPlusPlus.g:830:3: ( ruleAssignmentOperator | otherlv_2= 'from' )?
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25||(LA19_0>=42 && LA19_0<=45)) ) {
                alt19=1;
            }
            else if ( (LA19_0==27) ) {
                alt19=2;
            }
            switch (alt19) {
                case 1 :
                    // InternalTraceryPlusPlus.g:831:4: ruleAssignmentOperator
                    {

                    				newCompositeNode(grammarAccess.getNameExistingListAttributeAccess().getAssignmentOperatorParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_14);
                    ruleAssignmentOperator();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:839:4: otherlv_2= 'from'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getNameExistingListAttributeAccess().getFromKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:844:3: ( (otherlv_3= RULE_ID ) )
            // InternalTraceryPlusPlus.g:845:4: (otherlv_3= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:845:4: (otherlv_3= RULE_ID )
            // InternalTraceryPlusPlus.g:846:5: otherlv_3= RULE_ID
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
    // InternalTraceryPlusPlus.g:861:1: entryRuleNameValueAttribute returns [EObject current=null] : iv_ruleNameValueAttribute= ruleNameValueAttribute EOF ;
    public final EObject entryRuleNameValueAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameValueAttribute = null;


        try {
            // InternalTraceryPlusPlus.g:861:59: (iv_ruleNameValueAttribute= ruleNameValueAttribute EOF )
            // InternalTraceryPlusPlus.g:862:2: iv_ruleNameValueAttribute= ruleNameValueAttribute EOF
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
    // InternalTraceryPlusPlus.g:868:1: ruleNameValueAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ruleAssignmentOperator )? ( (lv_value_2_0= ruleWord ) ) ) ;
    public final EObject ruleNameValueAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:874:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ruleAssignmentOperator )? ( (lv_value_2_0= ruleWord ) ) ) )
            // InternalTraceryPlusPlus.g:875:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ruleAssignmentOperator )? ( (lv_value_2_0= ruleWord ) ) )
            {
            // InternalTraceryPlusPlus.g:875:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ruleAssignmentOperator )? ( (lv_value_2_0= ruleWord ) ) )
            // InternalTraceryPlusPlus.g:876:3: ( (lv_name_0_0= RULE_ID ) ) ( ruleAssignmentOperator )? ( (lv_value_2_0= ruleWord ) )
            {
            // InternalTraceryPlusPlus.g:876:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTraceryPlusPlus.g:877:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:877:4: (lv_name_0_0= RULE_ID )
            // InternalTraceryPlusPlus.g:878:5: lv_name_0_0= RULE_ID
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

            // InternalTraceryPlusPlus.g:894:3: ( ruleAssignmentOperator )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25||(LA20_0>=42 && LA20_0<=45)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTraceryPlusPlus.g:895:4: ruleAssignmentOperator
                    {

                    				newCompositeNode(grammarAccess.getNameValueAttributeAccess().getAssignmentOperatorParserRuleCall_1());
                    			
                    pushFollow(FOLLOW_22);
                    ruleAssignmentOperator();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalTraceryPlusPlus.g:903:3: ( (lv_value_2_0= ruleWord ) )
            // InternalTraceryPlusPlus.g:904:4: (lv_value_2_0= ruleWord )
            {
            // InternalTraceryPlusPlus.g:904:4: (lv_value_2_0= ruleWord )
            // InternalTraceryPlusPlus.g:905:5: lv_value_2_0= ruleWord
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


    // $ANTLR start "entryRuleObjectUse"
    // InternalTraceryPlusPlus.g:926:1: entryRuleObjectUse returns [EObject current=null] : iv_ruleObjectUse= ruleObjectUse EOF ;
    public final EObject entryRuleObjectUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectUse = null;


        try {
            // InternalTraceryPlusPlus.g:926:50: (iv_ruleObjectUse= ruleObjectUse EOF )
            // InternalTraceryPlusPlus.g:927:2: iv_ruleObjectUse= ruleObjectUse EOF
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
    // InternalTraceryPlusPlus.g:933:1: ruleObjectUse returns [EObject current=null] : (this_ObjectAttribute_0= ruleObjectAttribute | this_ObjectPronoun_1= ruleObjectPronoun ) ;
    public final EObject ruleObjectUse() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectAttribute_0 = null;

        EObject this_ObjectPronoun_1 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:939:2: ( (this_ObjectAttribute_0= ruleObjectAttribute | this_ObjectPronoun_1= ruleObjectPronoun ) )
            // InternalTraceryPlusPlus.g:940:2: (this_ObjectAttribute_0= ruleObjectAttribute | this_ObjectPronoun_1= ruleObjectPronoun )
            {
            // InternalTraceryPlusPlus.g:940:2: (this_ObjectAttribute_0= ruleObjectAttribute | this_ObjectPronoun_1= ruleObjectPronoun )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==28) ) {
                    int LA21_2 = input.LA(3);

                    if ( ((LA21_2>=33 && LA21_2<=36)) ) {
                        alt21=2;
                    }
                    else if ( (LA21_2==RULE_ID) ) {
                        alt21=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalTraceryPlusPlus.g:941:3: this_ObjectAttribute_0= ruleObjectAttribute
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
                    // InternalTraceryPlusPlus.g:950:3: this_ObjectPronoun_1= ruleObjectPronoun
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
    // InternalTraceryPlusPlus.g:962:1: entryRuleObjectAttribute returns [EObject current=null] : iv_ruleObjectAttribute= ruleObjectAttribute EOF ;
    public final EObject entryRuleObjectAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectAttribute = null;


        try {
            // InternalTraceryPlusPlus.g:962:56: (iv_ruleObjectAttribute= ruleObjectAttribute EOF )
            // InternalTraceryPlusPlus.g:963:2: iv_ruleObjectAttribute= ruleObjectAttribute EOF
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
    // InternalTraceryPlusPlus.g:969:1: ruleObjectAttribute returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ( (lv_modifiers_3_0= ruleModifier ) )* ) ;
    public final EObject ruleObjectAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_modifiers_3_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:975:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ( (lv_modifiers_3_0= ruleModifier ) )* ) )
            // InternalTraceryPlusPlus.g:976:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ( (lv_modifiers_3_0= ruleModifier ) )* )
            {
            // InternalTraceryPlusPlus.g:976:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ( (lv_modifiers_3_0= ruleModifier ) )* )
            // InternalTraceryPlusPlus.g:977:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ( (lv_modifiers_3_0= ruleModifier ) )*
            {
            // InternalTraceryPlusPlus.g:977:3: ( (otherlv_0= RULE_ID ) )
            // InternalTraceryPlusPlus.g:978:4: (otherlv_0= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:978:4: (otherlv_0= RULE_ID )
            // InternalTraceryPlusPlus.g:979:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectAttributeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_0, grammarAccess.getObjectAttributeAccess().getObjectObjectDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectAttributeAccess().getFullStopKeyword_1());
            		
            // InternalTraceryPlusPlus.g:994:3: ( (otherlv_2= RULE_ID ) )
            // InternalTraceryPlusPlus.g:995:4: (otherlv_2= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:995:4: (otherlv_2= RULE_ID )
            // InternalTraceryPlusPlus.g:996:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectAttributeRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_2, grammarAccess.getObjectAttributeAccess().getAttributeAttributeCrossReference_2_0());
            				

            }


            }

            // InternalTraceryPlusPlus.g:1007:3: ( (lv_modifiers_3_0= ruleModifier ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=37 && LA22_0<=41)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1008:4: (lv_modifiers_3_0= ruleModifier )
            	    {
            	    // InternalTraceryPlusPlus.g:1008:4: (lv_modifiers_3_0= ruleModifier )
            	    // InternalTraceryPlusPlus.g:1009:5: lv_modifiers_3_0= ruleModifier
            	    {

            	    					newCompositeNode(grammarAccess.getObjectAttributeAccess().getModifiersModifierParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
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
            	    break loop22;
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


    // $ANTLR start "entryRuleObjectPronoun"
    // InternalTraceryPlusPlus.g:1030:1: entryRuleObjectPronoun returns [EObject current=null] : iv_ruleObjectPronoun= ruleObjectPronoun EOF ;
    public final EObject entryRuleObjectPronoun() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectPronoun = null;


        try {
            // InternalTraceryPlusPlus.g:1030:54: (iv_ruleObjectPronoun= ruleObjectPronoun EOF )
            // InternalTraceryPlusPlus.g:1031:2: iv_ruleObjectPronoun= ruleObjectPronoun EOF
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
    // InternalTraceryPlusPlus.g:1037:1: ruleObjectPronoun returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_pronoun_2_0= rulePronounIdentifier ) ) ) ;
    public final EObject ruleObjectPronoun() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_pronoun_2_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1043:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_pronoun_2_0= rulePronounIdentifier ) ) ) )
            // InternalTraceryPlusPlus.g:1044:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_pronoun_2_0= rulePronounIdentifier ) ) )
            {
            // InternalTraceryPlusPlus.g:1044:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_pronoun_2_0= rulePronounIdentifier ) ) )
            // InternalTraceryPlusPlus.g:1045:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_pronoun_2_0= rulePronounIdentifier ) )
            {
            // InternalTraceryPlusPlus.g:1045:3: ( (otherlv_0= RULE_ID ) )
            // InternalTraceryPlusPlus.g:1046:4: (otherlv_0= RULE_ID )
            {
            // InternalTraceryPlusPlus.g:1046:4: (otherlv_0= RULE_ID )
            // InternalTraceryPlusPlus.g:1047:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectPronounRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_0, grammarAccess.getObjectPronounAccess().getObjectObjectDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectPronounAccess().getFullStopKeyword_1());
            		
            // InternalTraceryPlusPlus.g:1062:3: ( (lv_pronoun_2_0= rulePronounIdentifier ) )
            // InternalTraceryPlusPlus.g:1063:4: (lv_pronoun_2_0= rulePronounIdentifier )
            {
            // InternalTraceryPlusPlus.g:1063:4: (lv_pronoun_2_0= rulePronounIdentifier )
            // InternalTraceryPlusPlus.g:1064:5: lv_pronoun_2_0= rulePronounIdentifier
            {

            					newCompositeNode(grammarAccess.getObjectPronounAccess().getPronounPronounIdentifierParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_pronoun_2_0=rulePronounIdentifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectPronounRule());
            					}
            					set(
            						current,
            						"pronoun",
            						lv_pronoun_2_0,
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
    // InternalTraceryPlusPlus.g:1085:1: entryRuleWordList returns [EObject current=null] : iv_ruleWordList= ruleWordList EOF ;
    public final EObject entryRuleWordList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWordList = null;


        try {
            // InternalTraceryPlusPlus.g:1085:49: (iv_ruleWordList= ruleWordList EOF )
            // InternalTraceryPlusPlus.g:1086:2: iv_ruleWordList= ruleWordList EOF
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
    // InternalTraceryPlusPlus.g:1092:1: ruleWordList returns [EObject current=null] : ( ( (lv_words_0_0= ruleWord ) ) ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )* ) ;
    public final EObject ruleWordList() throws RecognitionException {
        EObject current = null;

        EObject lv_words_0_0 = null;

        EObject lv_words_2_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1098:2: ( ( ( (lv_words_0_0= ruleWord ) ) ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )* ) )
            // InternalTraceryPlusPlus.g:1099:2: ( ( (lv_words_0_0= ruleWord ) ) ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )* )
            {
            // InternalTraceryPlusPlus.g:1099:2: ( ( (lv_words_0_0= ruleWord ) ) ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )* )
            // InternalTraceryPlusPlus.g:1100:3: ( (lv_words_0_0= ruleWord ) ) ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )*
            {
            // InternalTraceryPlusPlus.g:1100:3: ( (lv_words_0_0= ruleWord ) )
            // InternalTraceryPlusPlus.g:1101:4: (lv_words_0_0= ruleWord )
            {
            // InternalTraceryPlusPlus.g:1101:4: (lv_words_0_0= ruleWord )
            // InternalTraceryPlusPlus.g:1102:5: lv_words_0_0= ruleWord
            {

            					newCompositeNode(grammarAccess.getWordListAccess().getWordsWordParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalTraceryPlusPlus.g:1119:3: ( ruleSeparatorOr ( (lv_words_2_0= ruleWord ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=47 && LA23_0<=49)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1120:4: ruleSeparatorOr ( (lv_words_2_0= ruleWord ) )
            	    {

            	    				newCompositeNode(grammarAccess.getWordListAccess().getSeparatorOrParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_22);
            	    ruleSeparatorOr();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalTraceryPlusPlus.g:1127:4: ( (lv_words_2_0= ruleWord ) )
            	    // InternalTraceryPlusPlus.g:1128:5: (lv_words_2_0= ruleWord )
            	    {
            	    // InternalTraceryPlusPlus.g:1128:5: (lv_words_2_0= ruleWord )
            	    // InternalTraceryPlusPlus.g:1129:6: lv_words_2_0= ruleWord
            	    {

            	    						newCompositeNode(grammarAccess.getWordListAccess().getWordsWordParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
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
            	    break loop23;
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
    // InternalTraceryPlusPlus.g:1151:1: entryRuleAttributeList returns [EObject current=null] : iv_ruleAttributeList= ruleAttributeList EOF ;
    public final EObject entryRuleAttributeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeList = null;


        try {
            // InternalTraceryPlusPlus.g:1151:54: (iv_ruleAttributeList= ruleAttributeList EOF )
            // InternalTraceryPlusPlus.g:1152:2: iv_ruleAttributeList= ruleAttributeList EOF
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
    // InternalTraceryPlusPlus.g:1158:1: ruleAttributeList returns [EObject current=null] : ( ( (lv_attributes_0_0= ruleAttribute ) ) ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )* ) ;
    public final EObject ruleAttributeList() throws RecognitionException {
        EObject current = null;

        EObject lv_attributes_0_0 = null;

        EObject lv_attributes_2_0 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1164:2: ( ( ( (lv_attributes_0_0= ruleAttribute ) ) ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )* ) )
            // InternalTraceryPlusPlus.g:1165:2: ( ( (lv_attributes_0_0= ruleAttribute ) ) ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )* )
            {
            // InternalTraceryPlusPlus.g:1165:2: ( ( (lv_attributes_0_0= ruleAttribute ) ) ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )* )
            // InternalTraceryPlusPlus.g:1166:3: ( (lv_attributes_0_0= ruleAttribute ) ) ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )*
            {
            // InternalTraceryPlusPlus.g:1166:3: ( (lv_attributes_0_0= ruleAttribute ) )
            // InternalTraceryPlusPlus.g:1167:4: (lv_attributes_0_0= ruleAttribute )
            {
            // InternalTraceryPlusPlus.g:1167:4: (lv_attributes_0_0= ruleAttribute )
            // InternalTraceryPlusPlus.g:1168:5: lv_attributes_0_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
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

            // InternalTraceryPlusPlus.g:1185:3: ( ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==47||(LA24_0>=50 && LA24_0<=51)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1186:4: ruleSeparatorAnd ( (lv_attributes_2_0= ruleAttribute ) )
            	    {

            	    				newCompositeNode(grammarAccess.getAttributeListAccess().getSeparatorAndParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_17);
            	    ruleSeparatorAnd();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalTraceryPlusPlus.g:1193:4: ( (lv_attributes_2_0= ruleAttribute ) )
            	    // InternalTraceryPlusPlus.g:1194:5: (lv_attributes_2_0= ruleAttribute )
            	    {
            	    // InternalTraceryPlusPlus.g:1194:5: (lv_attributes_2_0= ruleAttribute )
            	    // InternalTraceryPlusPlus.g:1195:6: lv_attributes_2_0= ruleAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
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
    // $ANTLR end "ruleAttributeList"


    // $ANTLR start "entryRulePronouns"
    // InternalTraceryPlusPlus.g:1217:1: entryRulePronouns returns [EObject current=null] : iv_rulePronouns= rulePronouns EOF ;
    public final EObject entryRulePronouns() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePronouns = null;


        try {
            // InternalTraceryPlusPlus.g:1217:49: (iv_rulePronouns= rulePronouns EOF )
            // InternalTraceryPlusPlus.g:1218:2: iv_rulePronouns= rulePronouns EOF
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
    // InternalTraceryPlusPlus.g:1224:1: rulePronouns returns [EObject current=null] : ( ( (lv_value_0_0= 'He' ) ) | ( (lv_value_1_0= 'She' ) ) | ( (lv_value_2_0= 'It' ) ) | ( (lv_value_3_0= 'They' ) ) ) ;
    public final EObject rulePronouns() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1230:2: ( ( ( (lv_value_0_0= 'He' ) ) | ( (lv_value_1_0= 'She' ) ) | ( (lv_value_2_0= 'It' ) ) | ( (lv_value_3_0= 'They' ) ) ) )
            // InternalTraceryPlusPlus.g:1231:2: ( ( (lv_value_0_0= 'He' ) ) | ( (lv_value_1_0= 'She' ) ) | ( (lv_value_2_0= 'It' ) ) | ( (lv_value_3_0= 'They' ) ) )
            {
            // InternalTraceryPlusPlus.g:1231:2: ( ( (lv_value_0_0= 'He' ) ) | ( (lv_value_1_0= 'She' ) ) | ( (lv_value_2_0= 'It' ) ) | ( (lv_value_3_0= 'They' ) ) )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt25=1;
                }
                break;
            case 30:
                {
                alt25=2;
                }
                break;
            case 31:
                {
                alt25=3;
                }
                break;
            case 32:
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
                    // InternalTraceryPlusPlus.g:1232:3: ( (lv_value_0_0= 'He' ) )
                    {
                    // InternalTraceryPlusPlus.g:1232:3: ( (lv_value_0_0= 'He' ) )
                    // InternalTraceryPlusPlus.g:1233:4: (lv_value_0_0= 'He' )
                    {
                    // InternalTraceryPlusPlus.g:1233:4: (lv_value_0_0= 'He' )
                    // InternalTraceryPlusPlus.g:1234:5: lv_value_0_0= 'He'
                    {
                    lv_value_0_0=(Token)match(input,29,FOLLOW_2); 

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
                    // InternalTraceryPlusPlus.g:1247:3: ( (lv_value_1_0= 'She' ) )
                    {
                    // InternalTraceryPlusPlus.g:1247:3: ( (lv_value_1_0= 'She' ) )
                    // InternalTraceryPlusPlus.g:1248:4: (lv_value_1_0= 'She' )
                    {
                    // InternalTraceryPlusPlus.g:1248:4: (lv_value_1_0= 'She' )
                    // InternalTraceryPlusPlus.g:1249:5: lv_value_1_0= 'She'
                    {
                    lv_value_1_0=(Token)match(input,30,FOLLOW_2); 

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
                    // InternalTraceryPlusPlus.g:1262:3: ( (lv_value_2_0= 'It' ) )
                    {
                    // InternalTraceryPlusPlus.g:1262:3: ( (lv_value_2_0= 'It' ) )
                    // InternalTraceryPlusPlus.g:1263:4: (lv_value_2_0= 'It' )
                    {
                    // InternalTraceryPlusPlus.g:1263:4: (lv_value_2_0= 'It' )
                    // InternalTraceryPlusPlus.g:1264:5: lv_value_2_0= 'It'
                    {
                    lv_value_2_0=(Token)match(input,31,FOLLOW_2); 

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
                    // InternalTraceryPlusPlus.g:1277:3: ( (lv_value_3_0= 'They' ) )
                    {
                    // InternalTraceryPlusPlus.g:1277:3: ( (lv_value_3_0= 'They' ) )
                    // InternalTraceryPlusPlus.g:1278:4: (lv_value_3_0= 'They' )
                    {
                    // InternalTraceryPlusPlus.g:1278:4: (lv_value_3_0= 'They' )
                    // InternalTraceryPlusPlus.g:1279:5: lv_value_3_0= 'They'
                    {
                    lv_value_3_0=(Token)match(input,32,FOLLOW_2); 

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
    // InternalTraceryPlusPlus.g:1295:1: entryRulePronounIdentifier returns [EObject current=null] : iv_rulePronounIdentifier= rulePronounIdentifier EOF ;
    public final EObject entryRulePronounIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePronounIdentifier = null;


        try {
            // InternalTraceryPlusPlus.g:1295:58: (iv_rulePronounIdentifier= rulePronounIdentifier EOF )
            // InternalTraceryPlusPlus.g:1296:2: iv_rulePronounIdentifier= rulePronounIdentifier EOF
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
    // InternalTraceryPlusPlus.g:1302:1: rulePronounIdentifier returns [EObject current=null] : ( ( (lv_name_0_1= 'they' | lv_name_0_2= 'them' | lv_name_0_3= 'their' | lv_name_0_4= 'theirs' ) ) ) ;
    public final EObject rulePronounIdentifier() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1308:2: ( ( ( (lv_name_0_1= 'they' | lv_name_0_2= 'them' | lv_name_0_3= 'their' | lv_name_0_4= 'theirs' ) ) ) )
            // InternalTraceryPlusPlus.g:1309:2: ( ( (lv_name_0_1= 'they' | lv_name_0_2= 'them' | lv_name_0_3= 'their' | lv_name_0_4= 'theirs' ) ) )
            {
            // InternalTraceryPlusPlus.g:1309:2: ( ( (lv_name_0_1= 'they' | lv_name_0_2= 'them' | lv_name_0_3= 'their' | lv_name_0_4= 'theirs' ) ) )
            // InternalTraceryPlusPlus.g:1310:3: ( (lv_name_0_1= 'they' | lv_name_0_2= 'them' | lv_name_0_3= 'their' | lv_name_0_4= 'theirs' ) )
            {
            // InternalTraceryPlusPlus.g:1310:3: ( (lv_name_0_1= 'they' | lv_name_0_2= 'them' | lv_name_0_3= 'their' | lv_name_0_4= 'theirs' ) )
            // InternalTraceryPlusPlus.g:1311:4: (lv_name_0_1= 'they' | lv_name_0_2= 'them' | lv_name_0_3= 'their' | lv_name_0_4= 'theirs' )
            {
            // InternalTraceryPlusPlus.g:1311:4: (lv_name_0_1= 'they' | lv_name_0_2= 'them' | lv_name_0_3= 'their' | lv_name_0_4= 'theirs' )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt26=1;
                }
                break;
            case 34:
                {
                alt26=2;
                }
                break;
            case 35:
                {
                alt26=3;
                }
                break;
            case 36:
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
                    // InternalTraceryPlusPlus.g:1312:5: lv_name_0_1= 'they'
                    {
                    lv_name_0_1=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getPronounIdentifierAccess().getNameTheyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPronounIdentifierRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1323:5: lv_name_0_2= 'them'
                    {
                    lv_name_0_2=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getPronounIdentifierAccess().getNameThemKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPronounIdentifierRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1334:5: lv_name_0_3= 'their'
                    {
                    lv_name_0_3=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_name_0_3, grammarAccess.getPronounIdentifierAccess().getNameTheirKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPronounIdentifierRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalTraceryPlusPlus.g:1345:5: lv_name_0_4= 'theirs'
                    {
                    lv_name_0_4=(Token)match(input,36,FOLLOW_2); 

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
    // InternalTraceryPlusPlus.g:1361:1: entryRuleModifier returns [String current=null] : iv_ruleModifier= ruleModifier EOF ;
    public final String entryRuleModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModifier = null;


        try {
            // InternalTraceryPlusPlus.g:1361:48: (iv_ruleModifier= ruleModifier EOF )
            // InternalTraceryPlusPlus.g:1362:2: iv_ruleModifier= ruleModifier EOF
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
    // InternalTraceryPlusPlus.g:1368:1: ruleModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CapitalizationModifier_0= ruleCapitalizationModifier | this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier | this_PluralityModifier_2= rulePluralityModifier | this_ArticleModifier_3= ruleArticleModifier | this_PastTenseModifier_4= rulePastTenseModifier ) ;
    public final AntlrDatatypeRuleToken ruleModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_CapitalizationModifier_0 = null;

        AntlrDatatypeRuleToken this_FullCapitalizationModifier_1 = null;

        AntlrDatatypeRuleToken this_PluralityModifier_2 = null;

        AntlrDatatypeRuleToken this_ArticleModifier_3 = null;

        AntlrDatatypeRuleToken this_PastTenseModifier_4 = null;



        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1374:2: ( (this_CapitalizationModifier_0= ruleCapitalizationModifier | this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier | this_PluralityModifier_2= rulePluralityModifier | this_ArticleModifier_3= ruleArticleModifier | this_PastTenseModifier_4= rulePastTenseModifier ) )
            // InternalTraceryPlusPlus.g:1375:2: (this_CapitalizationModifier_0= ruleCapitalizationModifier | this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier | this_PluralityModifier_2= rulePluralityModifier | this_ArticleModifier_3= ruleArticleModifier | this_PastTenseModifier_4= rulePastTenseModifier )
            {
            // InternalTraceryPlusPlus.g:1375:2: (this_CapitalizationModifier_0= ruleCapitalizationModifier | this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier | this_PluralityModifier_2= rulePluralityModifier | this_ArticleModifier_3= ruleArticleModifier | this_PastTenseModifier_4= rulePastTenseModifier )
            int alt27=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt27=1;
                }
                break;
            case 38:
                {
                alt27=2;
                }
                break;
            case 39:
                {
                alt27=3;
                }
                break;
            case 40:
                {
                alt27=4;
                }
                break;
            case 41:
                {
                alt27=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1376:3: this_CapitalizationModifier_0= ruleCapitalizationModifier
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
                    // InternalTraceryPlusPlus.g:1387:3: this_FullCapitalizationModifier_1= ruleFullCapitalizationModifier
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
                    // InternalTraceryPlusPlus.g:1398:3: this_PluralityModifier_2= rulePluralityModifier
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
                    // InternalTraceryPlusPlus.g:1409:3: this_ArticleModifier_3= ruleArticleModifier
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
                    // InternalTraceryPlusPlus.g:1420:3: this_PastTenseModifier_4= rulePastTenseModifier
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
    // InternalTraceryPlusPlus.g:1434:1: entryRuleCapitalizationModifier returns [String current=null] : iv_ruleCapitalizationModifier= ruleCapitalizationModifier EOF ;
    public final String entryRuleCapitalizationModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCapitalizationModifier = null;


        try {
            // InternalTraceryPlusPlus.g:1434:62: (iv_ruleCapitalizationModifier= ruleCapitalizationModifier EOF )
            // InternalTraceryPlusPlus.g:1435:2: iv_ruleCapitalizationModifier= ruleCapitalizationModifier EOF
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
    // InternalTraceryPlusPlus.g:1441:1: ruleCapitalizationModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.capitalize' ;
    public final AntlrDatatypeRuleToken ruleCapitalizationModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1447:2: (kw= '.capitalize' )
            // InternalTraceryPlusPlus.g:1448:2: kw= '.capitalize'
            {
            kw=(Token)match(input,37,FOLLOW_2); 

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
    // InternalTraceryPlusPlus.g:1456:1: entryRuleFullCapitalizationModifier returns [String current=null] : iv_ruleFullCapitalizationModifier= ruleFullCapitalizationModifier EOF ;
    public final String entryRuleFullCapitalizationModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFullCapitalizationModifier = null;


        try {
            // InternalTraceryPlusPlus.g:1456:66: (iv_ruleFullCapitalizationModifier= ruleFullCapitalizationModifier EOF )
            // InternalTraceryPlusPlus.g:1457:2: iv_ruleFullCapitalizationModifier= ruleFullCapitalizationModifier EOF
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
    // InternalTraceryPlusPlus.g:1463:1: ruleFullCapitalizationModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.CAPITALIZE' ;
    public final AntlrDatatypeRuleToken ruleFullCapitalizationModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1469:2: (kw= '.CAPITALIZE' )
            // InternalTraceryPlusPlus.g:1470:2: kw= '.CAPITALIZE'
            {
            kw=(Token)match(input,38,FOLLOW_2); 

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
    // InternalTraceryPlusPlus.g:1478:1: entryRulePluralityModifier returns [String current=null] : iv_rulePluralityModifier= rulePluralityModifier EOF ;
    public final String entryRulePluralityModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePluralityModifier = null;


        try {
            // InternalTraceryPlusPlus.g:1478:57: (iv_rulePluralityModifier= rulePluralityModifier EOF )
            // InternalTraceryPlusPlus.g:1479:2: iv_rulePluralityModifier= rulePluralityModifier EOF
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
    // InternalTraceryPlusPlus.g:1485:1: rulePluralityModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.s' ;
    public final AntlrDatatypeRuleToken rulePluralityModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1491:2: (kw= '.s' )
            // InternalTraceryPlusPlus.g:1492:2: kw= '.s'
            {
            kw=(Token)match(input,39,FOLLOW_2); 

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
    // InternalTraceryPlusPlus.g:1500:1: entryRuleArticleModifier returns [String current=null] : iv_ruleArticleModifier= ruleArticleModifier EOF ;
    public final String entryRuleArticleModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArticleModifier = null;


        try {
            // InternalTraceryPlusPlus.g:1500:55: (iv_ruleArticleModifier= ruleArticleModifier EOF )
            // InternalTraceryPlusPlus.g:1501:2: iv_ruleArticleModifier= ruleArticleModifier EOF
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
    // InternalTraceryPlusPlus.g:1507:1: ruleArticleModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.a' ;
    public final AntlrDatatypeRuleToken ruleArticleModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1513:2: (kw= '.a' )
            // InternalTraceryPlusPlus.g:1514:2: kw= '.a'
            {
            kw=(Token)match(input,40,FOLLOW_2); 

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
    // InternalTraceryPlusPlus.g:1522:1: entryRulePastTenseModifier returns [String current=null] : iv_rulePastTenseModifier= rulePastTenseModifier EOF ;
    public final String entryRulePastTenseModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePastTenseModifier = null;


        try {
            // InternalTraceryPlusPlus.g:1522:57: (iv_rulePastTenseModifier= rulePastTenseModifier EOF )
            // InternalTraceryPlusPlus.g:1523:2: iv_rulePastTenseModifier= rulePastTenseModifier EOF
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
    // InternalTraceryPlusPlus.g:1529:1: rulePastTenseModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.ed' ;
    public final AntlrDatatypeRuleToken rulePastTenseModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1535:2: (kw= '.ed' )
            // InternalTraceryPlusPlus.g:1536:2: kw= '.ed'
            {
            kw=(Token)match(input,41,FOLLOW_2); 

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
    // InternalTraceryPlusPlus.g:1544:1: entryRuleAssignmentOperator returns [String current=null] : iv_ruleAssignmentOperator= ruleAssignmentOperator EOF ;
    public final String entryRuleAssignmentOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAssignmentOperator = null;


        try {
            // InternalTraceryPlusPlus.g:1544:58: (iv_ruleAssignmentOperator= ruleAssignmentOperator EOF )
            // InternalTraceryPlusPlus.g:1545:2: iv_ruleAssignmentOperator= ruleAssignmentOperator EOF
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
    // InternalTraceryPlusPlus.g:1551:1: ruleAssignmentOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= ':' | kw= '-' | kw= '-->' | (kw= 'equal' kw= 'to' ) ) ;
    public final AntlrDatatypeRuleToken ruleAssignmentOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1557:2: ( (kw= '=' | kw= ':' | kw= '-' | kw= '-->' | (kw= 'equal' kw= 'to' ) ) )
            // InternalTraceryPlusPlus.g:1558:2: (kw= '=' | kw= ':' | kw= '-' | kw= '-->' | (kw= 'equal' kw= 'to' ) )
            {
            // InternalTraceryPlusPlus.g:1558:2: (kw= '=' | kw= ':' | kw= '-' | kw= '-->' | (kw= 'equal' kw= 'to' ) )
            int alt28=5;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt28=1;
                }
                break;
            case 25:
                {
                alt28=2;
                }
                break;
            case 43:
                {
                alt28=3;
                }
                break;
            case 44:
                {
                alt28=4;
                }
                break;
            case 45:
                {
                alt28=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1559:3: kw= '='
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1565:3: kw= ':'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getColonKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1571:3: kw= '-'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getHyphenMinusKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalTraceryPlusPlus.g:1577:3: kw= '-->'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalTraceryPlusPlus.g:1583:3: (kw= 'equal' kw= 'to' )
                    {
                    // InternalTraceryPlusPlus.g:1583:3: (kw= 'equal' kw= 'to' )
                    // InternalTraceryPlusPlus.g:1584:4: kw= 'equal' kw= 'to'
                    {
                    kw=(Token)match(input,45,FOLLOW_27); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getAssignmentOperatorAccess().getEqualKeyword_4_0());
                    			
                    kw=(Token)match(input,46,FOLLOW_2); 

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
    // InternalTraceryPlusPlus.g:1599:1: entryRuleSeparatorOr returns [String current=null] : iv_ruleSeparatorOr= ruleSeparatorOr EOF ;
    public final String entryRuleSeparatorOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSeparatorOr = null;


        try {
            // InternalTraceryPlusPlus.g:1599:51: (iv_ruleSeparatorOr= ruleSeparatorOr EOF )
            // InternalTraceryPlusPlus.g:1600:2: iv_ruleSeparatorOr= ruleSeparatorOr EOF
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
    // InternalTraceryPlusPlus.g:1606:1: ruleSeparatorOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ',' | kw= 'or' | kw= '||' ) ;
    public final AntlrDatatypeRuleToken ruleSeparatorOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1612:2: ( (kw= ',' | kw= 'or' | kw= '||' ) )
            // InternalTraceryPlusPlus.g:1613:2: (kw= ',' | kw= 'or' | kw= '||' )
            {
            // InternalTraceryPlusPlus.g:1613:2: (kw= ',' | kw= 'or' | kw= '||' )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt29=1;
                }
                break;
            case 48:
                {
                alt29=2;
                }
                break;
            case 49:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1614:3: kw= ','
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSeparatorOrAccess().getCommaKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1620:3: kw= 'or'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSeparatorOrAccess().getOrKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1626:3: kw= '||'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

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
    // InternalTraceryPlusPlus.g:1635:1: entryRuleSeparatorAnd returns [String current=null] : iv_ruleSeparatorAnd= ruleSeparatorAnd EOF ;
    public final String entryRuleSeparatorAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSeparatorAnd = null;


        try {
            // InternalTraceryPlusPlus.g:1635:52: (iv_ruleSeparatorAnd= ruleSeparatorAnd EOF )
            // InternalTraceryPlusPlus.g:1636:2: iv_ruleSeparatorAnd= ruleSeparatorAnd EOF
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
    // InternalTraceryPlusPlus.g:1642:1: ruleSeparatorAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ',' | kw= 'and' | kw= '&&' ) ;
    public final AntlrDatatypeRuleToken ruleSeparatorAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTraceryPlusPlus.g:1648:2: ( (kw= ',' | kw= 'and' | kw= '&&' ) )
            // InternalTraceryPlusPlus.g:1649:2: (kw= ',' | kw= 'and' | kw= '&&' )
            {
            // InternalTraceryPlusPlus.g:1649:2: (kw= ',' | kw= 'and' | kw= '&&' )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt30=1;
                }
                break;
            case 50:
                {
                alt30=2;
                }
                break;
            case 51:
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
                    // InternalTraceryPlusPlus.g:1650:3: kw= ','
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSeparatorAndAccess().getCommaKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1656:3: kw= 'and'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSeparatorAndAccess().getAndKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1662:3: kw= '&&'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

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


    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\6\4\1\56\2\uffff\1\4";
    static final String dfa_3s = "\1\4\1\55\4\5\1\56\2\uffff\1\5";
    static final String dfa_4s = "\7\uffff\1\2\1\1\1\uffff";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\10\1\7\23\uffff\1\3\1\uffff\1\10\16\uffff\1\2\1\4\1\5\1\6",
            "\1\10\1\7",
            "\1\10\1\7",
            "\1\10\1\7",
            "\1\10\1\7",
            "\1\11",
            "",
            "",
            "\1\10\1\7"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "775:2: (this_NameExistingListAttribute_0= ruleNameExistingListAttribute | this_NameValueAttribute_1= ruleNameValueAttribute )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001040810L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00003C0003000032L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000032L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000026000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00003C0002000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000600010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00003C0002800010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000005000030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000003E000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00003C000A000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001E00000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0003800000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000C800000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400000000000L});

}