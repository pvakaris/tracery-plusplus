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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.capitalize'", "'.CAPITALIZE'", "'.s'", "'.a'", "'.ed'", "'has'", "'have'", "'is'", "'are'", "'a'", "'an'", "'from'", "'substory'", "'sub'", "'they'", "'them'", "'their'", "'theirs'", "'='", "':'", "'-'", "'-->'", "','", "'or'", "'||'", "'and'", "'&&'", "'The'", "'story'", "'can'", "'values'", "'be'", "'There'", "'attributes'", "'define'", "'end-substory'", "'use'", "'.'", "'equal'", "'to'", "'He'", "'She'", "'It'", "'They'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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


    // $ANTLR start "entryRuleVariableUse"
    // InternalTraceryPlusPlus.g:128:1: entryRuleVariableUse : ruleVariableUse EOF ;
    public final void entryRuleVariableUse() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:129:1: ( ruleVariableUse EOF )
            // InternalTraceryPlusPlus.g:130:1: ruleVariableUse EOF
            {
             before(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableUse();

            state._fsp--;

             after(grammarAccess.getVariableUseRule()); 
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
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalTraceryPlusPlus.g:137:1: ruleVariableUse : ( ( rule__VariableUse__Alternatives ) ) ;
    public final void ruleVariableUse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:141:2: ( ( ( rule__VariableUse__Alternatives ) ) )
            // InternalTraceryPlusPlus.g:142:2: ( ( rule__VariableUse__Alternatives ) )
            {
            // InternalTraceryPlusPlus.g:142:2: ( ( rule__VariableUse__Alternatives ) )
            // InternalTraceryPlusPlus.g:143:3: ( rule__VariableUse__Alternatives )
            {
             before(grammarAccess.getVariableUseAccess().getAlternatives()); 
            // InternalTraceryPlusPlus.g:144:3: ( rule__VariableUse__Alternatives )
            // InternalTraceryPlusPlus.g:144:4: rule__VariableUse__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VariableUse__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariableUseAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableUse"


    // $ANTLR start "entryRuleStory"
    // InternalTraceryPlusPlus.g:153:1: entryRuleStory : ruleStory EOF ;
    public final void entryRuleStory() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:154:1: ( ruleStory EOF )
            // InternalTraceryPlusPlus.g:155:1: ruleStory EOF
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
    // InternalTraceryPlusPlus.g:162:1: ruleStory : ( ( rule__Story__Group__0 ) ) ;
    public final void ruleStory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:166:2: ( ( ( rule__Story__Group__0 ) ) )
            // InternalTraceryPlusPlus.g:167:2: ( ( rule__Story__Group__0 ) )
            {
            // InternalTraceryPlusPlus.g:167:2: ( ( rule__Story__Group__0 ) )
            // InternalTraceryPlusPlus.g:168:3: ( rule__Story__Group__0 )
            {
             before(grammarAccess.getStoryAccess().getGroup()); 
            // InternalTraceryPlusPlus.g:169:3: ( rule__Story__Group__0 )
            // InternalTraceryPlusPlus.g:169:4: rule__Story__Group__0
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
    // InternalTraceryPlusPlus.g:178:1: entryRuleListDeclaration : ruleListDeclaration EOF ;
    public final void entryRuleListDeclaration() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:179:1: ( ruleListDeclaration EOF )
            // InternalTraceryPlusPlus.g:180:1: ruleListDeclaration EOF
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
    // InternalTraceryPlusPlus.g:187:1: ruleListDeclaration : ( ( rule__ListDeclaration__Group__0 ) ) ;
    public final void ruleListDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:191:2: ( ( ( rule__ListDeclaration__Group__0 ) ) )
            // InternalTraceryPlusPlus.g:192:2: ( ( rule__ListDeclaration__Group__0 ) )
            {
            // InternalTraceryPlusPlus.g:192:2: ( ( rule__ListDeclaration__Group__0 ) )
            // InternalTraceryPlusPlus.g:193:3: ( rule__ListDeclaration__Group__0 )
            {
             before(grammarAccess.getListDeclarationAccess().getGroup()); 
            // InternalTraceryPlusPlus.g:194:3: ( rule__ListDeclaration__Group__0 )
            // InternalTraceryPlusPlus.g:194:4: rule__ListDeclaration__Group__0
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
    // InternalTraceryPlusPlus.g:203:1: entryRuleObjectDeclaration : ruleObjectDeclaration EOF ;
    public final void entryRuleObjectDeclaration() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:204:1: ( ruleObjectDeclaration EOF )
            // InternalTraceryPlusPlus.g:205:1: ruleObjectDeclaration EOF
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
    // InternalTraceryPlusPlus.g:212:1: ruleObjectDeclaration : ( ( rule__ObjectDeclaration__Group__0 ) ) ;
    public final void ruleObjectDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:216:2: ( ( ( rule__ObjectDeclaration__Group__0 ) ) )
            // InternalTraceryPlusPlus.g:217:2: ( ( rule__ObjectDeclaration__Group__0 ) )
            {
            // InternalTraceryPlusPlus.g:217:2: ( ( rule__ObjectDeclaration__Group__0 ) )
            // InternalTraceryPlusPlus.g:218:3: ( rule__ObjectDeclaration__Group__0 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getGroup()); 
            // InternalTraceryPlusPlus.g:219:3: ( rule__ObjectDeclaration__Group__0 )
            // InternalTraceryPlusPlus.g:219:4: rule__ObjectDeclaration__Group__0
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


    // $ANTLR start "entryRuleSubstoryDeclaration"
    // InternalTraceryPlusPlus.g:228:1: entryRuleSubstoryDeclaration : ruleSubstoryDeclaration EOF ;
    public final void entryRuleSubstoryDeclaration() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:229:1: ( ruleSubstoryDeclaration EOF )
            // InternalTraceryPlusPlus.g:230:1: ruleSubstoryDeclaration EOF
            {
             before(grammarAccess.getSubstoryDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleSubstoryDeclaration();

            state._fsp--;

             after(grammarAccess.getSubstoryDeclarationRule()); 
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
    // $ANTLR end "entryRuleSubstoryDeclaration"


    // $ANTLR start "ruleSubstoryDeclaration"
    // InternalTraceryPlusPlus.g:237:1: ruleSubstoryDeclaration : ( ( rule__SubstoryDeclaration__Group__0 ) ) ;
    public final void ruleSubstoryDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:241:2: ( ( ( rule__SubstoryDeclaration__Group__0 ) ) )
            // InternalTraceryPlusPlus.g:242:2: ( ( rule__SubstoryDeclaration__Group__0 ) )
            {
            // InternalTraceryPlusPlus.g:242:2: ( ( rule__SubstoryDeclaration__Group__0 ) )
            // InternalTraceryPlusPlus.g:243:3: ( rule__SubstoryDeclaration__Group__0 )
            {
             before(grammarAccess.getSubstoryDeclarationAccess().getGroup()); 
            // InternalTraceryPlusPlus.g:244:3: ( rule__SubstoryDeclaration__Group__0 )
            // InternalTraceryPlusPlus.g:244:4: rule__SubstoryDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubstoryDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubstoryDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubstoryDeclaration"


    // $ANTLR start "entryRuleWord"
    // InternalTraceryPlusPlus.g:253:1: entryRuleWord : ruleWord EOF ;
    public final void entryRuleWord() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:254:1: ( ruleWord EOF )
            // InternalTraceryPlusPlus.g:255:1: ruleWord EOF
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
    // InternalTraceryPlusPlus.g:262:1: ruleWord : ( ( rule__Word__ValueAssignment ) ) ;
    public final void ruleWord() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:266:2: ( ( ( rule__Word__ValueAssignment ) ) )
            // InternalTraceryPlusPlus.g:267:2: ( ( rule__Word__ValueAssignment ) )
            {
            // InternalTraceryPlusPlus.g:267:2: ( ( rule__Word__ValueAssignment ) )
            // InternalTraceryPlusPlus.g:268:3: ( rule__Word__ValueAssignment )
            {
             before(grammarAccess.getWordAccess().getValueAssignment()); 
            // InternalTraceryPlusPlus.g:269:3: ( rule__Word__ValueAssignment )
            // InternalTraceryPlusPlus.g:269:4: rule__Word__ValueAssignment
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


    // $ANTLR start "entryRuleListUse"
    // InternalTraceryPlusPlus.g:353:1: entryRuleListUse : ruleListUse EOF ;
    public final void entryRuleListUse() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:354:1: ( ruleListUse EOF )
            // InternalTraceryPlusPlus.g:355:1: ruleListUse EOF
            {
             before(grammarAccess.getListUseRule()); 
            pushFollow(FOLLOW_1);
            ruleListUse();

            state._fsp--;

             after(grammarAccess.getListUseRule()); 
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
    // $ANTLR end "entryRuleListUse"


    // $ANTLR start "ruleListUse"
    // InternalTraceryPlusPlus.g:362:1: ruleListUse : ( ( rule__ListUse__Group__0 ) ) ;
    public final void ruleListUse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:366:2: ( ( ( rule__ListUse__Group__0 ) ) )
            // InternalTraceryPlusPlus.g:367:2: ( ( rule__ListUse__Group__0 ) )
            {
            // InternalTraceryPlusPlus.g:367:2: ( ( rule__ListUse__Group__0 ) )
            // InternalTraceryPlusPlus.g:368:3: ( rule__ListUse__Group__0 )
            {
             before(grammarAccess.getListUseAccess().getGroup()); 
            // InternalTraceryPlusPlus.g:369:3: ( rule__ListUse__Group__0 )
            // InternalTraceryPlusPlus.g:369:4: rule__ListUse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListUse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListUseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListUse"


    // $ANTLR start "entryRuleSubstoryUse"
    // InternalTraceryPlusPlus.g:378:1: entryRuleSubstoryUse : ruleSubstoryUse EOF ;
    public final void entryRuleSubstoryUse() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:379:1: ( ruleSubstoryUse EOF )
            // InternalTraceryPlusPlus.g:380:1: ruleSubstoryUse EOF
            {
             before(grammarAccess.getSubstoryUseRule()); 
            pushFollow(FOLLOW_1);
            ruleSubstoryUse();

            state._fsp--;

             after(grammarAccess.getSubstoryUseRule()); 
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
    // $ANTLR end "entryRuleSubstoryUse"


    // $ANTLR start "ruleSubstoryUse"
    // InternalTraceryPlusPlus.g:387:1: ruleSubstoryUse : ( ( rule__SubstoryUse__Group__0 ) ) ;
    public final void ruleSubstoryUse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:391:2: ( ( ( rule__SubstoryUse__Group__0 ) ) )
            // InternalTraceryPlusPlus.g:392:2: ( ( rule__SubstoryUse__Group__0 ) )
            {
            // InternalTraceryPlusPlus.g:392:2: ( ( rule__SubstoryUse__Group__0 ) )
            // InternalTraceryPlusPlus.g:393:3: ( rule__SubstoryUse__Group__0 )
            {
             before(grammarAccess.getSubstoryUseAccess().getGroup()); 
            // InternalTraceryPlusPlus.g:394:3: ( rule__SubstoryUse__Group__0 )
            // InternalTraceryPlusPlus.g:394:4: rule__SubstoryUse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubstoryUse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubstoryUseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubstoryUse"


    // $ANTLR start "entryRuleObjectUse"
    // InternalTraceryPlusPlus.g:403:1: entryRuleObjectUse : ruleObjectUse EOF ;
    public final void entryRuleObjectUse() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:404:1: ( ruleObjectUse EOF )
            // InternalTraceryPlusPlus.g:405:1: ruleObjectUse EOF
            {
             before(grammarAccess.getObjectUseRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectUse();

            state._fsp--;

             after(grammarAccess.getObjectUseRule()); 
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
    // $ANTLR end "entryRuleObjectUse"


    // $ANTLR start "ruleObjectUse"
    // InternalTraceryPlusPlus.g:412:1: ruleObjectUse : ( ( rule__ObjectUse__Alternatives ) ) ;
    public final void ruleObjectUse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:416:2: ( ( ( rule__ObjectUse__Alternatives ) ) )
            // InternalTraceryPlusPlus.g:417:2: ( ( rule__ObjectUse__Alternatives ) )
            {
            // InternalTraceryPlusPlus.g:417:2: ( ( rule__ObjectUse__Alternatives ) )
            // InternalTraceryPlusPlus.g:418:3: ( rule__ObjectUse__Alternatives )
            {
             before(grammarAccess.getObjectUseAccess().getAlternatives()); 
            // InternalTraceryPlusPlus.g:419:3: ( rule__ObjectUse__Alternatives )
            // InternalTraceryPlusPlus.g:419:4: rule__ObjectUse__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ObjectUse__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getObjectUseAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjectUse"


    // $ANTLR start "entryRuleObjectAttribute"
    // InternalTraceryPlusPlus.g:428:1: entryRuleObjectAttribute : ruleObjectAttribute EOF ;
    public final void entryRuleObjectAttribute() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:429:1: ( ruleObjectAttribute EOF )
            // InternalTraceryPlusPlus.g:430:1: ruleObjectAttribute EOF
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
    // InternalTraceryPlusPlus.g:437:1: ruleObjectAttribute : ( ( rule__ObjectAttribute__Group__0 ) ) ;
    public final void ruleObjectAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:441:2: ( ( ( rule__ObjectAttribute__Group__0 ) ) )
            // InternalTraceryPlusPlus.g:442:2: ( ( rule__ObjectAttribute__Group__0 ) )
            {
            // InternalTraceryPlusPlus.g:442:2: ( ( rule__ObjectAttribute__Group__0 ) )
            // InternalTraceryPlusPlus.g:443:3: ( rule__ObjectAttribute__Group__0 )
            {
             before(grammarAccess.getObjectAttributeAccess().getGroup()); 
            // InternalTraceryPlusPlus.g:444:3: ( rule__ObjectAttribute__Group__0 )
            // InternalTraceryPlusPlus.g:444:4: rule__ObjectAttribute__Group__0
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


    // $ANTLR start "entryRuleObjectPronoun"
    // InternalTraceryPlusPlus.g:453:1: entryRuleObjectPronoun : ruleObjectPronoun EOF ;
    public final void entryRuleObjectPronoun() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:454:1: ( ruleObjectPronoun EOF )
            // InternalTraceryPlusPlus.g:455:1: ruleObjectPronoun EOF
            {
             before(grammarAccess.getObjectPronounRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectPronoun();

            state._fsp--;

             after(grammarAccess.getObjectPronounRule()); 
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
    // $ANTLR end "entryRuleObjectPronoun"


    // $ANTLR start "ruleObjectPronoun"
    // InternalTraceryPlusPlus.g:462:1: ruleObjectPronoun : ( ( rule__ObjectPronoun__Group__0 ) ) ;
    public final void ruleObjectPronoun() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:466:2: ( ( ( rule__ObjectPronoun__Group__0 ) ) )
            // InternalTraceryPlusPlus.g:467:2: ( ( rule__ObjectPronoun__Group__0 ) )
            {
            // InternalTraceryPlusPlus.g:467:2: ( ( rule__ObjectPronoun__Group__0 ) )
            // InternalTraceryPlusPlus.g:468:3: ( rule__ObjectPronoun__Group__0 )
            {
             before(grammarAccess.getObjectPronounAccess().getGroup()); 
            // InternalTraceryPlusPlus.g:469:3: ( rule__ObjectPronoun__Group__0 )
            // InternalTraceryPlusPlus.g:469:4: rule__ObjectPronoun__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectPronoun__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectPronounAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjectPronoun"


    // $ANTLR start "entryRuleWordList"
    // InternalTraceryPlusPlus.g:478:1: entryRuleWordList : ruleWordList EOF ;
    public final void entryRuleWordList() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:479:1: ( ruleWordList EOF )
            // InternalTraceryPlusPlus.g:480:1: ruleWordList EOF
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
    // InternalTraceryPlusPlus.g:487:1: ruleWordList : ( ( rule__WordList__Group__0 ) ) ;
    public final void ruleWordList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:491:2: ( ( ( rule__WordList__Group__0 ) ) )
            // InternalTraceryPlusPlus.g:492:2: ( ( rule__WordList__Group__0 ) )
            {
            // InternalTraceryPlusPlus.g:492:2: ( ( rule__WordList__Group__0 ) )
            // InternalTraceryPlusPlus.g:493:3: ( rule__WordList__Group__0 )
            {
             before(grammarAccess.getWordListAccess().getGroup()); 
            // InternalTraceryPlusPlus.g:494:3: ( rule__WordList__Group__0 )
            // InternalTraceryPlusPlus.g:494:4: rule__WordList__Group__0
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
    // InternalTraceryPlusPlus.g:503:1: entryRuleAttributeList : ruleAttributeList EOF ;
    public final void entryRuleAttributeList() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:504:1: ( ruleAttributeList EOF )
            // InternalTraceryPlusPlus.g:505:1: ruleAttributeList EOF
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
    // InternalTraceryPlusPlus.g:512:1: ruleAttributeList : ( ( rule__AttributeList__Group__0 ) ) ;
    public final void ruleAttributeList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:516:2: ( ( ( rule__AttributeList__Group__0 ) ) )
            // InternalTraceryPlusPlus.g:517:2: ( ( rule__AttributeList__Group__0 ) )
            {
            // InternalTraceryPlusPlus.g:517:2: ( ( rule__AttributeList__Group__0 ) )
            // InternalTraceryPlusPlus.g:518:3: ( rule__AttributeList__Group__0 )
            {
             before(grammarAccess.getAttributeListAccess().getGroup()); 
            // InternalTraceryPlusPlus.g:519:3: ( rule__AttributeList__Group__0 )
            // InternalTraceryPlusPlus.g:519:4: rule__AttributeList__Group__0
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
    // InternalTraceryPlusPlus.g:528:1: entryRulePronouns : rulePronouns EOF ;
    public final void entryRulePronouns() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:529:1: ( rulePronouns EOF )
            // InternalTraceryPlusPlus.g:530:1: rulePronouns EOF
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
    // InternalTraceryPlusPlus.g:537:1: rulePronouns : ( ( rule__Pronouns__Alternatives ) ) ;
    public final void rulePronouns() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:541:2: ( ( ( rule__Pronouns__Alternatives ) ) )
            // InternalTraceryPlusPlus.g:542:2: ( ( rule__Pronouns__Alternatives ) )
            {
            // InternalTraceryPlusPlus.g:542:2: ( ( rule__Pronouns__Alternatives ) )
            // InternalTraceryPlusPlus.g:543:3: ( rule__Pronouns__Alternatives )
            {
             before(grammarAccess.getPronounsAccess().getAlternatives()); 
            // InternalTraceryPlusPlus.g:544:3: ( rule__Pronouns__Alternatives )
            // InternalTraceryPlusPlus.g:544:4: rule__Pronouns__Alternatives
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
    // InternalTraceryPlusPlus.g:553:1: entryRulePronounIdentifier : rulePronounIdentifier EOF ;
    public final void entryRulePronounIdentifier() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:554:1: ( rulePronounIdentifier EOF )
            // InternalTraceryPlusPlus.g:555:1: rulePronounIdentifier EOF
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
    // InternalTraceryPlusPlus.g:562:1: rulePronounIdentifier : ( ( rule__PronounIdentifier__NameAssignment ) ) ;
    public final void rulePronounIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:566:2: ( ( ( rule__PronounIdentifier__NameAssignment ) ) )
            // InternalTraceryPlusPlus.g:567:2: ( ( rule__PronounIdentifier__NameAssignment ) )
            {
            // InternalTraceryPlusPlus.g:567:2: ( ( rule__PronounIdentifier__NameAssignment ) )
            // InternalTraceryPlusPlus.g:568:3: ( rule__PronounIdentifier__NameAssignment )
            {
             before(grammarAccess.getPronounIdentifierAccess().getNameAssignment()); 
            // InternalTraceryPlusPlus.g:569:3: ( rule__PronounIdentifier__NameAssignment )
            // InternalTraceryPlusPlus.g:569:4: rule__PronounIdentifier__NameAssignment
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
    // InternalTraceryPlusPlus.g:578:1: entryRuleModifier : ruleModifier EOF ;
    public final void entryRuleModifier() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:579:1: ( ruleModifier EOF )
            // InternalTraceryPlusPlus.g:580:1: ruleModifier EOF
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
    // InternalTraceryPlusPlus.g:587:1: ruleModifier : ( ( rule__Modifier__Alternatives ) ) ;
    public final void ruleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:591:2: ( ( ( rule__Modifier__Alternatives ) ) )
            // InternalTraceryPlusPlus.g:592:2: ( ( rule__Modifier__Alternatives ) )
            {
            // InternalTraceryPlusPlus.g:592:2: ( ( rule__Modifier__Alternatives ) )
            // InternalTraceryPlusPlus.g:593:3: ( rule__Modifier__Alternatives )
            {
             before(grammarAccess.getModifierAccess().getAlternatives()); 
            // InternalTraceryPlusPlus.g:594:3: ( rule__Modifier__Alternatives )
            // InternalTraceryPlusPlus.g:594:4: rule__Modifier__Alternatives
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
    // InternalTraceryPlusPlus.g:603:1: entryRuleCapitalizationModifier : ruleCapitalizationModifier EOF ;
    public final void entryRuleCapitalizationModifier() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:604:1: ( ruleCapitalizationModifier EOF )
            // InternalTraceryPlusPlus.g:605:1: ruleCapitalizationModifier EOF
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
    // InternalTraceryPlusPlus.g:612:1: ruleCapitalizationModifier : ( '.capitalize' ) ;
    public final void ruleCapitalizationModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:616:2: ( ( '.capitalize' ) )
            // InternalTraceryPlusPlus.g:617:2: ( '.capitalize' )
            {
            // InternalTraceryPlusPlus.g:617:2: ( '.capitalize' )
            // InternalTraceryPlusPlus.g:618:3: '.capitalize'
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
    // InternalTraceryPlusPlus.g:628:1: entryRuleFullCapitalizationModifier : ruleFullCapitalizationModifier EOF ;
    public final void entryRuleFullCapitalizationModifier() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:629:1: ( ruleFullCapitalizationModifier EOF )
            // InternalTraceryPlusPlus.g:630:1: ruleFullCapitalizationModifier EOF
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
    // InternalTraceryPlusPlus.g:637:1: ruleFullCapitalizationModifier : ( '.CAPITALIZE' ) ;
    public final void ruleFullCapitalizationModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:641:2: ( ( '.CAPITALIZE' ) )
            // InternalTraceryPlusPlus.g:642:2: ( '.CAPITALIZE' )
            {
            // InternalTraceryPlusPlus.g:642:2: ( '.CAPITALIZE' )
            // InternalTraceryPlusPlus.g:643:3: '.CAPITALIZE'
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
    // InternalTraceryPlusPlus.g:653:1: entryRulePluralityModifier : rulePluralityModifier EOF ;
    public final void entryRulePluralityModifier() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:654:1: ( rulePluralityModifier EOF )
            // InternalTraceryPlusPlus.g:655:1: rulePluralityModifier EOF
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
    // InternalTraceryPlusPlus.g:662:1: rulePluralityModifier : ( '.s' ) ;
    public final void rulePluralityModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:666:2: ( ( '.s' ) )
            // InternalTraceryPlusPlus.g:667:2: ( '.s' )
            {
            // InternalTraceryPlusPlus.g:667:2: ( '.s' )
            // InternalTraceryPlusPlus.g:668:3: '.s'
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
    // InternalTraceryPlusPlus.g:678:1: entryRuleArticleModifier : ruleArticleModifier EOF ;
    public final void entryRuleArticleModifier() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:679:1: ( ruleArticleModifier EOF )
            // InternalTraceryPlusPlus.g:680:1: ruleArticleModifier EOF
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
    // InternalTraceryPlusPlus.g:687:1: ruleArticleModifier : ( '.a' ) ;
    public final void ruleArticleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:691:2: ( ( '.a' ) )
            // InternalTraceryPlusPlus.g:692:2: ( '.a' )
            {
            // InternalTraceryPlusPlus.g:692:2: ( '.a' )
            // InternalTraceryPlusPlus.g:693:3: '.a'
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
    // InternalTraceryPlusPlus.g:703:1: entryRulePastTenseModifier : rulePastTenseModifier EOF ;
    public final void entryRulePastTenseModifier() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:704:1: ( rulePastTenseModifier EOF )
            // InternalTraceryPlusPlus.g:705:1: rulePastTenseModifier EOF
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
    // InternalTraceryPlusPlus.g:712:1: rulePastTenseModifier : ( '.ed' ) ;
    public final void rulePastTenseModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:716:2: ( ( '.ed' ) )
            // InternalTraceryPlusPlus.g:717:2: ( '.ed' )
            {
            // InternalTraceryPlusPlus.g:717:2: ( '.ed' )
            // InternalTraceryPlusPlus.g:718:3: '.ed'
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
    // InternalTraceryPlusPlus.g:728:1: entryRuleAssignmentOperator : ruleAssignmentOperator EOF ;
    public final void entryRuleAssignmentOperator() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:729:1: ( ruleAssignmentOperator EOF )
            // InternalTraceryPlusPlus.g:730:1: ruleAssignmentOperator EOF
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
    // InternalTraceryPlusPlus.g:737:1: ruleAssignmentOperator : ( ( rule__AssignmentOperator__Alternatives ) ) ;
    public final void ruleAssignmentOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:741:2: ( ( ( rule__AssignmentOperator__Alternatives ) ) )
            // InternalTraceryPlusPlus.g:742:2: ( ( rule__AssignmentOperator__Alternatives ) )
            {
            // InternalTraceryPlusPlus.g:742:2: ( ( rule__AssignmentOperator__Alternatives ) )
            // InternalTraceryPlusPlus.g:743:3: ( rule__AssignmentOperator__Alternatives )
            {
             before(grammarAccess.getAssignmentOperatorAccess().getAlternatives()); 
            // InternalTraceryPlusPlus.g:744:3: ( rule__AssignmentOperator__Alternatives )
            // InternalTraceryPlusPlus.g:744:4: rule__AssignmentOperator__Alternatives
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
    // InternalTraceryPlusPlus.g:753:1: entryRuleSeparatorOr : ruleSeparatorOr EOF ;
    public final void entryRuleSeparatorOr() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:754:1: ( ruleSeparatorOr EOF )
            // InternalTraceryPlusPlus.g:755:1: ruleSeparatorOr EOF
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
    // InternalTraceryPlusPlus.g:762:1: ruleSeparatorOr : ( ( rule__SeparatorOr__Alternatives ) ) ;
    public final void ruleSeparatorOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:766:2: ( ( ( rule__SeparatorOr__Alternatives ) ) )
            // InternalTraceryPlusPlus.g:767:2: ( ( rule__SeparatorOr__Alternatives ) )
            {
            // InternalTraceryPlusPlus.g:767:2: ( ( rule__SeparatorOr__Alternatives ) )
            // InternalTraceryPlusPlus.g:768:3: ( rule__SeparatorOr__Alternatives )
            {
             before(grammarAccess.getSeparatorOrAccess().getAlternatives()); 
            // InternalTraceryPlusPlus.g:769:3: ( rule__SeparatorOr__Alternatives )
            // InternalTraceryPlusPlus.g:769:4: rule__SeparatorOr__Alternatives
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
    // InternalTraceryPlusPlus.g:778:1: entryRuleSeparatorAnd : ruleSeparatorAnd EOF ;
    public final void entryRuleSeparatorAnd() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:779:1: ( ruleSeparatorAnd EOF )
            // InternalTraceryPlusPlus.g:780:1: ruleSeparatorAnd EOF
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
    // InternalTraceryPlusPlus.g:787:1: ruleSeparatorAnd : ( ( rule__SeparatorAnd__Alternatives ) ) ;
    public final void ruleSeparatorAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:791:2: ( ( ( rule__SeparatorAnd__Alternatives ) ) )
            // InternalTraceryPlusPlus.g:792:2: ( ( rule__SeparatorAnd__Alternatives ) )
            {
            // InternalTraceryPlusPlus.g:792:2: ( ( rule__SeparatorAnd__Alternatives ) )
            // InternalTraceryPlusPlus.g:793:3: ( rule__SeparatorAnd__Alternatives )
            {
             before(grammarAccess.getSeparatorAndAccess().getAlternatives()); 
            // InternalTraceryPlusPlus.g:794:3: ( rule__SeparatorAnd__Alternatives )
            // InternalTraceryPlusPlus.g:794:4: rule__SeparatorAnd__Alternatives
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
    // InternalTraceryPlusPlus.g:802:1: rule__Variable__Alternatives : ( ( ruleListDeclaration ) | ( ruleObjectDeclaration ) | ( ruleSubstoryDeclaration ) );
    public final void rule__Variable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:806:1: ( ( ruleListDeclaration ) | ( ruleObjectDeclaration ) | ( ruleSubstoryDeclaration ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt1=1;
                }
                break;
            case 43:
                {
                alt1=2;
                }
                break;
            case 23:
            case 45:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalTraceryPlusPlus.g:807:2: ( ruleListDeclaration )
                    {
                    // InternalTraceryPlusPlus.g:807:2: ( ruleListDeclaration )
                    // InternalTraceryPlusPlus.g:808:3: ruleListDeclaration
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
                    // InternalTraceryPlusPlus.g:813:2: ( ruleObjectDeclaration )
                    {
                    // InternalTraceryPlusPlus.g:813:2: ( ruleObjectDeclaration )
                    // InternalTraceryPlusPlus.g:814:3: ruleObjectDeclaration
                    {
                     before(grammarAccess.getVariableAccess().getObjectDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleObjectDeclaration();

                    state._fsp--;

                     after(grammarAccess.getVariableAccess().getObjectDeclarationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:819:2: ( ruleSubstoryDeclaration )
                    {
                    // InternalTraceryPlusPlus.g:819:2: ( ruleSubstoryDeclaration )
                    // InternalTraceryPlusPlus.g:820:3: ruleSubstoryDeclaration
                    {
                     before(grammarAccess.getVariableAccess().getSubstoryDeclarationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSubstoryDeclaration();

                    state._fsp--;

                     after(grammarAccess.getVariableAccess().getSubstoryDeclarationParserRuleCall_2()); 

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


    // $ANTLR start "rule__VariableUse__Alternatives"
    // InternalTraceryPlusPlus.g:829:1: rule__VariableUse__Alternatives : ( ( ruleListUse ) | ( ruleObjectUse ) | ( ruleSubstoryUse ) );
    public final void rule__VariableUse__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:833:1: ( ( ruleListUse ) | ( ruleObjectUse ) | ( ruleSubstoryUse ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||(LA2_1>=RULE_ID && LA2_1<=RULE_STRING)||(LA2_1>=11 && LA2_1<=15)||(LA2_1>=46 && LA2_1<=47)) ) {
                    alt2=1;
                }
                else if ( (LA2_1==48) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==47) ) {
                alt2=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTraceryPlusPlus.g:834:2: ( ruleListUse )
                    {
                    // InternalTraceryPlusPlus.g:834:2: ( ruleListUse )
                    // InternalTraceryPlusPlus.g:835:3: ruleListUse
                    {
                     before(grammarAccess.getVariableUseAccess().getListUseParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleListUse();

                    state._fsp--;

                     after(grammarAccess.getVariableUseAccess().getListUseParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:840:2: ( ruleObjectUse )
                    {
                    // InternalTraceryPlusPlus.g:840:2: ( ruleObjectUse )
                    // InternalTraceryPlusPlus.g:841:3: ruleObjectUse
                    {
                     before(grammarAccess.getVariableUseAccess().getObjectUseParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleObjectUse();

                    state._fsp--;

                     after(grammarAccess.getVariableUseAccess().getObjectUseParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:846:2: ( ruleSubstoryUse )
                    {
                    // InternalTraceryPlusPlus.g:846:2: ( ruleSubstoryUse )
                    // InternalTraceryPlusPlus.g:847:3: ruleSubstoryUse
                    {
                     before(grammarAccess.getVariableUseAccess().getSubstoryUseParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSubstoryUse();

                    state._fsp--;

                     after(grammarAccess.getVariableUseAccess().getSubstoryUseParserRuleCall_2()); 

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
    // $ANTLR end "rule__VariableUse__Alternatives"


    // $ANTLR start "rule__Story__StoryAlternatives_4_0"
    // InternalTraceryPlusPlus.g:856:1: rule__Story__StoryAlternatives_4_0 : ( ( ruleWord ) | ( ruleVariableUse ) );
    public final void rule__Story__StoryAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:860:1: ( ( ruleWord ) | ( ruleVariableUse ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID||LA3_0==47) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTraceryPlusPlus.g:861:2: ( ruleWord )
                    {
                    // InternalTraceryPlusPlus.g:861:2: ( ruleWord )
                    // InternalTraceryPlusPlus.g:862:3: ruleWord
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
                    // InternalTraceryPlusPlus.g:867:2: ( ruleVariableUse )
                    {
                    // InternalTraceryPlusPlus.g:867:2: ( ruleVariableUse )
                    // InternalTraceryPlusPlus.g:868:3: ruleVariableUse
                    {
                     before(grammarAccess.getStoryAccess().getStoryVariableUseParserRuleCall_4_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableUse();

                    state._fsp--;

                     after(grammarAccess.getStoryAccess().getStoryVariableUseParserRuleCall_4_0_1()); 

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
    // InternalTraceryPlusPlus.g:877:1: rule__ListDeclaration__Alternatives_1 : ( ( ( rule__ListDeclaration__Group_1_0__0 ) ) | ( ( rule__ListDeclaration__Group_1_1__0 ) ) | ( ( rule__ListDeclaration__Group_1_2__0 ) ) );
    public final void rule__ListDeclaration__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:881:1: ( ( ( rule__ListDeclaration__Group_1_0__0 ) ) | ( ( rule__ListDeclaration__Group_1_1__0 ) ) | ( ( rule__ListDeclaration__Group_1_2__0 ) ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==40) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==17) ) {
                    alt4=1;
                }
                else if ( (LA4_1==42) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA4_0>=16 && LA4_0<=17)) ) {
                alt4=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTraceryPlusPlus.g:882:2: ( ( rule__ListDeclaration__Group_1_0__0 ) )
                    {
                    // InternalTraceryPlusPlus.g:882:2: ( ( rule__ListDeclaration__Group_1_0__0 ) )
                    // InternalTraceryPlusPlus.g:883:3: ( rule__ListDeclaration__Group_1_0__0 )
                    {
                     before(grammarAccess.getListDeclarationAccess().getGroup_1_0()); 
                    // InternalTraceryPlusPlus.g:884:3: ( rule__ListDeclaration__Group_1_0__0 )
                    // InternalTraceryPlusPlus.g:884:4: rule__ListDeclaration__Group_1_0__0
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
                    // InternalTraceryPlusPlus.g:888:2: ( ( rule__ListDeclaration__Group_1_1__0 ) )
                    {
                    // InternalTraceryPlusPlus.g:888:2: ( ( rule__ListDeclaration__Group_1_1__0 ) )
                    // InternalTraceryPlusPlus.g:889:3: ( rule__ListDeclaration__Group_1_1__0 )
                    {
                     before(grammarAccess.getListDeclarationAccess().getGroup_1_1()); 
                    // InternalTraceryPlusPlus.g:890:3: ( rule__ListDeclaration__Group_1_1__0 )
                    // InternalTraceryPlusPlus.g:890:4: rule__ListDeclaration__Group_1_1__0
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
                    // InternalTraceryPlusPlus.g:894:2: ( ( rule__ListDeclaration__Group_1_2__0 ) )
                    {
                    // InternalTraceryPlusPlus.g:894:2: ( ( rule__ListDeclaration__Group_1_2__0 ) )
                    // InternalTraceryPlusPlus.g:895:3: ( rule__ListDeclaration__Group_1_2__0 )
                    {
                     before(grammarAccess.getListDeclarationAccess().getGroup_1_2()); 
                    // InternalTraceryPlusPlus.g:896:3: ( rule__ListDeclaration__Group_1_2__0 )
                    // InternalTraceryPlusPlus.g:896:4: rule__ListDeclaration__Group_1_2__0
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
    // InternalTraceryPlusPlus.g:904:1: rule__ListDeclaration__Alternatives_1_2_0 : ( ( 'has' ) | ( 'have' ) );
    public final void rule__ListDeclaration__Alternatives_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:908:1: ( ( 'has' ) | ( 'have' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTraceryPlusPlus.g:909:2: ( 'has' )
                    {
                    // InternalTraceryPlusPlus.g:909:2: ( 'has' )
                    // InternalTraceryPlusPlus.g:910:3: 'has'
                    {
                     before(grammarAccess.getListDeclarationAccess().getHasKeyword_1_2_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getListDeclarationAccess().getHasKeyword_1_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:915:2: ( 'have' )
                    {
                    // InternalTraceryPlusPlus.g:915:2: ( 'have' )
                    // InternalTraceryPlusPlus.g:916:3: 'have'
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
    // InternalTraceryPlusPlus.g:925:1: rule__ObjectDeclaration__Alternatives_1 : ( ( 'is' ) | ( 'are' ) );
    public final void rule__ObjectDeclaration__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:929:1: ( ( 'is' ) | ( 'are' ) )
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
                    // InternalTraceryPlusPlus.g:930:2: ( 'is' )
                    {
                    // InternalTraceryPlusPlus.g:930:2: ( 'is' )
                    // InternalTraceryPlusPlus.g:931:3: 'is'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getIsKeyword_1_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getObjectDeclarationAccess().getIsKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:936:2: ( 'are' )
                    {
                    // InternalTraceryPlusPlus.g:936:2: ( 'are' )
                    // InternalTraceryPlusPlus.g:937:3: 'are'
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
    // InternalTraceryPlusPlus.g:946:1: rule__ObjectDeclaration__Alternatives_2 : ( ( 'a' ) | ( 'an' ) );
    public final void rule__ObjectDeclaration__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:950:1: ( ( 'a' ) | ( 'an' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            else if ( (LA7_0==21) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTraceryPlusPlus.g:951:2: ( 'a' )
                    {
                    // InternalTraceryPlusPlus.g:951:2: ( 'a' )
                    // InternalTraceryPlusPlus.g:952:3: 'a'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getAKeyword_2_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getObjectDeclarationAccess().getAKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:957:2: ( 'an' )
                    {
                    // InternalTraceryPlusPlus.g:957:2: ( 'an' )
                    // InternalTraceryPlusPlus.g:958:3: 'an'
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
    // InternalTraceryPlusPlus.g:967:1: rule__ObjectDeclaration__Alternatives_5 : ( ( 'has' ) | ( 'have' ) );
    public final void rule__ObjectDeclaration__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:971:1: ( ( 'has' ) | ( 'have' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            else if ( (LA8_0==17) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTraceryPlusPlus.g:972:2: ( 'has' )
                    {
                    // InternalTraceryPlusPlus.g:972:2: ( 'has' )
                    // InternalTraceryPlusPlus.g:973:3: 'has'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getHasKeyword_5_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getObjectDeclarationAccess().getHasKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:978:2: ( 'have' )
                    {
                    // InternalTraceryPlusPlus.g:978:2: ( 'have' )
                    // InternalTraceryPlusPlus.g:979:3: 'have'
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


    // $ANTLR start "rule__SubstoryDeclaration__StoryAlternatives_4_0"
    // InternalTraceryPlusPlus.g:988:1: rule__SubstoryDeclaration__StoryAlternatives_4_0 : ( ( ruleWord ) | ( ruleVariableUse ) );
    public final void rule__SubstoryDeclaration__StoryAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:992:1: ( ( ruleWord ) | ( ruleVariableUse ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID||LA9_0==47) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalTraceryPlusPlus.g:993:2: ( ruleWord )
                    {
                    // InternalTraceryPlusPlus.g:993:2: ( ruleWord )
                    // InternalTraceryPlusPlus.g:994:3: ruleWord
                    {
                     before(grammarAccess.getSubstoryDeclarationAccess().getStoryWordParserRuleCall_4_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWord();

                    state._fsp--;

                     after(grammarAccess.getSubstoryDeclarationAccess().getStoryWordParserRuleCall_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:999:2: ( ruleVariableUse )
                    {
                    // InternalTraceryPlusPlus.g:999:2: ( ruleVariableUse )
                    // InternalTraceryPlusPlus.g:1000:3: ruleVariableUse
                    {
                     before(grammarAccess.getSubstoryDeclarationAccess().getStoryVariableUseParserRuleCall_4_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableUse();

                    state._fsp--;

                     after(grammarAccess.getSubstoryDeclarationAccess().getStoryVariableUseParserRuleCall_4_0_1()); 

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
    // $ANTLR end "rule__SubstoryDeclaration__StoryAlternatives_4_0"


    // $ANTLR start "rule__Attribute__Alternatives"
    // InternalTraceryPlusPlus.g:1009:1: rule__Attribute__Alternatives : ( ( ruleNameExistingListAttribute ) | ( ruleNameValueAttribute ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1013:1: ( ( ruleNameExistingListAttribute ) | ( ruleNameValueAttribute ) )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1014:2: ( ruleNameExistingListAttribute )
                    {
                    // InternalTraceryPlusPlus.g:1014:2: ( ruleNameExistingListAttribute )
                    // InternalTraceryPlusPlus.g:1015:3: ruleNameExistingListAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getNameExistingListAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNameExistingListAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getNameExistingListAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1020:2: ( ruleNameValueAttribute )
                    {
                    // InternalTraceryPlusPlus.g:1020:2: ( ruleNameValueAttribute )
                    // InternalTraceryPlusPlus.g:1021:3: ruleNameValueAttribute
                    {
                     before(grammarAccess.getAttributeAccess().getNameValueAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNameValueAttribute();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getNameValueAttributeParserRuleCall_1()); 

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
    // InternalTraceryPlusPlus.g:1030:1: rule__NameExistingListAttribute__Alternatives_1 : ( ( ruleAssignmentOperator ) | ( 'from' ) );
    public final void rule__NameExistingListAttribute__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1034:1: ( ( ruleAssignmentOperator ) | ( 'from' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=29 && LA11_0<=32)||LA11_0==49) ) {
                alt11=1;
            }
            else if ( (LA11_0==22) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1035:2: ( ruleAssignmentOperator )
                    {
                    // InternalTraceryPlusPlus.g:1035:2: ( ruleAssignmentOperator )
                    // InternalTraceryPlusPlus.g:1036:3: ruleAssignmentOperator
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
                    // InternalTraceryPlusPlus.g:1041:2: ( 'from' )
                    {
                    // InternalTraceryPlusPlus.g:1041:2: ( 'from' )
                    // InternalTraceryPlusPlus.g:1042:3: 'from'
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


    // $ANTLR start "rule__SubstoryUse__Alternatives_1"
    // InternalTraceryPlusPlus.g:1051:1: rule__SubstoryUse__Alternatives_1 : ( ( 'substory' ) | ( 'sub' ) );
    public final void rule__SubstoryUse__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1055:1: ( ( 'substory' ) | ( 'sub' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            else if ( (LA12_0==24) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1056:2: ( 'substory' )
                    {
                    // InternalTraceryPlusPlus.g:1056:2: ( 'substory' )
                    // InternalTraceryPlusPlus.g:1057:3: 'substory'
                    {
                     before(grammarAccess.getSubstoryUseAccess().getSubstoryKeyword_1_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getSubstoryUseAccess().getSubstoryKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1062:2: ( 'sub' )
                    {
                    // InternalTraceryPlusPlus.g:1062:2: ( 'sub' )
                    // InternalTraceryPlusPlus.g:1063:3: 'sub'
                    {
                     before(grammarAccess.getSubstoryUseAccess().getSubKeyword_1_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getSubstoryUseAccess().getSubKeyword_1_1()); 

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
    // $ANTLR end "rule__SubstoryUse__Alternatives_1"


    // $ANTLR start "rule__ObjectUse__Alternatives"
    // InternalTraceryPlusPlus.g:1072:1: rule__ObjectUse__Alternatives : ( ( ruleObjectAttribute ) | ( ruleObjectPronoun ) );
    public final void rule__ObjectUse__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1076:1: ( ( ruleObjectAttribute ) | ( ruleObjectPronoun ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==48) ) {
                    int LA13_2 = input.LA(3);

                    if ( ((LA13_2>=25 && LA13_2<=28)) ) {
                        alt13=2;
                    }
                    else if ( (LA13_2==RULE_ID) ) {
                        alt13=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1077:2: ( ruleObjectAttribute )
                    {
                    // InternalTraceryPlusPlus.g:1077:2: ( ruleObjectAttribute )
                    // InternalTraceryPlusPlus.g:1078:3: ruleObjectAttribute
                    {
                     before(grammarAccess.getObjectUseAccess().getObjectAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleObjectAttribute();

                    state._fsp--;

                     after(grammarAccess.getObjectUseAccess().getObjectAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1083:2: ( ruleObjectPronoun )
                    {
                    // InternalTraceryPlusPlus.g:1083:2: ( ruleObjectPronoun )
                    // InternalTraceryPlusPlus.g:1084:3: ruleObjectPronoun
                    {
                     before(grammarAccess.getObjectUseAccess().getObjectPronounParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleObjectPronoun();

                    state._fsp--;

                     after(grammarAccess.getObjectUseAccess().getObjectPronounParserRuleCall_1()); 

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
    // $ANTLR end "rule__ObjectUse__Alternatives"


    // $ANTLR start "rule__Pronouns__Alternatives"
    // InternalTraceryPlusPlus.g:1093:1: rule__Pronouns__Alternatives : ( ( ( rule__Pronouns__ValueAssignment_0 ) ) | ( ( rule__Pronouns__ValueAssignment_1 ) ) | ( ( rule__Pronouns__ValueAssignment_2 ) ) | ( ( rule__Pronouns__ValueAssignment_3 ) ) );
    public final void rule__Pronouns__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1097:1: ( ( ( rule__Pronouns__ValueAssignment_0 ) ) | ( ( rule__Pronouns__ValueAssignment_1 ) ) | ( ( rule__Pronouns__ValueAssignment_2 ) ) | ( ( rule__Pronouns__ValueAssignment_3 ) ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt14=1;
                }
                break;
            case 52:
                {
                alt14=2;
                }
                break;
            case 53:
                {
                alt14=3;
                }
                break;
            case 54:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1098:2: ( ( rule__Pronouns__ValueAssignment_0 ) )
                    {
                    // InternalTraceryPlusPlus.g:1098:2: ( ( rule__Pronouns__ValueAssignment_0 ) )
                    // InternalTraceryPlusPlus.g:1099:3: ( rule__Pronouns__ValueAssignment_0 )
                    {
                     before(grammarAccess.getPronounsAccess().getValueAssignment_0()); 
                    // InternalTraceryPlusPlus.g:1100:3: ( rule__Pronouns__ValueAssignment_0 )
                    // InternalTraceryPlusPlus.g:1100:4: rule__Pronouns__ValueAssignment_0
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
                    // InternalTraceryPlusPlus.g:1104:2: ( ( rule__Pronouns__ValueAssignment_1 ) )
                    {
                    // InternalTraceryPlusPlus.g:1104:2: ( ( rule__Pronouns__ValueAssignment_1 ) )
                    // InternalTraceryPlusPlus.g:1105:3: ( rule__Pronouns__ValueAssignment_1 )
                    {
                     before(grammarAccess.getPronounsAccess().getValueAssignment_1()); 
                    // InternalTraceryPlusPlus.g:1106:3: ( rule__Pronouns__ValueAssignment_1 )
                    // InternalTraceryPlusPlus.g:1106:4: rule__Pronouns__ValueAssignment_1
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
                    // InternalTraceryPlusPlus.g:1110:2: ( ( rule__Pronouns__ValueAssignment_2 ) )
                    {
                    // InternalTraceryPlusPlus.g:1110:2: ( ( rule__Pronouns__ValueAssignment_2 ) )
                    // InternalTraceryPlusPlus.g:1111:3: ( rule__Pronouns__ValueAssignment_2 )
                    {
                     before(grammarAccess.getPronounsAccess().getValueAssignment_2()); 
                    // InternalTraceryPlusPlus.g:1112:3: ( rule__Pronouns__ValueAssignment_2 )
                    // InternalTraceryPlusPlus.g:1112:4: rule__Pronouns__ValueAssignment_2
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
                    // InternalTraceryPlusPlus.g:1116:2: ( ( rule__Pronouns__ValueAssignment_3 ) )
                    {
                    // InternalTraceryPlusPlus.g:1116:2: ( ( rule__Pronouns__ValueAssignment_3 ) )
                    // InternalTraceryPlusPlus.g:1117:3: ( rule__Pronouns__ValueAssignment_3 )
                    {
                     before(grammarAccess.getPronounsAccess().getValueAssignment_3()); 
                    // InternalTraceryPlusPlus.g:1118:3: ( rule__Pronouns__ValueAssignment_3 )
                    // InternalTraceryPlusPlus.g:1118:4: rule__Pronouns__ValueAssignment_3
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
    // InternalTraceryPlusPlus.g:1126:1: rule__PronounIdentifier__NameAlternatives_0 : ( ( 'they' ) | ( 'them' ) | ( 'their' ) | ( 'theirs' ) );
    public final void rule__PronounIdentifier__NameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1130:1: ( ( 'they' ) | ( 'them' ) | ( 'their' ) | ( 'theirs' ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt15=1;
                }
                break;
            case 26:
                {
                alt15=2;
                }
                break;
            case 27:
                {
                alt15=3;
                }
                break;
            case 28:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1131:2: ( 'they' )
                    {
                    // InternalTraceryPlusPlus.g:1131:2: ( 'they' )
                    // InternalTraceryPlusPlus.g:1132:3: 'they'
                    {
                     before(grammarAccess.getPronounIdentifierAccess().getNameTheyKeyword_0_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getPronounIdentifierAccess().getNameTheyKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1137:2: ( 'them' )
                    {
                    // InternalTraceryPlusPlus.g:1137:2: ( 'them' )
                    // InternalTraceryPlusPlus.g:1138:3: 'them'
                    {
                     before(grammarAccess.getPronounIdentifierAccess().getNameThemKeyword_0_1()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getPronounIdentifierAccess().getNameThemKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1143:2: ( 'their' )
                    {
                    // InternalTraceryPlusPlus.g:1143:2: ( 'their' )
                    // InternalTraceryPlusPlus.g:1144:3: 'their'
                    {
                     before(grammarAccess.getPronounIdentifierAccess().getNameTheirKeyword_0_2()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getPronounIdentifierAccess().getNameTheirKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTraceryPlusPlus.g:1149:2: ( 'theirs' )
                    {
                    // InternalTraceryPlusPlus.g:1149:2: ( 'theirs' )
                    // InternalTraceryPlusPlus.g:1150:3: 'theirs'
                    {
                     before(grammarAccess.getPronounIdentifierAccess().getNameTheirsKeyword_0_3()); 
                    match(input,28,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1159:1: rule__Modifier__Alternatives : ( ( ruleCapitalizationModifier ) | ( ruleFullCapitalizationModifier ) | ( rulePluralityModifier ) | ( ruleArticleModifier ) | ( rulePastTenseModifier ) );
    public final void rule__Modifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1163:1: ( ( ruleCapitalizationModifier ) | ( ruleFullCapitalizationModifier ) | ( rulePluralityModifier ) | ( ruleArticleModifier ) | ( rulePastTenseModifier ) )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt16=1;
                }
                break;
            case 12:
                {
                alt16=2;
                }
                break;
            case 13:
                {
                alt16=3;
                }
                break;
            case 14:
                {
                alt16=4;
                }
                break;
            case 15:
                {
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1164:2: ( ruleCapitalizationModifier )
                    {
                    // InternalTraceryPlusPlus.g:1164:2: ( ruleCapitalizationModifier )
                    // InternalTraceryPlusPlus.g:1165:3: ruleCapitalizationModifier
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
                    // InternalTraceryPlusPlus.g:1170:2: ( ruleFullCapitalizationModifier )
                    {
                    // InternalTraceryPlusPlus.g:1170:2: ( ruleFullCapitalizationModifier )
                    // InternalTraceryPlusPlus.g:1171:3: ruleFullCapitalizationModifier
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
                    // InternalTraceryPlusPlus.g:1176:2: ( rulePluralityModifier )
                    {
                    // InternalTraceryPlusPlus.g:1176:2: ( rulePluralityModifier )
                    // InternalTraceryPlusPlus.g:1177:3: rulePluralityModifier
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
                    // InternalTraceryPlusPlus.g:1182:2: ( ruleArticleModifier )
                    {
                    // InternalTraceryPlusPlus.g:1182:2: ( ruleArticleModifier )
                    // InternalTraceryPlusPlus.g:1183:3: ruleArticleModifier
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
                    // InternalTraceryPlusPlus.g:1188:2: ( rulePastTenseModifier )
                    {
                    // InternalTraceryPlusPlus.g:1188:2: ( rulePastTenseModifier )
                    // InternalTraceryPlusPlus.g:1189:3: rulePastTenseModifier
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
    // InternalTraceryPlusPlus.g:1198:1: rule__AssignmentOperator__Alternatives : ( ( '=' ) | ( ':' ) | ( '-' ) | ( '-->' ) | ( ( rule__AssignmentOperator__Group_4__0 ) ) );
    public final void rule__AssignmentOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1202:1: ( ( '=' ) | ( ':' ) | ( '-' ) | ( '-->' ) | ( ( rule__AssignmentOperator__Group_4__0 ) ) )
            int alt17=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt17=1;
                }
                break;
            case 30:
                {
                alt17=2;
                }
                break;
            case 31:
                {
                alt17=3;
                }
                break;
            case 32:
                {
                alt17=4;
                }
                break;
            case 49:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1203:2: ( '=' )
                    {
                    // InternalTraceryPlusPlus.g:1203:2: ( '=' )
                    // InternalTraceryPlusPlus.g:1204:3: '='
                    {
                     before(grammarAccess.getAssignmentOperatorAccess().getEqualsSignKeyword_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getAssignmentOperatorAccess().getEqualsSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1209:2: ( ':' )
                    {
                    // InternalTraceryPlusPlus.g:1209:2: ( ':' )
                    // InternalTraceryPlusPlus.g:1210:3: ':'
                    {
                     before(grammarAccess.getAssignmentOperatorAccess().getColonKeyword_1()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getAssignmentOperatorAccess().getColonKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1215:2: ( '-' )
                    {
                    // InternalTraceryPlusPlus.g:1215:2: ( '-' )
                    // InternalTraceryPlusPlus.g:1216:3: '-'
                    {
                     before(grammarAccess.getAssignmentOperatorAccess().getHyphenMinusKeyword_2()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getAssignmentOperatorAccess().getHyphenMinusKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTraceryPlusPlus.g:1221:2: ( '-->' )
                    {
                    // InternalTraceryPlusPlus.g:1221:2: ( '-->' )
                    // InternalTraceryPlusPlus.g:1222:3: '-->'
                    {
                     before(grammarAccess.getAssignmentOperatorAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_3()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getAssignmentOperatorAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTraceryPlusPlus.g:1227:2: ( ( rule__AssignmentOperator__Group_4__0 ) )
                    {
                    // InternalTraceryPlusPlus.g:1227:2: ( ( rule__AssignmentOperator__Group_4__0 ) )
                    // InternalTraceryPlusPlus.g:1228:3: ( rule__AssignmentOperator__Group_4__0 )
                    {
                     before(grammarAccess.getAssignmentOperatorAccess().getGroup_4()); 
                    // InternalTraceryPlusPlus.g:1229:3: ( rule__AssignmentOperator__Group_4__0 )
                    // InternalTraceryPlusPlus.g:1229:4: rule__AssignmentOperator__Group_4__0
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
    // InternalTraceryPlusPlus.g:1237:1: rule__SeparatorOr__Alternatives : ( ( ',' ) | ( 'or' ) | ( '||' ) );
    public final void rule__SeparatorOr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1241:1: ( ( ',' ) | ( 'or' ) | ( '||' ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt18=1;
                }
                break;
            case 34:
                {
                alt18=2;
                }
                break;
            case 35:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1242:2: ( ',' )
                    {
                    // InternalTraceryPlusPlus.g:1242:2: ( ',' )
                    // InternalTraceryPlusPlus.g:1243:3: ','
                    {
                     before(grammarAccess.getSeparatorOrAccess().getCommaKeyword_0()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getSeparatorOrAccess().getCommaKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1248:2: ( 'or' )
                    {
                    // InternalTraceryPlusPlus.g:1248:2: ( 'or' )
                    // InternalTraceryPlusPlus.g:1249:3: 'or'
                    {
                     before(grammarAccess.getSeparatorOrAccess().getOrKeyword_1()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getSeparatorOrAccess().getOrKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1254:2: ( '||' )
                    {
                    // InternalTraceryPlusPlus.g:1254:2: ( '||' )
                    // InternalTraceryPlusPlus.g:1255:3: '||'
                    {
                     before(grammarAccess.getSeparatorOrAccess().getVerticalLineVerticalLineKeyword_2()); 
                    match(input,35,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1264:1: rule__SeparatorAnd__Alternatives : ( ( ',' ) | ( 'and' ) | ( '&&' ) );
    public final void rule__SeparatorAnd__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1268:1: ( ( ',' ) | ( 'and' ) | ( '&&' ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt19=1;
                }
                break;
            case 36:
                {
                alt19=2;
                }
                break;
            case 37:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1269:2: ( ',' )
                    {
                    // InternalTraceryPlusPlus.g:1269:2: ( ',' )
                    // InternalTraceryPlusPlus.g:1270:3: ','
                    {
                     before(grammarAccess.getSeparatorAndAccess().getCommaKeyword_0()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getSeparatorAndAccess().getCommaKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1275:2: ( 'and' )
                    {
                    // InternalTraceryPlusPlus.g:1275:2: ( 'and' )
                    // InternalTraceryPlusPlus.g:1276:3: 'and'
                    {
                     before(grammarAccess.getSeparatorAndAccess().getAndKeyword_1()); 
                    match(input,36,FOLLOW_2); 
                     after(grammarAccess.getSeparatorAndAccess().getAndKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1281:2: ( '&&' )
                    {
                    // InternalTraceryPlusPlus.g:1281:2: ( '&&' )
                    // InternalTraceryPlusPlus.g:1282:3: '&&'
                    {
                     before(grammarAccess.getSeparatorAndAccess().getAmpersandAmpersandKeyword_2()); 
                    match(input,37,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1291:1: rule__TraceryPlusPlusProgram__Group__0 : rule__TraceryPlusPlusProgram__Group__0__Impl rule__TraceryPlusPlusProgram__Group__1 ;
    public final void rule__TraceryPlusPlusProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1295:1: ( rule__TraceryPlusPlusProgram__Group__0__Impl rule__TraceryPlusPlusProgram__Group__1 )
            // InternalTraceryPlusPlus.g:1296:2: rule__TraceryPlusPlusProgram__Group__0__Impl rule__TraceryPlusPlusProgram__Group__1
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
    // InternalTraceryPlusPlus.g:1303:1: rule__TraceryPlusPlusProgram__Group__0__Impl : ( ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )* ) ;
    public final void rule__TraceryPlusPlusProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1307:1: ( ( ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )* ) )
            // InternalTraceryPlusPlus.g:1308:1: ( ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )* )
            {
            // InternalTraceryPlusPlus.g:1308:1: ( ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )* )
            // InternalTraceryPlusPlus.g:1309:2: ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )*
            {
             before(grammarAccess.getTraceryPlusPlusProgramAccess().getStatementsAssignment_0()); 
            // InternalTraceryPlusPlus.g:1310:2: ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==23||LA20_0==43||LA20_0==45) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1310:3: rule__TraceryPlusPlusProgram__StatementsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__TraceryPlusPlusProgram__StatementsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalTraceryPlusPlus.g:1318:1: rule__TraceryPlusPlusProgram__Group__1 : rule__TraceryPlusPlusProgram__Group__1__Impl ;
    public final void rule__TraceryPlusPlusProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1322:1: ( rule__TraceryPlusPlusProgram__Group__1__Impl )
            // InternalTraceryPlusPlus.g:1323:2: rule__TraceryPlusPlusProgram__Group__1__Impl
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
    // InternalTraceryPlusPlus.g:1329:1: rule__TraceryPlusPlusProgram__Group__1__Impl : ( ( rule__TraceryPlusPlusProgram__StoryAssignment_1 ) ) ;
    public final void rule__TraceryPlusPlusProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1333:1: ( ( ( rule__TraceryPlusPlusProgram__StoryAssignment_1 ) ) )
            // InternalTraceryPlusPlus.g:1334:1: ( ( rule__TraceryPlusPlusProgram__StoryAssignment_1 ) )
            {
            // InternalTraceryPlusPlus.g:1334:1: ( ( rule__TraceryPlusPlusProgram__StoryAssignment_1 ) )
            // InternalTraceryPlusPlus.g:1335:2: ( rule__TraceryPlusPlusProgram__StoryAssignment_1 )
            {
             before(grammarAccess.getTraceryPlusPlusProgramAccess().getStoryAssignment_1()); 
            // InternalTraceryPlusPlus.g:1336:2: ( rule__TraceryPlusPlusProgram__StoryAssignment_1 )
            // InternalTraceryPlusPlus.g:1336:3: rule__TraceryPlusPlusProgram__StoryAssignment_1
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
    // InternalTraceryPlusPlus.g:1345:1: rule__Story__Group__0 : rule__Story__Group__0__Impl rule__Story__Group__1 ;
    public final void rule__Story__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1349:1: ( rule__Story__Group__0__Impl rule__Story__Group__1 )
            // InternalTraceryPlusPlus.g:1350:2: rule__Story__Group__0__Impl rule__Story__Group__1
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
    // InternalTraceryPlusPlus.g:1357:1: rule__Story__Group__0__Impl : ( () ) ;
    public final void rule__Story__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1361:1: ( ( () ) )
            // InternalTraceryPlusPlus.g:1362:1: ( () )
            {
            // InternalTraceryPlusPlus.g:1362:1: ( () )
            // InternalTraceryPlusPlus.g:1363:2: ()
            {
             before(grammarAccess.getStoryAccess().getStoryAction_0()); 
            // InternalTraceryPlusPlus.g:1364:2: ()
            // InternalTraceryPlusPlus.g:1364:3: 
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
    // InternalTraceryPlusPlus.g:1372:1: rule__Story__Group__1 : rule__Story__Group__1__Impl rule__Story__Group__2 ;
    public final void rule__Story__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1376:1: ( rule__Story__Group__1__Impl rule__Story__Group__2 )
            // InternalTraceryPlusPlus.g:1377:2: rule__Story__Group__1__Impl rule__Story__Group__2
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
    // InternalTraceryPlusPlus.g:1384:1: rule__Story__Group__1__Impl : ( 'The' ) ;
    public final void rule__Story__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1388:1: ( ( 'The' ) )
            // InternalTraceryPlusPlus.g:1389:1: ( 'The' )
            {
            // InternalTraceryPlusPlus.g:1389:1: ( 'The' )
            // InternalTraceryPlusPlus.g:1390:2: 'The'
            {
             before(grammarAccess.getStoryAccess().getTheKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1399:1: rule__Story__Group__2 : rule__Story__Group__2__Impl rule__Story__Group__3 ;
    public final void rule__Story__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1403:1: ( rule__Story__Group__2__Impl rule__Story__Group__3 )
            // InternalTraceryPlusPlus.g:1404:2: rule__Story__Group__2__Impl rule__Story__Group__3
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
    // InternalTraceryPlusPlus.g:1411:1: rule__Story__Group__2__Impl : ( 'story' ) ;
    public final void rule__Story__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1415:1: ( ( 'story' ) )
            // InternalTraceryPlusPlus.g:1416:1: ( 'story' )
            {
            // InternalTraceryPlusPlus.g:1416:1: ( 'story' )
            // InternalTraceryPlusPlus.g:1417:2: 'story'
            {
             before(grammarAccess.getStoryAccess().getStoryKeyword_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1426:1: rule__Story__Group__3 : rule__Story__Group__3__Impl rule__Story__Group__4 ;
    public final void rule__Story__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1430:1: ( rule__Story__Group__3__Impl rule__Story__Group__4 )
            // InternalTraceryPlusPlus.g:1431:2: rule__Story__Group__3__Impl rule__Story__Group__4
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
    // InternalTraceryPlusPlus.g:1438:1: rule__Story__Group__3__Impl : ( ( ruleAssignmentOperator )? ) ;
    public final void rule__Story__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1442:1: ( ( ( ruleAssignmentOperator )? ) )
            // InternalTraceryPlusPlus.g:1443:1: ( ( ruleAssignmentOperator )? )
            {
            // InternalTraceryPlusPlus.g:1443:1: ( ( ruleAssignmentOperator )? )
            // InternalTraceryPlusPlus.g:1444:2: ( ruleAssignmentOperator )?
            {
             before(grammarAccess.getStoryAccess().getAssignmentOperatorParserRuleCall_3()); 
            // InternalTraceryPlusPlus.g:1445:2: ( ruleAssignmentOperator )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=29 && LA21_0<=32)||LA21_0==49) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1445:3: ruleAssignmentOperator
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
    // InternalTraceryPlusPlus.g:1453:1: rule__Story__Group__4 : rule__Story__Group__4__Impl ;
    public final void rule__Story__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1457:1: ( rule__Story__Group__4__Impl )
            // InternalTraceryPlusPlus.g:1458:2: rule__Story__Group__4__Impl
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
    // InternalTraceryPlusPlus.g:1464:1: rule__Story__Group__4__Impl : ( ( rule__Story__StoryAssignment_4 )* ) ;
    public final void rule__Story__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1468:1: ( ( ( rule__Story__StoryAssignment_4 )* ) )
            // InternalTraceryPlusPlus.g:1469:1: ( ( rule__Story__StoryAssignment_4 )* )
            {
            // InternalTraceryPlusPlus.g:1469:1: ( ( rule__Story__StoryAssignment_4 )* )
            // InternalTraceryPlusPlus.g:1470:2: ( rule__Story__StoryAssignment_4 )*
            {
             before(grammarAccess.getStoryAccess().getStoryAssignment_4()); 
            // InternalTraceryPlusPlus.g:1471:2: ( rule__Story__StoryAssignment_4 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_STRING)||LA22_0==47) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1471:3: rule__Story__StoryAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Story__StoryAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalTraceryPlusPlus.g:1480:1: rule__ListDeclaration__Group__0 : rule__ListDeclaration__Group__0__Impl rule__ListDeclaration__Group__1 ;
    public final void rule__ListDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1484:1: ( rule__ListDeclaration__Group__0__Impl rule__ListDeclaration__Group__1 )
            // InternalTraceryPlusPlus.g:1485:2: rule__ListDeclaration__Group__0__Impl rule__ListDeclaration__Group__1
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
    // InternalTraceryPlusPlus.g:1492:1: rule__ListDeclaration__Group__0__Impl : ( ( rule__ListDeclaration__NameAssignment_0 ) ) ;
    public final void rule__ListDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1496:1: ( ( ( rule__ListDeclaration__NameAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:1497:1: ( ( rule__ListDeclaration__NameAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:1497:1: ( ( rule__ListDeclaration__NameAssignment_0 ) )
            // InternalTraceryPlusPlus.g:1498:2: ( rule__ListDeclaration__NameAssignment_0 )
            {
             before(grammarAccess.getListDeclarationAccess().getNameAssignment_0()); 
            // InternalTraceryPlusPlus.g:1499:2: ( rule__ListDeclaration__NameAssignment_0 )
            // InternalTraceryPlusPlus.g:1499:3: rule__ListDeclaration__NameAssignment_0
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
    // InternalTraceryPlusPlus.g:1507:1: rule__ListDeclaration__Group__1 : rule__ListDeclaration__Group__1__Impl rule__ListDeclaration__Group__2 ;
    public final void rule__ListDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1511:1: ( rule__ListDeclaration__Group__1__Impl rule__ListDeclaration__Group__2 )
            // InternalTraceryPlusPlus.g:1512:2: rule__ListDeclaration__Group__1__Impl rule__ListDeclaration__Group__2
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
    // InternalTraceryPlusPlus.g:1519:1: rule__ListDeclaration__Group__1__Impl : ( ( rule__ListDeclaration__Alternatives_1 ) ) ;
    public final void rule__ListDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1523:1: ( ( ( rule__ListDeclaration__Alternatives_1 ) ) )
            // InternalTraceryPlusPlus.g:1524:1: ( ( rule__ListDeclaration__Alternatives_1 ) )
            {
            // InternalTraceryPlusPlus.g:1524:1: ( ( rule__ListDeclaration__Alternatives_1 ) )
            // InternalTraceryPlusPlus.g:1525:2: ( rule__ListDeclaration__Alternatives_1 )
            {
             before(grammarAccess.getListDeclarationAccess().getAlternatives_1()); 
            // InternalTraceryPlusPlus.g:1526:2: ( rule__ListDeclaration__Alternatives_1 )
            // InternalTraceryPlusPlus.g:1526:3: rule__ListDeclaration__Alternatives_1
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
    // InternalTraceryPlusPlus.g:1534:1: rule__ListDeclaration__Group__2 : rule__ListDeclaration__Group__2__Impl rule__ListDeclaration__Group__3 ;
    public final void rule__ListDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1538:1: ( rule__ListDeclaration__Group__2__Impl rule__ListDeclaration__Group__3 )
            // InternalTraceryPlusPlus.g:1539:2: rule__ListDeclaration__Group__2__Impl rule__ListDeclaration__Group__3
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
    // InternalTraceryPlusPlus.g:1546:1: rule__ListDeclaration__Group__2__Impl : ( ( ruleAssignmentOperator )? ) ;
    public final void rule__ListDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1550:1: ( ( ( ruleAssignmentOperator )? ) )
            // InternalTraceryPlusPlus.g:1551:1: ( ( ruleAssignmentOperator )? )
            {
            // InternalTraceryPlusPlus.g:1551:1: ( ( ruleAssignmentOperator )? )
            // InternalTraceryPlusPlus.g:1552:2: ( ruleAssignmentOperator )?
            {
             before(grammarAccess.getListDeclarationAccess().getAssignmentOperatorParserRuleCall_2()); 
            // InternalTraceryPlusPlus.g:1553:2: ( ruleAssignmentOperator )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=29 && LA23_0<=32)||LA23_0==49) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1553:3: ruleAssignmentOperator
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
    // InternalTraceryPlusPlus.g:1561:1: rule__ListDeclaration__Group__3 : rule__ListDeclaration__Group__3__Impl ;
    public final void rule__ListDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1565:1: ( rule__ListDeclaration__Group__3__Impl )
            // InternalTraceryPlusPlus.g:1566:2: rule__ListDeclaration__Group__3__Impl
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
    // InternalTraceryPlusPlus.g:1572:1: rule__ListDeclaration__Group__3__Impl : ( ( rule__ListDeclaration__ListAssignment_3 ) ) ;
    public final void rule__ListDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1576:1: ( ( ( rule__ListDeclaration__ListAssignment_3 ) ) )
            // InternalTraceryPlusPlus.g:1577:1: ( ( rule__ListDeclaration__ListAssignment_3 ) )
            {
            // InternalTraceryPlusPlus.g:1577:1: ( ( rule__ListDeclaration__ListAssignment_3 ) )
            // InternalTraceryPlusPlus.g:1578:2: ( rule__ListDeclaration__ListAssignment_3 )
            {
             before(grammarAccess.getListDeclarationAccess().getListAssignment_3()); 
            // InternalTraceryPlusPlus.g:1579:2: ( rule__ListDeclaration__ListAssignment_3 )
            // InternalTraceryPlusPlus.g:1579:3: rule__ListDeclaration__ListAssignment_3
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
    // InternalTraceryPlusPlus.g:1588:1: rule__ListDeclaration__Group_1_0__0 : rule__ListDeclaration__Group_1_0__0__Impl rule__ListDeclaration__Group_1_0__1 ;
    public final void rule__ListDeclaration__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1592:1: ( rule__ListDeclaration__Group_1_0__0__Impl rule__ListDeclaration__Group_1_0__1 )
            // InternalTraceryPlusPlus.g:1593:2: rule__ListDeclaration__Group_1_0__0__Impl rule__ListDeclaration__Group_1_0__1
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
    // InternalTraceryPlusPlus.g:1600:1: rule__ListDeclaration__Group_1_0__0__Impl : ( 'can' ) ;
    public final void rule__ListDeclaration__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1604:1: ( ( 'can' ) )
            // InternalTraceryPlusPlus.g:1605:1: ( 'can' )
            {
            // InternalTraceryPlusPlus.g:1605:1: ( 'can' )
            // InternalTraceryPlusPlus.g:1606:2: 'can'
            {
             before(grammarAccess.getListDeclarationAccess().getCanKeyword_1_0_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1615:1: rule__ListDeclaration__Group_1_0__1 : rule__ListDeclaration__Group_1_0__1__Impl rule__ListDeclaration__Group_1_0__2 ;
    public final void rule__ListDeclaration__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1619:1: ( rule__ListDeclaration__Group_1_0__1__Impl rule__ListDeclaration__Group_1_0__2 )
            // InternalTraceryPlusPlus.g:1620:2: rule__ListDeclaration__Group_1_0__1__Impl rule__ListDeclaration__Group_1_0__2
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
    // InternalTraceryPlusPlus.g:1627:1: rule__ListDeclaration__Group_1_0__1__Impl : ( 'have' ) ;
    public final void rule__ListDeclaration__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1631:1: ( ( 'have' ) )
            // InternalTraceryPlusPlus.g:1632:1: ( 'have' )
            {
            // InternalTraceryPlusPlus.g:1632:1: ( 'have' )
            // InternalTraceryPlusPlus.g:1633:2: 'have'
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
    // InternalTraceryPlusPlus.g:1642:1: rule__ListDeclaration__Group_1_0__2 : rule__ListDeclaration__Group_1_0__2__Impl ;
    public final void rule__ListDeclaration__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1646:1: ( rule__ListDeclaration__Group_1_0__2__Impl )
            // InternalTraceryPlusPlus.g:1647:2: rule__ListDeclaration__Group_1_0__2__Impl
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
    // InternalTraceryPlusPlus.g:1653:1: rule__ListDeclaration__Group_1_0__2__Impl : ( 'values' ) ;
    public final void rule__ListDeclaration__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1657:1: ( ( 'values' ) )
            // InternalTraceryPlusPlus.g:1658:1: ( 'values' )
            {
            // InternalTraceryPlusPlus.g:1658:1: ( 'values' )
            // InternalTraceryPlusPlus.g:1659:2: 'values'
            {
             before(grammarAccess.getListDeclarationAccess().getValuesKeyword_1_0_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1669:1: rule__ListDeclaration__Group_1_1__0 : rule__ListDeclaration__Group_1_1__0__Impl rule__ListDeclaration__Group_1_1__1 ;
    public final void rule__ListDeclaration__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1673:1: ( rule__ListDeclaration__Group_1_1__0__Impl rule__ListDeclaration__Group_1_1__1 )
            // InternalTraceryPlusPlus.g:1674:2: rule__ListDeclaration__Group_1_1__0__Impl rule__ListDeclaration__Group_1_1__1
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
    // InternalTraceryPlusPlus.g:1681:1: rule__ListDeclaration__Group_1_1__0__Impl : ( 'can' ) ;
    public final void rule__ListDeclaration__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1685:1: ( ( 'can' ) )
            // InternalTraceryPlusPlus.g:1686:1: ( 'can' )
            {
            // InternalTraceryPlusPlus.g:1686:1: ( 'can' )
            // InternalTraceryPlusPlus.g:1687:2: 'can'
            {
             before(grammarAccess.getListDeclarationAccess().getCanKeyword_1_1_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1696:1: rule__ListDeclaration__Group_1_1__1 : rule__ListDeclaration__Group_1_1__1__Impl ;
    public final void rule__ListDeclaration__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1700:1: ( rule__ListDeclaration__Group_1_1__1__Impl )
            // InternalTraceryPlusPlus.g:1701:2: rule__ListDeclaration__Group_1_1__1__Impl
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
    // InternalTraceryPlusPlus.g:1707:1: rule__ListDeclaration__Group_1_1__1__Impl : ( 'be' ) ;
    public final void rule__ListDeclaration__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1711:1: ( ( 'be' ) )
            // InternalTraceryPlusPlus.g:1712:1: ( 'be' )
            {
            // InternalTraceryPlusPlus.g:1712:1: ( 'be' )
            // InternalTraceryPlusPlus.g:1713:2: 'be'
            {
             before(grammarAccess.getListDeclarationAccess().getBeKeyword_1_1_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1723:1: rule__ListDeclaration__Group_1_2__0 : rule__ListDeclaration__Group_1_2__0__Impl rule__ListDeclaration__Group_1_2__1 ;
    public final void rule__ListDeclaration__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1727:1: ( rule__ListDeclaration__Group_1_2__0__Impl rule__ListDeclaration__Group_1_2__1 )
            // InternalTraceryPlusPlus.g:1728:2: rule__ListDeclaration__Group_1_2__0__Impl rule__ListDeclaration__Group_1_2__1
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
    // InternalTraceryPlusPlus.g:1735:1: rule__ListDeclaration__Group_1_2__0__Impl : ( ( rule__ListDeclaration__Alternatives_1_2_0 ) ) ;
    public final void rule__ListDeclaration__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1739:1: ( ( ( rule__ListDeclaration__Alternatives_1_2_0 ) ) )
            // InternalTraceryPlusPlus.g:1740:1: ( ( rule__ListDeclaration__Alternatives_1_2_0 ) )
            {
            // InternalTraceryPlusPlus.g:1740:1: ( ( rule__ListDeclaration__Alternatives_1_2_0 ) )
            // InternalTraceryPlusPlus.g:1741:2: ( rule__ListDeclaration__Alternatives_1_2_0 )
            {
             before(grammarAccess.getListDeclarationAccess().getAlternatives_1_2_0()); 
            // InternalTraceryPlusPlus.g:1742:2: ( rule__ListDeclaration__Alternatives_1_2_0 )
            // InternalTraceryPlusPlus.g:1742:3: rule__ListDeclaration__Alternatives_1_2_0
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
    // InternalTraceryPlusPlus.g:1750:1: rule__ListDeclaration__Group_1_2__1 : rule__ListDeclaration__Group_1_2__1__Impl ;
    public final void rule__ListDeclaration__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1754:1: ( rule__ListDeclaration__Group_1_2__1__Impl )
            // InternalTraceryPlusPlus.g:1755:2: rule__ListDeclaration__Group_1_2__1__Impl
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
    // InternalTraceryPlusPlus.g:1761:1: rule__ListDeclaration__Group_1_2__1__Impl : ( 'values' ) ;
    public final void rule__ListDeclaration__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1765:1: ( ( 'values' ) )
            // InternalTraceryPlusPlus.g:1766:1: ( 'values' )
            {
            // InternalTraceryPlusPlus.g:1766:1: ( 'values' )
            // InternalTraceryPlusPlus.g:1767:2: 'values'
            {
             before(grammarAccess.getListDeclarationAccess().getValuesKeyword_1_2_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1777:1: rule__ObjectDeclaration__Group__0 : rule__ObjectDeclaration__Group__0__Impl rule__ObjectDeclaration__Group__1 ;
    public final void rule__ObjectDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1781:1: ( rule__ObjectDeclaration__Group__0__Impl rule__ObjectDeclaration__Group__1 )
            // InternalTraceryPlusPlus.g:1782:2: rule__ObjectDeclaration__Group__0__Impl rule__ObjectDeclaration__Group__1
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
    // InternalTraceryPlusPlus.g:1789:1: rule__ObjectDeclaration__Group__0__Impl : ( 'There' ) ;
    public final void rule__ObjectDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1793:1: ( ( 'There' ) )
            // InternalTraceryPlusPlus.g:1794:1: ( 'There' )
            {
            // InternalTraceryPlusPlus.g:1794:1: ( 'There' )
            // InternalTraceryPlusPlus.g:1795:2: 'There'
            {
             before(grammarAccess.getObjectDeclarationAccess().getThereKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1804:1: rule__ObjectDeclaration__Group__1 : rule__ObjectDeclaration__Group__1__Impl rule__ObjectDeclaration__Group__2 ;
    public final void rule__ObjectDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1808:1: ( rule__ObjectDeclaration__Group__1__Impl rule__ObjectDeclaration__Group__2 )
            // InternalTraceryPlusPlus.g:1809:2: rule__ObjectDeclaration__Group__1__Impl rule__ObjectDeclaration__Group__2
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
    // InternalTraceryPlusPlus.g:1816:1: rule__ObjectDeclaration__Group__1__Impl : ( ( rule__ObjectDeclaration__Alternatives_1 ) ) ;
    public final void rule__ObjectDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1820:1: ( ( ( rule__ObjectDeclaration__Alternatives_1 ) ) )
            // InternalTraceryPlusPlus.g:1821:1: ( ( rule__ObjectDeclaration__Alternatives_1 ) )
            {
            // InternalTraceryPlusPlus.g:1821:1: ( ( rule__ObjectDeclaration__Alternatives_1 ) )
            // InternalTraceryPlusPlus.g:1822:2: ( rule__ObjectDeclaration__Alternatives_1 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getAlternatives_1()); 
            // InternalTraceryPlusPlus.g:1823:2: ( rule__ObjectDeclaration__Alternatives_1 )
            // InternalTraceryPlusPlus.g:1823:3: rule__ObjectDeclaration__Alternatives_1
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
    // InternalTraceryPlusPlus.g:1831:1: rule__ObjectDeclaration__Group__2 : rule__ObjectDeclaration__Group__2__Impl rule__ObjectDeclaration__Group__3 ;
    public final void rule__ObjectDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1835:1: ( rule__ObjectDeclaration__Group__2__Impl rule__ObjectDeclaration__Group__3 )
            // InternalTraceryPlusPlus.g:1836:2: rule__ObjectDeclaration__Group__2__Impl rule__ObjectDeclaration__Group__3
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
    // InternalTraceryPlusPlus.g:1843:1: rule__ObjectDeclaration__Group__2__Impl : ( ( rule__ObjectDeclaration__Alternatives_2 )? ) ;
    public final void rule__ObjectDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1847:1: ( ( ( rule__ObjectDeclaration__Alternatives_2 )? ) )
            // InternalTraceryPlusPlus.g:1848:1: ( ( rule__ObjectDeclaration__Alternatives_2 )? )
            {
            // InternalTraceryPlusPlus.g:1848:1: ( ( rule__ObjectDeclaration__Alternatives_2 )? )
            // InternalTraceryPlusPlus.g:1849:2: ( rule__ObjectDeclaration__Alternatives_2 )?
            {
             before(grammarAccess.getObjectDeclarationAccess().getAlternatives_2()); 
            // InternalTraceryPlusPlus.g:1850:2: ( rule__ObjectDeclaration__Alternatives_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=20 && LA24_0<=21)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1850:3: rule__ObjectDeclaration__Alternatives_2
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
    // InternalTraceryPlusPlus.g:1858:1: rule__ObjectDeclaration__Group__3 : rule__ObjectDeclaration__Group__3__Impl rule__ObjectDeclaration__Group__4 ;
    public final void rule__ObjectDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1862:1: ( rule__ObjectDeclaration__Group__3__Impl rule__ObjectDeclaration__Group__4 )
            // InternalTraceryPlusPlus.g:1863:2: rule__ObjectDeclaration__Group__3__Impl rule__ObjectDeclaration__Group__4
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
    // InternalTraceryPlusPlus.g:1870:1: rule__ObjectDeclaration__Group__3__Impl : ( ( rule__ObjectDeclaration__NameAssignment_3 ) ) ;
    public final void rule__ObjectDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1874:1: ( ( ( rule__ObjectDeclaration__NameAssignment_3 ) ) )
            // InternalTraceryPlusPlus.g:1875:1: ( ( rule__ObjectDeclaration__NameAssignment_3 ) )
            {
            // InternalTraceryPlusPlus.g:1875:1: ( ( rule__ObjectDeclaration__NameAssignment_3 ) )
            // InternalTraceryPlusPlus.g:1876:2: ( rule__ObjectDeclaration__NameAssignment_3 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getNameAssignment_3()); 
            // InternalTraceryPlusPlus.g:1877:2: ( rule__ObjectDeclaration__NameAssignment_3 )
            // InternalTraceryPlusPlus.g:1877:3: rule__ObjectDeclaration__NameAssignment_3
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
    // InternalTraceryPlusPlus.g:1885:1: rule__ObjectDeclaration__Group__4 : rule__ObjectDeclaration__Group__4__Impl rule__ObjectDeclaration__Group__5 ;
    public final void rule__ObjectDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1889:1: ( rule__ObjectDeclaration__Group__4__Impl rule__ObjectDeclaration__Group__5 )
            // InternalTraceryPlusPlus.g:1890:2: rule__ObjectDeclaration__Group__4__Impl rule__ObjectDeclaration__Group__5
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
    // InternalTraceryPlusPlus.g:1897:1: rule__ObjectDeclaration__Group__4__Impl : ( ( rule__ObjectDeclaration__PronounsAssignment_4 ) ) ;
    public final void rule__ObjectDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1901:1: ( ( ( rule__ObjectDeclaration__PronounsAssignment_4 ) ) )
            // InternalTraceryPlusPlus.g:1902:1: ( ( rule__ObjectDeclaration__PronounsAssignment_4 ) )
            {
            // InternalTraceryPlusPlus.g:1902:1: ( ( rule__ObjectDeclaration__PronounsAssignment_4 ) )
            // InternalTraceryPlusPlus.g:1903:2: ( rule__ObjectDeclaration__PronounsAssignment_4 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getPronounsAssignment_4()); 
            // InternalTraceryPlusPlus.g:1904:2: ( rule__ObjectDeclaration__PronounsAssignment_4 )
            // InternalTraceryPlusPlus.g:1904:3: rule__ObjectDeclaration__PronounsAssignment_4
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
    // InternalTraceryPlusPlus.g:1912:1: rule__ObjectDeclaration__Group__5 : rule__ObjectDeclaration__Group__5__Impl rule__ObjectDeclaration__Group__6 ;
    public final void rule__ObjectDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1916:1: ( rule__ObjectDeclaration__Group__5__Impl rule__ObjectDeclaration__Group__6 )
            // InternalTraceryPlusPlus.g:1917:2: rule__ObjectDeclaration__Group__5__Impl rule__ObjectDeclaration__Group__6
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
    // InternalTraceryPlusPlus.g:1924:1: rule__ObjectDeclaration__Group__5__Impl : ( ( rule__ObjectDeclaration__Alternatives_5 ) ) ;
    public final void rule__ObjectDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1928:1: ( ( ( rule__ObjectDeclaration__Alternatives_5 ) ) )
            // InternalTraceryPlusPlus.g:1929:1: ( ( rule__ObjectDeclaration__Alternatives_5 ) )
            {
            // InternalTraceryPlusPlus.g:1929:1: ( ( rule__ObjectDeclaration__Alternatives_5 ) )
            // InternalTraceryPlusPlus.g:1930:2: ( rule__ObjectDeclaration__Alternatives_5 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getAlternatives_5()); 
            // InternalTraceryPlusPlus.g:1931:2: ( rule__ObjectDeclaration__Alternatives_5 )
            // InternalTraceryPlusPlus.g:1931:3: rule__ObjectDeclaration__Alternatives_5
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
    // InternalTraceryPlusPlus.g:1939:1: rule__ObjectDeclaration__Group__6 : rule__ObjectDeclaration__Group__6__Impl rule__ObjectDeclaration__Group__7 ;
    public final void rule__ObjectDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1943:1: ( rule__ObjectDeclaration__Group__6__Impl rule__ObjectDeclaration__Group__7 )
            // InternalTraceryPlusPlus.g:1944:2: rule__ObjectDeclaration__Group__6__Impl rule__ObjectDeclaration__Group__7
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
    // InternalTraceryPlusPlus.g:1951:1: rule__ObjectDeclaration__Group__6__Impl : ( ( 'attributes' )? ) ;
    public final void rule__ObjectDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1955:1: ( ( ( 'attributes' )? ) )
            // InternalTraceryPlusPlus.g:1956:1: ( ( 'attributes' )? )
            {
            // InternalTraceryPlusPlus.g:1956:1: ( ( 'attributes' )? )
            // InternalTraceryPlusPlus.g:1957:2: ( 'attributes' )?
            {
             before(grammarAccess.getObjectDeclarationAccess().getAttributesKeyword_6()); 
            // InternalTraceryPlusPlus.g:1958:2: ( 'attributes' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==44) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1958:3: 'attributes'
                    {
                    match(input,44,FOLLOW_2); 

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
    // InternalTraceryPlusPlus.g:1966:1: rule__ObjectDeclaration__Group__7 : rule__ObjectDeclaration__Group__7__Impl rule__ObjectDeclaration__Group__8 ;
    public final void rule__ObjectDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1970:1: ( rule__ObjectDeclaration__Group__7__Impl rule__ObjectDeclaration__Group__8 )
            // InternalTraceryPlusPlus.g:1971:2: rule__ObjectDeclaration__Group__7__Impl rule__ObjectDeclaration__Group__8
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
    // InternalTraceryPlusPlus.g:1978:1: rule__ObjectDeclaration__Group__7__Impl : ( ( ruleAssignmentOperator )? ) ;
    public final void rule__ObjectDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1982:1: ( ( ( ruleAssignmentOperator )? ) )
            // InternalTraceryPlusPlus.g:1983:1: ( ( ruleAssignmentOperator )? )
            {
            // InternalTraceryPlusPlus.g:1983:1: ( ( ruleAssignmentOperator )? )
            // InternalTraceryPlusPlus.g:1984:2: ( ruleAssignmentOperator )?
            {
             before(grammarAccess.getObjectDeclarationAccess().getAssignmentOperatorParserRuleCall_7()); 
            // InternalTraceryPlusPlus.g:1985:2: ( ruleAssignmentOperator )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=29 && LA26_0<=32)||LA26_0==49) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1985:3: ruleAssignmentOperator
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
    // InternalTraceryPlusPlus.g:1993:1: rule__ObjectDeclaration__Group__8 : rule__ObjectDeclaration__Group__8__Impl ;
    public final void rule__ObjectDeclaration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1997:1: ( rule__ObjectDeclaration__Group__8__Impl )
            // InternalTraceryPlusPlus.g:1998:2: rule__ObjectDeclaration__Group__8__Impl
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
    // InternalTraceryPlusPlus.g:2004:1: rule__ObjectDeclaration__Group__8__Impl : ( ( rule__ObjectDeclaration__AttributesAssignment_8 ) ) ;
    public final void rule__ObjectDeclaration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2008:1: ( ( ( rule__ObjectDeclaration__AttributesAssignment_8 ) ) )
            // InternalTraceryPlusPlus.g:2009:1: ( ( rule__ObjectDeclaration__AttributesAssignment_8 ) )
            {
            // InternalTraceryPlusPlus.g:2009:1: ( ( rule__ObjectDeclaration__AttributesAssignment_8 ) )
            // InternalTraceryPlusPlus.g:2010:2: ( rule__ObjectDeclaration__AttributesAssignment_8 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getAttributesAssignment_8()); 
            // InternalTraceryPlusPlus.g:2011:2: ( rule__ObjectDeclaration__AttributesAssignment_8 )
            // InternalTraceryPlusPlus.g:2011:3: rule__ObjectDeclaration__AttributesAssignment_8
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


    // $ANTLR start "rule__SubstoryDeclaration__Group__0"
    // InternalTraceryPlusPlus.g:2020:1: rule__SubstoryDeclaration__Group__0 : rule__SubstoryDeclaration__Group__0__Impl rule__SubstoryDeclaration__Group__1 ;
    public final void rule__SubstoryDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2024:1: ( rule__SubstoryDeclaration__Group__0__Impl rule__SubstoryDeclaration__Group__1 )
            // InternalTraceryPlusPlus.g:2025:2: rule__SubstoryDeclaration__Group__0__Impl rule__SubstoryDeclaration__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__SubstoryDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubstoryDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstoryDeclaration__Group__0"


    // $ANTLR start "rule__SubstoryDeclaration__Group__0__Impl"
    // InternalTraceryPlusPlus.g:2032:1: rule__SubstoryDeclaration__Group__0__Impl : ( ( 'define' )? ) ;
    public final void rule__SubstoryDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2036:1: ( ( ( 'define' )? ) )
            // InternalTraceryPlusPlus.g:2037:1: ( ( 'define' )? )
            {
            // InternalTraceryPlusPlus.g:2037:1: ( ( 'define' )? )
            // InternalTraceryPlusPlus.g:2038:2: ( 'define' )?
            {
             before(grammarAccess.getSubstoryDeclarationAccess().getDefineKeyword_0()); 
            // InternalTraceryPlusPlus.g:2039:2: ( 'define' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTraceryPlusPlus.g:2039:3: 'define'
                    {
                    match(input,45,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSubstoryDeclarationAccess().getDefineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstoryDeclaration__Group__0__Impl"


    // $ANTLR start "rule__SubstoryDeclaration__Group__1"
    // InternalTraceryPlusPlus.g:2047:1: rule__SubstoryDeclaration__Group__1 : rule__SubstoryDeclaration__Group__1__Impl rule__SubstoryDeclaration__Group__2 ;
    public final void rule__SubstoryDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2051:1: ( rule__SubstoryDeclaration__Group__1__Impl rule__SubstoryDeclaration__Group__2 )
            // InternalTraceryPlusPlus.g:2052:2: rule__SubstoryDeclaration__Group__1__Impl rule__SubstoryDeclaration__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__SubstoryDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubstoryDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstoryDeclaration__Group__1"


    // $ANTLR start "rule__SubstoryDeclaration__Group__1__Impl"
    // InternalTraceryPlusPlus.g:2059:1: rule__SubstoryDeclaration__Group__1__Impl : ( 'substory' ) ;
    public final void rule__SubstoryDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2063:1: ( ( 'substory' ) )
            // InternalTraceryPlusPlus.g:2064:1: ( 'substory' )
            {
            // InternalTraceryPlusPlus.g:2064:1: ( 'substory' )
            // InternalTraceryPlusPlus.g:2065:2: 'substory'
            {
             before(grammarAccess.getSubstoryDeclarationAccess().getSubstoryKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSubstoryDeclarationAccess().getSubstoryKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstoryDeclaration__Group__1__Impl"


    // $ANTLR start "rule__SubstoryDeclaration__Group__2"
    // InternalTraceryPlusPlus.g:2074:1: rule__SubstoryDeclaration__Group__2 : rule__SubstoryDeclaration__Group__2__Impl rule__SubstoryDeclaration__Group__3 ;
    public final void rule__SubstoryDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2078:1: ( rule__SubstoryDeclaration__Group__2__Impl rule__SubstoryDeclaration__Group__3 )
            // InternalTraceryPlusPlus.g:2079:2: rule__SubstoryDeclaration__Group__2__Impl rule__SubstoryDeclaration__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__SubstoryDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubstoryDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstoryDeclaration__Group__2"


    // $ANTLR start "rule__SubstoryDeclaration__Group__2__Impl"
    // InternalTraceryPlusPlus.g:2086:1: rule__SubstoryDeclaration__Group__2__Impl : ( ( rule__SubstoryDeclaration__NameAssignment_2 ) ) ;
    public final void rule__SubstoryDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2090:1: ( ( ( rule__SubstoryDeclaration__NameAssignment_2 ) ) )
            // InternalTraceryPlusPlus.g:2091:1: ( ( rule__SubstoryDeclaration__NameAssignment_2 ) )
            {
            // InternalTraceryPlusPlus.g:2091:1: ( ( rule__SubstoryDeclaration__NameAssignment_2 ) )
            // InternalTraceryPlusPlus.g:2092:2: ( rule__SubstoryDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getSubstoryDeclarationAccess().getNameAssignment_2()); 
            // InternalTraceryPlusPlus.g:2093:2: ( rule__SubstoryDeclaration__NameAssignment_2 )
            // InternalTraceryPlusPlus.g:2093:3: rule__SubstoryDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SubstoryDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubstoryDeclarationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstoryDeclaration__Group__2__Impl"


    // $ANTLR start "rule__SubstoryDeclaration__Group__3"
    // InternalTraceryPlusPlus.g:2101:1: rule__SubstoryDeclaration__Group__3 : rule__SubstoryDeclaration__Group__3__Impl rule__SubstoryDeclaration__Group__4 ;
    public final void rule__SubstoryDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2105:1: ( rule__SubstoryDeclaration__Group__3__Impl rule__SubstoryDeclaration__Group__4 )
            // InternalTraceryPlusPlus.g:2106:2: rule__SubstoryDeclaration__Group__3__Impl rule__SubstoryDeclaration__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__SubstoryDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubstoryDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstoryDeclaration__Group__3"


    // $ANTLR start "rule__SubstoryDeclaration__Group__3__Impl"
    // InternalTraceryPlusPlus.g:2113:1: rule__SubstoryDeclaration__Group__3__Impl : ( ':' ) ;
    public final void rule__SubstoryDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2117:1: ( ( ':' ) )
            // InternalTraceryPlusPlus.g:2118:1: ( ':' )
            {
            // InternalTraceryPlusPlus.g:2118:1: ( ':' )
            // InternalTraceryPlusPlus.g:2119:2: ':'
            {
             before(grammarAccess.getSubstoryDeclarationAccess().getColonKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSubstoryDeclarationAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstoryDeclaration__Group__3__Impl"


    // $ANTLR start "rule__SubstoryDeclaration__Group__4"
    // InternalTraceryPlusPlus.g:2128:1: rule__SubstoryDeclaration__Group__4 : rule__SubstoryDeclaration__Group__4__Impl rule__SubstoryDeclaration__Group__5 ;
    public final void rule__SubstoryDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2132:1: ( rule__SubstoryDeclaration__Group__4__Impl rule__SubstoryDeclaration__Group__5 )
            // InternalTraceryPlusPlus.g:2133:2: rule__SubstoryDeclaration__Group__4__Impl rule__SubstoryDeclaration__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__SubstoryDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubstoryDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstoryDeclaration__Group__4"


    // $ANTLR start "rule__SubstoryDeclaration__Group__4__Impl"
    // InternalTraceryPlusPlus.g:2140:1: rule__SubstoryDeclaration__Group__4__Impl : ( ( rule__SubstoryDeclaration__StoryAssignment_4 )* ) ;
    public final void rule__SubstoryDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2144:1: ( ( ( rule__SubstoryDeclaration__StoryAssignment_4 )* ) )
            // InternalTraceryPlusPlus.g:2145:1: ( ( rule__SubstoryDeclaration__StoryAssignment_4 )* )
            {
            // InternalTraceryPlusPlus.g:2145:1: ( ( rule__SubstoryDeclaration__StoryAssignment_4 )* )
            // InternalTraceryPlusPlus.g:2146:2: ( rule__SubstoryDeclaration__StoryAssignment_4 )*
            {
             before(grammarAccess.getSubstoryDeclarationAccess().getStoryAssignment_4()); 
            // InternalTraceryPlusPlus.g:2147:2: ( rule__SubstoryDeclaration__StoryAssignment_4 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_STRING)||LA28_0==47) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:2147:3: rule__SubstoryDeclaration__StoryAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__SubstoryDeclaration__StoryAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getSubstoryDeclarationAccess().getStoryAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstoryDeclaration__Group__4__Impl"


    // $ANTLR start "rule__SubstoryDeclaration__Group__5"
    // InternalTraceryPlusPlus.g:2155:1: rule__SubstoryDeclaration__Group__5 : rule__SubstoryDeclaration__Group__5__Impl ;
    public final void rule__SubstoryDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2159:1: ( rule__SubstoryDeclaration__Group__5__Impl )
            // InternalTraceryPlusPlus.g:2160:2: rule__SubstoryDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubstoryDeclaration__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstoryDeclaration__Group__5"


    // $ANTLR start "rule__SubstoryDeclaration__Group__5__Impl"
    // InternalTraceryPlusPlus.g:2166:1: rule__SubstoryDeclaration__Group__5__Impl : ( 'end-substory' ) ;
    public final void rule__SubstoryDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2170:1: ( ( 'end-substory' ) )
            // InternalTraceryPlusPlus.g:2171:1: ( 'end-substory' )
            {
            // InternalTraceryPlusPlus.g:2171:1: ( 'end-substory' )
            // InternalTraceryPlusPlus.g:2172:2: 'end-substory'
            {
             before(grammarAccess.getSubstoryDeclarationAccess().getEndSubstoryKeyword_5()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSubstoryDeclarationAccess().getEndSubstoryKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstoryDeclaration__Group__5__Impl"


    // $ANTLR start "rule__NameExistingListAttribute__Group__0"
    // InternalTraceryPlusPlus.g:2182:1: rule__NameExistingListAttribute__Group__0 : rule__NameExistingListAttribute__Group__0__Impl rule__NameExistingListAttribute__Group__1 ;
    public final void rule__NameExistingListAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2186:1: ( rule__NameExistingListAttribute__Group__0__Impl rule__NameExistingListAttribute__Group__1 )
            // InternalTraceryPlusPlus.g:2187:2: rule__NameExistingListAttribute__Group__0__Impl rule__NameExistingListAttribute__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalTraceryPlusPlus.g:2194:1: rule__NameExistingListAttribute__Group__0__Impl : ( ( rule__NameExistingListAttribute__NameAssignment_0 ) ) ;
    public final void rule__NameExistingListAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2198:1: ( ( ( rule__NameExistingListAttribute__NameAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:2199:1: ( ( rule__NameExistingListAttribute__NameAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:2199:1: ( ( rule__NameExistingListAttribute__NameAssignment_0 ) )
            // InternalTraceryPlusPlus.g:2200:2: ( rule__NameExistingListAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getNameExistingListAttributeAccess().getNameAssignment_0()); 
            // InternalTraceryPlusPlus.g:2201:2: ( rule__NameExistingListAttribute__NameAssignment_0 )
            // InternalTraceryPlusPlus.g:2201:3: rule__NameExistingListAttribute__NameAssignment_0
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
    // InternalTraceryPlusPlus.g:2209:1: rule__NameExistingListAttribute__Group__1 : rule__NameExistingListAttribute__Group__1__Impl rule__NameExistingListAttribute__Group__2 ;
    public final void rule__NameExistingListAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2213:1: ( rule__NameExistingListAttribute__Group__1__Impl rule__NameExistingListAttribute__Group__2 )
            // InternalTraceryPlusPlus.g:2214:2: rule__NameExistingListAttribute__Group__1__Impl rule__NameExistingListAttribute__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalTraceryPlusPlus.g:2221:1: rule__NameExistingListAttribute__Group__1__Impl : ( ( rule__NameExistingListAttribute__Alternatives_1 )? ) ;
    public final void rule__NameExistingListAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2225:1: ( ( ( rule__NameExistingListAttribute__Alternatives_1 )? ) )
            // InternalTraceryPlusPlus.g:2226:1: ( ( rule__NameExistingListAttribute__Alternatives_1 )? )
            {
            // InternalTraceryPlusPlus.g:2226:1: ( ( rule__NameExistingListAttribute__Alternatives_1 )? )
            // InternalTraceryPlusPlus.g:2227:2: ( rule__NameExistingListAttribute__Alternatives_1 )?
            {
             before(grammarAccess.getNameExistingListAttributeAccess().getAlternatives_1()); 
            // InternalTraceryPlusPlus.g:2228:2: ( rule__NameExistingListAttribute__Alternatives_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==22||(LA29_0>=29 && LA29_0<=32)||LA29_0==49) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalTraceryPlusPlus.g:2228:3: rule__NameExistingListAttribute__Alternatives_1
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
    // InternalTraceryPlusPlus.g:2236:1: rule__NameExistingListAttribute__Group__2 : rule__NameExistingListAttribute__Group__2__Impl ;
    public final void rule__NameExistingListAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2240:1: ( rule__NameExistingListAttribute__Group__2__Impl )
            // InternalTraceryPlusPlus.g:2241:2: rule__NameExistingListAttribute__Group__2__Impl
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
    // InternalTraceryPlusPlus.g:2247:1: rule__NameExistingListAttribute__Group__2__Impl : ( ( rule__NameExistingListAttribute__ValueAssignment_2 ) ) ;
    public final void rule__NameExistingListAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2251:1: ( ( ( rule__NameExistingListAttribute__ValueAssignment_2 ) ) )
            // InternalTraceryPlusPlus.g:2252:1: ( ( rule__NameExistingListAttribute__ValueAssignment_2 ) )
            {
            // InternalTraceryPlusPlus.g:2252:1: ( ( rule__NameExistingListAttribute__ValueAssignment_2 ) )
            // InternalTraceryPlusPlus.g:2253:2: ( rule__NameExistingListAttribute__ValueAssignment_2 )
            {
             before(grammarAccess.getNameExistingListAttributeAccess().getValueAssignment_2()); 
            // InternalTraceryPlusPlus.g:2254:2: ( rule__NameExistingListAttribute__ValueAssignment_2 )
            // InternalTraceryPlusPlus.g:2254:3: rule__NameExistingListAttribute__ValueAssignment_2
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
    // InternalTraceryPlusPlus.g:2263:1: rule__NameValueAttribute__Group__0 : rule__NameValueAttribute__Group__0__Impl rule__NameValueAttribute__Group__1 ;
    public final void rule__NameValueAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2267:1: ( rule__NameValueAttribute__Group__0__Impl rule__NameValueAttribute__Group__1 )
            // InternalTraceryPlusPlus.g:2268:2: rule__NameValueAttribute__Group__0__Impl rule__NameValueAttribute__Group__1
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
    // InternalTraceryPlusPlus.g:2275:1: rule__NameValueAttribute__Group__0__Impl : ( ( rule__NameValueAttribute__NameAssignment_0 ) ) ;
    public final void rule__NameValueAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2279:1: ( ( ( rule__NameValueAttribute__NameAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:2280:1: ( ( rule__NameValueAttribute__NameAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:2280:1: ( ( rule__NameValueAttribute__NameAssignment_0 ) )
            // InternalTraceryPlusPlus.g:2281:2: ( rule__NameValueAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getNameValueAttributeAccess().getNameAssignment_0()); 
            // InternalTraceryPlusPlus.g:2282:2: ( rule__NameValueAttribute__NameAssignment_0 )
            // InternalTraceryPlusPlus.g:2282:3: rule__NameValueAttribute__NameAssignment_0
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
    // InternalTraceryPlusPlus.g:2290:1: rule__NameValueAttribute__Group__1 : rule__NameValueAttribute__Group__1__Impl rule__NameValueAttribute__Group__2 ;
    public final void rule__NameValueAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2294:1: ( rule__NameValueAttribute__Group__1__Impl rule__NameValueAttribute__Group__2 )
            // InternalTraceryPlusPlus.g:2295:2: rule__NameValueAttribute__Group__1__Impl rule__NameValueAttribute__Group__2
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
    // InternalTraceryPlusPlus.g:2302:1: rule__NameValueAttribute__Group__1__Impl : ( ( ruleAssignmentOperator )? ) ;
    public final void rule__NameValueAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2306:1: ( ( ( ruleAssignmentOperator )? ) )
            // InternalTraceryPlusPlus.g:2307:1: ( ( ruleAssignmentOperator )? )
            {
            // InternalTraceryPlusPlus.g:2307:1: ( ( ruleAssignmentOperator )? )
            // InternalTraceryPlusPlus.g:2308:2: ( ruleAssignmentOperator )?
            {
             before(grammarAccess.getNameValueAttributeAccess().getAssignmentOperatorParserRuleCall_1()); 
            // InternalTraceryPlusPlus.g:2309:2: ( ruleAssignmentOperator )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=29 && LA30_0<=32)||LA30_0==49) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalTraceryPlusPlus.g:2309:3: ruleAssignmentOperator
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
    // InternalTraceryPlusPlus.g:2317:1: rule__NameValueAttribute__Group__2 : rule__NameValueAttribute__Group__2__Impl ;
    public final void rule__NameValueAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2321:1: ( rule__NameValueAttribute__Group__2__Impl )
            // InternalTraceryPlusPlus.g:2322:2: rule__NameValueAttribute__Group__2__Impl
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
    // InternalTraceryPlusPlus.g:2328:1: rule__NameValueAttribute__Group__2__Impl : ( ( rule__NameValueAttribute__ValueAssignment_2 ) ) ;
    public final void rule__NameValueAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2332:1: ( ( ( rule__NameValueAttribute__ValueAssignment_2 ) ) )
            // InternalTraceryPlusPlus.g:2333:1: ( ( rule__NameValueAttribute__ValueAssignment_2 ) )
            {
            // InternalTraceryPlusPlus.g:2333:1: ( ( rule__NameValueAttribute__ValueAssignment_2 ) )
            // InternalTraceryPlusPlus.g:2334:2: ( rule__NameValueAttribute__ValueAssignment_2 )
            {
             before(grammarAccess.getNameValueAttributeAccess().getValueAssignment_2()); 
            // InternalTraceryPlusPlus.g:2335:2: ( rule__NameValueAttribute__ValueAssignment_2 )
            // InternalTraceryPlusPlus.g:2335:3: rule__NameValueAttribute__ValueAssignment_2
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


    // $ANTLR start "rule__ListUse__Group__0"
    // InternalTraceryPlusPlus.g:2344:1: rule__ListUse__Group__0 : rule__ListUse__Group__0__Impl rule__ListUse__Group__1 ;
    public final void rule__ListUse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2348:1: ( rule__ListUse__Group__0__Impl rule__ListUse__Group__1 )
            // InternalTraceryPlusPlus.g:2349:2: rule__ListUse__Group__0__Impl rule__ListUse__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ListUse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListUse__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListUse__Group__0"


    // $ANTLR start "rule__ListUse__Group__0__Impl"
    // InternalTraceryPlusPlus.g:2356:1: rule__ListUse__Group__0__Impl : ( ( rule__ListUse__VariableAssignment_0 ) ) ;
    public final void rule__ListUse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2360:1: ( ( ( rule__ListUse__VariableAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:2361:1: ( ( rule__ListUse__VariableAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:2361:1: ( ( rule__ListUse__VariableAssignment_0 ) )
            // InternalTraceryPlusPlus.g:2362:2: ( rule__ListUse__VariableAssignment_0 )
            {
             before(grammarAccess.getListUseAccess().getVariableAssignment_0()); 
            // InternalTraceryPlusPlus.g:2363:2: ( rule__ListUse__VariableAssignment_0 )
            // InternalTraceryPlusPlus.g:2363:3: rule__ListUse__VariableAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ListUse__VariableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getListUseAccess().getVariableAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListUse__Group__0__Impl"


    // $ANTLR start "rule__ListUse__Group__1"
    // InternalTraceryPlusPlus.g:2371:1: rule__ListUse__Group__1 : rule__ListUse__Group__1__Impl ;
    public final void rule__ListUse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2375:1: ( rule__ListUse__Group__1__Impl )
            // InternalTraceryPlusPlus.g:2376:2: rule__ListUse__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListUse__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListUse__Group__1"


    // $ANTLR start "rule__ListUse__Group__1__Impl"
    // InternalTraceryPlusPlus.g:2382:1: rule__ListUse__Group__1__Impl : ( ( rule__ListUse__ModifiersAssignment_1 )* ) ;
    public final void rule__ListUse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2386:1: ( ( ( rule__ListUse__ModifiersAssignment_1 )* ) )
            // InternalTraceryPlusPlus.g:2387:1: ( ( rule__ListUse__ModifiersAssignment_1 )* )
            {
            // InternalTraceryPlusPlus.g:2387:1: ( ( rule__ListUse__ModifiersAssignment_1 )* )
            // InternalTraceryPlusPlus.g:2388:2: ( rule__ListUse__ModifiersAssignment_1 )*
            {
             before(grammarAccess.getListUseAccess().getModifiersAssignment_1()); 
            // InternalTraceryPlusPlus.g:2389:2: ( rule__ListUse__ModifiersAssignment_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=11 && LA31_0<=15)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:2389:3: rule__ListUse__ModifiersAssignment_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__ListUse__ModifiersAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getListUseAccess().getModifiersAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListUse__Group__1__Impl"


    // $ANTLR start "rule__SubstoryUse__Group__0"
    // InternalTraceryPlusPlus.g:2398:1: rule__SubstoryUse__Group__0 : rule__SubstoryUse__Group__0__Impl rule__SubstoryUse__Group__1 ;
    public final void rule__SubstoryUse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2402:1: ( rule__SubstoryUse__Group__0__Impl rule__SubstoryUse__Group__1 )
            // InternalTraceryPlusPlus.g:2403:2: rule__SubstoryUse__Group__0__Impl rule__SubstoryUse__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__SubstoryUse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubstoryUse__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstoryUse__Group__0"


    // $ANTLR start "rule__SubstoryUse__Group__0__Impl"
    // InternalTraceryPlusPlus.g:2410:1: rule__SubstoryUse__Group__0__Impl : ( 'use' ) ;
    public final void rule__SubstoryUse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2414:1: ( ( 'use' ) )
            // InternalTraceryPlusPlus.g:2415:1: ( 'use' )
            {
            // InternalTraceryPlusPlus.g:2415:1: ( 'use' )
            // InternalTraceryPlusPlus.g:2416:2: 'use'
            {
             before(grammarAccess.getSubstoryUseAccess().getUseKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSubstoryUseAccess().getUseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstoryUse__Group__0__Impl"


    // $ANTLR start "rule__SubstoryUse__Group__1"
    // InternalTraceryPlusPlus.g:2425:1: rule__SubstoryUse__Group__1 : rule__SubstoryUse__Group__1__Impl rule__SubstoryUse__Group__2 ;
    public final void rule__SubstoryUse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2429:1: ( rule__SubstoryUse__Group__1__Impl rule__SubstoryUse__Group__2 )
            // InternalTraceryPlusPlus.g:2430:2: rule__SubstoryUse__Group__1__Impl rule__SubstoryUse__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__SubstoryUse__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubstoryUse__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstoryUse__Group__1"


    // $ANTLR start "rule__SubstoryUse__Group__1__Impl"
    // InternalTraceryPlusPlus.g:2437:1: rule__SubstoryUse__Group__1__Impl : ( ( rule__SubstoryUse__Alternatives_1 )? ) ;
    public final void rule__SubstoryUse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2441:1: ( ( ( rule__SubstoryUse__Alternatives_1 )? ) )
            // InternalTraceryPlusPlus.g:2442:1: ( ( rule__SubstoryUse__Alternatives_1 )? )
            {
            // InternalTraceryPlusPlus.g:2442:1: ( ( rule__SubstoryUse__Alternatives_1 )? )
            // InternalTraceryPlusPlus.g:2443:2: ( rule__SubstoryUse__Alternatives_1 )?
            {
             before(grammarAccess.getSubstoryUseAccess().getAlternatives_1()); 
            // InternalTraceryPlusPlus.g:2444:2: ( rule__SubstoryUse__Alternatives_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=23 && LA32_0<=24)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalTraceryPlusPlus.g:2444:3: rule__SubstoryUse__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubstoryUse__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubstoryUseAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstoryUse__Group__1__Impl"


    // $ANTLR start "rule__SubstoryUse__Group__2"
    // InternalTraceryPlusPlus.g:2452:1: rule__SubstoryUse__Group__2 : rule__SubstoryUse__Group__2__Impl ;
    public final void rule__SubstoryUse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2456:1: ( rule__SubstoryUse__Group__2__Impl )
            // InternalTraceryPlusPlus.g:2457:2: rule__SubstoryUse__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubstoryUse__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstoryUse__Group__2"


    // $ANTLR start "rule__SubstoryUse__Group__2__Impl"
    // InternalTraceryPlusPlus.g:2463:1: rule__SubstoryUse__Group__2__Impl : ( ( rule__SubstoryUse__VariableAssignment_2 ) ) ;
    public final void rule__SubstoryUse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2467:1: ( ( ( rule__SubstoryUse__VariableAssignment_2 ) ) )
            // InternalTraceryPlusPlus.g:2468:1: ( ( rule__SubstoryUse__VariableAssignment_2 ) )
            {
            // InternalTraceryPlusPlus.g:2468:1: ( ( rule__SubstoryUse__VariableAssignment_2 ) )
            // InternalTraceryPlusPlus.g:2469:2: ( rule__SubstoryUse__VariableAssignment_2 )
            {
             before(grammarAccess.getSubstoryUseAccess().getVariableAssignment_2()); 
            // InternalTraceryPlusPlus.g:2470:2: ( rule__SubstoryUse__VariableAssignment_2 )
            // InternalTraceryPlusPlus.g:2470:3: rule__SubstoryUse__VariableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SubstoryUse__VariableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubstoryUseAccess().getVariableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstoryUse__Group__2__Impl"


    // $ANTLR start "rule__ObjectAttribute__Group__0"
    // InternalTraceryPlusPlus.g:2479:1: rule__ObjectAttribute__Group__0 : rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1 ;
    public final void rule__ObjectAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2483:1: ( rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1 )
            // InternalTraceryPlusPlus.g:2484:2: rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalTraceryPlusPlus.g:2491:1: rule__ObjectAttribute__Group__0__Impl : ( ( rule__ObjectAttribute__ObjectAssignment_0 ) ) ;
    public final void rule__ObjectAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2495:1: ( ( ( rule__ObjectAttribute__ObjectAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:2496:1: ( ( rule__ObjectAttribute__ObjectAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:2496:1: ( ( rule__ObjectAttribute__ObjectAssignment_0 ) )
            // InternalTraceryPlusPlus.g:2497:2: ( rule__ObjectAttribute__ObjectAssignment_0 )
            {
             before(grammarAccess.getObjectAttributeAccess().getObjectAssignment_0()); 
            // InternalTraceryPlusPlus.g:2498:2: ( rule__ObjectAttribute__ObjectAssignment_0 )
            // InternalTraceryPlusPlus.g:2498:3: rule__ObjectAttribute__ObjectAssignment_0
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
    // InternalTraceryPlusPlus.g:2506:1: rule__ObjectAttribute__Group__1 : rule__ObjectAttribute__Group__1__Impl rule__ObjectAttribute__Group__2 ;
    public final void rule__ObjectAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2510:1: ( rule__ObjectAttribute__Group__1__Impl rule__ObjectAttribute__Group__2 )
            // InternalTraceryPlusPlus.g:2511:2: rule__ObjectAttribute__Group__1__Impl rule__ObjectAttribute__Group__2
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
    // InternalTraceryPlusPlus.g:2518:1: rule__ObjectAttribute__Group__1__Impl : ( '.' ) ;
    public final void rule__ObjectAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2522:1: ( ( '.' ) )
            // InternalTraceryPlusPlus.g:2523:1: ( '.' )
            {
            // InternalTraceryPlusPlus.g:2523:1: ( '.' )
            // InternalTraceryPlusPlus.g:2524:2: '.'
            {
             before(grammarAccess.getObjectAttributeAccess().getFullStopKeyword_1()); 
            match(input,48,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:2533:1: rule__ObjectAttribute__Group__2 : rule__ObjectAttribute__Group__2__Impl rule__ObjectAttribute__Group__3 ;
    public final void rule__ObjectAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2537:1: ( rule__ObjectAttribute__Group__2__Impl rule__ObjectAttribute__Group__3 )
            // InternalTraceryPlusPlus.g:2538:2: rule__ObjectAttribute__Group__2__Impl rule__ObjectAttribute__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalTraceryPlusPlus.g:2545:1: rule__ObjectAttribute__Group__2__Impl : ( ( rule__ObjectAttribute__AttributeAssignment_2 ) ) ;
    public final void rule__ObjectAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2549:1: ( ( ( rule__ObjectAttribute__AttributeAssignment_2 ) ) )
            // InternalTraceryPlusPlus.g:2550:1: ( ( rule__ObjectAttribute__AttributeAssignment_2 ) )
            {
            // InternalTraceryPlusPlus.g:2550:1: ( ( rule__ObjectAttribute__AttributeAssignment_2 ) )
            // InternalTraceryPlusPlus.g:2551:2: ( rule__ObjectAttribute__AttributeAssignment_2 )
            {
             before(grammarAccess.getObjectAttributeAccess().getAttributeAssignment_2()); 
            // InternalTraceryPlusPlus.g:2552:2: ( rule__ObjectAttribute__AttributeAssignment_2 )
            // InternalTraceryPlusPlus.g:2552:3: rule__ObjectAttribute__AttributeAssignment_2
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
    // InternalTraceryPlusPlus.g:2560:1: rule__ObjectAttribute__Group__3 : rule__ObjectAttribute__Group__3__Impl ;
    public final void rule__ObjectAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2564:1: ( rule__ObjectAttribute__Group__3__Impl )
            // InternalTraceryPlusPlus.g:2565:2: rule__ObjectAttribute__Group__3__Impl
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
    // InternalTraceryPlusPlus.g:2571:1: rule__ObjectAttribute__Group__3__Impl : ( ( rule__ObjectAttribute__ModifiersAssignment_3 )* ) ;
    public final void rule__ObjectAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2575:1: ( ( ( rule__ObjectAttribute__ModifiersAssignment_3 )* ) )
            // InternalTraceryPlusPlus.g:2576:1: ( ( rule__ObjectAttribute__ModifiersAssignment_3 )* )
            {
            // InternalTraceryPlusPlus.g:2576:1: ( ( rule__ObjectAttribute__ModifiersAssignment_3 )* )
            // InternalTraceryPlusPlus.g:2577:2: ( rule__ObjectAttribute__ModifiersAssignment_3 )*
            {
             before(grammarAccess.getObjectAttributeAccess().getModifiersAssignment_3()); 
            // InternalTraceryPlusPlus.g:2578:2: ( rule__ObjectAttribute__ModifiersAssignment_3 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=11 && LA33_0<=15)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:2578:3: rule__ObjectAttribute__ModifiersAssignment_3
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__ObjectAttribute__ModifiersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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


    // $ANTLR start "rule__ObjectPronoun__Group__0"
    // InternalTraceryPlusPlus.g:2587:1: rule__ObjectPronoun__Group__0 : rule__ObjectPronoun__Group__0__Impl rule__ObjectPronoun__Group__1 ;
    public final void rule__ObjectPronoun__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2591:1: ( rule__ObjectPronoun__Group__0__Impl rule__ObjectPronoun__Group__1 )
            // InternalTraceryPlusPlus.g:2592:2: rule__ObjectPronoun__Group__0__Impl rule__ObjectPronoun__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__ObjectPronoun__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectPronoun__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectPronoun__Group__0"


    // $ANTLR start "rule__ObjectPronoun__Group__0__Impl"
    // InternalTraceryPlusPlus.g:2599:1: rule__ObjectPronoun__Group__0__Impl : ( ( rule__ObjectPronoun__ObjectAssignment_0 ) ) ;
    public final void rule__ObjectPronoun__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2603:1: ( ( ( rule__ObjectPronoun__ObjectAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:2604:1: ( ( rule__ObjectPronoun__ObjectAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:2604:1: ( ( rule__ObjectPronoun__ObjectAssignment_0 ) )
            // InternalTraceryPlusPlus.g:2605:2: ( rule__ObjectPronoun__ObjectAssignment_0 )
            {
             before(grammarAccess.getObjectPronounAccess().getObjectAssignment_0()); 
            // InternalTraceryPlusPlus.g:2606:2: ( rule__ObjectPronoun__ObjectAssignment_0 )
            // InternalTraceryPlusPlus.g:2606:3: rule__ObjectPronoun__ObjectAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectPronoun__ObjectAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectPronounAccess().getObjectAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectPronoun__Group__0__Impl"


    // $ANTLR start "rule__ObjectPronoun__Group__1"
    // InternalTraceryPlusPlus.g:2614:1: rule__ObjectPronoun__Group__1 : rule__ObjectPronoun__Group__1__Impl rule__ObjectPronoun__Group__2 ;
    public final void rule__ObjectPronoun__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2618:1: ( rule__ObjectPronoun__Group__1__Impl rule__ObjectPronoun__Group__2 )
            // InternalTraceryPlusPlus.g:2619:2: rule__ObjectPronoun__Group__1__Impl rule__ObjectPronoun__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__ObjectPronoun__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectPronoun__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectPronoun__Group__1"


    // $ANTLR start "rule__ObjectPronoun__Group__1__Impl"
    // InternalTraceryPlusPlus.g:2626:1: rule__ObjectPronoun__Group__1__Impl : ( '.' ) ;
    public final void rule__ObjectPronoun__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2630:1: ( ( '.' ) )
            // InternalTraceryPlusPlus.g:2631:1: ( '.' )
            {
            // InternalTraceryPlusPlus.g:2631:1: ( '.' )
            // InternalTraceryPlusPlus.g:2632:2: '.'
            {
             before(grammarAccess.getObjectPronounAccess().getFullStopKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getObjectPronounAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectPronoun__Group__1__Impl"


    // $ANTLR start "rule__ObjectPronoun__Group__2"
    // InternalTraceryPlusPlus.g:2641:1: rule__ObjectPronoun__Group__2 : rule__ObjectPronoun__Group__2__Impl ;
    public final void rule__ObjectPronoun__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2645:1: ( rule__ObjectPronoun__Group__2__Impl )
            // InternalTraceryPlusPlus.g:2646:2: rule__ObjectPronoun__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectPronoun__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectPronoun__Group__2"


    // $ANTLR start "rule__ObjectPronoun__Group__2__Impl"
    // InternalTraceryPlusPlus.g:2652:1: rule__ObjectPronoun__Group__2__Impl : ( ( rule__ObjectPronoun__PronounAssignment_2 ) ) ;
    public final void rule__ObjectPronoun__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2656:1: ( ( ( rule__ObjectPronoun__PronounAssignment_2 ) ) )
            // InternalTraceryPlusPlus.g:2657:1: ( ( rule__ObjectPronoun__PronounAssignment_2 ) )
            {
            // InternalTraceryPlusPlus.g:2657:1: ( ( rule__ObjectPronoun__PronounAssignment_2 ) )
            // InternalTraceryPlusPlus.g:2658:2: ( rule__ObjectPronoun__PronounAssignment_2 )
            {
             before(grammarAccess.getObjectPronounAccess().getPronounAssignment_2()); 
            // InternalTraceryPlusPlus.g:2659:2: ( rule__ObjectPronoun__PronounAssignment_2 )
            // InternalTraceryPlusPlus.g:2659:3: rule__ObjectPronoun__PronounAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ObjectPronoun__PronounAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getObjectPronounAccess().getPronounAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectPronoun__Group__2__Impl"


    // $ANTLR start "rule__WordList__Group__0"
    // InternalTraceryPlusPlus.g:2668:1: rule__WordList__Group__0 : rule__WordList__Group__0__Impl rule__WordList__Group__1 ;
    public final void rule__WordList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2672:1: ( rule__WordList__Group__0__Impl rule__WordList__Group__1 )
            // InternalTraceryPlusPlus.g:2673:2: rule__WordList__Group__0__Impl rule__WordList__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalTraceryPlusPlus.g:2680:1: rule__WordList__Group__0__Impl : ( ( rule__WordList__WordsAssignment_0 ) ) ;
    public final void rule__WordList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2684:1: ( ( ( rule__WordList__WordsAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:2685:1: ( ( rule__WordList__WordsAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:2685:1: ( ( rule__WordList__WordsAssignment_0 ) )
            // InternalTraceryPlusPlus.g:2686:2: ( rule__WordList__WordsAssignment_0 )
            {
             before(grammarAccess.getWordListAccess().getWordsAssignment_0()); 
            // InternalTraceryPlusPlus.g:2687:2: ( rule__WordList__WordsAssignment_0 )
            // InternalTraceryPlusPlus.g:2687:3: rule__WordList__WordsAssignment_0
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
    // InternalTraceryPlusPlus.g:2695:1: rule__WordList__Group__1 : rule__WordList__Group__1__Impl ;
    public final void rule__WordList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2699:1: ( rule__WordList__Group__1__Impl )
            // InternalTraceryPlusPlus.g:2700:2: rule__WordList__Group__1__Impl
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
    // InternalTraceryPlusPlus.g:2706:1: rule__WordList__Group__1__Impl : ( ( rule__WordList__Group_1__0 )* ) ;
    public final void rule__WordList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2710:1: ( ( ( rule__WordList__Group_1__0 )* ) )
            // InternalTraceryPlusPlus.g:2711:1: ( ( rule__WordList__Group_1__0 )* )
            {
            // InternalTraceryPlusPlus.g:2711:1: ( ( rule__WordList__Group_1__0 )* )
            // InternalTraceryPlusPlus.g:2712:2: ( rule__WordList__Group_1__0 )*
            {
             before(grammarAccess.getWordListAccess().getGroup_1()); 
            // InternalTraceryPlusPlus.g:2713:2: ( rule__WordList__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=33 && LA34_0<=35)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:2713:3: rule__WordList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__WordList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalTraceryPlusPlus.g:2722:1: rule__WordList__Group_1__0 : rule__WordList__Group_1__0__Impl rule__WordList__Group_1__1 ;
    public final void rule__WordList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2726:1: ( rule__WordList__Group_1__0__Impl rule__WordList__Group_1__1 )
            // InternalTraceryPlusPlus.g:2727:2: rule__WordList__Group_1__0__Impl rule__WordList__Group_1__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalTraceryPlusPlus.g:2734:1: rule__WordList__Group_1__0__Impl : ( ruleSeparatorOr ) ;
    public final void rule__WordList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2738:1: ( ( ruleSeparatorOr ) )
            // InternalTraceryPlusPlus.g:2739:1: ( ruleSeparatorOr )
            {
            // InternalTraceryPlusPlus.g:2739:1: ( ruleSeparatorOr )
            // InternalTraceryPlusPlus.g:2740:2: ruleSeparatorOr
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
    // InternalTraceryPlusPlus.g:2749:1: rule__WordList__Group_1__1 : rule__WordList__Group_1__1__Impl ;
    public final void rule__WordList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2753:1: ( rule__WordList__Group_1__1__Impl )
            // InternalTraceryPlusPlus.g:2754:2: rule__WordList__Group_1__1__Impl
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
    // InternalTraceryPlusPlus.g:2760:1: rule__WordList__Group_1__1__Impl : ( ( rule__WordList__WordsAssignment_1_1 ) ) ;
    public final void rule__WordList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2764:1: ( ( ( rule__WordList__WordsAssignment_1_1 ) ) )
            // InternalTraceryPlusPlus.g:2765:1: ( ( rule__WordList__WordsAssignment_1_1 ) )
            {
            // InternalTraceryPlusPlus.g:2765:1: ( ( rule__WordList__WordsAssignment_1_1 ) )
            // InternalTraceryPlusPlus.g:2766:2: ( rule__WordList__WordsAssignment_1_1 )
            {
             before(grammarAccess.getWordListAccess().getWordsAssignment_1_1()); 
            // InternalTraceryPlusPlus.g:2767:2: ( rule__WordList__WordsAssignment_1_1 )
            // InternalTraceryPlusPlus.g:2767:3: rule__WordList__WordsAssignment_1_1
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
    // InternalTraceryPlusPlus.g:2776:1: rule__AttributeList__Group__0 : rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 ;
    public final void rule__AttributeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2780:1: ( rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 )
            // InternalTraceryPlusPlus.g:2781:2: rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalTraceryPlusPlus.g:2788:1: rule__AttributeList__Group__0__Impl : ( ( rule__AttributeList__AttributesAssignment_0 ) ) ;
    public final void rule__AttributeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2792:1: ( ( ( rule__AttributeList__AttributesAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:2793:1: ( ( rule__AttributeList__AttributesAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:2793:1: ( ( rule__AttributeList__AttributesAssignment_0 ) )
            // InternalTraceryPlusPlus.g:2794:2: ( rule__AttributeList__AttributesAssignment_0 )
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAssignment_0()); 
            // InternalTraceryPlusPlus.g:2795:2: ( rule__AttributeList__AttributesAssignment_0 )
            // InternalTraceryPlusPlus.g:2795:3: rule__AttributeList__AttributesAssignment_0
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
    // InternalTraceryPlusPlus.g:2803:1: rule__AttributeList__Group__1 : rule__AttributeList__Group__1__Impl ;
    public final void rule__AttributeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2807:1: ( rule__AttributeList__Group__1__Impl )
            // InternalTraceryPlusPlus.g:2808:2: rule__AttributeList__Group__1__Impl
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
    // InternalTraceryPlusPlus.g:2814:1: rule__AttributeList__Group__1__Impl : ( ( rule__AttributeList__Group_1__0 )* ) ;
    public final void rule__AttributeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2818:1: ( ( ( rule__AttributeList__Group_1__0 )* ) )
            // InternalTraceryPlusPlus.g:2819:1: ( ( rule__AttributeList__Group_1__0 )* )
            {
            // InternalTraceryPlusPlus.g:2819:1: ( ( rule__AttributeList__Group_1__0 )* )
            // InternalTraceryPlusPlus.g:2820:2: ( rule__AttributeList__Group_1__0 )*
            {
             before(grammarAccess.getAttributeListAccess().getGroup_1()); 
            // InternalTraceryPlusPlus.g:2821:2: ( rule__AttributeList__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==33||(LA35_0>=36 && LA35_0<=37)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:2821:3: rule__AttributeList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__AttributeList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalTraceryPlusPlus.g:2830:1: rule__AttributeList__Group_1__0 : rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1 ;
    public final void rule__AttributeList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2834:1: ( rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1 )
            // InternalTraceryPlusPlus.g:2835:2: rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1
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
    // InternalTraceryPlusPlus.g:2842:1: rule__AttributeList__Group_1__0__Impl : ( ruleSeparatorAnd ) ;
    public final void rule__AttributeList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2846:1: ( ( ruleSeparatorAnd ) )
            // InternalTraceryPlusPlus.g:2847:1: ( ruleSeparatorAnd )
            {
            // InternalTraceryPlusPlus.g:2847:1: ( ruleSeparatorAnd )
            // InternalTraceryPlusPlus.g:2848:2: ruleSeparatorAnd
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
    // InternalTraceryPlusPlus.g:2857:1: rule__AttributeList__Group_1__1 : rule__AttributeList__Group_1__1__Impl ;
    public final void rule__AttributeList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2861:1: ( rule__AttributeList__Group_1__1__Impl )
            // InternalTraceryPlusPlus.g:2862:2: rule__AttributeList__Group_1__1__Impl
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
    // InternalTraceryPlusPlus.g:2868:1: rule__AttributeList__Group_1__1__Impl : ( ( rule__AttributeList__AttributesAssignment_1_1 ) ) ;
    public final void rule__AttributeList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2872:1: ( ( ( rule__AttributeList__AttributesAssignment_1_1 ) ) )
            // InternalTraceryPlusPlus.g:2873:1: ( ( rule__AttributeList__AttributesAssignment_1_1 ) )
            {
            // InternalTraceryPlusPlus.g:2873:1: ( ( rule__AttributeList__AttributesAssignment_1_1 ) )
            // InternalTraceryPlusPlus.g:2874:2: ( rule__AttributeList__AttributesAssignment_1_1 )
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAssignment_1_1()); 
            // InternalTraceryPlusPlus.g:2875:2: ( rule__AttributeList__AttributesAssignment_1_1 )
            // InternalTraceryPlusPlus.g:2875:3: rule__AttributeList__AttributesAssignment_1_1
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
    // InternalTraceryPlusPlus.g:2884:1: rule__AssignmentOperator__Group_4__0 : rule__AssignmentOperator__Group_4__0__Impl rule__AssignmentOperator__Group_4__1 ;
    public final void rule__AssignmentOperator__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2888:1: ( rule__AssignmentOperator__Group_4__0__Impl rule__AssignmentOperator__Group_4__1 )
            // InternalTraceryPlusPlus.g:2889:2: rule__AssignmentOperator__Group_4__0__Impl rule__AssignmentOperator__Group_4__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalTraceryPlusPlus.g:2896:1: rule__AssignmentOperator__Group_4__0__Impl : ( 'equal' ) ;
    public final void rule__AssignmentOperator__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2900:1: ( ( 'equal' ) )
            // InternalTraceryPlusPlus.g:2901:1: ( 'equal' )
            {
            // InternalTraceryPlusPlus.g:2901:1: ( 'equal' )
            // InternalTraceryPlusPlus.g:2902:2: 'equal'
            {
             before(grammarAccess.getAssignmentOperatorAccess().getEqualKeyword_4_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:2911:1: rule__AssignmentOperator__Group_4__1 : rule__AssignmentOperator__Group_4__1__Impl ;
    public final void rule__AssignmentOperator__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2915:1: ( rule__AssignmentOperator__Group_4__1__Impl )
            // InternalTraceryPlusPlus.g:2916:2: rule__AssignmentOperator__Group_4__1__Impl
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
    // InternalTraceryPlusPlus.g:2922:1: rule__AssignmentOperator__Group_4__1__Impl : ( 'to' ) ;
    public final void rule__AssignmentOperator__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2926:1: ( ( 'to' ) )
            // InternalTraceryPlusPlus.g:2927:1: ( 'to' )
            {
            // InternalTraceryPlusPlus.g:2927:1: ( 'to' )
            // InternalTraceryPlusPlus.g:2928:2: 'to'
            {
             before(grammarAccess.getAssignmentOperatorAccess().getToKeyword_4_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:2938:1: rule__TraceryPlusPlusProgram__StatementsAssignment_0 : ( ruleStatement ) ;
    public final void rule__TraceryPlusPlusProgram__StatementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2942:1: ( ( ruleStatement ) )
            // InternalTraceryPlusPlus.g:2943:2: ( ruleStatement )
            {
            // InternalTraceryPlusPlus.g:2943:2: ( ruleStatement )
            // InternalTraceryPlusPlus.g:2944:3: ruleStatement
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
    // InternalTraceryPlusPlus.g:2953:1: rule__TraceryPlusPlusProgram__StoryAssignment_1 : ( ruleStory ) ;
    public final void rule__TraceryPlusPlusProgram__StoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2957:1: ( ( ruleStory ) )
            // InternalTraceryPlusPlus.g:2958:2: ( ruleStory )
            {
            // InternalTraceryPlusPlus.g:2958:2: ( ruleStory )
            // InternalTraceryPlusPlus.g:2959:3: ruleStory
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
    // InternalTraceryPlusPlus.g:2968:1: rule__Story__StoryAssignment_4 : ( ( rule__Story__StoryAlternatives_4_0 ) ) ;
    public final void rule__Story__StoryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2972:1: ( ( ( rule__Story__StoryAlternatives_4_0 ) ) )
            // InternalTraceryPlusPlus.g:2973:2: ( ( rule__Story__StoryAlternatives_4_0 ) )
            {
            // InternalTraceryPlusPlus.g:2973:2: ( ( rule__Story__StoryAlternatives_4_0 ) )
            // InternalTraceryPlusPlus.g:2974:3: ( rule__Story__StoryAlternatives_4_0 )
            {
             before(grammarAccess.getStoryAccess().getStoryAlternatives_4_0()); 
            // InternalTraceryPlusPlus.g:2975:3: ( rule__Story__StoryAlternatives_4_0 )
            // InternalTraceryPlusPlus.g:2975:4: rule__Story__StoryAlternatives_4_0
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
    // InternalTraceryPlusPlus.g:2983:1: rule__ListDeclaration__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ListDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2987:1: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2988:2: ( RULE_ID )
            {
            // InternalTraceryPlusPlus.g:2988:2: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2989:3: RULE_ID
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
    // InternalTraceryPlusPlus.g:2998:1: rule__ListDeclaration__ListAssignment_3 : ( ruleWordList ) ;
    public final void rule__ListDeclaration__ListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3002:1: ( ( ruleWordList ) )
            // InternalTraceryPlusPlus.g:3003:2: ( ruleWordList )
            {
            // InternalTraceryPlusPlus.g:3003:2: ( ruleWordList )
            // InternalTraceryPlusPlus.g:3004:3: ruleWordList
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
    // InternalTraceryPlusPlus.g:3013:1: rule__ObjectDeclaration__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ObjectDeclaration__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3017:1: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:3018:2: ( RULE_ID )
            {
            // InternalTraceryPlusPlus.g:3018:2: ( RULE_ID )
            // InternalTraceryPlusPlus.g:3019:3: RULE_ID
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
    // InternalTraceryPlusPlus.g:3028:1: rule__ObjectDeclaration__PronounsAssignment_4 : ( rulePronouns ) ;
    public final void rule__ObjectDeclaration__PronounsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3032:1: ( ( rulePronouns ) )
            // InternalTraceryPlusPlus.g:3033:2: ( rulePronouns )
            {
            // InternalTraceryPlusPlus.g:3033:2: ( rulePronouns )
            // InternalTraceryPlusPlus.g:3034:3: rulePronouns
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
    // InternalTraceryPlusPlus.g:3043:1: rule__ObjectDeclaration__AttributesAssignment_8 : ( ruleAttributeList ) ;
    public final void rule__ObjectDeclaration__AttributesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3047:1: ( ( ruleAttributeList ) )
            // InternalTraceryPlusPlus.g:3048:2: ( ruleAttributeList )
            {
            // InternalTraceryPlusPlus.g:3048:2: ( ruleAttributeList )
            // InternalTraceryPlusPlus.g:3049:3: ruleAttributeList
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


    // $ANTLR start "rule__SubstoryDeclaration__NameAssignment_2"
    // InternalTraceryPlusPlus.g:3058:1: rule__SubstoryDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SubstoryDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3062:1: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:3063:2: ( RULE_ID )
            {
            // InternalTraceryPlusPlus.g:3063:2: ( RULE_ID )
            // InternalTraceryPlusPlus.g:3064:3: RULE_ID
            {
             before(grammarAccess.getSubstoryDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSubstoryDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstoryDeclaration__NameAssignment_2"


    // $ANTLR start "rule__SubstoryDeclaration__StoryAssignment_4"
    // InternalTraceryPlusPlus.g:3073:1: rule__SubstoryDeclaration__StoryAssignment_4 : ( ( rule__SubstoryDeclaration__StoryAlternatives_4_0 ) ) ;
    public final void rule__SubstoryDeclaration__StoryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3077:1: ( ( ( rule__SubstoryDeclaration__StoryAlternatives_4_0 ) ) )
            // InternalTraceryPlusPlus.g:3078:2: ( ( rule__SubstoryDeclaration__StoryAlternatives_4_0 ) )
            {
            // InternalTraceryPlusPlus.g:3078:2: ( ( rule__SubstoryDeclaration__StoryAlternatives_4_0 ) )
            // InternalTraceryPlusPlus.g:3079:3: ( rule__SubstoryDeclaration__StoryAlternatives_4_0 )
            {
             before(grammarAccess.getSubstoryDeclarationAccess().getStoryAlternatives_4_0()); 
            // InternalTraceryPlusPlus.g:3080:3: ( rule__SubstoryDeclaration__StoryAlternatives_4_0 )
            // InternalTraceryPlusPlus.g:3080:4: rule__SubstoryDeclaration__StoryAlternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__SubstoryDeclaration__StoryAlternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getSubstoryDeclarationAccess().getStoryAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstoryDeclaration__StoryAssignment_4"


    // $ANTLR start "rule__Word__ValueAssignment"
    // InternalTraceryPlusPlus.g:3088:1: rule__Word__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__Word__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3092:1: ( ( RULE_STRING ) )
            // InternalTraceryPlusPlus.g:3093:2: ( RULE_STRING )
            {
            // InternalTraceryPlusPlus.g:3093:2: ( RULE_STRING )
            // InternalTraceryPlusPlus.g:3094:3: RULE_STRING
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


    // $ANTLR start "rule__NameExistingListAttribute__NameAssignment_0"
    // InternalTraceryPlusPlus.g:3103:1: rule__NameExistingListAttribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NameExistingListAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3107:1: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:3108:2: ( RULE_ID )
            {
            // InternalTraceryPlusPlus.g:3108:2: ( RULE_ID )
            // InternalTraceryPlusPlus.g:3109:3: RULE_ID
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
    // InternalTraceryPlusPlus.g:3118:1: rule__NameExistingListAttribute__ValueAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__NameExistingListAttribute__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3122:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:3123:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:3123:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:3124:3: ( RULE_ID )
            {
             before(grammarAccess.getNameExistingListAttributeAccess().getValueListDeclarationCrossReference_2_0()); 
            // InternalTraceryPlusPlus.g:3125:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:3126:4: RULE_ID
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
    // InternalTraceryPlusPlus.g:3137:1: rule__NameValueAttribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NameValueAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3141:1: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:3142:2: ( RULE_ID )
            {
            // InternalTraceryPlusPlus.g:3142:2: ( RULE_ID )
            // InternalTraceryPlusPlus.g:3143:3: RULE_ID
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
    // InternalTraceryPlusPlus.g:3152:1: rule__NameValueAttribute__ValueAssignment_2 : ( ruleWord ) ;
    public final void rule__NameValueAttribute__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3156:1: ( ( ruleWord ) )
            // InternalTraceryPlusPlus.g:3157:2: ( ruleWord )
            {
            // InternalTraceryPlusPlus.g:3157:2: ( ruleWord )
            // InternalTraceryPlusPlus.g:3158:3: ruleWord
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


    // $ANTLR start "rule__ListUse__VariableAssignment_0"
    // InternalTraceryPlusPlus.g:3167:1: rule__ListUse__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ListUse__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3171:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:3172:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:3172:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:3173:3: ( RULE_ID )
            {
             before(grammarAccess.getListUseAccess().getVariableListDeclarationCrossReference_0_0()); 
            // InternalTraceryPlusPlus.g:3174:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:3175:4: RULE_ID
            {
             before(grammarAccess.getListUseAccess().getVariableListDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getListUseAccess().getVariableListDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getListUseAccess().getVariableListDeclarationCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListUse__VariableAssignment_0"


    // $ANTLR start "rule__ListUse__ModifiersAssignment_1"
    // InternalTraceryPlusPlus.g:3186:1: rule__ListUse__ModifiersAssignment_1 : ( ruleModifier ) ;
    public final void rule__ListUse__ModifiersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3190:1: ( ( ruleModifier ) )
            // InternalTraceryPlusPlus.g:3191:2: ( ruleModifier )
            {
            // InternalTraceryPlusPlus.g:3191:2: ( ruleModifier )
            // InternalTraceryPlusPlus.g:3192:3: ruleModifier
            {
             before(grammarAccess.getListUseAccess().getModifiersModifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModifier();

            state._fsp--;

             after(grammarAccess.getListUseAccess().getModifiersModifierParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListUse__ModifiersAssignment_1"


    // $ANTLR start "rule__SubstoryUse__VariableAssignment_2"
    // InternalTraceryPlusPlus.g:3201:1: rule__SubstoryUse__VariableAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__SubstoryUse__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3205:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:3206:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:3206:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:3207:3: ( RULE_ID )
            {
             before(grammarAccess.getSubstoryUseAccess().getVariableSubstoryDeclarationCrossReference_2_0()); 
            // InternalTraceryPlusPlus.g:3208:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:3209:4: RULE_ID
            {
             before(grammarAccess.getSubstoryUseAccess().getVariableSubstoryDeclarationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSubstoryUseAccess().getVariableSubstoryDeclarationIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getSubstoryUseAccess().getVariableSubstoryDeclarationCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstoryUse__VariableAssignment_2"


    // $ANTLR start "rule__ObjectAttribute__ObjectAssignment_0"
    // InternalTraceryPlusPlus.g:3220:1: rule__ObjectAttribute__ObjectAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectAttribute__ObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3224:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:3225:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:3225:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:3226:3: ( RULE_ID )
            {
             before(grammarAccess.getObjectAttributeAccess().getObjectObjectDeclarationCrossReference_0_0()); 
            // InternalTraceryPlusPlus.g:3227:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:3228:4: RULE_ID
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
    // InternalTraceryPlusPlus.g:3239:1: rule__ObjectAttribute__AttributeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectAttribute__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3243:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:3244:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:3244:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:3245:3: ( RULE_ID )
            {
             before(grammarAccess.getObjectAttributeAccess().getAttributeAttributeCrossReference_2_0()); 
            // InternalTraceryPlusPlus.g:3246:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:3247:4: RULE_ID
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


    // $ANTLR start "rule__ObjectAttribute__ModifiersAssignment_3"
    // InternalTraceryPlusPlus.g:3258:1: rule__ObjectAttribute__ModifiersAssignment_3 : ( ruleModifier ) ;
    public final void rule__ObjectAttribute__ModifiersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3262:1: ( ( ruleModifier ) )
            // InternalTraceryPlusPlus.g:3263:2: ( ruleModifier )
            {
            // InternalTraceryPlusPlus.g:3263:2: ( ruleModifier )
            // InternalTraceryPlusPlus.g:3264:3: ruleModifier
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


    // $ANTLR start "rule__ObjectPronoun__ObjectAssignment_0"
    // InternalTraceryPlusPlus.g:3273:1: rule__ObjectPronoun__ObjectAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectPronoun__ObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3277:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:3278:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:3278:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:3279:3: ( RULE_ID )
            {
             before(grammarAccess.getObjectPronounAccess().getObjectObjectDeclarationCrossReference_0_0()); 
            // InternalTraceryPlusPlus.g:3280:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:3281:4: RULE_ID
            {
             before(grammarAccess.getObjectPronounAccess().getObjectObjectDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectPronounAccess().getObjectObjectDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getObjectPronounAccess().getObjectObjectDeclarationCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectPronoun__ObjectAssignment_0"


    // $ANTLR start "rule__ObjectPronoun__PronounAssignment_2"
    // InternalTraceryPlusPlus.g:3292:1: rule__ObjectPronoun__PronounAssignment_2 : ( rulePronounIdentifier ) ;
    public final void rule__ObjectPronoun__PronounAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3296:1: ( ( rulePronounIdentifier ) )
            // InternalTraceryPlusPlus.g:3297:2: ( rulePronounIdentifier )
            {
            // InternalTraceryPlusPlus.g:3297:2: ( rulePronounIdentifier )
            // InternalTraceryPlusPlus.g:3298:3: rulePronounIdentifier
            {
             before(grammarAccess.getObjectPronounAccess().getPronounPronounIdentifierParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePronounIdentifier();

            state._fsp--;

             after(grammarAccess.getObjectPronounAccess().getPronounPronounIdentifierParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectPronoun__PronounAssignment_2"


    // $ANTLR start "rule__WordList__WordsAssignment_0"
    // InternalTraceryPlusPlus.g:3307:1: rule__WordList__WordsAssignment_0 : ( ruleWord ) ;
    public final void rule__WordList__WordsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3311:1: ( ( ruleWord ) )
            // InternalTraceryPlusPlus.g:3312:2: ( ruleWord )
            {
            // InternalTraceryPlusPlus.g:3312:2: ( ruleWord )
            // InternalTraceryPlusPlus.g:3313:3: ruleWord
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
    // InternalTraceryPlusPlus.g:3322:1: rule__WordList__WordsAssignment_1_1 : ( ruleWord ) ;
    public final void rule__WordList__WordsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3326:1: ( ( ruleWord ) )
            // InternalTraceryPlusPlus.g:3327:2: ( ruleWord )
            {
            // InternalTraceryPlusPlus.g:3327:2: ( ruleWord )
            // InternalTraceryPlusPlus.g:3328:3: ruleWord
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
    // InternalTraceryPlusPlus.g:3337:1: rule__AttributeList__AttributesAssignment_0 : ( ruleAttribute ) ;
    public final void rule__AttributeList__AttributesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3341:1: ( ( ruleAttribute ) )
            // InternalTraceryPlusPlus.g:3342:2: ( ruleAttribute )
            {
            // InternalTraceryPlusPlus.g:3342:2: ( ruleAttribute )
            // InternalTraceryPlusPlus.g:3343:3: ruleAttribute
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
    // InternalTraceryPlusPlus.g:3352:1: rule__AttributeList__AttributesAssignment_1_1 : ( ruleAttribute ) ;
    public final void rule__AttributeList__AttributesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3356:1: ( ( ruleAttribute ) )
            // InternalTraceryPlusPlus.g:3357:2: ( ruleAttribute )
            {
            // InternalTraceryPlusPlus.g:3357:2: ( ruleAttribute )
            // InternalTraceryPlusPlus.g:3358:3: ruleAttribute
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
    // InternalTraceryPlusPlus.g:3367:1: rule__Pronouns__ValueAssignment_0 : ( ( 'He' ) ) ;
    public final void rule__Pronouns__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3371:1: ( ( ( 'He' ) ) )
            // InternalTraceryPlusPlus.g:3372:2: ( ( 'He' ) )
            {
            // InternalTraceryPlusPlus.g:3372:2: ( ( 'He' ) )
            // InternalTraceryPlusPlus.g:3373:3: ( 'He' )
            {
             before(grammarAccess.getPronounsAccess().getValueHeKeyword_0_0()); 
            // InternalTraceryPlusPlus.g:3374:3: ( 'He' )
            // InternalTraceryPlusPlus.g:3375:4: 'He'
            {
             before(grammarAccess.getPronounsAccess().getValueHeKeyword_0_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:3386:1: rule__Pronouns__ValueAssignment_1 : ( ( 'She' ) ) ;
    public final void rule__Pronouns__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3390:1: ( ( ( 'She' ) ) )
            // InternalTraceryPlusPlus.g:3391:2: ( ( 'She' ) )
            {
            // InternalTraceryPlusPlus.g:3391:2: ( ( 'She' ) )
            // InternalTraceryPlusPlus.g:3392:3: ( 'She' )
            {
             before(grammarAccess.getPronounsAccess().getValueSheKeyword_1_0()); 
            // InternalTraceryPlusPlus.g:3393:3: ( 'She' )
            // InternalTraceryPlusPlus.g:3394:4: 'She'
            {
             before(grammarAccess.getPronounsAccess().getValueSheKeyword_1_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:3405:1: rule__Pronouns__ValueAssignment_2 : ( ( 'It' ) ) ;
    public final void rule__Pronouns__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3409:1: ( ( ( 'It' ) ) )
            // InternalTraceryPlusPlus.g:3410:2: ( ( 'It' ) )
            {
            // InternalTraceryPlusPlus.g:3410:2: ( ( 'It' ) )
            // InternalTraceryPlusPlus.g:3411:3: ( 'It' )
            {
             before(grammarAccess.getPronounsAccess().getValueItKeyword_2_0()); 
            // InternalTraceryPlusPlus.g:3412:3: ( 'It' )
            // InternalTraceryPlusPlus.g:3413:4: 'It'
            {
             before(grammarAccess.getPronounsAccess().getValueItKeyword_2_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:3424:1: rule__Pronouns__ValueAssignment_3 : ( ( 'They' ) ) ;
    public final void rule__Pronouns__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3428:1: ( ( ( 'They' ) ) )
            // InternalTraceryPlusPlus.g:3429:2: ( ( 'They' ) )
            {
            // InternalTraceryPlusPlus.g:3429:2: ( ( 'They' ) )
            // InternalTraceryPlusPlus.g:3430:3: ( 'They' )
            {
             before(grammarAccess.getPronounsAccess().getValueTheyKeyword_3_0()); 
            // InternalTraceryPlusPlus.g:3431:3: ( 'They' )
            // InternalTraceryPlusPlus.g:3432:4: 'They'
            {
             before(grammarAccess.getPronounsAccess().getValueTheyKeyword_3_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:3443:1: rule__PronounIdentifier__NameAssignment : ( ( rule__PronounIdentifier__NameAlternatives_0 ) ) ;
    public final void rule__PronounIdentifier__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3447:1: ( ( ( rule__PronounIdentifier__NameAlternatives_0 ) ) )
            // InternalTraceryPlusPlus.g:3448:2: ( ( rule__PronounIdentifier__NameAlternatives_0 ) )
            {
            // InternalTraceryPlusPlus.g:3448:2: ( ( rule__PronounIdentifier__NameAlternatives_0 ) )
            // InternalTraceryPlusPlus.g:3449:3: ( rule__PronounIdentifier__NameAlternatives_0 )
            {
             before(grammarAccess.getPronounIdentifierAccess().getNameAlternatives_0()); 
            // InternalTraceryPlusPlus.g:3450:3: ( rule__PronounIdentifier__NameAlternatives_0 )
            // InternalTraceryPlusPlus.g:3450:4: rule__PronounIdentifier__NameAlternatives_0
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


    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\6\4\1\62\2\uffff\1\4";
    static final String dfa_3s = "\1\4\1\61\4\5\1\62\2\uffff\1\5";
    static final String dfa_4s = "\7\uffff\1\2\1\1\1\uffff";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\10\1\7\20\uffff\1\10\6\uffff\1\2\1\3\1\4\1\5\20\uffff\1\6",
            "\1\10\1\7",
            "\1\10\1\7",
            "\1\10\1\7",
            "\1\10\1\7",
            "\1\11",
            "",
            "",
            "\1\10\1\7"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1009:1: rule__Attribute__Alternatives : ( ( ruleNameExistingListAttribute ) | ( ruleNameValueAttribute ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000280000800012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00028001E0000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000800000000032L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000010000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00020001E0000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0078000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00021001E0000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000280000800010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000C00000000030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00020001E0400010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000000F802L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001800010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000E00000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000003200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000003200000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0004000000000000L});

}