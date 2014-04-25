/*
* generated by Xtext
*/
grammar InternalDragonX;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package com.netxforge.netxtest.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package com.netxforge.netxtest.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.netxforge.netxtest.services.DragonXGrammarAccess;

}

@parser::members {
 
 	private DragonXGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(DragonXGrammarAccess grammarAccess) {
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

}




// Entry rule entryRuleDragonX
entryRuleDragonX 
:
{ before(grammarAccess.getDragonXRule()); }
	 ruleDragonX
{ after(grammarAccess.getDragonXRule()); } 
	 EOF 
;

// Rule DragonX
ruleDragonX
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDragonXAccess().getGroup()); }
(rule__DragonX__Group__0)
{ after(grammarAccess.getDragonXAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleUE
entryRuleUE 
:
{ before(grammarAccess.getUERule()); }
	 ruleUE
{ after(grammarAccess.getUERule()); } 
	 EOF 
;

// Rule UE
ruleUE
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getUEAccess().getGroup()); }
(rule__UE__Group__0)
{ after(grammarAccess.getUEAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleUEMetaObject
entryRuleUEMetaObject 
:
{ before(grammarAccess.getUEMetaObjectRule()); }
	 ruleUEMetaObject
{ after(grammarAccess.getUEMetaObjectRule()); } 
	 EOF 
;

// Rule UEMetaObject
ruleUEMetaObject
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getUEMetaObjectAccess().getGroup()); }
(rule__UEMetaObject__Group__0)
{ after(grammarAccess.getUEMetaObjectAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleUEValue
entryRuleUEValue 
:
{ before(grammarAccess.getUEValueRule()); }
	 ruleUEValue
{ after(grammarAccess.getUEValueRule()); } 
	 EOF 
;

// Rule UEValue
ruleUEValue
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getUEValueAccess().getAlternatives()); }
(rule__UEValue__Alternatives)
{ after(grammarAccess.getUEValueAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleTestCase
entryRuleTestCase 
:
{ before(grammarAccess.getTestCaseRule()); }
	 ruleTestCase
{ after(grammarAccess.getTestCaseRule()); } 
	 EOF 
;

// Rule TestCase
ruleTestCase
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTestCaseAccess().getGroup()); }
(rule__TestCase__Group__0)
{ after(grammarAccess.getTestCaseAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleTestMeta
entryRuleTestMeta 
:
{ before(grammarAccess.getTestMetaRule()); }
	 ruleTestMeta
{ after(grammarAccess.getTestMetaRule()); } 
	 EOF 
;

// Rule TestMeta
ruleTestMeta
    @init {
		int stackSize = keepStackSize();
    }
	:
(
(
{ before(grammarAccess.getTestMetaAccess().getMetaAssignment()); }
(rule__TestMeta__MetaAssignment)
{ after(grammarAccess.getTestMetaAccess().getMetaAssignment()); }
)
(
{ before(grammarAccess.getTestMetaAccess().getMetaAssignment()); }
(rule__TestMeta__MetaAssignment)*
{ after(grammarAccess.getTestMetaAccess().getMetaAssignment()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleTestMetaObject
entryRuleTestMetaObject 
:
{ before(grammarAccess.getTestMetaObjectRule()); }
	 ruleTestMetaObject
{ after(grammarAccess.getTestMetaObjectRule()); } 
	 EOF 
;

// Rule TestMetaObject
ruleTestMetaObject
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTestMetaObjectAccess().getGroup()); }
(rule__TestMetaObject__Group__0)
{ after(grammarAccess.getTestMetaObjectAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMetaValue
entryRuleMetaValue 
:
{ before(grammarAccess.getMetaValueRule()); }
	 ruleMetaValue
{ after(grammarAccess.getMetaValueRule()); } 
	 EOF 
;

// Rule MetaValue
ruleMetaValue
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMetaValueAccess().getSTRINGTerminalRuleCall()); }
	RULE_STRING
{ after(grammarAccess.getMetaValueAccess().getSTRINGTerminalRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleProcedure
entryRuleProcedure 
:
{ before(grammarAccess.getProcedureRule()); }
	 ruleProcedure
{ after(grammarAccess.getProcedureRule()); } 
	 EOF 
;

// Rule Procedure
ruleProcedure
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getProcedureAccess().getGroup()); }
(rule__Procedure__Group__0)
{ after(grammarAccess.getProcedureAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAction
entryRuleAction 
:
{ before(grammarAccess.getActionRule()); }
	 ruleAction
{ after(grammarAccess.getActionRule()); } 
	 EOF 
;

// Rule Action
ruleAction
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getActionAccess().getGroup()); }
(rule__Action__Group__0)
{ after(grammarAccess.getActionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleParameterSet
entryRuleParameterSet 
:
{ before(grammarAccess.getParameterSetRule()); }
	 ruleParameterSet
{ after(grammarAccess.getParameterSetRule()); } 
	 EOF 
;

// Rule ParameterSet
ruleParameterSet
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getParameterSetAccess().getGroup()); }
(rule__ParameterSet__Group__0)
{ after(grammarAccess.getParameterSetAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleParameter
entryRuleParameter 
:
{ before(grammarAccess.getParameterRule()); }
	 ruleParameter
{ after(grammarAccess.getParameterRule()); } 
	 EOF 
;

// Rule Parameter
ruleParameter
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getParameterAccess().getAlternatives()); }
(rule__Parameter__Alternatives)
{ after(grammarAccess.getParameterAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleParameterValue
entryRuleParameterValue 
:
{ before(grammarAccess.getParameterValueRule()); }
	 ruleParameterValue
{ after(grammarAccess.getParameterValueRule()); } 
	 EOF 
;

// Rule ParameterValue
ruleParameterValue
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getParameterValueAccess().getAlternatives()); }
(rule__ParameterValue__Alternatives)
{ after(grammarAccess.getParameterValueAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}






// Rule ACTIONPARAMS
ruleACTIONPARAMS
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getACTIONPARAMSAccess().getAlternatives()); }
(rule__ACTIONPARAMS__Alternatives)
{ after(grammarAccess.getACTIONPARAMSAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Rule UEPARAMS
ruleUEPARAMS
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUEPARAMSAccess().getAlternatives()); }
(rule__UEPARAMS__Alternatives)
{ after(grammarAccess.getUEPARAMSAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Rule METATYPE
ruleMETATYPE
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMETATYPEAccess().getDescriptionEnumLiteralDeclaration()); }
(	'Description' 
)
{ after(grammarAccess.getMETATYPEAccess().getDescriptionEnumLiteralDeclaration()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Rule ACTIONS
ruleACTIONS
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getACTIONSAccess().getAlternatives()); }
(rule__ACTIONS__Alternatives)
{ after(grammarAccess.getACTIONSAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__UEValue__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUEValueAccess().getSTRINGTerminalRuleCall_0()); }
	RULE_STRING
{ after(grammarAccess.getUEValueAccess().getSTRINGTerminalRuleCall_0()); }
)

    |(
{ before(grammarAccess.getUEValueAccess().getIDTerminalRuleCall_1()); }
	RULE_ID
{ after(grammarAccess.getUEValueAccess().getIDTerminalRuleCall_1()); }
)

    |(
{ before(grammarAccess.getUEValueAccess().getINTTerminalRuleCall_2()); }
	RULE_INT
{ after(grammarAccess.getUEValueAccess().getINTTerminalRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getGroup_0()); }
(rule__Parameter__Group_0__0)
{ after(grammarAccess.getParameterAccess().getGroup_0()); }
)

    |(
{ before(grammarAccess.getParameterAccess().getUeRefAssignment_1()); }
(rule__Parameter__UeRefAssignment_1)
{ after(grammarAccess.getParameterAccess().getUeRefAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterValue__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterValueAccess().getINTTerminalRuleCall_0()); }
	RULE_INT
{ after(grammarAccess.getParameterValueAccess().getINTTerminalRuleCall_0()); }
)

    |(
{ before(grammarAccess.getParameterValueAccess().getSTRINGTerminalRuleCall_1()); }
	RULE_STRING
{ after(grammarAccess.getParameterValueAccess().getSTRINGTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ACTIONPARAMS__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getACTIONPARAMSAccess().getUeEnumLiteralDeclaration_0()); }
(	'UE' 
)
{ after(grammarAccess.getACTIONPARAMSAccess().getUeEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getACTIONPARAMSAccess().getAnswerTimeEnumLiteralDeclaration_1()); }
(	'AnswerTime' 
)
{ after(grammarAccess.getACTIONPARAMSAccess().getAnswerTimeEnumLiteralDeclaration_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__UEPARAMS__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUEPARAMSAccess().getImeiEnumLiteralDeclaration_0()); }
(	'IMEI' 
)
{ after(grammarAccess.getUEPARAMSAccess().getImeiEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getUEPARAMSAccess().getNameEnumLiteralDeclaration_1()); }
(	'Name' 
)
{ after(grammarAccess.getUEPARAMSAccess().getNameEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getUEPARAMSAccess().getMsidnEnumLiteralDeclaration_2()); }
(	'MSISDN' 
)
{ after(grammarAccess.getUEPARAMSAccess().getMsidnEnumLiteralDeclaration_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ACTIONS__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getACTIONSAccess().getCallEnumLiteralDeclaration_0()); }
(	'CALL' 
)
{ after(grammarAccess.getACTIONSAccess().getCallEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getACTIONSAccess().getAnswerEnumLiteralDeclaration_1()); }
(	'ANSWER' 
)
{ after(grammarAccess.getACTIONSAccess().getAnswerEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getACTIONSAccess().getUssdEnumLiteralDeclaration_2()); }
(	'USSD' 
)
{ after(grammarAccess.getACTIONSAccess().getUssdEnumLiteralDeclaration_2()); }
)

    |(
{ before(grammarAccess.getACTIONSAccess().getSmsEnumLiteralDeclaration_3()); }
(	'SMS' 
)
{ after(grammarAccess.getACTIONSAccess().getSmsEnumLiteralDeclaration_3()); }
)

    |(
{ before(grammarAccess.getACTIONSAccess().getDataEnumLiteralDeclaration_4()); }
(	'DATA' 
)
{ after(grammarAccess.getACTIONSAccess().getDataEnumLiteralDeclaration_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__DragonX__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DragonX__Group__0__Impl
	rule__DragonX__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DragonX__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getDragonXAccess().getUesAssignment_0()); }
(rule__DragonX__UesAssignment_0)
{ after(grammarAccess.getDragonXAccess().getUesAssignment_0()); }
)
(
{ before(grammarAccess.getDragonXAccess().getUesAssignment_0()); }
(rule__DragonX__UesAssignment_0)*
{ after(grammarAccess.getDragonXAccess().getUesAssignment_0()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DragonX__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DragonX__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DragonX__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getDragonXAccess().getTestsAssignment_1()); }
(rule__DragonX__TestsAssignment_1)
{ after(grammarAccess.getDragonXAccess().getTestsAssignment_1()); }
)
(
{ before(grammarAccess.getDragonXAccess().getTestsAssignment_1()); }
(rule__DragonX__TestsAssignment_1)*
{ after(grammarAccess.getDragonXAccess().getTestsAssignment_1()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}






rule__UE__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UE__Group__0__Impl
	rule__UE__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UE__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUEAccess().getUEKeyword_0()); }

	'UE' 

{ after(grammarAccess.getUEAccess().getUEKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UE__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UE__Group__1__Impl
	rule__UE__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__UE__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUEAccess().getLeftCurlyBracketKeyword_1()); }

	'{' 

{ after(grammarAccess.getUEAccess().getLeftCurlyBracketKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UE__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UE__Group__2__Impl
	rule__UE__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__UE__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getUEAccess().getMetaAssignment_2()); }
(rule__UE__MetaAssignment_2)
{ after(grammarAccess.getUEAccess().getMetaAssignment_2()); }
)
(
{ before(grammarAccess.getUEAccess().getMetaAssignment_2()); }
(rule__UE__MetaAssignment_2)*
{ after(grammarAccess.getUEAccess().getMetaAssignment_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UE__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UE__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UE__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUEAccess().getRightCurlyBracketKeyword_3()); }

	'}' 

{ after(grammarAccess.getUEAccess().getRightCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__UEMetaObject__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UEMetaObject__Group__0__Impl
	rule__UEMetaObject__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UEMetaObject__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUEMetaObjectAccess().getParamsAssignment_0()); }
(rule__UEMetaObject__ParamsAssignment_0)
{ after(grammarAccess.getUEMetaObjectAccess().getParamsAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UEMetaObject__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UEMetaObject__Group__1__Impl
	rule__UEMetaObject__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__UEMetaObject__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUEMetaObjectAccess().getColonKeyword_1()); }

	':' 

{ after(grammarAccess.getUEMetaObjectAccess().getColonKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__UEMetaObject__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UEMetaObject__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UEMetaObject__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUEMetaObjectAccess().getParamValueAssignment_2()); }
(rule__UEMetaObject__ParamValueAssignment_2)
{ after(grammarAccess.getUEMetaObjectAccess().getParamValueAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__TestCase__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TestCase__Group__0__Impl
	rule__TestCase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TestCase__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTestCaseAccess().getTestCaseKeyword_0()); }

	'TestCase' 

{ after(grammarAccess.getTestCaseAccess().getTestCaseKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TestCase__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TestCase__Group__1__Impl
	rule__TestCase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TestCase__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTestCaseAccess().getLeftCurlyBracketKeyword_1()); }

	'{' 

{ after(grammarAccess.getTestCaseAccess().getLeftCurlyBracketKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TestCase__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TestCase__Group__2__Impl
	rule__TestCase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TestCase__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTestCaseAccess().getNameAssignment_2()); }
(rule__TestCase__NameAssignment_2)
{ after(grammarAccess.getTestCaseAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TestCase__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TestCase__Group__3__Impl
	rule__TestCase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TestCase__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTestCaseAccess().getMetaAssignment_3()); }
(rule__TestCase__MetaAssignment_3)
{ after(grammarAccess.getTestCaseAccess().getMetaAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TestCase__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TestCase__Group__4__Impl
	rule__TestCase__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TestCase__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTestCaseAccess().getProcedureAssignment_4()); }
(rule__TestCase__ProcedureAssignment_4)
{ after(grammarAccess.getTestCaseAccess().getProcedureAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TestCase__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TestCase__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TestCase__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTestCaseAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getTestCaseAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__TestMetaObject__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TestMetaObject__Group__0__Impl
	rule__TestMetaObject__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TestMetaObject__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTestMetaObjectAccess().getMetatypeAssignment_0()); }
(rule__TestMetaObject__MetatypeAssignment_0)
{ after(grammarAccess.getTestMetaObjectAccess().getMetatypeAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TestMetaObject__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TestMetaObject__Group__1__Impl
	rule__TestMetaObject__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TestMetaObject__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTestMetaObjectAccess().getColonKeyword_1()); }

	':' 

{ after(grammarAccess.getTestMetaObjectAccess().getColonKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TestMetaObject__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TestMetaObject__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TestMetaObject__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTestMetaObjectAccess().getMetaValueAssignment_2()); }
(rule__TestMetaObject__MetaValueAssignment_2)
{ after(grammarAccess.getTestMetaObjectAccess().getMetaValueAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Procedure__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Procedure__Group__0__Impl
	rule__Procedure__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Procedure__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProcedureAccess().getTestKeyword_0()); }

	'Test' 

{ after(grammarAccess.getProcedureAccess().getTestKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Procedure__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Procedure__Group__1__Impl
	rule__Procedure__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Procedure__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProcedureAccess().getLeftCurlyBracketKeyword_1()); }

	'{' 

{ after(grammarAccess.getProcedureAccess().getLeftCurlyBracketKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Procedure__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Procedure__Group__2__Impl
	rule__Procedure__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Procedure__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProcedureAccess().getActionsAssignment_2()); }
(rule__Procedure__ActionsAssignment_2)
{ after(grammarAccess.getProcedureAccess().getActionsAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Procedure__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Procedure__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Procedure__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProcedureAccess().getRightCurlyBracketKeyword_3()); }

	'}' 

{ after(grammarAccess.getProcedureAccess().getRightCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Action__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Action__Group__0__Impl
	rule__Action__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActionAccess().getNameAssignment_0()); }
(rule__Action__NameAssignment_0)
{ after(grammarAccess.getActionAccess().getNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Action__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Action__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActionAccess().getParameterSetAssignment_1()); }
(rule__Action__ParameterSetAssignment_1)
{ after(grammarAccess.getActionAccess().getParameterSetAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ParameterSet__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ParameterSet__Group__0__Impl
	rule__ParameterSet__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSet__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterSetAccess().getLeftCurlyBracketKeyword_0()); }

	'{' 

{ after(grammarAccess.getParameterSetAccess().getLeftCurlyBracketKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ParameterSet__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ParameterSet__Group__1__Impl
	rule__ParameterSet__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSet__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getParameterSetAccess().getParametersAssignment_1()); }
(rule__ParameterSet__ParametersAssignment_1)
{ after(grammarAccess.getParameterSetAccess().getParametersAssignment_1()); }
)
(
{ before(grammarAccess.getParameterSetAccess().getParametersAssignment_1()); }
(rule__ParameterSet__ParametersAssignment_1)*
{ after(grammarAccess.getParameterSetAccess().getParametersAssignment_1()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ParameterSet__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ParameterSet__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSet__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterSetAccess().getRightCurlyBracketKeyword_2()); }

	'}' 

{ after(grammarAccess.getParameterSetAccess().getRightCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Parameter__Group_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Parameter__Group_0__0__Impl
	rule__Parameter__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getNameAssignment_0_0()); }
(rule__Parameter__NameAssignment_0_0)
{ after(grammarAccess.getParameterAccess().getNameAssignment_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Parameter__Group_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Parameter__Group_0__1__Impl
	rule__Parameter__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getSpaceColonSpaceKeyword_0_1()); }

	' : ' 

{ after(grammarAccess.getParameterAccess().getSpaceColonSpaceKeyword_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Parameter__Group_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Parameter__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getValueAssignment_0_2()); }
(rule__Parameter__ValueAssignment_0_2)
{ after(grammarAccess.getParameterAccess().getValueAssignment_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}











rule__DragonX__UesAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDragonXAccess().getUesUEParserRuleCall_0_0()); }
	ruleUE{ after(grammarAccess.getDragonXAccess().getUesUEParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DragonX__TestsAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDragonXAccess().getTestsTestCaseParserRuleCall_1_0()); }
	ruleTestCase{ after(grammarAccess.getDragonXAccess().getTestsTestCaseParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__UE__MetaAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUEAccess().getMetaUEMetaObjectParserRuleCall_2_0()); }
	ruleUEMetaObject{ after(grammarAccess.getUEAccess().getMetaUEMetaObjectParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__UEMetaObject__ParamsAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUEMetaObjectAccess().getParamsUEPARAMSEnumRuleCall_0_0()); }
	ruleUEPARAMS{ after(grammarAccess.getUEMetaObjectAccess().getParamsUEPARAMSEnumRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__UEMetaObject__ParamValueAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getUEMetaObjectAccess().getParamValueUEValueParserRuleCall_2_0()); }
	ruleUEValue{ after(grammarAccess.getUEMetaObjectAccess().getParamValueUEValueParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TestCase__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTestCaseAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getTestCaseAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TestCase__MetaAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTestCaseAccess().getMetaTestMetaParserRuleCall_3_0()); }
	ruleTestMeta{ after(grammarAccess.getTestCaseAccess().getMetaTestMetaParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TestCase__ProcedureAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTestCaseAccess().getProcedureProcedureParserRuleCall_4_0()); }
	ruleProcedure{ after(grammarAccess.getTestCaseAccess().getProcedureProcedureParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TestMeta__MetaAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTestMetaAccess().getMetaTestMetaObjectParserRuleCall_0()); }
	ruleTestMetaObject{ after(grammarAccess.getTestMetaAccess().getMetaTestMetaObjectParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TestMetaObject__MetatypeAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTestMetaObjectAccess().getMetatypeMETATYPEEnumRuleCall_0_0()); }
	ruleMETATYPE{ after(grammarAccess.getTestMetaObjectAccess().getMetatypeMETATYPEEnumRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TestMetaObject__MetaValueAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTestMetaObjectAccess().getMetaValueMetaValueParserRuleCall_2_0()); }
	ruleMetaValue{ after(grammarAccess.getTestMetaObjectAccess().getMetaValueMetaValueParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Procedure__ActionsAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getProcedureAccess().getActionsActionParserRuleCall_2_0()); }
	ruleAction{ after(grammarAccess.getProcedureAccess().getActionsActionParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Action__NameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActionAccess().getNameACTIONSEnumRuleCall_0_0()); }
	ruleACTIONS{ after(grammarAccess.getActionAccess().getNameACTIONSEnumRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Action__ParameterSetAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActionAccess().getParameterSetParameterSetParserRuleCall_1_0()); }
	ruleParameterSet{ after(grammarAccess.getActionAccess().getParameterSetParameterSetParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterSet__ParametersAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterSetAccess().getParametersParameterParserRuleCall_1_0()); }
	ruleParameter{ after(grammarAccess.getParameterSetAccess().getParametersParameterParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__NameAssignment_0_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getNameACTIONPARAMSEnumRuleCall_0_0_0()); }
	ruleACTIONPARAMS{ after(grammarAccess.getParameterAccess().getNameACTIONPARAMSEnumRuleCall_0_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__ValueAssignment_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getValueParameterValueParserRuleCall_0_2_0()); }
	ruleParameterValue{ after(grammarAccess.getParameterAccess().getValueParameterValueParserRuleCall_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__UeRefAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParameterAccess().getUeRefUECrossReference_1_0()); }
(
{ before(grammarAccess.getParameterAccess().getUeRefUEIDTerminalRuleCall_1_0_1()); }
	RULE_ID{ after(grammarAccess.getParameterAccess().getUeRefUEIDTerminalRuleCall_1_0_1()); }
)
{ after(grammarAccess.getParameterAccess().getUeRefUECrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


