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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.capitalize'", "'.CAPITALIZE'", "'.s'", "'.a'", "'.ed'", "'is'", "'are'", "'a'", "'an'", "'He'", "'She'", "'It'", "'They'", "'has'", "'have'", "'='", "':'", "'-'", "','", "'or'", "'and'", "'The'", "'story:'", "'can'", "'values'", "'be'", "'There'", "'attributes'", "'.'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
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


    // $ANTLR start "entryRuleEVarr"
    // InternalTraceryPlusPlus.g:303:1: entryRuleEVarr : ruleEVarr EOF ;
    public final void entryRuleEVarr() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:304:1: ( ruleEVarr EOF )
            // InternalTraceryPlusPlus.g:305:1: ruleEVarr EOF
            {
             before(grammarAccess.getEVarrRule()); 
            pushFollow(FOLLOW_1);
            ruleEVarr();

            state._fsp--;

             after(grammarAccess.getEVarrRule()); 
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
    // $ANTLR end "entryRuleEVarr"


    // $ANTLR start "ruleEVarr"
    // InternalTraceryPlusPlus.g:312:1: ruleEVarr : ( RULE_ID ) ;
    public final void ruleEVarr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:316:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:317:2: ( RULE_ID )
            {
            // InternalTraceryPlusPlus.g:317:2: ( RULE_ID )
            // InternalTraceryPlusPlus.g:318:3: RULE_ID
            {
             before(grammarAccess.getEVarrAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEVarrAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEVarr"


    // $ANTLR start "entryRuleExistingVariable"
    // InternalTraceryPlusPlus.g:328:1: entryRuleExistingVariable : ruleExistingVariable EOF ;
    public final void entryRuleExistingVariable() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:329:1: ( ruleExistingVariable EOF )
            // InternalTraceryPlusPlus.g:330:1: ruleExistingVariable EOF
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
    // InternalTraceryPlusPlus.g:337:1: ruleExistingVariable : ( ( rule__ExistingVariable__PointerAssignment ) ) ;
    public final void ruleExistingVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:341:2: ( ( ( rule__ExistingVariable__PointerAssignment ) ) )
            // InternalTraceryPlusPlus.g:342:2: ( ( rule__ExistingVariable__PointerAssignment ) )
            {
            // InternalTraceryPlusPlus.g:342:2: ( ( rule__ExistingVariable__PointerAssignment ) )
            // InternalTraceryPlusPlus.g:343:3: ( rule__ExistingVariable__PointerAssignment )
            {
             before(grammarAccess.getExistingVariableAccess().getPointerAssignment()); 
            // InternalTraceryPlusPlus.g:344:3: ( rule__ExistingVariable__PointerAssignment )
            // InternalTraceryPlusPlus.g:344:4: rule__ExistingVariable__PointerAssignment
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


    // $ANTLR start "entryRuleObjectAttribute"
    // InternalTraceryPlusPlus.g:353:1: entryRuleObjectAttribute : ruleObjectAttribute EOF ;
    public final void entryRuleObjectAttribute() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:354:1: ( ruleObjectAttribute EOF )
            // InternalTraceryPlusPlus.g:355:1: ruleObjectAttribute EOF
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
    // InternalTraceryPlusPlus.g:362:1: ruleObjectAttribute : ( ( rule__ObjectAttribute__Group__0 ) ) ;
    public final void ruleObjectAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:366:2: ( ( ( rule__ObjectAttribute__Group__0 ) ) )
            // InternalTraceryPlusPlus.g:367:2: ( ( rule__ObjectAttribute__Group__0 ) )
            {
            // InternalTraceryPlusPlus.g:367:2: ( ( rule__ObjectAttribute__Group__0 ) )
            // InternalTraceryPlusPlus.g:368:3: ( rule__ObjectAttribute__Group__0 )
            {
             before(grammarAccess.getObjectAttributeAccess().getGroup()); 
            // InternalTraceryPlusPlus.g:369:3: ( rule__ObjectAttribute__Group__0 )
            // InternalTraceryPlusPlus.g:369:4: rule__ObjectAttribute__Group__0
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
    // InternalTraceryPlusPlus.g:378:1: entryRuleWordList : ruleWordList EOF ;
    public final void entryRuleWordList() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:379:1: ( ruleWordList EOF )
            // InternalTraceryPlusPlus.g:380:1: ruleWordList EOF
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
    // InternalTraceryPlusPlus.g:387:1: ruleWordList : ( ( rule__WordList__Group__0 ) ) ;
    public final void ruleWordList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:391:2: ( ( ( rule__WordList__Group__0 ) ) )
            // InternalTraceryPlusPlus.g:392:2: ( ( rule__WordList__Group__0 ) )
            {
            // InternalTraceryPlusPlus.g:392:2: ( ( rule__WordList__Group__0 ) )
            // InternalTraceryPlusPlus.g:393:3: ( rule__WordList__Group__0 )
            {
             before(grammarAccess.getWordListAccess().getGroup()); 
            // InternalTraceryPlusPlus.g:394:3: ( rule__WordList__Group__0 )
            // InternalTraceryPlusPlus.g:394:4: rule__WordList__Group__0
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
    // InternalTraceryPlusPlus.g:403:1: entryRuleAttributeList : ruleAttributeList EOF ;
    public final void entryRuleAttributeList() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:404:1: ( ruleAttributeList EOF )
            // InternalTraceryPlusPlus.g:405:1: ruleAttributeList EOF
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
    // InternalTraceryPlusPlus.g:412:1: ruleAttributeList : ( ( rule__AttributeList__Group__0 ) ) ;
    public final void ruleAttributeList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:416:2: ( ( ( rule__AttributeList__Group__0 ) ) )
            // InternalTraceryPlusPlus.g:417:2: ( ( rule__AttributeList__Group__0 ) )
            {
            // InternalTraceryPlusPlus.g:417:2: ( ( rule__AttributeList__Group__0 ) )
            // InternalTraceryPlusPlus.g:418:3: ( rule__AttributeList__Group__0 )
            {
             before(grammarAccess.getAttributeListAccess().getGroup()); 
            // InternalTraceryPlusPlus.g:419:3: ( rule__AttributeList__Group__0 )
            // InternalTraceryPlusPlus.g:419:4: rule__AttributeList__Group__0
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
    // InternalTraceryPlusPlus.g:428:1: entryRuleModifier : ruleModifier EOF ;
    public final void entryRuleModifier() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:429:1: ( ruleModifier EOF )
            // InternalTraceryPlusPlus.g:430:1: ruleModifier EOF
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
    // InternalTraceryPlusPlus.g:437:1: ruleModifier : ( ( rule__Modifier__Alternatives ) ) ;
    public final void ruleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:441:2: ( ( ( rule__Modifier__Alternatives ) ) )
            // InternalTraceryPlusPlus.g:442:2: ( ( rule__Modifier__Alternatives ) )
            {
            // InternalTraceryPlusPlus.g:442:2: ( ( rule__Modifier__Alternatives ) )
            // InternalTraceryPlusPlus.g:443:3: ( rule__Modifier__Alternatives )
            {
             before(grammarAccess.getModifierAccess().getAlternatives()); 
            // InternalTraceryPlusPlus.g:444:3: ( rule__Modifier__Alternatives )
            // InternalTraceryPlusPlus.g:444:4: rule__Modifier__Alternatives
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
    // InternalTraceryPlusPlus.g:453:1: entryRuleCapitalizationModifier : ruleCapitalizationModifier EOF ;
    public final void entryRuleCapitalizationModifier() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:454:1: ( ruleCapitalizationModifier EOF )
            // InternalTraceryPlusPlus.g:455:1: ruleCapitalizationModifier EOF
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
    // InternalTraceryPlusPlus.g:462:1: ruleCapitalizationModifier : ( '.capitalize' ) ;
    public final void ruleCapitalizationModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:466:2: ( ( '.capitalize' ) )
            // InternalTraceryPlusPlus.g:467:2: ( '.capitalize' )
            {
            // InternalTraceryPlusPlus.g:467:2: ( '.capitalize' )
            // InternalTraceryPlusPlus.g:468:3: '.capitalize'
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
    // InternalTraceryPlusPlus.g:478:1: entryRuleFullCapitalizationModifier : ruleFullCapitalizationModifier EOF ;
    public final void entryRuleFullCapitalizationModifier() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:479:1: ( ruleFullCapitalizationModifier EOF )
            // InternalTraceryPlusPlus.g:480:1: ruleFullCapitalizationModifier EOF
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
    // InternalTraceryPlusPlus.g:487:1: ruleFullCapitalizationModifier : ( '.CAPITALIZE' ) ;
    public final void ruleFullCapitalizationModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:491:2: ( ( '.CAPITALIZE' ) )
            // InternalTraceryPlusPlus.g:492:2: ( '.CAPITALIZE' )
            {
            // InternalTraceryPlusPlus.g:492:2: ( '.CAPITALIZE' )
            // InternalTraceryPlusPlus.g:493:3: '.CAPITALIZE'
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
    // InternalTraceryPlusPlus.g:503:1: entryRulePluralityModifier : rulePluralityModifier EOF ;
    public final void entryRulePluralityModifier() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:504:1: ( rulePluralityModifier EOF )
            // InternalTraceryPlusPlus.g:505:1: rulePluralityModifier EOF
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
    // InternalTraceryPlusPlus.g:512:1: rulePluralityModifier : ( '.s' ) ;
    public final void rulePluralityModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:516:2: ( ( '.s' ) )
            // InternalTraceryPlusPlus.g:517:2: ( '.s' )
            {
            // InternalTraceryPlusPlus.g:517:2: ( '.s' )
            // InternalTraceryPlusPlus.g:518:3: '.s'
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
    // InternalTraceryPlusPlus.g:528:1: entryRuleArticleModifier : ruleArticleModifier EOF ;
    public final void entryRuleArticleModifier() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:529:1: ( ruleArticleModifier EOF )
            // InternalTraceryPlusPlus.g:530:1: ruleArticleModifier EOF
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
    // InternalTraceryPlusPlus.g:537:1: ruleArticleModifier : ( '.a' ) ;
    public final void ruleArticleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:541:2: ( ( '.a' ) )
            // InternalTraceryPlusPlus.g:542:2: ( '.a' )
            {
            // InternalTraceryPlusPlus.g:542:2: ( '.a' )
            // InternalTraceryPlusPlus.g:543:3: '.a'
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
    // InternalTraceryPlusPlus.g:553:1: entryRulePastTenseModifier : rulePastTenseModifier EOF ;
    public final void entryRulePastTenseModifier() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:554:1: ( rulePastTenseModifier EOF )
            // InternalTraceryPlusPlus.g:555:1: rulePastTenseModifier EOF
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
    // InternalTraceryPlusPlus.g:562:1: rulePastTenseModifier : ( '.ed' ) ;
    public final void rulePastTenseModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:566:2: ( ( '.ed' ) )
            // InternalTraceryPlusPlus.g:567:2: ( '.ed' )
            {
            // InternalTraceryPlusPlus.g:567:2: ( '.ed' )
            // InternalTraceryPlusPlus.g:568:3: '.ed'
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
    // InternalTraceryPlusPlus.g:578:1: entryRuleAssignmentOperator : ruleAssignmentOperator EOF ;
    public final void entryRuleAssignmentOperator() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:579:1: ( ruleAssignmentOperator EOF )
            // InternalTraceryPlusPlus.g:580:1: ruleAssignmentOperator EOF
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
    // InternalTraceryPlusPlus.g:587:1: ruleAssignmentOperator : ( ( rule__AssignmentOperator__Alternatives ) ) ;
    public final void ruleAssignmentOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:591:2: ( ( ( rule__AssignmentOperator__Alternatives ) ) )
            // InternalTraceryPlusPlus.g:592:2: ( ( rule__AssignmentOperator__Alternatives ) )
            {
            // InternalTraceryPlusPlus.g:592:2: ( ( rule__AssignmentOperator__Alternatives ) )
            // InternalTraceryPlusPlus.g:593:3: ( rule__AssignmentOperator__Alternatives )
            {
             before(grammarAccess.getAssignmentOperatorAccess().getAlternatives()); 
            // InternalTraceryPlusPlus.g:594:3: ( rule__AssignmentOperator__Alternatives )
            // InternalTraceryPlusPlus.g:594:4: rule__AssignmentOperator__Alternatives
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
    // InternalTraceryPlusPlus.g:603:1: entryRuleSeparatorOr : ruleSeparatorOr EOF ;
    public final void entryRuleSeparatorOr() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:604:1: ( ruleSeparatorOr EOF )
            // InternalTraceryPlusPlus.g:605:1: ruleSeparatorOr EOF
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
    // InternalTraceryPlusPlus.g:612:1: ruleSeparatorOr : ( ( rule__SeparatorOr__Alternatives ) ) ;
    public final void ruleSeparatorOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:616:2: ( ( ( rule__SeparatorOr__Alternatives ) ) )
            // InternalTraceryPlusPlus.g:617:2: ( ( rule__SeparatorOr__Alternatives ) )
            {
            // InternalTraceryPlusPlus.g:617:2: ( ( rule__SeparatorOr__Alternatives ) )
            // InternalTraceryPlusPlus.g:618:3: ( rule__SeparatorOr__Alternatives )
            {
             before(grammarAccess.getSeparatorOrAccess().getAlternatives()); 
            // InternalTraceryPlusPlus.g:619:3: ( rule__SeparatorOr__Alternatives )
            // InternalTraceryPlusPlus.g:619:4: rule__SeparatorOr__Alternatives
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
    // InternalTraceryPlusPlus.g:628:1: entryRuleSeparatorAnd : ruleSeparatorAnd EOF ;
    public final void entryRuleSeparatorAnd() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:629:1: ( ruleSeparatorAnd EOF )
            // InternalTraceryPlusPlus.g:630:1: ruleSeparatorAnd EOF
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
    // InternalTraceryPlusPlus.g:637:1: ruleSeparatorAnd : ( ( rule__SeparatorAnd__Alternatives ) ) ;
    public final void ruleSeparatorAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:641:2: ( ( ( rule__SeparatorAnd__Alternatives ) ) )
            // InternalTraceryPlusPlus.g:642:2: ( ( rule__SeparatorAnd__Alternatives ) )
            {
            // InternalTraceryPlusPlus.g:642:2: ( ( rule__SeparatorAnd__Alternatives ) )
            // InternalTraceryPlusPlus.g:643:3: ( rule__SeparatorAnd__Alternatives )
            {
             before(grammarAccess.getSeparatorAndAccess().getAlternatives()); 
            // InternalTraceryPlusPlus.g:644:3: ( rule__SeparatorAnd__Alternatives )
            // InternalTraceryPlusPlus.g:644:4: rule__SeparatorAnd__Alternatives
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
    // InternalTraceryPlusPlus.g:652:1: rule__Declaration__Alternatives : ( ( ruleListDeclaration ) | ( ruleObjectDeclaration ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:656:1: ( ( ruleListDeclaration ) | ( ruleObjectDeclaration ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==37) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTraceryPlusPlus.g:657:2: ( ruleListDeclaration )
                    {
                    // InternalTraceryPlusPlus.g:657:2: ( ruleListDeclaration )
                    // InternalTraceryPlusPlus.g:658:3: ruleListDeclaration
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
                    // InternalTraceryPlusPlus.g:663:2: ( ruleObjectDeclaration )
                    {
                    // InternalTraceryPlusPlus.g:663:2: ( ruleObjectDeclaration )
                    // InternalTraceryPlusPlus.g:664:3: ruleObjectDeclaration
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
    // InternalTraceryPlusPlus.g:673:1: rule__Story__StoryAlternatives_3_0 : ( ( ruleWord ) | ( ruleStoryVariable ) | ( ruleObjectAttribute ) );
    public final void rule__Story__StoryAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:677:1: ( ( ruleWord ) | ( ruleStoryVariable ) | ( ruleObjectAttribute ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==39) ) {
                    alt2=3;
                }
                else if ( (LA2_2==EOF||(LA2_2>=RULE_ID && LA2_2<=RULE_STRING)||(LA2_2>=11 && LA2_2<=15)) ) {
                    alt2=2;
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
                    // InternalTraceryPlusPlus.g:678:2: ( ruleWord )
                    {
                    // InternalTraceryPlusPlus.g:678:2: ( ruleWord )
                    // InternalTraceryPlusPlus.g:679:3: ruleWord
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
                    // InternalTraceryPlusPlus.g:684:2: ( ruleStoryVariable )
                    {
                    // InternalTraceryPlusPlus.g:684:2: ( ruleStoryVariable )
                    // InternalTraceryPlusPlus.g:685:3: ruleStoryVariable
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
                    // InternalTraceryPlusPlus.g:690:2: ( ruleObjectAttribute )
                    {
                    // InternalTraceryPlusPlus.g:690:2: ( ruleObjectAttribute )
                    // InternalTraceryPlusPlus.g:691:3: ruleObjectAttribute
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
    // InternalTraceryPlusPlus.g:700:1: rule__ListDeclaration__Alternatives_1 : ( ( ( rule__ListDeclaration__Group_1_0__0 ) ) | ( ( rule__ListDeclaration__Group_1_1__0 ) ) );
    public final void rule__ListDeclaration__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:704:1: ( ( ( rule__ListDeclaration__Group_1_0__0 ) ) | ( ( rule__ListDeclaration__Group_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==34) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==25) ) {
                    alt3=1;
                }
                else if ( (LA3_1==36) ) {
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
                    // InternalTraceryPlusPlus.g:705:2: ( ( rule__ListDeclaration__Group_1_0__0 ) )
                    {
                    // InternalTraceryPlusPlus.g:705:2: ( ( rule__ListDeclaration__Group_1_0__0 ) )
                    // InternalTraceryPlusPlus.g:706:3: ( rule__ListDeclaration__Group_1_0__0 )
                    {
                     before(grammarAccess.getListDeclarationAccess().getGroup_1_0()); 
                    // InternalTraceryPlusPlus.g:707:3: ( rule__ListDeclaration__Group_1_0__0 )
                    // InternalTraceryPlusPlus.g:707:4: rule__ListDeclaration__Group_1_0__0
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
                    // InternalTraceryPlusPlus.g:711:2: ( ( rule__ListDeclaration__Group_1_1__0 ) )
                    {
                    // InternalTraceryPlusPlus.g:711:2: ( ( rule__ListDeclaration__Group_1_1__0 ) )
                    // InternalTraceryPlusPlus.g:712:3: ( rule__ListDeclaration__Group_1_1__0 )
                    {
                     before(grammarAccess.getListDeclarationAccess().getGroup_1_1()); 
                    // InternalTraceryPlusPlus.g:713:3: ( rule__ListDeclaration__Group_1_1__0 )
                    // InternalTraceryPlusPlus.g:713:4: rule__ListDeclaration__Group_1_1__0
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


    // $ANTLR start "rule__ObjectDeclaration__Alternatives_1"
    // InternalTraceryPlusPlus.g:721:1: rule__ObjectDeclaration__Alternatives_1 : ( ( 'is' ) | ( 'are' ) );
    public final void rule__ObjectDeclaration__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:725:1: ( ( 'is' ) | ( 'are' ) )
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
                    // InternalTraceryPlusPlus.g:726:2: ( 'is' )
                    {
                    // InternalTraceryPlusPlus.g:726:2: ( 'is' )
                    // InternalTraceryPlusPlus.g:727:3: 'is'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getIsKeyword_1_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getObjectDeclarationAccess().getIsKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:732:2: ( 'are' )
                    {
                    // InternalTraceryPlusPlus.g:732:2: ( 'are' )
                    // InternalTraceryPlusPlus.g:733:3: 'are'
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
    // InternalTraceryPlusPlus.g:742:1: rule__ObjectDeclaration__Alternatives_2 : ( ( 'a' ) | ( 'an' ) );
    public final void rule__ObjectDeclaration__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:746:1: ( ( 'a' ) | ( 'an' ) )
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
                    // InternalTraceryPlusPlus.g:747:2: ( 'a' )
                    {
                    // InternalTraceryPlusPlus.g:747:2: ( 'a' )
                    // InternalTraceryPlusPlus.g:748:3: 'a'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getAKeyword_2_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getObjectDeclarationAccess().getAKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:753:2: ( 'an' )
                    {
                    // InternalTraceryPlusPlus.g:753:2: ( 'an' )
                    // InternalTraceryPlusPlus.g:754:3: 'an'
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


    // $ANTLR start "rule__ObjectDeclaration__Alternatives_4"
    // InternalTraceryPlusPlus.g:763:1: rule__ObjectDeclaration__Alternatives_4 : ( ( 'He' ) | ( 'She' ) | ( 'It' ) | ( 'They' ) );
    public final void rule__ObjectDeclaration__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:767:1: ( ( 'He' ) | ( 'She' ) | ( 'It' ) | ( 'They' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt6=1;
                }
                break;
            case 21:
                {
                alt6=2;
                }
                break;
            case 22:
                {
                alt6=3;
                }
                break;
            case 23:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalTraceryPlusPlus.g:768:2: ( 'He' )
                    {
                    // InternalTraceryPlusPlus.g:768:2: ( 'He' )
                    // InternalTraceryPlusPlus.g:769:3: 'He'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getHeKeyword_4_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getObjectDeclarationAccess().getHeKeyword_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:774:2: ( 'She' )
                    {
                    // InternalTraceryPlusPlus.g:774:2: ( 'She' )
                    // InternalTraceryPlusPlus.g:775:3: 'She'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getSheKeyword_4_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getObjectDeclarationAccess().getSheKeyword_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:780:2: ( 'It' )
                    {
                    // InternalTraceryPlusPlus.g:780:2: ( 'It' )
                    // InternalTraceryPlusPlus.g:781:3: 'It'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getItKeyword_4_2()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getObjectDeclarationAccess().getItKeyword_4_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTraceryPlusPlus.g:786:2: ( 'They' )
                    {
                    // InternalTraceryPlusPlus.g:786:2: ( 'They' )
                    // InternalTraceryPlusPlus.g:787:3: 'They'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getTheyKeyword_4_3()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getObjectDeclarationAccess().getTheyKeyword_4_3()); 

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
    // $ANTLR end "rule__ObjectDeclaration__Alternatives_4"


    // $ANTLR start "rule__ObjectDeclaration__Alternatives_5"
    // InternalTraceryPlusPlus.g:796:1: rule__ObjectDeclaration__Alternatives_5 : ( ( 'has' ) | ( 'have' ) );
    public final void rule__ObjectDeclaration__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:800:1: ( ( 'has' ) | ( 'have' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            else if ( (LA7_0==25) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTraceryPlusPlus.g:801:2: ( 'has' )
                    {
                    // InternalTraceryPlusPlus.g:801:2: ( 'has' )
                    // InternalTraceryPlusPlus.g:802:3: 'has'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getHasKeyword_5_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getObjectDeclarationAccess().getHasKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:807:2: ( 'have' )
                    {
                    // InternalTraceryPlusPlus.g:807:2: ( 'have' )
                    // InternalTraceryPlusPlus.g:808:3: 'have'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getHaveKeyword_5_1()); 
                    match(input,25,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:817:1: rule__Attribute__Alternatives : ( ( ( rule__Attribute__NameAssignment_0 ) ) | ( ( rule__Attribute__Group_1__0 ) ) | ( ( rule__Attribute__Group_2__0 ) ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:821:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) | ( ( rule__Attribute__Group_1__0 ) ) | ( ( rule__Attribute__Group_2__0 ) ) )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 26:
                    {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==RULE_STRING) ) {
                        alt8=2;
                    }
                    else if ( (LA8_2==RULE_ID) ) {
                        alt8=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 27:
                    {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3==RULE_ID) ) {
                        alt8=3;
                    }
                    else if ( (LA8_3==RULE_STRING) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 28:
                    {
                    int LA8_4 = input.LA(3);

                    if ( (LA8_4==RULE_STRING) ) {
                        alt8=2;
                    }
                    else if ( (LA8_4==RULE_ID) ) {
                        alt8=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_ID:
                case 29:
                case 31:
                case 32:
                case 37:
                    {
                    alt8=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTraceryPlusPlus.g:822:2: ( ( rule__Attribute__NameAssignment_0 ) )
                    {
                    // InternalTraceryPlusPlus.g:822:2: ( ( rule__Attribute__NameAssignment_0 ) )
                    // InternalTraceryPlusPlus.g:823:3: ( rule__Attribute__NameAssignment_0 )
                    {
                     before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
                    // InternalTraceryPlusPlus.g:824:3: ( rule__Attribute__NameAssignment_0 )
                    // InternalTraceryPlusPlus.g:824:4: rule__Attribute__NameAssignment_0
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
                    // InternalTraceryPlusPlus.g:828:2: ( ( rule__Attribute__Group_1__0 ) )
                    {
                    // InternalTraceryPlusPlus.g:828:2: ( ( rule__Attribute__Group_1__0 ) )
                    // InternalTraceryPlusPlus.g:829:3: ( rule__Attribute__Group_1__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_1()); 
                    // InternalTraceryPlusPlus.g:830:3: ( rule__Attribute__Group_1__0 )
                    // InternalTraceryPlusPlus.g:830:4: rule__Attribute__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:834:2: ( ( rule__Attribute__Group_2__0 ) )
                    {
                    // InternalTraceryPlusPlus.g:834:2: ( ( rule__Attribute__Group_2__0 ) )
                    // InternalTraceryPlusPlus.g:835:3: ( rule__Attribute__Group_2__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_2()); 
                    // InternalTraceryPlusPlus.g:836:3: ( rule__Attribute__Group_2__0 )
                    // InternalTraceryPlusPlus.g:836:4: rule__Attribute__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getGroup_2()); 

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
    // InternalTraceryPlusPlus.g:844:1: rule__Modifier__Alternatives : ( ( ruleCapitalizationModifier ) | ( ruleFullCapitalizationModifier ) | ( rulePluralityModifier ) | ( ruleArticleModifier ) | ( rulePastTenseModifier ) );
    public final void rule__Modifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:848:1: ( ( ruleCapitalizationModifier ) | ( ruleFullCapitalizationModifier ) | ( rulePluralityModifier ) | ( ruleArticleModifier ) | ( rulePastTenseModifier ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt9=1;
                }
                break;
            case 12:
                {
                alt9=2;
                }
                break;
            case 13:
                {
                alt9=3;
                }
                break;
            case 14:
                {
                alt9=4;
                }
                break;
            case 15:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalTraceryPlusPlus.g:849:2: ( ruleCapitalizationModifier )
                    {
                    // InternalTraceryPlusPlus.g:849:2: ( ruleCapitalizationModifier )
                    // InternalTraceryPlusPlus.g:850:3: ruleCapitalizationModifier
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
                    // InternalTraceryPlusPlus.g:855:2: ( ruleFullCapitalizationModifier )
                    {
                    // InternalTraceryPlusPlus.g:855:2: ( ruleFullCapitalizationModifier )
                    // InternalTraceryPlusPlus.g:856:3: ruleFullCapitalizationModifier
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
                    // InternalTraceryPlusPlus.g:861:2: ( rulePluralityModifier )
                    {
                    // InternalTraceryPlusPlus.g:861:2: ( rulePluralityModifier )
                    // InternalTraceryPlusPlus.g:862:3: rulePluralityModifier
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
                    // InternalTraceryPlusPlus.g:867:2: ( ruleArticleModifier )
                    {
                    // InternalTraceryPlusPlus.g:867:2: ( ruleArticleModifier )
                    // InternalTraceryPlusPlus.g:868:3: ruleArticleModifier
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
                    // InternalTraceryPlusPlus.g:873:2: ( rulePastTenseModifier )
                    {
                    // InternalTraceryPlusPlus.g:873:2: ( rulePastTenseModifier )
                    // InternalTraceryPlusPlus.g:874:3: rulePastTenseModifier
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
    // InternalTraceryPlusPlus.g:883:1: rule__AssignmentOperator__Alternatives : ( ( '=' ) | ( ':' ) | ( '-' ) );
    public final void rule__AssignmentOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:887:1: ( ( '=' ) | ( ':' ) | ( '-' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt10=1;
                }
                break;
            case 27:
                {
                alt10=2;
                }
                break;
            case 28:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalTraceryPlusPlus.g:888:2: ( '=' )
                    {
                    // InternalTraceryPlusPlus.g:888:2: ( '=' )
                    // InternalTraceryPlusPlus.g:889:3: '='
                    {
                     before(grammarAccess.getAssignmentOperatorAccess().getEqualsSignKeyword_0()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getAssignmentOperatorAccess().getEqualsSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:894:2: ( ':' )
                    {
                    // InternalTraceryPlusPlus.g:894:2: ( ':' )
                    // InternalTraceryPlusPlus.g:895:3: ':'
                    {
                     before(grammarAccess.getAssignmentOperatorAccess().getColonKeyword_1()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getAssignmentOperatorAccess().getColonKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:900:2: ( '-' )
                    {
                    // InternalTraceryPlusPlus.g:900:2: ( '-' )
                    // InternalTraceryPlusPlus.g:901:3: '-'
                    {
                     before(grammarAccess.getAssignmentOperatorAccess().getHyphenMinusKeyword_2()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getAssignmentOperatorAccess().getHyphenMinusKeyword_2()); 

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
    // InternalTraceryPlusPlus.g:910:1: rule__SeparatorOr__Alternatives : ( ( ',' ) | ( 'or' ) );
    public final void rule__SeparatorOr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:914:1: ( ( ',' ) | ( 'or' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            else if ( (LA11_0==30) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalTraceryPlusPlus.g:915:2: ( ',' )
                    {
                    // InternalTraceryPlusPlus.g:915:2: ( ',' )
                    // InternalTraceryPlusPlus.g:916:3: ','
                    {
                     before(grammarAccess.getSeparatorOrAccess().getCommaKeyword_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getSeparatorOrAccess().getCommaKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:921:2: ( 'or' )
                    {
                    // InternalTraceryPlusPlus.g:921:2: ( 'or' )
                    // InternalTraceryPlusPlus.g:922:3: 'or'
                    {
                     before(grammarAccess.getSeparatorOrAccess().getOrKeyword_1()); 
                    match(input,30,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:931:1: rule__SeparatorAnd__Alternatives : ( ( ',' ) | ( 'and' ) );
    public final void rule__SeparatorAnd__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:935:1: ( ( ',' ) | ( 'and' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            else if ( (LA12_0==31) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalTraceryPlusPlus.g:936:2: ( ',' )
                    {
                    // InternalTraceryPlusPlus.g:936:2: ( ',' )
                    // InternalTraceryPlusPlus.g:937:3: ','
                    {
                     before(grammarAccess.getSeparatorAndAccess().getCommaKeyword_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getSeparatorAndAccess().getCommaKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:942:2: ( 'and' )
                    {
                    // InternalTraceryPlusPlus.g:942:2: ( 'and' )
                    // InternalTraceryPlusPlus.g:943:3: 'and'
                    {
                     before(grammarAccess.getSeparatorAndAccess().getAndKeyword_1()); 
                    match(input,31,FOLLOW_2); 
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


    // $ANTLR start "rule__TraceryPlusPlusProgram__Group__0"
    // InternalTraceryPlusPlus.g:952:1: rule__TraceryPlusPlusProgram__Group__0 : rule__TraceryPlusPlusProgram__Group__0__Impl rule__TraceryPlusPlusProgram__Group__1 ;
    public final void rule__TraceryPlusPlusProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:956:1: ( rule__TraceryPlusPlusProgram__Group__0__Impl rule__TraceryPlusPlusProgram__Group__1 )
            // InternalTraceryPlusPlus.g:957:2: rule__TraceryPlusPlusProgram__Group__0__Impl rule__TraceryPlusPlusProgram__Group__1
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
    // InternalTraceryPlusPlus.g:964:1: rule__TraceryPlusPlusProgram__Group__0__Impl : ( ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )* ) ;
    public final void rule__TraceryPlusPlusProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:968:1: ( ( ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )* ) )
            // InternalTraceryPlusPlus.g:969:1: ( ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )* )
            {
            // InternalTraceryPlusPlus.g:969:1: ( ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )* )
            // InternalTraceryPlusPlus.g:970:2: ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )*
            {
             before(grammarAccess.getTraceryPlusPlusProgramAccess().getStatementsAssignment_0()); 
            // InternalTraceryPlusPlus.g:971:2: ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==37) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:971:3: rule__TraceryPlusPlusProgram__StatementsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__TraceryPlusPlusProgram__StatementsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalTraceryPlusPlus.g:979:1: rule__TraceryPlusPlusProgram__Group__1 : rule__TraceryPlusPlusProgram__Group__1__Impl ;
    public final void rule__TraceryPlusPlusProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:983:1: ( rule__TraceryPlusPlusProgram__Group__1__Impl )
            // InternalTraceryPlusPlus.g:984:2: rule__TraceryPlusPlusProgram__Group__1__Impl
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
    // InternalTraceryPlusPlus.g:990:1: rule__TraceryPlusPlusProgram__Group__1__Impl : ( ( rule__TraceryPlusPlusProgram__StoryAssignment_1 ) ) ;
    public final void rule__TraceryPlusPlusProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:994:1: ( ( ( rule__TraceryPlusPlusProgram__StoryAssignment_1 ) ) )
            // InternalTraceryPlusPlus.g:995:1: ( ( rule__TraceryPlusPlusProgram__StoryAssignment_1 ) )
            {
            // InternalTraceryPlusPlus.g:995:1: ( ( rule__TraceryPlusPlusProgram__StoryAssignment_1 ) )
            // InternalTraceryPlusPlus.g:996:2: ( rule__TraceryPlusPlusProgram__StoryAssignment_1 )
            {
             before(grammarAccess.getTraceryPlusPlusProgramAccess().getStoryAssignment_1()); 
            // InternalTraceryPlusPlus.g:997:2: ( rule__TraceryPlusPlusProgram__StoryAssignment_1 )
            // InternalTraceryPlusPlus.g:997:3: rule__TraceryPlusPlusProgram__StoryAssignment_1
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
    // InternalTraceryPlusPlus.g:1006:1: rule__Story__Group__0 : rule__Story__Group__0__Impl rule__Story__Group__1 ;
    public final void rule__Story__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1010:1: ( rule__Story__Group__0__Impl rule__Story__Group__1 )
            // InternalTraceryPlusPlus.g:1011:2: rule__Story__Group__0__Impl rule__Story__Group__1
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
    // InternalTraceryPlusPlus.g:1018:1: rule__Story__Group__0__Impl : ( () ) ;
    public final void rule__Story__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1022:1: ( ( () ) )
            // InternalTraceryPlusPlus.g:1023:1: ( () )
            {
            // InternalTraceryPlusPlus.g:1023:1: ( () )
            // InternalTraceryPlusPlus.g:1024:2: ()
            {
             before(grammarAccess.getStoryAccess().getStoryAction_0()); 
            // InternalTraceryPlusPlus.g:1025:2: ()
            // InternalTraceryPlusPlus.g:1025:3: 
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
    // InternalTraceryPlusPlus.g:1033:1: rule__Story__Group__1 : rule__Story__Group__1__Impl rule__Story__Group__2 ;
    public final void rule__Story__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1037:1: ( rule__Story__Group__1__Impl rule__Story__Group__2 )
            // InternalTraceryPlusPlus.g:1038:2: rule__Story__Group__1__Impl rule__Story__Group__2
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
    // InternalTraceryPlusPlus.g:1045:1: rule__Story__Group__1__Impl : ( 'The' ) ;
    public final void rule__Story__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1049:1: ( ( 'The' ) )
            // InternalTraceryPlusPlus.g:1050:1: ( 'The' )
            {
            // InternalTraceryPlusPlus.g:1050:1: ( 'The' )
            // InternalTraceryPlusPlus.g:1051:2: 'The'
            {
             before(grammarAccess.getStoryAccess().getTheKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1060:1: rule__Story__Group__2 : rule__Story__Group__2__Impl rule__Story__Group__3 ;
    public final void rule__Story__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1064:1: ( rule__Story__Group__2__Impl rule__Story__Group__3 )
            // InternalTraceryPlusPlus.g:1065:2: rule__Story__Group__2__Impl rule__Story__Group__3
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
    // InternalTraceryPlusPlus.g:1072:1: rule__Story__Group__2__Impl : ( 'story:' ) ;
    public final void rule__Story__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1076:1: ( ( 'story:' ) )
            // InternalTraceryPlusPlus.g:1077:1: ( 'story:' )
            {
            // InternalTraceryPlusPlus.g:1077:1: ( 'story:' )
            // InternalTraceryPlusPlus.g:1078:2: 'story:'
            {
             before(grammarAccess.getStoryAccess().getStoryKeyword_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1087:1: rule__Story__Group__3 : rule__Story__Group__3__Impl ;
    public final void rule__Story__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1091:1: ( rule__Story__Group__3__Impl )
            // InternalTraceryPlusPlus.g:1092:2: rule__Story__Group__3__Impl
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
    // InternalTraceryPlusPlus.g:1098:1: rule__Story__Group__3__Impl : ( ( rule__Story__StoryAssignment_3 )* ) ;
    public final void rule__Story__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1102:1: ( ( ( rule__Story__StoryAssignment_3 )* ) )
            // InternalTraceryPlusPlus.g:1103:1: ( ( rule__Story__StoryAssignment_3 )* )
            {
            // InternalTraceryPlusPlus.g:1103:1: ( ( rule__Story__StoryAssignment_3 )* )
            // InternalTraceryPlusPlus.g:1104:2: ( rule__Story__StoryAssignment_3 )*
            {
             before(grammarAccess.getStoryAccess().getStoryAssignment_3()); 
            // InternalTraceryPlusPlus.g:1105:2: ( rule__Story__StoryAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_STRING)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1105:3: rule__Story__StoryAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Story__StoryAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalTraceryPlusPlus.g:1114:1: rule__ListDeclaration__Group__0 : rule__ListDeclaration__Group__0__Impl rule__ListDeclaration__Group__1 ;
    public final void rule__ListDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1118:1: ( rule__ListDeclaration__Group__0__Impl rule__ListDeclaration__Group__1 )
            // InternalTraceryPlusPlus.g:1119:2: rule__ListDeclaration__Group__0__Impl rule__ListDeclaration__Group__1
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
    // InternalTraceryPlusPlus.g:1126:1: rule__ListDeclaration__Group__0__Impl : ( ( rule__ListDeclaration__NameAssignment_0 ) ) ;
    public final void rule__ListDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1130:1: ( ( ( rule__ListDeclaration__NameAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:1131:1: ( ( rule__ListDeclaration__NameAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:1131:1: ( ( rule__ListDeclaration__NameAssignment_0 ) )
            // InternalTraceryPlusPlus.g:1132:2: ( rule__ListDeclaration__NameAssignment_0 )
            {
             before(grammarAccess.getListDeclarationAccess().getNameAssignment_0()); 
            // InternalTraceryPlusPlus.g:1133:2: ( rule__ListDeclaration__NameAssignment_0 )
            // InternalTraceryPlusPlus.g:1133:3: rule__ListDeclaration__NameAssignment_0
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
    // InternalTraceryPlusPlus.g:1141:1: rule__ListDeclaration__Group__1 : rule__ListDeclaration__Group__1__Impl rule__ListDeclaration__Group__2 ;
    public final void rule__ListDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1145:1: ( rule__ListDeclaration__Group__1__Impl rule__ListDeclaration__Group__2 )
            // InternalTraceryPlusPlus.g:1146:2: rule__ListDeclaration__Group__1__Impl rule__ListDeclaration__Group__2
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
    // InternalTraceryPlusPlus.g:1153:1: rule__ListDeclaration__Group__1__Impl : ( ( rule__ListDeclaration__Alternatives_1 ) ) ;
    public final void rule__ListDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1157:1: ( ( ( rule__ListDeclaration__Alternatives_1 ) ) )
            // InternalTraceryPlusPlus.g:1158:1: ( ( rule__ListDeclaration__Alternatives_1 ) )
            {
            // InternalTraceryPlusPlus.g:1158:1: ( ( rule__ListDeclaration__Alternatives_1 ) )
            // InternalTraceryPlusPlus.g:1159:2: ( rule__ListDeclaration__Alternatives_1 )
            {
             before(grammarAccess.getListDeclarationAccess().getAlternatives_1()); 
            // InternalTraceryPlusPlus.g:1160:2: ( rule__ListDeclaration__Alternatives_1 )
            // InternalTraceryPlusPlus.g:1160:3: rule__ListDeclaration__Alternatives_1
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
    // InternalTraceryPlusPlus.g:1168:1: rule__ListDeclaration__Group__2 : rule__ListDeclaration__Group__2__Impl rule__ListDeclaration__Group__3 ;
    public final void rule__ListDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1172:1: ( rule__ListDeclaration__Group__2__Impl rule__ListDeclaration__Group__3 )
            // InternalTraceryPlusPlus.g:1173:2: rule__ListDeclaration__Group__2__Impl rule__ListDeclaration__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalTraceryPlusPlus.g:1180:1: rule__ListDeclaration__Group__2__Impl : ( ruleAssignmentOperator ) ;
    public final void rule__ListDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1184:1: ( ( ruleAssignmentOperator ) )
            // InternalTraceryPlusPlus.g:1185:1: ( ruleAssignmentOperator )
            {
            // InternalTraceryPlusPlus.g:1185:1: ( ruleAssignmentOperator )
            // InternalTraceryPlusPlus.g:1186:2: ruleAssignmentOperator
            {
             before(grammarAccess.getListDeclarationAccess().getAssignmentOperatorParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleAssignmentOperator();

            state._fsp--;

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
    // InternalTraceryPlusPlus.g:1195:1: rule__ListDeclaration__Group__3 : rule__ListDeclaration__Group__3__Impl ;
    public final void rule__ListDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1199:1: ( rule__ListDeclaration__Group__3__Impl )
            // InternalTraceryPlusPlus.g:1200:2: rule__ListDeclaration__Group__3__Impl
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
    // InternalTraceryPlusPlus.g:1206:1: rule__ListDeclaration__Group__3__Impl : ( ( rule__ListDeclaration__ListAssignment_3 ) ) ;
    public final void rule__ListDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1210:1: ( ( ( rule__ListDeclaration__ListAssignment_3 ) ) )
            // InternalTraceryPlusPlus.g:1211:1: ( ( rule__ListDeclaration__ListAssignment_3 ) )
            {
            // InternalTraceryPlusPlus.g:1211:1: ( ( rule__ListDeclaration__ListAssignment_3 ) )
            // InternalTraceryPlusPlus.g:1212:2: ( rule__ListDeclaration__ListAssignment_3 )
            {
             before(grammarAccess.getListDeclarationAccess().getListAssignment_3()); 
            // InternalTraceryPlusPlus.g:1213:2: ( rule__ListDeclaration__ListAssignment_3 )
            // InternalTraceryPlusPlus.g:1213:3: rule__ListDeclaration__ListAssignment_3
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
    // InternalTraceryPlusPlus.g:1222:1: rule__ListDeclaration__Group_1_0__0 : rule__ListDeclaration__Group_1_0__0__Impl rule__ListDeclaration__Group_1_0__1 ;
    public final void rule__ListDeclaration__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1226:1: ( rule__ListDeclaration__Group_1_0__0__Impl rule__ListDeclaration__Group_1_0__1 )
            // InternalTraceryPlusPlus.g:1227:2: rule__ListDeclaration__Group_1_0__0__Impl rule__ListDeclaration__Group_1_0__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalTraceryPlusPlus.g:1234:1: rule__ListDeclaration__Group_1_0__0__Impl : ( 'can' ) ;
    public final void rule__ListDeclaration__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1238:1: ( ( 'can' ) )
            // InternalTraceryPlusPlus.g:1239:1: ( 'can' )
            {
            // InternalTraceryPlusPlus.g:1239:1: ( 'can' )
            // InternalTraceryPlusPlus.g:1240:2: 'can'
            {
             before(grammarAccess.getListDeclarationAccess().getCanKeyword_1_0_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1249:1: rule__ListDeclaration__Group_1_0__1 : rule__ListDeclaration__Group_1_0__1__Impl rule__ListDeclaration__Group_1_0__2 ;
    public final void rule__ListDeclaration__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1253:1: ( rule__ListDeclaration__Group_1_0__1__Impl rule__ListDeclaration__Group_1_0__2 )
            // InternalTraceryPlusPlus.g:1254:2: rule__ListDeclaration__Group_1_0__1__Impl rule__ListDeclaration__Group_1_0__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalTraceryPlusPlus.g:1261:1: rule__ListDeclaration__Group_1_0__1__Impl : ( 'have' ) ;
    public final void rule__ListDeclaration__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1265:1: ( ( 'have' ) )
            // InternalTraceryPlusPlus.g:1266:1: ( 'have' )
            {
            // InternalTraceryPlusPlus.g:1266:1: ( 'have' )
            // InternalTraceryPlusPlus.g:1267:2: 'have'
            {
             before(grammarAccess.getListDeclarationAccess().getHaveKeyword_1_0_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1276:1: rule__ListDeclaration__Group_1_0__2 : rule__ListDeclaration__Group_1_0__2__Impl ;
    public final void rule__ListDeclaration__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1280:1: ( rule__ListDeclaration__Group_1_0__2__Impl )
            // InternalTraceryPlusPlus.g:1281:2: rule__ListDeclaration__Group_1_0__2__Impl
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
    // InternalTraceryPlusPlus.g:1287:1: rule__ListDeclaration__Group_1_0__2__Impl : ( 'values' ) ;
    public final void rule__ListDeclaration__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1291:1: ( ( 'values' ) )
            // InternalTraceryPlusPlus.g:1292:1: ( 'values' )
            {
            // InternalTraceryPlusPlus.g:1292:1: ( 'values' )
            // InternalTraceryPlusPlus.g:1293:2: 'values'
            {
             before(grammarAccess.getListDeclarationAccess().getValuesKeyword_1_0_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1303:1: rule__ListDeclaration__Group_1_1__0 : rule__ListDeclaration__Group_1_1__0__Impl rule__ListDeclaration__Group_1_1__1 ;
    public final void rule__ListDeclaration__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1307:1: ( rule__ListDeclaration__Group_1_1__0__Impl rule__ListDeclaration__Group_1_1__1 )
            // InternalTraceryPlusPlus.g:1308:2: rule__ListDeclaration__Group_1_1__0__Impl rule__ListDeclaration__Group_1_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalTraceryPlusPlus.g:1315:1: rule__ListDeclaration__Group_1_1__0__Impl : ( 'can' ) ;
    public final void rule__ListDeclaration__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1319:1: ( ( 'can' ) )
            // InternalTraceryPlusPlus.g:1320:1: ( 'can' )
            {
            // InternalTraceryPlusPlus.g:1320:1: ( 'can' )
            // InternalTraceryPlusPlus.g:1321:2: 'can'
            {
             before(grammarAccess.getListDeclarationAccess().getCanKeyword_1_1_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1330:1: rule__ListDeclaration__Group_1_1__1 : rule__ListDeclaration__Group_1_1__1__Impl ;
    public final void rule__ListDeclaration__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1334:1: ( rule__ListDeclaration__Group_1_1__1__Impl )
            // InternalTraceryPlusPlus.g:1335:2: rule__ListDeclaration__Group_1_1__1__Impl
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
    // InternalTraceryPlusPlus.g:1341:1: rule__ListDeclaration__Group_1_1__1__Impl : ( 'be' ) ;
    public final void rule__ListDeclaration__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1345:1: ( ( 'be' ) )
            // InternalTraceryPlusPlus.g:1346:1: ( 'be' )
            {
            // InternalTraceryPlusPlus.g:1346:1: ( 'be' )
            // InternalTraceryPlusPlus.g:1347:2: 'be'
            {
             before(grammarAccess.getListDeclarationAccess().getBeKeyword_1_1_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1357:1: rule__ObjectDeclaration__Group__0 : rule__ObjectDeclaration__Group__0__Impl rule__ObjectDeclaration__Group__1 ;
    public final void rule__ObjectDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1361:1: ( rule__ObjectDeclaration__Group__0__Impl rule__ObjectDeclaration__Group__1 )
            // InternalTraceryPlusPlus.g:1362:2: rule__ObjectDeclaration__Group__0__Impl rule__ObjectDeclaration__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalTraceryPlusPlus.g:1369:1: rule__ObjectDeclaration__Group__0__Impl : ( 'There' ) ;
    public final void rule__ObjectDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1373:1: ( ( 'There' ) )
            // InternalTraceryPlusPlus.g:1374:1: ( 'There' )
            {
            // InternalTraceryPlusPlus.g:1374:1: ( 'There' )
            // InternalTraceryPlusPlus.g:1375:2: 'There'
            {
             before(grammarAccess.getObjectDeclarationAccess().getThereKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1384:1: rule__ObjectDeclaration__Group__1 : rule__ObjectDeclaration__Group__1__Impl rule__ObjectDeclaration__Group__2 ;
    public final void rule__ObjectDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1388:1: ( rule__ObjectDeclaration__Group__1__Impl rule__ObjectDeclaration__Group__2 )
            // InternalTraceryPlusPlus.g:1389:2: rule__ObjectDeclaration__Group__1__Impl rule__ObjectDeclaration__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalTraceryPlusPlus.g:1396:1: rule__ObjectDeclaration__Group__1__Impl : ( ( rule__ObjectDeclaration__Alternatives_1 ) ) ;
    public final void rule__ObjectDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1400:1: ( ( ( rule__ObjectDeclaration__Alternatives_1 ) ) )
            // InternalTraceryPlusPlus.g:1401:1: ( ( rule__ObjectDeclaration__Alternatives_1 ) )
            {
            // InternalTraceryPlusPlus.g:1401:1: ( ( rule__ObjectDeclaration__Alternatives_1 ) )
            // InternalTraceryPlusPlus.g:1402:2: ( rule__ObjectDeclaration__Alternatives_1 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getAlternatives_1()); 
            // InternalTraceryPlusPlus.g:1403:2: ( rule__ObjectDeclaration__Alternatives_1 )
            // InternalTraceryPlusPlus.g:1403:3: rule__ObjectDeclaration__Alternatives_1
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
    // InternalTraceryPlusPlus.g:1411:1: rule__ObjectDeclaration__Group__2 : rule__ObjectDeclaration__Group__2__Impl rule__ObjectDeclaration__Group__3 ;
    public final void rule__ObjectDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1415:1: ( rule__ObjectDeclaration__Group__2__Impl rule__ObjectDeclaration__Group__3 )
            // InternalTraceryPlusPlus.g:1416:2: rule__ObjectDeclaration__Group__2__Impl rule__ObjectDeclaration__Group__3
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
    // InternalTraceryPlusPlus.g:1423:1: rule__ObjectDeclaration__Group__2__Impl : ( ( rule__ObjectDeclaration__Alternatives_2 )? ) ;
    public final void rule__ObjectDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1427:1: ( ( ( rule__ObjectDeclaration__Alternatives_2 )? ) )
            // InternalTraceryPlusPlus.g:1428:1: ( ( rule__ObjectDeclaration__Alternatives_2 )? )
            {
            // InternalTraceryPlusPlus.g:1428:1: ( ( rule__ObjectDeclaration__Alternatives_2 )? )
            // InternalTraceryPlusPlus.g:1429:2: ( rule__ObjectDeclaration__Alternatives_2 )?
            {
             before(grammarAccess.getObjectDeclarationAccess().getAlternatives_2()); 
            // InternalTraceryPlusPlus.g:1430:2: ( rule__ObjectDeclaration__Alternatives_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=18 && LA15_0<=19)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1430:3: rule__ObjectDeclaration__Alternatives_2
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
    // InternalTraceryPlusPlus.g:1438:1: rule__ObjectDeclaration__Group__3 : rule__ObjectDeclaration__Group__3__Impl rule__ObjectDeclaration__Group__4 ;
    public final void rule__ObjectDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1442:1: ( rule__ObjectDeclaration__Group__3__Impl rule__ObjectDeclaration__Group__4 )
            // InternalTraceryPlusPlus.g:1443:2: rule__ObjectDeclaration__Group__3__Impl rule__ObjectDeclaration__Group__4
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
    // InternalTraceryPlusPlus.g:1450:1: rule__ObjectDeclaration__Group__3__Impl : ( ( rule__ObjectDeclaration__NameAssignment_3 ) ) ;
    public final void rule__ObjectDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1454:1: ( ( ( rule__ObjectDeclaration__NameAssignment_3 ) ) )
            // InternalTraceryPlusPlus.g:1455:1: ( ( rule__ObjectDeclaration__NameAssignment_3 ) )
            {
            // InternalTraceryPlusPlus.g:1455:1: ( ( rule__ObjectDeclaration__NameAssignment_3 ) )
            // InternalTraceryPlusPlus.g:1456:2: ( rule__ObjectDeclaration__NameAssignment_3 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getNameAssignment_3()); 
            // InternalTraceryPlusPlus.g:1457:2: ( rule__ObjectDeclaration__NameAssignment_3 )
            // InternalTraceryPlusPlus.g:1457:3: rule__ObjectDeclaration__NameAssignment_3
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
    // InternalTraceryPlusPlus.g:1465:1: rule__ObjectDeclaration__Group__4 : rule__ObjectDeclaration__Group__4__Impl rule__ObjectDeclaration__Group__5 ;
    public final void rule__ObjectDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1469:1: ( rule__ObjectDeclaration__Group__4__Impl rule__ObjectDeclaration__Group__5 )
            // InternalTraceryPlusPlus.g:1470:2: rule__ObjectDeclaration__Group__4__Impl rule__ObjectDeclaration__Group__5
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
    // InternalTraceryPlusPlus.g:1477:1: rule__ObjectDeclaration__Group__4__Impl : ( ( rule__ObjectDeclaration__Alternatives_4 ) ) ;
    public final void rule__ObjectDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1481:1: ( ( ( rule__ObjectDeclaration__Alternatives_4 ) ) )
            // InternalTraceryPlusPlus.g:1482:1: ( ( rule__ObjectDeclaration__Alternatives_4 ) )
            {
            // InternalTraceryPlusPlus.g:1482:1: ( ( rule__ObjectDeclaration__Alternatives_4 ) )
            // InternalTraceryPlusPlus.g:1483:2: ( rule__ObjectDeclaration__Alternatives_4 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getAlternatives_4()); 
            // InternalTraceryPlusPlus.g:1484:2: ( rule__ObjectDeclaration__Alternatives_4 )
            // InternalTraceryPlusPlus.g:1484:3: rule__ObjectDeclaration__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__ObjectDeclaration__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getObjectDeclarationAccess().getAlternatives_4()); 

            }


            }

        }
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
    // InternalTraceryPlusPlus.g:1492:1: rule__ObjectDeclaration__Group__5 : rule__ObjectDeclaration__Group__5__Impl rule__ObjectDeclaration__Group__6 ;
    public final void rule__ObjectDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1496:1: ( rule__ObjectDeclaration__Group__5__Impl rule__ObjectDeclaration__Group__6 )
            // InternalTraceryPlusPlus.g:1497:2: rule__ObjectDeclaration__Group__5__Impl rule__ObjectDeclaration__Group__6
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
    // InternalTraceryPlusPlus.g:1504:1: rule__ObjectDeclaration__Group__5__Impl : ( ( rule__ObjectDeclaration__Alternatives_5 ) ) ;
    public final void rule__ObjectDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1508:1: ( ( ( rule__ObjectDeclaration__Alternatives_5 ) ) )
            // InternalTraceryPlusPlus.g:1509:1: ( ( rule__ObjectDeclaration__Alternatives_5 ) )
            {
            // InternalTraceryPlusPlus.g:1509:1: ( ( rule__ObjectDeclaration__Alternatives_5 ) )
            // InternalTraceryPlusPlus.g:1510:2: ( rule__ObjectDeclaration__Alternatives_5 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getAlternatives_5()); 
            // InternalTraceryPlusPlus.g:1511:2: ( rule__ObjectDeclaration__Alternatives_5 )
            // InternalTraceryPlusPlus.g:1511:3: rule__ObjectDeclaration__Alternatives_5
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
    // InternalTraceryPlusPlus.g:1519:1: rule__ObjectDeclaration__Group__6 : rule__ObjectDeclaration__Group__6__Impl rule__ObjectDeclaration__Group__7 ;
    public final void rule__ObjectDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1523:1: ( rule__ObjectDeclaration__Group__6__Impl rule__ObjectDeclaration__Group__7 )
            // InternalTraceryPlusPlus.g:1524:2: rule__ObjectDeclaration__Group__6__Impl rule__ObjectDeclaration__Group__7
            {
            pushFollow(FOLLOW_9);
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
    // InternalTraceryPlusPlus.g:1531:1: rule__ObjectDeclaration__Group__6__Impl : ( 'attributes' ) ;
    public final void rule__ObjectDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1535:1: ( ( 'attributes' ) )
            // InternalTraceryPlusPlus.g:1536:1: ( 'attributes' )
            {
            // InternalTraceryPlusPlus.g:1536:1: ( 'attributes' )
            // InternalTraceryPlusPlus.g:1537:2: 'attributes'
            {
             before(grammarAccess.getObjectDeclarationAccess().getAttributesKeyword_6()); 
            match(input,38,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1546:1: rule__ObjectDeclaration__Group__7 : rule__ObjectDeclaration__Group__7__Impl rule__ObjectDeclaration__Group__8 ;
    public final void rule__ObjectDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1550:1: ( rule__ObjectDeclaration__Group__7__Impl rule__ObjectDeclaration__Group__8 )
            // InternalTraceryPlusPlus.g:1551:2: rule__ObjectDeclaration__Group__7__Impl rule__ObjectDeclaration__Group__8
            {
            pushFollow(FOLLOW_19);
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
    // InternalTraceryPlusPlus.g:1558:1: rule__ObjectDeclaration__Group__7__Impl : ( ruleAssignmentOperator ) ;
    public final void rule__ObjectDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1562:1: ( ( ruleAssignmentOperator ) )
            // InternalTraceryPlusPlus.g:1563:1: ( ruleAssignmentOperator )
            {
            // InternalTraceryPlusPlus.g:1563:1: ( ruleAssignmentOperator )
            // InternalTraceryPlusPlus.g:1564:2: ruleAssignmentOperator
            {
             before(grammarAccess.getObjectDeclarationAccess().getAssignmentOperatorParserRuleCall_7()); 
            pushFollow(FOLLOW_2);
            ruleAssignmentOperator();

            state._fsp--;

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
    // InternalTraceryPlusPlus.g:1573:1: rule__ObjectDeclaration__Group__8 : rule__ObjectDeclaration__Group__8__Impl ;
    public final void rule__ObjectDeclaration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1577:1: ( rule__ObjectDeclaration__Group__8__Impl )
            // InternalTraceryPlusPlus.g:1578:2: rule__ObjectDeclaration__Group__8__Impl
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
    // InternalTraceryPlusPlus.g:1584:1: rule__ObjectDeclaration__Group__8__Impl : ( ( rule__ObjectDeclaration__AttributesAssignment_8 ) ) ;
    public final void rule__ObjectDeclaration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1588:1: ( ( ( rule__ObjectDeclaration__AttributesAssignment_8 ) ) )
            // InternalTraceryPlusPlus.g:1589:1: ( ( rule__ObjectDeclaration__AttributesAssignment_8 ) )
            {
            // InternalTraceryPlusPlus.g:1589:1: ( ( rule__ObjectDeclaration__AttributesAssignment_8 ) )
            // InternalTraceryPlusPlus.g:1590:2: ( rule__ObjectDeclaration__AttributesAssignment_8 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getAttributesAssignment_8()); 
            // InternalTraceryPlusPlus.g:1591:2: ( rule__ObjectDeclaration__AttributesAssignment_8 )
            // InternalTraceryPlusPlus.g:1591:3: rule__ObjectDeclaration__AttributesAssignment_8
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
    // InternalTraceryPlusPlus.g:1600:1: rule__StoryVariable__Group__0 : rule__StoryVariable__Group__0__Impl rule__StoryVariable__Group__1 ;
    public final void rule__StoryVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1604:1: ( rule__StoryVariable__Group__0__Impl rule__StoryVariable__Group__1 )
            // InternalTraceryPlusPlus.g:1605:2: rule__StoryVariable__Group__0__Impl rule__StoryVariable__Group__1
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
    // InternalTraceryPlusPlus.g:1612:1: rule__StoryVariable__Group__0__Impl : ( ( rule__StoryVariable__VariableAssignment_0 ) ) ;
    public final void rule__StoryVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1616:1: ( ( ( rule__StoryVariable__VariableAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:1617:1: ( ( rule__StoryVariable__VariableAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:1617:1: ( ( rule__StoryVariable__VariableAssignment_0 ) )
            // InternalTraceryPlusPlus.g:1618:2: ( rule__StoryVariable__VariableAssignment_0 )
            {
             before(grammarAccess.getStoryVariableAccess().getVariableAssignment_0()); 
            // InternalTraceryPlusPlus.g:1619:2: ( rule__StoryVariable__VariableAssignment_0 )
            // InternalTraceryPlusPlus.g:1619:3: rule__StoryVariable__VariableAssignment_0
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
    // InternalTraceryPlusPlus.g:1627:1: rule__StoryVariable__Group__1 : rule__StoryVariable__Group__1__Impl ;
    public final void rule__StoryVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1631:1: ( rule__StoryVariable__Group__1__Impl )
            // InternalTraceryPlusPlus.g:1632:2: rule__StoryVariable__Group__1__Impl
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
    // InternalTraceryPlusPlus.g:1638:1: rule__StoryVariable__Group__1__Impl : ( ( rule__StoryVariable__ModifiersAssignment_1 )* ) ;
    public final void rule__StoryVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1642:1: ( ( ( rule__StoryVariable__ModifiersAssignment_1 )* ) )
            // InternalTraceryPlusPlus.g:1643:1: ( ( rule__StoryVariable__ModifiersAssignment_1 )* )
            {
            // InternalTraceryPlusPlus.g:1643:1: ( ( rule__StoryVariable__ModifiersAssignment_1 )* )
            // InternalTraceryPlusPlus.g:1644:2: ( rule__StoryVariable__ModifiersAssignment_1 )*
            {
             before(grammarAccess.getStoryVariableAccess().getModifiersAssignment_1()); 
            // InternalTraceryPlusPlus.g:1645:2: ( rule__StoryVariable__ModifiersAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=11 && LA16_0<=15)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1645:3: rule__StoryVariable__ModifiersAssignment_1
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__StoryVariable__ModifiersAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalTraceryPlusPlus.g:1654:1: rule__Attribute__Group_1__0 : rule__Attribute__Group_1__0__Impl rule__Attribute__Group_1__1 ;
    public final void rule__Attribute__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1658:1: ( rule__Attribute__Group_1__0__Impl rule__Attribute__Group_1__1 )
            // InternalTraceryPlusPlus.g:1659:2: rule__Attribute__Group_1__0__Impl rule__Attribute__Group_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalTraceryPlusPlus.g:1666:1: rule__Attribute__Group_1__0__Impl : ( ( rule__Attribute__NameAssignment_1_0 ) ) ;
    public final void rule__Attribute__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1670:1: ( ( ( rule__Attribute__NameAssignment_1_0 ) ) )
            // InternalTraceryPlusPlus.g:1671:1: ( ( rule__Attribute__NameAssignment_1_0 ) )
            {
            // InternalTraceryPlusPlus.g:1671:1: ( ( rule__Attribute__NameAssignment_1_0 ) )
            // InternalTraceryPlusPlus.g:1672:2: ( rule__Attribute__NameAssignment_1_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1_0()); 
            // InternalTraceryPlusPlus.g:1673:2: ( rule__Attribute__NameAssignment_1_0 )
            // InternalTraceryPlusPlus.g:1673:3: rule__Attribute__NameAssignment_1_0
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
    // InternalTraceryPlusPlus.g:1681:1: rule__Attribute__Group_1__1 : rule__Attribute__Group_1__1__Impl rule__Attribute__Group_1__2 ;
    public final void rule__Attribute__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1685:1: ( rule__Attribute__Group_1__1__Impl rule__Attribute__Group_1__2 )
            // InternalTraceryPlusPlus.g:1686:2: rule__Attribute__Group_1__1__Impl rule__Attribute__Group_1__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalTraceryPlusPlus.g:1693:1: rule__Attribute__Group_1__1__Impl : ( ruleAssignmentOperator ) ;
    public final void rule__Attribute__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1697:1: ( ( ruleAssignmentOperator ) )
            // InternalTraceryPlusPlus.g:1698:1: ( ruleAssignmentOperator )
            {
            // InternalTraceryPlusPlus.g:1698:1: ( ruleAssignmentOperator )
            // InternalTraceryPlusPlus.g:1699:2: ruleAssignmentOperator
            {
             before(grammarAccess.getAttributeAccess().getAssignmentOperatorParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleAssignmentOperator();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getAssignmentOperatorParserRuleCall_1_1()); 

            }


            }

        }
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
    // InternalTraceryPlusPlus.g:1708:1: rule__Attribute__Group_1__2 : rule__Attribute__Group_1__2__Impl ;
    public final void rule__Attribute__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1712:1: ( rule__Attribute__Group_1__2__Impl )
            // InternalTraceryPlusPlus.g:1713:2: rule__Attribute__Group_1__2__Impl
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
    // InternalTraceryPlusPlus.g:1719:1: rule__Attribute__Group_1__2__Impl : ( ( rule__Attribute__ValueAssignment_1_2 ) ) ;
    public final void rule__Attribute__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1723:1: ( ( ( rule__Attribute__ValueAssignment_1_2 ) ) )
            // InternalTraceryPlusPlus.g:1724:1: ( ( rule__Attribute__ValueAssignment_1_2 ) )
            {
            // InternalTraceryPlusPlus.g:1724:1: ( ( rule__Attribute__ValueAssignment_1_2 ) )
            // InternalTraceryPlusPlus.g:1725:2: ( rule__Attribute__ValueAssignment_1_2 )
            {
             before(grammarAccess.getAttributeAccess().getValueAssignment_1_2()); 
            // InternalTraceryPlusPlus.g:1726:2: ( rule__Attribute__ValueAssignment_1_2 )
            // InternalTraceryPlusPlus.g:1726:3: rule__Attribute__ValueAssignment_1_2
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


    // $ANTLR start "rule__Attribute__Group_2__0"
    // InternalTraceryPlusPlus.g:1735:1: rule__Attribute__Group_2__0 : rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 ;
    public final void rule__Attribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1739:1: ( rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 )
            // InternalTraceryPlusPlus.g:1740:2: rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Attribute__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_2__1();

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
    // $ANTLR end "rule__Attribute__Group_2__0"


    // $ANTLR start "rule__Attribute__Group_2__0__Impl"
    // InternalTraceryPlusPlus.g:1747:1: rule__Attribute__Group_2__0__Impl : ( ( rule__Attribute__NameAssignment_2_0 ) ) ;
    public final void rule__Attribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1751:1: ( ( ( rule__Attribute__NameAssignment_2_0 ) ) )
            // InternalTraceryPlusPlus.g:1752:1: ( ( rule__Attribute__NameAssignment_2_0 ) )
            {
            // InternalTraceryPlusPlus.g:1752:1: ( ( rule__Attribute__NameAssignment_2_0 ) )
            // InternalTraceryPlusPlus.g:1753:2: ( rule__Attribute__NameAssignment_2_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2_0()); 
            // InternalTraceryPlusPlus.g:1754:2: ( rule__Attribute__NameAssignment_2_0 )
            // InternalTraceryPlusPlus.g:1754:3: rule__Attribute__NameAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__0__Impl"


    // $ANTLR start "rule__Attribute__Group_2__1"
    // InternalTraceryPlusPlus.g:1762:1: rule__Attribute__Group_2__1 : rule__Attribute__Group_2__1__Impl rule__Attribute__Group_2__2 ;
    public final void rule__Attribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1766:1: ( rule__Attribute__Group_2__1__Impl rule__Attribute__Group_2__2 )
            // InternalTraceryPlusPlus.g:1767:2: rule__Attribute__Group_2__1__Impl rule__Attribute__Group_2__2
            {
            pushFollow(FOLLOW_19);
            rule__Attribute__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_2__2();

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
    // $ANTLR end "rule__Attribute__Group_2__1"


    // $ANTLR start "rule__Attribute__Group_2__1__Impl"
    // InternalTraceryPlusPlus.g:1774:1: rule__Attribute__Group_2__1__Impl : ( ruleAssignmentOperator ) ;
    public final void rule__Attribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1778:1: ( ( ruleAssignmentOperator ) )
            // InternalTraceryPlusPlus.g:1779:1: ( ruleAssignmentOperator )
            {
            // InternalTraceryPlusPlus.g:1779:1: ( ruleAssignmentOperator )
            // InternalTraceryPlusPlus.g:1780:2: ruleAssignmentOperator
            {
             before(grammarAccess.getAttributeAccess().getAssignmentOperatorParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleAssignmentOperator();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getAssignmentOperatorParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group_2__2"
    // InternalTraceryPlusPlus.g:1789:1: rule__Attribute__Group_2__2 : rule__Attribute__Group_2__2__Impl ;
    public final void rule__Attribute__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1793:1: ( rule__Attribute__Group_2__2__Impl )
            // InternalTraceryPlusPlus.g:1794:2: rule__Attribute__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_2__2__Impl();

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
    // $ANTLR end "rule__Attribute__Group_2__2"


    // $ANTLR start "rule__Attribute__Group_2__2__Impl"
    // InternalTraceryPlusPlus.g:1800:1: rule__Attribute__Group_2__2__Impl : ( ( rule__Attribute__ValueAssignment_2_2 ) ) ;
    public final void rule__Attribute__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1804:1: ( ( ( rule__Attribute__ValueAssignment_2_2 ) ) )
            // InternalTraceryPlusPlus.g:1805:1: ( ( rule__Attribute__ValueAssignment_2_2 ) )
            {
            // InternalTraceryPlusPlus.g:1805:1: ( ( rule__Attribute__ValueAssignment_2_2 ) )
            // InternalTraceryPlusPlus.g:1806:2: ( rule__Attribute__ValueAssignment_2_2 )
            {
             before(grammarAccess.getAttributeAccess().getValueAssignment_2_2()); 
            // InternalTraceryPlusPlus.g:1807:2: ( rule__Attribute__ValueAssignment_2_2 )
            // InternalTraceryPlusPlus.g:1807:3: rule__Attribute__ValueAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__ValueAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getValueAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__2__Impl"


    // $ANTLR start "rule__ObjectAttribute__Group__0"
    // InternalTraceryPlusPlus.g:1816:1: rule__ObjectAttribute__Group__0 : rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1 ;
    public final void rule__ObjectAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1820:1: ( rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1 )
            // InternalTraceryPlusPlus.g:1821:2: rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalTraceryPlusPlus.g:1828:1: rule__ObjectAttribute__Group__0__Impl : ( ( rule__ObjectAttribute__ObjectAssignment_0 ) ) ;
    public final void rule__ObjectAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1832:1: ( ( ( rule__ObjectAttribute__ObjectAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:1833:1: ( ( rule__ObjectAttribute__ObjectAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:1833:1: ( ( rule__ObjectAttribute__ObjectAssignment_0 ) )
            // InternalTraceryPlusPlus.g:1834:2: ( rule__ObjectAttribute__ObjectAssignment_0 )
            {
             before(grammarAccess.getObjectAttributeAccess().getObjectAssignment_0()); 
            // InternalTraceryPlusPlus.g:1835:2: ( rule__ObjectAttribute__ObjectAssignment_0 )
            // InternalTraceryPlusPlus.g:1835:3: rule__ObjectAttribute__ObjectAssignment_0
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
    // InternalTraceryPlusPlus.g:1843:1: rule__ObjectAttribute__Group__1 : rule__ObjectAttribute__Group__1__Impl rule__ObjectAttribute__Group__2 ;
    public final void rule__ObjectAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1847:1: ( rule__ObjectAttribute__Group__1__Impl rule__ObjectAttribute__Group__2 )
            // InternalTraceryPlusPlus.g:1848:2: rule__ObjectAttribute__Group__1__Impl rule__ObjectAttribute__Group__2
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
    // InternalTraceryPlusPlus.g:1855:1: rule__ObjectAttribute__Group__1__Impl : ( '.' ) ;
    public final void rule__ObjectAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1859:1: ( ( '.' ) )
            // InternalTraceryPlusPlus.g:1860:1: ( '.' )
            {
            // InternalTraceryPlusPlus.g:1860:1: ( '.' )
            // InternalTraceryPlusPlus.g:1861:2: '.'
            {
             before(grammarAccess.getObjectAttributeAccess().getFullStopKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1870:1: rule__ObjectAttribute__Group__2 : rule__ObjectAttribute__Group__2__Impl rule__ObjectAttribute__Group__3 ;
    public final void rule__ObjectAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1874:1: ( rule__ObjectAttribute__Group__2__Impl rule__ObjectAttribute__Group__3 )
            // InternalTraceryPlusPlus.g:1875:2: rule__ObjectAttribute__Group__2__Impl rule__ObjectAttribute__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__ObjectAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectAttribute__Group__3();

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
    // InternalTraceryPlusPlus.g:1882:1: rule__ObjectAttribute__Group__2__Impl : ( ( rule__ObjectAttribute__AttributeAssignment_2 ) ) ;
    public final void rule__ObjectAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1886:1: ( ( ( rule__ObjectAttribute__AttributeAssignment_2 ) ) )
            // InternalTraceryPlusPlus.g:1887:1: ( ( rule__ObjectAttribute__AttributeAssignment_2 ) )
            {
            // InternalTraceryPlusPlus.g:1887:1: ( ( rule__ObjectAttribute__AttributeAssignment_2 ) )
            // InternalTraceryPlusPlus.g:1888:2: ( rule__ObjectAttribute__AttributeAssignment_2 )
            {
             before(grammarAccess.getObjectAttributeAccess().getAttributeAssignment_2()); 
            // InternalTraceryPlusPlus.g:1889:2: ( rule__ObjectAttribute__AttributeAssignment_2 )
            // InternalTraceryPlusPlus.g:1889:3: rule__ObjectAttribute__AttributeAssignment_2
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


    // $ANTLR start "rule__ObjectAttribute__Group__3"
    // InternalTraceryPlusPlus.g:1897:1: rule__ObjectAttribute__Group__3 : rule__ObjectAttribute__Group__3__Impl ;
    public final void rule__ObjectAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1901:1: ( rule__ObjectAttribute__Group__3__Impl )
            // InternalTraceryPlusPlus.g:1902:2: rule__ObjectAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectAttribute__Group__3__Impl();

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
    // $ANTLR end "rule__ObjectAttribute__Group__3"


    // $ANTLR start "rule__ObjectAttribute__Group__3__Impl"
    // InternalTraceryPlusPlus.g:1908:1: rule__ObjectAttribute__Group__3__Impl : ( ( rule__ObjectAttribute__ModifiersAssignment_3 )* ) ;
    public final void rule__ObjectAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1912:1: ( ( ( rule__ObjectAttribute__ModifiersAssignment_3 )* ) )
            // InternalTraceryPlusPlus.g:1913:1: ( ( rule__ObjectAttribute__ModifiersAssignment_3 )* )
            {
            // InternalTraceryPlusPlus.g:1913:1: ( ( rule__ObjectAttribute__ModifiersAssignment_3 )* )
            // InternalTraceryPlusPlus.g:1914:2: ( rule__ObjectAttribute__ModifiersAssignment_3 )*
            {
             before(grammarAccess.getObjectAttributeAccess().getModifiersAssignment_3()); 
            // InternalTraceryPlusPlus.g:1915:2: ( rule__ObjectAttribute__ModifiersAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=11 && LA17_0<=15)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1915:3: rule__ObjectAttribute__ModifiersAssignment_3
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__ObjectAttribute__ModifiersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getObjectAttributeAccess().getModifiersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectAttribute__Group__3__Impl"


    // $ANTLR start "rule__WordList__Group__0"
    // InternalTraceryPlusPlus.g:1924:1: rule__WordList__Group__0 : rule__WordList__Group__0__Impl rule__WordList__Group__1 ;
    public final void rule__WordList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1928:1: ( rule__WordList__Group__0__Impl rule__WordList__Group__1 )
            // InternalTraceryPlusPlus.g:1929:2: rule__WordList__Group__0__Impl rule__WordList__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalTraceryPlusPlus.g:1936:1: rule__WordList__Group__0__Impl : ( ( rule__WordList__WordsAssignment_0 ) ) ;
    public final void rule__WordList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1940:1: ( ( ( rule__WordList__WordsAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:1941:1: ( ( rule__WordList__WordsAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:1941:1: ( ( rule__WordList__WordsAssignment_0 ) )
            // InternalTraceryPlusPlus.g:1942:2: ( rule__WordList__WordsAssignment_0 )
            {
             before(grammarAccess.getWordListAccess().getWordsAssignment_0()); 
            // InternalTraceryPlusPlus.g:1943:2: ( rule__WordList__WordsAssignment_0 )
            // InternalTraceryPlusPlus.g:1943:3: rule__WordList__WordsAssignment_0
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
    // InternalTraceryPlusPlus.g:1951:1: rule__WordList__Group__1 : rule__WordList__Group__1__Impl ;
    public final void rule__WordList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1955:1: ( rule__WordList__Group__1__Impl )
            // InternalTraceryPlusPlus.g:1956:2: rule__WordList__Group__1__Impl
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
    // InternalTraceryPlusPlus.g:1962:1: rule__WordList__Group__1__Impl : ( ( rule__WordList__Group_1__0 )* ) ;
    public final void rule__WordList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1966:1: ( ( ( rule__WordList__Group_1__0 )* ) )
            // InternalTraceryPlusPlus.g:1967:1: ( ( rule__WordList__Group_1__0 )* )
            {
            // InternalTraceryPlusPlus.g:1967:1: ( ( rule__WordList__Group_1__0 )* )
            // InternalTraceryPlusPlus.g:1968:2: ( rule__WordList__Group_1__0 )*
            {
             before(grammarAccess.getWordListAccess().getGroup_1()); 
            // InternalTraceryPlusPlus.g:1969:2: ( rule__WordList__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=29 && LA18_0<=30)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1969:3: rule__WordList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__WordList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalTraceryPlusPlus.g:1978:1: rule__WordList__Group_1__0 : rule__WordList__Group_1__0__Impl rule__WordList__Group_1__1 ;
    public final void rule__WordList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1982:1: ( rule__WordList__Group_1__0__Impl rule__WordList__Group_1__1 )
            // InternalTraceryPlusPlus.g:1983:2: rule__WordList__Group_1__0__Impl rule__WordList__Group_1__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalTraceryPlusPlus.g:1990:1: rule__WordList__Group_1__0__Impl : ( ruleSeparatorOr ) ;
    public final void rule__WordList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1994:1: ( ( ruleSeparatorOr ) )
            // InternalTraceryPlusPlus.g:1995:1: ( ruleSeparatorOr )
            {
            // InternalTraceryPlusPlus.g:1995:1: ( ruleSeparatorOr )
            // InternalTraceryPlusPlus.g:1996:2: ruleSeparatorOr
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
    // InternalTraceryPlusPlus.g:2005:1: rule__WordList__Group_1__1 : rule__WordList__Group_1__1__Impl ;
    public final void rule__WordList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2009:1: ( rule__WordList__Group_1__1__Impl )
            // InternalTraceryPlusPlus.g:2010:2: rule__WordList__Group_1__1__Impl
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
    // InternalTraceryPlusPlus.g:2016:1: rule__WordList__Group_1__1__Impl : ( ( rule__WordList__WordsAssignment_1_1 ) ) ;
    public final void rule__WordList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2020:1: ( ( ( rule__WordList__WordsAssignment_1_1 ) ) )
            // InternalTraceryPlusPlus.g:2021:1: ( ( rule__WordList__WordsAssignment_1_1 ) )
            {
            // InternalTraceryPlusPlus.g:2021:1: ( ( rule__WordList__WordsAssignment_1_1 ) )
            // InternalTraceryPlusPlus.g:2022:2: ( rule__WordList__WordsAssignment_1_1 )
            {
             before(grammarAccess.getWordListAccess().getWordsAssignment_1_1()); 
            // InternalTraceryPlusPlus.g:2023:2: ( rule__WordList__WordsAssignment_1_1 )
            // InternalTraceryPlusPlus.g:2023:3: rule__WordList__WordsAssignment_1_1
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
    // InternalTraceryPlusPlus.g:2032:1: rule__AttributeList__Group__0 : rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 ;
    public final void rule__AttributeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2036:1: ( rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 )
            // InternalTraceryPlusPlus.g:2037:2: rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalTraceryPlusPlus.g:2044:1: rule__AttributeList__Group__0__Impl : ( ( rule__AttributeList__AttributesAssignment_0 ) ) ;
    public final void rule__AttributeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2048:1: ( ( ( rule__AttributeList__AttributesAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:2049:1: ( ( rule__AttributeList__AttributesAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:2049:1: ( ( rule__AttributeList__AttributesAssignment_0 ) )
            // InternalTraceryPlusPlus.g:2050:2: ( rule__AttributeList__AttributesAssignment_0 )
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAssignment_0()); 
            // InternalTraceryPlusPlus.g:2051:2: ( rule__AttributeList__AttributesAssignment_0 )
            // InternalTraceryPlusPlus.g:2051:3: rule__AttributeList__AttributesAssignment_0
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
    // InternalTraceryPlusPlus.g:2059:1: rule__AttributeList__Group__1 : rule__AttributeList__Group__1__Impl ;
    public final void rule__AttributeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2063:1: ( rule__AttributeList__Group__1__Impl )
            // InternalTraceryPlusPlus.g:2064:2: rule__AttributeList__Group__1__Impl
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
    // InternalTraceryPlusPlus.g:2070:1: rule__AttributeList__Group__1__Impl : ( ( rule__AttributeList__Group_1__0 )* ) ;
    public final void rule__AttributeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2074:1: ( ( ( rule__AttributeList__Group_1__0 )* ) )
            // InternalTraceryPlusPlus.g:2075:1: ( ( rule__AttributeList__Group_1__0 )* )
            {
            // InternalTraceryPlusPlus.g:2075:1: ( ( rule__AttributeList__Group_1__0 )* )
            // InternalTraceryPlusPlus.g:2076:2: ( rule__AttributeList__Group_1__0 )*
            {
             before(grammarAccess.getAttributeListAccess().getGroup_1()); 
            // InternalTraceryPlusPlus.g:2077:2: ( rule__AttributeList__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29||LA19_0==31) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:2077:3: rule__AttributeList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__AttributeList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalTraceryPlusPlus.g:2086:1: rule__AttributeList__Group_1__0 : rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1 ;
    public final void rule__AttributeList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2090:1: ( rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1 )
            // InternalTraceryPlusPlus.g:2091:2: rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1
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
    // InternalTraceryPlusPlus.g:2098:1: rule__AttributeList__Group_1__0__Impl : ( ruleSeparatorAnd ) ;
    public final void rule__AttributeList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2102:1: ( ( ruleSeparatorAnd ) )
            // InternalTraceryPlusPlus.g:2103:1: ( ruleSeparatorAnd )
            {
            // InternalTraceryPlusPlus.g:2103:1: ( ruleSeparatorAnd )
            // InternalTraceryPlusPlus.g:2104:2: ruleSeparatorAnd
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
    // InternalTraceryPlusPlus.g:2113:1: rule__AttributeList__Group_1__1 : rule__AttributeList__Group_1__1__Impl ;
    public final void rule__AttributeList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2117:1: ( rule__AttributeList__Group_1__1__Impl )
            // InternalTraceryPlusPlus.g:2118:2: rule__AttributeList__Group_1__1__Impl
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
    // InternalTraceryPlusPlus.g:2124:1: rule__AttributeList__Group_1__1__Impl : ( ( rule__AttributeList__AttributesAssignment_1_1 ) ) ;
    public final void rule__AttributeList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2128:1: ( ( ( rule__AttributeList__AttributesAssignment_1_1 ) ) )
            // InternalTraceryPlusPlus.g:2129:1: ( ( rule__AttributeList__AttributesAssignment_1_1 ) )
            {
            // InternalTraceryPlusPlus.g:2129:1: ( ( rule__AttributeList__AttributesAssignment_1_1 ) )
            // InternalTraceryPlusPlus.g:2130:2: ( rule__AttributeList__AttributesAssignment_1_1 )
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAssignment_1_1()); 
            // InternalTraceryPlusPlus.g:2131:2: ( rule__AttributeList__AttributesAssignment_1_1 )
            // InternalTraceryPlusPlus.g:2131:3: rule__AttributeList__AttributesAssignment_1_1
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
    // InternalTraceryPlusPlus.g:2140:1: rule__TraceryPlusPlusProgram__StatementsAssignment_0 : ( ruleStatement ) ;
    public final void rule__TraceryPlusPlusProgram__StatementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2144:1: ( ( ruleStatement ) )
            // InternalTraceryPlusPlus.g:2145:2: ( ruleStatement )
            {
            // InternalTraceryPlusPlus.g:2145:2: ( ruleStatement )
            // InternalTraceryPlusPlus.g:2146:3: ruleStatement
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
    // InternalTraceryPlusPlus.g:2155:1: rule__TraceryPlusPlusProgram__StoryAssignment_1 : ( ruleStory ) ;
    public final void rule__TraceryPlusPlusProgram__StoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2159:1: ( ( ruleStory ) )
            // InternalTraceryPlusPlus.g:2160:2: ( ruleStory )
            {
            // InternalTraceryPlusPlus.g:2160:2: ( ruleStory )
            // InternalTraceryPlusPlus.g:2161:3: ruleStory
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


    // $ANTLR start "rule__Story__StoryAssignment_3"
    // InternalTraceryPlusPlus.g:2170:1: rule__Story__StoryAssignment_3 : ( ( rule__Story__StoryAlternatives_3_0 ) ) ;
    public final void rule__Story__StoryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2174:1: ( ( ( rule__Story__StoryAlternatives_3_0 ) ) )
            // InternalTraceryPlusPlus.g:2175:2: ( ( rule__Story__StoryAlternatives_3_0 ) )
            {
            // InternalTraceryPlusPlus.g:2175:2: ( ( rule__Story__StoryAlternatives_3_0 ) )
            // InternalTraceryPlusPlus.g:2176:3: ( rule__Story__StoryAlternatives_3_0 )
            {
             before(grammarAccess.getStoryAccess().getStoryAlternatives_3_0()); 
            // InternalTraceryPlusPlus.g:2177:3: ( rule__Story__StoryAlternatives_3_0 )
            // InternalTraceryPlusPlus.g:2177:4: rule__Story__StoryAlternatives_3_0
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


    // $ANTLR start "rule__ListDeclaration__NameAssignment_0"
    // InternalTraceryPlusPlus.g:2185:1: rule__ListDeclaration__NameAssignment_0 : ( ruleVariable ) ;
    public final void rule__ListDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2189:1: ( ( ruleVariable ) )
            // InternalTraceryPlusPlus.g:2190:2: ( ruleVariable )
            {
            // InternalTraceryPlusPlus.g:2190:2: ( ruleVariable )
            // InternalTraceryPlusPlus.g:2191:3: ruleVariable
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
    // InternalTraceryPlusPlus.g:2200:1: rule__ListDeclaration__ListAssignment_3 : ( ruleWordList ) ;
    public final void rule__ListDeclaration__ListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2204:1: ( ( ruleWordList ) )
            // InternalTraceryPlusPlus.g:2205:2: ( ruleWordList )
            {
            // InternalTraceryPlusPlus.g:2205:2: ( ruleWordList )
            // InternalTraceryPlusPlus.g:2206:3: ruleWordList
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
    // InternalTraceryPlusPlus.g:2215:1: rule__ObjectDeclaration__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ObjectDeclaration__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2219:1: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2220:2: ( RULE_ID )
            {
            // InternalTraceryPlusPlus.g:2220:2: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2221:3: RULE_ID
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


    // $ANTLR start "rule__ObjectDeclaration__AttributesAssignment_8"
    // InternalTraceryPlusPlus.g:2230:1: rule__ObjectDeclaration__AttributesAssignment_8 : ( ruleAttributeList ) ;
    public final void rule__ObjectDeclaration__AttributesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2234:1: ( ( ruleAttributeList ) )
            // InternalTraceryPlusPlus.g:2235:2: ( ruleAttributeList )
            {
            // InternalTraceryPlusPlus.g:2235:2: ( ruleAttributeList )
            // InternalTraceryPlusPlus.g:2236:3: ruleAttributeList
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
    // InternalTraceryPlusPlus.g:2245:1: rule__Word__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__Word__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2249:1: ( ( RULE_STRING ) )
            // InternalTraceryPlusPlus.g:2250:2: ( RULE_STRING )
            {
            // InternalTraceryPlusPlus.g:2250:2: ( RULE_STRING )
            // InternalTraceryPlusPlus.g:2251:3: RULE_STRING
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
    // InternalTraceryPlusPlus.g:2260:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2264:1: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2265:2: ( RULE_ID )
            {
            // InternalTraceryPlusPlus.g:2265:2: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2266:3: RULE_ID
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
    // InternalTraceryPlusPlus.g:2275:1: rule__StoryVariable__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__StoryVariable__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2279:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:2280:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:2280:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2281:3: ( RULE_ID )
            {
             before(grammarAccess.getStoryVariableAccess().getVariableVariableCrossReference_0_0()); 
            // InternalTraceryPlusPlus.g:2282:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2283:4: RULE_ID
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
    // InternalTraceryPlusPlus.g:2294:1: rule__StoryVariable__ModifiersAssignment_1 : ( ruleModifier ) ;
    public final void rule__StoryVariable__ModifiersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2298:1: ( ( ruleModifier ) )
            // InternalTraceryPlusPlus.g:2299:2: ( ruleModifier )
            {
            // InternalTraceryPlusPlus.g:2299:2: ( ruleModifier )
            // InternalTraceryPlusPlus.g:2300:3: ruleModifier
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
    // InternalTraceryPlusPlus.g:2309:1: rule__Attribute__NameAssignment_0 : ( ruleExistingVariable ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2313:1: ( ( ruleExistingVariable ) )
            // InternalTraceryPlusPlus.g:2314:2: ( ruleExistingVariable )
            {
            // InternalTraceryPlusPlus.g:2314:2: ( ruleExistingVariable )
            // InternalTraceryPlusPlus.g:2315:3: ruleExistingVariable
            {
             before(grammarAccess.getAttributeAccess().getNameExistingVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExistingVariable();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getNameExistingVariableParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalTraceryPlusPlus.g:2324:1: rule__Attribute__NameAssignment_1_0 : ( ruleVariable ) ;
    public final void rule__Attribute__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2328:1: ( ( ruleVariable ) )
            // InternalTraceryPlusPlus.g:2329:2: ( ruleVariable )
            {
            // InternalTraceryPlusPlus.g:2329:2: ( ruleVariable )
            // InternalTraceryPlusPlus.g:2330:3: ruleVariable
            {
             before(grammarAccess.getAttributeAccess().getNameVariableParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getNameVariableParserRuleCall_1_0_0()); 

            }


            }

        }
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
    // InternalTraceryPlusPlus.g:2339:1: rule__Attribute__ValueAssignment_1_2 : ( RULE_STRING ) ;
    public final void rule__Attribute__ValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2343:1: ( ( RULE_STRING ) )
            // InternalTraceryPlusPlus.g:2344:2: ( RULE_STRING )
            {
            // InternalTraceryPlusPlus.g:2344:2: ( RULE_STRING )
            // InternalTraceryPlusPlus.g:2345:3: RULE_STRING
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


    // $ANTLR start "rule__Attribute__NameAssignment_2_0"
    // InternalTraceryPlusPlus.g:2354:1: rule__Attribute__NameAssignment_2_0 : ( ruleVariable ) ;
    public final void rule__Attribute__NameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2358:1: ( ( ruleVariable ) )
            // InternalTraceryPlusPlus.g:2359:2: ( ruleVariable )
            {
            // InternalTraceryPlusPlus.g:2359:2: ( ruleVariable )
            // InternalTraceryPlusPlus.g:2360:3: ruleVariable
            {
             before(grammarAccess.getAttributeAccess().getNameVariableParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getNameVariableParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_2_0"


    // $ANTLR start "rule__Attribute__ValueAssignment_2_2"
    // InternalTraceryPlusPlus.g:2369:1: rule__Attribute__ValueAssignment_2_2 : ( ruleEVarr ) ;
    public final void rule__Attribute__ValueAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2373:1: ( ( ruleEVarr ) )
            // InternalTraceryPlusPlus.g:2374:2: ( ruleEVarr )
            {
            // InternalTraceryPlusPlus.g:2374:2: ( ruleEVarr )
            // InternalTraceryPlusPlus.g:2375:3: ruleEVarr
            {
             before(grammarAccess.getAttributeAccess().getValueEVarrParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEVarr();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getValueEVarrParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ValueAssignment_2_2"


    // $ANTLR start "rule__ExistingVariable__PointerAssignment"
    // InternalTraceryPlusPlus.g:2384:1: rule__ExistingVariable__PointerAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ExistingVariable__PointerAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2388:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:2389:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:2389:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2390:3: ( RULE_ID )
            {
             before(grammarAccess.getExistingVariableAccess().getPointerVariableCrossReference_0()); 
            // InternalTraceryPlusPlus.g:2391:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2392:4: RULE_ID
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


    // $ANTLR start "rule__ObjectAttribute__ObjectAssignment_0"
    // InternalTraceryPlusPlus.g:2403:1: rule__ObjectAttribute__ObjectAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectAttribute__ObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2407:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:2408:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:2408:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2409:3: ( RULE_ID )
            {
             before(grammarAccess.getObjectAttributeAccess().getObjectObjectDeclarationCrossReference_0_0()); 
            // InternalTraceryPlusPlus.g:2410:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2411:4: RULE_ID
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
    // InternalTraceryPlusPlus.g:2422:1: rule__ObjectAttribute__AttributeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectAttribute__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2426:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:2427:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:2427:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2428:3: ( RULE_ID )
            {
             before(grammarAccess.getObjectAttributeAccess().getAttributeVariableCrossReference_2_0()); 
            // InternalTraceryPlusPlus.g:2429:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2430:4: RULE_ID
            {
             before(grammarAccess.getObjectAttributeAccess().getAttributeVariableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectAttributeAccess().getAttributeVariableIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getObjectAttributeAccess().getAttributeVariableCrossReference_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__ObjectAttribute__ModifiersAssignment_3"
    // InternalTraceryPlusPlus.g:2441:1: rule__ObjectAttribute__ModifiersAssignment_3 : ( ruleModifier ) ;
    public final void rule__ObjectAttribute__ModifiersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2445:1: ( ( ruleModifier ) )
            // InternalTraceryPlusPlus.g:2446:2: ( ruleModifier )
            {
            // InternalTraceryPlusPlus.g:2446:2: ( ruleModifier )
            // InternalTraceryPlusPlus.g:2447:3: ruleModifier
            {
             before(grammarAccess.getObjectAttributeAccess().getModifiersModifierParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleModifier();

            state._fsp--;

             after(grammarAccess.getObjectAttributeAccess().getModifiersModifierParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectAttribute__ModifiersAssignment_3"


    // $ANTLR start "rule__WordList__WordsAssignment_0"
    // InternalTraceryPlusPlus.g:2456:1: rule__WordList__WordsAssignment_0 : ( ruleWord ) ;
    public final void rule__WordList__WordsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2460:1: ( ( ruleWord ) )
            // InternalTraceryPlusPlus.g:2461:2: ( ruleWord )
            {
            // InternalTraceryPlusPlus.g:2461:2: ( ruleWord )
            // InternalTraceryPlusPlus.g:2462:3: ruleWord
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
    // InternalTraceryPlusPlus.g:2471:1: rule__WordList__WordsAssignment_1_1 : ( ruleWord ) ;
    public final void rule__WordList__WordsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2475:1: ( ( ruleWord ) )
            // InternalTraceryPlusPlus.g:2476:2: ( ruleWord )
            {
            // InternalTraceryPlusPlus.g:2476:2: ( ruleWord )
            // InternalTraceryPlusPlus.g:2477:3: ruleWord
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
    // InternalTraceryPlusPlus.g:2486:1: rule__AttributeList__AttributesAssignment_0 : ( ruleAttribute ) ;
    public final void rule__AttributeList__AttributesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2490:1: ( ( ruleAttribute ) )
            // InternalTraceryPlusPlus.g:2491:2: ( ruleAttribute )
            {
            // InternalTraceryPlusPlus.g:2491:2: ( ruleAttribute )
            // InternalTraceryPlusPlus.g:2492:3: ruleAttribute
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
    // InternalTraceryPlusPlus.g:2501:1: rule__AttributeList__AttributesAssignment_1_1 : ( ruleAttribute ) ;
    public final void rule__AttributeList__AttributesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2505:1: ( ( ruleAttribute ) )
            // InternalTraceryPlusPlus.g:2506:2: ( ruleAttribute )
            {
            // InternalTraceryPlusPlus.g:2506:2: ( ruleAttribute )
            // InternalTraceryPlusPlus.g:2507:3: ruleAttribute
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000002000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000C0010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000000F802L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000A0000002L});

}