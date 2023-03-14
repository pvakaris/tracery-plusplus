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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'has'", "'have'", "'is'", "'are'", "'a'", "'an'", "'from'", "'substory'", "'sub'", "'He'", "'She'", "'It'", "'They'", "'='", "':'", "'-'", "'-->'", "','", "'or'", "'||'", "'and'", "'&&'", "':they'", "':them'", "':their'", "':theirs'", "'-capitalize'", "'-CAPITALIZE'", "'-s'", "'-a'", "'-ed'", "'The'", "'story'", "'can'", "'values'", "'be'", "'There'", "'attributes'", "'define'", "'end-substory'", "'use'", "'.'", "'equal'", "'to'"
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
    // InternalTraceryPlusPlus.g:537:1: rulePronouns : ( ( rule__Pronouns__ValueAssignment ) ) ;
    public final void rulePronouns() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:541:2: ( ( ( rule__Pronouns__ValueAssignment ) ) )
            // InternalTraceryPlusPlus.g:542:2: ( ( rule__Pronouns__ValueAssignment ) )
            {
            // InternalTraceryPlusPlus.g:542:2: ( ( rule__Pronouns__ValueAssignment ) )
            // InternalTraceryPlusPlus.g:543:3: ( rule__Pronouns__ValueAssignment )
            {
             before(grammarAccess.getPronounsAccess().getValueAssignment()); 
            // InternalTraceryPlusPlus.g:544:3: ( rule__Pronouns__ValueAssignment )
            // InternalTraceryPlusPlus.g:544:4: rule__Pronouns__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Pronouns__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPronounsAccess().getValueAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleModifierList"
    // InternalTraceryPlusPlus.g:553:1: entryRuleModifierList : ruleModifierList EOF ;
    public final void entryRuleModifierList() throws RecognitionException {
        try {
            // InternalTraceryPlusPlus.g:554:1: ( ruleModifierList EOF )
            // InternalTraceryPlusPlus.g:555:1: ruleModifierList EOF
            {
             before(grammarAccess.getModifierListRule()); 
            pushFollow(FOLLOW_1);
            ruleModifierList();

            state._fsp--;

             after(grammarAccess.getModifierListRule()); 
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
    // $ANTLR end "entryRuleModifierList"


    // $ANTLR start "ruleModifierList"
    // InternalTraceryPlusPlus.g:562:1: ruleModifierList : ( ( rule__ModifierList__Group__0 ) ) ;
    public final void ruleModifierList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:566:2: ( ( ( rule__ModifierList__Group__0 ) ) )
            // InternalTraceryPlusPlus.g:567:2: ( ( rule__ModifierList__Group__0 ) )
            {
            // InternalTraceryPlusPlus.g:567:2: ( ( rule__ModifierList__Group__0 ) )
            // InternalTraceryPlusPlus.g:568:3: ( rule__ModifierList__Group__0 )
            {
             before(grammarAccess.getModifierListAccess().getGroup()); 
            // InternalTraceryPlusPlus.g:569:3: ( rule__ModifierList__Group__0 )
            // InternalTraceryPlusPlus.g:569:4: rule__ModifierList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModifierList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModifierListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModifierList"


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


    // $ANTLR start "rulePronounIdentifier"
    // InternalTraceryPlusPlus.g:653:1: rulePronounIdentifier : ( ( rule__PronounIdentifier__Alternatives ) ) ;
    public final void rulePronounIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:657:1: ( ( ( rule__PronounIdentifier__Alternatives ) ) )
            // InternalTraceryPlusPlus.g:658:2: ( ( rule__PronounIdentifier__Alternatives ) )
            {
            // InternalTraceryPlusPlus.g:658:2: ( ( rule__PronounIdentifier__Alternatives ) )
            // InternalTraceryPlusPlus.g:659:3: ( rule__PronounIdentifier__Alternatives )
            {
             before(grammarAccess.getPronounIdentifierAccess().getAlternatives()); 
            // InternalTraceryPlusPlus.g:660:3: ( rule__PronounIdentifier__Alternatives )
            // InternalTraceryPlusPlus.g:660:4: rule__PronounIdentifier__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PronounIdentifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPronounIdentifierAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "ruleModifier"
    // InternalTraceryPlusPlus.g:669:1: ruleModifier : ( ( rule__Modifier__Alternatives ) ) ;
    public final void ruleModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:673:1: ( ( ( rule__Modifier__Alternatives ) ) )
            // InternalTraceryPlusPlus.g:674:2: ( ( rule__Modifier__Alternatives ) )
            {
            // InternalTraceryPlusPlus.g:674:2: ( ( rule__Modifier__Alternatives ) )
            // InternalTraceryPlusPlus.g:675:3: ( rule__Modifier__Alternatives )
            {
             before(grammarAccess.getModifierAccess().getAlternatives()); 
            // InternalTraceryPlusPlus.g:676:3: ( rule__Modifier__Alternatives )
            // InternalTraceryPlusPlus.g:676:4: rule__Modifier__Alternatives
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


    // $ANTLR start "rule__Variable__Alternatives"
    // InternalTraceryPlusPlus.g:684:1: rule__Variable__Alternatives : ( ( ruleListDeclaration ) | ( ruleObjectDeclaration ) | ( ruleSubstoryDeclaration ) );
    public final void rule__Variable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:688:1: ( ( ruleListDeclaration ) | ( ruleObjectDeclaration ) | ( ruleSubstoryDeclaration ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt1=1;
                }
                break;
            case 47:
                {
                alt1=2;
                }
                break;
            case 18:
            case 49:
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
                    // InternalTraceryPlusPlus.g:689:2: ( ruleListDeclaration )
                    {
                    // InternalTraceryPlusPlus.g:689:2: ( ruleListDeclaration )
                    // InternalTraceryPlusPlus.g:690:3: ruleListDeclaration
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
                    // InternalTraceryPlusPlus.g:695:2: ( ruleObjectDeclaration )
                    {
                    // InternalTraceryPlusPlus.g:695:2: ( ruleObjectDeclaration )
                    // InternalTraceryPlusPlus.g:696:3: ruleObjectDeclaration
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
                    // InternalTraceryPlusPlus.g:701:2: ( ruleSubstoryDeclaration )
                    {
                    // InternalTraceryPlusPlus.g:701:2: ( ruleSubstoryDeclaration )
                    // InternalTraceryPlusPlus.g:702:3: ruleSubstoryDeclaration
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
    // InternalTraceryPlusPlus.g:711:1: rule__VariableUse__Alternatives : ( ( ruleListUse ) | ( ruleObjectUse ) | ( ruleSubstoryUse ) );
    public final void rule__VariableUse__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:715:1: ( ( ruleListUse ) | ( ruleObjectUse ) | ( ruleSubstoryUse ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=33 && LA2_1<=36)||LA2_1==52) ) {
                    alt2=2;
                }
                else if ( (LA2_1==EOF||(LA2_1>=RULE_ID && LA2_1<=RULE_STRING)||(LA2_1>=37 && LA2_1<=41)||(LA2_1>=50 && LA2_1<=51)) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==51) ) {
                alt2=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTraceryPlusPlus.g:716:2: ( ruleListUse )
                    {
                    // InternalTraceryPlusPlus.g:716:2: ( ruleListUse )
                    // InternalTraceryPlusPlus.g:717:3: ruleListUse
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
                    // InternalTraceryPlusPlus.g:722:2: ( ruleObjectUse )
                    {
                    // InternalTraceryPlusPlus.g:722:2: ( ruleObjectUse )
                    // InternalTraceryPlusPlus.g:723:3: ruleObjectUse
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
                    // InternalTraceryPlusPlus.g:728:2: ( ruleSubstoryUse )
                    {
                    // InternalTraceryPlusPlus.g:728:2: ( ruleSubstoryUse )
                    // InternalTraceryPlusPlus.g:729:3: ruleSubstoryUse
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
    // InternalTraceryPlusPlus.g:738:1: rule__Story__StoryAlternatives_4_0 : ( ( ruleWord ) | ( ruleVariableUse ) );
    public final void rule__Story__StoryAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:742:1: ( ( ruleWord ) | ( ruleVariableUse ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID||LA3_0==51) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTraceryPlusPlus.g:743:2: ( ruleWord )
                    {
                    // InternalTraceryPlusPlus.g:743:2: ( ruleWord )
                    // InternalTraceryPlusPlus.g:744:3: ruleWord
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
                    // InternalTraceryPlusPlus.g:749:2: ( ruleVariableUse )
                    {
                    // InternalTraceryPlusPlus.g:749:2: ( ruleVariableUse )
                    // InternalTraceryPlusPlus.g:750:3: ruleVariableUse
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
    // InternalTraceryPlusPlus.g:759:1: rule__ListDeclaration__Alternatives_1 : ( ( ( rule__ListDeclaration__Group_1_0__0 ) ) | ( ( rule__ListDeclaration__Group_1_1__0 ) ) | ( ( rule__ListDeclaration__Group_1_2__0 ) ) );
    public final void rule__ListDeclaration__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:763:1: ( ( ( rule__ListDeclaration__Group_1_0__0 ) ) | ( ( rule__ListDeclaration__Group_1_1__0 ) ) | ( ( rule__ListDeclaration__Group_1_2__0 ) ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==44) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==12) ) {
                    alt4=1;
                }
                else if ( (LA4_1==46) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA4_0>=11 && LA4_0<=12)) ) {
                alt4=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTraceryPlusPlus.g:764:2: ( ( rule__ListDeclaration__Group_1_0__0 ) )
                    {
                    // InternalTraceryPlusPlus.g:764:2: ( ( rule__ListDeclaration__Group_1_0__0 ) )
                    // InternalTraceryPlusPlus.g:765:3: ( rule__ListDeclaration__Group_1_0__0 )
                    {
                     before(grammarAccess.getListDeclarationAccess().getGroup_1_0()); 
                    // InternalTraceryPlusPlus.g:766:3: ( rule__ListDeclaration__Group_1_0__0 )
                    // InternalTraceryPlusPlus.g:766:4: rule__ListDeclaration__Group_1_0__0
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
                    // InternalTraceryPlusPlus.g:770:2: ( ( rule__ListDeclaration__Group_1_1__0 ) )
                    {
                    // InternalTraceryPlusPlus.g:770:2: ( ( rule__ListDeclaration__Group_1_1__0 ) )
                    // InternalTraceryPlusPlus.g:771:3: ( rule__ListDeclaration__Group_1_1__0 )
                    {
                     before(grammarAccess.getListDeclarationAccess().getGroup_1_1()); 
                    // InternalTraceryPlusPlus.g:772:3: ( rule__ListDeclaration__Group_1_1__0 )
                    // InternalTraceryPlusPlus.g:772:4: rule__ListDeclaration__Group_1_1__0
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
                    // InternalTraceryPlusPlus.g:776:2: ( ( rule__ListDeclaration__Group_1_2__0 ) )
                    {
                    // InternalTraceryPlusPlus.g:776:2: ( ( rule__ListDeclaration__Group_1_2__0 ) )
                    // InternalTraceryPlusPlus.g:777:3: ( rule__ListDeclaration__Group_1_2__0 )
                    {
                     before(grammarAccess.getListDeclarationAccess().getGroup_1_2()); 
                    // InternalTraceryPlusPlus.g:778:3: ( rule__ListDeclaration__Group_1_2__0 )
                    // InternalTraceryPlusPlus.g:778:4: rule__ListDeclaration__Group_1_2__0
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
    // InternalTraceryPlusPlus.g:786:1: rule__ListDeclaration__Alternatives_1_2_0 : ( ( 'has' ) | ( 'have' ) );
    public final void rule__ListDeclaration__Alternatives_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:790:1: ( ( 'has' ) | ( 'have' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTraceryPlusPlus.g:791:2: ( 'has' )
                    {
                    // InternalTraceryPlusPlus.g:791:2: ( 'has' )
                    // InternalTraceryPlusPlus.g:792:3: 'has'
                    {
                     before(grammarAccess.getListDeclarationAccess().getHasKeyword_1_2_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getListDeclarationAccess().getHasKeyword_1_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:797:2: ( 'have' )
                    {
                    // InternalTraceryPlusPlus.g:797:2: ( 'have' )
                    // InternalTraceryPlusPlus.g:798:3: 'have'
                    {
                     before(grammarAccess.getListDeclarationAccess().getHaveKeyword_1_2_0_1()); 
                    match(input,12,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:807:1: rule__ObjectDeclaration__Alternatives_1 : ( ( 'is' ) | ( 'are' ) );
    public final void rule__ObjectDeclaration__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:811:1: ( ( 'is' ) | ( 'are' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTraceryPlusPlus.g:812:2: ( 'is' )
                    {
                    // InternalTraceryPlusPlus.g:812:2: ( 'is' )
                    // InternalTraceryPlusPlus.g:813:3: 'is'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getIsKeyword_1_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getObjectDeclarationAccess().getIsKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:818:2: ( 'are' )
                    {
                    // InternalTraceryPlusPlus.g:818:2: ( 'are' )
                    // InternalTraceryPlusPlus.g:819:3: 'are'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getAreKeyword_1_1()); 
                    match(input,14,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:828:1: rule__ObjectDeclaration__Alternatives_2 : ( ( 'a' ) | ( 'an' ) );
    public final void rule__ObjectDeclaration__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:832:1: ( ( 'a' ) | ( 'an' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTraceryPlusPlus.g:833:2: ( 'a' )
                    {
                    // InternalTraceryPlusPlus.g:833:2: ( 'a' )
                    // InternalTraceryPlusPlus.g:834:3: 'a'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getAKeyword_2_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getObjectDeclarationAccess().getAKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:839:2: ( 'an' )
                    {
                    // InternalTraceryPlusPlus.g:839:2: ( 'an' )
                    // InternalTraceryPlusPlus.g:840:3: 'an'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getAnKeyword_2_1()); 
                    match(input,16,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:849:1: rule__ObjectDeclaration__Alternatives_5 : ( ( 'has' ) | ( 'have' ) );
    public final void rule__ObjectDeclaration__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:853:1: ( ( 'has' ) | ( 'have' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==11) ) {
                alt8=1;
            }
            else if ( (LA8_0==12) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTraceryPlusPlus.g:854:2: ( 'has' )
                    {
                    // InternalTraceryPlusPlus.g:854:2: ( 'has' )
                    // InternalTraceryPlusPlus.g:855:3: 'has'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getHasKeyword_5_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getObjectDeclarationAccess().getHasKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:860:2: ( 'have' )
                    {
                    // InternalTraceryPlusPlus.g:860:2: ( 'have' )
                    // InternalTraceryPlusPlus.g:861:3: 'have'
                    {
                     before(grammarAccess.getObjectDeclarationAccess().getHaveKeyword_5_1()); 
                    match(input,12,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:870:1: rule__SubstoryDeclaration__StoryAlternatives_4_0 : ( ( ruleWord ) | ( ruleVariableUse ) );
    public final void rule__SubstoryDeclaration__StoryAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:874:1: ( ( ruleWord ) | ( ruleVariableUse ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID||LA9_0==51) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalTraceryPlusPlus.g:875:2: ( ruleWord )
                    {
                    // InternalTraceryPlusPlus.g:875:2: ( ruleWord )
                    // InternalTraceryPlusPlus.g:876:3: ruleWord
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
                    // InternalTraceryPlusPlus.g:881:2: ( ruleVariableUse )
                    {
                    // InternalTraceryPlusPlus.g:881:2: ( ruleVariableUse )
                    // InternalTraceryPlusPlus.g:882:3: ruleVariableUse
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
    // InternalTraceryPlusPlus.g:891:1: rule__Attribute__Alternatives : ( ( ruleNameExistingListAttribute ) | ( ruleNameValueAttribute ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:895:1: ( ( ruleNameExistingListAttribute ) | ( ruleNameValueAttribute ) )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalTraceryPlusPlus.g:896:2: ( ruleNameExistingListAttribute )
                    {
                    // InternalTraceryPlusPlus.g:896:2: ( ruleNameExistingListAttribute )
                    // InternalTraceryPlusPlus.g:897:3: ruleNameExistingListAttribute
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
                    // InternalTraceryPlusPlus.g:902:2: ( ruleNameValueAttribute )
                    {
                    // InternalTraceryPlusPlus.g:902:2: ( ruleNameValueAttribute )
                    // InternalTraceryPlusPlus.g:903:3: ruleNameValueAttribute
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
    // InternalTraceryPlusPlus.g:912:1: rule__NameExistingListAttribute__Alternatives_1 : ( ( ruleAssignmentOperator ) | ( 'from' ) );
    public final void rule__NameExistingListAttribute__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:916:1: ( ( ruleAssignmentOperator ) | ( 'from' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13||(LA11_0>=24 && LA11_0<=27)||LA11_0==53) ) {
                alt11=1;
            }
            else if ( (LA11_0==17) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalTraceryPlusPlus.g:917:2: ( ruleAssignmentOperator )
                    {
                    // InternalTraceryPlusPlus.g:917:2: ( ruleAssignmentOperator )
                    // InternalTraceryPlusPlus.g:918:3: ruleAssignmentOperator
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
                    // InternalTraceryPlusPlus.g:923:2: ( 'from' )
                    {
                    // InternalTraceryPlusPlus.g:923:2: ( 'from' )
                    // InternalTraceryPlusPlus.g:924:3: 'from'
                    {
                     before(grammarAccess.getNameExistingListAttributeAccess().getFromKeyword_1_1()); 
                    match(input,17,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:933:1: rule__SubstoryUse__Alternatives_1 : ( ( 'substory' ) | ( 'sub' ) );
    public final void rule__SubstoryUse__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:937:1: ( ( 'substory' ) | ( 'sub' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            else if ( (LA12_0==19) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalTraceryPlusPlus.g:938:2: ( 'substory' )
                    {
                    // InternalTraceryPlusPlus.g:938:2: ( 'substory' )
                    // InternalTraceryPlusPlus.g:939:3: 'substory'
                    {
                     before(grammarAccess.getSubstoryUseAccess().getSubstoryKeyword_1_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getSubstoryUseAccess().getSubstoryKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:944:2: ( 'sub' )
                    {
                    // InternalTraceryPlusPlus.g:944:2: ( 'sub' )
                    // InternalTraceryPlusPlus.g:945:3: 'sub'
                    {
                     before(grammarAccess.getSubstoryUseAccess().getSubKeyword_1_1()); 
                    match(input,19,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:954:1: rule__ObjectUse__Alternatives : ( ( ruleObjectAttribute ) | ( ruleObjectPronoun ) );
    public final void rule__ObjectUse__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:958:1: ( ( ruleObjectAttribute ) | ( ruleObjectPronoun ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( ((LA13_1>=33 && LA13_1<=36)) ) {
                    alt13=2;
                }
                else if ( (LA13_1==52) ) {
                    alt13=1;
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
                    // InternalTraceryPlusPlus.g:959:2: ( ruleObjectAttribute )
                    {
                    // InternalTraceryPlusPlus.g:959:2: ( ruleObjectAttribute )
                    // InternalTraceryPlusPlus.g:960:3: ruleObjectAttribute
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
                    // InternalTraceryPlusPlus.g:965:2: ( ruleObjectPronoun )
                    {
                    // InternalTraceryPlusPlus.g:965:2: ( ruleObjectPronoun )
                    // InternalTraceryPlusPlus.g:966:3: ruleObjectPronoun
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


    // $ANTLR start "rule__Pronouns__ValueAlternatives_0"
    // InternalTraceryPlusPlus.g:975:1: rule__Pronouns__ValueAlternatives_0 : ( ( 'He' ) | ( 'She' ) | ( 'It' ) | ( 'They' ) );
    public final void rule__Pronouns__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:979:1: ( ( 'He' ) | ( 'She' ) | ( 'It' ) | ( 'They' ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt14=1;
                }
                break;
            case 21:
                {
                alt14=2;
                }
                break;
            case 22:
                {
                alt14=3;
                }
                break;
            case 23:
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
                    // InternalTraceryPlusPlus.g:980:2: ( 'He' )
                    {
                    // InternalTraceryPlusPlus.g:980:2: ( 'He' )
                    // InternalTraceryPlusPlus.g:981:3: 'He'
                    {
                     before(grammarAccess.getPronounsAccess().getValueHeKeyword_0_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getPronounsAccess().getValueHeKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:986:2: ( 'She' )
                    {
                    // InternalTraceryPlusPlus.g:986:2: ( 'She' )
                    // InternalTraceryPlusPlus.g:987:3: 'She'
                    {
                     before(grammarAccess.getPronounsAccess().getValueSheKeyword_0_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getPronounsAccess().getValueSheKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:992:2: ( 'It' )
                    {
                    // InternalTraceryPlusPlus.g:992:2: ( 'It' )
                    // InternalTraceryPlusPlus.g:993:3: 'It'
                    {
                     before(grammarAccess.getPronounsAccess().getValueItKeyword_0_2()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getPronounsAccess().getValueItKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTraceryPlusPlus.g:998:2: ( 'They' )
                    {
                    // InternalTraceryPlusPlus.g:998:2: ( 'They' )
                    // InternalTraceryPlusPlus.g:999:3: 'They'
                    {
                     before(grammarAccess.getPronounsAccess().getValueTheyKeyword_0_3()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getPronounsAccess().getValueTheyKeyword_0_3()); 

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
    // $ANTLR end "rule__Pronouns__ValueAlternatives_0"


    // $ANTLR start "rule__AssignmentOperator__Alternatives"
    // InternalTraceryPlusPlus.g:1008:1: rule__AssignmentOperator__Alternatives : ( ( '=' ) | ( ':' ) | ( '-' ) | ( '-->' ) | ( ( rule__AssignmentOperator__Group_4__0 ) ) | ( 'is' ) );
    public final void rule__AssignmentOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1012:1: ( ( '=' ) | ( ':' ) | ( '-' ) | ( '-->' ) | ( ( rule__AssignmentOperator__Group_4__0 ) ) | ( 'is' ) )
            int alt15=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt15=1;
                }
                break;
            case 25:
                {
                alt15=2;
                }
                break;
            case 26:
                {
                alt15=3;
                }
                break;
            case 27:
                {
                alt15=4;
                }
                break;
            case 13:
                {
                int LA15_5 = input.LA(2);

                if ( (LA15_5==EOF||(LA15_5>=RULE_ID && LA15_5<=RULE_STRING)||LA15_5==51) ) {
                    alt15=6;
                }
                else if ( (LA15_5==53) ) {
                    alt15=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 5, input);

                    throw nvae;
                }
                }
                break;
            case 53:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1013:2: ( '=' )
                    {
                    // InternalTraceryPlusPlus.g:1013:2: ( '=' )
                    // InternalTraceryPlusPlus.g:1014:3: '='
                    {
                     before(grammarAccess.getAssignmentOperatorAccess().getEqualsSignKeyword_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getAssignmentOperatorAccess().getEqualsSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1019:2: ( ':' )
                    {
                    // InternalTraceryPlusPlus.g:1019:2: ( ':' )
                    // InternalTraceryPlusPlus.g:1020:3: ':'
                    {
                     before(grammarAccess.getAssignmentOperatorAccess().getColonKeyword_1()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getAssignmentOperatorAccess().getColonKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1025:2: ( '-' )
                    {
                    // InternalTraceryPlusPlus.g:1025:2: ( '-' )
                    // InternalTraceryPlusPlus.g:1026:3: '-'
                    {
                     before(grammarAccess.getAssignmentOperatorAccess().getHyphenMinusKeyword_2()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getAssignmentOperatorAccess().getHyphenMinusKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTraceryPlusPlus.g:1031:2: ( '-->' )
                    {
                    // InternalTraceryPlusPlus.g:1031:2: ( '-->' )
                    // InternalTraceryPlusPlus.g:1032:3: '-->'
                    {
                     before(grammarAccess.getAssignmentOperatorAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_3()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getAssignmentOperatorAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTraceryPlusPlus.g:1037:2: ( ( rule__AssignmentOperator__Group_4__0 ) )
                    {
                    // InternalTraceryPlusPlus.g:1037:2: ( ( rule__AssignmentOperator__Group_4__0 ) )
                    // InternalTraceryPlusPlus.g:1038:3: ( rule__AssignmentOperator__Group_4__0 )
                    {
                     before(grammarAccess.getAssignmentOperatorAccess().getGroup_4()); 
                    // InternalTraceryPlusPlus.g:1039:3: ( rule__AssignmentOperator__Group_4__0 )
                    // InternalTraceryPlusPlus.g:1039:4: rule__AssignmentOperator__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssignmentOperator__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssignmentOperatorAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTraceryPlusPlus.g:1043:2: ( 'is' )
                    {
                    // InternalTraceryPlusPlus.g:1043:2: ( 'is' )
                    // InternalTraceryPlusPlus.g:1044:3: 'is'
                    {
                     before(grammarAccess.getAssignmentOperatorAccess().getIsKeyword_5()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getAssignmentOperatorAccess().getIsKeyword_5()); 

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
    // InternalTraceryPlusPlus.g:1053:1: rule__SeparatorOr__Alternatives : ( ( ',' ) | ( 'or' ) | ( '||' ) );
    public final void rule__SeparatorOr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1057:1: ( ( ',' ) | ( 'or' ) | ( '||' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt16=1;
                }
                break;
            case 29:
                {
                alt16=2;
                }
                break;
            case 30:
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
                    // InternalTraceryPlusPlus.g:1058:2: ( ',' )
                    {
                    // InternalTraceryPlusPlus.g:1058:2: ( ',' )
                    // InternalTraceryPlusPlus.g:1059:3: ','
                    {
                     before(grammarAccess.getSeparatorOrAccess().getCommaKeyword_0()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getSeparatorOrAccess().getCommaKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1064:2: ( 'or' )
                    {
                    // InternalTraceryPlusPlus.g:1064:2: ( 'or' )
                    // InternalTraceryPlusPlus.g:1065:3: 'or'
                    {
                     before(grammarAccess.getSeparatorOrAccess().getOrKeyword_1()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getSeparatorOrAccess().getOrKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1070:2: ( '||' )
                    {
                    // InternalTraceryPlusPlus.g:1070:2: ( '||' )
                    // InternalTraceryPlusPlus.g:1071:3: '||'
                    {
                     before(grammarAccess.getSeparatorOrAccess().getVerticalLineVerticalLineKeyword_2()); 
                    match(input,30,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1080:1: rule__SeparatorAnd__Alternatives : ( ( ',' ) | ( 'and' ) | ( '&&' ) );
    public final void rule__SeparatorAnd__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1084:1: ( ( ',' ) | ( 'and' ) | ( '&&' ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt17=1;
                }
                break;
            case 31:
                {
                alt17=2;
                }
                break;
            case 32:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1085:2: ( ',' )
                    {
                    // InternalTraceryPlusPlus.g:1085:2: ( ',' )
                    // InternalTraceryPlusPlus.g:1086:3: ','
                    {
                     before(grammarAccess.getSeparatorAndAccess().getCommaKeyword_0()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getSeparatorAndAccess().getCommaKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1091:2: ( 'and' )
                    {
                    // InternalTraceryPlusPlus.g:1091:2: ( 'and' )
                    // InternalTraceryPlusPlus.g:1092:3: 'and'
                    {
                     before(grammarAccess.getSeparatorAndAccess().getAndKeyword_1()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getSeparatorAndAccess().getAndKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1097:2: ( '&&' )
                    {
                    // InternalTraceryPlusPlus.g:1097:2: ( '&&' )
                    // InternalTraceryPlusPlus.g:1098:3: '&&'
                    {
                     before(grammarAccess.getSeparatorAndAccess().getAmpersandAmpersandKeyword_2()); 
                    match(input,32,FOLLOW_2); 
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


    // $ANTLR start "rule__PronounIdentifier__Alternatives"
    // InternalTraceryPlusPlus.g:1107:1: rule__PronounIdentifier__Alternatives : ( ( ( ':they' ) ) | ( ( ':them' ) ) | ( ( ':their' ) ) | ( ( ':theirs' ) ) );
    public final void rule__PronounIdentifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1111:1: ( ( ( ':they' ) ) | ( ( ':them' ) ) | ( ( ':their' ) ) | ( ( ':theirs' ) ) )
            int alt18=4;
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
            case 36:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1112:2: ( ( ':they' ) )
                    {
                    // InternalTraceryPlusPlus.g:1112:2: ( ( ':they' ) )
                    // InternalTraceryPlusPlus.g:1113:3: ( ':they' )
                    {
                     before(grammarAccess.getPronounIdentifierAccess().getTheyEnumLiteralDeclaration_0()); 
                    // InternalTraceryPlusPlus.g:1114:3: ( ':they' )
                    // InternalTraceryPlusPlus.g:1114:4: ':they'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getPronounIdentifierAccess().getTheyEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1118:2: ( ( ':them' ) )
                    {
                    // InternalTraceryPlusPlus.g:1118:2: ( ( ':them' ) )
                    // InternalTraceryPlusPlus.g:1119:3: ( ':them' )
                    {
                     before(grammarAccess.getPronounIdentifierAccess().getThemEnumLiteralDeclaration_1()); 
                    // InternalTraceryPlusPlus.g:1120:3: ( ':them' )
                    // InternalTraceryPlusPlus.g:1120:4: ':them'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getPronounIdentifierAccess().getThemEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1124:2: ( ( ':their' ) )
                    {
                    // InternalTraceryPlusPlus.g:1124:2: ( ( ':their' ) )
                    // InternalTraceryPlusPlus.g:1125:3: ( ':their' )
                    {
                     before(grammarAccess.getPronounIdentifierAccess().getTheirEnumLiteralDeclaration_2()); 
                    // InternalTraceryPlusPlus.g:1126:3: ( ':their' )
                    // InternalTraceryPlusPlus.g:1126:4: ':their'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getPronounIdentifierAccess().getTheirEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTraceryPlusPlus.g:1130:2: ( ( ':theirs' ) )
                    {
                    // InternalTraceryPlusPlus.g:1130:2: ( ( ':theirs' ) )
                    // InternalTraceryPlusPlus.g:1131:3: ( ':theirs' )
                    {
                     before(grammarAccess.getPronounIdentifierAccess().getTheirsEnumLiteralDeclaration_3()); 
                    // InternalTraceryPlusPlus.g:1132:3: ( ':theirs' )
                    // InternalTraceryPlusPlus.g:1132:4: ':theirs'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getPronounIdentifierAccess().getTheirsEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__PronounIdentifier__Alternatives"


    // $ANTLR start "rule__Modifier__Alternatives"
    // InternalTraceryPlusPlus.g:1140:1: rule__Modifier__Alternatives : ( ( ( '-capitalize' ) ) | ( ( '-CAPITALIZE' ) ) | ( ( '-s' ) ) | ( ( '-a' ) ) | ( ( '-ed' ) ) );
    public final void rule__Modifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1144:1: ( ( ( '-capitalize' ) ) | ( ( '-CAPITALIZE' ) ) | ( ( '-s' ) ) | ( ( '-a' ) ) | ( ( '-ed' ) ) )
            int alt19=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt19=1;
                }
                break;
            case 38:
                {
                alt19=2;
                }
                break;
            case 39:
                {
                alt19=3;
                }
                break;
            case 40:
                {
                alt19=4;
                }
                break;
            case 41:
                {
                alt19=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1145:2: ( ( '-capitalize' ) )
                    {
                    // InternalTraceryPlusPlus.g:1145:2: ( ( '-capitalize' ) )
                    // InternalTraceryPlusPlus.g:1146:3: ( '-capitalize' )
                    {
                     before(grammarAccess.getModifierAccess().getCapitalizeEnumLiteralDeclaration_0()); 
                    // InternalTraceryPlusPlus.g:1147:3: ( '-capitalize' )
                    // InternalTraceryPlusPlus.g:1147:4: '-capitalize'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getModifierAccess().getCapitalizeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1151:2: ( ( '-CAPITALIZE' ) )
                    {
                    // InternalTraceryPlusPlus.g:1151:2: ( ( '-CAPITALIZE' ) )
                    // InternalTraceryPlusPlus.g:1152:3: ( '-CAPITALIZE' )
                    {
                     before(grammarAccess.getModifierAccess().getFullCapitalizeEnumLiteralDeclaration_1()); 
                    // InternalTraceryPlusPlus.g:1153:3: ( '-CAPITALIZE' )
                    // InternalTraceryPlusPlus.g:1153:4: '-CAPITALIZE'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getModifierAccess().getFullCapitalizeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTraceryPlusPlus.g:1157:2: ( ( '-s' ) )
                    {
                    // InternalTraceryPlusPlus.g:1157:2: ( ( '-s' ) )
                    // InternalTraceryPlusPlus.g:1158:3: ( '-s' )
                    {
                     before(grammarAccess.getModifierAccess().getPluralEnumLiteralDeclaration_2()); 
                    // InternalTraceryPlusPlus.g:1159:3: ( '-s' )
                    // InternalTraceryPlusPlus.g:1159:4: '-s'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getModifierAccess().getPluralEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTraceryPlusPlus.g:1163:2: ( ( '-a' ) )
                    {
                    // InternalTraceryPlusPlus.g:1163:2: ( ( '-a' ) )
                    // InternalTraceryPlusPlus.g:1164:3: ( '-a' )
                    {
                     before(grammarAccess.getModifierAccess().getArticleEnumLiteralDeclaration_3()); 
                    // InternalTraceryPlusPlus.g:1165:3: ( '-a' )
                    // InternalTraceryPlusPlus.g:1165:4: '-a'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getModifierAccess().getArticleEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTraceryPlusPlus.g:1169:2: ( ( '-ed' ) )
                    {
                    // InternalTraceryPlusPlus.g:1169:2: ( ( '-ed' ) )
                    // InternalTraceryPlusPlus.g:1170:3: ( '-ed' )
                    {
                     before(grammarAccess.getModifierAccess().getPastTenseEnumLiteralDeclaration_4()); 
                    // InternalTraceryPlusPlus.g:1171:3: ( '-ed' )
                    // InternalTraceryPlusPlus.g:1171:4: '-ed'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getModifierAccess().getPastTenseEnumLiteralDeclaration_4()); 

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


    // $ANTLR start "rule__TraceryPlusPlusProgram__Group__0"
    // InternalTraceryPlusPlus.g:1179:1: rule__TraceryPlusPlusProgram__Group__0 : rule__TraceryPlusPlusProgram__Group__0__Impl rule__TraceryPlusPlusProgram__Group__1 ;
    public final void rule__TraceryPlusPlusProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1183:1: ( rule__TraceryPlusPlusProgram__Group__0__Impl rule__TraceryPlusPlusProgram__Group__1 )
            // InternalTraceryPlusPlus.g:1184:2: rule__TraceryPlusPlusProgram__Group__0__Impl rule__TraceryPlusPlusProgram__Group__1
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
    // InternalTraceryPlusPlus.g:1191:1: rule__TraceryPlusPlusProgram__Group__0__Impl : ( ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )* ) ;
    public final void rule__TraceryPlusPlusProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1195:1: ( ( ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )* ) )
            // InternalTraceryPlusPlus.g:1196:1: ( ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )* )
            {
            // InternalTraceryPlusPlus.g:1196:1: ( ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )* )
            // InternalTraceryPlusPlus.g:1197:2: ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )*
            {
             before(grammarAccess.getTraceryPlusPlusProgramAccess().getStatementsAssignment_0()); 
            // InternalTraceryPlusPlus.g:1198:2: ( rule__TraceryPlusPlusProgram__StatementsAssignment_0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==18||LA20_0==47||LA20_0==49) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1198:3: rule__TraceryPlusPlusProgram__StatementsAssignment_0
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
    // InternalTraceryPlusPlus.g:1206:1: rule__TraceryPlusPlusProgram__Group__1 : rule__TraceryPlusPlusProgram__Group__1__Impl ;
    public final void rule__TraceryPlusPlusProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1210:1: ( rule__TraceryPlusPlusProgram__Group__1__Impl )
            // InternalTraceryPlusPlus.g:1211:2: rule__TraceryPlusPlusProgram__Group__1__Impl
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
    // InternalTraceryPlusPlus.g:1217:1: rule__TraceryPlusPlusProgram__Group__1__Impl : ( ( rule__TraceryPlusPlusProgram__StoryAssignment_1 ) ) ;
    public final void rule__TraceryPlusPlusProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1221:1: ( ( ( rule__TraceryPlusPlusProgram__StoryAssignment_1 ) ) )
            // InternalTraceryPlusPlus.g:1222:1: ( ( rule__TraceryPlusPlusProgram__StoryAssignment_1 ) )
            {
            // InternalTraceryPlusPlus.g:1222:1: ( ( rule__TraceryPlusPlusProgram__StoryAssignment_1 ) )
            // InternalTraceryPlusPlus.g:1223:2: ( rule__TraceryPlusPlusProgram__StoryAssignment_1 )
            {
             before(grammarAccess.getTraceryPlusPlusProgramAccess().getStoryAssignment_1()); 
            // InternalTraceryPlusPlus.g:1224:2: ( rule__TraceryPlusPlusProgram__StoryAssignment_1 )
            // InternalTraceryPlusPlus.g:1224:3: rule__TraceryPlusPlusProgram__StoryAssignment_1
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
    // InternalTraceryPlusPlus.g:1233:1: rule__Story__Group__0 : rule__Story__Group__0__Impl rule__Story__Group__1 ;
    public final void rule__Story__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1237:1: ( rule__Story__Group__0__Impl rule__Story__Group__1 )
            // InternalTraceryPlusPlus.g:1238:2: rule__Story__Group__0__Impl rule__Story__Group__1
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
    // InternalTraceryPlusPlus.g:1245:1: rule__Story__Group__0__Impl : ( () ) ;
    public final void rule__Story__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1249:1: ( ( () ) )
            // InternalTraceryPlusPlus.g:1250:1: ( () )
            {
            // InternalTraceryPlusPlus.g:1250:1: ( () )
            // InternalTraceryPlusPlus.g:1251:2: ()
            {
             before(grammarAccess.getStoryAccess().getStoryAction_0()); 
            // InternalTraceryPlusPlus.g:1252:2: ()
            // InternalTraceryPlusPlus.g:1252:3: 
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
    // InternalTraceryPlusPlus.g:1260:1: rule__Story__Group__1 : rule__Story__Group__1__Impl rule__Story__Group__2 ;
    public final void rule__Story__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1264:1: ( rule__Story__Group__1__Impl rule__Story__Group__2 )
            // InternalTraceryPlusPlus.g:1265:2: rule__Story__Group__1__Impl rule__Story__Group__2
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
    // InternalTraceryPlusPlus.g:1272:1: rule__Story__Group__1__Impl : ( 'The' ) ;
    public final void rule__Story__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1276:1: ( ( 'The' ) )
            // InternalTraceryPlusPlus.g:1277:1: ( 'The' )
            {
            // InternalTraceryPlusPlus.g:1277:1: ( 'The' )
            // InternalTraceryPlusPlus.g:1278:2: 'The'
            {
             before(grammarAccess.getStoryAccess().getTheKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1287:1: rule__Story__Group__2 : rule__Story__Group__2__Impl rule__Story__Group__3 ;
    public final void rule__Story__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1291:1: ( rule__Story__Group__2__Impl rule__Story__Group__3 )
            // InternalTraceryPlusPlus.g:1292:2: rule__Story__Group__2__Impl rule__Story__Group__3
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
    // InternalTraceryPlusPlus.g:1299:1: rule__Story__Group__2__Impl : ( 'story' ) ;
    public final void rule__Story__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1303:1: ( ( 'story' ) )
            // InternalTraceryPlusPlus.g:1304:1: ( 'story' )
            {
            // InternalTraceryPlusPlus.g:1304:1: ( 'story' )
            // InternalTraceryPlusPlus.g:1305:2: 'story'
            {
             before(grammarAccess.getStoryAccess().getStoryKeyword_2()); 
            match(input,43,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1314:1: rule__Story__Group__3 : rule__Story__Group__3__Impl rule__Story__Group__4 ;
    public final void rule__Story__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1318:1: ( rule__Story__Group__3__Impl rule__Story__Group__4 )
            // InternalTraceryPlusPlus.g:1319:2: rule__Story__Group__3__Impl rule__Story__Group__4
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
    // InternalTraceryPlusPlus.g:1326:1: rule__Story__Group__3__Impl : ( ( ruleAssignmentOperator )? ) ;
    public final void rule__Story__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1330:1: ( ( ( ruleAssignmentOperator )? ) )
            // InternalTraceryPlusPlus.g:1331:1: ( ( ruleAssignmentOperator )? )
            {
            // InternalTraceryPlusPlus.g:1331:1: ( ( ruleAssignmentOperator )? )
            // InternalTraceryPlusPlus.g:1332:2: ( ruleAssignmentOperator )?
            {
             before(grammarAccess.getStoryAccess().getAssignmentOperatorParserRuleCall_3()); 
            // InternalTraceryPlusPlus.g:1333:2: ( ruleAssignmentOperator )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==13||(LA21_0>=24 && LA21_0<=27)||LA21_0==53) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1333:3: ruleAssignmentOperator
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
    // InternalTraceryPlusPlus.g:1341:1: rule__Story__Group__4 : rule__Story__Group__4__Impl ;
    public final void rule__Story__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1345:1: ( rule__Story__Group__4__Impl )
            // InternalTraceryPlusPlus.g:1346:2: rule__Story__Group__4__Impl
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
    // InternalTraceryPlusPlus.g:1352:1: rule__Story__Group__4__Impl : ( ( rule__Story__StoryAssignment_4 )* ) ;
    public final void rule__Story__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1356:1: ( ( ( rule__Story__StoryAssignment_4 )* ) )
            // InternalTraceryPlusPlus.g:1357:1: ( ( rule__Story__StoryAssignment_4 )* )
            {
            // InternalTraceryPlusPlus.g:1357:1: ( ( rule__Story__StoryAssignment_4 )* )
            // InternalTraceryPlusPlus.g:1358:2: ( rule__Story__StoryAssignment_4 )*
            {
             before(grammarAccess.getStoryAccess().getStoryAssignment_4()); 
            // InternalTraceryPlusPlus.g:1359:2: ( rule__Story__StoryAssignment_4 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_STRING)||LA22_0==51) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1359:3: rule__Story__StoryAssignment_4
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
    // InternalTraceryPlusPlus.g:1368:1: rule__ListDeclaration__Group__0 : rule__ListDeclaration__Group__0__Impl rule__ListDeclaration__Group__1 ;
    public final void rule__ListDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1372:1: ( rule__ListDeclaration__Group__0__Impl rule__ListDeclaration__Group__1 )
            // InternalTraceryPlusPlus.g:1373:2: rule__ListDeclaration__Group__0__Impl rule__ListDeclaration__Group__1
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
    // InternalTraceryPlusPlus.g:1380:1: rule__ListDeclaration__Group__0__Impl : ( ( rule__ListDeclaration__NameAssignment_0 ) ) ;
    public final void rule__ListDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1384:1: ( ( ( rule__ListDeclaration__NameAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:1385:1: ( ( rule__ListDeclaration__NameAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:1385:1: ( ( rule__ListDeclaration__NameAssignment_0 ) )
            // InternalTraceryPlusPlus.g:1386:2: ( rule__ListDeclaration__NameAssignment_0 )
            {
             before(grammarAccess.getListDeclarationAccess().getNameAssignment_0()); 
            // InternalTraceryPlusPlus.g:1387:2: ( rule__ListDeclaration__NameAssignment_0 )
            // InternalTraceryPlusPlus.g:1387:3: rule__ListDeclaration__NameAssignment_0
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
    // InternalTraceryPlusPlus.g:1395:1: rule__ListDeclaration__Group__1 : rule__ListDeclaration__Group__1__Impl rule__ListDeclaration__Group__2 ;
    public final void rule__ListDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1399:1: ( rule__ListDeclaration__Group__1__Impl rule__ListDeclaration__Group__2 )
            // InternalTraceryPlusPlus.g:1400:2: rule__ListDeclaration__Group__1__Impl rule__ListDeclaration__Group__2
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
    // InternalTraceryPlusPlus.g:1407:1: rule__ListDeclaration__Group__1__Impl : ( ( rule__ListDeclaration__Alternatives_1 ) ) ;
    public final void rule__ListDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1411:1: ( ( ( rule__ListDeclaration__Alternatives_1 ) ) )
            // InternalTraceryPlusPlus.g:1412:1: ( ( rule__ListDeclaration__Alternatives_1 ) )
            {
            // InternalTraceryPlusPlus.g:1412:1: ( ( rule__ListDeclaration__Alternatives_1 ) )
            // InternalTraceryPlusPlus.g:1413:2: ( rule__ListDeclaration__Alternatives_1 )
            {
             before(grammarAccess.getListDeclarationAccess().getAlternatives_1()); 
            // InternalTraceryPlusPlus.g:1414:2: ( rule__ListDeclaration__Alternatives_1 )
            // InternalTraceryPlusPlus.g:1414:3: rule__ListDeclaration__Alternatives_1
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
    // InternalTraceryPlusPlus.g:1422:1: rule__ListDeclaration__Group__2 : rule__ListDeclaration__Group__2__Impl rule__ListDeclaration__Group__3 ;
    public final void rule__ListDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1426:1: ( rule__ListDeclaration__Group__2__Impl rule__ListDeclaration__Group__3 )
            // InternalTraceryPlusPlus.g:1427:2: rule__ListDeclaration__Group__2__Impl rule__ListDeclaration__Group__3
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
    // InternalTraceryPlusPlus.g:1434:1: rule__ListDeclaration__Group__2__Impl : ( ( ruleAssignmentOperator )? ) ;
    public final void rule__ListDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1438:1: ( ( ( ruleAssignmentOperator )? ) )
            // InternalTraceryPlusPlus.g:1439:1: ( ( ruleAssignmentOperator )? )
            {
            // InternalTraceryPlusPlus.g:1439:1: ( ( ruleAssignmentOperator )? )
            // InternalTraceryPlusPlus.g:1440:2: ( ruleAssignmentOperator )?
            {
             before(grammarAccess.getListDeclarationAccess().getAssignmentOperatorParserRuleCall_2()); 
            // InternalTraceryPlusPlus.g:1441:2: ( ruleAssignmentOperator )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==13||(LA23_0>=24 && LA23_0<=27)||LA23_0==53) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1441:3: ruleAssignmentOperator
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
    // InternalTraceryPlusPlus.g:1449:1: rule__ListDeclaration__Group__3 : rule__ListDeclaration__Group__3__Impl ;
    public final void rule__ListDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1453:1: ( rule__ListDeclaration__Group__3__Impl )
            // InternalTraceryPlusPlus.g:1454:2: rule__ListDeclaration__Group__3__Impl
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
    // InternalTraceryPlusPlus.g:1460:1: rule__ListDeclaration__Group__3__Impl : ( ( rule__ListDeclaration__ListAssignment_3 ) ) ;
    public final void rule__ListDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1464:1: ( ( ( rule__ListDeclaration__ListAssignment_3 ) ) )
            // InternalTraceryPlusPlus.g:1465:1: ( ( rule__ListDeclaration__ListAssignment_3 ) )
            {
            // InternalTraceryPlusPlus.g:1465:1: ( ( rule__ListDeclaration__ListAssignment_3 ) )
            // InternalTraceryPlusPlus.g:1466:2: ( rule__ListDeclaration__ListAssignment_3 )
            {
             before(grammarAccess.getListDeclarationAccess().getListAssignment_3()); 
            // InternalTraceryPlusPlus.g:1467:2: ( rule__ListDeclaration__ListAssignment_3 )
            // InternalTraceryPlusPlus.g:1467:3: rule__ListDeclaration__ListAssignment_3
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
    // InternalTraceryPlusPlus.g:1476:1: rule__ListDeclaration__Group_1_0__0 : rule__ListDeclaration__Group_1_0__0__Impl rule__ListDeclaration__Group_1_0__1 ;
    public final void rule__ListDeclaration__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1480:1: ( rule__ListDeclaration__Group_1_0__0__Impl rule__ListDeclaration__Group_1_0__1 )
            // InternalTraceryPlusPlus.g:1481:2: rule__ListDeclaration__Group_1_0__0__Impl rule__ListDeclaration__Group_1_0__1
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
    // InternalTraceryPlusPlus.g:1488:1: rule__ListDeclaration__Group_1_0__0__Impl : ( 'can' ) ;
    public final void rule__ListDeclaration__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1492:1: ( ( 'can' ) )
            // InternalTraceryPlusPlus.g:1493:1: ( 'can' )
            {
            // InternalTraceryPlusPlus.g:1493:1: ( 'can' )
            // InternalTraceryPlusPlus.g:1494:2: 'can'
            {
             before(grammarAccess.getListDeclarationAccess().getCanKeyword_1_0_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1503:1: rule__ListDeclaration__Group_1_0__1 : rule__ListDeclaration__Group_1_0__1__Impl rule__ListDeclaration__Group_1_0__2 ;
    public final void rule__ListDeclaration__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1507:1: ( rule__ListDeclaration__Group_1_0__1__Impl rule__ListDeclaration__Group_1_0__2 )
            // InternalTraceryPlusPlus.g:1508:2: rule__ListDeclaration__Group_1_0__1__Impl rule__ListDeclaration__Group_1_0__2
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
    // InternalTraceryPlusPlus.g:1515:1: rule__ListDeclaration__Group_1_0__1__Impl : ( 'have' ) ;
    public final void rule__ListDeclaration__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1519:1: ( ( 'have' ) )
            // InternalTraceryPlusPlus.g:1520:1: ( 'have' )
            {
            // InternalTraceryPlusPlus.g:1520:1: ( 'have' )
            // InternalTraceryPlusPlus.g:1521:2: 'have'
            {
             before(grammarAccess.getListDeclarationAccess().getHaveKeyword_1_0_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1530:1: rule__ListDeclaration__Group_1_0__2 : rule__ListDeclaration__Group_1_0__2__Impl ;
    public final void rule__ListDeclaration__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1534:1: ( rule__ListDeclaration__Group_1_0__2__Impl )
            // InternalTraceryPlusPlus.g:1535:2: rule__ListDeclaration__Group_1_0__2__Impl
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
    // InternalTraceryPlusPlus.g:1541:1: rule__ListDeclaration__Group_1_0__2__Impl : ( 'values' ) ;
    public final void rule__ListDeclaration__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1545:1: ( ( 'values' ) )
            // InternalTraceryPlusPlus.g:1546:1: ( 'values' )
            {
            // InternalTraceryPlusPlus.g:1546:1: ( 'values' )
            // InternalTraceryPlusPlus.g:1547:2: 'values'
            {
             before(grammarAccess.getListDeclarationAccess().getValuesKeyword_1_0_2()); 
            match(input,45,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1557:1: rule__ListDeclaration__Group_1_1__0 : rule__ListDeclaration__Group_1_1__0__Impl rule__ListDeclaration__Group_1_1__1 ;
    public final void rule__ListDeclaration__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1561:1: ( rule__ListDeclaration__Group_1_1__0__Impl rule__ListDeclaration__Group_1_1__1 )
            // InternalTraceryPlusPlus.g:1562:2: rule__ListDeclaration__Group_1_1__0__Impl rule__ListDeclaration__Group_1_1__1
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
    // InternalTraceryPlusPlus.g:1569:1: rule__ListDeclaration__Group_1_1__0__Impl : ( 'can' ) ;
    public final void rule__ListDeclaration__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1573:1: ( ( 'can' ) )
            // InternalTraceryPlusPlus.g:1574:1: ( 'can' )
            {
            // InternalTraceryPlusPlus.g:1574:1: ( 'can' )
            // InternalTraceryPlusPlus.g:1575:2: 'can'
            {
             before(grammarAccess.getListDeclarationAccess().getCanKeyword_1_1_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1584:1: rule__ListDeclaration__Group_1_1__1 : rule__ListDeclaration__Group_1_1__1__Impl ;
    public final void rule__ListDeclaration__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1588:1: ( rule__ListDeclaration__Group_1_1__1__Impl )
            // InternalTraceryPlusPlus.g:1589:2: rule__ListDeclaration__Group_1_1__1__Impl
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
    // InternalTraceryPlusPlus.g:1595:1: rule__ListDeclaration__Group_1_1__1__Impl : ( 'be' ) ;
    public final void rule__ListDeclaration__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1599:1: ( ( 'be' ) )
            // InternalTraceryPlusPlus.g:1600:1: ( 'be' )
            {
            // InternalTraceryPlusPlus.g:1600:1: ( 'be' )
            // InternalTraceryPlusPlus.g:1601:2: 'be'
            {
             before(grammarAccess.getListDeclarationAccess().getBeKeyword_1_1_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1611:1: rule__ListDeclaration__Group_1_2__0 : rule__ListDeclaration__Group_1_2__0__Impl rule__ListDeclaration__Group_1_2__1 ;
    public final void rule__ListDeclaration__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1615:1: ( rule__ListDeclaration__Group_1_2__0__Impl rule__ListDeclaration__Group_1_2__1 )
            // InternalTraceryPlusPlus.g:1616:2: rule__ListDeclaration__Group_1_2__0__Impl rule__ListDeclaration__Group_1_2__1
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
    // InternalTraceryPlusPlus.g:1623:1: rule__ListDeclaration__Group_1_2__0__Impl : ( ( rule__ListDeclaration__Alternatives_1_2_0 ) ) ;
    public final void rule__ListDeclaration__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1627:1: ( ( ( rule__ListDeclaration__Alternatives_1_2_0 ) ) )
            // InternalTraceryPlusPlus.g:1628:1: ( ( rule__ListDeclaration__Alternatives_1_2_0 ) )
            {
            // InternalTraceryPlusPlus.g:1628:1: ( ( rule__ListDeclaration__Alternatives_1_2_0 ) )
            // InternalTraceryPlusPlus.g:1629:2: ( rule__ListDeclaration__Alternatives_1_2_0 )
            {
             before(grammarAccess.getListDeclarationAccess().getAlternatives_1_2_0()); 
            // InternalTraceryPlusPlus.g:1630:2: ( rule__ListDeclaration__Alternatives_1_2_0 )
            // InternalTraceryPlusPlus.g:1630:3: rule__ListDeclaration__Alternatives_1_2_0
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
    // InternalTraceryPlusPlus.g:1638:1: rule__ListDeclaration__Group_1_2__1 : rule__ListDeclaration__Group_1_2__1__Impl ;
    public final void rule__ListDeclaration__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1642:1: ( rule__ListDeclaration__Group_1_2__1__Impl )
            // InternalTraceryPlusPlus.g:1643:2: rule__ListDeclaration__Group_1_2__1__Impl
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
    // InternalTraceryPlusPlus.g:1649:1: rule__ListDeclaration__Group_1_2__1__Impl : ( 'values' ) ;
    public final void rule__ListDeclaration__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1653:1: ( ( 'values' ) )
            // InternalTraceryPlusPlus.g:1654:1: ( 'values' )
            {
            // InternalTraceryPlusPlus.g:1654:1: ( 'values' )
            // InternalTraceryPlusPlus.g:1655:2: 'values'
            {
             before(grammarAccess.getListDeclarationAccess().getValuesKeyword_1_2_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1665:1: rule__ObjectDeclaration__Group__0 : rule__ObjectDeclaration__Group__0__Impl rule__ObjectDeclaration__Group__1 ;
    public final void rule__ObjectDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1669:1: ( rule__ObjectDeclaration__Group__0__Impl rule__ObjectDeclaration__Group__1 )
            // InternalTraceryPlusPlus.g:1670:2: rule__ObjectDeclaration__Group__0__Impl rule__ObjectDeclaration__Group__1
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
    // InternalTraceryPlusPlus.g:1677:1: rule__ObjectDeclaration__Group__0__Impl : ( 'There' ) ;
    public final void rule__ObjectDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1681:1: ( ( 'There' ) )
            // InternalTraceryPlusPlus.g:1682:1: ( 'There' )
            {
            // InternalTraceryPlusPlus.g:1682:1: ( 'There' )
            // InternalTraceryPlusPlus.g:1683:2: 'There'
            {
             before(grammarAccess.getObjectDeclarationAccess().getThereKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1692:1: rule__ObjectDeclaration__Group__1 : rule__ObjectDeclaration__Group__1__Impl rule__ObjectDeclaration__Group__2 ;
    public final void rule__ObjectDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1696:1: ( rule__ObjectDeclaration__Group__1__Impl rule__ObjectDeclaration__Group__2 )
            // InternalTraceryPlusPlus.g:1697:2: rule__ObjectDeclaration__Group__1__Impl rule__ObjectDeclaration__Group__2
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
    // InternalTraceryPlusPlus.g:1704:1: rule__ObjectDeclaration__Group__1__Impl : ( ( rule__ObjectDeclaration__Alternatives_1 ) ) ;
    public final void rule__ObjectDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1708:1: ( ( ( rule__ObjectDeclaration__Alternatives_1 ) ) )
            // InternalTraceryPlusPlus.g:1709:1: ( ( rule__ObjectDeclaration__Alternatives_1 ) )
            {
            // InternalTraceryPlusPlus.g:1709:1: ( ( rule__ObjectDeclaration__Alternatives_1 ) )
            // InternalTraceryPlusPlus.g:1710:2: ( rule__ObjectDeclaration__Alternatives_1 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getAlternatives_1()); 
            // InternalTraceryPlusPlus.g:1711:2: ( rule__ObjectDeclaration__Alternatives_1 )
            // InternalTraceryPlusPlus.g:1711:3: rule__ObjectDeclaration__Alternatives_1
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
    // InternalTraceryPlusPlus.g:1719:1: rule__ObjectDeclaration__Group__2 : rule__ObjectDeclaration__Group__2__Impl rule__ObjectDeclaration__Group__3 ;
    public final void rule__ObjectDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1723:1: ( rule__ObjectDeclaration__Group__2__Impl rule__ObjectDeclaration__Group__3 )
            // InternalTraceryPlusPlus.g:1724:2: rule__ObjectDeclaration__Group__2__Impl rule__ObjectDeclaration__Group__3
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
    // InternalTraceryPlusPlus.g:1731:1: rule__ObjectDeclaration__Group__2__Impl : ( ( rule__ObjectDeclaration__Alternatives_2 )? ) ;
    public final void rule__ObjectDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1735:1: ( ( ( rule__ObjectDeclaration__Alternatives_2 )? ) )
            // InternalTraceryPlusPlus.g:1736:1: ( ( rule__ObjectDeclaration__Alternatives_2 )? )
            {
            // InternalTraceryPlusPlus.g:1736:1: ( ( rule__ObjectDeclaration__Alternatives_2 )? )
            // InternalTraceryPlusPlus.g:1737:2: ( rule__ObjectDeclaration__Alternatives_2 )?
            {
             before(grammarAccess.getObjectDeclarationAccess().getAlternatives_2()); 
            // InternalTraceryPlusPlus.g:1738:2: ( rule__ObjectDeclaration__Alternatives_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=15 && LA24_0<=16)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1738:3: rule__ObjectDeclaration__Alternatives_2
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
    // InternalTraceryPlusPlus.g:1746:1: rule__ObjectDeclaration__Group__3 : rule__ObjectDeclaration__Group__3__Impl rule__ObjectDeclaration__Group__4 ;
    public final void rule__ObjectDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1750:1: ( rule__ObjectDeclaration__Group__3__Impl rule__ObjectDeclaration__Group__4 )
            // InternalTraceryPlusPlus.g:1751:2: rule__ObjectDeclaration__Group__3__Impl rule__ObjectDeclaration__Group__4
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
    // InternalTraceryPlusPlus.g:1758:1: rule__ObjectDeclaration__Group__3__Impl : ( ( rule__ObjectDeclaration__NameAssignment_3 ) ) ;
    public final void rule__ObjectDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1762:1: ( ( ( rule__ObjectDeclaration__NameAssignment_3 ) ) )
            // InternalTraceryPlusPlus.g:1763:1: ( ( rule__ObjectDeclaration__NameAssignment_3 ) )
            {
            // InternalTraceryPlusPlus.g:1763:1: ( ( rule__ObjectDeclaration__NameAssignment_3 ) )
            // InternalTraceryPlusPlus.g:1764:2: ( rule__ObjectDeclaration__NameAssignment_3 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getNameAssignment_3()); 
            // InternalTraceryPlusPlus.g:1765:2: ( rule__ObjectDeclaration__NameAssignment_3 )
            // InternalTraceryPlusPlus.g:1765:3: rule__ObjectDeclaration__NameAssignment_3
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
    // InternalTraceryPlusPlus.g:1773:1: rule__ObjectDeclaration__Group__4 : rule__ObjectDeclaration__Group__4__Impl rule__ObjectDeclaration__Group__5 ;
    public final void rule__ObjectDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1777:1: ( rule__ObjectDeclaration__Group__4__Impl rule__ObjectDeclaration__Group__5 )
            // InternalTraceryPlusPlus.g:1778:2: rule__ObjectDeclaration__Group__4__Impl rule__ObjectDeclaration__Group__5
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
    // InternalTraceryPlusPlus.g:1785:1: rule__ObjectDeclaration__Group__4__Impl : ( ( rule__ObjectDeclaration__PronounsAssignment_4 ) ) ;
    public final void rule__ObjectDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1789:1: ( ( ( rule__ObjectDeclaration__PronounsAssignment_4 ) ) )
            // InternalTraceryPlusPlus.g:1790:1: ( ( rule__ObjectDeclaration__PronounsAssignment_4 ) )
            {
            // InternalTraceryPlusPlus.g:1790:1: ( ( rule__ObjectDeclaration__PronounsAssignment_4 ) )
            // InternalTraceryPlusPlus.g:1791:2: ( rule__ObjectDeclaration__PronounsAssignment_4 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getPronounsAssignment_4()); 
            // InternalTraceryPlusPlus.g:1792:2: ( rule__ObjectDeclaration__PronounsAssignment_4 )
            // InternalTraceryPlusPlus.g:1792:3: rule__ObjectDeclaration__PronounsAssignment_4
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
    // InternalTraceryPlusPlus.g:1800:1: rule__ObjectDeclaration__Group__5 : rule__ObjectDeclaration__Group__5__Impl rule__ObjectDeclaration__Group__6 ;
    public final void rule__ObjectDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1804:1: ( rule__ObjectDeclaration__Group__5__Impl rule__ObjectDeclaration__Group__6 )
            // InternalTraceryPlusPlus.g:1805:2: rule__ObjectDeclaration__Group__5__Impl rule__ObjectDeclaration__Group__6
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
    // InternalTraceryPlusPlus.g:1812:1: rule__ObjectDeclaration__Group__5__Impl : ( ( rule__ObjectDeclaration__Alternatives_5 ) ) ;
    public final void rule__ObjectDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1816:1: ( ( ( rule__ObjectDeclaration__Alternatives_5 ) ) )
            // InternalTraceryPlusPlus.g:1817:1: ( ( rule__ObjectDeclaration__Alternatives_5 ) )
            {
            // InternalTraceryPlusPlus.g:1817:1: ( ( rule__ObjectDeclaration__Alternatives_5 ) )
            // InternalTraceryPlusPlus.g:1818:2: ( rule__ObjectDeclaration__Alternatives_5 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getAlternatives_5()); 
            // InternalTraceryPlusPlus.g:1819:2: ( rule__ObjectDeclaration__Alternatives_5 )
            // InternalTraceryPlusPlus.g:1819:3: rule__ObjectDeclaration__Alternatives_5
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
    // InternalTraceryPlusPlus.g:1827:1: rule__ObjectDeclaration__Group__6 : rule__ObjectDeclaration__Group__6__Impl rule__ObjectDeclaration__Group__7 ;
    public final void rule__ObjectDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1831:1: ( rule__ObjectDeclaration__Group__6__Impl rule__ObjectDeclaration__Group__7 )
            // InternalTraceryPlusPlus.g:1832:2: rule__ObjectDeclaration__Group__6__Impl rule__ObjectDeclaration__Group__7
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
    // InternalTraceryPlusPlus.g:1839:1: rule__ObjectDeclaration__Group__6__Impl : ( ( 'attributes' )? ) ;
    public final void rule__ObjectDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1843:1: ( ( ( 'attributes' )? ) )
            // InternalTraceryPlusPlus.g:1844:1: ( ( 'attributes' )? )
            {
            // InternalTraceryPlusPlus.g:1844:1: ( ( 'attributes' )? )
            // InternalTraceryPlusPlus.g:1845:2: ( 'attributes' )?
            {
             before(grammarAccess.getObjectDeclarationAccess().getAttributesKeyword_6()); 
            // InternalTraceryPlusPlus.g:1846:2: ( 'attributes' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==48) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1846:3: 'attributes'
                    {
                    match(input,48,FOLLOW_2); 

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
    // InternalTraceryPlusPlus.g:1854:1: rule__ObjectDeclaration__Group__7 : rule__ObjectDeclaration__Group__7__Impl rule__ObjectDeclaration__Group__8 ;
    public final void rule__ObjectDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1858:1: ( rule__ObjectDeclaration__Group__7__Impl rule__ObjectDeclaration__Group__8 )
            // InternalTraceryPlusPlus.g:1859:2: rule__ObjectDeclaration__Group__7__Impl rule__ObjectDeclaration__Group__8
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
    // InternalTraceryPlusPlus.g:1866:1: rule__ObjectDeclaration__Group__7__Impl : ( ( ruleAssignmentOperator )? ) ;
    public final void rule__ObjectDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1870:1: ( ( ( ruleAssignmentOperator )? ) )
            // InternalTraceryPlusPlus.g:1871:1: ( ( ruleAssignmentOperator )? )
            {
            // InternalTraceryPlusPlus.g:1871:1: ( ( ruleAssignmentOperator )? )
            // InternalTraceryPlusPlus.g:1872:2: ( ruleAssignmentOperator )?
            {
             before(grammarAccess.getObjectDeclarationAccess().getAssignmentOperatorParserRuleCall_7()); 
            // InternalTraceryPlusPlus.g:1873:2: ( ruleAssignmentOperator )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==13||(LA26_0>=24 && LA26_0<=27)||LA26_0==53) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1873:3: ruleAssignmentOperator
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
    // InternalTraceryPlusPlus.g:1881:1: rule__ObjectDeclaration__Group__8 : rule__ObjectDeclaration__Group__8__Impl ;
    public final void rule__ObjectDeclaration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1885:1: ( rule__ObjectDeclaration__Group__8__Impl )
            // InternalTraceryPlusPlus.g:1886:2: rule__ObjectDeclaration__Group__8__Impl
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
    // InternalTraceryPlusPlus.g:1892:1: rule__ObjectDeclaration__Group__8__Impl : ( ( rule__ObjectDeclaration__AttributesAssignment_8 ) ) ;
    public final void rule__ObjectDeclaration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1896:1: ( ( ( rule__ObjectDeclaration__AttributesAssignment_8 ) ) )
            // InternalTraceryPlusPlus.g:1897:1: ( ( rule__ObjectDeclaration__AttributesAssignment_8 ) )
            {
            // InternalTraceryPlusPlus.g:1897:1: ( ( rule__ObjectDeclaration__AttributesAssignment_8 ) )
            // InternalTraceryPlusPlus.g:1898:2: ( rule__ObjectDeclaration__AttributesAssignment_8 )
            {
             before(grammarAccess.getObjectDeclarationAccess().getAttributesAssignment_8()); 
            // InternalTraceryPlusPlus.g:1899:2: ( rule__ObjectDeclaration__AttributesAssignment_8 )
            // InternalTraceryPlusPlus.g:1899:3: rule__ObjectDeclaration__AttributesAssignment_8
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
    // InternalTraceryPlusPlus.g:1908:1: rule__SubstoryDeclaration__Group__0 : rule__SubstoryDeclaration__Group__0__Impl rule__SubstoryDeclaration__Group__1 ;
    public final void rule__SubstoryDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1912:1: ( rule__SubstoryDeclaration__Group__0__Impl rule__SubstoryDeclaration__Group__1 )
            // InternalTraceryPlusPlus.g:1913:2: rule__SubstoryDeclaration__Group__0__Impl rule__SubstoryDeclaration__Group__1
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
    // InternalTraceryPlusPlus.g:1920:1: rule__SubstoryDeclaration__Group__0__Impl : ( ( 'define' )? ) ;
    public final void rule__SubstoryDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1924:1: ( ( ( 'define' )? ) )
            // InternalTraceryPlusPlus.g:1925:1: ( ( 'define' )? )
            {
            // InternalTraceryPlusPlus.g:1925:1: ( ( 'define' )? )
            // InternalTraceryPlusPlus.g:1926:2: ( 'define' )?
            {
             before(grammarAccess.getSubstoryDeclarationAccess().getDefineKeyword_0()); 
            // InternalTraceryPlusPlus.g:1927:2: ( 'define' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==49) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1927:3: 'define'
                    {
                    match(input,49,FOLLOW_2); 

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
    // InternalTraceryPlusPlus.g:1935:1: rule__SubstoryDeclaration__Group__1 : rule__SubstoryDeclaration__Group__1__Impl rule__SubstoryDeclaration__Group__2 ;
    public final void rule__SubstoryDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1939:1: ( rule__SubstoryDeclaration__Group__1__Impl rule__SubstoryDeclaration__Group__2 )
            // InternalTraceryPlusPlus.g:1940:2: rule__SubstoryDeclaration__Group__1__Impl rule__SubstoryDeclaration__Group__2
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
    // InternalTraceryPlusPlus.g:1947:1: rule__SubstoryDeclaration__Group__1__Impl : ( 'substory' ) ;
    public final void rule__SubstoryDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1951:1: ( ( 'substory' ) )
            // InternalTraceryPlusPlus.g:1952:1: ( 'substory' )
            {
            // InternalTraceryPlusPlus.g:1952:1: ( 'substory' )
            // InternalTraceryPlusPlus.g:1953:2: 'substory'
            {
             before(grammarAccess.getSubstoryDeclarationAccess().getSubstoryKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:1962:1: rule__SubstoryDeclaration__Group__2 : rule__SubstoryDeclaration__Group__2__Impl rule__SubstoryDeclaration__Group__3 ;
    public final void rule__SubstoryDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1966:1: ( rule__SubstoryDeclaration__Group__2__Impl rule__SubstoryDeclaration__Group__3 )
            // InternalTraceryPlusPlus.g:1967:2: rule__SubstoryDeclaration__Group__2__Impl rule__SubstoryDeclaration__Group__3
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
    // InternalTraceryPlusPlus.g:1974:1: rule__SubstoryDeclaration__Group__2__Impl : ( ( rule__SubstoryDeclaration__NameAssignment_2 ) ) ;
    public final void rule__SubstoryDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1978:1: ( ( ( rule__SubstoryDeclaration__NameAssignment_2 ) ) )
            // InternalTraceryPlusPlus.g:1979:1: ( ( rule__SubstoryDeclaration__NameAssignment_2 ) )
            {
            // InternalTraceryPlusPlus.g:1979:1: ( ( rule__SubstoryDeclaration__NameAssignment_2 ) )
            // InternalTraceryPlusPlus.g:1980:2: ( rule__SubstoryDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getSubstoryDeclarationAccess().getNameAssignment_2()); 
            // InternalTraceryPlusPlus.g:1981:2: ( rule__SubstoryDeclaration__NameAssignment_2 )
            // InternalTraceryPlusPlus.g:1981:3: rule__SubstoryDeclaration__NameAssignment_2
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
    // InternalTraceryPlusPlus.g:1989:1: rule__SubstoryDeclaration__Group__3 : rule__SubstoryDeclaration__Group__3__Impl rule__SubstoryDeclaration__Group__4 ;
    public final void rule__SubstoryDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:1993:1: ( rule__SubstoryDeclaration__Group__3__Impl rule__SubstoryDeclaration__Group__4 )
            // InternalTraceryPlusPlus.g:1994:2: rule__SubstoryDeclaration__Group__3__Impl rule__SubstoryDeclaration__Group__4
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
    // InternalTraceryPlusPlus.g:2001:1: rule__SubstoryDeclaration__Group__3__Impl : ( ':' ) ;
    public final void rule__SubstoryDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2005:1: ( ( ':' ) )
            // InternalTraceryPlusPlus.g:2006:1: ( ':' )
            {
            // InternalTraceryPlusPlus.g:2006:1: ( ':' )
            // InternalTraceryPlusPlus.g:2007:2: ':'
            {
             before(grammarAccess.getSubstoryDeclarationAccess().getColonKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:2016:1: rule__SubstoryDeclaration__Group__4 : rule__SubstoryDeclaration__Group__4__Impl rule__SubstoryDeclaration__Group__5 ;
    public final void rule__SubstoryDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2020:1: ( rule__SubstoryDeclaration__Group__4__Impl rule__SubstoryDeclaration__Group__5 )
            // InternalTraceryPlusPlus.g:2021:2: rule__SubstoryDeclaration__Group__4__Impl rule__SubstoryDeclaration__Group__5
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
    // InternalTraceryPlusPlus.g:2028:1: rule__SubstoryDeclaration__Group__4__Impl : ( ( rule__SubstoryDeclaration__StoryAssignment_4 )* ) ;
    public final void rule__SubstoryDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2032:1: ( ( ( rule__SubstoryDeclaration__StoryAssignment_4 )* ) )
            // InternalTraceryPlusPlus.g:2033:1: ( ( rule__SubstoryDeclaration__StoryAssignment_4 )* )
            {
            // InternalTraceryPlusPlus.g:2033:1: ( ( rule__SubstoryDeclaration__StoryAssignment_4 )* )
            // InternalTraceryPlusPlus.g:2034:2: ( rule__SubstoryDeclaration__StoryAssignment_4 )*
            {
             before(grammarAccess.getSubstoryDeclarationAccess().getStoryAssignment_4()); 
            // InternalTraceryPlusPlus.g:2035:2: ( rule__SubstoryDeclaration__StoryAssignment_4 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_STRING)||LA28_0==51) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:2035:3: rule__SubstoryDeclaration__StoryAssignment_4
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
    // InternalTraceryPlusPlus.g:2043:1: rule__SubstoryDeclaration__Group__5 : rule__SubstoryDeclaration__Group__5__Impl ;
    public final void rule__SubstoryDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2047:1: ( rule__SubstoryDeclaration__Group__5__Impl )
            // InternalTraceryPlusPlus.g:2048:2: rule__SubstoryDeclaration__Group__5__Impl
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
    // InternalTraceryPlusPlus.g:2054:1: rule__SubstoryDeclaration__Group__5__Impl : ( 'end-substory' ) ;
    public final void rule__SubstoryDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2058:1: ( ( 'end-substory' ) )
            // InternalTraceryPlusPlus.g:2059:1: ( 'end-substory' )
            {
            // InternalTraceryPlusPlus.g:2059:1: ( 'end-substory' )
            // InternalTraceryPlusPlus.g:2060:2: 'end-substory'
            {
             before(grammarAccess.getSubstoryDeclarationAccess().getEndSubstoryKeyword_5()); 
            match(input,50,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:2070:1: rule__NameExistingListAttribute__Group__0 : rule__NameExistingListAttribute__Group__0__Impl rule__NameExistingListAttribute__Group__1 ;
    public final void rule__NameExistingListAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2074:1: ( rule__NameExistingListAttribute__Group__0__Impl rule__NameExistingListAttribute__Group__1 )
            // InternalTraceryPlusPlus.g:2075:2: rule__NameExistingListAttribute__Group__0__Impl rule__NameExistingListAttribute__Group__1
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
    // InternalTraceryPlusPlus.g:2082:1: rule__NameExistingListAttribute__Group__0__Impl : ( ( rule__NameExistingListAttribute__NameAssignment_0 ) ) ;
    public final void rule__NameExistingListAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2086:1: ( ( ( rule__NameExistingListAttribute__NameAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:2087:1: ( ( rule__NameExistingListAttribute__NameAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:2087:1: ( ( rule__NameExistingListAttribute__NameAssignment_0 ) )
            // InternalTraceryPlusPlus.g:2088:2: ( rule__NameExistingListAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getNameExistingListAttributeAccess().getNameAssignment_0()); 
            // InternalTraceryPlusPlus.g:2089:2: ( rule__NameExistingListAttribute__NameAssignment_0 )
            // InternalTraceryPlusPlus.g:2089:3: rule__NameExistingListAttribute__NameAssignment_0
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
    // InternalTraceryPlusPlus.g:2097:1: rule__NameExistingListAttribute__Group__1 : rule__NameExistingListAttribute__Group__1__Impl rule__NameExistingListAttribute__Group__2 ;
    public final void rule__NameExistingListAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2101:1: ( rule__NameExistingListAttribute__Group__1__Impl rule__NameExistingListAttribute__Group__2 )
            // InternalTraceryPlusPlus.g:2102:2: rule__NameExistingListAttribute__Group__1__Impl rule__NameExistingListAttribute__Group__2
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
    // InternalTraceryPlusPlus.g:2109:1: rule__NameExistingListAttribute__Group__1__Impl : ( ( rule__NameExistingListAttribute__Alternatives_1 )? ) ;
    public final void rule__NameExistingListAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2113:1: ( ( ( rule__NameExistingListAttribute__Alternatives_1 )? ) )
            // InternalTraceryPlusPlus.g:2114:1: ( ( rule__NameExistingListAttribute__Alternatives_1 )? )
            {
            // InternalTraceryPlusPlus.g:2114:1: ( ( rule__NameExistingListAttribute__Alternatives_1 )? )
            // InternalTraceryPlusPlus.g:2115:2: ( rule__NameExistingListAttribute__Alternatives_1 )?
            {
             before(grammarAccess.getNameExistingListAttributeAccess().getAlternatives_1()); 
            // InternalTraceryPlusPlus.g:2116:2: ( rule__NameExistingListAttribute__Alternatives_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==13||LA29_0==17||(LA29_0>=24 && LA29_0<=27)||LA29_0==53) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalTraceryPlusPlus.g:2116:3: rule__NameExistingListAttribute__Alternatives_1
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
    // InternalTraceryPlusPlus.g:2124:1: rule__NameExistingListAttribute__Group__2 : rule__NameExistingListAttribute__Group__2__Impl ;
    public final void rule__NameExistingListAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2128:1: ( rule__NameExistingListAttribute__Group__2__Impl )
            // InternalTraceryPlusPlus.g:2129:2: rule__NameExistingListAttribute__Group__2__Impl
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
    // InternalTraceryPlusPlus.g:2135:1: rule__NameExistingListAttribute__Group__2__Impl : ( ( rule__NameExistingListAttribute__ValueAssignment_2 ) ) ;
    public final void rule__NameExistingListAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2139:1: ( ( ( rule__NameExistingListAttribute__ValueAssignment_2 ) ) )
            // InternalTraceryPlusPlus.g:2140:1: ( ( rule__NameExistingListAttribute__ValueAssignment_2 ) )
            {
            // InternalTraceryPlusPlus.g:2140:1: ( ( rule__NameExistingListAttribute__ValueAssignment_2 ) )
            // InternalTraceryPlusPlus.g:2141:2: ( rule__NameExistingListAttribute__ValueAssignment_2 )
            {
             before(grammarAccess.getNameExistingListAttributeAccess().getValueAssignment_2()); 
            // InternalTraceryPlusPlus.g:2142:2: ( rule__NameExistingListAttribute__ValueAssignment_2 )
            // InternalTraceryPlusPlus.g:2142:3: rule__NameExistingListAttribute__ValueAssignment_2
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
    // InternalTraceryPlusPlus.g:2151:1: rule__NameValueAttribute__Group__0 : rule__NameValueAttribute__Group__0__Impl rule__NameValueAttribute__Group__1 ;
    public final void rule__NameValueAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2155:1: ( rule__NameValueAttribute__Group__0__Impl rule__NameValueAttribute__Group__1 )
            // InternalTraceryPlusPlus.g:2156:2: rule__NameValueAttribute__Group__0__Impl rule__NameValueAttribute__Group__1
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
    // InternalTraceryPlusPlus.g:2163:1: rule__NameValueAttribute__Group__0__Impl : ( ( rule__NameValueAttribute__NameAssignment_0 ) ) ;
    public final void rule__NameValueAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2167:1: ( ( ( rule__NameValueAttribute__NameAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:2168:1: ( ( rule__NameValueAttribute__NameAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:2168:1: ( ( rule__NameValueAttribute__NameAssignment_0 ) )
            // InternalTraceryPlusPlus.g:2169:2: ( rule__NameValueAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getNameValueAttributeAccess().getNameAssignment_0()); 
            // InternalTraceryPlusPlus.g:2170:2: ( rule__NameValueAttribute__NameAssignment_0 )
            // InternalTraceryPlusPlus.g:2170:3: rule__NameValueAttribute__NameAssignment_0
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
    // InternalTraceryPlusPlus.g:2178:1: rule__NameValueAttribute__Group__1 : rule__NameValueAttribute__Group__1__Impl rule__NameValueAttribute__Group__2 ;
    public final void rule__NameValueAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2182:1: ( rule__NameValueAttribute__Group__1__Impl rule__NameValueAttribute__Group__2 )
            // InternalTraceryPlusPlus.g:2183:2: rule__NameValueAttribute__Group__1__Impl rule__NameValueAttribute__Group__2
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
    // InternalTraceryPlusPlus.g:2190:1: rule__NameValueAttribute__Group__1__Impl : ( ( ruleAssignmentOperator )? ) ;
    public final void rule__NameValueAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2194:1: ( ( ( ruleAssignmentOperator )? ) )
            // InternalTraceryPlusPlus.g:2195:1: ( ( ruleAssignmentOperator )? )
            {
            // InternalTraceryPlusPlus.g:2195:1: ( ( ruleAssignmentOperator )? )
            // InternalTraceryPlusPlus.g:2196:2: ( ruleAssignmentOperator )?
            {
             before(grammarAccess.getNameValueAttributeAccess().getAssignmentOperatorParserRuleCall_1()); 
            // InternalTraceryPlusPlus.g:2197:2: ( ruleAssignmentOperator )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==13||(LA30_0>=24 && LA30_0<=27)||LA30_0==53) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalTraceryPlusPlus.g:2197:3: ruleAssignmentOperator
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
    // InternalTraceryPlusPlus.g:2205:1: rule__NameValueAttribute__Group__2 : rule__NameValueAttribute__Group__2__Impl ;
    public final void rule__NameValueAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2209:1: ( rule__NameValueAttribute__Group__2__Impl )
            // InternalTraceryPlusPlus.g:2210:2: rule__NameValueAttribute__Group__2__Impl
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
    // InternalTraceryPlusPlus.g:2216:1: rule__NameValueAttribute__Group__2__Impl : ( ( rule__NameValueAttribute__ValueAssignment_2 ) ) ;
    public final void rule__NameValueAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2220:1: ( ( ( rule__NameValueAttribute__ValueAssignment_2 ) ) )
            // InternalTraceryPlusPlus.g:2221:1: ( ( rule__NameValueAttribute__ValueAssignment_2 ) )
            {
            // InternalTraceryPlusPlus.g:2221:1: ( ( rule__NameValueAttribute__ValueAssignment_2 ) )
            // InternalTraceryPlusPlus.g:2222:2: ( rule__NameValueAttribute__ValueAssignment_2 )
            {
             before(grammarAccess.getNameValueAttributeAccess().getValueAssignment_2()); 
            // InternalTraceryPlusPlus.g:2223:2: ( rule__NameValueAttribute__ValueAssignment_2 )
            // InternalTraceryPlusPlus.g:2223:3: rule__NameValueAttribute__ValueAssignment_2
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
    // InternalTraceryPlusPlus.g:2232:1: rule__ListUse__Group__0 : rule__ListUse__Group__0__Impl rule__ListUse__Group__1 ;
    public final void rule__ListUse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2236:1: ( rule__ListUse__Group__0__Impl rule__ListUse__Group__1 )
            // InternalTraceryPlusPlus.g:2237:2: rule__ListUse__Group__0__Impl rule__ListUse__Group__1
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
    // InternalTraceryPlusPlus.g:2244:1: rule__ListUse__Group__0__Impl : ( ( rule__ListUse__VariableAssignment_0 ) ) ;
    public final void rule__ListUse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2248:1: ( ( ( rule__ListUse__VariableAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:2249:1: ( ( rule__ListUse__VariableAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:2249:1: ( ( rule__ListUse__VariableAssignment_0 ) )
            // InternalTraceryPlusPlus.g:2250:2: ( rule__ListUse__VariableAssignment_0 )
            {
             before(grammarAccess.getListUseAccess().getVariableAssignment_0()); 
            // InternalTraceryPlusPlus.g:2251:2: ( rule__ListUse__VariableAssignment_0 )
            // InternalTraceryPlusPlus.g:2251:3: rule__ListUse__VariableAssignment_0
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
    // InternalTraceryPlusPlus.g:2259:1: rule__ListUse__Group__1 : rule__ListUse__Group__1__Impl ;
    public final void rule__ListUse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2263:1: ( rule__ListUse__Group__1__Impl )
            // InternalTraceryPlusPlus.g:2264:2: rule__ListUse__Group__1__Impl
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
    // InternalTraceryPlusPlus.g:2270:1: rule__ListUse__Group__1__Impl : ( ( rule__ListUse__ModifiersAssignment_1 ) ) ;
    public final void rule__ListUse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2274:1: ( ( ( rule__ListUse__ModifiersAssignment_1 ) ) )
            // InternalTraceryPlusPlus.g:2275:1: ( ( rule__ListUse__ModifiersAssignment_1 ) )
            {
            // InternalTraceryPlusPlus.g:2275:1: ( ( rule__ListUse__ModifiersAssignment_1 ) )
            // InternalTraceryPlusPlus.g:2276:2: ( rule__ListUse__ModifiersAssignment_1 )
            {
             before(grammarAccess.getListUseAccess().getModifiersAssignment_1()); 
            // InternalTraceryPlusPlus.g:2277:2: ( rule__ListUse__ModifiersAssignment_1 )
            // InternalTraceryPlusPlus.g:2277:3: rule__ListUse__ModifiersAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ListUse__ModifiersAssignment_1();

            state._fsp--;


            }

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
    // InternalTraceryPlusPlus.g:2286:1: rule__SubstoryUse__Group__0 : rule__SubstoryUse__Group__0__Impl rule__SubstoryUse__Group__1 ;
    public final void rule__SubstoryUse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2290:1: ( rule__SubstoryUse__Group__0__Impl rule__SubstoryUse__Group__1 )
            // InternalTraceryPlusPlus.g:2291:2: rule__SubstoryUse__Group__0__Impl rule__SubstoryUse__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalTraceryPlusPlus.g:2298:1: rule__SubstoryUse__Group__0__Impl : ( 'use' ) ;
    public final void rule__SubstoryUse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2302:1: ( ( 'use' ) )
            // InternalTraceryPlusPlus.g:2303:1: ( 'use' )
            {
            // InternalTraceryPlusPlus.g:2303:1: ( 'use' )
            // InternalTraceryPlusPlus.g:2304:2: 'use'
            {
             before(grammarAccess.getSubstoryUseAccess().getUseKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:2313:1: rule__SubstoryUse__Group__1 : rule__SubstoryUse__Group__1__Impl rule__SubstoryUse__Group__2 ;
    public final void rule__SubstoryUse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2317:1: ( rule__SubstoryUse__Group__1__Impl rule__SubstoryUse__Group__2 )
            // InternalTraceryPlusPlus.g:2318:2: rule__SubstoryUse__Group__1__Impl rule__SubstoryUse__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalTraceryPlusPlus.g:2325:1: rule__SubstoryUse__Group__1__Impl : ( ( rule__SubstoryUse__Alternatives_1 )? ) ;
    public final void rule__SubstoryUse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2329:1: ( ( ( rule__SubstoryUse__Alternatives_1 )? ) )
            // InternalTraceryPlusPlus.g:2330:1: ( ( rule__SubstoryUse__Alternatives_1 )? )
            {
            // InternalTraceryPlusPlus.g:2330:1: ( ( rule__SubstoryUse__Alternatives_1 )? )
            // InternalTraceryPlusPlus.g:2331:2: ( rule__SubstoryUse__Alternatives_1 )?
            {
             before(grammarAccess.getSubstoryUseAccess().getAlternatives_1()); 
            // InternalTraceryPlusPlus.g:2332:2: ( rule__SubstoryUse__Alternatives_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=18 && LA31_0<=19)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalTraceryPlusPlus.g:2332:3: rule__SubstoryUse__Alternatives_1
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
    // InternalTraceryPlusPlus.g:2340:1: rule__SubstoryUse__Group__2 : rule__SubstoryUse__Group__2__Impl ;
    public final void rule__SubstoryUse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2344:1: ( rule__SubstoryUse__Group__2__Impl )
            // InternalTraceryPlusPlus.g:2345:2: rule__SubstoryUse__Group__2__Impl
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
    // InternalTraceryPlusPlus.g:2351:1: rule__SubstoryUse__Group__2__Impl : ( ( rule__SubstoryUse__VariableAssignment_2 ) ) ;
    public final void rule__SubstoryUse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2355:1: ( ( ( rule__SubstoryUse__VariableAssignment_2 ) ) )
            // InternalTraceryPlusPlus.g:2356:1: ( ( rule__SubstoryUse__VariableAssignment_2 ) )
            {
            // InternalTraceryPlusPlus.g:2356:1: ( ( rule__SubstoryUse__VariableAssignment_2 ) )
            // InternalTraceryPlusPlus.g:2357:2: ( rule__SubstoryUse__VariableAssignment_2 )
            {
             before(grammarAccess.getSubstoryUseAccess().getVariableAssignment_2()); 
            // InternalTraceryPlusPlus.g:2358:2: ( rule__SubstoryUse__VariableAssignment_2 )
            // InternalTraceryPlusPlus.g:2358:3: rule__SubstoryUse__VariableAssignment_2
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
    // InternalTraceryPlusPlus.g:2367:1: rule__ObjectAttribute__Group__0 : rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1 ;
    public final void rule__ObjectAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2371:1: ( rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1 )
            // InternalTraceryPlusPlus.g:2372:2: rule__ObjectAttribute__Group__0__Impl rule__ObjectAttribute__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalTraceryPlusPlus.g:2379:1: rule__ObjectAttribute__Group__0__Impl : ( ( rule__ObjectAttribute__ObjectAssignment_0 ) ) ;
    public final void rule__ObjectAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2383:1: ( ( ( rule__ObjectAttribute__ObjectAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:2384:1: ( ( rule__ObjectAttribute__ObjectAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:2384:1: ( ( rule__ObjectAttribute__ObjectAssignment_0 ) )
            // InternalTraceryPlusPlus.g:2385:2: ( rule__ObjectAttribute__ObjectAssignment_0 )
            {
             before(grammarAccess.getObjectAttributeAccess().getObjectAssignment_0()); 
            // InternalTraceryPlusPlus.g:2386:2: ( rule__ObjectAttribute__ObjectAssignment_0 )
            // InternalTraceryPlusPlus.g:2386:3: rule__ObjectAttribute__ObjectAssignment_0
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
    // InternalTraceryPlusPlus.g:2394:1: rule__ObjectAttribute__Group__1 : rule__ObjectAttribute__Group__1__Impl rule__ObjectAttribute__Group__2 ;
    public final void rule__ObjectAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2398:1: ( rule__ObjectAttribute__Group__1__Impl rule__ObjectAttribute__Group__2 )
            // InternalTraceryPlusPlus.g:2399:2: rule__ObjectAttribute__Group__1__Impl rule__ObjectAttribute__Group__2
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
    // InternalTraceryPlusPlus.g:2406:1: rule__ObjectAttribute__Group__1__Impl : ( '.' ) ;
    public final void rule__ObjectAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2410:1: ( ( '.' ) )
            // InternalTraceryPlusPlus.g:2411:1: ( '.' )
            {
            // InternalTraceryPlusPlus.g:2411:1: ( '.' )
            // InternalTraceryPlusPlus.g:2412:2: '.'
            {
             before(grammarAccess.getObjectAttributeAccess().getFullStopKeyword_1()); 
            match(input,52,FOLLOW_2); 
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
    // InternalTraceryPlusPlus.g:2421:1: rule__ObjectAttribute__Group__2 : rule__ObjectAttribute__Group__2__Impl rule__ObjectAttribute__Group__3 ;
    public final void rule__ObjectAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2425:1: ( rule__ObjectAttribute__Group__2__Impl rule__ObjectAttribute__Group__3 )
            // InternalTraceryPlusPlus.g:2426:2: rule__ObjectAttribute__Group__2__Impl rule__ObjectAttribute__Group__3
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
    // InternalTraceryPlusPlus.g:2433:1: rule__ObjectAttribute__Group__2__Impl : ( ( rule__ObjectAttribute__AttributeAssignment_2 ) ) ;
    public final void rule__ObjectAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2437:1: ( ( ( rule__ObjectAttribute__AttributeAssignment_2 ) ) )
            // InternalTraceryPlusPlus.g:2438:1: ( ( rule__ObjectAttribute__AttributeAssignment_2 ) )
            {
            // InternalTraceryPlusPlus.g:2438:1: ( ( rule__ObjectAttribute__AttributeAssignment_2 ) )
            // InternalTraceryPlusPlus.g:2439:2: ( rule__ObjectAttribute__AttributeAssignment_2 )
            {
             before(grammarAccess.getObjectAttributeAccess().getAttributeAssignment_2()); 
            // InternalTraceryPlusPlus.g:2440:2: ( rule__ObjectAttribute__AttributeAssignment_2 )
            // InternalTraceryPlusPlus.g:2440:3: rule__ObjectAttribute__AttributeAssignment_2
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
    // InternalTraceryPlusPlus.g:2448:1: rule__ObjectAttribute__Group__3 : rule__ObjectAttribute__Group__3__Impl ;
    public final void rule__ObjectAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2452:1: ( rule__ObjectAttribute__Group__3__Impl )
            // InternalTraceryPlusPlus.g:2453:2: rule__ObjectAttribute__Group__3__Impl
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
    // InternalTraceryPlusPlus.g:2459:1: rule__ObjectAttribute__Group__3__Impl : ( ( rule__ObjectAttribute__ModifiersAssignment_3 ) ) ;
    public final void rule__ObjectAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2463:1: ( ( ( rule__ObjectAttribute__ModifiersAssignment_3 ) ) )
            // InternalTraceryPlusPlus.g:2464:1: ( ( rule__ObjectAttribute__ModifiersAssignment_3 ) )
            {
            // InternalTraceryPlusPlus.g:2464:1: ( ( rule__ObjectAttribute__ModifiersAssignment_3 ) )
            // InternalTraceryPlusPlus.g:2465:2: ( rule__ObjectAttribute__ModifiersAssignment_3 )
            {
             before(grammarAccess.getObjectAttributeAccess().getModifiersAssignment_3()); 
            // InternalTraceryPlusPlus.g:2466:2: ( rule__ObjectAttribute__ModifiersAssignment_3 )
            // InternalTraceryPlusPlus.g:2466:3: rule__ObjectAttribute__ModifiersAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ObjectAttribute__ModifiersAssignment_3();

            state._fsp--;


            }

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
    // InternalTraceryPlusPlus.g:2475:1: rule__ObjectPronoun__Group__0 : rule__ObjectPronoun__Group__0__Impl rule__ObjectPronoun__Group__1 ;
    public final void rule__ObjectPronoun__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2479:1: ( rule__ObjectPronoun__Group__0__Impl rule__ObjectPronoun__Group__1 )
            // InternalTraceryPlusPlus.g:2480:2: rule__ObjectPronoun__Group__0__Impl rule__ObjectPronoun__Group__1
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
    // InternalTraceryPlusPlus.g:2487:1: rule__ObjectPronoun__Group__0__Impl : ( ( rule__ObjectPronoun__ObjectAssignment_0 ) ) ;
    public final void rule__ObjectPronoun__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2491:1: ( ( ( rule__ObjectPronoun__ObjectAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:2492:1: ( ( rule__ObjectPronoun__ObjectAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:2492:1: ( ( rule__ObjectPronoun__ObjectAssignment_0 ) )
            // InternalTraceryPlusPlus.g:2493:2: ( rule__ObjectPronoun__ObjectAssignment_0 )
            {
             before(grammarAccess.getObjectPronounAccess().getObjectAssignment_0()); 
            // InternalTraceryPlusPlus.g:2494:2: ( rule__ObjectPronoun__ObjectAssignment_0 )
            // InternalTraceryPlusPlus.g:2494:3: rule__ObjectPronoun__ObjectAssignment_0
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
    // InternalTraceryPlusPlus.g:2502:1: rule__ObjectPronoun__Group__1 : rule__ObjectPronoun__Group__1__Impl ;
    public final void rule__ObjectPronoun__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2506:1: ( rule__ObjectPronoun__Group__1__Impl )
            // InternalTraceryPlusPlus.g:2507:2: rule__ObjectPronoun__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectPronoun__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalTraceryPlusPlus.g:2513:1: rule__ObjectPronoun__Group__1__Impl : ( ( rule__ObjectPronoun__PronounAssignment_1 ) ) ;
    public final void rule__ObjectPronoun__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2517:1: ( ( ( rule__ObjectPronoun__PronounAssignment_1 ) ) )
            // InternalTraceryPlusPlus.g:2518:1: ( ( rule__ObjectPronoun__PronounAssignment_1 ) )
            {
            // InternalTraceryPlusPlus.g:2518:1: ( ( rule__ObjectPronoun__PronounAssignment_1 ) )
            // InternalTraceryPlusPlus.g:2519:2: ( rule__ObjectPronoun__PronounAssignment_1 )
            {
             before(grammarAccess.getObjectPronounAccess().getPronounAssignment_1()); 
            // InternalTraceryPlusPlus.g:2520:2: ( rule__ObjectPronoun__PronounAssignment_1 )
            // InternalTraceryPlusPlus.g:2520:3: rule__ObjectPronoun__PronounAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjectPronoun__PronounAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectPronounAccess().getPronounAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__WordList__Group__0"
    // InternalTraceryPlusPlus.g:2529:1: rule__WordList__Group__0 : rule__WordList__Group__0__Impl rule__WordList__Group__1 ;
    public final void rule__WordList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2533:1: ( rule__WordList__Group__0__Impl rule__WordList__Group__1 )
            // InternalTraceryPlusPlus.g:2534:2: rule__WordList__Group__0__Impl rule__WordList__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalTraceryPlusPlus.g:2541:1: rule__WordList__Group__0__Impl : ( ( rule__WordList__WordsAssignment_0 ) ) ;
    public final void rule__WordList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2545:1: ( ( ( rule__WordList__WordsAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:2546:1: ( ( rule__WordList__WordsAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:2546:1: ( ( rule__WordList__WordsAssignment_0 ) )
            // InternalTraceryPlusPlus.g:2547:2: ( rule__WordList__WordsAssignment_0 )
            {
             before(grammarAccess.getWordListAccess().getWordsAssignment_0()); 
            // InternalTraceryPlusPlus.g:2548:2: ( rule__WordList__WordsAssignment_0 )
            // InternalTraceryPlusPlus.g:2548:3: rule__WordList__WordsAssignment_0
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
    // InternalTraceryPlusPlus.g:2556:1: rule__WordList__Group__1 : rule__WordList__Group__1__Impl ;
    public final void rule__WordList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2560:1: ( rule__WordList__Group__1__Impl )
            // InternalTraceryPlusPlus.g:2561:2: rule__WordList__Group__1__Impl
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
    // InternalTraceryPlusPlus.g:2567:1: rule__WordList__Group__1__Impl : ( ( rule__WordList__Group_1__0 )* ) ;
    public final void rule__WordList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2571:1: ( ( ( rule__WordList__Group_1__0 )* ) )
            // InternalTraceryPlusPlus.g:2572:1: ( ( rule__WordList__Group_1__0 )* )
            {
            // InternalTraceryPlusPlus.g:2572:1: ( ( rule__WordList__Group_1__0 )* )
            // InternalTraceryPlusPlus.g:2573:2: ( rule__WordList__Group_1__0 )*
            {
             before(grammarAccess.getWordListAccess().getGroup_1()); 
            // InternalTraceryPlusPlus.g:2574:2: ( rule__WordList__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=28 && LA32_0<=30)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:2574:3: rule__WordList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__WordList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalTraceryPlusPlus.g:2583:1: rule__WordList__Group_1__0 : rule__WordList__Group_1__0__Impl rule__WordList__Group_1__1 ;
    public final void rule__WordList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2587:1: ( rule__WordList__Group_1__0__Impl rule__WordList__Group_1__1 )
            // InternalTraceryPlusPlus.g:2588:2: rule__WordList__Group_1__0__Impl rule__WordList__Group_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalTraceryPlusPlus.g:2595:1: rule__WordList__Group_1__0__Impl : ( ruleSeparatorOr ) ;
    public final void rule__WordList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2599:1: ( ( ruleSeparatorOr ) )
            // InternalTraceryPlusPlus.g:2600:1: ( ruleSeparatorOr )
            {
            // InternalTraceryPlusPlus.g:2600:1: ( ruleSeparatorOr )
            // InternalTraceryPlusPlus.g:2601:2: ruleSeparatorOr
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
    // InternalTraceryPlusPlus.g:2610:1: rule__WordList__Group_1__1 : rule__WordList__Group_1__1__Impl ;
    public final void rule__WordList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2614:1: ( rule__WordList__Group_1__1__Impl )
            // InternalTraceryPlusPlus.g:2615:2: rule__WordList__Group_1__1__Impl
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
    // InternalTraceryPlusPlus.g:2621:1: rule__WordList__Group_1__1__Impl : ( ( rule__WordList__WordsAssignment_1_1 ) ) ;
    public final void rule__WordList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2625:1: ( ( ( rule__WordList__WordsAssignment_1_1 ) ) )
            // InternalTraceryPlusPlus.g:2626:1: ( ( rule__WordList__WordsAssignment_1_1 ) )
            {
            // InternalTraceryPlusPlus.g:2626:1: ( ( rule__WordList__WordsAssignment_1_1 ) )
            // InternalTraceryPlusPlus.g:2627:2: ( rule__WordList__WordsAssignment_1_1 )
            {
             before(grammarAccess.getWordListAccess().getWordsAssignment_1_1()); 
            // InternalTraceryPlusPlus.g:2628:2: ( rule__WordList__WordsAssignment_1_1 )
            // InternalTraceryPlusPlus.g:2628:3: rule__WordList__WordsAssignment_1_1
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
    // InternalTraceryPlusPlus.g:2637:1: rule__AttributeList__Group__0 : rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 ;
    public final void rule__AttributeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2641:1: ( rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 )
            // InternalTraceryPlusPlus.g:2642:2: rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalTraceryPlusPlus.g:2649:1: rule__AttributeList__Group__0__Impl : ( ( rule__AttributeList__AttributesAssignment_0 ) ) ;
    public final void rule__AttributeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2653:1: ( ( ( rule__AttributeList__AttributesAssignment_0 ) ) )
            // InternalTraceryPlusPlus.g:2654:1: ( ( rule__AttributeList__AttributesAssignment_0 ) )
            {
            // InternalTraceryPlusPlus.g:2654:1: ( ( rule__AttributeList__AttributesAssignment_0 ) )
            // InternalTraceryPlusPlus.g:2655:2: ( rule__AttributeList__AttributesAssignment_0 )
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAssignment_0()); 
            // InternalTraceryPlusPlus.g:2656:2: ( rule__AttributeList__AttributesAssignment_0 )
            // InternalTraceryPlusPlus.g:2656:3: rule__AttributeList__AttributesAssignment_0
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
    // InternalTraceryPlusPlus.g:2664:1: rule__AttributeList__Group__1 : rule__AttributeList__Group__1__Impl ;
    public final void rule__AttributeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2668:1: ( rule__AttributeList__Group__1__Impl )
            // InternalTraceryPlusPlus.g:2669:2: rule__AttributeList__Group__1__Impl
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
    // InternalTraceryPlusPlus.g:2675:1: rule__AttributeList__Group__1__Impl : ( ( rule__AttributeList__Group_1__0 )* ) ;
    public final void rule__AttributeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2679:1: ( ( ( rule__AttributeList__Group_1__0 )* ) )
            // InternalTraceryPlusPlus.g:2680:1: ( ( rule__AttributeList__Group_1__0 )* )
            {
            // InternalTraceryPlusPlus.g:2680:1: ( ( rule__AttributeList__Group_1__0 )* )
            // InternalTraceryPlusPlus.g:2681:2: ( rule__AttributeList__Group_1__0 )*
            {
             before(grammarAccess.getAttributeListAccess().getGroup_1()); 
            // InternalTraceryPlusPlus.g:2682:2: ( rule__AttributeList__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==28||(LA33_0>=31 && LA33_0<=32)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:2682:3: rule__AttributeList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__AttributeList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalTraceryPlusPlus.g:2691:1: rule__AttributeList__Group_1__0 : rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1 ;
    public final void rule__AttributeList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2695:1: ( rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1 )
            // InternalTraceryPlusPlus.g:2696:2: rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1
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
    // InternalTraceryPlusPlus.g:2703:1: rule__AttributeList__Group_1__0__Impl : ( ruleSeparatorAnd ) ;
    public final void rule__AttributeList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2707:1: ( ( ruleSeparatorAnd ) )
            // InternalTraceryPlusPlus.g:2708:1: ( ruleSeparatorAnd )
            {
            // InternalTraceryPlusPlus.g:2708:1: ( ruleSeparatorAnd )
            // InternalTraceryPlusPlus.g:2709:2: ruleSeparatorAnd
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
    // InternalTraceryPlusPlus.g:2718:1: rule__AttributeList__Group_1__1 : rule__AttributeList__Group_1__1__Impl ;
    public final void rule__AttributeList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2722:1: ( rule__AttributeList__Group_1__1__Impl )
            // InternalTraceryPlusPlus.g:2723:2: rule__AttributeList__Group_1__1__Impl
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
    // InternalTraceryPlusPlus.g:2729:1: rule__AttributeList__Group_1__1__Impl : ( ( rule__AttributeList__AttributesAssignment_1_1 ) ) ;
    public final void rule__AttributeList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2733:1: ( ( ( rule__AttributeList__AttributesAssignment_1_1 ) ) )
            // InternalTraceryPlusPlus.g:2734:1: ( ( rule__AttributeList__AttributesAssignment_1_1 ) )
            {
            // InternalTraceryPlusPlus.g:2734:1: ( ( rule__AttributeList__AttributesAssignment_1_1 ) )
            // InternalTraceryPlusPlus.g:2735:2: ( rule__AttributeList__AttributesAssignment_1_1 )
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAssignment_1_1()); 
            // InternalTraceryPlusPlus.g:2736:2: ( rule__AttributeList__AttributesAssignment_1_1 )
            // InternalTraceryPlusPlus.g:2736:3: rule__AttributeList__AttributesAssignment_1_1
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


    // $ANTLR start "rule__ModifierList__Group__0"
    // InternalTraceryPlusPlus.g:2745:1: rule__ModifierList__Group__0 : rule__ModifierList__Group__0__Impl rule__ModifierList__Group__1 ;
    public final void rule__ModifierList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2749:1: ( rule__ModifierList__Group__0__Impl rule__ModifierList__Group__1 )
            // InternalTraceryPlusPlus.g:2750:2: rule__ModifierList__Group__0__Impl rule__ModifierList__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ModifierList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModifierList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifierList__Group__0"


    // $ANTLR start "rule__ModifierList__Group__0__Impl"
    // InternalTraceryPlusPlus.g:2757:1: rule__ModifierList__Group__0__Impl : ( () ) ;
    public final void rule__ModifierList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2761:1: ( ( () ) )
            // InternalTraceryPlusPlus.g:2762:1: ( () )
            {
            // InternalTraceryPlusPlus.g:2762:1: ( () )
            // InternalTraceryPlusPlus.g:2763:2: ()
            {
             before(grammarAccess.getModifierListAccess().getModifierListAction_0()); 
            // InternalTraceryPlusPlus.g:2764:2: ()
            // InternalTraceryPlusPlus.g:2764:3: 
            {
            }

             after(grammarAccess.getModifierListAccess().getModifierListAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifierList__Group__0__Impl"


    // $ANTLR start "rule__ModifierList__Group__1"
    // InternalTraceryPlusPlus.g:2772:1: rule__ModifierList__Group__1 : rule__ModifierList__Group__1__Impl ;
    public final void rule__ModifierList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2776:1: ( rule__ModifierList__Group__1__Impl )
            // InternalTraceryPlusPlus.g:2777:2: rule__ModifierList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModifierList__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifierList__Group__1"


    // $ANTLR start "rule__ModifierList__Group__1__Impl"
    // InternalTraceryPlusPlus.g:2783:1: rule__ModifierList__Group__1__Impl : ( ( rule__ModifierList__ModifiersAssignment_1 )* ) ;
    public final void rule__ModifierList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2787:1: ( ( ( rule__ModifierList__ModifiersAssignment_1 )* ) )
            // InternalTraceryPlusPlus.g:2788:1: ( ( rule__ModifierList__ModifiersAssignment_1 )* )
            {
            // InternalTraceryPlusPlus.g:2788:1: ( ( rule__ModifierList__ModifiersAssignment_1 )* )
            // InternalTraceryPlusPlus.g:2789:2: ( rule__ModifierList__ModifiersAssignment_1 )*
            {
             before(grammarAccess.getModifierListAccess().getModifiersAssignment_1()); 
            // InternalTraceryPlusPlus.g:2790:2: ( rule__ModifierList__ModifiersAssignment_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=37 && LA34_0<=41)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:2790:3: rule__ModifierList__ModifiersAssignment_1
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__ModifierList__ModifiersAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getModifierListAccess().getModifiersAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifierList__Group__1__Impl"


    // $ANTLR start "rule__AssignmentOperator__Group_4__0"
    // InternalTraceryPlusPlus.g:2799:1: rule__AssignmentOperator__Group_4__0 : rule__AssignmentOperator__Group_4__0__Impl rule__AssignmentOperator__Group_4__1 ;
    public final void rule__AssignmentOperator__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2803:1: ( rule__AssignmentOperator__Group_4__0__Impl rule__AssignmentOperator__Group_4__1 )
            // InternalTraceryPlusPlus.g:2804:2: rule__AssignmentOperator__Group_4__0__Impl rule__AssignmentOperator__Group_4__1
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
    // InternalTraceryPlusPlus.g:2811:1: rule__AssignmentOperator__Group_4__0__Impl : ( ( 'is' )? ) ;
    public final void rule__AssignmentOperator__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2815:1: ( ( ( 'is' )? ) )
            // InternalTraceryPlusPlus.g:2816:1: ( ( 'is' )? )
            {
            // InternalTraceryPlusPlus.g:2816:1: ( ( 'is' )? )
            // InternalTraceryPlusPlus.g:2817:2: ( 'is' )?
            {
             before(grammarAccess.getAssignmentOperatorAccess().getIsKeyword_4_0()); 
            // InternalTraceryPlusPlus.g:2818:2: ( 'is' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==13) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalTraceryPlusPlus.g:2818:3: 'is'
                    {
                    match(input,13,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getAssignmentOperatorAccess().getIsKeyword_4_0()); 

            }


            }

        }
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
    // InternalTraceryPlusPlus.g:2826:1: rule__AssignmentOperator__Group_4__1 : rule__AssignmentOperator__Group_4__1__Impl rule__AssignmentOperator__Group_4__2 ;
    public final void rule__AssignmentOperator__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2830:1: ( rule__AssignmentOperator__Group_4__1__Impl rule__AssignmentOperator__Group_4__2 )
            // InternalTraceryPlusPlus.g:2831:2: rule__AssignmentOperator__Group_4__1__Impl rule__AssignmentOperator__Group_4__2
            {
            pushFollow(FOLLOW_34);
            rule__AssignmentOperator__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssignmentOperator__Group_4__2();

            state._fsp--;


            }

        }
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
    // InternalTraceryPlusPlus.g:2838:1: rule__AssignmentOperator__Group_4__1__Impl : ( 'equal' ) ;
    public final void rule__AssignmentOperator__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2842:1: ( ( 'equal' ) )
            // InternalTraceryPlusPlus.g:2843:1: ( 'equal' )
            {
            // InternalTraceryPlusPlus.g:2843:1: ( 'equal' )
            // InternalTraceryPlusPlus.g:2844:2: 'equal'
            {
             before(grammarAccess.getAssignmentOperatorAccess().getEqualKeyword_4_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getAssignmentOperatorAccess().getEqualKeyword_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__AssignmentOperator__Group_4__2"
    // InternalTraceryPlusPlus.g:2853:1: rule__AssignmentOperator__Group_4__2 : rule__AssignmentOperator__Group_4__2__Impl ;
    public final void rule__AssignmentOperator__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2857:1: ( rule__AssignmentOperator__Group_4__2__Impl )
            // InternalTraceryPlusPlus.g:2858:2: rule__AssignmentOperator__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssignmentOperator__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentOperator__Group_4__2"


    // $ANTLR start "rule__AssignmentOperator__Group_4__2__Impl"
    // InternalTraceryPlusPlus.g:2864:1: rule__AssignmentOperator__Group_4__2__Impl : ( 'to' ) ;
    public final void rule__AssignmentOperator__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2868:1: ( ( 'to' ) )
            // InternalTraceryPlusPlus.g:2869:1: ( 'to' )
            {
            // InternalTraceryPlusPlus.g:2869:1: ( 'to' )
            // InternalTraceryPlusPlus.g:2870:2: 'to'
            {
             before(grammarAccess.getAssignmentOperatorAccess().getToKeyword_4_2()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getAssignmentOperatorAccess().getToKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentOperator__Group_4__2__Impl"


    // $ANTLR start "rule__TraceryPlusPlusProgram__StatementsAssignment_0"
    // InternalTraceryPlusPlus.g:2880:1: rule__TraceryPlusPlusProgram__StatementsAssignment_0 : ( ruleStatement ) ;
    public final void rule__TraceryPlusPlusProgram__StatementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2884:1: ( ( ruleStatement ) )
            // InternalTraceryPlusPlus.g:2885:2: ( ruleStatement )
            {
            // InternalTraceryPlusPlus.g:2885:2: ( ruleStatement )
            // InternalTraceryPlusPlus.g:2886:3: ruleStatement
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
    // InternalTraceryPlusPlus.g:2895:1: rule__TraceryPlusPlusProgram__StoryAssignment_1 : ( ruleStory ) ;
    public final void rule__TraceryPlusPlusProgram__StoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2899:1: ( ( ruleStory ) )
            // InternalTraceryPlusPlus.g:2900:2: ( ruleStory )
            {
            // InternalTraceryPlusPlus.g:2900:2: ( ruleStory )
            // InternalTraceryPlusPlus.g:2901:3: ruleStory
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
    // InternalTraceryPlusPlus.g:2910:1: rule__Story__StoryAssignment_4 : ( ( rule__Story__StoryAlternatives_4_0 ) ) ;
    public final void rule__Story__StoryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2914:1: ( ( ( rule__Story__StoryAlternatives_4_0 ) ) )
            // InternalTraceryPlusPlus.g:2915:2: ( ( rule__Story__StoryAlternatives_4_0 ) )
            {
            // InternalTraceryPlusPlus.g:2915:2: ( ( rule__Story__StoryAlternatives_4_0 ) )
            // InternalTraceryPlusPlus.g:2916:3: ( rule__Story__StoryAlternatives_4_0 )
            {
             before(grammarAccess.getStoryAccess().getStoryAlternatives_4_0()); 
            // InternalTraceryPlusPlus.g:2917:3: ( rule__Story__StoryAlternatives_4_0 )
            // InternalTraceryPlusPlus.g:2917:4: rule__Story__StoryAlternatives_4_0
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
    // InternalTraceryPlusPlus.g:2925:1: rule__ListDeclaration__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ListDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2929:1: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2930:2: ( RULE_ID )
            {
            // InternalTraceryPlusPlus.g:2930:2: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2931:3: RULE_ID
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
    // InternalTraceryPlusPlus.g:2940:1: rule__ListDeclaration__ListAssignment_3 : ( ruleWordList ) ;
    public final void rule__ListDeclaration__ListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2944:1: ( ( ruleWordList ) )
            // InternalTraceryPlusPlus.g:2945:2: ( ruleWordList )
            {
            // InternalTraceryPlusPlus.g:2945:2: ( ruleWordList )
            // InternalTraceryPlusPlus.g:2946:3: ruleWordList
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
    // InternalTraceryPlusPlus.g:2955:1: rule__ObjectDeclaration__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ObjectDeclaration__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2959:1: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:2960:2: ( RULE_ID )
            {
            // InternalTraceryPlusPlus.g:2960:2: ( RULE_ID )
            // InternalTraceryPlusPlus.g:2961:3: RULE_ID
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
    // InternalTraceryPlusPlus.g:2970:1: rule__ObjectDeclaration__PronounsAssignment_4 : ( rulePronouns ) ;
    public final void rule__ObjectDeclaration__PronounsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2974:1: ( ( rulePronouns ) )
            // InternalTraceryPlusPlus.g:2975:2: ( rulePronouns )
            {
            // InternalTraceryPlusPlus.g:2975:2: ( rulePronouns )
            // InternalTraceryPlusPlus.g:2976:3: rulePronouns
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
    // InternalTraceryPlusPlus.g:2985:1: rule__ObjectDeclaration__AttributesAssignment_8 : ( ruleAttributeList ) ;
    public final void rule__ObjectDeclaration__AttributesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:2989:1: ( ( ruleAttributeList ) )
            // InternalTraceryPlusPlus.g:2990:2: ( ruleAttributeList )
            {
            // InternalTraceryPlusPlus.g:2990:2: ( ruleAttributeList )
            // InternalTraceryPlusPlus.g:2991:3: ruleAttributeList
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
    // InternalTraceryPlusPlus.g:3000:1: rule__SubstoryDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SubstoryDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3004:1: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:3005:2: ( RULE_ID )
            {
            // InternalTraceryPlusPlus.g:3005:2: ( RULE_ID )
            // InternalTraceryPlusPlus.g:3006:3: RULE_ID
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
    // InternalTraceryPlusPlus.g:3015:1: rule__SubstoryDeclaration__StoryAssignment_4 : ( ( rule__SubstoryDeclaration__StoryAlternatives_4_0 ) ) ;
    public final void rule__SubstoryDeclaration__StoryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3019:1: ( ( ( rule__SubstoryDeclaration__StoryAlternatives_4_0 ) ) )
            // InternalTraceryPlusPlus.g:3020:2: ( ( rule__SubstoryDeclaration__StoryAlternatives_4_0 ) )
            {
            // InternalTraceryPlusPlus.g:3020:2: ( ( rule__SubstoryDeclaration__StoryAlternatives_4_0 ) )
            // InternalTraceryPlusPlus.g:3021:3: ( rule__SubstoryDeclaration__StoryAlternatives_4_0 )
            {
             before(grammarAccess.getSubstoryDeclarationAccess().getStoryAlternatives_4_0()); 
            // InternalTraceryPlusPlus.g:3022:3: ( rule__SubstoryDeclaration__StoryAlternatives_4_0 )
            // InternalTraceryPlusPlus.g:3022:4: rule__SubstoryDeclaration__StoryAlternatives_4_0
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
    // InternalTraceryPlusPlus.g:3030:1: rule__Word__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__Word__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3034:1: ( ( RULE_STRING ) )
            // InternalTraceryPlusPlus.g:3035:2: ( RULE_STRING )
            {
            // InternalTraceryPlusPlus.g:3035:2: ( RULE_STRING )
            // InternalTraceryPlusPlus.g:3036:3: RULE_STRING
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
    // InternalTraceryPlusPlus.g:3045:1: rule__NameExistingListAttribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NameExistingListAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3049:1: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:3050:2: ( RULE_ID )
            {
            // InternalTraceryPlusPlus.g:3050:2: ( RULE_ID )
            // InternalTraceryPlusPlus.g:3051:3: RULE_ID
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
    // InternalTraceryPlusPlus.g:3060:1: rule__NameExistingListAttribute__ValueAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__NameExistingListAttribute__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3064:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:3065:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:3065:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:3066:3: ( RULE_ID )
            {
             before(grammarAccess.getNameExistingListAttributeAccess().getValueListDeclarationCrossReference_2_0()); 
            // InternalTraceryPlusPlus.g:3067:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:3068:4: RULE_ID
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
    // InternalTraceryPlusPlus.g:3079:1: rule__NameValueAttribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NameValueAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3083:1: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:3084:2: ( RULE_ID )
            {
            // InternalTraceryPlusPlus.g:3084:2: ( RULE_ID )
            // InternalTraceryPlusPlus.g:3085:3: RULE_ID
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
    // InternalTraceryPlusPlus.g:3094:1: rule__NameValueAttribute__ValueAssignment_2 : ( ruleWord ) ;
    public final void rule__NameValueAttribute__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3098:1: ( ( ruleWord ) )
            // InternalTraceryPlusPlus.g:3099:2: ( ruleWord )
            {
            // InternalTraceryPlusPlus.g:3099:2: ( ruleWord )
            // InternalTraceryPlusPlus.g:3100:3: ruleWord
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
    // InternalTraceryPlusPlus.g:3109:1: rule__ListUse__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ListUse__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3113:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:3114:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:3114:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:3115:3: ( RULE_ID )
            {
             before(grammarAccess.getListUseAccess().getVariableListDeclarationCrossReference_0_0()); 
            // InternalTraceryPlusPlus.g:3116:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:3117:4: RULE_ID
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
    // InternalTraceryPlusPlus.g:3128:1: rule__ListUse__ModifiersAssignment_1 : ( ruleModifierList ) ;
    public final void rule__ListUse__ModifiersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3132:1: ( ( ruleModifierList ) )
            // InternalTraceryPlusPlus.g:3133:2: ( ruleModifierList )
            {
            // InternalTraceryPlusPlus.g:3133:2: ( ruleModifierList )
            // InternalTraceryPlusPlus.g:3134:3: ruleModifierList
            {
             before(grammarAccess.getListUseAccess().getModifiersModifierListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModifierList();

            state._fsp--;

             after(grammarAccess.getListUseAccess().getModifiersModifierListParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalTraceryPlusPlus.g:3143:1: rule__SubstoryUse__VariableAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__SubstoryUse__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3147:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:3148:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:3148:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:3149:3: ( RULE_ID )
            {
             before(grammarAccess.getSubstoryUseAccess().getVariableSubstoryDeclarationCrossReference_2_0()); 
            // InternalTraceryPlusPlus.g:3150:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:3151:4: RULE_ID
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
    // InternalTraceryPlusPlus.g:3162:1: rule__ObjectAttribute__ObjectAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectAttribute__ObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3166:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:3167:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:3167:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:3168:3: ( RULE_ID )
            {
             before(grammarAccess.getObjectAttributeAccess().getObjectObjectDeclarationCrossReference_0_0()); 
            // InternalTraceryPlusPlus.g:3169:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:3170:4: RULE_ID
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
    // InternalTraceryPlusPlus.g:3181:1: rule__ObjectAttribute__AttributeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectAttribute__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3185:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:3186:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:3186:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:3187:3: ( RULE_ID )
            {
             before(grammarAccess.getObjectAttributeAccess().getAttributeAttributeCrossReference_2_0()); 
            // InternalTraceryPlusPlus.g:3188:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:3189:4: RULE_ID
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
    // InternalTraceryPlusPlus.g:3200:1: rule__ObjectAttribute__ModifiersAssignment_3 : ( ruleModifierList ) ;
    public final void rule__ObjectAttribute__ModifiersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3204:1: ( ( ruleModifierList ) )
            // InternalTraceryPlusPlus.g:3205:2: ( ruleModifierList )
            {
            // InternalTraceryPlusPlus.g:3205:2: ( ruleModifierList )
            // InternalTraceryPlusPlus.g:3206:3: ruleModifierList
            {
             before(grammarAccess.getObjectAttributeAccess().getModifiersModifierListParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleModifierList();

            state._fsp--;

             after(grammarAccess.getObjectAttributeAccess().getModifiersModifierListParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalTraceryPlusPlus.g:3215:1: rule__ObjectPronoun__ObjectAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectPronoun__ObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3219:1: ( ( ( RULE_ID ) ) )
            // InternalTraceryPlusPlus.g:3220:2: ( ( RULE_ID ) )
            {
            // InternalTraceryPlusPlus.g:3220:2: ( ( RULE_ID ) )
            // InternalTraceryPlusPlus.g:3221:3: ( RULE_ID )
            {
             before(grammarAccess.getObjectPronounAccess().getObjectObjectDeclarationCrossReference_0_0()); 
            // InternalTraceryPlusPlus.g:3222:3: ( RULE_ID )
            // InternalTraceryPlusPlus.g:3223:4: RULE_ID
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


    // $ANTLR start "rule__ObjectPronoun__PronounAssignment_1"
    // InternalTraceryPlusPlus.g:3234:1: rule__ObjectPronoun__PronounAssignment_1 : ( rulePronounIdentifier ) ;
    public final void rule__ObjectPronoun__PronounAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3238:1: ( ( rulePronounIdentifier ) )
            // InternalTraceryPlusPlus.g:3239:2: ( rulePronounIdentifier )
            {
            // InternalTraceryPlusPlus.g:3239:2: ( rulePronounIdentifier )
            // InternalTraceryPlusPlus.g:3240:3: rulePronounIdentifier
            {
             before(grammarAccess.getObjectPronounAccess().getPronounPronounIdentifierEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePronounIdentifier();

            state._fsp--;

             after(grammarAccess.getObjectPronounAccess().getPronounPronounIdentifierEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectPronoun__PronounAssignment_1"


    // $ANTLR start "rule__WordList__WordsAssignment_0"
    // InternalTraceryPlusPlus.g:3249:1: rule__WordList__WordsAssignment_0 : ( ruleWord ) ;
    public final void rule__WordList__WordsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3253:1: ( ( ruleWord ) )
            // InternalTraceryPlusPlus.g:3254:2: ( ruleWord )
            {
            // InternalTraceryPlusPlus.g:3254:2: ( ruleWord )
            // InternalTraceryPlusPlus.g:3255:3: ruleWord
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
    // InternalTraceryPlusPlus.g:3264:1: rule__WordList__WordsAssignment_1_1 : ( ruleWord ) ;
    public final void rule__WordList__WordsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3268:1: ( ( ruleWord ) )
            // InternalTraceryPlusPlus.g:3269:2: ( ruleWord )
            {
            // InternalTraceryPlusPlus.g:3269:2: ( ruleWord )
            // InternalTraceryPlusPlus.g:3270:3: ruleWord
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
    // InternalTraceryPlusPlus.g:3279:1: rule__AttributeList__AttributesAssignment_0 : ( ruleAttribute ) ;
    public final void rule__AttributeList__AttributesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3283:1: ( ( ruleAttribute ) )
            // InternalTraceryPlusPlus.g:3284:2: ( ruleAttribute )
            {
            // InternalTraceryPlusPlus.g:3284:2: ( ruleAttribute )
            // InternalTraceryPlusPlus.g:3285:3: ruleAttribute
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
    // InternalTraceryPlusPlus.g:3294:1: rule__AttributeList__AttributesAssignment_1_1 : ( ruleAttribute ) ;
    public final void rule__AttributeList__AttributesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3298:1: ( ( ruleAttribute ) )
            // InternalTraceryPlusPlus.g:3299:2: ( ruleAttribute )
            {
            // InternalTraceryPlusPlus.g:3299:2: ( ruleAttribute )
            // InternalTraceryPlusPlus.g:3300:3: ruleAttribute
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


    // $ANTLR start "rule__Pronouns__ValueAssignment"
    // InternalTraceryPlusPlus.g:3309:1: rule__Pronouns__ValueAssignment : ( ( rule__Pronouns__ValueAlternatives_0 ) ) ;
    public final void rule__Pronouns__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3313:1: ( ( ( rule__Pronouns__ValueAlternatives_0 ) ) )
            // InternalTraceryPlusPlus.g:3314:2: ( ( rule__Pronouns__ValueAlternatives_0 ) )
            {
            // InternalTraceryPlusPlus.g:3314:2: ( ( rule__Pronouns__ValueAlternatives_0 ) )
            // InternalTraceryPlusPlus.g:3315:3: ( rule__Pronouns__ValueAlternatives_0 )
            {
             before(grammarAccess.getPronounsAccess().getValueAlternatives_0()); 
            // InternalTraceryPlusPlus.g:3316:3: ( rule__Pronouns__ValueAlternatives_0 )
            // InternalTraceryPlusPlus.g:3316:4: rule__Pronouns__ValueAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Pronouns__ValueAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPronounsAccess().getValueAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pronouns__ValueAssignment"


    // $ANTLR start "rule__ModifierList__ModifiersAssignment_1"
    // InternalTraceryPlusPlus.g:3324:1: rule__ModifierList__ModifiersAssignment_1 : ( ruleModifier ) ;
    public final void rule__ModifierList__ModifiersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTraceryPlusPlus.g:3328:1: ( ( ruleModifier ) )
            // InternalTraceryPlusPlus.g:3329:2: ( ruleModifier )
            {
            // InternalTraceryPlusPlus.g:3329:2: ( ruleModifier )
            // InternalTraceryPlusPlus.g:3330:3: ruleModifier
            {
             before(grammarAccess.getModifierListAccess().getModifiersModifierEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModifier();

            state._fsp--;

             after(grammarAccess.getModifierListAccess().getModifiersModifierEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModifierList__ModifiersAssignment_1"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\7\4\1\66\2\uffff\1\4";
    static final String dfa_3s = "\1\4\1\65\4\5\1\65\1\66\2\uffff\1\5";
    static final String dfa_4s = "\10\uffff\1\1\1\2\1\uffff";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\10\1\11\7\uffff\1\6\3\uffff\1\10\6\uffff\1\2\1\3\1\4\1\5\31\uffff\1\7",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\10\1\11\57\uffff\1\7",
            "\1\12",
            "",
            "",
            "\1\10\1\11"
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
            return "891:1: rule__Attribute__Alternatives : ( ( ruleNameExistingListAttribute ) | ( ruleNameValueAttribute ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0002800000040012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x002800000F002030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0008000000000032L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000100000001800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x002000000F002020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x002100000F002010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0002800000040010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000C000000000030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x002000000F022010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000003E000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000000C0010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001E00000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000070000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000190000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000190000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000003E000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0020000000002000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0040000000000000L});

}