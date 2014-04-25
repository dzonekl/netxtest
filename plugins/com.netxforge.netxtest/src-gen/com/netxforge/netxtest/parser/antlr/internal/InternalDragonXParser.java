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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'UE'", "'{'", "'}'", "':'", "'TestCase'", "'Test'", "' : '", "'AnswerTime'", "'IMEI'", "'Name'", "'MSISDN'", "'Description'", "'CALL'", "'ANSWER'", "'USSD'", "'SMS'", "'DATA'"
    };
    public static final int RULE_ID=5;
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
    public static final int T__19=19;
    public static final int RULE_STRING=4;
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
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:134:1: ruleUE returns [EObject current=null] : (otherlv_0= 'UE' otherlv_1= '{' ( (lv_meta_2_0= ruleUEMetaObject ) )+ otherlv_3= '}' ) ;
    public final EObject ruleUE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_meta_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:137:28: ( (otherlv_0= 'UE' otherlv_1= '{' ( (lv_meta_2_0= ruleUEMetaObject ) )+ otherlv_3= '}' ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:138:1: (otherlv_0= 'UE' otherlv_1= '{' ( (lv_meta_2_0= ruleUEMetaObject ) )+ otherlv_3= '}' )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:138:1: (otherlv_0= 'UE' otherlv_1= '{' ( (lv_meta_2_0= ruleUEMetaObject ) )+ otherlv_3= '}' )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:138:3: otherlv_0= 'UE' otherlv_1= '{' ( (lv_meta_2_0= ruleUEMetaObject ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleUE237); 

                	newLeafNode(otherlv_0, grammarAccess.getUEAccess().getUEKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleUE249); 

                	newLeafNode(otherlv_1, grammarAccess.getUEAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:146:1: ( (lv_meta_2_0= ruleUEMetaObject ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=19 && LA3_0<=21)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:147:1: (lv_meta_2_0= ruleUEMetaObject )
            	    {
            	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:147:1: (lv_meta_2_0= ruleUEMetaObject )
            	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:148:3: lv_meta_2_0= ruleUEMetaObject
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUEAccess().getMetaUEMetaObjectParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUEMetaObject_in_ruleUE270);
            	    lv_meta_2_0=ruleUEMetaObject();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUERule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"meta",
            	            		lv_meta_2_0, 
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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleUE283); 

                	newLeafNode(otherlv_3, grammarAccess.getUEAccess().getRightCurlyBracketKeyword_3());
                

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
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:176:1: entryRuleUEMetaObject returns [EObject current=null] : iv_ruleUEMetaObject= ruleUEMetaObject EOF ;
    public final EObject entryRuleUEMetaObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUEMetaObject = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:177:2: (iv_ruleUEMetaObject= ruleUEMetaObject EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:178:2: iv_ruleUEMetaObject= ruleUEMetaObject EOF
            {
             newCompositeNode(grammarAccess.getUEMetaObjectRule()); 
            pushFollow(FOLLOW_ruleUEMetaObject_in_entryRuleUEMetaObject319);
            iv_ruleUEMetaObject=ruleUEMetaObject();

            state._fsp--;

             current =iv_ruleUEMetaObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUEMetaObject329); 

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
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:185:1: ruleUEMetaObject returns [EObject current=null] : ( ( (lv_params_0_0= ruleUEPARAMS ) ) otherlv_1= ':' ( (lv_paramValue_2_0= ruleUEValue ) ) ) ;
    public final EObject ruleUEMetaObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_params_0_0 = null;

        AntlrDatatypeRuleToken lv_paramValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:188:28: ( ( ( (lv_params_0_0= ruleUEPARAMS ) ) otherlv_1= ':' ( (lv_paramValue_2_0= ruleUEValue ) ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:189:1: ( ( (lv_params_0_0= ruleUEPARAMS ) ) otherlv_1= ':' ( (lv_paramValue_2_0= ruleUEValue ) ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:189:1: ( ( (lv_params_0_0= ruleUEPARAMS ) ) otherlv_1= ':' ( (lv_paramValue_2_0= ruleUEValue ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:189:2: ( (lv_params_0_0= ruleUEPARAMS ) ) otherlv_1= ':' ( (lv_paramValue_2_0= ruleUEValue ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:189:2: ( (lv_params_0_0= ruleUEPARAMS ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:190:1: (lv_params_0_0= ruleUEPARAMS )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:190:1: (lv_params_0_0= ruleUEPARAMS )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:191:3: lv_params_0_0= ruleUEPARAMS
            {
             
            	        newCompositeNode(grammarAccess.getUEMetaObjectAccess().getParamsUEPARAMSEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleUEPARAMS_in_ruleUEMetaObject375);
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

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleUEMetaObject387); 

                	newLeafNode(otherlv_1, grammarAccess.getUEMetaObjectAccess().getColonKeyword_1());
                
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:211:1: ( (lv_paramValue_2_0= ruleUEValue ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:212:1: (lv_paramValue_2_0= ruleUEValue )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:212:1: (lv_paramValue_2_0= ruleUEValue )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:213:3: lv_paramValue_2_0= ruleUEValue
            {
             
            	        newCompositeNode(grammarAccess.getUEMetaObjectAccess().getParamValueUEValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleUEValue_in_ruleUEMetaObject408);
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
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:237:1: entryRuleUEValue returns [String current=null] : iv_ruleUEValue= ruleUEValue EOF ;
    public final String entryRuleUEValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUEValue = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:238:2: (iv_ruleUEValue= ruleUEValue EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:239:2: iv_ruleUEValue= ruleUEValue EOF
            {
             newCompositeNode(grammarAccess.getUEValueRule()); 
            pushFollow(FOLLOW_ruleUEValue_in_entryRuleUEValue445);
            iv_ruleUEValue=ruleUEValue();

            state._fsp--;

             current =iv_ruleUEValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUEValue456); 

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
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:246:1: ruleUEValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleUEValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:249:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:250:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:250:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                alt4=2;
                }
                break;
            case RULE_INT:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:250:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUEValue496); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getUEValueAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:258:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUEValue522); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getUEValueAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:266:10: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUEValue548); 

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
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:281:1: entryRuleTestCase returns [EObject current=null] : iv_ruleTestCase= ruleTestCase EOF ;
    public final EObject entryRuleTestCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestCase = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:282:2: (iv_ruleTestCase= ruleTestCase EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:283:2: iv_ruleTestCase= ruleTestCase EOF
            {
             newCompositeNode(grammarAccess.getTestCaseRule()); 
            pushFollow(FOLLOW_ruleTestCase_in_entryRuleTestCase593);
            iv_ruleTestCase=ruleTestCase();

            state._fsp--;

             current =iv_ruleTestCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestCase603); 

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
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:290:1: ruleTestCase returns [EObject current=null] : (otherlv_0= 'TestCase' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) ( (lv_meta_3_0= ruleTestMeta ) ) ( (lv_procedure_4_0= ruleProcedure ) ) otherlv_5= '}' ) ;
    public final EObject ruleTestCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_5=null;
        EObject lv_meta_3_0 = null;

        EObject lv_procedure_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:293:28: ( (otherlv_0= 'TestCase' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) ( (lv_meta_3_0= ruleTestMeta ) ) ( (lv_procedure_4_0= ruleProcedure ) ) otherlv_5= '}' ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:294:1: (otherlv_0= 'TestCase' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) ( (lv_meta_3_0= ruleTestMeta ) ) ( (lv_procedure_4_0= ruleProcedure ) ) otherlv_5= '}' )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:294:1: (otherlv_0= 'TestCase' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) ( (lv_meta_3_0= ruleTestMeta ) ) ( (lv_procedure_4_0= ruleProcedure ) ) otherlv_5= '}' )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:294:3: otherlv_0= 'TestCase' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) ( (lv_meta_3_0= ruleTestMeta ) ) ( (lv_procedure_4_0= ruleProcedure ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleTestCase640); 

                	newLeafNode(otherlv_0, grammarAccess.getTestCaseAccess().getTestCaseKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleTestCase652); 

                	newLeafNode(otherlv_1, grammarAccess.getTestCaseAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:302:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:303:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:303:1: (lv_name_2_0= RULE_ID )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:304:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTestCase669); 

            			newLeafNode(lv_name_2_0, grammarAccess.getTestCaseAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTestCaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:320:2: ( (lv_meta_3_0= ruleTestMeta ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:321:1: (lv_meta_3_0= ruleTestMeta )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:321:1: (lv_meta_3_0= ruleTestMeta )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:322:3: lv_meta_3_0= ruleTestMeta
            {
             
            	        newCompositeNode(grammarAccess.getTestCaseAccess().getMetaTestMetaParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTestMeta_in_ruleTestCase695);
            lv_meta_3_0=ruleTestMeta();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTestCaseRule());
            	        }
                   		set(
                   			current, 
                   			"meta",
                    		lv_meta_3_0, 
                    		"TestMeta");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:338:2: ( (lv_procedure_4_0= ruleProcedure ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:339:1: (lv_procedure_4_0= ruleProcedure )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:339:1: (lv_procedure_4_0= ruleProcedure )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:340:3: lv_procedure_4_0= ruleProcedure
            {
             
            	        newCompositeNode(grammarAccess.getTestCaseAccess().getProcedureProcedureParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleProcedure_in_ruleTestCase716);
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

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleTestCase728); 

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


    // $ANTLR start "entryRuleTestMeta"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:368:1: entryRuleTestMeta returns [EObject current=null] : iv_ruleTestMeta= ruleTestMeta EOF ;
    public final EObject entryRuleTestMeta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestMeta = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:369:2: (iv_ruleTestMeta= ruleTestMeta EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:370:2: iv_ruleTestMeta= ruleTestMeta EOF
            {
             newCompositeNode(grammarAccess.getTestMetaRule()); 
            pushFollow(FOLLOW_ruleTestMeta_in_entryRuleTestMeta764);
            iv_ruleTestMeta=ruleTestMeta();

            state._fsp--;

             current =iv_ruleTestMeta; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestMeta774); 

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
    // $ANTLR end "entryRuleTestMeta"


    // $ANTLR start "ruleTestMeta"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:377:1: ruleTestMeta returns [EObject current=null] : ( (lv_meta_0_0= ruleTestMetaObject ) )+ ;
    public final EObject ruleTestMeta() throws RecognitionException {
        EObject current = null;

        EObject lv_meta_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:380:28: ( ( (lv_meta_0_0= ruleTestMetaObject ) )+ )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:381:1: ( (lv_meta_0_0= ruleTestMetaObject ) )+
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:381:1: ( (lv_meta_0_0= ruleTestMetaObject ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:382:1: (lv_meta_0_0= ruleTestMetaObject )
            	    {
            	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:382:1: (lv_meta_0_0= ruleTestMetaObject )
            	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:383:3: lv_meta_0_0= ruleTestMetaObject
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTestMetaAccess().getMetaTestMetaObjectParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTestMetaObject_in_ruleTestMeta819);
            	    lv_meta_0_0=ruleTestMetaObject();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTestMetaRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"meta",
            	            		lv_meta_0_0, 
            	            		"TestMetaObject");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // $ANTLR end "ruleTestMeta"


    // $ANTLR start "entryRuleTestMetaObject"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:407:1: entryRuleTestMetaObject returns [EObject current=null] : iv_ruleTestMetaObject= ruleTestMetaObject EOF ;
    public final EObject entryRuleTestMetaObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestMetaObject = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:408:2: (iv_ruleTestMetaObject= ruleTestMetaObject EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:409:2: iv_ruleTestMetaObject= ruleTestMetaObject EOF
            {
             newCompositeNode(grammarAccess.getTestMetaObjectRule()); 
            pushFollow(FOLLOW_ruleTestMetaObject_in_entryRuleTestMetaObject855);
            iv_ruleTestMetaObject=ruleTestMetaObject();

            state._fsp--;

             current =iv_ruleTestMetaObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestMetaObject865); 

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
    // $ANTLR end "entryRuleTestMetaObject"


    // $ANTLR start "ruleTestMetaObject"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:416:1: ruleTestMetaObject returns [EObject current=null] : ( ( (lv_metatype_0_0= ruleMETATYPE ) ) otherlv_1= ':' ( (lv_metaValue_2_0= ruleMetaValue ) ) ) ;
    public final EObject ruleTestMetaObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_metatype_0_0 = null;

        AntlrDatatypeRuleToken lv_metaValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:419:28: ( ( ( (lv_metatype_0_0= ruleMETATYPE ) ) otherlv_1= ':' ( (lv_metaValue_2_0= ruleMetaValue ) ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:420:1: ( ( (lv_metatype_0_0= ruleMETATYPE ) ) otherlv_1= ':' ( (lv_metaValue_2_0= ruleMetaValue ) ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:420:1: ( ( (lv_metatype_0_0= ruleMETATYPE ) ) otherlv_1= ':' ( (lv_metaValue_2_0= ruleMetaValue ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:420:2: ( (lv_metatype_0_0= ruleMETATYPE ) ) otherlv_1= ':' ( (lv_metaValue_2_0= ruleMetaValue ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:420:2: ( (lv_metatype_0_0= ruleMETATYPE ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:421:1: (lv_metatype_0_0= ruleMETATYPE )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:421:1: (lv_metatype_0_0= ruleMETATYPE )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:422:3: lv_metatype_0_0= ruleMETATYPE
            {
             
            	        newCompositeNode(grammarAccess.getTestMetaObjectAccess().getMetatypeMETATYPEEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMETATYPE_in_ruleTestMetaObject911);
            lv_metatype_0_0=ruleMETATYPE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTestMetaObjectRule());
            	        }
                   		set(
                   			current, 
                   			"metatype",
                    		lv_metatype_0_0, 
                    		"METATYPE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleTestMetaObject923); 

                	newLeafNode(otherlv_1, grammarAccess.getTestMetaObjectAccess().getColonKeyword_1());
                
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:442:1: ( (lv_metaValue_2_0= ruleMetaValue ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:443:1: (lv_metaValue_2_0= ruleMetaValue )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:443:1: (lv_metaValue_2_0= ruleMetaValue )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:444:3: lv_metaValue_2_0= ruleMetaValue
            {
             
            	        newCompositeNode(grammarAccess.getTestMetaObjectAccess().getMetaValueMetaValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleMetaValue_in_ruleTestMetaObject944);
            lv_metaValue_2_0=ruleMetaValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTestMetaObjectRule());
            	        }
                   		set(
                   			current, 
                   			"metaValue",
                    		lv_metaValue_2_0, 
                    		"MetaValue");
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
    // $ANTLR end "ruleTestMetaObject"


    // $ANTLR start "entryRuleMetaValue"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:468:1: entryRuleMetaValue returns [String current=null] : iv_ruleMetaValue= ruleMetaValue EOF ;
    public final String entryRuleMetaValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMetaValue = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:469:2: (iv_ruleMetaValue= ruleMetaValue EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:470:2: iv_ruleMetaValue= ruleMetaValue EOF
            {
             newCompositeNode(grammarAccess.getMetaValueRule()); 
            pushFollow(FOLLOW_ruleMetaValue_in_entryRuleMetaValue981);
            iv_ruleMetaValue=ruleMetaValue();

            state._fsp--;

             current =iv_ruleMetaValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaValue992); 

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
    // $ANTLR end "entryRuleMetaValue"


    // $ANTLR start "ruleMetaValue"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:477:1: ruleMetaValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleMetaValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:480:28: (this_STRING_0= RULE_STRING )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:481:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetaValue1031); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getMetaValueAccess().getSTRINGTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleMetaValue"


    // $ANTLR start "entryRuleProcedure"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:496:1: entryRuleProcedure returns [EObject current=null] : iv_ruleProcedure= ruleProcedure EOF ;
    public final EObject entryRuleProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedure = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:497:2: (iv_ruleProcedure= ruleProcedure EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:498:2: iv_ruleProcedure= ruleProcedure EOF
            {
             newCompositeNode(grammarAccess.getProcedureRule()); 
            pushFollow(FOLLOW_ruleProcedure_in_entryRuleProcedure1075);
            iv_ruleProcedure=ruleProcedure();

            state._fsp--;

             current =iv_ruleProcedure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcedure1085); 

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
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:505:1: ruleProcedure returns [EObject current=null] : (otherlv_0= 'Test' otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) otherlv_3= '}' ) ;
    public final EObject ruleProcedure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_actions_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:508:28: ( (otherlv_0= 'Test' otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) otherlv_3= '}' ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:509:1: (otherlv_0= 'Test' otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) otherlv_3= '}' )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:509:1: (otherlv_0= 'Test' otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) otherlv_3= '}' )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:509:3: otherlv_0= 'Test' otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleProcedure1122); 

                	newLeafNode(otherlv_0, grammarAccess.getProcedureAccess().getTestKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleProcedure1134); 

                	newLeafNode(otherlv_1, grammarAccess.getProcedureAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:517:1: ( (lv_actions_2_0= ruleAction ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:518:1: (lv_actions_2_0= ruleAction )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:518:1: (lv_actions_2_0= ruleAction )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:519:3: lv_actions_2_0= ruleAction
            {
             
            	        newCompositeNode(grammarAccess.getProcedureAccess().getActionsActionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAction_in_ruleProcedure1155);
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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleProcedure1167); 

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
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:547:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:548:2: (iv_ruleAction= ruleAction EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:549:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction1203);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction1213); 

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
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:556:1: ruleAction returns [EObject current=null] : ( ( (lv_name_0_0= ruleACTIONS ) ) ( (lv_parameterSet_1_0= ruleParameterSet ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Enumerator lv_name_0_0 = null;

        EObject lv_parameterSet_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:559:28: ( ( ( (lv_name_0_0= ruleACTIONS ) ) ( (lv_parameterSet_1_0= ruleParameterSet ) ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:560:1: ( ( (lv_name_0_0= ruleACTIONS ) ) ( (lv_parameterSet_1_0= ruleParameterSet ) ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:560:1: ( ( (lv_name_0_0= ruleACTIONS ) ) ( (lv_parameterSet_1_0= ruleParameterSet ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:560:2: ( (lv_name_0_0= ruleACTIONS ) ) ( (lv_parameterSet_1_0= ruleParameterSet ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:560:2: ( (lv_name_0_0= ruleACTIONS ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:561:1: (lv_name_0_0= ruleACTIONS )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:561:1: (lv_name_0_0= ruleACTIONS )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:562:3: lv_name_0_0= ruleACTIONS
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getNameACTIONSEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleACTIONS_in_ruleAction1259);
            lv_name_0_0=ruleACTIONS();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ACTIONS");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:578:2: ( (lv_parameterSet_1_0= ruleParameterSet ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:579:1: (lv_parameterSet_1_0= ruleParameterSet )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:579:1: (lv_parameterSet_1_0= ruleParameterSet )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:580:3: lv_parameterSet_1_0= ruleParameterSet
            {
             
            	        newCompositeNode(grammarAccess.getActionAccess().getParameterSetParameterSetParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleParameterSet_in_ruleAction1280);
            lv_parameterSet_1_0=ruleParameterSet();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActionRule());
            	        }
                   		set(
                   			current, 
                   			"parameterSet",
                    		lv_parameterSet_1_0, 
                    		"ParameterSet");
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleParameterSet"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:604:1: entryRuleParameterSet returns [EObject current=null] : iv_ruleParameterSet= ruleParameterSet EOF ;
    public final EObject entryRuleParameterSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterSet = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:605:2: (iv_ruleParameterSet= ruleParameterSet EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:606:2: iv_ruleParameterSet= ruleParameterSet EOF
            {
             newCompositeNode(grammarAccess.getParameterSetRule()); 
            pushFollow(FOLLOW_ruleParameterSet_in_entryRuleParameterSet1316);
            iv_ruleParameterSet=ruleParameterSet();

            state._fsp--;

             current =iv_ruleParameterSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterSet1326); 

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
    // $ANTLR end "entryRuleParameterSet"


    // $ANTLR start "ruleParameterSet"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:613:1: ruleParameterSet returns [EObject current=null] : (otherlv_0= '{' ( (lv_parameters_1_0= ruleParameter ) )+ otherlv_2= '}' ) ;
    public final EObject ruleParameterSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_parameters_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:616:28: ( (otherlv_0= '{' ( (lv_parameters_1_0= ruleParameter ) )+ otherlv_2= '}' ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:617:1: (otherlv_0= '{' ( (lv_parameters_1_0= ruleParameter ) )+ otherlv_2= '}' )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:617:1: (otherlv_0= '{' ( (lv_parameters_1_0= ruleParameter ) )+ otherlv_2= '}' )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:617:3: otherlv_0= '{' ( (lv_parameters_1_0= ruleParameter ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleParameterSet1363); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterSetAccess().getLeftCurlyBracketKeyword_0());
                
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:621:1: ( (lv_parameters_1_0= ruleParameter ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==11||LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:622:1: (lv_parameters_1_0= ruleParameter )
            	    {
            	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:622:1: (lv_parameters_1_0= ruleParameter )
            	    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:623:3: lv_parameters_1_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParameterSetAccess().getParametersParameterParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleParameterSet1384);
            	    lv_parameters_1_0=ruleParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParameterSetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_1_0, 
            	            		"Parameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleParameterSet1397); 

                	newLeafNode(otherlv_2, grammarAccess.getParameterSetAccess().getRightCurlyBracketKeyword_2());
                

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
    // $ANTLR end "ruleParameterSet"


    // $ANTLR start "entryRuleParameter"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:651:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:652:2: (iv_ruleParameter= ruleParameter EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:653:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1433);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1443); 

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
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:660:1: ruleParameter returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleACTIONPARAMS ) ) otherlv_1= ' : ' ( (lv_value_2_0= ruleParameterValue ) ) ) | ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:663:28: ( ( ( ( (lv_name_0_0= ruleACTIONPARAMS ) ) otherlv_1= ' : ' ( (lv_value_2_0= ruleParameterValue ) ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:664:1: ( ( ( (lv_name_0_0= ruleACTIONPARAMS ) ) otherlv_1= ' : ' ( (lv_value_2_0= ruleParameterValue ) ) ) | ( (otherlv_3= RULE_ID ) ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:664:1: ( ( ( (lv_name_0_0= ruleACTIONPARAMS ) ) otherlv_1= ' : ' ( (lv_value_2_0= ruleParameterValue ) ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11||LA7_0==18) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:664:2: ( ( (lv_name_0_0= ruleACTIONPARAMS ) ) otherlv_1= ' : ' ( (lv_value_2_0= ruleParameterValue ) ) )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:664:2: ( ( (lv_name_0_0= ruleACTIONPARAMS ) ) otherlv_1= ' : ' ( (lv_value_2_0= ruleParameterValue ) ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:664:3: ( (lv_name_0_0= ruleACTIONPARAMS ) ) otherlv_1= ' : ' ( (lv_value_2_0= ruleParameterValue ) )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:664:3: ( (lv_name_0_0= ruleACTIONPARAMS ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:665:1: (lv_name_0_0= ruleACTIONPARAMS )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:665:1: (lv_name_0_0= ruleACTIONPARAMS )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:666:3: lv_name_0_0= ruleACTIONPARAMS
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getNameACTIONPARAMSEnumRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleACTIONPARAMS_in_ruleParameter1490);
                    lv_name_0_0=ruleACTIONPARAMS();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_0_0, 
                            		"ACTIONPARAMS");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleParameter1502); 

                        	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getSpaceColonSpaceKeyword_0_1());
                        
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:686:1: ( (lv_value_2_0= ruleParameterValue ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:687:1: (lv_value_2_0= ruleParameterValue )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:687:1: (lv_value_2_0= ruleParameterValue )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:688:3: lv_value_2_0= ruleParameterValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getValueParameterValueParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterValue_in_ruleParameter1523);
                    lv_value_2_0=ruleParameterValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"ParameterValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:705:6: ( (otherlv_3= RULE_ID ) )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:705:6: ( (otherlv_3= RULE_ID ) )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:706:1: (otherlv_3= RULE_ID )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:706:1: (otherlv_3= RULE_ID )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:707:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1550); 

                    		newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getUeRefUECrossReference_1_0()); 
                    	

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleParameterValue"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:726:1: entryRuleParameterValue returns [String current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final String entryRuleParameterValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterValue = null;


        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:727:2: (iv_ruleParameterValue= ruleParameterValue EOF )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:728:2: iv_ruleParameterValue= ruleParameterValue EOF
            {
             newCompositeNode(grammarAccess.getParameterValueRule()); 
            pushFollow(FOLLOW_ruleParameterValue_in_entryRuleParameterValue1587);
            iv_ruleParameterValue=ruleParameterValue();

            state._fsp--;

             current =iv_ruleParameterValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterValue1598); 

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
    // $ANTLR end "entryRuleParameterValue"


    // $ANTLR start "ruleParameterValue"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:735:1: ruleParameterValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleParameterValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:738:28: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:739:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:739:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_STRING) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:739:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleParameterValue1638); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getParameterValueAccess().getINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:747:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleParameterValue1664); 

                    		current.merge(this_STRING_1);
                        
                     
                        newLeafNode(this_STRING_1, grammarAccess.getParameterValueAccess().getSTRINGTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleParameterValue"


    // $ANTLR start "ruleACTIONPARAMS"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:764:1: ruleACTIONPARAMS returns [Enumerator current=null] : ( (enumLiteral_0= 'UE' ) | (enumLiteral_1= 'AnswerTime' ) ) ;
    public final Enumerator ruleACTIONPARAMS() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:766:28: ( ( (enumLiteral_0= 'UE' ) | (enumLiteral_1= 'AnswerTime' ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:767:1: ( (enumLiteral_0= 'UE' ) | (enumLiteral_1= 'AnswerTime' ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:767:1: ( (enumLiteral_0= 'UE' ) | (enumLiteral_1= 'AnswerTime' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==11) ) {
                alt9=1;
            }
            else if ( (LA9_0==18) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:767:2: (enumLiteral_0= 'UE' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:767:2: (enumLiteral_0= 'UE' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:767:4: enumLiteral_0= 'UE'
                    {
                    enumLiteral_0=(Token)match(input,11,FOLLOW_11_in_ruleACTIONPARAMS1725); 

                            current = grammarAccess.getACTIONPARAMSAccess().getUeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getACTIONPARAMSAccess().getUeEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:773:6: (enumLiteral_1= 'AnswerTime' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:773:6: (enumLiteral_1= 'AnswerTime' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:773:8: enumLiteral_1= 'AnswerTime'
                    {
                    enumLiteral_1=(Token)match(input,18,FOLLOW_18_in_ruleACTIONPARAMS1742); 

                            current = grammarAccess.getACTIONPARAMSAccess().getAnswerTimeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getACTIONPARAMSAccess().getAnswerTimeEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleACTIONPARAMS"


    // $ANTLR start "ruleUEPARAMS"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:783:1: ruleUEPARAMS returns [Enumerator current=null] : ( (enumLiteral_0= 'IMEI' ) | (enumLiteral_1= 'Name' ) | (enumLiteral_2= 'MSISDN' ) ) ;
    public final Enumerator ruleUEPARAMS() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:785:28: ( ( (enumLiteral_0= 'IMEI' ) | (enumLiteral_1= 'Name' ) | (enumLiteral_2= 'MSISDN' ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:786:1: ( (enumLiteral_0= 'IMEI' ) | (enumLiteral_1= 'Name' ) | (enumLiteral_2= 'MSISDN' ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:786:1: ( (enumLiteral_0= 'IMEI' ) | (enumLiteral_1= 'Name' ) | (enumLiteral_2= 'MSISDN' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt10=1;
                }
                break;
            case 20:
                {
                alt10=2;
                }
                break;
            case 21:
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
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:786:2: (enumLiteral_0= 'IMEI' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:786:2: (enumLiteral_0= 'IMEI' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:786:4: enumLiteral_0= 'IMEI'
                    {
                    enumLiteral_0=(Token)match(input,19,FOLLOW_19_in_ruleUEPARAMS1787); 

                            current = grammarAccess.getUEPARAMSAccess().getImeiEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUEPARAMSAccess().getImeiEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:792:6: (enumLiteral_1= 'Name' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:792:6: (enumLiteral_1= 'Name' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:792:8: enumLiteral_1= 'Name'
                    {
                    enumLiteral_1=(Token)match(input,20,FOLLOW_20_in_ruleUEPARAMS1804); 

                            current = grammarAccess.getUEPARAMSAccess().getNameEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getUEPARAMSAccess().getNameEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:798:6: (enumLiteral_2= 'MSISDN' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:798:6: (enumLiteral_2= 'MSISDN' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:798:8: enumLiteral_2= 'MSISDN'
                    {
                    enumLiteral_2=(Token)match(input,21,FOLLOW_21_in_ruleUEPARAMS1821); 

                            current = grammarAccess.getUEPARAMSAccess().getMsidnEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getUEPARAMSAccess().getMsidnEnumLiteralDeclaration_2()); 
                        

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


    // $ANTLR start "ruleMETATYPE"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:808:1: ruleMETATYPE returns [Enumerator current=null] : (enumLiteral_0= 'Description' ) ;
    public final Enumerator ruleMETATYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:810:28: ( (enumLiteral_0= 'Description' ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:811:1: (enumLiteral_0= 'Description' )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:811:1: (enumLiteral_0= 'Description' )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:811:3: enumLiteral_0= 'Description'
            {
            enumLiteral_0=(Token)match(input,22,FOLLOW_22_in_ruleMETATYPE1865); 

                    current = grammarAccess.getMETATYPEAccess().getDescriptionEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getMETATYPEAccess().getDescriptionEnumLiteralDeclaration()); 
                

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
    // $ANTLR end "ruleMETATYPE"


    // $ANTLR start "ruleACTIONS"
    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:821:1: ruleACTIONS returns [Enumerator current=null] : ( (enumLiteral_0= 'CALL' ) | (enumLiteral_1= 'ANSWER' ) | (enumLiteral_2= 'USSD' ) | (enumLiteral_3= 'SMS' ) | (enumLiteral_4= 'DATA' ) ) ;
    public final Enumerator ruleACTIONS() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:823:28: ( ( (enumLiteral_0= 'CALL' ) | (enumLiteral_1= 'ANSWER' ) | (enumLiteral_2= 'USSD' ) | (enumLiteral_3= 'SMS' ) | (enumLiteral_4= 'DATA' ) ) )
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:824:1: ( (enumLiteral_0= 'CALL' ) | (enumLiteral_1= 'ANSWER' ) | (enumLiteral_2= 'USSD' ) | (enumLiteral_3= 'SMS' ) | (enumLiteral_4= 'DATA' ) )
            {
            // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:824:1: ( (enumLiteral_0= 'CALL' ) | (enumLiteral_1= 'ANSWER' ) | (enumLiteral_2= 'USSD' ) | (enumLiteral_3= 'SMS' ) | (enumLiteral_4= 'DATA' ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt11=1;
                }
                break;
            case 24:
                {
                alt11=2;
                }
                break;
            case 25:
                {
                alt11=3;
                }
                break;
            case 26:
                {
                alt11=4;
                }
                break;
            case 27:
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
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:824:2: (enumLiteral_0= 'CALL' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:824:2: (enumLiteral_0= 'CALL' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:824:4: enumLiteral_0= 'CALL'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_23_in_ruleACTIONS1909); 

                            current = grammarAccess.getACTIONSAccess().getCallEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getACTIONSAccess().getCallEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:830:6: (enumLiteral_1= 'ANSWER' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:830:6: (enumLiteral_1= 'ANSWER' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:830:8: enumLiteral_1= 'ANSWER'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_24_in_ruleACTIONS1926); 

                            current = grammarAccess.getACTIONSAccess().getAnswerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getACTIONSAccess().getAnswerEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:836:6: (enumLiteral_2= 'USSD' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:836:6: (enumLiteral_2= 'USSD' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:836:8: enumLiteral_2= 'USSD'
                    {
                    enumLiteral_2=(Token)match(input,25,FOLLOW_25_in_ruleACTIONS1943); 

                            current = grammarAccess.getACTIONSAccess().getUssdEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getACTIONSAccess().getUssdEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:842:6: (enumLiteral_3= 'SMS' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:842:6: (enumLiteral_3= 'SMS' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:842:8: enumLiteral_3= 'SMS'
                    {
                    enumLiteral_3=(Token)match(input,26,FOLLOW_26_in_ruleACTIONS1960); 

                            current = grammarAccess.getACTIONSAccess().getSmsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getACTIONSAccess().getSmsEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:848:6: (enumLiteral_4= 'DATA' )
                    {
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:848:6: (enumLiteral_4= 'DATA' )
                    // ../com.netxforge.netxtest/src-gen/com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.g:848:8: enumLiteral_4= 'DATA'
                    {
                    enumLiteral_4=(Token)match(input,27,FOLLOW_27_in_ruleACTIONS1977); 

                            current = grammarAccess.getACTIONSAccess().getDataEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getACTIONSAccess().getDataEnumLiteralDeclaration_4()); 
                        

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
    // $ANTLR end "ruleACTIONS"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDragonX_in_entryRuleDragonX75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDragonX85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUE_in_ruleDragonX131 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_ruleTestCase_in_ruleDragonX153 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleUE_in_entryRuleUE190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUE200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleUE237 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUE249 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_ruleUEMetaObject_in_ruleUE270 = new BitSet(new long[]{0x0000000000382000L});
    public static final BitSet FOLLOW_13_in_ruleUE283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUEMetaObject_in_entryRuleUEMetaObject319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUEMetaObject329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUEPARAMS_in_ruleUEMetaObject375 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleUEMetaObject387 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleUEValue_in_ruleUEMetaObject408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUEValue_in_entryRuleUEValue445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUEValue456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUEValue496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUEValue522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUEValue548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestCase_in_entryRuleTestCase593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestCase603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleTestCase640 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTestCase652 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTestCase669 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleTestMeta_in_ruleTestCase695 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleProcedure_in_ruleTestCase716 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTestCase728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestMeta_in_entryRuleTestMeta764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestMeta774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestMetaObject_in_ruleTestMeta819 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleTestMetaObject_in_entryRuleTestMetaObject855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestMetaObject865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMETATYPE_in_ruleTestMetaObject911 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTestMetaObject923 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMetaValue_in_ruleTestMetaObject944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaValue_in_entryRuleMetaValue981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaValue992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetaValue1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedure_in_entryRuleProcedure1075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcedure1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleProcedure1122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProcedure1134 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_ruleAction_in_ruleProcedure1155 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleProcedure1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleACTIONS_in_ruleAction1259 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleParameterSet_in_ruleAction1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterSet_in_entryRuleParameterSet1316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterSet1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleParameterSet1363 = new BitSet(new long[]{0x0000000000040820L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameterSet1384 = new BitSet(new long[]{0x0000000000042820L});
    public static final BitSet FOLLOW_13_in_ruleParameterSet1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleACTIONPARAMS_in_ruleParameter1490 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleParameter1502 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleParameterValue_in_ruleParameter1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterValue_in_entryRuleParameterValue1587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterValue1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleParameterValue1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleParameterValue1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleACTIONPARAMS1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleACTIONPARAMS1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleUEPARAMS1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleUEPARAMS1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleUEPARAMS1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleMETATYPE1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleACTIONS1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleACTIONS1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleACTIONS1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleACTIONS1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleACTIONS1977 = new BitSet(new long[]{0x0000000000000002L});

}