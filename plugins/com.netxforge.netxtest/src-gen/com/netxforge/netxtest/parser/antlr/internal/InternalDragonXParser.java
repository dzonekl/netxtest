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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'UE'", "'{'", "'}'", "':'", "'TestCase'", "'Description'", "'Test'", "'From'", "'To'", "'CallingTime'", "'ResponseTime'", "'ListeningTime'", "'Data'", "'SMS'", "'UssdCode'", "'ServiceDelay'", "'Listening'", "'OffHook'", "'HangUp'", "'CALL'", "'ANSWER'", "'USSD'", "'DATA'", "'MIXER'", "'IMEI'", "'MSISDN'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
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

                if ( (LA3_0==16||(LA3_0>=35 && LA3_0<=36)) ) {
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

            if ( ((LA4_0>=35 && LA4_0<=36)) ) {
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

                if ( (LA7_0==12||LA7_0==24||(LA7_0>=30 && LA7_0<=34)) ) {
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
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:503:1: ruleAction returns [EObject current=null] : ( ( (lv_actionCode_0_0= ruleACTIONCODE ) ) | (otherlv_1= '{' ( (lv_parameterSet_2_0= ruleParameter ) ) otherlv_3= '}' ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_actionCode_0_0 = null;

        EObject lv_parameterSet_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:506:28: ( ( ( (lv_actionCode_0_0= ruleACTIONCODE ) ) | (otherlv_1= '{' ( (lv_parameterSet_2_0= ruleParameter ) ) otherlv_3= '}' ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:507:1: ( ( (lv_actionCode_0_0= ruleACTIONCODE ) ) | (otherlv_1= '{' ( (lv_parameterSet_2_0= ruleParameter ) ) otherlv_3= '}' ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:507:1: ( ( (lv_actionCode_0_0= ruleACTIONCODE ) ) | (otherlv_1= '{' ( (lv_parameterSet_2_0= ruleParameter ) ) otherlv_3= '}' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24||(LA8_0>=30 && LA8_0<=34)) ) {
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
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:507:2: ( (lv_actionCode_0_0= ruleACTIONCODE ) )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:507:2: ( (lv_actionCode_0_0= ruleACTIONCODE ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:508:1: (lv_actionCode_0_0= ruleACTIONCODE )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:508:1: (lv_actionCode_0_0= ruleACTIONCODE )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:509:3: lv_actionCode_0_0= ruleACTIONCODE
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getActionCodeACTIONCODEEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleACTIONCODE_in_ruleAction1118);
                    lv_actionCode_0_0=ruleACTIONCODE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		set(
                           			current, 
                           			"actionCode",
                            		lv_actionCode_0_0, 
                            		"ACTIONCODE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:526:6: (otherlv_1= '{' ( (lv_parameterSet_2_0= ruleParameter ) ) otherlv_3= '}' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:526:6: (otherlv_1= '{' ( (lv_parameterSet_2_0= ruleParameter ) ) otherlv_3= '}' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:526:8: otherlv_1= '{' ( (lv_parameterSet_2_0= ruleParameter ) ) otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleAction1137); 

                        	newLeafNode(otherlv_1, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:530:1: ( (lv_parameterSet_2_0= ruleParameter ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:531:1: (lv_parameterSet_2_0= ruleParameter )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:531:1: (lv_parameterSet_2_0= ruleParameter )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:532:3: lv_parameterSet_2_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getActionAccess().getParameterSetParameterParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleAction1158);
                    lv_parameterSet_2_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActionRule());
                    	        }
                           		add(
                           			current, 
                           			"parameterSet",
                            		lv_parameterSet_2_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleAction1170); 

                        	newLeafNode(otherlv_3, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_1_2());
                        

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleParameter"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:560:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:561:2: (iv_ruleParameter= ruleParameter EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:562:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1207);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1217); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:569:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= rulePARAM_NAME ) ) ( (lv_type_1_0= ruleParamType ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Enumerator lv_name_0_0 = null;

        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:572:28: ( ( ( (lv_name_0_0= rulePARAM_NAME ) ) ( (lv_type_1_0= ruleParamType ) ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:573:1: ( ( (lv_name_0_0= rulePARAM_NAME ) ) ( (lv_type_1_0= ruleParamType ) ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:573:1: ( ( (lv_name_0_0= rulePARAM_NAME ) ) ( (lv_type_1_0= ruleParamType ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:573:2: ( (lv_name_0_0= rulePARAM_NAME ) ) ( (lv_type_1_0= ruleParamType ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:573:2: ( (lv_name_0_0= rulePARAM_NAME ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:574:1: (lv_name_0_0= rulePARAM_NAME )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:574:1: (lv_name_0_0= rulePARAM_NAME )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:575:3: lv_name_0_0= rulePARAM_NAME
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getNamePARAM_NAMEEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePARAM_NAME_in_ruleParameter1263);
            lv_name_0_0=rulePARAM_NAME();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"PARAM_NAME");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:591:2: ( (lv_type_1_0= ruleParamType ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:592:1: (lv_type_1_0= ruleParamType )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:592:1: (lv_type_1_0= ruleParamType )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:593:3: lv_type_1_0= ruleParamType
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getTypeParamTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleParamType_in_ruleParameter1284);
            lv_type_1_0=ruleParamType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"ParamType");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleParamType"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:617:1: entryRuleParamType returns [EObject current=null] : iv_ruleParamType= ruleParamType EOF ;
    public final EObject entryRuleParamType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamType = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:618:2: (iv_ruleParamType= ruleParamType EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:619:2: iv_ruleParamType= ruleParamType EOF
            {
             newCompositeNode(grammarAccess.getParamTypeRule()); 
            pushFollow(FOLLOW_ruleParamType_in_entryRuleParamType1320);
            iv_ruleParamType=ruleParamType();

            state._fsp--;

             current =iv_ruleParamType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamType1330); 

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
    // $ANTLR end "entryRuleParamType"


    // $ANTLR start "ruleParamType"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:626:1: ruleParamType returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_value_1_0= RULE_INT ) ) | ( (lv_response_2_0= ruleParamResponseType ) ) ) ;
    public final EObject ruleParamType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        EObject lv_response_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:629:28: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_value_1_0= RULE_INT ) ) | ( (lv_response_2_0= ruleParamResponseType ) ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:630:1: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_value_1_0= RULE_INT ) ) | ( (lv_response_2_0= ruleParamResponseType ) ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:630:1: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_value_1_0= RULE_INT ) ) | ( (lv_response_2_0= ruleParamResponseType ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt9=1;
                }
                break;
            case RULE_INT:
                {
                alt9=2;
                }
                break;
            case 27:
            case 28:
            case 29:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:630:2: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:630:2: ( (otherlv_0= RULE_ID ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:631:1: (otherlv_0= RULE_ID )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:631:1: (otherlv_0= RULE_ID )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:632:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getParamTypeRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParamType1375); 

                    		newLeafNode(otherlv_0, grammarAccess.getParamTypeAccess().getUeRefUECrossReference_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:644:6: ( (lv_value_1_0= RULE_INT ) )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:644:6: ( (lv_value_1_0= RULE_INT ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:645:1: (lv_value_1_0= RULE_INT )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:645:1: (lv_value_1_0= RULE_INT )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:646:3: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleParamType1398); 

                    			newLeafNode(lv_value_1_0, grammarAccess.getParamTypeAccess().getValueINTTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParamTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:663:6: ( (lv_response_2_0= ruleParamResponseType ) )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:663:6: ( (lv_response_2_0= ruleParamResponseType ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:664:1: (lv_response_2_0= ruleParamResponseType )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:664:1: (lv_response_2_0= ruleParamResponseType )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:665:3: lv_response_2_0= ruleParamResponseType
                    {
                     
                    	        newCompositeNode(grammarAccess.getParamTypeAccess().getResponseParamResponseTypeParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParamResponseType_in_ruleParamType1430);
                    lv_response_2_0=ruleParamResponseType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParamTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"response",
                            		lv_response_2_0, 
                            		"ParamResponseType");
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
    // $ANTLR end "ruleParamType"


    // $ANTLR start "entryRuleParamResponseType"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:689:1: entryRuleParamResponseType returns [EObject current=null] : iv_ruleParamResponseType= ruleParamResponseType EOF ;
    public final EObject entryRuleParamResponseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamResponseType = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:690:2: (iv_ruleParamResponseType= ruleParamResponseType EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:691:2: iv_ruleParamResponseType= ruleParamResponseType EOF
            {
             newCompositeNode(grammarAccess.getParamResponseTypeRule()); 
            pushFollow(FOLLOW_ruleParamResponseType_in_entryRuleParamResponseType1466);
            iv_ruleParamResponseType=ruleParamResponseType();

            state._fsp--;

             current =iv_ruleParamResponseType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamResponseType1476); 

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
    // $ANTLR end "entryRuleParamResponseType"


    // $ANTLR start "ruleParamResponseType"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:698:1: ruleParamResponseType returns [EObject current=null] : ( (lv_paramResponse_0_0= rulePARAM_RESPONSE ) )+ ;
    public final EObject ruleParamResponseType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_paramResponse_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:701:28: ( ( (lv_paramResponse_0_0= rulePARAM_RESPONSE ) )+ )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:702:1: ( (lv_paramResponse_0_0= rulePARAM_RESPONSE ) )+
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:702:1: ( (lv_paramResponse_0_0= rulePARAM_RESPONSE ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=27 && LA10_0<=29)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:703:1: (lv_paramResponse_0_0= rulePARAM_RESPONSE )
            	    {
            	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:703:1: (lv_paramResponse_0_0= rulePARAM_RESPONSE )
            	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:704:3: lv_paramResponse_0_0= rulePARAM_RESPONSE
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParamResponseTypeAccess().getParamResponsePARAM_RESPONSEEnumRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePARAM_RESPONSE_in_ruleParamResponseType1521);
            	    lv_paramResponse_0_0=rulePARAM_RESPONSE();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParamResponseTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"paramResponse",
            	            		lv_paramResponse_0_0, 
            	            		"PARAM_RESPONSE");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
    // $ANTLR end "ruleParamResponseType"


    // $ANTLR start "rulePARAM_NAME"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:730:1: rulePARAM_NAME returns [Enumerator current=null] : ( (enumLiteral_0= 'From' ) | (enumLiteral_1= 'To' ) | (enumLiteral_2= 'CallingTime' ) | (enumLiteral_3= 'ResponseTime' ) | (enumLiteral_4= 'ListeningTime' ) | (enumLiteral_5= 'Data' ) | (enumLiteral_6= 'SMS' ) | (enumLiteral_7= 'UssdCode' ) | (enumLiteral_8= 'ServiceDelay' ) ) ;
    public final Enumerator rulePARAM_NAME() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;

         enterRule(); 
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:732:28: ( ( (enumLiteral_0= 'From' ) | (enumLiteral_1= 'To' ) | (enumLiteral_2= 'CallingTime' ) | (enumLiteral_3= 'ResponseTime' ) | (enumLiteral_4= 'ListeningTime' ) | (enumLiteral_5= 'Data' ) | (enumLiteral_6= 'SMS' ) | (enumLiteral_7= 'UssdCode' ) | (enumLiteral_8= 'ServiceDelay' ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:733:1: ( (enumLiteral_0= 'From' ) | (enumLiteral_1= 'To' ) | (enumLiteral_2= 'CallingTime' ) | (enumLiteral_3= 'ResponseTime' ) | (enumLiteral_4= 'ListeningTime' ) | (enumLiteral_5= 'Data' ) | (enumLiteral_6= 'SMS' ) | (enumLiteral_7= 'UssdCode' ) | (enumLiteral_8= 'ServiceDelay' ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:733:1: ( (enumLiteral_0= 'From' ) | (enumLiteral_1= 'To' ) | (enumLiteral_2= 'CallingTime' ) | (enumLiteral_3= 'ResponseTime' ) | (enumLiteral_4= 'ListeningTime' ) | (enumLiteral_5= 'Data' ) | (enumLiteral_6= 'SMS' ) | (enumLiteral_7= 'UssdCode' ) | (enumLiteral_8= 'ServiceDelay' ) )
            int alt11=9;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt11=1;
                }
                break;
            case 19:
                {
                alt11=2;
                }
                break;
            case 20:
                {
                alt11=3;
                }
                break;
            case 21:
                {
                alt11=4;
                }
                break;
            case 22:
                {
                alt11=5;
                }
                break;
            case 23:
                {
                alt11=6;
                }
                break;
            case 24:
                {
                alt11=7;
                }
                break;
            case 25:
                {
                alt11=8;
                }
                break;
            case 26:
                {
                alt11=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:733:2: (enumLiteral_0= 'From' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:733:2: (enumLiteral_0= 'From' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:733:4: enumLiteral_0= 'From'
                    {
                    enumLiteral_0=(Token)match(input,18,FOLLOW_18_in_rulePARAM_NAME1573); 

                            current = grammarAccess.getPARAM_NAMEAccess().getFromEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPARAM_NAMEAccess().getFromEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:739:6: (enumLiteral_1= 'To' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:739:6: (enumLiteral_1= 'To' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:739:8: enumLiteral_1= 'To'
                    {
                    enumLiteral_1=(Token)match(input,19,FOLLOW_19_in_rulePARAM_NAME1590); 

                            current = grammarAccess.getPARAM_NAMEAccess().getToEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPARAM_NAMEAccess().getToEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:745:6: (enumLiteral_2= 'CallingTime' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:745:6: (enumLiteral_2= 'CallingTime' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:745:8: enumLiteral_2= 'CallingTime'
                    {
                    enumLiteral_2=(Token)match(input,20,FOLLOW_20_in_rulePARAM_NAME1607); 

                            current = grammarAccess.getPARAM_NAMEAccess().getCallDurationEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPARAM_NAMEAccess().getCallDurationEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:751:6: (enumLiteral_3= 'ResponseTime' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:751:6: (enumLiteral_3= 'ResponseTime' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:751:8: enumLiteral_3= 'ResponseTime'
                    {
                    enumLiteral_3=(Token)match(input,21,FOLLOW_21_in_rulePARAM_NAME1624); 

                            current = grammarAccess.getPARAM_NAMEAccess().getResponseTimeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPARAM_NAMEAccess().getResponseTimeEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:757:6: (enumLiteral_4= 'ListeningTime' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:757:6: (enumLiteral_4= 'ListeningTime' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:757:8: enumLiteral_4= 'ListeningTime'
                    {
                    enumLiteral_4=(Token)match(input,22,FOLLOW_22_in_rulePARAM_NAME1641); 

                            current = grammarAccess.getPARAM_NAMEAccess().getListeningTimeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getPARAM_NAMEAccess().getListeningTimeEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:763:6: (enumLiteral_5= 'Data' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:763:6: (enumLiteral_5= 'Data' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:763:8: enumLiteral_5= 'Data'
                    {
                    enumLiteral_5=(Token)match(input,23,FOLLOW_23_in_rulePARAM_NAME1658); 

                            current = grammarAccess.getPARAM_NAMEAccess().getDataEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getPARAM_NAMEAccess().getDataEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:769:6: (enumLiteral_6= 'SMS' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:769:6: (enumLiteral_6= 'SMS' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:769:8: enumLiteral_6= 'SMS'
                    {
                    enumLiteral_6=(Token)match(input,24,FOLLOW_24_in_rulePARAM_NAME1675); 

                            current = grammarAccess.getPARAM_NAMEAccess().getMessageEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getPARAM_NAMEAccess().getMessageEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:775:6: (enumLiteral_7= 'UssdCode' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:775:6: (enumLiteral_7= 'UssdCode' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:775:8: enumLiteral_7= 'UssdCode'
                    {
                    enumLiteral_7=(Token)match(input,25,FOLLOW_25_in_rulePARAM_NAME1692); 

                            current = grammarAccess.getPARAM_NAMEAccess().getUssdCodeEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getPARAM_NAMEAccess().getUssdCodeEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:781:6: (enumLiteral_8= 'ServiceDelay' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:781:6: (enumLiteral_8= 'ServiceDelay' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:781:8: enumLiteral_8= 'ServiceDelay'
                    {
                    enumLiteral_8=(Token)match(input,26,FOLLOW_26_in_rulePARAM_NAME1709); 

                            current = grammarAccess.getPARAM_NAMEAccess().getServiceDelayEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getPARAM_NAMEAccess().getServiceDelayEnumLiteralDeclaration_8()); 
                        

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
    // $ANTLR end "rulePARAM_NAME"


    // $ANTLR start "rulePARAM_RESPONSE"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:791:1: rulePARAM_RESPONSE returns [Enumerator current=null] : ( (enumLiteral_0= 'Listening' ) | (enumLiteral_1= 'OffHook' ) | (enumLiteral_2= 'HangUp' ) ) ;
    public final Enumerator rulePARAM_RESPONSE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:793:28: ( ( (enumLiteral_0= 'Listening' ) | (enumLiteral_1= 'OffHook' ) | (enumLiteral_2= 'HangUp' ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:794:1: ( (enumLiteral_0= 'Listening' ) | (enumLiteral_1= 'OffHook' ) | (enumLiteral_2= 'HangUp' ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:794:1: ( (enumLiteral_0= 'Listening' ) | (enumLiteral_1= 'OffHook' ) | (enumLiteral_2= 'HangUp' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt12=1;
                }
                break;
            case 28:
                {
                alt12=2;
                }
                break;
            case 29:
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
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:794:2: (enumLiteral_0= 'Listening' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:794:2: (enumLiteral_0= 'Listening' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:794:4: enumLiteral_0= 'Listening'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_27_in_rulePARAM_RESPONSE1754); 

                            current = grammarAccess.getPARAM_RESPONSEAccess().getListiningEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPARAM_RESPONSEAccess().getListiningEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:800:6: (enumLiteral_1= 'OffHook' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:800:6: (enumLiteral_1= 'OffHook' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:800:8: enumLiteral_1= 'OffHook'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_28_in_rulePARAM_RESPONSE1771); 

                            current = grammarAccess.getPARAM_RESPONSEAccess().getOffhookEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPARAM_RESPONSEAccess().getOffhookEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:806:6: (enumLiteral_2= 'HangUp' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:806:6: (enumLiteral_2= 'HangUp' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:806:8: enumLiteral_2= 'HangUp'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_29_in_rulePARAM_RESPONSE1788); 

                            current = grammarAccess.getPARAM_RESPONSEAccess().getHangupEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPARAM_RESPONSEAccess().getHangupEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "rulePARAM_RESPONSE"


    // $ANTLR start "ruleACTIONCODE"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:816:1: ruleACTIONCODE returns [Enumerator current=null] : ( (enumLiteral_0= 'CALL' ) | (enumLiteral_1= 'ANSWER' ) | (enumLiteral_2= 'USSD' ) | (enumLiteral_3= 'SMS' ) | (enumLiteral_4= 'DATA' ) | (enumLiteral_5= 'MIXER' ) ) ;
    public final Enumerator ruleACTIONCODE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:818:28: ( ( (enumLiteral_0= 'CALL' ) | (enumLiteral_1= 'ANSWER' ) | (enumLiteral_2= 'USSD' ) | (enumLiteral_3= 'SMS' ) | (enumLiteral_4= 'DATA' ) | (enumLiteral_5= 'MIXER' ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:819:1: ( (enumLiteral_0= 'CALL' ) | (enumLiteral_1= 'ANSWER' ) | (enumLiteral_2= 'USSD' ) | (enumLiteral_3= 'SMS' ) | (enumLiteral_4= 'DATA' ) | (enumLiteral_5= 'MIXER' ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:819:1: ( (enumLiteral_0= 'CALL' ) | (enumLiteral_1= 'ANSWER' ) | (enumLiteral_2= 'USSD' ) | (enumLiteral_3= 'SMS' ) | (enumLiteral_4= 'DATA' ) | (enumLiteral_5= 'MIXER' ) )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt13=1;
                }
                break;
            case 31:
                {
                alt13=2;
                }
                break;
            case 32:
                {
                alt13=3;
                }
                break;
            case 24:
                {
                alt13=4;
                }
                break;
            case 33:
                {
                alt13=5;
                }
                break;
            case 34:
                {
                alt13=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:819:2: (enumLiteral_0= 'CALL' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:819:2: (enumLiteral_0= 'CALL' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:819:4: enumLiteral_0= 'CALL'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_30_in_ruleACTIONCODE1833); 

                            current = grammarAccess.getACTIONCODEAccess().getCallEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getACTIONCODEAccess().getCallEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:825:6: (enumLiteral_1= 'ANSWER' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:825:6: (enumLiteral_1= 'ANSWER' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:825:8: enumLiteral_1= 'ANSWER'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_31_in_ruleACTIONCODE1850); 

                            current = grammarAccess.getACTIONCODEAccess().getAnswerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getACTIONCODEAccess().getAnswerEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:831:6: (enumLiteral_2= 'USSD' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:831:6: (enumLiteral_2= 'USSD' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:831:8: enumLiteral_2= 'USSD'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_32_in_ruleACTIONCODE1867); 

                            current = grammarAccess.getACTIONCODEAccess().getUssdEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getACTIONCODEAccess().getUssdEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:837:6: (enumLiteral_3= 'SMS' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:837:6: (enumLiteral_3= 'SMS' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:837:8: enumLiteral_3= 'SMS'
                    {
                    enumLiteral_3=(Token)match(input,24,FOLLOW_24_in_ruleACTIONCODE1884); 

                            current = grammarAccess.getACTIONCODEAccess().getSmsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getACTIONCODEAccess().getSmsEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:843:6: (enumLiteral_4= 'DATA' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:843:6: (enumLiteral_4= 'DATA' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:843:8: enumLiteral_4= 'DATA'
                    {
                    enumLiteral_4=(Token)match(input,33,FOLLOW_33_in_ruleACTIONCODE1901); 

                            current = grammarAccess.getACTIONCODEAccess().getDataEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getACTIONCODEAccess().getDataEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:849:6: (enumLiteral_5= 'MIXER' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:849:6: (enumLiteral_5= 'MIXER' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:849:8: enumLiteral_5= 'MIXER'
                    {
                    enumLiteral_5=(Token)match(input,34,FOLLOW_34_in_ruleACTIONCODE1918); 

                            current = grammarAccess.getACTIONCODEAccess().getMixerEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getACTIONCODEAccess().getMixerEnumLiteralDeclaration_5()); 
                        

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
    // $ANTLR end "ruleACTIONCODE"


    // $ANTLR start "ruleUEPARAMS"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:859:1: ruleUEPARAMS returns [Enumerator current=null] : ( (enumLiteral_0= 'IMEI' ) | (enumLiteral_1= 'MSISDN' ) ) ;
    public final Enumerator ruleUEPARAMS() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:861:28: ( ( (enumLiteral_0= 'IMEI' ) | (enumLiteral_1= 'MSISDN' ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:862:1: ( (enumLiteral_0= 'IMEI' ) | (enumLiteral_1= 'MSISDN' ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:862:1: ( (enumLiteral_0= 'IMEI' ) | (enumLiteral_1= 'MSISDN' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            else if ( (LA14_0==36) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:862:2: (enumLiteral_0= 'IMEI' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:862:2: (enumLiteral_0= 'IMEI' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:862:4: enumLiteral_0= 'IMEI'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_35_in_ruleUEPARAMS1963); 

                            current = grammarAccess.getUEPARAMSAccess().getImeiEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUEPARAMSAccess().getImeiEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:868:6: (enumLiteral_1= 'MSISDN' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:868:6: (enumLiteral_1= 'MSISDN' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:868:8: enumLiteral_1= 'MSISDN'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_36_in_ruleUEPARAMS1980); 

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
    public static final BitSet FOLLOW_12_in_ruleUE271 = new BitSet(new long[]{0x0000001800010000L});
    public static final BitSet FOLLOW_ruleUEMetaObject_in_ruleUE292 = new BitSet(new long[]{0x0000001800012000L});
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
    public static final BitSet FOLLOW_12_in_ruleTestCase725 = new BitSet(new long[]{0x0000001800030000L});
    public static final BitSet FOLLOW_ruleDescriptionObject_in_ruleTestCase746 = new BitSet(new long[]{0x0000001800030000L});
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
    public static final BitSet FOLLOW_12_in_ruleProcedure992 = new BitSet(new long[]{0x00000007C1001000L});
    public static final BitSet FOLLOW_ruleAction_in_ruleProcedure1013 = new BitSet(new long[]{0x00000007C1003000L});
    public static final BitSet FOLLOW_13_in_ruleProcedure1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction1062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleACTIONCODE_in_ruleAction1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleAction1137 = new BitSet(new long[]{0x0000000007FC0000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleAction1158 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAction1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePARAM_NAME_in_ruleParameter1263 = new BitSet(new long[]{0x0000000038000050L});
    public static final BitSet FOLLOW_ruleParamType_in_ruleParameter1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamType_in_entryRuleParamType1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamType1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParamType1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleParamType1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamResponseType_in_ruleParamType1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamResponseType_in_entryRuleParamResponseType1466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamResponseType1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePARAM_RESPONSE_in_ruleParamResponseType1521 = new BitSet(new long[]{0x0000000038000052L});
    public static final BitSet FOLLOW_18_in_rulePARAM_NAME1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePARAM_NAME1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulePARAM_NAME1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulePARAM_NAME1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePARAM_NAME1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulePARAM_NAME1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulePARAM_NAME1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulePARAM_NAME1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePARAM_NAME1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePARAM_RESPONSE1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulePARAM_RESPONSE1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rulePARAM_RESPONSE1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleACTIONCODE1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleACTIONCODE1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleACTIONCODE1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleACTIONCODE1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleACTIONCODE1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleACTIONCODE1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleUEPARAMS1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleUEPARAMS1980 = new BitSet(new long[]{0x0000000000000002L});

}