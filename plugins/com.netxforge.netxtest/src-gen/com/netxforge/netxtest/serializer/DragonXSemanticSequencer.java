package com.netxforge.netxtest.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.netxforge.netxtest.dragonX.Action;
import com.netxforge.netxtest.dragonX.DragonX;
import com.netxforge.netxtest.dragonX.DragonXPackage;
import com.netxforge.netxtest.dragonX.Parameter;
import com.netxforge.netxtest.dragonX.Procedure;
import com.netxforge.netxtest.dragonX.Test;
import com.netxforge.netxtest.dragonX.TestMeta;
import com.netxforge.netxtest.dragonX.TestMetaObject;
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
			case DragonXPackage.PROCEDURE:
				if(context == grammarAccess.getProcedureRule()) {
					sequence_Procedure(context, (Procedure) semanticObject); 
					return; 
				}
				else break;
			case DragonXPackage.TEST:
				if(context == grammarAccess.getTestRule()) {
					sequence_Test(context, (Test) semanticObject); 
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
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (action=ACTIONS parameters+=Parameter)
	 */
	protected void sequence_Action(EObject context, Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     tests+=Test*
	 */
	protected void sequence_DragonX(EObject context, DragonX semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=Value)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DragonXPackage.Literals.PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DragonXPackage.Literals.PARAMETER__NAME));
			if(transientValues.isValueTransient(semanticObject, DragonXPackage.Literals.PARAMETER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DragonXPackage.Literals.PARAMETER__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParameterAccess().getValueValueParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
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
		feeder.accept(grammarAccess.getTestMetaObjectAccess().getMetatypeMETATYPEEnumRuleCall_1_0(), semanticObject.getMetatype());
		feeder.accept(grammarAccess.getTestMetaObjectAccess().getMetaValueMetaValueParserRuleCall_3_0(), semanticObject.getMetaValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     meta+=TestMetaObject
	 */
	protected void sequence_TestMeta(EObject context, TestMeta semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID meta=TestMeta procedure=Procedure)
	 */
	protected void sequence_Test(EObject context, Test semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DragonXPackage.Literals.TEST__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DragonXPackage.Literals.TEST__NAME));
			if(transientValues.isValueTransient(semanticObject, DragonXPackage.Literals.TEST__META) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DragonXPackage.Literals.TEST__META));
			if(transientValues.isValueTransient(semanticObject, DragonXPackage.Literals.TEST__PROCEDURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DragonXPackage.Literals.TEST__PROCEDURE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTestAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTestAccess().getMetaTestMetaParserRuleCall_2_0(), semanticObject.getMeta());
		feeder.accept(grammarAccess.getTestAccess().getProcedureProcedureParserRuleCall_3_0(), semanticObject.getProcedure());
		feeder.finish();
	}
}
