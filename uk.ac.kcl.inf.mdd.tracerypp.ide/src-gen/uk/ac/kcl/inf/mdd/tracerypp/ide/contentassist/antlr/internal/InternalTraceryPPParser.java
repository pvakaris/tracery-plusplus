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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'or'", "' can have values: '"
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

                if ( (LA1_0==RULE_ID) ) {
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
    // InternalTraceryPP.g:87:1: ruleStatement : ( ruleRule ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:91:2: ( ( ruleRule ) )
            // InternalTraceryPP.g:92:2: ( ruleRule )
            {
            // InternalTraceryPP.g:92:2: ( ruleRule )
            // InternalTraceryPP.g:93:3: ruleRule
            {
             before(grammarAccess.getStatementAccess().getRuleParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getRuleParserRuleCall()); 

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


    // $ANTLR start "entryRuleRule"
    // InternalTraceryPP.g:103:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalTraceryPP.g:104:1: ( ruleRule EOF )
            // InternalTraceryPP.g:105:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalTraceryPP.g:112:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:116:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalTraceryPP.g:117:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalTraceryPP.g:117:2: ( ( rule__Rule__Group__0 ) )
            // InternalTraceryPP.g:118:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalTraceryPP.g:119:3: ( rule__Rule__Group__0 )
            // InternalTraceryPP.g:119:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleVariable"
    // InternalTraceryPP.g:128:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalTraceryPP.g:129:1: ( ruleVariable EOF )
            // InternalTraceryPP.g:130:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalTraceryPP.g:137:1: ruleVariable : ( ( rule__Variable__TitleAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:141:2: ( ( ( rule__Variable__TitleAssignment ) ) )
            // InternalTraceryPP.g:142:2: ( ( rule__Variable__TitleAssignment ) )
            {
            // InternalTraceryPP.g:142:2: ( ( rule__Variable__TitleAssignment ) )
            // InternalTraceryPP.g:143:3: ( rule__Variable__TitleAssignment )
            {
             before(grammarAccess.getVariableAccess().getTitleAssignment()); 
            // InternalTraceryPP.g:144:3: ( rule__Variable__TitleAssignment )
            // InternalTraceryPP.g:144:4: rule__Variable__TitleAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Variable__TitleAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getTitleAssignment()); 

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
    // $ANTLR end "ruleVariable"


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


    // $ANTLR start "entryRuleSeparator"
    // InternalTraceryPP.g:178:1: entryRuleSeparator : ruleSeparator EOF ;
    public final void entryRuleSeparator() throws RecognitionException {
        try {
            // InternalTraceryPP.g:179:1: ( ruleSeparator EOF )
            // InternalTraceryPP.g:180:1: ruleSeparator EOF
            {
             before(grammarAccess.getSeparatorRule()); 
            pushFollow(FOLLOW_1);
            ruleSeparator();

            state._fsp--;

             after(grammarAccess.getSeparatorRule()); 
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
    // $ANTLR end "entryRuleSeparator"


    // $ANTLR start "ruleSeparator"
    // InternalTraceryPP.g:187:1: ruleSeparator : ( ( rule__Separator__Alternatives ) ) ;
    public final void ruleSeparator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:191:2: ( ( ( rule__Separator__Alternatives ) ) )
            // InternalTraceryPP.g:192:2: ( ( rule__Separator__Alternatives ) )
            {
            // InternalTraceryPP.g:192:2: ( ( rule__Separator__Alternatives ) )
            // InternalTraceryPP.g:193:3: ( rule__Separator__Alternatives )
            {
             before(grammarAccess.getSeparatorAccess().getAlternatives()); 
            // InternalTraceryPP.g:194:3: ( rule__Separator__Alternatives )
            // InternalTraceryPP.g:194:4: rule__Separator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Separator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSeparatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSeparator"


    // $ANTLR start "entryRuleWord"
    // InternalTraceryPP.g:203:1: entryRuleWord : ruleWord EOF ;
    public final void entryRuleWord() throws RecognitionException {
        try {
            // InternalTraceryPP.g:204:1: ( ruleWord EOF )
            // InternalTraceryPP.g:205:1: ruleWord EOF
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
    // InternalTraceryPP.g:212:1: ruleWord : ( ( rule__Word__WordAssignment ) ) ;
    public final void ruleWord() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:216:2: ( ( ( rule__Word__WordAssignment ) ) )
            // InternalTraceryPP.g:217:2: ( ( rule__Word__WordAssignment ) )
            {
            // InternalTraceryPP.g:217:2: ( ( rule__Word__WordAssignment ) )
            // InternalTraceryPP.g:218:3: ( rule__Word__WordAssignment )
            {
             before(grammarAccess.getWordAccess().getWordAssignment()); 
            // InternalTraceryPP.g:219:3: ( rule__Word__WordAssignment )
            // InternalTraceryPP.g:219:4: rule__Word__WordAssignment
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


    // $ANTLR start "rule__Separator__Alternatives"
    // InternalTraceryPP.g:227:1: rule__Separator__Alternatives : ( ( ',' ) | ( 'or' ) );
    public final void rule__Separator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:231:1: ( ( ',' ) | ( 'or' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTraceryPP.g:232:2: ( ',' )
                    {
                    // InternalTraceryPP.g:232:2: ( ',' )
                    // InternalTraceryPP.g:233:3: ','
                    {
                     before(grammarAccess.getSeparatorAccess().getCommaKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSeparatorAccess().getCommaKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:238:2: ( 'or' )
                    {
                    // InternalTraceryPP.g:238:2: ( 'or' )
                    // InternalTraceryPP.g:239:3: 'or'
                    {
                     before(grammarAccess.getSeparatorAccess().getOrKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSeparatorAccess().getOrKeyword_1()); 

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
    // $ANTLR end "rule__Separator__Alternatives"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalTraceryPP.g:248:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:252:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalTraceryPP.g:253:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

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
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalTraceryPP.g:260:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__Start_symbolAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:264:1: ( ( ( rule__Rule__Start_symbolAssignment_0 ) ) )
            // InternalTraceryPP.g:265:1: ( ( rule__Rule__Start_symbolAssignment_0 ) )
            {
            // InternalTraceryPP.g:265:1: ( ( rule__Rule__Start_symbolAssignment_0 ) )
            // InternalTraceryPP.g:266:2: ( rule__Rule__Start_symbolAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getStart_symbolAssignment_0()); 
            // InternalTraceryPP.g:267:2: ( rule__Rule__Start_symbolAssignment_0 )
            // InternalTraceryPP.g:267:3: rule__Rule__Start_symbolAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Start_symbolAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getStart_symbolAssignment_0()); 

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
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalTraceryPP.g:275:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:279:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalTraceryPP.g:280:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

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
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalTraceryPP.g:287:1: rule__Rule__Group__1__Impl : ( ' can have values: ' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:291:1: ( ( ' can have values: ' ) )
            // InternalTraceryPP.g:292:1: ( ' can have values: ' )
            {
            // InternalTraceryPP.g:292:1: ( ' can have values: ' )
            // InternalTraceryPP.g:293:2: ' can have values: '
            {
             before(grammarAccess.getRuleAccess().getCanHaveValuesKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getCanHaveValuesKeyword_1()); 

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
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalTraceryPP.g:302:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:306:1: ( rule__Rule__Group__2__Impl )
            // InternalTraceryPP.g:307:2: rule__Rule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__2__Impl();

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
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalTraceryPP.g:313:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__ListAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:317:1: ( ( ( rule__Rule__ListAssignment_2 ) ) )
            // InternalTraceryPP.g:318:1: ( ( rule__Rule__ListAssignment_2 ) )
            {
            // InternalTraceryPP.g:318:1: ( ( rule__Rule__ListAssignment_2 ) )
            // InternalTraceryPP.g:319:2: ( rule__Rule__ListAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getListAssignment_2()); 
            // InternalTraceryPP.g:320:2: ( rule__Rule__ListAssignment_2 )
            // InternalTraceryPP.g:320:3: rule__Rule__ListAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ListAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getListAssignment_2()); 

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
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__List__Group__0"
    // InternalTraceryPP.g:329:1: rule__List__Group__0 : rule__List__Group__0__Impl rule__List__Group__1 ;
    public final void rule__List__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:333:1: ( rule__List__Group__0__Impl rule__List__Group__1 )
            // InternalTraceryPP.g:334:2: rule__List__Group__0__Impl rule__List__Group__1
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
    // InternalTraceryPP.g:341:1: rule__List__Group__0__Impl : ( ( rule__List__WordAssignment_0 ) ) ;
    public final void rule__List__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:345:1: ( ( ( rule__List__WordAssignment_0 ) ) )
            // InternalTraceryPP.g:346:1: ( ( rule__List__WordAssignment_0 ) )
            {
            // InternalTraceryPP.g:346:1: ( ( rule__List__WordAssignment_0 ) )
            // InternalTraceryPP.g:347:2: ( rule__List__WordAssignment_0 )
            {
             before(grammarAccess.getListAccess().getWordAssignment_0()); 
            // InternalTraceryPP.g:348:2: ( rule__List__WordAssignment_0 )
            // InternalTraceryPP.g:348:3: rule__List__WordAssignment_0
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
    // InternalTraceryPP.g:356:1: rule__List__Group__1 : rule__List__Group__1__Impl ;
    public final void rule__List__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:360:1: ( rule__List__Group__1__Impl )
            // InternalTraceryPP.g:361:2: rule__List__Group__1__Impl
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
    // InternalTraceryPP.g:367:1: rule__List__Group__1__Impl : ( ( rule__List__Group_1__0 )* ) ;
    public final void rule__List__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:371:1: ( ( ( rule__List__Group_1__0 )* ) )
            // InternalTraceryPP.g:372:1: ( ( rule__List__Group_1__0 )* )
            {
            // InternalTraceryPP.g:372:1: ( ( rule__List__Group_1__0 )* )
            // InternalTraceryPP.g:373:2: ( rule__List__Group_1__0 )*
            {
             before(grammarAccess.getListAccess().getGroup_1()); 
            // InternalTraceryPP.g:374:2: ( rule__List__Group_1__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=11 && LA3_0<=12)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTraceryPP.g:374:3: rule__List__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__List__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalTraceryPP.g:383:1: rule__List__Group_1__0 : rule__List__Group_1__0__Impl rule__List__Group_1__1 ;
    public final void rule__List__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:387:1: ( rule__List__Group_1__0__Impl rule__List__Group_1__1 )
            // InternalTraceryPP.g:388:2: rule__List__Group_1__0__Impl rule__List__Group_1__1
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
    // InternalTraceryPP.g:395:1: rule__List__Group_1__0__Impl : ( ( rule__List__SepAssignment_1_0 ) ) ;
    public final void rule__List__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:399:1: ( ( ( rule__List__SepAssignment_1_0 ) ) )
            // InternalTraceryPP.g:400:1: ( ( rule__List__SepAssignment_1_0 ) )
            {
            // InternalTraceryPP.g:400:1: ( ( rule__List__SepAssignment_1_0 ) )
            // InternalTraceryPP.g:401:2: ( rule__List__SepAssignment_1_0 )
            {
             before(grammarAccess.getListAccess().getSepAssignment_1_0()); 
            // InternalTraceryPP.g:402:2: ( rule__List__SepAssignment_1_0 )
            // InternalTraceryPP.g:402:3: rule__List__SepAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__List__SepAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getSepAssignment_1_0()); 

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
    // InternalTraceryPP.g:410:1: rule__List__Group_1__1 : rule__List__Group_1__1__Impl ;
    public final void rule__List__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:414:1: ( rule__List__Group_1__1__Impl )
            // InternalTraceryPP.g:415:2: rule__List__Group_1__1__Impl
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
    // InternalTraceryPP.g:421:1: rule__List__Group_1__1__Impl : ( ( rule__List__WordAssignment_1_1 ) ) ;
    public final void rule__List__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:425:1: ( ( ( rule__List__WordAssignment_1_1 ) ) )
            // InternalTraceryPP.g:426:1: ( ( rule__List__WordAssignment_1_1 ) )
            {
            // InternalTraceryPP.g:426:1: ( ( rule__List__WordAssignment_1_1 ) )
            // InternalTraceryPP.g:427:2: ( rule__List__WordAssignment_1_1 )
            {
             before(grammarAccess.getListAccess().getWordAssignment_1_1()); 
            // InternalTraceryPP.g:428:2: ( rule__List__WordAssignment_1_1 )
            // InternalTraceryPP.g:428:3: rule__List__WordAssignment_1_1
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
    // InternalTraceryPP.g:437:1: rule__Model__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Model__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:441:1: ( ( ruleStatement ) )
            // InternalTraceryPP.g:442:2: ( ruleStatement )
            {
            // InternalTraceryPP.g:442:2: ( ruleStatement )
            // InternalTraceryPP.g:443:3: ruleStatement
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


    // $ANTLR start "rule__Rule__Start_symbolAssignment_0"
    // InternalTraceryPP.g:452:1: rule__Rule__Start_symbolAssignment_0 : ( ruleVariable ) ;
    public final void rule__Rule__Start_symbolAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:456:1: ( ( ruleVariable ) )
            // InternalTraceryPP.g:457:2: ( ruleVariable )
            {
            // InternalTraceryPP.g:457:2: ( ruleVariable )
            // InternalTraceryPP.g:458:3: ruleVariable
            {
             before(grammarAccess.getRuleAccess().getStart_symbolVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getStart_symbolVariableParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Rule__Start_symbolAssignment_0"


    // $ANTLR start "rule__Rule__ListAssignment_2"
    // InternalTraceryPP.g:467:1: rule__Rule__ListAssignment_2 : ( ruleList ) ;
    public final void rule__Rule__ListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:471:1: ( ( ruleList ) )
            // InternalTraceryPP.g:472:2: ( ruleList )
            {
            // InternalTraceryPP.g:472:2: ( ruleList )
            // InternalTraceryPP.g:473:3: ruleList
            {
             before(grammarAccess.getRuleAccess().getListListParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleList();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getListListParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Rule__ListAssignment_2"


    // $ANTLR start "rule__Variable__TitleAssignment"
    // InternalTraceryPP.g:482:1: rule__Variable__TitleAssignment : ( RULE_ID ) ;
    public final void rule__Variable__TitleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:486:1: ( ( RULE_ID ) )
            // InternalTraceryPP.g:487:2: ( RULE_ID )
            {
            // InternalTraceryPP.g:487:2: ( RULE_ID )
            // InternalTraceryPP.g:488:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getTitleIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getTitleIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Variable__TitleAssignment"


    // $ANTLR start "rule__List__WordAssignment_0"
    // InternalTraceryPP.g:497:1: rule__List__WordAssignment_0 : ( ruleWord ) ;
    public final void rule__List__WordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:501:1: ( ( ruleWord ) )
            // InternalTraceryPP.g:502:2: ( ruleWord )
            {
            // InternalTraceryPP.g:502:2: ( ruleWord )
            // InternalTraceryPP.g:503:3: ruleWord
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


    // $ANTLR start "rule__List__SepAssignment_1_0"
    // InternalTraceryPP.g:512:1: rule__List__SepAssignment_1_0 : ( ruleSeparator ) ;
    public final void rule__List__SepAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:516:1: ( ( ruleSeparator ) )
            // InternalTraceryPP.g:517:2: ( ruleSeparator )
            {
            // InternalTraceryPP.g:517:2: ( ruleSeparator )
            // InternalTraceryPP.g:518:3: ruleSeparator
            {
             before(grammarAccess.getListAccess().getSepSeparatorParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSeparator();

            state._fsp--;

             after(grammarAccess.getListAccess().getSepSeparatorParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__List__SepAssignment_1_0"


    // $ANTLR start "rule__List__WordAssignment_1_1"
    // InternalTraceryPP.g:527:1: rule__List__WordAssignment_1_1 : ( ruleWord ) ;
    public final void rule__List__WordAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:531:1: ( ( ruleWord ) )
            // InternalTraceryPP.g:532:2: ( ruleWord )
            {
            // InternalTraceryPP.g:532:2: ( ruleWord )
            // InternalTraceryPP.g:533:3: ruleWord
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
    // InternalTraceryPP.g:542:1: rule__Word__WordAssignment : ( RULE_STRING ) ;
    public final void rule__Word__WordAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:546:1: ( ( RULE_STRING ) )
            // InternalTraceryPP.g:547:2: ( RULE_STRING )
            {
            // InternalTraceryPP.g:547:2: ( RULE_STRING )
            // InternalTraceryPP.g:548:3: RULE_STRING
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001802L});

}