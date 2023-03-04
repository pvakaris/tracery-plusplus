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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "', '", "' can have values: '"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
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

                if ( (LA1_0==RULE_STRING) ) {
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
    // InternalTraceryPP.g:87:1: ruleStatement : ( ruleTitle ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:91:2: ( ( ruleTitle ) )
            // InternalTraceryPP.g:92:2: ( ruleTitle )
            {
            // InternalTraceryPP.g:92:2: ( ruleTitle )
            // InternalTraceryPP.g:93:3: ruleTitle
            {
             before(grammarAccess.getStatementAccess().getTitleParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getTitleParserRuleCall()); 

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


    // $ANTLR start "rule__List__Alternatives_1_0"
    // InternalTraceryPP.g:202:1: rule__List__Alternatives_1_0 : ( ( ',' ) | ( ', ' ) );
    public final void rule__List__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:206:1: ( ( ',' ) | ( ', ' ) )
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
                    // InternalTraceryPP.g:207:2: ( ',' )
                    {
                    // InternalTraceryPP.g:207:2: ( ',' )
                    // InternalTraceryPP.g:208:3: ','
                    {
                     before(grammarAccess.getListAccess().getCommaKeyword_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getListAccess().getCommaKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:213:2: ( ', ' )
                    {
                    // InternalTraceryPP.g:213:2: ( ', ' )
                    // InternalTraceryPP.g:214:3: ', '
                    {
                     before(grammarAccess.getListAccess().getCommaSpaceKeyword_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getListAccess().getCommaSpaceKeyword_1_0_1()); 

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
    // InternalTraceryPP.g:223:1: rule__Title__Group__0 : rule__Title__Group__0__Impl rule__Title__Group__1 ;
    public final void rule__Title__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:227:1: ( rule__Title__Group__0__Impl rule__Title__Group__1 )
            // InternalTraceryPP.g:228:2: rule__Title__Group__0__Impl rule__Title__Group__1
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
    // InternalTraceryPP.g:235:1: rule__Title__Group__0__Impl : ( ( rule__Title__Start_symbolAssignment_0 ) ) ;
    public final void rule__Title__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:239:1: ( ( ( rule__Title__Start_symbolAssignment_0 ) ) )
            // InternalTraceryPP.g:240:1: ( ( rule__Title__Start_symbolAssignment_0 ) )
            {
            // InternalTraceryPP.g:240:1: ( ( rule__Title__Start_symbolAssignment_0 ) )
            // InternalTraceryPP.g:241:2: ( rule__Title__Start_symbolAssignment_0 )
            {
             before(grammarAccess.getTitleAccess().getStart_symbolAssignment_0()); 
            // InternalTraceryPP.g:242:2: ( rule__Title__Start_symbolAssignment_0 )
            // InternalTraceryPP.g:242:3: rule__Title__Start_symbolAssignment_0
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
    // InternalTraceryPP.g:250:1: rule__Title__Group__1 : rule__Title__Group__1__Impl rule__Title__Group__2 ;
    public final void rule__Title__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:254:1: ( rule__Title__Group__1__Impl rule__Title__Group__2 )
            // InternalTraceryPP.g:255:2: rule__Title__Group__1__Impl rule__Title__Group__2
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
    // InternalTraceryPP.g:262:1: rule__Title__Group__1__Impl : ( ' can have values: ' ) ;
    public final void rule__Title__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:266:1: ( ( ' can have values: ' ) )
            // InternalTraceryPP.g:267:1: ( ' can have values: ' )
            {
            // InternalTraceryPP.g:267:1: ( ' can have values: ' )
            // InternalTraceryPP.g:268:2: ' can have values: '
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
    // InternalTraceryPP.g:277:1: rule__Title__Group__2 : rule__Title__Group__2__Impl ;
    public final void rule__Title__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:281:1: ( rule__Title__Group__2__Impl )
            // InternalTraceryPP.g:282:2: rule__Title__Group__2__Impl
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
    // InternalTraceryPP.g:288:1: rule__Title__Group__2__Impl : ( ( rule__Title__ListAssignment_2 ) ) ;
    public final void rule__Title__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:292:1: ( ( ( rule__Title__ListAssignment_2 ) ) )
            // InternalTraceryPP.g:293:1: ( ( rule__Title__ListAssignment_2 ) )
            {
            // InternalTraceryPP.g:293:1: ( ( rule__Title__ListAssignment_2 ) )
            // InternalTraceryPP.g:294:2: ( rule__Title__ListAssignment_2 )
            {
             before(grammarAccess.getTitleAccess().getListAssignment_2()); 
            // InternalTraceryPP.g:295:2: ( rule__Title__ListAssignment_2 )
            // InternalTraceryPP.g:295:3: rule__Title__ListAssignment_2
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
    // InternalTraceryPP.g:304:1: rule__List__Group__0 : rule__List__Group__0__Impl rule__List__Group__1 ;
    public final void rule__List__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:308:1: ( rule__List__Group__0__Impl rule__List__Group__1 )
            // InternalTraceryPP.g:309:2: rule__List__Group__0__Impl rule__List__Group__1
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
    // InternalTraceryPP.g:316:1: rule__List__Group__0__Impl : ( ( rule__List__WordAssignment_0 ) ) ;
    public final void rule__List__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:320:1: ( ( ( rule__List__WordAssignment_0 ) ) )
            // InternalTraceryPP.g:321:1: ( ( rule__List__WordAssignment_0 ) )
            {
            // InternalTraceryPP.g:321:1: ( ( rule__List__WordAssignment_0 ) )
            // InternalTraceryPP.g:322:2: ( rule__List__WordAssignment_0 )
            {
             before(grammarAccess.getListAccess().getWordAssignment_0()); 
            // InternalTraceryPP.g:323:2: ( rule__List__WordAssignment_0 )
            // InternalTraceryPP.g:323:3: rule__List__WordAssignment_0
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
    // InternalTraceryPP.g:331:1: rule__List__Group__1 : rule__List__Group__1__Impl ;
    public final void rule__List__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:335:1: ( rule__List__Group__1__Impl )
            // InternalTraceryPP.g:336:2: rule__List__Group__1__Impl
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
    // InternalTraceryPP.g:342:1: rule__List__Group__1__Impl : ( ( rule__List__Group_1__0 )* ) ;
    public final void rule__List__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:346:1: ( ( ( rule__List__Group_1__0 )* ) )
            // InternalTraceryPP.g:347:1: ( ( rule__List__Group_1__0 )* )
            {
            // InternalTraceryPP.g:347:1: ( ( rule__List__Group_1__0 )* )
            // InternalTraceryPP.g:348:2: ( rule__List__Group_1__0 )*
            {
             before(grammarAccess.getListAccess().getGroup_1()); 
            // InternalTraceryPP.g:349:2: ( rule__List__Group_1__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=11 && LA3_0<=12)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTraceryPP.g:349:3: rule__List__Group_1__0
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
    // InternalTraceryPP.g:358:1: rule__List__Group_1__0 : rule__List__Group_1__0__Impl rule__List__Group_1__1 ;
    public final void rule__List__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:362:1: ( rule__List__Group_1__0__Impl rule__List__Group_1__1 )
            // InternalTraceryPP.g:363:2: rule__List__Group_1__0__Impl rule__List__Group_1__1
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
    // InternalTraceryPP.g:370:1: rule__List__Group_1__0__Impl : ( ( rule__List__Alternatives_1_0 ) ) ;
    public final void rule__List__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:374:1: ( ( ( rule__List__Alternatives_1_0 ) ) )
            // InternalTraceryPP.g:375:1: ( ( rule__List__Alternatives_1_0 ) )
            {
            // InternalTraceryPP.g:375:1: ( ( rule__List__Alternatives_1_0 ) )
            // InternalTraceryPP.g:376:2: ( rule__List__Alternatives_1_0 )
            {
             before(grammarAccess.getListAccess().getAlternatives_1_0()); 
            // InternalTraceryPP.g:377:2: ( rule__List__Alternatives_1_0 )
            // InternalTraceryPP.g:377:3: rule__List__Alternatives_1_0
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
    // InternalTraceryPP.g:385:1: rule__List__Group_1__1 : rule__List__Group_1__1__Impl ;
    public final void rule__List__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:389:1: ( rule__List__Group_1__1__Impl )
            // InternalTraceryPP.g:390:2: rule__List__Group_1__1__Impl
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
    // InternalTraceryPP.g:396:1: rule__List__Group_1__1__Impl : ( ( rule__List__WordAssignment_1_1 ) ) ;
    public final void rule__List__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:400:1: ( ( ( rule__List__WordAssignment_1_1 ) ) )
            // InternalTraceryPP.g:401:1: ( ( rule__List__WordAssignment_1_1 ) )
            {
            // InternalTraceryPP.g:401:1: ( ( rule__List__WordAssignment_1_1 ) )
            // InternalTraceryPP.g:402:2: ( rule__List__WordAssignment_1_1 )
            {
             before(grammarAccess.getListAccess().getWordAssignment_1_1()); 
            // InternalTraceryPP.g:403:2: ( rule__List__WordAssignment_1_1 )
            // InternalTraceryPP.g:403:3: rule__List__WordAssignment_1_1
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
    // InternalTraceryPP.g:412:1: rule__Model__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Model__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:416:1: ( ( ruleStatement ) )
            // InternalTraceryPP.g:417:2: ( ruleStatement )
            {
            // InternalTraceryPP.g:417:2: ( ruleStatement )
            // InternalTraceryPP.g:418:3: ruleStatement
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
    // InternalTraceryPP.g:427:1: rule__Title__Start_symbolAssignment_0 : ( ruleStartSymbol ) ;
    public final void rule__Title__Start_symbolAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:431:1: ( ( ruleStartSymbol ) )
            // InternalTraceryPP.g:432:2: ( ruleStartSymbol )
            {
            // InternalTraceryPP.g:432:2: ( ruleStartSymbol )
            // InternalTraceryPP.g:433:3: ruleStartSymbol
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
    // InternalTraceryPP.g:442:1: rule__Title__ListAssignment_2 : ( ruleList ) ;
    public final void rule__Title__ListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:446:1: ( ( ruleList ) )
            // InternalTraceryPP.g:447:2: ( ruleList )
            {
            // InternalTraceryPP.g:447:2: ( ruleList )
            // InternalTraceryPP.g:448:3: ruleList
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
    // InternalTraceryPP.g:457:1: rule__StartSymbol__TitleAssignment : ( RULE_STRING ) ;
    public final void rule__StartSymbol__TitleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:461:1: ( ( RULE_STRING ) )
            // InternalTraceryPP.g:462:2: ( RULE_STRING )
            {
            // InternalTraceryPP.g:462:2: ( RULE_STRING )
            // InternalTraceryPP.g:463:3: RULE_STRING
            {
             before(grammarAccess.getStartSymbolAccess().getTitleSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStartSymbolAccess().getTitleSTRINGTerminalRuleCall_0()); 

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
    // InternalTraceryPP.g:472:1: rule__List__WordAssignment_0 : ( ruleWord ) ;
    public final void rule__List__WordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:476:1: ( ( ruleWord ) )
            // InternalTraceryPP.g:477:2: ( ruleWord )
            {
            // InternalTraceryPP.g:477:2: ( ruleWord )
            // InternalTraceryPP.g:478:3: ruleWord
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
    // InternalTraceryPP.g:487:1: rule__List__WordAssignment_1_1 : ( ruleWord ) ;
    public final void rule__List__WordAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:491:1: ( ( ruleWord ) )
            // InternalTraceryPP.g:492:2: ( ruleWord )
            {
            // InternalTraceryPP.g:492:2: ( ruleWord )
            // InternalTraceryPP.g:493:3: ruleWord
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
    // InternalTraceryPP.g:502:1: rule__Word__WordAssignment : ( RULE_STRING ) ;
    public final void rule__Word__WordAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:506:1: ( ( RULE_STRING ) )
            // InternalTraceryPP.g:507:2: ( RULE_STRING )
            {
            // InternalTraceryPP.g:507:2: ( RULE_STRING )
            // InternalTraceryPP.g:508:3: RULE_STRING
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001802L});

}