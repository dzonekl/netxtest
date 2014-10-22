package com.netxforge.netxtest.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.netxforge.netxtest.services.DragonXGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDragonXParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'UE'", "'{'", "'}'", "':'", "'TestCase'", "'Description'", "'Test'", "'CALL'", "'ANSWER'", "'USSD'", "'SMS'", "'DATA'", "'MIXER'", "'From'", "'To'", "'CallingTime'", "'OffHookResponse'", "'ResponseTime'", "'ListeningTime'", "'AnswerTime'", "'Response'", "'USSDCode'", "'Destination'", "'ServiceDelay'", "'Code'", "'url'", "'data'", "'Reset'", "'P1'", "'P2'", "'p3'", "'p4'", "'p5'", "'p6'", "'Activate'", "'Deactivate'", "'CFU'", "'CFB'", "'CFNA'", "'CFNR'", "'ACD'", "'AllOutgoingCalls'", "'AllIncomingCalls'", "'AllOutgoingCallsExHome'", "'AllIncommingCallsRoaming'", "'CLIP'", "'CLIR'", "'COLP'", "'COLR'", "'Listening'", "'OffHook'", "'HangUp'", "'IMEI'", "'MSISDN'"
    };
    public static final int RULE_ID=4;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalDragonXParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDragonXParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDragonXParser.tokenNames; }
    public String getGrammarFileName() { return "../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g"; }



     	private DragonXGrammarAccess grammarAccess;
     	
        public InternalDragonXParser(TokenStream input, DragonXGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DragonX";	
       	}
       	
       	@Override
       	protected DragonXGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDragonX"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:68:1: entryRuleDragonX returns [EObject current=null] : iv_ruleDragonX= ruleDragonX EOF ;
    public final EObject entryRuleDragonX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDragonX = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:69:2: (iv_ruleDragonX= ruleDragonX EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:70:2: iv_ruleDragonX= ruleDragonX EOF
            {
             newCompositeNode(grammarAccess.getDragonXRule()); 
            pushFollow(FOLLOW_ruleDragonX_in_entryRuleDragonX75);
            iv_ruleDragonX=ruleDragonX();

            state._fsp--;

             current =iv_ruleDragonX; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDragonX85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDragonX"


    // $ANTLR start "ruleDragonX"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:77:1: ruleDragonX returns [EObject current=null] : ( ( (lv_ues_0_0= ruleUE ) )+ ( (lv_tests_1_0= ruleTestCase ) )+ ) ;
    public final EObject ruleDragonX() throws RecognitionException {
        EObject current = null;

        EObject lv_ues_0_0 = null;

        EObject lv_tests_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:80:28: ( ( ( (lv_ues_0_0= ruleUE ) )+ ( (lv_tests_1_0= ruleTestCase ) )+ ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:81:1: ( ( (lv_ues_0_0= ruleUE ) )+ ( (lv_tests_1_0= ruleTestCase ) )+ )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:81:1: ( ( (lv_ues_0_0= ruleUE ) )+ ( (lv_tests_1_0= ruleTestCase ) )+ )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:81:2: ( (lv_ues_0_0= ruleUE ) )+ ( (lv_tests_1_0= ruleTestCase ) )+
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:81:2: ( (lv_ues_0_0= ruleUE ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:82:1: (lv_ues_0_0= ruleUE )
            	    {
            	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:82:1: (lv_ues_0_0= ruleUE )
            	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:83:3: lv_ues_0_0= ruleUE
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDragonXAccess().getUesUEParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUE_in_ruleDragonX131);
            	    lv_ues_0_0=ruleUE();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDragonXRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ues",
            	            		lv_ues_0_0, 
            	            		"UE");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:99:3: ( (lv_tests_1_0= ruleTestCase ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:100:1: (lv_tests_1_0= ruleTestCase )
            	    {
            	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:100:1: (lv_tests_1_0= ruleTestCase )
            	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:101:3: lv_tests_1_0= ruleTestCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDragonXAccess().getTestsTestCaseParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTestCase_in_ruleDragonX153);
            	    lv_tests_1_0=ruleTestCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDragonXRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tests",
            	            		lv_tests_1_0, 
            	            		"TestCase");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDragonX"


    // $ANTLR start "entryRuleUE"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:125:1: entryRuleUE returns [EObject current=null] : iv_ruleUE= ruleUE EOF ;
    public final EObject entryRuleUE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUE = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:126:2: (iv_ruleUE= ruleUE EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:127:2: iv_ruleUE= ruleUE EOF
            {
             newCompositeNode(grammarAccess.getUERule()); 
            pushFollow(FOLLOW_ruleUE_in_entryRuleUE190);
            iv_ruleUE=ruleUE();

            state._fsp--;

             current =iv_ruleUE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUE200); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUE"


    // $ANTLR start "ruleUE"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:134:1: ruleUE returns [EObject current=null] : (otherlv_0= 'UE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_meta_3_0= ruleUEMetaObject ) )+ otherlv_4= '}' ) ;
    public final EObject ruleUE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_meta_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:137:28: ( (otherlv_0= 'UE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_meta_3_0= ruleUEMetaObject ) )+ otherlv_4= '}' ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:138:1: (otherlv_0= 'UE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_meta_3_0= ruleUEMetaObject ) )+ otherlv_4= '}' )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:138:1: (otherlv_0= 'UE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_meta_3_0= ruleUEMetaObject ) )+ otherlv_4= '}' )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:138:3: otherlv_0= 'UE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_meta_3_0= ruleUEMetaObject ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleUE237); 

                	newLeafNode(otherlv_0, grammarAccess.getUEAccess().getUEKeyword_0());
                
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:142:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:143:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:143:1: (lv_name_1_0= RULE_ID )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:144:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUE254); 

            			newLeafNode(lv_name_1_0, grammarAccess.getUEAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUERule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleUE271); 

                	newLeafNode(otherlv_2, grammarAccess.getUEAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:164:1: ( (lv_meta_3_0= ruleUEMetaObject ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16||(LA3_0>=63 && LA3_0<=64)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:165:1: (lv_meta_3_0= ruleUEMetaObject )
            	    {
            	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:165:1: (lv_meta_3_0= ruleUEMetaObject )
            	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:166:3: lv_meta_3_0= ruleUEMetaObject
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUEAccess().getMetaUEMetaObjectParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUEMetaObject_in_ruleUE292);
            	    lv_meta_3_0=ruleUEMetaObject();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUERule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"meta",
            	            		lv_meta_3_0, 
            	            		"UEMetaObject");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleUE305); 

                	newLeafNode(otherlv_4, grammarAccess.getUEAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUE"


    // $ANTLR start "entryRuleUEMetaObject"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:194:1: entryRuleUEMetaObject returns [EObject current=null] : iv_ruleUEMetaObject= ruleUEMetaObject EOF ;
    public final EObject entryRuleUEMetaObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUEMetaObject = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:195:2: (iv_ruleUEMetaObject= ruleUEMetaObject EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:196:2: iv_ruleUEMetaObject= ruleUEMetaObject EOF
            {
             newCompositeNode(grammarAccess.getUEMetaObjectRule()); 
            pushFollow(FOLLOW_ruleUEMetaObject_in_entryRuleUEMetaObject341);
            iv_ruleUEMetaObject=ruleUEMetaObject();

            state._fsp--;

             current =iv_ruleUEMetaObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUEMetaObject351); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUEMetaObject"


    // $ANTLR start "ruleUEMetaObject"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:203:1: ruleUEMetaObject returns [EObject current=null] : ( ( ( (lv_params_0_0= ruleUEPARAMS ) ) otherlv_1= ':' ( (lv_paramValue_2_0= ruleUEValue ) ) ) | this_DescriptionObject_3= ruleDescriptionObject ) ;
    public final EObject ruleUEMetaObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_params_0_0 = null;

        AntlrDatatypeRuleToken lv_paramValue_2_0 = null;

        EObject this_DescriptionObject_3 = null;


         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:206:28: ( ( ( ( (lv_params_0_0= ruleUEPARAMS ) ) otherlv_1= ':' ( (lv_paramValue_2_0= ruleUEValue ) ) ) | this_DescriptionObject_3= ruleDescriptionObject ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:207:1: ( ( ( (lv_params_0_0= ruleUEPARAMS ) ) otherlv_1= ':' ( (lv_paramValue_2_0= ruleUEValue ) ) ) | this_DescriptionObject_3= ruleDescriptionObject )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:207:1: ( ( ( (lv_params_0_0= ruleUEPARAMS ) ) otherlv_1= ':' ( (lv_paramValue_2_0= ruleUEValue ) ) ) | this_DescriptionObject_3= ruleDescriptionObject )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=63 && LA4_0<=64)) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:207:2: ( ( (lv_params_0_0= ruleUEPARAMS ) ) otherlv_1= ':' ( (lv_paramValue_2_0= ruleUEValue ) ) )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:207:2: ( ( (lv_params_0_0= ruleUEPARAMS ) ) otherlv_1= ':' ( (lv_paramValue_2_0= ruleUEValue ) ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:207:3: ( (lv_params_0_0= ruleUEPARAMS ) ) otherlv_1= ':' ( (lv_paramValue_2_0= ruleUEValue ) )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:207:3: ( (lv_params_0_0= ruleUEPARAMS ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:208:1: (lv_params_0_0= ruleUEPARAMS )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:208:1: (lv_params_0_0= ruleUEPARAMS )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:209:3: lv_params_0_0= ruleUEPARAMS
                    {
                     
                    	        newCompositeNode(grammarAccess.getUEMetaObjectAccess().getParamsUEPARAMSEnumRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUEPARAMS_in_ruleUEMetaObject398);
                    lv_params_0_0=ruleUEPARAMS();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUEMetaObjectRule());
                    	        }
                           		set(
                           			current, 
                           			"params",
                            		lv_params_0_0, 
                            		"UEPARAMS");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleUEMetaObject410); 

                        	newLeafNode(otherlv_1, grammarAccess.getUEMetaObjectAccess().getColonKeyword_0_1());
                        
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:229:1: ( (lv_paramValue_2_0= ruleUEValue ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:230:1: (lv_paramValue_2_0= ruleUEValue )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:230:1: (lv_paramValue_2_0= ruleUEValue )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:231:3: lv_paramValue_2_0= ruleUEValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getUEMetaObjectAccess().getParamValueUEValueParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUEValue_in_ruleUEMetaObject431);
                    lv_paramValue_2_0=ruleUEValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUEMetaObjectRule());
                    	        }
                           		set(
                           			current, 
                           			"paramValue",
                            		lv_paramValue_2_0, 
                            		"UEValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:249:5: this_DescriptionObject_3= ruleDescriptionObject
                    {
                     
                            newCompositeNode(grammarAccess.getUEMetaObjectAccess().getDescriptionObjectParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDescriptionObject_in_ruleUEMetaObject460);
                    this_DescriptionObject_3=ruleDescriptionObject();

                    state._fsp--;

                     
                            current = this_DescriptionObject_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUEMetaObject"


    // $ANTLR start "entryRuleUEValue"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:265:1: entryRuleUEValue returns [String current=null] : iv_ruleUEValue= ruleUEValue EOF ;
    public final String entryRuleUEValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUEValue = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:266:2: (iv_ruleUEValue= ruleUEValue EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:267:2: iv_ruleUEValue= ruleUEValue EOF
            {
             newCompositeNode(grammarAccess.getUEValueRule()); 
            pushFollow(FOLLOW_ruleUEValue_in_entryRuleUEValue496);
            iv_ruleUEValue=ruleUEValue();

            state._fsp--;

             current =iv_ruleUEValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUEValue507); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUEValue"


    // $ANTLR start "ruleUEValue"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:274:1: ruleUEValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleUEValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:277:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:278:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:278:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
                {
                alt5=2;
                }
                break;
            case RULE_INT:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:278:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUEValue547); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getUEValueAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:286:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUEValue573); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getUEValueAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:294:10: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUEValue599); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getUEValueAccess().getINTTerminalRuleCall_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUEValue"


    // $ANTLR start "entryRuleTestCase"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:309:1: entryRuleTestCase returns [EObject current=null] : iv_ruleTestCase= ruleTestCase EOF ;
    public final EObject entryRuleTestCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestCase = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:310:2: (iv_ruleTestCase= ruleTestCase EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:311:2: iv_ruleTestCase= ruleTestCase EOF
            {
             newCompositeNode(grammarAccess.getTestCaseRule()); 
            pushFollow(FOLLOW_ruleTestCase_in_entryRuleTestCase644);
            iv_ruleTestCase=ruleTestCase();

            state._fsp--;

             current =iv_ruleTestCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestCase654); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTestCase"


    // $ANTLR start "ruleTestCase"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:318:1: ruleTestCase returns [EObject current=null] : (otherlv_0= 'TestCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescriptionObject ) )? ( (lv_procedure_4_0= ruleProcedure ) ) otherlv_5= '}' ) ;
    public final EObject ruleTestCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_description_3_0 = null;

        EObject lv_procedure_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:321:28: ( (otherlv_0= 'TestCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescriptionObject ) )? ( (lv_procedure_4_0= ruleProcedure ) ) otherlv_5= '}' ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:322:1: (otherlv_0= 'TestCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescriptionObject ) )? ( (lv_procedure_4_0= ruleProcedure ) ) otherlv_5= '}' )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:322:1: (otherlv_0= 'TestCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescriptionObject ) )? ( (lv_procedure_4_0= ruleProcedure ) ) otherlv_5= '}' )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:322:3: otherlv_0= 'TestCase' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescriptionObject ) )? ( (lv_procedure_4_0= ruleProcedure ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleTestCase691); 

                	newLeafNode(otherlv_0, grammarAccess.getTestCaseAccess().getTestCaseKeyword_0());
                
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:326:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:327:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:327:1: (lv_name_1_0= RULE_ID )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:328:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTestCase708); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTestCaseAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTestCaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleTestCase725); 

                	newLeafNode(otherlv_2, grammarAccess.getTestCaseAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:348:1: ( (lv_description_3_0= ruleDescriptionObject ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:349:1: (lv_description_3_0= ruleDescriptionObject )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:349:1: (lv_description_3_0= ruleDescriptionObject )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:350:3: lv_description_3_0= ruleDescriptionObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getTestCaseAccess().getDescriptionDescriptionObjectParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDescriptionObject_in_ruleTestCase746);
                    lv_description_3_0=ruleDescriptionObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTestCaseRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_3_0, 
                            		"DescriptionObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:366:3: ( (lv_procedure_4_0= ruleProcedure ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:367:1: (lv_procedure_4_0= ruleProcedure )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:367:1: (lv_procedure_4_0= ruleProcedure )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:368:3: lv_procedure_4_0= ruleProcedure
            {
             
            	        newCompositeNode(grammarAccess.getTestCaseAccess().getProcedureProcedureParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleProcedure_in_ruleTestCase768);
            lv_procedure_4_0=ruleProcedure();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTestCaseRule());
            	        }
                   		set(
                   			current, 
                   			"procedure",
                    		lv_procedure_4_0, 
                    		"Procedure");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleTestCase780); 

                	newLeafNode(otherlv_5, grammarAccess.getTestCaseAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestCase"


    // $ANTLR start "entryRuleDescriptionObject"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:396:1: entryRuleDescriptionObject returns [EObject current=null] : iv_ruleDescriptionObject= ruleDescriptionObject EOF ;
    public final EObject entryRuleDescriptionObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescriptionObject = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:397:2: (iv_ruleDescriptionObject= ruleDescriptionObject EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:398:2: iv_ruleDescriptionObject= ruleDescriptionObject EOF
            {
             newCompositeNode(grammarAccess.getDescriptionObjectRule()); 
            pushFollow(FOLLOW_ruleDescriptionObject_in_entryRuleDescriptionObject816);
            iv_ruleDescriptionObject=ruleDescriptionObject();

            state._fsp--;

             current =iv_ruleDescriptionObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescriptionObject826); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescriptionObject"


    // $ANTLR start "ruleDescriptionObject"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:405:1: ruleDescriptionObject returns [EObject current=null] : (otherlv_0= 'Description' otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleDescriptionObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_description_2_0=null;

         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:408:28: ( (otherlv_0= 'Description' otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:409:1: (otherlv_0= 'Description' otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:409:1: (otherlv_0= 'Description' otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:409:3: otherlv_0= 'Description' otherlv_1= ':' ( (lv_description_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleDescriptionObject863); 

                	newLeafNode(otherlv_0, grammarAccess.getDescriptionObjectAccess().getDescriptionKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleDescriptionObject875); 

                	newLeafNode(otherlv_1, grammarAccess.getDescriptionObjectAccess().getColonKeyword_1());
                
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:417:1: ( (lv_description_2_0= RULE_STRING ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:418:1: (lv_description_2_0= RULE_STRING )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:418:1: (lv_description_2_0= RULE_STRING )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:419:3: lv_description_2_0= RULE_STRING
            {
            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDescriptionObject892); 

            			newLeafNode(lv_description_2_0, grammarAccess.getDescriptionObjectAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDescriptionObjectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescriptionObject"


    // $ANTLR start "entryRuleProcedure"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:443:1: entryRuleProcedure returns [EObject current=null] : iv_ruleProcedure= ruleProcedure EOF ;
    public final EObject entryRuleProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedure = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:444:2: (iv_ruleProcedure= ruleProcedure EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:445:2: iv_ruleProcedure= ruleProcedure EOF
            {
             newCompositeNode(grammarAccess.getProcedureRule()); 
            pushFollow(FOLLOW_ruleProcedure_in_entryRuleProcedure933);
            iv_ruleProcedure=ruleProcedure();

            state._fsp--;

             current =iv_ruleProcedure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcedure943); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcedure"


    // $ANTLR start "ruleProcedure"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:452:1: ruleProcedure returns [EObject current=null] : (otherlv_0= 'Test' otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) )+ otherlv_3= '}' ) ;
    public final EObject ruleProcedure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_actions_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:455:28: ( (otherlv_0= 'Test' otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) )+ otherlv_3= '}' ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:456:1: (otherlv_0= 'Test' otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) )+ otherlv_3= '}' )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:456:1: (otherlv_0= 'Test' otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) )+ otherlv_3= '}' )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:456:3: otherlv_0= 'Test' otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleProcedure980); 

                	newLeafNode(otherlv_0, grammarAccess.getProcedureAccess().getTestKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleProcedure992); 

                	newLeafNode(otherlv_1, grammarAccess.getProcedureAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:464:1: ( (lv_actions_2_0= ruleAction ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=18 && LA7_0<=23)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:465:1: (lv_actions_2_0= ruleAction )
            	    {
            	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:465:1: (lv_actions_2_0= ruleAction )
            	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:466:3: lv_actions_2_0= ruleAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProcedureAccess().getActionsActionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleProcedure1013);
            	    lv_actions_2_0=ruleAction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProcedureRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actions",
            	            		lv_actions_2_0, 
            	            		"Action");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleProcedure1026); 

                	newLeafNode(otherlv_3, grammarAccess.getProcedureAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcedure"


    // $ANTLR start "entryRuleAction"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:494:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:495:2: (iv_ruleAction= ruleAction EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:496:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction1062);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction1072); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:503:1: ruleAction returns [EObject current=null] : ( ( ( ( (lv_name_0_0= 'CALL' ) ) otherlv_1= '{' ( (lv_parameterSet_2_0= ruleParameterSetCall ) ) ) | ( ( (lv_name_3_0= 'ANSWER' ) ) otherlv_4= '{' ( (lv_parameterSet_5_0= ruleParameterSetAnswer ) ) ) | ( ( (lv_name_6_0= 'USSD' ) ) otherlv_7= '{' ( (lv_parameterSet_8_0= ruleParameterSetUssd ) ) ) | ( ( (lv_name_9_0= 'SMS' ) ) otherlv_10= '{' ( (lv_parameterSet_11_0= ruleParameterSetSms ) ) ) | ( ( (lv_name_12_0= 'DATA' ) ) otherlv_13= '{' ( (lv_parameterSet_14_0= ruleParameterSetData ) ) ) | ( ( (lv_name_15_0= 'MIXER' ) ) otherlv_16= '{' ( (lv_parameterSet_17_0= ruleParameterSetMixer ) ) ) ) otherlv_18= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token lv_name_12_0=null;
        Token otherlv_13=null;
        Token lv_name_15_0=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_parameterSet_2_0 = null;

        EObject lv_parameterSet_5_0 = null;

        EObject lv_parameterSet_8_0 = null;

        EObject lv_parameterSet_11_0 = null;

        EObject lv_parameterSet_14_0 = null;

        EObject lv_parameterSet_17_0 = null;


         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:506:28: ( ( ( ( ( (lv_name_0_0= 'CALL' ) ) otherlv_1= '{' ( (lv_parameterSet_2_0= ruleParameterSetCall ) ) ) | ( ( (lv_name_3_0= 'ANSWER' ) ) otherlv_4= '{' ( (lv_parameterSet_5_0= ruleParameterSetAnswer ) ) ) | ( ( (lv_name_6_0= 'USSD' ) ) otherlv_7= '{' ( (lv_parameterSet_8_0= ruleParameterSetUssd ) ) ) | ( ( (lv_name_9_0= 'SMS' ) ) otherlv_10= '{' ( (lv_parameterSet_11_0= ruleParameterSetSms ) ) ) | ( ( (lv_name_12_0= 'DATA' ) ) otherlv_13= '{' ( (lv_parameterSet_14_0= ruleParameterSetData ) ) ) | ( ( (lv_name_15_0= 'MIXER' ) ) otherlv_16= '{' ( (lv_parameterSet_17_0= ruleParameterSetMixer ) ) ) ) otherlv_18= '}' ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:507:1: ( ( ( ( (lv_name_0_0= 'CALL' ) ) otherlv_1= '{' ( (lv_parameterSet_2_0= ruleParameterSetCall ) ) ) | ( ( (lv_name_3_0= 'ANSWER' ) ) otherlv_4= '{' ( (lv_parameterSet_5_0= ruleParameterSetAnswer ) ) ) | ( ( (lv_name_6_0= 'USSD' ) ) otherlv_7= '{' ( (lv_parameterSet_8_0= ruleParameterSetUssd ) ) ) | ( ( (lv_name_9_0= 'SMS' ) ) otherlv_10= '{' ( (lv_parameterSet_11_0= ruleParameterSetSms ) ) ) | ( ( (lv_name_12_0= 'DATA' ) ) otherlv_13= '{' ( (lv_parameterSet_14_0= ruleParameterSetData ) ) ) | ( ( (lv_name_15_0= 'MIXER' ) ) otherlv_16= '{' ( (lv_parameterSet_17_0= ruleParameterSetMixer ) ) ) ) otherlv_18= '}' )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:507:1: ( ( ( ( (lv_name_0_0= 'CALL' ) ) otherlv_1= '{' ( (lv_parameterSet_2_0= ruleParameterSetCall ) ) ) | ( ( (lv_name_3_0= 'ANSWER' ) ) otherlv_4= '{' ( (lv_parameterSet_5_0= ruleParameterSetAnswer ) ) ) | ( ( (lv_name_6_0= 'USSD' ) ) otherlv_7= '{' ( (lv_parameterSet_8_0= ruleParameterSetUssd ) ) ) | ( ( (lv_name_9_0= 'SMS' ) ) otherlv_10= '{' ( (lv_parameterSet_11_0= ruleParameterSetSms ) ) ) | ( ( (lv_name_12_0= 'DATA' ) ) otherlv_13= '{' ( (lv_parameterSet_14_0= ruleParameterSetData ) ) ) | ( ( (lv_name_15_0= 'MIXER' ) ) otherlv_16= '{' ( (lv_parameterSet_17_0= ruleParameterSetMixer ) ) ) ) otherlv_18= '}' )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:507:2: ( ( ( (lv_name_0_0= 'CALL' ) ) otherlv_1= '{' ( (lv_parameterSet_2_0= ruleParameterSetCall ) ) ) | ( ( (lv_name_3_0= 'ANSWER' ) ) otherlv_4= '{' ( (lv_parameterSet_5_0= ruleParameterSetAnswer ) ) ) | ( ( (lv_name_6_0= 'USSD' ) ) otherlv_7= '{' ( (lv_parameterSet_8_0= ruleParameterSetUssd ) ) ) | ( ( (lv_name_9_0= 'SMS' ) ) otherlv_10= '{' ( (lv_parameterSet_11_0= ruleParameterSetSms ) ) ) | ( ( (lv_name_12_0= 'DATA' ) ) otherlv_13= '{' ( (lv_parameterSet_14_0= ruleParameterSetData ) ) ) | ( ( (lv_name_15_0= 'MIXER' ) ) otherlv_16= '{' ( (lv_parameterSet_17_0= ruleParameterSetMixer ) ) ) ) otherlv_18= '}'
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:507:2: ( ( ( (lv_name_0_0= 'CALL' ) ) otherlv_1= '{' ( (lv_parameterSet_2_0= ruleParameterSetCall ) ) ) | ( ( (lv_name_3_0= 'ANSWER' ) ) otherlv_4= '{' ( (lv_parameterSet_5_0= ruleParameterSetAnswer ) ) ) | ( ( (lv_name_6_0= 'USSD' ) ) otherlv_7= '{' ( (lv_parameterSet_8_0= ruleParameterSetUssd ) ) ) | ( ( (lv_name_9_0= 'SMS' ) ) otherlv_10= '{' ( (lv_parameterSet_11_0= ruleParameterSetSms ) ) ) | ( ( (lv_name_12_0= 'DATA' ) ) otherlv_13= '{' ( (lv_parameterSet_14_0= ruleParameterSetData ) ) ) | ( ( (lv_name_15_0= 'MIXER' ) ) otherlv_16= '{' ( (lv_parameterSet_17_0= ruleParameterSetMixer ) ) ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case 19:
                {
                alt8=2;
                }
                break;
            case 20:
                {
                alt8=3;
                }
                break;
            case 21:
                {
                alt8=4;
                }
                break;
            case 22:
                {
                alt8=5;
                }
                break;
            case 23:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:507:3: ( ( (lv_name_0_0= 'CALL' ) ) otherlv_1= '{' ( (lv_parameterSet_2_0= ruleParameterSetCall ) ) )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:507:3: ( ( (lv_name_0_0= 'CALL' ) ) otherlv_1= '{' ( (lv_parameterSet_2_0= ruleParameterSetCall ) ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:507:4: ( (lv_name_0_0= 'CALL' ) ) otherlv_1= '{' ( (lv_parameterSet_2_0= ruleParameterSetCall ) )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:507:4: ( (lv_name_0_0= 'CALL' ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:508:1: (lv_name_0_0= 'CALL' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:508:1: (lv_name_0_0= 'CALL' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:509:3: lv_name_0_0= 'CALL'
                    {
                    lv_name_0_0=(Token)match(input,18,FOLLOW_18_in_ruleAction1117); 

                            newLeafNode(lv_name_0_0, grammarAccess.getActionAccess().getNameCALLKeyword_0_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_0_0, "CALL");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleAction1142); 

                        	newLeafNode(otherlv_1, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_0_0_1());
                        
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:526:1: ( (lv_parameterSet_2_0= ruleParameterSetCall ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:527:1: (lv_parameterSet_2_0= ruleParameterSetCall )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:527:1: (lv_parameterSet_2_0= ruleParameterSetCall )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:528:3: lv_parameterSet_2_0= ruleParameterSetCall
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getParameterSetParameterSetCallParserRuleCall_0_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterSetCall_in_ruleAction1163);
                    lv_parameterSet_2_0=ruleParameterSetCall();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		set(
                           			current, 
                           			"parameterSet",
                            		lv_parameterSet_2_0, 
                            		"ParameterSetCall");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:545:6: ( ( (lv_name_3_0= 'ANSWER' ) ) otherlv_4= '{' ( (lv_parameterSet_5_0= ruleParameterSetAnswer ) ) )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:545:6: ( ( (lv_name_3_0= 'ANSWER' ) ) otherlv_4= '{' ( (lv_parameterSet_5_0= ruleParameterSetAnswer ) ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:545:7: ( (lv_name_3_0= 'ANSWER' ) ) otherlv_4= '{' ( (lv_parameterSet_5_0= ruleParameterSetAnswer ) )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:545:7: ( (lv_name_3_0= 'ANSWER' ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:546:1: (lv_name_3_0= 'ANSWER' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:546:1: (lv_name_3_0= 'ANSWER' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:547:3: lv_name_3_0= 'ANSWER'
                    {
                    lv_name_3_0=(Token)match(input,19,FOLLOW_19_in_ruleAction1189); 

                            newLeafNode(lv_name_3_0, grammarAccess.getActionAccess().getNameANSWERKeyword_0_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_3_0, "ANSWER");
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleAction1214); 

                        	newLeafNode(otherlv_4, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_0_1_1());
                        
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:564:1: ( (lv_parameterSet_5_0= ruleParameterSetAnswer ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:565:1: (lv_parameterSet_5_0= ruleParameterSetAnswer )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:565:1: (lv_parameterSet_5_0= ruleParameterSetAnswer )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:566:3: lv_parameterSet_5_0= ruleParameterSetAnswer
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getParameterSetParameterSetAnswerParserRuleCall_0_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterSetAnswer_in_ruleAction1235);
                    lv_parameterSet_5_0=ruleParameterSetAnswer();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		set(
                           			current, 
                           			"parameterSet",
                            		lv_parameterSet_5_0, 
                            		"ParameterSetAnswer");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:583:6: ( ( (lv_name_6_0= 'USSD' ) ) otherlv_7= '{' ( (lv_parameterSet_8_0= ruleParameterSetUssd ) ) )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:583:6: ( ( (lv_name_6_0= 'USSD' ) ) otherlv_7= '{' ( (lv_parameterSet_8_0= ruleParameterSetUssd ) ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:583:7: ( (lv_name_6_0= 'USSD' ) ) otherlv_7= '{' ( (lv_parameterSet_8_0= ruleParameterSetUssd ) )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:583:7: ( (lv_name_6_0= 'USSD' ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:584:1: (lv_name_6_0= 'USSD' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:584:1: (lv_name_6_0= 'USSD' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:585:3: lv_name_6_0= 'USSD'
                    {
                    lv_name_6_0=(Token)match(input,20,FOLLOW_20_in_ruleAction1261); 

                            newLeafNode(lv_name_6_0, grammarAccess.getActionAccess().getNameUSSDKeyword_0_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_6_0, "USSD");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleAction1286); 

                        	newLeafNode(otherlv_7, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_0_2_1());
                        
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:602:1: ( (lv_parameterSet_8_0= ruleParameterSetUssd ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:603:1: (lv_parameterSet_8_0= ruleParameterSetUssd )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:603:1: (lv_parameterSet_8_0= ruleParameterSetUssd )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:604:3: lv_parameterSet_8_0= ruleParameterSetUssd
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getParameterSetParameterSetUssdParserRuleCall_0_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterSetUssd_in_ruleAction1307);
                    lv_parameterSet_8_0=ruleParameterSetUssd();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		set(
                           			current, 
                           			"parameterSet",
                            		lv_parameterSet_8_0, 
                            		"ParameterSetUssd");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:621:6: ( ( (lv_name_9_0= 'SMS' ) ) otherlv_10= '{' ( (lv_parameterSet_11_0= ruleParameterSetSms ) ) )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:621:6: ( ( (lv_name_9_0= 'SMS' ) ) otherlv_10= '{' ( (lv_parameterSet_11_0= ruleParameterSetSms ) ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:621:7: ( (lv_name_9_0= 'SMS' ) ) otherlv_10= '{' ( (lv_parameterSet_11_0= ruleParameterSetSms ) )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:621:7: ( (lv_name_9_0= 'SMS' ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:622:1: (lv_name_9_0= 'SMS' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:622:1: (lv_name_9_0= 'SMS' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:623:3: lv_name_9_0= 'SMS'
                    {
                    lv_name_9_0=(Token)match(input,21,FOLLOW_21_in_ruleAction1333); 

                            newLeafNode(lv_name_9_0, grammarAccess.getActionAccess().getNameSMSKeyword_0_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_9_0, "SMS");
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,12,FOLLOW_12_in_ruleAction1358); 

                        	newLeafNode(otherlv_10, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_0_3_1());
                        
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:640:1: ( (lv_parameterSet_11_0= ruleParameterSetSms ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:641:1: (lv_parameterSet_11_0= ruleParameterSetSms )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:641:1: (lv_parameterSet_11_0= ruleParameterSetSms )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:642:3: lv_parameterSet_11_0= ruleParameterSetSms
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getParameterSetParameterSetSmsParserRuleCall_0_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterSetSms_in_ruleAction1379);
                    lv_parameterSet_11_0=ruleParameterSetSms();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		set(
                           			current, 
                           			"parameterSet",
                            		lv_parameterSet_11_0, 
                            		"ParameterSetSms");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:659:6: ( ( (lv_name_12_0= 'DATA' ) ) otherlv_13= '{' ( (lv_parameterSet_14_0= ruleParameterSetData ) ) )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:659:6: ( ( (lv_name_12_0= 'DATA' ) ) otherlv_13= '{' ( (lv_parameterSet_14_0= ruleParameterSetData ) ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:659:7: ( (lv_name_12_0= 'DATA' ) ) otherlv_13= '{' ( (lv_parameterSet_14_0= ruleParameterSetData ) )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:659:7: ( (lv_name_12_0= 'DATA' ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:660:1: (lv_name_12_0= 'DATA' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:660:1: (lv_name_12_0= 'DATA' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:661:3: lv_name_12_0= 'DATA'
                    {
                    lv_name_12_0=(Token)match(input,22,FOLLOW_22_in_ruleAction1405); 

                            newLeafNode(lv_name_12_0, grammarAccess.getActionAccess().getNameDATAKeyword_0_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_12_0, "DATA");
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,12,FOLLOW_12_in_ruleAction1430); 

                        	newLeafNode(otherlv_13, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_0_4_1());
                        
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:678:1: ( (lv_parameterSet_14_0= ruleParameterSetData ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:679:1: (lv_parameterSet_14_0= ruleParameterSetData )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:679:1: (lv_parameterSet_14_0= ruleParameterSetData )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:680:3: lv_parameterSet_14_0= ruleParameterSetData
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getParameterSetParameterSetDataParserRuleCall_0_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterSetData_in_ruleAction1451);
                    lv_parameterSet_14_0=ruleParameterSetData();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		set(
                           			current, 
                           			"parameterSet",
                            		lv_parameterSet_14_0, 
                            		"ParameterSetData");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:697:6: ( ( (lv_name_15_0= 'MIXER' ) ) otherlv_16= '{' ( (lv_parameterSet_17_0= ruleParameterSetMixer ) ) )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:697:6: ( ( (lv_name_15_0= 'MIXER' ) ) otherlv_16= '{' ( (lv_parameterSet_17_0= ruleParameterSetMixer ) ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:697:7: ( (lv_name_15_0= 'MIXER' ) ) otherlv_16= '{' ( (lv_parameterSet_17_0= ruleParameterSetMixer ) )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:697:7: ( (lv_name_15_0= 'MIXER' ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:698:1: (lv_name_15_0= 'MIXER' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:698:1: (lv_name_15_0= 'MIXER' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:699:3: lv_name_15_0= 'MIXER'
                    {
                    lv_name_15_0=(Token)match(input,23,FOLLOW_23_in_ruleAction1477); 

                            newLeafNode(lv_name_15_0, grammarAccess.getActionAccess().getNameMIXERKeyword_0_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActionRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_15_0, "MIXER");
                    	    

                    }


                    }

                    otherlv_16=(Token)match(input,12,FOLLOW_12_in_ruleAction1502); 

                        	newLeafNode(otherlv_16, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_0_5_1());
                        
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:716:1: ( (lv_parameterSet_17_0= ruleParameterSetMixer ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:717:1: (lv_parameterSet_17_0= ruleParameterSetMixer )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:717:1: (lv_parameterSet_17_0= ruleParameterSetMixer )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:718:3: lv_parameterSet_17_0= ruleParameterSetMixer
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getParameterSetParameterSetMixerParserRuleCall_0_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterSetMixer_in_ruleAction1523);
                    lv_parameterSet_17_0=ruleParameterSetMixer();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		set(
                           			current, 
                           			"parameterSet",
                            		lv_parameterSet_17_0, 
                            		"ParameterSetMixer");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_18=(Token)match(input,13,FOLLOW_13_in_ruleAction1537); 

                	newLeafNode(otherlv_18, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleParameterSetCall"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:746:1: entryRuleParameterSetCall returns [EObject current=null] : iv_ruleParameterSetCall= ruleParameterSetCall EOF ;
    public final EObject entryRuleParameterSetCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterSetCall = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:747:2: (iv_ruleParameterSetCall= ruleParameterSetCall EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:748:2: iv_ruleParameterSetCall= ruleParameterSetCall EOF
            {
             newCompositeNode(grammarAccess.getParameterSetCallRule()); 
            pushFollow(FOLLOW_ruleParameterSetCall_in_entryRuleParameterSetCall1573);
            iv_ruleParameterSetCall=ruleParameterSetCall();

            state._fsp--;

             current =iv_ruleParameterSetCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterSetCall1583); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterSetCall"


    // $ANTLR start "ruleParameterSetCall"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:755:1: ruleParameterSetCall returns [EObject current=null] : ( (lv_parameters_0_0= ruleParameterCall ) ) ;
    public final EObject ruleParameterSetCall() throws RecognitionException {
        EObject current = null;

        EObject lv_parameters_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:758:28: ( ( (lv_parameters_0_0= ruleParameterCall ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:759:1: ( (lv_parameters_0_0= ruleParameterCall ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:759:1: ( (lv_parameters_0_0= ruleParameterCall ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:760:1: (lv_parameters_0_0= ruleParameterCall )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:760:1: (lv_parameters_0_0= ruleParameterCall )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:761:3: lv_parameters_0_0= ruleParameterCall
            {
             
            	        newCompositeNode(grammarAccess.getParameterSetCallAccess().getParametersParameterCallParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleParameterCall_in_ruleParameterSetCall1628);
            lv_parameters_0_0=ruleParameterCall();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterSetCallRule());
            	        }
                   		add(
                   			current, 
                   			"parameters",
                    		lv_parameters_0_0, 
                    		"ParameterCall");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterSetCall"


    // $ANTLR start "entryRuleParameterSetAnswer"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:785:1: entryRuleParameterSetAnswer returns [EObject current=null] : iv_ruleParameterSetAnswer= ruleParameterSetAnswer EOF ;
    public final EObject entryRuleParameterSetAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterSetAnswer = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:786:2: (iv_ruleParameterSetAnswer= ruleParameterSetAnswer EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:787:2: iv_ruleParameterSetAnswer= ruleParameterSetAnswer EOF
            {
             newCompositeNode(grammarAccess.getParameterSetAnswerRule()); 
            pushFollow(FOLLOW_ruleParameterSetAnswer_in_entryRuleParameterSetAnswer1663);
            iv_ruleParameterSetAnswer=ruleParameterSetAnswer();

            state._fsp--;

             current =iv_ruleParameterSetAnswer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterSetAnswer1673); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterSetAnswer"


    // $ANTLR start "ruleParameterSetAnswer"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:794:1: ruleParameterSetAnswer returns [EObject current=null] : ( (lv_parameters_0_0= ruleParameterAnswer ) ) ;
    public final EObject ruleParameterSetAnswer() throws RecognitionException {
        EObject current = null;

        EObject lv_parameters_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:797:28: ( ( (lv_parameters_0_0= ruleParameterAnswer ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:798:1: ( (lv_parameters_0_0= ruleParameterAnswer ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:798:1: ( (lv_parameters_0_0= ruleParameterAnswer ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:799:1: (lv_parameters_0_0= ruleParameterAnswer )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:799:1: (lv_parameters_0_0= ruleParameterAnswer )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:800:3: lv_parameters_0_0= ruleParameterAnswer
            {
             
            	        newCompositeNode(grammarAccess.getParameterSetAnswerAccess().getParametersParameterAnswerParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleParameterAnswer_in_ruleParameterSetAnswer1718);
            lv_parameters_0_0=ruleParameterAnswer();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterSetAnswerRule());
            	        }
                   		add(
                   			current, 
                   			"parameters",
                    		lv_parameters_0_0, 
                    		"ParameterAnswer");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterSetAnswer"


    // $ANTLR start "entryRuleParameterSetUssd"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:824:1: entryRuleParameterSetUssd returns [EObject current=null] : iv_ruleParameterSetUssd= ruleParameterSetUssd EOF ;
    public final EObject entryRuleParameterSetUssd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterSetUssd = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:825:2: (iv_ruleParameterSetUssd= ruleParameterSetUssd EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:826:2: iv_ruleParameterSetUssd= ruleParameterSetUssd EOF
            {
             newCompositeNode(grammarAccess.getParameterSetUssdRule()); 
            pushFollow(FOLLOW_ruleParameterSetUssd_in_entryRuleParameterSetUssd1753);
            iv_ruleParameterSetUssd=ruleParameterSetUssd();

            state._fsp--;

             current =iv_ruleParameterSetUssd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterSetUssd1763); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterSetUssd"


    // $ANTLR start "ruleParameterSetUssd"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:833:1: ruleParameterSetUssd returns [EObject current=null] : ( (lv_parameters_0_0= ruleParameterUssd ) ) ;
    public final EObject ruleParameterSetUssd() throws RecognitionException {
        EObject current = null;

        EObject lv_parameters_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:836:28: ( ( (lv_parameters_0_0= ruleParameterUssd ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:837:1: ( (lv_parameters_0_0= ruleParameterUssd ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:837:1: ( (lv_parameters_0_0= ruleParameterUssd ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:838:1: (lv_parameters_0_0= ruleParameterUssd )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:838:1: (lv_parameters_0_0= ruleParameterUssd )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:839:3: lv_parameters_0_0= ruleParameterUssd
            {
             
            	        newCompositeNode(grammarAccess.getParameterSetUssdAccess().getParametersParameterUssdParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleParameterUssd_in_ruleParameterSetUssd1808);
            lv_parameters_0_0=ruleParameterUssd();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterSetUssdRule());
            	        }
                   		add(
                   			current, 
                   			"parameters",
                    		lv_parameters_0_0, 
                    		"ParameterUssd");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterSetUssd"


    // $ANTLR start "entryRuleParameterSetSms"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:863:1: entryRuleParameterSetSms returns [EObject current=null] : iv_ruleParameterSetSms= ruleParameterSetSms EOF ;
    public final EObject entryRuleParameterSetSms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterSetSms = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:864:2: (iv_ruleParameterSetSms= ruleParameterSetSms EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:865:2: iv_ruleParameterSetSms= ruleParameterSetSms EOF
            {
             newCompositeNode(grammarAccess.getParameterSetSmsRule()); 
            pushFollow(FOLLOW_ruleParameterSetSms_in_entryRuleParameterSetSms1843);
            iv_ruleParameterSetSms=ruleParameterSetSms();

            state._fsp--;

             current =iv_ruleParameterSetSms; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterSetSms1853); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterSetSms"


    // $ANTLR start "ruleParameterSetSms"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:872:1: ruleParameterSetSms returns [EObject current=null] : ( (lv_parameters_0_0= ruleParameterSms ) ) ;
    public final EObject ruleParameterSetSms() throws RecognitionException {
        EObject current = null;

        EObject lv_parameters_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:875:28: ( ( (lv_parameters_0_0= ruleParameterSms ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:876:1: ( (lv_parameters_0_0= ruleParameterSms ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:876:1: ( (lv_parameters_0_0= ruleParameterSms ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:877:1: (lv_parameters_0_0= ruleParameterSms )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:877:1: (lv_parameters_0_0= ruleParameterSms )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:878:3: lv_parameters_0_0= ruleParameterSms
            {
             
            	        newCompositeNode(grammarAccess.getParameterSetSmsAccess().getParametersParameterSmsParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleParameterSms_in_ruleParameterSetSms1898);
            lv_parameters_0_0=ruleParameterSms();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterSetSmsRule());
            	        }
                   		add(
                   			current, 
                   			"parameters",
                    		lv_parameters_0_0, 
                    		"ParameterSms");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterSetSms"


    // $ANTLR start "entryRuleParameterSetData"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:902:1: entryRuleParameterSetData returns [EObject current=null] : iv_ruleParameterSetData= ruleParameterSetData EOF ;
    public final EObject entryRuleParameterSetData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterSetData = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:903:2: (iv_ruleParameterSetData= ruleParameterSetData EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:904:2: iv_ruleParameterSetData= ruleParameterSetData EOF
            {
             newCompositeNode(grammarAccess.getParameterSetDataRule()); 
            pushFollow(FOLLOW_ruleParameterSetData_in_entryRuleParameterSetData1933);
            iv_ruleParameterSetData=ruleParameterSetData();

            state._fsp--;

             current =iv_ruleParameterSetData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterSetData1943); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterSetData"


    // $ANTLR start "ruleParameterSetData"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:911:1: ruleParameterSetData returns [EObject current=null] : ( (lv_parameters_0_0= ruleParameterData ) ) ;
    public final EObject ruleParameterSetData() throws RecognitionException {
        EObject current = null;

        EObject lv_parameters_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:914:28: ( ( (lv_parameters_0_0= ruleParameterData ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:915:1: ( (lv_parameters_0_0= ruleParameterData ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:915:1: ( (lv_parameters_0_0= ruleParameterData ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:916:1: (lv_parameters_0_0= ruleParameterData )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:916:1: (lv_parameters_0_0= ruleParameterData )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:917:3: lv_parameters_0_0= ruleParameterData
            {
             
            	        newCompositeNode(grammarAccess.getParameterSetDataAccess().getParametersParameterDataParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleParameterData_in_ruleParameterSetData1988);
            lv_parameters_0_0=ruleParameterData();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterSetDataRule());
            	        }
                   		add(
                   			current, 
                   			"parameters",
                    		lv_parameters_0_0, 
                    		"ParameterData");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterSetData"


    // $ANTLR start "entryRuleParameterSetMixer"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:941:1: entryRuleParameterSetMixer returns [EObject current=null] : iv_ruleParameterSetMixer= ruleParameterSetMixer EOF ;
    public final EObject entryRuleParameterSetMixer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterSetMixer = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:942:2: (iv_ruleParameterSetMixer= ruleParameterSetMixer EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:943:2: iv_ruleParameterSetMixer= ruleParameterSetMixer EOF
            {
             newCompositeNode(grammarAccess.getParameterSetMixerRule()); 
            pushFollow(FOLLOW_ruleParameterSetMixer_in_entryRuleParameterSetMixer2023);
            iv_ruleParameterSetMixer=ruleParameterSetMixer();

            state._fsp--;

             current =iv_ruleParameterSetMixer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterSetMixer2033); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterSetMixer"


    // $ANTLR start "ruleParameterSetMixer"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:950:1: ruleParameterSetMixer returns [EObject current=null] : ( (lv_parameters_0_0= ruleParameterMixer ) )+ ;
    public final EObject ruleParameterSetMixer() throws RecognitionException {
        EObject current = null;

        EObject lv_parameters_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:953:28: ( ( (lv_parameters_0_0= ruleParameterMixer ) )+ )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:954:1: ( (lv_parameters_0_0= ruleParameterMixer ) )+
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:954:1: ( (lv_parameters_0_0= ruleParameterMixer ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=38 && LA9_0<=44)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:955:1: (lv_parameters_0_0= ruleParameterMixer )
            	    {
            	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:955:1: (lv_parameters_0_0= ruleParameterMixer )
            	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:956:3: lv_parameters_0_0= ruleParameterMixer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParameterSetMixerAccess().getParametersParameterMixerParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameterMixer_in_ruleParameterSetMixer2078);
            	    lv_parameters_0_0=ruleParameterMixer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParameterSetMixerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_0_0, 
            	            		"ParameterMixer");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterSetMixer"


    // $ANTLR start "entryRuleParameterCall"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:980:1: entryRuleParameterCall returns [EObject current=null] : iv_ruleParameterCall= ruleParameterCall EOF ;
    public final EObject entryRuleParameterCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterCall = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:981:2: (iv_ruleParameterCall= ruleParameterCall EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:982:2: iv_ruleParameterCall= ruleParameterCall EOF
            {
             newCompositeNode(grammarAccess.getParameterCallRule()); 
            pushFollow(FOLLOW_ruleParameterCall_in_entryRuleParameterCall2114);
            iv_ruleParameterCall=ruleParameterCall();

            state._fsp--;

             current =iv_ruleParameterCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterCall2124); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterCall"


    // $ANTLR start "ruleParameterCall"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:989:1: ruleParameterCall returns [EObject current=null] : ( (otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= 'To' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) (otherlv_6= 'CallingTime' otherlv_7= ':' ( (lv_callingTime_8_0= RULE_INT ) ) )? (otherlv_9= 'OffHookResponse' otherlv_10= ':' ( (lv_ofhookResponse_11_0= ruleCALLRESPONSE ) ) (otherlv_12= 'ResponseTime' otherlv_13= ':' ( (lv_responseTime_14_0= RULE_INT ) ) )? ) ) ;
    public final EObject ruleParameterCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_callingTime_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_responseTime_14_0=null;
        Enumerator lv_ofhookResponse_11_0 = null;


         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:992:28: ( ( (otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= 'To' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) (otherlv_6= 'CallingTime' otherlv_7= ':' ( (lv_callingTime_8_0= RULE_INT ) ) )? (otherlv_9= 'OffHookResponse' otherlv_10= ':' ( (lv_ofhookResponse_11_0= ruleCALLRESPONSE ) ) (otherlv_12= 'ResponseTime' otherlv_13= ':' ( (lv_responseTime_14_0= RULE_INT ) ) )? ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:993:1: ( (otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= 'To' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) (otherlv_6= 'CallingTime' otherlv_7= ':' ( (lv_callingTime_8_0= RULE_INT ) ) )? (otherlv_9= 'OffHookResponse' otherlv_10= ':' ( (lv_ofhookResponse_11_0= ruleCALLRESPONSE ) ) (otherlv_12= 'ResponseTime' otherlv_13= ':' ( (lv_responseTime_14_0= RULE_INT ) ) )? ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:993:1: ( (otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= 'To' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) (otherlv_6= 'CallingTime' otherlv_7= ':' ( (lv_callingTime_8_0= RULE_INT ) ) )? (otherlv_9= 'OffHookResponse' otherlv_10= ':' ( (lv_ofhookResponse_11_0= ruleCALLRESPONSE ) ) (otherlv_12= 'ResponseTime' otherlv_13= ':' ( (lv_responseTime_14_0= RULE_INT ) ) )? ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:993:2: (otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= 'To' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) (otherlv_6= 'CallingTime' otherlv_7= ':' ( (lv_callingTime_8_0= RULE_INT ) ) )? (otherlv_9= 'OffHookResponse' otherlv_10= ':' ( (lv_ofhookResponse_11_0= ruleCALLRESPONSE ) ) (otherlv_12= 'ResponseTime' otherlv_13= ':' ( (lv_responseTime_14_0= RULE_INT ) ) )? )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:993:2: (otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:993:4: otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleParameterCall2162); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterCallAccess().getFromKeyword_0_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleParameterCall2174); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterCallAccess().getColonKeyword_0_1());
                
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1001:1: ( (otherlv_2= RULE_ID ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1002:1: (otherlv_2= RULE_ID )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1002:1: (otherlv_2= RULE_ID )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1003:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterCallRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterCall2194); 

            		newLeafNode(otherlv_2, grammarAccess.getParameterCallAccess().getFromUECrossReference_0_2_0()); 
            	

            }


            }


            }

            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1014:3: (otherlv_3= 'To' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1014:5: otherlv_3= 'To' otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleParameterCall2208); 

                	newLeafNode(otherlv_3, grammarAccess.getParameterCallAccess().getToKeyword_1_0());
                
            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleParameterCall2220); 

                	newLeafNode(otherlv_4, grammarAccess.getParameterCallAccess().getColonKeyword_1_1());
                
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1022:1: ( (otherlv_5= RULE_ID ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1023:1: (otherlv_5= RULE_ID )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1023:1: (otherlv_5= RULE_ID )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1024:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterCallRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterCall2240); 

            		newLeafNode(otherlv_5, grammarAccess.getParameterCallAccess().getToUECrossReference_1_2_0()); 
            	

            }


            }


            }

            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1035:3: (otherlv_6= 'CallingTime' otherlv_7= ':' ( (lv_callingTime_8_0= RULE_INT ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1035:5: otherlv_6= 'CallingTime' otherlv_7= ':' ( (lv_callingTime_8_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleParameterCall2254); 

                        	newLeafNode(otherlv_6, grammarAccess.getParameterCallAccess().getCallingTimeKeyword_2_0());
                        
                    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleParameterCall2266); 

                        	newLeafNode(otherlv_7, grammarAccess.getParameterCallAccess().getColonKeyword_2_1());
                        
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1043:1: ( (lv_callingTime_8_0= RULE_INT ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1044:1: (lv_callingTime_8_0= RULE_INT )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1044:1: (lv_callingTime_8_0= RULE_INT )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1045:3: lv_callingTime_8_0= RULE_INT
                    {
                    lv_callingTime_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleParameterCall2283); 

                    			newLeafNode(lv_callingTime_8_0, grammarAccess.getParameterCallAccess().getCallingTimeINTTerminalRuleCall_2_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterCallRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"callingTime",
                            		lv_callingTime_8_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1061:4: (otherlv_9= 'OffHookResponse' otherlv_10= ':' ( (lv_ofhookResponse_11_0= ruleCALLRESPONSE ) ) (otherlv_12= 'ResponseTime' otherlv_13= ':' ( (lv_responseTime_14_0= RULE_INT ) ) )? )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1061:6: otherlv_9= 'OffHookResponse' otherlv_10= ':' ( (lv_ofhookResponse_11_0= ruleCALLRESPONSE ) ) (otherlv_12= 'ResponseTime' otherlv_13= ':' ( (lv_responseTime_14_0= RULE_INT ) ) )?
            {
            otherlv_9=(Token)match(input,27,FOLLOW_27_in_ruleParameterCall2303); 

                	newLeafNode(otherlv_9, grammarAccess.getParameterCallAccess().getOffHookResponseKeyword_3_0());
                
            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleParameterCall2315); 

                	newLeafNode(otherlv_10, grammarAccess.getParameterCallAccess().getColonKeyword_3_1());
                
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1069:1: ( (lv_ofhookResponse_11_0= ruleCALLRESPONSE ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1070:1: (lv_ofhookResponse_11_0= ruleCALLRESPONSE )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1070:1: (lv_ofhookResponse_11_0= ruleCALLRESPONSE )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1071:3: lv_ofhookResponse_11_0= ruleCALLRESPONSE
            {
             
            	        newCompositeNode(grammarAccess.getParameterCallAccess().getOfhookResponseCALLRESPONSEEnumRuleCall_3_2_0()); 
            	    
            pushFollow(FOLLOW_ruleCALLRESPONSE_in_ruleParameterCall2336);
            lv_ofhookResponse_11_0=ruleCALLRESPONSE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterCallRule());
            	        }
                   		set(
                   			current, 
                   			"ofhookResponse",
                    		lv_ofhookResponse_11_0, 
                    		"CALLRESPONSE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1087:2: (otherlv_12= 'ResponseTime' otherlv_13= ':' ( (lv_responseTime_14_0= RULE_INT ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1087:4: otherlv_12= 'ResponseTime' otherlv_13= ':' ( (lv_responseTime_14_0= RULE_INT ) )
                    {
                    otherlv_12=(Token)match(input,28,FOLLOW_28_in_ruleParameterCall2349); 

                        	newLeafNode(otherlv_12, grammarAccess.getParameterCallAccess().getResponseTimeKeyword_3_3_0());
                        
                    otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleParameterCall2361); 

                        	newLeafNode(otherlv_13, grammarAccess.getParameterCallAccess().getColonKeyword_3_3_1());
                        
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1095:1: ( (lv_responseTime_14_0= RULE_INT ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1096:1: (lv_responseTime_14_0= RULE_INT )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1096:1: (lv_responseTime_14_0= RULE_INT )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1097:3: lv_responseTime_14_0= RULE_INT
                    {
                    lv_responseTime_14_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleParameterCall2378); 

                    			newLeafNode(lv_responseTime_14_0, grammarAccess.getParameterCallAccess().getResponseTimeINTTerminalRuleCall_3_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterCallRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"responseTime",
                            		lv_responseTime_14_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterCall"


    // $ANTLR start "entryRuleParameterAnswer"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1121:1: entryRuleParameterAnswer returns [EObject current=null] : iv_ruleParameterAnswer= ruleParameterAnswer EOF ;
    public final EObject entryRuleParameterAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterAnswer = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1122:2: (iv_ruleParameterAnswer= ruleParameterAnswer EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1123:2: iv_ruleParameterAnswer= ruleParameterAnswer EOF
            {
             newCompositeNode(grammarAccess.getParameterAnswerRule()); 
            pushFollow(FOLLOW_ruleParameterAnswer_in_entryRuleParameterAnswer2422);
            iv_ruleParameterAnswer=ruleParameterAnswer();

            state._fsp--;

             current =iv_ruleParameterAnswer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterAnswer2432); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterAnswer"


    // $ANTLR start "ruleParameterAnswer"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1130:1: ruleParameterAnswer returns [EObject current=null] : ( (otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= 'ListeningTime' otherlv_4= ':' ( (lv_listeningTime_5_0= RULE_INT ) ) ) (otherlv_6= 'AnswerTime' otherlv_7= ':' ( (lv_answerTime_8_0= RULE_INT ) ) )? (otherlv_9= 'Response' otherlv_10= ':' ( (lv_response_11_0= ruleANSWERRESPONSE ) ) )? ) ;
    public final EObject ruleParameterAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_listeningTime_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_answerTime_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Enumerator lv_response_11_0 = null;


         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1133:28: ( ( (otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= 'ListeningTime' otherlv_4= ':' ( (lv_listeningTime_5_0= RULE_INT ) ) ) (otherlv_6= 'AnswerTime' otherlv_7= ':' ( (lv_answerTime_8_0= RULE_INT ) ) )? (otherlv_9= 'Response' otherlv_10= ':' ( (lv_response_11_0= ruleANSWERRESPONSE ) ) )? ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1134:1: ( (otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= 'ListeningTime' otherlv_4= ':' ( (lv_listeningTime_5_0= RULE_INT ) ) ) (otherlv_6= 'AnswerTime' otherlv_7= ':' ( (lv_answerTime_8_0= RULE_INT ) ) )? (otherlv_9= 'Response' otherlv_10= ':' ( (lv_response_11_0= ruleANSWERRESPONSE ) ) )? )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1134:1: ( (otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= 'ListeningTime' otherlv_4= ':' ( (lv_listeningTime_5_0= RULE_INT ) ) ) (otherlv_6= 'AnswerTime' otherlv_7= ':' ( (lv_answerTime_8_0= RULE_INT ) ) )? (otherlv_9= 'Response' otherlv_10= ':' ( (lv_response_11_0= ruleANSWERRESPONSE ) ) )? )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1134:2: (otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= 'ListeningTime' otherlv_4= ':' ( (lv_listeningTime_5_0= RULE_INT ) ) ) (otherlv_6= 'AnswerTime' otherlv_7= ':' ( (lv_answerTime_8_0= RULE_INT ) ) )? (otherlv_9= 'Response' otherlv_10= ':' ( (lv_response_11_0= ruleANSWERRESPONSE ) ) )?
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1134:2: (otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1134:4: otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleParameterAnswer2470); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterAnswerAccess().getFromKeyword_0_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleParameterAnswer2482); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterAnswerAccess().getColonKeyword_0_1());
                
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1142:1: ( (otherlv_2= RULE_ID ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1143:1: (otherlv_2= RULE_ID )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1143:1: (otherlv_2= RULE_ID )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1144:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterAnswerRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterAnswer2502); 

            		newLeafNode(otherlv_2, grammarAccess.getParameterAnswerAccess().getFromUECrossReference_0_2_0()); 
            	

            }


            }


            }

            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1155:3: (otherlv_3= 'ListeningTime' otherlv_4= ':' ( (lv_listeningTime_5_0= RULE_INT ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1155:5: otherlv_3= 'ListeningTime' otherlv_4= ':' ( (lv_listeningTime_5_0= RULE_INT ) )
            {
            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleParameterAnswer2516); 

                	newLeafNode(otherlv_3, grammarAccess.getParameterAnswerAccess().getListeningTimeKeyword_1_0());
                
            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleParameterAnswer2528); 

                	newLeafNode(otherlv_4, grammarAccess.getParameterAnswerAccess().getColonKeyword_1_1());
                
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1163:1: ( (lv_listeningTime_5_0= RULE_INT ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1164:1: (lv_listeningTime_5_0= RULE_INT )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1164:1: (lv_listeningTime_5_0= RULE_INT )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1165:3: lv_listeningTime_5_0= RULE_INT
            {
            lv_listeningTime_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleParameterAnswer2545); 

            			newLeafNode(lv_listeningTime_5_0, grammarAccess.getParameterAnswerAccess().getListeningTimeINTTerminalRuleCall_1_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterAnswerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"listeningTime",
                    		lv_listeningTime_5_0, 
                    		"INT");
            	    

            }


            }


            }

            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1181:3: (otherlv_6= 'AnswerTime' otherlv_7= ':' ( (lv_answerTime_8_0= RULE_INT ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1181:5: otherlv_6= 'AnswerTime' otherlv_7= ':' ( (lv_answerTime_8_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleParameterAnswer2564); 

                        	newLeafNode(otherlv_6, grammarAccess.getParameterAnswerAccess().getAnswerTimeKeyword_2_0());
                        
                    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleParameterAnswer2576); 

                        	newLeafNode(otherlv_7, grammarAccess.getParameterAnswerAccess().getColonKeyword_2_1());
                        
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1189:1: ( (lv_answerTime_8_0= RULE_INT ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1190:1: (lv_answerTime_8_0= RULE_INT )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1190:1: (lv_answerTime_8_0= RULE_INT )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1191:3: lv_answerTime_8_0= RULE_INT
                    {
                    lv_answerTime_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleParameterAnswer2593); 

                    			newLeafNode(lv_answerTime_8_0, grammarAccess.getParameterAnswerAccess().getAnswerTimeINTTerminalRuleCall_2_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterAnswerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"answerTime",
                            		lv_answerTime_8_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1207:4: (otherlv_9= 'Response' otherlv_10= ':' ( (lv_response_11_0= ruleANSWERRESPONSE ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1207:6: otherlv_9= 'Response' otherlv_10= ':' ( (lv_response_11_0= ruleANSWERRESPONSE ) )
                    {
                    otherlv_9=(Token)match(input,31,FOLLOW_31_in_ruleParameterAnswer2613); 

                        	newLeafNode(otherlv_9, grammarAccess.getParameterAnswerAccess().getResponseKeyword_3_0());
                        
                    otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleParameterAnswer2625); 

                        	newLeafNode(otherlv_10, grammarAccess.getParameterAnswerAccess().getColonKeyword_3_1());
                        
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1215:1: ( (lv_response_11_0= ruleANSWERRESPONSE ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1216:1: (lv_response_11_0= ruleANSWERRESPONSE )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1216:1: (lv_response_11_0= ruleANSWERRESPONSE )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1217:3: lv_response_11_0= ruleANSWERRESPONSE
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAnswerAccess().getResponseANSWERRESPONSEEnumRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleANSWERRESPONSE_in_ruleParameterAnswer2646);
                    lv_response_11_0=ruleANSWERRESPONSE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterAnswerRule());
                    	        }
                           		set(
                           			current, 
                           			"response",
                            		lv_response_11_0, 
                            		"ANSWERRESPONSE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterAnswer"


    // $ANTLR start "entryRuleParameterUssd"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1241:1: entryRuleParameterUssd returns [EObject current=null] : iv_ruleParameterUssd= ruleParameterUssd EOF ;
    public final EObject entryRuleParameterUssd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterUssd = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1242:2: (iv_ruleParameterUssd= ruleParameterUssd EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1243:2: iv_ruleParameterUssd= ruleParameterUssd EOF
            {
             newCompositeNode(grammarAccess.getParameterUssdRule()); 
            pushFollow(FOLLOW_ruleParameterUssd_in_entryRuleParameterUssd2684);
            iv_ruleParameterUssd=ruleParameterUssd();

            state._fsp--;

             current =iv_ruleParameterUssd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterUssd2694); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterUssd"


    // $ANTLR start "ruleParameterUssd"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1250:1: ruleParameterUssd returns [EObject current=null] : ( (otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ( (otherlv_3= 'USSDCode' otherlv_4= ':' ( (lv_cfCode_5_0= ruleCALLFORWARDING ) ) (otherlv_6= 'Destination' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'ServiceDelay' otherlv_10= ':' ( (lv_serviceDelay_11_0= RULE_INT ) ) )? ) | (otherlv_12= 'USSDCode' otherlv_13= ':' ( (lv_barringCode_14_0= ruleBARRING ) ) (otherlv_15= 'Code' otherlv_16= ':' ( (lv_code_17_0= RULE_INT ) ) )? ) | (otherlv_18= 'USSDCode' otherlv_19= ':' ( (lv_liCode_20_0= ruleLINEIDENTIFICATION ) ) ) ) ( (lv_ussdregistration_21_0= ruleUSSDREGISTRATION ) )? ) ;
    public final EObject ruleParameterUssd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_serviceDelay_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_code_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Enumerator lv_cfCode_5_0 = null;

        Enumerator lv_barringCode_14_0 = null;

        Enumerator lv_liCode_20_0 = null;

        Enumerator lv_ussdregistration_21_0 = null;


         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1253:28: ( ( (otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ( (otherlv_3= 'USSDCode' otherlv_4= ':' ( (lv_cfCode_5_0= ruleCALLFORWARDING ) ) (otherlv_6= 'Destination' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'ServiceDelay' otherlv_10= ':' ( (lv_serviceDelay_11_0= RULE_INT ) ) )? ) | (otherlv_12= 'USSDCode' otherlv_13= ':' ( (lv_barringCode_14_0= ruleBARRING ) ) (otherlv_15= 'Code' otherlv_16= ':' ( (lv_code_17_0= RULE_INT ) ) )? ) | (otherlv_18= 'USSDCode' otherlv_19= ':' ( (lv_liCode_20_0= ruleLINEIDENTIFICATION ) ) ) ) ( (lv_ussdregistration_21_0= ruleUSSDREGISTRATION ) )? ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1254:1: ( (otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ( (otherlv_3= 'USSDCode' otherlv_4= ':' ( (lv_cfCode_5_0= ruleCALLFORWARDING ) ) (otherlv_6= 'Destination' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'ServiceDelay' otherlv_10= ':' ( (lv_serviceDelay_11_0= RULE_INT ) ) )? ) | (otherlv_12= 'USSDCode' otherlv_13= ':' ( (lv_barringCode_14_0= ruleBARRING ) ) (otherlv_15= 'Code' otherlv_16= ':' ( (lv_code_17_0= RULE_INT ) ) )? ) | (otherlv_18= 'USSDCode' otherlv_19= ':' ( (lv_liCode_20_0= ruleLINEIDENTIFICATION ) ) ) ) ( (lv_ussdregistration_21_0= ruleUSSDREGISTRATION ) )? )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1254:1: ( (otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ( (otherlv_3= 'USSDCode' otherlv_4= ':' ( (lv_cfCode_5_0= ruleCALLFORWARDING ) ) (otherlv_6= 'Destination' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'ServiceDelay' otherlv_10= ':' ( (lv_serviceDelay_11_0= RULE_INT ) ) )? ) | (otherlv_12= 'USSDCode' otherlv_13= ':' ( (lv_barringCode_14_0= ruleBARRING ) ) (otherlv_15= 'Code' otherlv_16= ':' ( (lv_code_17_0= RULE_INT ) ) )? ) | (otherlv_18= 'USSDCode' otherlv_19= ':' ( (lv_liCode_20_0= ruleLINEIDENTIFICATION ) ) ) ) ( (lv_ussdregistration_21_0= ruleUSSDREGISTRATION ) )? )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1254:2: (otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ( (otherlv_3= 'USSDCode' otherlv_4= ':' ( (lv_cfCode_5_0= ruleCALLFORWARDING ) ) (otherlv_6= 'Destination' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'ServiceDelay' otherlv_10= ':' ( (lv_serviceDelay_11_0= RULE_INT ) ) )? ) | (otherlv_12= 'USSDCode' otherlv_13= ':' ( (lv_barringCode_14_0= ruleBARRING ) ) (otherlv_15= 'Code' otherlv_16= ':' ( (lv_code_17_0= RULE_INT ) ) )? ) | (otherlv_18= 'USSDCode' otherlv_19= ':' ( (lv_liCode_20_0= ruleLINEIDENTIFICATION ) ) ) ) ( (lv_ussdregistration_21_0= ruleUSSDREGISTRATION ) )?
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1254:2: (otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1254:4: otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleParameterUssd2732); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterUssdAccess().getFromKeyword_0_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleParameterUssd2744); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterUssdAccess().getColonKeyword_0_1());
                
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1262:1: ( (otherlv_2= RULE_ID ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1263:1: (otherlv_2= RULE_ID )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1263:1: (otherlv_2= RULE_ID )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1264:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterUssdRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterUssd2764); 

            		newLeafNode(otherlv_2, grammarAccess.getParameterUssdAccess().getFromUECrossReference_0_2_0()); 
            	

            }


            }


            }

            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1275:3: ( (otherlv_3= 'USSDCode' otherlv_4= ':' ( (lv_cfCode_5_0= ruleCALLFORWARDING ) ) (otherlv_6= 'Destination' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'ServiceDelay' otherlv_10= ':' ( (lv_serviceDelay_11_0= RULE_INT ) ) )? ) | (otherlv_12= 'USSDCode' otherlv_13= ':' ( (lv_barringCode_14_0= ruleBARRING ) ) (otherlv_15= 'Code' otherlv_16= ':' ( (lv_code_17_0= RULE_INT ) ) )? ) | (otherlv_18= 'USSDCode' otherlv_19= ':' ( (lv_liCode_20_0= ruleLINEIDENTIFICATION ) ) ) )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==14) ) {
                    switch ( input.LA(3) ) {
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        {
                        alt17=3;
                        }
                        break;
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                        {
                        alt17=1;
                        }
                        break;
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                        {
                        alt17=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1275:4: (otherlv_3= 'USSDCode' otherlv_4= ':' ( (lv_cfCode_5_0= ruleCALLFORWARDING ) ) (otherlv_6= 'Destination' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'ServiceDelay' otherlv_10= ':' ( (lv_serviceDelay_11_0= RULE_INT ) ) )? )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1275:4: (otherlv_3= 'USSDCode' otherlv_4= ':' ( (lv_cfCode_5_0= ruleCALLFORWARDING ) ) (otherlv_6= 'Destination' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'ServiceDelay' otherlv_10= ':' ( (lv_serviceDelay_11_0= RULE_INT ) ) )? )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1275:6: otherlv_3= 'USSDCode' otherlv_4= ':' ( (lv_cfCode_5_0= ruleCALLFORWARDING ) ) (otherlv_6= 'Destination' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= 'ServiceDelay' otherlv_10= ':' ( (lv_serviceDelay_11_0= RULE_INT ) ) )?
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleParameterUssd2779); 

                        	newLeafNode(otherlv_3, grammarAccess.getParameterUssdAccess().getUSSDCodeKeyword_1_0_0());
                        
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleParameterUssd2791); 

                        	newLeafNode(otherlv_4, grammarAccess.getParameterUssdAccess().getColonKeyword_1_0_1());
                        
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1283:1: ( (lv_cfCode_5_0= ruleCALLFORWARDING ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1284:1: (lv_cfCode_5_0= ruleCALLFORWARDING )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1284:1: (lv_cfCode_5_0= ruleCALLFORWARDING )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1285:3: lv_cfCode_5_0= ruleCALLFORWARDING
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterUssdAccess().getCfCodeCALLFORWARDINGEnumRuleCall_1_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCALLFORWARDING_in_ruleParameterUssd2812);
                    lv_cfCode_5_0=ruleCALLFORWARDING();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterUssdRule());
                    	        }
                           		set(
                           			current, 
                           			"cfCode",
                            		lv_cfCode_5_0, 
                            		"CALLFORWARDING");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1301:2: (otherlv_6= 'Destination' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==33) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1301:4: otherlv_6= 'Destination' otherlv_7= ':' ( (otherlv_8= RULE_ID ) )
                            {
                            otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleParameterUssd2825); 

                                	newLeafNode(otherlv_6, grammarAccess.getParameterUssdAccess().getDestinationKeyword_1_0_3_0());
                                
                            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleParameterUssd2837); 

                                	newLeafNode(otherlv_7, grammarAccess.getParameterUssdAccess().getColonKeyword_1_0_3_1());
                                
                            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1309:1: ( (otherlv_8= RULE_ID ) )
                            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1310:1: (otherlv_8= RULE_ID )
                            {
                            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1310:1: (otherlv_8= RULE_ID )
                            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1311:3: otherlv_8= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getParameterUssdRule());
                            	        }
                                    
                            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterUssd2857); 

                            		newLeafNode(otherlv_8, grammarAccess.getParameterUssdAccess().getDestinationUECrossReference_1_0_3_2_0()); 
                            	

                            }


                            }


                            }
                            break;

                    }

                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1322:4: (otherlv_9= 'ServiceDelay' otherlv_10= ':' ( (lv_serviceDelay_11_0= RULE_INT ) ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==34) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1322:6: otherlv_9= 'ServiceDelay' otherlv_10= ':' ( (lv_serviceDelay_11_0= RULE_INT ) )
                            {
                            otherlv_9=(Token)match(input,34,FOLLOW_34_in_ruleParameterUssd2872); 

                                	newLeafNode(otherlv_9, grammarAccess.getParameterUssdAccess().getServiceDelayKeyword_1_0_4_0());
                                
                            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleParameterUssd2884); 

                                	newLeafNode(otherlv_10, grammarAccess.getParameterUssdAccess().getColonKeyword_1_0_4_1());
                                
                            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1330:1: ( (lv_serviceDelay_11_0= RULE_INT ) )
                            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1331:1: (lv_serviceDelay_11_0= RULE_INT )
                            {
                            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1331:1: (lv_serviceDelay_11_0= RULE_INT )
                            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1332:3: lv_serviceDelay_11_0= RULE_INT
                            {
                            lv_serviceDelay_11_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleParameterUssd2901); 

                            			newLeafNode(lv_serviceDelay_11_0, grammarAccess.getParameterUssdAccess().getServiceDelayINTTerminalRuleCall_1_0_4_2_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getParameterUssdRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"serviceDelay",
                                    		lv_serviceDelay_11_0, 
                                    		"INT");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1349:6: (otherlv_12= 'USSDCode' otherlv_13= ':' ( (lv_barringCode_14_0= ruleBARRING ) ) (otherlv_15= 'Code' otherlv_16= ':' ( (lv_code_17_0= RULE_INT ) ) )? )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1349:6: (otherlv_12= 'USSDCode' otherlv_13= ':' ( (lv_barringCode_14_0= ruleBARRING ) ) (otherlv_15= 'Code' otherlv_16= ':' ( (lv_code_17_0= RULE_INT ) ) )? )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1349:8: otherlv_12= 'USSDCode' otherlv_13= ':' ( (lv_barringCode_14_0= ruleBARRING ) ) (otherlv_15= 'Code' otherlv_16= ':' ( (lv_code_17_0= RULE_INT ) ) )?
                    {
                    otherlv_12=(Token)match(input,32,FOLLOW_32_in_ruleParameterUssd2928); 

                        	newLeafNode(otherlv_12, grammarAccess.getParameterUssdAccess().getUSSDCodeKeyword_1_1_0());
                        
                    otherlv_13=(Token)match(input,14,FOLLOW_14_in_ruleParameterUssd2940); 

                        	newLeafNode(otherlv_13, grammarAccess.getParameterUssdAccess().getColonKeyword_1_1_1());
                        
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1357:1: ( (lv_barringCode_14_0= ruleBARRING ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1358:1: (lv_barringCode_14_0= ruleBARRING )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1358:1: (lv_barringCode_14_0= ruleBARRING )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1359:3: lv_barringCode_14_0= ruleBARRING
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterUssdAccess().getBarringCodeBARRINGEnumRuleCall_1_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBARRING_in_ruleParameterUssd2961);
                    lv_barringCode_14_0=ruleBARRING();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterUssdRule());
                    	        }
                           		set(
                           			current, 
                           			"barringCode",
                            		lv_barringCode_14_0, 
                            		"BARRING");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1375:2: (otherlv_15= 'Code' otherlv_16= ':' ( (lv_code_17_0= RULE_INT ) ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==35) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1375:4: otherlv_15= 'Code' otherlv_16= ':' ( (lv_code_17_0= RULE_INT ) )
                            {
                            otherlv_15=(Token)match(input,35,FOLLOW_35_in_ruleParameterUssd2974); 

                                	newLeafNode(otherlv_15, grammarAccess.getParameterUssdAccess().getCodeKeyword_1_1_3_0());
                                
                            otherlv_16=(Token)match(input,14,FOLLOW_14_in_ruleParameterUssd2986); 

                                	newLeafNode(otherlv_16, grammarAccess.getParameterUssdAccess().getColonKeyword_1_1_3_1());
                                
                            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1383:1: ( (lv_code_17_0= RULE_INT ) )
                            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1384:1: (lv_code_17_0= RULE_INT )
                            {
                            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1384:1: (lv_code_17_0= RULE_INT )
                            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1385:3: lv_code_17_0= RULE_INT
                            {
                            lv_code_17_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleParameterUssd3003); 

                            			newLeafNode(lv_code_17_0, grammarAccess.getParameterUssdAccess().getCodeINTTerminalRuleCall_1_1_3_2_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getParameterUssdRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"code",
                                    		lv_code_17_0, 
                                    		"INT");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1402:6: (otherlv_18= 'USSDCode' otherlv_19= ':' ( (lv_liCode_20_0= ruleLINEIDENTIFICATION ) ) )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1402:6: (otherlv_18= 'USSDCode' otherlv_19= ':' ( (lv_liCode_20_0= ruleLINEIDENTIFICATION ) ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1402:8: otherlv_18= 'USSDCode' otherlv_19= ':' ( (lv_liCode_20_0= ruleLINEIDENTIFICATION ) )
                    {
                    otherlv_18=(Token)match(input,32,FOLLOW_32_in_ruleParameterUssd3030); 

                        	newLeafNode(otherlv_18, grammarAccess.getParameterUssdAccess().getUSSDCodeKeyword_1_2_0());
                        
                    otherlv_19=(Token)match(input,14,FOLLOW_14_in_ruleParameterUssd3042); 

                        	newLeafNode(otherlv_19, grammarAccess.getParameterUssdAccess().getColonKeyword_1_2_1());
                        
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1410:1: ( (lv_liCode_20_0= ruleLINEIDENTIFICATION ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1411:1: (lv_liCode_20_0= ruleLINEIDENTIFICATION )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1411:1: (lv_liCode_20_0= ruleLINEIDENTIFICATION )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1412:3: lv_liCode_20_0= ruleLINEIDENTIFICATION
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterUssdAccess().getLiCodeLINEIDENTIFICATIONEnumRuleCall_1_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLINEIDENTIFICATION_in_ruleParameterUssd3063);
                    lv_liCode_20_0=ruleLINEIDENTIFICATION();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterUssdRule());
                    	        }
                           		set(
                           			current, 
                           			"liCode",
                            		lv_liCode_20_0, 
                            		"LINEIDENTIFICATION");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1428:4: ( (lv_ussdregistration_21_0= ruleUSSDREGISTRATION ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=45 && LA18_0<=46)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1429:1: (lv_ussdregistration_21_0= ruleUSSDREGISTRATION )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1429:1: (lv_ussdregistration_21_0= ruleUSSDREGISTRATION )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1430:3: lv_ussdregistration_21_0= ruleUSSDREGISTRATION
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterUssdAccess().getUssdregistrationUSSDREGISTRATIONEnumRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUSSDREGISTRATION_in_ruleParameterUssd3086);
                    lv_ussdregistration_21_0=ruleUSSDREGISTRATION();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterUssdRule());
                    	        }
                           		set(
                           			current, 
                           			"ussdregistration",
                            		lv_ussdregistration_21_0, 
                            		"USSDREGISTRATION");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterUssd"


    // $ANTLR start "entryRuleParameterSms"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1454:1: entryRuleParameterSms returns [EObject current=null] : iv_ruleParameterSms= ruleParameterSms EOF ;
    public final EObject entryRuleParameterSms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterSms = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1455:2: (iv_ruleParameterSms= ruleParameterSms EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1456:2: iv_ruleParameterSms= ruleParameterSms EOF
            {
             newCompositeNode(grammarAccess.getParameterSmsRule()); 
            pushFollow(FOLLOW_ruleParameterSms_in_entryRuleParameterSms3123);
            iv_ruleParameterSms=ruleParameterSms();

            state._fsp--;

             current =iv_ruleParameterSms; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterSms3133); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterSms"


    // $ANTLR start "ruleParameterSms"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1463:1: ruleParameterSms returns [EObject current=null] : ( (otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= 'To' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ( (lv_message_6_0= RULE_STRING ) ) ) ;
    public final EObject ruleParameterSms() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_message_6_0=null;

         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1466:28: ( ( (otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= 'To' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ( (lv_message_6_0= RULE_STRING ) ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1467:1: ( (otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= 'To' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ( (lv_message_6_0= RULE_STRING ) ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1467:1: ( (otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= 'To' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ( (lv_message_6_0= RULE_STRING ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1467:2: (otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= 'To' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ( (lv_message_6_0= RULE_STRING ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1467:2: (otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1467:4: otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleParameterSms3171); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterSmsAccess().getFromKeyword_0_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleParameterSms3183); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterSmsAccess().getColonKeyword_0_1());
                
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1475:1: ( (otherlv_2= RULE_ID ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1476:1: (otherlv_2= RULE_ID )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1476:1: (otherlv_2= RULE_ID )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1477:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterSmsRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterSms3203); 

            		newLeafNode(otherlv_2, grammarAccess.getParameterSmsAccess().getFromUECrossReference_0_2_0()); 
            	

            }


            }


            }

            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1488:3: (otherlv_3= 'To' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1488:5: otherlv_3= 'To' otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleParameterSms3217); 

                	newLeafNode(otherlv_3, grammarAccess.getParameterSmsAccess().getToKeyword_1_0());
                
            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleParameterSms3229); 

                	newLeafNode(otherlv_4, grammarAccess.getParameterSmsAccess().getColonKeyword_1_1());
                
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1496:1: ( (otherlv_5= RULE_ID ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1497:1: (otherlv_5= RULE_ID )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1497:1: (otherlv_5= RULE_ID )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1498:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterSmsRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterSms3249); 

            		newLeafNode(otherlv_5, grammarAccess.getParameterSmsAccess().getToUECrossReference_1_2_0()); 
            	

            }


            }


            }

            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1509:3: ( (lv_message_6_0= RULE_STRING ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1510:1: (lv_message_6_0= RULE_STRING )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1510:1: (lv_message_6_0= RULE_STRING )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1511:3: lv_message_6_0= RULE_STRING
            {
            lv_message_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleParameterSms3267); 

            			newLeafNode(lv_message_6_0, grammarAccess.getParameterSmsAccess().getMessageSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterSmsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"message",
                    		lv_message_6_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterSms"


    // $ANTLR start "entryRuleParameterData"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1535:1: entryRuleParameterData returns [EObject current=null] : iv_ruleParameterData= ruleParameterData EOF ;
    public final EObject entryRuleParameterData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterData = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1536:2: (iv_ruleParameterData= ruleParameterData EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1537:2: iv_ruleParameterData= ruleParameterData EOF
            {
             newCompositeNode(grammarAccess.getParameterDataRule()); 
            pushFollow(FOLLOW_ruleParameterData_in_entryRuleParameterData3308);
            iv_ruleParameterData=ruleParameterData();

            state._fsp--;

             current =iv_ruleParameterData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterData3318); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterData"


    // $ANTLR start "ruleParameterData"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1544:1: ruleParameterData returns [EObject current=null] : ( (otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= 'url' otherlv_4= ':' ( (lv_url_5_0= RULE_STRING ) ) )? (otherlv_6= 'To' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'data' otherlv_10= ':' ( (lv_data_11_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleParameterData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_url_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_data_11_0=null;

         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1547:28: ( ( (otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= 'url' otherlv_4= ':' ( (lv_url_5_0= RULE_STRING ) ) )? (otherlv_6= 'To' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'data' otherlv_10= ':' ( (lv_data_11_0= RULE_STRING ) ) )? ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1548:1: ( (otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= 'url' otherlv_4= ':' ( (lv_url_5_0= RULE_STRING ) ) )? (otherlv_6= 'To' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'data' otherlv_10= ':' ( (lv_data_11_0= RULE_STRING ) ) )? )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1548:1: ( (otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= 'url' otherlv_4= ':' ( (lv_url_5_0= RULE_STRING ) ) )? (otherlv_6= 'To' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'data' otherlv_10= ':' ( (lv_data_11_0= RULE_STRING ) ) )? )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1548:2: (otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) (otherlv_3= 'url' otherlv_4= ':' ( (lv_url_5_0= RULE_STRING ) ) )? (otherlv_6= 'To' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'data' otherlv_10= ':' ( (lv_data_11_0= RULE_STRING ) ) )?
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1548:2: (otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1548:4: otherlv_0= 'From' otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleParameterData3356); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterDataAccess().getFromKeyword_0_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleParameterData3368); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterDataAccess().getColonKeyword_0_1());
                
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1556:1: ( (otherlv_2= RULE_ID ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1557:1: (otherlv_2= RULE_ID )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1557:1: (otherlv_2= RULE_ID )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1558:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterDataRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterData3388); 

            		newLeafNode(otherlv_2, grammarAccess.getParameterDataAccess().getFromUECrossReference_0_2_0()); 
            	

            }


            }


            }

            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1569:3: (otherlv_3= 'url' otherlv_4= ':' ( (lv_url_5_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1569:5: otherlv_3= 'url' otherlv_4= ':' ( (lv_url_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleParameterData3402); 

                        	newLeafNode(otherlv_3, grammarAccess.getParameterDataAccess().getUrlKeyword_1_0());
                        
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleParameterData3414); 

                        	newLeafNode(otherlv_4, grammarAccess.getParameterDataAccess().getColonKeyword_1_1());
                        
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1577:1: ( (lv_url_5_0= RULE_STRING ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1578:1: (lv_url_5_0= RULE_STRING )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1578:1: (lv_url_5_0= RULE_STRING )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1579:3: lv_url_5_0= RULE_STRING
                    {
                    lv_url_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleParameterData3431); 

                    			newLeafNode(lv_url_5_0, grammarAccess.getParameterDataAccess().getUrlSTRINGTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterDataRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"url",
                            		lv_url_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1595:4: (otherlv_6= 'To' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'data' otherlv_10= ':' ( (lv_data_11_0= RULE_STRING ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1595:6: otherlv_6= 'To' otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'data' otherlv_10= ':' ( (lv_data_11_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleParameterData3451); 

                        	newLeafNode(otherlv_6, grammarAccess.getParameterDataAccess().getToKeyword_2_0());
                        
                    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleParameterData3463); 

                        	newLeafNode(otherlv_7, grammarAccess.getParameterDataAccess().getColonKeyword_2_1());
                        
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1603:1: ( (otherlv_8= RULE_ID ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1604:1: (otherlv_8= RULE_ID )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1604:1: (otherlv_8= RULE_ID )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1605:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterDataRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterData3483); 

                    		newLeafNode(otherlv_8, grammarAccess.getParameterDataAccess().getToUECrossReference_2_2_0()); 
                    	

                    }


                    }

                    otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleParameterData3495); 

                        	newLeafNode(otherlv_9, grammarAccess.getParameterDataAccess().getDataKeyword_2_3());
                        
                    otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleParameterData3507); 

                        	newLeafNode(otherlv_10, grammarAccess.getParameterDataAccess().getColonKeyword_2_4());
                        
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1624:1: ( (lv_data_11_0= RULE_STRING ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1625:1: (lv_data_11_0= RULE_STRING )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1625:1: (lv_data_11_0= RULE_STRING )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1626:3: lv_data_11_0= RULE_STRING
                    {
                    lv_data_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleParameterData3524); 

                    			newLeafNode(lv_data_11_0, grammarAccess.getParameterDataAccess().getDataSTRINGTerminalRuleCall_2_5_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterDataRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"data",
                            		lv_data_11_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterData"


    // $ANTLR start "entryRuleParameterMixer"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1650:1: entryRuleParameterMixer returns [EObject current=null] : iv_ruleParameterMixer= ruleParameterMixer EOF ;
    public final EObject entryRuleParameterMixer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterMixer = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1651:2: (iv_ruleParameterMixer= ruleParameterMixer EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1652:2: iv_ruleParameterMixer= ruleParameterMixer EOF
            {
             newCompositeNode(grammarAccess.getParameterMixerRule()); 
            pushFollow(FOLLOW_ruleParameterMixer_in_entryRuleParameterMixer3567);
            iv_ruleParameterMixer=ruleParameterMixer();

            state._fsp--;

             current =iv_ruleParameterMixer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterMixer3577); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterMixer"


    // $ANTLR start "ruleParameterMixer"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1659:1: ruleParameterMixer returns [EObject current=null] : ( ( ( (lv_mixer_0_0= ruleMIXER ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) | ( (lv_option_3_0= ruleMIXEROPTIONS ) ) ) ;
    public final EObject ruleParameterMixer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Enumerator lv_mixer_0_0 = null;

        Enumerator lv_option_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1662:28: ( ( ( ( (lv_mixer_0_0= ruleMIXER ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) | ( (lv_option_3_0= ruleMIXEROPTIONS ) ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1663:1: ( ( ( (lv_mixer_0_0= ruleMIXER ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) | ( (lv_option_3_0= ruleMIXEROPTIONS ) ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1663:1: ( ( ( (lv_mixer_0_0= ruleMIXER ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) ) | ( (lv_option_3_0= ruleMIXEROPTIONS ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=39 && LA21_0<=44)) ) {
                alt21=1;
            }
            else if ( (LA21_0==38) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1663:2: ( ( (lv_mixer_0_0= ruleMIXER ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1663:2: ( ( (lv_mixer_0_0= ruleMIXER ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1663:3: ( (lv_mixer_0_0= ruleMIXER ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_INT ) )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1663:3: ( (lv_mixer_0_0= ruleMIXER ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1664:1: (lv_mixer_0_0= ruleMIXER )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1664:1: (lv_mixer_0_0= ruleMIXER )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1665:3: lv_mixer_0_0= ruleMIXER
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterMixerAccess().getMixerMIXEREnumRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMIXER_in_ruleParameterMixer3624);
                    lv_mixer_0_0=ruleMIXER();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterMixerRule());
                    	        }
                           		set(
                           			current, 
                           			"mixer",
                            		lv_mixer_0_0, 
                            		"MIXER");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleParameterMixer3636); 

                        	newLeafNode(otherlv_1, grammarAccess.getParameterMixerAccess().getColonKeyword_0_1());
                        
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1685:1: ( (lv_value_2_0= RULE_INT ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1686:1: (lv_value_2_0= RULE_INT )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1686:1: (lv_value_2_0= RULE_INT )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1687:3: lv_value_2_0= RULE_INT
                    {
                    lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleParameterMixer3653); 

                    			newLeafNode(lv_value_2_0, grammarAccess.getParameterMixerAccess().getValueINTTerminalRuleCall_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterMixerRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1704:6: ( (lv_option_3_0= ruleMIXEROPTIONS ) )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1704:6: ( (lv_option_3_0= ruleMIXEROPTIONS ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1705:1: (lv_option_3_0= ruleMIXEROPTIONS )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1705:1: (lv_option_3_0= ruleMIXEROPTIONS )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1706:3: lv_option_3_0= ruleMIXEROPTIONS
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterMixerAccess().getOptionMIXEROPTIONSEnumRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMIXEROPTIONS_in_ruleParameterMixer3686);
                    lv_option_3_0=ruleMIXEROPTIONS();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterMixerRule());
                    	        }
                           		set(
                           			current, 
                           			"option",
                            		lv_option_3_0, 
                            		"MIXEROPTIONS");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterMixer"


    // $ANTLR start "ruleMIXEROPTIONS"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1732:1: ruleMIXEROPTIONS returns [Enumerator current=null] : (enumLiteral_0= 'Reset' ) ;
    public final Enumerator ruleMIXEROPTIONS() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1734:28: ( (enumLiteral_0= 'Reset' ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1735:1: (enumLiteral_0= 'Reset' )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1735:1: (enumLiteral_0= 'Reset' )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1735:3: enumLiteral_0= 'Reset'
            {
            enumLiteral_0=(Token)match(input,38,FOLLOW_38_in_ruleMIXEROPTIONS3737); 

                    current = grammarAccess.getMIXEROPTIONSAccess().getResetEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getMIXEROPTIONSAccess().getResetEnumLiteralDeclaration()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMIXEROPTIONS"


    // $ANTLR start "ruleMIXER"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1745:1: ruleMIXER returns [Enumerator current=null] : ( (enumLiteral_0= 'P1' ) | (enumLiteral_1= 'P2' ) | (enumLiteral_2= 'p3' ) | (enumLiteral_3= 'p4' ) | (enumLiteral_4= 'p5' ) | (enumLiteral_5= 'p6' ) ) ;
    public final Enumerator ruleMIXER() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1747:28: ( ( (enumLiteral_0= 'P1' ) | (enumLiteral_1= 'P2' ) | (enumLiteral_2= 'p3' ) | (enumLiteral_3= 'p4' ) | (enumLiteral_4= 'p5' ) | (enumLiteral_5= 'p6' ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1748:1: ( (enumLiteral_0= 'P1' ) | (enumLiteral_1= 'P2' ) | (enumLiteral_2= 'p3' ) | (enumLiteral_3= 'p4' ) | (enumLiteral_4= 'p5' ) | (enumLiteral_5= 'p6' ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1748:1: ( (enumLiteral_0= 'P1' ) | (enumLiteral_1= 'P2' ) | (enumLiteral_2= 'p3' ) | (enumLiteral_3= 'p4' ) | (enumLiteral_4= 'p5' ) | (enumLiteral_5= 'p6' ) )
            int alt22=6;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt22=1;
                }
                break;
            case 40:
                {
                alt22=2;
                }
                break;
            case 41:
                {
                alt22=3;
                }
                break;
            case 42:
                {
                alt22=4;
                }
                break;
            case 43:
                {
                alt22=5;
                }
                break;
            case 44:
                {
                alt22=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1748:2: (enumLiteral_0= 'P1' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1748:2: (enumLiteral_0= 'P1' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1748:4: enumLiteral_0= 'P1'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_39_in_ruleMIXER3781); 

                            current = grammarAccess.getMIXERAccess().getP1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMIXERAccess().getP1EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1754:6: (enumLiteral_1= 'P2' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1754:6: (enumLiteral_1= 'P2' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1754:8: enumLiteral_1= 'P2'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_40_in_ruleMIXER3798); 

                            current = grammarAccess.getMIXERAccess().getP2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMIXERAccess().getP2EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1760:6: (enumLiteral_2= 'p3' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1760:6: (enumLiteral_2= 'p3' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1760:8: enumLiteral_2= 'p3'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_41_in_ruleMIXER3815); 

                            current = grammarAccess.getMIXERAccess().getP3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMIXERAccess().getP3EnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1766:6: (enumLiteral_3= 'p4' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1766:6: (enumLiteral_3= 'p4' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1766:8: enumLiteral_3= 'p4'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_42_in_ruleMIXER3832); 

                            current = grammarAccess.getMIXERAccess().getP4EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getMIXERAccess().getP4EnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1772:6: (enumLiteral_4= 'p5' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1772:6: (enumLiteral_4= 'p5' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1772:8: enumLiteral_4= 'p5'
                    {
                    enumLiteral_4=(Token)match(input,43,FOLLOW_43_in_ruleMIXER3849); 

                            current = grammarAccess.getMIXERAccess().getP5EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getMIXERAccess().getP5EnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1778:6: (enumLiteral_5= 'p6' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1778:6: (enumLiteral_5= 'p6' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1778:8: enumLiteral_5= 'p6'
                    {
                    enumLiteral_5=(Token)match(input,44,FOLLOW_44_in_ruleMIXER3866); 

                            current = grammarAccess.getMIXERAccess().getP6EnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getMIXERAccess().getP6EnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMIXER"


    // $ANTLR start "ruleUSSDREGISTRATION"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1788:1: ruleUSSDREGISTRATION returns [Enumerator current=null] : ( (enumLiteral_0= 'Activate' ) | (enumLiteral_1= 'Deactivate' ) ) ;
    public final Enumerator ruleUSSDREGISTRATION() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1790:28: ( ( (enumLiteral_0= 'Activate' ) | (enumLiteral_1= 'Deactivate' ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1791:1: ( (enumLiteral_0= 'Activate' ) | (enumLiteral_1= 'Deactivate' ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1791:1: ( (enumLiteral_0= 'Activate' ) | (enumLiteral_1= 'Deactivate' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==45) ) {
                alt23=1;
            }
            else if ( (LA23_0==46) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1791:2: (enumLiteral_0= 'Activate' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1791:2: (enumLiteral_0= 'Activate' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1791:4: enumLiteral_0= 'Activate'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_45_in_ruleUSSDREGISTRATION3911); 

                            current = grammarAccess.getUSSDREGISTRATIONAccess().getActivateEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUSSDREGISTRATIONAccess().getActivateEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1797:6: (enumLiteral_1= 'Deactivate' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1797:6: (enumLiteral_1= 'Deactivate' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1797:8: enumLiteral_1= 'Deactivate'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_46_in_ruleUSSDREGISTRATION3928); 

                            current = grammarAccess.getUSSDREGISTRATIONAccess().getDeactivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getUSSDREGISTRATIONAccess().getDeactivateEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUSSDREGISTRATION"


    // $ANTLR start "ruleCALLFORWARDING"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1807:1: ruleCALLFORWARDING returns [Enumerator current=null] : ( (enumLiteral_0= 'CFU' ) | (enumLiteral_1= 'CFB' ) | (enumLiteral_2= 'CFNA' ) | (enumLiteral_3= 'CFNR' ) | (enumLiteral_4= 'ACD' ) ) ;
    public final Enumerator ruleCALLFORWARDING() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1809:28: ( ( (enumLiteral_0= 'CFU' ) | (enumLiteral_1= 'CFB' ) | (enumLiteral_2= 'CFNA' ) | (enumLiteral_3= 'CFNR' ) | (enumLiteral_4= 'ACD' ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1810:1: ( (enumLiteral_0= 'CFU' ) | (enumLiteral_1= 'CFB' ) | (enumLiteral_2= 'CFNA' ) | (enumLiteral_3= 'CFNR' ) | (enumLiteral_4= 'ACD' ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1810:1: ( (enumLiteral_0= 'CFU' ) | (enumLiteral_1= 'CFB' ) | (enumLiteral_2= 'CFNA' ) | (enumLiteral_3= 'CFNR' ) | (enumLiteral_4= 'ACD' ) )
            int alt24=5;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt24=1;
                }
                break;
            case 48:
                {
                alt24=2;
                }
                break;
            case 49:
                {
                alt24=3;
                }
                break;
            case 50:
                {
                alt24=4;
                }
                break;
            case 51:
                {
                alt24=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1810:2: (enumLiteral_0= 'CFU' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1810:2: (enumLiteral_0= 'CFU' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1810:4: enumLiteral_0= 'CFU'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_47_in_ruleCALLFORWARDING3973); 

                            current = grammarAccess.getCALLFORWARDINGAccess().getCfuEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCALLFORWARDINGAccess().getCfuEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1816:6: (enumLiteral_1= 'CFB' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1816:6: (enumLiteral_1= 'CFB' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1816:8: enumLiteral_1= 'CFB'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_48_in_ruleCALLFORWARDING3990); 

                            current = grammarAccess.getCALLFORWARDINGAccess().getCfbEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCALLFORWARDINGAccess().getCfbEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1822:6: (enumLiteral_2= 'CFNA' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1822:6: (enumLiteral_2= 'CFNA' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1822:8: enumLiteral_2= 'CFNA'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_49_in_ruleCALLFORWARDING4007); 

                            current = grammarAccess.getCALLFORWARDINGAccess().getCfnaEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCALLFORWARDINGAccess().getCfnaEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1828:6: (enumLiteral_3= 'CFNR' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1828:6: (enumLiteral_3= 'CFNR' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1828:8: enumLiteral_3= 'CFNR'
                    {
                    enumLiteral_3=(Token)match(input,50,FOLLOW_50_in_ruleCALLFORWARDING4024); 

                            current = grammarAccess.getCALLFORWARDINGAccess().getCfnrEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getCALLFORWARDINGAccess().getCfnrEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1834:6: (enumLiteral_4= 'ACD' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1834:6: (enumLiteral_4= 'ACD' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1834:8: enumLiteral_4= 'ACD'
                    {
                    enumLiteral_4=(Token)match(input,51,FOLLOW_51_in_ruleCALLFORWARDING4041); 

                            current = grammarAccess.getCALLFORWARDINGAccess().getAcdEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getCALLFORWARDINGAccess().getAcdEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCALLFORWARDING"


    // $ANTLR start "ruleBARRING"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1844:1: ruleBARRING returns [Enumerator current=null] : ( (enumLiteral_0= 'AllOutgoingCalls' ) | (enumLiteral_1= 'AllIncomingCalls' ) | (enumLiteral_2= 'AllOutgoingCallsExHome' ) | (enumLiteral_3= 'AllIncommingCallsRoaming' ) ) ;
    public final Enumerator ruleBARRING() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1846:28: ( ( (enumLiteral_0= 'AllOutgoingCalls' ) | (enumLiteral_1= 'AllIncomingCalls' ) | (enumLiteral_2= 'AllOutgoingCallsExHome' ) | (enumLiteral_3= 'AllIncommingCallsRoaming' ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1847:1: ( (enumLiteral_0= 'AllOutgoingCalls' ) | (enumLiteral_1= 'AllIncomingCalls' ) | (enumLiteral_2= 'AllOutgoingCallsExHome' ) | (enumLiteral_3= 'AllIncommingCallsRoaming' ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1847:1: ( (enumLiteral_0= 'AllOutgoingCalls' ) | (enumLiteral_1= 'AllIncomingCalls' ) | (enumLiteral_2= 'AllOutgoingCallsExHome' ) | (enumLiteral_3= 'AllIncommingCallsRoaming' ) )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt25=1;
                }
                break;
            case 53:
                {
                alt25=2;
                }
                break;
            case 54:
                {
                alt25=3;
                }
                break;
            case 55:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1847:2: (enumLiteral_0= 'AllOutgoingCalls' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1847:2: (enumLiteral_0= 'AllOutgoingCalls' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1847:4: enumLiteral_0= 'AllOutgoingCalls'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_52_in_ruleBARRING4086); 

                            current = grammarAccess.getBARRINGAccess().getAllOutgoingCallsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBARRINGAccess().getAllOutgoingCallsEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1853:6: (enumLiteral_1= 'AllIncomingCalls' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1853:6: (enumLiteral_1= 'AllIncomingCalls' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1853:8: enumLiteral_1= 'AllIncomingCalls'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_53_in_ruleBARRING4103); 

                            current = grammarAccess.getBARRINGAccess().getAllIncommingCallsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBARRINGAccess().getAllIncommingCallsEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1859:6: (enumLiteral_2= 'AllOutgoingCallsExHome' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1859:6: (enumLiteral_2= 'AllOutgoingCallsExHome' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1859:8: enumLiteral_2= 'AllOutgoingCallsExHome'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_54_in_ruleBARRING4120); 

                            current = grammarAccess.getBARRINGAccess().getAllOutgoingCallsExHomeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getBARRINGAccess().getAllOutgoingCallsExHomeEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1865:6: (enumLiteral_3= 'AllIncommingCallsRoaming' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1865:6: (enumLiteral_3= 'AllIncommingCallsRoaming' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1865:8: enumLiteral_3= 'AllIncommingCallsRoaming'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_55_in_ruleBARRING4137); 

                            current = grammarAccess.getBARRINGAccess().getAllIncommingCallsRoamingEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getBARRINGAccess().getAllIncommingCallsRoamingEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBARRING"


    // $ANTLR start "ruleLINEIDENTIFICATION"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1875:1: ruleLINEIDENTIFICATION returns [Enumerator current=null] : ( (enumLiteral_0= 'CLIP' ) | (enumLiteral_1= 'CLIR' ) | (enumLiteral_2= 'COLP' ) | (enumLiteral_3= 'COLR' ) ) ;
    public final Enumerator ruleLINEIDENTIFICATION() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1877:28: ( ( (enumLiteral_0= 'CLIP' ) | (enumLiteral_1= 'CLIR' ) | (enumLiteral_2= 'COLP' ) | (enumLiteral_3= 'COLR' ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1878:1: ( (enumLiteral_0= 'CLIP' ) | (enumLiteral_1= 'CLIR' ) | (enumLiteral_2= 'COLP' ) | (enumLiteral_3= 'COLR' ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1878:1: ( (enumLiteral_0= 'CLIP' ) | (enumLiteral_1= 'CLIR' ) | (enumLiteral_2= 'COLP' ) | (enumLiteral_3= 'COLR' ) )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt26=1;
                }
                break;
            case 57:
                {
                alt26=2;
                }
                break;
            case 58:
                {
                alt26=3;
                }
                break;
            case 59:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1878:2: (enumLiteral_0= 'CLIP' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1878:2: (enumLiteral_0= 'CLIP' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1878:4: enumLiteral_0= 'CLIP'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_56_in_ruleLINEIDENTIFICATION4182); 

                            current = grammarAccess.getLINEIDENTIFICATIONAccess().getClipEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLINEIDENTIFICATIONAccess().getClipEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1884:6: (enumLiteral_1= 'CLIR' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1884:6: (enumLiteral_1= 'CLIR' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1884:8: enumLiteral_1= 'CLIR'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_57_in_ruleLINEIDENTIFICATION4199); 

                            current = grammarAccess.getLINEIDENTIFICATIONAccess().getClirEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLINEIDENTIFICATIONAccess().getClirEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1890:6: (enumLiteral_2= 'COLP' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1890:6: (enumLiteral_2= 'COLP' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1890:8: enumLiteral_2= 'COLP'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_58_in_ruleLINEIDENTIFICATION4216); 

                            current = grammarAccess.getLINEIDENTIFICATIONAccess().getColpEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLINEIDENTIFICATIONAccess().getColpEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1896:6: (enumLiteral_3= 'COLR' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1896:6: (enumLiteral_3= 'COLR' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1896:8: enumLiteral_3= 'COLR'
                    {
                    enumLiteral_3=(Token)match(input,59,FOLLOW_59_in_ruleLINEIDENTIFICATION4233); 

                            current = grammarAccess.getLINEIDENTIFICATIONAccess().getColrEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getLINEIDENTIFICATIONAccess().getColrEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLINEIDENTIFICATION"


    // $ANTLR start "ruleANSWERRESPONSE"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1906:1: ruleANSWERRESPONSE returns [Enumerator current=null] : ( (enumLiteral_0= 'Listening' ) | (enumLiteral_1= 'OffHook' ) | (enumLiteral_2= 'HangUp' ) ) ;
    public final Enumerator ruleANSWERRESPONSE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1908:28: ( ( (enumLiteral_0= 'Listening' ) | (enumLiteral_1= 'OffHook' ) | (enumLiteral_2= 'HangUp' ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1909:1: ( (enumLiteral_0= 'Listening' ) | (enumLiteral_1= 'OffHook' ) | (enumLiteral_2= 'HangUp' ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1909:1: ( (enumLiteral_0= 'Listening' ) | (enumLiteral_1= 'OffHook' ) | (enumLiteral_2= 'HangUp' ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt27=1;
                }
                break;
            case 61:
                {
                alt27=2;
                }
                break;
            case 62:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1909:2: (enumLiteral_0= 'Listening' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1909:2: (enumLiteral_0= 'Listening' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1909:4: enumLiteral_0= 'Listening'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_60_in_ruleANSWERRESPONSE4278); 

                            current = grammarAccess.getANSWERRESPONSEAccess().getListeningEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getANSWERRESPONSEAccess().getListeningEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1915:6: (enumLiteral_1= 'OffHook' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1915:6: (enumLiteral_1= 'OffHook' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1915:8: enumLiteral_1= 'OffHook'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_61_in_ruleANSWERRESPONSE4295); 

                            current = grammarAccess.getANSWERRESPONSEAccess().getOffhookEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getANSWERRESPONSEAccess().getOffhookEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1921:6: (enumLiteral_2= 'HangUp' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1921:6: (enumLiteral_2= 'HangUp' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1921:8: enumLiteral_2= 'HangUp'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_62_in_ruleANSWERRESPONSE4312); 

                            current = grammarAccess.getANSWERRESPONSEAccess().getHangupEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getANSWERRESPONSEAccess().getHangupEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleANSWERRESPONSE"


    // $ANTLR start "ruleCALLRESPONSE"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1931:1: ruleCALLRESPONSE returns [Enumerator current=null] : ( (enumLiteral_0= 'Listening' ) | (enumLiteral_1= 'HangUp' ) ) ;
    public final Enumerator ruleCALLRESPONSE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1933:28: ( ( (enumLiteral_0= 'Listening' ) | (enumLiteral_1= 'HangUp' ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1934:1: ( (enumLiteral_0= 'Listening' ) | (enumLiteral_1= 'HangUp' ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1934:1: ( (enumLiteral_0= 'Listening' ) | (enumLiteral_1= 'HangUp' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==60) ) {
                alt28=1;
            }
            else if ( (LA28_0==62) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1934:2: (enumLiteral_0= 'Listening' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1934:2: (enumLiteral_0= 'Listening' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1934:4: enumLiteral_0= 'Listening'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_60_in_ruleCALLRESPONSE4357); 

                            current = grammarAccess.getCALLRESPONSEAccess().getListeningEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCALLRESPONSEAccess().getListeningEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1940:6: (enumLiteral_1= 'HangUp' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1940:6: (enumLiteral_1= 'HangUp' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1940:8: enumLiteral_1= 'HangUp'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_62_in_ruleCALLRESPONSE4374); 

                            current = grammarAccess.getCALLRESPONSEAccess().getHangupEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCALLRESPONSEAccess().getHangupEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCALLRESPONSE"


    // $ANTLR start "ruleUEPARAMS"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1950:1: ruleUEPARAMS returns [Enumerator current=null] : ( (enumLiteral_0= 'IMEI' ) | (enumLiteral_1= 'MSISDN' ) ) ;
    public final Enumerator ruleUEPARAMS() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1952:28: ( ( (enumLiteral_0= 'IMEI' ) | (enumLiteral_1= 'MSISDN' ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1953:1: ( (enumLiteral_0= 'IMEI' ) | (enumLiteral_1= 'MSISDN' ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1953:1: ( (enumLiteral_0= 'IMEI' ) | (enumLiteral_1= 'MSISDN' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==63) ) {
                alt29=1;
            }
            else if ( (LA29_0==64) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1953:2: (enumLiteral_0= 'IMEI' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1953:2: (enumLiteral_0= 'IMEI' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1953:4: enumLiteral_0= 'IMEI'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_63_in_ruleUEPARAMS4419); 

                            current = grammarAccess.getUEPARAMSAccess().getImeiEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUEPARAMSAccess().getImeiEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1959:6: (enumLiteral_1= 'MSISDN' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1959:6: (enumLiteral_1= 'MSISDN' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:1959:8: enumLiteral_1= 'MSISDN'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_64_in_ruleUEPARAMS4436); 

                            current = grammarAccess.getUEPARAMSAccess().getMsisdnEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getUEPARAMSAccess().getMsisdnEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUEPARAMS"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDragonX_in_entryRuleDragonX75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDragonX85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUE_in_ruleDragonX131 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_ruleTestCase_in_ruleDragonX153 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleUE_in_entryRuleUE190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUE200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleUE237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUE254 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUE271 = new BitSet(new long[]{0x8000000000010000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleUEMetaObject_in_ruleUE292 = new BitSet(new long[]{0x8000000000012000L,0x0000000000000001L});
    public static final BitSet FOLLOW_13_in_ruleUE305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUEMetaObject_in_entryRuleUEMetaObject341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUEMetaObject351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUEPARAMS_in_ruleUEMetaObject398 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleUEMetaObject410 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleUEValue_in_ruleUEMetaObject431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescriptionObject_in_ruleUEMetaObject460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUEValue_in_entryRuleUEValue496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUEValue507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUEValue547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUEValue573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUEValue599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestCase_in_entryRuleTestCase644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestCase654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleTestCase691 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTestCase708 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTestCase725 = new BitSet(new long[]{0x8000000000030000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleDescriptionObject_in_ruleTestCase746 = new BitSet(new long[]{0x8000000000030000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleProcedure_in_ruleTestCase768 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTestCase780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescriptionObject_in_entryRuleDescriptionObject816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescriptionObject826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleDescriptionObject863 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDescriptionObject875 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDescriptionObject892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedure_in_entryRuleProcedure933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcedure943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleProcedure980 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProcedure992 = new BitSet(new long[]{0x0000000000FC0000L});
    public static final BitSet FOLLOW_ruleAction_in_ruleProcedure1013 = new BitSet(new long[]{0x0000000000FC2000L});
    public static final BitSet FOLLOW_13_in_ruleProcedure1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction1062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAction1117 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAction1142 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleParameterSetCall_in_ruleAction1163 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_19_in_ruleAction1189 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAction1214 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleParameterSetAnswer_in_ruleAction1235 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_20_in_ruleAction1261 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAction1286 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleParameterSetUssd_in_ruleAction1307 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_21_in_ruleAction1333 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAction1358 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleParameterSetSms_in_ruleAction1379 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_22_in_ruleAction1405 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAction1430 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleParameterSetData_in_ruleAction1451 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_23_in_ruleAction1477 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAction1502 = new BitSet(new long[]{0x00001FC000000000L});
    public static final BitSet FOLLOW_ruleParameterSetMixer_in_ruleAction1523 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAction1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterSetCall_in_entryRuleParameterSetCall1573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterSetCall1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterCall_in_ruleParameterSetCall1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterSetAnswer_in_entryRuleParameterSetAnswer1663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterSetAnswer1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterAnswer_in_ruleParameterSetAnswer1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterSetUssd_in_entryRuleParameterSetUssd1753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterSetUssd1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterUssd_in_ruleParameterSetUssd1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterSetSms_in_entryRuleParameterSetSms1843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterSetSms1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterSms_in_ruleParameterSetSms1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterSetData_in_entryRuleParameterSetData1933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterSetData1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterData_in_ruleParameterSetData1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterSetMixer_in_entryRuleParameterSetMixer2023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterSetMixer2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterMixer_in_ruleParameterSetMixer2078 = new BitSet(new long[]{0x00001FC000000002L});
    public static final BitSet FOLLOW_ruleParameterCall_in_entryRuleParameterCall2114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterCall2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleParameterCall2162 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleParameterCall2174 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterCall2194 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleParameterCall2208 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleParameterCall2220 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterCall2240 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_ruleParameterCall2254 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleParameterCall2266 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleParameterCall2283 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleParameterCall2303 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleParameterCall2315 = new BitSet(new long[]{0x5000000000000000L});
    public static final BitSet FOLLOW_ruleCALLRESPONSE_in_ruleParameterCall2336 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleParameterCall2349 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleParameterCall2361 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleParameterCall2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterAnswer_in_entryRuleParameterAnswer2422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterAnswer2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleParameterAnswer2470 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleParameterAnswer2482 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterAnswer2502 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleParameterAnswer2516 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleParameterAnswer2528 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleParameterAnswer2545 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_30_in_ruleParameterAnswer2564 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleParameterAnswer2576 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleParameterAnswer2593 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleParameterAnswer2613 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleParameterAnswer2625 = new BitSet(new long[]{0x7000000000000000L});
    public static final BitSet FOLLOW_ruleANSWERRESPONSE_in_ruleParameterAnswer2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterUssd_in_entryRuleParameterUssd2684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterUssd2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleParameterUssd2732 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleParameterUssd2744 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterUssd2764 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleParameterUssd2779 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleParameterUssd2791 = new BitSet(new long[]{0x000F800000000000L});
    public static final BitSet FOLLOW_ruleCALLFORWARDING_in_ruleParameterUssd2812 = new BitSet(new long[]{0x0000600600000002L});
    public static final BitSet FOLLOW_33_in_ruleParameterUssd2825 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleParameterUssd2837 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterUssd2857 = new BitSet(new long[]{0x0000600400000002L});
    public static final BitSet FOLLOW_34_in_ruleParameterUssd2872 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleParameterUssd2884 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleParameterUssd2901 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_32_in_ruleParameterUssd2928 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleParameterUssd2940 = new BitSet(new long[]{0x00F0000000000000L});
    public static final BitSet FOLLOW_ruleBARRING_in_ruleParameterUssd2961 = new BitSet(new long[]{0x0000600800000002L});
    public static final BitSet FOLLOW_35_in_ruleParameterUssd2974 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleParameterUssd2986 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleParameterUssd3003 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_32_in_ruleParameterUssd3030 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleParameterUssd3042 = new BitSet(new long[]{0x0F00000000000000L});
    public static final BitSet FOLLOW_ruleLINEIDENTIFICATION_in_ruleParameterUssd3063 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_ruleUSSDREGISTRATION_in_ruleParameterUssd3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterSms_in_entryRuleParameterSms3123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterSms3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleParameterSms3171 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleParameterSms3183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterSms3203 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleParameterSms3217 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleParameterSms3229 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterSms3249 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleParameterSms3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterData_in_entryRuleParameterData3308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterData3318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleParameterData3356 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleParameterData3368 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterData3388 = new BitSet(new long[]{0x0000001002000002L});
    public static final BitSet FOLLOW_36_in_ruleParameterData3402 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleParameterData3414 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleParameterData3431 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleParameterData3451 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleParameterData3463 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterData3483 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleParameterData3495 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleParameterData3507 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleParameterData3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterMixer_in_entryRuleParameterMixer3567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterMixer3577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMIXER_in_ruleParameterMixer3624 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleParameterMixer3636 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleParameterMixer3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMIXEROPTIONS_in_ruleParameterMixer3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleMIXEROPTIONS3737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleMIXER3781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleMIXER3798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleMIXER3815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleMIXER3832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleMIXER3849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleMIXER3866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleUSSDREGISTRATION3911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleUSSDREGISTRATION3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleCALLFORWARDING3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleCALLFORWARDING3990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleCALLFORWARDING4007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleCALLFORWARDING4024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleCALLFORWARDING4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleBARRING4086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleBARRING4103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleBARRING4120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleBARRING4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleLINEIDENTIFICATION4182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleLINEIDENTIFICATION4199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleLINEIDENTIFICATION4216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleLINEIDENTIFICATION4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleANSWERRESPONSE4278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleANSWERRESPONSE4295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleANSWERRESPONSE4312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleCALLRESPONSE4357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleCALLRESPONSE4374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleUEPARAMS4419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleUEPARAMS4436 = new BitSet(new long[]{0x0000000000000002L});

}