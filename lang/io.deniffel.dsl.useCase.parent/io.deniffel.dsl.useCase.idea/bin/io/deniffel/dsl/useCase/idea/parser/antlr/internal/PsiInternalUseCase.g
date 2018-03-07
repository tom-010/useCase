/*
 * generated by Xtext 2.13.0
 */
grammar PsiInternalUseCase;

options {
	superClass=AbstractPsiAntlrParser;
}

@lexer::header {
package io.deniffel.dsl.useCase.idea.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package io.deniffel.dsl.useCase.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import io.deniffel.dsl.useCase.idea.lang.UseCaseElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import io.deniffel.dsl.useCase.services.UseCaseGrammarAccess;

import com.intellij.lang.PsiBuilder;
}

@parser::members {

	protected UseCaseGrammarAccess grammarAccess;

	protected UseCaseElementTypeProvider elementTypeProvider;

	public PsiInternalUseCaseParser(PsiBuilder builder, TokenStream input, UseCaseElementTypeProvider elementTypeProvider, UseCaseGrammarAccess grammarAccess) {
		this(input);
		setPsiBuilder(builder);
		this.grammarAccess = grammarAccess;
		this.elementTypeProvider = elementTypeProvider;
	}

	@Override
	protected String getFirstRuleName() {
		return "Model";
	}

}

