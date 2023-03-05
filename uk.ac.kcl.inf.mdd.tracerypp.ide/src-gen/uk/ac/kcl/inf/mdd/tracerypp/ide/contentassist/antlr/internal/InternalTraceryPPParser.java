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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.capitalize'", "'.CAPITALIZE'", "'.s'", "'.a'", "'.ed'", "' can have values: '", "' can be: '", "','", "'or'", "'The story looks like this:'", "' is an object.'", "'It has these attributes: '", "'='", "'.'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
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
    // InternalTraceryPP.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalTraceryPP.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalTraceryPP.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalTraceryPP.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalTraceryPP.g:69:3: ( rule__Model__Group__0 )
            // InternalTraceryPP.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // InternalTraceryPP.g:87:1: ruleStatement : ( ruleDefinition ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:91:2: ( ( ruleDefinition ) )
            // InternalTraceryPP.g:92:2: ( ruleDefinition )
            {
            // InternalTraceryPP.g:92:2: ( ruleDefinition )
            // InternalTraceryPP.g:93:3: ruleDefinition
            {
             before(grammarAccess.getStatementAccess().getDefinitionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getDefinitionParserRuleCall()); 

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
    // InternalTraceryPP.g:112:1: ruleDefinition : ( ( rule__Definition__Alternatives ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:116:2: ( ( ( rule__Definition__Alternatives ) ) )
            // InternalTraceryPP.g:117:2: ( ( rule__Definition__Alternatives ) )
            {
            // InternalTraceryPP.g:117:2: ( ( rule__Definition__Alternatives ) )
            // InternalTraceryPP.g:118:3: ( rule__Definition__Alternatives )
            {
             before(grammarAccess.getDefinitionAccess().getAlternatives()); 
            // InternalTraceryPP.g:119:3: ( rule__Definition__Alternatives )
            // InternalTraceryPP.g:119:4: rule__Definition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleStory"
    // InternalTraceryPP.g:128:1: entryRuleStory : ruleStory EOF ;
    public final void entryRuleStory() throws RecognitionException {
        try {
            // InternalTraceryPP.g:129:1: ( ruleStory EOF )
            // InternalTraceryPP.g:130:1: ruleStory EOF
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
    // InternalTraceryPP.g:137:1: ruleStory : ( ( rule__Story__Group__0 ) ) ;
    public final void ruleStory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:141:2: ( ( ( rule__Story__Group__0 ) ) )
            // InternalTraceryPP.g:142:2: ( ( rule__Story__Group__0 ) )
            {
            // InternalTraceryPP.g:142:2: ( ( rule__Story__Group__0 ) )
            // InternalTraceryPP.g:143:3: ( rule__Story__Group__0 )
            {
             before(grammarAccess.getStoryAccess().getGroup()); 
            // InternalTraceryPP.g:144:3: ( rule__Story__Group__0 )
            // InternalTraceryPP.g:144:4: rule__Story__Group__0
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
    // InternalTraceryPP.g:153:1: entryRuleListDefinition : ruleListDefinition EOF ;
    public final void entryRuleListDefinition() throws RecognitionException {
        try {
            // InternalTraceryPP.g:154:1: ( ruleListDefinition EOF )
            // InternalTraceryPP.g:155:1: ruleListDefinition EOF
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
    // InternalTraceryPP.g:162:1: ruleListDefinition : ( ( rule__ListDefinition__Group__0 ) ) ;
    public final void ruleListDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:166:2: ( ( ( rule__ListDefinition__Group__0 ) ) )
            // InternalTraceryPP.g:167:2: ( ( rule__ListDefinition__Group__0 ) )
            {
            // InternalTraceryPP.g:167:2: ( ( rule__ListDefinition__Group__0 ) )
            // InternalTraceryPP.g:168:3: ( rule__ListDefinition__Group__0 )
            {
             before(grammarAccess.getListDefinitionAccess().getGroup()); 
            // InternalTraceryPP.g:169:3: ( rule__ListDefinition__Group__0 )
            // InternalTraceryPP.g:169:4: rule__ListDefinition__Group__0
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


    // $ANTLR start "entryRuleObjectDefinition"
    // InternalTraceryPP.g:178:1: entryRuleObjectDefinition : ruleObjectDefinition EOF ;
    public final void entryRuleObjectDefinition() throws RecognitionException {
        try {
            // InternalTraceryPP.g:179:1: ( ruleObjectDefinition EOF )
            // InternalTraceryPP.g:180:1: ruleObjectDefinition EOF
            {
             before(grammarAccess.getObjectDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectDefinition();

            state._fsp--;

             after(grammarAccess.getObjectDefinitionRule()); 
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
    // $ANTLR end "entryRuleObjectDefinition"


    // $ANTLR start "ruleObjectDefinition"
    // InternalTraceryPP.g:187:1: ruleObjectDefinition : ( ( rule__ObjectDefinition__Group__0 ) ) ;
    public final void ruleObjectDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:191:2: ( ( ( rule__ObjectDefinition__Group__0 ) ) )
            // InternalTraceryPP.g:192:2: ( ( rule__ObjectDefinition__Group__0 ) )
            {
            // InternalTraceryPP.g:192:2: ( ( rule__ObjectDefinition__Group__0 ) )
            // InternalTraceryPP.g:193:3: ( rule__ObjectDefinition__Group__0 )
            {
             before(grammarAccess.getObjectDefinitionAccess().getGroup()); 
            // InternalTraceryPP.g:194:3: ( rule__ObjectDefinition__Group__0 )
            // InternalTraceryPP.g:194:4: rule__ObjectDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleObjectDefinition"


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
    // InternalTraceryPP.g:212:1: ruleWord : ( ( rule__Word__ValueAssignment ) ) ;
    public final void ruleWord() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:216:2: ( ( ( rule__Word__ValueAssignment ) ) )
            // InternalTraceryPP.g:217:2: ( ( rule__Word__ValueAssignment ) )
            {
            // InternalTraceryPP.g:217:2: ( ( rule__Word__ValueAssignment ) )
            // InternalTraceryPP.g:218:3: ( rule__Word__ValueAssignment )
            {
             before(grammarAccess.getWordAccess().getValueAssignment()); 
            // InternalTraceryPP.g:219:3: ( rule__Word__ValueAssignment )
            // InternalTraceryPP.g:219:4: rule__Word__ValueAssignment
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


    // $ANTLR start "entryRuleStoryVariable"
    // InternalTraceryPP.g:253:1: entryRuleStoryVariable : ruleStoryVariable EOF ;
    public final void entryRuleStoryVariable() throws RecognitionException {
        try {
            // InternalTraceryPP.g:254:1: ( ruleStoryVariable EOF )
            // InternalTraceryPP.g:255:1: ruleStoryVariable EOF
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
    // InternalTraceryPP.g:262:1: ruleStoryVariable : ( ( rule__StoryVariable__Group__0 ) ) ;
    public final void ruleStoryVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:266:2: ( ( ( rule__StoryVariable__Group__0 ) ) )
            // InternalTraceryPP.g:267:2: ( ( rule__StoryVariable__Group__0 ) )
            {
            // InternalTraceryPP.g:267:2: ( ( rule__StoryVariable__Group__0 ) )
            // InternalTraceryPP.g:268:3: ( rule__StoryVariable__Group__0 )
            {
             before(grammarAccess.getStoryVariableAccess().getGroup()); 
            // InternalTraceryPP.g:269:3: ( rule__StoryVariable__Group__0 )
            // InternalTraceryPP.g:269:4: rule__StoryVariable__Group__0
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


    // $ANTLR start "entryRuleAttribute"
    // InternalTraceryPP.g:278:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalTraceryPP.g:279:1: ( ruleAttribute EOF )
            // InternalTraceryPP.g:280:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalTraceryPP.g:287:1: ruleAttribute : ( ( rule__Attribute__DefinitionAssignment ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:291:2: ( ( ( rule__Attribute__DefinitionAssignment ) ) )
            // InternalTraceryPP.g:292:2: ( ( rule__Attribute__DefinitionAssignment ) )
            {
            // InternalTraceryPP.g:292:2: ( ( rule__Attribute__DefinitionAssignment ) )
            // InternalTraceryPP.g:293:3: ( rule__Attribute__DefinitionAssignment )
            {
             before(grammarAccess.getAttributeAccess().getDefinitionAssignment()); 
            // InternalTraceryPP.g:294:3: ( rule__Attribute__DefinitionAssignment )
            // InternalTraceryPP.g:294:4: rule__Attribute__DefinitionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__DefinitionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getDefinitionAssignment()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAdvancedAttribute"
    // InternalTraceryPP.g:303:1: entryRuleAdvancedAttribute : ruleAdvancedAttribute EOF ;
    public final void entryRuleAdvancedAttribute() throws RecognitionException {
        try {
            // InternalTraceryPP.g:304:1: ( ruleAdvancedAttribute EOF )
            // InternalTraceryPP.g:305:1: ruleAdvancedAttribute EOF
            {
             before(grammarAccess.getAdvancedAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAdvancedAttribute();

            state._fsp--;

             after(grammarAccess.getAdvancedAttributeRule()); 
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
    // $ANTLR end "entryRuleAdvancedAttribute"


    // $ANTLR start "ruleAdvancedAttribute"
    // InternalTraceryPP.g:312:1: ruleAdvancedAttribute : ( ( rule__AdvancedAttribute__Group__0 ) ) ;
    public final void ruleAdvancedAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:316:2: ( ( ( rule__AdvancedAttribute__Group__0 ) ) )
            // InternalTraceryPP.g:317:2: ( ( rule__AdvancedAttribute__Group__0 ) )
            {
            // InternalTraceryPP.g:317:2: ( ( rule__AdvancedAttribute__Group__0 ) )
            // InternalTraceryPP.g:318:3: ( rule__AdvancedAttribute__Group__0 )
            {
             before(grammarAccess.getAdvancedAttributeAccess().getGroup()); 
            // InternalTraceryPP.g:319:3: ( rule__AdvancedAttribute__Group__0 )
            // InternalTraceryPP.g:319:4: rule__AdvancedAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdvancedAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdvancedAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleAdvancedAttribute"


    // $ANTLR start "entryRuleObjectAttribute"
    // InternalTraceryPP.g:328:1: entryRuleObjectAttribute : ruleObjectAttribute EOF ;
    public final void entryRuleObjectAttribute() throws RecognitionException {
        try {
            // InternalTraceryPP.g:329:1: ( ruleObjectAttribute EOF )
            // InternalTraceryPP.g:330:1: ruleObjectAttribute EOF
            {
             before(grammarAccess.getObjectAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectAttribute();

            state._fsp--;

             after(grammarAccess.getObjectAttributeRule()); 
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
    // $ANTLR end "entryRuleObjectAttribute"


    // $ANTLR start "ruleObjectAttribute"
    // InternalTraceryPP.g:337:1: ruleObjectAttribute : ( ( rule__ObjectAttribute__Group__0 ) ) ;
    public final void ruleObjectAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:341:2: ( ( ( rule__ObjectAttribute__Group__0 ) ) )
            // InternalTraceryPP.g:342:2: ( ( rule__ObjectAttribute__Group__0 ) )
            {
            // InternalTraceryPP.g:342:2: ( ( rule__ObjectAttribute__Group__0 ) )
            // InternalTraceryPP.g:343:3: ( rule__ObjectAttribute__Group__0 )
            {
             before(grammarAccess.getObjectAttributeAccess().getGroup()); 
            // InternalTraceryPP.g:344:3: ( rule__ObjectAttribute__Group__0 )
            // InternalTraceryPP.g:344:4: rule__ObjectAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleObjectAttribute"


    // $ANTLR start "entryRuleWordList"
    // InternalTraceryPP.g:353:1: entryRuleWordList : ruleWordList EOF ;
    public final void entryRuleWordList() throws RecognitionException {
        try {
            // InternalTraceryPP.g:354:1: ( ruleWordList EOF )
            // InternalTraceryPP.g:355:1: ruleWordList EOF
            {
             before(grammarAccess.getWordListRule()); 
            pushFollow(FOLLOW_1);
            ruleWordList();

            state._fsp--;

             after(grammarAccess.getWordListRule()); 
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
    // $ANTLR end "entryRuleWordList"


    // $ANTLR start "ruleWordList"
    // InternalTraceryPP.g:362:1: ruleWordList : ( ( rule__WordList__Group__0 ) ) ;
    public final void ruleWordList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:366:2: ( ( ( rule__WordList__Group__0 ) ) )
            // InternalTraceryPP.g:367:2: ( ( rule__WordList__Group__0 ) )
            {
            // InternalTraceryPP.g:367:2: ( ( rule__WordList__Group__0 ) )
            // InternalTraceryPP.g:368:3: ( rule__WordList__Group__0 )
            {
             before(grammarAccess.getWordListAccess().getGroup()); 
            // InternalTraceryPP.g:369:3: ( rule__WordList__Group__0 )
            // InternalTraceryPP.g:369:4: rule__WordList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WordList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWordListAccess().getGroup()); 

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
    // $ANTLR end "ruleWordList"


    // $ANTLR start "entryRuleAttributeList"
    // InternalTraceryPP.g:378:1: entryRuleAttributeList : ruleAttributeList EOF ;
    public final void entryRuleAttributeList() throws RecognitionException {
        try {
            // InternalTraceryPP.g:379:1: ( ruleAttributeList EOF )
            // InternalTraceryPP.g:380:1: ruleAttributeList EOF
            {
             before(grammarAccess.getAttributeListRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeList();

            state._fsp--;

             after(grammarAccess.getAttributeListRule()); 
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
    // $ANTLR end "entryRuleAttributeList"


    // $ANTLR start "ruleAttributeList"
    // InternalTraceryPP.g:387:1: ruleAttributeList : ( ( rule__AttributeList__Group__0 ) ) ;
    public final void ruleAttributeList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:391:2: ( ( ( rule__AttributeList__Group__0 ) ) )
            // InternalTraceryPP.g:392:2: ( ( rule__AttributeList__Group__0 ) )
            {
            // InternalTraceryPP.g:392:2: ( ( rule__AttributeList__Group__0 ) )
            // InternalTraceryPP.g:393:3: ( rule__AttributeList__Group__0 )
            {
             before(grammarAccess.getAttributeListAccess().getGroup()); 
            // InternalTraceryPP.g:394:3: ( rule__AttributeList__Group__0 )
            // InternalTraceryPP.g:394:4: rule__AttributeList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeListAccess().getGroup()); 

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
    // $ANTLR end "ruleAttributeList"


    // $ANTLR start "entryRuleSeparator"
    // InternalTraceryPP.g:403:1: entryRuleSeparator : ruleSeparator EOF ;
    public final void entryRuleSeparator() throws RecognitionException {
        try {
            // InternalTraceryPP.g:404:1: ( ruleSeparator EOF )
            // InternalTraceryPP.g:405:1: ruleSeparator EOF
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
    // InternalTraceryPP.g:412:1: ruleSeparator : ( ( rule__Separator__Alternatives ) ) ;
    public final void ruleSeparator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:416:2: ( ( ( rule__Separator__Alternatives ) ) )
            // InternalTraceryPP.g:417:2: ( ( rule__Separator__Alternatives ) )
            {
            // InternalTraceryPP.g:417:2: ( ( rule__Separator__Alternatives ) )
            // InternalTraceryPP.g:418:3: ( rule__Separator__Alternatives )
            {
             before(grammarAccess.getSeparatorAccess().getAlternatives()); 
            // InternalTraceryPP.g:419:3: ( rule__Separator__Alternatives )
            // InternalTraceryPP.g:419:4: rule__Separator__Alternatives
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


    // $ANTLR start "entryRuleModifier"
    // InternalTraceryPP.g:428:1: entryRuleModifier : ruleModifier EOF ;
    public final void entryRuleModifier() throws RecognitionException {
        try {
            // InternalTraceryPP.g:429:1: ( ruleModifier EOF )
            // InternalTraceryPP.g:430:1: ruleModifier EOF
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
    // InternalTraceryPP.g:437:1: ruleModifier : ( ( rule__Modifier__Alternatives ) ) ;
    public final void ruleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:441:2: ( ( ( rule__Modifier__Alternatives ) ) )
            // InternalTraceryPP.g:442:2: ( ( rule__Modifier__Alternatives ) )
            {
            // InternalTraceryPP.g:442:2: ( ( rule__Modifier__Alternatives ) )
            // InternalTraceryPP.g:443:3: ( rule__Modifier__Alternatives )
            {
             before(grammarAccess.getModifierAccess().getAlternatives()); 
            // InternalTraceryPP.g:444:3: ( rule__Modifier__Alternatives )
            // InternalTraceryPP.g:444:4: rule__Modifier__Alternatives
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
    // InternalTraceryPP.g:453:1: entryRuleCapitalizationModifier : ruleCapitalizationModifier EOF ;
    public final void entryRuleCapitalizationModifier() throws RecognitionException {
        try {
            // InternalTraceryPP.g:454:1: ( ruleCapitalizationModifier EOF )
            // InternalTraceryPP.g:455:1: ruleCapitalizationModifier EOF
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
    // InternalTraceryPP.g:462:1: ruleCapitalizationModifier : ( '.capitalize' ) ;
    public final void ruleCapitalizationModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:466:2: ( ( '.capitalize' ) )
            // InternalTraceryPP.g:467:2: ( '.capitalize' )
            {
            // InternalTraceryPP.g:467:2: ( '.capitalize' )
            // InternalTraceryPP.g:468:3: '.capitalize'
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
    // InternalTraceryPP.g:478:1: entryRuleFullCapitalizationModifier : ruleFullCapitalizationModifier EOF ;
    public final void entryRuleFullCapitalizationModifier() throws RecognitionException {
        try {
            // InternalTraceryPP.g:479:1: ( ruleFullCapitalizationModifier EOF )
            // InternalTraceryPP.g:480:1: ruleFullCapitalizationModifier EOF
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
    // InternalTraceryPP.g:487:1: ruleFullCapitalizationModifier : ( '.CAPITALIZE' ) ;
    public final void ruleFullCapitalizationModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:491:2: ( ( '.CAPITALIZE' ) )
            // InternalTraceryPP.g:492:2: ( '.CAPITALIZE' )
            {
            // InternalTraceryPP.g:492:2: ( '.CAPITALIZE' )
            // InternalTraceryPP.g:493:3: '.CAPITALIZE'
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
    // InternalTraceryPP.g:503:1: entryRulePluralityModifier : rulePluralityModifier EOF ;
    public final void entryRulePluralityModifier() throws RecognitionException {
        try {
            // InternalTraceryPP.g:504:1: ( rulePluralityModifier EOF )
            // InternalTraceryPP.g:505:1: rulePluralityModifier EOF
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
    // InternalTraceryPP.g:512:1: rulePluralityModifier : ( '.s' ) ;
    public final void rulePluralityModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:516:2: ( ( '.s' ) )
            // InternalTraceryPP.g:517:2: ( '.s' )
            {
            // InternalTraceryPP.g:517:2: ( '.s' )
            // InternalTraceryPP.g:518:3: '.s'
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
    // InternalTraceryPP.g:528:1: entryRuleArticleModifier : ruleArticleModifier EOF ;
    public final void entryRuleArticleModifier() throws RecognitionException {
        try {
            // InternalTraceryPP.g:529:1: ( ruleArticleModifier EOF )
            // InternalTraceryPP.g:530:1: ruleArticleModifier EOF
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
    // InternalTraceryPP.g:537:1: ruleArticleModifier : ( '.a' ) ;
    public final void ruleArticleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:541:2: ( ( '.a' ) )
            // InternalTraceryPP.g:542:2: ( '.a' )
            {
            // InternalTraceryPP.g:542:2: ( '.a' )
            // InternalTraceryPP.g:543:3: '.a'
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
    // InternalTraceryPP.g:553:1: entryRulePastTenseModifier : rulePastTenseModifier EOF ;
    public final void entryRulePastTenseModifier() throws RecognitionException {
        try {
            // InternalTraceryPP.g:554:1: ( rulePastTenseModifier EOF )
            // InternalTraceryPP.g:555:1: rulePastTenseModifier EOF
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
    // InternalTraceryPP.g:562:1: rulePastTenseModifier : ( '.ed' ) ;
    public final void rulePastTenseModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:566:2: ( ( '.ed' ) )
            // InternalTraceryPP.g:567:2: ( '.ed' )
            {
            // InternalTraceryPP.g:567:2: ( '.ed' )
            // InternalTraceryPP.g:568:3: '.ed'
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


    // $ANTLR start "rule__Definition__Alternatives"
    // InternalTraceryPP.g:577:1: rule__Definition__Alternatives : ( ( ruleListDefinition ) | ( ruleObjectDefinition ) );
    public final void rule__Definition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:581:1: ( ( ruleListDefinition ) | ( ruleObjectDefinition ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==21) ) {
                    alt1=2;
                }
                else if ( ((LA1_1>=16 && LA1_1<=17)) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTraceryPP.g:582:2: ( ruleListDefinition )
                    {
                    // InternalTraceryPP.g:582:2: ( ruleListDefinition )
                    // InternalTraceryPP.g:583:3: ruleListDefinition
                    {
                     before(grammarAccess.getDefinitionAccess().getListDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleListDefinition();

                    state._fsp--;

                     after(grammarAccess.getDefinitionAccess().getListDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:588:2: ( ruleObjectDefinition )
                    {
                    // InternalTraceryPP.g:588:2: ( ruleObjectDefinition )
                    // InternalTraceryPP.g:589:3: ruleObjectDefinition
                    {
                     before(grammarAccess.getDefinitionAccess().getObjectDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleObjectDefinition();

                    state._fsp--;

                     after(grammarAccess.getDefinitionAccess().getObjectDefinitionParserRuleCall_1()); 

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
    // $ANTLR end "rule__Definition__Alternatives"


    // $ANTLR start "rule__Story__StoryAlternatives_1_0"
    // InternalTraceryPP.g:598:1: rule__Story__StoryAlternatives_1_0 : ( ( ruleWord ) | ( ruleStoryVariable ) | ( ruleObjectAttribute ) );
    public final void rule__Story__StoryAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:602:1: ( ( ruleWord ) | ( ruleStoryVariable ) | ( ruleObjectAttribute ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==EOF||(LA2_2>=RULE_STRING && LA2_2<=RULE_ID)||(LA2_2>=11 && LA2_2<=15)) ) {
                    alt2=2;
                }
                else if ( (LA2_2==24) ) {
                    alt2=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

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
                    // InternalTraceryPP.g:603:2: ( ruleWord )
                    {
                    // InternalTraceryPP.g:603:2: ( ruleWord )
                    // InternalTraceryPP.g:604:3: ruleWord
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
                    // InternalTraceryPP.g:609:2: ( ruleStoryVariable )
                    {
                    // InternalTraceryPP.g:609:2: ( ruleStoryVariable )
                    // InternalTraceryPP.g:610:3: ruleStoryVariable
                    {
                     before(grammarAccess.getStoryAccess().getStoryStoryVariableParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStoryVariable();

                    state._fsp--;

                     after(grammarAccess.getStoryAccess().getStoryStoryVariableParserRuleCall_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPP.g:615:2: ( ruleObjectAttribute )
                    {
                    // InternalTraceryPP.g:615:2: ( ruleObjectAttribute )
                    // InternalTraceryPP.g:616:3: ruleObjectAttribute
                    {
                     before(grammarAccess.getStoryAccess().getStoryObjectAttributeParserRuleCall_1_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleObjectAttribute();

                    state._fsp--;

                     after(grammarAccess.getStoryAccess().getStoryObjectAttributeParserRuleCall_1_0_2()); 

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
    // InternalTraceryPP.g:625:1: rule__ListDefinition__Alternatives_1 : ( ( ' can have values: ' ) | ( ' can be: ' ) );
    public final void rule__ListDefinition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:629:1: ( ( ' can have values: ' ) | ( ' can be: ' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTraceryPP.g:630:2: ( ' can have values: ' )
                    {
                    // InternalTraceryPP.g:630:2: ( ' can have values: ' )
                    // InternalTraceryPP.g:631:3: ' can have values: '
                    {
                     before(grammarAccess.getListDefinitionAccess().getCanHaveValuesKeyword_1_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getListDefinitionAccess().getCanHaveValuesKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:636:2: ( ' can be: ' )
                    {
                    // InternalTraceryPP.g:636:2: ( ' can be: ' )
                    // InternalTraceryPP.g:637:3: ' can be: '
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


    // $ANTLR start "rule__AttributeList__AttributesAlternatives_0_0"
    // InternalTraceryPP.g:646:1: rule__AttributeList__AttributesAlternatives_0_0 : ( ( ruleAttribute ) | ( ruleAdvancedAttribute ) );
    public final void rule__AttributeList__AttributesAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:650:1: ( ( ruleAttribute ) | ( ruleAdvancedAttribute ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==23) ) {
                    alt4=2;
                }
                else if ( (LA4_1==EOF||LA4_1==RULE_ID||(LA4_1>=18 && LA4_1<=20)) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

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
                    // InternalTraceryPP.g:651:2: ( ruleAttribute )
                    {
                    // InternalTraceryPP.g:651:2: ( ruleAttribute )
                    // InternalTraceryPP.g:652:3: ruleAttribute
                    {
                     before(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:657:2: ( ruleAdvancedAttribute )
                    {
                    // InternalTraceryPP.g:657:2: ( ruleAdvancedAttribute )
                    // InternalTraceryPP.g:658:3: ruleAdvancedAttribute
                    {
                     before(grammarAccess.getAttributeListAccess().getAttributesAdvancedAttributeParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAdvancedAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeListAccess().getAttributesAdvancedAttributeParserRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__AttributeList__AttributesAlternatives_0_0"


    // $ANTLR start "rule__AttributeList__AttributeAlternatives_1_1_0"
    // InternalTraceryPP.g:667:1: rule__AttributeList__AttributeAlternatives_1_1_0 : ( ( ruleAttribute ) | ( ruleAdvancedAttribute ) );
    public final void rule__AttributeList__AttributeAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:671:1: ( ( ruleAttribute ) | ( ruleAdvancedAttribute ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==23) ) {
                    alt5=2;
                }
                else if ( (LA5_1==EOF||LA5_1==RULE_ID||(LA5_1>=18 && LA5_1<=20)) ) {
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
                    // InternalTraceryPP.g:672:2: ( ruleAttribute )
                    {
                    // InternalTraceryPP.g:672:2: ( ruleAttribute )
                    // InternalTraceryPP.g:673:3: ruleAttribute
                    {
                     before(grammarAccess.getAttributeListAccess().getAttributeAttributeParserRuleCall_1_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeListAccess().getAttributeAttributeParserRuleCall_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:678:2: ( ruleAdvancedAttribute )
                    {
                    // InternalTraceryPP.g:678:2: ( ruleAdvancedAttribute )
                    // InternalTraceryPP.g:679:3: ruleAdvancedAttribute
                    {
                     before(grammarAccess.getAttributeListAccess().getAttributeAdvancedAttributeParserRuleCall_1_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAdvancedAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeListAccess().getAttributeAdvancedAttributeParserRuleCall_1_1_0_1()); 

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
    // $ANTLR end "rule__AttributeList__AttributeAlternatives_1_1_0"


    // $ANTLR start "rule__Separator__Alternatives"
    // InternalTraceryPP.g:688:1: rule__Separator__Alternatives : ( ( ',' ) | ( 'or' ) );
    public final void rule__Separator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:692:1: ( ( ',' ) | ( 'or' ) )
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
                    // InternalTraceryPP.g:693:2: ( ',' )
                    {
                    // InternalTraceryPP.g:693:2: ( ',' )
                    // InternalTraceryPP.g:694:3: ','
                    {
                     before(grammarAccess.getSeparatorAccess().getCommaKeyword_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getSeparatorAccess().getCommaKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:699:2: ( 'or' )
                    {
                    // InternalTraceryPP.g:699:2: ( 'or' )
                    // InternalTraceryPP.g:700:3: 'or'
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
    // InternalTraceryPP.g:709:1: rule__Modifier__Alternatives : ( ( ruleCapitalizationModifier ) | ( ruleFullCapitalizationModifier ) | ( rulePluralityModifier ) | ( ruleArticleModifier ) | ( rulePastTenseModifier ) );
    public final void rule__Modifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:713:1: ( ( ruleCapitalizationModifier ) | ( ruleFullCapitalizationModifier ) | ( rulePluralityModifier ) | ( ruleArticleModifier ) | ( rulePastTenseModifier ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt7=1;
                }
                break;
            case 12:
                {
                alt7=2;
                }
                break;
            case 13:
                {
                alt7=3;
                }
                break;
            case 14:
                {
                alt7=4;
                }
                break;
            case 15:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalTraceryPP.g:714:2: ( ruleCapitalizationModifier )
                    {
                    // InternalTraceryPP.g:714:2: ( ruleCapitalizationModifier )
                    // InternalTraceryPP.g:715:3: ruleCapitalizationModifier
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
                    // InternalTraceryPP.g:720:2: ( ruleFullCapitalizationModifier )
                    {
                    // InternalTraceryPP.g:720:2: ( ruleFullCapitalizationModifier )
                    // InternalTraceryPP.g:721:3: ruleFullCapitalizationModifier
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
                    // InternalTraceryPP.g:726:2: ( rulePluralityModifier )
                    {
                    // InternalTraceryPP.g:726:2: ( rulePluralityModifier )
                    // InternalTraceryPP.g:727:3: rulePluralityModifier
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
                    // InternalTraceryPP.g:732:2: ( ruleArticleModifier )
                    {
                    // InternalTraceryPP.g:732:2: ( ruleArticleModifier )
                    // InternalTraceryPP.g:733:3: ruleArticleModifier
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
                    // InternalTraceryPP.g:738:2: ( rulePastTenseModifier )
                    {
                    // InternalTraceryPP.g:738:2: ( rulePastTenseModifier )
                    // InternalTraceryPP.g:739:3: rulePastTenseModifier
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


    // $ANTLR start "rule__Model__Group__0"
    // InternalTraceryPP.g:748:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:752:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalTraceryPP.g:753:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalTraceryPP.g:760:1: rule__Model__Group__0__Impl : ( ( rule__Model__StatementsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:764:1: ( ( ( rule__Model__StatementsAssignment_0 )* ) )
            // InternalTraceryPP.g:765:1: ( ( rule__Model__StatementsAssignment_0 )* )
            {
            // InternalTraceryPP.g:765:1: ( ( rule__Model__StatementsAssignment_0 )* )
            // InternalTraceryPP.g:766:2: ( rule__Model__StatementsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getStatementsAssignment_0()); 
            // InternalTraceryPP.g:767:2: ( rule__Model__StatementsAssignment_0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTraceryPP.g:767:3: rule__Model__StatementsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__StatementsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getStatementsAssignment_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalTraceryPP.g:775:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:779:1: ( rule__Model__Group__1__Impl )
            // InternalTraceryPP.g:780:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalTraceryPP.g:786:1: rule__Model__Group__1__Impl : ( ( rule__Model__StoryAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:790:1: ( ( ( rule__Model__StoryAssignment_1 ) ) )
            // InternalTraceryPP.g:791:1: ( ( rule__Model__StoryAssignment_1 ) )
            {
            // InternalTraceryPP.g:791:1: ( ( rule__Model__StoryAssignment_1 ) )
            // InternalTraceryPP.g:792:2: ( rule__Model__StoryAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getStoryAssignment_1()); 
            // InternalTraceryPP.g:793:2: ( rule__Model__StoryAssignment_1 )
            // InternalTraceryPP.g:793:3: rule__Model__StoryAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__StoryAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getStoryAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Story__Group__0"
    // InternalTraceryPP.g:802:1: rule__Story__Group__0 : rule__Story__Group__0__Impl rule__Story__Group__1 ;
    public final void rule__Story__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:806:1: ( rule__Story__Group__0__Impl rule__Story__Group__1 )
            // InternalTraceryPP.g:807:2: rule__Story__Group__0__Impl rule__Story__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalTraceryPP.g:814:1: rule__Story__Group__0__Impl : ( 'The story looks like this:' ) ;
    public final void rule__Story__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:818:1: ( ( 'The story looks like this:' ) )
            // InternalTraceryPP.g:819:1: ( 'The story looks like this:' )
            {
            // InternalTraceryPP.g:819:1: ( 'The story looks like this:' )
            // InternalTraceryPP.g:820:2: 'The story looks like this:'
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
    // InternalTraceryPP.g:829:1: rule__Story__Group__1 : rule__Story__Group__1__Impl ;
    public final void rule__Story__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:833:1: ( rule__Story__Group__1__Impl )
            // InternalTraceryPP.g:834:2: rule__Story__Group__1__Impl
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
    // InternalTraceryPP.g:840:1: rule__Story__Group__1__Impl : ( ( rule__Story__StoryAssignment_1 )* ) ;
    public final void rule__Story__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:844:1: ( ( ( rule__Story__StoryAssignment_1 )* ) )
            // InternalTraceryPP.g:845:1: ( ( rule__Story__StoryAssignment_1 )* )
            {
            // InternalTraceryPP.g:845:1: ( ( rule__Story__StoryAssignment_1 )* )
            // InternalTraceryPP.g:846:2: ( rule__Story__StoryAssignment_1 )*
            {
             before(grammarAccess.getStoryAccess().getStoryAssignment_1()); 
            // InternalTraceryPP.g:847:2: ( rule__Story__StoryAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTraceryPP.g:847:3: rule__Story__StoryAssignment_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Story__StoryAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalTraceryPP.g:856:1: rule__ListDefinition__Group__0 : rule__ListDefinition__Group__0__Impl rule__ListDefinition__Group__1 ;
    public final void rule__ListDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:860:1: ( rule__ListDefinition__Group__0__Impl rule__ListDefinition__Group__1 )
            // InternalTraceryPP.g:861:2: rule__ListDefinition__Group__0__Impl rule__ListDefinition__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalTraceryPP.g:868:1: rule__ListDefinition__Group__0__Impl : ( ( rule__ListDefinition__Start_symbolAssignment_0 ) ) ;
    public final void rule__ListDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:872:1: ( ( ( rule__ListDefinition__Start_symbolAssignment_0 ) ) )
            // InternalTraceryPP.g:873:1: ( ( rule__ListDefinition__Start_symbolAssignment_0 ) )
            {
            // InternalTraceryPP.g:873:1: ( ( rule__ListDefinition__Start_symbolAssignment_0 ) )
            // InternalTraceryPP.g:874:2: ( rule__ListDefinition__Start_symbolAssignment_0 )
            {
             before(grammarAccess.getListDefinitionAccess().getStart_symbolAssignment_0()); 
            // InternalTraceryPP.g:875:2: ( rule__ListDefinition__Start_symbolAssignment_0 )
            // InternalTraceryPP.g:875:3: rule__ListDefinition__Start_symbolAssignment_0
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
    // InternalTraceryPP.g:883:1: rule__ListDefinition__Group__1 : rule__ListDefinition__Group__1__Impl rule__ListDefinition__Group__2 ;
    public final void rule__ListDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:887:1: ( rule__ListDefinition__Group__1__Impl rule__ListDefinition__Group__2 )
            // InternalTraceryPP.g:888:2: rule__ListDefinition__Group__1__Impl rule__ListDefinition__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalTraceryPP.g:895:1: rule__ListDefinition__Group__1__Impl : ( ( rule__ListDefinition__Alternatives_1 ) ) ;
    public final void rule__ListDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:899:1: ( ( ( rule__ListDefinition__Alternatives_1 ) ) )
            // InternalTraceryPP.g:900:1: ( ( rule__ListDefinition__Alternatives_1 ) )
            {
            // InternalTraceryPP.g:900:1: ( ( rule__ListDefinition__Alternatives_1 ) )
            // InternalTraceryPP.g:901:2: ( rule__ListDefinition__Alternatives_1 )
            {
             before(grammarAccess.getListDefinitionAccess().getAlternatives_1()); 
            // InternalTraceryPP.g:902:2: ( rule__ListDefinition__Alternatives_1 )
            // InternalTraceryPP.g:902:3: rule__ListDefinition__Alternatives_1
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
    // InternalTraceryPP.g:910:1: rule__ListDefinition__Group__2 : rule__ListDefinition__Group__2__Impl ;
    public final void rule__ListDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:914:1: ( rule__ListDefinition__Group__2__Impl )
            // InternalTraceryPP.g:915:2: rule__ListDefinition__Group__2__Impl
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
    // InternalTraceryPP.g:921:1: rule__ListDefinition__Group__2__Impl : ( ( rule__ListDefinition__ListAssignment_2 ) ) ;
    public final void rule__ListDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:925:1: ( ( ( rule__ListDefinition__ListAssignment_2 ) ) )
            // InternalTraceryPP.g:926:1: ( ( rule__ListDefinition__ListAssignment_2 ) )
            {
            // InternalTraceryPP.g:926:1: ( ( rule__ListDefinition__ListAssignment_2 ) )
            // InternalTraceryPP.g:927:2: ( rule__ListDefinition__ListAssignment_2 )
            {
             before(grammarAccess.getListDefinitionAccess().getListAssignment_2()); 
            // InternalTraceryPP.g:928:2: ( rule__ListDefinition__ListAssignment_2 )
            // InternalTraceryPP.g:928:3: rule__ListDefinition__ListAssignment_2
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


    // $ANTLR start "rule__ObjectDefinition__Group__0"
    // InternalTraceryPP.g:937:1: rule__ObjectDefinition__Group__0 : rule__ObjectDefinition__Group__0__Impl rule__ObjectDefinition__Group__1 ;
    public final void rule__ObjectDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:941:1: ( rule__ObjectDefinition__Group__0__Impl rule__ObjectDefinition__Group__1 )
            // InternalTraceryPP.g:942:2: rule__ObjectDefinition__Group__0__Impl rule__ObjectDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ObjectDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectDefinition__Group__1();

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
    // $ANTLR end "rule__ObjectDefinition__Group__0"


    // $ANTLR start "rule__ObjectDefinition__Group__0__Impl"
    // InternalTraceryPP.g:949:1: rule__ObjectDefinition__Group__0__Impl : ( ( rule__ObjectDefinition__ObjectAssignment_0 ) ) ;
    public final void rule__ObjectDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:953:1: ( ( ( rule__ObjectDefinition__ObjectAssignment_0 ) ) )
            // InternalTraceryPP.g:954:1: ( ( rule__ObjectDefinition__ObjectAssignment_0 ) )
            {
            // InternalTraceryPP.g:954:1: ( ( rule__ObjectDefinition__ObjectAssignment_0 ) )
            // InternalTraceryPP.g:955:2: ( rule__ObjectDefinition__ObjectAssignment_0 )
            {
             before(grammarAccess.getObjectDefinitionAccess().getObjectAssignment_0()); 
            // InternalTraceryPP.g:956:2: ( rule__ObjectDefinition__ObjectAssignment_0 )
            // InternalTraceryPP.g:956:3: rule__ObjectDefinition__ObjectAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectDefinition__ObjectAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectDefinitionAccess().getObjectAssignment_0()); 

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
    // $ANTLR end "rule__ObjectDefinition__Group__0__Impl"


    // $ANTLR start "rule__ObjectDefinition__Group__1"
    // InternalTraceryPP.g:964:1: rule__ObjectDefinition__Group__1 : rule__ObjectDefinition__Group__1__Impl rule__ObjectDefinition__Group__2 ;
    public final void rule__ObjectDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:968:1: ( rule__ObjectDefinition__Group__1__Impl rule__ObjectDefinition__Group__2 )
            // InternalTraceryPP.g:969:2: rule__ObjectDefinition__Group__1__Impl rule__ObjectDefinition__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ObjectDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectDefinition__Group__2();

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
    // $ANTLR end "rule__ObjectDefinition__Group__1"


    // $ANTLR start "rule__ObjectDefinition__Group__1__Impl"
    // InternalTraceryPP.g:976:1: rule__ObjectDefinition__Group__1__Impl : ( ' is an object.' ) ;
    public final void rule__ObjectDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:980:1: ( ( ' is an object.' ) )
            // InternalTraceryPP.g:981:1: ( ' is an object.' )
            {
            // InternalTraceryPP.g:981:1: ( ' is an object.' )
            // InternalTraceryPP.g:982:2: ' is an object.'
            {
             before(grammarAccess.getObjectDefinitionAccess().getIsAnObjectKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getObjectDefinitionAccess().getIsAnObjectKeyword_1()); 

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
    // $ANTLR end "rule__ObjectDefinition__Group__1__Impl"


    // $ANTLR start "rule__ObjectDefinition__Group__2"
    // InternalTraceryPP.g:991:1: rule__ObjectDefinition__Group__2 : rule__ObjectDefinition__Group__2__Impl rule__ObjectDefinition__Group__3 ;
    public final void rule__ObjectDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:995:1: ( rule__ObjectDefinition__Group__2__Impl rule__ObjectDefinition__Group__3 )
            // InternalTraceryPP.g:996:2: rule__ObjectDefinition__Group__2__Impl rule__ObjectDefinition__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__ObjectDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectDefinition__Group__3();

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
    // $ANTLR end "rule__ObjectDefinition__Group__2"


    // $ANTLR start "rule__ObjectDefinition__Group__2__Impl"
    // InternalTraceryPP.g:1003:1: rule__ObjectDefinition__Group__2__Impl : ( 'It has these attributes: ' ) ;
    public final void rule__ObjectDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1007:1: ( ( 'It has these attributes: ' ) )
            // InternalTraceryPP.g:1008:1: ( 'It has these attributes: ' )
            {
            // InternalTraceryPP.g:1008:1: ( 'It has these attributes: ' )
            // InternalTraceryPP.g:1009:2: 'It has these attributes: '
            {
             before(grammarAccess.getObjectDefinitionAccess().getItHasTheseAttributesKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getObjectDefinitionAccess().getItHasTheseAttributesKeyword_2()); 

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
    // $ANTLR end "rule__ObjectDefinition__Group__2__Impl"


    // $ANTLR start "rule__ObjectDefinition__Group__3"
    // InternalTraceryPP.g:1018:1: rule__ObjectDefinition__Group__3 : rule__ObjectDefinition__Group__3__Impl ;
    public final void rule__ObjectDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1022:1: ( rule__ObjectDefinition__Group__3__Impl )
            // InternalTraceryPP.g:1023:2: rule__ObjectDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectDefinition__Group__3__Impl();

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
    // $ANTLR end "rule__ObjectDefinition__Group__3"


    // $ANTLR start "rule__ObjectDefinition__Group__3__Impl"
    // InternalTraceryPP.g:1029:1: rule__ObjectDefinition__Group__3__Impl : ( ( rule__ObjectDefinition__AttributesAssignment_3 ) ) ;
    public final void rule__ObjectDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1033:1: ( ( ( rule__ObjectDefinition__AttributesAssignment_3 ) ) )
            // InternalTraceryPP.g:1034:1: ( ( rule__ObjectDefinition__AttributesAssignment_3 ) )
            {
            // InternalTraceryPP.g:1034:1: ( ( rule__ObjectDefinition__AttributesAssignment_3 ) )
            // InternalTraceryPP.g:1035:2: ( rule__ObjectDefinition__AttributesAssignment_3 )
            {
             before(grammarAccess.getObjectDefinitionAccess().getAttributesAssignment_3()); 
            // InternalTraceryPP.g:1036:2: ( rule__ObjectDefinition__AttributesAssignment_3 )
            // InternalTraceryPP.g:1036:3: rule__ObjectDefinition__AttributesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ObjectDefinition__AttributesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getObjectDefinitionAccess().getAttributesAssignment_3()); 

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
    // $ANTLR end "rule__ObjectDefinition__Group__3__Impl"


    // $ANTLR start "rule__StoryVariable__Group__0"
    // InternalTraceryPP.g:1045:1: rule__StoryVariable__Group__0 : rule__StoryVariable__Group__0__Impl rule__StoryVariable__Group__1 ;
    public final void rule__StoryVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1049:1: ( rule__StoryVariable__Group__0__Impl rule__StoryVariable__Group__1 )
            // InternalTraceryPP.g:1050:2: rule__StoryVariable__Group__0__Impl rule__StoryVariable__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalTraceryPP.g:1057:1: rule__StoryVariable__Group__0__Impl : ( ( rule__StoryVariable__ValueAssignment_0 ) ) ;
    public final void rule__StoryVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1061:1: ( ( ( rule__StoryVariable__ValueAssignment_0 ) ) )
            // InternalTraceryPP.g:1062:1: ( ( rule__StoryVariable__ValueAssignment_0 ) )
            {
            // InternalTraceryPP.g:1062:1: ( ( rule__StoryVariable__ValueAssignment_0 ) )
            // InternalTraceryPP.g:1063:2: ( rule__StoryVariable__ValueAssignment_0 )
            {
             before(grammarAccess.getStoryVariableAccess().getValueAssignment_0()); 
            // InternalTraceryPP.g:1064:2: ( rule__StoryVariable__ValueAssignment_0 )
            // InternalTraceryPP.g:1064:3: rule__StoryVariable__ValueAssignment_0
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
    // InternalTraceryPP.g:1072:1: rule__StoryVariable__Group__1 : rule__StoryVariable__Group__1__Impl ;
    public final void rule__StoryVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1076:1: ( rule__StoryVariable__Group__1__Impl )
            // InternalTraceryPP.g:1077:2: rule__StoryVariable__Group__1__Impl
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
    // InternalTraceryPP.g:1083:1: rule__StoryVariable__Group__1__Impl : ( ( rule__StoryVariable__ModifiersAssignment_1 )* ) ;
    public final void rule__StoryVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1087:1: ( ( ( rule__StoryVariable__ModifiersAssignment_1 )* ) )
            // InternalTraceryPP.g:1088:1: ( ( rule__StoryVariable__ModifiersAssignment_1 )* )
            {
            // InternalTraceryPP.g:1088:1: ( ( rule__StoryVariable__ModifiersAssignment_1 )* )
            // InternalTraceryPP.g:1089:2: ( rule__StoryVariable__ModifiersAssignment_1 )*
            {
             before(grammarAccess.getStoryVariableAccess().getModifiersAssignment_1()); 
            // InternalTraceryPP.g:1090:2: ( rule__StoryVariable__ModifiersAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=11 && LA10_0<=15)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTraceryPP.g:1090:3: rule__StoryVariable__ModifiersAssignment_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__StoryVariable__ModifiersAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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


    // $ANTLR start "rule__AdvancedAttribute__Group__0"
    // InternalTraceryPP.g:1099:1: rule__AdvancedAttribute__Group__0 : rule__AdvancedAttribute__Group__0__Impl rule__AdvancedAttribute__Group__1 ;
    public final void rule__AdvancedAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1103:1: ( rule__AdvancedAttribute__Group__0__Impl rule__AdvancedAttribute__Group__1 )
            // InternalTraceryPP.g:1104:2: rule__AdvancedAttribute__Group__0__Impl rule__AdvancedAttribute__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__AdvancedAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdvancedAttribute__Group__1();

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
    // $ANTLR end "rule__AdvancedAttribute__Group__0"


    // $ANTLR start "rule__AdvancedAttribute__Group__0__Impl"
    // InternalTraceryPP.g:1111:1: rule__AdvancedAttribute__Group__0__Impl : ( ( rule__AdvancedAttribute__DefinitionAssignment_0 ) ) ;
    public final void rule__AdvancedAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1115:1: ( ( ( rule__AdvancedAttribute__DefinitionAssignment_0 ) ) )
            // InternalTraceryPP.g:1116:1: ( ( rule__AdvancedAttribute__DefinitionAssignment_0 ) )
            {
            // InternalTraceryPP.g:1116:1: ( ( rule__AdvancedAttribute__DefinitionAssignment_0 ) )
            // InternalTraceryPP.g:1117:2: ( rule__AdvancedAttribute__DefinitionAssignment_0 )
            {
             before(grammarAccess.getAdvancedAttributeAccess().getDefinitionAssignment_0()); 
            // InternalTraceryPP.g:1118:2: ( rule__AdvancedAttribute__DefinitionAssignment_0 )
            // InternalTraceryPP.g:1118:3: rule__AdvancedAttribute__DefinitionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AdvancedAttribute__DefinitionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAdvancedAttributeAccess().getDefinitionAssignment_0()); 

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
    // $ANTLR end "rule__AdvancedAttribute__Group__0__Impl"


    // $ANTLR start "rule__AdvancedAttribute__Group__1"
    // InternalTraceryPP.g:1126:1: rule__AdvancedAttribute__Group__1 : rule__AdvancedAttribute__Group__1__Impl rule__AdvancedAttribute__Group__2 ;
    public final void rule__AdvancedAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1130:1: ( rule__AdvancedAttribute__Group__1__Impl rule__AdvancedAttribute__Group__2 )
            // InternalTraceryPP.g:1131:2: rule__AdvancedAttribute__Group__1__Impl rule__AdvancedAttribute__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__AdvancedAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdvancedAttribute__Group__2();

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
    // $ANTLR end "rule__AdvancedAttribute__Group__1"


    // $ANTLR start "rule__AdvancedAttribute__Group__1__Impl"
    // InternalTraceryPP.g:1138:1: rule__AdvancedAttribute__Group__1__Impl : ( '=' ) ;
    public final void rule__AdvancedAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1142:1: ( ( '=' ) )
            // InternalTraceryPP.g:1143:1: ( '=' )
            {
            // InternalTraceryPP.g:1143:1: ( '=' )
            // InternalTraceryPP.g:1144:2: '='
            {
             before(grammarAccess.getAdvancedAttributeAccess().getEqualsSignKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAdvancedAttributeAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__AdvancedAttribute__Group__1__Impl"


    // $ANTLR start "rule__AdvancedAttribute__Group__2"
    // InternalTraceryPP.g:1153:1: rule__AdvancedAttribute__Group__2 : rule__AdvancedAttribute__Group__2__Impl ;
    public final void rule__AdvancedAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1157:1: ( rule__AdvancedAttribute__Group__2__Impl )
            // InternalTraceryPP.g:1158:2: rule__AdvancedAttribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdvancedAttribute__Group__2__Impl();

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
    // $ANTLR end "rule__AdvancedAttribute__Group__2"


    // $ANTLR start "rule__AdvancedAttribute__Group__2__Impl"
    // InternalTraceryPP.g:1164:1: rule__AdvancedAttribute__Group__2__Impl : ( ( rule__AdvancedAttribute__ValueAssignment_2 ) ) ;
    public final void rule__AdvancedAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1168:1: ( ( ( rule__AdvancedAttribute__ValueAssignment_2 ) ) )
            // InternalTraceryPP.g:1169:1: ( ( rule__AdvancedAttribute__ValueAssignment_2 ) )
            {
            // InternalTraceryPP.g:1169:1: ( ( rule__AdvancedAttribute__ValueAssignment_2 ) )
            // InternalTraceryPP.g:1170:2: ( rule__AdvancedAttribute__ValueAssignment_2 )
            {
             before(grammarAccess.getAdvancedAttributeAccess().getValueAssignment_2()); 
            // InternalTraceryPP.g:1171:2: ( rule__AdvancedAttribute__ValueAssignment_2 )
            // InternalTraceryPP.g:1171:3: rule__AdvancedAttribute__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AdvancedAttribute__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAdvancedAttributeAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__AdvancedAttribute__Group__2__Impl"


    // $ANTLR start "rule__ObjectAttribute__Group__0"
    // InternalTraceryPP.g:1180:1: rule__ObjectAttribute__Group__0 : rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1 ;
    public final void rule__ObjectAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1184:1: ( rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1 )
            // InternalTraceryPP.g:1185:2: rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ObjectAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectAttribute__Group__1();

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
    // $ANTLR end "rule__ObjectAttribute__Group__0"


    // $ANTLR start "rule__ObjectAttribute__Group__0__Impl"
    // InternalTraceryPP.g:1192:1: rule__ObjectAttribute__Group__0__Impl : ( ( rule__ObjectAttribute__ObjectAssignment_0 ) ) ;
    public final void rule__ObjectAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1196:1: ( ( ( rule__ObjectAttribute__ObjectAssignment_0 ) ) )
            // InternalTraceryPP.g:1197:1: ( ( rule__ObjectAttribute__ObjectAssignment_0 ) )
            {
            // InternalTraceryPP.g:1197:1: ( ( rule__ObjectAttribute__ObjectAssignment_0 ) )
            // InternalTraceryPP.g:1198:2: ( rule__ObjectAttribute__ObjectAssignment_0 )
            {
             before(grammarAccess.getObjectAttributeAccess().getObjectAssignment_0()); 
            // InternalTraceryPP.g:1199:2: ( rule__ObjectAttribute__ObjectAssignment_0 )
            // InternalTraceryPP.g:1199:3: rule__ObjectAttribute__ObjectAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectAttribute__ObjectAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAttributeAccess().getObjectAssignment_0()); 

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
    // $ANTLR end "rule__ObjectAttribute__Group__0__Impl"


    // $ANTLR start "rule__ObjectAttribute__Group__1"
    // InternalTraceryPP.g:1207:1: rule__ObjectAttribute__Group__1 : rule__ObjectAttribute__Group__1__Impl rule__ObjectAttribute__Group__2 ;
    public final void rule__ObjectAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1211:1: ( rule__ObjectAttribute__Group__1__Impl rule__ObjectAttribute__Group__2 )
            // InternalTraceryPP.g:1212:2: rule__ObjectAttribute__Group__1__Impl rule__ObjectAttribute__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ObjectAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectAttribute__Group__2();

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
    // $ANTLR end "rule__ObjectAttribute__Group__1"


    // $ANTLR start "rule__ObjectAttribute__Group__1__Impl"
    // InternalTraceryPP.g:1219:1: rule__ObjectAttribute__Group__1__Impl : ( '.' ) ;
    public final void rule__ObjectAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1223:1: ( ( '.' ) )
            // InternalTraceryPP.g:1224:1: ( '.' )
            {
            // InternalTraceryPP.g:1224:1: ( '.' )
            // InternalTraceryPP.g:1225:2: '.'
            {
             before(grammarAccess.getObjectAttributeAccess().getFullStopKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getObjectAttributeAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__ObjectAttribute__Group__1__Impl"


    // $ANTLR start "rule__ObjectAttribute__Group__2"
    // InternalTraceryPP.g:1234:1: rule__ObjectAttribute__Group__2 : rule__ObjectAttribute__Group__2__Impl ;
    public final void rule__ObjectAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1238:1: ( rule__ObjectAttribute__Group__2__Impl )
            // InternalTraceryPP.g:1239:2: rule__ObjectAttribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectAttribute__Group__2__Impl();

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
    // $ANTLR end "rule__ObjectAttribute__Group__2"


    // $ANTLR start "rule__ObjectAttribute__Group__2__Impl"
    // InternalTraceryPP.g:1245:1: rule__ObjectAttribute__Group__2__Impl : ( ( rule__ObjectAttribute__AttributeAssignment_2 ) ) ;
    public final void rule__ObjectAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1249:1: ( ( ( rule__ObjectAttribute__AttributeAssignment_2 ) ) )
            // InternalTraceryPP.g:1250:1: ( ( rule__ObjectAttribute__AttributeAssignment_2 ) )
            {
            // InternalTraceryPP.g:1250:1: ( ( rule__ObjectAttribute__AttributeAssignment_2 ) )
            // InternalTraceryPP.g:1251:2: ( rule__ObjectAttribute__AttributeAssignment_2 )
            {
             before(grammarAccess.getObjectAttributeAccess().getAttributeAssignment_2()); 
            // InternalTraceryPP.g:1252:2: ( rule__ObjectAttribute__AttributeAssignment_2 )
            // InternalTraceryPP.g:1252:3: rule__ObjectAttribute__AttributeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ObjectAttribute__AttributeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getObjectAttributeAccess().getAttributeAssignment_2()); 

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
    // $ANTLR end "rule__ObjectAttribute__Group__2__Impl"


    // $ANTLR start "rule__WordList__Group__0"
    // InternalTraceryPP.g:1261:1: rule__WordList__Group__0 : rule__WordList__Group__0__Impl rule__WordList__Group__1 ;
    public final void rule__WordList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1265:1: ( rule__WordList__Group__0__Impl rule__WordList__Group__1 )
            // InternalTraceryPP.g:1266:2: rule__WordList__Group__0__Impl rule__WordList__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__WordList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WordList__Group__1();

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
    // $ANTLR end "rule__WordList__Group__0"


    // $ANTLR start "rule__WordList__Group__0__Impl"
    // InternalTraceryPP.g:1273:1: rule__WordList__Group__0__Impl : ( ( rule__WordList__WordsAssignment_0 ) ) ;
    public final void rule__WordList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1277:1: ( ( ( rule__WordList__WordsAssignment_0 ) ) )
            // InternalTraceryPP.g:1278:1: ( ( rule__WordList__WordsAssignment_0 ) )
            {
            // InternalTraceryPP.g:1278:1: ( ( rule__WordList__WordsAssignment_0 ) )
            // InternalTraceryPP.g:1279:2: ( rule__WordList__WordsAssignment_0 )
            {
             before(grammarAccess.getWordListAccess().getWordsAssignment_0()); 
            // InternalTraceryPP.g:1280:2: ( rule__WordList__WordsAssignment_0 )
            // InternalTraceryPP.g:1280:3: rule__WordList__WordsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__WordList__WordsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWordListAccess().getWordsAssignment_0()); 

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
    // $ANTLR end "rule__WordList__Group__0__Impl"


    // $ANTLR start "rule__WordList__Group__1"
    // InternalTraceryPP.g:1288:1: rule__WordList__Group__1 : rule__WordList__Group__1__Impl ;
    public final void rule__WordList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1292:1: ( rule__WordList__Group__1__Impl )
            // InternalTraceryPP.g:1293:2: rule__WordList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WordList__Group__1__Impl();

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
    // $ANTLR end "rule__WordList__Group__1"


    // $ANTLR start "rule__WordList__Group__1__Impl"
    // InternalTraceryPP.g:1299:1: rule__WordList__Group__1__Impl : ( ( rule__WordList__Group_1__0 )* ) ;
    public final void rule__WordList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1303:1: ( ( ( rule__WordList__Group_1__0 )* ) )
            // InternalTraceryPP.g:1304:1: ( ( rule__WordList__Group_1__0 )* )
            {
            // InternalTraceryPP.g:1304:1: ( ( rule__WordList__Group_1__0 )* )
            // InternalTraceryPP.g:1305:2: ( rule__WordList__Group_1__0 )*
            {
             before(grammarAccess.getWordListAccess().getGroup_1()); 
            // InternalTraceryPP.g:1306:2: ( rule__WordList__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=18 && LA11_0<=19)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTraceryPP.g:1306:3: rule__WordList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__WordList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getWordListAccess().getGroup_1()); 

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
    // $ANTLR end "rule__WordList__Group__1__Impl"


    // $ANTLR start "rule__WordList__Group_1__0"
    // InternalTraceryPP.g:1315:1: rule__WordList__Group_1__0 : rule__WordList__Group_1__0__Impl rule__WordList__Group_1__1 ;
    public final void rule__WordList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1319:1: ( rule__WordList__Group_1__0__Impl rule__WordList__Group_1__1 )
            // InternalTraceryPP.g:1320:2: rule__WordList__Group_1__0__Impl rule__WordList__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__WordList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WordList__Group_1__1();

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
    // $ANTLR end "rule__WordList__Group_1__0"


    // $ANTLR start "rule__WordList__Group_1__0__Impl"
    // InternalTraceryPP.g:1327:1: rule__WordList__Group_1__0__Impl : ( ( rule__WordList__SepAssignment_1_0 ) ) ;
    public final void rule__WordList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1331:1: ( ( ( rule__WordList__SepAssignment_1_0 ) ) )
            // InternalTraceryPP.g:1332:1: ( ( rule__WordList__SepAssignment_1_0 ) )
            {
            // InternalTraceryPP.g:1332:1: ( ( rule__WordList__SepAssignment_1_0 ) )
            // InternalTraceryPP.g:1333:2: ( rule__WordList__SepAssignment_1_0 )
            {
             before(grammarAccess.getWordListAccess().getSepAssignment_1_0()); 
            // InternalTraceryPP.g:1334:2: ( rule__WordList__SepAssignment_1_0 )
            // InternalTraceryPP.g:1334:3: rule__WordList__SepAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__WordList__SepAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getWordListAccess().getSepAssignment_1_0()); 

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
    // $ANTLR end "rule__WordList__Group_1__0__Impl"


    // $ANTLR start "rule__WordList__Group_1__1"
    // InternalTraceryPP.g:1342:1: rule__WordList__Group_1__1 : rule__WordList__Group_1__1__Impl ;
    public final void rule__WordList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1346:1: ( rule__WordList__Group_1__1__Impl )
            // InternalTraceryPP.g:1347:2: rule__WordList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WordList__Group_1__1__Impl();

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
    // $ANTLR end "rule__WordList__Group_1__1"


    // $ANTLR start "rule__WordList__Group_1__1__Impl"
    // InternalTraceryPP.g:1353:1: rule__WordList__Group_1__1__Impl : ( ( rule__WordList__WordAssignment_1_1 ) ) ;
    public final void rule__WordList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1357:1: ( ( ( rule__WordList__WordAssignment_1_1 ) ) )
            // InternalTraceryPP.g:1358:1: ( ( rule__WordList__WordAssignment_1_1 ) )
            {
            // InternalTraceryPP.g:1358:1: ( ( rule__WordList__WordAssignment_1_1 ) )
            // InternalTraceryPP.g:1359:2: ( rule__WordList__WordAssignment_1_1 )
            {
             before(grammarAccess.getWordListAccess().getWordAssignment_1_1()); 
            // InternalTraceryPP.g:1360:2: ( rule__WordList__WordAssignment_1_1 )
            // InternalTraceryPP.g:1360:3: rule__WordList__WordAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__WordList__WordAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getWordListAccess().getWordAssignment_1_1()); 

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
    // $ANTLR end "rule__WordList__Group_1__1__Impl"


    // $ANTLR start "rule__AttributeList__Group__0"
    // InternalTraceryPP.g:1369:1: rule__AttributeList__Group__0 : rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 ;
    public final void rule__AttributeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1373:1: ( rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 )
            // InternalTraceryPP.g:1374:2: rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__AttributeList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeList__Group__1();

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
    // $ANTLR end "rule__AttributeList__Group__0"


    // $ANTLR start "rule__AttributeList__Group__0__Impl"
    // InternalTraceryPP.g:1381:1: rule__AttributeList__Group__0__Impl : ( ( rule__AttributeList__AttributesAssignment_0 ) ) ;
    public final void rule__AttributeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1385:1: ( ( ( rule__AttributeList__AttributesAssignment_0 ) ) )
            // InternalTraceryPP.g:1386:1: ( ( rule__AttributeList__AttributesAssignment_0 ) )
            {
            // InternalTraceryPP.g:1386:1: ( ( rule__AttributeList__AttributesAssignment_0 ) )
            // InternalTraceryPP.g:1387:2: ( rule__AttributeList__AttributesAssignment_0 )
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAssignment_0()); 
            // InternalTraceryPP.g:1388:2: ( rule__AttributeList__AttributesAssignment_0 )
            // InternalTraceryPP.g:1388:3: rule__AttributeList__AttributesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeList__AttributesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeListAccess().getAttributesAssignment_0()); 

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
    // $ANTLR end "rule__AttributeList__Group__0__Impl"


    // $ANTLR start "rule__AttributeList__Group__1"
    // InternalTraceryPP.g:1396:1: rule__AttributeList__Group__1 : rule__AttributeList__Group__1__Impl ;
    public final void rule__AttributeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1400:1: ( rule__AttributeList__Group__1__Impl )
            // InternalTraceryPP.g:1401:2: rule__AttributeList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeList__Group__1__Impl();

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
    // $ANTLR end "rule__AttributeList__Group__1"


    // $ANTLR start "rule__AttributeList__Group__1__Impl"
    // InternalTraceryPP.g:1407:1: rule__AttributeList__Group__1__Impl : ( ( rule__AttributeList__Group_1__0 )* ) ;
    public final void rule__AttributeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1411:1: ( ( ( rule__AttributeList__Group_1__0 )* ) )
            // InternalTraceryPP.g:1412:1: ( ( rule__AttributeList__Group_1__0 )* )
            {
            // InternalTraceryPP.g:1412:1: ( ( rule__AttributeList__Group_1__0 )* )
            // InternalTraceryPP.g:1413:2: ( rule__AttributeList__Group_1__0 )*
            {
             before(grammarAccess.getAttributeListAccess().getGroup_1()); 
            // InternalTraceryPP.g:1414:2: ( rule__AttributeList__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=18 && LA12_0<=19)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTraceryPP.g:1414:3: rule__AttributeList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__AttributeList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getAttributeListAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AttributeList__Group__1__Impl"


    // $ANTLR start "rule__AttributeList__Group_1__0"
    // InternalTraceryPP.g:1423:1: rule__AttributeList__Group_1__0 : rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1 ;
    public final void rule__AttributeList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1427:1: ( rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1 )
            // InternalTraceryPP.g:1428:2: rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__AttributeList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeList__Group_1__1();

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
    // $ANTLR end "rule__AttributeList__Group_1__0"


    // $ANTLR start "rule__AttributeList__Group_1__0__Impl"
    // InternalTraceryPP.g:1435:1: rule__AttributeList__Group_1__0__Impl : ( ( rule__AttributeList__SepAssignment_1_0 ) ) ;
    public final void rule__AttributeList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1439:1: ( ( ( rule__AttributeList__SepAssignment_1_0 ) ) )
            // InternalTraceryPP.g:1440:1: ( ( rule__AttributeList__SepAssignment_1_0 ) )
            {
            // InternalTraceryPP.g:1440:1: ( ( rule__AttributeList__SepAssignment_1_0 ) )
            // InternalTraceryPP.g:1441:2: ( rule__AttributeList__SepAssignment_1_0 )
            {
             before(grammarAccess.getAttributeListAccess().getSepAssignment_1_0()); 
            // InternalTraceryPP.g:1442:2: ( rule__AttributeList__SepAssignment_1_0 )
            // InternalTraceryPP.g:1442:3: rule__AttributeList__SepAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeList__SepAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeListAccess().getSepAssignment_1_0()); 

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
    // $ANTLR end "rule__AttributeList__Group_1__0__Impl"


    // $ANTLR start "rule__AttributeList__Group_1__1"
    // InternalTraceryPP.g:1450:1: rule__AttributeList__Group_1__1 : rule__AttributeList__Group_1__1__Impl ;
    public final void rule__AttributeList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1454:1: ( rule__AttributeList__Group_1__1__Impl )
            // InternalTraceryPP.g:1455:2: rule__AttributeList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeList__Group_1__1__Impl();

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
    // $ANTLR end "rule__AttributeList__Group_1__1"


    // $ANTLR start "rule__AttributeList__Group_1__1__Impl"
    // InternalTraceryPP.g:1461:1: rule__AttributeList__Group_1__1__Impl : ( ( rule__AttributeList__AttributeAssignment_1_1 ) ) ;
    public final void rule__AttributeList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1465:1: ( ( ( rule__AttributeList__AttributeAssignment_1_1 ) ) )
            // InternalTraceryPP.g:1466:1: ( ( rule__AttributeList__AttributeAssignment_1_1 ) )
            {
            // InternalTraceryPP.g:1466:1: ( ( rule__AttributeList__AttributeAssignment_1_1 ) )
            // InternalTraceryPP.g:1467:2: ( rule__AttributeList__AttributeAssignment_1_1 )
            {
             before(grammarAccess.getAttributeListAccess().getAttributeAssignment_1_1()); 
            // InternalTraceryPP.g:1468:2: ( rule__AttributeList__AttributeAssignment_1_1 )
            // InternalTraceryPP.g:1468:3: rule__AttributeList__AttributeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeList__AttributeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeListAccess().getAttributeAssignment_1_1()); 

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
    // $ANTLR end "rule__AttributeList__Group_1__1__Impl"


    // $ANTLR start "rule__Model__StatementsAssignment_0"
    // InternalTraceryPP.g:1477:1: rule__Model__StatementsAssignment_0 : ( ruleStatement ) ;
    public final void rule__Model__StatementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1481:1: ( ( ruleStatement ) )
            // InternalTraceryPP.g:1482:2: ( ruleStatement )
            {
            // InternalTraceryPP.g:1482:2: ( ruleStatement )
            // InternalTraceryPP.g:1483:3: ruleStatement
            {
             before(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__StatementsAssignment_0"


    // $ANTLR start "rule__Model__StoryAssignment_1"
    // InternalTraceryPP.g:1492:1: rule__Model__StoryAssignment_1 : ( ruleStory ) ;
    public final void rule__Model__StoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1496:1: ( ( ruleStory ) )
            // InternalTraceryPP.g:1497:2: ( ruleStory )
            {
            // InternalTraceryPP.g:1497:2: ( ruleStory )
            // InternalTraceryPP.g:1498:3: ruleStory
            {
             before(grammarAccess.getModelAccess().getStoryStoryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStory();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStoryStoryParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__StoryAssignment_1"


    // $ANTLR start "rule__Story__StoryAssignment_1"
    // InternalTraceryPP.g:1507:1: rule__Story__StoryAssignment_1 : ( ( rule__Story__StoryAlternatives_1_0 ) ) ;
    public final void rule__Story__StoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1511:1: ( ( ( rule__Story__StoryAlternatives_1_0 ) ) )
            // InternalTraceryPP.g:1512:2: ( ( rule__Story__StoryAlternatives_1_0 ) )
            {
            // InternalTraceryPP.g:1512:2: ( ( rule__Story__StoryAlternatives_1_0 ) )
            // InternalTraceryPP.g:1513:3: ( rule__Story__StoryAlternatives_1_0 )
            {
             before(grammarAccess.getStoryAccess().getStoryAlternatives_1_0()); 
            // InternalTraceryPP.g:1514:3: ( rule__Story__StoryAlternatives_1_0 )
            // InternalTraceryPP.g:1514:4: rule__Story__StoryAlternatives_1_0
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
    // InternalTraceryPP.g:1522:1: rule__ListDefinition__Start_symbolAssignment_0 : ( ruleVariable ) ;
    public final void rule__ListDefinition__Start_symbolAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1526:1: ( ( ruleVariable ) )
            // InternalTraceryPP.g:1527:2: ( ruleVariable )
            {
            // InternalTraceryPP.g:1527:2: ( ruleVariable )
            // InternalTraceryPP.g:1528:3: ruleVariable
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
    // InternalTraceryPP.g:1537:1: rule__ListDefinition__ListAssignment_2 : ( ruleWordList ) ;
    public final void rule__ListDefinition__ListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1541:1: ( ( ruleWordList ) )
            // InternalTraceryPP.g:1542:2: ( ruleWordList )
            {
            // InternalTraceryPP.g:1542:2: ( ruleWordList )
            // InternalTraceryPP.g:1543:3: ruleWordList
            {
             before(grammarAccess.getListDefinitionAccess().getListWordListParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleWordList();

            state._fsp--;

             after(grammarAccess.getListDefinitionAccess().getListWordListParserRuleCall_2_0()); 

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


    // $ANTLR start "rule__ObjectDefinition__ObjectAssignment_0"
    // InternalTraceryPP.g:1552:1: rule__ObjectDefinition__ObjectAssignment_0 : ( ruleVariable ) ;
    public final void rule__ObjectDefinition__ObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1556:1: ( ( ruleVariable ) )
            // InternalTraceryPP.g:1557:2: ( ruleVariable )
            {
            // InternalTraceryPP.g:1557:2: ( ruleVariable )
            // InternalTraceryPP.g:1558:3: ruleVariable
            {
             before(grammarAccess.getObjectDefinitionAccess().getObjectVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getObjectDefinitionAccess().getObjectVariableParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ObjectDefinition__ObjectAssignment_0"


    // $ANTLR start "rule__ObjectDefinition__AttributesAssignment_3"
    // InternalTraceryPP.g:1567:1: rule__ObjectDefinition__AttributesAssignment_3 : ( ruleAttributeList ) ;
    public final void rule__ObjectDefinition__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1571:1: ( ( ruleAttributeList ) )
            // InternalTraceryPP.g:1572:2: ( ruleAttributeList )
            {
            // InternalTraceryPP.g:1572:2: ( ruleAttributeList )
            // InternalTraceryPP.g:1573:3: ruleAttributeList
            {
             before(grammarAccess.getObjectDefinitionAccess().getAttributesAttributeListParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeList();

            state._fsp--;

             after(grammarAccess.getObjectDefinitionAccess().getAttributesAttributeListParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ObjectDefinition__AttributesAssignment_3"


    // $ANTLR start "rule__Word__ValueAssignment"
    // InternalTraceryPP.g:1582:1: rule__Word__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__Word__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1586:1: ( ( RULE_STRING ) )
            // InternalTraceryPP.g:1587:2: ( RULE_STRING )
            {
            // InternalTraceryPP.g:1587:2: ( RULE_STRING )
            // InternalTraceryPP.g:1588:3: RULE_STRING
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


    // $ANTLR start "rule__Variable__ValueAssignment"
    // InternalTraceryPP.g:1597:1: rule__Variable__ValueAssignment : ( RULE_ID ) ;
    public final void rule__Variable__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1601:1: ( ( RULE_ID ) )
            // InternalTraceryPP.g:1602:2: ( RULE_ID )
            {
            // InternalTraceryPP.g:1602:2: ( RULE_ID )
            // InternalTraceryPP.g:1603:3: RULE_ID
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


    // $ANTLR start "rule__StoryVariable__ValueAssignment_0"
    // InternalTraceryPP.g:1612:1: rule__StoryVariable__ValueAssignment_0 : ( RULE_ID ) ;
    public final void rule__StoryVariable__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1616:1: ( ( RULE_ID ) )
            // InternalTraceryPP.g:1617:2: ( RULE_ID )
            {
            // InternalTraceryPP.g:1617:2: ( RULE_ID )
            // InternalTraceryPP.g:1618:3: RULE_ID
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
    // InternalTraceryPP.g:1627:1: rule__StoryVariable__ModifiersAssignment_1 : ( ruleModifier ) ;
    public final void rule__StoryVariable__ModifiersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1631:1: ( ( ruleModifier ) )
            // InternalTraceryPP.g:1632:2: ( ruleModifier )
            {
            // InternalTraceryPP.g:1632:2: ( ruleModifier )
            // InternalTraceryPP.g:1633:3: ruleModifier
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


    // $ANTLR start "rule__Attribute__DefinitionAssignment"
    // InternalTraceryPP.g:1642:1: rule__Attribute__DefinitionAssignment : ( RULE_ID ) ;
    public final void rule__Attribute__DefinitionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1646:1: ( ( RULE_ID ) )
            // InternalTraceryPP.g:1647:2: ( RULE_ID )
            {
            // InternalTraceryPP.g:1647:2: ( RULE_ID )
            // InternalTraceryPP.g:1648:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getDefinitionIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getDefinitionIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Attribute__DefinitionAssignment"


    // $ANTLR start "rule__AdvancedAttribute__DefinitionAssignment_0"
    // InternalTraceryPP.g:1657:1: rule__AdvancedAttribute__DefinitionAssignment_0 : ( RULE_ID ) ;
    public final void rule__AdvancedAttribute__DefinitionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1661:1: ( ( RULE_ID ) )
            // InternalTraceryPP.g:1662:2: ( RULE_ID )
            {
            // InternalTraceryPP.g:1662:2: ( RULE_ID )
            // InternalTraceryPP.g:1663:3: RULE_ID
            {
             before(grammarAccess.getAdvancedAttributeAccess().getDefinitionIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAdvancedAttributeAccess().getDefinitionIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__AdvancedAttribute__DefinitionAssignment_0"


    // $ANTLR start "rule__AdvancedAttribute__ValueAssignment_2"
    // InternalTraceryPP.g:1672:1: rule__AdvancedAttribute__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AdvancedAttribute__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1676:1: ( ( RULE_STRING ) )
            // InternalTraceryPP.g:1677:2: ( RULE_STRING )
            {
            // InternalTraceryPP.g:1677:2: ( RULE_STRING )
            // InternalTraceryPP.g:1678:3: RULE_STRING
            {
             before(grammarAccess.getAdvancedAttributeAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAdvancedAttributeAccess().getValueSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__AdvancedAttribute__ValueAssignment_2"


    // $ANTLR start "rule__ObjectAttribute__ObjectAssignment_0"
    // InternalTraceryPP.g:1687:1: rule__ObjectAttribute__ObjectAssignment_0 : ( RULE_ID ) ;
    public final void rule__ObjectAttribute__ObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1691:1: ( ( RULE_ID ) )
            // InternalTraceryPP.g:1692:2: ( RULE_ID )
            {
            // InternalTraceryPP.g:1692:2: ( RULE_ID )
            // InternalTraceryPP.g:1693:3: RULE_ID
            {
             before(grammarAccess.getObjectAttributeAccess().getObjectIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectAttributeAccess().getObjectIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ObjectAttribute__ObjectAssignment_0"


    // $ANTLR start "rule__ObjectAttribute__AttributeAssignment_2"
    // InternalTraceryPP.g:1702:1: rule__ObjectAttribute__AttributeAssignment_2 : ( RULE_ID ) ;
    public final void rule__ObjectAttribute__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1706:1: ( ( RULE_ID ) )
            // InternalTraceryPP.g:1707:2: ( RULE_ID )
            {
            // InternalTraceryPP.g:1707:2: ( RULE_ID )
            // InternalTraceryPP.g:1708:3: RULE_ID
            {
             before(grammarAccess.getObjectAttributeAccess().getAttributeIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectAttributeAccess().getAttributeIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ObjectAttribute__AttributeAssignment_2"


    // $ANTLR start "rule__WordList__WordsAssignment_0"
    // InternalTraceryPP.g:1717:1: rule__WordList__WordsAssignment_0 : ( ruleWord ) ;
    public final void rule__WordList__WordsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1721:1: ( ( ruleWord ) )
            // InternalTraceryPP.g:1722:2: ( ruleWord )
            {
            // InternalTraceryPP.g:1722:2: ( ruleWord )
            // InternalTraceryPP.g:1723:3: ruleWord
            {
             before(grammarAccess.getWordListAccess().getWordsWordParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleWord();

            state._fsp--;

             after(grammarAccess.getWordListAccess().getWordsWordParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__WordList__WordsAssignment_0"


    // $ANTLR start "rule__WordList__SepAssignment_1_0"
    // InternalTraceryPP.g:1732:1: rule__WordList__SepAssignment_1_0 : ( ruleSeparator ) ;
    public final void rule__WordList__SepAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1736:1: ( ( ruleSeparator ) )
            // InternalTraceryPP.g:1737:2: ( ruleSeparator )
            {
            // InternalTraceryPP.g:1737:2: ( ruleSeparator )
            // InternalTraceryPP.g:1738:3: ruleSeparator
            {
             before(grammarAccess.getWordListAccess().getSepSeparatorParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSeparator();

            state._fsp--;

             after(grammarAccess.getWordListAccess().getSepSeparatorParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__WordList__SepAssignment_1_0"


    // $ANTLR start "rule__WordList__WordAssignment_1_1"
    // InternalTraceryPP.g:1747:1: rule__WordList__WordAssignment_1_1 : ( ruleWord ) ;
    public final void rule__WordList__WordAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1751:1: ( ( ruleWord ) )
            // InternalTraceryPP.g:1752:2: ( ruleWord )
            {
            // InternalTraceryPP.g:1752:2: ( ruleWord )
            // InternalTraceryPP.g:1753:3: ruleWord
            {
             before(grammarAccess.getWordListAccess().getWordWordParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWord();

            state._fsp--;

             after(grammarAccess.getWordListAccess().getWordWordParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__WordList__WordAssignment_1_1"


    // $ANTLR start "rule__AttributeList__AttributesAssignment_0"
    // InternalTraceryPP.g:1762:1: rule__AttributeList__AttributesAssignment_0 : ( ( rule__AttributeList__AttributesAlternatives_0_0 ) ) ;
    public final void rule__AttributeList__AttributesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1766:1: ( ( ( rule__AttributeList__AttributesAlternatives_0_0 ) ) )
            // InternalTraceryPP.g:1767:2: ( ( rule__AttributeList__AttributesAlternatives_0_0 ) )
            {
            // InternalTraceryPP.g:1767:2: ( ( rule__AttributeList__AttributesAlternatives_0_0 ) )
            // InternalTraceryPP.g:1768:3: ( rule__AttributeList__AttributesAlternatives_0_0 )
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAlternatives_0_0()); 
            // InternalTraceryPP.g:1769:3: ( rule__AttributeList__AttributesAlternatives_0_0 )
            // InternalTraceryPP.g:1769:4: rule__AttributeList__AttributesAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeList__AttributesAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeListAccess().getAttributesAlternatives_0_0()); 

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
    // $ANTLR end "rule__AttributeList__AttributesAssignment_0"


    // $ANTLR start "rule__AttributeList__SepAssignment_1_0"
    // InternalTraceryPP.g:1777:1: rule__AttributeList__SepAssignment_1_0 : ( ruleSeparator ) ;
    public final void rule__AttributeList__SepAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1781:1: ( ( ruleSeparator ) )
            // InternalTraceryPP.g:1782:2: ( ruleSeparator )
            {
            // InternalTraceryPP.g:1782:2: ( ruleSeparator )
            // InternalTraceryPP.g:1783:3: ruleSeparator
            {
             before(grammarAccess.getAttributeListAccess().getSepSeparatorParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSeparator();

            state._fsp--;

             after(grammarAccess.getAttributeListAccess().getSepSeparatorParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__AttributeList__SepAssignment_1_0"


    // $ANTLR start "rule__AttributeList__AttributeAssignment_1_1"
    // InternalTraceryPP.g:1792:1: rule__AttributeList__AttributeAssignment_1_1 : ( ( rule__AttributeList__AttributeAlternatives_1_1_0 ) ) ;
    public final void rule__AttributeList__AttributeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1796:1: ( ( ( rule__AttributeList__AttributeAlternatives_1_1_0 ) ) )
            // InternalTraceryPP.g:1797:2: ( ( rule__AttributeList__AttributeAlternatives_1_1_0 ) )
            {
            // InternalTraceryPP.g:1797:2: ( ( rule__AttributeList__AttributeAlternatives_1_1_0 ) )
            // InternalTraceryPP.g:1798:3: ( rule__AttributeList__AttributeAlternatives_1_1_0 )
            {
             before(grammarAccess.getAttributeListAccess().getAttributeAlternatives_1_1_0()); 
            // InternalTraceryPP.g:1799:3: ( rule__AttributeList__AttributeAlternatives_1_1_0 )
            // InternalTraceryPP.g:1799:4: rule__AttributeList__AttributeAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeList__AttributeAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeListAccess().getAttributeAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__AttributeList__AttributeAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000000F802L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000000C0002L});

}