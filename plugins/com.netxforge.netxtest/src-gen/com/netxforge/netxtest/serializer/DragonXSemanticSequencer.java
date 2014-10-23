package com.netxforge.netxtest.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.netxforge.netxtest.dragonX.Action;
import com.netxforge.netxtest.dragonX.DescriptionObject;
import com.netxforge.netxtest.dragonX.DragonX;
import com.netxforge.netxtest.dragonX.DragonXPackage;
import com.netxforge.netxtest.dragonX.ParamResponseType;
import com.netxforge.netxtest.dragonX.ParamType;
import com.netxforge.netxtest.dragonX.Parameter;
import com.netxforge.netxtest.dragonX.Procedure;
import com.netxforge.netxtest.dragonX.TestCase;
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
			case DragonXPackage.DESCRIPTION_OBJECT:
				if(context == grammarAccess.getDescriptionObjectRule() ||
				   context == grammarAccess.getUEMetaObjectRule()) {
					sequence_DescriptionObject(context, (DescriptionObject) semanticObject); 
					return; 
				}
				else break;
			case DragonXPackage.DRAGON_X:
				if(context == grammarAccess.getDragonXRule()) {
					sequence_DragonX(context, (DragonX) semanticObject); 
					return; 
				}
				else break;
			case DragonXPackage.PARAM_RESPONSE_TYPE:
				if(context == grammarAccess.getParamResponseTypeRule()) {
					sequence_ParamResponseType(context, (ParamResponseType) semanticObject); 
					return; 
				}
				else break;
			case DragonXPackage.PARAM_TYPE:
				if(context == grammarAccess.getParamTypeRule()) {
					sequence_ParamType(context, (ParamType) semanticObject); 
					return; 
				}
				else break;
			case DragonXPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
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
	 *     (actionCode=ACTIONCODE | parameterSet+=Parameter)
	 */
	protected void sequence_Action(EObject context, Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     description=STRING
	 */
	protected void sequence_DescriptionObject(EObject context, DescriptionObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     paramResponse+=PARAM_RESPONSE+
	 */
	protected void sequence_ParamResponseType(EObject context, ParamResponseType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ueRef=[UE|ID] | value=INT | response=ParamResponseType)
	 */
	protected void sequence_ParamType(EObject context, ParamType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=PARAM_NAME type=ParamType)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DragonXPackage.Literals.PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DragonXPackage.Literals.PARAMETER__NAME));
			if(transientValues.isValueTransient(semanticObject, DragonXPackage.Literals.PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DragonXPackage.Literals.PARAMETER__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterAccess().getNamePARAM_NAMEEnumRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParameterAccess().getTypeParamTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     actions+=Action+
	 */
	protected void sequence_Procedure(EObject context, Procedure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=DescriptionObject? procedure=Procedure)
	 */
	protected void sequence_TestCase(EObject context, TestCase semanticObject) {
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
		feeder.accept(grammarAccess.getUEMetaObjectAccess().getParamsUEPARAMSEnumRuleCall_0_0_0(), semanticObject.getParams());
		feeder.accept(grammarAccess.getUEMetaObjectAccess().getParamValueUEValueParserRuleCall_0_2_0(), semanticObject.getParamValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID meta+=UEMetaObject+)
	 */
	protected void sequence_UE(EObject context, UE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
