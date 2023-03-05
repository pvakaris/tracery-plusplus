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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.capitalize'", "'.CAPITALIZE'", "'.s'", "'.a'", "'.ed'", "' can have values: '", "' can be: '", "','", "'or'", "'The story looks like this:'"
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

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

                if ( (LA1_0==RULE_ID||LA1_0==20) ) {
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


    // $ANTLR start "entryRuleDefinition"
    // InternalTraceryPP.g:103:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // InternalTraceryPP.g:104:1: ( ruleDefinition EOF )
            // InternalTraceryPP.g:105:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalTraceryPP.g:112:1: ruleDefinition : ( ruleListDefinition ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:116:2: ( ( ruleListDefinition ) )
            // InternalTraceryPP.g:117:2: ( ruleListDefinition )
            {
            // InternalTraceryPP.g:117:2: ( ruleListDefinition )
            // InternalTraceryPP.g:118:3: ruleListDefinition
            {
             before(grammarAccess.getDefinitionAccess().getListDefinitionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleListDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getListDefinitionParserRuleCall()); 

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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleRule"
    // InternalTraceryPP.g:128:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalTraceryPP.g:129:1: ( ruleRule EOF )
            // InternalTraceryPP.g:130:1: ruleRule EOF
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
    // InternalTraceryPP.g:137:1: ruleRule : ( ruleSentenceRule ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:141:2: ( ( ruleSentenceRule ) )
            // InternalTraceryPP.g:142:2: ( ruleSentenceRule )
            {
            // InternalTraceryPP.g:142:2: ( ruleSentenceRule )
            // InternalTraceryPP.g:143:3: ruleSentenceRule
            {
             before(grammarAccess.getRuleAccess().getSentenceRuleParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleSentenceRule();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getSentenceRuleParserRuleCall()); 

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


    // $ANTLR start "entryRuleStory"
    // InternalTraceryPP.g:153:1: entryRuleStory : ruleStory EOF ;
    public final void entryRuleStory() throws RecognitionException {
        try {
            // InternalTraceryPP.g:154:1: ( ruleStory EOF )
            // InternalTraceryPP.g:155:1: ruleStory EOF
            {
             before(grammarAccess.getStoryRule()); 
            pushFollow(FOLLOW_1);
            ruleStory();

            state._fsp--;

             after(grammarAccess.getStoryRule()); 
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
    // $ANTLR end "entryRuleStory"


    // $ANTLR start "ruleStory"
    // InternalTraceryPP.g:162:1: ruleStory : ( ( rule__Story__Group__0 ) ) ;
    public final void ruleStory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:166:2: ( ( ( rule__Story__Group__0 ) ) )
            // InternalTraceryPP.g:167:2: ( ( rule__Story__Group__0 ) )
            {
            // InternalTraceryPP.g:167:2: ( ( rule__Story__Group__0 ) )
            // InternalTraceryPP.g:168:3: ( rule__Story__Group__0 )
            {
             before(grammarAccess.getStoryAccess().getGroup()); 
            // InternalTraceryPP.g:169:3: ( rule__Story__Group__0 )
            // InternalTraceryPP.g:169:4: rule__Story__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Story__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStoryAccess().getGroup()); 

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
    // $ANTLR end "ruleStory"


    // $ANTLR start "entryRuleListDefinition"
    // InternalTraceryPP.g:178:1: entryRuleListDefinition : ruleListDefinition EOF ;
    public final void entryRuleListDefinition() throws RecognitionException {
        try {
            // InternalTraceryPP.g:179:1: ( ruleListDefinition EOF )
            // InternalTraceryPP.g:180:1: ruleListDefinition EOF
            {
             before(grammarAccess.getListDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleListDefinition();

            state._fsp--;

             after(grammarAccess.getListDefinitionRule()); 
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
    // $ANTLR end "entryRuleListDefinition"


    // $ANTLR start "ruleListDefinition"
    // InternalTraceryPP.g:187:1: ruleListDefinition : ( ( rule__ListDefinition__Group__0 ) ) ;
    public final void ruleListDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:191:2: ( ( ( rule__ListDefinition__Group__0 ) ) )
            // InternalTraceryPP.g:192:2: ( ( rule__ListDefinition__Group__0 ) )
            {
            // InternalTraceryPP.g:192:2: ( ( rule__ListDefinition__Group__0 ) )
            // InternalTraceryPP.g:193:3: ( rule__ListDefinition__Group__0 )
            {
             before(grammarAccess.getListDefinitionAccess().getGroup()); 
            // InternalTraceryPP.g:194:3: ( rule__ListDefinition__Group__0 )
            // InternalTraceryPP.g:194:4: rule__ListDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleListDefinition"


    // $ANTLR start "entryRuleSentenceRule"
    // InternalTraceryPP.g:203:1: entryRuleSentenceRule : ruleSentenceRule EOF ;
    public final void entryRuleSentenceRule() throws RecognitionException {
        try {
            // InternalTraceryPP.g:204:1: ( ruleSentenceRule EOF )
            // InternalTraceryPP.g:205:1: ruleSentenceRule EOF
            {
             before(grammarAccess.getSentenceRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleSentenceRule();

            state._fsp--;

             after(grammarAccess.getSentenceRuleRule()); 
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
    // $ANTLR end "entryRuleSentenceRule"


    // $ANTLR start "ruleSentenceRule"
    // InternalTraceryPP.g:212:1: ruleSentenceRule : ( ( rule__SentenceRule__Start_symbolAssignment ) ) ;
    public final void ruleSentenceRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:216:2: ( ( ( rule__SentenceRule__Start_symbolAssignment ) ) )
            // InternalTraceryPP.g:217:2: ( ( rule__SentenceRule__Start_symbolAssignment ) )
            {
            // InternalTraceryPP.g:217:2: ( ( rule__SentenceRule__Start_symbolAssignment ) )
            // InternalTraceryPP.g:218:3: ( rule__SentenceRule__Start_symbolAssignment )
            {
             before(grammarAccess.getSentenceRuleAccess().getStart_symbolAssignment()); 
            // InternalTraceryPP.g:219:3: ( rule__SentenceRule__Start_symbolAssignment )
            // InternalTraceryPP.g:219:4: rule__SentenceRule__Start_symbolAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SentenceRule__Start_symbolAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSentenceRuleAccess().getStart_symbolAssignment()); 

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
    // $ANTLR end "ruleSentenceRule"


    // $ANTLR start "entryRuleVariable"
    // InternalTraceryPP.g:228:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalTraceryPP.g:229:1: ( ruleVariable EOF )
            // InternalTraceryPP.g:230:1: ruleVariable EOF
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
    // InternalTraceryPP.g:237:1: ruleVariable : ( ( rule__Variable__ValueAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:241:2: ( ( ( rule__Variable__ValueAssignment ) ) )
            // InternalTraceryPP.g:242:2: ( ( rule__Variable__ValueAssignment ) )
            {
            // InternalTraceryPP.g:242:2: ( ( rule__Variable__ValueAssignment ) )
            // InternalTraceryPP.g:243:3: ( rule__Variable__ValueAssignment )
            {
             before(grammarAccess.getVariableAccess().getValueAssignment()); 
            // InternalTraceryPP.g:244:3: ( rule__Variable__ValueAssignment )
            // InternalTraceryPP.g:244:4: rule__Variable__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Variable__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getValueAssignment()); 

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
    // InternalTraceryPP.g:253:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // InternalTraceryPP.g:254:1: ( ruleList EOF )
            // InternalTraceryPP.g:255:1: ruleList EOF
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
    // InternalTraceryPP.g:262:1: ruleList : ( ( rule__List__Group__0 ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:266:2: ( ( ( rule__List__Group__0 ) ) )
            // InternalTraceryPP.g:267:2: ( ( rule__List__Group__0 ) )
            {
            // InternalTraceryPP.g:267:2: ( ( rule__List__Group__0 ) )
            // InternalTraceryPP.g:268:3: ( rule__List__Group__0 )
            {
             before(grammarAccess.getListAccess().getGroup()); 
            // InternalTraceryPP.g:269:3: ( rule__List__Group__0 )
            // InternalTraceryPP.g:269:4: rule__List__Group__0
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
    // InternalTraceryPP.g:278:1: entryRuleSeparator : ruleSeparator EOF ;
    public final void entryRuleSeparator() throws RecognitionException {
        try {
            // InternalTraceryPP.g:279:1: ( ruleSeparator EOF )
            // InternalTraceryPP.g:280:1: ruleSeparator EOF
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
    // InternalTraceryPP.g:287:1: ruleSeparator : ( ( rule__Separator__Alternatives ) ) ;
    public final void ruleSeparator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:291:2: ( ( ( rule__Separator__Alternatives ) ) )
            // InternalTraceryPP.g:292:2: ( ( rule__Separator__Alternatives ) )
            {
            // InternalTraceryPP.g:292:2: ( ( rule__Separator__Alternatives ) )
            // InternalTraceryPP.g:293:3: ( rule__Separator__Alternatives )
            {
             before(grammarAccess.getSeparatorAccess().getAlternatives()); 
            // InternalTraceryPP.g:294:3: ( rule__Separator__Alternatives )
            // InternalTraceryPP.g:294:4: rule__Separator__Alternatives
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


    // $ANTLR start "entryRuleStoryVariable"
    // InternalTraceryPP.g:303:1: entryRuleStoryVariable : ruleStoryVariable EOF ;
    public final void entryRuleStoryVariable() throws RecognitionException {
        try {
            // InternalTraceryPP.g:304:1: ( ruleStoryVariable EOF )
            // InternalTraceryPP.g:305:1: ruleStoryVariable EOF
            {
             before(grammarAccess.getStoryVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleStoryVariable();

            state._fsp--;

             after(grammarAccess.getStoryVariableRule()); 
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
    // $ANTLR end "entryRuleStoryVariable"


    // $ANTLR start "ruleStoryVariable"
    // InternalTraceryPP.g:312:1: ruleStoryVariable : ( ( rule__StoryVariable__Group__0 ) ) ;
    public final void ruleStoryVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:316:2: ( ( ( rule__StoryVariable__Group__0 ) ) )
            // InternalTraceryPP.g:317:2: ( ( rule__StoryVariable__Group__0 ) )
            {
            // InternalTraceryPP.g:317:2: ( ( rule__StoryVariable__Group__0 ) )
            // InternalTraceryPP.g:318:3: ( rule__StoryVariable__Group__0 )
            {
             before(grammarAccess.getStoryVariableAccess().getGroup()); 
            // InternalTraceryPP.g:319:3: ( rule__StoryVariable__Group__0 )
            // InternalTraceryPP.g:319:4: rule__StoryVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StoryVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStoryVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleStoryVariable"


    // $ANTLR start "entryRuleModifier"
    // InternalTraceryPP.g:328:1: entryRuleModifier : ruleModifier EOF ;
    public final void entryRuleModifier() throws RecognitionException {
        try {
            // InternalTraceryPP.g:329:1: ( ruleModifier EOF )
            // InternalTraceryPP.g:330:1: ruleModifier EOF
            {
             before(grammarAccess.getModifierRule()); 
            pushFollow(FOLLOW_1);
            ruleModifier();

            state._fsp--;

             after(grammarAccess.getModifierRule()); 
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
    // $ANTLR end "entryRuleModifier"


    // $ANTLR start "ruleModifier"
    // InternalTraceryPP.g:337:1: ruleModifier : ( ( rule__Modifier__Alternatives ) ) ;
    public final void ruleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:341:2: ( ( ( rule__Modifier__Alternatives ) ) )
            // InternalTraceryPP.g:342:2: ( ( rule__Modifier__Alternatives ) )
            {
            // InternalTraceryPP.g:342:2: ( ( rule__Modifier__Alternatives ) )
            // InternalTraceryPP.g:343:3: ( rule__Modifier__Alternatives )
            {
             before(grammarAccess.getModifierAccess().getAlternatives()); 
            // InternalTraceryPP.g:344:3: ( rule__Modifier__Alternatives )
            // InternalTraceryPP.g:344:4: rule__Modifier__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Modifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModifierAccess().getAlternatives()); 

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
    // $ANTLR end "ruleModifier"


    // $ANTLR start "entryRuleCapitalizationModifier"
    // InternalTraceryPP.g:353:1: entryRuleCapitalizationModifier : ruleCapitalizationModifier EOF ;
    public final void entryRuleCapitalizationModifier() throws RecognitionException {
        try {
            // InternalTraceryPP.g:354:1: ( ruleCapitalizationModifier EOF )
            // InternalTraceryPP.g:355:1: ruleCapitalizationModifier EOF
            {
             before(grammarAccess.getCapitalizationModifierRule()); 
            pushFollow(FOLLOW_1);
            ruleCapitalizationModifier();

            state._fsp--;

             after(grammarAccess.getCapitalizationModifierRule()); 
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
    // $ANTLR end "entryRuleCapitalizationModifier"


    // $ANTLR start "ruleCapitalizationModifier"
    // InternalTraceryPP.g:362:1: ruleCapitalizationModifier : ( '.capitalize' ) ;
    public final void ruleCapitalizationModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:366:2: ( ( '.capitalize' ) )
            // InternalTraceryPP.g:367:2: ( '.capitalize' )
            {
            // InternalTraceryPP.g:367:2: ( '.capitalize' )
            // InternalTraceryPP.g:368:3: '.capitalize'
            {
             before(grammarAccess.getCapitalizationModifierAccess().getCapitalizeKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getCapitalizationModifierAccess().getCapitalizeKeyword()); 

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
    // $ANTLR end "ruleCapitalizationModifier"


    // $ANTLR start "entryRuleFullCapitalizationModifier"
    // InternalTraceryPP.g:378:1: entryRuleFullCapitalizationModifier : ruleFullCapitalizationModifier EOF ;
    public final void entryRuleFullCapitalizationModifier() throws RecognitionException {
        try {
            // InternalTraceryPP.g:379:1: ( ruleFullCapitalizationModifier EOF )
            // InternalTraceryPP.g:380:1: ruleFullCapitalizationModifier EOF
            {
             before(grammarAccess.getFullCapitalizationModifierRule()); 
            pushFollow(FOLLOW_1);
            ruleFullCapitalizationModifier();

            state._fsp--;

             after(grammarAccess.getFullCapitalizationModifierRule()); 
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
    // $ANTLR end "entryRuleFullCapitalizationModifier"


    // $ANTLR start "ruleFullCapitalizationModifier"
    // InternalTraceryPP.g:387:1: ruleFullCapitalizationModifier : ( '.CAPITALIZE' ) ;
    public final void ruleFullCapitalizationModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:391:2: ( ( '.CAPITALIZE' ) )
            // InternalTraceryPP.g:392:2: ( '.CAPITALIZE' )
            {
            // InternalTraceryPP.g:392:2: ( '.CAPITALIZE' )
            // InternalTraceryPP.g:393:3: '.CAPITALIZE'
            {
             before(grammarAccess.getFullCapitalizationModifierAccess().getCAPITALIZEKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFullCapitalizationModifierAccess().getCAPITALIZEKeyword()); 

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
    // $ANTLR end "ruleFullCapitalizationModifier"


    // $ANTLR start "entryRulePluralityModifier"
    // InternalTraceryPP.g:403:1: entryRulePluralityModifier : rulePluralityModifier EOF ;
    public final void entryRulePluralityModifier() throws RecognitionException {
        try {
            // InternalTraceryPP.g:404:1: ( rulePluralityModifier EOF )
            // InternalTraceryPP.g:405:1: rulePluralityModifier EOF
            {
             before(grammarAccess.getPluralityModifierRule()); 
            pushFollow(FOLLOW_1);
            rulePluralityModifier();

            state._fsp--;

             after(grammarAccess.getPluralityModifierRule()); 
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
    // $ANTLR end "entryRulePluralityModifier"


    // $ANTLR start "rulePluralityModifier"
    // InternalTraceryPP.g:412:1: rulePluralityModifier : ( '.s' ) ;
    public final void rulePluralityModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:416:2: ( ( '.s' ) )
            // InternalTraceryPP.g:417:2: ( '.s' )
            {
            // InternalTraceryPP.g:417:2: ( '.s' )
            // InternalTraceryPP.g:418:3: '.s'
            {
             before(grammarAccess.getPluralityModifierAccess().getSKeyword()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPluralityModifierAccess().getSKeyword()); 

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
    // $ANTLR end "rulePluralityModifier"


    // $ANTLR start "entryRuleArticleModifier"
    // InternalTraceryPP.g:428:1: entryRuleArticleModifier : ruleArticleModifier EOF ;
    public final void entryRuleArticleModifier() throws RecognitionException {
        try {
            // InternalTraceryPP.g:429:1: ( ruleArticleModifier EOF )
            // InternalTraceryPP.g:430:1: ruleArticleModifier EOF
            {
             before(grammarAccess.getArticleModifierRule()); 
            pushFollow(FOLLOW_1);
            ruleArticleModifier();

            state._fsp--;

             after(grammarAccess.getArticleModifierRule()); 
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
    // $ANTLR end "entryRuleArticleModifier"


    // $ANTLR start "ruleArticleModifier"
    // InternalTraceryPP.g:437:1: ruleArticleModifier : ( '.a' ) ;
    public final void ruleArticleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:441:2: ( ( '.a' ) )
            // InternalTraceryPP.g:442:2: ( '.a' )
            {
            // InternalTraceryPP.g:442:2: ( '.a' )
            // InternalTraceryPP.g:443:3: '.a'
            {
             before(grammarAccess.getArticleModifierAccess().getAKeyword()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getArticleModifierAccess().getAKeyword()); 

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
    // $ANTLR end "ruleArticleModifier"


    // $ANTLR start "entryRulePastTenseModifier"
    // InternalTraceryPP.g:453:1: entryRulePastTenseModifier : rulePastTenseModifier EOF ;
    public final void entryRulePastTenseModifier() throws RecognitionException {
        try {
            // InternalTraceryPP.g:454:1: ( rulePastTenseModifier EOF )
            // InternalTraceryPP.g:455:1: rulePastTenseModifier EOF
            {
             before(grammarAccess.getPastTenseModifierRule()); 
            pushFollow(FOLLOW_1);
            rulePastTenseModifier();

            state._fsp--;

             after(grammarAccess.getPastTenseModifierRule()); 
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
    // $ANTLR end "entryRulePastTenseModifier"


    // $ANTLR start "rulePastTenseModifier"
    // InternalTraceryPP.g:462:1: rulePastTenseModifier : ( '.ed' ) ;
    public final void rulePastTenseModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:466:2: ( ( '.ed' ) )
            // InternalTraceryPP.g:467:2: ( '.ed' )
            {
            // InternalTraceryPP.g:467:2: ( '.ed' )
            // InternalTraceryPP.g:468:3: '.ed'
            {
             before(grammarAccess.getPastTenseModifierAccess().getEdKeyword()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPastTenseModifierAccess().getEdKeyword()); 

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
    // $ANTLR end "rulePastTenseModifier"


    // $ANTLR start "entryRuleWord"
    // InternalTraceryPP.g:478:1: entryRuleWord : ruleWord EOF ;
    public final void entryRuleWord() throws RecognitionException {
        try {
            // InternalTraceryPP.g:479:1: ( ruleWord EOF )
            // InternalTraceryPP.g:480:1: ruleWord EOF
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
    // InternalTraceryPP.g:487:1: ruleWord : ( ( rule__Word__ValueAssignment ) ) ;
    public final void ruleWord() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:491:2: ( ( ( rule__Word__ValueAssignment ) ) )
            // InternalTraceryPP.g:492:2: ( ( rule__Word__ValueAssignment ) )
            {
            // InternalTraceryPP.g:492:2: ( ( rule__Word__ValueAssignment ) )
            // InternalTraceryPP.g:493:3: ( rule__Word__ValueAssignment )
            {
             before(grammarAccess.getWordAccess().getValueAssignment()); 
            // InternalTraceryPP.g:494:3: ( rule__Word__ValueAssignment )
            // InternalTraceryPP.g:494:4: rule__Word__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Word__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getWordAccess().getValueAssignment()); 

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


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalTraceryPP.g:502:1: rule__Statement__Alternatives : ( ( ruleDefinition ) | ( ruleRule ) | ( ruleStory ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:506:1: ( ( ruleDefinition ) | ( ruleRule ) | ( ruleStory ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=16 && LA2_1<=17)) ) {
                    alt2=1;
                }
                else if ( (LA2_1==EOF||LA2_1==RULE_ID||LA2_1==20) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==20) ) {
                alt2=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTraceryPP.g:507:2: ( ruleDefinition )
                    {
                    // InternalTraceryPP.g:507:2: ( ruleDefinition )
                    // InternalTraceryPP.g:508:3: ruleDefinition
                    {
                     before(grammarAccess.getStatementAccess().getDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDefinition();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:513:2: ( ruleRule )
                    {
                    // InternalTraceryPP.g:513:2: ( ruleRule )
                    // InternalTraceryPP.g:514:3: ruleRule
                    {
                     before(grammarAccess.getStatementAccess().getRuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRule();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getRuleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPP.g:519:2: ( ruleStory )
                    {
                    // InternalTraceryPP.g:519:2: ( ruleStory )
                    // InternalTraceryPP.g:520:3: ruleStory
                    {
                     before(grammarAccess.getStatementAccess().getStoryParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleStory();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getStoryParserRuleCall_2()); 

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


    // $ANTLR start "rule__Story__StoryAlternatives_1_0"
    // InternalTraceryPP.g:529:1: rule__Story__StoryAlternatives_1_0 : ( ( ruleWord ) | ( ruleStoryVariable ) );
    public final void rule__Story__StoryAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:533:1: ( ( ruleWord ) | ( ruleStoryVariable ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTraceryPP.g:534:2: ( ruleWord )
                    {
                    // InternalTraceryPP.g:534:2: ( ruleWord )
                    // InternalTraceryPP.g:535:3: ruleWord
                    {
                     before(grammarAccess.getStoryAccess().getStoryWordParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWord();

                    state._fsp--;

                     after(grammarAccess.getStoryAccess().getStoryWordParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:540:2: ( ruleStoryVariable )
                    {
                    // InternalTraceryPP.g:540:2: ( ruleStoryVariable )
                    // InternalTraceryPP.g:541:3: ruleStoryVariable
                    {
                     before(grammarAccess.getStoryAccess().getStoryStoryVariableParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStoryVariable();

                    state._fsp--;

                     after(grammarAccess.getStoryAccess().getStoryStoryVariableParserRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__Story__StoryAlternatives_1_0"


    // $ANTLR start "rule__ListDefinition__Alternatives_1"
    // InternalTraceryPP.g:550:1: rule__ListDefinition__Alternatives_1 : ( ( ' can have values: ' ) | ( ' can be: ' ) );
    public final void rule__ListDefinition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:554:1: ( ( ' can have values: ' ) | ( ' can be: ' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTraceryPP.g:555:2: ( ' can have values: ' )
                    {
                    // InternalTraceryPP.g:555:2: ( ' can have values: ' )
                    // InternalTraceryPP.g:556:3: ' can have values: '
                    {
                     before(grammarAccess.getListDefinitionAccess().getCanHaveValuesKeyword_1_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getListDefinitionAccess().getCanHaveValuesKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:561:2: ( ' can be: ' )
                    {
                    // InternalTraceryPP.g:561:2: ( ' can be: ' )
                    // InternalTraceryPP.g:562:3: ' can be: '
                    {
                     before(grammarAccess.getListDefinitionAccess().getCanBeKeyword_1_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getListDefinitionAccess().getCanBeKeyword_1_1()); 

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
    // $ANTLR end "rule__ListDefinition__Alternatives_1"


    // $ANTLR start "rule__Separator__Alternatives"
    // InternalTraceryPP.g:571:1: rule__Separator__Alternatives : ( ( ',' ) | ( 'or' ) );
    public final void rule__Separator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:575:1: ( ( ',' ) | ( 'or' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTraceryPP.g:576:2: ( ',' )
                    {
                    // InternalTraceryPP.g:576:2: ( ',' )
                    // InternalTraceryPP.g:577:3: ','
                    {
                     before(grammarAccess.getSeparatorAccess().getCommaKeyword_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getSeparatorAccess().getCommaKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:582:2: ( 'or' )
                    {
                    // InternalTraceryPP.g:582:2: ( 'or' )
                    // InternalTraceryPP.g:583:3: 'or'
                    {
                     before(grammarAccess.getSeparatorAccess().getOrKeyword_1()); 
                    match(input,19,FOLLOW_2); 
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


    // $ANTLR start "rule__Modifier__Alternatives"
    // InternalTraceryPP.g:592:1: rule__Modifier__Alternatives : ( ( ruleCapitalizationModifier ) | ( ruleFullCapitalizationModifier ) | ( rulePluralityModifier ) | ( ruleArticleModifier ) | ( rulePastTenseModifier ) );
    public final void rule__Modifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:596:1: ( ( ruleCapitalizationModifier ) | ( ruleFullCapitalizationModifier ) | ( rulePluralityModifier ) | ( ruleArticleModifier ) | ( rulePastTenseModifier ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            case 14:
                {
                alt6=4;
                }
                break;
            case 15:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalTraceryPP.g:597:2: ( ruleCapitalizationModifier )
                    {
                    // InternalTraceryPP.g:597:2: ( ruleCapitalizationModifier )
                    // InternalTraceryPP.g:598:3: ruleCapitalizationModifier
                    {
                     before(grammarAccess.getModifierAccess().getCapitalizationModifierParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCapitalizationModifier();

                    state._fsp--;

                     after(grammarAccess.getModifierAccess().getCapitalizationModifierParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:603:2: ( ruleFullCapitalizationModifier )
                    {
                    // InternalTraceryPP.g:603:2: ( ruleFullCapitalizationModifier )
                    // InternalTraceryPP.g:604:3: ruleFullCapitalizationModifier
                    {
                     before(grammarAccess.getModifierAccess().getFullCapitalizationModifierParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFullCapitalizationModifier();

                    state._fsp--;

                     after(grammarAccess.getModifierAccess().getFullCapitalizationModifierParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPP.g:609:2: ( rulePluralityModifier )
                    {
                    // InternalTraceryPP.g:609:2: ( rulePluralityModifier )
                    // InternalTraceryPP.g:610:3: rulePluralityModifier
                    {
                     before(grammarAccess.getModifierAccess().getPluralityModifierParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePluralityModifier();

                    state._fsp--;

                     after(grammarAccess.getModifierAccess().getPluralityModifierParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTraceryPP.g:615:2: ( ruleArticleModifier )
                    {
                    // InternalTraceryPP.g:615:2: ( ruleArticleModifier )
                    // InternalTraceryPP.g:616:3: ruleArticleModifier
                    {
                     before(grammarAccess.getModifierAccess().getArticleModifierParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleArticleModifier();

                    state._fsp--;

                     after(grammarAccess.getModifierAccess().getArticleModifierParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTraceryPP.g:621:2: ( rulePastTenseModifier )
                    {
                    // InternalTraceryPP.g:621:2: ( rulePastTenseModifier )
                    // InternalTraceryPP.g:622:3: rulePastTenseModifier
                    {
                     before(grammarAccess.getModifierAccess().getPastTenseModifierParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    rulePastTenseModifier();

                    state._fsp--;

                     after(grammarAccess.getModifierAccess().getPastTenseModifierParserRuleCall_4()); 

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
    // $ANTLR end "rule__Modifier__Alternatives"


    // $ANTLR start "rule__Story__Group__0"
    // InternalTraceryPP.g:631:1: rule__Story__Group__0 : rule__Story__Group__0__Impl rule__Story__Group__1 ;
    public final void rule__Story__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:635:1: ( rule__Story__Group__0__Impl rule__Story__Group__1 )
            // InternalTraceryPP.g:636:2: rule__Story__Group__0__Impl rule__Story__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Story__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Story__Group__1();

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
    // $ANTLR end "rule__Story__Group__0"


    // $ANTLR start "rule__Story__Group__0__Impl"
    // InternalTraceryPP.g:643:1: rule__Story__Group__0__Impl : ( 'The story looks like this:' ) ;
    public final void rule__Story__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:647:1: ( ( 'The story looks like this:' ) )
            // InternalTraceryPP.g:648:1: ( 'The story looks like this:' )
            {
            // InternalTraceryPP.g:648:1: ( 'The story looks like this:' )
            // InternalTraceryPP.g:649:2: 'The story looks like this:'
            {
             before(grammarAccess.getStoryAccess().getTheStoryLooksLikeThisKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStoryAccess().getTheStoryLooksLikeThisKeyword_0()); 

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
    // $ANTLR end "rule__Story__Group__0__Impl"


    // $ANTLR start "rule__Story__Group__1"
    // InternalTraceryPP.g:658:1: rule__Story__Group__1 : rule__Story__Group__1__Impl ;
    public final void rule__Story__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:662:1: ( rule__Story__Group__1__Impl )
            // InternalTraceryPP.g:663:2: rule__Story__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Story__Group__1__Impl();

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
    // $ANTLR end "rule__Story__Group__1"


    // $ANTLR start "rule__Story__Group__1__Impl"
    // InternalTraceryPP.g:669:1: rule__Story__Group__1__Impl : ( ( rule__Story__StoryAssignment_1 )* ) ;
    public final void rule__Story__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:673:1: ( ( ( rule__Story__StoryAssignment_1 )* ) )
            // InternalTraceryPP.g:674:1: ( ( rule__Story__StoryAssignment_1 )* )
            {
            // InternalTraceryPP.g:674:1: ( ( rule__Story__StoryAssignment_1 )* )
            // InternalTraceryPP.g:675:2: ( rule__Story__StoryAssignment_1 )*
            {
             before(grammarAccess.getStoryAccess().getStoryAssignment_1()); 
            // InternalTraceryPP.g:676:2: ( rule__Story__StoryAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_STRING)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTraceryPP.g:676:3: rule__Story__StoryAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Story__StoryAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getStoryAccess().getStoryAssignment_1()); 

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
    // $ANTLR end "rule__Story__Group__1__Impl"


    // $ANTLR start "rule__ListDefinition__Group__0"
    // InternalTraceryPP.g:685:1: rule__ListDefinition__Group__0 : rule__ListDefinition__Group__0__Impl rule__ListDefinition__Group__1 ;
    public final void rule__ListDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:689:1: ( rule__ListDefinition__Group__0__Impl rule__ListDefinition__Group__1 )
            // InternalTraceryPP.g:690:2: rule__ListDefinition__Group__0__Impl rule__ListDefinition__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ListDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListDefinition__Group__1();

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
    // $ANTLR end "rule__ListDefinition__Group__0"


    // $ANTLR start "rule__ListDefinition__Group__0__Impl"
    // InternalTraceryPP.g:697:1: rule__ListDefinition__Group__0__Impl : ( ( rule__ListDefinition__Start_symbolAssignment_0 ) ) ;
    public final void rule__ListDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:701:1: ( ( ( rule__ListDefinition__Start_symbolAssignment_0 ) ) )
            // InternalTraceryPP.g:702:1: ( ( rule__ListDefinition__Start_symbolAssignment_0 ) )
            {
            // InternalTraceryPP.g:702:1: ( ( rule__ListDefinition__Start_symbolAssignment_0 ) )
            // InternalTraceryPP.g:703:2: ( rule__ListDefinition__Start_symbolAssignment_0 )
            {
             before(grammarAccess.getListDefinitionAccess().getStart_symbolAssignment_0()); 
            // InternalTraceryPP.g:704:2: ( rule__ListDefinition__Start_symbolAssignment_0 )
            // InternalTraceryPP.g:704:3: rule__ListDefinition__Start_symbolAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ListDefinition__Start_symbolAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getListDefinitionAccess().getStart_symbolAssignment_0()); 

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
    // $ANTLR end "rule__ListDefinition__Group__0__Impl"


    // $ANTLR start "rule__ListDefinition__Group__1"
    // InternalTraceryPP.g:712:1: rule__ListDefinition__Group__1 : rule__ListDefinition__Group__1__Impl rule__ListDefinition__Group__2 ;
    public final void rule__ListDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:716:1: ( rule__ListDefinition__Group__1__Impl rule__ListDefinition__Group__2 )
            // InternalTraceryPP.g:717:2: rule__ListDefinition__Group__1__Impl rule__ListDefinition__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ListDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListDefinition__Group__2();

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
    // $ANTLR end "rule__ListDefinition__Group__1"


    // $ANTLR start "rule__ListDefinition__Group__1__Impl"
    // InternalTraceryPP.g:724:1: rule__ListDefinition__Group__1__Impl : ( ( rule__ListDefinition__Alternatives_1 ) ) ;
    public final void rule__ListDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:728:1: ( ( ( rule__ListDefinition__Alternatives_1 ) ) )
            // InternalTraceryPP.g:729:1: ( ( rule__ListDefinition__Alternatives_1 ) )
            {
            // InternalTraceryPP.g:729:1: ( ( rule__ListDefinition__Alternatives_1 ) )
            // InternalTraceryPP.g:730:2: ( rule__ListDefinition__Alternatives_1 )
            {
             before(grammarAccess.getListDefinitionAccess().getAlternatives_1()); 
            // InternalTraceryPP.g:731:2: ( rule__ListDefinition__Alternatives_1 )
            // InternalTraceryPP.g:731:3: rule__ListDefinition__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__ListDefinition__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getListDefinitionAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__ListDefinition__Group__1__Impl"


    // $ANTLR start "rule__ListDefinition__Group__2"
    // InternalTraceryPP.g:739:1: rule__ListDefinition__Group__2 : rule__ListDefinition__Group__2__Impl ;
    public final void rule__ListDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:743:1: ( rule__ListDefinition__Group__2__Impl )
            // InternalTraceryPP.g:744:2: rule__ListDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListDefinition__Group__2__Impl();

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
    // $ANTLR end "rule__ListDefinition__Group__2"


    // $ANTLR start "rule__ListDefinition__Group__2__Impl"
    // InternalTraceryPP.g:750:1: rule__ListDefinition__Group__2__Impl : ( ( rule__ListDefinition__ListAssignment_2 ) ) ;
    public final void rule__ListDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:754:1: ( ( ( rule__ListDefinition__ListAssignment_2 ) ) )
            // InternalTraceryPP.g:755:1: ( ( rule__ListDefinition__ListAssignment_2 ) )
            {
            // InternalTraceryPP.g:755:1: ( ( rule__ListDefinition__ListAssignment_2 ) )
            // InternalTraceryPP.g:756:2: ( rule__ListDefinition__ListAssignment_2 )
            {
             before(grammarAccess.getListDefinitionAccess().getListAssignment_2()); 
            // InternalTraceryPP.g:757:2: ( rule__ListDefinition__ListAssignment_2 )
            // InternalTraceryPP.g:757:3: rule__ListDefinition__ListAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ListDefinition__ListAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getListDefinitionAccess().getListAssignment_2()); 

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
    // $ANTLR end "rule__ListDefinition__Group__2__Impl"


    // $ANTLR start "rule__List__Group__0"
    // InternalTraceryPP.g:766:1: rule__List__Group__0 : rule__List__Group__0__Impl rule__List__Group__1 ;
    public final void rule__List__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:770:1: ( rule__List__Group__0__Impl rule__List__Group__1 )
            // InternalTraceryPP.g:771:2: rule__List__Group__0__Impl rule__List__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalTraceryPP.g:778:1: rule__List__Group__0__Impl : ( ( rule__List__WordsAssignment_0 ) ) ;
    public final void rule__List__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:782:1: ( ( ( rule__List__WordsAssignment_0 ) ) )
            // InternalTraceryPP.g:783:1: ( ( rule__List__WordsAssignment_0 ) )
            {
            // InternalTraceryPP.g:783:1: ( ( rule__List__WordsAssignment_0 ) )
            // InternalTraceryPP.g:784:2: ( rule__List__WordsAssignment_0 )
            {
             before(grammarAccess.getListAccess().getWordsAssignment_0()); 
            // InternalTraceryPP.g:785:2: ( rule__List__WordsAssignment_0 )
            // InternalTraceryPP.g:785:3: rule__List__WordsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__List__WordsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getWordsAssignment_0()); 

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
    // InternalTraceryPP.g:793:1: rule__List__Group__1 : rule__List__Group__1__Impl ;
    public final void rule__List__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:797:1: ( rule__List__Group__1__Impl )
            // InternalTraceryPP.g:798:2: rule__List__Group__1__Impl
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
    // InternalTraceryPP.g:804:1: rule__List__Group__1__Impl : ( ( rule__List__Group_1__0 )* ) ;
    public final void rule__List__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:808:1: ( ( ( rule__List__Group_1__0 )* ) )
            // InternalTraceryPP.g:809:1: ( ( rule__List__Group_1__0 )* )
            {
            // InternalTraceryPP.g:809:1: ( ( rule__List__Group_1__0 )* )
            // InternalTraceryPP.g:810:2: ( rule__List__Group_1__0 )*
            {
             before(grammarAccess.getListAccess().getGroup_1()); 
            // InternalTraceryPP.g:811:2: ( rule__List__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=18 && LA8_0<=19)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTraceryPP.g:811:3: rule__List__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__List__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalTraceryPP.g:820:1: rule__List__Group_1__0 : rule__List__Group_1__0__Impl rule__List__Group_1__1 ;
    public final void rule__List__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:824:1: ( rule__List__Group_1__0__Impl rule__List__Group_1__1 )
            // InternalTraceryPP.g:825:2: rule__List__Group_1__0__Impl rule__List__Group_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalTraceryPP.g:832:1: rule__List__Group_1__0__Impl : ( ( rule__List__SepAssignment_1_0 ) ) ;
    public final void rule__List__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:836:1: ( ( ( rule__List__SepAssignment_1_0 ) ) )
            // InternalTraceryPP.g:837:1: ( ( rule__List__SepAssignment_1_0 ) )
            {
            // InternalTraceryPP.g:837:1: ( ( rule__List__SepAssignment_1_0 ) )
            // InternalTraceryPP.g:838:2: ( rule__List__SepAssignment_1_0 )
            {
             before(grammarAccess.getListAccess().getSepAssignment_1_0()); 
            // InternalTraceryPP.g:839:2: ( rule__List__SepAssignment_1_0 )
            // InternalTraceryPP.g:839:3: rule__List__SepAssignment_1_0
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
    // InternalTraceryPP.g:847:1: rule__List__Group_1__1 : rule__List__Group_1__1__Impl ;
    public final void rule__List__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:851:1: ( rule__List__Group_1__1__Impl )
            // InternalTraceryPP.g:852:2: rule__List__Group_1__1__Impl
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
    // InternalTraceryPP.g:858:1: rule__List__Group_1__1__Impl : ( ( rule__List__WordAssignment_1_1 ) ) ;
    public final void rule__List__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:862:1: ( ( ( rule__List__WordAssignment_1_1 ) ) )
            // InternalTraceryPP.g:863:1: ( ( rule__List__WordAssignment_1_1 ) )
            {
            // InternalTraceryPP.g:863:1: ( ( rule__List__WordAssignment_1_1 ) )
            // InternalTraceryPP.g:864:2: ( rule__List__WordAssignment_1_1 )
            {
             before(grammarAccess.getListAccess().getWordAssignment_1_1()); 
            // InternalTraceryPP.g:865:2: ( rule__List__WordAssignment_1_1 )
            // InternalTraceryPP.g:865:3: rule__List__WordAssignment_1_1
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


    // $ANTLR start "rule__StoryVariable__Group__0"
    // InternalTraceryPP.g:874:1: rule__StoryVariable__Group__0 : rule__StoryVariable__Group__0__Impl rule__StoryVariable__Group__1 ;
    public final void rule__StoryVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:878:1: ( rule__StoryVariable__Group__0__Impl rule__StoryVariable__Group__1 )
            // InternalTraceryPP.g:879:2: rule__StoryVariable__Group__0__Impl rule__StoryVariable__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__StoryVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoryVariable__Group__1();

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
    // $ANTLR end "rule__StoryVariable__Group__0"


    // $ANTLR start "rule__StoryVariable__Group__0__Impl"
    // InternalTraceryPP.g:886:1: rule__StoryVariable__Group__0__Impl : ( ( rule__StoryVariable__ValueAssignment_0 ) ) ;
    public final void rule__StoryVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:890:1: ( ( ( rule__StoryVariable__ValueAssignment_0 ) ) )
            // InternalTraceryPP.g:891:1: ( ( rule__StoryVariable__ValueAssignment_0 ) )
            {
            // InternalTraceryPP.g:891:1: ( ( rule__StoryVariable__ValueAssignment_0 ) )
            // InternalTraceryPP.g:892:2: ( rule__StoryVariable__ValueAssignment_0 )
            {
             before(grammarAccess.getStoryVariableAccess().getValueAssignment_0()); 
            // InternalTraceryPP.g:893:2: ( rule__StoryVariable__ValueAssignment_0 )
            // InternalTraceryPP.g:893:3: rule__StoryVariable__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StoryVariable__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStoryVariableAccess().getValueAssignment_0()); 

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
    // $ANTLR end "rule__StoryVariable__Group__0__Impl"


    // $ANTLR start "rule__StoryVariable__Group__1"
    // InternalTraceryPP.g:901:1: rule__StoryVariable__Group__1 : rule__StoryVariable__Group__1__Impl ;
    public final void rule__StoryVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:905:1: ( rule__StoryVariable__Group__1__Impl )
            // InternalTraceryPP.g:906:2: rule__StoryVariable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StoryVariable__Group__1__Impl();

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
    // $ANTLR end "rule__StoryVariable__Group__1"


    // $ANTLR start "rule__StoryVariable__Group__1__Impl"
    // InternalTraceryPP.g:912:1: rule__StoryVariable__Group__1__Impl : ( ( rule__StoryVariable__ModifiersAssignment_1 )* ) ;
    public final void rule__StoryVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:916:1: ( ( ( rule__StoryVariable__ModifiersAssignment_1 )* ) )
            // InternalTraceryPP.g:917:1: ( ( rule__StoryVariable__ModifiersAssignment_1 )* )
            {
            // InternalTraceryPP.g:917:1: ( ( rule__StoryVariable__ModifiersAssignment_1 )* )
            // InternalTraceryPP.g:918:2: ( rule__StoryVariable__ModifiersAssignment_1 )*
            {
             before(grammarAccess.getStoryVariableAccess().getModifiersAssignment_1()); 
            // InternalTraceryPP.g:919:2: ( rule__StoryVariable__ModifiersAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=11 && LA9_0<=15)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTraceryPP.g:919:3: rule__StoryVariable__ModifiersAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__StoryVariable__ModifiersAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getStoryVariableAccess().getModifiersAssignment_1()); 

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
    // $ANTLR end "rule__StoryVariable__Group__1__Impl"


    // $ANTLR start "rule__Model__StatementsAssignment"
    // InternalTraceryPP.g:928:1: rule__Model__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__Model__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:932:1: ( ( ruleStatement ) )
            // InternalTraceryPP.g:933:2: ( ruleStatement )
            {
            // InternalTraceryPP.g:933:2: ( ruleStatement )
            // InternalTraceryPP.g:934:3: ruleStatement
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


    // $ANTLR start "rule__Story__StoryAssignment_1"
    // InternalTraceryPP.g:943:1: rule__Story__StoryAssignment_1 : ( ( rule__Story__StoryAlternatives_1_0 ) ) ;
    public final void rule__Story__StoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:947:1: ( ( ( rule__Story__StoryAlternatives_1_0 ) ) )
            // InternalTraceryPP.g:948:2: ( ( rule__Story__StoryAlternatives_1_0 ) )
            {
            // InternalTraceryPP.g:948:2: ( ( rule__Story__StoryAlternatives_1_0 ) )
            // InternalTraceryPP.g:949:3: ( rule__Story__StoryAlternatives_1_0 )
            {
             before(grammarAccess.getStoryAccess().getStoryAlternatives_1_0()); 
            // InternalTraceryPP.g:950:3: ( rule__Story__StoryAlternatives_1_0 )
            // InternalTraceryPP.g:950:4: rule__Story__StoryAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Story__StoryAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getStoryAccess().getStoryAlternatives_1_0()); 

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
    // $ANTLR end "rule__Story__StoryAssignment_1"


    // $ANTLR start "rule__ListDefinition__Start_symbolAssignment_0"
    // InternalTraceryPP.g:958:1: rule__ListDefinition__Start_symbolAssignment_0 : ( ruleVariable ) ;
    public final void rule__ListDefinition__Start_symbolAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:962:1: ( ( ruleVariable ) )
            // InternalTraceryPP.g:963:2: ( ruleVariable )
            {
            // InternalTraceryPP.g:963:2: ( ruleVariable )
            // InternalTraceryPP.g:964:3: ruleVariable
            {
             before(grammarAccess.getListDefinitionAccess().getStart_symbolVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getListDefinitionAccess().getStart_symbolVariableParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ListDefinition__Start_symbolAssignment_0"


    // $ANTLR start "rule__ListDefinition__ListAssignment_2"
    // InternalTraceryPP.g:973:1: rule__ListDefinition__ListAssignment_2 : ( ruleList ) ;
    public final void rule__ListDefinition__ListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:977:1: ( ( ruleList ) )
            // InternalTraceryPP.g:978:2: ( ruleList )
            {
            // InternalTraceryPP.g:978:2: ( ruleList )
            // InternalTraceryPP.g:979:3: ruleList
            {
             before(grammarAccess.getListDefinitionAccess().getListListParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleList();

            state._fsp--;

             after(grammarAccess.getListDefinitionAccess().getListListParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ListDefinition__ListAssignment_2"


    // $ANTLR start "rule__SentenceRule__Start_symbolAssignment"
    // InternalTraceryPP.g:988:1: rule__SentenceRule__Start_symbolAssignment : ( ruleVariable ) ;
    public final void rule__SentenceRule__Start_symbolAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:992:1: ( ( ruleVariable ) )
            // InternalTraceryPP.g:993:2: ( ruleVariable )
            {
            // InternalTraceryPP.g:993:2: ( ruleVariable )
            // InternalTraceryPP.g:994:3: ruleVariable
            {
             before(grammarAccess.getSentenceRuleAccess().getStart_symbolVariableParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getSentenceRuleAccess().getStart_symbolVariableParserRuleCall_0()); 

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
    // $ANTLR end "rule__SentenceRule__Start_symbolAssignment"


    // $ANTLR start "rule__Variable__ValueAssignment"
    // InternalTraceryPP.g:1003:1: rule__Variable__ValueAssignment : ( RULE_ID ) ;
    public final void rule__Variable__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1007:1: ( ( RULE_ID ) )
            // InternalTraceryPP.g:1008:2: ( RULE_ID )
            {
            // InternalTraceryPP.g:1008:2: ( RULE_ID )
            // InternalTraceryPP.g:1009:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getValueIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getValueIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Variable__ValueAssignment"


    // $ANTLR start "rule__List__WordsAssignment_0"
    // InternalTraceryPP.g:1018:1: rule__List__WordsAssignment_0 : ( ruleWord ) ;
    public final void rule__List__WordsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1022:1: ( ( ruleWord ) )
            // InternalTraceryPP.g:1023:2: ( ruleWord )
            {
            // InternalTraceryPP.g:1023:2: ( ruleWord )
            // InternalTraceryPP.g:1024:3: ruleWord
            {
             before(grammarAccess.getListAccess().getWordsWordParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleWord();

            state._fsp--;

             after(grammarAccess.getListAccess().getWordsWordParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__List__WordsAssignment_0"


    // $ANTLR start "rule__List__SepAssignment_1_0"
    // InternalTraceryPP.g:1033:1: rule__List__SepAssignment_1_0 : ( ruleSeparator ) ;
    public final void rule__List__SepAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1037:1: ( ( ruleSeparator ) )
            // InternalTraceryPP.g:1038:2: ( ruleSeparator )
            {
            // InternalTraceryPP.g:1038:2: ( ruleSeparator )
            // InternalTraceryPP.g:1039:3: ruleSeparator
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
    // InternalTraceryPP.g:1048:1: rule__List__WordAssignment_1_1 : ( ruleWord ) ;
    public final void rule__List__WordAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1052:1: ( ( ruleWord ) )
            // InternalTraceryPP.g:1053:2: ( ruleWord )
            {
            // InternalTraceryPP.g:1053:2: ( ruleWord )
            // InternalTraceryPP.g:1054:3: ruleWord
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


    // $ANTLR start "rule__StoryVariable__ValueAssignment_0"
    // InternalTraceryPP.g:1063:1: rule__StoryVariable__ValueAssignment_0 : ( RULE_ID ) ;
    public final void rule__StoryVariable__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1067:1: ( ( RULE_ID ) )
            // InternalTraceryPP.g:1068:2: ( RULE_ID )
            {
            // InternalTraceryPP.g:1068:2: ( RULE_ID )
            // InternalTraceryPP.g:1069:3: RULE_ID
            {
             before(grammarAccess.getStoryVariableAccess().getValueIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStoryVariableAccess().getValueIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__StoryVariable__ValueAssignment_0"


    // $ANTLR start "rule__StoryVariable__ModifiersAssignment_1"
    // InternalTraceryPP.g:1078:1: rule__StoryVariable__ModifiersAssignment_1 : ( ruleModifier ) ;
    public final void rule__StoryVariable__ModifiersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1082:1: ( ( ruleModifier ) )
            // InternalTraceryPP.g:1083:2: ( ruleModifier )
            {
            // InternalTraceryPP.g:1083:2: ( ruleModifier )
            // InternalTraceryPP.g:1084:3: ruleModifier
            {
             before(grammarAccess.getStoryVariableAccess().getModifiersModifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModifier();

            state._fsp--;

             after(grammarAccess.getStoryVariableAccess().getModifiersModifierParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__StoryVariable__ModifiersAssignment_1"


    // $ANTLR start "rule__Word__ValueAssignment"
    // InternalTraceryPP.g:1093:1: rule__Word__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__Word__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1097:1: ( ( RULE_STRING ) )
            // InternalTraceryPP.g:1098:2: ( RULE_STRING )
            {
            // InternalTraceryPP.g:1098:2: ( RULE_STRING )
            // InternalTraceryPP.g:1099:3: RULE_STRING
            {
             before(grammarAccess.getWordAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getWordAccess().getValueSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Word__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000000F802L});

}