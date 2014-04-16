package com.netxforge.netxtest.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDragonXLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators

    public InternalDragonXLexer() {;} 
    public InternalDragonXLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDragonXLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:11:7: ( 'TEST' )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:11:9: 'TEST'
            {
            match("TEST"); 


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
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:12:7: ( '[' )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:12:9: '['
            {
            match('['); 

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
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:13:7: ( ']' )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:13:9: ']'
            {
            match(']'); 

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
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:14:7: ( '#' )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:14:9: '#'
            {
            match('#'); 

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
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:15:7: ( ':' )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:15:9: ':'
            {
            match(':'); 

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
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:16:7: ( 'Description' )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:16:9: 'Description'
            {
            match("Description"); 


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
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:17:7: ( 'CALL' )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:17:9: 'CALL'
            {
            match("CALL"); 


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
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:18:7: ( 'USSD' )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:18:9: 'USSD'
            {
            match("USSD"); 


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
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:19:7: ( 'SMS' )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:19:9: 'SMS'
            {
            match("SMS"); 


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
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:20:7: ( 'DATA' )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:20:9: 'DATA'
            {
            match("DATA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:558:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:558:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:558:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:558:11: '^'
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

            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:558:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:
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
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:560:10: ( ( '0' .. '9' )+ )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:560:12: ( '0' .. '9' )+
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:560:12: ( '0' .. '9' )+
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
            	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:560:13: '0' .. '9'
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
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:562:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:562:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:562:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:562:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:562:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:562:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:562:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:562:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:562:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:562:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:562:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:564:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:564:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:564:24: ( options {greedy=false; } : . )*
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
            	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:564:52: .
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
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:566:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:566:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:566:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:566:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:566:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:566:41: ( '\\r' )? '\\n'
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:566:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:566:41: '\\r'
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
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:568:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:568:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:568:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:
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
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:570:16: ( . )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:570:18: .
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
        // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=17;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1:70: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 12 :
                // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1:78: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 13 :
                // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1:87: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 14 :
                // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1:99: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 15 :
                // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1:115: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 16 :
                // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1:131: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 17 :
                // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1:139: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\23\4\uffff\4\23\1\21\2\uffff\3\21\2\uffff\1\23\5\uffff"+
        "\5\23\5\uffff\5\23\1\55\1\56\1\23\1\60\1\61\1\62\2\uffff\1\23\3"+
        "\uffff\5\23\1\71\1\uffff";
    static final String DFA12_eofS =
        "\72\uffff";
    static final String DFA12_minS =
        "\1\0\1\105\4\uffff\2\101\1\123\1\115\1\101\2\uffff\2\0\1\52\2\uffff"+
        "\1\123\5\uffff\1\163\1\124\1\114\2\123\5\uffff\1\124\1\143\1\101"+
        "\1\114\1\104\2\60\1\162\3\60\2\uffff\1\151\3\uffff\1\160\1\164\1"+
        "\151\1\157\1\156\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\105\4\uffff\1\145\1\101\1\123\1\115\1\172\2\uffff\2\uffff"+
        "\1\57\2\uffff\1\123\5\uffff\1\163\1\124\1\114\2\123\5\uffff\1\124"+
        "\1\143\1\101\1\114\1\104\2\172\1\162\3\172\2\uffff\1\151\3\uffff"+
        "\1\160\1\164\1\151\1\157\1\156\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\5\uffff\1\13\1\14\3\uffff\1\20\1\21\1\uffff"+
        "\1\13\1\2\1\3\1\4\1\5\5\uffff\1\14\1\15\1\16\1\17\1\20\13\uffff"+
        "\1\11\1\1\1\uffff\1\12\1\7\1\10\6\uffff\1\6";
    static final String DFA12_specialS =
        "\1\2\14\uffff\1\1\1\0\53\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\21\2\20\2\21\1\20\22\21\1\20\1\21\1\15\1\4\3\21\1\16\7\21"+
            "\1\17\12\14\1\5\6\21\2\13\1\7\1\6\16\13\1\11\1\1\1\10\5\13\1"+
            "\2\1\21\1\3\1\12\1\13\1\21\32\13\uff85\21",
            "\1\22",
            "",
            "",
            "",
            "",
            "\1\31\43\uffff\1\30",
            "\1\32",
            "\1\33",
            "\1\34",
            "\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "",
            "\0\36",
            "\0\36",
            "\1\37\4\uffff\1\40",
            "",
            "",
            "\1\42",
            "",
            "",
            "",
            "",
            "",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "",
            "",
            "",
            "",
            "",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\57",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "",
            "\1\63",
            "",
            "",
            "",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
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
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_14 = input.LA(1);

                        s = -1;
                        if ( ((LA12_14>='\u0000' && LA12_14<='\uFFFF')) ) {s = 30;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_13 = input.LA(1);

                        s = -1;
                        if ( ((LA12_13>='\u0000' && LA12_13<='\uFFFF')) ) {s = 30;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='T') ) {s = 1;}

                        else if ( (LA12_0=='[') ) {s = 2;}

                        else if ( (LA12_0==']') ) {s = 3;}

                        else if ( (LA12_0=='#') ) {s = 4;}

                        else if ( (LA12_0==':') ) {s = 5;}

                        else if ( (LA12_0=='D') ) {s = 6;}

                        else if ( (LA12_0=='C') ) {s = 7;}

                        else if ( (LA12_0=='U') ) {s = 8;}

                        else if ( (LA12_0=='S') ) {s = 9;}

                        else if ( (LA12_0=='^') ) {s = 10;}

                        else if ( ((LA12_0>='A' && LA12_0<='B')||(LA12_0>='E' && LA12_0<='R')||(LA12_0>='V' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {s = 11;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 12;}

                        else if ( (LA12_0=='\"') ) {s = 13;}

                        else if ( (LA12_0=='\'') ) {s = 14;}

                        else if ( (LA12_0=='/') ) {s = 15;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 16;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='$' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='.')||(LA12_0>=';' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 17;}

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