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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.capitalize'", "'.CAPITALIZE'", "'.s'", "'.a'", "'.ed'", "'is'", "'are'", "'a'", "'an'", "'has'", "'have'", "'they'", "'them'", "'their'", "'theirs'", "'='", "':'", "'-'", "','", "'or'", "'and'", "'The'", "'story:'", "'can'", "'values'", "'be'", "'There'", "'attributes'", "'.'", "'He'", "'She'", "'It'", "'They'"
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


    // $ANTLR start "rule__Story__StoryAlternatives_3_0"
    // InternalTraceryPlusPlus.g:773:1: rule__Story__StoryAlternatives_3_0 : ( ( ruleWord ) | ( ruleStoryVariable ) | ( ruleObjectAttribute ) );
    public final void rule__Story__StoryAlternatives_3_0() throws RecognitionException {

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
                    // InternalTraceryPlusPlus.g:778:2: ( ruleWord )
                    {
                    // InternalTraceryPlusPlus.g:778:2: ( ruleWord )
                    // InternalTraceryPlusPlus.g:779:3: ruleWord
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
                    // InternalTraceryPlusPlus.g:784:2: ( ruleStoryVariable )
                    {
                    // InternalTraceryPlusPlus.g:784:2: ( ruleStoryVariable )
                    // InternalTraceryPlusPlus.g:785:3: ruleStoryVariable
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
                    // InternalTraceryPlusPlus.g:790:2: ( ruleObjectAttribute )
                    {
                    // InternalTraceryPlusPlus.g:790:2: ( ruleObjectAttribute )
                    // InternalTraceryPlusPlus.g:791:3: ruleObjectAttribute
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
    // InternalTraceryPlusPlus.g:800:1: rule__ListDeclaration__Alternatives_1 : ( ( ( rule__ListDeclaration__Group_1_0__0 ) ) | ( ( rule__ListDeclaration__Group_1_1__0 ) ) );
    public final void rule__ListDeclaration__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:804:1: ( ( ( rule__ListDeclaration__Group_1_0__0 ) ) | ( ( rule__ListDeclaration__Group_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==34) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==21) ) {
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

            }
        }
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
    // InternalTraceryPlusPlus.g:821:1: rule__ObjectDeclaration__Alternatives_1 : ( ( 'is' ) | ( 'are' ) );
    public final void rule__ObjectDeclaration__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:825:1: ( ( 'is' ) | ( 'are' ) )
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
                    // InternalTraceryPlusPlus.g:826:2: ( 'is' )
                    {
                    // InternalTraceryPlusPlus.g:826:2: ( 'is' )
                    // InternalTraceryPlusPlus.g:827:3: 'is'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getIsKeyword_1_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getObjectDeclarationAccess().getIsKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:832:2: ( 'are' )
                    {
                    // InternalTraceryPlusPlus.g:832:2: ( 'are' )
                    // InternalTraceryPlusPlus.g:833:3: 'are'
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
    // InternalTraceryPlusPlus.g:842:1: rule__ObjectDeclaration__Alternatives_2 : ( ( 'a' ) | ( 'an' ) );
    public final void rule__ObjectDeclaration__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:846:1: ( ( 'a' ) | ( 'an' ) )
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
                    // InternalTraceryPlusPlus.g:847:2: ( 'a' )
                    {
                    // InternalTraceryPlusPlus.g:847:2: ( 'a' )
                    // InternalTraceryPlusPlus.g:848:3: 'a'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getAKeyword_2_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getObjectDeclarationAccess().getAKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:853:2: ( 'an' )
                    {
                    // InternalTraceryPlusPlus.g:853:2: ( 'an' )
                    // InternalTraceryPlusPlus.g:854:3: 'an'
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
    // InternalTraceryPlusPlus.g:863:1: rule__ObjectDeclaration__Alternatives_5 : ( ( 'has' ) | ( 'have' ) );
    public final void rule__ObjectDeclaration__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:867:1: ( ( 'has' ) | ( 'have' ) )
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
                    // InternalTraceryPlusPlus.g:868:2: ( 'has' )
                    {
                    // InternalTraceryPlusPlus.g:868:2: ( 'has' )
                    // InternalTraceryPlusPlus.g:869:3: 'has'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getHasKeyword_5_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getObjectDeclarationAccess().getHasKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:874:2: ( 'have' )
                    {
                    // InternalTraceryPlusPlus.g:874:2: ( 'have' )
                    // InternalTraceryPlusPlus.g:875:3: 'have'
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
    // InternalTraceryPlusPlus.g:884:1: rule__Attribute__Alternatives : ( ( ruleJustNameAttribute ) | ( ruleNameExistingListAttribute ) | ( ruleNameValueAttribute ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:888:1: ( ( ruleJustNameAttribute ) | ( ruleNameExistingListAttribute ) | ( ruleNameValueAttribute ) )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 26:
                    {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==RULE_ID) ) {
                        alt7=2;
                    }
                    else if ( (LA7_2==RULE_STRING) ) {
                        alt7=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 27:
                    {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==RULE_ID) ) {
                        alt7=2;
                    }
                    else if ( (LA7_3==RULE_STRING) ) {
                        alt7=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 28:
                    {
                    int LA7_4 = input.LA(3);

                    if ( (LA7_4==RULE_ID) ) {
                        alt7=2;
                    }
                    else if ( (LA7_4==RULE_STRING) ) {
                        alt7=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 4, input);

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
                    alt7=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTraceryPlusPlus.g:889:2: ( ruleJustNameAttribute )
                    {
                    // InternalTraceryPlusPlus.g:889:2: ( ruleJustNameAttribute )
                    // InternalTraceryPlusPlus.g:890:3: ruleJustNameAttribute
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
                    // InternalTraceryPlusPlus.g:895:2: ( ruleNameExistingListAttribute )
                    {
                    // InternalTraceryPlusPlus.g:895:2: ( ruleNameExistingListAttribute )
                    // InternalTraceryPlusPlus.g:896:3: ruleNameExistingListAttribute
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
                    // InternalTraceryPlusPlus.g:901:2: ( ruleNameValueAttribute )
                    {
                    // InternalTraceryPlusPlus.g:901:2: ( ruleNameValueAttribute )
                    // InternalTraceryPlusPlus.g:902:3: ruleNameValueAttribute
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


    // $ANTLR start "rule__ObjectAttribute__Alternatives_0"
    // InternalTraceryPlusPlus.g:911:1: rule__ObjectAttribute__Alternatives_0 : ( ( ( rule__ObjectAttribute__Group_0_0__0 ) ) | ( ( rule__ObjectAttribute__Group_0_1__0 ) ) );
    public final void rule__ObjectAttribute__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:915:1: ( ( ( rule__ObjectAttribute__Group_0_0__0 ) ) | ( ( rule__ObjectAttribute__Group_0_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==39) ) {
                    int LA8_2 = input.LA(3);

                    if ( ((LA8_2>=22 && LA8_2<=25)) ) {
                        alt8=2;
                    }
                    else if ( (LA8_2==RULE_ID) ) {
                        alt8=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;
                    }
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
                    // InternalTraceryPlusPlus.g:916:2: ( ( rule__ObjectAttribute__Group_0_0__0 ) )
                    {
                    // InternalTraceryPlusPlus.g:916:2: ( ( rule__ObjectAttribute__Group_0_0__0 ) )
                    // InternalTraceryPlusPlus.g:917:3: ( rule__ObjectAttribute__Group_0_0__0 )
                    {
                     before(grammarAccess.getObjectAttributeAccess().getGroup_0_0()); 
                    // InternalTraceryPlusPlus.g:918:3: ( rule__ObjectAttribute__Group_0_0__0 )
                    // InternalTraceryPlusPlus.g:918:4: rule__ObjectAttribute__Group_0_0__0
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
                    // InternalTraceryPlusPlus.g:922:2: ( ( rule__ObjectAttribute__Group_0_1__0 ) )
                    {
                    // InternalTraceryPlusPlus.g:922:2: ( ( rule__ObjectAttribute__Group_0_1__0 ) )
                    // InternalTraceryPlusPlus.g:923:3: ( rule__ObjectAttribute__Group_0_1__0 )
                    {
                     before(grammarAccess.getObjectAttributeAccess().getGroup_0_1()); 
                    // InternalTraceryPlusPlus.g:924:3: ( rule__ObjectAttribute__Group_0_1__0 )
                    // InternalTraceryPlusPlus.g:924:4: rule__ObjectAttribute__Group_0_1__0
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
    // InternalTraceryPlusPlus.g:932:1: rule__Pronouns__Alternatives : ( ( ( rule__Pronouns__ValueAssignment_0 ) ) | ( ( rule__Pronouns__ValueAssignment_1 ) ) | ( ( rule__Pronouns__ValueAssignment_2 ) ) | ( ( rule__Pronouns__ValueAssignment_3 ) ) );
    public final void rule__Pronouns__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:936:1: ( ( ( rule__Pronouns__ValueAssignment_0 ) ) | ( ( rule__Pronouns__ValueAssignment_1 ) ) | ( ( rule__Pronouns__ValueAssignment_2 ) ) | ( ( rule__Pronouns__ValueAssignment_3 ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt9=1;
                }
                break;
            case 41:
                {
                alt9=2;
                }
                break;
            case 42:
                {
                alt9=3;
                }
                break;
            case 43:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalTraceryPlusPlus.g:937:2: ( ( rule__Pronouns__ValueAssignment_0 ) )
                    {
                    // InternalTraceryPlusPlus.g:937:2: ( ( rule__Pronouns__ValueAssignment_0 ) )
                    // InternalTraceryPlusPlus.g:938:3: ( rule__Pronouns__ValueAssignment_0 )
                    {
                     before(grammarAccess.getPronounsAccess().getValueAssignment_0()); 
                    // InternalTraceryPlusPlus.g:939:3: ( rule__Pronouns__ValueAssignment_0 )
                    // InternalTraceryPlusPlus.g:939:4: rule__Pronouns__ValueAssignment_0
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
                    // InternalTraceryPlusPlus.g:943:2: ( ( rule__Pronouns__ValueAssignment_1 ) )
                    {
                    // InternalTraceryPlusPlus.g:943:2: ( ( rule__Pronouns__ValueAssignment_1 ) )
                    // InternalTraceryPlusPlus.g:944:3: ( rule__Pronouns__ValueAssignment_1 )
                    {
                     before(grammarAccess.getPronounsAccess().getValueAssignment_1()); 
                    // InternalTraceryPlusPlus.g:945:3: ( rule__Pronouns__ValueAssignment_1 )
                    // InternalTraceryPlusPlus.g:945:4: rule__Pronouns__ValueAssignment_1
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
                    // InternalTraceryPlusPlus.g:949:2: ( ( rule__Pronouns__ValueAssignment_2 ) )
                    {
                    // InternalTraceryPlusPlus.g:949:2: ( ( rule__Pronouns__ValueAssignment_2 ) )
                    // InternalTraceryPlusPlus.g:950:3: ( rule__Pronouns__ValueAssignment_2 )
                    {
                     before(grammarAccess.getPronounsAccess().getValueAssignment_2()); 
                    // InternalTraceryPlusPlus.g:951:3: ( rule__Pronouns__ValueAssignment_2 )
                    // InternalTraceryPlusPlus.g:951:4: rule__Pronouns__ValueAssignment_2
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
                    // InternalTraceryPlusPlus.g:955:2: ( ( rule__Pronouns__ValueAssignment_3 ) )
                    {
                    // InternalTraceryPlusPlus.g:955:2: ( ( rule__Pronouns__ValueAssignment_3 ) )
                    // InternalTraceryPlusPlus.g:956:3: ( rule__Pronouns__ValueAssignment_3 )
                    {
                     before(grammarAccess.getPronounsAccess().getValueAssignment_3()); 
                    // InternalTraceryPlusPlus.g:957:3: ( rule__Pronouns__ValueAssignment_3 )
                    // InternalTraceryPlusPlus.g:957:4: rule__Pronouns__ValueAssignment_3
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
    // InternalTraceryPlusPlus.g:965:1: rule__PronounIdentifier__NameAlternatives_0 : ( ( 'they' ) | ( 'them' ) | ( 'their' ) | ( 'theirs' ) );
    public final void rule__PronounIdentifier__NameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:969:1: ( ( 'they' ) | ( 'them' ) | ( 'their' ) | ( 'theirs' ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt10=1;
                }
                break;
            case 23:
                {
                alt10=2;
                }
                break;
            case 24:
                {
                alt10=3;
                }
                break;
            case 25:
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
                    // InternalTraceryPlusPlus.g:970:2: ( 'they' )
                    {
                    // InternalTraceryPlusPlus.g:970:2: ( 'they' )
                    // InternalTraceryPlusPlus.g:971:3: 'they'
                    {
                     before(grammarAccess.getPronounIdentifierAccess().getNameTheyKeyword_0_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getPronounIdentifierAccess().getNameTheyKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:976:2: ( 'them' )
                    {
                    // InternalTraceryPlusPlus.g:976:2: ( 'them' )
                    // InternalTraceryPlusPlus.g:977:3: 'them'
                    {
                     before(grammarAccess.getPronounIdentifierAccess().getNameThemKeyword_0_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getPronounIdentifierAccess().getNameThemKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:982:2: ( 'their' )
                    {
                    // InternalTraceryPlusPlus.g:982:2: ( 'their' )
                    // InternalTraceryPlusPlus.g:983:3: 'their'
                    {
                     before(grammarAccess.getPronounIdentifierAccess().getNameTheirKeyword_0_2()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getPronounIdentifierAccess().getNameTheirKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTraceryPlusPlus.g:988:2: ( 'theirs' )
                    {
                    // InternalTraceryPlusPlus.g:988:2: ( 'theirs' )
                    // InternalTraceryPlusPlus.g:989:3: 'theirs'
                    {
                     before(grammarAccess.getPronounIdentifierAccess().getNameTheirsKeyword_0_3()); 
                    match(input,25,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:998:1: rule__Modifier__Alternatives : ( ( ruleCapitalizationModifier ) | ( ruleFullCapitalizationModifier ) | ( rulePluralityModifier ) | ( ruleArticleModifier ) | ( rulePastTenseModifier ) );
    public final void rule__Modifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1002:1: ( ( ruleCapitalizationModifier ) | ( ruleFullCapitalizationModifier ) | ( rulePluralityModifier ) | ( ruleArticleModifier ) | ( rulePastTenseModifier ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt11=1;
                }
                break;
            case 12:
                {
                alt11=2;
                }
                break;
            case 13:
                {
                alt11=3;
                }
                break;
            case 14:
                {
                alt11=4;
                }
                break;
            case 15:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1003:2: ( ruleCapitalizationModifier )
                    {
                    // InternalTraceryPlusPlus.g:1003:2: ( ruleCapitalizationModifier )
                    // InternalTraceryPlusPlus.g:1004:3: ruleCapitalizationModifier
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
                    // InternalTraceryPlusPlus.g:1009:2: ( ruleFullCapitalizationModifier )
                    {
                    // InternalTraceryPlusPlus.g:1009:2: ( ruleFullCapitalizationModifier )
                    // InternalTraceryPlusPlus.g:1010:3: ruleFullCapitalizationModifier
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
                    // InternalTraceryPlusPlus.g:1015:2: ( rulePluralityModifier )
                    {
                    // InternalTraceryPlusPlus.g:1015:2: ( rulePluralityModifier )
                    // InternalTraceryPlusPlus.g:1016:3: rulePluralityModifier
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
                    // InternalTraceryPlusPlus.g:1021:2: ( ruleArticleModifier )
                    {
                    // InternalTraceryPlusPlus.g:1021:2: ( ruleArticleModifier )
                    // InternalTraceryPlusPlus.g:1022:3: ruleArticleModifier
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
                    // InternalTraceryPlusPlus.g:1027:2: ( rulePastTenseModifier )
                    {
                    // InternalTraceryPlusPlus.g:1027:2: ( rulePastTenseModifier )
                    // InternalTraceryPlusPlus.g:1028:3: rulePastTenseModifier
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
    // InternalTraceryPlusPlus.g:1037:1: rule__AssignmentOperator__Alternatives : ( ( '=' ) | ( ':' ) | ( '-' ) );
    public final void rule__AssignmentOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1041:1: ( ( '=' ) | ( ':' ) | ( '-' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt12=1;
                }
                break;
            case 27:
                {
                alt12=2;
                }
                break;
            case 28:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1042:2: ( '=' )
                    {
                    // InternalTraceryPlusPlus.g:1042:2: ( '=' )
                    // InternalTraceryPlusPlus.g:1043:3: '='
                    {
                     before(grammarAccess.getAssignmentOperatorAccess().getEqualsSignKeyword_0()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getAssignmentOperatorAccess().getEqualsSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1048:2: ( ':' )
                    {
                    // InternalTraceryPlusPlus.g:1048:2: ( ':' )
                    // InternalTraceryPlusPlus.g:1049:3: ':'
                    {
                     before(grammarAccess.getAssignmentOperatorAccess().getColonKeyword_1()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getAssignmentOperatorAccess().getColonKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1054:2: ( '-' )
                    {
                    // InternalTraceryPlusPlus.g:1054:2: ( '-' )
                    // InternalTraceryPlusPlus.g:1055:3: '-'
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
    // InternalTraceryPlusPlus.g:1064:1: rule__SeparatorOr__Alternatives : ( ( ',' ) | ( 'or' ) );
    public final void rule__SeparatorOr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1068:1: ( ( ',' ) | ( 'or' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            else if ( (LA13_0==30) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1069:2: ( ',' )
                    {
                    // InternalTraceryPlusPlus.g:1069:2: ( ',' )
                    // InternalTraceryPlusPlus.g:1070:3: ','
                    {
                     before(grammarAccess.getSeparatorOrAccess().getCommaKeyword_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getSeparatorOrAccess().getCommaKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1075:2: ( 'or' )
                    {
                    // InternalTraceryPlusPlus.g:1075:2: ( 'or' )
                    // InternalTraceryPlusPlus.g:1076:3: 'or'
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
    // InternalTraceryPlusPlus.g:1085:1: rule__SeparatorAnd__Alternatives : ( ( ',' ) | ( 'and' ) );
    public final void rule__SeparatorAnd__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1089:1: ( ( ',' ) | ( 'and' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            else if ( (LA14_0==31) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1090:2: ( ',' )
                    {
                    // InternalTraceryPlusPlus.g:1090:2: ( ',' )
                    // InternalTraceryPlusPlus.g:1091:3: ','
                    {
                     before(grammarAccess.getSeparatorAndAccess().getCommaKeyword_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getSeparatorAndAccess().getCommaKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1096:2: ( 'and' )
                    {
                    // InternalTraceryPlusPlus.g:1096:2: ( 'and' )
                    // InternalTraceryPlusPlus.g:1097:3: 'and'
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
    // InternalTraceryPlusPlus.g:1106:1: rule__TraceryPlusPlusProgram__Group__0 : rule__TraceryPlusPlusProgram__Group__0__Impl rule__TraceryPlusPlusProgram__Group__1 ;
    public final void rule__TraceryPlusPlusProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1110:1: ( rule__TraceryPlusPlusProgram__Group__0__Impl rule__TraceryPlusPlusProgram__Group__1 )
            // InternalTraceryPlusPlus.g:1111:2: rule__TraceryPlusPlusProgram__Group__0__Impl rule__TraceryPlusPlusProgram__Group__1
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
    // InternalTraceryPlusPlus.g:1118:1: rule__TraceryPlusPlusProgram__Group__0__Impl : ( ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )* ) ;
    public final void rule__TraceryPlusPlusProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1122:1: ( ( ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )* ) )
            // InternalTraceryPlusPlus.g:1123:1: ( ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )* )
            {
            // InternalTraceryPlusPlus.g:1123:1: ( ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )* )
            // InternalTraceryPlusPlus.g:1124:2: ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )*
            {
             before(grammarAccess.getTraceryPlusPlusProgramAccess().getStatementsAssignment_0()); 
            // InternalTraceryPlusPlus.g:1125:2: ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==37) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1125:3: rule__TraceryPlusPlusProgram__StatementsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__TraceryPlusPlusProgram__StatementsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalTraceryPlusPlus.g:1133:1: rule__TraceryPlusPlusProgram__Group__1 : rule__TraceryPlusPlusProgram__Group__1__Impl ;
    public final void rule__TraceryPlusPlusProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1137:1: ( rule__TraceryPlusPlusProgram__Group__1__Impl )
            // InternalTraceryPlusPlus.g:1138:2: rule__TraceryPlusPlusProgram__Group__1__Impl
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
    // InternalTraceryPlusPlus.g:1144:1: rule__TraceryPlusPlusProgram__Group__1__Impl : ( ( rule__TraceryPlusPlusProgram__StoryAssignment_1 ) ) ;
    public final void rule__TraceryPlusPlusProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1148:1: ( ( ( rule__TraceryPlusPlusProgram__StoryAssignment_1 ) ) )
            // InternalTraceryPlusPlus.g:1149:1: ( ( rule__TraceryPlusPlusProgram__StoryAssignment_1 ) )
            {
            // InternalTraceryPlusPlus.g:1149:1: ( ( rule__TraceryPlusPlusProgram__StoryAssignment_1 ) )
            // InternalTraceryPlusPlus.g:1150:2: ( rule__TraceryPlusPlusProgram__StoryAssignment_1 )
            {
             before(grammarAccess.getTraceryPlusPlusProgramAccess().getStoryAssignment_1()); 
            // InternalTraceryPlusPlus.g:1151:2: ( rule__TraceryPlusPlusProgram__StoryAssignment_1 )
            // InternalTraceryPlusPlus.g:1151:3: rule__TraceryPlusPlusProgram__StoryAssignment_1
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
    // InternalTraceryPlusPlus.g:1160:1: rule__Story__Group__0 : rule__Story__Group__0__Impl rule__Story__Group__1 ;
    public final void rule__Story__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1164:1: ( rule__Story__Group__0__Impl rule__Story__Group__1 )
            // InternalTraceryPlusPlus.g:1165:2: rule__Story__Group__0__Impl rule__Story__Group__1
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
    // InternalTraceryPlusPlus.g:1172:1: rule__Story__Group__0__Impl : ( () ) ;
    public final void rule__Story__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1176:1: ( ( () ) )
            // InternalTraceryPlusPlus.g:1177:1: ( () )
            {
            // InternalTraceryPlusPlus.g:1177:1: ( () )
            // InternalTraceryPlusPlus.g:1178:2: ()
            {
             before(grammarAccess.getStoryAccess().getStoryAction_0()); 
            // InternalTraceryPlusPlus.g:1179:2: ()
            // InternalTraceryPlusPlus.g:1179:3: 
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
    // InternalTraceryPlusPlus.g:1187:1: rule__Story__Group__1 : rule__Story__Group__1__Impl rule__Story__Group__2 ;
    public final void rule__Story__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1191:1: ( rule__Story__Group__1__Impl rule__Story__Group__2 )
            // InternalTraceryPlusPlus.g:1192:2: rule__Story__Group__1__Impl rule__Story__Group__2
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
    // InternalTraceryPlusPlus.g:1199:1: rule__Story__Group__1__Impl : ( 'The' ) ;
    public final void rule__Story__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1203:1: ( ( 'The' ) )
            // InternalTraceryPlusPlus.g:1204:1: ( 'The' )
            {
            // InternalTraceryPlusPlus.g:1204:1: ( 'The' )
            // InternalTraceryPlusPlus.g:1205:2: 'The'
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
    // InternalTraceryPlusPlus.g:1214:1: rule__Story__Group__2 : rule__Story__Group__2__Impl rule__Story__Group__3 ;
    public final void rule__Story__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1218:1: ( rule__Story__Group__2__Impl rule__Story__Group__3 )
            // InternalTraceryPlusPlus.g:1219:2: rule__Story__Group__2__Impl rule__Story__Group__3
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
    // InternalTraceryPlusPlus.g:1226:1: rule__Story__Group__2__Impl : ( 'story:' ) ;
    public final void rule__Story__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1230:1: ( ( 'story:' ) )
            // InternalTraceryPlusPlus.g:1231:1: ( 'story:' )
            {
            // InternalTraceryPlusPlus.g:1231:1: ( 'story:' )
            // InternalTraceryPlusPlus.g:1232:2: 'story:'
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
    // InternalTraceryPlusPlus.g:1241:1: rule__Story__Group__3 : rule__Story__Group__3__Impl ;
    public final void rule__Story__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1245:1: ( rule__Story__Group__3__Impl )
            // InternalTraceryPlusPlus.g:1246:2: rule__Story__Group__3__Impl
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
    // InternalTraceryPlusPlus.g:1252:1: rule__Story__Group__3__Impl : ( ( rule__Story__StoryAssignment_3 )* ) ;
    public final void rule__Story__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1256:1: ( ( ( rule__Story__StoryAssignment_3 )* ) )
            // InternalTraceryPlusPlus.g:1257:1: ( ( rule__Story__StoryAssignment_3 )* )
            {
            // InternalTraceryPlusPlus.g:1257:1: ( ( rule__Story__StoryAssignment_3 )* )
            // InternalTraceryPlusPlus.g:1258:2: ( rule__Story__StoryAssignment_3 )*
            {
             before(grammarAccess.getStoryAccess().getStoryAssignment_3()); 
            // InternalTraceryPlusPlus.g:1259:2: ( rule__Story__StoryAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1259:3: rule__Story__StoryAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Story__StoryAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalTraceryPlusPlus.g:1268:1: rule__ListDeclaration__Group__0 : rule__ListDeclaration__Group__0__Impl rule__ListDeclaration__Group__1 ;
    public final void rule__ListDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1272:1: ( rule__ListDeclaration__Group__0__Impl rule__ListDeclaration__Group__1 )
            // InternalTraceryPlusPlus.g:1273:2: rule__ListDeclaration__Group__0__Impl rule__ListDeclaration__Group__1
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
    // InternalTraceryPlusPlus.g:1280:1: rule__ListDeclaration__Group__0__Impl : ( ( rule__ListDeclaration__NameAssignment_0 ) ) ;
    public final void rule__ListDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1284:1: ( ( ( rule__ListDeclaration__NameAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:1285:1: ( ( rule__ListDeclaration__NameAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:1285:1: ( ( rule__ListDeclaration__NameAssignment_0 ) )
            // InternalTraceryPlusPlus.g:1286:2: ( rule__ListDeclaration__NameAssignment_0 )
            {
             before(grammarAccess.getListDeclarationAccess().getNameAssignment_0()); 
            // InternalTraceryPlusPlus.g:1287:2: ( rule__ListDeclaration__NameAssignment_0 )
            // InternalTraceryPlusPlus.g:1287:3: rule__ListDeclaration__NameAssignment_0
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
    // InternalTraceryPlusPlus.g:1295:1: rule__ListDeclaration__Group__1 : rule__ListDeclaration__Group__1__Impl rule__ListDeclaration__Group__2 ;
    public final void rule__ListDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1299:1: ( rule__ListDeclaration__Group__1__Impl rule__ListDeclaration__Group__2 )
            // InternalTraceryPlusPlus.g:1300:2: rule__ListDeclaration__Group__1__Impl rule__ListDeclaration__Group__2
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
    // InternalTraceryPlusPlus.g:1307:1: rule__ListDeclaration__Group__1__Impl : ( ( rule__ListDeclaration__Alternatives_1 ) ) ;
    public final void rule__ListDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1311:1: ( ( ( rule__ListDeclaration__Alternatives_1 ) ) )
            // InternalTraceryPlusPlus.g:1312:1: ( ( rule__ListDeclaration__Alternatives_1 ) )
            {
            // InternalTraceryPlusPlus.g:1312:1: ( ( rule__ListDeclaration__Alternatives_1 ) )
            // InternalTraceryPlusPlus.g:1313:2: ( rule__ListDeclaration__Alternatives_1 )
            {
             before(grammarAccess.getListDeclarationAccess().getAlternatives_1()); 
            // InternalTraceryPlusPlus.g:1314:2: ( rule__ListDeclaration__Alternatives_1 )
            // InternalTraceryPlusPlus.g:1314:3: rule__ListDeclaration__Alternatives_1
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
    // InternalTraceryPlusPlus.g:1322:1: rule__ListDeclaration__Group__2 : rule__ListDeclaration__Group__2__Impl rule__ListDeclaration__Group__3 ;
    public final void rule__ListDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1326:1: ( rule__ListDeclaration__Group__2__Impl rule__ListDeclaration__Group__3 )
            // InternalTraceryPlusPlus.g:1327:2: rule__ListDeclaration__Group__2__Impl rule__ListDeclaration__Group__3
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
    // InternalTraceryPlusPlus.g:1334:1: rule__ListDeclaration__Group__2__Impl : ( ruleAssignmentOperator ) ;
    public final void rule__ListDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1338:1: ( ( ruleAssignmentOperator ) )
            // InternalTraceryPlusPlus.g:1339:1: ( ruleAssignmentOperator )
            {
            // InternalTraceryPlusPlus.g:1339:1: ( ruleAssignmentOperator )
            // InternalTraceryPlusPlus.g:1340:2: ruleAssignmentOperator
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
    // InternalTraceryPlusPlus.g:1349:1: rule__ListDeclaration__Group__3 : rule__ListDeclaration__Group__3__Impl ;
    public final void rule__ListDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1353:1: ( rule__ListDeclaration__Group__3__Impl )
            // InternalTraceryPlusPlus.g:1354:2: rule__ListDeclaration__Group__3__Impl
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
    // InternalTraceryPlusPlus.g:1360:1: rule__ListDeclaration__Group__3__Impl : ( ( rule__ListDeclaration__ListAssignment_3 ) ) ;
    public final void rule__ListDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1364:1: ( ( ( rule__ListDeclaration__ListAssignment_3 ) ) )
            // InternalTraceryPlusPlus.g:1365:1: ( ( rule__ListDeclaration__ListAssignment_3 ) )
            {
            // InternalTraceryPlusPlus.g:1365:1: ( ( rule__ListDeclaration__ListAssignment_3 ) )
            // InternalTraceryPlusPlus.g:1366:2: ( rule__ListDeclaration__ListAssignment_3 )
            {
             before(grammarAccess.getListDeclarationAccess().getListAssignment_3()); 
            // InternalTraceryPlusPlus.g:1367:2: ( rule__ListDeclaration__ListAssignment_3 )
            // InternalTraceryPlusPlus.g:1367:3: rule__ListDeclaration__ListAssignment_3
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
    // InternalTraceryPlusPlus.g:1376:1: rule__ListDeclaration__Group_1_0__0 : rule__ListDeclaration__Group_1_0__0__Impl rule__ListDeclaration__Group_1_0__1 ;
    public final void rule__ListDeclaration__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1380:1: ( rule__ListDeclaration__Group_1_0__0__Impl rule__ListDeclaration__Group_1_0__1 )
            // InternalTraceryPlusPlus.g:1381:2: rule__ListDeclaration__Group_1_0__0__Impl rule__ListDeclaration__Group_1_0__1
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
    // InternalTraceryPlusPlus.g:1388:1: rule__ListDeclaration__Group_1_0__0__Impl : ( 'can' ) ;
    public final void rule__ListDeclaration__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1392:1: ( ( 'can' ) )
            // InternalTraceryPlusPlus.g:1393:1: ( 'can' )
            {
            // InternalTraceryPlusPlus.g:1393:1: ( 'can' )
            // InternalTraceryPlusPlus.g:1394:2: 'can'
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
    // InternalTraceryPlusPlus.g:1403:1: rule__ListDeclaration__Group_1_0__1 : rule__ListDeclaration__Group_1_0__1__Impl rule__ListDeclaration__Group_1_0__2 ;
    public final void rule__ListDeclaration__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1407:1: ( rule__ListDeclaration__Group_1_0__1__Impl rule__ListDeclaration__Group_1_0__2 )
            // InternalTraceryPlusPlus.g:1408:2: rule__ListDeclaration__Group_1_0__1__Impl rule__ListDeclaration__Group_1_0__2
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
    // InternalTraceryPlusPlus.g:1415:1: rule__ListDeclaration__Group_1_0__1__Impl : ( 'have' ) ;
    public final void rule__ListDeclaration__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1419:1: ( ( 'have' ) )
            // InternalTraceryPlusPlus.g:1420:1: ( 'have' )
            {
            // InternalTraceryPlusPlus.g:1420:1: ( 'have' )
            // InternalTraceryPlusPlus.g:1421:2: 'have'
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
    // InternalTraceryPlusPlus.g:1430:1: rule__ListDeclaration__Group_1_0__2 : rule__ListDeclaration__Group_1_0__2__Impl ;
    public final void rule__ListDeclaration__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1434:1: ( rule__ListDeclaration__Group_1_0__2__Impl )
            // InternalTraceryPlusPlus.g:1435:2: rule__ListDeclaration__Group_1_0__2__Impl
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
    // InternalTraceryPlusPlus.g:1441:1: rule__ListDeclaration__Group_1_0__2__Impl : ( 'values' ) ;
    public final void rule__ListDeclaration__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1445:1: ( ( 'values' ) )
            // InternalTraceryPlusPlus.g:1446:1: ( 'values' )
            {
            // InternalTraceryPlusPlus.g:1446:1: ( 'values' )
            // InternalTraceryPlusPlus.g:1447:2: 'values'
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
    // InternalTraceryPlusPlus.g:1457:1: rule__ListDeclaration__Group_1_1__0 : rule__ListDeclaration__Group_1_1__0__Impl rule__ListDeclaration__Group_1_1__1 ;
    public final void rule__ListDeclaration__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1461:1: ( rule__ListDeclaration__Group_1_1__0__Impl rule__ListDeclaration__Group_1_1__1 )
            // InternalTraceryPlusPlus.g:1462:2: rule__ListDeclaration__Group_1_1__0__Impl rule__ListDeclaration__Group_1_1__1
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
    // InternalTraceryPlusPlus.g:1469:1: rule__ListDeclaration__Group_1_1__0__Impl : ( 'can' ) ;
    public final void rule__ListDeclaration__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1473:1: ( ( 'can' ) )
            // InternalTraceryPlusPlus.g:1474:1: ( 'can' )
            {
            // InternalTraceryPlusPlus.g:1474:1: ( 'can' )
            // InternalTraceryPlusPlus.g:1475:2: 'can'
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
    // InternalTraceryPlusPlus.g:1484:1: rule__ListDeclaration__Group_1_1__1 : rule__ListDeclaration__Group_1_1__1__Impl ;
    public final void rule__ListDeclaration__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1488:1: ( rule__ListDeclaration__Group_1_1__1__Impl )
            // InternalTraceryPlusPlus.g:1489:2: rule__ListDeclaration__Group_1_1__1__Impl
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
    // InternalTraceryPlusPlus.g:1495:1: rule__ListDeclaration__Group_1_1__1__Impl : ( 'be' ) ;
    public final void rule__ListDeclaration__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1499:1: ( ( 'be' ) )
            // InternalTraceryPlusPlus.g:1500:1: ( 'be' )
            {
            // InternalTraceryPlusPlus.g:1500:1: ( 'be' )
            // InternalTraceryPlusPlus.g:1501:2: 'be'
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
    // InternalTraceryPlusPlus.g:1511:1: rule__ObjectDeclaration__Group__0 : rule__ObjectDeclaration__Group__0__Impl rule__ObjectDeclaration__Group__1 ;
    public final void rule__ObjectDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1515:1: ( rule__ObjectDeclaration__Group__0__Impl rule__ObjectDeclaration__Group__1 )
            // InternalTraceryPlusPlus.g:1516:2: rule__ObjectDeclaration__Group__0__Impl rule__ObjectDeclaration__Group__1
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
    // InternalTraceryPlusPlus.g:1523:1: rule__ObjectDeclaration__Group__0__Impl : ( 'There' ) ;
    public final void rule__ObjectDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1527:1: ( ( 'There' ) )
            // InternalTraceryPlusPlus.g:1528:1: ( 'There' )
            {
            // InternalTraceryPlusPlus.g:1528:1: ( 'There' )
            // InternalTraceryPlusPlus.g:1529:2: 'There'
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
    // InternalTraceryPlusPlus.g:1538:1: rule__ObjectDeclaration__Group__1 : rule__ObjectDeclaration__Group__1__Impl rule__ObjectDeclaration__Group__2 ;
    public final void rule__ObjectDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1542:1: ( rule__ObjectDeclaration__Group__1__Impl rule__ObjectDeclaration__Group__2 )
            // InternalTraceryPlusPlus.g:1543:2: rule__ObjectDeclaration__Group__1__Impl rule__ObjectDeclaration__Group__2
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
    // InternalTraceryPlusPlus.g:1550:1: rule__ObjectDeclaration__Group__1__Impl : ( ( rule__ObjectDeclaration__Alternatives_1 ) ) ;
    public final void rule__ObjectDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1554:1: ( ( ( rule__ObjectDeclaration__Alternatives_1 ) ) )
            // InternalTraceryPlusPlus.g:1555:1: ( ( rule__ObjectDeclaration__Alternatives_1 ) )
            {
            // InternalTraceryPlusPlus.g:1555:1: ( ( rule__ObjectDeclaration__Alternatives_1 ) )
            // InternalTraceryPlusPlus.g:1556:2: ( rule__ObjectDeclaration__Alternatives_1 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getAlternatives_1()); 
            // InternalTraceryPlusPlus.g:1557:2: ( rule__ObjectDeclaration__Alternatives_1 )
            // InternalTraceryPlusPlus.g:1557:3: rule__ObjectDeclaration__Alternatives_1
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
    // InternalTraceryPlusPlus.g:1565:1: rule__ObjectDeclaration__Group__2 : rule__ObjectDeclaration__Group__2__Impl rule__ObjectDeclaration__Group__3 ;
    public final void rule__ObjectDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1569:1: ( rule__ObjectDeclaration__Group__2__Impl rule__ObjectDeclaration__Group__3 )
            // InternalTraceryPlusPlus.g:1570:2: rule__ObjectDeclaration__Group__2__Impl rule__ObjectDeclaration__Group__3
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
    // InternalTraceryPlusPlus.g:1577:1: rule__ObjectDeclaration__Group__2__Impl : ( ( rule__ObjectDeclaration__Alternatives_2 )? ) ;
    public final void rule__ObjectDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1581:1: ( ( ( rule__ObjectDeclaration__Alternatives_2 )? ) )
            // InternalTraceryPlusPlus.g:1582:1: ( ( rule__ObjectDeclaration__Alternatives_2 )? )
            {
            // InternalTraceryPlusPlus.g:1582:1: ( ( rule__ObjectDeclaration__Alternatives_2 )? )
            // InternalTraceryPlusPlus.g:1583:2: ( rule__ObjectDeclaration__Alternatives_2 )?
            {
             before(grammarAccess.getObjectDeclarationAccess().getAlternatives_2()); 
            // InternalTraceryPlusPlus.g:1584:2: ( rule__ObjectDeclaration__Alternatives_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=18 && LA17_0<=19)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1584:3: rule__ObjectDeclaration__Alternatives_2
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
    // InternalTraceryPlusPlus.g:1592:1: rule__ObjectDeclaration__Group__3 : rule__ObjectDeclaration__Group__3__Impl rule__ObjectDeclaration__Group__4 ;
    public final void rule__ObjectDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1596:1: ( rule__ObjectDeclaration__Group__3__Impl rule__ObjectDeclaration__Group__4 )
            // InternalTraceryPlusPlus.g:1597:2: rule__ObjectDeclaration__Group__3__Impl rule__ObjectDeclaration__Group__4
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
    // InternalTraceryPlusPlus.g:1604:1: rule__ObjectDeclaration__Group__3__Impl : ( ( rule__ObjectDeclaration__NameAssignment_3 ) ) ;
    public final void rule__ObjectDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1608:1: ( ( ( rule__ObjectDeclaration__NameAssignment_3 ) ) )
            // InternalTraceryPlusPlus.g:1609:1: ( ( rule__ObjectDeclaration__NameAssignment_3 ) )
            {
            // InternalTraceryPlusPlus.g:1609:1: ( ( rule__ObjectDeclaration__NameAssignment_3 ) )
            // InternalTraceryPlusPlus.g:1610:2: ( rule__ObjectDeclaration__NameAssignment_3 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getNameAssignment_3()); 
            // InternalTraceryPlusPlus.g:1611:2: ( rule__ObjectDeclaration__NameAssignment_3 )
            // InternalTraceryPlusPlus.g:1611:3: rule__ObjectDeclaration__NameAssignment_3
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
    // InternalTraceryPlusPlus.g:1619:1: rule__ObjectDeclaration__Group__4 : rule__ObjectDeclaration__Group__4__Impl rule__ObjectDeclaration__Group__5 ;
    public final void rule__ObjectDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1623:1: ( rule__ObjectDeclaration__Group__4__Impl rule__ObjectDeclaration__Group__5 )
            // InternalTraceryPlusPlus.g:1624:2: rule__ObjectDeclaration__Group__4__Impl rule__ObjectDeclaration__Group__5
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
    // InternalTraceryPlusPlus.g:1631:1: rule__ObjectDeclaration__Group__4__Impl : ( ( rule__ObjectDeclaration__PronounsAssignment_4 ) ) ;
    public final void rule__ObjectDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1635:1: ( ( ( rule__ObjectDeclaration__PronounsAssignment_4 ) ) )
            // InternalTraceryPlusPlus.g:1636:1: ( ( rule__ObjectDeclaration__PronounsAssignment_4 ) )
            {
            // InternalTraceryPlusPlus.g:1636:1: ( ( rule__ObjectDeclaration__PronounsAssignment_4 ) )
            // InternalTraceryPlusPlus.g:1637:2: ( rule__ObjectDeclaration__PronounsAssignment_4 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getPronounsAssignment_4()); 
            // InternalTraceryPlusPlus.g:1638:2: ( rule__ObjectDeclaration__PronounsAssignment_4 )
            // InternalTraceryPlusPlus.g:1638:3: rule__ObjectDeclaration__PronounsAssignment_4
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
    // InternalTraceryPlusPlus.g:1646:1: rule__ObjectDeclaration__Group__5 : rule__ObjectDeclaration__Group__5__Impl rule__ObjectDeclaration__Group__6 ;
    public final void rule__ObjectDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1650:1: ( rule__ObjectDeclaration__Group__5__Impl rule__ObjectDeclaration__Group__6 )
            // InternalTraceryPlusPlus.g:1651:2: rule__ObjectDeclaration__Group__5__Impl rule__ObjectDeclaration__Group__6
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
    // InternalTraceryPlusPlus.g:1658:1: rule__ObjectDeclaration__Group__5__Impl : ( ( rule__ObjectDeclaration__Alternatives_5 ) ) ;
    public final void rule__ObjectDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1662:1: ( ( ( rule__ObjectDeclaration__Alternatives_5 ) ) )
            // InternalTraceryPlusPlus.g:1663:1: ( ( rule__ObjectDeclaration__Alternatives_5 ) )
            {
            // InternalTraceryPlusPlus.g:1663:1: ( ( rule__ObjectDeclaration__Alternatives_5 ) )
            // InternalTraceryPlusPlus.g:1664:2: ( rule__ObjectDeclaration__Alternatives_5 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getAlternatives_5()); 
            // InternalTraceryPlusPlus.g:1665:2: ( rule__ObjectDeclaration__Alternatives_5 )
            // InternalTraceryPlusPlus.g:1665:3: rule__ObjectDeclaration__Alternatives_5
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
    // InternalTraceryPlusPlus.g:1673:1: rule__ObjectDeclaration__Group__6 : rule__ObjectDeclaration__Group__6__Impl rule__ObjectDeclaration__Group__7 ;
    public final void rule__ObjectDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1677:1: ( rule__ObjectDeclaration__Group__6__Impl rule__ObjectDeclaration__Group__7 )
            // InternalTraceryPlusPlus.g:1678:2: rule__ObjectDeclaration__Group__6__Impl rule__ObjectDeclaration__Group__7
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
    // InternalTraceryPlusPlus.g:1685:1: rule__ObjectDeclaration__Group__6__Impl : ( 'attributes' ) ;
    public final void rule__ObjectDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1689:1: ( ( 'attributes' ) )
            // InternalTraceryPlusPlus.g:1690:1: ( 'attributes' )
            {
            // InternalTraceryPlusPlus.g:1690:1: ( 'attributes' )
            // InternalTraceryPlusPlus.g:1691:2: 'attributes'
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
    // InternalTraceryPlusPlus.g:1700:1: rule__ObjectDeclaration__Group__7 : rule__ObjectDeclaration__Group__7__Impl rule__ObjectDeclaration__Group__8 ;
    public final void rule__ObjectDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1704:1: ( rule__ObjectDeclaration__Group__7__Impl rule__ObjectDeclaration__Group__8 )
            // InternalTraceryPlusPlus.g:1705:2: rule__ObjectDeclaration__Group__7__Impl rule__ObjectDeclaration__Group__8
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
    // InternalTraceryPlusPlus.g:1712:1: rule__ObjectDeclaration__Group__7__Impl : ( ruleAssignmentOperator ) ;
    public final void rule__ObjectDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1716:1: ( ( ruleAssignmentOperator ) )
            // InternalTraceryPlusPlus.g:1717:1: ( ruleAssignmentOperator )
            {
            // InternalTraceryPlusPlus.g:1717:1: ( ruleAssignmentOperator )
            // InternalTraceryPlusPlus.g:1718:2: ruleAssignmentOperator
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
    // InternalTraceryPlusPlus.g:1727:1: rule__ObjectDeclaration__Group__8 : rule__ObjectDeclaration__Group__8__Impl ;
    public final void rule__ObjectDeclaration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1731:1: ( rule__ObjectDeclaration__Group__8__Impl )
            // InternalTraceryPlusPlus.g:1732:2: rule__ObjectDeclaration__Group__8__Impl
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
    // InternalTraceryPlusPlus.g:1738:1: rule__ObjectDeclaration__Group__8__Impl : ( ( rule__ObjectDeclaration__AttributesAssignment_8 ) ) ;
    public final void rule__ObjectDeclaration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1742:1: ( ( ( rule__ObjectDeclaration__AttributesAssignment_8 ) ) )
            // InternalTraceryPlusPlus.g:1743:1: ( ( rule__ObjectDeclaration__AttributesAssignment_8 ) )
            {
            // InternalTraceryPlusPlus.g:1743:1: ( ( rule__ObjectDeclaration__AttributesAssignment_8 ) )
            // InternalTraceryPlusPlus.g:1744:2: ( rule__ObjectDeclaration__AttributesAssignment_8 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getAttributesAssignment_8()); 
            // InternalTraceryPlusPlus.g:1745:2: ( rule__ObjectDeclaration__AttributesAssignment_8 )
            // InternalTraceryPlusPlus.g:1745:3: rule__ObjectDeclaration__AttributesAssignment_8
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
    // InternalTraceryPlusPlus.g:1754:1: rule__StoryVariable__Group__0 : rule__StoryVariable__Group__0__Impl rule__StoryVariable__Group__1 ;
    public final void rule__StoryVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1758:1: ( rule__StoryVariable__Group__0__Impl rule__StoryVariable__Group__1 )
            // InternalTraceryPlusPlus.g:1759:2: rule__StoryVariable__Group__0__Impl rule__StoryVariable__Group__1
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
    // InternalTraceryPlusPlus.g:1766:1: rule__StoryVariable__Group__0__Impl : ( ( rule__StoryVariable__VariableAssignment_0 ) ) ;
    public final void rule__StoryVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1770:1: ( ( ( rule__StoryVariable__VariableAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:1771:1: ( ( rule__StoryVariable__VariableAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:1771:1: ( ( rule__StoryVariable__VariableAssignment_0 ) )
            // InternalTraceryPlusPlus.g:1772:2: ( rule__StoryVariable__VariableAssignment_0 )
            {
             before(grammarAccess.getStoryVariableAccess().getVariableAssignment_0()); 
            // InternalTraceryPlusPlus.g:1773:2: ( rule__StoryVariable__VariableAssignment_0 )
            // InternalTraceryPlusPlus.g:1773:3: rule__StoryVariable__VariableAssignment_0
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
    // InternalTraceryPlusPlus.g:1781:1: rule__StoryVariable__Group__1 : rule__StoryVariable__Group__1__Impl ;
    public final void rule__StoryVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1785:1: ( rule__StoryVariable__Group__1__Impl )
            // InternalTraceryPlusPlus.g:1786:2: rule__StoryVariable__Group__1__Impl
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
    // InternalTraceryPlusPlus.g:1792:1: rule__StoryVariable__Group__1__Impl : ( ( rule__StoryVariable__ModifiersAssignment_1 )* ) ;
    public final void rule__StoryVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1796:1: ( ( ( rule__StoryVariable__ModifiersAssignment_1 )* ) )
            // InternalTraceryPlusPlus.g:1797:1: ( ( rule__StoryVariable__ModifiersAssignment_1 )* )
            {
            // InternalTraceryPlusPlus.g:1797:1: ( ( rule__StoryVariable__ModifiersAssignment_1 )* )
            // InternalTraceryPlusPlus.g:1798:2: ( rule__StoryVariable__ModifiersAssignment_1 )*
            {
             before(grammarAccess.getStoryVariableAccess().getModifiersAssignment_1()); 
            // InternalTraceryPlusPlus.g:1799:2: ( rule__StoryVariable__ModifiersAssignment_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=11 && LA18_0<=15)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1799:3: rule__StoryVariable__ModifiersAssignment_1
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__StoryVariable__ModifiersAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalTraceryPlusPlus.g:1808:1: rule__NameExistingListAttribute__Group__0 : rule__NameExistingListAttribute__Group__0__Impl rule__NameExistingListAttribute__Group__1 ;
    public final void rule__NameExistingListAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1812:1: ( rule__NameExistingListAttribute__Group__0__Impl rule__NameExistingListAttribute__Group__1 )
            // InternalTraceryPlusPlus.g:1813:2: rule__NameExistingListAttribute__Group__0__Impl rule__NameExistingListAttribute__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalTraceryPlusPlus.g:1820:1: rule__NameExistingListAttribute__Group__0__Impl : ( ( rule__NameExistingListAttribute__NameAssignment_0 ) ) ;
    public final void rule__NameExistingListAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1824:1: ( ( ( rule__NameExistingListAttribute__NameAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:1825:1: ( ( rule__NameExistingListAttribute__NameAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:1825:1: ( ( rule__NameExistingListAttribute__NameAssignment_0 ) )
            // InternalTraceryPlusPlus.g:1826:2: ( rule__NameExistingListAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getNameExistingListAttributeAccess().getNameAssignment_0()); 
            // InternalTraceryPlusPlus.g:1827:2: ( rule__NameExistingListAttribute__NameAssignment_0 )
            // InternalTraceryPlusPlus.g:1827:3: rule__NameExistingListAttribute__NameAssignment_0
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
    // InternalTraceryPlusPlus.g:1835:1: rule__NameExistingListAttribute__Group__1 : rule__NameExistingListAttribute__Group__1__Impl rule__NameExistingListAttribute__Group__2 ;
    public final void rule__NameExistingListAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1839:1: ( rule__NameExistingListAttribute__Group__1__Impl rule__NameExistingListAttribute__Group__2 )
            // InternalTraceryPlusPlus.g:1840:2: rule__NameExistingListAttribute__Group__1__Impl rule__NameExistingListAttribute__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalTraceryPlusPlus.g:1847:1: rule__NameExistingListAttribute__Group__1__Impl : ( ruleAssignmentOperator ) ;
    public final void rule__NameExistingListAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1851:1: ( ( ruleAssignmentOperator ) )
            // InternalTraceryPlusPlus.g:1852:1: ( ruleAssignmentOperator )
            {
            // InternalTraceryPlusPlus.g:1852:1: ( ruleAssignmentOperator )
            // InternalTraceryPlusPlus.g:1853:2: ruleAssignmentOperator
            {
             before(grammarAccess.getNameExistingListAttributeAccess().getAssignmentOperatorParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleAssignmentOperator();

            state._fsp--;

             after(grammarAccess.getNameExistingListAttributeAccess().getAssignmentOperatorParserRuleCall_1()); 

            }


            }

        }
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
    // InternalTraceryPlusPlus.g:1862:1: rule__NameExistingListAttribute__Group__2 : rule__NameExistingListAttribute__Group__2__Impl ;
    public final void rule__NameExistingListAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1866:1: ( rule__NameExistingListAttribute__Group__2__Impl )
            // InternalTraceryPlusPlus.g:1867:2: rule__NameExistingListAttribute__Group__2__Impl
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
    // InternalTraceryPlusPlus.g:1873:1: rule__NameExistingListAttribute__Group__2__Impl : ( ( rule__NameExistingListAttribute__ValueAssignment_2 ) ) ;
    public final void rule__NameExistingListAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1877:1: ( ( ( rule__NameExistingListAttribute__ValueAssignment_2 ) ) )
            // InternalTraceryPlusPlus.g:1878:1: ( ( rule__NameExistingListAttribute__ValueAssignment_2 ) )
            {
            // InternalTraceryPlusPlus.g:1878:1: ( ( rule__NameExistingListAttribute__ValueAssignment_2 ) )
            // InternalTraceryPlusPlus.g:1879:2: ( rule__NameExistingListAttribute__ValueAssignment_2 )
            {
             before(grammarAccess.getNameExistingListAttributeAccess().getValueAssignment_2()); 
            // InternalTraceryPlusPlus.g:1880:2: ( rule__NameExistingListAttribute__ValueAssignment_2 )
            // InternalTraceryPlusPlus.g:1880:3: rule__NameExistingListAttribute__ValueAssignment_2
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
    // InternalTraceryPlusPlus.g:1889:1: rule__NameValueAttribute__Group__0 : rule__NameValueAttribute__Group__0__Impl rule__NameValueAttribute__Group__1 ;
    public final void rule__NameValueAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1893:1: ( rule__NameValueAttribute__Group__0__Impl rule__NameValueAttribute__Group__1 )
            // InternalTraceryPlusPlus.g:1894:2: rule__NameValueAttribute__Group__0__Impl rule__NameValueAttribute__Group__1
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
    // InternalTraceryPlusPlus.g:1901:1: rule__NameValueAttribute__Group__0__Impl : ( ( rule__NameValueAttribute__NameAssignment_0 ) ) ;
    public final void rule__NameValueAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1905:1: ( ( ( rule__NameValueAttribute__NameAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:1906:1: ( ( rule__NameValueAttribute__NameAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:1906:1: ( ( rule__NameValueAttribute__NameAssignment_0 ) )
            // InternalTraceryPlusPlus.g:1907:2: ( rule__NameValueAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getNameValueAttributeAccess().getNameAssignment_0()); 
            // InternalTraceryPlusPlus.g:1908:2: ( rule__NameValueAttribute__NameAssignment_0 )
            // InternalTraceryPlusPlus.g:1908:3: rule__NameValueAttribute__NameAssignment_0
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
    // InternalTraceryPlusPlus.g:1916:1: rule__NameValueAttribute__Group__1 : rule__NameValueAttribute__Group__1__Impl rule__NameValueAttribute__Group__2 ;
    public final void rule__NameValueAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1920:1: ( rule__NameValueAttribute__Group__1__Impl rule__NameValueAttribute__Group__2 )
            // InternalTraceryPlusPlus.g:1921:2: rule__NameValueAttribute__Group__1__Impl rule__NameValueAttribute__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalTraceryPlusPlus.g:1928:1: rule__NameValueAttribute__Group__1__Impl : ( ruleAssignmentOperator ) ;
    public final void rule__NameValueAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1932:1: ( ( ruleAssignmentOperator ) )
            // InternalTraceryPlusPlus.g:1933:1: ( ruleAssignmentOperator )
            {
            // InternalTraceryPlusPlus.g:1933:1: ( ruleAssignmentOperator )
            // InternalTraceryPlusPlus.g:1934:2: ruleAssignmentOperator
            {
             before(grammarAccess.getNameValueAttributeAccess().getAssignmentOperatorParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleAssignmentOperator();

            state._fsp--;

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
    // InternalTraceryPlusPlus.g:1943:1: rule__NameValueAttribute__Group__2 : rule__NameValueAttribute__Group__2__Impl ;
    public final void rule__NameValueAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1947:1: ( rule__NameValueAttribute__Group__2__Impl )
            // InternalTraceryPlusPlus.g:1948:2: rule__NameValueAttribute__Group__2__Impl
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
    // InternalTraceryPlusPlus.g:1954:1: rule__NameValueAttribute__Group__2__Impl : ( ( rule__NameValueAttribute__ValueAssignment_2 ) ) ;
    public final void rule__NameValueAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1958:1: ( ( ( rule__NameValueAttribute__ValueAssignment_2 ) ) )
            // InternalTraceryPlusPlus.g:1959:1: ( ( rule__NameValueAttribute__ValueAssignment_2 ) )
            {
            // InternalTraceryPlusPlus.g:1959:1: ( ( rule__NameValueAttribute__ValueAssignment_2 ) )
            // InternalTraceryPlusPlus.g:1960:2: ( rule__NameValueAttribute__ValueAssignment_2 )
            {
             before(grammarAccess.getNameValueAttributeAccess().getValueAssignment_2()); 
            // InternalTraceryPlusPlus.g:1961:2: ( rule__NameValueAttribute__ValueAssignment_2 )
            // InternalTraceryPlusPlus.g:1961:3: rule__NameValueAttribute__ValueAssignment_2
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
    // InternalTraceryPlusPlus.g:1970:1: rule__ObjectAttribute__Group__0 : rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1 ;
    public final void rule__ObjectAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1974:1: ( rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1 )
            // InternalTraceryPlusPlus.g:1975:2: rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalTraceryPlusPlus.g:1982:1: rule__ObjectAttribute__Group__0__Impl : ( ( rule__ObjectAttribute__Alternatives_0 ) ) ;
    public final void rule__ObjectAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1986:1: ( ( ( rule__ObjectAttribute__Alternatives_0 ) ) )
            // InternalTraceryPlusPlus.g:1987:1: ( ( rule__ObjectAttribute__Alternatives_0 ) )
            {
            // InternalTraceryPlusPlus.g:1987:1: ( ( rule__ObjectAttribute__Alternatives_0 ) )
            // InternalTraceryPlusPlus.g:1988:2: ( rule__ObjectAttribute__Alternatives_0 )
            {
             before(grammarAccess.getObjectAttributeAccess().getAlternatives_0()); 
            // InternalTraceryPlusPlus.g:1989:2: ( rule__ObjectAttribute__Alternatives_0 )
            // InternalTraceryPlusPlus.g:1989:3: rule__ObjectAttribute__Alternatives_0
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
    // InternalTraceryPlusPlus.g:1997:1: rule__ObjectAttribute__Group__1 : rule__ObjectAttribute__Group__1__Impl ;
    public final void rule__ObjectAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2001:1: ( rule__ObjectAttribute__Group__1__Impl )
            // InternalTraceryPlusPlus.g:2002:2: rule__ObjectAttribute__Group__1__Impl
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
    // InternalTraceryPlusPlus.g:2008:1: rule__ObjectAttribute__Group__1__Impl : ( ( rule__ObjectAttribute__ModifiersAssignment_1 )* ) ;
    public final void rule__ObjectAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2012:1: ( ( ( rule__ObjectAttribute__ModifiersAssignment_1 )* ) )
            // InternalTraceryPlusPlus.g:2013:1: ( ( rule__ObjectAttribute__ModifiersAssignment_1 )* )
            {
            // InternalTraceryPlusPlus.g:2013:1: ( ( rule__ObjectAttribute__ModifiersAssignment_1 )* )
            // InternalTraceryPlusPlus.g:2014:2: ( rule__ObjectAttribute__ModifiersAssignment_1 )*
            {
             before(grammarAccess.getObjectAttributeAccess().getModifiersAssignment_1()); 
            // InternalTraceryPlusPlus.g:2015:2: ( rule__ObjectAttribute__ModifiersAssignment_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=11 && LA19_0<=15)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:2015:3: rule__ObjectAttribute__ModifiersAssignment_1
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__ObjectAttribute__ModifiersAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalTraceryPlusPlus.g:2024:1: rule__ObjectAttribute__Group_0_0__0 : rule__ObjectAttribute__Group_0_0__0__Impl rule__ObjectAttribute__Group_0_0__1 ;
    public final void rule__ObjectAttribute__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2028:1: ( rule__ObjectAttribute__Group_0_0__0__Impl rule__ObjectAttribute__Group_0_0__1 )
            // InternalTraceryPlusPlus.g:2029:2: rule__ObjectAttribute__Group_0_0__0__Impl rule__ObjectAttribute__Group_0_0__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalTraceryPlusPlus.g:2036:1: rule__ObjectAttribute__Group_0_0__0__Impl : ( ( rule__ObjectAttribute__ObjectAssignment_0_0_0 ) ) ;
    public final void rule__ObjectAttribute__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2040:1: ( ( ( rule__ObjectAttribute__ObjectAssignment_0_0_0 ) ) )
            // InternalTraceryPlusPlus.g:2041:1: ( ( rule__ObjectAttribute__ObjectAssignment_0_0_0 ) )
            {
            // InternalTraceryPlusPlus.g:2041:1: ( ( rule__ObjectAttribute__ObjectAssignment_0_0_0 ) )
            // InternalTraceryPlusPlus.g:2042:2: ( rule__ObjectAttribute__ObjectAssignment_0_0_0 )
            {
             before(grammarAccess.getObjectAttributeAccess().getObjectAssignment_0_0_0()); 
            // InternalTraceryPlusPlus.g:2043:2: ( rule__ObjectAttribute__ObjectAssignment_0_0_0 )
            // InternalTraceryPlusPlus.g:2043:3: rule__ObjectAttribute__ObjectAssignment_0_0_0
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
    // InternalTraceryPlusPlus.g:2051:1: rule__ObjectAttribute__Group_0_0__1 : rule__ObjectAttribute__Group_0_0__1__Impl rule__ObjectAttribute__Group_0_0__2 ;
    public final void rule__ObjectAttribute__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2055:1: ( rule__ObjectAttribute__Group_0_0__1__Impl rule__ObjectAttribute__Group_0_0__2 )
            // InternalTraceryPlusPlus.g:2056:2: rule__ObjectAttribute__Group_0_0__1__Impl rule__ObjectAttribute__Group_0_0__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalTraceryPlusPlus.g:2063:1: rule__ObjectAttribute__Group_0_0__1__Impl : ( '.' ) ;
    public final void rule__ObjectAttribute__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2067:1: ( ( '.' ) )
            // InternalTraceryPlusPlus.g:2068:1: ( '.' )
            {
            // InternalTraceryPlusPlus.g:2068:1: ( '.' )
            // InternalTraceryPlusPlus.g:2069:2: '.'
            {
             before(grammarAccess.getObjectAttributeAccess().getFullStopKeyword_0_0_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:2078:1: rule__ObjectAttribute__Group_0_0__2 : rule__ObjectAttribute__Group_0_0__2__Impl ;
    public final void rule__ObjectAttribute__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2082:1: ( rule__ObjectAttribute__Group_0_0__2__Impl )
            // InternalTraceryPlusPlus.g:2083:2: rule__ObjectAttribute__Group_0_0__2__Impl
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
    // InternalTraceryPlusPlus.g:2089:1: rule__ObjectAttribute__Group_0_0__2__Impl : ( ( rule__ObjectAttribute__AttributeAssignment_0_0_2 ) ) ;
    public final void rule__ObjectAttribute__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2093:1: ( ( ( rule__ObjectAttribute__AttributeAssignment_0_0_2 ) ) )
            // InternalTraceryPlusPlus.g:2094:1: ( ( rule__ObjectAttribute__AttributeAssignment_0_0_2 ) )
            {
            // InternalTraceryPlusPlus.g:2094:1: ( ( rule__ObjectAttribute__AttributeAssignment_0_0_2 ) )
            // InternalTraceryPlusPlus.g:2095:2: ( rule__ObjectAttribute__AttributeAssignment_0_0_2 )
            {
             before(grammarAccess.getObjectAttributeAccess().getAttributeAssignment_0_0_2()); 
            // InternalTraceryPlusPlus.g:2096:2: ( rule__ObjectAttribute__AttributeAssignment_0_0_2 )
            // InternalTraceryPlusPlus.g:2096:3: rule__ObjectAttribute__AttributeAssignment_0_0_2
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
    // InternalTraceryPlusPlus.g:2105:1: rule__ObjectAttribute__Group_0_1__0 : rule__ObjectAttribute__Group_0_1__0__Impl rule__ObjectAttribute__Group_0_1__1 ;
    public final void rule__ObjectAttribute__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2109:1: ( rule__ObjectAttribute__Group_0_1__0__Impl rule__ObjectAttribute__Group_0_1__1 )
            // InternalTraceryPlusPlus.g:2110:2: rule__ObjectAttribute__Group_0_1__0__Impl rule__ObjectAttribute__Group_0_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalTraceryPlusPlus.g:2117:1: rule__ObjectAttribute__Group_0_1__0__Impl : ( ( rule__ObjectAttribute__ObjectAssignment_0_1_0 ) ) ;
    public final void rule__ObjectAttribute__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2121:1: ( ( ( rule__ObjectAttribute__ObjectAssignment_0_1_0 ) ) )
            // InternalTraceryPlusPlus.g:2122:1: ( ( rule__ObjectAttribute__ObjectAssignment_0_1_0 ) )
            {
            // InternalTraceryPlusPlus.g:2122:1: ( ( rule__ObjectAttribute__ObjectAssignment_0_1_0 ) )
            // InternalTraceryPlusPlus.g:2123:2: ( rule__ObjectAttribute__ObjectAssignment_0_1_0 )
            {
             before(grammarAccess.getObjectAttributeAccess().getObjectAssignment_0_1_0()); 
            // InternalTraceryPlusPlus.g:2124:2: ( rule__ObjectAttribute__ObjectAssignment_0_1_0 )
            // InternalTraceryPlusPlus.g:2124:3: rule__ObjectAttribute__ObjectAssignment_0_1_0
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
    // InternalTraceryPlusPlus.g:2132:1: rule__ObjectAttribute__Group_0_1__1 : rule__ObjectAttribute__Group_0_1__1__Impl rule__ObjectAttribute__Group_0_1__2 ;
    public final void rule__ObjectAttribute__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2136:1: ( rule__ObjectAttribute__Group_0_1__1__Impl rule__ObjectAttribute__Group_0_1__2 )
            // InternalTraceryPlusPlus.g:2137:2: rule__ObjectAttribute__Group_0_1__1__Impl rule__ObjectAttribute__Group_0_1__2
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
    // InternalTraceryPlusPlus.g:2144:1: rule__ObjectAttribute__Group_0_1__1__Impl : ( '.' ) ;
    public final void rule__ObjectAttribute__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2148:1: ( ( '.' ) )
            // InternalTraceryPlusPlus.g:2149:1: ( '.' )
            {
            // InternalTraceryPlusPlus.g:2149:1: ( '.' )
            // InternalTraceryPlusPlus.g:2150:2: '.'
            {
             before(grammarAccess.getObjectAttributeAccess().getFullStopKeyword_0_1_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:2159:1: rule__ObjectAttribute__Group_0_1__2 : rule__ObjectAttribute__Group_0_1__2__Impl ;
    public final void rule__ObjectAttribute__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2163:1: ( rule__ObjectAttribute__Group_0_1__2__Impl )
            // InternalTraceryPlusPlus.g:2164:2: rule__ObjectAttribute__Group_0_1__2__Impl
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
    // InternalTraceryPlusPlus.g:2170:1: rule__ObjectAttribute__Group_0_1__2__Impl : ( ( rule__ObjectAttribute__PronounAssignment_0_1_2 ) ) ;
    public final void rule__ObjectAttribute__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2174:1: ( ( ( rule__ObjectAttribute__PronounAssignment_0_1_2 ) ) )
            // InternalTraceryPlusPlus.g:2175:1: ( ( rule__ObjectAttribute__PronounAssignment_0_1_2 ) )
            {
            // InternalTraceryPlusPlus.g:2175:1: ( ( rule__ObjectAttribute__PronounAssignment_0_1_2 ) )
            // InternalTraceryPlusPlus.g:2176:2: ( rule__ObjectAttribute__PronounAssignment_0_1_2 )
            {
             before(grammarAccess.getObjectAttributeAccess().getPronounAssignment_0_1_2()); 
            // InternalTraceryPlusPlus.g:2177:2: ( rule__ObjectAttribute__PronounAssignment_0_1_2 )
            // InternalTraceryPlusPlus.g:2177:3: rule__ObjectAttribute__PronounAssignment_0_1_2
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
    // InternalTraceryPlusPlus.g:2186:1: rule__WordList__Group__0 : rule__WordList__Group__0__Impl rule__WordList__Group__1 ;
    public final void rule__WordList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2190:1: ( rule__WordList__Group__0__Impl rule__WordList__Group__1 )
            // InternalTraceryPlusPlus.g:2191:2: rule__WordList__Group__0__Impl rule__WordList__Group__1
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
    // InternalTraceryPlusPlus.g:2198:1: rule__WordList__Group__0__Impl : ( ( rule__WordList__WordsAssignment_0 ) ) ;
    public final void rule__WordList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2202:1: ( ( ( rule__WordList__WordsAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:2203:1: ( ( rule__WordList__WordsAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:2203:1: ( ( rule__WordList__WordsAssignment_0 ) )
            // InternalTraceryPlusPlus.g:2204:2: ( rule__WordList__WordsAssignment_0 )
            {
             before(grammarAccess.getWordListAccess().getWordsAssignment_0()); 
            // InternalTraceryPlusPlus.g:2205:2: ( rule__WordList__WordsAssignment_0 )
            // InternalTraceryPlusPlus.g:2205:3: rule__WordList__WordsAssignment_0
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
    // InternalTraceryPlusPlus.g:2213:1: rule__WordList__Group__1 : rule__WordList__Group__1__Impl ;
    public final void rule__WordList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2217:1: ( rule__WordList__Group__1__Impl )
            // InternalTraceryPlusPlus.g:2218:2: rule__WordList__Group__1__Impl
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
    // InternalTraceryPlusPlus.g:2224:1: rule__WordList__Group__1__Impl : ( ( rule__WordList__Group_1__0 )* ) ;
    public final void rule__WordList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2228:1: ( ( ( rule__WordList__Group_1__0 )* ) )
            // InternalTraceryPlusPlus.g:2229:1: ( ( rule__WordList__Group_1__0 )* )
            {
            // InternalTraceryPlusPlus.g:2229:1: ( ( rule__WordList__Group_1__0 )* )
            // InternalTraceryPlusPlus.g:2230:2: ( rule__WordList__Group_1__0 )*
            {
             before(grammarAccess.getWordListAccess().getGroup_1()); 
            // InternalTraceryPlusPlus.g:2231:2: ( rule__WordList__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=29 && LA20_0<=30)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:2231:3: rule__WordList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__WordList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalTraceryPlusPlus.g:2240:1: rule__WordList__Group_1__0 : rule__WordList__Group_1__0__Impl rule__WordList__Group_1__1 ;
    public final void rule__WordList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2244:1: ( rule__WordList__Group_1__0__Impl rule__WordList__Group_1__1 )
            // InternalTraceryPlusPlus.g:2245:2: rule__WordList__Group_1__0__Impl rule__WordList__Group_1__1
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
    // InternalTraceryPlusPlus.g:2252:1: rule__WordList__Group_1__0__Impl : ( ruleSeparatorOr ) ;
    public final void rule__WordList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2256:1: ( ( ruleSeparatorOr ) )
            // InternalTraceryPlusPlus.g:2257:1: ( ruleSeparatorOr )
            {
            // InternalTraceryPlusPlus.g:2257:1: ( ruleSeparatorOr )
            // InternalTraceryPlusPlus.g:2258:2: ruleSeparatorOr
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
    // InternalTraceryPlusPlus.g:2267:1: rule__WordList__Group_1__1 : rule__WordList__Group_1__1__Impl ;
    public final void rule__WordList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2271:1: ( rule__WordList__Group_1__1__Impl )
            // InternalTraceryPlusPlus.g:2272:2: rule__WordList__Group_1__1__Impl
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
    // InternalTraceryPlusPlus.g:2278:1: rule__WordList__Group_1__1__Impl : ( ( rule__WordList__WordsAssignment_1_1 ) ) ;
    public final void rule__WordList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2282:1: ( ( ( rule__WordList__WordsAssignment_1_1 ) ) )
            // InternalTraceryPlusPlus.g:2283:1: ( ( rule__WordList__WordsAssignment_1_1 ) )
            {
            // InternalTraceryPlusPlus.g:2283:1: ( ( rule__WordList__WordsAssignment_1_1 ) )
            // InternalTraceryPlusPlus.g:2284:2: ( rule__WordList__WordsAssignment_1_1 )
            {
             before(grammarAccess.getWordListAccess().getWordsAssignment_1_1()); 
            // InternalTraceryPlusPlus.g:2285:2: ( rule__WordList__WordsAssignment_1_1 )
            // InternalTraceryPlusPlus.g:2285:3: rule__WordList__WordsAssignment_1_1
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
    // InternalTraceryPlusPlus.g:2294:1: rule__AttributeList__Group__0 : rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 ;
    public final void rule__AttributeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2298:1: ( rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 )
            // InternalTraceryPlusPlus.g:2299:2: rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1
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
    // InternalTraceryPlusPlus.g:2306:1: rule__AttributeList__Group__0__Impl : ( ( rule__AttributeList__AttributesAssignment_0 ) ) ;
    public final void rule__AttributeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2310:1: ( ( ( rule__AttributeList__AttributesAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:2311:1: ( ( rule__AttributeList__AttributesAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:2311:1: ( ( rule__AttributeList__AttributesAssignment_0 ) )
            // InternalTraceryPlusPlus.g:2312:2: ( rule__AttributeList__AttributesAssignment_0 )
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAssignment_0()); 
            // InternalTraceryPlusPlus.g:2313:2: ( rule__AttributeList__AttributesAssignment_0 )
            // InternalTraceryPlusPlus.g:2313:3: rule__AttributeList__AttributesAssignment_0
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
    // InternalTraceryPlusPlus.g:2321:1: rule__AttributeList__Group__1 : rule__AttributeList__Group__1__Impl ;
    public final void rule__AttributeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2325:1: ( rule__AttributeList__Group__1__Impl )
            // InternalTraceryPlusPlus.g:2326:2: rule__AttributeList__Group__1__Impl
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
    // InternalTraceryPlusPlus.g:2332:1: rule__AttributeList__Group__1__Impl : ( ( rule__AttributeList__Group_1__0 )* ) ;
    public final void rule__AttributeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2336:1: ( ( ( rule__AttributeList__Group_1__0 )* ) )
            // InternalTraceryPlusPlus.g:2337:1: ( ( rule__AttributeList__Group_1__0 )* )
            {
            // InternalTraceryPlusPlus.g:2337:1: ( ( rule__AttributeList__Group_1__0 )* )
            // InternalTraceryPlusPlus.g:2338:2: ( rule__AttributeList__Group_1__0 )*
            {
             before(grammarAccess.getAttributeListAccess().getGroup_1()); 
            // InternalTraceryPlusPlus.g:2339:2: ( rule__AttributeList__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==29||LA21_0==31) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:2339:3: rule__AttributeList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__AttributeList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalTraceryPlusPlus.g:2348:1: rule__AttributeList__Group_1__0 : rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1 ;
    public final void rule__AttributeList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2352:1: ( rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1 )
            // InternalTraceryPlusPlus.g:2353:2: rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1
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
    // InternalTraceryPlusPlus.g:2360:1: rule__AttributeList__Group_1__0__Impl : ( ruleSeparatorAnd ) ;
    public final void rule__AttributeList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2364:1: ( ( ruleSeparatorAnd ) )
            // InternalTraceryPlusPlus.g:2365:1: ( ruleSeparatorAnd )
            {
            // InternalTraceryPlusPlus.g:2365:1: ( ruleSeparatorAnd )
            // InternalTraceryPlusPlus.g:2366:2: ruleSeparatorAnd
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
    // InternalTraceryPlusPlus.g:2375:1: rule__AttributeList__Group_1__1 : rule__AttributeList__Group_1__1__Impl ;
    public final void rule__AttributeList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2379:1: ( rule__AttributeList__Group_1__1__Impl )
            // InternalTraceryPlusPlus.g:2380:2: rule__AttributeList__Group_1__1__Impl
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
    // InternalTraceryPlusPlus.g:2386:1: rule__AttributeList__Group_1__1__Impl : ( ( rule__AttributeList__AttributesAssignment_1_1 ) ) ;
    public final void rule__AttributeList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2390:1: ( ( ( rule__AttributeList__AttributesAssignment_1_1 ) ) )
            // InternalTraceryPlusPlus.g:2391:1: ( ( rule__AttributeList__AttributesAssignment_1_1 ) )
            {
            // InternalTraceryPlusPlus.g:2391:1: ( ( rule__AttributeList__AttributesAssignment_1_1 ) )
            // InternalTraceryPlusPlus.g:2392:2: ( rule__AttributeList__AttributesAssignment_1_1 )
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAssignment_1_1()); 
            // InternalTraceryPlusPlus.g:2393:2: ( rule__AttributeList__AttributesAssignment_1_1 )
            // InternalTraceryPlusPlus.g:2393:3: rule__AttributeList__AttributesAssignment_1_1
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
    // InternalTraceryPlusPlus.g:2402:1: rule__TraceryPlusPlusProgram__StatementsAssignment_0 : ( ruleStatement ) ;
    public final void rule__TraceryPlusPlusProgram__StatementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2406:1: ( ( ruleStatement ) )
            // InternalTraceryPlusPlus.g:2407:2: ( ruleStatement )
            {
            // InternalTraceryPlusPlus.g:2407:2: ( ruleStatement )
            // InternalTraceryPlusPlus.g:2408:3: ruleStatement
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
    // InternalTraceryPlusPlus.g:2417:1: rule__TraceryPlusPlusProgram__StoryAssignment_1 : ( ruleStory ) ;
    public final void rule__TraceryPlusPlusProgram__StoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2421:1: ( ( ruleStory ) )
            // InternalTraceryPlusPlus.g:2422:2: ( ruleStory )
            {
            // InternalTraceryPlusPlus.g:2422:2: ( ruleStory )
            // InternalTraceryPlusPlus.g:2423:3: ruleStory
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
    // InternalTraceryPlusPlus.g:2432:1: rule__Story__StoryAssignment_3 : ( ( rule__Story__StoryAlternatives_3_0 ) ) ;
    public final void rule__Story__StoryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2436:1: ( ( ( rule__Story__StoryAlternatives_3_0 ) ) )
            // InternalTraceryPlusPlus.g:2437:2: ( ( rule__Story__StoryAlternatives_3_0 ) )
            {
            // InternalTraceryPlusPlus.g:2437:2: ( ( rule__Story__StoryAlternatives_3_0 ) )
            // InternalTraceryPlusPlus.g:2438:3: ( rule__Story__StoryAlternatives_3_0 )
            {
             before(grammarAccess.getStoryAccess().getStoryAlternatives_3_0()); 
            // InternalTraceryPlusPlus.g:2439:3: ( rule__Story__StoryAlternatives_3_0 )
            // InternalTraceryPlusPlus.g:2439:4: rule__Story__StoryAlternatives_3_0
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
    // InternalTraceryPlusPlus.g:2447:1: rule__ListDeclaration__NameAssignment_0 : ( ruleVariable ) ;
    public final void rule__ListDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2451:1: ( ( ruleVariable ) )
            // InternalTraceryPlusPlus.g:2452:2: ( ruleVariable )
            {
            // InternalTraceryPlusPlus.g:2452:2: ( ruleVariable )
            // InternalTraceryPlusPlus.g:2453:3: ruleVariable
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
    // InternalTraceryPlusPlus.g:2462:1: rule__ListDeclaration__ListAssignment_3 : ( ruleWordList ) ;
    public final void rule__ListDeclaration__ListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2466:1: ( ( ruleWordList ) )
            // InternalTraceryPlusPlus.g:2467:2: ( ruleWordList )
            {
            // InternalTraceryPlusPlus.g:2467:2: ( ruleWordList )
            // InternalTraceryPlusPlus.g:2468:3: ruleWordList
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
    // InternalTraceryPlusPlus.g:2477:1: rule__ObjectDeclaration__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ObjectDeclaration__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2481:1: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2482:2: ( RULE_ID )
            {
            // InternalTraceryPlusPlus.g:2482:2: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2483:3: RULE_ID
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
    // InternalTraceryPlusPlus.g:2492:1: rule__ObjectDeclaration__PronounsAssignment_4 : ( rulePronouns ) ;
    public final void rule__ObjectDeclaration__PronounsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2496:1: ( ( rulePronouns ) )
            // InternalTraceryPlusPlus.g:2497:2: ( rulePronouns )
            {
            // InternalTraceryPlusPlus.g:2497:2: ( rulePronouns )
            // InternalTraceryPlusPlus.g:2498:3: rulePronouns
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
    // InternalTraceryPlusPlus.g:2507:1: rule__ObjectDeclaration__AttributesAssignment_8 : ( ruleAttributeList ) ;
    public final void rule__ObjectDeclaration__AttributesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2511:1: ( ( ruleAttributeList ) )
            // InternalTraceryPlusPlus.g:2512:2: ( ruleAttributeList )
            {
            // InternalTraceryPlusPlus.g:2512:2: ( ruleAttributeList )
            // InternalTraceryPlusPlus.g:2513:3: ruleAttributeList
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
    // InternalTraceryPlusPlus.g:2522:1: rule__Word__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__Word__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2526:1: ( ( RULE_STRING ) )
            // InternalTraceryPlusPlus.g:2527:2: ( RULE_STRING )
            {
            // InternalTraceryPlusPlus.g:2527:2: ( RULE_STRING )
            // InternalTraceryPlusPlus.g:2528:3: RULE_STRING
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
    // InternalTraceryPlusPlus.g:2537:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2541:1: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2542:2: ( RULE_ID )
            {
            // InternalTraceryPlusPlus.g:2542:2: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2543:3: RULE_ID
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
    // InternalTraceryPlusPlus.g:2552:1: rule__StoryVariable__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__StoryVariable__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2556:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:2557:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:2557:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2558:3: ( RULE_ID )
            {
             before(grammarAccess.getStoryVariableAccess().getVariableVariableCrossReference_0_0()); 
            // InternalTraceryPlusPlus.g:2559:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2560:4: RULE_ID
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
    // InternalTraceryPlusPlus.g:2571:1: rule__StoryVariable__ModifiersAssignment_1 : ( ruleModifier ) ;
    public final void rule__StoryVariable__ModifiersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2575:1: ( ( ruleModifier ) )
            // InternalTraceryPlusPlus.g:2576:2: ( ruleModifier )
            {
            // InternalTraceryPlusPlus.g:2576:2: ( ruleModifier )
            // InternalTraceryPlusPlus.g:2577:3: ruleModifier
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
    // InternalTraceryPlusPlus.g:2586:1: rule__ExistingVariable__PointerAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ExistingVariable__PointerAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2590:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:2591:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:2591:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2592:3: ( RULE_ID )
            {
             before(grammarAccess.getExistingVariableAccess().getPointerVariableCrossReference_0()); 
            // InternalTraceryPlusPlus.g:2593:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2594:4: RULE_ID
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
    // InternalTraceryPlusPlus.g:2605:1: rule__JustNameAttribute__NameAssignment : ( ruleExistingVariable ) ;
    public final void rule__JustNameAttribute__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2609:1: ( ( ruleExistingVariable ) )
            // InternalTraceryPlusPlus.g:2610:2: ( ruleExistingVariable )
            {
            // InternalTraceryPlusPlus.g:2610:2: ( ruleExistingVariable )
            // InternalTraceryPlusPlus.g:2611:3: ruleExistingVariable
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
    // InternalTraceryPlusPlus.g:2620:1: rule__NameExistingListAttribute__NameAssignment_0 : ( ruleVariable ) ;
    public final void rule__NameExistingListAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2624:1: ( ( ruleVariable ) )
            // InternalTraceryPlusPlus.g:2625:2: ( ruleVariable )
            {
            // InternalTraceryPlusPlus.g:2625:2: ( ruleVariable )
            // InternalTraceryPlusPlus.g:2626:3: ruleVariable
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
    // InternalTraceryPlusPlus.g:2635:1: rule__NameExistingListAttribute__ValueAssignment_2 : ( ruleExistingVariable ) ;
    public final void rule__NameExistingListAttribute__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2639:1: ( ( ruleExistingVariable ) )
            // InternalTraceryPlusPlus.g:2640:2: ( ruleExistingVariable )
            {
            // InternalTraceryPlusPlus.g:2640:2: ( ruleExistingVariable )
            // InternalTraceryPlusPlus.g:2641:3: ruleExistingVariable
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
    // InternalTraceryPlusPlus.g:2650:1: rule__NameValueAttribute__NameAssignment_0 : ( ruleVariable ) ;
    public final void rule__NameValueAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2654:1: ( ( ruleVariable ) )
            // InternalTraceryPlusPlus.g:2655:2: ( ruleVariable )
            {
            // InternalTraceryPlusPlus.g:2655:2: ( ruleVariable )
            // InternalTraceryPlusPlus.g:2656:3: ruleVariable
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
    // InternalTraceryPlusPlus.g:2665:1: rule__NameValueAttribute__ValueAssignment_2 : ( ruleWord ) ;
    public final void rule__NameValueAttribute__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2669:1: ( ( ruleWord ) )
            // InternalTraceryPlusPlus.g:2670:2: ( ruleWord )
            {
            // InternalTraceryPlusPlus.g:2670:2: ( ruleWord )
            // InternalTraceryPlusPlus.g:2671:3: ruleWord
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
    // InternalTraceryPlusPlus.g:2680:1: rule__ObjectAttribute__ObjectAssignment_0_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectAttribute__ObjectAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2684:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:2685:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:2685:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2686:3: ( RULE_ID )
            {
             before(grammarAccess.getObjectAttributeAccess().getObjectObjectDeclarationCrossReference_0_0_0_0()); 
            // InternalTraceryPlusPlus.g:2687:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2688:4: RULE_ID
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
    // InternalTraceryPlusPlus.g:2699:1: rule__ObjectAttribute__AttributeAssignment_0_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectAttribute__AttributeAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2703:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:2704:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:2704:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2705:3: ( RULE_ID )
            {
             before(grammarAccess.getObjectAttributeAccess().getAttributeVariableCrossReference_0_0_2_0()); 
            // InternalTraceryPlusPlus.g:2706:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2707:4: RULE_ID
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
    // InternalTraceryPlusPlus.g:2718:1: rule__ObjectAttribute__ObjectAssignment_0_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectAttribute__ObjectAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2722:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:2723:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:2723:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2724:3: ( RULE_ID )
            {
             before(grammarAccess.getObjectAttributeAccess().getObjectObjectDeclarationCrossReference_0_1_0_0()); 
            // InternalTraceryPlusPlus.g:2725:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2726:4: RULE_ID
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
    // InternalTraceryPlusPlus.g:2737:1: rule__ObjectAttribute__PronounAssignment_0_1_2 : ( rulePronounIdentifier ) ;
    public final void rule__ObjectAttribute__PronounAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2741:1: ( ( rulePronounIdentifier ) )
            // InternalTraceryPlusPlus.g:2742:2: ( rulePronounIdentifier )
            {
            // InternalTraceryPlusPlus.g:2742:2: ( rulePronounIdentifier )
            // InternalTraceryPlusPlus.g:2743:3: rulePronounIdentifier
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
    // InternalTraceryPlusPlus.g:2752:1: rule__ObjectAttribute__ModifiersAssignment_1 : ( ruleModifier ) ;
    public final void rule__ObjectAttribute__ModifiersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2756:1: ( ( ruleModifier ) )
            // InternalTraceryPlusPlus.g:2757:2: ( ruleModifier )
            {
            // InternalTraceryPlusPlus.g:2757:2: ( ruleModifier )
            // InternalTraceryPlusPlus.g:2758:3: ruleModifier
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
    // InternalTraceryPlusPlus.g:2767:1: rule__WordList__WordsAssignment_0 : ( ruleWord ) ;
    public final void rule__WordList__WordsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2771:1: ( ( ruleWord ) )
            // InternalTraceryPlusPlus.g:2772:2: ( ruleWord )
            {
            // InternalTraceryPlusPlus.g:2772:2: ( ruleWord )
            // InternalTraceryPlusPlus.g:2773:3: ruleWord
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
    // InternalTraceryPlusPlus.g:2782:1: rule__WordList__WordsAssignment_1_1 : ( ruleWord ) ;
    public final void rule__WordList__WordsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2786:1: ( ( ruleWord ) )
            // InternalTraceryPlusPlus.g:2787:2: ( ruleWord )
            {
            // InternalTraceryPlusPlus.g:2787:2: ( ruleWord )
            // InternalTraceryPlusPlus.g:2788:3: ruleWord
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
    // InternalTraceryPlusPlus.g:2797:1: rule__AttributeList__AttributesAssignment_0 : ( ruleAttribute ) ;
    public final void rule__AttributeList__AttributesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2801:1: ( ( ruleAttribute ) )
            // InternalTraceryPlusPlus.g:2802:2: ( ruleAttribute )
            {
            // InternalTraceryPlusPlus.g:2802:2: ( ruleAttribute )
            // InternalTraceryPlusPlus.g:2803:3: ruleAttribute
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
    // InternalTraceryPlusPlus.g:2812:1: rule__AttributeList__AttributesAssignment_1_1 : ( ruleAttribute ) ;
    public final void rule__AttributeList__AttributesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2816:1: ( ( ruleAttribute ) )
            // InternalTraceryPlusPlus.g:2817:2: ( ruleAttribute )
            {
            // InternalTraceryPlusPlus.g:2817:2: ( ruleAttribute )
            // InternalTraceryPlusPlus.g:2818:3: ruleAttribute
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
    // InternalTraceryPlusPlus.g:2827:1: rule__Pronouns__ValueAssignment_0 : ( ( 'He' ) ) ;
    public final void rule__Pronouns__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2831:1: ( ( ( 'He' ) ) )
            // InternalTraceryPlusPlus.g:2832:2: ( ( 'He' ) )
            {
            // InternalTraceryPlusPlus.g:2832:2: ( ( 'He' ) )
            // InternalTraceryPlusPlus.g:2833:3: ( 'He' )
            {
             before(grammarAccess.getPronounsAccess().getValueHeKeyword_0_0()); 
            // InternalTraceryPlusPlus.g:2834:3: ( 'He' )
            // InternalTraceryPlusPlus.g:2835:4: 'He'
            {
             before(grammarAccess.getPronounsAccess().getValueHeKeyword_0_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:2846:1: rule__Pronouns__ValueAssignment_1 : ( ( 'She' ) ) ;
    public final void rule__Pronouns__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2850:1: ( ( ( 'She' ) ) )
            // InternalTraceryPlusPlus.g:2851:2: ( ( 'She' ) )
            {
            // InternalTraceryPlusPlus.g:2851:2: ( ( 'She' ) )
            // InternalTraceryPlusPlus.g:2852:3: ( 'She' )
            {
             before(grammarAccess.getPronounsAccess().getValueSheKeyword_1_0()); 
            // InternalTraceryPlusPlus.g:2853:3: ( 'She' )
            // InternalTraceryPlusPlus.g:2854:4: 'She'
            {
             before(grammarAccess.getPronounsAccess().getValueSheKeyword_1_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:2865:1: rule__Pronouns__ValueAssignment_2 : ( ( 'It' ) ) ;
    public final void rule__Pronouns__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2869:1: ( ( ( 'It' ) ) )
            // InternalTraceryPlusPlus.g:2870:2: ( ( 'It' ) )
            {
            // InternalTraceryPlusPlus.g:2870:2: ( ( 'It' ) )
            // InternalTraceryPlusPlus.g:2871:3: ( 'It' )
            {
             before(grammarAccess.getPronounsAccess().getValueItKeyword_2_0()); 
            // InternalTraceryPlusPlus.g:2872:3: ( 'It' )
            // InternalTraceryPlusPlus.g:2873:4: 'It'
            {
             before(grammarAccess.getPronounsAccess().getValueItKeyword_2_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:2884:1: rule__Pronouns__ValueAssignment_3 : ( ( 'They' ) ) ;
    public final void rule__Pronouns__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2888:1: ( ( ( 'They' ) ) )
            // InternalTraceryPlusPlus.g:2889:2: ( ( 'They' ) )
            {
            // InternalTraceryPlusPlus.g:2889:2: ( ( 'They' ) )
            // InternalTraceryPlusPlus.g:2890:3: ( 'They' )
            {
             before(grammarAccess.getPronounsAccess().getValueTheyKeyword_3_0()); 
            // InternalTraceryPlusPlus.g:2891:3: ( 'They' )
            // InternalTraceryPlusPlus.g:2892:4: 'They'
            {
             before(grammarAccess.getPronounsAccess().getValueTheyKeyword_3_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:2903:1: rule__PronounIdentifier__NameAssignment : ( ( rule__PronounIdentifier__NameAlternatives_0 ) ) ;
    public final void rule__PronounIdentifier__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2907:1: ( ( ( rule__PronounIdentifier__NameAlternatives_0 ) ) )
            // InternalTraceryPlusPlus.g:2908:2: ( ( rule__PronounIdentifier__NameAlternatives_0 ) )
            {
            // InternalTraceryPlusPlus.g:2908:2: ( ( rule__PronounIdentifier__NameAlternatives_0 ) )
            // InternalTraceryPlusPlus.g:2909:3: ( rule__PronounIdentifier__NameAlternatives_0 )
            {
             before(grammarAccess.getPronounIdentifierAccess().getNameAlternatives_0()); 
            // InternalTraceryPlusPlus.g:2910:3: ( rule__PronounIdentifier__NameAlternatives_0 )
            // InternalTraceryPlusPlus.g:2910:4: rule__PronounIdentifier__NameAlternatives_0
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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000C0010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000F0000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000000F802L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000A0000002L});

}