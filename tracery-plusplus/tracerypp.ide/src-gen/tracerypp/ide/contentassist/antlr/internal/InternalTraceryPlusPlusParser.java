package tracerypp.ide.contentassist.antlr.internal;

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
import tracerypp.services.TraceryPlusPlusGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTraceryPlusPlusParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.capitalize'", "'.CAPITALIZE'", "'.s'", "'.a'", "'.ed'", "'is'", "'are'", "'a'", "'an'", "'has'", "'have'", "'from'", "'they'", "'them'", "'their'", "'theirs'", "'='", "':'", "'-'", "'-->'", "','", "'or'", "'||'", "'and'", "'&&'", "'The'", "'story'", "'can'", "'values'", "'be'", "'There'", "'attributes'", "'.'", "'He'", "'She'", "'It'", "'They'"
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

    	public void setGrammarAccess(TraceryPlusPlusGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleTraceryPlusPlusProgram"
    // InternalTraceryPlusPlus.g:53:1: entryRuleTraceryPlusPlusProgram : ruleTraceryPlusPlusProgram EOF ;
    public final void entryRuleTraceryPlusPlusProgram() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:54:1: ( ruleTraceryPlusPlusProgram EOF )
            // InternalTraceryPlusPlus.g:55:1: ruleTraceryPlusPlusProgram EOF
            {
             before(grammarAccess.getTraceryPlusPlusProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleTraceryPlusPlusProgram();

            state._fsp--;

             after(grammarAccess.getTraceryPlusPlusProgramRule()); 
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
    // $ANTLR end "entryRuleTraceryPlusPlusProgram"


    // $ANTLR start "ruleTraceryPlusPlusProgram"
    // InternalTraceryPlusPlus.g:62:1: ruleTraceryPlusPlusProgram : ( ( rule__TraceryPlusPlusProgram__Group__0 ) ) ;
    public final void ruleTraceryPlusPlusProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:66:2: ( ( ( rule__TraceryPlusPlusProgram__Group__0 ) ) )
            // InternalTraceryPlusPlus.g:67:2: ( ( rule__TraceryPlusPlusProgram__Group__0 ) )
            {
            // InternalTraceryPlusPlus.g:67:2: ( ( rule__TraceryPlusPlusProgram__Group__0 ) )
            // InternalTraceryPlusPlus.g:68:3: ( rule__TraceryPlusPlusProgram__Group__0 )
            {
             before(grammarAccess.getTraceryPlusPlusProgramAccess().getGroup()); 
            // InternalTraceryPlusPlus.g:69:3: ( rule__TraceryPlusPlusProgram__Group__0 )
            // InternalTraceryPlusPlus.g:69:4: rule__TraceryPlusPlusProgram__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TraceryPlusPlusProgram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTraceryPlusPlusProgramAccess().getGroup()); 

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
    // $ANTLR end "ruleTraceryPlusPlusProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalTraceryPlusPlus.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:79:1: ( ruleStatement EOF )
            // InternalTraceryPlusPlus.g:80:1: ruleStatement EOF
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
    // InternalTraceryPlusPlus.g:87:1: ruleStatement : ( ruleDeclaration ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:91:2: ( ( ruleDeclaration ) )
            // InternalTraceryPlusPlus.g:92:2: ( ruleDeclaration )
            {
            // InternalTraceryPlusPlus.g:92:2: ( ruleDeclaration )
            // InternalTraceryPlusPlus.g:93:3: ruleDeclaration
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
    // InternalTraceryPlusPlus.g:103:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:104:1: ( ruleDeclaration EOF )
            // InternalTraceryPlusPlus.g:105:1: ruleDeclaration EOF
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
    // InternalTraceryPlusPlus.g:112:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:116:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // InternalTraceryPlusPlus.g:117:2: ( ( rule__Declaration__Alternatives ) )
            {
            // InternalTraceryPlusPlus.g:117:2: ( ( rule__Declaration__Alternatives ) )
            // InternalTraceryPlusPlus.g:118:3: ( rule__Declaration__Alternatives )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            // InternalTraceryPlusPlus.g:119:3: ( rule__Declaration__Alternatives )
            // InternalTraceryPlusPlus.g:119:4: rule__Declaration__Alternatives
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
    // InternalTraceryPlusPlus.g:128:1: entryRuleStory : ruleStory EOF ;
    public final void entryRuleStory() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:129:1: ( ruleStory EOF )
            // InternalTraceryPlusPlus.g:130:1: ruleStory EOF
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
    // InternalTraceryPlusPlus.g:137:1: ruleStory : ( ( rule__Story__Group__0 ) ) ;
    public final void ruleStory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:141:2: ( ( ( rule__Story__Group__0 ) ) )
            // InternalTraceryPlusPlus.g:142:2: ( ( rule__Story__Group__0 ) )
            {
            // InternalTraceryPlusPlus.g:142:2: ( ( rule__Story__Group__0 ) )
            // InternalTraceryPlusPlus.g:143:3: ( rule__Story__Group__0 )
            {
             before(grammarAccess.getStoryAccess().getGroup()); 
            // InternalTraceryPlusPlus.g:144:3: ( rule__Story__Group__0 )
            // InternalTraceryPlusPlus.g:144:4: rule__Story__Group__0
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
    // InternalTraceryPlusPlus.g:153:1: entryRuleListDeclaration : ruleListDeclaration EOF ;
    public final void entryRuleListDeclaration() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:154:1: ( ruleListDeclaration EOF )
            // InternalTraceryPlusPlus.g:155:1: ruleListDeclaration EOF
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
    // InternalTraceryPlusPlus.g:162:1: ruleListDeclaration : ( ( rule__ListDeclaration__Group__0 ) ) ;
    public final void ruleListDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:166:2: ( ( ( rule__ListDeclaration__Group__0 ) ) )
            // InternalTraceryPlusPlus.g:167:2: ( ( rule__ListDeclaration__Group__0 ) )
            {
            // InternalTraceryPlusPlus.g:167:2: ( ( rule__ListDeclaration__Group__0 ) )
            // InternalTraceryPlusPlus.g:168:3: ( rule__ListDeclaration__Group__0 )
            {
             before(grammarAccess.getListDeclarationAccess().getGroup()); 
            // InternalTraceryPlusPlus.g:169:3: ( rule__ListDeclaration__Group__0 )
            // InternalTraceryPlusPlus.g:169:4: rule__ListDeclaration__Group__0
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
    // InternalTraceryPlusPlus.g:178:1: entryRuleObjectDeclaration : ruleObjectDeclaration EOF ;
    public final void entryRuleObjectDeclaration() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:179:1: ( ruleObjectDeclaration EOF )
            // InternalTraceryPlusPlus.g:180:1: ruleObjectDeclaration EOF
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
    // InternalTraceryPlusPlus.g:187:1: ruleObjectDeclaration : ( ( rule__ObjectDeclaration__Group__0 ) ) ;
    public final void ruleObjectDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:191:2: ( ( ( rule__ObjectDeclaration__Group__0 ) ) )
            // InternalTraceryPlusPlus.g:192:2: ( ( rule__ObjectDeclaration__Group__0 ) )
            {
            // InternalTraceryPlusPlus.g:192:2: ( ( rule__ObjectDeclaration__Group__0 ) )
            // InternalTraceryPlusPlus.g:193:3: ( rule__ObjectDeclaration__Group__0 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getGroup()); 
            // InternalTraceryPlusPlus.g:194:3: ( rule__ObjectDeclaration__Group__0 )
            // InternalTraceryPlusPlus.g:194:4: rule__ObjectDeclaration__Group__0
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
    // InternalTraceryPlusPlus.g:203:1: entryRuleWord : ruleWord EOF ;
    public final void entryRuleWord() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:204:1: ( ruleWord EOF )
            // InternalTraceryPlusPlus.g:205:1: ruleWord EOF
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
    // InternalTraceryPlusPlus.g:212:1: ruleWord : ( ( rule__Word__ValueAssignment ) ) ;
    public final void ruleWord() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:216:2: ( ( ( rule__Word__ValueAssignment ) ) )
            // InternalTraceryPlusPlus.g:217:2: ( ( rule__Word__ValueAssignment ) )
            {
            // InternalTraceryPlusPlus.g:217:2: ( ( rule__Word__ValueAssignment ) )
            // InternalTraceryPlusPlus.g:218:3: ( rule__Word__ValueAssignment )
            {
             before(grammarAccess.getWordAccess().getValueAssignment()); 
            // InternalTraceryPlusPlus.g:219:3: ( rule__Word__ValueAssignment )
            // InternalTraceryPlusPlus.g:219:4: rule__Word__ValueAssignment
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
    // InternalTraceryPlusPlus.g:228:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:229:1: ( ruleVariable EOF )
            // InternalTraceryPlusPlus.g:230:1: ruleVariable EOF
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
    // InternalTraceryPlusPlus.g:237:1: ruleVariable : ( ( rule__Variable__NameAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:241:2: ( ( ( rule__Variable__NameAssignment ) ) )
            // InternalTraceryPlusPlus.g:242:2: ( ( rule__Variable__NameAssignment ) )
            {
            // InternalTraceryPlusPlus.g:242:2: ( ( rule__Variable__NameAssignment ) )
            // InternalTraceryPlusPlus.g:243:3: ( rule__Variable__NameAssignment )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment()); 
            // InternalTraceryPlusPlus.g:244:3: ( rule__Variable__NameAssignment )
            // InternalTraceryPlusPlus.g:244:4: rule__Variable__NameAssignment
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
    // InternalTraceryPlusPlus.g:253:1: entryRuleStoryVariable : ruleStoryVariable EOF ;
    public final void entryRuleStoryVariable() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:254:1: ( ruleStoryVariable EOF )
            // InternalTraceryPlusPlus.g:255:1: ruleStoryVariable EOF
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
    // InternalTraceryPlusPlus.g:262:1: ruleStoryVariable : ( ( rule__StoryVariable__Group__0 ) ) ;
    public final void ruleStoryVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:266:2: ( ( ( rule__StoryVariable__Group__0 ) ) )
            // InternalTraceryPlusPlus.g:267:2: ( ( rule__StoryVariable__Group__0 ) )
            {
            // InternalTraceryPlusPlus.g:267:2: ( ( rule__StoryVariable__Group__0 ) )
            // InternalTraceryPlusPlus.g:268:3: ( rule__StoryVariable__Group__0 )
            {
             before(grammarAccess.getStoryVariableAccess().getGroup()); 
            // InternalTraceryPlusPlus.g:269:3: ( rule__StoryVariable__Group__0 )
            // InternalTraceryPlusPlus.g:269:4: rule__StoryVariable__Group__0
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
    // InternalTraceryPlusPlus.g:278:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:279:1: ( ruleAttribute EOF )
            // InternalTraceryPlusPlus.g:280:1: ruleAttribute EOF
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
    // InternalTraceryPlusPlus.g:287:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:291:2: ( ( ( rule__Attribute__Alternatives ) ) )
            // InternalTraceryPlusPlus.g:292:2: ( ( rule__Attribute__Alternatives ) )
            {
            // InternalTraceryPlusPlus.g:292:2: ( ( rule__Attribute__Alternatives ) )
            // InternalTraceryPlusPlus.g:293:3: ( rule__Attribute__Alternatives )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives()); 
            // InternalTraceryPlusPlus.g:294:3: ( rule__Attribute__Alternatives )
            // InternalTraceryPlusPlus.g:294:4: rule__Attribute__Alternatives
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


    // $ANTLR start "entryRuleExistingVariable"
    // InternalTraceryPlusPlus.g:303:1: entryRuleExistingVariable : ruleExistingVariable EOF ;
    public final void entryRuleExistingVariable() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:304:1: ( ruleExistingVariable EOF )
            // InternalTraceryPlusPlus.g:305:1: ruleExistingVariable EOF
            {
             before(grammarAccess.getExistingVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleExistingVariable();

            state._fsp--;

             after(grammarAccess.getExistingVariableRule()); 
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
    // $ANTLR end "entryRuleExistingVariable"


    // $ANTLR start "ruleExistingVariable"
    // InternalTraceryPlusPlus.g:312:1: ruleExistingVariable : ( ( rule__ExistingVariable__PointerAssignment ) ) ;
    public final void ruleExistingVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:316:2: ( ( ( rule__ExistingVariable__PointerAssignment ) ) )
            // InternalTraceryPlusPlus.g:317:2: ( ( rule__ExistingVariable__PointerAssignment ) )
            {
            // InternalTraceryPlusPlus.g:317:2: ( ( rule__ExistingVariable__PointerAssignment ) )
            // InternalTraceryPlusPlus.g:318:3: ( rule__ExistingVariable__PointerAssignment )
            {
             before(grammarAccess.getExistingVariableAccess().getPointerAssignment()); 
            // InternalTraceryPlusPlus.g:319:3: ( rule__ExistingVariable__PointerAssignment )
            // InternalTraceryPlusPlus.g:319:4: rule__ExistingVariable__PointerAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ExistingVariable__PointerAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExistingVariableAccess().getPointerAssignment()); 

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
    // $ANTLR end "ruleExistingVariable"


    // $ANTLR start "entryRuleJustNameAttribute"
    // InternalTraceryPlusPlus.g:328:1: entryRuleJustNameAttribute : ruleJustNameAttribute EOF ;
    public final void entryRuleJustNameAttribute() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:329:1: ( ruleJustNameAttribute EOF )
            // InternalTraceryPlusPlus.g:330:1: ruleJustNameAttribute EOF
            {
             before(grammarAccess.getJustNameAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleJustNameAttribute();

            state._fsp--;

             after(grammarAccess.getJustNameAttributeRule()); 
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
    // $ANTLR end "entryRuleJustNameAttribute"


    // $ANTLR start "ruleJustNameAttribute"
    // InternalTraceryPlusPlus.g:337:1: ruleJustNameAttribute : ( ( rule__JustNameAttribute__NameAssignment ) ) ;
    public final void ruleJustNameAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:341:2: ( ( ( rule__JustNameAttribute__NameAssignment ) ) )
            // InternalTraceryPlusPlus.g:342:2: ( ( rule__JustNameAttribute__NameAssignment ) )
            {
            // InternalTraceryPlusPlus.g:342:2: ( ( rule__JustNameAttribute__NameAssignment ) )
            // InternalTraceryPlusPlus.g:343:3: ( rule__JustNameAttribute__NameAssignment )
            {
             before(grammarAccess.getJustNameAttributeAccess().getNameAssignment()); 
            // InternalTraceryPlusPlus.g:344:3: ( rule__JustNameAttribute__NameAssignment )
            // InternalTraceryPlusPlus.g:344:4: rule__JustNameAttribute__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__JustNameAttribute__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getJustNameAttributeAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleJustNameAttribute"


    // $ANTLR start "entryRuleNameExistingListAttribute"
    // InternalTraceryPlusPlus.g:353:1: entryRuleNameExistingListAttribute : ruleNameExistingListAttribute EOF ;
    public final void entryRuleNameExistingListAttribute() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:354:1: ( ruleNameExistingListAttribute EOF )
            // InternalTraceryPlusPlus.g:355:1: ruleNameExistingListAttribute EOF
            {
             before(grammarAccess.getNameExistingListAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleNameExistingListAttribute();

            state._fsp--;

             after(grammarAccess.getNameExistingListAttributeRule()); 
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
    // $ANTLR end "entryRuleNameExistingListAttribute"


    // $ANTLR start "ruleNameExistingListAttribute"
    // InternalTraceryPlusPlus.g:362:1: ruleNameExistingListAttribute : ( ( rule__NameExistingListAttribute__Group__0 ) ) ;
    public final void ruleNameExistingListAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:366:2: ( ( ( rule__NameExistingListAttribute__Group__0 ) ) )
            // InternalTraceryPlusPlus.g:367:2: ( ( rule__NameExistingListAttribute__Group__0 ) )
            {
            // InternalTraceryPlusPlus.g:367:2: ( ( rule__NameExistingListAttribute__Group__0 ) )
            // InternalTraceryPlusPlus.g:368:3: ( rule__NameExistingListAttribute__Group__0 )
            {
             before(grammarAccess.getNameExistingListAttributeAccess().getGroup()); 
            // InternalTraceryPlusPlus.g:369:3: ( rule__NameExistingListAttribute__Group__0 )
            // InternalTraceryPlusPlus.g:369:4: rule__NameExistingListAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NameExistingListAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNameExistingListAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleNameExistingListAttribute"


    // $ANTLR start "entryRuleNameValueAttribute"
    // InternalTraceryPlusPlus.g:378:1: entryRuleNameValueAttribute : ruleNameValueAttribute EOF ;
    public final void entryRuleNameValueAttribute() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:379:1: ( ruleNameValueAttribute EOF )
            // InternalTraceryPlusPlus.g:380:1: ruleNameValueAttribute EOF
            {
             before(grammarAccess.getNameValueAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleNameValueAttribute();

            state._fsp--;

             after(grammarAccess.getNameValueAttributeRule()); 
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
    // $ANTLR end "entryRuleNameValueAttribute"


    // $ANTLR start "ruleNameValueAttribute"
    // InternalTraceryPlusPlus.g:387:1: ruleNameValueAttribute : ( ( rule__NameValueAttribute__Group__0 ) ) ;
    public final void ruleNameValueAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:391:2: ( ( ( rule__NameValueAttribute__Group__0 ) ) )
            // InternalTraceryPlusPlus.g:392:2: ( ( rule__NameValueAttribute__Group__0 ) )
            {
            // InternalTraceryPlusPlus.g:392:2: ( ( rule__NameValueAttribute__Group__0 ) )
            // InternalTraceryPlusPlus.g:393:3: ( rule__NameValueAttribute__Group__0 )
            {
             before(grammarAccess.getNameValueAttributeAccess().getGroup()); 
            // InternalTraceryPlusPlus.g:394:3: ( rule__NameValueAttribute__Group__0 )
            // InternalTraceryPlusPlus.g:394:4: rule__NameValueAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NameValueAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNameValueAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleNameValueAttribute"


    // $ANTLR start "entryRuleObjectAttribute"
    // InternalTraceryPlusPlus.g:403:1: entryRuleObjectAttribute : ruleObjectAttribute EOF ;
    public final void entryRuleObjectAttribute() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:404:1: ( ruleObjectAttribute EOF )
            // InternalTraceryPlusPlus.g:405:1: ruleObjectAttribute EOF
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
    // InternalTraceryPlusPlus.g:412:1: ruleObjectAttribute : ( ( rule__ObjectAttribute__Group__0 ) ) ;
    public final void ruleObjectAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:416:2: ( ( ( rule__ObjectAttribute__Group__0 ) ) )
            // InternalTraceryPlusPlus.g:417:2: ( ( rule__ObjectAttribute__Group__0 ) )
            {
            // InternalTraceryPlusPlus.g:417:2: ( ( rule__ObjectAttribute__Group__0 ) )
            // InternalTraceryPlusPlus.g:418:3: ( rule__ObjectAttribute__Group__0 )
            {
             before(grammarAccess.getObjectAttributeAccess().getGroup()); 
            // InternalTraceryPlusPlus.g:419:3: ( rule__ObjectAttribute__Group__0 )
            // InternalTraceryPlusPlus.g:419:4: rule__ObjectAttribute__Group__0
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
    // InternalTraceryPlusPlus.g:428:1: entryRuleWordList : ruleWordList EOF ;
    public final void entryRuleWordList() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:429:1: ( ruleWordList EOF )
            // InternalTraceryPlusPlus.g:430:1: ruleWordList EOF
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
    // InternalTraceryPlusPlus.g:437:1: ruleWordList : ( ( rule__WordList__Group__0 ) ) ;
    public final void ruleWordList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:441:2: ( ( ( rule__WordList__Group__0 ) ) )
            // InternalTraceryPlusPlus.g:442:2: ( ( rule__WordList__Group__0 ) )
            {
            // InternalTraceryPlusPlus.g:442:2: ( ( rule__WordList__Group__0 ) )
            // InternalTraceryPlusPlus.g:443:3: ( rule__WordList__Group__0 )
            {
             before(grammarAccess.getWordListAccess().getGroup()); 
            // InternalTraceryPlusPlus.g:444:3: ( rule__WordList__Group__0 )
            // InternalTraceryPlusPlus.g:444:4: rule__WordList__Group__0
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
    // InternalTraceryPlusPlus.g:453:1: entryRuleAttributeList : ruleAttributeList EOF ;
    public final void entryRuleAttributeList() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:454:1: ( ruleAttributeList EOF )
            // InternalTraceryPlusPlus.g:455:1: ruleAttributeList EOF
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
    // InternalTraceryPlusPlus.g:462:1: ruleAttributeList : ( ( rule__AttributeList__Group__0 ) ) ;
    public final void ruleAttributeList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:466:2: ( ( ( rule__AttributeList__Group__0 ) ) )
            // InternalTraceryPlusPlus.g:467:2: ( ( rule__AttributeList__Group__0 ) )
            {
            // InternalTraceryPlusPlus.g:467:2: ( ( rule__AttributeList__Group__0 ) )
            // InternalTraceryPlusPlus.g:468:3: ( rule__AttributeList__Group__0 )
            {
             before(grammarAccess.getAttributeListAccess().getGroup()); 
            // InternalTraceryPlusPlus.g:469:3: ( rule__AttributeList__Group__0 )
            // InternalTraceryPlusPlus.g:469:4: rule__AttributeList__Group__0
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


    // $ANTLR start "entryRulePronouns"
    // InternalTraceryPlusPlus.g:478:1: entryRulePronouns : rulePronouns EOF ;
    public final void entryRulePronouns() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:479:1: ( rulePronouns EOF )
            // InternalTraceryPlusPlus.g:480:1: rulePronouns EOF
            {
             before(grammarAccess.getPronounsRule()); 
            pushFollow(FOLLOW_1);
            rulePronouns();

            state._fsp--;

             after(grammarAccess.getPronounsRule()); 
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
    // $ANTLR end "entryRulePronouns"


    // $ANTLR start "rulePronouns"
    // InternalTraceryPlusPlus.g:487:1: rulePronouns : ( ( rule__Pronouns__Alternatives ) ) ;
    public final void rulePronouns() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:491:2: ( ( ( rule__Pronouns__Alternatives ) ) )
            // InternalTraceryPlusPlus.g:492:2: ( ( rule__Pronouns__Alternatives ) )
            {
            // InternalTraceryPlusPlus.g:492:2: ( ( rule__Pronouns__Alternatives ) )
            // InternalTraceryPlusPlus.g:493:3: ( rule__Pronouns__Alternatives )
            {
             before(grammarAccess.getPronounsAccess().getAlternatives()); 
            // InternalTraceryPlusPlus.g:494:3: ( rule__Pronouns__Alternatives )
            // InternalTraceryPlusPlus.g:494:4: rule__Pronouns__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Pronouns__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPronounsAccess().getAlternatives()); 

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
    // $ANTLR end "rulePronouns"


    // $ANTLR start "entryRulePronounIdentifier"
    // InternalTraceryPlusPlus.g:503:1: entryRulePronounIdentifier : rulePronounIdentifier EOF ;
    public final void entryRulePronounIdentifier() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:504:1: ( rulePronounIdentifier EOF )
            // InternalTraceryPlusPlus.g:505:1: rulePronounIdentifier EOF
            {
             before(grammarAccess.getPronounIdentifierRule()); 
            pushFollow(FOLLOW_1);
            rulePronounIdentifier();

            state._fsp--;

             after(grammarAccess.getPronounIdentifierRule()); 
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
    // $ANTLR end "entryRulePronounIdentifier"


    // $ANTLR start "rulePronounIdentifier"
    // InternalTraceryPlusPlus.g:512:1: rulePronounIdentifier : ( ( rule__PronounIdentifier__NameAssignment ) ) ;
    public final void rulePronounIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:516:2: ( ( ( rule__PronounIdentifier__NameAssignment ) ) )
            // InternalTraceryPlusPlus.g:517:2: ( ( rule__PronounIdentifier__NameAssignment ) )
            {
            // InternalTraceryPlusPlus.g:517:2: ( ( rule__PronounIdentifier__NameAssignment ) )
            // InternalTraceryPlusPlus.g:518:3: ( rule__PronounIdentifier__NameAssignment )
            {
             before(grammarAccess.getPronounIdentifierAccess().getNameAssignment()); 
            // InternalTraceryPlusPlus.g:519:3: ( rule__PronounIdentifier__NameAssignment )
            // InternalTraceryPlusPlus.g:519:4: rule__PronounIdentifier__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PronounIdentifier__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPronounIdentifierAccess().getNameAssignment()); 

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
    // $ANTLR end "rulePronounIdentifier"


    // $ANTLR start "entryRuleModifier"
    // InternalTraceryPlusPlus.g:528:1: entryRuleModifier : ruleModifier EOF ;
    public final void entryRuleModifier() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:529:1: ( ruleModifier EOF )
            // InternalTraceryPlusPlus.g:530:1: ruleModifier EOF
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
    // InternalTraceryPlusPlus.g:537:1: ruleModifier : ( ( rule__Modifier__Alternatives ) ) ;
    public final void ruleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:541:2: ( ( ( rule__Modifier__Alternatives ) ) )
            // InternalTraceryPlusPlus.g:542:2: ( ( rule__Modifier__Alternatives ) )
            {
            // InternalTraceryPlusPlus.g:542:2: ( ( rule__Modifier__Alternatives ) )
            // InternalTraceryPlusPlus.g:543:3: ( rule__Modifier__Alternatives )
            {
             before(grammarAccess.getModifierAccess().getAlternatives()); 
            // InternalTraceryPlusPlus.g:544:3: ( rule__Modifier__Alternatives )
            // InternalTraceryPlusPlus.g:544:4: rule__Modifier__Alternatives
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
    // InternalTraceryPlusPlus.g:553:1: entryRuleCapitalizationModifier : ruleCapitalizationModifier EOF ;
    public final void entryRuleCapitalizationModifier() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:554:1: ( ruleCapitalizationModifier EOF )
            // InternalTraceryPlusPlus.g:555:1: ruleCapitalizationModifier EOF
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
    // InternalTraceryPlusPlus.g:562:1: ruleCapitalizationModifier : ( '.capitalize' ) ;
    public final void ruleCapitalizationModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:566:2: ( ( '.capitalize' ) )
            // InternalTraceryPlusPlus.g:567:2: ( '.capitalize' )
            {
            // InternalTraceryPlusPlus.g:567:2: ( '.capitalize' )
            // InternalTraceryPlusPlus.g:568:3: '.capitalize'
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
    // InternalTraceryPlusPlus.g:578:1: entryRuleFullCapitalizationModifier : ruleFullCapitalizationModifier EOF ;
    public final void entryRuleFullCapitalizationModifier() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:579:1: ( ruleFullCapitalizationModifier EOF )
            // InternalTraceryPlusPlus.g:580:1: ruleFullCapitalizationModifier EOF
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
    // InternalTraceryPlusPlus.g:587:1: ruleFullCapitalizationModifier : ( '.CAPITALIZE' ) ;
    public final void ruleFullCapitalizationModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:591:2: ( ( '.CAPITALIZE' ) )
            // InternalTraceryPlusPlus.g:592:2: ( '.CAPITALIZE' )
            {
            // InternalTraceryPlusPlus.g:592:2: ( '.CAPITALIZE' )
            // InternalTraceryPlusPlus.g:593:3: '.CAPITALIZE'
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
    // InternalTraceryPlusPlus.g:603:1: entryRulePluralityModifier : rulePluralityModifier EOF ;
    public final void entryRulePluralityModifier() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:604:1: ( rulePluralityModifier EOF )
            // InternalTraceryPlusPlus.g:605:1: rulePluralityModifier EOF
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
    // InternalTraceryPlusPlus.g:612:1: rulePluralityModifier : ( '.s' ) ;
    public final void rulePluralityModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:616:2: ( ( '.s' ) )
            // InternalTraceryPlusPlus.g:617:2: ( '.s' )
            {
            // InternalTraceryPlusPlus.g:617:2: ( '.s' )
            // InternalTraceryPlusPlus.g:618:3: '.s'
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
    // InternalTraceryPlusPlus.g:628:1: entryRuleArticleModifier : ruleArticleModifier EOF ;
    public final void entryRuleArticleModifier() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:629:1: ( ruleArticleModifier EOF )
            // InternalTraceryPlusPlus.g:630:1: ruleArticleModifier EOF
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
    // InternalTraceryPlusPlus.g:637:1: ruleArticleModifier : ( '.a' ) ;
    public final void ruleArticleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:641:2: ( ( '.a' ) )
            // InternalTraceryPlusPlus.g:642:2: ( '.a' )
            {
            // InternalTraceryPlusPlus.g:642:2: ( '.a' )
            // InternalTraceryPlusPlus.g:643:3: '.a'
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
    // InternalTraceryPlusPlus.g:653:1: entryRulePastTenseModifier : rulePastTenseModifier EOF ;
    public final void entryRulePastTenseModifier() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:654:1: ( rulePastTenseModifier EOF )
            // InternalTraceryPlusPlus.g:655:1: rulePastTenseModifier EOF
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
    // InternalTraceryPlusPlus.g:662:1: rulePastTenseModifier : ( '.ed' ) ;
    public final void rulePastTenseModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:666:2: ( ( '.ed' ) )
            // InternalTraceryPlusPlus.g:667:2: ( '.ed' )
            {
            // InternalTraceryPlusPlus.g:667:2: ( '.ed' )
            // InternalTraceryPlusPlus.g:668:3: '.ed'
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


    // $ANTLR start "entryRuleAssignmentOperator"
    // InternalTraceryPlusPlus.g:678:1: entryRuleAssignmentOperator : ruleAssignmentOperator EOF ;
    public final void entryRuleAssignmentOperator() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:679:1: ( ruleAssignmentOperator EOF )
            // InternalTraceryPlusPlus.g:680:1: ruleAssignmentOperator EOF
            {
             before(grammarAccess.getAssignmentOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleAssignmentOperator();

            state._fsp--;

             after(grammarAccess.getAssignmentOperatorRule()); 
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
    // $ANTLR end "entryRuleAssignmentOperator"


    // $ANTLR start "ruleAssignmentOperator"
    // InternalTraceryPlusPlus.g:687:1: ruleAssignmentOperator : ( ( rule__AssignmentOperator__Alternatives ) ) ;
    public final void ruleAssignmentOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:691:2: ( ( ( rule__AssignmentOperator__Alternatives ) ) )
            // InternalTraceryPlusPlus.g:692:2: ( ( rule__AssignmentOperator__Alternatives ) )
            {
            // InternalTraceryPlusPlus.g:692:2: ( ( rule__AssignmentOperator__Alternatives ) )
            // InternalTraceryPlusPlus.g:693:3: ( rule__AssignmentOperator__Alternatives )
            {
             before(grammarAccess.getAssignmentOperatorAccess().getAlternatives()); 
            // InternalTraceryPlusPlus.g:694:3: ( rule__AssignmentOperator__Alternatives )
            // InternalTraceryPlusPlus.g:694:4: rule__AssignmentOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AssignmentOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAssignmentOperator"


    // $ANTLR start "entryRuleSeparatorOr"
    // InternalTraceryPlusPlus.g:703:1: entryRuleSeparatorOr : ruleSeparatorOr EOF ;
    public final void entryRuleSeparatorOr() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:704:1: ( ruleSeparatorOr EOF )
            // InternalTraceryPlusPlus.g:705:1: ruleSeparatorOr EOF
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
    // InternalTraceryPlusPlus.g:712:1: ruleSeparatorOr : ( ( rule__SeparatorOr__Alternatives ) ) ;
    public final void ruleSeparatorOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:716:2: ( ( ( rule__SeparatorOr__Alternatives ) ) )
            // InternalTraceryPlusPlus.g:717:2: ( ( rule__SeparatorOr__Alternatives ) )
            {
            // InternalTraceryPlusPlus.g:717:2: ( ( rule__SeparatorOr__Alternatives ) )
            // InternalTraceryPlusPlus.g:718:3: ( rule__SeparatorOr__Alternatives )
            {
             before(grammarAccess.getSeparatorOrAccess().getAlternatives()); 
            // InternalTraceryPlusPlus.g:719:3: ( rule__SeparatorOr__Alternatives )
            // InternalTraceryPlusPlus.g:719:4: rule__SeparatorOr__Alternatives
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
    // InternalTraceryPlusPlus.g:728:1: entryRuleSeparatorAnd : ruleSeparatorAnd EOF ;
    public final void entryRuleSeparatorAnd() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:729:1: ( ruleSeparatorAnd EOF )
            // InternalTraceryPlusPlus.g:730:1: ruleSeparatorAnd EOF
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
    // InternalTraceryPlusPlus.g:737:1: ruleSeparatorAnd : ( ( rule__SeparatorAnd__Alternatives ) ) ;
    public final void ruleSeparatorAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:741:2: ( ( ( rule__SeparatorAnd__Alternatives ) ) )
            // InternalTraceryPlusPlus.g:742:2: ( ( rule__SeparatorAnd__Alternatives ) )
            {
            // InternalTraceryPlusPlus.g:742:2: ( ( rule__SeparatorAnd__Alternatives ) )
            // InternalTraceryPlusPlus.g:743:3: ( rule__SeparatorAnd__Alternatives )
            {
             before(grammarAccess.getSeparatorAndAccess().getAlternatives()); 
            // InternalTraceryPlusPlus.g:744:3: ( rule__SeparatorAnd__Alternatives )
            // InternalTraceryPlusPlus.g:744:4: rule__SeparatorAnd__Alternatives
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
    // InternalTraceryPlusPlus.g:752:1: rule__Declaration__Alternatives : ( ( ruleListDeclaration ) | ( ruleObjectDeclaration ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:756:1: ( ( ruleListDeclaration ) | ( ruleObjectDeclaration ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==41) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTraceryPlusPlus.g:757:2: ( ruleListDeclaration )
                    {
                    // InternalTraceryPlusPlus.g:757:2: ( ruleListDeclaration )
                    // InternalTraceryPlusPlus.g:758:3: ruleListDeclaration
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
                    // InternalTraceryPlusPlus.g:763:2: ( ruleObjectDeclaration )
                    {
                    // InternalTraceryPlusPlus.g:763:2: ( ruleObjectDeclaration )
                    // InternalTraceryPlusPlus.g:764:3: ruleObjectDeclaration
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


    // $ANTLR start "rule__Story__StoryAlternatives_4_0"
    // InternalTraceryPlusPlus.g:773:1: rule__Story__StoryAlternatives_4_0 : ( ( ruleWord ) | ( ruleStoryVariable ) | ( ruleObjectAttribute ) );
    public final void rule__Story__StoryAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:777:1: ( ( ruleWord ) | ( ruleStoryVariable ) | ( ruleObjectAttribute ) )
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
                else if ( ((LA2_2>=23 && LA2_2<=26)||LA2_2==43) ) {
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
                    // InternalTraceryPlusPlus.g:778:2: ( ruleWord )
                    {
                    // InternalTraceryPlusPlus.g:778:2: ( ruleWord )
                    // InternalTraceryPlusPlus.g:779:3: ruleWord
                    {
                     before(grammarAccess.getStoryAccess().getStoryWordParserRuleCall_4_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWord();

                    state._fsp--;

                     after(grammarAccess.getStoryAccess().getStoryWordParserRuleCall_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:784:2: ( ruleStoryVariable )
                    {
                    // InternalTraceryPlusPlus.g:784:2: ( ruleStoryVariable )
                    // InternalTraceryPlusPlus.g:785:3: ruleStoryVariable
                    {
                     before(grammarAccess.getStoryAccess().getStoryStoryVariableParserRuleCall_4_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStoryVariable();

                    state._fsp--;

                     after(grammarAccess.getStoryAccess().getStoryStoryVariableParserRuleCall_4_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:790:2: ( ruleObjectAttribute )
                    {
                    // InternalTraceryPlusPlus.g:790:2: ( ruleObjectAttribute )
                    // InternalTraceryPlusPlus.g:791:3: ruleObjectAttribute
                    {
                     before(grammarAccess.getStoryAccess().getStoryObjectAttributeParserRuleCall_4_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleObjectAttribute();

                    state._fsp--;

                     after(grammarAccess.getStoryAccess().getStoryObjectAttributeParserRuleCall_4_0_2()); 

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
    // $ANTLR end "rule__Story__StoryAlternatives_4_0"


    // $ANTLR start "rule__ListDeclaration__Alternatives_1"
    // InternalTraceryPlusPlus.g:800:1: rule__ListDeclaration__Alternatives_1 : ( ( ( rule__ListDeclaration__Group_1_0__0 ) ) | ( ( rule__ListDeclaration__Group_1_1__0 ) ) | ( ( rule__ListDeclaration__Group_1_2__0 ) ) );
    public final void rule__ListDeclaration__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:804:1: ( ( ( rule__ListDeclaration__Group_1_0__0 ) ) | ( ( rule__ListDeclaration__Group_1_1__0 ) ) | ( ( rule__ListDeclaration__Group_1_2__0 ) ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==38) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==21) ) {
                    alt3=1;
                }
                else if ( (LA3_1==40) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==20) ) {
                alt3=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTraceryPlusPlus.g:805:2: ( ( rule__ListDeclaration__Group_1_0__0 ) )
                    {
                    // InternalTraceryPlusPlus.g:805:2: ( ( rule__ListDeclaration__Group_1_0__0 ) )
                    // InternalTraceryPlusPlus.g:806:3: ( rule__ListDeclaration__Group_1_0__0 )
                    {
                     before(grammarAccess.getListDeclarationAccess().getGroup_1_0()); 
                    // InternalTraceryPlusPlus.g:807:3: ( rule__ListDeclaration__Group_1_0__0 )
                    // InternalTraceryPlusPlus.g:807:4: rule__ListDeclaration__Group_1_0__0
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
                    // InternalTraceryPlusPlus.g:811:2: ( ( rule__ListDeclaration__Group_1_1__0 ) )
                    {
                    // InternalTraceryPlusPlus.g:811:2: ( ( rule__ListDeclaration__Group_1_1__0 ) )
                    // InternalTraceryPlusPlus.g:812:3: ( rule__ListDeclaration__Group_1_1__0 )
                    {
                     before(grammarAccess.getListDeclarationAccess().getGroup_1_1()); 
                    // InternalTraceryPlusPlus.g:813:3: ( rule__ListDeclaration__Group_1_1__0 )
                    // InternalTraceryPlusPlus.g:813:4: rule__ListDeclaration__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ListDeclaration__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getListDeclarationAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:817:2: ( ( rule__ListDeclaration__Group_1_2__0 ) )
                    {
                    // InternalTraceryPlusPlus.g:817:2: ( ( rule__ListDeclaration__Group_1_2__0 ) )
                    // InternalTraceryPlusPlus.g:818:3: ( rule__ListDeclaration__Group_1_2__0 )
                    {
                     before(grammarAccess.getListDeclarationAccess().getGroup_1_2()); 
                    // InternalTraceryPlusPlus.g:819:3: ( rule__ListDeclaration__Group_1_2__0 )
                    // InternalTraceryPlusPlus.g:819:4: rule__ListDeclaration__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ListDeclaration__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getListDeclarationAccess().getGroup_1_2()); 

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


    // $ANTLR start "rule__ObjectDeclaration__Alternatives_1"
    // InternalTraceryPlusPlus.g:827:1: rule__ObjectDeclaration__Alternatives_1 : ( ( 'is' ) | ( 'are' ) );
    public final void rule__ObjectDeclaration__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:831:1: ( ( 'is' ) | ( 'are' ) )
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
                    // InternalTraceryPlusPlus.g:832:2: ( 'is' )
                    {
                    // InternalTraceryPlusPlus.g:832:2: ( 'is' )
                    // InternalTraceryPlusPlus.g:833:3: 'is'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getIsKeyword_1_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getObjectDeclarationAccess().getIsKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:838:2: ( 'are' )
                    {
                    // InternalTraceryPlusPlus.g:838:2: ( 'are' )
                    // InternalTraceryPlusPlus.g:839:3: 'are'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getAreKeyword_1_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getObjectDeclarationAccess().getAreKeyword_1_1()); 

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
    // $ANTLR end "rule__ObjectDeclaration__Alternatives_1"


    // $ANTLR start "rule__ObjectDeclaration__Alternatives_2"
    // InternalTraceryPlusPlus.g:848:1: rule__ObjectDeclaration__Alternatives_2 : ( ( 'a' ) | ( 'an' ) );
    public final void rule__ObjectDeclaration__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:852:1: ( ( 'a' ) | ( 'an' ) )
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
                    // InternalTraceryPlusPlus.g:853:2: ( 'a' )
                    {
                    // InternalTraceryPlusPlus.g:853:2: ( 'a' )
                    // InternalTraceryPlusPlus.g:854:3: 'a'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getAKeyword_2_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getObjectDeclarationAccess().getAKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:859:2: ( 'an' )
                    {
                    // InternalTraceryPlusPlus.g:859:2: ( 'an' )
                    // InternalTraceryPlusPlus.g:860:3: 'an'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getAnKeyword_2_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getObjectDeclarationAccess().getAnKeyword_2_1()); 

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
    // $ANTLR end "rule__ObjectDeclaration__Alternatives_2"


    // $ANTLR start "rule__ObjectDeclaration__Alternatives_5"
    // InternalTraceryPlusPlus.g:869:1: rule__ObjectDeclaration__Alternatives_5 : ( ( 'has' ) | ( 'have' ) );
    public final void rule__ObjectDeclaration__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:873:1: ( ( 'has' ) | ( 'have' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            else if ( (LA6_0==21) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTraceryPlusPlus.g:874:2: ( 'has' )
                    {
                    // InternalTraceryPlusPlus.g:874:2: ( 'has' )
                    // InternalTraceryPlusPlus.g:875:3: 'has'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getHasKeyword_5_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getObjectDeclarationAccess().getHasKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:880:2: ( 'have' )
                    {
                    // InternalTraceryPlusPlus.g:880:2: ( 'have' )
                    // InternalTraceryPlusPlus.g:881:3: 'have'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getHaveKeyword_5_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getObjectDeclarationAccess().getHaveKeyword_5_1()); 

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
    // $ANTLR end "rule__ObjectDeclaration__Alternatives_5"


    // $ANTLR start "rule__Attribute__Alternatives"
    // InternalTraceryPlusPlus.g:890:1: rule__Attribute__Alternatives : ( ( ruleJustNameAttribute ) | ( ruleNameExistingListAttribute ) | ( ruleNameValueAttribute ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:894:1: ( ( ruleJustNameAttribute ) | ( ruleNameExistingListAttribute ) | ( ruleNameValueAttribute ) )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalTraceryPlusPlus.g:895:2: ( ruleJustNameAttribute )
                    {
                    // InternalTraceryPlusPlus.g:895:2: ( ruleJustNameAttribute )
                    // InternalTraceryPlusPlus.g:896:3: ruleJustNameAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getJustNameAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleJustNameAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getJustNameAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:901:2: ( ruleNameExistingListAttribute )
                    {
                    // InternalTraceryPlusPlus.g:901:2: ( ruleNameExistingListAttribute )
                    // InternalTraceryPlusPlus.g:902:3: ruleNameExistingListAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getNameExistingListAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNameExistingListAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getNameExistingListAttributeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:907:2: ( ruleNameValueAttribute )
                    {
                    // InternalTraceryPlusPlus.g:907:2: ( ruleNameValueAttribute )
                    // InternalTraceryPlusPlus.g:908:3: ruleNameValueAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getNameValueAttributeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNameValueAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getNameValueAttributeParserRuleCall_2()); 

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


    // $ANTLR start "rule__NameExistingListAttribute__Alternatives_1"
    // InternalTraceryPlusPlus.g:917:1: rule__NameExistingListAttribute__Alternatives_1 : ( ( ruleAssignmentOperator ) | ( 'from' ) );
    public final void rule__NameExistingListAttribute__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:921:1: ( ( ruleAssignmentOperator ) | ( 'from' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=27 && LA8_0<=30)) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTraceryPlusPlus.g:922:2: ( ruleAssignmentOperator )
                    {
                    // InternalTraceryPlusPlus.g:922:2: ( ruleAssignmentOperator )
                    // InternalTraceryPlusPlus.g:923:3: ruleAssignmentOperator
                    {
                     before(grammarAccess.getNameExistingListAttributeAccess().getAssignmentOperatorParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAssignmentOperator();

                    state._fsp--;

                     after(grammarAccess.getNameExistingListAttributeAccess().getAssignmentOperatorParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:928:2: ( 'from' )
                    {
                    // InternalTraceryPlusPlus.g:928:2: ( 'from' )
                    // InternalTraceryPlusPlus.g:929:3: 'from'
                    {
                     before(grammarAccess.getNameExistingListAttributeAccess().getFromKeyword_1_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getNameExistingListAttributeAccess().getFromKeyword_1_1()); 

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
    // $ANTLR end "rule__NameExistingListAttribute__Alternatives_1"


    // $ANTLR start "rule__ObjectAttribute__Alternatives_0"
    // InternalTraceryPlusPlus.g:938:1: rule__ObjectAttribute__Alternatives_0 : ( ( ( rule__ObjectAttribute__Group_0_0__0 ) ) | ( ( rule__ObjectAttribute__Group_0_1__0 ) ) );
    public final void rule__ObjectAttribute__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:942:1: ( ( ( rule__ObjectAttribute__Group_0_0__0 ) ) | ( ( rule__ObjectAttribute__Group_0_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==43) ) {
                    int LA9_2 = input.LA(3);

                    if ( ((LA9_2>=23 && LA9_2<=26)) ) {
                        alt9=2;
                    }
                    else if ( (LA9_2==RULE_ID) ) {
                        alt9=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }
                }
                else if ( ((LA9_1>=23 && LA9_1<=26)) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalTraceryPlusPlus.g:943:2: ( ( rule__ObjectAttribute__Group_0_0__0 ) )
                    {
                    // InternalTraceryPlusPlus.g:943:2: ( ( rule__ObjectAttribute__Group_0_0__0 ) )
                    // InternalTraceryPlusPlus.g:944:3: ( rule__ObjectAttribute__Group_0_0__0 )
                    {
                     before(grammarAccess.getObjectAttributeAccess().getGroup_0_0()); 
                    // InternalTraceryPlusPlus.g:945:3: ( rule__ObjectAttribute__Group_0_0__0 )
                    // InternalTraceryPlusPlus.g:945:4: rule__ObjectAttribute__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjectAttribute__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectAttributeAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:949:2: ( ( rule__ObjectAttribute__Group_0_1__0 ) )
                    {
                    // InternalTraceryPlusPlus.g:949:2: ( ( rule__ObjectAttribute__Group_0_1__0 ) )
                    // InternalTraceryPlusPlus.g:950:3: ( rule__ObjectAttribute__Group_0_1__0 )
                    {
                     before(grammarAccess.getObjectAttributeAccess().getGroup_0_1()); 
                    // InternalTraceryPlusPlus.g:951:3: ( rule__ObjectAttribute__Group_0_1__0 )
                    // InternalTraceryPlusPlus.g:951:4: rule__ObjectAttribute__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjectAttribute__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectAttributeAccess().getGroup_0_1()); 

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
    // $ANTLR end "rule__ObjectAttribute__Alternatives_0"


    // $ANTLR start "rule__Pronouns__Alternatives"
    // InternalTraceryPlusPlus.g:959:1: rule__Pronouns__Alternatives : ( ( ( rule__Pronouns__ValueAssignment_0 ) ) | ( ( rule__Pronouns__ValueAssignment_1 ) ) | ( ( rule__Pronouns__ValueAssignment_2 ) ) | ( ( rule__Pronouns__ValueAssignment_3 ) ) );
    public final void rule__Pronouns__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:963:1: ( ( ( rule__Pronouns__ValueAssignment_0 ) ) | ( ( rule__Pronouns__ValueAssignment_1 ) ) | ( ( rule__Pronouns__ValueAssignment_2 ) ) | ( ( rule__Pronouns__ValueAssignment_3 ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt10=1;
                }
                break;
            case 45:
                {
                alt10=2;
                }
                break;
            case 46:
                {
                alt10=3;
                }
                break;
            case 47:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalTraceryPlusPlus.g:964:2: ( ( rule__Pronouns__ValueAssignment_0 ) )
                    {
                    // InternalTraceryPlusPlus.g:964:2: ( ( rule__Pronouns__ValueAssignment_0 ) )
                    // InternalTraceryPlusPlus.g:965:3: ( rule__Pronouns__ValueAssignment_0 )
                    {
                     before(grammarAccess.getPronounsAccess().getValueAssignment_0()); 
                    // InternalTraceryPlusPlus.g:966:3: ( rule__Pronouns__ValueAssignment_0 )
                    // InternalTraceryPlusPlus.g:966:4: rule__Pronouns__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pronouns__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPronounsAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:970:2: ( ( rule__Pronouns__ValueAssignment_1 ) )
                    {
                    // InternalTraceryPlusPlus.g:970:2: ( ( rule__Pronouns__ValueAssignment_1 ) )
                    // InternalTraceryPlusPlus.g:971:3: ( rule__Pronouns__ValueAssignment_1 )
                    {
                     before(grammarAccess.getPronounsAccess().getValueAssignment_1()); 
                    // InternalTraceryPlusPlus.g:972:3: ( rule__Pronouns__ValueAssignment_1 )
                    // InternalTraceryPlusPlus.g:972:4: rule__Pronouns__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pronouns__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPronounsAccess().getValueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:976:2: ( ( rule__Pronouns__ValueAssignment_2 ) )
                    {
                    // InternalTraceryPlusPlus.g:976:2: ( ( rule__Pronouns__ValueAssignment_2 ) )
                    // InternalTraceryPlusPlus.g:977:3: ( rule__Pronouns__ValueAssignment_2 )
                    {
                     before(grammarAccess.getPronounsAccess().getValueAssignment_2()); 
                    // InternalTraceryPlusPlus.g:978:3: ( rule__Pronouns__ValueAssignment_2 )
                    // InternalTraceryPlusPlus.g:978:4: rule__Pronouns__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pronouns__ValueAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getPronounsAccess().getValueAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTraceryPlusPlus.g:982:2: ( ( rule__Pronouns__ValueAssignment_3 ) )
                    {
                    // InternalTraceryPlusPlus.g:982:2: ( ( rule__Pronouns__ValueAssignment_3 ) )
                    // InternalTraceryPlusPlus.g:983:3: ( rule__Pronouns__ValueAssignment_3 )
                    {
                     before(grammarAccess.getPronounsAccess().getValueAssignment_3()); 
                    // InternalTraceryPlusPlus.g:984:3: ( rule__Pronouns__ValueAssignment_3 )
                    // InternalTraceryPlusPlus.g:984:4: rule__Pronouns__ValueAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pronouns__ValueAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getPronounsAccess().getValueAssignment_3()); 

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
    // $ANTLR end "rule__Pronouns__Alternatives"


    // $ANTLR start "rule__PronounIdentifier__NameAlternatives_0"
    // InternalTraceryPlusPlus.g:992:1: rule__PronounIdentifier__NameAlternatives_0 : ( ( 'they' ) | ( 'them' ) | ( 'their' ) | ( 'theirs' ) );
    public final void rule__PronounIdentifier__NameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:996:1: ( ( 'they' ) | ( 'them' ) | ( 'their' ) | ( 'theirs' ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt11=1;
                }
                break;
            case 24:
                {
                alt11=2;
                }
                break;
            case 25:
                {
                alt11=3;
                }
                break;
            case 26:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalTraceryPlusPlus.g:997:2: ( 'they' )
                    {
                    // InternalTraceryPlusPlus.g:997:2: ( 'they' )
                    // InternalTraceryPlusPlus.g:998:3: 'they'
                    {
                     before(grammarAccess.getPronounIdentifierAccess().getNameTheyKeyword_0_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getPronounIdentifierAccess().getNameTheyKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1003:2: ( 'them' )
                    {
                    // InternalTraceryPlusPlus.g:1003:2: ( 'them' )
                    // InternalTraceryPlusPlus.g:1004:3: 'them'
                    {
                     before(grammarAccess.getPronounIdentifierAccess().getNameThemKeyword_0_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getPronounIdentifierAccess().getNameThemKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1009:2: ( 'their' )
                    {
                    // InternalTraceryPlusPlus.g:1009:2: ( 'their' )
                    // InternalTraceryPlusPlus.g:1010:3: 'their'
                    {
                     before(grammarAccess.getPronounIdentifierAccess().getNameTheirKeyword_0_2()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getPronounIdentifierAccess().getNameTheirKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTraceryPlusPlus.g:1015:2: ( 'theirs' )
                    {
                    // InternalTraceryPlusPlus.g:1015:2: ( 'theirs' )
                    // InternalTraceryPlusPlus.g:1016:3: 'theirs'
                    {
                     before(grammarAccess.getPronounIdentifierAccess().getNameTheirsKeyword_0_3()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getPronounIdentifierAccess().getNameTheirsKeyword_0_3()); 

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
    // $ANTLR end "rule__PronounIdentifier__NameAlternatives_0"


    // $ANTLR start "rule__Modifier__Alternatives"
    // InternalTraceryPlusPlus.g:1025:1: rule__Modifier__Alternatives : ( ( ruleCapitalizationModifier ) | ( ruleFullCapitalizationModifier ) | ( rulePluralityModifier ) | ( ruleArticleModifier ) | ( rulePastTenseModifier ) );
    public final void rule__Modifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1029:1: ( ( ruleCapitalizationModifier ) | ( ruleFullCapitalizationModifier ) | ( rulePluralityModifier ) | ( ruleArticleModifier ) | ( rulePastTenseModifier ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt12=1;
                }
                break;
            case 12:
                {
                alt12=2;
                }
                break;
            case 13:
                {
                alt12=3;
                }
                break;
            case 14:
                {
                alt12=4;
                }
                break;
            case 15:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1030:2: ( ruleCapitalizationModifier )
                    {
                    // InternalTraceryPlusPlus.g:1030:2: ( ruleCapitalizationModifier )
                    // InternalTraceryPlusPlus.g:1031:3: ruleCapitalizationModifier
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
                    // InternalTraceryPlusPlus.g:1036:2: ( ruleFullCapitalizationModifier )
                    {
                    // InternalTraceryPlusPlus.g:1036:2: ( ruleFullCapitalizationModifier )
                    // InternalTraceryPlusPlus.g:1037:3: ruleFullCapitalizationModifier
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
                    // InternalTraceryPlusPlus.g:1042:2: ( rulePluralityModifier )
                    {
                    // InternalTraceryPlusPlus.g:1042:2: ( rulePluralityModifier )
                    // InternalTraceryPlusPlus.g:1043:3: rulePluralityModifier
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
                    // InternalTraceryPlusPlus.g:1048:2: ( ruleArticleModifier )
                    {
                    // InternalTraceryPlusPlus.g:1048:2: ( ruleArticleModifier )
                    // InternalTraceryPlusPlus.g:1049:3: ruleArticleModifier
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
                    // InternalTraceryPlusPlus.g:1054:2: ( rulePastTenseModifier )
                    {
                    // InternalTraceryPlusPlus.g:1054:2: ( rulePastTenseModifier )
                    // InternalTraceryPlusPlus.g:1055:3: rulePastTenseModifier
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


    // $ANTLR start "rule__AssignmentOperator__Alternatives"
    // InternalTraceryPlusPlus.g:1064:1: rule__AssignmentOperator__Alternatives : ( ( '=' ) | ( ':' ) | ( '-' ) | ( '-->' ) );
    public final void rule__AssignmentOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1068:1: ( ( '=' ) | ( ':' ) | ( '-' ) | ( '-->' ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt13=1;
                }
                break;
            case 28:
                {
                alt13=2;
                }
                break;
            case 29:
                {
                alt13=3;
                }
                break;
            case 30:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1069:2: ( '=' )
                    {
                    // InternalTraceryPlusPlus.g:1069:2: ( '=' )
                    // InternalTraceryPlusPlus.g:1070:3: '='
                    {
                     before(grammarAccess.getAssignmentOperatorAccess().getEqualsSignKeyword_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getAssignmentOperatorAccess().getEqualsSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1075:2: ( ':' )
                    {
                    // InternalTraceryPlusPlus.g:1075:2: ( ':' )
                    // InternalTraceryPlusPlus.g:1076:3: ':'
                    {
                     before(grammarAccess.getAssignmentOperatorAccess().getColonKeyword_1()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getAssignmentOperatorAccess().getColonKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1081:2: ( '-' )
                    {
                    // InternalTraceryPlusPlus.g:1081:2: ( '-' )
                    // InternalTraceryPlusPlus.g:1082:3: '-'
                    {
                     before(grammarAccess.getAssignmentOperatorAccess().getHyphenMinusKeyword_2()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getAssignmentOperatorAccess().getHyphenMinusKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTraceryPlusPlus.g:1087:2: ( '-->' )
                    {
                    // InternalTraceryPlusPlus.g:1087:2: ( '-->' )
                    // InternalTraceryPlusPlus.g:1088:3: '-->'
                    {
                     before(grammarAccess.getAssignmentOperatorAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_3()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getAssignmentOperatorAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_3()); 

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
    // $ANTLR end "rule__AssignmentOperator__Alternatives"


    // $ANTLR start "rule__SeparatorOr__Alternatives"
    // InternalTraceryPlusPlus.g:1097:1: rule__SeparatorOr__Alternatives : ( ( ',' ) | ( 'or' ) | ( '||' ) );
    public final void rule__SeparatorOr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1101:1: ( ( ',' ) | ( 'or' ) | ( '||' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt14=1;
                }
                break;
            case 32:
                {
                alt14=2;
                }
                break;
            case 33:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1102:2: ( ',' )
                    {
                    // InternalTraceryPlusPlus.g:1102:2: ( ',' )
                    // InternalTraceryPlusPlus.g:1103:3: ','
                    {
                     before(grammarAccess.getSeparatorOrAccess().getCommaKeyword_0()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getSeparatorOrAccess().getCommaKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1108:2: ( 'or' )
                    {
                    // InternalTraceryPlusPlus.g:1108:2: ( 'or' )
                    // InternalTraceryPlusPlus.g:1109:3: 'or'
                    {
                     before(grammarAccess.getSeparatorOrAccess().getOrKeyword_1()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getSeparatorOrAccess().getOrKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1114:2: ( '||' )
                    {
                    // InternalTraceryPlusPlus.g:1114:2: ( '||' )
                    // InternalTraceryPlusPlus.g:1115:3: '||'
                    {
                     before(grammarAccess.getSeparatorOrAccess().getVerticalLineVerticalLineKeyword_2()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getSeparatorOrAccess().getVerticalLineVerticalLineKeyword_2()); 

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
    // InternalTraceryPlusPlus.g:1124:1: rule__SeparatorAnd__Alternatives : ( ( ',' ) | ( 'and' ) | ( '&&' ) );
    public final void rule__SeparatorAnd__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1128:1: ( ( ',' ) | ( 'and' ) | ( '&&' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt15=1;
                }
                break;
            case 34:
                {
                alt15=2;
                }
                break;
            case 35:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1129:2: ( ',' )
                    {
                    // InternalTraceryPlusPlus.g:1129:2: ( ',' )
                    // InternalTraceryPlusPlus.g:1130:3: ','
                    {
                     before(grammarAccess.getSeparatorAndAccess().getCommaKeyword_0()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getSeparatorAndAccess().getCommaKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1135:2: ( 'and' )
                    {
                    // InternalTraceryPlusPlus.g:1135:2: ( 'and' )
                    // InternalTraceryPlusPlus.g:1136:3: 'and'
                    {
                     before(grammarAccess.getSeparatorAndAccess().getAndKeyword_1()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getSeparatorAndAccess().getAndKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1141:2: ( '&&' )
                    {
                    // InternalTraceryPlusPlus.g:1141:2: ( '&&' )
                    // InternalTraceryPlusPlus.g:1142:3: '&&'
                    {
                     before(grammarAccess.getSeparatorAndAccess().getAmpersandAmpersandKeyword_2()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getSeparatorAndAccess().getAmpersandAmpersandKeyword_2()); 

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


    // $ANTLR start "rule__TraceryPlusPlusProgram__Group__0"
    // InternalTraceryPlusPlus.g:1151:1: rule__TraceryPlusPlusProgram__Group__0 : rule__TraceryPlusPlusProgram__Group__0__Impl rule__TraceryPlusPlusProgram__Group__1 ;
    public final void rule__TraceryPlusPlusProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1155:1: ( rule__TraceryPlusPlusProgram__Group__0__Impl rule__TraceryPlusPlusProgram__Group__1 )
            // InternalTraceryPlusPlus.g:1156:2: rule__TraceryPlusPlusProgram__Group__0__Impl rule__TraceryPlusPlusProgram__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TraceryPlusPlusProgram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TraceryPlusPlusProgram__Group__1();

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
    // $ANTLR end "rule__TraceryPlusPlusProgram__Group__0"


    // $ANTLR start "rule__TraceryPlusPlusProgram__Group__0__Impl"
    // InternalTraceryPlusPlus.g:1163:1: rule__TraceryPlusPlusProgram__Group__0__Impl : ( ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )* ) ;
    public final void rule__TraceryPlusPlusProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1167:1: ( ( ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )* ) )
            // InternalTraceryPlusPlus.g:1168:1: ( ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )* )
            {
            // InternalTraceryPlusPlus.g:1168:1: ( ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )* )
            // InternalTraceryPlusPlus.g:1169:2: ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )*
            {
             before(grammarAccess.getTraceryPlusPlusProgramAccess().getStatementsAssignment_0()); 
            // InternalTraceryPlusPlus.g:1170:2: ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==41) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1170:3: rule__TraceryPlusPlusProgram__StatementsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__TraceryPlusPlusProgram__StatementsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getTraceryPlusPlusProgramAccess().getStatementsAssignment_0()); 

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
    // $ANTLR end "rule__TraceryPlusPlusProgram__Group__0__Impl"


    // $ANTLR start "rule__TraceryPlusPlusProgram__Group__1"
    // InternalTraceryPlusPlus.g:1178:1: rule__TraceryPlusPlusProgram__Group__1 : rule__TraceryPlusPlusProgram__Group__1__Impl ;
    public final void rule__TraceryPlusPlusProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1182:1: ( rule__TraceryPlusPlusProgram__Group__1__Impl )
            // InternalTraceryPlusPlus.g:1183:2: rule__TraceryPlusPlusProgram__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TraceryPlusPlusProgram__Group__1__Impl();

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
    // $ANTLR end "rule__TraceryPlusPlusProgram__Group__1"


    // $ANTLR start "rule__TraceryPlusPlusProgram__Group__1__Impl"
    // InternalTraceryPlusPlus.g:1189:1: rule__TraceryPlusPlusProgram__Group__1__Impl : ( ( rule__TraceryPlusPlusProgram__StoryAssignment_1 ) ) ;
    public final void rule__TraceryPlusPlusProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1193:1: ( ( ( rule__TraceryPlusPlusProgram__StoryAssignment_1 ) ) )
            // InternalTraceryPlusPlus.g:1194:1: ( ( rule__TraceryPlusPlusProgram__StoryAssignment_1 ) )
            {
            // InternalTraceryPlusPlus.g:1194:1: ( ( rule__TraceryPlusPlusProgram__StoryAssignment_1 ) )
            // InternalTraceryPlusPlus.g:1195:2: ( rule__TraceryPlusPlusProgram__StoryAssignment_1 )
            {
             before(grammarAccess.getTraceryPlusPlusProgramAccess().getStoryAssignment_1()); 
            // InternalTraceryPlusPlus.g:1196:2: ( rule__TraceryPlusPlusProgram__StoryAssignment_1 )
            // InternalTraceryPlusPlus.g:1196:3: rule__TraceryPlusPlusProgram__StoryAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TraceryPlusPlusProgram__StoryAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTraceryPlusPlusProgramAccess().getStoryAssignment_1()); 

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
    // $ANTLR end "rule__TraceryPlusPlusProgram__Group__1__Impl"


    // $ANTLR start "rule__Story__Group__0"
    // InternalTraceryPlusPlus.g:1205:1: rule__Story__Group__0 : rule__Story__Group__0__Impl rule__Story__Group__1 ;
    public final void rule__Story__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1209:1: ( rule__Story__Group__0__Impl rule__Story__Group__1 )
            // InternalTraceryPlusPlus.g:1210:2: rule__Story__Group__0__Impl rule__Story__Group__1
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
    // InternalTraceryPlusPlus.g:1217:1: rule__Story__Group__0__Impl : ( () ) ;
    public final void rule__Story__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1221:1: ( ( () ) )
            // InternalTraceryPlusPlus.g:1222:1: ( () )
            {
            // InternalTraceryPlusPlus.g:1222:1: ( () )
            // InternalTraceryPlusPlus.g:1223:2: ()
            {
             before(grammarAccess.getStoryAccess().getStoryAction_0()); 
            // InternalTraceryPlusPlus.g:1224:2: ()
            // InternalTraceryPlusPlus.g:1224:3: 
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
    // InternalTraceryPlusPlus.g:1232:1: rule__Story__Group__1 : rule__Story__Group__1__Impl rule__Story__Group__2 ;
    public final void rule__Story__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1236:1: ( rule__Story__Group__1__Impl rule__Story__Group__2 )
            // InternalTraceryPlusPlus.g:1237:2: rule__Story__Group__1__Impl rule__Story__Group__2
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
    // InternalTraceryPlusPlus.g:1244:1: rule__Story__Group__1__Impl : ( 'The' ) ;
    public final void rule__Story__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1248:1: ( ( 'The' ) )
            // InternalTraceryPlusPlus.g:1249:1: ( 'The' )
            {
            // InternalTraceryPlusPlus.g:1249:1: ( 'The' )
            // InternalTraceryPlusPlus.g:1250:2: 'The'
            {
             before(grammarAccess.getStoryAccess().getTheKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1259:1: rule__Story__Group__2 : rule__Story__Group__2__Impl rule__Story__Group__3 ;
    public final void rule__Story__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1263:1: ( rule__Story__Group__2__Impl rule__Story__Group__3 )
            // InternalTraceryPlusPlus.g:1264:2: rule__Story__Group__2__Impl rule__Story__Group__3
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
    // InternalTraceryPlusPlus.g:1271:1: rule__Story__Group__2__Impl : ( 'story' ) ;
    public final void rule__Story__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1275:1: ( ( 'story' ) )
            // InternalTraceryPlusPlus.g:1276:1: ( 'story' )
            {
            // InternalTraceryPlusPlus.g:1276:1: ( 'story' )
            // InternalTraceryPlusPlus.g:1277:2: 'story'
            {
             before(grammarAccess.getStoryAccess().getStoryKeyword_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1286:1: rule__Story__Group__3 : rule__Story__Group__3__Impl rule__Story__Group__4 ;
    public final void rule__Story__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1290:1: ( rule__Story__Group__3__Impl rule__Story__Group__4 )
            // InternalTraceryPlusPlus.g:1291:2: rule__Story__Group__3__Impl rule__Story__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Story__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Story__Group__4();

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
    // InternalTraceryPlusPlus.g:1298:1: rule__Story__Group__3__Impl : ( ( ruleAssignmentOperator )? ) ;
    public final void rule__Story__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1302:1: ( ( ( ruleAssignmentOperator )? ) )
            // InternalTraceryPlusPlus.g:1303:1: ( ( ruleAssignmentOperator )? )
            {
            // InternalTraceryPlusPlus.g:1303:1: ( ( ruleAssignmentOperator )? )
            // InternalTraceryPlusPlus.g:1304:2: ( ruleAssignmentOperator )?
            {
             before(grammarAccess.getStoryAccess().getAssignmentOperatorParserRuleCall_3()); 
            // InternalTraceryPlusPlus.g:1305:2: ( ruleAssignmentOperator )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=27 && LA17_0<=30)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1305:3: ruleAssignmentOperator
                    {
                    pushFollow(FOLLOW_2);
                    ruleAssignmentOperator();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStoryAccess().getAssignmentOperatorParserRuleCall_3()); 

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


    // $ANTLR start "rule__Story__Group__4"
    // InternalTraceryPlusPlus.g:1313:1: rule__Story__Group__4 : rule__Story__Group__4__Impl ;
    public final void rule__Story__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1317:1: ( rule__Story__Group__4__Impl )
            // InternalTraceryPlusPlus.g:1318:2: rule__Story__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Story__Group__4__Impl();

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
    // $ANTLR end "rule__Story__Group__4"


    // $ANTLR start "rule__Story__Group__4__Impl"
    // InternalTraceryPlusPlus.g:1324:1: rule__Story__Group__4__Impl : ( ( rule__Story__StoryAssignment_4 )* ) ;
    public final void rule__Story__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1328:1: ( ( ( rule__Story__StoryAssignment_4 )* ) )
            // InternalTraceryPlusPlus.g:1329:1: ( ( rule__Story__StoryAssignment_4 )* )
            {
            // InternalTraceryPlusPlus.g:1329:1: ( ( rule__Story__StoryAssignment_4 )* )
            // InternalTraceryPlusPlus.g:1330:2: ( rule__Story__StoryAssignment_4 )*
            {
             before(grammarAccess.getStoryAccess().getStoryAssignment_4()); 
            // InternalTraceryPlusPlus.g:1331:2: ( rule__Story__StoryAssignment_4 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_STRING)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1331:3: rule__Story__StoryAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Story__StoryAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getStoryAccess().getStoryAssignment_4()); 

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
    // $ANTLR end "rule__Story__Group__4__Impl"


    // $ANTLR start "rule__ListDeclaration__Group__0"
    // InternalTraceryPlusPlus.g:1340:1: rule__ListDeclaration__Group__0 : rule__ListDeclaration__Group__0__Impl rule__ListDeclaration__Group__1 ;
    public final void rule__ListDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1344:1: ( rule__ListDeclaration__Group__0__Impl rule__ListDeclaration__Group__1 )
            // InternalTraceryPlusPlus.g:1345:2: rule__ListDeclaration__Group__0__Impl rule__ListDeclaration__Group__1
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
    // InternalTraceryPlusPlus.g:1352:1: rule__ListDeclaration__Group__0__Impl : ( ( rule__ListDeclaration__NameAssignment_0 ) ) ;
    public final void rule__ListDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1356:1: ( ( ( rule__ListDeclaration__NameAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:1357:1: ( ( rule__ListDeclaration__NameAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:1357:1: ( ( rule__ListDeclaration__NameAssignment_0 ) )
            // InternalTraceryPlusPlus.g:1358:2: ( rule__ListDeclaration__NameAssignment_0 )
            {
             before(grammarAccess.getListDeclarationAccess().getNameAssignment_0()); 
            // InternalTraceryPlusPlus.g:1359:2: ( rule__ListDeclaration__NameAssignment_0 )
            // InternalTraceryPlusPlus.g:1359:3: rule__ListDeclaration__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ListDeclaration__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getListDeclarationAccess().getNameAssignment_0()); 

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
    // InternalTraceryPlusPlus.g:1367:1: rule__ListDeclaration__Group__1 : rule__ListDeclaration__Group__1__Impl rule__ListDeclaration__Group__2 ;
    public final void rule__ListDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1371:1: ( rule__ListDeclaration__Group__1__Impl rule__ListDeclaration__Group__2 )
            // InternalTraceryPlusPlus.g:1372:2: rule__ListDeclaration__Group__1__Impl rule__ListDeclaration__Group__2
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
    // InternalTraceryPlusPlus.g:1379:1: rule__ListDeclaration__Group__1__Impl : ( ( rule__ListDeclaration__Alternatives_1 ) ) ;
    public final void rule__ListDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1383:1: ( ( ( rule__ListDeclaration__Alternatives_1 ) ) )
            // InternalTraceryPlusPlus.g:1384:1: ( ( rule__ListDeclaration__Alternatives_1 ) )
            {
            // InternalTraceryPlusPlus.g:1384:1: ( ( rule__ListDeclaration__Alternatives_1 ) )
            // InternalTraceryPlusPlus.g:1385:2: ( rule__ListDeclaration__Alternatives_1 )
            {
             before(grammarAccess.getListDeclarationAccess().getAlternatives_1()); 
            // InternalTraceryPlusPlus.g:1386:2: ( rule__ListDeclaration__Alternatives_1 )
            // InternalTraceryPlusPlus.g:1386:3: rule__ListDeclaration__Alternatives_1
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
    // InternalTraceryPlusPlus.g:1394:1: rule__ListDeclaration__Group__2 : rule__ListDeclaration__Group__2__Impl rule__ListDeclaration__Group__3 ;
    public final void rule__ListDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1398:1: ( rule__ListDeclaration__Group__2__Impl rule__ListDeclaration__Group__3 )
            // InternalTraceryPlusPlus.g:1399:2: rule__ListDeclaration__Group__2__Impl rule__ListDeclaration__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ListDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListDeclaration__Group__3();

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
    // InternalTraceryPlusPlus.g:1406:1: rule__ListDeclaration__Group__2__Impl : ( ( ruleAssignmentOperator )? ) ;
    public final void rule__ListDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1410:1: ( ( ( ruleAssignmentOperator )? ) )
            // InternalTraceryPlusPlus.g:1411:1: ( ( ruleAssignmentOperator )? )
            {
            // InternalTraceryPlusPlus.g:1411:1: ( ( ruleAssignmentOperator )? )
            // InternalTraceryPlusPlus.g:1412:2: ( ruleAssignmentOperator )?
            {
             before(grammarAccess.getListDeclarationAccess().getAssignmentOperatorParserRuleCall_2()); 
            // InternalTraceryPlusPlus.g:1413:2: ( ruleAssignmentOperator )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=27 && LA19_0<=30)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1413:3: ruleAssignmentOperator
                    {
                    pushFollow(FOLLOW_2);
                    ruleAssignmentOperator();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getListDeclarationAccess().getAssignmentOperatorParserRuleCall_2()); 

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


    // $ANTLR start "rule__ListDeclaration__Group__3"
    // InternalTraceryPlusPlus.g:1421:1: rule__ListDeclaration__Group__3 : rule__ListDeclaration__Group__3__Impl ;
    public final void rule__ListDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1425:1: ( rule__ListDeclaration__Group__3__Impl )
            // InternalTraceryPlusPlus.g:1426:2: rule__ListDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListDeclaration__Group__3__Impl();

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
    // $ANTLR end "rule__ListDeclaration__Group__3"


    // $ANTLR start "rule__ListDeclaration__Group__3__Impl"
    // InternalTraceryPlusPlus.g:1432:1: rule__ListDeclaration__Group__3__Impl : ( ( rule__ListDeclaration__ListAssignment_3 ) ) ;
    public final void rule__ListDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1436:1: ( ( ( rule__ListDeclaration__ListAssignment_3 ) ) )
            // InternalTraceryPlusPlus.g:1437:1: ( ( rule__ListDeclaration__ListAssignment_3 ) )
            {
            // InternalTraceryPlusPlus.g:1437:1: ( ( rule__ListDeclaration__ListAssignment_3 ) )
            // InternalTraceryPlusPlus.g:1438:2: ( rule__ListDeclaration__ListAssignment_3 )
            {
             before(grammarAccess.getListDeclarationAccess().getListAssignment_3()); 
            // InternalTraceryPlusPlus.g:1439:2: ( rule__ListDeclaration__ListAssignment_3 )
            // InternalTraceryPlusPlus.g:1439:3: rule__ListDeclaration__ListAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ListDeclaration__ListAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getListDeclarationAccess().getListAssignment_3()); 

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
    // $ANTLR end "rule__ListDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ListDeclaration__Group_1_0__0"
    // InternalTraceryPlusPlus.g:1448:1: rule__ListDeclaration__Group_1_0__0 : rule__ListDeclaration__Group_1_0__0__Impl rule__ListDeclaration__Group_1_0__1 ;
    public final void rule__ListDeclaration__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1452:1: ( rule__ListDeclaration__Group_1_0__0__Impl rule__ListDeclaration__Group_1_0__1 )
            // InternalTraceryPlusPlus.g:1453:2: rule__ListDeclaration__Group_1_0__0__Impl rule__ListDeclaration__Group_1_0__1
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
    // InternalTraceryPlusPlus.g:1460:1: rule__ListDeclaration__Group_1_0__0__Impl : ( 'can' ) ;
    public final void rule__ListDeclaration__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1464:1: ( ( 'can' ) )
            // InternalTraceryPlusPlus.g:1465:1: ( 'can' )
            {
            // InternalTraceryPlusPlus.g:1465:1: ( 'can' )
            // InternalTraceryPlusPlus.g:1466:2: 'can'
            {
             before(grammarAccess.getListDeclarationAccess().getCanKeyword_1_0_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1475:1: rule__ListDeclaration__Group_1_0__1 : rule__ListDeclaration__Group_1_0__1__Impl rule__ListDeclaration__Group_1_0__2 ;
    public final void rule__ListDeclaration__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1479:1: ( rule__ListDeclaration__Group_1_0__1__Impl rule__ListDeclaration__Group_1_0__2 )
            // InternalTraceryPlusPlus.g:1480:2: rule__ListDeclaration__Group_1_0__1__Impl rule__ListDeclaration__Group_1_0__2
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
    // InternalTraceryPlusPlus.g:1487:1: rule__ListDeclaration__Group_1_0__1__Impl : ( 'have' ) ;
    public final void rule__ListDeclaration__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1491:1: ( ( 'have' ) )
            // InternalTraceryPlusPlus.g:1492:1: ( 'have' )
            {
            // InternalTraceryPlusPlus.g:1492:1: ( 'have' )
            // InternalTraceryPlusPlus.g:1493:2: 'have'
            {
             before(grammarAccess.getListDeclarationAccess().getHaveKeyword_1_0_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1502:1: rule__ListDeclaration__Group_1_0__2 : rule__ListDeclaration__Group_1_0__2__Impl ;
    public final void rule__ListDeclaration__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1506:1: ( rule__ListDeclaration__Group_1_0__2__Impl )
            // InternalTraceryPlusPlus.g:1507:2: rule__ListDeclaration__Group_1_0__2__Impl
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
    // InternalTraceryPlusPlus.g:1513:1: rule__ListDeclaration__Group_1_0__2__Impl : ( 'values' ) ;
    public final void rule__ListDeclaration__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1517:1: ( ( 'values' ) )
            // InternalTraceryPlusPlus.g:1518:1: ( 'values' )
            {
            // InternalTraceryPlusPlus.g:1518:1: ( 'values' )
            // InternalTraceryPlusPlus.g:1519:2: 'values'
            {
             before(grammarAccess.getListDeclarationAccess().getValuesKeyword_1_0_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1529:1: rule__ListDeclaration__Group_1_1__0 : rule__ListDeclaration__Group_1_1__0__Impl rule__ListDeclaration__Group_1_1__1 ;
    public final void rule__ListDeclaration__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1533:1: ( rule__ListDeclaration__Group_1_1__0__Impl rule__ListDeclaration__Group_1_1__1 )
            // InternalTraceryPlusPlus.g:1534:2: rule__ListDeclaration__Group_1_1__0__Impl rule__ListDeclaration__Group_1_1__1
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
    // InternalTraceryPlusPlus.g:1541:1: rule__ListDeclaration__Group_1_1__0__Impl : ( 'can' ) ;
    public final void rule__ListDeclaration__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1545:1: ( ( 'can' ) )
            // InternalTraceryPlusPlus.g:1546:1: ( 'can' )
            {
            // InternalTraceryPlusPlus.g:1546:1: ( 'can' )
            // InternalTraceryPlusPlus.g:1547:2: 'can'
            {
             before(grammarAccess.getListDeclarationAccess().getCanKeyword_1_1_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1556:1: rule__ListDeclaration__Group_1_1__1 : rule__ListDeclaration__Group_1_1__1__Impl ;
    public final void rule__ListDeclaration__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1560:1: ( rule__ListDeclaration__Group_1_1__1__Impl )
            // InternalTraceryPlusPlus.g:1561:2: rule__ListDeclaration__Group_1_1__1__Impl
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
    // InternalTraceryPlusPlus.g:1567:1: rule__ListDeclaration__Group_1_1__1__Impl : ( 'be' ) ;
    public final void rule__ListDeclaration__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1571:1: ( ( 'be' ) )
            // InternalTraceryPlusPlus.g:1572:1: ( 'be' )
            {
            // InternalTraceryPlusPlus.g:1572:1: ( 'be' )
            // InternalTraceryPlusPlus.g:1573:2: 'be'
            {
             before(grammarAccess.getListDeclarationAccess().getBeKeyword_1_1_1()); 
            match(input,40,FOLLOW_2); 
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


    // $ANTLR start "rule__ListDeclaration__Group_1_2__0"
    // InternalTraceryPlusPlus.g:1583:1: rule__ListDeclaration__Group_1_2__0 : rule__ListDeclaration__Group_1_2__0__Impl rule__ListDeclaration__Group_1_2__1 ;
    public final void rule__ListDeclaration__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1587:1: ( rule__ListDeclaration__Group_1_2__0__Impl rule__ListDeclaration__Group_1_2__1 )
            // InternalTraceryPlusPlus.g:1588:2: rule__ListDeclaration__Group_1_2__0__Impl rule__ListDeclaration__Group_1_2__1
            {
            pushFollow(FOLLOW_11);
            rule__ListDeclaration__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListDeclaration__Group_1_2__1();

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
    // $ANTLR end "rule__ListDeclaration__Group_1_2__0"


    // $ANTLR start "rule__ListDeclaration__Group_1_2__0__Impl"
    // InternalTraceryPlusPlus.g:1595:1: rule__ListDeclaration__Group_1_2__0__Impl : ( 'has' ) ;
    public final void rule__ListDeclaration__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1599:1: ( ( 'has' ) )
            // InternalTraceryPlusPlus.g:1600:1: ( 'has' )
            {
            // InternalTraceryPlusPlus.g:1600:1: ( 'has' )
            // InternalTraceryPlusPlus.g:1601:2: 'has'
            {
             before(grammarAccess.getListDeclarationAccess().getHasKeyword_1_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getListDeclarationAccess().getHasKeyword_1_2_0()); 

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
    // $ANTLR end "rule__ListDeclaration__Group_1_2__0__Impl"


    // $ANTLR start "rule__ListDeclaration__Group_1_2__1"
    // InternalTraceryPlusPlus.g:1610:1: rule__ListDeclaration__Group_1_2__1 : rule__ListDeclaration__Group_1_2__1__Impl ;
    public final void rule__ListDeclaration__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1614:1: ( rule__ListDeclaration__Group_1_2__1__Impl )
            // InternalTraceryPlusPlus.g:1615:2: rule__ListDeclaration__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListDeclaration__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__ListDeclaration__Group_1_2__1"


    // $ANTLR start "rule__ListDeclaration__Group_1_2__1__Impl"
    // InternalTraceryPlusPlus.g:1621:1: rule__ListDeclaration__Group_1_2__1__Impl : ( 'values' ) ;
    public final void rule__ListDeclaration__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1625:1: ( ( 'values' ) )
            // InternalTraceryPlusPlus.g:1626:1: ( 'values' )
            {
            // InternalTraceryPlusPlus.g:1626:1: ( 'values' )
            // InternalTraceryPlusPlus.g:1627:2: 'values'
            {
             before(grammarAccess.getListDeclarationAccess().getValuesKeyword_1_2_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getListDeclarationAccess().getValuesKeyword_1_2_1()); 

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
    // $ANTLR end "rule__ListDeclaration__Group_1_2__1__Impl"


    // $ANTLR start "rule__ObjectDeclaration__Group__0"
    // InternalTraceryPlusPlus.g:1637:1: rule__ObjectDeclaration__Group__0 : rule__ObjectDeclaration__Group__0__Impl rule__ObjectDeclaration__Group__1 ;
    public final void rule__ObjectDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1641:1: ( rule__ObjectDeclaration__Group__0__Impl rule__ObjectDeclaration__Group__1 )
            // InternalTraceryPlusPlus.g:1642:2: rule__ObjectDeclaration__Group__0__Impl rule__ObjectDeclaration__Group__1
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
    // InternalTraceryPlusPlus.g:1649:1: rule__ObjectDeclaration__Group__0__Impl : ( 'There' ) ;
    public final void rule__ObjectDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1653:1: ( ( 'There' ) )
            // InternalTraceryPlusPlus.g:1654:1: ( 'There' )
            {
            // InternalTraceryPlusPlus.g:1654:1: ( 'There' )
            // InternalTraceryPlusPlus.g:1655:2: 'There'
            {
             before(grammarAccess.getObjectDeclarationAccess().getThereKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getObjectDeclarationAccess().getThereKeyword_0()); 

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
    // InternalTraceryPlusPlus.g:1664:1: rule__ObjectDeclaration__Group__1 : rule__ObjectDeclaration__Group__1__Impl rule__ObjectDeclaration__Group__2 ;
    public final void rule__ObjectDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1668:1: ( rule__ObjectDeclaration__Group__1__Impl rule__ObjectDeclaration__Group__2 )
            // InternalTraceryPlusPlus.g:1669:2: rule__ObjectDeclaration__Group__1__Impl rule__ObjectDeclaration__Group__2
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
    // InternalTraceryPlusPlus.g:1676:1: rule__ObjectDeclaration__Group__1__Impl : ( ( rule__ObjectDeclaration__Alternatives_1 ) ) ;
    public final void rule__ObjectDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1680:1: ( ( ( rule__ObjectDeclaration__Alternatives_1 ) ) )
            // InternalTraceryPlusPlus.g:1681:1: ( ( rule__ObjectDeclaration__Alternatives_1 ) )
            {
            // InternalTraceryPlusPlus.g:1681:1: ( ( rule__ObjectDeclaration__Alternatives_1 ) )
            // InternalTraceryPlusPlus.g:1682:2: ( rule__ObjectDeclaration__Alternatives_1 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getAlternatives_1()); 
            // InternalTraceryPlusPlus.g:1683:2: ( rule__ObjectDeclaration__Alternatives_1 )
            // InternalTraceryPlusPlus.g:1683:3: rule__ObjectDeclaration__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjectDeclaration__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectDeclarationAccess().getAlternatives_1()); 

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
    // InternalTraceryPlusPlus.g:1691:1: rule__ObjectDeclaration__Group__2 : rule__ObjectDeclaration__Group__2__Impl rule__ObjectDeclaration__Group__3 ;
    public final void rule__ObjectDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1695:1: ( rule__ObjectDeclaration__Group__2__Impl rule__ObjectDeclaration__Group__3 )
            // InternalTraceryPlusPlus.g:1696:2: rule__ObjectDeclaration__Group__2__Impl rule__ObjectDeclaration__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalTraceryPlusPlus.g:1703:1: rule__ObjectDeclaration__Group__2__Impl : ( ( rule__ObjectDeclaration__Alternatives_2 )? ) ;
    public final void rule__ObjectDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1707:1: ( ( ( rule__ObjectDeclaration__Alternatives_2 )? ) )
            // InternalTraceryPlusPlus.g:1708:1: ( ( rule__ObjectDeclaration__Alternatives_2 )? )
            {
            // InternalTraceryPlusPlus.g:1708:1: ( ( rule__ObjectDeclaration__Alternatives_2 )? )
            // InternalTraceryPlusPlus.g:1709:2: ( rule__ObjectDeclaration__Alternatives_2 )?
            {
             before(grammarAccess.getObjectDeclarationAccess().getAlternatives_2()); 
            // InternalTraceryPlusPlus.g:1710:2: ( rule__ObjectDeclaration__Alternatives_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=18 && LA20_0<=19)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1710:3: rule__ObjectDeclaration__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjectDeclaration__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectDeclarationAccess().getAlternatives_2()); 

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
    // InternalTraceryPlusPlus.g:1718:1: rule__ObjectDeclaration__Group__3 : rule__ObjectDeclaration__Group__3__Impl rule__ObjectDeclaration__Group__4 ;
    public final void rule__ObjectDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1722:1: ( rule__ObjectDeclaration__Group__3__Impl rule__ObjectDeclaration__Group__4 )
            // InternalTraceryPlusPlus.g:1723:2: rule__ObjectDeclaration__Group__3__Impl rule__ObjectDeclaration__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalTraceryPlusPlus.g:1730:1: rule__ObjectDeclaration__Group__3__Impl : ( ( rule__ObjectDeclaration__NameAssignment_3 ) ) ;
    public final void rule__ObjectDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1734:1: ( ( ( rule__ObjectDeclaration__NameAssignment_3 ) ) )
            // InternalTraceryPlusPlus.g:1735:1: ( ( rule__ObjectDeclaration__NameAssignment_3 ) )
            {
            // InternalTraceryPlusPlus.g:1735:1: ( ( rule__ObjectDeclaration__NameAssignment_3 ) )
            // InternalTraceryPlusPlus.g:1736:2: ( rule__ObjectDeclaration__NameAssignment_3 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getNameAssignment_3()); 
            // InternalTraceryPlusPlus.g:1737:2: ( rule__ObjectDeclaration__NameAssignment_3 )
            // InternalTraceryPlusPlus.g:1737:3: rule__ObjectDeclaration__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ObjectDeclaration__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getObjectDeclarationAccess().getNameAssignment_3()); 

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
    // InternalTraceryPlusPlus.g:1745:1: rule__ObjectDeclaration__Group__4 : rule__ObjectDeclaration__Group__4__Impl rule__ObjectDeclaration__Group__5 ;
    public final void rule__ObjectDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1749:1: ( rule__ObjectDeclaration__Group__4__Impl rule__ObjectDeclaration__Group__5 )
            // InternalTraceryPlusPlus.g:1750:2: rule__ObjectDeclaration__Group__4__Impl rule__ObjectDeclaration__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalTraceryPlusPlus.g:1757:1: rule__ObjectDeclaration__Group__4__Impl : ( ( rule__ObjectDeclaration__PronounsAssignment_4 ) ) ;
    public final void rule__ObjectDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1761:1: ( ( ( rule__ObjectDeclaration__PronounsAssignment_4 ) ) )
            // InternalTraceryPlusPlus.g:1762:1: ( ( rule__ObjectDeclaration__PronounsAssignment_4 ) )
            {
            // InternalTraceryPlusPlus.g:1762:1: ( ( rule__ObjectDeclaration__PronounsAssignment_4 ) )
            // InternalTraceryPlusPlus.g:1763:2: ( rule__ObjectDeclaration__PronounsAssignment_4 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getPronounsAssignment_4()); 
            // InternalTraceryPlusPlus.g:1764:2: ( rule__ObjectDeclaration__PronounsAssignment_4 )
            // InternalTraceryPlusPlus.g:1764:3: rule__ObjectDeclaration__PronounsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ObjectDeclaration__PronounsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getObjectDeclarationAccess().getPronounsAssignment_4()); 

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
    // InternalTraceryPlusPlus.g:1772:1: rule__ObjectDeclaration__Group__5 : rule__ObjectDeclaration__Group__5__Impl rule__ObjectDeclaration__Group__6 ;
    public final void rule__ObjectDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1776:1: ( rule__ObjectDeclaration__Group__5__Impl rule__ObjectDeclaration__Group__6 )
            // InternalTraceryPlusPlus.g:1777:2: rule__ObjectDeclaration__Group__5__Impl rule__ObjectDeclaration__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalTraceryPlusPlus.g:1784:1: rule__ObjectDeclaration__Group__5__Impl : ( ( rule__ObjectDeclaration__Alternatives_5 ) ) ;
    public final void rule__ObjectDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1788:1: ( ( ( rule__ObjectDeclaration__Alternatives_5 ) ) )
            // InternalTraceryPlusPlus.g:1789:1: ( ( rule__ObjectDeclaration__Alternatives_5 ) )
            {
            // InternalTraceryPlusPlus.g:1789:1: ( ( rule__ObjectDeclaration__Alternatives_5 ) )
            // InternalTraceryPlusPlus.g:1790:2: ( rule__ObjectDeclaration__Alternatives_5 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getAlternatives_5()); 
            // InternalTraceryPlusPlus.g:1791:2: ( rule__ObjectDeclaration__Alternatives_5 )
            // InternalTraceryPlusPlus.g:1791:3: rule__ObjectDeclaration__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__ObjectDeclaration__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getObjectDeclarationAccess().getAlternatives_5()); 

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
    // InternalTraceryPlusPlus.g:1799:1: rule__ObjectDeclaration__Group__6 : rule__ObjectDeclaration__Group__6__Impl rule__ObjectDeclaration__Group__7 ;
    public final void rule__ObjectDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1803:1: ( rule__ObjectDeclaration__Group__6__Impl rule__ObjectDeclaration__Group__7 )
            // InternalTraceryPlusPlus.g:1804:2: rule__ObjectDeclaration__Group__6__Impl rule__ObjectDeclaration__Group__7
            {
            pushFollow(FOLLOW_17);
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
    // InternalTraceryPlusPlus.g:1811:1: rule__ObjectDeclaration__Group__6__Impl : ( ( 'attributes' )? ) ;
    public final void rule__ObjectDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1815:1: ( ( ( 'attributes' )? ) )
            // InternalTraceryPlusPlus.g:1816:1: ( ( 'attributes' )? )
            {
            // InternalTraceryPlusPlus.g:1816:1: ( ( 'attributes' )? )
            // InternalTraceryPlusPlus.g:1817:2: ( 'attributes' )?
            {
             before(grammarAccess.getObjectDeclarationAccess().getAttributesKeyword_6()); 
            // InternalTraceryPlusPlus.g:1818:2: ( 'attributes' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==42) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1818:3: 'attributes'
                    {
                    match(input,42,FOLLOW_2); 

                    }
                    break;

            }

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
    // InternalTraceryPlusPlus.g:1826:1: rule__ObjectDeclaration__Group__7 : rule__ObjectDeclaration__Group__7__Impl rule__ObjectDeclaration__Group__8 ;
    public final void rule__ObjectDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1830:1: ( rule__ObjectDeclaration__Group__7__Impl rule__ObjectDeclaration__Group__8 )
            // InternalTraceryPlusPlus.g:1831:2: rule__ObjectDeclaration__Group__7__Impl rule__ObjectDeclaration__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__ObjectDeclaration__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectDeclaration__Group__8();

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
    // InternalTraceryPlusPlus.g:1838:1: rule__ObjectDeclaration__Group__7__Impl : ( ( ruleAssignmentOperator )? ) ;
    public final void rule__ObjectDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1842:1: ( ( ( ruleAssignmentOperator )? ) )
            // InternalTraceryPlusPlus.g:1843:1: ( ( ruleAssignmentOperator )? )
            {
            // InternalTraceryPlusPlus.g:1843:1: ( ( ruleAssignmentOperator )? )
            // InternalTraceryPlusPlus.g:1844:2: ( ruleAssignmentOperator )?
            {
             before(grammarAccess.getObjectDeclarationAccess().getAssignmentOperatorParserRuleCall_7()); 
            // InternalTraceryPlusPlus.g:1845:2: ( ruleAssignmentOperator )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=27 && LA22_0<=30)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1845:3: ruleAssignmentOperator
                    {
                    pushFollow(FOLLOW_2);
                    ruleAssignmentOperator();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectDeclarationAccess().getAssignmentOperatorParserRuleCall_7()); 

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


    // $ANTLR start "rule__ObjectDeclaration__Group__8"
    // InternalTraceryPlusPlus.g:1853:1: rule__ObjectDeclaration__Group__8 : rule__ObjectDeclaration__Group__8__Impl ;
    public final void rule__ObjectDeclaration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1857:1: ( rule__ObjectDeclaration__Group__8__Impl )
            // InternalTraceryPlusPlus.g:1858:2: rule__ObjectDeclaration__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectDeclaration__Group__8__Impl();

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
    // $ANTLR end "rule__ObjectDeclaration__Group__8"


    // $ANTLR start "rule__ObjectDeclaration__Group__8__Impl"
    // InternalTraceryPlusPlus.g:1864:1: rule__ObjectDeclaration__Group__8__Impl : ( ( rule__ObjectDeclaration__AttributesAssignment_8 ) ) ;
    public final void rule__ObjectDeclaration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1868:1: ( ( ( rule__ObjectDeclaration__AttributesAssignment_8 ) ) )
            // InternalTraceryPlusPlus.g:1869:1: ( ( rule__ObjectDeclaration__AttributesAssignment_8 ) )
            {
            // InternalTraceryPlusPlus.g:1869:1: ( ( rule__ObjectDeclaration__AttributesAssignment_8 ) )
            // InternalTraceryPlusPlus.g:1870:2: ( rule__ObjectDeclaration__AttributesAssignment_8 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getAttributesAssignment_8()); 
            // InternalTraceryPlusPlus.g:1871:2: ( rule__ObjectDeclaration__AttributesAssignment_8 )
            // InternalTraceryPlusPlus.g:1871:3: rule__ObjectDeclaration__AttributesAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ObjectDeclaration__AttributesAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getObjectDeclarationAccess().getAttributesAssignment_8()); 

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
    // $ANTLR end "rule__ObjectDeclaration__Group__8__Impl"


    // $ANTLR start "rule__StoryVariable__Group__0"
    // InternalTraceryPlusPlus.g:1880:1: rule__StoryVariable__Group__0 : rule__StoryVariable__Group__0__Impl rule__StoryVariable__Group__1 ;
    public final void rule__StoryVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1884:1: ( rule__StoryVariable__Group__0__Impl rule__StoryVariable__Group__1 )
            // InternalTraceryPlusPlus.g:1885:2: rule__StoryVariable__Group__0__Impl rule__StoryVariable__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalTraceryPlusPlus.g:1892:1: rule__StoryVariable__Group__0__Impl : ( ( rule__StoryVariable__VariableAssignment_0 ) ) ;
    public final void rule__StoryVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1896:1: ( ( ( rule__StoryVariable__VariableAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:1897:1: ( ( rule__StoryVariable__VariableAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:1897:1: ( ( rule__StoryVariable__VariableAssignment_0 ) )
            // InternalTraceryPlusPlus.g:1898:2: ( rule__StoryVariable__VariableAssignment_0 )
            {
             before(grammarAccess.getStoryVariableAccess().getVariableAssignment_0()); 
            // InternalTraceryPlusPlus.g:1899:2: ( rule__StoryVariable__VariableAssignment_0 )
            // InternalTraceryPlusPlus.g:1899:3: rule__StoryVariable__VariableAssignment_0
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
    // InternalTraceryPlusPlus.g:1907:1: rule__StoryVariable__Group__1 : rule__StoryVariable__Group__1__Impl ;
    public final void rule__StoryVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1911:1: ( rule__StoryVariable__Group__1__Impl )
            // InternalTraceryPlusPlus.g:1912:2: rule__StoryVariable__Group__1__Impl
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
    // InternalTraceryPlusPlus.g:1918:1: rule__StoryVariable__Group__1__Impl : ( ( rule__StoryVariable__ModifiersAssignment_1 )* ) ;
    public final void rule__StoryVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1922:1: ( ( ( rule__StoryVariable__ModifiersAssignment_1 )* ) )
            // InternalTraceryPlusPlus.g:1923:1: ( ( rule__StoryVariable__ModifiersAssignment_1 )* )
            {
            // InternalTraceryPlusPlus.g:1923:1: ( ( rule__StoryVariable__ModifiersAssignment_1 )* )
            // InternalTraceryPlusPlus.g:1924:2: ( rule__StoryVariable__ModifiersAssignment_1 )*
            {
             before(grammarAccess.getStoryVariableAccess().getModifiersAssignment_1()); 
            // InternalTraceryPlusPlus.g:1925:2: ( rule__StoryVariable__ModifiersAssignment_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=11 && LA23_0<=15)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1925:3: rule__StoryVariable__ModifiersAssignment_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__StoryVariable__ModifiersAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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


    // $ANTLR start "rule__NameExistingListAttribute__Group__0"
    // InternalTraceryPlusPlus.g:1934:1: rule__NameExistingListAttribute__Group__0 : rule__NameExistingListAttribute__Group__0__Impl rule__NameExistingListAttribute__Group__1 ;
    public final void rule__NameExistingListAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1938:1: ( rule__NameExistingListAttribute__Group__0__Impl rule__NameExistingListAttribute__Group__1 )
            // InternalTraceryPlusPlus.g:1939:2: rule__NameExistingListAttribute__Group__0__Impl rule__NameExistingListAttribute__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__NameExistingListAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameExistingListAttribute__Group__1();

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
    // $ANTLR end "rule__NameExistingListAttribute__Group__0"


    // $ANTLR start "rule__NameExistingListAttribute__Group__0__Impl"
    // InternalTraceryPlusPlus.g:1946:1: rule__NameExistingListAttribute__Group__0__Impl : ( ( rule__NameExistingListAttribute__NameAssignment_0 ) ) ;
    public final void rule__NameExistingListAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1950:1: ( ( ( rule__NameExistingListAttribute__NameAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:1951:1: ( ( rule__NameExistingListAttribute__NameAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:1951:1: ( ( rule__NameExistingListAttribute__NameAssignment_0 ) )
            // InternalTraceryPlusPlus.g:1952:2: ( rule__NameExistingListAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getNameExistingListAttributeAccess().getNameAssignment_0()); 
            // InternalTraceryPlusPlus.g:1953:2: ( rule__NameExistingListAttribute__NameAssignment_0 )
            // InternalTraceryPlusPlus.g:1953:3: rule__NameExistingListAttribute__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NameExistingListAttribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNameExistingListAttributeAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__NameExistingListAttribute__Group__0__Impl"


    // $ANTLR start "rule__NameExistingListAttribute__Group__1"
    // InternalTraceryPlusPlus.g:1961:1: rule__NameExistingListAttribute__Group__1 : rule__NameExistingListAttribute__Group__1__Impl rule__NameExistingListAttribute__Group__2 ;
    public final void rule__NameExistingListAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1965:1: ( rule__NameExistingListAttribute__Group__1__Impl rule__NameExistingListAttribute__Group__2 )
            // InternalTraceryPlusPlus.g:1966:2: rule__NameExistingListAttribute__Group__1__Impl rule__NameExistingListAttribute__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__NameExistingListAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameExistingListAttribute__Group__2();

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
    // $ANTLR end "rule__NameExistingListAttribute__Group__1"


    // $ANTLR start "rule__NameExistingListAttribute__Group__1__Impl"
    // InternalTraceryPlusPlus.g:1973:1: rule__NameExistingListAttribute__Group__1__Impl : ( ( rule__NameExistingListAttribute__Alternatives_1 )? ) ;
    public final void rule__NameExistingListAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1977:1: ( ( ( rule__NameExistingListAttribute__Alternatives_1 )? ) )
            // InternalTraceryPlusPlus.g:1978:1: ( ( rule__NameExistingListAttribute__Alternatives_1 )? )
            {
            // InternalTraceryPlusPlus.g:1978:1: ( ( rule__NameExistingListAttribute__Alternatives_1 )? )
            // InternalTraceryPlusPlus.g:1979:2: ( rule__NameExistingListAttribute__Alternatives_1 )?
            {
             before(grammarAccess.getNameExistingListAttributeAccess().getAlternatives_1()); 
            // InternalTraceryPlusPlus.g:1980:2: ( rule__NameExistingListAttribute__Alternatives_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==22||(LA24_0>=27 && LA24_0<=30)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1980:3: rule__NameExistingListAttribute__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NameExistingListAttribute__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNameExistingListAttributeAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__NameExistingListAttribute__Group__1__Impl"


    // $ANTLR start "rule__NameExistingListAttribute__Group__2"
    // InternalTraceryPlusPlus.g:1988:1: rule__NameExistingListAttribute__Group__2 : rule__NameExistingListAttribute__Group__2__Impl ;
    public final void rule__NameExistingListAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1992:1: ( rule__NameExistingListAttribute__Group__2__Impl )
            // InternalTraceryPlusPlus.g:1993:2: rule__NameExistingListAttribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NameExistingListAttribute__Group__2__Impl();

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
    // $ANTLR end "rule__NameExistingListAttribute__Group__2"


    // $ANTLR start "rule__NameExistingListAttribute__Group__2__Impl"
    // InternalTraceryPlusPlus.g:1999:1: rule__NameExistingListAttribute__Group__2__Impl : ( ( rule__NameExistingListAttribute__ValueAssignment_2 ) ) ;
    public final void rule__NameExistingListAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2003:1: ( ( ( rule__NameExistingListAttribute__ValueAssignment_2 ) ) )
            // InternalTraceryPlusPlus.g:2004:1: ( ( rule__NameExistingListAttribute__ValueAssignment_2 ) )
            {
            // InternalTraceryPlusPlus.g:2004:1: ( ( rule__NameExistingListAttribute__ValueAssignment_2 ) )
            // InternalTraceryPlusPlus.g:2005:2: ( rule__NameExistingListAttribute__ValueAssignment_2 )
            {
             before(grammarAccess.getNameExistingListAttributeAccess().getValueAssignment_2()); 
            // InternalTraceryPlusPlus.g:2006:2: ( rule__NameExistingListAttribute__ValueAssignment_2 )
            // InternalTraceryPlusPlus.g:2006:3: rule__NameExistingListAttribute__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NameExistingListAttribute__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNameExistingListAttributeAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__NameExistingListAttribute__Group__2__Impl"


    // $ANTLR start "rule__NameValueAttribute__Group__0"
    // InternalTraceryPlusPlus.g:2015:1: rule__NameValueAttribute__Group__0 : rule__NameValueAttribute__Group__0__Impl rule__NameValueAttribute__Group__1 ;
    public final void rule__NameValueAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2019:1: ( rule__NameValueAttribute__Group__0__Impl rule__NameValueAttribute__Group__1 )
            // InternalTraceryPlusPlus.g:2020:2: rule__NameValueAttribute__Group__0__Impl rule__NameValueAttribute__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__NameValueAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameValueAttribute__Group__1();

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
    // $ANTLR end "rule__NameValueAttribute__Group__0"


    // $ANTLR start "rule__NameValueAttribute__Group__0__Impl"
    // InternalTraceryPlusPlus.g:2027:1: rule__NameValueAttribute__Group__0__Impl : ( ( rule__NameValueAttribute__NameAssignment_0 ) ) ;
    public final void rule__NameValueAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2031:1: ( ( ( rule__NameValueAttribute__NameAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:2032:1: ( ( rule__NameValueAttribute__NameAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:2032:1: ( ( rule__NameValueAttribute__NameAssignment_0 ) )
            // InternalTraceryPlusPlus.g:2033:2: ( rule__NameValueAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getNameValueAttributeAccess().getNameAssignment_0()); 
            // InternalTraceryPlusPlus.g:2034:2: ( rule__NameValueAttribute__NameAssignment_0 )
            // InternalTraceryPlusPlus.g:2034:3: rule__NameValueAttribute__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NameValueAttribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNameValueAttributeAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__NameValueAttribute__Group__0__Impl"


    // $ANTLR start "rule__NameValueAttribute__Group__1"
    // InternalTraceryPlusPlus.g:2042:1: rule__NameValueAttribute__Group__1 : rule__NameValueAttribute__Group__1__Impl rule__NameValueAttribute__Group__2 ;
    public final void rule__NameValueAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2046:1: ( rule__NameValueAttribute__Group__1__Impl rule__NameValueAttribute__Group__2 )
            // InternalTraceryPlusPlus.g:2047:2: rule__NameValueAttribute__Group__1__Impl rule__NameValueAttribute__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__NameValueAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameValueAttribute__Group__2();

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
    // $ANTLR end "rule__NameValueAttribute__Group__1"


    // $ANTLR start "rule__NameValueAttribute__Group__1__Impl"
    // InternalTraceryPlusPlus.g:2054:1: rule__NameValueAttribute__Group__1__Impl : ( ( ruleAssignmentOperator )? ) ;
    public final void rule__NameValueAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2058:1: ( ( ( ruleAssignmentOperator )? ) )
            // InternalTraceryPlusPlus.g:2059:1: ( ( ruleAssignmentOperator )? )
            {
            // InternalTraceryPlusPlus.g:2059:1: ( ( ruleAssignmentOperator )? )
            // InternalTraceryPlusPlus.g:2060:2: ( ruleAssignmentOperator )?
            {
             before(grammarAccess.getNameValueAttributeAccess().getAssignmentOperatorParserRuleCall_1()); 
            // InternalTraceryPlusPlus.g:2061:2: ( ruleAssignmentOperator )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=27 && LA25_0<=30)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTraceryPlusPlus.g:2061:3: ruleAssignmentOperator
                    {
                    pushFollow(FOLLOW_2);
                    ruleAssignmentOperator();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNameValueAttributeAccess().getAssignmentOperatorParserRuleCall_1()); 

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
    // $ANTLR end "rule__NameValueAttribute__Group__1__Impl"


    // $ANTLR start "rule__NameValueAttribute__Group__2"
    // InternalTraceryPlusPlus.g:2069:1: rule__NameValueAttribute__Group__2 : rule__NameValueAttribute__Group__2__Impl ;
    public final void rule__NameValueAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2073:1: ( rule__NameValueAttribute__Group__2__Impl )
            // InternalTraceryPlusPlus.g:2074:2: rule__NameValueAttribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NameValueAttribute__Group__2__Impl();

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
    // $ANTLR end "rule__NameValueAttribute__Group__2"


    // $ANTLR start "rule__NameValueAttribute__Group__2__Impl"
    // InternalTraceryPlusPlus.g:2080:1: rule__NameValueAttribute__Group__2__Impl : ( ( rule__NameValueAttribute__ValueAssignment_2 ) ) ;
    public final void rule__NameValueAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2084:1: ( ( ( rule__NameValueAttribute__ValueAssignment_2 ) ) )
            // InternalTraceryPlusPlus.g:2085:1: ( ( rule__NameValueAttribute__ValueAssignment_2 ) )
            {
            // InternalTraceryPlusPlus.g:2085:1: ( ( rule__NameValueAttribute__ValueAssignment_2 ) )
            // InternalTraceryPlusPlus.g:2086:2: ( rule__NameValueAttribute__ValueAssignment_2 )
            {
             before(grammarAccess.getNameValueAttributeAccess().getValueAssignment_2()); 
            // InternalTraceryPlusPlus.g:2087:2: ( rule__NameValueAttribute__ValueAssignment_2 )
            // InternalTraceryPlusPlus.g:2087:3: rule__NameValueAttribute__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NameValueAttribute__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNameValueAttributeAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__NameValueAttribute__Group__2__Impl"


    // $ANTLR start "rule__ObjectAttribute__Group__0"
    // InternalTraceryPlusPlus.g:2096:1: rule__ObjectAttribute__Group__0 : rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1 ;
    public final void rule__ObjectAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2100:1: ( rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1 )
            // InternalTraceryPlusPlus.g:2101:2: rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalTraceryPlusPlus.g:2108:1: rule__ObjectAttribute__Group__0__Impl : ( ( rule__ObjectAttribute__Alternatives_0 ) ) ;
    public final void rule__ObjectAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2112:1: ( ( ( rule__ObjectAttribute__Alternatives_0 ) ) )
            // InternalTraceryPlusPlus.g:2113:1: ( ( rule__ObjectAttribute__Alternatives_0 ) )
            {
            // InternalTraceryPlusPlus.g:2113:1: ( ( rule__ObjectAttribute__Alternatives_0 ) )
            // InternalTraceryPlusPlus.g:2114:2: ( rule__ObjectAttribute__Alternatives_0 )
            {
             before(grammarAccess.getObjectAttributeAccess().getAlternatives_0()); 
            // InternalTraceryPlusPlus.g:2115:2: ( rule__ObjectAttribute__Alternatives_0 )
            // InternalTraceryPlusPlus.g:2115:3: rule__ObjectAttribute__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectAttribute__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAttributeAccess().getAlternatives_0()); 

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
    // InternalTraceryPlusPlus.g:2123:1: rule__ObjectAttribute__Group__1 : rule__ObjectAttribute__Group__1__Impl ;
    public final void rule__ObjectAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2127:1: ( rule__ObjectAttribute__Group__1__Impl )
            // InternalTraceryPlusPlus.g:2128:2: rule__ObjectAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectAttribute__Group__1__Impl();

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
    // InternalTraceryPlusPlus.g:2134:1: rule__ObjectAttribute__Group__1__Impl : ( ( rule__ObjectAttribute__ModifiersAssignment_1 )* ) ;
    public final void rule__ObjectAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2138:1: ( ( ( rule__ObjectAttribute__ModifiersAssignment_1 )* ) )
            // InternalTraceryPlusPlus.g:2139:1: ( ( rule__ObjectAttribute__ModifiersAssignment_1 )* )
            {
            // InternalTraceryPlusPlus.g:2139:1: ( ( rule__ObjectAttribute__ModifiersAssignment_1 )* )
            // InternalTraceryPlusPlus.g:2140:2: ( rule__ObjectAttribute__ModifiersAssignment_1 )*
            {
             before(grammarAccess.getObjectAttributeAccess().getModifiersAssignment_1()); 
            // InternalTraceryPlusPlus.g:2141:2: ( rule__ObjectAttribute__ModifiersAssignment_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=11 && LA26_0<=15)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:2141:3: rule__ObjectAttribute__ModifiersAssignment_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ObjectAttribute__ModifiersAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getObjectAttributeAccess().getModifiersAssignment_1()); 

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


    // $ANTLR start "rule__ObjectAttribute__Group_0_0__0"
    // InternalTraceryPlusPlus.g:2150:1: rule__ObjectAttribute__Group_0_0__0 : rule__ObjectAttribute__Group_0_0__0__Impl rule__ObjectAttribute__Group_0_0__1 ;
    public final void rule__ObjectAttribute__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2154:1: ( rule__ObjectAttribute__Group_0_0__0__Impl rule__ObjectAttribute__Group_0_0__1 )
            // InternalTraceryPlusPlus.g:2155:2: rule__ObjectAttribute__Group_0_0__0__Impl rule__ObjectAttribute__Group_0_0__1
            {
            pushFollow(FOLLOW_21);
            rule__ObjectAttribute__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectAttribute__Group_0_0__1();

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
    // $ANTLR end "rule__ObjectAttribute__Group_0_0__0"


    // $ANTLR start "rule__ObjectAttribute__Group_0_0__0__Impl"
    // InternalTraceryPlusPlus.g:2162:1: rule__ObjectAttribute__Group_0_0__0__Impl : ( ( rule__ObjectAttribute__ObjectAssignment_0_0_0 ) ) ;
    public final void rule__ObjectAttribute__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2166:1: ( ( ( rule__ObjectAttribute__ObjectAssignment_0_0_0 ) ) )
            // InternalTraceryPlusPlus.g:2167:1: ( ( rule__ObjectAttribute__ObjectAssignment_0_0_0 ) )
            {
            // InternalTraceryPlusPlus.g:2167:1: ( ( rule__ObjectAttribute__ObjectAssignment_0_0_0 ) )
            // InternalTraceryPlusPlus.g:2168:2: ( rule__ObjectAttribute__ObjectAssignment_0_0_0 )
            {
             before(grammarAccess.getObjectAttributeAccess().getObjectAssignment_0_0_0()); 
            // InternalTraceryPlusPlus.g:2169:2: ( rule__ObjectAttribute__ObjectAssignment_0_0_0 )
            // InternalTraceryPlusPlus.g:2169:3: rule__ObjectAttribute__ObjectAssignment_0_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectAttribute__ObjectAssignment_0_0_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAttributeAccess().getObjectAssignment_0_0_0()); 

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
    // $ANTLR end "rule__ObjectAttribute__Group_0_0__0__Impl"


    // $ANTLR start "rule__ObjectAttribute__Group_0_0__1"
    // InternalTraceryPlusPlus.g:2177:1: rule__ObjectAttribute__Group_0_0__1 : rule__ObjectAttribute__Group_0_0__1__Impl rule__ObjectAttribute__Group_0_0__2 ;
    public final void rule__ObjectAttribute__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2181:1: ( rule__ObjectAttribute__Group_0_0__1__Impl rule__ObjectAttribute__Group_0_0__2 )
            // InternalTraceryPlusPlus.g:2182:2: rule__ObjectAttribute__Group_0_0__1__Impl rule__ObjectAttribute__Group_0_0__2
            {
            pushFollow(FOLLOW_22);
            rule__ObjectAttribute__Group_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectAttribute__Group_0_0__2();

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
    // $ANTLR end "rule__ObjectAttribute__Group_0_0__1"


    // $ANTLR start "rule__ObjectAttribute__Group_0_0__1__Impl"
    // InternalTraceryPlusPlus.g:2189:1: rule__ObjectAttribute__Group_0_0__1__Impl : ( '.' ) ;
    public final void rule__ObjectAttribute__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2193:1: ( ( '.' ) )
            // InternalTraceryPlusPlus.g:2194:1: ( '.' )
            {
            // InternalTraceryPlusPlus.g:2194:1: ( '.' )
            // InternalTraceryPlusPlus.g:2195:2: '.'
            {
             before(grammarAccess.getObjectAttributeAccess().getFullStopKeyword_0_0_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getObjectAttributeAccess().getFullStopKeyword_0_0_1()); 

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
    // $ANTLR end "rule__ObjectAttribute__Group_0_0__1__Impl"


    // $ANTLR start "rule__ObjectAttribute__Group_0_0__2"
    // InternalTraceryPlusPlus.g:2204:1: rule__ObjectAttribute__Group_0_0__2 : rule__ObjectAttribute__Group_0_0__2__Impl ;
    public final void rule__ObjectAttribute__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2208:1: ( rule__ObjectAttribute__Group_0_0__2__Impl )
            // InternalTraceryPlusPlus.g:2209:2: rule__ObjectAttribute__Group_0_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectAttribute__Group_0_0__2__Impl();

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
    // $ANTLR end "rule__ObjectAttribute__Group_0_0__2"


    // $ANTLR start "rule__ObjectAttribute__Group_0_0__2__Impl"
    // InternalTraceryPlusPlus.g:2215:1: rule__ObjectAttribute__Group_0_0__2__Impl : ( ( rule__ObjectAttribute__AttributeAssignment_0_0_2 ) ) ;
    public final void rule__ObjectAttribute__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2219:1: ( ( ( rule__ObjectAttribute__AttributeAssignment_0_0_2 ) ) )
            // InternalTraceryPlusPlus.g:2220:1: ( ( rule__ObjectAttribute__AttributeAssignment_0_0_2 ) )
            {
            // InternalTraceryPlusPlus.g:2220:1: ( ( rule__ObjectAttribute__AttributeAssignment_0_0_2 ) )
            // InternalTraceryPlusPlus.g:2221:2: ( rule__ObjectAttribute__AttributeAssignment_0_0_2 )
            {
             before(grammarAccess.getObjectAttributeAccess().getAttributeAssignment_0_0_2()); 
            // InternalTraceryPlusPlus.g:2222:2: ( rule__ObjectAttribute__AttributeAssignment_0_0_2 )
            // InternalTraceryPlusPlus.g:2222:3: rule__ObjectAttribute__AttributeAssignment_0_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ObjectAttribute__AttributeAssignment_0_0_2();

            state._fsp--;


            }

             after(grammarAccess.getObjectAttributeAccess().getAttributeAssignment_0_0_2()); 

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
    // $ANTLR end "rule__ObjectAttribute__Group_0_0__2__Impl"


    // $ANTLR start "rule__ObjectAttribute__Group_0_1__0"
    // InternalTraceryPlusPlus.g:2231:1: rule__ObjectAttribute__Group_0_1__0 : rule__ObjectAttribute__Group_0_1__0__Impl rule__ObjectAttribute__Group_0_1__1 ;
    public final void rule__ObjectAttribute__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2235:1: ( rule__ObjectAttribute__Group_0_1__0__Impl rule__ObjectAttribute__Group_0_1__1 )
            // InternalTraceryPlusPlus.g:2236:2: rule__ObjectAttribute__Group_0_1__0__Impl rule__ObjectAttribute__Group_0_1__1
            {
            pushFollow(FOLLOW_23);
            rule__ObjectAttribute__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectAttribute__Group_0_1__1();

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
    // $ANTLR end "rule__ObjectAttribute__Group_0_1__0"


    // $ANTLR start "rule__ObjectAttribute__Group_0_1__0__Impl"
    // InternalTraceryPlusPlus.g:2243:1: rule__ObjectAttribute__Group_0_1__0__Impl : ( ( rule__ObjectAttribute__ObjectAssignment_0_1_0 ) ) ;
    public final void rule__ObjectAttribute__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2247:1: ( ( ( rule__ObjectAttribute__ObjectAssignment_0_1_0 ) ) )
            // InternalTraceryPlusPlus.g:2248:1: ( ( rule__ObjectAttribute__ObjectAssignment_0_1_0 ) )
            {
            // InternalTraceryPlusPlus.g:2248:1: ( ( rule__ObjectAttribute__ObjectAssignment_0_1_0 ) )
            // InternalTraceryPlusPlus.g:2249:2: ( rule__ObjectAttribute__ObjectAssignment_0_1_0 )
            {
             before(grammarAccess.getObjectAttributeAccess().getObjectAssignment_0_1_0()); 
            // InternalTraceryPlusPlus.g:2250:2: ( rule__ObjectAttribute__ObjectAssignment_0_1_0 )
            // InternalTraceryPlusPlus.g:2250:3: rule__ObjectAttribute__ObjectAssignment_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectAttribute__ObjectAssignment_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAttributeAccess().getObjectAssignment_0_1_0()); 

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
    // $ANTLR end "rule__ObjectAttribute__Group_0_1__0__Impl"


    // $ANTLR start "rule__ObjectAttribute__Group_0_1__1"
    // InternalTraceryPlusPlus.g:2258:1: rule__ObjectAttribute__Group_0_1__1 : rule__ObjectAttribute__Group_0_1__1__Impl rule__ObjectAttribute__Group_0_1__2 ;
    public final void rule__ObjectAttribute__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2262:1: ( rule__ObjectAttribute__Group_0_1__1__Impl rule__ObjectAttribute__Group_0_1__2 )
            // InternalTraceryPlusPlus.g:2263:2: rule__ObjectAttribute__Group_0_1__1__Impl rule__ObjectAttribute__Group_0_1__2
            {
            pushFollow(FOLLOW_23);
            rule__ObjectAttribute__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectAttribute__Group_0_1__2();

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
    // $ANTLR end "rule__ObjectAttribute__Group_0_1__1"


    // $ANTLR start "rule__ObjectAttribute__Group_0_1__1__Impl"
    // InternalTraceryPlusPlus.g:2270:1: rule__ObjectAttribute__Group_0_1__1__Impl : ( ( '.' )? ) ;
    public final void rule__ObjectAttribute__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2274:1: ( ( ( '.' )? ) )
            // InternalTraceryPlusPlus.g:2275:1: ( ( '.' )? )
            {
            // InternalTraceryPlusPlus.g:2275:1: ( ( '.' )? )
            // InternalTraceryPlusPlus.g:2276:2: ( '.' )?
            {
             before(grammarAccess.getObjectAttributeAccess().getFullStopKeyword_0_1_1()); 
            // InternalTraceryPlusPlus.g:2277:2: ( '.' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==43) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTraceryPlusPlus.g:2277:3: '.'
                    {
                    match(input,43,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getObjectAttributeAccess().getFullStopKeyword_0_1_1()); 

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
    // $ANTLR end "rule__ObjectAttribute__Group_0_1__1__Impl"


    // $ANTLR start "rule__ObjectAttribute__Group_0_1__2"
    // InternalTraceryPlusPlus.g:2285:1: rule__ObjectAttribute__Group_0_1__2 : rule__ObjectAttribute__Group_0_1__2__Impl ;
    public final void rule__ObjectAttribute__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2289:1: ( rule__ObjectAttribute__Group_0_1__2__Impl )
            // InternalTraceryPlusPlus.g:2290:2: rule__ObjectAttribute__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectAttribute__Group_0_1__2__Impl();

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
    // $ANTLR end "rule__ObjectAttribute__Group_0_1__2"


    // $ANTLR start "rule__ObjectAttribute__Group_0_1__2__Impl"
    // InternalTraceryPlusPlus.g:2296:1: rule__ObjectAttribute__Group_0_1__2__Impl : ( ( rule__ObjectAttribute__PronounAssignment_0_1_2 ) ) ;
    public final void rule__ObjectAttribute__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2300:1: ( ( ( rule__ObjectAttribute__PronounAssignment_0_1_2 ) ) )
            // InternalTraceryPlusPlus.g:2301:1: ( ( rule__ObjectAttribute__PronounAssignment_0_1_2 ) )
            {
            // InternalTraceryPlusPlus.g:2301:1: ( ( rule__ObjectAttribute__PronounAssignment_0_1_2 ) )
            // InternalTraceryPlusPlus.g:2302:2: ( rule__ObjectAttribute__PronounAssignment_0_1_2 )
            {
             before(grammarAccess.getObjectAttributeAccess().getPronounAssignment_0_1_2()); 
            // InternalTraceryPlusPlus.g:2303:2: ( rule__ObjectAttribute__PronounAssignment_0_1_2 )
            // InternalTraceryPlusPlus.g:2303:3: rule__ObjectAttribute__PronounAssignment_0_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ObjectAttribute__PronounAssignment_0_1_2();

            state._fsp--;


            }

             after(grammarAccess.getObjectAttributeAccess().getPronounAssignment_0_1_2()); 

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
    // $ANTLR end "rule__ObjectAttribute__Group_0_1__2__Impl"


    // $ANTLR start "rule__WordList__Group__0"
    // InternalTraceryPlusPlus.g:2312:1: rule__WordList__Group__0 : rule__WordList__Group__0__Impl rule__WordList__Group__1 ;
    public final void rule__WordList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2316:1: ( rule__WordList__Group__0__Impl rule__WordList__Group__1 )
            // InternalTraceryPlusPlus.g:2317:2: rule__WordList__Group__0__Impl rule__WordList__Group__1
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
    // InternalTraceryPlusPlus.g:2324:1: rule__WordList__Group__0__Impl : ( ( rule__WordList__WordsAssignment_0 ) ) ;
    public final void rule__WordList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2328:1: ( ( ( rule__WordList__WordsAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:2329:1: ( ( rule__WordList__WordsAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:2329:1: ( ( rule__WordList__WordsAssignment_0 ) )
            // InternalTraceryPlusPlus.g:2330:2: ( rule__WordList__WordsAssignment_0 )
            {
             before(grammarAccess.getWordListAccess().getWordsAssignment_0()); 
            // InternalTraceryPlusPlus.g:2331:2: ( rule__WordList__WordsAssignment_0 )
            // InternalTraceryPlusPlus.g:2331:3: rule__WordList__WordsAssignment_0
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
    // InternalTraceryPlusPlus.g:2339:1: rule__WordList__Group__1 : rule__WordList__Group__1__Impl ;
    public final void rule__WordList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2343:1: ( rule__WordList__Group__1__Impl )
            // InternalTraceryPlusPlus.g:2344:2: rule__WordList__Group__1__Impl
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
    // InternalTraceryPlusPlus.g:2350:1: rule__WordList__Group__1__Impl : ( ( rule__WordList__Group_1__0 )* ) ;
    public final void rule__WordList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2354:1: ( ( ( rule__WordList__Group_1__0 )* ) )
            // InternalTraceryPlusPlus.g:2355:1: ( ( rule__WordList__Group_1__0 )* )
            {
            // InternalTraceryPlusPlus.g:2355:1: ( ( rule__WordList__Group_1__0 )* )
            // InternalTraceryPlusPlus.g:2356:2: ( rule__WordList__Group_1__0 )*
            {
             before(grammarAccess.getWordListAccess().getGroup_1()); 
            // InternalTraceryPlusPlus.g:2357:2: ( rule__WordList__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=31 && LA28_0<=33)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:2357:3: rule__WordList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__WordList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalTraceryPlusPlus.g:2366:1: rule__WordList__Group_1__0 : rule__WordList__Group_1__0__Impl rule__WordList__Group_1__1 ;
    public final void rule__WordList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2370:1: ( rule__WordList__Group_1__0__Impl rule__WordList__Group_1__1 )
            // InternalTraceryPlusPlus.g:2371:2: rule__WordList__Group_1__0__Impl rule__WordList__Group_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalTraceryPlusPlus.g:2378:1: rule__WordList__Group_1__0__Impl : ( ruleSeparatorOr ) ;
    public final void rule__WordList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2382:1: ( ( ruleSeparatorOr ) )
            // InternalTraceryPlusPlus.g:2383:1: ( ruleSeparatorOr )
            {
            // InternalTraceryPlusPlus.g:2383:1: ( ruleSeparatorOr )
            // InternalTraceryPlusPlus.g:2384:2: ruleSeparatorOr
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
    // InternalTraceryPlusPlus.g:2393:1: rule__WordList__Group_1__1 : rule__WordList__Group_1__1__Impl ;
    public final void rule__WordList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2397:1: ( rule__WordList__Group_1__1__Impl )
            // InternalTraceryPlusPlus.g:2398:2: rule__WordList__Group_1__1__Impl
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
    // InternalTraceryPlusPlus.g:2404:1: rule__WordList__Group_1__1__Impl : ( ( rule__WordList__WordsAssignment_1_1 ) ) ;
    public final void rule__WordList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2408:1: ( ( ( rule__WordList__WordsAssignment_1_1 ) ) )
            // InternalTraceryPlusPlus.g:2409:1: ( ( rule__WordList__WordsAssignment_1_1 ) )
            {
            // InternalTraceryPlusPlus.g:2409:1: ( ( rule__WordList__WordsAssignment_1_1 ) )
            // InternalTraceryPlusPlus.g:2410:2: ( rule__WordList__WordsAssignment_1_1 )
            {
             before(grammarAccess.getWordListAccess().getWordsAssignment_1_1()); 
            // InternalTraceryPlusPlus.g:2411:2: ( rule__WordList__WordsAssignment_1_1 )
            // InternalTraceryPlusPlus.g:2411:3: rule__WordList__WordsAssignment_1_1
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
    // InternalTraceryPlusPlus.g:2420:1: rule__AttributeList__Group__0 : rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 ;
    public final void rule__AttributeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2424:1: ( rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 )
            // InternalTraceryPlusPlus.g:2425:2: rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalTraceryPlusPlus.g:2432:1: rule__AttributeList__Group__0__Impl : ( ( rule__AttributeList__AttributesAssignment_0 ) ) ;
    public final void rule__AttributeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2436:1: ( ( ( rule__AttributeList__AttributesAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:2437:1: ( ( rule__AttributeList__AttributesAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:2437:1: ( ( rule__AttributeList__AttributesAssignment_0 ) )
            // InternalTraceryPlusPlus.g:2438:2: ( rule__AttributeList__AttributesAssignment_0 )
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAssignment_0()); 
            // InternalTraceryPlusPlus.g:2439:2: ( rule__AttributeList__AttributesAssignment_0 )
            // InternalTraceryPlusPlus.g:2439:3: rule__AttributeList__AttributesAssignment_0
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
    // InternalTraceryPlusPlus.g:2447:1: rule__AttributeList__Group__1 : rule__AttributeList__Group__1__Impl ;
    public final void rule__AttributeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2451:1: ( rule__AttributeList__Group__1__Impl )
            // InternalTraceryPlusPlus.g:2452:2: rule__AttributeList__Group__1__Impl
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
    // InternalTraceryPlusPlus.g:2458:1: rule__AttributeList__Group__1__Impl : ( ( rule__AttributeList__Group_1__0 )* ) ;
    public final void rule__AttributeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2462:1: ( ( ( rule__AttributeList__Group_1__0 )* ) )
            // InternalTraceryPlusPlus.g:2463:1: ( ( rule__AttributeList__Group_1__0 )* )
            {
            // InternalTraceryPlusPlus.g:2463:1: ( ( rule__AttributeList__Group_1__0 )* )
            // InternalTraceryPlusPlus.g:2464:2: ( rule__AttributeList__Group_1__0 )*
            {
             before(grammarAccess.getAttributeListAccess().getGroup_1()); 
            // InternalTraceryPlusPlus.g:2465:2: ( rule__AttributeList__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==31||(LA29_0>=34 && LA29_0<=35)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:2465:3: rule__AttributeList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__AttributeList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalTraceryPlusPlus.g:2474:1: rule__AttributeList__Group_1__0 : rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1 ;
    public final void rule__AttributeList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2478:1: ( rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1 )
            // InternalTraceryPlusPlus.g:2479:2: rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalTraceryPlusPlus.g:2486:1: rule__AttributeList__Group_1__0__Impl : ( ruleSeparatorAnd ) ;
    public final void rule__AttributeList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2490:1: ( ( ruleSeparatorAnd ) )
            // InternalTraceryPlusPlus.g:2491:1: ( ruleSeparatorAnd )
            {
            // InternalTraceryPlusPlus.g:2491:1: ( ruleSeparatorAnd )
            // InternalTraceryPlusPlus.g:2492:2: ruleSeparatorAnd
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
    // InternalTraceryPlusPlus.g:2501:1: rule__AttributeList__Group_1__1 : rule__AttributeList__Group_1__1__Impl ;
    public final void rule__AttributeList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2505:1: ( rule__AttributeList__Group_1__1__Impl )
            // InternalTraceryPlusPlus.g:2506:2: rule__AttributeList__Group_1__1__Impl
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
    // InternalTraceryPlusPlus.g:2512:1: rule__AttributeList__Group_1__1__Impl : ( ( rule__AttributeList__AttributesAssignment_1_1 ) ) ;
    public final void rule__AttributeList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2516:1: ( ( ( rule__AttributeList__AttributesAssignment_1_1 ) ) )
            // InternalTraceryPlusPlus.g:2517:1: ( ( rule__AttributeList__AttributesAssignment_1_1 ) )
            {
            // InternalTraceryPlusPlus.g:2517:1: ( ( rule__AttributeList__AttributesAssignment_1_1 ) )
            // InternalTraceryPlusPlus.g:2518:2: ( rule__AttributeList__AttributesAssignment_1_1 )
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAssignment_1_1()); 
            // InternalTraceryPlusPlus.g:2519:2: ( rule__AttributeList__AttributesAssignment_1_1 )
            // InternalTraceryPlusPlus.g:2519:3: rule__AttributeList__AttributesAssignment_1_1
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


    // $ANTLR start "rule__TraceryPlusPlusProgram__StatementsAssignment_0"
    // InternalTraceryPlusPlus.g:2528:1: rule__TraceryPlusPlusProgram__StatementsAssignment_0 : ( ruleStatement ) ;
    public final void rule__TraceryPlusPlusProgram__StatementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2532:1: ( ( ruleStatement ) )
            // InternalTraceryPlusPlus.g:2533:2: ( ruleStatement )
            {
            // InternalTraceryPlusPlus.g:2533:2: ( ruleStatement )
            // InternalTraceryPlusPlus.g:2534:3: ruleStatement
            {
             before(grammarAccess.getTraceryPlusPlusProgramAccess().getStatementsStatementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getTraceryPlusPlusProgramAccess().getStatementsStatementParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__TraceryPlusPlusProgram__StatementsAssignment_0"


    // $ANTLR start "rule__TraceryPlusPlusProgram__StoryAssignment_1"
    // InternalTraceryPlusPlus.g:2543:1: rule__TraceryPlusPlusProgram__StoryAssignment_1 : ( ruleStory ) ;
    public final void rule__TraceryPlusPlusProgram__StoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2547:1: ( ( ruleStory ) )
            // InternalTraceryPlusPlus.g:2548:2: ( ruleStory )
            {
            // InternalTraceryPlusPlus.g:2548:2: ( ruleStory )
            // InternalTraceryPlusPlus.g:2549:3: ruleStory
            {
             before(grammarAccess.getTraceryPlusPlusProgramAccess().getStoryStoryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStory();

            state._fsp--;

             after(grammarAccess.getTraceryPlusPlusProgramAccess().getStoryStoryParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__TraceryPlusPlusProgram__StoryAssignment_1"


    // $ANTLR start "rule__Story__StoryAssignment_4"
    // InternalTraceryPlusPlus.g:2558:1: rule__Story__StoryAssignment_4 : ( ( rule__Story__StoryAlternatives_4_0 ) ) ;
    public final void rule__Story__StoryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2562:1: ( ( ( rule__Story__StoryAlternatives_4_0 ) ) )
            // InternalTraceryPlusPlus.g:2563:2: ( ( rule__Story__StoryAlternatives_4_0 ) )
            {
            // InternalTraceryPlusPlus.g:2563:2: ( ( rule__Story__StoryAlternatives_4_0 ) )
            // InternalTraceryPlusPlus.g:2564:3: ( rule__Story__StoryAlternatives_4_0 )
            {
             before(grammarAccess.getStoryAccess().getStoryAlternatives_4_0()); 
            // InternalTraceryPlusPlus.g:2565:3: ( rule__Story__StoryAlternatives_4_0 )
            // InternalTraceryPlusPlus.g:2565:4: rule__Story__StoryAlternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Story__StoryAlternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getStoryAccess().getStoryAlternatives_4_0()); 

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
    // $ANTLR end "rule__Story__StoryAssignment_4"


    // $ANTLR start "rule__ListDeclaration__NameAssignment_0"
    // InternalTraceryPlusPlus.g:2573:1: rule__ListDeclaration__NameAssignment_0 : ( ruleVariable ) ;
    public final void rule__ListDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2577:1: ( ( ruleVariable ) )
            // InternalTraceryPlusPlus.g:2578:2: ( ruleVariable )
            {
            // InternalTraceryPlusPlus.g:2578:2: ( ruleVariable )
            // InternalTraceryPlusPlus.g:2579:3: ruleVariable
            {
             before(grammarAccess.getListDeclarationAccess().getNameVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getListDeclarationAccess().getNameVariableParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ListDeclaration__NameAssignment_0"


    // $ANTLR start "rule__ListDeclaration__ListAssignment_3"
    // InternalTraceryPlusPlus.g:2588:1: rule__ListDeclaration__ListAssignment_3 : ( ruleWordList ) ;
    public final void rule__ListDeclaration__ListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2592:1: ( ( ruleWordList ) )
            // InternalTraceryPlusPlus.g:2593:2: ( ruleWordList )
            {
            // InternalTraceryPlusPlus.g:2593:2: ( ruleWordList )
            // InternalTraceryPlusPlus.g:2594:3: ruleWordList
            {
             before(grammarAccess.getListDeclarationAccess().getListWordListParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleWordList();

            state._fsp--;

             after(grammarAccess.getListDeclarationAccess().getListWordListParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ListDeclaration__ListAssignment_3"


    // $ANTLR start "rule__ObjectDeclaration__NameAssignment_3"
    // InternalTraceryPlusPlus.g:2603:1: rule__ObjectDeclaration__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ObjectDeclaration__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2607:1: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2608:2: ( RULE_ID )
            {
            // InternalTraceryPlusPlus.g:2608:2: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2609:3: RULE_ID
            {
             before(grammarAccess.getObjectDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__ObjectDeclaration__NameAssignment_3"


    // $ANTLR start "rule__ObjectDeclaration__PronounsAssignment_4"
    // InternalTraceryPlusPlus.g:2618:1: rule__ObjectDeclaration__PronounsAssignment_4 : ( rulePronouns ) ;
    public final void rule__ObjectDeclaration__PronounsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2622:1: ( ( rulePronouns ) )
            // InternalTraceryPlusPlus.g:2623:2: ( rulePronouns )
            {
            // InternalTraceryPlusPlus.g:2623:2: ( rulePronouns )
            // InternalTraceryPlusPlus.g:2624:3: rulePronouns
            {
             before(grammarAccess.getObjectDeclarationAccess().getPronounsPronounsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePronouns();

            state._fsp--;

             after(grammarAccess.getObjectDeclarationAccess().getPronounsPronounsParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ObjectDeclaration__PronounsAssignment_4"


    // $ANTLR start "rule__ObjectDeclaration__AttributesAssignment_8"
    // InternalTraceryPlusPlus.g:2633:1: rule__ObjectDeclaration__AttributesAssignment_8 : ( ruleAttributeList ) ;
    public final void rule__ObjectDeclaration__AttributesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2637:1: ( ( ruleAttributeList ) )
            // InternalTraceryPlusPlus.g:2638:2: ( ruleAttributeList )
            {
            // InternalTraceryPlusPlus.g:2638:2: ( ruleAttributeList )
            // InternalTraceryPlusPlus.g:2639:3: ruleAttributeList
            {
             before(grammarAccess.getObjectDeclarationAccess().getAttributesAttributeListParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeList();

            state._fsp--;

             after(grammarAccess.getObjectDeclarationAccess().getAttributesAttributeListParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__ObjectDeclaration__AttributesAssignment_8"


    // $ANTLR start "rule__Word__ValueAssignment"
    // InternalTraceryPlusPlus.g:2648:1: rule__Word__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__Word__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2652:1: ( ( RULE_STRING ) )
            // InternalTraceryPlusPlus.g:2653:2: ( RULE_STRING )
            {
            // InternalTraceryPlusPlus.g:2653:2: ( RULE_STRING )
            // InternalTraceryPlusPlus.g:2654:3: RULE_STRING
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
    // InternalTraceryPlusPlus.g:2663:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2667:1: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2668:2: ( RULE_ID )
            {
            // InternalTraceryPlusPlus.g:2668:2: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2669:3: RULE_ID
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
    // InternalTraceryPlusPlus.g:2678:1: rule__StoryVariable__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__StoryVariable__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2682:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:2683:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:2683:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2684:3: ( RULE_ID )
            {
             before(grammarAccess.getStoryVariableAccess().getVariableVariableCrossReference_0_0()); 
            // InternalTraceryPlusPlus.g:2685:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2686:4: RULE_ID
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
    // InternalTraceryPlusPlus.g:2697:1: rule__StoryVariable__ModifiersAssignment_1 : ( ruleModifier ) ;
    public final void rule__StoryVariable__ModifiersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2701:1: ( ( ruleModifier ) )
            // InternalTraceryPlusPlus.g:2702:2: ( ruleModifier )
            {
            // InternalTraceryPlusPlus.g:2702:2: ( ruleModifier )
            // InternalTraceryPlusPlus.g:2703:3: ruleModifier
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


    // $ANTLR start "rule__ExistingVariable__PointerAssignment"
    // InternalTraceryPlusPlus.g:2712:1: rule__ExistingVariable__PointerAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ExistingVariable__PointerAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2716:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:2717:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:2717:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2718:3: ( RULE_ID )
            {
             before(grammarAccess.getExistingVariableAccess().getPointerVariableCrossReference_0()); 
            // InternalTraceryPlusPlus.g:2719:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2720:4: RULE_ID
            {
             before(grammarAccess.getExistingVariableAccess().getPointerVariableIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExistingVariableAccess().getPointerVariableIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getExistingVariableAccess().getPointerVariableCrossReference_0()); 

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
    // $ANTLR end "rule__ExistingVariable__PointerAssignment"


    // $ANTLR start "rule__JustNameAttribute__NameAssignment"
    // InternalTraceryPlusPlus.g:2731:1: rule__JustNameAttribute__NameAssignment : ( ruleExistingVariable ) ;
    public final void rule__JustNameAttribute__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2735:1: ( ( ruleExistingVariable ) )
            // InternalTraceryPlusPlus.g:2736:2: ( ruleExistingVariable )
            {
            // InternalTraceryPlusPlus.g:2736:2: ( ruleExistingVariable )
            // InternalTraceryPlusPlus.g:2737:3: ruleExistingVariable
            {
             before(grammarAccess.getJustNameAttributeAccess().getNameExistingVariableParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExistingVariable();

            state._fsp--;

             after(grammarAccess.getJustNameAttributeAccess().getNameExistingVariableParserRuleCall_0()); 

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
    // $ANTLR end "rule__JustNameAttribute__NameAssignment"


    // $ANTLR start "rule__NameExistingListAttribute__NameAssignment_0"
    // InternalTraceryPlusPlus.g:2746:1: rule__NameExistingListAttribute__NameAssignment_0 : ( ruleVariable ) ;
    public final void rule__NameExistingListAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2750:1: ( ( ruleVariable ) )
            // InternalTraceryPlusPlus.g:2751:2: ( ruleVariable )
            {
            // InternalTraceryPlusPlus.g:2751:2: ( ruleVariable )
            // InternalTraceryPlusPlus.g:2752:3: ruleVariable
            {
             before(grammarAccess.getNameExistingListAttributeAccess().getNameVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getNameExistingListAttributeAccess().getNameVariableParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__NameExistingListAttribute__NameAssignment_0"


    // $ANTLR start "rule__NameExistingListAttribute__ValueAssignment_2"
    // InternalTraceryPlusPlus.g:2761:1: rule__NameExistingListAttribute__ValueAssignment_2 : ( ruleExistingVariable ) ;
    public final void rule__NameExistingListAttribute__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2765:1: ( ( ruleExistingVariable ) )
            // InternalTraceryPlusPlus.g:2766:2: ( ruleExistingVariable )
            {
            // InternalTraceryPlusPlus.g:2766:2: ( ruleExistingVariable )
            // InternalTraceryPlusPlus.g:2767:3: ruleExistingVariable
            {
             before(grammarAccess.getNameExistingListAttributeAccess().getValueExistingVariableParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExistingVariable();

            state._fsp--;

             after(grammarAccess.getNameExistingListAttributeAccess().getValueExistingVariableParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__NameExistingListAttribute__ValueAssignment_2"


    // $ANTLR start "rule__NameValueAttribute__NameAssignment_0"
    // InternalTraceryPlusPlus.g:2776:1: rule__NameValueAttribute__NameAssignment_0 : ( ruleVariable ) ;
    public final void rule__NameValueAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2780:1: ( ( ruleVariable ) )
            // InternalTraceryPlusPlus.g:2781:2: ( ruleVariable )
            {
            // InternalTraceryPlusPlus.g:2781:2: ( ruleVariable )
            // InternalTraceryPlusPlus.g:2782:3: ruleVariable
            {
             before(grammarAccess.getNameValueAttributeAccess().getNameVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getNameValueAttributeAccess().getNameVariableParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__NameValueAttribute__NameAssignment_0"


    // $ANTLR start "rule__NameValueAttribute__ValueAssignment_2"
    // InternalTraceryPlusPlus.g:2791:1: rule__NameValueAttribute__ValueAssignment_2 : ( ruleWord ) ;
    public final void rule__NameValueAttribute__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2795:1: ( ( ruleWord ) )
            // InternalTraceryPlusPlus.g:2796:2: ( ruleWord )
            {
            // InternalTraceryPlusPlus.g:2796:2: ( ruleWord )
            // InternalTraceryPlusPlus.g:2797:3: ruleWord
            {
             before(grammarAccess.getNameValueAttributeAccess().getValueWordParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleWord();

            state._fsp--;

             after(grammarAccess.getNameValueAttributeAccess().getValueWordParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__NameValueAttribute__ValueAssignment_2"


    // $ANTLR start "rule__ObjectAttribute__ObjectAssignment_0_0_0"
    // InternalTraceryPlusPlus.g:2806:1: rule__ObjectAttribute__ObjectAssignment_0_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectAttribute__ObjectAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2810:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:2811:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:2811:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2812:3: ( RULE_ID )
            {
             before(grammarAccess.getObjectAttributeAccess().getObjectObjectDeclarationCrossReference_0_0_0_0()); 
            // InternalTraceryPlusPlus.g:2813:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2814:4: RULE_ID
            {
             before(grammarAccess.getObjectAttributeAccess().getObjectObjectDeclarationIDTerminalRuleCall_0_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectAttributeAccess().getObjectObjectDeclarationIDTerminalRuleCall_0_0_0_0_1()); 

            }

             after(grammarAccess.getObjectAttributeAccess().getObjectObjectDeclarationCrossReference_0_0_0_0()); 

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
    // $ANTLR end "rule__ObjectAttribute__ObjectAssignment_0_0_0"


    // $ANTLR start "rule__ObjectAttribute__AttributeAssignment_0_0_2"
    // InternalTraceryPlusPlus.g:2825:1: rule__ObjectAttribute__AttributeAssignment_0_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectAttribute__AttributeAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2829:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:2830:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:2830:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2831:3: ( RULE_ID )
            {
             before(grammarAccess.getObjectAttributeAccess().getAttributeVariableCrossReference_0_0_2_0()); 
            // InternalTraceryPlusPlus.g:2832:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2833:4: RULE_ID
            {
             before(grammarAccess.getObjectAttributeAccess().getAttributeVariableIDTerminalRuleCall_0_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectAttributeAccess().getAttributeVariableIDTerminalRuleCall_0_0_2_0_1()); 

            }

             after(grammarAccess.getObjectAttributeAccess().getAttributeVariableCrossReference_0_0_2_0()); 

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
    // $ANTLR end "rule__ObjectAttribute__AttributeAssignment_0_0_2"


    // $ANTLR start "rule__ObjectAttribute__ObjectAssignment_0_1_0"
    // InternalTraceryPlusPlus.g:2844:1: rule__ObjectAttribute__ObjectAssignment_0_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectAttribute__ObjectAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2848:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:2849:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:2849:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2850:3: ( RULE_ID )
            {
             before(grammarAccess.getObjectAttributeAccess().getObjectObjectDeclarationCrossReference_0_1_0_0()); 
            // InternalTraceryPlusPlus.g:2851:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2852:4: RULE_ID
            {
             before(grammarAccess.getObjectAttributeAccess().getObjectObjectDeclarationIDTerminalRuleCall_0_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectAttributeAccess().getObjectObjectDeclarationIDTerminalRuleCall_0_1_0_0_1()); 

            }

             after(grammarAccess.getObjectAttributeAccess().getObjectObjectDeclarationCrossReference_0_1_0_0()); 

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
    // $ANTLR end "rule__ObjectAttribute__ObjectAssignment_0_1_0"


    // $ANTLR start "rule__ObjectAttribute__PronounAssignment_0_1_2"
    // InternalTraceryPlusPlus.g:2863:1: rule__ObjectAttribute__PronounAssignment_0_1_2 : ( rulePronounIdentifier ) ;
    public final void rule__ObjectAttribute__PronounAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2867:1: ( ( rulePronounIdentifier ) )
            // InternalTraceryPlusPlus.g:2868:2: ( rulePronounIdentifier )
            {
            // InternalTraceryPlusPlus.g:2868:2: ( rulePronounIdentifier )
            // InternalTraceryPlusPlus.g:2869:3: rulePronounIdentifier
            {
             before(grammarAccess.getObjectAttributeAccess().getPronounPronounIdentifierParserRuleCall_0_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePronounIdentifier();

            state._fsp--;

             after(grammarAccess.getObjectAttributeAccess().getPronounPronounIdentifierParserRuleCall_0_1_2_0()); 

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
    // $ANTLR end "rule__ObjectAttribute__PronounAssignment_0_1_2"


    // $ANTLR start "rule__ObjectAttribute__ModifiersAssignment_1"
    // InternalTraceryPlusPlus.g:2878:1: rule__ObjectAttribute__ModifiersAssignment_1 : ( ruleModifier ) ;
    public final void rule__ObjectAttribute__ModifiersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2882:1: ( ( ruleModifier ) )
            // InternalTraceryPlusPlus.g:2883:2: ( ruleModifier )
            {
            // InternalTraceryPlusPlus.g:2883:2: ( ruleModifier )
            // InternalTraceryPlusPlus.g:2884:3: ruleModifier
            {
             before(grammarAccess.getObjectAttributeAccess().getModifiersModifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModifier();

            state._fsp--;

             after(grammarAccess.getObjectAttributeAccess().getModifiersModifierParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ObjectAttribute__ModifiersAssignment_1"


    // $ANTLR start "rule__WordList__WordsAssignment_0"
    // InternalTraceryPlusPlus.g:2893:1: rule__WordList__WordsAssignment_0 : ( ruleWord ) ;
    public final void rule__WordList__WordsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2897:1: ( ( ruleWord ) )
            // InternalTraceryPlusPlus.g:2898:2: ( ruleWord )
            {
            // InternalTraceryPlusPlus.g:2898:2: ( ruleWord )
            // InternalTraceryPlusPlus.g:2899:3: ruleWord
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
    // InternalTraceryPlusPlus.g:2908:1: rule__WordList__WordsAssignment_1_1 : ( ruleWord ) ;
    public final void rule__WordList__WordsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2912:1: ( ( ruleWord ) )
            // InternalTraceryPlusPlus.g:2913:2: ( ruleWord )
            {
            // InternalTraceryPlusPlus.g:2913:2: ( ruleWord )
            // InternalTraceryPlusPlus.g:2914:3: ruleWord
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
    // InternalTraceryPlusPlus.g:2923:1: rule__AttributeList__AttributesAssignment_0 : ( ruleAttribute ) ;
    public final void rule__AttributeList__AttributesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2927:1: ( ( ruleAttribute ) )
            // InternalTraceryPlusPlus.g:2928:2: ( ruleAttribute )
            {
            // InternalTraceryPlusPlus.g:2928:2: ( ruleAttribute )
            // InternalTraceryPlusPlus.g:2929:3: ruleAttribute
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
    // InternalTraceryPlusPlus.g:2938:1: rule__AttributeList__AttributesAssignment_1_1 : ( ruleAttribute ) ;
    public final void rule__AttributeList__AttributesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2942:1: ( ( ruleAttribute ) )
            // InternalTraceryPlusPlus.g:2943:2: ( ruleAttribute )
            {
            // InternalTraceryPlusPlus.g:2943:2: ( ruleAttribute )
            // InternalTraceryPlusPlus.g:2944:3: ruleAttribute
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


    // $ANTLR start "rule__Pronouns__ValueAssignment_0"
    // InternalTraceryPlusPlus.g:2953:1: rule__Pronouns__ValueAssignment_0 : ( ( 'He' ) ) ;
    public final void rule__Pronouns__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2957:1: ( ( ( 'He' ) ) )
            // InternalTraceryPlusPlus.g:2958:2: ( ( 'He' ) )
            {
            // InternalTraceryPlusPlus.g:2958:2: ( ( 'He' ) )
            // InternalTraceryPlusPlus.g:2959:3: ( 'He' )
            {
             before(grammarAccess.getPronounsAccess().getValueHeKeyword_0_0()); 
            // InternalTraceryPlusPlus.g:2960:3: ( 'He' )
            // InternalTraceryPlusPlus.g:2961:4: 'He'
            {
             before(grammarAccess.getPronounsAccess().getValueHeKeyword_0_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getPronounsAccess().getValueHeKeyword_0_0()); 

            }

             after(grammarAccess.getPronounsAccess().getValueHeKeyword_0_0()); 

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
    // $ANTLR end "rule__Pronouns__ValueAssignment_0"


    // $ANTLR start "rule__Pronouns__ValueAssignment_1"
    // InternalTraceryPlusPlus.g:2972:1: rule__Pronouns__ValueAssignment_1 : ( ( 'She' ) ) ;
    public final void rule__Pronouns__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2976:1: ( ( ( 'She' ) ) )
            // InternalTraceryPlusPlus.g:2977:2: ( ( 'She' ) )
            {
            // InternalTraceryPlusPlus.g:2977:2: ( ( 'She' ) )
            // InternalTraceryPlusPlus.g:2978:3: ( 'She' )
            {
             before(grammarAccess.getPronounsAccess().getValueSheKeyword_1_0()); 
            // InternalTraceryPlusPlus.g:2979:3: ( 'She' )
            // InternalTraceryPlusPlus.g:2980:4: 'She'
            {
             before(grammarAccess.getPronounsAccess().getValueSheKeyword_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPronounsAccess().getValueSheKeyword_1_0()); 

            }

             after(grammarAccess.getPronounsAccess().getValueSheKeyword_1_0()); 

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
    // $ANTLR end "rule__Pronouns__ValueAssignment_1"


    // $ANTLR start "rule__Pronouns__ValueAssignment_2"
    // InternalTraceryPlusPlus.g:2991:1: rule__Pronouns__ValueAssignment_2 : ( ( 'It' ) ) ;
    public final void rule__Pronouns__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2995:1: ( ( ( 'It' ) ) )
            // InternalTraceryPlusPlus.g:2996:2: ( ( 'It' ) )
            {
            // InternalTraceryPlusPlus.g:2996:2: ( ( 'It' ) )
            // InternalTraceryPlusPlus.g:2997:3: ( 'It' )
            {
             before(grammarAccess.getPronounsAccess().getValueItKeyword_2_0()); 
            // InternalTraceryPlusPlus.g:2998:3: ( 'It' )
            // InternalTraceryPlusPlus.g:2999:4: 'It'
            {
             before(grammarAccess.getPronounsAccess().getValueItKeyword_2_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getPronounsAccess().getValueItKeyword_2_0()); 

            }

             after(grammarAccess.getPronounsAccess().getValueItKeyword_2_0()); 

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
    // $ANTLR end "rule__Pronouns__ValueAssignment_2"


    // $ANTLR start "rule__Pronouns__ValueAssignment_3"
    // InternalTraceryPlusPlus.g:3010:1: rule__Pronouns__ValueAssignment_3 : ( ( 'They' ) ) ;
    public final void rule__Pronouns__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3014:1: ( ( ( 'They' ) ) )
            // InternalTraceryPlusPlus.g:3015:2: ( ( 'They' ) )
            {
            // InternalTraceryPlusPlus.g:3015:2: ( ( 'They' ) )
            // InternalTraceryPlusPlus.g:3016:3: ( 'They' )
            {
             before(grammarAccess.getPronounsAccess().getValueTheyKeyword_3_0()); 
            // InternalTraceryPlusPlus.g:3017:3: ( 'They' )
            // InternalTraceryPlusPlus.g:3018:4: 'They'
            {
             before(grammarAccess.getPronounsAccess().getValueTheyKeyword_3_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getPronounsAccess().getValueTheyKeyword_3_0()); 

            }

             after(grammarAccess.getPronounsAccess().getValueTheyKeyword_3_0()); 

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
    // $ANTLR end "rule__Pronouns__ValueAssignment_3"


    // $ANTLR start "rule__PronounIdentifier__NameAssignment"
    // InternalTraceryPlusPlus.g:3029:1: rule__PronounIdentifier__NameAssignment : ( ( rule__PronounIdentifier__NameAlternatives_0 ) ) ;
    public final void rule__PronounIdentifier__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3033:1: ( ( ( rule__PronounIdentifier__NameAlternatives_0 ) ) )
            // InternalTraceryPlusPlus.g:3034:2: ( ( rule__PronounIdentifier__NameAlternatives_0 ) )
            {
            // InternalTraceryPlusPlus.g:3034:2: ( ( rule__PronounIdentifier__NameAlternatives_0 ) )
            // InternalTraceryPlusPlus.g:3035:3: ( rule__PronounIdentifier__NameAlternatives_0 )
            {
             before(grammarAccess.getPronounIdentifierAccess().getNameAlternatives_0()); 
            // InternalTraceryPlusPlus.g:3036:3: ( rule__PronounIdentifier__NameAlternatives_0 )
            // InternalTraceryPlusPlus.g:3036:4: rule__PronounIdentifier__NameAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__PronounIdentifier__NameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPronounIdentifierAccess().getNameAlternatives_0()); 

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
    // $ANTLR end "rule__PronounIdentifier__NameAssignment"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\uffff\1\11\5\uffff\1\6\2\uffff";
    static final String dfa_3s = "\6\4\1\uffff\1\4\2\uffff";
    static final String dfa_4s = "\1\4\1\51\4\5\1\uffff\1\51\2\uffff";
    static final String dfa_5s = "\6\uffff\1\2\1\uffff\1\3\1\1";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\7\1\10\20\uffff\1\6\4\uffff\1\2\1\3\1\4\1\5\1\11\2\uffff\3\11\4\uffff\1\11",
            "\1\6\1\10",
            "\1\6\1\10",
            "\1\6\1\10",
            "\1\6\1\10",
            "",
            "\1\6\17\uffff\1\11\12\uffff\1\6\2\uffff\3\6\1\uffff\1\11\2\uffff\1\6",
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

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "890:1: rule__Attribute__Alternatives : ( ( ruleJustNameAttribute ) | ( ruleNameExistingListAttribute ) | ( ruleNameValueAttribute ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000020000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000078000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000004000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000078000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000C0010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000F00000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000040078000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000000F802L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000078400010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080007800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000380000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000C80000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000C80000002L});

}