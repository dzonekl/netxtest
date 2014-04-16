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
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getACTIONSAccess().getAlternatives(), "rule__ACTIONS__Alternatives");
					put(grammarAccess.getTestAccess().getGroup(), "rule__Test__Group__0");
					put(grammarAccess.getTestMetaObjectAccess().getGroup(), "rule__TestMetaObject__Group__0");
					put(grammarAccess.getActionAccess().getGroup(), "rule__Action__Group__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getDragonXAccess().getTestsAssignment(), "rule__DragonX__TestsAssignment");
					put(grammarAccess.getTestAccess().getNameAssignment_1(), "rule__Test__NameAssignment_1");
					put(grammarAccess.getTestAccess().getMetaAssignment_2(), "rule__Test__MetaAssignment_2");
					put(grammarAccess.getTestAccess().getProcedureAssignment_3(), "rule__Test__ProcedureAssignment_3");
					put(grammarAccess.getTestMetaAccess().getMetaAssignment(), "rule__TestMeta__MetaAssignment");
					put(grammarAccess.getTestMetaObjectAccess().getMetatypeAssignment_1(), "rule__TestMetaObject__MetatypeAssignment_1");
					put(grammarAccess.getTestMetaObjectAccess().getMetaValueAssignment_3(), "rule__TestMetaObject__MetaValueAssignment_3");
					put(grammarAccess.getProcedureAccess().getActionsAssignment(), "rule__Procedure__ActionsAssignment");
					put(grammarAccess.getActionAccess().getActionAssignment_0(), "rule__Action__ActionAssignment_0");
					put(grammarAccess.getActionAccess().getParametersAssignment_1(), "rule__Action__ParametersAssignment_1");
					put(grammarAccess.getParameterAccess().getNameAssignment_1(), "rule__Parameter__NameAssignment_1");
					put(grammarAccess.getParameterAccess().getValueAssignment_3(), "rule__Parameter__ValueAssignment_3");
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