//Entry rule entryRuleModel
entryRuleModel returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getModelElementType()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [Boolean current=false]
:
	(
		(
			(
				{
					markComposite(elementTypeProvider.getModel_UseCasesUseCaseParserRuleCall_0_0ElementType());
				}
				lv_useCases_0_0=ruleUseCase
				{
					doneComposite();
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
			)
		)*
		(
			(
				{
					markComposite(elementTypeProvider.getModel_TypesUsedTypesParserRuleCall_1_0ElementType());
				}
				lv_types_1_0=ruleUsedTypes
				{
					doneComposite();
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
			)
		)
		(
			(
				{
					markComposite(elementTypeProvider.getModel_ExceptionsUsedExceptionsParserRuleCall_2_0ElementType());
				}
				lv_exceptions_2_0=ruleUsedExceptions
				{
					doneComposite();
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
			)
		)
	)
;

//Entry rule entryRuleUseCase
entryRuleUseCase returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getUseCaseElementType()); }
	iv_ruleUseCase=ruleUseCase
	{ $current=$iv_ruleUseCase.current; }
	EOF;

// Rule UseCase
ruleUseCase returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getUseCase_UseCaseKeyword_0ElementType());
		}
		otherlv_0='use-case'
		{
			doneLeaf(otherlv_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getUseCase_NameSTRINGTerminalRuleCall_1_0ElementType());
				}
				lv_name_1_0=RULE_STRING
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_name_1_0);
				}
			)
		)
		(
			(
				{
					markComposite(elementTypeProvider.getUseCase_DescriptionsDescriptionParserRuleCall_2_0ElementType());
				}
				lv_descriptions_2_0=ruleDescription
				{
					doneComposite();
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
			)
		)?
		(
			(
				{
					markComposite(elementTypeProvider.getUseCase_AllowedUserGroupsAllowedUserGroupsParserRuleCall_3_0ElementType());
				}
				lv_allowedUserGroups_3_0=ruleAllowedUserGroups
				{
					doneComposite();
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
			)
		)?
		(
			(
				{
					markComposite(elementTypeProvider.getUseCase_InputsInputsParserRuleCall_4_0ElementType());
				}
				lv_inputs_4_0=ruleInputs
				{
					doneComposite();
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
			)
		)?
		(
			(
				{
					markComposite(elementTypeProvider.getUseCase_OutputsOutputsParserRuleCall_5_0ElementType());
				}
				lv_outputs_5_0=ruleOutputs
				{
					doneComposite();
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
			)
		)?
		(
			(
				{
					markComposite(elementTypeProvider.getUseCase_PreconditionsPreConditionsParserRuleCall_6_0ElementType());
				}
				lv_preconditions_6_0=rulePreConditions
				{
					doneComposite();
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
			)
		)?
		(
			(
				{
					markComposite(elementTypeProvider.getUseCase_StepsStepsParserRuleCall_7_0ElementType());
				}
				lv_steps_7_0=ruleSteps
				{
					doneComposite();
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
			)
		)?
		(
			(
				{
					markComposite(elementTypeProvider.getUseCase_NotesNotesParserRuleCall_8_0ElementType());
				}
				lv_notes_8_0=ruleNotes
				{
					doneComposite();
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
			)
		)?
		{
			markLeaf(elementTypeProvider.getUseCase_EndKeyword_9ElementType());
		}
		otherlv_9='end'
		{
			doneLeaf(otherlv_9);
		}
		{
			markLeaf(elementTypeProvider.getUseCase_OfKeyword_10ElementType());
		}
		otherlv_10='of'
		{
			doneLeaf(otherlv_10);
		}
		{
			markLeaf(elementTypeProvider.getUseCase_UseCaseKeyword_11ElementType());
		}
		otherlv_11='use-case'
		{
			doneLeaf(otherlv_11);
		}
	)
;

//Entry rule entryRulePreConditions
entryRulePreConditions returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getPreConditionsElementType()); }
	iv_rulePreConditions=rulePreConditions
	{ $current=$iv_rulePreConditions.current; }
	EOF;

// Rule PreConditions
rulePreConditions returns [Boolean current=false]
:
	(
		(
			{
				markLeaf(elementTypeProvider.getPreConditions_PreConditionKeyword_0_0ElementType());
			}
			otherlv_0='pre-condition:'
			{
				doneLeaf(otherlv_0);
			}
			    |
			{
				markLeaf(elementTypeProvider.getPreConditions_PreConditionsKeyword_0_1ElementType());
			}
			otherlv_1='pre-conditions:'
			{
				doneLeaf(otherlv_1);
			}
		)
		(
			(
				{
					markComposite(elementTypeProvider.getPreConditions_ConditionsConditionParserRuleCall_1_0ElementType());
				}
				lv_conditions_2_0=ruleCondition
				{
					doneComposite();
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
			)
		)*
	)
;

//Entry rule entryRuleCondition
entryRuleCondition returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getConditionElementType()); }
	iv_ruleCondition=ruleCondition
	{ $current=$iv_ruleCondition.current; }
	EOF;

// Rule Condition
ruleCondition returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getCondition_HyphenMinusKeyword_0ElementType());
		}
		otherlv_0='-'
		{
			doneLeaf(otherlv_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getCondition_ContentSTRINGTerminalRuleCall_1_0ElementType());
				}
				lv_content_1_0=RULE_STRING
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_content_1_0);
				}
			)
		)
	)
;

//Entry rule entryRuleSteps
entryRuleSteps returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getStepsElementType()); }
	iv_ruleSteps=ruleSteps
	{ $current=$iv_ruleSteps.current; }
	EOF;

// Rule Steps
ruleSteps returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getSteps_StepsKeyword_0ElementType());
		}
		otherlv_0='steps:'
		{
			doneLeaf(otherlv_0);
		}
		(
			(
				{
					markComposite(elementTypeProvider.getSteps_StepsStepParserRuleCall_1_0ElementType());
				}
				lv_steps_1_0=ruleStep
				{
					doneComposite();
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
			)
		)*
	)
;

//Entry rule entryRuleUsedTypes
entryRuleUsedTypes returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getUsedTypesElementType()); }
	iv_ruleUsedTypes=ruleUsedTypes
	{ $current=$iv_ruleUsedTypes.current; }
	EOF;

