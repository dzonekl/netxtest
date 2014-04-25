package com.netxforge.netxtest.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.netxforge.netxtest.dragonX.Action;
import com.netxforge.netxtest.dragonX.DragonX;
import com.netxforge.netxtest.dragonX.DragonXPackage;
import com.netxforge.netxtest.dragonX.Parameter;
import com.netxforge.netxtest.dragonX.ParameterSet;
import com.netxforge.netxtest.dragonX.Procedure;
import com.netxforge.netxtest.dragonX.TestCase;
import com.netxforge.netxtest.dragonX.TestMeta;
import com.netxforge.netxtest.dragonX.TestMetaObject;
import com.netxforge.netxtest.dragonX.UE;
import com.netxforge.netxtest.dragonX.UEMetaObject;
import com.netxforge.netxtest.services.DragonXGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class DragonXSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DragonXGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DragonXPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DragonXPackage.ACTION:
				if(context == grammarAccess.getActionRule()) {
					sequence_Action(context, (Action) semanticObject); 
					return; 
				}
				else break;
			case DragonXPackage.DRAGON_X:
				if(context == grammarAccess.getDragonXRule()) {
					sequence_DragonX(context, (DragonX) semanticObject); 
					return; 
				}
				else break;
			case DragonXPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case DragonXPackage.PARAMETER_SET:
				if(context == grammarAccess.getParameterSetRule()) {
					sequence_ParameterSet(context, (ParameterSet) semanticObject); 
					return; 
				}
				else break;
			case DragonXPackage.PROCEDURE:
				if(context == grammarAccess.getProcedureRule()) {
					sequence_Procedure(context, (Procedure) semanticObject); 
					return; 
				}
				else break;
			case DragonXPackage.TEST_CASE:
				if(context == grammarAccess.getTestCaseRule()) {
					sequence_TestCase(context, (TestCase) semanticObject); 
					return; 
				}
				else break;
			case DragonXPackage.TEST_META:
				if(context == grammarAccess.getTestMetaRule()) {
					sequence_TestMeta(context, (TestMeta) semanticObject); 
					return; 
				}
				else break;
			case DragonXPackage.TEST_META_OBJECT:
				if(context == grammarAccess.getTestMetaObjectRule()) {
					sequence_TestMetaObject(context, (TestMetaObject) semanticObject); 
					return; 
				}
				else break;
			case DragonXPackage.UE:
				if(context == grammarAccess.getUERule()) {
					sequence_UE(context, (UE) semanticObject); 
					return; 
				}
				else break;
			case DragonXPackage.UE_META_OBJECT:
				if(context == grammarAccess.getUEMetaObjectRule()) {
					sequence_UEMetaObject(context, (UEMetaObject) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ACTIONS parameterSet=ParameterSet)
	 */
	protected void sequence_Action(EObject context, Action semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DragonXPackage.Literals.ACTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DragonXPackage.Literals.ACTION__NAME));
			if(transientValues.isValueTransient(semanticObject, DragonXPackage.Literals.ACTION__PARAMETER_SET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DragonXPackage.Literals.ACTION__PARAMETER_SET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActionAccess().getNameACTIONSEnumRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getActionAccess().getParameterSetParameterSetParserRuleCall_1_0(), semanticObject.getParameterSet());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (ues+=UE+ tests+=TestCase+)
	 */
	protected void sequence_DragonX(EObject context, DragonX semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     parameters+=Parameter+
	 */
	protected void sequence_ParameterSet(EObject context, ParameterSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=ACTIONPARAMS value=ParameterValue) | ueRef=[UE|ID])
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     actions+=Action
	 */
	protected void sequence_Procedure(EObject context, Procedure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID meta=TestMeta procedure=Procedure)
	 */
	protected void sequence_TestCase(EObject context, TestCase semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DragonXPackage.Literals.TEST_CASE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DragonXPackage.Literals.TEST_CASE__NAME));
			if(transientValues.isValueTransient(semanticObject, DragonXPackage.Literals.TEST_CASE__META) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DragonXPackage.Literals.TEST_CASE__META));
			if(transientValues.isValueTransient(semanticObject, DragonXPackage.Literals.TEST_CASE__PROCEDURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DragonXPackage.Literals.TEST_CASE__PROCEDURE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTestCaseAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTestCaseAccess().getMetaTestMetaParserRuleCall_3_0(), semanticObject.getMeta());
		feeder.accept(grammarAccess.getTestCaseAccess().getProcedureProcedureParserRuleCall_4_0(), semanticObject.getProcedure());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (metatype=METATYPE metaValue=MetaValue)
	 */
	protected void sequence_TestMetaObject(EObject context, TestMetaObject semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DragonXPackage.Literals.TEST_META_OBJECT__METATYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DragonXPackage.Literals.TEST_META_OBJECT__METATYPE));
			if(transientValues.isValueTransient(semanticObject, DragonXPackage.Literals.TEST_META_OBJECT__META_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DragonXPackage.Literals.TEST_META_OBJECT__META_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTestMetaObjectAccess().getMetatypeMETATYPEEnumRuleCall_0_0(), semanticObject.getMetatype());
		feeder.accept(grammarAccess.getTestMetaObjectAccess().getMetaValueMetaValueParserRuleCall_2_0(), semanticObject.getMetaValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     meta+=TestMetaObject+
	 */
	protected void sequence_TestMeta(EObject context, TestMeta semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (params=UEPARAMS paramValue=UEValue)
	 */
	protected void sequence_UEMetaObject(EObject context, UEMetaObject semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DragonXPackage.Literals.UE_META_OBJECT__PARAMS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DragonXPackage.Literals.UE_META_OBJECT__PARAMS));
			if(transientValues.isValueTransient(semanticObject, DragonXPackage.Literals.UE_META_OBJECT__PARAM_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DragonXPackage.Literals.UE_META_OBJECT__PARAM_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUEMetaObjectAccess().getParamsUEPARAMSEnumRuleCall_0_0(), semanticObject.getParams());
		feeder.accept(grammarAccess.getUEMetaObjectAccess().getParamValueUEValueParserRuleCall_2_0(), semanticObject.getParamValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     meta+=UEMetaObject+
	 */
	protected void sequence_UE(EObject context, UE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
