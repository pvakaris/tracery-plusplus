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


    // $ANTLR start "entryRuleObjectAttribute"
    // InternalTraceryPlusPlus.g:328:1: entryRuleObjectAttribute : ruleObjectAttribute EOF ;
    public final void entryRuleObjectAttribute() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:329:1: ( ruleObjectAttribute EOF )
            // InternalTraceryPlusPlus.g:330:1: ruleObjectAttribute EOF
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
    // InternalTraceryPlusPlus.g:337:1: ruleObjectAttribute : ( ( rule__ObjectAttribute__Group__0 ) ) ;
    public final void ruleObjectAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:341:2: ( ( ( rule__ObjectAttribute__Group__0 ) ) )
            // InternalTraceryPlusPlus.g:342:2: ( ( rule__ObjectAttribute__Group__0 ) )
            {
            // InternalTraceryPlusPlus.g:342:2: ( ( rule__ObjectAttribute__Group__0 ) )
            // InternalTraceryPlusPlus.g:343:3: ( rule__ObjectAttribute__Group__0 )
            {
             before(grammarAccess.getObjectAttributeAccess().getGroup()); 
            // InternalTraceryPlusPlus.g:344:3: ( rule__ObjectAttribute__Group__0 )
            // InternalTraceryPlusPlus.g:344:4: rule__ObjectAttribute__Group__0
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
    // InternalTraceryPlusPlus.g:353:1: entryRuleWordList : ruleWordList EOF ;
    public final void entryRuleWordList() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:354:1: ( ruleWordList EOF )
            // InternalTraceryPlusPlus.g:355:1: ruleWordList EOF
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
    // InternalTraceryPlusPlus.g:362:1: ruleWordList : ( ( rule__WordList__Group__0 ) ) ;
    public final void ruleWordList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:366:2: ( ( ( rule__WordList__Group__0 ) ) )
            // InternalTraceryPlusPlus.g:367:2: ( ( rule__WordList__Group__0 ) )
            {
            // InternalTraceryPlusPlus.g:367:2: ( ( rule__WordList__Group__0 ) )
            // InternalTraceryPlusPlus.g:368:3: ( rule__WordList__Group__0 )
            {
             before(grammarAccess.getWordListAccess().getGroup()); 
            // InternalTraceryPlusPlus.g:369:3: ( rule__WordList__Group__0 )
            // InternalTraceryPlusPlus.g:369:4: rule__WordList__Group__0
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
    // InternalTraceryPlusPlus.g:378:1: entryRuleAttributeList : ruleAttributeList EOF ;
    public final void entryRuleAttributeList() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:379:1: ( ruleAttributeList EOF )
            // InternalTraceryPlusPlus.g:380:1: ruleAttributeList EOF
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
    // InternalTraceryPlusPlus.g:387:1: ruleAttributeList : ( ( rule__AttributeList__Group__0 ) ) ;
    public final void ruleAttributeList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:391:2: ( ( ( rule__AttributeList__Group__0 ) ) )
            // InternalTraceryPlusPlus.g:392:2: ( ( rule__AttributeList__Group__0 ) )
            {
            // InternalTraceryPlusPlus.g:392:2: ( ( rule__AttributeList__Group__0 ) )
            // InternalTraceryPlusPlus.g:393:3: ( rule__AttributeList__Group__0 )
            {
             before(grammarAccess.getAttributeListAccess().getGroup()); 
            // InternalTraceryPlusPlus.g:394:3: ( rule__AttributeList__Group__0 )
            // InternalTraceryPlusPlus.g:394:4: rule__AttributeList__Group__0
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
    // InternalTraceryPlusPlus.g:403:1: entryRuleModifier : ruleModifier EOF ;
    public final void entryRuleModifier() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:404:1: ( ruleModifier EOF )
            // InternalTraceryPlusPlus.g:405:1: ruleModifier EOF
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
    // InternalTraceryPlusPlus.g:412:1: ruleModifier : ( ( rule__Modifier__Alternatives ) ) ;
    public final void ruleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:416:2: ( ( ( rule__Modifier__Alternatives ) ) )
            // InternalTraceryPlusPlus.g:417:2: ( ( rule__Modifier__Alternatives ) )
            {
            // InternalTraceryPlusPlus.g:417:2: ( ( rule__Modifier__Alternatives ) )
            // InternalTraceryPlusPlus.g:418:3: ( rule__Modifier__Alternatives )
            {
             before(grammarAccess.getModifierAccess().getAlternatives()); 
            // InternalTraceryPlusPlus.g:419:3: ( rule__Modifier__Alternatives )
            // InternalTraceryPlusPlus.g:419:4: rule__Modifier__Alternatives
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
    // InternalTraceryPlusPlus.g:428:1: entryRuleCapitalizationModifier : ruleCapitalizationModifier EOF ;
    public final void entryRuleCapitalizationModifier() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:429:1: ( ruleCapitalizationModifier EOF )
            // InternalTraceryPlusPlus.g:430:1: ruleCapitalizationModifier EOF
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
    // InternalTraceryPlusPlus.g:437:1: ruleCapitalizationModifier : ( '.capitalize' ) ;
    public final void ruleCapitalizationModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:441:2: ( ( '.capitalize' ) )
            // InternalTraceryPlusPlus.g:442:2: ( '.capitalize' )
            {
            // InternalTraceryPlusPlus.g:442:2: ( '.capitalize' )
            // InternalTraceryPlusPlus.g:443:3: '.capitalize'
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
    // InternalTraceryPlusPlus.g:453:1: entryRuleFullCapitalizationModifier : ruleFullCapitalizationModifier EOF ;
    public final void entryRuleFullCapitalizationModifier() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:454:1: ( ruleFullCapitalizationModifier EOF )
            // InternalTraceryPlusPlus.g:455:1: ruleFullCapitalizationModifier EOF
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
    // InternalTraceryPlusPlus.g:462:1: ruleFullCapitalizationModifier : ( '.CAPITALIZE' ) ;
    public final void ruleFullCapitalizationModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:466:2: ( ( '.CAPITALIZE' ) )
            // InternalTraceryPlusPlus.g:467:2: ( '.CAPITALIZE' )
            {
            // InternalTraceryPlusPlus.g:467:2: ( '.CAPITALIZE' )
            // InternalTraceryPlusPlus.g:468:3: '.CAPITALIZE'
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
    // InternalTraceryPlusPlus.g:478:1: entryRulePluralityModifier : rulePluralityModifier EOF ;
    public final void entryRulePluralityModifier() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:479:1: ( rulePluralityModifier EOF )
            // InternalTraceryPlusPlus.g:480:1: rulePluralityModifier EOF
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
    // InternalTraceryPlusPlus.g:487:1: rulePluralityModifier : ( '.s' ) ;
    public final void rulePluralityModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:491:2: ( ( '.s' ) )
            // InternalTraceryPlusPlus.g:492:2: ( '.s' )
            {
            // InternalTraceryPlusPlus.g:492:2: ( '.s' )
            // InternalTraceryPlusPlus.g:493:3: '.s'
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
    // InternalTraceryPlusPlus.g:503:1: entryRuleArticleModifier : ruleArticleModifier EOF ;
    public final void entryRuleArticleModifier() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:504:1: ( ruleArticleModifier EOF )
            // InternalTraceryPlusPlus.g:505:1: ruleArticleModifier EOF
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
    // InternalTraceryPlusPlus.g:512:1: ruleArticleModifier : ( '.a' ) ;
    public final void ruleArticleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:516:2: ( ( '.a' ) )
            // InternalTraceryPlusPlus.g:517:2: ( '.a' )
            {
            // InternalTraceryPlusPlus.g:517:2: ( '.a' )
            // InternalTraceryPlusPlus.g:518:3: '.a'
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
    // InternalTraceryPlusPlus.g:528:1: entryRulePastTenseModifier : rulePastTenseModifier EOF ;
    public final void entryRulePastTenseModifier() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:529:1: ( rulePastTenseModifier EOF )
            // InternalTraceryPlusPlus.g:530:1: rulePastTenseModifier EOF
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
    // InternalTraceryPlusPlus.g:537:1: rulePastTenseModifier : ( '.ed' ) ;
    public final void rulePastTenseModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:541:2: ( ( '.ed' ) )
            // InternalTraceryPlusPlus.g:542:2: ( '.ed' )
            {
            // InternalTraceryPlusPlus.g:542:2: ( '.ed' )
            // InternalTraceryPlusPlus.g:543:3: '.ed'
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
    // InternalTraceryPlusPlus.g:553:1: entryRuleAssignmentOperator : ruleAssignmentOperator EOF ;
    public final void entryRuleAssignmentOperator() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:554:1: ( ruleAssignmentOperator EOF )
            // InternalTraceryPlusPlus.g:555:1: ruleAssignmentOperator EOF
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
    // InternalTraceryPlusPlus.g:562:1: ruleAssignmentOperator : ( ( rule__AssignmentOperator__Alternatives ) ) ;
    public final void ruleAssignmentOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:566:2: ( ( ( rule__AssignmentOperator__Alternatives ) ) )
            // InternalTraceryPlusPlus.g:567:2: ( ( rule__AssignmentOperator__Alternatives ) )
            {
            // InternalTraceryPlusPlus.g:567:2: ( ( rule__AssignmentOperator__Alternatives ) )
            // InternalTraceryPlusPlus.g:568:3: ( rule__AssignmentOperator__Alternatives )
            {
             before(grammarAccess.getAssignmentOperatorAccess().getAlternatives()); 
            // InternalTraceryPlusPlus.g:569:3: ( rule__AssignmentOperator__Alternatives )
            // InternalTraceryPlusPlus.g:569:4: rule__AssignmentOperator__Alternatives
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
    // InternalTraceryPlusPlus.g:578:1: entryRuleSeparatorOr : ruleSeparatorOr EOF ;
    public final void entryRuleSeparatorOr() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:579:1: ( ruleSeparatorOr EOF )
            // InternalTraceryPlusPlus.g:580:1: ruleSeparatorOr EOF
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
    // InternalTraceryPlusPlus.g:587:1: ruleSeparatorOr : ( ( rule__SeparatorOr__Alternatives ) ) ;
    public final void ruleSeparatorOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:591:2: ( ( ( rule__SeparatorOr__Alternatives ) ) )
            // InternalTraceryPlusPlus.g:592:2: ( ( rule__SeparatorOr__Alternatives ) )
            {
            // InternalTraceryPlusPlus.g:592:2: ( ( rule__SeparatorOr__Alternatives ) )
            // InternalTraceryPlusPlus.g:593:3: ( rule__SeparatorOr__Alternatives )
            {
             before(grammarAccess.getSeparatorOrAccess().getAlternatives()); 
            // InternalTraceryPlusPlus.g:594:3: ( rule__SeparatorOr__Alternatives )
            // InternalTraceryPlusPlus.g:594:4: rule__SeparatorOr__Alternatives
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
    // InternalTraceryPlusPlus.g:603:1: entryRuleSeparatorAnd : ruleSeparatorAnd EOF ;
    public final void entryRuleSeparatorAnd() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:604:1: ( ruleSeparatorAnd EOF )
            // InternalTraceryPlusPlus.g:605:1: ruleSeparatorAnd EOF
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
    // InternalTraceryPlusPlus.g:612:1: ruleSeparatorAnd : ( ( rule__SeparatorAnd__Alternatives ) ) ;
    public final void ruleSeparatorAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:616:2: ( ( ( rule__SeparatorAnd__Alternatives ) ) )
            // InternalTraceryPlusPlus.g:617:2: ( ( rule__SeparatorAnd__Alternatives ) )
            {
            // InternalTraceryPlusPlus.g:617:2: ( ( rule__SeparatorAnd__Alternatives ) )
            // InternalTraceryPlusPlus.g:618:3: ( rule__SeparatorAnd__Alternatives )
            {
             before(grammarAccess.getSeparatorAndAccess().getAlternatives()); 
            // InternalTraceryPlusPlus.g:619:3: ( rule__SeparatorAnd__Alternatives )
            // InternalTraceryPlusPlus.g:619:4: rule__SeparatorAnd__Alternatives
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
    // InternalTraceryPlusPlus.g:627:1: rule__Declaration__Alternatives : ( ( ruleListDeclaration ) | ( ruleObjectDeclaration ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:631:1: ( ( ruleListDeclaration ) | ( ruleObjectDeclaration ) )
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
                    // InternalTraceryPlusPlus.g:632:2: ( ruleListDeclaration )
                    {
                    // InternalTraceryPlusPlus.g:632:2: ( ruleListDeclaration )
                    // InternalTraceryPlusPlus.g:633:3: ruleListDeclaration
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
                    // InternalTraceryPlusPlus.g:638:2: ( ruleObjectDeclaration )
                    {
                    // InternalTraceryPlusPlus.g:638:2: ( ruleObjectDeclaration )
                    // InternalTraceryPlusPlus.g:639:3: ruleObjectDeclaration
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
    // InternalTraceryPlusPlus.g:648:1: rule__Story__StoryAlternatives_3_0 : ( ( ruleWord ) | ( ruleStoryVariable ) | ( ruleObjectAttribute ) );
    public final void rule__Story__StoryAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:652:1: ( ( ruleWord ) | ( ruleStoryVariable ) | ( ruleObjectAttribute ) )
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
                else if ( (LA2_2==39) ) {
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
                    // InternalTraceryPlusPlus.g:653:2: ( ruleWord )
                    {
                    // InternalTraceryPlusPlus.g:653:2: ( ruleWord )
                    // InternalTraceryPlusPlus.g:654:3: ruleWord
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
                    // InternalTraceryPlusPlus.g:659:2: ( ruleStoryVariable )
                    {
                    // InternalTraceryPlusPlus.g:659:2: ( ruleStoryVariable )
                    // InternalTraceryPlusPlus.g:660:3: ruleStoryVariable
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
                    // InternalTraceryPlusPlus.g:665:2: ( ruleObjectAttribute )
                    {
                    // InternalTraceryPlusPlus.g:665:2: ( ruleObjectAttribute )
                    // InternalTraceryPlusPlus.g:666:3: ruleObjectAttribute
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
    // InternalTraceryPlusPlus.g:675:1: rule__ListDeclaration__Alternatives_1 : ( ( ( rule__ListDeclaration__Group_1_0__0 ) ) | ( ( rule__ListDeclaration__Group_1_1__0 ) ) );
    public final void rule__ListDeclaration__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:679:1: ( ( ( rule__ListDeclaration__Group_1_0__0 ) ) | ( ( rule__ListDeclaration__Group_1_1__0 ) ) )
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
                    // InternalTraceryPlusPlus.g:680:2: ( ( rule__ListDeclaration__Group_1_0__0 ) )
                    {
                    // InternalTraceryPlusPlus.g:680:2: ( ( rule__ListDeclaration__Group_1_0__0 ) )
                    // InternalTraceryPlusPlus.g:681:3: ( rule__ListDeclaration__Group_1_0__0 )
                    {
                     before(grammarAccess.getListDeclarationAccess().getGroup_1_0()); 
                    // InternalTraceryPlusPlus.g:682:3: ( rule__ListDeclaration__Group_1_0__0 )
                    // InternalTraceryPlusPlus.g:682:4: rule__ListDeclaration__Group_1_0__0
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
                    // InternalTraceryPlusPlus.g:686:2: ( ( rule__ListDeclaration__Group_1_1__0 ) )
                    {
                    // InternalTraceryPlusPlus.g:686:2: ( ( rule__ListDeclaration__Group_1_1__0 ) )
                    // InternalTraceryPlusPlus.g:687:3: ( rule__ListDeclaration__Group_1_1__0 )
                    {
                     before(grammarAccess.getListDeclarationAccess().getGroup_1_1()); 
                    // InternalTraceryPlusPlus.g:688:3: ( rule__ListDeclaration__Group_1_1__0 )
                    // InternalTraceryPlusPlus.g:688:4: rule__ListDeclaration__Group_1_1__0
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
    // InternalTraceryPlusPlus.g:696:1: rule__ObjectDeclaration__Alternatives_1 : ( ( 'is' ) | ( 'are' ) );
    public final void rule__ObjectDeclaration__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:700:1: ( ( 'is' ) | ( 'are' ) )
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
                    // InternalTraceryPlusPlus.g:701:2: ( 'is' )
                    {
                    // InternalTraceryPlusPlus.g:701:2: ( 'is' )
                    // InternalTraceryPlusPlus.g:702:3: 'is'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getIsKeyword_1_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getObjectDeclarationAccess().getIsKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:707:2: ( 'are' )
                    {
                    // InternalTraceryPlusPlus.g:707:2: ( 'are' )
                    // InternalTraceryPlusPlus.g:708:3: 'are'
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
    // InternalTraceryPlusPlus.g:717:1: rule__ObjectDeclaration__Alternatives_2 : ( ( 'a' ) | ( 'an' ) );
    public final void rule__ObjectDeclaration__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:721:1: ( ( 'a' ) | ( 'an' ) )
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
                    // InternalTraceryPlusPlus.g:722:2: ( 'a' )
                    {
                    // InternalTraceryPlusPlus.g:722:2: ( 'a' )
                    // InternalTraceryPlusPlus.g:723:3: 'a'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getAKeyword_2_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getObjectDeclarationAccess().getAKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:728:2: ( 'an' )
                    {
                    // InternalTraceryPlusPlus.g:728:2: ( 'an' )
                    // InternalTraceryPlusPlus.g:729:3: 'an'
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
    // InternalTraceryPlusPlus.g:738:1: rule__ObjectDeclaration__Alternatives_4 : ( ( 'He' ) | ( 'She' ) | ( 'It' ) | ( 'They' ) );
    public final void rule__ObjectDeclaration__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:742:1: ( ( 'He' ) | ( 'She' ) | ( 'It' ) | ( 'They' ) )
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
                    // InternalTraceryPlusPlus.g:743:2: ( 'He' )
                    {
                    // InternalTraceryPlusPlus.g:743:2: ( 'He' )
                    // InternalTraceryPlusPlus.g:744:3: 'He'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getHeKeyword_4_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getObjectDeclarationAccess().getHeKeyword_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:749:2: ( 'She' )
                    {
                    // InternalTraceryPlusPlus.g:749:2: ( 'She' )
                    // InternalTraceryPlusPlus.g:750:3: 'She'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getSheKeyword_4_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getObjectDeclarationAccess().getSheKeyword_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:755:2: ( 'It' )
                    {
                    // InternalTraceryPlusPlus.g:755:2: ( 'It' )
                    // InternalTraceryPlusPlus.g:756:3: 'It'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getItKeyword_4_2()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getObjectDeclarationAccess().getItKeyword_4_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTraceryPlusPlus.g:761:2: ( 'They' )
                    {
                    // InternalTraceryPlusPlus.g:761:2: ( 'They' )
                    // InternalTraceryPlusPlus.g:762:3: 'They'
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
    // InternalTraceryPlusPlus.g:771:1: rule__ObjectDeclaration__Alternatives_5 : ( ( 'has' ) | ( 'have' ) );
    public final void rule__ObjectDeclaration__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:775:1: ( ( 'has' ) | ( 'have' ) )
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
                    // InternalTraceryPlusPlus.g:776:2: ( 'has' )
                    {
                    // InternalTraceryPlusPlus.g:776:2: ( 'has' )
                    // InternalTraceryPlusPlus.g:777:3: 'has'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getHasKeyword_5_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getObjectDeclarationAccess().getHasKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:782:2: ( 'have' )
                    {
                    // InternalTraceryPlusPlus.g:782:2: ( 'have' )
                    // InternalTraceryPlusPlus.g:783:3: 'have'
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
    // InternalTraceryPlusPlus.g:792:1: rule__Attribute__Alternatives : ( ( ( rule__Attribute__NameAssignment_0 ) ) | ( ( rule__Attribute__Group_1__0 ) ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:796:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) | ( ( rule__Attribute__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==EOF||LA8_1==RULE_ID||LA8_1==29||(LA8_1>=31 && LA8_1<=32)||LA8_1==37) ) {
                    alt8=1;
                }
                else if ( ((LA8_1>=26 && LA8_1<=28)) ) {
                    alt8=2;
                }
                else {
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
                    // InternalTraceryPlusPlus.g:797:2: ( ( rule__Attribute__NameAssignment_0 ) )
                    {
                    // InternalTraceryPlusPlus.g:797:2: ( ( rule__Attribute__NameAssignment_0 ) )
                    // InternalTraceryPlusPlus.g:798:3: ( rule__Attribute__NameAssignment_0 )
                    {
                     before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
                    // InternalTraceryPlusPlus.g:799:3: ( rule__Attribute__NameAssignment_0 )
                    // InternalTraceryPlusPlus.g:799:4: rule__Attribute__NameAssignment_0
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
                    // InternalTraceryPlusPlus.g:803:2: ( ( rule__Attribute__Group_1__0 ) )
                    {
                    // InternalTraceryPlusPlus.g:803:2: ( ( rule__Attribute__Group_1__0 ) )
                    // InternalTraceryPlusPlus.g:804:3: ( rule__Attribute__Group_1__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_1()); 
                    // InternalTraceryPlusPlus.g:805:3: ( rule__Attribute__Group_1__0 )
                    // InternalTraceryPlusPlus.g:805:4: rule__Attribute__Group_1__0
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
    // InternalTraceryPlusPlus.g:813:1: rule__Modifier__Alternatives : ( ( ruleCapitalizationModifier ) | ( ruleFullCapitalizationModifier ) | ( rulePluralityModifier ) | ( ruleArticleModifier ) | ( rulePastTenseModifier ) );
    public final void rule__Modifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:817:1: ( ( ruleCapitalizationModifier ) | ( ruleFullCapitalizationModifier ) | ( rulePluralityModifier ) | ( ruleArticleModifier ) | ( rulePastTenseModifier ) )
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
                    // InternalTraceryPlusPlus.g:818:2: ( ruleCapitalizationModifier )
                    {
                    // InternalTraceryPlusPlus.g:818:2: ( ruleCapitalizationModifier )
                    // InternalTraceryPlusPlus.g:819:3: ruleCapitalizationModifier
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
                    // InternalTraceryPlusPlus.g:824:2: ( ruleFullCapitalizationModifier )
                    {
                    // InternalTraceryPlusPlus.g:824:2: ( ruleFullCapitalizationModifier )
                    // InternalTraceryPlusPlus.g:825:3: ruleFullCapitalizationModifier
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
                    // InternalTraceryPlusPlus.g:830:2: ( rulePluralityModifier )
                    {
                    // InternalTraceryPlusPlus.g:830:2: ( rulePluralityModifier )
                    // InternalTraceryPlusPlus.g:831:3: rulePluralityModifier
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
                    // InternalTraceryPlusPlus.g:836:2: ( ruleArticleModifier )
                    {
                    // InternalTraceryPlusPlus.g:836:2: ( ruleArticleModifier )
                    // InternalTraceryPlusPlus.g:837:3: ruleArticleModifier
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
                    // InternalTraceryPlusPlus.g:842:2: ( rulePastTenseModifier )
                    {
                    // InternalTraceryPlusPlus.g:842:2: ( rulePastTenseModifier )
                    // InternalTraceryPlusPlus.g:843:3: rulePastTenseModifier
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
    // InternalTraceryPlusPlus.g:852:1: rule__AssignmentOperator__Alternatives : ( ( '=' ) | ( ':' ) | ( '-' ) );
    public final void rule__AssignmentOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:856:1: ( ( '=' ) | ( ':' ) | ( '-' ) )
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
                    // InternalTraceryPlusPlus.g:857:2: ( '=' )
                    {
                    // InternalTraceryPlusPlus.g:857:2: ( '=' )
                    // InternalTraceryPlusPlus.g:858:3: '='
                    {
                     before(grammarAccess.getAssignmentOperatorAccess().getEqualsSignKeyword_0()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getAssignmentOperatorAccess().getEqualsSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:863:2: ( ':' )
                    {
                    // InternalTraceryPlusPlus.g:863:2: ( ':' )
                    // InternalTraceryPlusPlus.g:864:3: ':'
                    {
                     before(grammarAccess.getAssignmentOperatorAccess().getColonKeyword_1()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getAssignmentOperatorAccess().getColonKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:869:2: ( '-' )
                    {
                    // InternalTraceryPlusPlus.g:869:2: ( '-' )
                    // InternalTraceryPlusPlus.g:870:3: '-'
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
    // InternalTraceryPlusPlus.g:879:1: rule__SeparatorOr__Alternatives : ( ( ',' ) | ( 'or' ) );
    public final void rule__SeparatorOr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:883:1: ( ( ',' ) | ( 'or' ) )
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
                    // InternalTraceryPlusPlus.g:884:2: ( ',' )
                    {
                    // InternalTraceryPlusPlus.g:884:2: ( ',' )
                    // InternalTraceryPlusPlus.g:885:3: ','
                    {
                     before(grammarAccess.getSeparatorOrAccess().getCommaKeyword_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getSeparatorOrAccess().getCommaKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:890:2: ( 'or' )
                    {
                    // InternalTraceryPlusPlus.g:890:2: ( 'or' )
                    // InternalTraceryPlusPlus.g:891:3: 'or'
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
    // InternalTraceryPlusPlus.g:900:1: rule__SeparatorAnd__Alternatives : ( ( ',' ) | ( 'and' ) );
    public final void rule__SeparatorAnd__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:904:1: ( ( ',' ) | ( 'and' ) )
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
                    // InternalTraceryPlusPlus.g:905:2: ( ',' )
                    {
                    // InternalTraceryPlusPlus.g:905:2: ( ',' )
                    // InternalTraceryPlusPlus.g:906:3: ','
                    {
                     before(grammarAccess.getSeparatorAndAccess().getCommaKeyword_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getSeparatorAndAccess().getCommaKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:911:2: ( 'and' )
                    {
                    // InternalTraceryPlusPlus.g:911:2: ( 'and' )
                    // InternalTraceryPlusPlus.g:912:3: 'and'
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
    // InternalTraceryPlusPlus.g:921:1: rule__TraceryPlusPlusProgram__Group__0 : rule__TraceryPlusPlusProgram__Group__0__Impl rule__TraceryPlusPlusProgram__Group__1 ;
    public final void rule__TraceryPlusPlusProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:925:1: ( rule__TraceryPlusPlusProgram__Group__0__Impl rule__TraceryPlusPlusProgram__Group__1 )
            // InternalTraceryPlusPlus.g:926:2: rule__TraceryPlusPlusProgram__Group__0__Impl rule__TraceryPlusPlusProgram__Group__1
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
    // InternalTraceryPlusPlus.g:933:1: rule__TraceryPlusPlusProgram__Group__0__Impl : ( ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )* ) ;
    public final void rule__TraceryPlusPlusProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:937:1: ( ( ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )* ) )
            // InternalTraceryPlusPlus.g:938:1: ( ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )* )
            {
            // InternalTraceryPlusPlus.g:938:1: ( ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )* )
            // InternalTraceryPlusPlus.g:939:2: ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )*
            {
             before(grammarAccess.getTraceryPlusPlusProgramAccess().getStatementsAssignment_0()); 
            // InternalTraceryPlusPlus.g:940:2: ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==37) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:940:3: rule__TraceryPlusPlusProgram__StatementsAssignment_0
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
    // InternalTraceryPlusPlus.g:948:1: rule__TraceryPlusPlusProgram__Group__1 : rule__TraceryPlusPlusProgram__Group__1__Impl ;
    public final void rule__TraceryPlusPlusProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:952:1: ( rule__TraceryPlusPlusProgram__Group__1__Impl )
            // InternalTraceryPlusPlus.g:953:2: rule__TraceryPlusPlusProgram__Group__1__Impl
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
    // InternalTraceryPlusPlus.g:959:1: rule__TraceryPlusPlusProgram__Group__1__Impl : ( ( rule__TraceryPlusPlusProgram__StoryAssignment_1 ) ) ;
    public final void rule__TraceryPlusPlusProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:963:1: ( ( ( rule__TraceryPlusPlusProgram__StoryAssignment_1 ) ) )
            // InternalTraceryPlusPlus.g:964:1: ( ( rule__TraceryPlusPlusProgram__StoryAssignment_1 ) )
            {
            // InternalTraceryPlusPlus.g:964:1: ( ( rule__TraceryPlusPlusProgram__StoryAssignment_1 ) )
            // InternalTraceryPlusPlus.g:965:2: ( rule__TraceryPlusPlusProgram__StoryAssignment_1 )
            {
             before(grammarAccess.getTraceryPlusPlusProgramAccess().getStoryAssignment_1()); 
            // InternalTraceryPlusPlus.g:966:2: ( rule__TraceryPlusPlusProgram__StoryAssignment_1 )
            // InternalTraceryPlusPlus.g:966:3: rule__TraceryPlusPlusProgram__StoryAssignment_1
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
    // InternalTraceryPlusPlus.g:975:1: rule__Story__Group__0 : rule__Story__Group__0__Impl rule__Story__Group__1 ;
    public final void rule__Story__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:979:1: ( rule__Story__Group__0__Impl rule__Story__Group__1 )
            // InternalTraceryPlusPlus.g:980:2: rule__Story__Group__0__Impl rule__Story__Group__1
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
    // InternalTraceryPlusPlus.g:987:1: rule__Story__Group__0__Impl : ( () ) ;
    public final void rule__Story__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:991:1: ( ( () ) )
            // InternalTraceryPlusPlus.g:992:1: ( () )
            {
            // InternalTraceryPlusPlus.g:992:1: ( () )
            // InternalTraceryPlusPlus.g:993:2: ()
            {
             before(grammarAccess.getStoryAccess().getStoryAction_0()); 
            // InternalTraceryPlusPlus.g:994:2: ()
            // InternalTraceryPlusPlus.g:994:3: 
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
    // InternalTraceryPlusPlus.g:1002:1: rule__Story__Group__1 : rule__Story__Group__1__Impl rule__Story__Group__2 ;
    public final void rule__Story__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1006:1: ( rule__Story__Group__1__Impl rule__Story__Group__2 )
            // InternalTraceryPlusPlus.g:1007:2: rule__Story__Group__1__Impl rule__Story__Group__2
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
    // InternalTraceryPlusPlus.g:1014:1: rule__Story__Group__1__Impl : ( 'The' ) ;
    public final void rule__Story__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1018:1: ( ( 'The' ) )
            // InternalTraceryPlusPlus.g:1019:1: ( 'The' )
            {
            // InternalTraceryPlusPlus.g:1019:1: ( 'The' )
            // InternalTraceryPlusPlus.g:1020:2: 'The'
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
    // InternalTraceryPlusPlus.g:1029:1: rule__Story__Group__2 : rule__Story__Group__2__Impl rule__Story__Group__3 ;
    public final void rule__Story__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1033:1: ( rule__Story__Group__2__Impl rule__Story__Group__3 )
            // InternalTraceryPlusPlus.g:1034:2: rule__Story__Group__2__Impl rule__Story__Group__3
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
    // InternalTraceryPlusPlus.g:1041:1: rule__Story__Group__2__Impl : ( 'story:' ) ;
    public final void rule__Story__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1045:1: ( ( 'story:' ) )
            // InternalTraceryPlusPlus.g:1046:1: ( 'story:' )
            {
            // InternalTraceryPlusPlus.g:1046:1: ( 'story:' )
            // InternalTraceryPlusPlus.g:1047:2: 'story:'
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
    // InternalTraceryPlusPlus.g:1056:1: rule__Story__Group__3 : rule__Story__Group__3__Impl ;
    public final void rule__Story__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1060:1: ( rule__Story__Group__3__Impl )
            // InternalTraceryPlusPlus.g:1061:2: rule__Story__Group__3__Impl
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
    // InternalTraceryPlusPlus.g:1067:1: rule__Story__Group__3__Impl : ( ( rule__Story__StoryAssignment_3 )* ) ;
    public final void rule__Story__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1071:1: ( ( ( rule__Story__StoryAssignment_3 )* ) )
            // InternalTraceryPlusPlus.g:1072:1: ( ( rule__Story__StoryAssignment_3 )* )
            {
            // InternalTraceryPlusPlus.g:1072:1: ( ( rule__Story__StoryAssignment_3 )* )
            // InternalTraceryPlusPlus.g:1073:2: ( rule__Story__StoryAssignment_3 )*
            {
             before(grammarAccess.getStoryAccess().getStoryAssignment_3()); 
            // InternalTraceryPlusPlus.g:1074:2: ( rule__Story__StoryAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_STRING)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1074:3: rule__Story__StoryAssignment_3
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
    // InternalTraceryPlusPlus.g:1083:1: rule__ListDeclaration__Group__0 : rule__ListDeclaration__Group__0__Impl rule__ListDeclaration__Group__1 ;
    public final void rule__ListDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1087:1: ( rule__ListDeclaration__Group__0__Impl rule__ListDeclaration__Group__1 )
            // InternalTraceryPlusPlus.g:1088:2: rule__ListDeclaration__Group__0__Impl rule__ListDeclaration__Group__1
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
    // InternalTraceryPlusPlus.g:1095:1: rule__ListDeclaration__Group__0__Impl : ( ( rule__ListDeclaration__NameAssignment_0 ) ) ;
    public final void rule__ListDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1099:1: ( ( ( rule__ListDeclaration__NameAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:1100:1: ( ( rule__ListDeclaration__NameAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:1100:1: ( ( rule__ListDeclaration__NameAssignment_0 ) )
            // InternalTraceryPlusPlus.g:1101:2: ( rule__ListDeclaration__NameAssignment_0 )
            {
             before(grammarAccess.getListDeclarationAccess().getNameAssignment_0()); 
            // InternalTraceryPlusPlus.g:1102:2: ( rule__ListDeclaration__NameAssignment_0 )
            // InternalTraceryPlusPlus.g:1102:3: rule__ListDeclaration__NameAssignment_0
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
    // InternalTraceryPlusPlus.g:1110:1: rule__ListDeclaration__Group__1 : rule__ListDeclaration__Group__1__Impl rule__ListDeclaration__Group__2 ;
    public final void rule__ListDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1114:1: ( rule__ListDeclaration__Group__1__Impl rule__ListDeclaration__Group__2 )
            // InternalTraceryPlusPlus.g:1115:2: rule__ListDeclaration__Group__1__Impl rule__ListDeclaration__Group__2
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
    // InternalTraceryPlusPlus.g:1122:1: rule__ListDeclaration__Group__1__Impl : ( ( rule__ListDeclaration__Alternatives_1 ) ) ;
    public final void rule__ListDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1126:1: ( ( ( rule__ListDeclaration__Alternatives_1 ) ) )
            // InternalTraceryPlusPlus.g:1127:1: ( ( rule__ListDeclaration__Alternatives_1 ) )
            {
            // InternalTraceryPlusPlus.g:1127:1: ( ( rule__ListDeclaration__Alternatives_1 ) )
            // InternalTraceryPlusPlus.g:1128:2: ( rule__ListDeclaration__Alternatives_1 )
            {
             before(grammarAccess.getListDeclarationAccess().getAlternatives_1()); 
            // InternalTraceryPlusPlus.g:1129:2: ( rule__ListDeclaration__Alternatives_1 )
            // InternalTraceryPlusPlus.g:1129:3: rule__ListDeclaration__Alternatives_1
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
    // InternalTraceryPlusPlus.g:1137:1: rule__ListDeclaration__Group__2 : rule__ListDeclaration__Group__2__Impl rule__ListDeclaration__Group__3 ;
    public final void rule__ListDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1141:1: ( rule__ListDeclaration__Group__2__Impl rule__ListDeclaration__Group__3 )
            // InternalTraceryPlusPlus.g:1142:2: rule__ListDeclaration__Group__2__Impl rule__ListDeclaration__Group__3
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
    // InternalTraceryPlusPlus.g:1149:1: rule__ListDeclaration__Group__2__Impl : ( ruleAssignmentOperator ) ;
    public final void rule__ListDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1153:1: ( ( ruleAssignmentOperator ) )
            // InternalTraceryPlusPlus.g:1154:1: ( ruleAssignmentOperator )
            {
            // InternalTraceryPlusPlus.g:1154:1: ( ruleAssignmentOperator )
            // InternalTraceryPlusPlus.g:1155:2: ruleAssignmentOperator
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
    // InternalTraceryPlusPlus.g:1164:1: rule__ListDeclaration__Group__3 : rule__ListDeclaration__Group__3__Impl ;
    public final void rule__ListDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1168:1: ( rule__ListDeclaration__Group__3__Impl )
            // InternalTraceryPlusPlus.g:1169:2: rule__ListDeclaration__Group__3__Impl
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
    // InternalTraceryPlusPlus.g:1175:1: rule__ListDeclaration__Group__3__Impl : ( ( rule__ListDeclaration__ListAssignment_3 ) ) ;
    public final void rule__ListDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1179:1: ( ( ( rule__ListDeclaration__ListAssignment_3 ) ) )
            // InternalTraceryPlusPlus.g:1180:1: ( ( rule__ListDeclaration__ListAssignment_3 ) )
            {
            // InternalTraceryPlusPlus.g:1180:1: ( ( rule__ListDeclaration__ListAssignment_3 ) )
            // InternalTraceryPlusPlus.g:1181:2: ( rule__ListDeclaration__ListAssignment_3 )
            {
             before(grammarAccess.getListDeclarationAccess().getListAssignment_3()); 
            // InternalTraceryPlusPlus.g:1182:2: ( rule__ListDeclaration__ListAssignment_3 )
            // InternalTraceryPlusPlus.g:1182:3: rule__ListDeclaration__ListAssignment_3
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
    // InternalTraceryPlusPlus.g:1191:1: rule__ListDeclaration__Group_1_0__0 : rule__ListDeclaration__Group_1_0__0__Impl rule__ListDeclaration__Group_1_0__1 ;
    public final void rule__ListDeclaration__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1195:1: ( rule__ListDeclaration__Group_1_0__0__Impl rule__ListDeclaration__Group_1_0__1 )
            // InternalTraceryPlusPlus.g:1196:2: rule__ListDeclaration__Group_1_0__0__Impl rule__ListDeclaration__Group_1_0__1
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
    // InternalTraceryPlusPlus.g:1203:1: rule__ListDeclaration__Group_1_0__0__Impl : ( 'can' ) ;
    public final void rule__ListDeclaration__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1207:1: ( ( 'can' ) )
            // InternalTraceryPlusPlus.g:1208:1: ( 'can' )
            {
            // InternalTraceryPlusPlus.g:1208:1: ( 'can' )
            // InternalTraceryPlusPlus.g:1209:2: 'can'
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
    // InternalTraceryPlusPlus.g:1218:1: rule__ListDeclaration__Group_1_0__1 : rule__ListDeclaration__Group_1_0__1__Impl rule__ListDeclaration__Group_1_0__2 ;
    public final void rule__ListDeclaration__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1222:1: ( rule__ListDeclaration__Group_1_0__1__Impl rule__ListDeclaration__Group_1_0__2 )
            // InternalTraceryPlusPlus.g:1223:2: rule__ListDeclaration__Group_1_0__1__Impl rule__ListDeclaration__Group_1_0__2
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
    // InternalTraceryPlusPlus.g:1230:1: rule__ListDeclaration__Group_1_0__1__Impl : ( 'have' ) ;
    public final void rule__ListDeclaration__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1234:1: ( ( 'have' ) )
            // InternalTraceryPlusPlus.g:1235:1: ( 'have' )
            {
            // InternalTraceryPlusPlus.g:1235:1: ( 'have' )
            // InternalTraceryPlusPlus.g:1236:2: 'have'
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
    // InternalTraceryPlusPlus.g:1245:1: rule__ListDeclaration__Group_1_0__2 : rule__ListDeclaration__Group_1_0__2__Impl ;
    public final void rule__ListDeclaration__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1249:1: ( rule__ListDeclaration__Group_1_0__2__Impl )
            // InternalTraceryPlusPlus.g:1250:2: rule__ListDeclaration__Group_1_0__2__Impl
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
    // InternalTraceryPlusPlus.g:1256:1: rule__ListDeclaration__Group_1_0__2__Impl : ( 'values' ) ;
    public final void rule__ListDeclaration__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1260:1: ( ( 'values' ) )
            // InternalTraceryPlusPlus.g:1261:1: ( 'values' )
            {
            // InternalTraceryPlusPlus.g:1261:1: ( 'values' )
            // InternalTraceryPlusPlus.g:1262:2: 'values'
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
    // InternalTraceryPlusPlus.g:1272:1: rule__ListDeclaration__Group_1_1__0 : rule__ListDeclaration__Group_1_1__0__Impl rule__ListDeclaration__Group_1_1__1 ;
    public final void rule__ListDeclaration__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1276:1: ( rule__ListDeclaration__Group_1_1__0__Impl rule__ListDeclaration__Group_1_1__1 )
            // InternalTraceryPlusPlus.g:1277:2: rule__ListDeclaration__Group_1_1__0__Impl rule__ListDeclaration__Group_1_1__1
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
    // InternalTraceryPlusPlus.g:1284:1: rule__ListDeclaration__Group_1_1__0__Impl : ( 'can' ) ;
    public final void rule__ListDeclaration__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1288:1: ( ( 'can' ) )
            // InternalTraceryPlusPlus.g:1289:1: ( 'can' )
            {
            // InternalTraceryPlusPlus.g:1289:1: ( 'can' )
            // InternalTraceryPlusPlus.g:1290:2: 'can'
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
    // InternalTraceryPlusPlus.g:1299:1: rule__ListDeclaration__Group_1_1__1 : rule__ListDeclaration__Group_1_1__1__Impl ;
    public final void rule__ListDeclaration__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1303:1: ( rule__ListDeclaration__Group_1_1__1__Impl )
            // InternalTraceryPlusPlus.g:1304:2: rule__ListDeclaration__Group_1_1__1__Impl
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
    // InternalTraceryPlusPlus.g:1310:1: rule__ListDeclaration__Group_1_1__1__Impl : ( 'be' ) ;
    public final void rule__ListDeclaration__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1314:1: ( ( 'be' ) )
            // InternalTraceryPlusPlus.g:1315:1: ( 'be' )
            {
            // InternalTraceryPlusPlus.g:1315:1: ( 'be' )
            // InternalTraceryPlusPlus.g:1316:2: 'be'
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
    // InternalTraceryPlusPlus.g:1326:1: rule__ObjectDeclaration__Group__0 : rule__ObjectDeclaration__Group__0__Impl rule__ObjectDeclaration__Group__1 ;
    public final void rule__ObjectDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1330:1: ( rule__ObjectDeclaration__Group__0__Impl rule__ObjectDeclaration__Group__1 )
            // InternalTraceryPlusPlus.g:1331:2: rule__ObjectDeclaration__Group__0__Impl rule__ObjectDeclaration__Group__1
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
    // InternalTraceryPlusPlus.g:1338:1: rule__ObjectDeclaration__Group__0__Impl : ( 'There' ) ;
    public final void rule__ObjectDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1342:1: ( ( 'There' ) )
            // InternalTraceryPlusPlus.g:1343:1: ( 'There' )
            {
            // InternalTraceryPlusPlus.g:1343:1: ( 'There' )
            // InternalTraceryPlusPlus.g:1344:2: 'There'
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
    // InternalTraceryPlusPlus.g:1353:1: rule__ObjectDeclaration__Group__1 : rule__ObjectDeclaration__Group__1__Impl rule__ObjectDeclaration__Group__2 ;
    public final void rule__ObjectDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1357:1: ( rule__ObjectDeclaration__Group__1__Impl rule__ObjectDeclaration__Group__2 )
            // InternalTraceryPlusPlus.g:1358:2: rule__ObjectDeclaration__Group__1__Impl rule__ObjectDeclaration__Group__2
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
    // InternalTraceryPlusPlus.g:1365:1: rule__ObjectDeclaration__Group__1__Impl : ( ( rule__ObjectDeclaration__Alternatives_1 ) ) ;
    public final void rule__ObjectDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1369:1: ( ( ( rule__ObjectDeclaration__Alternatives_1 ) ) )
            // InternalTraceryPlusPlus.g:1370:1: ( ( rule__ObjectDeclaration__Alternatives_1 ) )
            {
            // InternalTraceryPlusPlus.g:1370:1: ( ( rule__ObjectDeclaration__Alternatives_1 ) )
            // InternalTraceryPlusPlus.g:1371:2: ( rule__ObjectDeclaration__Alternatives_1 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getAlternatives_1()); 
            // InternalTraceryPlusPlus.g:1372:2: ( rule__ObjectDeclaration__Alternatives_1 )
            // InternalTraceryPlusPlus.g:1372:3: rule__ObjectDeclaration__Alternatives_1
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
    // InternalTraceryPlusPlus.g:1380:1: rule__ObjectDeclaration__Group__2 : rule__ObjectDeclaration__Group__2__Impl rule__ObjectDeclaration__Group__3 ;
    public final void rule__ObjectDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1384:1: ( rule__ObjectDeclaration__Group__2__Impl rule__ObjectDeclaration__Group__3 )
            // InternalTraceryPlusPlus.g:1385:2: rule__ObjectDeclaration__Group__2__Impl rule__ObjectDeclaration__Group__3
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
    // InternalTraceryPlusPlus.g:1392:1: rule__ObjectDeclaration__Group__2__Impl : ( ( rule__ObjectDeclaration__Alternatives_2 )? ) ;
    public final void rule__ObjectDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1396:1: ( ( ( rule__ObjectDeclaration__Alternatives_2 )? ) )
            // InternalTraceryPlusPlus.g:1397:1: ( ( rule__ObjectDeclaration__Alternatives_2 )? )
            {
            // InternalTraceryPlusPlus.g:1397:1: ( ( rule__ObjectDeclaration__Alternatives_2 )? )
            // InternalTraceryPlusPlus.g:1398:2: ( rule__ObjectDeclaration__Alternatives_2 )?
            {
             before(grammarAccess.getObjectDeclarationAccess().getAlternatives_2()); 
            // InternalTraceryPlusPlus.g:1399:2: ( rule__ObjectDeclaration__Alternatives_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=18 && LA15_0<=19)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1399:3: rule__ObjectDeclaration__Alternatives_2
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
    // InternalTraceryPlusPlus.g:1407:1: rule__ObjectDeclaration__Group__3 : rule__ObjectDeclaration__Group__3__Impl rule__ObjectDeclaration__Group__4 ;
    public final void rule__ObjectDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1411:1: ( rule__ObjectDeclaration__Group__3__Impl rule__ObjectDeclaration__Group__4 )
            // InternalTraceryPlusPlus.g:1412:2: rule__ObjectDeclaration__Group__3__Impl rule__ObjectDeclaration__Group__4
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
    // InternalTraceryPlusPlus.g:1419:1: rule__ObjectDeclaration__Group__3__Impl : ( ( rule__ObjectDeclaration__NameAssignment_3 ) ) ;
    public final void rule__ObjectDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1423:1: ( ( ( rule__ObjectDeclaration__NameAssignment_3 ) ) )
            // InternalTraceryPlusPlus.g:1424:1: ( ( rule__ObjectDeclaration__NameAssignment_3 ) )
            {
            // InternalTraceryPlusPlus.g:1424:1: ( ( rule__ObjectDeclaration__NameAssignment_3 ) )
            // InternalTraceryPlusPlus.g:1425:2: ( rule__ObjectDeclaration__NameAssignment_3 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getNameAssignment_3()); 
            // InternalTraceryPlusPlus.g:1426:2: ( rule__ObjectDeclaration__NameAssignment_3 )
            // InternalTraceryPlusPlus.g:1426:3: rule__ObjectDeclaration__NameAssignment_3
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
    // InternalTraceryPlusPlus.g:1434:1: rule__ObjectDeclaration__Group__4 : rule__ObjectDeclaration__Group__4__Impl rule__ObjectDeclaration__Group__5 ;
    public final void rule__ObjectDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1438:1: ( rule__ObjectDeclaration__Group__4__Impl rule__ObjectDeclaration__Group__5 )
            // InternalTraceryPlusPlus.g:1439:2: rule__ObjectDeclaration__Group__4__Impl rule__ObjectDeclaration__Group__5
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
    // InternalTraceryPlusPlus.g:1446:1: rule__ObjectDeclaration__Group__4__Impl : ( ( rule__ObjectDeclaration__Alternatives_4 ) ) ;
    public final void rule__ObjectDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1450:1: ( ( ( rule__ObjectDeclaration__Alternatives_4 ) ) )
            // InternalTraceryPlusPlus.g:1451:1: ( ( rule__ObjectDeclaration__Alternatives_4 ) )
            {
            // InternalTraceryPlusPlus.g:1451:1: ( ( rule__ObjectDeclaration__Alternatives_4 ) )
            // InternalTraceryPlusPlus.g:1452:2: ( rule__ObjectDeclaration__Alternatives_4 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getAlternatives_4()); 
            // InternalTraceryPlusPlus.g:1453:2: ( rule__ObjectDeclaration__Alternatives_4 )
            // InternalTraceryPlusPlus.g:1453:3: rule__ObjectDeclaration__Alternatives_4
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
    // InternalTraceryPlusPlus.g:1461:1: rule__ObjectDeclaration__Group__5 : rule__ObjectDeclaration__Group__5__Impl rule__ObjectDeclaration__Group__6 ;
    public final void rule__ObjectDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1465:1: ( rule__ObjectDeclaration__Group__5__Impl rule__ObjectDeclaration__Group__6 )
            // InternalTraceryPlusPlus.g:1466:2: rule__ObjectDeclaration__Group__5__Impl rule__ObjectDeclaration__Group__6
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
    // InternalTraceryPlusPlus.g:1473:1: rule__ObjectDeclaration__Group__5__Impl : ( ( rule__ObjectDeclaration__Alternatives_5 ) ) ;
    public final void rule__ObjectDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1477:1: ( ( ( rule__ObjectDeclaration__Alternatives_5 ) ) )
            // InternalTraceryPlusPlus.g:1478:1: ( ( rule__ObjectDeclaration__Alternatives_5 ) )
            {
            // InternalTraceryPlusPlus.g:1478:1: ( ( rule__ObjectDeclaration__Alternatives_5 ) )
            // InternalTraceryPlusPlus.g:1479:2: ( rule__ObjectDeclaration__Alternatives_5 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getAlternatives_5()); 
            // InternalTraceryPlusPlus.g:1480:2: ( rule__ObjectDeclaration__Alternatives_5 )
            // InternalTraceryPlusPlus.g:1480:3: rule__ObjectDeclaration__Alternatives_5
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
    // InternalTraceryPlusPlus.g:1488:1: rule__ObjectDeclaration__Group__6 : rule__ObjectDeclaration__Group__6__Impl rule__ObjectDeclaration__Group__7 ;
    public final void rule__ObjectDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1492:1: ( rule__ObjectDeclaration__Group__6__Impl rule__ObjectDeclaration__Group__7 )
            // InternalTraceryPlusPlus.g:1493:2: rule__ObjectDeclaration__Group__6__Impl rule__ObjectDeclaration__Group__7
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
    // InternalTraceryPlusPlus.g:1500:1: rule__ObjectDeclaration__Group__6__Impl : ( 'attributes' ) ;
    public final void rule__ObjectDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1504:1: ( ( 'attributes' ) )
            // InternalTraceryPlusPlus.g:1505:1: ( 'attributes' )
            {
            // InternalTraceryPlusPlus.g:1505:1: ( 'attributes' )
            // InternalTraceryPlusPlus.g:1506:2: 'attributes'
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
    // InternalTraceryPlusPlus.g:1515:1: rule__ObjectDeclaration__Group__7 : rule__ObjectDeclaration__Group__7__Impl rule__ObjectDeclaration__Group__8 ;
    public final void rule__ObjectDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1519:1: ( rule__ObjectDeclaration__Group__7__Impl rule__ObjectDeclaration__Group__8 )
            // InternalTraceryPlusPlus.g:1520:2: rule__ObjectDeclaration__Group__7__Impl rule__ObjectDeclaration__Group__8
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
    // InternalTraceryPlusPlus.g:1527:1: rule__ObjectDeclaration__Group__7__Impl : ( ruleAssignmentOperator ) ;
    public final void rule__ObjectDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1531:1: ( ( ruleAssignmentOperator ) )
            // InternalTraceryPlusPlus.g:1532:1: ( ruleAssignmentOperator )
            {
            // InternalTraceryPlusPlus.g:1532:1: ( ruleAssignmentOperator )
            // InternalTraceryPlusPlus.g:1533:2: ruleAssignmentOperator
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
    // InternalTraceryPlusPlus.g:1542:1: rule__ObjectDeclaration__Group__8 : rule__ObjectDeclaration__Group__8__Impl ;
    public final void rule__ObjectDeclaration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1546:1: ( rule__ObjectDeclaration__Group__8__Impl )
            // InternalTraceryPlusPlus.g:1547:2: rule__ObjectDeclaration__Group__8__Impl
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
    // InternalTraceryPlusPlus.g:1553:1: rule__ObjectDeclaration__Group__8__Impl : ( ( rule__ObjectDeclaration__AttributesAssignment_8 ) ) ;
    public final void rule__ObjectDeclaration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1557:1: ( ( ( rule__ObjectDeclaration__AttributesAssignment_8 ) ) )
            // InternalTraceryPlusPlus.g:1558:1: ( ( rule__ObjectDeclaration__AttributesAssignment_8 ) )
            {
            // InternalTraceryPlusPlus.g:1558:1: ( ( rule__ObjectDeclaration__AttributesAssignment_8 ) )
            // InternalTraceryPlusPlus.g:1559:2: ( rule__ObjectDeclaration__AttributesAssignment_8 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getAttributesAssignment_8()); 
            // InternalTraceryPlusPlus.g:1560:2: ( rule__ObjectDeclaration__AttributesAssignment_8 )
            // InternalTraceryPlusPlus.g:1560:3: rule__ObjectDeclaration__AttributesAssignment_8
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
    // InternalTraceryPlusPlus.g:1569:1: rule__StoryVariable__Group__0 : rule__StoryVariable__Group__0__Impl rule__StoryVariable__Group__1 ;
    public final void rule__StoryVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1573:1: ( rule__StoryVariable__Group__0__Impl rule__StoryVariable__Group__1 )
            // InternalTraceryPlusPlus.g:1574:2: rule__StoryVariable__Group__0__Impl rule__StoryVariable__Group__1
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
    // InternalTraceryPlusPlus.g:1581:1: rule__StoryVariable__Group__0__Impl : ( ( rule__StoryVariable__VariableAssignment_0 ) ) ;
    public final void rule__StoryVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1585:1: ( ( ( rule__StoryVariable__VariableAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:1586:1: ( ( rule__StoryVariable__VariableAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:1586:1: ( ( rule__StoryVariable__VariableAssignment_0 ) )
            // InternalTraceryPlusPlus.g:1587:2: ( rule__StoryVariable__VariableAssignment_0 )
            {
             before(grammarAccess.getStoryVariableAccess().getVariableAssignment_0()); 
            // InternalTraceryPlusPlus.g:1588:2: ( rule__StoryVariable__VariableAssignment_0 )
            // InternalTraceryPlusPlus.g:1588:3: rule__StoryVariable__VariableAssignment_0
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
    // InternalTraceryPlusPlus.g:1596:1: rule__StoryVariable__Group__1 : rule__StoryVariable__Group__1__Impl ;
    public final void rule__StoryVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1600:1: ( rule__StoryVariable__Group__1__Impl )
            // InternalTraceryPlusPlus.g:1601:2: rule__StoryVariable__Group__1__Impl
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
    // InternalTraceryPlusPlus.g:1607:1: rule__StoryVariable__Group__1__Impl : ( ( rule__StoryVariable__ModifiersAssignment_1 )* ) ;
    public final void rule__StoryVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1611:1: ( ( ( rule__StoryVariable__ModifiersAssignment_1 )* ) )
            // InternalTraceryPlusPlus.g:1612:1: ( ( rule__StoryVariable__ModifiersAssignment_1 )* )
            {
            // InternalTraceryPlusPlus.g:1612:1: ( ( rule__StoryVariable__ModifiersAssignment_1 )* )
            // InternalTraceryPlusPlus.g:1613:2: ( rule__StoryVariable__ModifiersAssignment_1 )*
            {
             before(grammarAccess.getStoryVariableAccess().getModifiersAssignment_1()); 
            // InternalTraceryPlusPlus.g:1614:2: ( rule__StoryVariable__ModifiersAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=11 && LA16_0<=15)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1614:3: rule__StoryVariable__ModifiersAssignment_1
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
    // InternalTraceryPlusPlus.g:1623:1: rule__Attribute__Group_1__0 : rule__Attribute__Group_1__0__Impl rule__Attribute__Group_1__1 ;
    public final void rule__Attribute__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1627:1: ( rule__Attribute__Group_1__0__Impl rule__Attribute__Group_1__1 )
            // InternalTraceryPlusPlus.g:1628:2: rule__Attribute__Group_1__0__Impl rule__Attribute__Group_1__1
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
    // InternalTraceryPlusPlus.g:1635:1: rule__Attribute__Group_1__0__Impl : ( ( rule__Attribute__NameAssignment_1_0 ) ) ;
    public final void rule__Attribute__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1639:1: ( ( ( rule__Attribute__NameAssignment_1_0 ) ) )
            // InternalTraceryPlusPlus.g:1640:1: ( ( rule__Attribute__NameAssignment_1_0 ) )
            {
            // InternalTraceryPlusPlus.g:1640:1: ( ( rule__Attribute__NameAssignment_1_0 ) )
            // InternalTraceryPlusPlus.g:1641:2: ( rule__Attribute__NameAssignment_1_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1_0()); 
            // InternalTraceryPlusPlus.g:1642:2: ( rule__Attribute__NameAssignment_1_0 )
            // InternalTraceryPlusPlus.g:1642:3: rule__Attribute__NameAssignment_1_0
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
    // InternalTraceryPlusPlus.g:1650:1: rule__Attribute__Group_1__1 : rule__Attribute__Group_1__1__Impl rule__Attribute__Group_1__2 ;
    public final void rule__Attribute__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1654:1: ( rule__Attribute__Group_1__1__Impl rule__Attribute__Group_1__2 )
            // InternalTraceryPlusPlus.g:1655:2: rule__Attribute__Group_1__1__Impl rule__Attribute__Group_1__2
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
    // InternalTraceryPlusPlus.g:1662:1: rule__Attribute__Group_1__1__Impl : ( ruleAssignmentOperator ) ;
    public final void rule__Attribute__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1666:1: ( ( ruleAssignmentOperator ) )
            // InternalTraceryPlusPlus.g:1667:1: ( ruleAssignmentOperator )
            {
            // InternalTraceryPlusPlus.g:1667:1: ( ruleAssignmentOperator )
            // InternalTraceryPlusPlus.g:1668:2: ruleAssignmentOperator
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
    // InternalTraceryPlusPlus.g:1677:1: rule__Attribute__Group_1__2 : rule__Attribute__Group_1__2__Impl ;
    public final void rule__Attribute__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1681:1: ( rule__Attribute__Group_1__2__Impl )
            // InternalTraceryPlusPlus.g:1682:2: rule__Attribute__Group_1__2__Impl
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
    // InternalTraceryPlusPlus.g:1688:1: rule__Attribute__Group_1__2__Impl : ( ( rule__Attribute__ValueAssignment_1_2 ) ) ;
    public final void rule__Attribute__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1692:1: ( ( ( rule__Attribute__ValueAssignment_1_2 ) ) )
            // InternalTraceryPlusPlus.g:1693:1: ( ( rule__Attribute__ValueAssignment_1_2 ) )
            {
            // InternalTraceryPlusPlus.g:1693:1: ( ( rule__Attribute__ValueAssignment_1_2 ) )
            // InternalTraceryPlusPlus.g:1694:2: ( rule__Attribute__ValueAssignment_1_2 )
            {
             before(grammarAccess.getAttributeAccess().getValueAssignment_1_2()); 
            // InternalTraceryPlusPlus.g:1695:2: ( rule__Attribute__ValueAssignment_1_2 )
            // InternalTraceryPlusPlus.g:1695:3: rule__Attribute__ValueAssignment_1_2
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
    // InternalTraceryPlusPlus.g:1704:1: rule__ObjectAttribute__Group__0 : rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1 ;
    public final void rule__ObjectAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1708:1: ( rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1 )
            // InternalTraceryPlusPlus.g:1709:2: rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1
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
    // InternalTraceryPlusPlus.g:1716:1: rule__ObjectAttribute__Group__0__Impl : ( ( rule__ObjectAttribute__ObjectAssignment_0 ) ) ;
    public final void rule__ObjectAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1720:1: ( ( ( rule__ObjectAttribute__ObjectAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:1721:1: ( ( rule__ObjectAttribute__ObjectAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:1721:1: ( ( rule__ObjectAttribute__ObjectAssignment_0 ) )
            // InternalTraceryPlusPlus.g:1722:2: ( rule__ObjectAttribute__ObjectAssignment_0 )
            {
             before(grammarAccess.getObjectAttributeAccess().getObjectAssignment_0()); 
            // InternalTraceryPlusPlus.g:1723:2: ( rule__ObjectAttribute__ObjectAssignment_0 )
            // InternalTraceryPlusPlus.g:1723:3: rule__ObjectAttribute__ObjectAssignment_0
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
    // InternalTraceryPlusPlus.g:1731:1: rule__ObjectAttribute__Group__1 : rule__ObjectAttribute__Group__1__Impl rule__ObjectAttribute__Group__2 ;
    public final void rule__ObjectAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1735:1: ( rule__ObjectAttribute__Group__1__Impl rule__ObjectAttribute__Group__2 )
            // InternalTraceryPlusPlus.g:1736:2: rule__ObjectAttribute__Group__1__Impl rule__ObjectAttribute__Group__2
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
    // InternalTraceryPlusPlus.g:1743:1: rule__ObjectAttribute__Group__1__Impl : ( '.' ) ;
    public final void rule__ObjectAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1747:1: ( ( '.' ) )
            // InternalTraceryPlusPlus.g:1748:1: ( '.' )
            {
            // InternalTraceryPlusPlus.g:1748:1: ( '.' )
            // InternalTraceryPlusPlus.g:1749:2: '.'
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
    // InternalTraceryPlusPlus.g:1758:1: rule__ObjectAttribute__Group__2 : rule__ObjectAttribute__Group__2__Impl rule__ObjectAttribute__Group__3 ;
    public final void rule__ObjectAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1762:1: ( rule__ObjectAttribute__Group__2__Impl rule__ObjectAttribute__Group__3 )
            // InternalTraceryPlusPlus.g:1763:2: rule__ObjectAttribute__Group__2__Impl rule__ObjectAttribute__Group__3
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
    // InternalTraceryPlusPlus.g:1770:1: rule__ObjectAttribute__Group__2__Impl : ( ( rule__ObjectAttribute__AttributeAssignment_2 ) ) ;
    public final void rule__ObjectAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1774:1: ( ( ( rule__ObjectAttribute__AttributeAssignment_2 ) ) )
            // InternalTraceryPlusPlus.g:1775:1: ( ( rule__ObjectAttribute__AttributeAssignment_2 ) )
            {
            // InternalTraceryPlusPlus.g:1775:1: ( ( rule__ObjectAttribute__AttributeAssignment_2 ) )
            // InternalTraceryPlusPlus.g:1776:2: ( rule__ObjectAttribute__AttributeAssignment_2 )
            {
             before(grammarAccess.getObjectAttributeAccess().getAttributeAssignment_2()); 
            // InternalTraceryPlusPlus.g:1777:2: ( rule__ObjectAttribute__AttributeAssignment_2 )
            // InternalTraceryPlusPlus.g:1777:3: rule__ObjectAttribute__AttributeAssignment_2
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
    // InternalTraceryPlusPlus.g:1785:1: rule__ObjectAttribute__Group__3 : rule__ObjectAttribute__Group__3__Impl ;
    public final void rule__ObjectAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1789:1: ( rule__ObjectAttribute__Group__3__Impl )
            // InternalTraceryPlusPlus.g:1790:2: rule__ObjectAttribute__Group__3__Impl
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
    // InternalTraceryPlusPlus.g:1796:1: rule__ObjectAttribute__Group__3__Impl : ( ( rule__ObjectAttribute__ModifiersAssignment_3 )* ) ;
    public final void rule__ObjectAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1800:1: ( ( ( rule__ObjectAttribute__ModifiersAssignment_3 )* ) )
            // InternalTraceryPlusPlus.g:1801:1: ( ( rule__ObjectAttribute__ModifiersAssignment_3 )* )
            {
            // InternalTraceryPlusPlus.g:1801:1: ( ( rule__ObjectAttribute__ModifiersAssignment_3 )* )
            // InternalTraceryPlusPlus.g:1802:2: ( rule__ObjectAttribute__ModifiersAssignment_3 )*
            {
             before(grammarAccess.getObjectAttributeAccess().getModifiersAssignment_3()); 
            // InternalTraceryPlusPlus.g:1803:2: ( rule__ObjectAttribute__ModifiersAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=11 && LA17_0<=15)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1803:3: rule__ObjectAttribute__ModifiersAssignment_3
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
    // InternalTraceryPlusPlus.g:1812:1: rule__WordList__Group__0 : rule__WordList__Group__0__Impl rule__WordList__Group__1 ;
    public final void rule__WordList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1816:1: ( rule__WordList__Group__0__Impl rule__WordList__Group__1 )
            // InternalTraceryPlusPlus.g:1817:2: rule__WordList__Group__0__Impl rule__WordList__Group__1
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
    // InternalTraceryPlusPlus.g:1824:1: rule__WordList__Group__0__Impl : ( ( rule__WordList__WordsAssignment_0 ) ) ;
    public final void rule__WordList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1828:1: ( ( ( rule__WordList__WordsAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:1829:1: ( ( rule__WordList__WordsAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:1829:1: ( ( rule__WordList__WordsAssignment_0 ) )
            // InternalTraceryPlusPlus.g:1830:2: ( rule__WordList__WordsAssignment_0 )
            {
             before(grammarAccess.getWordListAccess().getWordsAssignment_0()); 
            // InternalTraceryPlusPlus.g:1831:2: ( rule__WordList__WordsAssignment_0 )
            // InternalTraceryPlusPlus.g:1831:3: rule__WordList__WordsAssignment_0
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
    // InternalTraceryPlusPlus.g:1839:1: rule__WordList__Group__1 : rule__WordList__Group__1__Impl ;
    public final void rule__WordList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1843:1: ( rule__WordList__Group__1__Impl )
            // InternalTraceryPlusPlus.g:1844:2: rule__WordList__Group__1__Impl
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
    // InternalTraceryPlusPlus.g:1850:1: rule__WordList__Group__1__Impl : ( ( rule__WordList__Group_1__0 )* ) ;
    public final void rule__WordList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1854:1: ( ( ( rule__WordList__Group_1__0 )* ) )
            // InternalTraceryPlusPlus.g:1855:1: ( ( rule__WordList__Group_1__0 )* )
            {
            // InternalTraceryPlusPlus.g:1855:1: ( ( rule__WordList__Group_1__0 )* )
            // InternalTraceryPlusPlus.g:1856:2: ( rule__WordList__Group_1__0 )*
            {
             before(grammarAccess.getWordListAccess().getGroup_1()); 
            // InternalTraceryPlusPlus.g:1857:2: ( rule__WordList__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=29 && LA18_0<=30)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1857:3: rule__WordList__Group_1__0
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
    // InternalTraceryPlusPlus.g:1866:1: rule__WordList__Group_1__0 : rule__WordList__Group_1__0__Impl rule__WordList__Group_1__1 ;
    public final void rule__WordList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1870:1: ( rule__WordList__Group_1__0__Impl rule__WordList__Group_1__1 )
            // InternalTraceryPlusPlus.g:1871:2: rule__WordList__Group_1__0__Impl rule__WordList__Group_1__1
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
    // InternalTraceryPlusPlus.g:1878:1: rule__WordList__Group_1__0__Impl : ( ruleSeparatorOr ) ;
    public final void rule__WordList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1882:1: ( ( ruleSeparatorOr ) )
            // InternalTraceryPlusPlus.g:1883:1: ( ruleSeparatorOr )
            {
            // InternalTraceryPlusPlus.g:1883:1: ( ruleSeparatorOr )
            // InternalTraceryPlusPlus.g:1884:2: ruleSeparatorOr
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
    // InternalTraceryPlusPlus.g:1893:1: rule__WordList__Group_1__1 : rule__WordList__Group_1__1__Impl ;
    public final void rule__WordList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1897:1: ( rule__WordList__Group_1__1__Impl )
            // InternalTraceryPlusPlus.g:1898:2: rule__WordList__Group_1__1__Impl
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
    // InternalTraceryPlusPlus.g:1904:1: rule__WordList__Group_1__1__Impl : ( ( rule__WordList__WordsAssignment_1_1 ) ) ;
    public final void rule__WordList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1908:1: ( ( ( rule__WordList__WordsAssignment_1_1 ) ) )
            // InternalTraceryPlusPlus.g:1909:1: ( ( rule__WordList__WordsAssignment_1_1 ) )
            {
            // InternalTraceryPlusPlus.g:1909:1: ( ( rule__WordList__WordsAssignment_1_1 ) )
            // InternalTraceryPlusPlus.g:1910:2: ( rule__WordList__WordsAssignment_1_1 )
            {
             before(grammarAccess.getWordListAccess().getWordsAssignment_1_1()); 
            // InternalTraceryPlusPlus.g:1911:2: ( rule__WordList__WordsAssignment_1_1 )
            // InternalTraceryPlusPlus.g:1911:3: rule__WordList__WordsAssignment_1_1
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
    // InternalTraceryPlusPlus.g:1920:1: rule__AttributeList__Group__0 : rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 ;
    public final void rule__AttributeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1924:1: ( rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 )
            // InternalTraceryPlusPlus.g:1925:2: rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1
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
    // InternalTraceryPlusPlus.g:1932:1: rule__AttributeList__Group__0__Impl : ( ( rule__AttributeList__AttributesAssignment_0 ) ) ;
    public final void rule__AttributeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1936:1: ( ( ( rule__AttributeList__AttributesAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:1937:1: ( ( rule__AttributeList__AttributesAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:1937:1: ( ( rule__AttributeList__AttributesAssignment_0 ) )
            // InternalTraceryPlusPlus.g:1938:2: ( rule__AttributeList__AttributesAssignment_0 )
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAssignment_0()); 
            // InternalTraceryPlusPlus.g:1939:2: ( rule__AttributeList__AttributesAssignment_0 )
            // InternalTraceryPlusPlus.g:1939:3: rule__AttributeList__AttributesAssignment_0
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
    // InternalTraceryPlusPlus.g:1947:1: rule__AttributeList__Group__1 : rule__AttributeList__Group__1__Impl ;
    public final void rule__AttributeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1951:1: ( rule__AttributeList__Group__1__Impl )
            // InternalTraceryPlusPlus.g:1952:2: rule__AttributeList__Group__1__Impl
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
    // InternalTraceryPlusPlus.g:1958:1: rule__AttributeList__Group__1__Impl : ( ( rule__AttributeList__Group_1__0 )* ) ;
    public final void rule__AttributeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1962:1: ( ( ( rule__AttributeList__Group_1__0 )* ) )
            // InternalTraceryPlusPlus.g:1963:1: ( ( rule__AttributeList__Group_1__0 )* )
            {
            // InternalTraceryPlusPlus.g:1963:1: ( ( rule__AttributeList__Group_1__0 )* )
            // InternalTraceryPlusPlus.g:1964:2: ( rule__AttributeList__Group_1__0 )*
            {
             before(grammarAccess.getAttributeListAccess().getGroup_1()); 
            // InternalTraceryPlusPlus.g:1965:2: ( rule__AttributeList__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29||LA19_0==31) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1965:3: rule__AttributeList__Group_1__0
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
    // InternalTraceryPlusPlus.g:1974:1: rule__AttributeList__Group_1__0 : rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1 ;
    public final void rule__AttributeList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1978:1: ( rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1 )
            // InternalTraceryPlusPlus.g:1979:2: rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1
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
    // InternalTraceryPlusPlus.g:1986:1: rule__AttributeList__Group_1__0__Impl : ( ruleSeparatorAnd ) ;
    public final void rule__AttributeList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1990:1: ( ( ruleSeparatorAnd ) )
            // InternalTraceryPlusPlus.g:1991:1: ( ruleSeparatorAnd )
            {
            // InternalTraceryPlusPlus.g:1991:1: ( ruleSeparatorAnd )
            // InternalTraceryPlusPlus.g:1992:2: ruleSeparatorAnd
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
    // InternalTraceryPlusPlus.g:2001:1: rule__AttributeList__Group_1__1 : rule__AttributeList__Group_1__1__Impl ;
    public final void rule__AttributeList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2005:1: ( rule__AttributeList__Group_1__1__Impl )
            // InternalTraceryPlusPlus.g:2006:2: rule__AttributeList__Group_1__1__Impl
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
    // InternalTraceryPlusPlus.g:2012:1: rule__AttributeList__Group_1__1__Impl : ( ( rule__AttributeList__AttributesAssignment_1_1 ) ) ;
    public final void rule__AttributeList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2016:1: ( ( ( rule__AttributeList__AttributesAssignment_1_1 ) ) )
            // InternalTraceryPlusPlus.g:2017:1: ( ( rule__AttributeList__AttributesAssignment_1_1 ) )
            {
            // InternalTraceryPlusPlus.g:2017:1: ( ( rule__AttributeList__AttributesAssignment_1_1 ) )
            // InternalTraceryPlusPlus.g:2018:2: ( rule__AttributeList__AttributesAssignment_1_1 )
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAssignment_1_1()); 
            // InternalTraceryPlusPlus.g:2019:2: ( rule__AttributeList__AttributesAssignment_1_1 )
            // InternalTraceryPlusPlus.g:2019:3: rule__AttributeList__AttributesAssignment_1_1
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
    // InternalTraceryPlusPlus.g:2028:1: rule__TraceryPlusPlusProgram__StatementsAssignment_0 : ( ruleStatement ) ;
    public final void rule__TraceryPlusPlusProgram__StatementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2032:1: ( ( ruleStatement ) )
            // InternalTraceryPlusPlus.g:2033:2: ( ruleStatement )
            {
            // InternalTraceryPlusPlus.g:2033:2: ( ruleStatement )
            // InternalTraceryPlusPlus.g:2034:3: ruleStatement
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
    // InternalTraceryPlusPlus.g:2043:1: rule__TraceryPlusPlusProgram__StoryAssignment_1 : ( ruleStory ) ;
    public final void rule__TraceryPlusPlusProgram__StoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2047:1: ( ( ruleStory ) )
            // InternalTraceryPlusPlus.g:2048:2: ( ruleStory )
            {
            // InternalTraceryPlusPlus.g:2048:2: ( ruleStory )
            // InternalTraceryPlusPlus.g:2049:3: ruleStory
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
    // InternalTraceryPlusPlus.g:2058:1: rule__Story__StoryAssignment_3 : ( ( rule__Story__StoryAlternatives_3_0 ) ) ;
    public final void rule__Story__StoryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2062:1: ( ( ( rule__Story__StoryAlternatives_3_0 ) ) )
            // InternalTraceryPlusPlus.g:2063:2: ( ( rule__Story__StoryAlternatives_3_0 ) )
            {
            // InternalTraceryPlusPlus.g:2063:2: ( ( rule__Story__StoryAlternatives_3_0 ) )
            // InternalTraceryPlusPlus.g:2064:3: ( rule__Story__StoryAlternatives_3_0 )
            {
             before(grammarAccess.getStoryAccess().getStoryAlternatives_3_0()); 
            // InternalTraceryPlusPlus.g:2065:3: ( rule__Story__StoryAlternatives_3_0 )
            // InternalTraceryPlusPlus.g:2065:4: rule__Story__StoryAlternatives_3_0
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
    // InternalTraceryPlusPlus.g:2073:1: rule__ListDeclaration__NameAssignment_0 : ( ruleVariable ) ;
    public final void rule__ListDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2077:1: ( ( ruleVariable ) )
            // InternalTraceryPlusPlus.g:2078:2: ( ruleVariable )
            {
            // InternalTraceryPlusPlus.g:2078:2: ( ruleVariable )
            // InternalTraceryPlusPlus.g:2079:3: ruleVariable
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
    // InternalTraceryPlusPlus.g:2088:1: rule__ListDeclaration__ListAssignment_3 : ( ruleWordList ) ;
    public final void rule__ListDeclaration__ListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2092:1: ( ( ruleWordList ) )
            // InternalTraceryPlusPlus.g:2093:2: ( ruleWordList )
            {
            // InternalTraceryPlusPlus.g:2093:2: ( ruleWordList )
            // InternalTraceryPlusPlus.g:2094:3: ruleWordList
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
    // InternalTraceryPlusPlus.g:2103:1: rule__ObjectDeclaration__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ObjectDeclaration__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2107:1: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2108:2: ( RULE_ID )
            {
            // InternalTraceryPlusPlus.g:2108:2: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2109:3: RULE_ID
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
    // InternalTraceryPlusPlus.g:2118:1: rule__ObjectDeclaration__AttributesAssignment_8 : ( ruleAttributeList ) ;
    public final void rule__ObjectDeclaration__AttributesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2122:1: ( ( ruleAttributeList ) )
            // InternalTraceryPlusPlus.g:2123:2: ( ruleAttributeList )
            {
            // InternalTraceryPlusPlus.g:2123:2: ( ruleAttributeList )
            // InternalTraceryPlusPlus.g:2124:3: ruleAttributeList
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
    // InternalTraceryPlusPlus.g:2133:1: rule__Word__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__Word__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2137:1: ( ( RULE_STRING ) )
            // InternalTraceryPlusPlus.g:2138:2: ( RULE_STRING )
            {
            // InternalTraceryPlusPlus.g:2138:2: ( RULE_STRING )
            // InternalTraceryPlusPlus.g:2139:3: RULE_STRING
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
    // InternalTraceryPlusPlus.g:2148:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2152:1: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2153:2: ( RULE_ID )
            {
            // InternalTraceryPlusPlus.g:2153:2: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2154:3: RULE_ID
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
    // InternalTraceryPlusPlus.g:2163:1: rule__StoryVariable__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__StoryVariable__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2167:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:2168:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:2168:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2169:3: ( RULE_ID )
            {
             before(grammarAccess.getStoryVariableAccess().getVariableVariableCrossReference_0_0()); 
            // InternalTraceryPlusPlus.g:2170:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2171:4: RULE_ID
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
    // InternalTraceryPlusPlus.g:2182:1: rule__StoryVariable__ModifiersAssignment_1 : ( ruleModifier ) ;
    public final void rule__StoryVariable__ModifiersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2186:1: ( ( ruleModifier ) )
            // InternalTraceryPlusPlus.g:2187:2: ( ruleModifier )
            {
            // InternalTraceryPlusPlus.g:2187:2: ( ruleModifier )
            // InternalTraceryPlusPlus.g:2188:3: ruleModifier
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
    // InternalTraceryPlusPlus.g:2197:1: rule__Attribute__NameAssignment_0 : ( ruleExistingVariable ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2201:1: ( ( ruleExistingVariable ) )
            // InternalTraceryPlusPlus.g:2202:2: ( ruleExistingVariable )
            {
            // InternalTraceryPlusPlus.g:2202:2: ( ruleExistingVariable )
            // InternalTraceryPlusPlus.g:2203:3: ruleExistingVariable
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
    // InternalTraceryPlusPlus.g:2212:1: rule__Attribute__NameAssignment_1_0 : ( ruleVariable ) ;
    public final void rule__Attribute__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2216:1: ( ( ruleVariable ) )
            // InternalTraceryPlusPlus.g:2217:2: ( ruleVariable )
            {
            // InternalTraceryPlusPlus.g:2217:2: ( ruleVariable )
            // InternalTraceryPlusPlus.g:2218:3: ruleVariable
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
    // InternalTraceryPlusPlus.g:2227:1: rule__Attribute__ValueAssignment_1_2 : ( RULE_STRING ) ;
    public final void rule__Attribute__ValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2231:1: ( ( RULE_STRING ) )
            // InternalTraceryPlusPlus.g:2232:2: ( RULE_STRING )
            {
            // InternalTraceryPlusPlus.g:2232:2: ( RULE_STRING )
            // InternalTraceryPlusPlus.g:2233:3: RULE_STRING
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


    // $ANTLR start "rule__ExistingVariable__PointerAssignment"
    // InternalTraceryPlusPlus.g:2242:1: rule__ExistingVariable__PointerAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ExistingVariable__PointerAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2246:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:2247:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:2247:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2248:3: ( RULE_ID )
            {
             before(grammarAccess.getExistingVariableAccess().getPointerVariableCrossReference_0()); 
            // InternalTraceryPlusPlus.g:2249:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2250:4: RULE_ID
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
    // InternalTraceryPlusPlus.g:2261:1: rule__ObjectAttribute__ObjectAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectAttribute__ObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2265:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:2266:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:2266:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2267:3: ( RULE_ID )
            {
             before(grammarAccess.getObjectAttributeAccess().getObjectObjectDeclarationCrossReference_0_0()); 
            // InternalTraceryPlusPlus.g:2268:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2269:4: RULE_ID
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
    // InternalTraceryPlusPlus.g:2280:1: rule__ObjectAttribute__AttributeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectAttribute__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2284:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:2285:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:2285:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2286:3: ( RULE_ID )
            {
             before(grammarAccess.getObjectAttributeAccess().getAttributeVariableCrossReference_2_0()); 
            // InternalTraceryPlusPlus.g:2287:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2288:4: RULE_ID
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
    // InternalTraceryPlusPlus.g:2299:1: rule__ObjectAttribute__ModifiersAssignment_3 : ( ruleModifier ) ;
    public final void rule__ObjectAttribute__ModifiersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2303:1: ( ( ruleModifier ) )
            // InternalTraceryPlusPlus.g:2304:2: ( ruleModifier )
            {
            // InternalTraceryPlusPlus.g:2304:2: ( ruleModifier )
            // InternalTraceryPlusPlus.g:2305:3: ruleModifier
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
    // InternalTraceryPlusPlus.g:2314:1: rule__WordList__WordsAssignment_0 : ( ruleWord ) ;
    public final void rule__WordList__WordsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2318:1: ( ( ruleWord ) )
            // InternalTraceryPlusPlus.g:2319:2: ( ruleWord )
            {
            // InternalTraceryPlusPlus.g:2319:2: ( ruleWord )
            // InternalTraceryPlusPlus.g:2320:3: ruleWord
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
    // InternalTraceryPlusPlus.g:2329:1: rule__WordList__WordsAssignment_1_1 : ( ruleWord ) ;
    public final void rule__WordList__WordsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2333:1: ( ( ruleWord ) )
            // InternalTraceryPlusPlus.g:2334:2: ( ruleWord )
            {
            // InternalTraceryPlusPlus.g:2334:2: ( ruleWord )
            // InternalTraceryPlusPlus.g:2335:3: ruleWord
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
    // InternalTraceryPlusPlus.g:2344:1: rule__AttributeList__AttributesAssignment_0 : ( ruleAttribute ) ;
    public final void rule__AttributeList__AttributesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2348:1: ( ( ruleAttribute ) )
            // InternalTraceryPlusPlus.g:2349:2: ( ruleAttribute )
            {
            // InternalTraceryPlusPlus.g:2349:2: ( ruleAttribute )
            // InternalTraceryPlusPlus.g:2350:3: ruleAttribute
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
    // InternalTraceryPlusPlus.g:2359:1: rule__AttributeList__AttributesAssignment_1_1 : ( ruleAttribute ) ;
    public final void rule__AttributeList__AttributesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2363:1: ( ( ruleAttribute ) )
            // InternalTraceryPlusPlus.g:2364:2: ( ruleAttribute )
            {
            // InternalTraceryPlusPlus.g:2364:2: ( ruleAttribute )
            // InternalTraceryPlusPlus.g:2365:3: ruleAttribute
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