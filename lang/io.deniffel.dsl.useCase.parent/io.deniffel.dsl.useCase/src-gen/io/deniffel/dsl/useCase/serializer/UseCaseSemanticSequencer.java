/*
 * generated by Xtext 2.13.0
 */
package io.deniffel.dsl.useCase.serializer;

import com.google.inject.Inject;
import io.deniffel.dsl.useCase.services.UseCaseGrammarAccess;
import io.deniffel.dsl.useCase.useCase.AllowedUserGroup;
import io.deniffel.dsl.useCase.useCase.AllowedUserGroups;
import io.deniffel.dsl.useCase.useCase.BooleanCondition;
import io.deniffel.dsl.useCase.useCase.Condition;
import io.deniffel.dsl.useCase.useCase.Description;
import io.deniffel.dsl.useCase.useCase.Example;
import io.deniffel.dsl.useCase.useCase.ExceptionDecleration;
import io.deniffel.dsl.useCase.useCase.Given;
import io.deniffel.dsl.useCase.useCase.GivenAnd;
import io.deniffel.dsl.useCase.useCase.IfStatement;
import io.deniffel.dsl.useCase.useCase.Input;
import io.deniffel.dsl.useCase.useCase.Inputs;
import io.deniffel.dsl.useCase.useCase.Loop;
import io.deniffel.dsl.useCase.useCase.Model;
import io.deniffel.dsl.useCase.useCase.Notes;
import io.deniffel.dsl.useCase.useCase.OptionalInputs;
import io.deniffel.dsl.useCase.useCase.Output;
import io.deniffel.dsl.useCase.useCase.Outputs;
import io.deniffel.dsl.useCase.useCase.PackagePart;
import io.deniffel.dsl.useCase.useCase.PreConditions;
import io.deniffel.dsl.useCase.useCase.RaiseErrorConditional;
import io.deniffel.dsl.useCase.useCase.RaiseErrorNow;
import io.deniffel.dsl.useCase.useCase.Step;
import io.deniffel.dsl.useCase.useCase.Steps;
import io.deniffel.dsl.useCase.useCase.Then;
import io.deniffel.dsl.useCase.useCase.ThenAnd;
import io.deniffel.dsl.useCase.useCase.Type;
import io.deniffel.dsl.useCase.useCase.UseCase;
import io.deniffel.dsl.useCase.useCase.UseCasePackage;
import io.deniffel.dsl.useCase.useCase.UsedExceptions;
import io.deniffel.dsl.useCase.useCase.UsedTypes;
import io.deniffel.dsl.useCase.useCase.When;
import io.deniffel.dsl.useCase.useCase.WhenAnd;
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
			case UseCasePackage.BOOLEAN_CONDITION:
				sequence_BooleanCondition(context, (BooleanCondition) semanticObject); 
				return; 
			case UseCasePackage.CONDITION:
				sequence_Condition(context, (Condition) semanticObject); 
				return; 
			case UseCasePackage.DESCRIPTION:
				sequence_Description(context, (Description) semanticObject); 
				return; 
			case UseCasePackage.EXAMPLE:
				sequence_Example(context, (Example) semanticObject); 
				return; 
			case UseCasePackage.EXCEPTION:
				sequence_Exception(context, (io.deniffel.dsl.useCase.useCase.Exception) semanticObject); 
				return; 
			case UseCasePackage.EXCEPTION_DECLERATION:
				sequence_ExceptionDecleration(context, (ExceptionDecleration) semanticObject); 
				return; 
			case UseCasePackage.GIVEN:
				sequence_Given(context, (Given) semanticObject); 
				return; 
			case UseCasePackage.GIVEN_AND:
				sequence_GivenAnd(context, (GivenAnd) semanticObject); 
				return; 
			case UseCasePackage.IF_STATEMENT:
				sequence_IfStatement(context, (IfStatement) semanticObject); 
				return; 
			case UseCasePackage.INPUT:
				sequence_Input(context, (Input) semanticObject); 
				return; 
			case UseCasePackage.INPUTS:
				sequence_Inputs(context, (Inputs) semanticObject); 
				return; 
			case UseCasePackage.LOOP:
				sequence_Loop(context, (Loop) semanticObject); 
				return; 
			case UseCasePackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case UseCasePackage.NOTES:
				sequence_Notes(context, (Notes) semanticObject); 
				return; 
			case UseCasePackage.OPTIONAL_INPUTS:
				sequence_OptionalInputs(context, (OptionalInputs) semanticObject); 
				return; 
			case UseCasePackage.OUTPUT:
				sequence_Output(context, (Output) semanticObject); 
				return; 
			case UseCasePackage.OUTPUTS:
				sequence_Outputs(context, (Outputs) semanticObject); 
				return; 
			case UseCasePackage.PACKAGE:
				sequence_Package(context, (io.deniffel.dsl.useCase.useCase.Package) semanticObject); 
				return; 
			case UseCasePackage.PACKAGE_PART:
				sequence_PackagePart(context, (PackagePart) semanticObject); 
				return; 
			case UseCasePackage.PRE_CONDITIONS:
				sequence_PreConditions(context, (PreConditions) semanticObject); 
				return; 
			case UseCasePackage.RAISE_ERROR_CONDITIONAL:
				sequence_RaiseErrorConditional(context, (RaiseErrorConditional) semanticObject); 
				return; 
			case UseCasePackage.RAISE_ERROR_NOW:
				sequence_RaiseErrorNow(context, (RaiseErrorNow) semanticObject); 
				return; 
			case UseCasePackage.STEP:
				sequence_Step(context, (Step) semanticObject); 
				return; 
			case UseCasePackage.STEPS:
				sequence_Steps(context, (Steps) semanticObject); 
				return; 
			case UseCasePackage.THEN:
				sequence_Then(context, (Then) semanticObject); 
				return; 
			case UseCasePackage.THEN_AND:
				sequence_ThenAnd(context, (ThenAnd) semanticObject); 
				return; 
			case UseCasePackage.TYPE:
				sequence_Type(context, (Type) semanticObject); 
				return; 
			case UseCasePackage.USE_CASE:
				sequence_UseCase(context, (UseCase) semanticObject); 
				return; 
			case UseCasePackage.USED_EXCEPTIONS:
				sequence_UsedExceptions(context, (UsedExceptions) semanticObject); 
				return; 
			case UseCasePackage.USED_TYPES:
				sequence_UsedTypes(context, (UsedTypes) semanticObject); 
				return; 
			case UseCasePackage.WHEN:
				sequence_When(context, (When) semanticObject); 
				return; 
			case UseCasePackage.WHEN_AND:
				sequence_WhenAnd(context, (WhenAnd) semanticObject); 
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
	 *     BooleanCondition returns BooleanCondition
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_BooleanCondition(ISerializationContext context, BooleanCondition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UseCasePackage.Literals.BOOLEAN_CONDITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UseCasePackage.Literals.BOOLEAN_CONDITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBooleanConditionAccess().getNameSTRINGTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns Condition
	 *
	 * Constraint:
	 *     content=STRING
	 */
	protected void sequence_Condition(ISerializationContext context, Condition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UseCasePackage.Literals.CONDITION__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UseCasePackage.Literals.CONDITION__CONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConditionAccess().getContentSTRINGTerminalRuleCall_1_0(), semanticObject.getContent());
		feeder.finish();
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
	 *     Example returns Example
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         description=STRING? 
	 *         given+=Given 
	 *         givenAnd+=GivenAnd* 
	 *         when+=When 
	 *         whenAnd+=WhenAnd* 
	 *         then+=Then 
	 *         thenAnd+=ThenAnd* 
	 *         explaination=STRING?
	 *     )
	 */
	protected void sequence_Example(ISerializationContext context, Example semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExceptionDecleration returns ExceptionDecleration
	 *
	 * Constraint:
	 *     (name=ID message=STRING? importInfo=QualifiedName?)
	 */
	protected void sequence_ExceptionDecleration(ISerializationContext context, ExceptionDecleration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Exception returns Exception
	 *
	 * Constraint:
	 *     type=[ExceptionDecleration|ID]
	 */
	protected void sequence_Exception(ISerializationContext context, io.deniffel.dsl.useCase.useCase.Exception semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UseCasePackage.Literals.EXCEPTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UseCasePackage.Literals.EXCEPTION__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExceptionAccess().getTypeExceptionDeclerationIDTerminalRuleCall_0_1(), semanticObject.eGet(UseCasePackage.Literals.EXCEPTION__TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GivenAnd returns GivenAnd
	 *
	 * Constraint:
	 *     content=STRING
	 */
	protected void sequence_GivenAnd(ISerializationContext context, GivenAnd semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UseCasePackage.Literals.GIVEN_AND__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UseCasePackage.Literals.GIVEN_AND__CONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGivenAndAccess().getContentSTRINGTerminalRuleCall_1_0(), semanticObject.getContent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Given returns Given
	 *
	 * Constraint:
	 *     content=STRING
	 */
	protected void sequence_Given(ISerializationContext context, Given semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UseCasePackage.Literals.GIVEN__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UseCasePackage.Literals.GIVEN__CONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGivenAccess().getContentSTRINGTerminalRuleCall_1_0(), semanticObject.getContent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     IfStatement returns IfStatement
	 *
	 * Constraint:
	 *     condition=BooleanCondition
	 */
	protected void sequence_IfStatement(ISerializationContext context, IfStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UseCasePackage.Literals.IF_STATEMENT__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UseCasePackage.Literals.IF_STATEMENT__CONDITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIfStatementAccess().getConditionBooleanConditionParserRuleCall_1_0(), semanticObject.getCondition());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Input returns Input
	 *
	 * Constraint:
	 *     (many?='many'? optional=Optional? content=STRING type=[Type|ID]? example=STRING?)
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
	 *     Loop returns Loop
	 *
	 * Constraint:
	 *     condition=BooleanCondition
	 */
	protected void sequence_Loop(ISerializationContext context, Loop semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UseCasePackage.Literals.LOOP__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UseCasePackage.Literals.LOOP__CONDITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLoopAccess().getConditionBooleanConditionParserRuleCall_1_0(), semanticObject.getCondition());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (
	 *         company=QualifiedName 
	 *         package=Package 
	 *         useCases+=UseCase* 
	 *         types=UsedTypes? 
	 *         exceptions=UsedExceptions? 
	 *         examples+=Example*
	 *     )
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
	 *     OptionalInputs returns OptionalInputs
	 *
	 * Constraint:
	 *     inputs+=Input+
	 */
	protected void sequence_OptionalInputs(ISerializationContext context, OptionalInputs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Output returns Output
	 *
	 * Constraint:
	 *     (many?='many'? content=STRING type=[Type|ID]? example=STRING?)
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
	 *     PackagePart returns PackagePart
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_PackagePart(ISerializationContext context, PackagePart semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UseCasePackage.Literals.PACKAGE_PART__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UseCasePackage.Literals.PACKAGE_PART__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPackagePartAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Package returns Package
	 *
	 * Constraint:
	 *     (parts+=PackagePart parts+=PackagePart*)
	 */
	protected void sequence_Package(ISerializationContext context, io.deniffel.dsl.useCase.useCase.Package semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PreConditions returns PreConditions
	 *
	 * Constraint:
	 *     conditions+=Condition+
	 */
	protected void sequence_PreConditions(ISerializationContext context, PreConditions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RaiseErrorConditional returns RaiseErrorConditional
	 *
	 * Constraint:
	 *     exception=Exception
	 */
	protected void sequence_RaiseErrorConditional(ISerializationContext context, RaiseErrorConditional semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UseCasePackage.Literals.RAISE_ERROR_CONDITIONAL__EXCEPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UseCasePackage.Literals.RAISE_ERROR_CONDITIONAL__EXCEPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRaiseErrorConditionalAccess().getExceptionExceptionParserRuleCall_2_0(), semanticObject.getException());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RaiseErrorNow returns RaiseErrorNow
	 *
	 * Constraint:
	 *     exception=Exception
	 */
	protected void sequence_RaiseErrorNow(ISerializationContext context, RaiseErrorNow semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UseCasePackage.Literals.RAISE_ERROR_NOW__EXCEPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UseCasePackage.Literals.RAISE_ERROR_NOW__EXCEPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRaiseErrorNowAccess().getExceptionExceptionParserRuleCall_1_0(), semanticObject.getException());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Step returns Step
	 *
	 * Constraint:
	 *     (
	 *         number=QualifiedNumber 
	 *         ((action=STRING error=RaiseErrorConditional?) | error=RaiseErrorConditional | condition=IfStatement | loop=Loop | exception=RaiseErrorNow)
	 *     )
	 */
	protected void sequence_Step(ISerializationContext context, Step semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Steps returns Steps
	 *
	 * Constraint:
	 *     steps+=Step+
	 */
	protected void sequence_Steps(ISerializationContext context, Steps semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ThenAnd returns ThenAnd
	 *
	 * Constraint:
	 *     content=STRING
	 */
	protected void sequence_ThenAnd(ISerializationContext context, ThenAnd semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UseCasePackage.Literals.THEN_AND__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UseCasePackage.Literals.THEN_AND__CONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getThenAndAccess().getContentSTRINGTerminalRuleCall_1_0(), semanticObject.getContent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Then returns Then
	 *
	 * Constraint:
	 *     content=STRING
	 */
	protected void sequence_Then(ISerializationContext context, Then semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UseCasePackage.Literals.THEN__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UseCasePackage.Literals.THEN__CONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getThenAccess().getContentSTRINGTerminalRuleCall_1_0(), semanticObject.getContent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Type
	 *
	 * Constraint:
	 *     (name=ID description=STRING? importInfo=QualifiedName?)
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
	 *         allowedUserGroups+=AllowedUserGroups? 
	 *         inputs+=Inputs? 
	 *         optionalInputs+=OptionalInputs? 
	 *         outputs+=Outputs? 
	 *         preconditions=PreConditions? 
	 *         steps+=Steps? 
	 *         notes+=Notes?
	 *     )
	 */
	protected void sequence_UseCase(ISerializationContext context, UseCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UsedExceptions returns UsedExceptions
	 *
	 * Constraint:
	 *     exceptions+=ExceptionDecleration+
	 */
	protected void sequence_UsedExceptions(ISerializationContext context, UsedExceptions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UsedTypes returns UsedTypes
	 *
	 * Constraint:
	 *     types+=Type+
	 */
	protected void sequence_UsedTypes(ISerializationContext context, UsedTypes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     WhenAnd returns WhenAnd
	 *
	 * Constraint:
	 *     content=STRING
	 */
	protected void sequence_WhenAnd(ISerializationContext context, WhenAnd semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UseCasePackage.Literals.WHEN_AND__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UseCasePackage.Literals.WHEN_AND__CONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWhenAndAccess().getContentSTRINGTerminalRuleCall_1_0(), semanticObject.getContent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     When returns When
	 *
	 * Constraint:
	 *     content=STRING
	 */
	protected void sequence_When(ISerializationContext context, When semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UseCasePackage.Literals.WHEN__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UseCasePackage.Literals.WHEN__CONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWhenAccess().getContentSTRINGTerminalRuleCall_1_0(), semanticObject.getContent());
		feeder.finish();
	}
	
	
}
