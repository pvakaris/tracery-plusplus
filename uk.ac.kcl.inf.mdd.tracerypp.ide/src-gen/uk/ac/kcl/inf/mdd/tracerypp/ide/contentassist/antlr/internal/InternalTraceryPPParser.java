package uk.ac.kcl.inf.mdd.tracerypp.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uk.ac.kcl.inf.mdd.tracerypp.services.TraceryPPGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTraceryPPParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "', '", "','", "'can have values: '"
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

    	public void setGrammarAccess(TraceryPPGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalTraceryPP.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalTraceryPP.g:54:1: ( ruleModel EOF )
            // InternalTraceryPP.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalTraceryPP.g:62:1: ruleModel : ( ( rule__Model__StatementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:66:2: ( ( ( rule__Model__StatementsAssignment )* ) )
            // InternalTraceryPP.g:67:2: ( ( rule__Model__StatementsAssignment )* )
            {
            // InternalTraceryPP.g:67:2: ( ( rule__Model__StatementsAssignment )* )
            // InternalTraceryPP.g:68:3: ( rule__Model__StatementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getStatementsAssignment()); 
            // InternalTraceryPP.g:69:3: ( rule__Model__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTraceryPP.g:69:4: rule__Model__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getStatementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStatement"
    // InternalTraceryPP.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalTraceryPP.g:79:1: ( ruleStatement EOF )
            // InternalTraceryPP.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalTraceryPP.g:87:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:91:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalTraceryPP.g:92:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalTraceryPP.g:92:2: ( ( rule__Statement__Alternatives ) )
            // InternalTraceryPP.g:93:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalTraceryPP.g:94:3: ( rule__Statement__Alternatives )
            // InternalTraceryPP.g:94:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleTitle"
    // InternalTraceryPP.g:103:1: entryRuleTitle : ruleTitle EOF ;
    public final void entryRuleTitle() throws RecognitionException {
        try {
            // InternalTraceryPP.g:104:1: ( ruleTitle EOF )
            // InternalTraceryPP.g:105:1: ruleTitle EOF
            {
             before(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_1);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getTitleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // InternalTraceryPP.g:112:1: ruleTitle : ( ( rule__Title__Group__0 ) ) ;
    public final void ruleTitle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:116:2: ( ( ( rule__Title__Group__0 ) ) )
            // InternalTraceryPP.g:117:2: ( ( rule__Title__Group__0 ) )
            {
            // InternalTraceryPP.g:117:2: ( ( rule__Title__Group__0 ) )
            // InternalTraceryPP.g:118:3: ( rule__Title__Group__0 )
            {
             before(grammarAccess.getTitleAccess().getGroup()); 
            // InternalTraceryPP.g:119:3: ( rule__Title__Group__0 )
            // InternalTraceryPP.g:119:4: rule__Title__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Title__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleStartSymbol"
    // InternalTraceryPP.g:128:1: entryRuleStartSymbol : ruleStartSymbol EOF ;
    public final void entryRuleStartSymbol() throws RecognitionException {
        try {
            // InternalTraceryPP.g:129:1: ( ruleStartSymbol EOF )
            // InternalTraceryPP.g:130:1: ruleStartSymbol EOF
            {
             before(grammarAccess.getStartSymbolRule()); 
            pushFollow(FOLLOW_1);
            ruleStartSymbol();

            state._fsp--;

             after(grammarAccess.getStartSymbolRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStartSymbol"


    // $ANTLR start "ruleStartSymbol"
    // InternalTraceryPP.g:137:1: ruleStartSymbol : ( ( rule__StartSymbol__TitleAssignment ) ) ;
    public final void ruleStartSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:141:2: ( ( ( rule__StartSymbol__TitleAssignment ) ) )
            // InternalTraceryPP.g:142:2: ( ( rule__StartSymbol__TitleAssignment ) )
            {
            // InternalTraceryPP.g:142:2: ( ( rule__StartSymbol__TitleAssignment ) )
            // InternalTraceryPP.g:143:3: ( rule__StartSymbol__TitleAssignment )
            {
             before(grammarAccess.getStartSymbolAccess().getTitleAssignment()); 
            // InternalTraceryPP.g:144:3: ( rule__StartSymbol__TitleAssignment )
            // InternalTraceryPP.g:144:4: rule__StartSymbol__TitleAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StartSymbol__TitleAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStartSymbolAccess().getTitleAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStartSymbol"


    // $ANTLR start "entryRuleList"
    // InternalTraceryPP.g:153:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // InternalTraceryPP.g:154:1: ( ruleList EOF )
            // InternalTraceryPP.g:155:1: ruleList EOF
            {
             before(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            ruleList();

            state._fsp--;

             after(grammarAccess.getListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalTraceryPP.g:162:1: ruleList : ( ( rule__List__Group__0 ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:166:2: ( ( ( rule__List__Group__0 ) ) )
            // InternalTraceryPP.g:167:2: ( ( rule__List__Group__0 ) )
            {
            // InternalTraceryPP.g:167:2: ( ( rule__List__Group__0 ) )
            // InternalTraceryPP.g:168:3: ( rule__List__Group__0 )
            {
             before(grammarAccess.getListAccess().getGroup()); 
            // InternalTraceryPP.g:169:3: ( rule__List__Group__0 )
            // InternalTraceryPP.g:169:4: rule__List__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__List__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleWord"
    // InternalTraceryPP.g:178:1: entryRuleWord : ruleWord EOF ;
    public final void entryRuleWord() throws RecognitionException {
        try {
            // InternalTraceryPP.g:179:1: ( ruleWord EOF )
            // InternalTraceryPP.g:180:1: ruleWord EOF
            {
             before(grammarAccess.getWordRule()); 
            pushFollow(FOLLOW_1);
            ruleWord();

            state._fsp--;

             after(grammarAccess.getWordRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWord"


    // $ANTLR start "ruleWord"
    // InternalTraceryPP.g:187:1: ruleWord : ( ( rule__Word__WordAssignment ) ) ;
    public final void ruleWord() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:191:2: ( ( ( rule__Word__WordAssignment ) ) )
            // InternalTraceryPP.g:192:2: ( ( rule__Word__WordAssignment ) )
            {
            // InternalTraceryPP.g:192:2: ( ( rule__Word__WordAssignment ) )
            // InternalTraceryPP.g:193:3: ( rule__Word__WordAssignment )
            {
             before(grammarAccess.getWordAccess().getWordAssignment()); 
            // InternalTraceryPP.g:194:3: ( rule__Word__WordAssignment )
            // InternalTraceryPP.g:194:4: rule__Word__WordAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Word__WordAssignment();

            state._fsp--;


            }

             after(grammarAccess.getWordAccess().getWordAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWord"


    // $ANTLR start "entryRuleSentence"
    // InternalTraceryPP.g:203:1: entryRuleSentence : ruleSentence EOF ;
    public final void entryRuleSentence() throws RecognitionException {
        try {
            // InternalTraceryPP.g:204:1: ( ruleSentence EOF )
            // InternalTraceryPP.g:205:1: ruleSentence EOF
            {
             before(grammarAccess.getSentenceRule()); 
            pushFollow(FOLLOW_1);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getSentenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSentence"


    // $ANTLR start "ruleSentence"
    // InternalTraceryPP.g:212:1: ruleSentence : ( ( rule__Sentence__WordAssignment ) ) ;
    public final void ruleSentence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:216:2: ( ( ( rule__Sentence__WordAssignment ) ) )
            // InternalTraceryPP.g:217:2: ( ( rule__Sentence__WordAssignment ) )
            {
            // InternalTraceryPP.g:217:2: ( ( rule__Sentence__WordAssignment ) )
            // InternalTraceryPP.g:218:3: ( rule__Sentence__WordAssignment )
            {
             before(grammarAccess.getSentenceAccess().getWordAssignment()); 
            // InternalTraceryPP.g:219:3: ( rule__Sentence__WordAssignment )
            // InternalTraceryPP.g:219:4: rule__Sentence__WordAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Sentence__WordAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSentenceAccess().getWordAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSentence"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalTraceryPP.g:227:1: rule__Statement__Alternatives : ( ( ruleTitle ) | ( ruleSentence ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:231:1: ( ( ruleTitle ) | ( ruleSentence ) )
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
                    // InternalTraceryPP.g:232:2: ( ruleTitle )
                    {
                    // InternalTraceryPP.g:232:2: ( ruleTitle )
                    // InternalTraceryPP.g:233:3: ruleTitle
                    {
                     before(grammarAccess.getStatementAccess().getTitleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTitle();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getTitleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:238:2: ( ruleSentence )
                    {
                    // InternalTraceryPP.g:238:2: ( ruleSentence )
                    // InternalTraceryPP.g:239:3: ruleSentence
                    {
                     before(grammarAccess.getStatementAccess().getSentenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSentence();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSentenceParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__List__Alternatives_1_0"
    // InternalTraceryPP.g:248:1: rule__List__Alternatives_1_0 : ( ( ', ' ) | ( ',' ) );
    public final void rule__List__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:252:1: ( ( ', ' ) | ( ',' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTraceryPP.g:253:2: ( ', ' )
                    {
                    // InternalTraceryPP.g:253:2: ( ', ' )
                    // InternalTraceryPP.g:254:3: ', '
                    {
                     before(grammarAccess.getListAccess().getCommaSpaceKeyword_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getListAccess().getCommaSpaceKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:259:2: ( ',' )
                    {
                    // InternalTraceryPP.g:259:2: ( ',' )
                    // InternalTraceryPP.g:260:3: ','
                    {
                     before(grammarAccess.getListAccess().getCommaKeyword_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getListAccess().getCommaKeyword_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Alternatives_1_0"


    // $ANTLR start "rule__Title__Group__0"
    // InternalTraceryPP.g:269:1: rule__Title__Group__0 : rule__Title__Group__0__Impl rule__Title__Group__1 ;
    public final void rule__Title__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:273:1: ( rule__Title__Group__0__Impl rule__Title__Group__1 )
            // InternalTraceryPP.g:274:2: rule__Title__Group__0__Impl rule__Title__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Title__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Title__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__0"


    // $ANTLR start "rule__Title__Group__0__Impl"
    // InternalTraceryPP.g:281:1: rule__Title__Group__0__Impl : ( ( rule__Title__Start_symbolAssignment_0 ) ) ;
    public final void rule__Title__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:285:1: ( ( ( rule__Title__Start_symbolAssignment_0 ) ) )
            // InternalTraceryPP.g:286:1: ( ( rule__Title__Start_symbolAssignment_0 ) )
            {
            // InternalTraceryPP.g:286:1: ( ( rule__Title__Start_symbolAssignment_0 ) )
            // InternalTraceryPP.g:287:2: ( rule__Title__Start_symbolAssignment_0 )
            {
             before(grammarAccess.getTitleAccess().getStart_symbolAssignment_0()); 
            // InternalTraceryPP.g:288:2: ( rule__Title__Start_symbolAssignment_0 )
            // InternalTraceryPP.g:288:3: rule__Title__Start_symbolAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Title__Start_symbolAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getStart_symbolAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__0__Impl"


    // $ANTLR start "rule__Title__Group__1"
    // InternalTraceryPP.g:296:1: rule__Title__Group__1 : rule__Title__Group__1__Impl rule__Title__Group__2 ;
    public final void rule__Title__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:300:1: ( rule__Title__Group__1__Impl rule__Title__Group__2 )
            // InternalTraceryPP.g:301:2: rule__Title__Group__1__Impl rule__Title__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Title__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Title__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__1"


    // $ANTLR start "rule__Title__Group__1__Impl"
    // InternalTraceryPP.g:308:1: rule__Title__Group__1__Impl : ( 'can have values: ' ) ;
    public final void rule__Title__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:312:1: ( ( 'can have values: ' ) )
            // InternalTraceryPP.g:313:1: ( 'can have values: ' )
            {
            // InternalTraceryPP.g:313:1: ( 'can have values: ' )
            // InternalTraceryPP.g:314:2: 'can have values: '
            {
             before(grammarAccess.getTitleAccess().getCanHaveValuesKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getCanHaveValuesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__1__Impl"


    // $ANTLR start "rule__Title__Group__2"
    // InternalTraceryPP.g:323:1: rule__Title__Group__2 : rule__Title__Group__2__Impl ;
    public final void rule__Title__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:327:1: ( rule__Title__Group__2__Impl )
            // InternalTraceryPP.g:328:2: rule__Title__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Title__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__2"


    // $ANTLR start "rule__Title__Group__2__Impl"
    // InternalTraceryPP.g:334:1: rule__Title__Group__2__Impl : ( ( rule__Title__ListAssignment_2 ) ) ;
    public final void rule__Title__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:338:1: ( ( ( rule__Title__ListAssignment_2 ) ) )
            // InternalTraceryPP.g:339:1: ( ( rule__Title__ListAssignment_2 ) )
            {
            // InternalTraceryPP.g:339:1: ( ( rule__Title__ListAssignment_2 ) )
            // InternalTraceryPP.g:340:2: ( rule__Title__ListAssignment_2 )
            {
             before(grammarAccess.getTitleAccess().getListAssignment_2()); 
            // InternalTraceryPP.g:341:2: ( rule__Title__ListAssignment_2 )
            // InternalTraceryPP.g:341:3: rule__Title__ListAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Title__ListAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getListAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__2__Impl"


    // $ANTLR start "rule__List__Group__0"
    // InternalTraceryPP.g:350:1: rule__List__Group__0 : rule__List__Group__0__Impl rule__List__Group__1 ;
    public final void rule__List__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:354:1: ( rule__List__Group__0__Impl rule__List__Group__1 )
            // InternalTraceryPP.g:355:2: rule__List__Group__0__Impl rule__List__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__List__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__List__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__0"


    // $ANTLR start "rule__List__Group__0__Impl"
    // InternalTraceryPP.g:362:1: rule__List__Group__0__Impl : ( ( rule__List__WordAssignment_0 ) ) ;
    public final void rule__List__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:366:1: ( ( ( rule__List__WordAssignment_0 ) ) )
            // InternalTraceryPP.g:367:1: ( ( rule__List__WordAssignment_0 ) )
            {
            // InternalTraceryPP.g:367:1: ( ( rule__List__WordAssignment_0 ) )
            // InternalTraceryPP.g:368:2: ( rule__List__WordAssignment_0 )
            {
             before(grammarAccess.getListAccess().getWordAssignment_0()); 
            // InternalTraceryPP.g:369:2: ( rule__List__WordAssignment_0 )
            // InternalTraceryPP.g:369:3: rule__List__WordAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__List__WordAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getWordAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__0__Impl"


    // $ANTLR start "rule__List__Group__1"
    // InternalTraceryPP.g:377:1: rule__List__Group__1 : rule__List__Group__1__Impl ;
    public final void rule__List__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:381:1: ( rule__List__Group__1__Impl )
            // InternalTraceryPP.g:382:2: rule__List__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__List__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__1"


    // $ANTLR start "rule__List__Group__1__Impl"
    // InternalTraceryPP.g:388:1: rule__List__Group__1__Impl : ( ( rule__List__Group_1__0 )* ) ;
    public final void rule__List__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:392:1: ( ( ( rule__List__Group_1__0 )* ) )
            // InternalTraceryPP.g:393:1: ( ( rule__List__Group_1__0 )* )
            {
            // InternalTraceryPP.g:393:1: ( ( rule__List__Group_1__0 )* )
            // InternalTraceryPP.g:394:2: ( rule__List__Group_1__0 )*
            {
             before(grammarAccess.getListAccess().getGroup_1()); 
            // InternalTraceryPP.g:395:2: ( rule__List__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=11 && LA4_0<=12)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTraceryPP.g:395:3: rule__List__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__List__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__1__Impl"


    // $ANTLR start "rule__List__Group_1__0"
    // InternalTraceryPP.g:404:1: rule__List__Group_1__0 : rule__List__Group_1__0__Impl rule__List__Group_1__1 ;
    public final void rule__List__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:408:1: ( rule__List__Group_1__0__Impl rule__List__Group_1__1 )
            // InternalTraceryPP.g:409:2: rule__List__Group_1__0__Impl rule__List__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__List__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__List__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group_1__0"


    // $ANTLR start "rule__List__Group_1__0__Impl"
    // InternalTraceryPP.g:416:1: rule__List__Group_1__0__Impl : ( ( rule__List__Alternatives_1_0 ) ) ;
    public final void rule__List__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:420:1: ( ( ( rule__List__Alternatives_1_0 ) ) )
            // InternalTraceryPP.g:421:1: ( ( rule__List__Alternatives_1_0 ) )
            {
            // InternalTraceryPP.g:421:1: ( ( rule__List__Alternatives_1_0 ) )
            // InternalTraceryPP.g:422:2: ( rule__List__Alternatives_1_0 )
            {
             before(grammarAccess.getListAccess().getAlternatives_1_0()); 
            // InternalTraceryPP.g:423:2: ( rule__List__Alternatives_1_0 )
            // InternalTraceryPP.g:423:3: rule__List__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__List__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group_1__0__Impl"


    // $ANTLR start "rule__List__Group_1__1"
    // InternalTraceryPP.g:431:1: rule__List__Group_1__1 : rule__List__Group_1__1__Impl ;
    public final void rule__List__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:435:1: ( rule__List__Group_1__1__Impl )
            // InternalTraceryPP.g:436:2: rule__List__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__List__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group_1__1"


    // $ANTLR start "rule__List__Group_1__1__Impl"
    // InternalTraceryPP.g:442:1: rule__List__Group_1__1__Impl : ( ( rule__List__WordAssignment_1_1 ) ) ;
    public final void rule__List__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:446:1: ( ( ( rule__List__WordAssignment_1_1 ) ) )
            // InternalTraceryPP.g:447:1: ( ( rule__List__WordAssignment_1_1 ) )
            {
            // InternalTraceryPP.g:447:1: ( ( rule__List__WordAssignment_1_1 ) )
            // InternalTraceryPP.g:448:2: ( rule__List__WordAssignment_1_1 )
            {
             before(grammarAccess.getListAccess().getWordAssignment_1_1()); 
            // InternalTraceryPP.g:449:2: ( rule__List__WordAssignment_1_1 )
            // InternalTraceryPP.g:449:3: rule__List__WordAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__List__WordAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getWordAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group_1__1__Impl"


    // $ANTLR start "rule__Model__StatementsAssignment"
    // InternalTraceryPP.g:458:1: rule__Model__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Model__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:462:1: ( ( ruleStatement ) )
            // InternalTraceryPP.g:463:2: ( ruleStatement )
            {
            // InternalTraceryPP.g:463:2: ( ruleStatement )
            // InternalTraceryPP.g:464:3: ruleStatement
            {
             before(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StatementsAssignment"


    // $ANTLR start "rule__Title__Start_symbolAssignment_0"
    // InternalTraceryPP.g:473:1: rule__Title__Start_symbolAssignment_0 : ( ruleStartSymbol ) ;
    public final void rule__Title__Start_symbolAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:477:1: ( ( ruleStartSymbol ) )
            // InternalTraceryPP.g:478:2: ( ruleStartSymbol )
            {
            // InternalTraceryPP.g:478:2: ( ruleStartSymbol )
            // InternalTraceryPP.g:479:3: ruleStartSymbol
            {
             before(grammarAccess.getTitleAccess().getStart_symbolStartSymbolParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStartSymbol();

            state._fsp--;

             after(grammarAccess.getTitleAccess().getStart_symbolStartSymbolParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Start_symbolAssignment_0"


    // $ANTLR start "rule__Title__ListAssignment_2"
    // InternalTraceryPP.g:488:1: rule__Title__ListAssignment_2 : ( ruleList ) ;
    public final void rule__Title__ListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:492:1: ( ( ruleList ) )
            // InternalTraceryPP.g:493:2: ( ruleList )
            {
            // InternalTraceryPP.g:493:2: ( ruleList )
            // InternalTraceryPP.g:494:3: ruleList
            {
             before(grammarAccess.getTitleAccess().getListListParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleList();

            state._fsp--;

             after(grammarAccess.getTitleAccess().getListListParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__ListAssignment_2"


    // $ANTLR start "rule__StartSymbol__TitleAssignment"
    // InternalTraceryPP.g:503:1: rule__StartSymbol__TitleAssignment : ( RULE_ID ) ;
    public final void rule__StartSymbol__TitleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:507:1: ( ( RULE_ID ) )
            // InternalTraceryPP.g:508:2: ( RULE_ID )
            {
            // InternalTraceryPP.g:508:2: ( RULE_ID )
            // InternalTraceryPP.g:509:3: RULE_ID
            {
             before(grammarAccess.getStartSymbolAccess().getTitleIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStartSymbolAccess().getTitleIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartSymbol__TitleAssignment"


    // $ANTLR start "rule__List__WordAssignment_0"
    // InternalTraceryPP.g:518:1: rule__List__WordAssignment_0 : ( ruleWord ) ;
    public final void rule__List__WordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:522:1: ( ( ruleWord ) )
            // InternalTraceryPP.g:523:2: ( ruleWord )
            {
            // InternalTraceryPP.g:523:2: ( ruleWord )
            // InternalTraceryPP.g:524:3: ruleWord
            {
             before(grammarAccess.getListAccess().getWordWordParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleWord();

            state._fsp--;

             after(grammarAccess.getListAccess().getWordWordParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__WordAssignment_0"


    // $ANTLR start "rule__List__WordAssignment_1_1"
    // InternalTraceryPP.g:533:1: rule__List__WordAssignment_1_1 : ( ruleWord ) ;
    public final void rule__List__WordAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:537:1: ( ( ruleWord ) )
            // InternalTraceryPP.g:538:2: ( ruleWord )
            {
            // InternalTraceryPP.g:538:2: ( ruleWord )
            // InternalTraceryPP.g:539:3: ruleWord
            {
             before(grammarAccess.getListAccess().getWordWordParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWord();

            state._fsp--;

             after(grammarAccess.getListAccess().getWordWordParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__WordAssignment_1_1"


    // $ANTLR start "rule__Word__WordAssignment"
    // InternalTraceryPP.g:548:1: rule__Word__WordAssignment : ( RULE_STRING ) ;
    public final void rule__Word__WordAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:552:1: ( ( RULE_STRING ) )
            // InternalTraceryPP.g:553:2: ( RULE_STRING )
            {
            // InternalTraceryPP.g:553:2: ( RULE_STRING )
            // InternalTraceryPP.g:554:3: RULE_STRING
            {
             before(grammarAccess.getWordAccess().getWordSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getWordAccess().getWordSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Word__WordAssignment"


    // $ANTLR start "rule__Sentence__WordAssignment"
    // InternalTraceryPP.g:563:1: rule__Sentence__WordAssignment : ( RULE_STRING ) ;
    public final void rule__Sentence__WordAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:567:1: ( ( RULE_STRING ) )
            // InternalTraceryPP.g:568:2: ( RULE_STRING )
            {
            // InternalTraceryPP.g:568:2: ( RULE_STRING )
            // InternalTraceryPP.g:569:3: RULE_STRING
            {
             before(grammarAccess.getSentenceAccess().getWordSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSentenceAccess().getWordSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sentence__WordAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001802L});

}