// Rule UsedTypes
ruleUsedTypes returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getUsedTypes_UsedKeyword_0ElementType());
		}
		otherlv_0='used'
		{
			doneLeaf(otherlv_0);
		}
		{
			markLeaf(elementTypeProvider.getUsedTypes_TypesKeyword_1ElementType());
		}
		otherlv_1='types:'
		{
			doneLeaf(otherlv_1);
		}
		(
			(
				{
					markComposite(elementTypeProvider.getUsedTypes_TypesTypeParserRuleCall_2_0ElementType());
				}
				lv_types_2_0=ruleType
				{
					doneComposite();
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
			)
		)*
	)
;

//Entry rule entryRuleUsedExceptions
entryRuleUsedExceptions returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getUsedExceptionsElementType()); }
	iv_ruleUsedExceptions=ruleUsedExceptions
	{ $current=$iv_ruleUsedExceptions.current; }
	EOF;

// Rule UsedExceptions
ruleUsedExceptions returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getUsedExceptions_UsedKeyword_0ElementType());
		}
		otherlv_0='used'
		{
			doneLeaf(otherlv_0);
		}
		{
			markLeaf(elementTypeProvider.getUsedExceptions_ErrorsKeyword_1ElementType());
		}
		otherlv_1='errors:'
		{
			doneLeaf(otherlv_1);
		}
		(
			(
				{
					markComposite(elementTypeProvider.getUsedExceptions_ExceptionsExceptionDeclerationParserRuleCall_2_0ElementType());
				}
				lv_exceptions_2_0=ruleExceptionDecleration
				{
					doneComposite();
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
			)
		)*
	)
;

//Entry rule entryRuleStep
entryRuleStep returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getStepElementType()); }
	iv_ruleStep=ruleStep
	{ $current=$iv_ruleStep.current; }
	EOF;

// Rule Step
ruleStep returns [Boolean current=false]
:
	(
		(
			(
				{
					markComposite(elementTypeProvider.getStep_NumberQualifiedNumberParserRuleCall_0_0ElementType());
				}
				lv_number_0_0=ruleQualifiedNumber
				{
					doneComposite();
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
			)
		)
		(
			(
				{
					markLeaf(elementTypeProvider.getStep_ActionSTRINGTerminalRuleCall_1_0ElementType());
				}
				lv_action_1_0=RULE_STRING
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_action_1_0);
				}
			)
		)
		(
			(
				{
					markComposite(elementTypeProvider.getStep_ErrorRaiseErrorParserRuleCall_2_0ElementType());
				}
				lv_error_2_0=ruleRaiseError
				{
					doneComposite();
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
			)
		)?
	)
;

//Entry rule entryRuleRaiseError
entryRuleRaiseError returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getRaiseErrorElementType()); }
	iv_ruleRaiseError=ruleRaiseError
	{ $current=$iv_ruleRaiseError.current; }
	EOF;

// Rule RaiseError
ruleRaiseError returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getRaiseError_FullStopKeyword_0ElementType());
		}
		otherlv_0='.'
		{
			doneLeaf(otherlv_0);
		}
		(
			{
				markLeaf(elementTypeProvider.getRaiseError_RaiseKeyword_1_0ElementType());
			}
			otherlv_1='Raise'
			{
				doneLeaf(otherlv_1);
			}
			    |
			(
				{
					markLeaf(elementTypeProvider.getRaiseError_OnKeyword_1_1_0ElementType());
				}
				otherlv_2='On'
				{
					doneLeaf(otherlv_2);
				}
				{
					markLeaf(elementTypeProvider.getRaiseError_ErrorKeyword_1_1_1ElementType());
				}
				otherlv_3='error'
				{
					doneLeaf(otherlv_3);
				}
				{
					markLeaf(elementTypeProvider.getRaiseError_RaiseKeyword_1_1_2ElementType());
				}
				otherlv_4='raise'
				{
					doneLeaf(otherlv_4);
				}
			)
		)
		(
			(
				{
					markComposite(elementTypeProvider.getRaiseError_ExceptionExceptionParserRuleCall_2_0ElementType());
				}
				lv_exception_5_0=ruleException
				{
					doneComposite();
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
			)
		)
	)
