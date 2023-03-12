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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.capitalize'", "'.CAPITALIZE'", "'.s'", "'.a'", "'.ed'", "'has'", "'have'", "'is'", "'are'", "'a'", "'an'", "'from'", "'they'", "'them'", "'their'", "'theirs'", "'='", "':'", "'-'", "'-->'", "','", "'or'", "'||'", "'and'", "'&&'", "'The'", "'story'", "'can'", "'values'", "'be'", "'There'", "'attributes'", "'.'", "'equal'", "'to'", "'He'", "'She'", "'It'", "'They'"
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
    public static final int T__48=48;
    public static final int T__49=49;
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
    // InternalTraceryPlusPlus.g:87:1: ruleStatement : ( ruleVariable ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:91:2: ( ( ruleVariable ) )
            // InternalTraceryPlusPlus.g:92:2: ( ruleVariable )
            {
            // InternalTraceryPlusPlus.g:92:2: ( ruleVariable )
            // InternalTraceryPlusPlus.g:93:3: ruleVariable
            {
             before(grammarAccess.getStatementAccess().getVariableParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getVariableParserRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleVariable"
    // InternalTraceryPlusPlus.g:103:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:104:1: ( ruleVariable EOF )
            // InternalTraceryPlusPlus.g:105:1: ruleVariable EOF
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
    // InternalTraceryPlusPlus.g:112:1: ruleVariable : ( ( rule__Variable__Alternatives ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:116:2: ( ( ( rule__Variable__Alternatives ) ) )
            // InternalTraceryPlusPlus.g:117:2: ( ( rule__Variable__Alternatives ) )
            {
            // InternalTraceryPlusPlus.g:117:2: ( ( rule__Variable__Alternatives ) )
            // InternalTraceryPlusPlus.g:118:3: ( rule__Variable__Alternatives )
            {
             before(grammarAccess.getVariableAccess().getAlternatives()); 
            // InternalTraceryPlusPlus.g:119:3: ( rule__Variable__Alternatives )
            // InternalTraceryPlusPlus.g:119:4: rule__Variable__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalTraceryPlusPlus.g:212:1: ruleWord : ( ( rule__Word__NameAssignment ) ) ;
    public final void ruleWord() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:216:2: ( ( ( rule__Word__NameAssignment ) ) )
            // InternalTraceryPlusPlus.g:217:2: ( ( rule__Word__NameAssignment ) )
            {
            // InternalTraceryPlusPlus.g:217:2: ( ( rule__Word__NameAssignment ) )
            // InternalTraceryPlusPlus.g:218:3: ( rule__Word__NameAssignment )
            {
             before(grammarAccess.getWordAccess().getNameAssignment()); 
            // InternalTraceryPlusPlus.g:219:3: ( rule__Word__NameAssignment )
            // InternalTraceryPlusPlus.g:219:4: rule__Word__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Word__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getWordAccess().getNameAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleListVariable"
    // InternalTraceryPlusPlus.g:228:1: entryRuleListVariable : ruleListVariable EOF ;
    public final void entryRuleListVariable() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:229:1: ( ruleListVariable EOF )
            // InternalTraceryPlusPlus.g:230:1: ruleListVariable EOF
            {
             before(grammarAccess.getListVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleListVariable();

            state._fsp--;

             after(grammarAccess.getListVariableRule()); 
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
    // $ANTLR end "entryRuleListVariable"


    // $ANTLR start "ruleListVariable"
    // InternalTraceryPlusPlus.g:237:1: ruleListVariable : ( ( rule__ListVariable__Group__0 ) ) ;
    public final void ruleListVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:241:2: ( ( ( rule__ListVariable__Group__0 ) ) )
            // InternalTraceryPlusPlus.g:242:2: ( ( rule__ListVariable__Group__0 ) )
            {
            // InternalTraceryPlusPlus.g:242:2: ( ( rule__ListVariable__Group__0 ) )
            // InternalTraceryPlusPlus.g:243:3: ( rule__ListVariable__Group__0 )
            {
             before(grammarAccess.getListVariableAccess().getGroup()); 
            // InternalTraceryPlusPlus.g:244:3: ( rule__ListVariable__Group__0 )
            // InternalTraceryPlusPlus.g:244:4: rule__ListVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListVariable"


    // $ANTLR start "entryRuleAttribute"
    // InternalTraceryPlusPlus.g:253:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:254:1: ( ruleAttribute EOF )
            // InternalTraceryPlusPlus.g:255:1: ruleAttribute EOF
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
    // InternalTraceryPlusPlus.g:262:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:266:2: ( ( ( rule__Attribute__Alternatives ) ) )
            // InternalTraceryPlusPlus.g:267:2: ( ( rule__Attribute__Alternatives ) )
            {
            // InternalTraceryPlusPlus.g:267:2: ( ( rule__Attribute__Alternatives ) )
            // InternalTraceryPlusPlus.g:268:3: ( rule__Attribute__Alternatives )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives()); 
            // InternalTraceryPlusPlus.g:269:3: ( rule__Attribute__Alternatives )
            // InternalTraceryPlusPlus.g:269:4: rule__Attribute__Alternatives
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


    // $ANTLR start "entryRuleJustNameAttribute"
    // InternalTraceryPlusPlus.g:278:1: entryRuleJustNameAttribute : ruleJustNameAttribute EOF ;
    public final void entryRuleJustNameAttribute() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:279:1: ( ruleJustNameAttribute EOF )
            // InternalTraceryPlusPlus.g:280:1: ruleJustNameAttribute EOF
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
    // InternalTraceryPlusPlus.g:287:1: ruleJustNameAttribute : ( ( rule__JustNameAttribute__NameAssignment ) ) ;
    public final void ruleJustNameAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:291:2: ( ( ( rule__JustNameAttribute__NameAssignment ) ) )
            // InternalTraceryPlusPlus.g:292:2: ( ( rule__JustNameAttribute__NameAssignment ) )
            {
            // InternalTraceryPlusPlus.g:292:2: ( ( rule__JustNameAttribute__NameAssignment ) )
            // InternalTraceryPlusPlus.g:293:3: ( rule__JustNameAttribute__NameAssignment )
            {
             before(grammarAccess.getJustNameAttributeAccess().getNameAssignment()); 
            // InternalTraceryPlusPlus.g:294:3: ( rule__JustNameAttribute__NameAssignment )
            // InternalTraceryPlusPlus.g:294:4: rule__JustNameAttribute__NameAssignment
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
    // InternalTraceryPlusPlus.g:303:1: entryRuleNameExistingListAttribute : ruleNameExistingListAttribute EOF ;
    public final void entryRuleNameExistingListAttribute() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:304:1: ( ruleNameExistingListAttribute EOF )
            // InternalTraceryPlusPlus.g:305:1: ruleNameExistingListAttribute EOF
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
    // InternalTraceryPlusPlus.g:312:1: ruleNameExistingListAttribute : ( ( rule__NameExistingListAttribute__Group__0 ) ) ;
    public final void ruleNameExistingListAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:316:2: ( ( ( rule__NameExistingListAttribute__Group__0 ) ) )
            // InternalTraceryPlusPlus.g:317:2: ( ( rule__NameExistingListAttribute__Group__0 ) )
            {
            // InternalTraceryPlusPlus.g:317:2: ( ( rule__NameExistingListAttribute__Group__0 ) )
            // InternalTraceryPlusPlus.g:318:3: ( rule__NameExistingListAttribute__Group__0 )
            {
             before(grammarAccess.getNameExistingListAttributeAccess().getGroup()); 
            // InternalTraceryPlusPlus.g:319:3: ( rule__NameExistingListAttribute__Group__0 )
            // InternalTraceryPlusPlus.g:319:4: rule__NameExistingListAttribute__Group__0
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
    // InternalTraceryPlusPlus.g:328:1: entryRuleNameValueAttribute : ruleNameValueAttribute EOF ;
    public final void entryRuleNameValueAttribute() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:329:1: ( ruleNameValueAttribute EOF )
            // InternalTraceryPlusPlus.g:330:1: ruleNameValueAttribute EOF
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
    // InternalTraceryPlusPlus.g:337:1: ruleNameValueAttribute : ( ( rule__NameValueAttribute__Group__0 ) ) ;
    public final void ruleNameValueAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:341:2: ( ( ( rule__NameValueAttribute__Group__0 ) ) )
            // InternalTraceryPlusPlus.g:342:2: ( ( rule__NameValueAttribute__Group__0 ) )
            {
            // InternalTraceryPlusPlus.g:342:2: ( ( rule__NameValueAttribute__Group__0 ) )
            // InternalTraceryPlusPlus.g:343:3: ( rule__NameValueAttribute__Group__0 )
            {
             before(grammarAccess.getNameValueAttributeAccess().getGroup()); 
            // InternalTraceryPlusPlus.g:344:3: ( rule__NameValueAttribute__Group__0 )
            // InternalTraceryPlusPlus.g:344:4: rule__NameValueAttribute__Group__0
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


    // $ANTLR start "entryRulePronouns"
    // InternalTraceryPlusPlus.g:428:1: entryRulePronouns : rulePronouns EOF ;
    public final void entryRulePronouns() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:429:1: ( rulePronouns EOF )
            // InternalTraceryPlusPlus.g:430:1: rulePronouns EOF
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
    // InternalTraceryPlusPlus.g:437:1: rulePronouns : ( ( rule__Pronouns__Alternatives ) ) ;
    public final void rulePronouns() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:441:2: ( ( ( rule__Pronouns__Alternatives ) ) )
            // InternalTraceryPlusPlus.g:442:2: ( ( rule__Pronouns__Alternatives ) )
            {
            // InternalTraceryPlusPlus.g:442:2: ( ( rule__Pronouns__Alternatives ) )
            // InternalTraceryPlusPlus.g:443:3: ( rule__Pronouns__Alternatives )
            {
             before(grammarAccess.getPronounsAccess().getAlternatives()); 
            // InternalTraceryPlusPlus.g:444:3: ( rule__Pronouns__Alternatives )
            // InternalTraceryPlusPlus.g:444:4: rule__Pronouns__Alternatives
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
    // InternalTraceryPlusPlus.g:453:1: entryRulePronounIdentifier : rulePronounIdentifier EOF ;
    public final void entryRulePronounIdentifier() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:454:1: ( rulePronounIdentifier EOF )
            // InternalTraceryPlusPlus.g:455:1: rulePronounIdentifier EOF
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
    // InternalTraceryPlusPlus.g:462:1: rulePronounIdentifier : ( ( rule__PronounIdentifier__NameAssignment ) ) ;
    public final void rulePronounIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:466:2: ( ( ( rule__PronounIdentifier__NameAssignment ) ) )
            // InternalTraceryPlusPlus.g:467:2: ( ( rule__PronounIdentifier__NameAssignment ) )
            {
            // InternalTraceryPlusPlus.g:467:2: ( ( rule__PronounIdentifier__NameAssignment ) )
            // InternalTraceryPlusPlus.g:468:3: ( rule__PronounIdentifier__NameAssignment )
            {
             before(grammarAccess.getPronounIdentifierAccess().getNameAssignment()); 
            // InternalTraceryPlusPlus.g:469:3: ( rule__PronounIdentifier__NameAssignment )
            // InternalTraceryPlusPlus.g:469:4: rule__PronounIdentifier__NameAssignment
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
    // InternalTraceryPlusPlus.g:478:1: entryRuleModifier : ruleModifier EOF ;
    public final void entryRuleModifier() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:479:1: ( ruleModifier EOF )
            // InternalTraceryPlusPlus.g:480:1: ruleModifier EOF
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
    // InternalTraceryPlusPlus.g:487:1: ruleModifier : ( ( rule__Modifier__Alternatives ) ) ;
    public final void ruleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:491:2: ( ( ( rule__Modifier__Alternatives ) ) )
            // InternalTraceryPlusPlus.g:492:2: ( ( rule__Modifier__Alternatives ) )
            {
            // InternalTraceryPlusPlus.g:492:2: ( ( rule__Modifier__Alternatives ) )
            // InternalTraceryPlusPlus.g:493:3: ( rule__Modifier__Alternatives )
            {
             before(grammarAccess.getModifierAccess().getAlternatives()); 
            // InternalTraceryPlusPlus.g:494:3: ( rule__Modifier__Alternatives )
            // InternalTraceryPlusPlus.g:494:4: rule__Modifier__Alternatives
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
    // InternalTraceryPlusPlus.g:503:1: entryRuleCapitalizationModifier : ruleCapitalizationModifier EOF ;
    public final void entryRuleCapitalizationModifier() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:504:1: ( ruleCapitalizationModifier EOF )
            // InternalTraceryPlusPlus.g:505:1: ruleCapitalizationModifier EOF
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
    // InternalTraceryPlusPlus.g:512:1: ruleCapitalizationModifier : ( '.capitalize' ) ;
    public final void ruleCapitalizationModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:516:2: ( ( '.capitalize' ) )
            // InternalTraceryPlusPlus.g:517:2: ( '.capitalize' )
            {
            // InternalTraceryPlusPlus.g:517:2: ( '.capitalize' )
            // InternalTraceryPlusPlus.g:518:3: '.capitalize'
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
    // InternalTraceryPlusPlus.g:528:1: entryRuleFullCapitalizationModifier : ruleFullCapitalizationModifier EOF ;
    public final void entryRuleFullCapitalizationModifier() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:529:1: ( ruleFullCapitalizationModifier EOF )
            // InternalTraceryPlusPlus.g:530:1: ruleFullCapitalizationModifier EOF
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
    // InternalTraceryPlusPlus.g:537:1: ruleFullCapitalizationModifier : ( '.CAPITALIZE' ) ;
    public final void ruleFullCapitalizationModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:541:2: ( ( '.CAPITALIZE' ) )
            // InternalTraceryPlusPlus.g:542:2: ( '.CAPITALIZE' )
            {
            // InternalTraceryPlusPlus.g:542:2: ( '.CAPITALIZE' )
            // InternalTraceryPlusPlus.g:543:3: '.CAPITALIZE'
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
    // InternalTraceryPlusPlus.g:553:1: entryRulePluralityModifier : rulePluralityModifier EOF ;
    public final void entryRulePluralityModifier() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:554:1: ( rulePluralityModifier EOF )
            // InternalTraceryPlusPlus.g:555:1: rulePluralityModifier EOF
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
    // InternalTraceryPlusPlus.g:562:1: rulePluralityModifier : ( '.s' ) ;
    public final void rulePluralityModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:566:2: ( ( '.s' ) )
            // InternalTraceryPlusPlus.g:567:2: ( '.s' )
            {
            // InternalTraceryPlusPlus.g:567:2: ( '.s' )
            // InternalTraceryPlusPlus.g:568:3: '.s'
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
    // InternalTraceryPlusPlus.g:578:1: entryRuleArticleModifier : ruleArticleModifier EOF ;
    public final void entryRuleArticleModifier() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:579:1: ( ruleArticleModifier EOF )
            // InternalTraceryPlusPlus.g:580:1: ruleArticleModifier EOF
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
    // InternalTraceryPlusPlus.g:587:1: ruleArticleModifier : ( '.a' ) ;
    public final void ruleArticleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:591:2: ( ( '.a' ) )
            // InternalTraceryPlusPlus.g:592:2: ( '.a' )
            {
            // InternalTraceryPlusPlus.g:592:2: ( '.a' )
            // InternalTraceryPlusPlus.g:593:3: '.a'
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
    // InternalTraceryPlusPlus.g:603:1: entryRulePastTenseModifier : rulePastTenseModifier EOF ;
    public final void entryRulePastTenseModifier() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:604:1: ( rulePastTenseModifier EOF )
            // InternalTraceryPlusPlus.g:605:1: rulePastTenseModifier EOF
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
    // InternalTraceryPlusPlus.g:612:1: rulePastTenseModifier : ( '.ed' ) ;
    public final void rulePastTenseModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:616:2: ( ( '.ed' ) )
            // InternalTraceryPlusPlus.g:617:2: ( '.ed' )
            {
            // InternalTraceryPlusPlus.g:617:2: ( '.ed' )
            // InternalTraceryPlusPlus.g:618:3: '.ed'
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
    // InternalTraceryPlusPlus.g:628:1: entryRuleAssignmentOperator : ruleAssignmentOperator EOF ;
    public final void entryRuleAssignmentOperator() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:629:1: ( ruleAssignmentOperator EOF )
            // InternalTraceryPlusPlus.g:630:1: ruleAssignmentOperator EOF
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
    // InternalTraceryPlusPlus.g:637:1: ruleAssignmentOperator : ( ( rule__AssignmentOperator__Alternatives ) ) ;
    public final void ruleAssignmentOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:641:2: ( ( ( rule__AssignmentOperator__Alternatives ) ) )
            // InternalTraceryPlusPlus.g:642:2: ( ( rule__AssignmentOperator__Alternatives ) )
            {
            // InternalTraceryPlusPlus.g:642:2: ( ( rule__AssignmentOperator__Alternatives ) )
            // InternalTraceryPlusPlus.g:643:3: ( rule__AssignmentOperator__Alternatives )
            {
             before(grammarAccess.getAssignmentOperatorAccess().getAlternatives()); 
            // InternalTraceryPlusPlus.g:644:3: ( rule__AssignmentOperator__Alternatives )
            // InternalTraceryPlusPlus.g:644:4: rule__AssignmentOperator__Alternatives
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
    // InternalTraceryPlusPlus.g:653:1: entryRuleSeparatorOr : ruleSeparatorOr EOF ;
    public final void entryRuleSeparatorOr() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:654:1: ( ruleSeparatorOr EOF )
            // InternalTraceryPlusPlus.g:655:1: ruleSeparatorOr EOF
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
    // InternalTraceryPlusPlus.g:662:1: ruleSeparatorOr : ( ( rule__SeparatorOr__Alternatives ) ) ;
    public final void ruleSeparatorOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:666:2: ( ( ( rule__SeparatorOr__Alternatives ) ) )
            // InternalTraceryPlusPlus.g:667:2: ( ( rule__SeparatorOr__Alternatives ) )
            {
            // InternalTraceryPlusPlus.g:667:2: ( ( rule__SeparatorOr__Alternatives ) )
            // InternalTraceryPlusPlus.g:668:3: ( rule__SeparatorOr__Alternatives )
            {
             before(grammarAccess.getSeparatorOrAccess().getAlternatives()); 
            // InternalTraceryPlusPlus.g:669:3: ( rule__SeparatorOr__Alternatives )
            // InternalTraceryPlusPlus.g:669:4: rule__SeparatorOr__Alternatives
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
    // InternalTraceryPlusPlus.g:678:1: entryRuleSeparatorAnd : ruleSeparatorAnd EOF ;
    public final void entryRuleSeparatorAnd() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:679:1: ( ruleSeparatorAnd EOF )
            // InternalTraceryPlusPlus.g:680:1: ruleSeparatorAnd EOF
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
    // InternalTraceryPlusPlus.g:687:1: ruleSeparatorAnd : ( ( rule__SeparatorAnd__Alternatives ) ) ;
    public final void ruleSeparatorAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:691:2: ( ( ( rule__SeparatorAnd__Alternatives ) ) )
            // InternalTraceryPlusPlus.g:692:2: ( ( rule__SeparatorAnd__Alternatives ) )
            {
            // InternalTraceryPlusPlus.g:692:2: ( ( rule__SeparatorAnd__Alternatives ) )
            // InternalTraceryPlusPlus.g:693:3: ( rule__SeparatorAnd__Alternatives )
            {
             before(grammarAccess.getSeparatorAndAccess().getAlternatives()); 
            // InternalTraceryPlusPlus.g:694:3: ( rule__SeparatorAnd__Alternatives )
            // InternalTraceryPlusPlus.g:694:4: rule__SeparatorAnd__Alternatives
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


    // $ANTLR start "rule__Variable__Alternatives"
    // InternalTraceryPlusPlus.g:702:1: rule__Variable__Alternatives : ( ( ruleListDeclaration ) | ( ruleObjectDeclaration ) );
    public final void rule__Variable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:706:1: ( ( ruleListDeclaration ) | ( ruleObjectDeclaration ) )
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
                    // InternalTraceryPlusPlus.g:707:2: ( ruleListDeclaration )
                    {
                    // InternalTraceryPlusPlus.g:707:2: ( ruleListDeclaration )
                    // InternalTraceryPlusPlus.g:708:3: ruleListDeclaration
                    {
                     before(grammarAccess.getVariableAccess().getListDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleListDeclaration();

                    state._fsp--;

                     after(grammarAccess.getVariableAccess().getListDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:713:2: ( ruleObjectDeclaration )
                    {
                    // InternalTraceryPlusPlus.g:713:2: ( ruleObjectDeclaration )
                    // InternalTraceryPlusPlus.g:714:3: ruleObjectDeclaration
                    {
                     before(grammarAccess.getVariableAccess().getObjectDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleObjectDeclaration();

                    state._fsp--;

                     after(grammarAccess.getVariableAccess().getObjectDeclarationParserRuleCall_1()); 

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
    // $ANTLR end "rule__Variable__Alternatives"


    // $ANTLR start "rule__Story__StoryAlternatives_4_0"
    // InternalTraceryPlusPlus.g:723:1: rule__Story__StoryAlternatives_4_0 : ( ( ruleWord ) | ( ruleListVariable ) | ( ruleObjectAttribute ) );
    public final void rule__Story__StoryAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:727:1: ( ( ruleWord ) | ( ruleListVariable ) | ( ruleObjectAttribute ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==43) ) {
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
                    // InternalTraceryPlusPlus.g:728:2: ( ruleWord )
                    {
                    // InternalTraceryPlusPlus.g:728:2: ( ruleWord )
                    // InternalTraceryPlusPlus.g:729:3: ruleWord
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
                    // InternalTraceryPlusPlus.g:734:2: ( ruleListVariable )
                    {
                    // InternalTraceryPlusPlus.g:734:2: ( ruleListVariable )
                    // InternalTraceryPlusPlus.g:735:3: ruleListVariable
                    {
                     before(grammarAccess.getStoryAccess().getStoryListVariableParserRuleCall_4_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleListVariable();

                    state._fsp--;

                     after(grammarAccess.getStoryAccess().getStoryListVariableParserRuleCall_4_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:740:2: ( ruleObjectAttribute )
                    {
                    // InternalTraceryPlusPlus.g:740:2: ( ruleObjectAttribute )
                    // InternalTraceryPlusPlus.g:741:3: ruleObjectAttribute
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
    // InternalTraceryPlusPlus.g:750:1: rule__ListDeclaration__Alternatives_1 : ( ( ( rule__ListDeclaration__Group_1_0__0 ) ) | ( ( rule__ListDeclaration__Group_1_1__0 ) ) | ( ( rule__ListDeclaration__Group_1_2__0 ) ) );
    public final void rule__ListDeclaration__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:754:1: ( ( ( rule__ListDeclaration__Group_1_0__0 ) ) | ( ( rule__ListDeclaration__Group_1_1__0 ) ) | ( ( rule__ListDeclaration__Group_1_2__0 ) ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==38) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==17) ) {
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
            else if ( ((LA3_0>=16 && LA3_0<=17)) ) {
                alt3=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTraceryPlusPlus.g:755:2: ( ( rule__ListDeclaration__Group_1_0__0 ) )
                    {
                    // InternalTraceryPlusPlus.g:755:2: ( ( rule__ListDeclaration__Group_1_0__0 ) )
                    // InternalTraceryPlusPlus.g:756:3: ( rule__ListDeclaration__Group_1_0__0 )
                    {
                     before(grammarAccess.getListDeclarationAccess().getGroup_1_0()); 
                    // InternalTraceryPlusPlus.g:757:3: ( rule__ListDeclaration__Group_1_0__0 )
                    // InternalTraceryPlusPlus.g:757:4: rule__ListDeclaration__Group_1_0__0
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
                    // InternalTraceryPlusPlus.g:761:2: ( ( rule__ListDeclaration__Group_1_1__0 ) )
                    {
                    // InternalTraceryPlusPlus.g:761:2: ( ( rule__ListDeclaration__Group_1_1__0 ) )
                    // InternalTraceryPlusPlus.g:762:3: ( rule__ListDeclaration__Group_1_1__0 )
                    {
                     before(grammarAccess.getListDeclarationAccess().getGroup_1_1()); 
                    // InternalTraceryPlusPlus.g:763:3: ( rule__ListDeclaration__Group_1_1__0 )
                    // InternalTraceryPlusPlus.g:763:4: rule__ListDeclaration__Group_1_1__0
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
                    // InternalTraceryPlusPlus.g:767:2: ( ( rule__ListDeclaration__Group_1_2__0 ) )
                    {
                    // InternalTraceryPlusPlus.g:767:2: ( ( rule__ListDeclaration__Group_1_2__0 ) )
                    // InternalTraceryPlusPlus.g:768:3: ( rule__ListDeclaration__Group_1_2__0 )
                    {
                     before(grammarAccess.getListDeclarationAccess().getGroup_1_2()); 
                    // InternalTraceryPlusPlus.g:769:3: ( rule__ListDeclaration__Group_1_2__0 )
                    // InternalTraceryPlusPlus.g:769:4: rule__ListDeclaration__Group_1_2__0
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


    // $ANTLR start "rule__ListDeclaration__Alternatives_1_2_0"
    // InternalTraceryPlusPlus.g:777:1: rule__ListDeclaration__Alternatives_1_2_0 : ( ( 'has' ) | ( 'have' ) );
    public final void rule__ListDeclaration__Alternatives_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:781:1: ( ( 'has' ) | ( 'have' ) )
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
                    // InternalTraceryPlusPlus.g:782:2: ( 'has' )
                    {
                    // InternalTraceryPlusPlus.g:782:2: ( 'has' )
                    // InternalTraceryPlusPlus.g:783:3: 'has'
                    {
                     before(grammarAccess.getListDeclarationAccess().getHasKeyword_1_2_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getListDeclarationAccess().getHasKeyword_1_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:788:2: ( 'have' )
                    {
                    // InternalTraceryPlusPlus.g:788:2: ( 'have' )
                    // InternalTraceryPlusPlus.g:789:3: 'have'
                    {
                     before(grammarAccess.getListDeclarationAccess().getHaveKeyword_1_2_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getListDeclarationAccess().getHaveKeyword_1_2_0_1()); 

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
    // $ANTLR end "rule__ListDeclaration__Alternatives_1_2_0"


    // $ANTLR start "rule__ObjectDeclaration__Alternatives_1"
    // InternalTraceryPlusPlus.g:798:1: rule__ObjectDeclaration__Alternatives_1 : ( ( 'is' ) | ( 'are' ) );
    public final void rule__ObjectDeclaration__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:802:1: ( ( 'is' ) | ( 'are' ) )
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
                    // InternalTraceryPlusPlus.g:803:2: ( 'is' )
                    {
                    // InternalTraceryPlusPlus.g:803:2: ( 'is' )
                    // InternalTraceryPlusPlus.g:804:3: 'is'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getIsKeyword_1_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getObjectDeclarationAccess().getIsKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:809:2: ( 'are' )
                    {
                    // InternalTraceryPlusPlus.g:809:2: ( 'are' )
                    // InternalTraceryPlusPlus.g:810:3: 'are'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getAreKeyword_1_1()); 
                    match(input,19,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:819:1: rule__ObjectDeclaration__Alternatives_2 : ( ( 'a' ) | ( 'an' ) );
    public final void rule__ObjectDeclaration__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:823:1: ( ( 'a' ) | ( 'an' ) )
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
                    // InternalTraceryPlusPlus.g:824:2: ( 'a' )
                    {
                    // InternalTraceryPlusPlus.g:824:2: ( 'a' )
                    // InternalTraceryPlusPlus.g:825:3: 'a'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getAKeyword_2_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getObjectDeclarationAccess().getAKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:830:2: ( 'an' )
                    {
                    // InternalTraceryPlusPlus.g:830:2: ( 'an' )
                    // InternalTraceryPlusPlus.g:831:3: 'an'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getAnKeyword_2_1()); 
                    match(input,21,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:840:1: rule__ObjectDeclaration__Alternatives_5 : ( ( 'has' ) | ( 'have' ) );
    public final void rule__ObjectDeclaration__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:844:1: ( ( 'has' ) | ( 'have' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTraceryPlusPlus.g:845:2: ( 'has' )
                    {
                    // InternalTraceryPlusPlus.g:845:2: ( 'has' )
                    // InternalTraceryPlusPlus.g:846:3: 'has'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getHasKeyword_5_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getObjectDeclarationAccess().getHasKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:851:2: ( 'have' )
                    {
                    // InternalTraceryPlusPlus.g:851:2: ( 'have' )
                    // InternalTraceryPlusPlus.g:852:3: 'have'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getHaveKeyword_5_1()); 
                    match(input,17,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:861:1: rule__Attribute__Alternatives : ( ( ruleJustNameAttribute ) | ( ruleNameExistingListAttribute ) | ( ruleNameValueAttribute ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:865:1: ( ( ruleJustNameAttribute ) | ( ruleNameExistingListAttribute ) | ( ruleNameValueAttribute ) )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalTraceryPlusPlus.g:866:2: ( ruleJustNameAttribute )
                    {
                    // InternalTraceryPlusPlus.g:866:2: ( ruleJustNameAttribute )
                    // InternalTraceryPlusPlus.g:867:3: ruleJustNameAttribute
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
                    // InternalTraceryPlusPlus.g:872:2: ( ruleNameExistingListAttribute )
                    {
                    // InternalTraceryPlusPlus.g:872:2: ( ruleNameExistingListAttribute )
                    // InternalTraceryPlusPlus.g:873:3: ruleNameExistingListAttribute
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
                    // InternalTraceryPlusPlus.g:878:2: ( ruleNameValueAttribute )
                    {
                    // InternalTraceryPlusPlus.g:878:2: ( ruleNameValueAttribute )
                    // InternalTraceryPlusPlus.g:879:3: ruleNameValueAttribute
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
    // InternalTraceryPlusPlus.g:888:1: rule__NameExistingListAttribute__Alternatives_1 : ( ( ruleAssignmentOperator ) | ( 'from' ) );
    public final void rule__NameExistingListAttribute__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:892:1: ( ( ruleAssignmentOperator ) | ( 'from' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=27 && LA9_0<=30)||LA9_0==44) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalTraceryPlusPlus.g:893:2: ( ruleAssignmentOperator )
                    {
                    // InternalTraceryPlusPlus.g:893:2: ( ruleAssignmentOperator )
                    // InternalTraceryPlusPlus.g:894:3: ruleAssignmentOperator
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
                    // InternalTraceryPlusPlus.g:899:2: ( 'from' )
                    {
                    // InternalTraceryPlusPlus.g:899:2: ( 'from' )
                    // InternalTraceryPlusPlus.g:900:3: 'from'
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


    // $ANTLR start "rule__ObjectAttribute__Alternatives_2"
    // InternalTraceryPlusPlus.g:909:1: rule__ObjectAttribute__Alternatives_2 : ( ( ( rule__ObjectAttribute__AttributeAssignment_2_0 ) ) | ( ( rule__ObjectAttribute__PronounAssignment_2_1 ) ) );
    public final void rule__ObjectAttribute__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:913:1: ( ( ( rule__ObjectAttribute__AttributeAssignment_2_0 ) ) | ( ( rule__ObjectAttribute__PronounAssignment_2_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=23 && LA10_0<=26)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalTraceryPlusPlus.g:914:2: ( ( rule__ObjectAttribute__AttributeAssignment_2_0 ) )
                    {
                    // InternalTraceryPlusPlus.g:914:2: ( ( rule__ObjectAttribute__AttributeAssignment_2_0 ) )
                    // InternalTraceryPlusPlus.g:915:3: ( rule__ObjectAttribute__AttributeAssignment_2_0 )
                    {
                     before(grammarAccess.getObjectAttributeAccess().getAttributeAssignment_2_0()); 
                    // InternalTraceryPlusPlus.g:916:3: ( rule__ObjectAttribute__AttributeAssignment_2_0 )
                    // InternalTraceryPlusPlus.g:916:4: rule__ObjectAttribute__AttributeAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjectAttribute__AttributeAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectAttributeAccess().getAttributeAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:920:2: ( ( rule__ObjectAttribute__PronounAssignment_2_1 ) )
                    {
                    // InternalTraceryPlusPlus.g:920:2: ( ( rule__ObjectAttribute__PronounAssignment_2_1 ) )
                    // InternalTraceryPlusPlus.g:921:3: ( rule__ObjectAttribute__PronounAssignment_2_1 )
                    {
                     before(grammarAccess.getObjectAttributeAccess().getPronounAssignment_2_1()); 
                    // InternalTraceryPlusPlus.g:922:3: ( rule__ObjectAttribute__PronounAssignment_2_1 )
                    // InternalTraceryPlusPlus.g:922:4: rule__ObjectAttribute__PronounAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjectAttribute__PronounAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectAttributeAccess().getPronounAssignment_2_1()); 

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
    // $ANTLR end "rule__ObjectAttribute__Alternatives_2"


    // $ANTLR start "rule__Pronouns__Alternatives"
    // InternalTraceryPlusPlus.g:930:1: rule__Pronouns__Alternatives : ( ( ( rule__Pronouns__ValueAssignment_0 ) ) | ( ( rule__Pronouns__ValueAssignment_1 ) ) | ( ( rule__Pronouns__ValueAssignment_2 ) ) | ( ( rule__Pronouns__ValueAssignment_3 ) ) );
    public final void rule__Pronouns__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:934:1: ( ( ( rule__Pronouns__ValueAssignment_0 ) ) | ( ( rule__Pronouns__ValueAssignment_1 ) ) | ( ( rule__Pronouns__ValueAssignment_2 ) ) | ( ( rule__Pronouns__ValueAssignment_3 ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt11=1;
                }
                break;
            case 47:
                {
                alt11=2;
                }
                break;
            case 48:
                {
                alt11=3;
                }
                break;
            case 49:
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
                    // InternalTraceryPlusPlus.g:935:2: ( ( rule__Pronouns__ValueAssignment_0 ) )
                    {
                    // InternalTraceryPlusPlus.g:935:2: ( ( rule__Pronouns__ValueAssignment_0 ) )
                    // InternalTraceryPlusPlus.g:936:3: ( rule__Pronouns__ValueAssignment_0 )
                    {
                     before(grammarAccess.getPronounsAccess().getValueAssignment_0()); 
                    // InternalTraceryPlusPlus.g:937:3: ( rule__Pronouns__ValueAssignment_0 )
                    // InternalTraceryPlusPlus.g:937:4: rule__Pronouns__ValueAssignment_0
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
                    // InternalTraceryPlusPlus.g:941:2: ( ( rule__Pronouns__ValueAssignment_1 ) )
                    {
                    // InternalTraceryPlusPlus.g:941:2: ( ( rule__Pronouns__ValueAssignment_1 ) )
                    // InternalTraceryPlusPlus.g:942:3: ( rule__Pronouns__ValueAssignment_1 )
                    {
                     before(grammarAccess.getPronounsAccess().getValueAssignment_1()); 
                    // InternalTraceryPlusPlus.g:943:3: ( rule__Pronouns__ValueAssignment_1 )
                    // InternalTraceryPlusPlus.g:943:4: rule__Pronouns__ValueAssignment_1
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
                    // InternalTraceryPlusPlus.g:947:2: ( ( rule__Pronouns__ValueAssignment_2 ) )
                    {
                    // InternalTraceryPlusPlus.g:947:2: ( ( rule__Pronouns__ValueAssignment_2 ) )
                    // InternalTraceryPlusPlus.g:948:3: ( rule__Pronouns__ValueAssignment_2 )
                    {
                     before(grammarAccess.getPronounsAccess().getValueAssignment_2()); 
                    // InternalTraceryPlusPlus.g:949:3: ( rule__Pronouns__ValueAssignment_2 )
                    // InternalTraceryPlusPlus.g:949:4: rule__Pronouns__ValueAssignment_2
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
                    // InternalTraceryPlusPlus.g:953:2: ( ( rule__Pronouns__ValueAssignment_3 ) )
                    {
                    // InternalTraceryPlusPlus.g:953:2: ( ( rule__Pronouns__ValueAssignment_3 ) )
                    // InternalTraceryPlusPlus.g:954:3: ( rule__Pronouns__ValueAssignment_3 )
                    {
                     before(grammarAccess.getPronounsAccess().getValueAssignment_3()); 
                    // InternalTraceryPlusPlus.g:955:3: ( rule__Pronouns__ValueAssignment_3 )
                    // InternalTraceryPlusPlus.g:955:4: rule__Pronouns__ValueAssignment_3
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
    // InternalTraceryPlusPlus.g:963:1: rule__PronounIdentifier__NameAlternatives_0 : ( ( 'they' ) | ( 'them' ) | ( 'their' ) | ( 'theirs' ) );
    public final void rule__PronounIdentifier__NameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:967:1: ( ( 'they' ) | ( 'them' ) | ( 'their' ) | ( 'theirs' ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt12=1;
                }
                break;
            case 24:
                {
                alt12=2;
                }
                break;
            case 25:
                {
                alt12=3;
                }
                break;
            case 26:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalTraceryPlusPlus.g:968:2: ( 'they' )
                    {
                    // InternalTraceryPlusPlus.g:968:2: ( 'they' )
                    // InternalTraceryPlusPlus.g:969:3: 'they'
                    {
                     before(grammarAccess.getPronounIdentifierAccess().getNameTheyKeyword_0_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getPronounIdentifierAccess().getNameTheyKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:974:2: ( 'them' )
                    {
                    // InternalTraceryPlusPlus.g:974:2: ( 'them' )
                    // InternalTraceryPlusPlus.g:975:3: 'them'
                    {
                     before(grammarAccess.getPronounIdentifierAccess().getNameThemKeyword_0_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getPronounIdentifierAccess().getNameThemKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:980:2: ( 'their' )
                    {
                    // InternalTraceryPlusPlus.g:980:2: ( 'their' )
                    // InternalTraceryPlusPlus.g:981:3: 'their'
                    {
                     before(grammarAccess.getPronounIdentifierAccess().getNameTheirKeyword_0_2()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getPronounIdentifierAccess().getNameTheirKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTraceryPlusPlus.g:986:2: ( 'theirs' )
                    {
                    // InternalTraceryPlusPlus.g:986:2: ( 'theirs' )
                    // InternalTraceryPlusPlus.g:987:3: 'theirs'
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
    // InternalTraceryPlusPlus.g:996:1: rule__Modifier__Alternatives : ( ( ruleCapitalizationModifier ) | ( ruleFullCapitalizationModifier ) | ( rulePluralityModifier ) | ( ruleArticleModifier ) | ( rulePastTenseModifier ) );
    public final void rule__Modifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1000:1: ( ( ruleCapitalizationModifier ) | ( ruleFullCapitalizationModifier ) | ( rulePluralityModifier ) | ( ruleArticleModifier ) | ( rulePastTenseModifier ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt13=1;
                }
                break;
            case 12:
                {
                alt13=2;
                }
                break;
            case 13:
                {
                alt13=3;
                }
                break;
            case 14:
                {
                alt13=4;
                }
                break;
            case 15:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1001:2: ( ruleCapitalizationModifier )
                    {
                    // InternalTraceryPlusPlus.g:1001:2: ( ruleCapitalizationModifier )
                    // InternalTraceryPlusPlus.g:1002:3: ruleCapitalizationModifier
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
                    // InternalTraceryPlusPlus.g:1007:2: ( ruleFullCapitalizationModifier )
                    {
                    // InternalTraceryPlusPlus.g:1007:2: ( ruleFullCapitalizationModifier )
                    // InternalTraceryPlusPlus.g:1008:3: ruleFullCapitalizationModifier
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
                    // InternalTraceryPlusPlus.g:1013:2: ( rulePluralityModifier )
                    {
                    // InternalTraceryPlusPlus.g:1013:2: ( rulePluralityModifier )
                    // InternalTraceryPlusPlus.g:1014:3: rulePluralityModifier
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
                    // InternalTraceryPlusPlus.g:1019:2: ( ruleArticleModifier )
                    {
                    // InternalTraceryPlusPlus.g:1019:2: ( ruleArticleModifier )
                    // InternalTraceryPlusPlus.g:1020:3: ruleArticleModifier
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
                    // InternalTraceryPlusPlus.g:1025:2: ( rulePastTenseModifier )
                    {
                    // InternalTraceryPlusPlus.g:1025:2: ( rulePastTenseModifier )
                    // InternalTraceryPlusPlus.g:1026:3: rulePastTenseModifier
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
    // InternalTraceryPlusPlus.g:1035:1: rule__AssignmentOperator__Alternatives : ( ( '=' ) | ( ':' ) | ( '-' ) | ( '-->' ) | ( ( rule__AssignmentOperator__Group_4__0 ) ) );
    public final void rule__AssignmentOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1039:1: ( ( '=' ) | ( ':' ) | ( '-' ) | ( '-->' ) | ( ( rule__AssignmentOperator__Group_4__0 ) ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt14=1;
                }
                break;
            case 28:
                {
                alt14=2;
                }
                break;
            case 29:
                {
                alt14=3;
                }
                break;
            case 30:
                {
                alt14=4;
                }
                break;
            case 44:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1040:2: ( '=' )
                    {
                    // InternalTraceryPlusPlus.g:1040:2: ( '=' )
                    // InternalTraceryPlusPlus.g:1041:3: '='
                    {
                     before(grammarAccess.getAssignmentOperatorAccess().getEqualsSignKeyword_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getAssignmentOperatorAccess().getEqualsSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1046:2: ( ':' )
                    {
                    // InternalTraceryPlusPlus.g:1046:2: ( ':' )
                    // InternalTraceryPlusPlus.g:1047:3: ':'
                    {
                     before(grammarAccess.getAssignmentOperatorAccess().getColonKeyword_1()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getAssignmentOperatorAccess().getColonKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1052:2: ( '-' )
                    {
                    // InternalTraceryPlusPlus.g:1052:2: ( '-' )
                    // InternalTraceryPlusPlus.g:1053:3: '-'
                    {
                     before(grammarAccess.getAssignmentOperatorAccess().getHyphenMinusKeyword_2()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getAssignmentOperatorAccess().getHyphenMinusKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTraceryPlusPlus.g:1058:2: ( '-->' )
                    {
                    // InternalTraceryPlusPlus.g:1058:2: ( '-->' )
                    // InternalTraceryPlusPlus.g:1059:3: '-->'
                    {
                     before(grammarAccess.getAssignmentOperatorAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_3()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getAssignmentOperatorAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTraceryPlusPlus.g:1064:2: ( ( rule__AssignmentOperator__Group_4__0 ) )
                    {
                    // InternalTraceryPlusPlus.g:1064:2: ( ( rule__AssignmentOperator__Group_4__0 ) )
                    // InternalTraceryPlusPlus.g:1065:3: ( rule__AssignmentOperator__Group_4__0 )
                    {
                     before(grammarAccess.getAssignmentOperatorAccess().getGroup_4()); 
                    // InternalTraceryPlusPlus.g:1066:3: ( rule__AssignmentOperator__Group_4__0 )
                    // InternalTraceryPlusPlus.g:1066:4: rule__AssignmentOperator__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssignmentOperator__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssignmentOperatorAccess().getGroup_4()); 

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
    // InternalTraceryPlusPlus.g:1074:1: rule__SeparatorOr__Alternatives : ( ( ',' ) | ( 'or' ) | ( '||' ) );
    public final void rule__SeparatorOr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1078:1: ( ( ',' ) | ( 'or' ) | ( '||' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt15=1;
                }
                break;
            case 32:
                {
                alt15=2;
                }
                break;
            case 33:
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
                    // InternalTraceryPlusPlus.g:1079:2: ( ',' )
                    {
                    // InternalTraceryPlusPlus.g:1079:2: ( ',' )
                    // InternalTraceryPlusPlus.g:1080:3: ','
                    {
                     before(grammarAccess.getSeparatorOrAccess().getCommaKeyword_0()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getSeparatorOrAccess().getCommaKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1085:2: ( 'or' )
                    {
                    // InternalTraceryPlusPlus.g:1085:2: ( 'or' )
                    // InternalTraceryPlusPlus.g:1086:3: 'or'
                    {
                     before(grammarAccess.getSeparatorOrAccess().getOrKeyword_1()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getSeparatorOrAccess().getOrKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1091:2: ( '||' )
                    {
                    // InternalTraceryPlusPlus.g:1091:2: ( '||' )
                    // InternalTraceryPlusPlus.g:1092:3: '||'
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
    // InternalTraceryPlusPlus.g:1101:1: rule__SeparatorAnd__Alternatives : ( ( ',' ) | ( 'and' ) | ( '&&' ) );
    public final void rule__SeparatorAnd__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1105:1: ( ( ',' ) | ( 'and' ) | ( '&&' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt16=1;
                }
                break;
            case 34:
                {
                alt16=2;
                }
                break;
            case 35:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1106:2: ( ',' )
                    {
                    // InternalTraceryPlusPlus.g:1106:2: ( ',' )
                    // InternalTraceryPlusPlus.g:1107:3: ','
                    {
                     before(grammarAccess.getSeparatorAndAccess().getCommaKeyword_0()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getSeparatorAndAccess().getCommaKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1112:2: ( 'and' )
                    {
                    // InternalTraceryPlusPlus.g:1112:2: ( 'and' )
                    // InternalTraceryPlusPlus.g:1113:3: 'and'
                    {
                     before(grammarAccess.getSeparatorAndAccess().getAndKeyword_1()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getSeparatorAndAccess().getAndKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1118:2: ( '&&' )
                    {
                    // InternalTraceryPlusPlus.g:1118:2: ( '&&' )
                    // InternalTraceryPlusPlus.g:1119:3: '&&'
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
    // InternalTraceryPlusPlus.g:1128:1: rule__TraceryPlusPlusProgram__Group__0 : rule__TraceryPlusPlusProgram__Group__0__Impl rule__TraceryPlusPlusProgram__Group__1 ;
    public final void rule__TraceryPlusPlusProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1132:1: ( rule__TraceryPlusPlusProgram__Group__0__Impl rule__TraceryPlusPlusProgram__Group__1 )
            // InternalTraceryPlusPlus.g:1133:2: rule__TraceryPlusPlusProgram__Group__0__Impl rule__TraceryPlusPlusProgram__Group__1
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
    // InternalTraceryPlusPlus.g:1140:1: rule__TraceryPlusPlusProgram__Group__0__Impl : ( ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )* ) ;
    public final void rule__TraceryPlusPlusProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1144:1: ( ( ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )* ) )
            // InternalTraceryPlusPlus.g:1145:1: ( ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )* )
            {
            // InternalTraceryPlusPlus.g:1145:1: ( ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )* )
            // InternalTraceryPlusPlus.g:1146:2: ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )*
            {
             before(grammarAccess.getTraceryPlusPlusProgramAccess().getStatementsAssignment_0()); 
            // InternalTraceryPlusPlus.g:1147:2: ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||LA17_0==41) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1147:3: rule__TraceryPlusPlusProgram__StatementsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__TraceryPlusPlusProgram__StatementsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalTraceryPlusPlus.g:1155:1: rule__TraceryPlusPlusProgram__Group__1 : rule__TraceryPlusPlusProgram__Group__1__Impl ;
    public final void rule__TraceryPlusPlusProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1159:1: ( rule__TraceryPlusPlusProgram__Group__1__Impl )
            // InternalTraceryPlusPlus.g:1160:2: rule__TraceryPlusPlusProgram__Group__1__Impl
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
    // InternalTraceryPlusPlus.g:1166:1: rule__TraceryPlusPlusProgram__Group__1__Impl : ( ( rule__TraceryPlusPlusProgram__StoryAssignment_1 ) ) ;
    public final void rule__TraceryPlusPlusProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1170:1: ( ( ( rule__TraceryPlusPlusProgram__StoryAssignment_1 ) ) )
            // InternalTraceryPlusPlus.g:1171:1: ( ( rule__TraceryPlusPlusProgram__StoryAssignment_1 ) )
            {
            // InternalTraceryPlusPlus.g:1171:1: ( ( rule__TraceryPlusPlusProgram__StoryAssignment_1 ) )
            // InternalTraceryPlusPlus.g:1172:2: ( rule__TraceryPlusPlusProgram__StoryAssignment_1 )
            {
             before(grammarAccess.getTraceryPlusPlusProgramAccess().getStoryAssignment_1()); 
            // InternalTraceryPlusPlus.g:1173:2: ( rule__TraceryPlusPlusProgram__StoryAssignment_1 )
            // InternalTraceryPlusPlus.g:1173:3: rule__TraceryPlusPlusProgram__StoryAssignment_1
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
    // InternalTraceryPlusPlus.g:1182:1: rule__Story__Group__0 : rule__Story__Group__0__Impl rule__Story__Group__1 ;
    public final void rule__Story__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1186:1: ( rule__Story__Group__0__Impl rule__Story__Group__1 )
            // InternalTraceryPlusPlus.g:1187:2: rule__Story__Group__0__Impl rule__Story__Group__1
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
    // InternalTraceryPlusPlus.g:1194:1: rule__Story__Group__0__Impl : ( () ) ;
    public final void rule__Story__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1198:1: ( ( () ) )
            // InternalTraceryPlusPlus.g:1199:1: ( () )
            {
            // InternalTraceryPlusPlus.g:1199:1: ( () )
            // InternalTraceryPlusPlus.g:1200:2: ()
            {
             before(grammarAccess.getStoryAccess().getStoryAction_0()); 
            // InternalTraceryPlusPlus.g:1201:2: ()
            // InternalTraceryPlusPlus.g:1201:3: 
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
    // InternalTraceryPlusPlus.g:1209:1: rule__Story__Group__1 : rule__Story__Group__1__Impl rule__Story__Group__2 ;
    public final void rule__Story__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1213:1: ( rule__Story__Group__1__Impl rule__Story__Group__2 )
            // InternalTraceryPlusPlus.g:1214:2: rule__Story__Group__1__Impl rule__Story__Group__2
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
    // InternalTraceryPlusPlus.g:1221:1: rule__Story__Group__1__Impl : ( 'The' ) ;
    public final void rule__Story__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1225:1: ( ( 'The' ) )
            // InternalTraceryPlusPlus.g:1226:1: ( 'The' )
            {
            // InternalTraceryPlusPlus.g:1226:1: ( 'The' )
            // InternalTraceryPlusPlus.g:1227:2: 'The'
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
    // InternalTraceryPlusPlus.g:1236:1: rule__Story__Group__2 : rule__Story__Group__2__Impl rule__Story__Group__3 ;
    public final void rule__Story__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1240:1: ( rule__Story__Group__2__Impl rule__Story__Group__3 )
            // InternalTraceryPlusPlus.g:1241:2: rule__Story__Group__2__Impl rule__Story__Group__3
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
    // InternalTraceryPlusPlus.g:1248:1: rule__Story__Group__2__Impl : ( 'story' ) ;
    public final void rule__Story__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1252:1: ( ( 'story' ) )
            // InternalTraceryPlusPlus.g:1253:1: ( 'story' )
            {
            // InternalTraceryPlusPlus.g:1253:1: ( 'story' )
            // InternalTraceryPlusPlus.g:1254:2: 'story'
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
    // InternalTraceryPlusPlus.g:1263:1: rule__Story__Group__3 : rule__Story__Group__3__Impl rule__Story__Group__4 ;
    public final void rule__Story__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1267:1: ( rule__Story__Group__3__Impl rule__Story__Group__4 )
            // InternalTraceryPlusPlus.g:1268:2: rule__Story__Group__3__Impl rule__Story__Group__4
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
    // InternalTraceryPlusPlus.g:1275:1: rule__Story__Group__3__Impl : ( ( ruleAssignmentOperator )? ) ;
    public final void rule__Story__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1279:1: ( ( ( ruleAssignmentOperator )? ) )
            // InternalTraceryPlusPlus.g:1280:1: ( ( ruleAssignmentOperator )? )
            {
            // InternalTraceryPlusPlus.g:1280:1: ( ( ruleAssignmentOperator )? )
            // InternalTraceryPlusPlus.g:1281:2: ( ruleAssignmentOperator )?
            {
             before(grammarAccess.getStoryAccess().getAssignmentOperatorParserRuleCall_3()); 
            // InternalTraceryPlusPlus.g:1282:2: ( ruleAssignmentOperator )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=27 && LA18_0<=30)||LA18_0==44) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1282:3: ruleAssignmentOperator
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
    // InternalTraceryPlusPlus.g:1290:1: rule__Story__Group__4 : rule__Story__Group__4__Impl ;
    public final void rule__Story__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1294:1: ( rule__Story__Group__4__Impl )
            // InternalTraceryPlusPlus.g:1295:2: rule__Story__Group__4__Impl
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
    // InternalTraceryPlusPlus.g:1301:1: rule__Story__Group__4__Impl : ( ( rule__Story__StoryAssignment_4 )* ) ;
    public final void rule__Story__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1305:1: ( ( ( rule__Story__StoryAssignment_4 )* ) )
            // InternalTraceryPlusPlus.g:1306:1: ( ( rule__Story__StoryAssignment_4 )* )
            {
            // InternalTraceryPlusPlus.g:1306:1: ( ( rule__Story__StoryAssignment_4 )* )
            // InternalTraceryPlusPlus.g:1307:2: ( rule__Story__StoryAssignment_4 )*
            {
             before(grammarAccess.getStoryAccess().getStoryAssignment_4()); 
            // InternalTraceryPlusPlus.g:1308:2: ( rule__Story__StoryAssignment_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_STRING)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1308:3: rule__Story__StoryAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Story__StoryAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalTraceryPlusPlus.g:1317:1: rule__ListDeclaration__Group__0 : rule__ListDeclaration__Group__0__Impl rule__ListDeclaration__Group__1 ;
    public final void rule__ListDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1321:1: ( rule__ListDeclaration__Group__0__Impl rule__ListDeclaration__Group__1 )
            // InternalTraceryPlusPlus.g:1322:2: rule__ListDeclaration__Group__0__Impl rule__ListDeclaration__Group__1
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
    // InternalTraceryPlusPlus.g:1329:1: rule__ListDeclaration__Group__0__Impl : ( ( rule__ListDeclaration__NameAssignment_0 ) ) ;
    public final void rule__ListDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1333:1: ( ( ( rule__ListDeclaration__NameAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:1334:1: ( ( rule__ListDeclaration__NameAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:1334:1: ( ( rule__ListDeclaration__NameAssignment_0 ) )
            // InternalTraceryPlusPlus.g:1335:2: ( rule__ListDeclaration__NameAssignment_0 )
            {
             before(grammarAccess.getListDeclarationAccess().getNameAssignment_0()); 
            // InternalTraceryPlusPlus.g:1336:2: ( rule__ListDeclaration__NameAssignment_0 )
            // InternalTraceryPlusPlus.g:1336:3: rule__ListDeclaration__NameAssignment_0
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
    // InternalTraceryPlusPlus.g:1344:1: rule__ListDeclaration__Group__1 : rule__ListDeclaration__Group__1__Impl rule__ListDeclaration__Group__2 ;
    public final void rule__ListDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1348:1: ( rule__ListDeclaration__Group__1__Impl rule__ListDeclaration__Group__2 )
            // InternalTraceryPlusPlus.g:1349:2: rule__ListDeclaration__Group__1__Impl rule__ListDeclaration__Group__2
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
    // InternalTraceryPlusPlus.g:1356:1: rule__ListDeclaration__Group__1__Impl : ( ( rule__ListDeclaration__Alternatives_1 ) ) ;
    public final void rule__ListDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1360:1: ( ( ( rule__ListDeclaration__Alternatives_1 ) ) )
            // InternalTraceryPlusPlus.g:1361:1: ( ( rule__ListDeclaration__Alternatives_1 ) )
            {
            // InternalTraceryPlusPlus.g:1361:1: ( ( rule__ListDeclaration__Alternatives_1 ) )
            // InternalTraceryPlusPlus.g:1362:2: ( rule__ListDeclaration__Alternatives_1 )
            {
             before(grammarAccess.getListDeclarationAccess().getAlternatives_1()); 
            // InternalTraceryPlusPlus.g:1363:2: ( rule__ListDeclaration__Alternatives_1 )
            // InternalTraceryPlusPlus.g:1363:3: rule__ListDeclaration__Alternatives_1
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
    // InternalTraceryPlusPlus.g:1371:1: rule__ListDeclaration__Group__2 : rule__ListDeclaration__Group__2__Impl rule__ListDeclaration__Group__3 ;
    public final void rule__ListDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1375:1: ( rule__ListDeclaration__Group__2__Impl rule__ListDeclaration__Group__3 )
            // InternalTraceryPlusPlus.g:1376:2: rule__ListDeclaration__Group__2__Impl rule__ListDeclaration__Group__3
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
    // InternalTraceryPlusPlus.g:1383:1: rule__ListDeclaration__Group__2__Impl : ( ( ruleAssignmentOperator )? ) ;
    public final void rule__ListDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1387:1: ( ( ( ruleAssignmentOperator )? ) )
            // InternalTraceryPlusPlus.g:1388:1: ( ( ruleAssignmentOperator )? )
            {
            // InternalTraceryPlusPlus.g:1388:1: ( ( ruleAssignmentOperator )? )
            // InternalTraceryPlusPlus.g:1389:2: ( ruleAssignmentOperator )?
            {
             before(grammarAccess.getListDeclarationAccess().getAssignmentOperatorParserRuleCall_2()); 
            // InternalTraceryPlusPlus.g:1390:2: ( ruleAssignmentOperator )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=27 && LA20_0<=30)||LA20_0==44) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1390:3: ruleAssignmentOperator
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
    // InternalTraceryPlusPlus.g:1398:1: rule__ListDeclaration__Group__3 : rule__ListDeclaration__Group__3__Impl ;
    public final void rule__ListDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1402:1: ( rule__ListDeclaration__Group__3__Impl )
            // InternalTraceryPlusPlus.g:1403:2: rule__ListDeclaration__Group__3__Impl
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
    // InternalTraceryPlusPlus.g:1409:1: rule__ListDeclaration__Group__3__Impl : ( ( rule__ListDeclaration__ListAssignment_3 ) ) ;
    public final void rule__ListDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1413:1: ( ( ( rule__ListDeclaration__ListAssignment_3 ) ) )
            // InternalTraceryPlusPlus.g:1414:1: ( ( rule__ListDeclaration__ListAssignment_3 ) )
            {
            // InternalTraceryPlusPlus.g:1414:1: ( ( rule__ListDeclaration__ListAssignment_3 ) )
            // InternalTraceryPlusPlus.g:1415:2: ( rule__ListDeclaration__ListAssignment_3 )
            {
             before(grammarAccess.getListDeclarationAccess().getListAssignment_3()); 
            // InternalTraceryPlusPlus.g:1416:2: ( rule__ListDeclaration__ListAssignment_3 )
            // InternalTraceryPlusPlus.g:1416:3: rule__ListDeclaration__ListAssignment_3
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
    // InternalTraceryPlusPlus.g:1425:1: rule__ListDeclaration__Group_1_0__0 : rule__ListDeclaration__Group_1_0__0__Impl rule__ListDeclaration__Group_1_0__1 ;
    public final void rule__ListDeclaration__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1429:1: ( rule__ListDeclaration__Group_1_0__0__Impl rule__ListDeclaration__Group_1_0__1 )
            // InternalTraceryPlusPlus.g:1430:2: rule__ListDeclaration__Group_1_0__0__Impl rule__ListDeclaration__Group_1_0__1
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
    // InternalTraceryPlusPlus.g:1437:1: rule__ListDeclaration__Group_1_0__0__Impl : ( 'can' ) ;
    public final void rule__ListDeclaration__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1441:1: ( ( 'can' ) )
            // InternalTraceryPlusPlus.g:1442:1: ( 'can' )
            {
            // InternalTraceryPlusPlus.g:1442:1: ( 'can' )
            // InternalTraceryPlusPlus.g:1443:2: 'can'
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
    // InternalTraceryPlusPlus.g:1452:1: rule__ListDeclaration__Group_1_0__1 : rule__ListDeclaration__Group_1_0__1__Impl rule__ListDeclaration__Group_1_0__2 ;
    public final void rule__ListDeclaration__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1456:1: ( rule__ListDeclaration__Group_1_0__1__Impl rule__ListDeclaration__Group_1_0__2 )
            // InternalTraceryPlusPlus.g:1457:2: rule__ListDeclaration__Group_1_0__1__Impl rule__ListDeclaration__Group_1_0__2
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
    // InternalTraceryPlusPlus.g:1464:1: rule__ListDeclaration__Group_1_0__1__Impl : ( 'have' ) ;
    public final void rule__ListDeclaration__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1468:1: ( ( 'have' ) )
            // InternalTraceryPlusPlus.g:1469:1: ( 'have' )
            {
            // InternalTraceryPlusPlus.g:1469:1: ( 'have' )
            // InternalTraceryPlusPlus.g:1470:2: 'have'
            {
             before(grammarAccess.getListDeclarationAccess().getHaveKeyword_1_0_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1479:1: rule__ListDeclaration__Group_1_0__2 : rule__ListDeclaration__Group_1_0__2__Impl ;
    public final void rule__ListDeclaration__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1483:1: ( rule__ListDeclaration__Group_1_0__2__Impl )
            // InternalTraceryPlusPlus.g:1484:2: rule__ListDeclaration__Group_1_0__2__Impl
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
    // InternalTraceryPlusPlus.g:1490:1: rule__ListDeclaration__Group_1_0__2__Impl : ( 'values' ) ;
    public final void rule__ListDeclaration__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1494:1: ( ( 'values' ) )
            // InternalTraceryPlusPlus.g:1495:1: ( 'values' )
            {
            // InternalTraceryPlusPlus.g:1495:1: ( 'values' )
            // InternalTraceryPlusPlus.g:1496:2: 'values'
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
    // InternalTraceryPlusPlus.g:1506:1: rule__ListDeclaration__Group_1_1__0 : rule__ListDeclaration__Group_1_1__0__Impl rule__ListDeclaration__Group_1_1__1 ;
    public final void rule__ListDeclaration__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1510:1: ( rule__ListDeclaration__Group_1_1__0__Impl rule__ListDeclaration__Group_1_1__1 )
            // InternalTraceryPlusPlus.g:1511:2: rule__ListDeclaration__Group_1_1__0__Impl rule__ListDeclaration__Group_1_1__1
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
    // InternalTraceryPlusPlus.g:1518:1: rule__ListDeclaration__Group_1_1__0__Impl : ( 'can' ) ;
    public final void rule__ListDeclaration__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1522:1: ( ( 'can' ) )
            // InternalTraceryPlusPlus.g:1523:1: ( 'can' )
            {
            // InternalTraceryPlusPlus.g:1523:1: ( 'can' )
            // InternalTraceryPlusPlus.g:1524:2: 'can'
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
    // InternalTraceryPlusPlus.g:1533:1: rule__ListDeclaration__Group_1_1__1 : rule__ListDeclaration__Group_1_1__1__Impl ;
    public final void rule__ListDeclaration__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1537:1: ( rule__ListDeclaration__Group_1_1__1__Impl )
            // InternalTraceryPlusPlus.g:1538:2: rule__ListDeclaration__Group_1_1__1__Impl
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
    // InternalTraceryPlusPlus.g:1544:1: rule__ListDeclaration__Group_1_1__1__Impl : ( 'be' ) ;
    public final void rule__ListDeclaration__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1548:1: ( ( 'be' ) )
            // InternalTraceryPlusPlus.g:1549:1: ( 'be' )
            {
            // InternalTraceryPlusPlus.g:1549:1: ( 'be' )
            // InternalTraceryPlusPlus.g:1550:2: 'be'
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
    // InternalTraceryPlusPlus.g:1560:1: rule__ListDeclaration__Group_1_2__0 : rule__ListDeclaration__Group_1_2__0__Impl rule__ListDeclaration__Group_1_2__1 ;
    public final void rule__ListDeclaration__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1564:1: ( rule__ListDeclaration__Group_1_2__0__Impl rule__ListDeclaration__Group_1_2__1 )
            // InternalTraceryPlusPlus.g:1565:2: rule__ListDeclaration__Group_1_2__0__Impl rule__ListDeclaration__Group_1_2__1
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
    // InternalTraceryPlusPlus.g:1572:1: rule__ListDeclaration__Group_1_2__0__Impl : ( ( rule__ListDeclaration__Alternatives_1_2_0 ) ) ;
    public final void rule__ListDeclaration__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1576:1: ( ( ( rule__ListDeclaration__Alternatives_1_2_0 ) ) )
            // InternalTraceryPlusPlus.g:1577:1: ( ( rule__ListDeclaration__Alternatives_1_2_0 ) )
            {
            // InternalTraceryPlusPlus.g:1577:1: ( ( rule__ListDeclaration__Alternatives_1_2_0 ) )
            // InternalTraceryPlusPlus.g:1578:2: ( rule__ListDeclaration__Alternatives_1_2_0 )
            {
             before(grammarAccess.getListDeclarationAccess().getAlternatives_1_2_0()); 
            // InternalTraceryPlusPlus.g:1579:2: ( rule__ListDeclaration__Alternatives_1_2_0 )
            // InternalTraceryPlusPlus.g:1579:3: rule__ListDeclaration__Alternatives_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ListDeclaration__Alternatives_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getListDeclarationAccess().getAlternatives_1_2_0()); 

            }


            }

        }
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
    // InternalTraceryPlusPlus.g:1587:1: rule__ListDeclaration__Group_1_2__1 : rule__ListDeclaration__Group_1_2__1__Impl ;
    public final void rule__ListDeclaration__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1591:1: ( rule__ListDeclaration__Group_1_2__1__Impl )
            // InternalTraceryPlusPlus.g:1592:2: rule__ListDeclaration__Group_1_2__1__Impl
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
    // InternalTraceryPlusPlus.g:1598:1: rule__ListDeclaration__Group_1_2__1__Impl : ( 'values' ) ;
    public final void rule__ListDeclaration__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1602:1: ( ( 'values' ) )
            // InternalTraceryPlusPlus.g:1603:1: ( 'values' )
            {
            // InternalTraceryPlusPlus.g:1603:1: ( 'values' )
            // InternalTraceryPlusPlus.g:1604:2: 'values'
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
    // InternalTraceryPlusPlus.g:1614:1: rule__ObjectDeclaration__Group__0 : rule__ObjectDeclaration__Group__0__Impl rule__ObjectDeclaration__Group__1 ;
    public final void rule__ObjectDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1618:1: ( rule__ObjectDeclaration__Group__0__Impl rule__ObjectDeclaration__Group__1 )
            // InternalTraceryPlusPlus.g:1619:2: rule__ObjectDeclaration__Group__0__Impl rule__ObjectDeclaration__Group__1
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
    // InternalTraceryPlusPlus.g:1626:1: rule__ObjectDeclaration__Group__0__Impl : ( 'There' ) ;
    public final void rule__ObjectDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1630:1: ( ( 'There' ) )
            // InternalTraceryPlusPlus.g:1631:1: ( 'There' )
            {
            // InternalTraceryPlusPlus.g:1631:1: ( 'There' )
            // InternalTraceryPlusPlus.g:1632:2: 'There'
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
    // InternalTraceryPlusPlus.g:1641:1: rule__ObjectDeclaration__Group__1 : rule__ObjectDeclaration__Group__1__Impl rule__ObjectDeclaration__Group__2 ;
    public final void rule__ObjectDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1645:1: ( rule__ObjectDeclaration__Group__1__Impl rule__ObjectDeclaration__Group__2 )
            // InternalTraceryPlusPlus.g:1646:2: rule__ObjectDeclaration__Group__1__Impl rule__ObjectDeclaration__Group__2
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
    // InternalTraceryPlusPlus.g:1653:1: rule__ObjectDeclaration__Group__1__Impl : ( ( rule__ObjectDeclaration__Alternatives_1 ) ) ;
    public final void rule__ObjectDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1657:1: ( ( ( rule__ObjectDeclaration__Alternatives_1 ) ) )
            // InternalTraceryPlusPlus.g:1658:1: ( ( rule__ObjectDeclaration__Alternatives_1 ) )
            {
            // InternalTraceryPlusPlus.g:1658:1: ( ( rule__ObjectDeclaration__Alternatives_1 ) )
            // InternalTraceryPlusPlus.g:1659:2: ( rule__ObjectDeclaration__Alternatives_1 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getAlternatives_1()); 
            // InternalTraceryPlusPlus.g:1660:2: ( rule__ObjectDeclaration__Alternatives_1 )
            // InternalTraceryPlusPlus.g:1660:3: rule__ObjectDeclaration__Alternatives_1
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
    // InternalTraceryPlusPlus.g:1668:1: rule__ObjectDeclaration__Group__2 : rule__ObjectDeclaration__Group__2__Impl rule__ObjectDeclaration__Group__3 ;
    public final void rule__ObjectDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1672:1: ( rule__ObjectDeclaration__Group__2__Impl rule__ObjectDeclaration__Group__3 )
            // InternalTraceryPlusPlus.g:1673:2: rule__ObjectDeclaration__Group__2__Impl rule__ObjectDeclaration__Group__3
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
    // InternalTraceryPlusPlus.g:1680:1: rule__ObjectDeclaration__Group__2__Impl : ( ( rule__ObjectDeclaration__Alternatives_2 )? ) ;
    public final void rule__ObjectDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1684:1: ( ( ( rule__ObjectDeclaration__Alternatives_2 )? ) )
            // InternalTraceryPlusPlus.g:1685:1: ( ( rule__ObjectDeclaration__Alternatives_2 )? )
            {
            // InternalTraceryPlusPlus.g:1685:1: ( ( rule__ObjectDeclaration__Alternatives_2 )? )
            // InternalTraceryPlusPlus.g:1686:2: ( rule__ObjectDeclaration__Alternatives_2 )?
            {
             before(grammarAccess.getObjectDeclarationAccess().getAlternatives_2()); 
            // InternalTraceryPlusPlus.g:1687:2: ( rule__ObjectDeclaration__Alternatives_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=20 && LA21_0<=21)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1687:3: rule__ObjectDeclaration__Alternatives_2
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
    // InternalTraceryPlusPlus.g:1695:1: rule__ObjectDeclaration__Group__3 : rule__ObjectDeclaration__Group__3__Impl rule__ObjectDeclaration__Group__4 ;
    public final void rule__ObjectDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1699:1: ( rule__ObjectDeclaration__Group__3__Impl rule__ObjectDeclaration__Group__4 )
            // InternalTraceryPlusPlus.g:1700:2: rule__ObjectDeclaration__Group__3__Impl rule__ObjectDeclaration__Group__4
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
    // InternalTraceryPlusPlus.g:1707:1: rule__ObjectDeclaration__Group__3__Impl : ( ( rule__ObjectDeclaration__NameAssignment_3 ) ) ;
    public final void rule__ObjectDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1711:1: ( ( ( rule__ObjectDeclaration__NameAssignment_3 ) ) )
            // InternalTraceryPlusPlus.g:1712:1: ( ( rule__ObjectDeclaration__NameAssignment_3 ) )
            {
            // InternalTraceryPlusPlus.g:1712:1: ( ( rule__ObjectDeclaration__NameAssignment_3 ) )
            // InternalTraceryPlusPlus.g:1713:2: ( rule__ObjectDeclaration__NameAssignment_3 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getNameAssignment_3()); 
            // InternalTraceryPlusPlus.g:1714:2: ( rule__ObjectDeclaration__NameAssignment_3 )
            // InternalTraceryPlusPlus.g:1714:3: rule__ObjectDeclaration__NameAssignment_3
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
    // InternalTraceryPlusPlus.g:1722:1: rule__ObjectDeclaration__Group__4 : rule__ObjectDeclaration__Group__4__Impl rule__ObjectDeclaration__Group__5 ;
    public final void rule__ObjectDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1726:1: ( rule__ObjectDeclaration__Group__4__Impl rule__ObjectDeclaration__Group__5 )
            // InternalTraceryPlusPlus.g:1727:2: rule__ObjectDeclaration__Group__4__Impl rule__ObjectDeclaration__Group__5
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
    // InternalTraceryPlusPlus.g:1734:1: rule__ObjectDeclaration__Group__4__Impl : ( ( rule__ObjectDeclaration__PronounsAssignment_4 ) ) ;
    public final void rule__ObjectDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1738:1: ( ( ( rule__ObjectDeclaration__PronounsAssignment_4 ) ) )
            // InternalTraceryPlusPlus.g:1739:1: ( ( rule__ObjectDeclaration__PronounsAssignment_4 ) )
            {
            // InternalTraceryPlusPlus.g:1739:1: ( ( rule__ObjectDeclaration__PronounsAssignment_4 ) )
            // InternalTraceryPlusPlus.g:1740:2: ( rule__ObjectDeclaration__PronounsAssignment_4 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getPronounsAssignment_4()); 
            // InternalTraceryPlusPlus.g:1741:2: ( rule__ObjectDeclaration__PronounsAssignment_4 )
            // InternalTraceryPlusPlus.g:1741:3: rule__ObjectDeclaration__PronounsAssignment_4
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
    // InternalTraceryPlusPlus.g:1749:1: rule__ObjectDeclaration__Group__5 : rule__ObjectDeclaration__Group__5__Impl rule__ObjectDeclaration__Group__6 ;
    public final void rule__ObjectDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1753:1: ( rule__ObjectDeclaration__Group__5__Impl rule__ObjectDeclaration__Group__6 )
            // InternalTraceryPlusPlus.g:1754:2: rule__ObjectDeclaration__Group__5__Impl rule__ObjectDeclaration__Group__6
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
    // InternalTraceryPlusPlus.g:1761:1: rule__ObjectDeclaration__Group__5__Impl : ( ( rule__ObjectDeclaration__Alternatives_5 ) ) ;
    public final void rule__ObjectDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1765:1: ( ( ( rule__ObjectDeclaration__Alternatives_5 ) ) )
            // InternalTraceryPlusPlus.g:1766:1: ( ( rule__ObjectDeclaration__Alternatives_5 ) )
            {
            // InternalTraceryPlusPlus.g:1766:1: ( ( rule__ObjectDeclaration__Alternatives_5 ) )
            // InternalTraceryPlusPlus.g:1767:2: ( rule__ObjectDeclaration__Alternatives_5 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getAlternatives_5()); 
            // InternalTraceryPlusPlus.g:1768:2: ( rule__ObjectDeclaration__Alternatives_5 )
            // InternalTraceryPlusPlus.g:1768:3: rule__ObjectDeclaration__Alternatives_5
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
    // InternalTraceryPlusPlus.g:1776:1: rule__ObjectDeclaration__Group__6 : rule__ObjectDeclaration__Group__6__Impl rule__ObjectDeclaration__Group__7 ;
    public final void rule__ObjectDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1780:1: ( rule__ObjectDeclaration__Group__6__Impl rule__ObjectDeclaration__Group__7 )
            // InternalTraceryPlusPlus.g:1781:2: rule__ObjectDeclaration__Group__6__Impl rule__ObjectDeclaration__Group__7
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
    // InternalTraceryPlusPlus.g:1788:1: rule__ObjectDeclaration__Group__6__Impl : ( ( 'attributes' )? ) ;
    public final void rule__ObjectDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1792:1: ( ( ( 'attributes' )? ) )
            // InternalTraceryPlusPlus.g:1793:1: ( ( 'attributes' )? )
            {
            // InternalTraceryPlusPlus.g:1793:1: ( ( 'attributes' )? )
            // InternalTraceryPlusPlus.g:1794:2: ( 'attributes' )?
            {
             before(grammarAccess.getObjectDeclarationAccess().getAttributesKeyword_6()); 
            // InternalTraceryPlusPlus.g:1795:2: ( 'attributes' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==42) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1795:3: 'attributes'
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
    // InternalTraceryPlusPlus.g:1803:1: rule__ObjectDeclaration__Group__7 : rule__ObjectDeclaration__Group__7__Impl rule__ObjectDeclaration__Group__8 ;
    public final void rule__ObjectDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1807:1: ( rule__ObjectDeclaration__Group__7__Impl rule__ObjectDeclaration__Group__8 )
            // InternalTraceryPlusPlus.g:1808:2: rule__ObjectDeclaration__Group__7__Impl rule__ObjectDeclaration__Group__8
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
    // InternalTraceryPlusPlus.g:1815:1: rule__ObjectDeclaration__Group__7__Impl : ( ( ruleAssignmentOperator )? ) ;
    public final void rule__ObjectDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1819:1: ( ( ( ruleAssignmentOperator )? ) )
            // InternalTraceryPlusPlus.g:1820:1: ( ( ruleAssignmentOperator )? )
            {
            // InternalTraceryPlusPlus.g:1820:1: ( ( ruleAssignmentOperator )? )
            // InternalTraceryPlusPlus.g:1821:2: ( ruleAssignmentOperator )?
            {
             before(grammarAccess.getObjectDeclarationAccess().getAssignmentOperatorParserRuleCall_7()); 
            // InternalTraceryPlusPlus.g:1822:2: ( ruleAssignmentOperator )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=27 && LA23_0<=30)||LA23_0==44) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1822:3: ruleAssignmentOperator
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
    // InternalTraceryPlusPlus.g:1830:1: rule__ObjectDeclaration__Group__8 : rule__ObjectDeclaration__Group__8__Impl ;
    public final void rule__ObjectDeclaration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1834:1: ( rule__ObjectDeclaration__Group__8__Impl )
            // InternalTraceryPlusPlus.g:1835:2: rule__ObjectDeclaration__Group__8__Impl
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
    // InternalTraceryPlusPlus.g:1841:1: rule__ObjectDeclaration__Group__8__Impl : ( ( rule__ObjectDeclaration__AttributesAssignment_8 ) ) ;
    public final void rule__ObjectDeclaration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1845:1: ( ( ( rule__ObjectDeclaration__AttributesAssignment_8 ) ) )
            // InternalTraceryPlusPlus.g:1846:1: ( ( rule__ObjectDeclaration__AttributesAssignment_8 ) )
            {
            // InternalTraceryPlusPlus.g:1846:1: ( ( rule__ObjectDeclaration__AttributesAssignment_8 ) )
            // InternalTraceryPlusPlus.g:1847:2: ( rule__ObjectDeclaration__AttributesAssignment_8 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getAttributesAssignment_8()); 
            // InternalTraceryPlusPlus.g:1848:2: ( rule__ObjectDeclaration__AttributesAssignment_8 )
            // InternalTraceryPlusPlus.g:1848:3: rule__ObjectDeclaration__AttributesAssignment_8
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


    // $ANTLR start "rule__ListVariable__Group__0"
    // InternalTraceryPlusPlus.g:1857:1: rule__ListVariable__Group__0 : rule__ListVariable__Group__0__Impl rule__ListVariable__Group__1 ;
    public final void rule__ListVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1861:1: ( rule__ListVariable__Group__0__Impl rule__ListVariable__Group__1 )
            // InternalTraceryPlusPlus.g:1862:2: rule__ListVariable__Group__0__Impl rule__ListVariable__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__ListVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListVariable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListVariable__Group__0"


    // $ANTLR start "rule__ListVariable__Group__0__Impl"
    // InternalTraceryPlusPlus.g:1869:1: rule__ListVariable__Group__0__Impl : ( ( rule__ListVariable__VariableAssignment_0 ) ) ;
    public final void rule__ListVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1873:1: ( ( ( rule__ListVariable__VariableAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:1874:1: ( ( rule__ListVariable__VariableAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:1874:1: ( ( rule__ListVariable__VariableAssignment_0 ) )
            // InternalTraceryPlusPlus.g:1875:2: ( rule__ListVariable__VariableAssignment_0 )
            {
             before(grammarAccess.getListVariableAccess().getVariableAssignment_0()); 
            // InternalTraceryPlusPlus.g:1876:2: ( rule__ListVariable__VariableAssignment_0 )
            // InternalTraceryPlusPlus.g:1876:3: rule__ListVariable__VariableAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ListVariable__VariableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getListVariableAccess().getVariableAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListVariable__Group__0__Impl"


    // $ANTLR start "rule__ListVariable__Group__1"
    // InternalTraceryPlusPlus.g:1884:1: rule__ListVariable__Group__1 : rule__ListVariable__Group__1__Impl ;
    public final void rule__ListVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1888:1: ( rule__ListVariable__Group__1__Impl )
            // InternalTraceryPlusPlus.g:1889:2: rule__ListVariable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListVariable__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListVariable__Group__1"


    // $ANTLR start "rule__ListVariable__Group__1__Impl"
    // InternalTraceryPlusPlus.g:1895:1: rule__ListVariable__Group__1__Impl : ( ( rule__ListVariable__ModifiersAssignment_1 )* ) ;
    public final void rule__ListVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1899:1: ( ( ( rule__ListVariable__ModifiersAssignment_1 )* ) )
            // InternalTraceryPlusPlus.g:1900:1: ( ( rule__ListVariable__ModifiersAssignment_1 )* )
            {
            // InternalTraceryPlusPlus.g:1900:1: ( ( rule__ListVariable__ModifiersAssignment_1 )* )
            // InternalTraceryPlusPlus.g:1901:2: ( rule__ListVariable__ModifiersAssignment_1 )*
            {
             before(grammarAccess.getListVariableAccess().getModifiersAssignment_1()); 
            // InternalTraceryPlusPlus.g:1902:2: ( rule__ListVariable__ModifiersAssignment_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=11 && LA24_0<=15)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1902:3: rule__ListVariable__ModifiersAssignment_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ListVariable__ModifiersAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getListVariableAccess().getModifiersAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListVariable__Group__1__Impl"


    // $ANTLR start "rule__NameExistingListAttribute__Group__0"
    // InternalTraceryPlusPlus.g:1911:1: rule__NameExistingListAttribute__Group__0 : rule__NameExistingListAttribute__Group__0__Impl rule__NameExistingListAttribute__Group__1 ;
    public final void rule__NameExistingListAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1915:1: ( rule__NameExistingListAttribute__Group__0__Impl rule__NameExistingListAttribute__Group__1 )
            // InternalTraceryPlusPlus.g:1916:2: rule__NameExistingListAttribute__Group__0__Impl rule__NameExistingListAttribute__Group__1
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
    // InternalTraceryPlusPlus.g:1923:1: rule__NameExistingListAttribute__Group__0__Impl : ( ( rule__NameExistingListAttribute__NameAssignment_0 ) ) ;
    public final void rule__NameExistingListAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1927:1: ( ( ( rule__NameExistingListAttribute__NameAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:1928:1: ( ( rule__NameExistingListAttribute__NameAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:1928:1: ( ( rule__NameExistingListAttribute__NameAssignment_0 ) )
            // InternalTraceryPlusPlus.g:1929:2: ( rule__NameExistingListAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getNameExistingListAttributeAccess().getNameAssignment_0()); 
            // InternalTraceryPlusPlus.g:1930:2: ( rule__NameExistingListAttribute__NameAssignment_0 )
            // InternalTraceryPlusPlus.g:1930:3: rule__NameExistingListAttribute__NameAssignment_0
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
    // InternalTraceryPlusPlus.g:1938:1: rule__NameExistingListAttribute__Group__1 : rule__NameExistingListAttribute__Group__1__Impl rule__NameExistingListAttribute__Group__2 ;
    public final void rule__NameExistingListAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1942:1: ( rule__NameExistingListAttribute__Group__1__Impl rule__NameExistingListAttribute__Group__2 )
            // InternalTraceryPlusPlus.g:1943:2: rule__NameExistingListAttribute__Group__1__Impl rule__NameExistingListAttribute__Group__2
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
    // InternalTraceryPlusPlus.g:1950:1: rule__NameExistingListAttribute__Group__1__Impl : ( ( rule__NameExistingListAttribute__Alternatives_1 )? ) ;
    public final void rule__NameExistingListAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1954:1: ( ( ( rule__NameExistingListAttribute__Alternatives_1 )? ) )
            // InternalTraceryPlusPlus.g:1955:1: ( ( rule__NameExistingListAttribute__Alternatives_1 )? )
            {
            // InternalTraceryPlusPlus.g:1955:1: ( ( rule__NameExistingListAttribute__Alternatives_1 )? )
            // InternalTraceryPlusPlus.g:1956:2: ( rule__NameExistingListAttribute__Alternatives_1 )?
            {
             before(grammarAccess.getNameExistingListAttributeAccess().getAlternatives_1()); 
            // InternalTraceryPlusPlus.g:1957:2: ( rule__NameExistingListAttribute__Alternatives_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==22||(LA25_0>=27 && LA25_0<=30)||LA25_0==44) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1957:3: rule__NameExistingListAttribute__Alternatives_1
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
    // InternalTraceryPlusPlus.g:1965:1: rule__NameExistingListAttribute__Group__2 : rule__NameExistingListAttribute__Group__2__Impl ;
    public final void rule__NameExistingListAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1969:1: ( rule__NameExistingListAttribute__Group__2__Impl )
            // InternalTraceryPlusPlus.g:1970:2: rule__NameExistingListAttribute__Group__2__Impl
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
    // InternalTraceryPlusPlus.g:1976:1: rule__NameExistingListAttribute__Group__2__Impl : ( ( rule__NameExistingListAttribute__ValueAssignment_2 ) ) ;
    public final void rule__NameExistingListAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1980:1: ( ( ( rule__NameExistingListAttribute__ValueAssignment_2 ) ) )
            // InternalTraceryPlusPlus.g:1981:1: ( ( rule__NameExistingListAttribute__ValueAssignment_2 ) )
            {
            // InternalTraceryPlusPlus.g:1981:1: ( ( rule__NameExistingListAttribute__ValueAssignment_2 ) )
            // InternalTraceryPlusPlus.g:1982:2: ( rule__NameExistingListAttribute__ValueAssignment_2 )
            {
             before(grammarAccess.getNameExistingListAttributeAccess().getValueAssignment_2()); 
            // InternalTraceryPlusPlus.g:1983:2: ( rule__NameExistingListAttribute__ValueAssignment_2 )
            // InternalTraceryPlusPlus.g:1983:3: rule__NameExistingListAttribute__ValueAssignment_2
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
    // InternalTraceryPlusPlus.g:1992:1: rule__NameValueAttribute__Group__0 : rule__NameValueAttribute__Group__0__Impl rule__NameValueAttribute__Group__1 ;
    public final void rule__NameValueAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1996:1: ( rule__NameValueAttribute__Group__0__Impl rule__NameValueAttribute__Group__1 )
            // InternalTraceryPlusPlus.g:1997:2: rule__NameValueAttribute__Group__0__Impl rule__NameValueAttribute__Group__1
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
    // InternalTraceryPlusPlus.g:2004:1: rule__NameValueAttribute__Group__0__Impl : ( ( rule__NameValueAttribute__NameAssignment_0 ) ) ;
    public final void rule__NameValueAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2008:1: ( ( ( rule__NameValueAttribute__NameAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:2009:1: ( ( rule__NameValueAttribute__NameAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:2009:1: ( ( rule__NameValueAttribute__NameAssignment_0 ) )
            // InternalTraceryPlusPlus.g:2010:2: ( rule__NameValueAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getNameValueAttributeAccess().getNameAssignment_0()); 
            // InternalTraceryPlusPlus.g:2011:2: ( rule__NameValueAttribute__NameAssignment_0 )
            // InternalTraceryPlusPlus.g:2011:3: rule__NameValueAttribute__NameAssignment_0
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
    // InternalTraceryPlusPlus.g:2019:1: rule__NameValueAttribute__Group__1 : rule__NameValueAttribute__Group__1__Impl rule__NameValueAttribute__Group__2 ;
    public final void rule__NameValueAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2023:1: ( rule__NameValueAttribute__Group__1__Impl rule__NameValueAttribute__Group__2 )
            // InternalTraceryPlusPlus.g:2024:2: rule__NameValueAttribute__Group__1__Impl rule__NameValueAttribute__Group__2
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
    // InternalTraceryPlusPlus.g:2031:1: rule__NameValueAttribute__Group__1__Impl : ( ( ruleAssignmentOperator )? ) ;
    public final void rule__NameValueAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2035:1: ( ( ( ruleAssignmentOperator )? ) )
            // InternalTraceryPlusPlus.g:2036:1: ( ( ruleAssignmentOperator )? )
            {
            // InternalTraceryPlusPlus.g:2036:1: ( ( ruleAssignmentOperator )? )
            // InternalTraceryPlusPlus.g:2037:2: ( ruleAssignmentOperator )?
            {
             before(grammarAccess.getNameValueAttributeAccess().getAssignmentOperatorParserRuleCall_1()); 
            // InternalTraceryPlusPlus.g:2038:2: ( ruleAssignmentOperator )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=27 && LA26_0<=30)||LA26_0==44) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTraceryPlusPlus.g:2038:3: ruleAssignmentOperator
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
    // InternalTraceryPlusPlus.g:2046:1: rule__NameValueAttribute__Group__2 : rule__NameValueAttribute__Group__2__Impl ;
    public final void rule__NameValueAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2050:1: ( rule__NameValueAttribute__Group__2__Impl )
            // InternalTraceryPlusPlus.g:2051:2: rule__NameValueAttribute__Group__2__Impl
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
    // InternalTraceryPlusPlus.g:2057:1: rule__NameValueAttribute__Group__2__Impl : ( ( rule__NameValueAttribute__ValueAssignment_2 ) ) ;
    public final void rule__NameValueAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2061:1: ( ( ( rule__NameValueAttribute__ValueAssignment_2 ) ) )
            // InternalTraceryPlusPlus.g:2062:1: ( ( rule__NameValueAttribute__ValueAssignment_2 ) )
            {
            // InternalTraceryPlusPlus.g:2062:1: ( ( rule__NameValueAttribute__ValueAssignment_2 ) )
            // InternalTraceryPlusPlus.g:2063:2: ( rule__NameValueAttribute__ValueAssignment_2 )
            {
             before(grammarAccess.getNameValueAttributeAccess().getValueAssignment_2()); 
            // InternalTraceryPlusPlus.g:2064:2: ( rule__NameValueAttribute__ValueAssignment_2 )
            // InternalTraceryPlusPlus.g:2064:3: rule__NameValueAttribute__ValueAssignment_2
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
    // InternalTraceryPlusPlus.g:2073:1: rule__ObjectAttribute__Group__0 : rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1 ;
    public final void rule__ObjectAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2077:1: ( rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1 )
            // InternalTraceryPlusPlus.g:2078:2: rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalTraceryPlusPlus.g:2085:1: rule__ObjectAttribute__Group__0__Impl : ( ( rule__ObjectAttribute__ObjectAssignment_0 ) ) ;
    public final void rule__ObjectAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2089:1: ( ( ( rule__ObjectAttribute__ObjectAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:2090:1: ( ( rule__ObjectAttribute__ObjectAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:2090:1: ( ( rule__ObjectAttribute__ObjectAssignment_0 ) )
            // InternalTraceryPlusPlus.g:2091:2: ( rule__ObjectAttribute__ObjectAssignment_0 )
            {
             before(grammarAccess.getObjectAttributeAccess().getObjectAssignment_0()); 
            // InternalTraceryPlusPlus.g:2092:2: ( rule__ObjectAttribute__ObjectAssignment_0 )
            // InternalTraceryPlusPlus.g:2092:3: rule__ObjectAttribute__ObjectAssignment_0
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
    // InternalTraceryPlusPlus.g:2100:1: rule__ObjectAttribute__Group__1 : rule__ObjectAttribute__Group__1__Impl rule__ObjectAttribute__Group__2 ;
    public final void rule__ObjectAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2104:1: ( rule__ObjectAttribute__Group__1__Impl rule__ObjectAttribute__Group__2 )
            // InternalTraceryPlusPlus.g:2105:2: rule__ObjectAttribute__Group__1__Impl rule__ObjectAttribute__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalTraceryPlusPlus.g:2112:1: rule__ObjectAttribute__Group__1__Impl : ( '.' ) ;
    public final void rule__ObjectAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2116:1: ( ( '.' ) )
            // InternalTraceryPlusPlus.g:2117:1: ( '.' )
            {
            // InternalTraceryPlusPlus.g:2117:1: ( '.' )
            // InternalTraceryPlusPlus.g:2118:2: '.'
            {
             before(grammarAccess.getObjectAttributeAccess().getFullStopKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:2127:1: rule__ObjectAttribute__Group__2 : rule__ObjectAttribute__Group__2__Impl rule__ObjectAttribute__Group__3 ;
    public final void rule__ObjectAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2131:1: ( rule__ObjectAttribute__Group__2__Impl rule__ObjectAttribute__Group__3 )
            // InternalTraceryPlusPlus.g:2132:2: rule__ObjectAttribute__Group__2__Impl rule__ObjectAttribute__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalTraceryPlusPlus.g:2139:1: rule__ObjectAttribute__Group__2__Impl : ( ( rule__ObjectAttribute__Alternatives_2 ) ) ;
    public final void rule__ObjectAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2143:1: ( ( ( rule__ObjectAttribute__Alternatives_2 ) ) )
            // InternalTraceryPlusPlus.g:2144:1: ( ( rule__ObjectAttribute__Alternatives_2 ) )
            {
            // InternalTraceryPlusPlus.g:2144:1: ( ( rule__ObjectAttribute__Alternatives_2 ) )
            // InternalTraceryPlusPlus.g:2145:2: ( rule__ObjectAttribute__Alternatives_2 )
            {
             before(grammarAccess.getObjectAttributeAccess().getAlternatives_2()); 
            // InternalTraceryPlusPlus.g:2146:2: ( rule__ObjectAttribute__Alternatives_2 )
            // InternalTraceryPlusPlus.g:2146:3: rule__ObjectAttribute__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__ObjectAttribute__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getObjectAttributeAccess().getAlternatives_2()); 

            }


            }

        }
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
    // InternalTraceryPlusPlus.g:2154:1: rule__ObjectAttribute__Group__3 : rule__ObjectAttribute__Group__3__Impl ;
    public final void rule__ObjectAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2158:1: ( rule__ObjectAttribute__Group__3__Impl )
            // InternalTraceryPlusPlus.g:2159:2: rule__ObjectAttribute__Group__3__Impl
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
    // InternalTraceryPlusPlus.g:2165:1: rule__ObjectAttribute__Group__3__Impl : ( ( rule__ObjectAttribute__ModifiersAssignment_3 )* ) ;
    public final void rule__ObjectAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2169:1: ( ( ( rule__ObjectAttribute__ModifiersAssignment_3 )* ) )
            // InternalTraceryPlusPlus.g:2170:1: ( ( rule__ObjectAttribute__ModifiersAssignment_3 )* )
            {
            // InternalTraceryPlusPlus.g:2170:1: ( ( rule__ObjectAttribute__ModifiersAssignment_3 )* )
            // InternalTraceryPlusPlus.g:2171:2: ( rule__ObjectAttribute__ModifiersAssignment_3 )*
            {
             before(grammarAccess.getObjectAttributeAccess().getModifiersAssignment_3()); 
            // InternalTraceryPlusPlus.g:2172:2: ( rule__ObjectAttribute__ModifiersAssignment_3 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=11 && LA27_0<=15)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:2172:3: rule__ObjectAttribute__ModifiersAssignment_3
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ObjectAttribute__ModifiersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalTraceryPlusPlus.g:2181:1: rule__WordList__Group__0 : rule__WordList__Group__0__Impl rule__WordList__Group__1 ;
    public final void rule__WordList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2185:1: ( rule__WordList__Group__0__Impl rule__WordList__Group__1 )
            // InternalTraceryPlusPlus.g:2186:2: rule__WordList__Group__0__Impl rule__WordList__Group__1
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
    // InternalTraceryPlusPlus.g:2193:1: rule__WordList__Group__0__Impl : ( ( rule__WordList__WordsAssignment_0 ) ) ;
    public final void rule__WordList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2197:1: ( ( ( rule__WordList__WordsAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:2198:1: ( ( rule__WordList__WordsAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:2198:1: ( ( rule__WordList__WordsAssignment_0 ) )
            // InternalTraceryPlusPlus.g:2199:2: ( rule__WordList__WordsAssignment_0 )
            {
             before(grammarAccess.getWordListAccess().getWordsAssignment_0()); 
            // InternalTraceryPlusPlus.g:2200:2: ( rule__WordList__WordsAssignment_0 )
            // InternalTraceryPlusPlus.g:2200:3: rule__WordList__WordsAssignment_0
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
    // InternalTraceryPlusPlus.g:2208:1: rule__WordList__Group__1 : rule__WordList__Group__1__Impl ;
    public final void rule__WordList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2212:1: ( rule__WordList__Group__1__Impl )
            // InternalTraceryPlusPlus.g:2213:2: rule__WordList__Group__1__Impl
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
    // InternalTraceryPlusPlus.g:2219:1: rule__WordList__Group__1__Impl : ( ( rule__WordList__Group_1__0 )* ) ;
    public final void rule__WordList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2223:1: ( ( ( rule__WordList__Group_1__0 )* ) )
            // InternalTraceryPlusPlus.g:2224:1: ( ( rule__WordList__Group_1__0 )* )
            {
            // InternalTraceryPlusPlus.g:2224:1: ( ( rule__WordList__Group_1__0 )* )
            // InternalTraceryPlusPlus.g:2225:2: ( rule__WordList__Group_1__0 )*
            {
             before(grammarAccess.getWordListAccess().getGroup_1()); 
            // InternalTraceryPlusPlus.g:2226:2: ( rule__WordList__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=31 && LA28_0<=33)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:2226:3: rule__WordList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
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
    // InternalTraceryPlusPlus.g:2235:1: rule__WordList__Group_1__0 : rule__WordList__Group_1__0__Impl rule__WordList__Group_1__1 ;
    public final void rule__WordList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2239:1: ( rule__WordList__Group_1__0__Impl rule__WordList__Group_1__1 )
            // InternalTraceryPlusPlus.g:2240:2: rule__WordList__Group_1__0__Impl rule__WordList__Group_1__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalTraceryPlusPlus.g:2247:1: rule__WordList__Group_1__0__Impl : ( ruleSeparatorOr ) ;
    public final void rule__WordList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2251:1: ( ( ruleSeparatorOr ) )
            // InternalTraceryPlusPlus.g:2252:1: ( ruleSeparatorOr )
            {
            // InternalTraceryPlusPlus.g:2252:1: ( ruleSeparatorOr )
            // InternalTraceryPlusPlus.g:2253:2: ruleSeparatorOr
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
    // InternalTraceryPlusPlus.g:2262:1: rule__WordList__Group_1__1 : rule__WordList__Group_1__1__Impl ;
    public final void rule__WordList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2266:1: ( rule__WordList__Group_1__1__Impl )
            // InternalTraceryPlusPlus.g:2267:2: rule__WordList__Group_1__1__Impl
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
    // InternalTraceryPlusPlus.g:2273:1: rule__WordList__Group_1__1__Impl : ( ( rule__WordList__WordsAssignment_1_1 ) ) ;
    public final void rule__WordList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2277:1: ( ( ( rule__WordList__WordsAssignment_1_1 ) ) )
            // InternalTraceryPlusPlus.g:2278:1: ( ( rule__WordList__WordsAssignment_1_1 ) )
            {
            // InternalTraceryPlusPlus.g:2278:1: ( ( rule__WordList__WordsAssignment_1_1 ) )
            // InternalTraceryPlusPlus.g:2279:2: ( rule__WordList__WordsAssignment_1_1 )
            {
             before(grammarAccess.getWordListAccess().getWordsAssignment_1_1()); 
            // InternalTraceryPlusPlus.g:2280:2: ( rule__WordList__WordsAssignment_1_1 )
            // InternalTraceryPlusPlus.g:2280:3: rule__WordList__WordsAssignment_1_1
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
    // InternalTraceryPlusPlus.g:2289:1: rule__AttributeList__Group__0 : rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 ;
    public final void rule__AttributeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2293:1: ( rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 )
            // InternalTraceryPlusPlus.g:2294:2: rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1
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
    // InternalTraceryPlusPlus.g:2301:1: rule__AttributeList__Group__0__Impl : ( ( rule__AttributeList__AttributesAssignment_0 ) ) ;
    public final void rule__AttributeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2305:1: ( ( ( rule__AttributeList__AttributesAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:2306:1: ( ( rule__AttributeList__AttributesAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:2306:1: ( ( rule__AttributeList__AttributesAssignment_0 ) )
            // InternalTraceryPlusPlus.g:2307:2: ( rule__AttributeList__AttributesAssignment_0 )
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAssignment_0()); 
            // InternalTraceryPlusPlus.g:2308:2: ( rule__AttributeList__AttributesAssignment_0 )
            // InternalTraceryPlusPlus.g:2308:3: rule__AttributeList__AttributesAssignment_0
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
    // InternalTraceryPlusPlus.g:2316:1: rule__AttributeList__Group__1 : rule__AttributeList__Group__1__Impl ;
    public final void rule__AttributeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2320:1: ( rule__AttributeList__Group__1__Impl )
            // InternalTraceryPlusPlus.g:2321:2: rule__AttributeList__Group__1__Impl
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
    // InternalTraceryPlusPlus.g:2327:1: rule__AttributeList__Group__1__Impl : ( ( rule__AttributeList__Group_1__0 )* ) ;
    public final void rule__AttributeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2331:1: ( ( ( rule__AttributeList__Group_1__0 )* ) )
            // InternalTraceryPlusPlus.g:2332:1: ( ( rule__AttributeList__Group_1__0 )* )
            {
            // InternalTraceryPlusPlus.g:2332:1: ( ( rule__AttributeList__Group_1__0 )* )
            // InternalTraceryPlusPlus.g:2333:2: ( rule__AttributeList__Group_1__0 )*
            {
             before(grammarAccess.getAttributeListAccess().getGroup_1()); 
            // InternalTraceryPlusPlus.g:2334:2: ( rule__AttributeList__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==31||(LA29_0>=34 && LA29_0<=35)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:2334:3: rule__AttributeList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
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
    // InternalTraceryPlusPlus.g:2343:1: rule__AttributeList__Group_1__0 : rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1 ;
    public final void rule__AttributeList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2347:1: ( rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1 )
            // InternalTraceryPlusPlus.g:2348:2: rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1
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
    // InternalTraceryPlusPlus.g:2355:1: rule__AttributeList__Group_1__0__Impl : ( ruleSeparatorAnd ) ;
    public final void rule__AttributeList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2359:1: ( ( ruleSeparatorAnd ) )
            // InternalTraceryPlusPlus.g:2360:1: ( ruleSeparatorAnd )
            {
            // InternalTraceryPlusPlus.g:2360:1: ( ruleSeparatorAnd )
            // InternalTraceryPlusPlus.g:2361:2: ruleSeparatorAnd
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
    // InternalTraceryPlusPlus.g:2370:1: rule__AttributeList__Group_1__1 : rule__AttributeList__Group_1__1__Impl ;
    public final void rule__AttributeList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2374:1: ( rule__AttributeList__Group_1__1__Impl )
            // InternalTraceryPlusPlus.g:2375:2: rule__AttributeList__Group_1__1__Impl
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
    // InternalTraceryPlusPlus.g:2381:1: rule__AttributeList__Group_1__1__Impl : ( ( rule__AttributeList__AttributesAssignment_1_1 ) ) ;
    public final void rule__AttributeList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2385:1: ( ( ( rule__AttributeList__AttributesAssignment_1_1 ) ) )
            // InternalTraceryPlusPlus.g:2386:1: ( ( rule__AttributeList__AttributesAssignment_1_1 ) )
            {
            // InternalTraceryPlusPlus.g:2386:1: ( ( rule__AttributeList__AttributesAssignment_1_1 ) )
            // InternalTraceryPlusPlus.g:2387:2: ( rule__AttributeList__AttributesAssignment_1_1 )
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAssignment_1_1()); 
            // InternalTraceryPlusPlus.g:2388:2: ( rule__AttributeList__AttributesAssignment_1_1 )
            // InternalTraceryPlusPlus.g:2388:3: rule__AttributeList__AttributesAssignment_1_1
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


    // $ANTLR start "rule__AssignmentOperator__Group_4__0"
    // InternalTraceryPlusPlus.g:2397:1: rule__AssignmentOperator__Group_4__0 : rule__AssignmentOperator__Group_4__0__Impl rule__AssignmentOperator__Group_4__1 ;
    public final void rule__AssignmentOperator__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2401:1: ( rule__AssignmentOperator__Group_4__0__Impl rule__AssignmentOperator__Group_4__1 )
            // InternalTraceryPlusPlus.g:2402:2: rule__AssignmentOperator__Group_4__0__Impl rule__AssignmentOperator__Group_4__1
            {
            pushFollow(FOLLOW_28);
            rule__AssignmentOperator__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssignmentOperator__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentOperator__Group_4__0"


    // $ANTLR start "rule__AssignmentOperator__Group_4__0__Impl"
    // InternalTraceryPlusPlus.g:2409:1: rule__AssignmentOperator__Group_4__0__Impl : ( 'equal' ) ;
    public final void rule__AssignmentOperator__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2413:1: ( ( 'equal' ) )
            // InternalTraceryPlusPlus.g:2414:1: ( 'equal' )
            {
            // InternalTraceryPlusPlus.g:2414:1: ( 'equal' )
            // InternalTraceryPlusPlus.g:2415:2: 'equal'
            {
             before(grammarAccess.getAssignmentOperatorAccess().getEqualKeyword_4_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getAssignmentOperatorAccess().getEqualKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentOperator__Group_4__0__Impl"


    // $ANTLR start "rule__AssignmentOperator__Group_4__1"
    // InternalTraceryPlusPlus.g:2424:1: rule__AssignmentOperator__Group_4__1 : rule__AssignmentOperator__Group_4__1__Impl ;
    public final void rule__AssignmentOperator__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2428:1: ( rule__AssignmentOperator__Group_4__1__Impl )
            // InternalTraceryPlusPlus.g:2429:2: rule__AssignmentOperator__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssignmentOperator__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentOperator__Group_4__1"


    // $ANTLR start "rule__AssignmentOperator__Group_4__1__Impl"
    // InternalTraceryPlusPlus.g:2435:1: rule__AssignmentOperator__Group_4__1__Impl : ( 'to' ) ;
    public final void rule__AssignmentOperator__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2439:1: ( ( 'to' ) )
            // InternalTraceryPlusPlus.g:2440:1: ( 'to' )
            {
            // InternalTraceryPlusPlus.g:2440:1: ( 'to' )
            // InternalTraceryPlusPlus.g:2441:2: 'to'
            {
             before(grammarAccess.getAssignmentOperatorAccess().getToKeyword_4_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getAssignmentOperatorAccess().getToKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentOperator__Group_4__1__Impl"


    // $ANTLR start "rule__TraceryPlusPlusProgram__StatementsAssignment_0"
    // InternalTraceryPlusPlus.g:2451:1: rule__TraceryPlusPlusProgram__StatementsAssignment_0 : ( ruleStatement ) ;
    public final void rule__TraceryPlusPlusProgram__StatementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2455:1: ( ( ruleStatement ) )
            // InternalTraceryPlusPlus.g:2456:2: ( ruleStatement )
            {
            // InternalTraceryPlusPlus.g:2456:2: ( ruleStatement )
            // InternalTraceryPlusPlus.g:2457:3: ruleStatement
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
    // InternalTraceryPlusPlus.g:2466:1: rule__TraceryPlusPlusProgram__StoryAssignment_1 : ( ruleStory ) ;
    public final void rule__TraceryPlusPlusProgram__StoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2470:1: ( ( ruleStory ) )
            // InternalTraceryPlusPlus.g:2471:2: ( ruleStory )
            {
            // InternalTraceryPlusPlus.g:2471:2: ( ruleStory )
            // InternalTraceryPlusPlus.g:2472:3: ruleStory
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
    // InternalTraceryPlusPlus.g:2481:1: rule__Story__StoryAssignment_4 : ( ( rule__Story__StoryAlternatives_4_0 ) ) ;
    public final void rule__Story__StoryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2485:1: ( ( ( rule__Story__StoryAlternatives_4_0 ) ) )
            // InternalTraceryPlusPlus.g:2486:2: ( ( rule__Story__StoryAlternatives_4_0 ) )
            {
            // InternalTraceryPlusPlus.g:2486:2: ( ( rule__Story__StoryAlternatives_4_0 ) )
            // InternalTraceryPlusPlus.g:2487:3: ( rule__Story__StoryAlternatives_4_0 )
            {
             before(grammarAccess.getStoryAccess().getStoryAlternatives_4_0()); 
            // InternalTraceryPlusPlus.g:2488:3: ( rule__Story__StoryAlternatives_4_0 )
            // InternalTraceryPlusPlus.g:2488:4: rule__Story__StoryAlternatives_4_0
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
    // InternalTraceryPlusPlus.g:2496:1: rule__ListDeclaration__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ListDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2500:1: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2501:2: ( RULE_ID )
            {
            // InternalTraceryPlusPlus.g:2501:2: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2502:3: RULE_ID
            {
             before(grammarAccess.getListDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getListDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
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
    // InternalTraceryPlusPlus.g:2511:1: rule__ListDeclaration__ListAssignment_3 : ( ruleWordList ) ;
    public final void rule__ListDeclaration__ListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2515:1: ( ( ruleWordList ) )
            // InternalTraceryPlusPlus.g:2516:2: ( ruleWordList )
            {
            // InternalTraceryPlusPlus.g:2516:2: ( ruleWordList )
            // InternalTraceryPlusPlus.g:2517:3: ruleWordList
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
    // InternalTraceryPlusPlus.g:2526:1: rule__ObjectDeclaration__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ObjectDeclaration__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2530:1: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2531:2: ( RULE_ID )
            {
            // InternalTraceryPlusPlus.g:2531:2: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2532:3: RULE_ID
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
    // InternalTraceryPlusPlus.g:2541:1: rule__ObjectDeclaration__PronounsAssignment_4 : ( rulePronouns ) ;
    public final void rule__ObjectDeclaration__PronounsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2545:1: ( ( rulePronouns ) )
            // InternalTraceryPlusPlus.g:2546:2: ( rulePronouns )
            {
            // InternalTraceryPlusPlus.g:2546:2: ( rulePronouns )
            // InternalTraceryPlusPlus.g:2547:3: rulePronouns
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
    // InternalTraceryPlusPlus.g:2556:1: rule__ObjectDeclaration__AttributesAssignment_8 : ( ruleAttributeList ) ;
    public final void rule__ObjectDeclaration__AttributesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2560:1: ( ( ruleAttributeList ) )
            // InternalTraceryPlusPlus.g:2561:2: ( ruleAttributeList )
            {
            // InternalTraceryPlusPlus.g:2561:2: ( ruleAttributeList )
            // InternalTraceryPlusPlus.g:2562:3: ruleAttributeList
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


    // $ANTLR start "rule__Word__NameAssignment"
    // InternalTraceryPlusPlus.g:2571:1: rule__Word__NameAssignment : ( RULE_STRING ) ;
    public final void rule__Word__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2575:1: ( ( RULE_STRING ) )
            // InternalTraceryPlusPlus.g:2576:2: ( RULE_STRING )
            {
            // InternalTraceryPlusPlus.g:2576:2: ( RULE_STRING )
            // InternalTraceryPlusPlus.g:2577:3: RULE_STRING
            {
             before(grammarAccess.getWordAccess().getNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getWordAccess().getNameSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Word__NameAssignment"


    // $ANTLR start "rule__ListVariable__VariableAssignment_0"
    // InternalTraceryPlusPlus.g:2586:1: rule__ListVariable__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ListVariable__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2590:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:2591:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:2591:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2592:3: ( RULE_ID )
            {
             before(grammarAccess.getListVariableAccess().getVariableListDeclarationCrossReference_0_0()); 
            // InternalTraceryPlusPlus.g:2593:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2594:4: RULE_ID
            {
             before(grammarAccess.getListVariableAccess().getVariableListDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getListVariableAccess().getVariableListDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getListVariableAccess().getVariableListDeclarationCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListVariable__VariableAssignment_0"


    // $ANTLR start "rule__ListVariable__ModifiersAssignment_1"
    // InternalTraceryPlusPlus.g:2605:1: rule__ListVariable__ModifiersAssignment_1 : ( ruleModifier ) ;
    public final void rule__ListVariable__ModifiersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2609:1: ( ( ruleModifier ) )
            // InternalTraceryPlusPlus.g:2610:2: ( ruleModifier )
            {
            // InternalTraceryPlusPlus.g:2610:2: ( ruleModifier )
            // InternalTraceryPlusPlus.g:2611:3: ruleModifier
            {
             before(grammarAccess.getListVariableAccess().getModifiersModifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModifier();

            state._fsp--;

             after(grammarAccess.getListVariableAccess().getModifiersModifierParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListVariable__ModifiersAssignment_1"


    // $ANTLR start "rule__JustNameAttribute__NameAssignment"
    // InternalTraceryPlusPlus.g:2620:1: rule__JustNameAttribute__NameAssignment : ( RULE_ID ) ;
    public final void rule__JustNameAttribute__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2624:1: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2625:2: ( RULE_ID )
            {
            // InternalTraceryPlusPlus.g:2625:2: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2626:3: RULE_ID
            {
             before(grammarAccess.getJustNameAttributeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJustNameAttributeAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalTraceryPlusPlus.g:2635:1: rule__NameExistingListAttribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NameExistingListAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2639:1: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2640:2: ( RULE_ID )
            {
            // InternalTraceryPlusPlus.g:2640:2: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2641:3: RULE_ID
            {
             before(grammarAccess.getNameExistingListAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNameExistingListAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
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
    // InternalTraceryPlusPlus.g:2650:1: rule__NameExistingListAttribute__ValueAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__NameExistingListAttribute__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2654:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:2655:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:2655:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2656:3: ( RULE_ID )
            {
             before(grammarAccess.getNameExistingListAttributeAccess().getValueListDeclarationCrossReference_2_0()); 
            // InternalTraceryPlusPlus.g:2657:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2658:4: RULE_ID
            {
             before(grammarAccess.getNameExistingListAttributeAccess().getValueListDeclarationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNameExistingListAttributeAccess().getValueListDeclarationIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getNameExistingListAttributeAccess().getValueListDeclarationCrossReference_2_0()); 

            }


            }

        }
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
    // InternalTraceryPlusPlus.g:2669:1: rule__NameValueAttribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NameValueAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2673:1: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2674:2: ( RULE_ID )
            {
            // InternalTraceryPlusPlus.g:2674:2: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2675:3: RULE_ID
            {
             before(grammarAccess.getNameValueAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNameValueAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
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
    // InternalTraceryPlusPlus.g:2684:1: rule__NameValueAttribute__ValueAssignment_2 : ( ruleWord ) ;
    public final void rule__NameValueAttribute__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2688:1: ( ( ruleWord ) )
            // InternalTraceryPlusPlus.g:2689:2: ( ruleWord )
            {
            // InternalTraceryPlusPlus.g:2689:2: ( ruleWord )
            // InternalTraceryPlusPlus.g:2690:3: ruleWord
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


    // $ANTLR start "rule__ObjectAttribute__ObjectAssignment_0"
    // InternalTraceryPlusPlus.g:2699:1: rule__ObjectAttribute__ObjectAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectAttribute__ObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2703:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:2704:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:2704:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2705:3: ( RULE_ID )
            {
             before(grammarAccess.getObjectAttributeAccess().getObjectObjectDeclarationCrossReference_0_0()); 
            // InternalTraceryPlusPlus.g:2706:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2707:4: RULE_ID
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


    // $ANTLR start "rule__ObjectAttribute__AttributeAssignment_2_0"
    // InternalTraceryPlusPlus.g:2718:1: rule__ObjectAttribute__AttributeAssignment_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectAttribute__AttributeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2722:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:2723:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:2723:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2724:3: ( RULE_ID )
            {
             before(grammarAccess.getObjectAttributeAccess().getAttributeAttributeCrossReference_2_0_0()); 
            // InternalTraceryPlusPlus.g:2725:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2726:4: RULE_ID
            {
             before(grammarAccess.getObjectAttributeAccess().getAttributeAttributeIDTerminalRuleCall_2_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectAttributeAccess().getAttributeAttributeIDTerminalRuleCall_2_0_0_1()); 

            }

             after(grammarAccess.getObjectAttributeAccess().getAttributeAttributeCrossReference_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectAttribute__AttributeAssignment_2_0"


    // $ANTLR start "rule__ObjectAttribute__PronounAssignment_2_1"
    // InternalTraceryPlusPlus.g:2737:1: rule__ObjectAttribute__PronounAssignment_2_1 : ( rulePronounIdentifier ) ;
    public final void rule__ObjectAttribute__PronounAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2741:1: ( ( rulePronounIdentifier ) )
            // InternalTraceryPlusPlus.g:2742:2: ( rulePronounIdentifier )
            {
            // InternalTraceryPlusPlus.g:2742:2: ( rulePronounIdentifier )
            // InternalTraceryPlusPlus.g:2743:3: rulePronounIdentifier
            {
             before(grammarAccess.getObjectAttributeAccess().getPronounPronounIdentifierParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePronounIdentifier();

            state._fsp--;

             after(grammarAccess.getObjectAttributeAccess().getPronounPronounIdentifierParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectAttribute__PronounAssignment_2_1"


    // $ANTLR start "rule__ObjectAttribute__ModifiersAssignment_3"
    // InternalTraceryPlusPlus.g:2752:1: rule__ObjectAttribute__ModifiersAssignment_3 : ( ruleModifier ) ;
    public final void rule__ObjectAttribute__ModifiersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2756:1: ( ( ruleModifier ) )
            // InternalTraceryPlusPlus.g:2757:2: ( ruleModifier )
            {
            // InternalTraceryPlusPlus.g:2757:2: ( ruleModifier )
            // InternalTraceryPlusPlus.g:2758:3: ruleModifier
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
            match(input,46,FOLLOW_2); 
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
            match(input,47,FOLLOW_2); 
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
            match(input,48,FOLLOW_2); 
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
            match(input,49,FOLLOW_2); 
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


    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\1\12\6\uffff\1\7\3\uffff";
    static final String dfa_3s = "\6\4\1\55\1\uffff\1\4\2\uffff\1\4";
    static final String dfa_4s = "\1\4\1\54\4\5\1\55\1\uffff\1\51\2\uffff\1\5";
    static final String dfa_5s = "\7\uffff\1\2\1\uffff\1\3\1\1\1\uffff";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\10\1\11\20\uffff\1\7\4\uffff\1\2\1\3\1\4\1\5\1\12\2\uffff\3\12\4\uffff\1\12\2\uffff\1\6",
            "\1\7\1\11",
            "\1\7\1\11",
            "\1\7\1\11",
            "\1\7\1\11",
            "\1\13",
            "",
            "\1\7\13\uffff\2\12\15\uffff\1\7\2\uffff\3\7\1\uffff\1\12\2\uffff\1\7",
            "",
            "",
            "\1\7\1\11"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "861:1: rule__Attribute__Alternatives : ( ( ruleJustNameAttribute ) | ( ruleNameExistingListAttribute ) | ( ruleNameValueAttribute ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000020000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000100078000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000004000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000100078000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0003C00000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000140078000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000000F802L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000100078400010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000007800010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000380000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000C80000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000C80000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000200000000000L});

}