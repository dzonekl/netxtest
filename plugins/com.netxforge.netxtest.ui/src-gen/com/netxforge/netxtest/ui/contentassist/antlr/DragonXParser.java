/*
* generated by Xtext
*/
package com.netxforge.netxtest.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.netxforge.netxtest.services.DragonXGrammarAccess;

public class DragonXParser extends AbstractContentAssistParser {
	
	@Inject
	private DragonXGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.netxforge.netxtest.ui.contentassist.antlr.internal.InternalDragonXParser createParser() {
		com.netxforge.netxtest.ui.contentassist.antlr.internal.InternalDragonXParser result = new com.netxforge.netxtest.ui.contentassist.antlr.internal.InternalDragonXParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getUEValueAccess().getAlternatives(), "rule__UEValue__Alternatives");
					put(grammarAccess.getParameterAccess().getAlternatives(), "rule__Parameter__Alternatives");
					put(grammarAccess.getParameterValueAccess().getAlternatives(), "rule__ParameterValue__Alternatives");
					put(grammarAccess.getACTIONPARAMSAccess().getAlternatives(), "rule__ACTIONPARAMS__Alternatives");
					put(grammarAccess.getUEPARAMSAccess().getAlternatives(), "rule__UEPARAMS__Alternatives");
					put(grammarAccess.getACTIONSAccess().getAlternatives(), "rule__ACTIONS__Alternatives");
					put(grammarAccess.getDragonXAccess().getGroup(), "rule__DragonX__Group__0");
					put(grammarAccess.getUEAccess().getGroup(), "rule__UE__Group__0");
					put(grammarAccess.getUEMetaObjectAccess().getGroup(), "rule__UEMetaObject__Group__0");
					put(grammarAccess.getTestCaseAccess().getGroup(), "rule__TestCase__Group__0");
					put(grammarAccess.getTestMetaObjectAccess().getGroup(), "rule__TestMetaObject__Group__0");
					put(grammarAccess.getProcedureAccess().getGroup(), "rule__Procedure__Group__0");
					put(grammarAccess.getActionAccess().getGroup(), "rule__Action__Group__0");
					put(grammarAccess.getParameterSetAccess().getGroup(), "rule__ParameterSet__Group__0");
					put(grammarAccess.getParameterAccess().getGroup_0(), "rule__Parameter__Group_0__0");
					put(grammarAccess.getQUALIFIED_IDAccess().getGroup(), "rule__QUALIFIED_ID__Group__0");
					put(grammarAccess.getQUALIFIED_IDAccess().getGroup_1(), "rule__QUALIFIED_ID__Group_1__0");
					put(grammarAccess.getDragonXAccess().getUesAssignment_0(), "rule__DragonX__UesAssignment_0");
					put(grammarAccess.getDragonXAccess().getTestsAssignment_1(), "rule__DragonX__TestsAssignment_1");
					put(grammarAccess.getUEAccess().getMetaAssignment_2(), "rule__UE__MetaAssignment_2");
					put(grammarAccess.getUEMetaObjectAccess().getParamsAssignment_0(), "rule__UEMetaObject__ParamsAssignment_0");
					put(grammarAccess.getUEMetaObjectAccess().getParamValueAssignment_2(), "rule__UEMetaObject__ParamValueAssignment_2");
					put(grammarAccess.getTestCaseAccess().getNameAssignment_2(), "rule__TestCase__NameAssignment_2");
					put(grammarAccess.getTestCaseAccess().getMetaAssignment_3(), "rule__TestCase__MetaAssignment_3");
					put(grammarAccess.getTestCaseAccess().getProcedureAssignment_4(), "rule__TestCase__ProcedureAssignment_4");
					put(grammarAccess.getTestMetaAccess().getMetaAssignment(), "rule__TestMeta__MetaAssignment");
					put(grammarAccess.getTestMetaObjectAccess().getMetatypeAssignment_0(), "rule__TestMetaObject__MetatypeAssignment_0");
					put(grammarAccess.getTestMetaObjectAccess().getMetaValueAssignment_2(), "rule__TestMetaObject__MetaValueAssignment_2");
					put(grammarAccess.getProcedureAccess().getActionsAssignment_2(), "rule__Procedure__ActionsAssignment_2");
					put(grammarAccess.getActionAccess().getNameAssignment_0(), "rule__Action__NameAssignment_0");
					put(grammarAccess.getActionAccess().getParameterSetAssignment_1(), "rule__Action__ParameterSetAssignment_1");
					put(grammarAccess.getParameterSetAccess().getParametersAssignment_1(), "rule__ParameterSet__ParametersAssignment_1");
					put(grammarAccess.getParameterAccess().getNameAssignment_0_0(), "rule__Parameter__NameAssignment_0_0");
					put(grammarAccess.getParameterAccess().getValueAssignment_0_2(), "rule__Parameter__ValueAssignment_0_2");
					put(grammarAccess.getParameterAccess().getUeRefAssignment_1(), "rule__Parameter__UeRefAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.netxforge.netxtest.ui.contentassist.antlr.internal.InternalDragonXParser typedParser = (com.netxforge.netxtest.ui.contentassist.antlr.internal.InternalDragonXParser) parser;
			typedParser.entryRuleDragonX();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public DragonXGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DragonXGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