;

//Entry rule entryRuleException
entryRuleException returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getExceptionElementType()); }
	iv_ruleException=ruleException
	{ $current=$iv_ruleException.current; }
	EOF;

// Rule Exception
ruleException returns [Boolean current=false]
:
	(
		(
			{
				if (!$current) {
					associateWithSemanticElement();
					$current = true;
				}
			}
			{
				markLeaf(elementTypeProvider.getException_TypeExceptionDeclerationCrossReference_0ElementType());
			}
			otherlv_0=RULE_ID
			{
				doneLeaf(otherlv_0);
			}
		)
	)
;

//Entry rule entryRuleDescription
entryRuleDescription returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getDescriptionElementType()); }
	iv_ruleDescription=ruleDescription
	{ $current=$iv_ruleDescription.current; }
	EOF;

// Rule Description
ruleDescription returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getDescription_DescriptionKeyword_0ElementType());
		}
		otherlv_0='description:'
		{
			doneLeaf(otherlv_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getDescription_NameSTRINGTerminalRuleCall_1_0ElementType());
				}
				lv_name_1_0=RULE_STRING
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_name_1_0);
				}
			)
		)
	)
;

//Entry rule entryRuleNotes
entryRuleNotes returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getNotesElementType()); }
	iv_ruleNotes=ruleNotes
	{ $current=$iv_ruleNotes.current; }
	EOF;

// Rule Notes
ruleNotes returns [Boolean current=false]
:
	(
		(
			{
				markLeaf(elementTypeProvider.getNotes_NotesKeyword_0_0ElementType());
			}
			otherlv_0='notes:'
			{
				doneLeaf(otherlv_0);
			}
			    |
			{
				markLeaf(elementTypeProvider.getNotes_NoteKeyword_0_1ElementType());
			}
			otherlv_1='note:'
			{
				doneLeaf(otherlv_1);
			}
		)
		(
			(
				{
					markLeaf(elementTypeProvider.getNotes_ContentSTRINGTerminalRuleCall_1_0ElementType());
				}
				lv_content_2_0=RULE_STRING
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_content_2_0);
				}
			)
		)
	)
;

//Entry rule entryRuleInputs
entryRuleInputs returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getInputsElementType()); }
	iv_ruleInputs=ruleInputs
	{ $current=$iv_ruleInputs.current; }
	EOF;

// Rule Inputs
ruleInputs returns [Boolean current=false]
:
	(
		(
			{
				markLeaf(elementTypeProvider.getInputs_RequiresKeyword_0_0ElementType());
			}
			otherlv_0='requires:'
			{
				doneLeaf(otherlv_0);
			}
			    |
			{
				markLeaf(elementTypeProvider.getInputs_RequireKeyword_0_1ElementType());
			}
			otherlv_1='require:'
			{
				doneLeaf(otherlv_1);
			}
			    |
			(
				{
					markLeaf(elementTypeProvider.getInputs_RequiresKeyword_0_2_0ElementType());
				}
				otherlv_2='requires'
				{
					doneLeaf(otherlv_2);
				}
				{
					markLeaf(elementTypeProvider.getInputs_TheKeyword_0_2_1ElementType());
				}
				otherlv_3='the'
				{
					doneLeaf(otherlv_3);
				}
				{
					markLeaf(elementTypeProvider.getInputs_FollowingKeyword_0_2_2ElementType());
				}
				otherlv_4='following'
				{
					doneLeaf(otherlv_4);
				}
				{
					markLeaf(elementTypeProvider.getInputs_InputKeyword_0_2_3ElementType());
				}
				otherlv_5='input'
				{
					doneLeaf(otherlv_5);
				}
				{
					markLeaf(elementTypeProvider.getInputs_ColonKeyword_0_2_4ElementType());
				}
				otherlv_6=':'
				{
					doneLeaf(otherlv_6);
				}
			)
		)
		(
			(
				{
					markComposite(elementTypeProvider.getInputs_InputsInputParserRuleCall_1_0ElementType());
				}
				lv_inputs_7_0=ruleInput
				{
					doneComposite();
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
			)
		)*
	)
;

//Entry rule entryRuleOutputs
entryRuleOutputs returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getOutputsElementType()); }
	iv_ruleOutputs=ruleOutputs
	{ $current=$iv_ruleOutputs.current; }
	EOF;

