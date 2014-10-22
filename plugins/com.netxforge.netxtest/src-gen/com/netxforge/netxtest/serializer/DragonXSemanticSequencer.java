package com.netxforge.netxtest.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.netxforge.netxtest.dragonX.Action;
import com.netxforge.netxtest.dragonX.DescriptionObject;
import com.netxforge.netxtest.dragonX.DragonX;
import com.netxforge.netxtest.dragonX.DragonXPackage;
import com.netxforge.netxtest.dragonX.ParameterAnswer;
import com.netxforge.netxtest.dragonX.ParameterCall;
import com.netxforge.netxtest.dragonX.ParameterData;
import com.netxforge.netxtest.dragonX.ParameterMixer;
import com.netxforge.netxtest.dragonX.ParameterSetAnswer;
import com.netxforge.netxtest.dragonX.ParameterSetCall;
import com.netxforge.netxtest.dragonX.ParameterSetData;
import com.netxforge.netxtest.dragonX.ParameterSetMixer;
import com.netxforge.netxtest.dragonX.ParameterSetSms;
import com.netxforge.netxtest.dragonX.ParameterSetUssd;
import com.netxforge.netxtest.dragonX.ParameterSms;
import com.netxforge.netxtest.dragonX.ParameterUssd;
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
			case DragonXPackage.PARAMETER_ANSWER:
				if(context == grammarAccess.getParameterAnswerRule()) {
					sequence_ParameterAnswer(context, (ParameterAnswer) semanticObject); 
					return; 
				}
				else break;
			case DragonXPackage.PARAMETER_CALL:
				if(context == grammarAccess.getParameterCallRule()) {
					sequence_ParameterCall(context, (ParameterCall) semanticObject); 
					return; 
				}
				else break;
			case DragonXPackage.PARAMETER_DATA:
				if(context == grammarAccess.getParameterDataRule()) {
					sequence_ParameterData(context, (ParameterData) semanticObject); 
					return; 
				}
				else break;
			case DragonXPackage.PARAMETER_MIXER:
				if(context == grammarAccess.getParameterMixerRule()) {
					sequence_ParameterMixer(context, (ParameterMixer) semanticObject); 
					return; 
				}
				else break;
			case DragonXPackage.PARAMETER_SET_ANSWER:
				if(context == grammarAccess.getParameterSetAnswerRule()) {
					sequence_ParameterSetAnswer(context, (ParameterSetAnswer) semanticObject); 
					return; 
				}
				else break;
			case DragonXPackage.PARAMETER_SET_CALL:
				if(context == grammarAccess.getParameterSetCallRule()) {
					sequence_ParameterSetCall(context, (ParameterSetCall) semanticObject); 
					return; 
				}
				else break;
			case DragonXPackage.PARAMETER_SET_DATA:
				if(context == grammarAccess.getParameterSetDataRule()) {
					sequence_ParameterSetData(context, (ParameterSetData) semanticObject); 
					return; 
				}
				else break;
			case DragonXPackage.PARAMETER_SET_MIXER:
				if(context == grammarAccess.getParameterSetMixerRule()) {
					sequence_ParameterSetMixer(context, (ParameterSetMixer) semanticObject); 
					return; 
				}
				else break;
			case DragonXPackage.PARAMETER_SET_SMS:
				if(context == grammarAccess.getParameterSetSmsRule()) {
					sequence_ParameterSetSms(context, (ParameterSetSms) semanticObject); 
					return; 
				}
				else break;
			case DragonXPackage.PARAMETER_SET_USSD:
				if(context == grammarAccess.getParameterSetUssdRule()) {
					sequence_ParameterSetUssd(context, (ParameterSetUssd) semanticObject); 
					return; 
				}
				else break;
			case DragonXPackage.PARAMETER_SMS:
				if(context == grammarAccess.getParameterSmsRule()) {
					sequence_ParameterSms(context, (ParameterSms) semanticObject); 
					return; 
				}
				else break;
			case DragonXPackage.PARAMETER_USSD:
				if(context == grammarAccess.getParameterUssdRule()) {
					sequence_ParameterUssd(context, (ParameterUssd) semanticObject); 
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
	 *     (
	 *         (name='CALL' parameterSet=ParameterSetCall) | 
	 *         (name='ANSWER' parameterSet=ParameterSetAnswer) | 
	 *         (name='USSD' parameterSet=ParameterSetUssd) | 
	 *         (name='SMS' parameterSet=ParameterSetSms) | 
	 *         (name='DATA' parameterSet=ParameterSetData) | 
	 *         (name='MIXER' parameterSet=ParameterSetMixer)
	 *     )
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
	 *     (from=[UE|ID] listeningTime=INT answerTime=INT? response=ANSWERRESPONSE?)
	 */
	protected void sequence_ParameterAnswer(EObject context, ParameterAnswer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (from=[UE|ID] to=[UE|ID] callingTime=INT? ofhookResponse=CALLRESPONSE responseTime=INT?)
	 */
	protected void sequence_ParameterCall(EObject context, ParameterCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (from=[UE|ID] url=STRING? (to=[UE|ID] data=STRING)?)
	 */
	protected void sequence_ParameterData(EObject context, ParameterData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((mixer=MIXER value=INT) | option=MIXEROPTIONS)
	 */
	protected void sequence_ParameterMixer(EObject context, ParameterMixer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     parameters+=ParameterAnswer
	 */
	protected void sequence_ParameterSetAnswer(EObject context, ParameterSetAnswer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     parameters+=ParameterCall
	 */
	protected void sequence_ParameterSetCall(EObject context, ParameterSetCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     parameters+=ParameterData
	 */
	protected void sequence_ParameterSetData(EObject context, ParameterSetData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     parameters+=ParameterMixer+
	 */
	protected void sequence_ParameterSetMixer(EObject context, ParameterSetMixer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     parameters+=ParameterSms
	 */
	protected void sequence_ParameterSetSms(EObject context, ParameterSetSms semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     parameters+=ParameterUssd
	 */
	protected void sequence_ParameterSetUssd(EObject context, ParameterSetUssd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (from=[UE|ID] to=[UE|ID] message=STRING)
	 */
	protected void sequence_ParameterSms(EObject context, ParameterSms semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DragonXPackage.Literals.PARAMETER_SMS__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DragonXPackage.Literals.PARAMETER_SMS__FROM));
			if(transientValues.isValueTransient(semanticObject, DragonXPackage.Literals.PARAMETER_SMS__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DragonXPackage.Literals.PARAMETER_SMS__TO));
			if(transientValues.isValueTransient(semanticObject, DragonXPackage.Literals.PARAMETER_SMS__MESSAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DragonXPackage.Literals.PARAMETER_SMS__MESSAGE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterSmsAccess().getFromUEIDTerminalRuleCall_0_2_0_1(), semanticObject.getFrom());
		feeder.accept(grammarAccess.getParameterSmsAccess().getToUEIDTerminalRuleCall_1_2_0_1(), semanticObject.getTo());
		feeder.accept(grammarAccess.getParameterSmsAccess().getMessageSTRINGTerminalRuleCall_2_0(), semanticObject.getMessage());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         from=[UE|ID] 
	 *         ((cfCode=CALLFORWARDING destination=[UE|ID]? serviceDelay=INT?) | (barringCode=BARRING code=INT?) | liCode=LINEIDENTIFICATION) 
	 *         ussdregistration=USSDREGISTRATION?
	 *     )
	 */
	protected void sequence_ParameterUssd(EObject context, ParameterUssd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
