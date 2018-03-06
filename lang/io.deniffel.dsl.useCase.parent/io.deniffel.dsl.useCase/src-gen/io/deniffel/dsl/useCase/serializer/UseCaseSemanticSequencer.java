/*
 * generated by Xtext 2.13.0
 */
package io.deniffel.dsl.useCase.serializer;

import com.google.inject.Inject;
import io.deniffel.dsl.useCase.services.UseCaseGrammarAccess;
import io.deniffel.dsl.useCase.useCase.AllowedUserGroup;
import io.deniffel.dsl.useCase.useCase.AllowedUserGroups;
import io.deniffel.dsl.useCase.useCase.Description;
import io.deniffel.dsl.useCase.useCase.Input;
import io.deniffel.dsl.useCase.useCase.Inputs;
import io.deniffel.dsl.useCase.useCase.Model;
import io.deniffel.dsl.useCase.useCase.Notes;
import io.deniffel.dsl.useCase.useCase.Output;
import io.deniffel.dsl.useCase.useCase.Outputs;
import io.deniffel.dsl.useCase.useCase.Type;
import io.deniffel.dsl.useCase.useCase.UseCase;
import io.deniffel.dsl.useCase.useCase.UseCasePackage;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class UseCaseSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private UseCaseGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == UseCasePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case UseCasePackage.ALLOWED_USER_GROUP:
				sequence_AllowedUserGroup(context, (AllowedUserGroup) semanticObject); 
				return; 
			case UseCasePackage.ALLOWED_USER_GROUPS:
				sequence_AllowedUserGroups(context, (AllowedUserGroups) semanticObject); 
				return; 
			case UseCasePackage.DESCRIPTION:
				sequence_Description(context, (Description) semanticObject); 
				return; 
			case UseCasePackage.INPUT:
				sequence_Input(context, (Input) semanticObject); 
				return; 
			case UseCasePackage.INPUTS:
				sequence_Inputs(context, (Inputs) semanticObject); 
				return; 
			case UseCasePackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case UseCasePackage.NOTES:
				sequence_Notes(context, (Notes) semanticObject); 
				return; 
			case UseCasePackage.OUTPUT:
				sequence_Output(context, (Output) semanticObject); 
				return; 
			case UseCasePackage.OUTPUTS:
				sequence_Outputs(context, (Outputs) semanticObject); 
				return; 
			case UseCasePackage.TYPE:
				sequence_Type(context, (Type) semanticObject); 
				return; 
			case UseCasePackage.USE_CASE:
				sequence_UseCase(context, (UseCase) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AllowedUserGroup returns AllowedUserGroup
	 *
	 * Constraint:
	 *     (many?='many'? name=STRING type=[Type|ID]?)
	 */
	protected void sequence_AllowedUserGroup(ISerializationContext context, AllowedUserGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AllowedUserGroups returns AllowedUserGroups
	 *
	 * Constraint:
	 *     groups+=AllowedUserGroup+
	 */
	protected void sequence_AllowedUserGroups(ISerializationContext context, AllowedUserGroups semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Description returns Description
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_Description(ISerializationContext context, Description semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UseCasePackage.Literals.DESCRIPTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UseCasePackage.Literals.DESCRIPTION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDescriptionAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Input returns Input
	 *
	 * Constraint:
	 *     (many?='many'? content=STRING type=[Type|ID]?)
	 */
	protected void sequence_Input(ISerializationContext context, Input semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Inputs returns Inputs
	 *
	 * Constraint:
	 *     inputs+=Input+
	 */
	protected void sequence_Inputs(ISerializationContext context, Inputs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     ((types+=Type+ useCases+=UseCase+) | useCases+=UseCase+)?
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Notes returns Notes
	 *
	 * Constraint:
	 *     content=STRING
	 */
	protected void sequence_Notes(ISerializationContext context, Notes semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UseCasePackage.Literals.NOTES__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UseCasePackage.Literals.NOTES__CONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNotesAccess().getContentSTRINGTerminalRuleCall_1_0(), semanticObject.getContent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Output returns Output
	 *
	 * Constraint:
	 *     (many?='many'? content=STRING type=[Type|ID]?)
	 */
	protected void sequence_Output(ISerializationContext context, Output semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Outputs returns Outputs
	 *
	 * Constraint:
	 *     outputs+=Output+
	 */
	protected void sequence_Outputs(ISerializationContext context, Outputs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Type
	 *
	 * Constraint:
	 *     (name=ID description=STRING importInfo=QualifiedName?)
	 */
	protected void sequence_Type(ISerializationContext context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UseCase returns UseCase
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         descriptions+=Description? 
	 *         inputs+=Inputs? 
	 *         outputs+=Outputs? 
	 *         allowedUserGroups+=AllowedUserGroups? 
	 *         notes+=Notes?
	 *     )
	 */
	protected void sequence_UseCase(ISerializationContext context, UseCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