// Rule Outputs
ruleOutputs returns [Boolean current=false]
:
	(
		(
			{
				markLeaf(elementTypeProvider.getOutputs_ProducesKeyword_0_0ElementType());
			}
			otherlv_0='produces:'
			{
				doneLeaf(otherlv_0);
			}
			    |
			{
				markLeaf(elementTypeProvider.getOutputs_ProduceKeyword_0_1ElementType());
			}
			otherlv_1='produce:'
			{
				doneLeaf(otherlv_1);
			}
			    |
			(
				{
					markLeaf(elementTypeProvider.getOutputs_ProducesKeyword_0_2_0ElementType());
				}
				otherlv_2='produces'
				{
					doneLeaf(otherlv_2);
				}
				{
					markLeaf(elementTypeProvider.getOutputs_TheKeyword_0_2_1ElementType());
				}
				otherlv_3='the'
				{
					doneLeaf(otherlv_3);
				}
				{
					markLeaf(elementTypeProvider.getOutputs_FollowingKeyword_0_2_2ElementType());
				}
				otherlv_4='following'
				{
					doneLeaf(otherlv_4);
				}
				{
					markLeaf(elementTypeProvider.getOutputs_OutputKeyword_0_2_3ElementType());
				}
				otherlv_5='output'
				{
					doneLeaf(otherlv_5);
				}
				{
					markLeaf(elementTypeProvider.getOutputs_ColonKeyword_0_2_4ElementType());
				}
				otherlv_6=':'
				{
					doneLeaf(otherlv_6);
				}
			)
		)
		(
			(
				{
					markComposite(elementTypeProvider.getOutputs_OutputsOutputParserRuleCall_1_0ElementType());
				}
				lv_outputs_7_0=ruleOutput
				{
					doneComposite();
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
			)
		)*
	)
;

//Entry rule entryRuleType
entryRuleType returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getTypeElementType()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current; }
	EOF;

// Rule Type
ruleType returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getType_HyphenMinusKeyword_0ElementType());
		}
		otherlv_0='-'
		{
			doneLeaf(otherlv_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getType_NameIDTerminalRuleCall_1_0ElementType());
				}
				lv_name_1_0=RULE_ID
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_name_1_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getType_LeftParenthesisKeyword_2ElementType());
		}
		otherlv_2='('
		{
			doneLeaf(otherlv_2);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getType_DescriptionSTRINGTerminalRuleCall_3_0ElementType());
				}
				lv_description_3_0=RULE_STRING
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_description_3_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getType_RightParenthesisKeyword_4ElementType());
		}
		otherlv_4=')'
		{
			doneLeaf(otherlv_4);
		}
		(
			{
				markLeaf(elementTypeProvider.getType_LeftSquareBracketKeyword_5_0ElementType());
			}
			otherlv_5='['
			{
				doneLeaf(otherlv_5);
			}
			(
				(
					{
						markComposite(elementTypeProvider.getType_ImportInfoQualifiedNameParserRuleCall_5_1_0ElementType());
					}
					lv_importInfo_6_0=ruleQualifiedName
					{
						doneComposite();
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
				)
			)
			{
				markLeaf(elementTypeProvider.getType_RightSquareBracketKeyword_5_2ElementType());
			}
			otherlv_7=']'
			{
				doneLeaf(otherlv_7);
			}
		)?
	)
