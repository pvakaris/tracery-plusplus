package tracerypp.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTraceryPlusPlusLexer extends Lexer {
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

    public InternalTraceryPlusPlusLexer() {;} 
    public InternalTraceryPlusPlusLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTraceryPlusPlusLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalTraceryPlusPlus.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:11:7: ( 'The' )
            // InternalTraceryPlusPlus.g:11:9: 'The'
            {
            match("The"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:12:7: ( 'story' )
            // InternalTraceryPlusPlus.g:12:9: 'story'
            {
            match("story"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:13:7: ( 'can' )
            // InternalTraceryPlusPlus.g:13:9: 'can'
            {
            match("can"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:14:7: ( 'have' )
            // InternalTraceryPlusPlus.g:14:9: 'have'
            {
            match("have"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:15:7: ( 'values' )
            // InternalTraceryPlusPlus.g:15:9: 'values'
            {
            match("values"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:16:7: ( 'be' )
            // InternalTraceryPlusPlus.g:16:9: 'be'
            {
            match("be"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:17:7: ( 'has' )
            // InternalTraceryPlusPlus.g:17:9: 'has'
            {
            match("has"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:18:7: ( 'There' )
            // InternalTraceryPlusPlus.g:18:9: 'There'
            {
            match("There"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:19:7: ( 'is' )
            // InternalTraceryPlusPlus.g:19:9: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:20:7: ( 'are' )
            // InternalTraceryPlusPlus.g:20:9: 'are'
            {
            match("are"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:21:7: ( 'a' )
            // InternalTraceryPlusPlus.g:21:9: 'a'
            {
            match('a'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:22:7: ( 'an' )
            // InternalTraceryPlusPlus.g:22:9: 'an'
            {
            match("an"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:23:7: ( 'attributes' )
            // InternalTraceryPlusPlus.g:23:9: 'attributes'
            {
            match("attributes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:24:7: ( 'define' )
            // InternalTraceryPlusPlus.g:24:9: 'define'
            {
            match("define"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:25:7: ( 'substory' )
            // InternalTraceryPlusPlus.g:25:9: 'substory'
            {
            match("substory"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:26:7: ( ':' )
            // InternalTraceryPlusPlus.g:26:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:27:7: ( 'end-substory' )
            // InternalTraceryPlusPlus.g:27:9: 'end-substory'
            {
            match("end-substory"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:28:7: ( 'from' )
            // InternalTraceryPlusPlus.g:28:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:29:7: ( 'use' )
            // InternalTraceryPlusPlus.g:29:9: 'use'
            {
            match("use"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:30:7: ( 'sub' )
            // InternalTraceryPlusPlus.g:30:9: 'sub'
            {
            match("sub"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:31:7: ( '.' )
            // InternalTraceryPlusPlus.g:31:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:32:7: ( 'He' )
            // InternalTraceryPlusPlus.g:32:9: 'He'
            {
            match("He"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:33:7: ( 'She' )
            // InternalTraceryPlusPlus.g:33:9: 'She'
            {
            match("She"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:34:7: ( 'It' )
            // InternalTraceryPlusPlus.g:34:9: 'It'
            {
            match("It"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:35:7: ( 'They' )
            // InternalTraceryPlusPlus.g:35:9: 'They'
            {
            match("They"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:36:7: ( 'they' )
            // InternalTraceryPlusPlus.g:36:9: 'they'
            {
            match("they"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:37:7: ( 'them' )
            // InternalTraceryPlusPlus.g:37:9: 'them'
            {
            match("them"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:38:7: ( 'their' )
            // InternalTraceryPlusPlus.g:38:9: 'their'
            {
            match("their"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:39:7: ( 'theirs' )
            // InternalTraceryPlusPlus.g:39:9: 'theirs'
            {
            match("theirs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:40:7: ( '.capitalize' )
            // InternalTraceryPlusPlus.g:40:9: '.capitalize'
            {
            match(".capitalize"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:41:7: ( '.CAPITALIZE' )
            // InternalTraceryPlusPlus.g:41:9: '.CAPITALIZE'
            {
            match(".CAPITALIZE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:42:7: ( '.s' )
            // InternalTraceryPlusPlus.g:42:9: '.s'
            {
            match(".s"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:43:7: ( '.a' )
            // InternalTraceryPlusPlus.g:43:9: '.a'
            {
            match(".a"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:44:7: ( '.ed' )
            // InternalTraceryPlusPlus.g:44:9: '.ed'
            {
            match(".ed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:45:7: ( '=' )
            // InternalTraceryPlusPlus.g:45:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:46:7: ( '-' )
            // InternalTraceryPlusPlus.g:46:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:47:7: ( '-->' )
            // InternalTraceryPlusPlus.g:47:9: '-->'
            {
            match("-->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:48:7: ( 'equal' )
            // InternalTraceryPlusPlus.g:48:9: 'equal'
            {
            match("equal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:49:7: ( 'to' )
            // InternalTraceryPlusPlus.g:49:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:50:7: ( ',' )
            // InternalTraceryPlusPlus.g:50:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:51:7: ( 'or' )
            // InternalTraceryPlusPlus.g:51:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:52:7: ( '||' )
            // InternalTraceryPlusPlus.g:52:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:53:7: ( 'and' )
            // InternalTraceryPlusPlus.g:53:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:54:7: ( '&&' )
            // InternalTraceryPlusPlus.g:54:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:1687:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalTraceryPlusPlus.g:1687:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalTraceryPlusPlus.g:1687:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1687:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalTraceryPlusPlus.g:1687:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:1689:10: ( ( '0' .. '9' )+ )
            // InternalTraceryPlusPlus.g:1689:12: ( '0' .. '9' )+
            {
            // InternalTraceryPlusPlus.g:1689:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1689:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:1691:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalTraceryPlusPlus.g:1691:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalTraceryPlusPlus.g:1691:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1691:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalTraceryPlusPlus.g:1691:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalTraceryPlusPlus.g:1691:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTraceryPlusPlus.g:1691:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalTraceryPlusPlus.g:1691:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalTraceryPlusPlus.g:1691:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalTraceryPlusPlus.g:1691:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTraceryPlusPlus.g:1691:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:1693:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalTraceryPlusPlus.g:1693:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalTraceryPlusPlus.g:1693:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1693:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:1695:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTraceryPlusPlus.g:1695:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalTraceryPlusPlus.g:1695:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:1695:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalTraceryPlusPlus.g:1695:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTraceryPlusPlus.g:1695:41: ( '\\r' )? '\\n'
                    {
                    // InternalTraceryPlusPlus.g:1695:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalTraceryPlusPlus.g:1695:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:1697:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTraceryPlusPlus.g:1697:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTraceryPlusPlus.g:1697:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTraceryPlusPlus.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTraceryPlusPlus.g:1699:16: ( . )
            // InternalTraceryPlusPlus.g:1699:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalTraceryPlusPlus.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=51;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalTraceryPlusPlus.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalTraceryPlusPlus.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalTraceryPlusPlus.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalTraceryPlusPlus.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalTraceryPlusPlus.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalTraceryPlusPlus.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalTraceryPlusPlus.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalTraceryPlusPlus.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalTraceryPlusPlus.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalTraceryPlusPlus.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalTraceryPlusPlus.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalTraceryPlusPlus.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalTraceryPlusPlus.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalTraceryPlusPlus.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalTraceryPlusPlus.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalTraceryPlusPlus.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalTraceryPlusPlus.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalTraceryPlusPlus.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalTraceryPlusPlus.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalTraceryPlusPlus.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalTraceryPlusPlus.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalTraceryPlusPlus.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalTraceryPlusPlus.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalTraceryPlusPlus.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalTraceryPlusPlus.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalTraceryPlusPlus.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalTraceryPlusPlus.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalTraceryPlusPlus.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalTraceryPlusPlus.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalTraceryPlusPlus.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalTraceryPlusPlus.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalTraceryPlusPlus.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalTraceryPlusPlus.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalTraceryPlusPlus.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // InternalTraceryPlusPlus.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // InternalTraceryPlusPlus.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // InternalTraceryPlusPlus.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // InternalTraceryPlusPlus.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // InternalTraceryPlusPlus.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // InternalTraceryPlusPlus.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // InternalTraceryPlusPlus.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // InternalTraceryPlusPlus.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // InternalTraceryPlusPlus.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // InternalTraceryPlusPlus.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // InternalTraceryPlusPlus.g:1:274: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 46 :
                // InternalTraceryPlusPlus.g:1:282: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 47 :
                // InternalTraceryPlusPlus.g:1:291: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 48 :
                // InternalTraceryPlusPlus.g:1:303: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 49 :
                // InternalTraceryPlusPlus.g:1:319: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 50 :
                // InternalTraceryPlusPlus.g:1:335: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 51 :
                // InternalTraceryPlusPlus.g:1:343: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\7\42\1\55\1\42\1\uffff\3\42\1\71\4\42\1\uffff\1\101\1\uffff\1\42\3\40\2\uffff\3\40\2\uffff\1\42\1\uffff\5\42\1\122\1\123\1\42\1\126\1\42\1\uffff\1\42\1\uffff\4\42\6\uffff\1\135\1\42\1\137\1\42\1\141\4\uffff\1\142\7\uffff\1\145\1\42\1\150\1\151\1\42\1\153\1\42\2\uffff\1\155\1\156\1\uffff\5\42\1\164\1\uffff\1\165\1\uffff\1\42\2\uffff\1\42\1\172\1\uffff\2\42\2\uffff\1\175\1\uffff\1\42\2\uffff\2\42\1\uffff\1\42\1\u0082\2\uffff\1\u0083\1\u0084\1\42\1\u0086\1\uffff\1\u0087\1\42\1\uffff\3\42\1\u008c\3\uffff\1\u008e\2\uffff\1\42\1\u0090\1\42\1\u0092\1\uffff\1\u0093\1\uffff\1\42\1\uffff\1\42\2\uffff\1\u0096\1\42\1\uffff\1\42\1\u0099\1\uffff";
    static final String DFA12_eofS =
        "\u009a\uffff";
    static final String DFA12_minS =
        "\1\0\1\150\1\164\3\141\1\145\1\163\1\60\1\145\1\uffff\1\156\1\162\1\163\1\103\1\145\1\150\1\164\1\150\1\uffff\1\55\1\uffff\1\162\1\174\1\46\1\101\2\uffff\2\0\1\52\2\uffff\1\145\1\uffff\1\157\1\142\1\156\1\163\1\154\2\60\1\145\1\60\1\164\1\uffff\1\146\1\uffff\1\144\1\165\1\157\1\145\6\uffff\1\60\1\145\1\60\1\145\1\60\4\uffff\1\60\7\uffff\1\60\1\162\2\60\1\145\1\60\1\165\2\uffff\2\60\1\uffff\1\162\1\151\1\55\1\141\1\155\1\60\1\uffff\1\60\1\uffff\1\151\2\uffff\1\145\1\60\1\uffff\1\171\1\164\2\uffff\1\60\1\uffff\1\145\2\uffff\1\151\1\156\1\uffff\1\154\1\60\2\uffff\2\60\1\162\1\60\1\uffff\1\60\1\157\1\uffff\1\163\1\142\1\145\1\60\3\uffff\1\60\2\uffff\1\162\1\60\1\165\1\60\1\uffff\1\60\1\uffff\1\171\1\uffff\1\164\2\uffff\1\60\1\145\1\uffff\1\163\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\150\1\165\3\141\1\145\1\163\1\172\1\145\1\uffff\1\161\1\162\2\163\1\145\1\150\1\164\1\157\1\uffff\1\55\1\uffff\1\162\1\174\1\46\1\172\2\uffff\2\uffff\1\57\2\uffff\1\145\1\uffff\1\157\1\142\1\156\1\166\1\154\2\172\1\145\1\172\1\164\1\uffff\1\146\1\uffff\1\144\1\165\1\157\1\145\6\uffff\1\172\1\145\1\172\1\145\1\172\4\uffff\1\172\7\uffff\1\172\1\162\2\172\1\145\1\172\1\165\2\uffff\2\172\1\uffff\1\162\1\151\1\55\1\141\1\155\1\172\1\uffff\1\172\1\uffff\1\171\2\uffff\1\145\1\172\1\uffff\1\171\1\164\2\uffff\1\172\1\uffff\1\145\2\uffff\1\151\1\156\1\uffff\1\154\1\172\2\uffff\2\172\1\162\1\172\1\uffff\1\172\1\157\1\uffff\1\163\1\142\1\145\1\172\3\uffff\1\172\2\uffff\1\162\1\172\1\165\1\172\1\uffff\1\172\1\uffff\1\171\1\uffff\1\164\2\uffff\1\172\1\145\1\uffff\1\163\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\12\uffff\1\20\10\uffff\1\43\1\uffff\1\50\4\uffff\1\55\1\56\3\uffff\1\62\1\63\1\uffff\1\55\12\uffff\1\13\1\uffff\1\20\4\uffff\1\36\1\37\1\40\1\41\1\42\1\25\5\uffff\1\43\1\45\1\44\1\50\1\uffff\1\52\1\54\1\56\1\57\1\60\1\61\1\62\7\uffff\1\6\1\11\2\uffff\1\14\6\uffff\1\26\1\uffff\1\30\1\uffff\1\47\1\51\2\uffff\1\1\2\uffff\1\24\1\3\1\uffff\1\7\1\uffff\1\12\1\53\2\uffff\1\21\2\uffff\1\23\1\27\4\uffff\1\31\2\uffff\1\4\4\uffff\1\22\1\32\1\33\1\uffff\1\10\1\2\4\uffff\1\46\1\uffff\1\34\1\uffff\1\5\1\uffff\1\16\1\35\2\uffff\1\17\2\uffff\1\15";
    static final String DFA12_specialS =
        "\1\0\33\uffff\1\2\1\1\174\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\40\2\37\2\40\1\37\22\40\1\37\1\40\1\34\3\40\1\30\1\35\4\40\1\25\1\24\1\16\1\36\12\33\1\12\2\40\1\23\3\40\7\32\1\17\1\21\11\32\1\20\1\1\6\32\3\40\1\31\1\32\1\40\1\10\1\6\1\3\1\11\1\13\1\14\1\32\1\4\1\7\5\32\1\26\3\32\1\2\1\22\1\15\1\5\4\32\1\40\1\27\uff83\40",
            "\1\41",
            "\1\43\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\15\42\1\53\3\42\1\52\1\42\1\54\6\42",
            "\1\56",
            "",
            "\1\60\2\uffff\1\61",
            "\1\62",
            "\1\63",
            "\1\65\35\uffff\1\67\1\uffff\1\64\1\uffff\1\70\15\uffff\1\66",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75\6\uffff\1\76",
            "",
            "\1\100",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\0\107",
            "\0\107",
            "\1\110\4\uffff\1\111",
            "",
            "",
            "\1\113",
            "",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\120\2\uffff\1\117",
            "\1\121",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\124",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\3\42\1\125\26\42",
            "\1\127",
            "",
            "\1\130",
            "",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\136",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\140",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\21\42\1\143\6\42\1\144\1\42",
            "\1\146",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\22\42\1\147\7\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\152",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\154",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\170\3\uffff\1\167\13\uffff\1\166",
            "",
            "",
            "\1\171",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\173",
            "\1\174",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\176",
            "",
            "",
            "\1\177",
            "\1\u0080",
            "",
            "\1\u0081",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0085",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0088",
            "",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\22\42\1\u008d\7\42",
            "",
            "",
            "\1\u008f",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0091",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u0094",
            "",
            "\1\u0095",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0097",
            "",
            "\1\u0098",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='T') ) {s = 1;}

                        else if ( (LA12_0=='s') ) {s = 2;}

                        else if ( (LA12_0=='c') ) {s = 3;}

                        else if ( (LA12_0=='h') ) {s = 4;}

                        else if ( (LA12_0=='v') ) {s = 5;}

                        else if ( (LA12_0=='b') ) {s = 6;}

                        else if ( (LA12_0=='i') ) {s = 7;}

                        else if ( (LA12_0=='a') ) {s = 8;}

                        else if ( (LA12_0=='d') ) {s = 9;}

                        else if ( (LA12_0==':') ) {s = 10;}

                        else if ( (LA12_0=='e') ) {s = 11;}

                        else if ( (LA12_0=='f') ) {s = 12;}

                        else if ( (LA12_0=='u') ) {s = 13;}

                        else if ( (LA12_0=='.') ) {s = 14;}

                        else if ( (LA12_0=='H') ) {s = 15;}

                        else if ( (LA12_0=='S') ) {s = 16;}

                        else if ( (LA12_0=='I') ) {s = 17;}

                        else if ( (LA12_0=='t') ) {s = 18;}

                        else if ( (LA12_0=='=') ) {s = 19;}

                        else if ( (LA12_0=='-') ) {s = 20;}

                        else if ( (LA12_0==',') ) {s = 21;}

                        else if ( (LA12_0=='o') ) {s = 22;}

                        else if ( (LA12_0=='|') ) {s = 23;}

                        else if ( (LA12_0=='&') ) {s = 24;}

                        else if ( (LA12_0=='^') ) {s = 25;}

                        else if ( ((LA12_0>='A' && LA12_0<='G')||(LA12_0>='J' && LA12_0<='R')||(LA12_0>='U' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='g'||(LA12_0>='j' && LA12_0<='n')||(LA12_0>='p' && LA12_0<='r')||(LA12_0>='w' && LA12_0<='z')) ) {s = 26;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 27;}

                        else if ( (LA12_0=='\"') ) {s = 28;}

                        else if ( (LA12_0=='\'') ) {s = 29;}

                        else if ( (LA12_0=='/') ) {s = 30;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 31;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='%')||(LA12_0>='(' && LA12_0<='+')||(LA12_0>=';' && LA12_0<='<')||(LA12_0>='>' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='{'||(LA12_0>='}' && LA12_0<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_29 = input.LA(1);

                        s = -1;
                        if ( ((LA12_29>='\u0000' && LA12_29<='\uFFFF')) ) {s = 71;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_28 = input.LA(1);

                        s = -1;
                        if ( ((LA12_28>='\u0000' && LA12_28<='\uFFFF')) ) {s = 71;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}