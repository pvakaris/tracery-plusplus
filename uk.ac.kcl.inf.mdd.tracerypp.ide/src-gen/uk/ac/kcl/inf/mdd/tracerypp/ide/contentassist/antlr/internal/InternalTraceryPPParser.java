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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.capitalize'", "'.CAPITALIZE'", "'.s'", "'.a'", "'.ed'", "','", "'or'", "'and'", "'The'", "'story:'", "'can'", "'have'", "'values:'", "'be:'", "'is'", "'an'", "'object.'", "'It'", "'has'", "'attributes:'", "'='", "'.'"
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
    // InternalTraceryPP.g:87:1: ruleStatement : ( ruleDeclaration ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:91:2: ( ( ruleDeclaration ) )
            // InternalTraceryPP.g:92:2: ( ruleDeclaration )
            {
            // InternalTraceryPP.g:92:2: ( ruleDeclaration )
            // InternalTraceryPP.g:93:3: ruleDeclaration
            {
             before(grammarAccess.getStatementAccess().getDeclarationParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getDeclarationParserRuleCall()); 

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


    // $ANTLR start "entryRuleDeclaration"
    // InternalTraceryPP.g:103:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalTraceryPP.g:104:1: ( ruleDeclaration EOF )
            // InternalTraceryPP.g:105:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalTraceryPP.g:112:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:116:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // InternalTraceryPP.g:117:2: ( ( rule__Declaration__Alternatives ) )
            {
            // InternalTraceryPP.g:117:2: ( ( rule__Declaration__Alternatives ) )
            // InternalTraceryPP.g:118:3: ( rule__Declaration__Alternatives )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            // InternalTraceryPP.g:119:3: ( rule__Declaration__Alternatives )
            // InternalTraceryPP.g:119:4: rule__Declaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDeclaration"


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


    // $ANTLR start "entryRuleListDeclaration"
    // InternalTraceryPP.g:153:1: entryRuleListDeclaration : ruleListDeclaration EOF ;
    public final void entryRuleListDeclaration() throws RecognitionException {
        try {
            // InternalTraceryPP.g:154:1: ( ruleListDeclaration EOF )
            // InternalTraceryPP.g:155:1: ruleListDeclaration EOF
            {
             before(grammarAccess.getListDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleListDeclaration();

            state._fsp--;

             after(grammarAccess.getListDeclarationRule()); 
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
    // $ANTLR end "entryRuleListDeclaration"


    // $ANTLR start "ruleListDeclaration"
    // InternalTraceryPP.g:162:1: ruleListDeclaration : ( ( rule__ListDeclaration__Group__0 ) ) ;
    public final void ruleListDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:166:2: ( ( ( rule__ListDeclaration__Group__0 ) ) )
            // InternalTraceryPP.g:167:2: ( ( rule__ListDeclaration__Group__0 ) )
            {
            // InternalTraceryPP.g:167:2: ( ( rule__ListDeclaration__Group__0 ) )
            // InternalTraceryPP.g:168:3: ( rule__ListDeclaration__Group__0 )
            {
             before(grammarAccess.getListDeclarationAccess().getGroup()); 
            // InternalTraceryPP.g:169:3: ( rule__ListDeclaration__Group__0 )
            // InternalTraceryPP.g:169:4: rule__ListDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleListDeclaration"


    // $ANTLR start "entryRuleObjectDeclaration"
    // InternalTraceryPP.g:178:1: entryRuleObjectDeclaration : ruleObjectDeclaration EOF ;
    public final void entryRuleObjectDeclaration() throws RecognitionException {
        try {
            // InternalTraceryPP.g:179:1: ( ruleObjectDeclaration EOF )
            // InternalTraceryPP.g:180:1: ruleObjectDeclaration EOF
            {
             before(grammarAccess.getObjectDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectDeclaration();

            state._fsp--;

             after(grammarAccess.getObjectDeclarationRule()); 
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
    // $ANTLR end "entryRuleObjectDeclaration"


    // $ANTLR start "ruleObjectDeclaration"
    // InternalTraceryPP.g:187:1: ruleObjectDeclaration : ( ( rule__ObjectDeclaration__Group__0 ) ) ;
    public final void ruleObjectDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:191:2: ( ( ( rule__ObjectDeclaration__Group__0 ) ) )
            // InternalTraceryPP.g:192:2: ( ( rule__ObjectDeclaration__Group__0 ) )
            {
            // InternalTraceryPP.g:192:2: ( ( rule__ObjectDeclaration__Group__0 ) )
            // InternalTraceryPP.g:193:3: ( rule__ObjectDeclaration__Group__0 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getGroup()); 
            // InternalTraceryPP.g:194:3: ( rule__ObjectDeclaration__Group__0 )
            // InternalTraceryPP.g:194:4: rule__ObjectDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleObjectDeclaration"


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
    // InternalTraceryPP.g:237:1: ruleVariable : ( ( rule__Variable__NameAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:241:2: ( ( ( rule__Variable__NameAssignment ) ) )
            // InternalTraceryPP.g:242:2: ( ( rule__Variable__NameAssignment ) )
            {
            // InternalTraceryPP.g:242:2: ( ( rule__Variable__NameAssignment ) )
            // InternalTraceryPP.g:243:3: ( rule__Variable__NameAssignment )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment()); 
            // InternalTraceryPP.g:244:3: ( rule__Variable__NameAssignment )
            // InternalTraceryPP.g:244:4: rule__Variable__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment()); 

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
    // InternalTraceryPP.g:287:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:291:2: ( ( ( rule__Attribute__Alternatives ) ) )
            // InternalTraceryPP.g:292:2: ( ( rule__Attribute__Alternatives ) )
            {
            // InternalTraceryPP.g:292:2: ( ( rule__Attribute__Alternatives ) )
            // InternalTraceryPP.g:293:3: ( rule__Attribute__Alternatives )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives()); 
            // InternalTraceryPP.g:294:3: ( rule__Attribute__Alternatives )
            // InternalTraceryPP.g:294:4: rule__Attribute__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleObjectAttribute"
    // InternalTraceryPP.g:303:1: entryRuleObjectAttribute : ruleObjectAttribute EOF ;
    public final void entryRuleObjectAttribute() throws RecognitionException {
        try {
            // InternalTraceryPP.g:304:1: ( ruleObjectAttribute EOF )
            // InternalTraceryPP.g:305:1: ruleObjectAttribute EOF
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
    // InternalTraceryPP.g:312:1: ruleObjectAttribute : ( ( rule__ObjectAttribute__Group__0 ) ) ;
    public final void ruleObjectAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:316:2: ( ( ( rule__ObjectAttribute__Group__0 ) ) )
            // InternalTraceryPP.g:317:2: ( ( rule__ObjectAttribute__Group__0 ) )
            {
            // InternalTraceryPP.g:317:2: ( ( rule__ObjectAttribute__Group__0 ) )
            // InternalTraceryPP.g:318:3: ( rule__ObjectAttribute__Group__0 )
            {
             before(grammarAccess.getObjectAttributeAccess().getGroup()); 
            // InternalTraceryPP.g:319:3: ( rule__ObjectAttribute__Group__0 )
            // InternalTraceryPP.g:319:4: rule__ObjectAttribute__Group__0
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
    // InternalTraceryPP.g:328:1: entryRuleWordList : ruleWordList EOF ;
    public final void entryRuleWordList() throws RecognitionException {
        try {
            // InternalTraceryPP.g:329:1: ( ruleWordList EOF )
            // InternalTraceryPP.g:330:1: ruleWordList EOF
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
    // InternalTraceryPP.g:337:1: ruleWordList : ( ( rule__WordList__Group__0 ) ) ;
    public final void ruleWordList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:341:2: ( ( ( rule__WordList__Group__0 ) ) )
            // InternalTraceryPP.g:342:2: ( ( rule__WordList__Group__0 ) )
            {
            // InternalTraceryPP.g:342:2: ( ( rule__WordList__Group__0 ) )
            // InternalTraceryPP.g:343:3: ( rule__WordList__Group__0 )
            {
             before(grammarAccess.getWordListAccess().getGroup()); 
            // InternalTraceryPP.g:344:3: ( rule__WordList__Group__0 )
            // InternalTraceryPP.g:344:4: rule__WordList__Group__0
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
    // InternalTraceryPP.g:353:1: entryRuleAttributeList : ruleAttributeList EOF ;
    public final void entryRuleAttributeList() throws RecognitionException {
        try {
            // InternalTraceryPP.g:354:1: ( ruleAttributeList EOF )
            // InternalTraceryPP.g:355:1: ruleAttributeList EOF
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
    // InternalTraceryPP.g:362:1: ruleAttributeList : ( ( rule__AttributeList__Group__0 ) ) ;
    public final void ruleAttributeList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:366:2: ( ( ( rule__AttributeList__Group__0 ) ) )
            // InternalTraceryPP.g:367:2: ( ( rule__AttributeList__Group__0 ) )
            {
            // InternalTraceryPP.g:367:2: ( ( rule__AttributeList__Group__0 ) )
            // InternalTraceryPP.g:368:3: ( rule__AttributeList__Group__0 )
            {
             before(grammarAccess.getAttributeListAccess().getGroup()); 
            // InternalTraceryPP.g:369:3: ( rule__AttributeList__Group__0 )
            // InternalTraceryPP.g:369:4: rule__AttributeList__Group__0
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


    // $ANTLR start "entryRuleModifier"
    // InternalTraceryPP.g:378:1: entryRuleModifier : ruleModifier EOF ;
    public final void entryRuleModifier() throws RecognitionException {
        try {
            // InternalTraceryPP.g:379:1: ( ruleModifier EOF )
            // InternalTraceryPP.g:380:1: ruleModifier EOF
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
    // InternalTraceryPP.g:387:1: ruleModifier : ( ( rule__Modifier__Alternatives ) ) ;
    public final void ruleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:391:2: ( ( ( rule__Modifier__Alternatives ) ) )
            // InternalTraceryPP.g:392:2: ( ( rule__Modifier__Alternatives ) )
            {
            // InternalTraceryPP.g:392:2: ( ( rule__Modifier__Alternatives ) )
            // InternalTraceryPP.g:393:3: ( rule__Modifier__Alternatives )
            {
             before(grammarAccess.getModifierAccess().getAlternatives()); 
            // InternalTraceryPP.g:394:3: ( rule__Modifier__Alternatives )
            // InternalTraceryPP.g:394:4: rule__Modifier__Alternatives
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
    // InternalTraceryPP.g:403:1: entryRuleCapitalizationModifier : ruleCapitalizationModifier EOF ;
    public final void entryRuleCapitalizationModifier() throws RecognitionException {
        try {
            // InternalTraceryPP.g:404:1: ( ruleCapitalizationModifier EOF )
            // InternalTraceryPP.g:405:1: ruleCapitalizationModifier EOF
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
    // InternalTraceryPP.g:412:1: ruleCapitalizationModifier : ( '.capitalize' ) ;
    public final void ruleCapitalizationModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:416:2: ( ( '.capitalize' ) )
            // InternalTraceryPP.g:417:2: ( '.capitalize' )
            {
            // InternalTraceryPP.g:417:2: ( '.capitalize' )
            // InternalTraceryPP.g:418:3: '.capitalize'
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
    // InternalTraceryPP.g:428:1: entryRuleFullCapitalizationModifier : ruleFullCapitalizationModifier EOF ;
    public final void entryRuleFullCapitalizationModifier() throws RecognitionException {
        try {
            // InternalTraceryPP.g:429:1: ( ruleFullCapitalizationModifier EOF )
            // InternalTraceryPP.g:430:1: ruleFullCapitalizationModifier EOF
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
    // InternalTraceryPP.g:437:1: ruleFullCapitalizationModifier : ( '.CAPITALIZE' ) ;
    public final void ruleFullCapitalizationModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:441:2: ( ( '.CAPITALIZE' ) )
            // InternalTraceryPP.g:442:2: ( '.CAPITALIZE' )
            {
            // InternalTraceryPP.g:442:2: ( '.CAPITALIZE' )
            // InternalTraceryPP.g:443:3: '.CAPITALIZE'
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
    // InternalTraceryPP.g:453:1: entryRulePluralityModifier : rulePluralityModifier EOF ;
    public final void entryRulePluralityModifier() throws RecognitionException {
        try {
            // InternalTraceryPP.g:454:1: ( rulePluralityModifier EOF )
            // InternalTraceryPP.g:455:1: rulePluralityModifier EOF
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
    // InternalTraceryPP.g:462:1: rulePluralityModifier : ( '.s' ) ;
    public final void rulePluralityModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:466:2: ( ( '.s' ) )
            // InternalTraceryPP.g:467:2: ( '.s' )
            {
            // InternalTraceryPP.g:467:2: ( '.s' )
            // InternalTraceryPP.g:468:3: '.s'
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
    // InternalTraceryPP.g:478:1: entryRuleArticleModifier : ruleArticleModifier EOF ;
    public final void entryRuleArticleModifier() throws RecognitionException {
        try {
            // InternalTraceryPP.g:479:1: ( ruleArticleModifier EOF )
            // InternalTraceryPP.g:480:1: ruleArticleModifier EOF
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
    // InternalTraceryPP.g:487:1: ruleArticleModifier : ( '.a' ) ;
    public final void ruleArticleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:491:2: ( ( '.a' ) )
            // InternalTraceryPP.g:492:2: ( '.a' )
            {
            // InternalTraceryPP.g:492:2: ( '.a' )
            // InternalTraceryPP.g:493:3: '.a'
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
    // InternalTraceryPP.g:503:1: entryRulePastTenseModifier : rulePastTenseModifier EOF ;
    public final void entryRulePastTenseModifier() throws RecognitionException {
        try {
            // InternalTraceryPP.g:504:1: ( rulePastTenseModifier EOF )
            // InternalTraceryPP.g:505:1: rulePastTenseModifier EOF
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
    // InternalTraceryPP.g:512:1: rulePastTenseModifier : ( '.ed' ) ;
    public final void rulePastTenseModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:516:2: ( ( '.ed' ) )
            // InternalTraceryPP.g:517:2: ( '.ed' )
            {
            // InternalTraceryPP.g:517:2: ( '.ed' )
            // InternalTraceryPP.g:518:3: '.ed'
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


    // $ANTLR start "entryRuleSeparatorOr"
    // InternalTraceryPP.g:528:1: entryRuleSeparatorOr : ruleSeparatorOr EOF ;
    public final void entryRuleSeparatorOr() throws RecognitionException {
        try {
            // InternalTraceryPP.g:529:1: ( ruleSeparatorOr EOF )
            // InternalTraceryPP.g:530:1: ruleSeparatorOr EOF
            {
             before(grammarAccess.getSeparatorOrRule()); 
            pushFollow(FOLLOW_1);
            ruleSeparatorOr();

            state._fsp--;

             after(grammarAccess.getSeparatorOrRule()); 
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
    // $ANTLR end "entryRuleSeparatorOr"


    // $ANTLR start "ruleSeparatorOr"
    // InternalTraceryPP.g:537:1: ruleSeparatorOr : ( ( rule__SeparatorOr__Alternatives ) ) ;
    public final void ruleSeparatorOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:541:2: ( ( ( rule__SeparatorOr__Alternatives ) ) )
            // InternalTraceryPP.g:542:2: ( ( rule__SeparatorOr__Alternatives ) )
            {
            // InternalTraceryPP.g:542:2: ( ( rule__SeparatorOr__Alternatives ) )
            // InternalTraceryPP.g:543:3: ( rule__SeparatorOr__Alternatives )
            {
             before(grammarAccess.getSeparatorOrAccess().getAlternatives()); 
            // InternalTraceryPP.g:544:3: ( rule__SeparatorOr__Alternatives )
            // InternalTraceryPP.g:544:4: rule__SeparatorOr__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SeparatorOr__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSeparatorOrAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSeparatorOr"


    // $ANTLR start "entryRuleSeparatorAnd"
    // InternalTraceryPP.g:553:1: entryRuleSeparatorAnd : ruleSeparatorAnd EOF ;
    public final void entryRuleSeparatorAnd() throws RecognitionException {
        try {
            // InternalTraceryPP.g:554:1: ( ruleSeparatorAnd EOF )
            // InternalTraceryPP.g:555:1: ruleSeparatorAnd EOF
            {
             before(grammarAccess.getSeparatorAndRule()); 
            pushFollow(FOLLOW_1);
            ruleSeparatorAnd();

            state._fsp--;

             after(grammarAccess.getSeparatorAndRule()); 
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
    // $ANTLR end "entryRuleSeparatorAnd"


    // $ANTLR start "ruleSeparatorAnd"
    // InternalTraceryPP.g:562:1: ruleSeparatorAnd : ( ( rule__SeparatorAnd__Alternatives ) ) ;
    public final void ruleSeparatorAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:566:2: ( ( ( rule__SeparatorAnd__Alternatives ) ) )
            // InternalTraceryPP.g:567:2: ( ( rule__SeparatorAnd__Alternatives ) )
            {
            // InternalTraceryPP.g:567:2: ( ( rule__SeparatorAnd__Alternatives ) )
            // InternalTraceryPP.g:568:3: ( rule__SeparatorAnd__Alternatives )
            {
             before(grammarAccess.getSeparatorAndAccess().getAlternatives()); 
            // InternalTraceryPP.g:569:3: ( rule__SeparatorAnd__Alternatives )
            // InternalTraceryPP.g:569:4: rule__SeparatorAnd__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SeparatorAnd__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSeparatorAndAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSeparatorAnd"


    // $ANTLR start "rule__Declaration__Alternatives"
    // InternalTraceryPP.g:577:1: rule__Declaration__Alternatives : ( ( ruleListDeclaration ) | ( ruleObjectDeclaration ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:581:1: ( ( ruleListDeclaration ) | ( ruleObjectDeclaration ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==21) ) {
                    alt1=1;
                }
                else if ( (LA1_1==25) ) {
                    alt1=2;
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
                    // InternalTraceryPP.g:582:2: ( ruleListDeclaration )
                    {
                    // InternalTraceryPP.g:582:2: ( ruleListDeclaration )
                    // InternalTraceryPP.g:583:3: ruleListDeclaration
                    {
                     before(grammarAccess.getDeclarationAccess().getListDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleListDeclaration();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getListDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:588:2: ( ruleObjectDeclaration )
                    {
                    // InternalTraceryPP.g:588:2: ( ruleObjectDeclaration )
                    // InternalTraceryPP.g:589:3: ruleObjectDeclaration
                    {
                     before(grammarAccess.getDeclarationAccess().getObjectDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleObjectDeclaration();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getObjectDeclarationParserRuleCall_1()); 

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
    // $ANTLR end "rule__Declaration__Alternatives"


    // $ANTLR start "rule__Story__StoryAlternatives_3_0"
    // InternalTraceryPP.g:598:1: rule__Story__StoryAlternatives_3_0 : ( ( ruleWord ) | ( ruleStoryVariable ) | ( ruleObjectAttribute ) );
    public final void rule__Story__StoryAlternatives_3_0() throws RecognitionException {

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

                if ( (LA2_2==EOF||(LA2_2>=RULE_ID && LA2_2<=RULE_STRING)||(LA2_2>=11 && LA2_2<=15)) ) {
                    alt2=2;
                }
                else if ( (LA2_2==32) ) {
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
                     before(grammarAccess.getStoryAccess().getStoryWordParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWord();

                    state._fsp--;

                     after(grammarAccess.getStoryAccess().getStoryWordParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:609:2: ( ruleStoryVariable )
                    {
                    // InternalTraceryPP.g:609:2: ( ruleStoryVariable )
                    // InternalTraceryPP.g:610:3: ruleStoryVariable
                    {
                     before(grammarAccess.getStoryAccess().getStoryStoryVariableParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStoryVariable();

                    state._fsp--;

                     after(grammarAccess.getStoryAccess().getStoryStoryVariableParserRuleCall_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPP.g:615:2: ( ruleObjectAttribute )
                    {
                    // InternalTraceryPP.g:615:2: ( ruleObjectAttribute )
                    // InternalTraceryPP.g:616:3: ruleObjectAttribute
                    {
                     before(grammarAccess.getStoryAccess().getStoryObjectAttributeParserRuleCall_3_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleObjectAttribute();

                    state._fsp--;

                     after(grammarAccess.getStoryAccess().getStoryObjectAttributeParserRuleCall_3_0_2()); 

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
    // $ANTLR end "rule__Story__StoryAlternatives_3_0"


    // $ANTLR start "rule__ListDeclaration__Alternatives_1"
    // InternalTraceryPP.g:625:1: rule__ListDeclaration__Alternatives_1 : ( ( ( rule__ListDeclaration__Group_1_0__0 ) ) | ( ( rule__ListDeclaration__Group_1_1__0 ) ) );
    public final void rule__ListDeclaration__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:629:1: ( ( ( rule__ListDeclaration__Group_1_0__0 ) ) | ( ( rule__ListDeclaration__Group_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==22) ) {
                    alt3=1;
                }
                else if ( (LA3_1==24) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

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
                    // InternalTraceryPP.g:630:2: ( ( rule__ListDeclaration__Group_1_0__0 ) )
                    {
                    // InternalTraceryPP.g:630:2: ( ( rule__ListDeclaration__Group_1_0__0 ) )
                    // InternalTraceryPP.g:631:3: ( rule__ListDeclaration__Group_1_0__0 )
                    {
                     before(grammarAccess.getListDeclarationAccess().getGroup_1_0()); 
                    // InternalTraceryPP.g:632:3: ( rule__ListDeclaration__Group_1_0__0 )
                    // InternalTraceryPP.g:632:4: rule__ListDeclaration__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ListDeclaration__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getListDeclarationAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:636:2: ( ( rule__ListDeclaration__Group_1_1__0 ) )
                    {
                    // InternalTraceryPP.g:636:2: ( ( rule__ListDeclaration__Group_1_1__0 ) )
                    // InternalTraceryPP.g:637:3: ( rule__ListDeclaration__Group_1_1__0 )
                    {
                     before(grammarAccess.getListDeclarationAccess().getGroup_1_1()); 
                    // InternalTraceryPP.g:638:3: ( rule__ListDeclaration__Group_1_1__0 )
                    // InternalTraceryPP.g:638:4: rule__ListDeclaration__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ListDeclaration__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getListDeclarationAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__ListDeclaration__Alternatives_1"


    // $ANTLR start "rule__Attribute__Alternatives"
    // InternalTraceryPP.g:646:1: rule__Attribute__Alternatives : ( ( ( rule__Attribute__NameAssignment_0 ) ) | ( ( rule__Attribute__Group_1__0 ) ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:650:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) | ( ( rule__Attribute__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==31) ) {
                    alt4=2;
                }
                else if ( (LA4_1==EOF||LA4_1==RULE_ID||LA4_1==16||(LA4_1>=18 && LA4_1<=19)) ) {
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
                    // InternalTraceryPP.g:651:2: ( ( rule__Attribute__NameAssignment_0 ) )
                    {
                    // InternalTraceryPP.g:651:2: ( ( rule__Attribute__NameAssignment_0 ) )
                    // InternalTraceryPP.g:652:3: ( rule__Attribute__NameAssignment_0 )
                    {
                     before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
                    // InternalTraceryPP.g:653:3: ( rule__Attribute__NameAssignment_0 )
                    // InternalTraceryPP.g:653:4: rule__Attribute__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__NameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:657:2: ( ( rule__Attribute__Group_1__0 ) )
                    {
                    // InternalTraceryPP.g:657:2: ( ( rule__Attribute__Group_1__0 ) )
                    // InternalTraceryPP.g:658:3: ( rule__Attribute__Group_1__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_1()); 
                    // InternalTraceryPP.g:659:3: ( rule__Attribute__Group_1__0 )
                    // InternalTraceryPP.g:659:4: rule__Attribute__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Attribute__Alternatives"


    // $ANTLR start "rule__Modifier__Alternatives"
    // InternalTraceryPP.g:667:1: rule__Modifier__Alternatives : ( ( ruleCapitalizationModifier ) | ( ruleFullCapitalizationModifier ) | ( rulePluralityModifier ) | ( ruleArticleModifier ) | ( rulePastTenseModifier ) );
    public final void rule__Modifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:671:1: ( ( ruleCapitalizationModifier ) | ( ruleFullCapitalizationModifier ) | ( rulePluralityModifier ) | ( ruleArticleModifier ) | ( rulePastTenseModifier ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            case 14:
                {
                alt5=4;
                }
                break;
            case 15:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTraceryPP.g:672:2: ( ruleCapitalizationModifier )
                    {
                    // InternalTraceryPP.g:672:2: ( ruleCapitalizationModifier )
                    // InternalTraceryPP.g:673:3: ruleCapitalizationModifier
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
                    // InternalTraceryPP.g:678:2: ( ruleFullCapitalizationModifier )
                    {
                    // InternalTraceryPP.g:678:2: ( ruleFullCapitalizationModifier )
                    // InternalTraceryPP.g:679:3: ruleFullCapitalizationModifier
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
                    // InternalTraceryPP.g:684:2: ( rulePluralityModifier )
                    {
                    // InternalTraceryPP.g:684:2: ( rulePluralityModifier )
                    // InternalTraceryPP.g:685:3: rulePluralityModifier
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
                    // InternalTraceryPP.g:690:2: ( ruleArticleModifier )
                    {
                    // InternalTraceryPP.g:690:2: ( ruleArticleModifier )
                    // InternalTraceryPP.g:691:3: ruleArticleModifier
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
                    // InternalTraceryPP.g:696:2: ( rulePastTenseModifier )
                    {
                    // InternalTraceryPP.g:696:2: ( rulePastTenseModifier )
                    // InternalTraceryPP.g:697:3: rulePastTenseModifier
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


    // $ANTLR start "rule__SeparatorOr__Alternatives"
    // InternalTraceryPP.g:706:1: rule__SeparatorOr__Alternatives : ( ( ',' ) | ( 'or' ) );
    public final void rule__SeparatorOr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:710:1: ( ( ',' ) | ( 'or' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTraceryPP.g:711:2: ( ',' )
                    {
                    // InternalTraceryPP.g:711:2: ( ',' )
                    // InternalTraceryPP.g:712:3: ','
                    {
                     before(grammarAccess.getSeparatorOrAccess().getCommaKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSeparatorOrAccess().getCommaKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:717:2: ( 'or' )
                    {
                    // InternalTraceryPP.g:717:2: ( 'or' )
                    // InternalTraceryPP.g:718:3: 'or'
                    {
                     before(grammarAccess.getSeparatorOrAccess().getOrKeyword_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSeparatorOrAccess().getOrKeyword_1()); 

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
    // $ANTLR end "rule__SeparatorOr__Alternatives"


    // $ANTLR start "rule__SeparatorAnd__Alternatives"
    // InternalTraceryPP.g:727:1: rule__SeparatorAnd__Alternatives : ( ( ',' ) | ( 'and' ) );
    public final void rule__SeparatorAnd__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:731:1: ( ( ',' ) | ( 'and' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTraceryPP.g:732:2: ( ',' )
                    {
                    // InternalTraceryPP.g:732:2: ( ',' )
                    // InternalTraceryPP.g:733:3: ','
                    {
                     before(grammarAccess.getSeparatorAndAccess().getCommaKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSeparatorAndAccess().getCommaKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPP.g:738:2: ( 'and' )
                    {
                    // InternalTraceryPP.g:738:2: ( 'and' )
                    // InternalTraceryPP.g:739:3: 'and'
                    {
                     before(grammarAccess.getSeparatorAndAccess().getAndKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getSeparatorAndAccess().getAndKeyword_1()); 

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
    // $ANTLR end "rule__SeparatorAnd__Alternatives"


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
            pushFollow(FOLLOW_3);
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
    // InternalTraceryPP.g:814:1: rule__Story__Group__0__Impl : ( () ) ;
    public final void rule__Story__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:818:1: ( ( () ) )
            // InternalTraceryPP.g:819:1: ( () )
            {
            // InternalTraceryPP.g:819:1: ( () )
            // InternalTraceryPP.g:820:2: ()
            {
             before(grammarAccess.getStoryAccess().getStoryAction_0()); 
            // InternalTraceryPP.g:821:2: ()
            // InternalTraceryPP.g:821:3: 
            {
            }

             after(grammarAccess.getStoryAccess().getStoryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Story__Group__0__Impl"


    // $ANTLR start "rule__Story__Group__1"
    // InternalTraceryPP.g:829:1: rule__Story__Group__1 : rule__Story__Group__1__Impl rule__Story__Group__2 ;
    public final void rule__Story__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:833:1: ( rule__Story__Group__1__Impl rule__Story__Group__2 )
            // InternalTraceryPP.g:834:2: rule__Story__Group__1__Impl rule__Story__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Story__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Story__Group__2();

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
    // InternalTraceryPP.g:841:1: rule__Story__Group__1__Impl : ( 'The' ) ;
    public final void rule__Story__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:845:1: ( ( 'The' ) )
            // InternalTraceryPP.g:846:1: ( 'The' )
            {
            // InternalTraceryPP.g:846:1: ( 'The' )
            // InternalTraceryPP.g:847:2: 'The'
            {
             before(grammarAccess.getStoryAccess().getTheKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getStoryAccess().getTheKeyword_1()); 

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


    // $ANTLR start "rule__Story__Group__2"
    // InternalTraceryPP.g:856:1: rule__Story__Group__2 : rule__Story__Group__2__Impl rule__Story__Group__3 ;
    public final void rule__Story__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:860:1: ( rule__Story__Group__2__Impl rule__Story__Group__3 )
            // InternalTraceryPP.g:861:2: rule__Story__Group__2__Impl rule__Story__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Story__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Story__Group__3();

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
    // $ANTLR end "rule__Story__Group__2"


    // $ANTLR start "rule__Story__Group__2__Impl"
    // InternalTraceryPP.g:868:1: rule__Story__Group__2__Impl : ( 'story:' ) ;
    public final void rule__Story__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:872:1: ( ( 'story:' ) )
            // InternalTraceryPP.g:873:1: ( 'story:' )
            {
            // InternalTraceryPP.g:873:1: ( 'story:' )
            // InternalTraceryPP.g:874:2: 'story:'
            {
             before(grammarAccess.getStoryAccess().getStoryKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStoryAccess().getStoryKeyword_2()); 

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
    // $ANTLR end "rule__Story__Group__2__Impl"


    // $ANTLR start "rule__Story__Group__3"
    // InternalTraceryPP.g:883:1: rule__Story__Group__3 : rule__Story__Group__3__Impl ;
    public final void rule__Story__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:887:1: ( rule__Story__Group__3__Impl )
            // InternalTraceryPP.g:888:2: rule__Story__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Story__Group__3__Impl();

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
    // $ANTLR end "rule__Story__Group__3"


    // $ANTLR start "rule__Story__Group__3__Impl"
    // InternalTraceryPP.g:894:1: rule__Story__Group__3__Impl : ( ( rule__Story__StoryAssignment_3 )* ) ;
    public final void rule__Story__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:898:1: ( ( ( rule__Story__StoryAssignment_3 )* ) )
            // InternalTraceryPP.g:899:1: ( ( rule__Story__StoryAssignment_3 )* )
            {
            // InternalTraceryPP.g:899:1: ( ( rule__Story__StoryAssignment_3 )* )
            // InternalTraceryPP.g:900:2: ( rule__Story__StoryAssignment_3 )*
            {
             before(grammarAccess.getStoryAccess().getStoryAssignment_3()); 
            // InternalTraceryPP.g:901:2: ( rule__Story__StoryAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTraceryPP.g:901:3: rule__Story__StoryAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Story__StoryAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getStoryAccess().getStoryAssignment_3()); 

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
    // $ANTLR end "rule__Story__Group__3__Impl"


    // $ANTLR start "rule__ListDeclaration__Group__0"
    // InternalTraceryPP.g:910:1: rule__ListDeclaration__Group__0 : rule__ListDeclaration__Group__0__Impl rule__ListDeclaration__Group__1 ;
    public final void rule__ListDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:914:1: ( rule__ListDeclaration__Group__0__Impl rule__ListDeclaration__Group__1 )
            // InternalTraceryPP.g:915:2: rule__ListDeclaration__Group__0__Impl rule__ListDeclaration__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ListDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListDeclaration__Group__1();

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
    // $ANTLR end "rule__ListDeclaration__Group__0"


    // $ANTLR start "rule__ListDeclaration__Group__0__Impl"
    // InternalTraceryPP.g:922:1: rule__ListDeclaration__Group__0__Impl : ( ( rule__ListDeclaration__Start_symbolAssignment_0 ) ) ;
    public final void rule__ListDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:926:1: ( ( ( rule__ListDeclaration__Start_symbolAssignment_0 ) ) )
            // InternalTraceryPP.g:927:1: ( ( rule__ListDeclaration__Start_symbolAssignment_0 ) )
            {
            // InternalTraceryPP.g:927:1: ( ( rule__ListDeclaration__Start_symbolAssignment_0 ) )
            // InternalTraceryPP.g:928:2: ( rule__ListDeclaration__Start_symbolAssignment_0 )
            {
             before(grammarAccess.getListDeclarationAccess().getStart_symbolAssignment_0()); 
            // InternalTraceryPP.g:929:2: ( rule__ListDeclaration__Start_symbolAssignment_0 )
            // InternalTraceryPP.g:929:3: rule__ListDeclaration__Start_symbolAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ListDeclaration__Start_symbolAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getListDeclarationAccess().getStart_symbolAssignment_0()); 

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
    // $ANTLR end "rule__ListDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ListDeclaration__Group__1"
    // InternalTraceryPP.g:937:1: rule__ListDeclaration__Group__1 : rule__ListDeclaration__Group__1__Impl rule__ListDeclaration__Group__2 ;
    public final void rule__ListDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:941:1: ( rule__ListDeclaration__Group__1__Impl rule__ListDeclaration__Group__2 )
            // InternalTraceryPP.g:942:2: rule__ListDeclaration__Group__1__Impl rule__ListDeclaration__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ListDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListDeclaration__Group__2();

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
    // $ANTLR end "rule__ListDeclaration__Group__1"


    // $ANTLR start "rule__ListDeclaration__Group__1__Impl"
    // InternalTraceryPP.g:949:1: rule__ListDeclaration__Group__1__Impl : ( ( rule__ListDeclaration__Alternatives_1 ) ) ;
    public final void rule__ListDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:953:1: ( ( ( rule__ListDeclaration__Alternatives_1 ) ) )
            // InternalTraceryPP.g:954:1: ( ( rule__ListDeclaration__Alternatives_1 ) )
            {
            // InternalTraceryPP.g:954:1: ( ( rule__ListDeclaration__Alternatives_1 ) )
            // InternalTraceryPP.g:955:2: ( rule__ListDeclaration__Alternatives_1 )
            {
             before(grammarAccess.getListDeclarationAccess().getAlternatives_1()); 
            // InternalTraceryPP.g:956:2: ( rule__ListDeclaration__Alternatives_1 )
            // InternalTraceryPP.g:956:3: rule__ListDeclaration__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__ListDeclaration__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getListDeclarationAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__ListDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ListDeclaration__Group__2"
    // InternalTraceryPP.g:964:1: rule__ListDeclaration__Group__2 : rule__ListDeclaration__Group__2__Impl ;
    public final void rule__ListDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:968:1: ( rule__ListDeclaration__Group__2__Impl )
            // InternalTraceryPP.g:969:2: rule__ListDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListDeclaration__Group__2__Impl();

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
    // $ANTLR end "rule__ListDeclaration__Group__2"


    // $ANTLR start "rule__ListDeclaration__Group__2__Impl"
    // InternalTraceryPP.g:975:1: rule__ListDeclaration__Group__2__Impl : ( ( rule__ListDeclaration__ListAssignment_2 ) ) ;
    public final void rule__ListDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:979:1: ( ( ( rule__ListDeclaration__ListAssignment_2 ) ) )
            // InternalTraceryPP.g:980:1: ( ( rule__ListDeclaration__ListAssignment_2 ) )
            {
            // InternalTraceryPP.g:980:1: ( ( rule__ListDeclaration__ListAssignment_2 ) )
            // InternalTraceryPP.g:981:2: ( rule__ListDeclaration__ListAssignment_2 )
            {
             before(grammarAccess.getListDeclarationAccess().getListAssignment_2()); 
            // InternalTraceryPP.g:982:2: ( rule__ListDeclaration__ListAssignment_2 )
            // InternalTraceryPP.g:982:3: rule__ListDeclaration__ListAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ListDeclaration__ListAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getListDeclarationAccess().getListAssignment_2()); 

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
    // $ANTLR end "rule__ListDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ListDeclaration__Group_1_0__0"
    // InternalTraceryPP.g:991:1: rule__ListDeclaration__Group_1_0__0 : rule__ListDeclaration__Group_1_0__0__Impl rule__ListDeclaration__Group_1_0__1 ;
    public final void rule__ListDeclaration__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:995:1: ( rule__ListDeclaration__Group_1_0__0__Impl rule__ListDeclaration__Group_1_0__1 )
            // InternalTraceryPP.g:996:2: rule__ListDeclaration__Group_1_0__0__Impl rule__ListDeclaration__Group_1_0__1
            {
            pushFollow(FOLLOW_10);
            rule__ListDeclaration__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListDeclaration__Group_1_0__1();

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
    // $ANTLR end "rule__ListDeclaration__Group_1_0__0"


    // $ANTLR start "rule__ListDeclaration__Group_1_0__0__Impl"
    // InternalTraceryPP.g:1003:1: rule__ListDeclaration__Group_1_0__0__Impl : ( 'can' ) ;
    public final void rule__ListDeclaration__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1007:1: ( ( 'can' ) )
            // InternalTraceryPP.g:1008:1: ( 'can' )
            {
            // InternalTraceryPP.g:1008:1: ( 'can' )
            // InternalTraceryPP.g:1009:2: 'can'
            {
             before(grammarAccess.getListDeclarationAccess().getCanKeyword_1_0_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getListDeclarationAccess().getCanKeyword_1_0_0()); 

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
    // $ANTLR end "rule__ListDeclaration__Group_1_0__0__Impl"


    // $ANTLR start "rule__ListDeclaration__Group_1_0__1"
    // InternalTraceryPP.g:1018:1: rule__ListDeclaration__Group_1_0__1 : rule__ListDeclaration__Group_1_0__1__Impl rule__ListDeclaration__Group_1_0__2 ;
    public final void rule__ListDeclaration__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1022:1: ( rule__ListDeclaration__Group_1_0__1__Impl rule__ListDeclaration__Group_1_0__2 )
            // InternalTraceryPP.g:1023:2: rule__ListDeclaration__Group_1_0__1__Impl rule__ListDeclaration__Group_1_0__2
            {
            pushFollow(FOLLOW_11);
            rule__ListDeclaration__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListDeclaration__Group_1_0__2();

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
    // $ANTLR end "rule__ListDeclaration__Group_1_0__1"


    // $ANTLR start "rule__ListDeclaration__Group_1_0__1__Impl"
    // InternalTraceryPP.g:1030:1: rule__ListDeclaration__Group_1_0__1__Impl : ( 'have' ) ;
    public final void rule__ListDeclaration__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1034:1: ( ( 'have' ) )
            // InternalTraceryPP.g:1035:1: ( 'have' )
            {
            // InternalTraceryPP.g:1035:1: ( 'have' )
            // InternalTraceryPP.g:1036:2: 'have'
            {
             before(grammarAccess.getListDeclarationAccess().getHaveKeyword_1_0_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getListDeclarationAccess().getHaveKeyword_1_0_1()); 

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
    // $ANTLR end "rule__ListDeclaration__Group_1_0__1__Impl"


    // $ANTLR start "rule__ListDeclaration__Group_1_0__2"
    // InternalTraceryPP.g:1045:1: rule__ListDeclaration__Group_1_0__2 : rule__ListDeclaration__Group_1_0__2__Impl ;
    public final void rule__ListDeclaration__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1049:1: ( rule__ListDeclaration__Group_1_0__2__Impl )
            // InternalTraceryPP.g:1050:2: rule__ListDeclaration__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListDeclaration__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__ListDeclaration__Group_1_0__2"


    // $ANTLR start "rule__ListDeclaration__Group_1_0__2__Impl"
    // InternalTraceryPP.g:1056:1: rule__ListDeclaration__Group_1_0__2__Impl : ( 'values:' ) ;
    public final void rule__ListDeclaration__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1060:1: ( ( 'values:' ) )
            // InternalTraceryPP.g:1061:1: ( 'values:' )
            {
            // InternalTraceryPP.g:1061:1: ( 'values:' )
            // InternalTraceryPP.g:1062:2: 'values:'
            {
             before(grammarAccess.getListDeclarationAccess().getValuesKeyword_1_0_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getListDeclarationAccess().getValuesKeyword_1_0_2()); 

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
    // $ANTLR end "rule__ListDeclaration__Group_1_0__2__Impl"


    // $ANTLR start "rule__ListDeclaration__Group_1_1__0"
    // InternalTraceryPP.g:1072:1: rule__ListDeclaration__Group_1_1__0 : rule__ListDeclaration__Group_1_1__0__Impl rule__ListDeclaration__Group_1_1__1 ;
    public final void rule__ListDeclaration__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1076:1: ( rule__ListDeclaration__Group_1_1__0__Impl rule__ListDeclaration__Group_1_1__1 )
            // InternalTraceryPP.g:1077:2: rule__ListDeclaration__Group_1_1__0__Impl rule__ListDeclaration__Group_1_1__1
            {
            pushFollow(FOLLOW_12);
            rule__ListDeclaration__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListDeclaration__Group_1_1__1();

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
    // $ANTLR end "rule__ListDeclaration__Group_1_1__0"


    // $ANTLR start "rule__ListDeclaration__Group_1_1__0__Impl"
    // InternalTraceryPP.g:1084:1: rule__ListDeclaration__Group_1_1__0__Impl : ( 'can' ) ;
    public final void rule__ListDeclaration__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1088:1: ( ( 'can' ) )
            // InternalTraceryPP.g:1089:1: ( 'can' )
            {
            // InternalTraceryPP.g:1089:1: ( 'can' )
            // InternalTraceryPP.g:1090:2: 'can'
            {
             before(grammarAccess.getListDeclarationAccess().getCanKeyword_1_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getListDeclarationAccess().getCanKeyword_1_1_0()); 

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
    // $ANTLR end "rule__ListDeclaration__Group_1_1__0__Impl"


    // $ANTLR start "rule__ListDeclaration__Group_1_1__1"
    // InternalTraceryPP.g:1099:1: rule__ListDeclaration__Group_1_1__1 : rule__ListDeclaration__Group_1_1__1__Impl ;
    public final void rule__ListDeclaration__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1103:1: ( rule__ListDeclaration__Group_1_1__1__Impl )
            // InternalTraceryPP.g:1104:2: rule__ListDeclaration__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListDeclaration__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__ListDeclaration__Group_1_1__1"


    // $ANTLR start "rule__ListDeclaration__Group_1_1__1__Impl"
    // InternalTraceryPP.g:1110:1: rule__ListDeclaration__Group_1_1__1__Impl : ( 'be:' ) ;
    public final void rule__ListDeclaration__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1114:1: ( ( 'be:' ) )
            // InternalTraceryPP.g:1115:1: ( 'be:' )
            {
            // InternalTraceryPP.g:1115:1: ( 'be:' )
            // InternalTraceryPP.g:1116:2: 'be:'
            {
             before(grammarAccess.getListDeclarationAccess().getBeKeyword_1_1_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getListDeclarationAccess().getBeKeyword_1_1_1()); 

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
    // $ANTLR end "rule__ListDeclaration__Group_1_1__1__Impl"


    // $ANTLR start "rule__ObjectDeclaration__Group__0"
    // InternalTraceryPP.g:1126:1: rule__ObjectDeclaration__Group__0 : rule__ObjectDeclaration__Group__0__Impl rule__ObjectDeclaration__Group__1 ;
    public final void rule__ObjectDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1130:1: ( rule__ObjectDeclaration__Group__0__Impl rule__ObjectDeclaration__Group__1 )
            // InternalTraceryPP.g:1131:2: rule__ObjectDeclaration__Group__0__Impl rule__ObjectDeclaration__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ObjectDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectDeclaration__Group__1();

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
    // $ANTLR end "rule__ObjectDeclaration__Group__0"


    // $ANTLR start "rule__ObjectDeclaration__Group__0__Impl"
    // InternalTraceryPP.g:1138:1: rule__ObjectDeclaration__Group__0__Impl : ( ( rule__ObjectDeclaration__NameAssignment_0 ) ) ;
    public final void rule__ObjectDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1142:1: ( ( ( rule__ObjectDeclaration__NameAssignment_0 ) ) )
            // InternalTraceryPP.g:1143:1: ( ( rule__ObjectDeclaration__NameAssignment_0 ) )
            {
            // InternalTraceryPP.g:1143:1: ( ( rule__ObjectDeclaration__NameAssignment_0 ) )
            // InternalTraceryPP.g:1144:2: ( rule__ObjectDeclaration__NameAssignment_0 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getNameAssignment_0()); 
            // InternalTraceryPP.g:1145:2: ( rule__ObjectDeclaration__NameAssignment_0 )
            // InternalTraceryPP.g:1145:3: rule__ObjectDeclaration__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectDeclaration__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectDeclarationAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__ObjectDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ObjectDeclaration__Group__1"
    // InternalTraceryPP.g:1153:1: rule__ObjectDeclaration__Group__1 : rule__ObjectDeclaration__Group__1__Impl rule__ObjectDeclaration__Group__2 ;
    public final void rule__ObjectDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1157:1: ( rule__ObjectDeclaration__Group__1__Impl rule__ObjectDeclaration__Group__2 )
            // InternalTraceryPP.g:1158:2: rule__ObjectDeclaration__Group__1__Impl rule__ObjectDeclaration__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ObjectDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectDeclaration__Group__2();

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
    // $ANTLR end "rule__ObjectDeclaration__Group__1"


    // $ANTLR start "rule__ObjectDeclaration__Group__1__Impl"
    // InternalTraceryPP.g:1165:1: rule__ObjectDeclaration__Group__1__Impl : ( 'is' ) ;
    public final void rule__ObjectDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1169:1: ( ( 'is' ) )
            // InternalTraceryPP.g:1170:1: ( 'is' )
            {
            // InternalTraceryPP.g:1170:1: ( 'is' )
            // InternalTraceryPP.g:1171:2: 'is'
            {
             before(grammarAccess.getObjectDeclarationAccess().getIsKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getObjectDeclarationAccess().getIsKeyword_1()); 

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
    // $ANTLR end "rule__ObjectDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ObjectDeclaration__Group__2"
    // InternalTraceryPP.g:1180:1: rule__ObjectDeclaration__Group__2 : rule__ObjectDeclaration__Group__2__Impl rule__ObjectDeclaration__Group__3 ;
    public final void rule__ObjectDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1184:1: ( rule__ObjectDeclaration__Group__2__Impl rule__ObjectDeclaration__Group__3 )
            // InternalTraceryPP.g:1185:2: rule__ObjectDeclaration__Group__2__Impl rule__ObjectDeclaration__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__ObjectDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectDeclaration__Group__3();

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
    // $ANTLR end "rule__ObjectDeclaration__Group__2"


    // $ANTLR start "rule__ObjectDeclaration__Group__2__Impl"
    // InternalTraceryPP.g:1192:1: rule__ObjectDeclaration__Group__2__Impl : ( 'an' ) ;
    public final void rule__ObjectDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1196:1: ( ( 'an' ) )
            // InternalTraceryPP.g:1197:1: ( 'an' )
            {
            // InternalTraceryPP.g:1197:1: ( 'an' )
            // InternalTraceryPP.g:1198:2: 'an'
            {
             before(grammarAccess.getObjectDeclarationAccess().getAnKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getObjectDeclarationAccess().getAnKeyword_2()); 

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
    // $ANTLR end "rule__ObjectDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ObjectDeclaration__Group__3"
    // InternalTraceryPP.g:1207:1: rule__ObjectDeclaration__Group__3 : rule__ObjectDeclaration__Group__3__Impl rule__ObjectDeclaration__Group__4 ;
    public final void rule__ObjectDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1211:1: ( rule__ObjectDeclaration__Group__3__Impl rule__ObjectDeclaration__Group__4 )
            // InternalTraceryPP.g:1212:2: rule__ObjectDeclaration__Group__3__Impl rule__ObjectDeclaration__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__ObjectDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectDeclaration__Group__4();

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
    // $ANTLR end "rule__ObjectDeclaration__Group__3"


    // $ANTLR start "rule__ObjectDeclaration__Group__3__Impl"
    // InternalTraceryPP.g:1219:1: rule__ObjectDeclaration__Group__3__Impl : ( 'object.' ) ;
    public final void rule__ObjectDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1223:1: ( ( 'object.' ) )
            // InternalTraceryPP.g:1224:1: ( 'object.' )
            {
            // InternalTraceryPP.g:1224:1: ( 'object.' )
            // InternalTraceryPP.g:1225:2: 'object.'
            {
             before(grammarAccess.getObjectDeclarationAccess().getObjectKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getObjectDeclarationAccess().getObjectKeyword_3()); 

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
    // $ANTLR end "rule__ObjectDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ObjectDeclaration__Group__4"
    // InternalTraceryPP.g:1234:1: rule__ObjectDeclaration__Group__4 : rule__ObjectDeclaration__Group__4__Impl rule__ObjectDeclaration__Group__5 ;
    public final void rule__ObjectDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1238:1: ( rule__ObjectDeclaration__Group__4__Impl rule__ObjectDeclaration__Group__5 )
            // InternalTraceryPP.g:1239:2: rule__ObjectDeclaration__Group__4__Impl rule__ObjectDeclaration__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__ObjectDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectDeclaration__Group__5();

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
    // $ANTLR end "rule__ObjectDeclaration__Group__4"


    // $ANTLR start "rule__ObjectDeclaration__Group__4__Impl"
    // InternalTraceryPP.g:1246:1: rule__ObjectDeclaration__Group__4__Impl : ( 'It' ) ;
    public final void rule__ObjectDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1250:1: ( ( 'It' ) )
            // InternalTraceryPP.g:1251:1: ( 'It' )
            {
            // InternalTraceryPP.g:1251:1: ( 'It' )
            // InternalTraceryPP.g:1252:2: 'It'
            {
             before(grammarAccess.getObjectDeclarationAccess().getItKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getObjectDeclarationAccess().getItKeyword_4()); 

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
    // $ANTLR end "rule__ObjectDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ObjectDeclaration__Group__5"
    // InternalTraceryPP.g:1261:1: rule__ObjectDeclaration__Group__5 : rule__ObjectDeclaration__Group__5__Impl rule__ObjectDeclaration__Group__6 ;
    public final void rule__ObjectDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1265:1: ( rule__ObjectDeclaration__Group__5__Impl rule__ObjectDeclaration__Group__6 )
            // InternalTraceryPP.g:1266:2: rule__ObjectDeclaration__Group__5__Impl rule__ObjectDeclaration__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__ObjectDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectDeclaration__Group__6();

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
    // $ANTLR end "rule__ObjectDeclaration__Group__5"


    // $ANTLR start "rule__ObjectDeclaration__Group__5__Impl"
    // InternalTraceryPP.g:1273:1: rule__ObjectDeclaration__Group__5__Impl : ( 'has' ) ;
    public final void rule__ObjectDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1277:1: ( ( 'has' ) )
            // InternalTraceryPP.g:1278:1: ( 'has' )
            {
            // InternalTraceryPP.g:1278:1: ( 'has' )
            // InternalTraceryPP.g:1279:2: 'has'
            {
             before(grammarAccess.getObjectDeclarationAccess().getHasKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getObjectDeclarationAccess().getHasKeyword_5()); 

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
    // $ANTLR end "rule__ObjectDeclaration__Group__5__Impl"


    // $ANTLR start "rule__ObjectDeclaration__Group__6"
    // InternalTraceryPP.g:1288:1: rule__ObjectDeclaration__Group__6 : rule__ObjectDeclaration__Group__6__Impl rule__ObjectDeclaration__Group__7 ;
    public final void rule__ObjectDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1292:1: ( rule__ObjectDeclaration__Group__6__Impl rule__ObjectDeclaration__Group__7 )
            // InternalTraceryPP.g:1293:2: rule__ObjectDeclaration__Group__6__Impl rule__ObjectDeclaration__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__ObjectDeclaration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectDeclaration__Group__7();

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
    // $ANTLR end "rule__ObjectDeclaration__Group__6"


    // $ANTLR start "rule__ObjectDeclaration__Group__6__Impl"
    // InternalTraceryPP.g:1300:1: rule__ObjectDeclaration__Group__6__Impl : ( 'attributes:' ) ;
    public final void rule__ObjectDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1304:1: ( ( 'attributes:' ) )
            // InternalTraceryPP.g:1305:1: ( 'attributes:' )
            {
            // InternalTraceryPP.g:1305:1: ( 'attributes:' )
            // InternalTraceryPP.g:1306:2: 'attributes:'
            {
             before(grammarAccess.getObjectDeclarationAccess().getAttributesKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getObjectDeclarationAccess().getAttributesKeyword_6()); 

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
    // $ANTLR end "rule__ObjectDeclaration__Group__6__Impl"


    // $ANTLR start "rule__ObjectDeclaration__Group__7"
    // InternalTraceryPP.g:1315:1: rule__ObjectDeclaration__Group__7 : rule__ObjectDeclaration__Group__7__Impl ;
    public final void rule__ObjectDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1319:1: ( rule__ObjectDeclaration__Group__7__Impl )
            // InternalTraceryPP.g:1320:2: rule__ObjectDeclaration__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectDeclaration__Group__7__Impl();

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
    // $ANTLR end "rule__ObjectDeclaration__Group__7"


    // $ANTLR start "rule__ObjectDeclaration__Group__7__Impl"
    // InternalTraceryPP.g:1326:1: rule__ObjectDeclaration__Group__7__Impl : ( ( rule__ObjectDeclaration__AttributesAssignment_7 ) ) ;
    public final void rule__ObjectDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1330:1: ( ( ( rule__ObjectDeclaration__AttributesAssignment_7 ) ) )
            // InternalTraceryPP.g:1331:1: ( ( rule__ObjectDeclaration__AttributesAssignment_7 ) )
            {
            // InternalTraceryPP.g:1331:1: ( ( rule__ObjectDeclaration__AttributesAssignment_7 ) )
            // InternalTraceryPP.g:1332:2: ( rule__ObjectDeclaration__AttributesAssignment_7 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getAttributesAssignment_7()); 
            // InternalTraceryPP.g:1333:2: ( rule__ObjectDeclaration__AttributesAssignment_7 )
            // InternalTraceryPP.g:1333:3: rule__ObjectDeclaration__AttributesAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ObjectDeclaration__AttributesAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getObjectDeclarationAccess().getAttributesAssignment_7()); 

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
    // $ANTLR end "rule__ObjectDeclaration__Group__7__Impl"


    // $ANTLR start "rule__StoryVariable__Group__0"
    // InternalTraceryPP.g:1342:1: rule__StoryVariable__Group__0 : rule__StoryVariable__Group__0__Impl rule__StoryVariable__Group__1 ;
    public final void rule__StoryVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1346:1: ( rule__StoryVariable__Group__0__Impl rule__StoryVariable__Group__1 )
            // InternalTraceryPP.g:1347:2: rule__StoryVariable__Group__0__Impl rule__StoryVariable__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalTraceryPP.g:1354:1: rule__StoryVariable__Group__0__Impl : ( ( rule__StoryVariable__VariableAssignment_0 ) ) ;
    public final void rule__StoryVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1358:1: ( ( ( rule__StoryVariable__VariableAssignment_0 ) ) )
            // InternalTraceryPP.g:1359:1: ( ( rule__StoryVariable__VariableAssignment_0 ) )
            {
            // InternalTraceryPP.g:1359:1: ( ( rule__StoryVariable__VariableAssignment_0 ) )
            // InternalTraceryPP.g:1360:2: ( rule__StoryVariable__VariableAssignment_0 )
            {
             before(grammarAccess.getStoryVariableAccess().getVariableAssignment_0()); 
            // InternalTraceryPP.g:1361:2: ( rule__StoryVariable__VariableAssignment_0 )
            // InternalTraceryPP.g:1361:3: rule__StoryVariable__VariableAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StoryVariable__VariableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStoryVariableAccess().getVariableAssignment_0()); 

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
    // InternalTraceryPP.g:1369:1: rule__StoryVariable__Group__1 : rule__StoryVariable__Group__1__Impl ;
    public final void rule__StoryVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1373:1: ( rule__StoryVariable__Group__1__Impl )
            // InternalTraceryPP.g:1374:2: rule__StoryVariable__Group__1__Impl
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
    // InternalTraceryPP.g:1380:1: rule__StoryVariable__Group__1__Impl : ( ( rule__StoryVariable__ModifiersAssignment_1 )* ) ;
    public final void rule__StoryVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1384:1: ( ( ( rule__StoryVariable__ModifiersAssignment_1 )* ) )
            // InternalTraceryPP.g:1385:1: ( ( rule__StoryVariable__ModifiersAssignment_1 )* )
            {
            // InternalTraceryPP.g:1385:1: ( ( rule__StoryVariable__ModifiersAssignment_1 )* )
            // InternalTraceryPP.g:1386:2: ( rule__StoryVariable__ModifiersAssignment_1 )*
            {
             before(grammarAccess.getStoryVariableAccess().getModifiersAssignment_1()); 
            // InternalTraceryPP.g:1387:2: ( rule__StoryVariable__ModifiersAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=11 && LA10_0<=15)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTraceryPP.g:1387:3: rule__StoryVariable__ModifiersAssignment_1
            	    {
            	    pushFollow(FOLLOW_21);
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


    // $ANTLR start "rule__Attribute__Group_1__0"
    // InternalTraceryPP.g:1396:1: rule__Attribute__Group_1__0 : rule__Attribute__Group_1__0__Impl rule__Attribute__Group_1__1 ;
    public final void rule__Attribute__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1400:1: ( rule__Attribute__Group_1__0__Impl rule__Attribute__Group_1__1 )
            // InternalTraceryPP.g:1401:2: rule__Attribute__Group_1__0__Impl rule__Attribute__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__Attribute__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_1__1();

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
    // $ANTLR end "rule__Attribute__Group_1__0"


    // $ANTLR start "rule__Attribute__Group_1__0__Impl"
    // InternalTraceryPP.g:1408:1: rule__Attribute__Group_1__0__Impl : ( ( rule__Attribute__NameAssignment_1_0 ) ) ;
    public final void rule__Attribute__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1412:1: ( ( ( rule__Attribute__NameAssignment_1_0 ) ) )
            // InternalTraceryPP.g:1413:1: ( ( rule__Attribute__NameAssignment_1_0 ) )
            {
            // InternalTraceryPP.g:1413:1: ( ( rule__Attribute__NameAssignment_1_0 ) )
            // InternalTraceryPP.g:1414:2: ( rule__Attribute__NameAssignment_1_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1_0()); 
            // InternalTraceryPP.g:1415:2: ( rule__Attribute__NameAssignment_1_0 )
            // InternalTraceryPP.g:1415:3: rule__Attribute__NameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1_0()); 

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
    // $ANTLR end "rule__Attribute__Group_1__0__Impl"


    // $ANTLR start "rule__Attribute__Group_1__1"
    // InternalTraceryPP.g:1423:1: rule__Attribute__Group_1__1 : rule__Attribute__Group_1__1__Impl rule__Attribute__Group_1__2 ;
    public final void rule__Attribute__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1427:1: ( rule__Attribute__Group_1__1__Impl rule__Attribute__Group_1__2 )
            // InternalTraceryPP.g:1428:2: rule__Attribute__Group_1__1__Impl rule__Attribute__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Attribute__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_1__2();

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
    // $ANTLR end "rule__Attribute__Group_1__1"


    // $ANTLR start "rule__Attribute__Group_1__1__Impl"
    // InternalTraceryPP.g:1435:1: rule__Attribute__Group_1__1__Impl : ( '=' ) ;
    public final void rule__Attribute__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1439:1: ( ( '=' ) )
            // InternalTraceryPP.g:1440:1: ( '=' )
            {
            // InternalTraceryPP.g:1440:1: ( '=' )
            // InternalTraceryPP.g:1441:2: '='
            {
             before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1_1()); 

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
    // $ANTLR end "rule__Attribute__Group_1__1__Impl"


    // $ANTLR start "rule__Attribute__Group_1__2"
    // InternalTraceryPP.g:1450:1: rule__Attribute__Group_1__2 : rule__Attribute__Group_1__2__Impl ;
    public final void rule__Attribute__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1454:1: ( rule__Attribute__Group_1__2__Impl )
            // InternalTraceryPP.g:1455:2: rule__Attribute__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_1__2__Impl();

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
    // $ANTLR end "rule__Attribute__Group_1__2"


    // $ANTLR start "rule__Attribute__Group_1__2__Impl"
    // InternalTraceryPP.g:1461:1: rule__Attribute__Group_1__2__Impl : ( ( rule__Attribute__ValueAssignment_1_2 ) ) ;
    public final void rule__Attribute__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1465:1: ( ( ( rule__Attribute__ValueAssignment_1_2 ) ) )
            // InternalTraceryPP.g:1466:1: ( ( rule__Attribute__ValueAssignment_1_2 ) )
            {
            // InternalTraceryPP.g:1466:1: ( ( rule__Attribute__ValueAssignment_1_2 ) )
            // InternalTraceryPP.g:1467:2: ( rule__Attribute__ValueAssignment_1_2 )
            {
             before(grammarAccess.getAttributeAccess().getValueAssignment_1_2()); 
            // InternalTraceryPP.g:1468:2: ( rule__Attribute__ValueAssignment_1_2 )
            // InternalTraceryPP.g:1468:3: rule__Attribute__ValueAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__ValueAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getValueAssignment_1_2()); 

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
    // $ANTLR end "rule__Attribute__Group_1__2__Impl"


    // $ANTLR start "rule__ObjectAttribute__Group__0"
    // InternalTraceryPP.g:1477:1: rule__ObjectAttribute__Group__0 : rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1 ;
    public final void rule__ObjectAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1481:1: ( rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1 )
            // InternalTraceryPP.g:1482:2: rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalTraceryPP.g:1489:1: rule__ObjectAttribute__Group__0__Impl : ( ( rule__ObjectAttribute__ObjectAssignment_0 ) ) ;
    public final void rule__ObjectAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1493:1: ( ( ( rule__ObjectAttribute__ObjectAssignment_0 ) ) )
            // InternalTraceryPP.g:1494:1: ( ( rule__ObjectAttribute__ObjectAssignment_0 ) )
            {
            // InternalTraceryPP.g:1494:1: ( ( rule__ObjectAttribute__ObjectAssignment_0 ) )
            // InternalTraceryPP.g:1495:2: ( rule__ObjectAttribute__ObjectAssignment_0 )
            {
             before(grammarAccess.getObjectAttributeAccess().getObjectAssignment_0()); 
            // InternalTraceryPP.g:1496:2: ( rule__ObjectAttribute__ObjectAssignment_0 )
            // InternalTraceryPP.g:1496:3: rule__ObjectAttribute__ObjectAssignment_0
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
    // InternalTraceryPP.g:1504:1: rule__ObjectAttribute__Group__1 : rule__ObjectAttribute__Group__1__Impl rule__ObjectAttribute__Group__2 ;
    public final void rule__ObjectAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1508:1: ( rule__ObjectAttribute__Group__1__Impl rule__ObjectAttribute__Group__2 )
            // InternalTraceryPP.g:1509:2: rule__ObjectAttribute__Group__1__Impl rule__ObjectAttribute__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalTraceryPP.g:1516:1: rule__ObjectAttribute__Group__1__Impl : ( '.' ) ;
    public final void rule__ObjectAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1520:1: ( ( '.' ) )
            // InternalTraceryPP.g:1521:1: ( '.' )
            {
            // InternalTraceryPP.g:1521:1: ( '.' )
            // InternalTraceryPP.g:1522:2: '.'
            {
             before(grammarAccess.getObjectAttributeAccess().getFullStopKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalTraceryPP.g:1531:1: rule__ObjectAttribute__Group__2 : rule__ObjectAttribute__Group__2__Impl ;
    public final void rule__ObjectAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1535:1: ( rule__ObjectAttribute__Group__2__Impl )
            // InternalTraceryPP.g:1536:2: rule__ObjectAttribute__Group__2__Impl
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
    // InternalTraceryPP.g:1542:1: rule__ObjectAttribute__Group__2__Impl : ( ( rule__ObjectAttribute__AttributeAssignment_2 ) ) ;
    public final void rule__ObjectAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1546:1: ( ( ( rule__ObjectAttribute__AttributeAssignment_2 ) ) )
            // InternalTraceryPP.g:1547:1: ( ( rule__ObjectAttribute__AttributeAssignment_2 ) )
            {
            // InternalTraceryPP.g:1547:1: ( ( rule__ObjectAttribute__AttributeAssignment_2 ) )
            // InternalTraceryPP.g:1548:2: ( rule__ObjectAttribute__AttributeAssignment_2 )
            {
             before(grammarAccess.getObjectAttributeAccess().getAttributeAssignment_2()); 
            // InternalTraceryPP.g:1549:2: ( rule__ObjectAttribute__AttributeAssignment_2 )
            // InternalTraceryPP.g:1549:3: rule__ObjectAttribute__AttributeAssignment_2
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
    // InternalTraceryPP.g:1558:1: rule__WordList__Group__0 : rule__WordList__Group__0__Impl rule__WordList__Group__1 ;
    public final void rule__WordList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1562:1: ( rule__WordList__Group__0__Impl rule__WordList__Group__1 )
            // InternalTraceryPP.g:1563:2: rule__WordList__Group__0__Impl rule__WordList__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalTraceryPP.g:1570:1: rule__WordList__Group__0__Impl : ( ( rule__WordList__WordsAssignment_0 ) ) ;
    public final void rule__WordList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1574:1: ( ( ( rule__WordList__WordsAssignment_0 ) ) )
            // InternalTraceryPP.g:1575:1: ( ( rule__WordList__WordsAssignment_0 ) )
            {
            // InternalTraceryPP.g:1575:1: ( ( rule__WordList__WordsAssignment_0 ) )
            // InternalTraceryPP.g:1576:2: ( rule__WordList__WordsAssignment_0 )
            {
             before(grammarAccess.getWordListAccess().getWordsAssignment_0()); 
            // InternalTraceryPP.g:1577:2: ( rule__WordList__WordsAssignment_0 )
            // InternalTraceryPP.g:1577:3: rule__WordList__WordsAssignment_0
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
    // InternalTraceryPP.g:1585:1: rule__WordList__Group__1 : rule__WordList__Group__1__Impl ;
    public final void rule__WordList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1589:1: ( rule__WordList__Group__1__Impl )
            // InternalTraceryPP.g:1590:2: rule__WordList__Group__1__Impl
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
    // InternalTraceryPP.g:1596:1: rule__WordList__Group__1__Impl : ( ( rule__WordList__Group_1__0 )* ) ;
    public final void rule__WordList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1600:1: ( ( ( rule__WordList__Group_1__0 )* ) )
            // InternalTraceryPP.g:1601:1: ( ( rule__WordList__Group_1__0 )* )
            {
            // InternalTraceryPP.g:1601:1: ( ( rule__WordList__Group_1__0 )* )
            // InternalTraceryPP.g:1602:2: ( rule__WordList__Group_1__0 )*
            {
             before(grammarAccess.getWordListAccess().getGroup_1()); 
            // InternalTraceryPP.g:1603:2: ( rule__WordList__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=16 && LA11_0<=17)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTraceryPP.g:1603:3: rule__WordList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
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
    // InternalTraceryPP.g:1612:1: rule__WordList__Group_1__0 : rule__WordList__Group_1__0__Impl rule__WordList__Group_1__1 ;
    public final void rule__WordList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1616:1: ( rule__WordList__Group_1__0__Impl rule__WordList__Group_1__1 )
            // InternalTraceryPP.g:1617:2: rule__WordList__Group_1__0__Impl rule__WordList__Group_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalTraceryPP.g:1624:1: rule__WordList__Group_1__0__Impl : ( ruleSeparatorOr ) ;
    public final void rule__WordList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1628:1: ( ( ruleSeparatorOr ) )
            // InternalTraceryPP.g:1629:1: ( ruleSeparatorOr )
            {
            // InternalTraceryPP.g:1629:1: ( ruleSeparatorOr )
            // InternalTraceryPP.g:1630:2: ruleSeparatorOr
            {
             before(grammarAccess.getWordListAccess().getSeparatorOrParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSeparatorOr();

            state._fsp--;

             after(grammarAccess.getWordListAccess().getSeparatorOrParserRuleCall_1_0()); 

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
    // InternalTraceryPP.g:1639:1: rule__WordList__Group_1__1 : rule__WordList__Group_1__1__Impl ;
    public final void rule__WordList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1643:1: ( rule__WordList__Group_1__1__Impl )
            // InternalTraceryPP.g:1644:2: rule__WordList__Group_1__1__Impl
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
    // InternalTraceryPP.g:1650:1: rule__WordList__Group_1__1__Impl : ( ( rule__WordList__WordsAssignment_1_1 ) ) ;
    public final void rule__WordList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1654:1: ( ( ( rule__WordList__WordsAssignment_1_1 ) ) )
            // InternalTraceryPP.g:1655:1: ( ( rule__WordList__WordsAssignment_1_1 ) )
            {
            // InternalTraceryPP.g:1655:1: ( ( rule__WordList__WordsAssignment_1_1 ) )
            // InternalTraceryPP.g:1656:2: ( rule__WordList__WordsAssignment_1_1 )
            {
             before(grammarAccess.getWordListAccess().getWordsAssignment_1_1()); 
            // InternalTraceryPP.g:1657:2: ( rule__WordList__WordsAssignment_1_1 )
            // InternalTraceryPP.g:1657:3: rule__WordList__WordsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__WordList__WordsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getWordListAccess().getWordsAssignment_1_1()); 

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
    // InternalTraceryPP.g:1666:1: rule__AttributeList__Group__0 : rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 ;
    public final void rule__AttributeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1670:1: ( rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 )
            // InternalTraceryPP.g:1671:2: rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalTraceryPP.g:1678:1: rule__AttributeList__Group__0__Impl : ( ( rule__AttributeList__AttributesAssignment_0 ) ) ;
    public final void rule__AttributeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1682:1: ( ( ( rule__AttributeList__AttributesAssignment_0 ) ) )
            // InternalTraceryPP.g:1683:1: ( ( rule__AttributeList__AttributesAssignment_0 ) )
            {
            // InternalTraceryPP.g:1683:1: ( ( rule__AttributeList__AttributesAssignment_0 ) )
            // InternalTraceryPP.g:1684:2: ( rule__AttributeList__AttributesAssignment_0 )
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAssignment_0()); 
            // InternalTraceryPP.g:1685:2: ( rule__AttributeList__AttributesAssignment_0 )
            // InternalTraceryPP.g:1685:3: rule__AttributeList__AttributesAssignment_0
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
    // InternalTraceryPP.g:1693:1: rule__AttributeList__Group__1 : rule__AttributeList__Group__1__Impl ;
    public final void rule__AttributeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1697:1: ( rule__AttributeList__Group__1__Impl )
            // InternalTraceryPP.g:1698:2: rule__AttributeList__Group__1__Impl
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
    // InternalTraceryPP.g:1704:1: rule__AttributeList__Group__1__Impl : ( ( rule__AttributeList__Group_1__0 )* ) ;
    public final void rule__AttributeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1708:1: ( ( ( rule__AttributeList__Group_1__0 )* ) )
            // InternalTraceryPP.g:1709:1: ( ( rule__AttributeList__Group_1__0 )* )
            {
            // InternalTraceryPP.g:1709:1: ( ( rule__AttributeList__Group_1__0 )* )
            // InternalTraceryPP.g:1710:2: ( rule__AttributeList__Group_1__0 )*
            {
             before(grammarAccess.getAttributeListAccess().getGroup_1()); 
            // InternalTraceryPP.g:1711:2: ( rule__AttributeList__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16||LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTraceryPP.g:1711:3: rule__AttributeList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
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
    // InternalTraceryPP.g:1720:1: rule__AttributeList__Group_1__0 : rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1 ;
    public final void rule__AttributeList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1724:1: ( rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1 )
            // InternalTraceryPP.g:1725:2: rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalTraceryPP.g:1732:1: rule__AttributeList__Group_1__0__Impl : ( ruleSeparatorAnd ) ;
    public final void rule__AttributeList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1736:1: ( ( ruleSeparatorAnd ) )
            // InternalTraceryPP.g:1737:1: ( ruleSeparatorAnd )
            {
            // InternalTraceryPP.g:1737:1: ( ruleSeparatorAnd )
            // InternalTraceryPP.g:1738:2: ruleSeparatorAnd
            {
             before(grammarAccess.getAttributeListAccess().getSeparatorAndParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSeparatorAnd();

            state._fsp--;

             after(grammarAccess.getAttributeListAccess().getSeparatorAndParserRuleCall_1_0()); 

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
    // InternalTraceryPP.g:1747:1: rule__AttributeList__Group_1__1 : rule__AttributeList__Group_1__1__Impl ;
    public final void rule__AttributeList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1751:1: ( rule__AttributeList__Group_1__1__Impl )
            // InternalTraceryPP.g:1752:2: rule__AttributeList__Group_1__1__Impl
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
    // InternalTraceryPP.g:1758:1: rule__AttributeList__Group_1__1__Impl : ( ( rule__AttributeList__AttributesAssignment_1_1 ) ) ;
    public final void rule__AttributeList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1762:1: ( ( ( rule__AttributeList__AttributesAssignment_1_1 ) ) )
            // InternalTraceryPP.g:1763:1: ( ( rule__AttributeList__AttributesAssignment_1_1 ) )
            {
            // InternalTraceryPP.g:1763:1: ( ( rule__AttributeList__AttributesAssignment_1_1 ) )
            // InternalTraceryPP.g:1764:2: ( rule__AttributeList__AttributesAssignment_1_1 )
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAssignment_1_1()); 
            // InternalTraceryPP.g:1765:2: ( rule__AttributeList__AttributesAssignment_1_1 )
            // InternalTraceryPP.g:1765:3: rule__AttributeList__AttributesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeList__AttributesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeListAccess().getAttributesAssignment_1_1()); 

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
    // InternalTraceryPP.g:1774:1: rule__Model__StatementsAssignment_0 : ( ruleStatement ) ;
    public final void rule__Model__StatementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1778:1: ( ( ruleStatement ) )
            // InternalTraceryPP.g:1779:2: ( ruleStatement )
            {
            // InternalTraceryPP.g:1779:2: ( ruleStatement )
            // InternalTraceryPP.g:1780:3: ruleStatement
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
    // InternalTraceryPP.g:1789:1: rule__Model__StoryAssignment_1 : ( ruleStory ) ;
    public final void rule__Model__StoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1793:1: ( ( ruleStory ) )
            // InternalTraceryPP.g:1794:2: ( ruleStory )
            {
            // InternalTraceryPP.g:1794:2: ( ruleStory )
            // InternalTraceryPP.g:1795:3: ruleStory
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


    // $ANTLR start "rule__Story__StoryAssignment_3"
    // InternalTraceryPP.g:1804:1: rule__Story__StoryAssignment_3 : ( ( rule__Story__StoryAlternatives_3_0 ) ) ;
    public final void rule__Story__StoryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1808:1: ( ( ( rule__Story__StoryAlternatives_3_0 ) ) )
            // InternalTraceryPP.g:1809:2: ( ( rule__Story__StoryAlternatives_3_0 ) )
            {
            // InternalTraceryPP.g:1809:2: ( ( rule__Story__StoryAlternatives_3_0 ) )
            // InternalTraceryPP.g:1810:3: ( rule__Story__StoryAlternatives_3_0 )
            {
             before(grammarAccess.getStoryAccess().getStoryAlternatives_3_0()); 
            // InternalTraceryPP.g:1811:3: ( rule__Story__StoryAlternatives_3_0 )
            // InternalTraceryPP.g:1811:4: rule__Story__StoryAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Story__StoryAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getStoryAccess().getStoryAlternatives_3_0()); 

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
    // $ANTLR end "rule__Story__StoryAssignment_3"


    // $ANTLR start "rule__ListDeclaration__Start_symbolAssignment_0"
    // InternalTraceryPP.g:1819:1: rule__ListDeclaration__Start_symbolAssignment_0 : ( ruleVariable ) ;
    public final void rule__ListDeclaration__Start_symbolAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1823:1: ( ( ruleVariable ) )
            // InternalTraceryPP.g:1824:2: ( ruleVariable )
            {
            // InternalTraceryPP.g:1824:2: ( ruleVariable )
            // InternalTraceryPP.g:1825:3: ruleVariable
            {
             before(grammarAccess.getListDeclarationAccess().getStart_symbolVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getListDeclarationAccess().getStart_symbolVariableParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ListDeclaration__Start_symbolAssignment_0"


    // $ANTLR start "rule__ListDeclaration__ListAssignment_2"
    // InternalTraceryPP.g:1834:1: rule__ListDeclaration__ListAssignment_2 : ( ruleWordList ) ;
    public final void rule__ListDeclaration__ListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1838:1: ( ( ruleWordList ) )
            // InternalTraceryPP.g:1839:2: ( ruleWordList )
            {
            // InternalTraceryPP.g:1839:2: ( ruleWordList )
            // InternalTraceryPP.g:1840:3: ruleWordList
            {
             before(grammarAccess.getListDeclarationAccess().getListWordListParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleWordList();

            state._fsp--;

             after(grammarAccess.getListDeclarationAccess().getListWordListParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ListDeclaration__ListAssignment_2"


    // $ANTLR start "rule__ObjectDeclaration__NameAssignment_0"
    // InternalTraceryPP.g:1849:1: rule__ObjectDeclaration__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ObjectDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1853:1: ( ( RULE_ID ) )
            // InternalTraceryPP.g:1854:2: ( RULE_ID )
            {
            // InternalTraceryPP.g:1854:2: ( RULE_ID )
            // InternalTraceryPP.g:1855:3: RULE_ID
            {
             before(grammarAccess.getObjectDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ObjectDeclaration__NameAssignment_0"


    // $ANTLR start "rule__ObjectDeclaration__AttributesAssignment_7"
    // InternalTraceryPP.g:1864:1: rule__ObjectDeclaration__AttributesAssignment_7 : ( ruleAttributeList ) ;
    public final void rule__ObjectDeclaration__AttributesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1868:1: ( ( ruleAttributeList ) )
            // InternalTraceryPP.g:1869:2: ( ruleAttributeList )
            {
            // InternalTraceryPP.g:1869:2: ( ruleAttributeList )
            // InternalTraceryPP.g:1870:3: ruleAttributeList
            {
             before(grammarAccess.getObjectDeclarationAccess().getAttributesAttributeListParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeList();

            state._fsp--;

             after(grammarAccess.getObjectDeclarationAccess().getAttributesAttributeListParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__ObjectDeclaration__AttributesAssignment_7"


    // $ANTLR start "rule__Word__ValueAssignment"
    // InternalTraceryPP.g:1879:1: rule__Word__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__Word__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1883:1: ( ( RULE_STRING ) )
            // InternalTraceryPP.g:1884:2: ( RULE_STRING )
            {
            // InternalTraceryPP.g:1884:2: ( RULE_STRING )
            // InternalTraceryPP.g:1885:3: RULE_STRING
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


    // $ANTLR start "rule__Variable__NameAssignment"
    // InternalTraceryPP.g:1894:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1898:1: ( ( RULE_ID ) )
            // InternalTraceryPP.g:1899:2: ( RULE_ID )
            {
            // InternalTraceryPP.g:1899:2: ( RULE_ID )
            // InternalTraceryPP.g:1900:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Variable__NameAssignment"


    // $ANTLR start "rule__StoryVariable__VariableAssignment_0"
    // InternalTraceryPP.g:1909:1: rule__StoryVariable__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__StoryVariable__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1913:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPP.g:1914:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPP.g:1914:2: ( ( RULE_ID ) )
            // InternalTraceryPP.g:1915:3: ( RULE_ID )
            {
             before(grammarAccess.getStoryVariableAccess().getVariableVariableCrossReference_0_0()); 
            // InternalTraceryPP.g:1916:3: ( RULE_ID )
            // InternalTraceryPP.g:1917:4: RULE_ID
            {
             before(grammarAccess.getStoryVariableAccess().getVariableVariableIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStoryVariableAccess().getVariableVariableIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getStoryVariableAccess().getVariableVariableCrossReference_0_0()); 

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
    // $ANTLR end "rule__StoryVariable__VariableAssignment_0"


    // $ANTLR start "rule__StoryVariable__ModifiersAssignment_1"
    // InternalTraceryPP.g:1928:1: rule__StoryVariable__ModifiersAssignment_1 : ( ruleModifier ) ;
    public final void rule__StoryVariable__ModifiersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1932:1: ( ( ruleModifier ) )
            // InternalTraceryPP.g:1933:2: ( ruleModifier )
            {
            // InternalTraceryPP.g:1933:2: ( ruleModifier )
            // InternalTraceryPP.g:1934:3: ruleModifier
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


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // InternalTraceryPP.g:1943:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1947:1: ( ( RULE_ID ) )
            // InternalTraceryPP.g:1948:2: ( RULE_ID )
            {
            // InternalTraceryPP.g:1948:2: ( RULE_ID )
            // InternalTraceryPP.g:1949:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_0"


    // $ANTLR start "rule__Attribute__NameAssignment_1_0"
    // InternalTraceryPP.g:1958:1: rule__Attribute__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1962:1: ( ( RULE_ID ) )
            // InternalTraceryPP.g:1963:2: ( RULE_ID )
            {
            // InternalTraceryPP.g:1963:2: ( RULE_ID )
            // InternalTraceryPP.g:1964:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_1_0"


    // $ANTLR start "rule__Attribute__ValueAssignment_1_2"
    // InternalTraceryPP.g:1973:1: rule__Attribute__ValueAssignment_1_2 : ( RULE_STRING ) ;
    public final void rule__Attribute__ValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1977:1: ( ( RULE_STRING ) )
            // InternalTraceryPP.g:1978:2: ( RULE_STRING )
            {
            // InternalTraceryPP.g:1978:2: ( RULE_STRING )
            // InternalTraceryPP.g:1979:3: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_1_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Attribute__ValueAssignment_1_2"


    // $ANTLR start "rule__ObjectAttribute__ObjectAssignment_0"
    // InternalTraceryPP.g:1988:1: rule__ObjectAttribute__ObjectAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectAttribute__ObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:1992:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPP.g:1993:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPP.g:1993:2: ( ( RULE_ID ) )
            // InternalTraceryPP.g:1994:3: ( RULE_ID )
            {
             before(grammarAccess.getObjectAttributeAccess().getObjectObjectDeclarationCrossReference_0_0()); 
            // InternalTraceryPP.g:1995:3: ( RULE_ID )
            // InternalTraceryPP.g:1996:4: RULE_ID
            {
             before(grammarAccess.getObjectAttributeAccess().getObjectObjectDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectAttributeAccess().getObjectObjectDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getObjectAttributeAccess().getObjectObjectDeclarationCrossReference_0_0()); 

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
    // InternalTraceryPP.g:2007:1: rule__ObjectAttribute__AttributeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectAttribute__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:2011:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPP.g:2012:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPP.g:2012:2: ( ( RULE_ID ) )
            // InternalTraceryPP.g:2013:3: ( RULE_ID )
            {
             before(grammarAccess.getObjectAttributeAccess().getAttributeAttributeCrossReference_2_0()); 
            // InternalTraceryPP.g:2014:3: ( RULE_ID )
            // InternalTraceryPP.g:2015:4: RULE_ID
            {
             before(grammarAccess.getObjectAttributeAccess().getAttributeAttributeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectAttributeAccess().getAttributeAttributeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getObjectAttributeAccess().getAttributeAttributeCrossReference_2_0()); 

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
    // InternalTraceryPP.g:2026:1: rule__WordList__WordsAssignment_0 : ( ruleWord ) ;
    public final void rule__WordList__WordsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:2030:1: ( ( ruleWord ) )
            // InternalTraceryPP.g:2031:2: ( ruleWord )
            {
            // InternalTraceryPP.g:2031:2: ( ruleWord )
            // InternalTraceryPP.g:2032:3: ruleWord
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


    // $ANTLR start "rule__WordList__WordsAssignment_1_1"
    // InternalTraceryPP.g:2041:1: rule__WordList__WordsAssignment_1_1 : ( ruleWord ) ;
    public final void rule__WordList__WordsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:2045:1: ( ( ruleWord ) )
            // InternalTraceryPP.g:2046:2: ( ruleWord )
            {
            // InternalTraceryPP.g:2046:2: ( ruleWord )
            // InternalTraceryPP.g:2047:3: ruleWord
            {
             before(grammarAccess.getWordListAccess().getWordsWordParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWord();

            state._fsp--;

             after(grammarAccess.getWordListAccess().getWordsWordParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__WordList__WordsAssignment_1_1"


    // $ANTLR start "rule__AttributeList__AttributesAssignment_0"
    // InternalTraceryPP.g:2056:1: rule__AttributeList__AttributesAssignment_0 : ( ruleAttribute ) ;
    public final void rule__AttributeList__AttributesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:2060:1: ( ( ruleAttribute ) )
            // InternalTraceryPP.g:2061:2: ( ruleAttribute )
            {
            // InternalTraceryPP.g:2061:2: ( ruleAttribute )
            // InternalTraceryPP.g:2062:3: ruleAttribute
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_0_0()); 

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


    // $ANTLR start "rule__AttributeList__AttributesAssignment_1_1"
    // InternalTraceryPP.g:2071:1: rule__AttributeList__AttributesAssignment_1_1 : ( ruleAttribute ) ;
    public final void rule__AttributeList__AttributesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPP.g:2075:1: ( ( ruleAttribute ) )
            // InternalTraceryPP.g:2076:2: ( ruleAttribute )
            {
            // InternalTraceryPP.g:2076:2: ( ruleAttribute )
            // InternalTraceryPP.g:2077:3: ruleAttribute
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__AttributeList__AttributesAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000000F802L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000050002L});

}