;

//Entry rule entryRuleExceptionDecleration
entryRuleExceptionDecleration returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getExceptionDeclerationElementType()); }
	iv_ruleExceptionDecleration=ruleExceptionDecleration
	{ $current=$iv_ruleExceptionDecleration.current; }
	EOF;

// Rule ExceptionDecleration
ruleExceptionDecleration returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getExceptionDecleration_HyphenMinusKeyword_0ElementType());
		}
		otherlv_0='-'
		{
			doneLeaf(otherlv_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getExceptionDecleration_NameIDTerminalRuleCall_1_0ElementType());
				}
				lv_name_1_0=RULE_ID
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_name_1_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getExceptionDecleration_LeftParenthesisKeyword_2ElementType());
		}
		otherlv_2='('
		{
			doneLeaf(otherlv_2);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getExceptionDecleration_MessageSTRINGTerminalRuleCall_3_0ElementType());
				}
				lv_message_3_0=RULE_STRING
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_message_3_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getExceptionDecleration_RightParenthesisKeyword_4ElementType());
		}
		otherlv_4=')'
		{
			doneLeaf(otherlv_4);
		}
		(
			{
				markLeaf(elementTypeProvider.getExceptionDecleration_LeftSquareBracketKeyword_5_0ElementType());
			}
			otherlv_5='['
			{
				doneLeaf(otherlv_5);
			}
			(
				(
					{
						markComposite(elementTypeProvider.getExceptionDecleration_ImportInfoQualifiedNameParserRuleCall_5_1_0ElementType());
					}
					lv_importInfo_6_0=ruleQualifiedName
					{
						doneComposite();
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
				)
			)
			{
				markLeaf(elementTypeProvider.getExceptionDecleration_RightSquareBracketKeyword_5_2ElementType());
			}
			otherlv_7=']'
			{
				doneLeaf(otherlv_7);
			}
		)?
	)
;

//Entry rule entryRuleOptional
entryRuleOptional returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getOptionalElementType()); }
	iv_ruleOptional=ruleOptional
	{ $current=$iv_ruleOptional.current; }
	EOF;

// Rule Optional
ruleOptional returns [Boolean current=false]
:
	{
		markLeaf(elementTypeProvider.getOptional_OptionalKeywordElementType());
	}
	kw='optional'
	{
		doneLeaf(kw);
	}
;

//Entry rule entryRuleInput
entryRuleInput returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getInputElementType()); }
	iv_ruleInput=ruleInput
	{ $current=$iv_ruleInput.current; }
	EOF;

// Rule Input
ruleInput returns [Boolean current=false]
:
	(
		(
			(
				{
					markLeaf(elementTypeProvider.getInput_ManyManyKeyword_0_0ElementType());
				}
				lv_many_0_0='many'
				{
					doneLeaf(lv_many_0_0);
				}
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
			)
		)?
		{
			markLeaf(elementTypeProvider.getInput_HyphenMinusKeyword_1ElementType());
		}
		otherlv_1='-'
		{
			doneLeaf(otherlv_1);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getInput_ContentSTRINGTerminalRuleCall_2_0ElementType());
				}
				lv_content_2_0=RULE_STRING
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_content_2_0);
				}
			)
		)
		(
			(
				{
					markComposite(elementTypeProvider.getInput_OptionalOptionalParserRuleCall_3_0ElementType());
				}
				lv_optional_3_0=ruleOptional
				{
					doneComposite();
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
			)
		)?
		(
			{
				markLeaf(elementTypeProvider.getInput_AsKeyword_4_0ElementType());
			}
			otherlv_4='as'
			{
				doneLeaf(otherlv_4);
			}
			(
				(
					{
						if (!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
					{
						markLeaf(elementTypeProvider.getInput_TypeTypeCrossReference_4_1_0ElementType());
					}
					otherlv_5=RULE_ID
					{
						doneLeaf(otherlv_5);
					}
				)
			)
		)?
		(
			{
				markLeaf(elementTypeProvider.getInput_LeftParenthesisKeyword_5_0ElementType());
			}
			otherlv_6='('
			{
				doneLeaf(otherlv_6);
			}
			{
				markLeaf(elementTypeProvider.getInput_EGKeyword_5_1ElementType());
			}
			otherlv_7='e.g'
			{
				doneLeaf(otherlv_7);
			}
			(
				(
					{
						markLeaf(elementTypeProvider.getInput_ExampleSTRINGTerminalRuleCall_5_2_0ElementType());
					}
					lv_example_8_0=RULE_STRING
					{
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
					{
						doneLeaf(lv_example_8_0);
					}
				)
			)
			{
				markLeaf(elementTypeProvider.getInput_RightParenthesisKeyword_5_3ElementType());
			}
			otherlv_9=')'
			{
				doneLeaf(otherlv_9);
			}
		)?
	)
;

//Entry rule entryRuleOutput
entryRuleOutput returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getOutputElementType()); }
	iv_ruleOutput=ruleOutput
	{ $current=$iv_ruleOutput.current; }
	EOF;

// Rule Output
ruleOutput returns [Boolean current=false]
:
	(
		(
			(
				{
					markLeaf(elementTypeProvider.getOutput_ManyManyKeyword_0_0ElementType());
				}
				lv_many_0_0='many'
				{
					doneLeaf(lv_many_0_0);
				}
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
			)
		)?
		{
			markLeaf(elementTypeProvider.getOutput_HyphenMinusKeyword_1ElementType());
		}
		otherlv_1='-'
		{
			doneLeaf(otherlv_1);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getOutput_ContentSTRINGTerminalRuleCall_2_0ElementType());
				}
				lv_content_2_0=RULE_STRING
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_content_2_0);
				}
			)
		)
		(
			{
				markLeaf(elementTypeProvider.getOutput_AsKeyword_3_0ElementType());
			}
			otherlv_3='as'
			{
				doneLeaf(otherlv_3);
			}
			(
				(
					{
						if (!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
					{
						markLeaf(elementTypeProvider.getOutput_TypeTypeCrossReference_3_1_0ElementType());
					}
					otherlv_4=RULE_ID
					{
						doneLeaf(otherlv_4);
					}
				)
			)
		)?
		(
			{
				markLeaf(elementTypeProvider.getOutput_LeftParenthesisKeyword_4_0ElementType());
			}
			otherlv_5='('
			{
				doneLeaf(otherlv_5);
			}
			{
				markLeaf(elementTypeProvider.getOutput_EGKeyword_4_1ElementType());
			}
			otherlv_6='e.g'
			{
				doneLeaf(otherlv_6);
			}
			(
				(
					{
						markLeaf(elementTypeProvider.getOutput_ExampleSTRINGTerminalRuleCall_4_2_0ElementType());
					}
					lv_example_7_0=RULE_STRING
					{
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
					{
						doneLeaf(lv_example_7_0);
					}
				)
			)
			{
				markLeaf(elementTypeProvider.getOutput_RightParenthesisKeyword_4_3ElementType());
			}
			otherlv_8=')'
			{
				doneLeaf(otherlv_8);
			}
		)?
	)
;

//Entry rule entryRuleAllowedUserGroups
entryRuleAllowedUserGroups returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getAllowedUserGroupsElementType()); }
	iv_ruleAllowedUserGroups=ruleAllowedUserGroups
	{ $current=$iv_ruleAllowedUserGroups.current; }
	EOF;

// Rule AllowedUserGroups
ruleAllowedUserGroups returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getAllowedUserGroups_AllowedUsergroupsKeyword_0ElementType());
		}
		otherlv_0='allowed-usergroups:'
		{
			doneLeaf(otherlv_0);
		}
		(
			(
				{
					markComposite(elementTypeProvider.getAllowedUserGroups_GroupsAllowedUserGroupParserRuleCall_1_0ElementType());
				}
				lv_groups_1_0=ruleAllowedUserGroup
				{
					doneComposite();
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
			)
		)*
	)
;

//Entry rule entryRuleAllowedUserGroup
entryRuleAllowedUserGroup returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getAllowedUserGroupElementType()); }
	iv_ruleAllowedUserGroup=ruleAllowedUserGroup
	{ $current=$iv_ruleAllowedUserGroup.current; }
	EOF;

// Rule AllowedUserGroup
ruleAllowedUserGroup returns [Boolean current=false]
:
	(
		(
			(
				{
					markLeaf(elementTypeProvider.getAllowedUserGroup_ManyManyKeyword_0_0ElementType());
				}
				lv_many_0_0='many'
				{
					doneLeaf(lv_many_0_0);
				}
				{
					if (!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
			)
		)?
		{
			markLeaf(elementTypeProvider.getAllowedUserGroup_HyphenMinusKeyword_1ElementType());
		}
		otherlv_1='-'
		{
			doneLeaf(otherlv_1);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getAllowedUserGroup_NameSTRINGTerminalRuleCall_2_0ElementType());
				}
				lv_name_2_0=RULE_STRING
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_name_2_0);
				}
			)
		)
		(
			{
				markLeaf(elementTypeProvider.getAllowedUserGroup_AsKeyword_3_0ElementType());
			}
			otherlv_3='as'
			{
				doneLeaf(otherlv_3);
			}
			(
				(
					{
						if (!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
					{
						markLeaf(elementTypeProvider.getAllowedUserGroup_TypeTypeCrossReference_3_1_0ElementType());
					}
					otherlv_4=RULE_ID
					{
						doneLeaf(otherlv_4);
					}
				)
			)
		)?
	)
;

//Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getQualifiedNameElementType()); }
	iv_ruleQualifiedName=ruleQualifiedName
	{ $current=$iv_ruleQualifiedName.current; }
	EOF;

// Rule QualifiedName
ruleQualifiedName returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getQualifiedName_IDTerminalRuleCall_0ElementType());
		}
		this_ID_0=RULE_ID
		{
			doneLeaf(this_ID_0);
		}
		(
			{
				markLeaf(elementTypeProvider.getQualifiedName_FullStopKeyword_1_0ElementType());
			}
			kw='.'
			{
				doneLeaf(kw);
			}
			{
				markLeaf(elementTypeProvider.getQualifiedName_IDTerminalRuleCall_1_1ElementType());
			}
			this_ID_2=RULE_ID
			{
				doneLeaf(this_ID_2);
			}
		)*
	)
;

//Entry rule entryRuleQualifiedNumber
entryRuleQualifiedNumber returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getQualifiedNumberElementType()); }
	iv_ruleQualifiedNumber=ruleQualifiedNumber
	{ $current=$iv_ruleQualifiedNumber.current; }
	EOF;

// Rule QualifiedNumber
ruleQualifiedNumber returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getQualifiedNumber_INTTerminalRuleCall_0ElementType());
		}
		this_INT_0=RULE_INT
		{
			doneLeaf(this_INT_0);
		}
		(
			{
				markLeaf(elementTypeProvider.getQualifiedNumber_FullStopKeyword_1_0ElementType());
			}
			kw='.'
			{
				doneLeaf(kw);
			}
			{
				markLeaf(elementTypeProvider.getQualifiedNumber_INTTerminalRuleCall_1_1ElementType());
			}
			this_INT_2=RULE_INT
			{
				doneLeaf(this_INT_2);
			}
		)*
		{
			markLeaf(elementTypeProvider.getQualifiedNumber_FullStopKeyword_2ElementType());
		}
		kw='.'
		{
			doneLeaf(kw);
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
