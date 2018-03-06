/*
 * generated by Xtext 2.13.0
 */
grammar InternalUseCase;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package io.deniffel.dsl.useCase.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package io.deniffel.dsl.useCase.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import io.deniffel.dsl.useCase.services.UseCaseGrammarAccess;

}

@parser::members {

 	private UseCaseGrammarAccess grammarAccess;

    public InternalUseCaseParser(TokenStream input, UseCaseGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected UseCaseGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_0_0());
				}
				lv_types_0_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"types",
						lv_types_0_0,
						"io.deniffel.dsl.useCase.UseCase.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getUseCasesUseCaseParserRuleCall_1_0());
				}
				lv_useCases_1_0=ruleUseCase
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"useCases",
						lv_useCases_1_0,
						"io.deniffel.dsl.useCase.UseCase.UseCase");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleUseCase
entryRuleUseCase returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUseCaseRule()); }
	iv_ruleUseCase=ruleUseCase
	{ $current=$iv_ruleUseCase.current; }
	EOF;

// Rule UseCase
ruleUseCase returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='use-case'
		{
			newLeafNode(otherlv_0, grammarAccess.getUseCaseAccess().getUseCaseKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_STRING
				{
					newLeafNode(lv_name_1_0, grammarAccess.getUseCaseAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUseCaseRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getUseCaseAccess().getDescriptionsDescriptionParserRuleCall_2_0());
				}
				lv_descriptions_2_0=ruleDescription
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUseCaseRule());
					}
					add(
						$current,
						"descriptions",
						lv_descriptions_2_0,
						"io.deniffel.dsl.useCase.UseCase.Description");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getUseCaseAccess().getInputsInputsParserRuleCall_3_0());
				}
				lv_inputs_3_0=ruleInputs
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUseCaseRule());
					}
					add(
						$current,
						"inputs",
						lv_inputs_3_0,
						"io.deniffel.dsl.useCase.UseCase.Inputs");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getUseCaseAccess().getOutputsOutputsParserRuleCall_4_0());
				}
				lv_outputs_4_0=ruleOutputs
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUseCaseRule());
					}
					add(
						$current,
						"outputs",
						lv_outputs_4_0,
						"io.deniffel.dsl.useCase.UseCase.Outputs");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getUseCaseAccess().getAllowedUserGroupsAllowedUserGroupsParserRuleCall_5_0());
				}
				lv_allowedUserGroups_5_0=ruleAllowedUserGroups
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUseCaseRule());
					}
					add(
						$current,
						"allowedUserGroups",
						lv_allowedUserGroups_5_0,
						"io.deniffel.dsl.useCase.UseCase.AllowedUserGroups");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_6='end'
		{
			newLeafNode(otherlv_6, grammarAccess.getUseCaseAccess().getEndKeyword_6());
		}
		otherlv_7='of'
		{
			newLeafNode(otherlv_7, grammarAccess.getUseCaseAccess().getOfKeyword_7());
		}
		otherlv_8='use-case'
		{
			newLeafNode(otherlv_8, grammarAccess.getUseCaseAccess().getUseCaseKeyword_8());
		}
	)
;

// Entry rule entryRuleDescription
entryRuleDescription returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDescriptionRule()); }
	iv_ruleDescription=ruleDescription
	{ $current=$iv_ruleDescription.current; }
	EOF;

// Rule Description
ruleDescription returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='description:'
		{
			newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getDescriptionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_STRING
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDescriptionAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDescriptionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleInputs
entryRuleInputs returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInputsRule()); }
	iv_ruleInputs=ruleInputs
	{ $current=$iv_ruleInputs.current; }
	EOF;

// Rule Inputs
ruleInputs returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='inputs:'
			{
				newLeafNode(otherlv_0, grammarAccess.getInputsAccess().getInputsKeyword_0_0());
			}
			    |
			otherlv_1='input:'
			{
				newLeafNode(otherlv_1, grammarAccess.getInputsAccess().getInputKeyword_0_1());
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getInputsAccess().getInputsInputParserRuleCall_1_0());
				}
				lv_inputs_2_0=ruleInput
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInputsRule());
					}
					add(
						$current,
						"inputs",
						lv_inputs_2_0,
						"io.deniffel.dsl.useCase.UseCase.Input");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleOutputs
entryRuleOutputs returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOutputsRule()); }
	iv_ruleOutputs=ruleOutputs
	{ $current=$iv_ruleOutputs.current; }
	EOF;

// Rule Outputs
ruleOutputs returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='outputs:'
			{
				newLeafNode(otherlv_0, grammarAccess.getOutputsAccess().getOutputsKeyword_0_0());
			}
			    |
			otherlv_1='output:'
			{
				newLeafNode(otherlv_1, grammarAccess.getOutputsAccess().getOutputKeyword_0_1());
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getOutputsAccess().getOutputsOutputParserRuleCall_1_0());
				}
				lv_outputs_2_0=ruleOutput
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOutputsRule());
					}
					add(
						$current,
						"outputs",
						lv_outputs_2_0,
						"io.deniffel.dsl.useCase.UseCase.Output");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleType
entryRuleType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current; }
	EOF;

// Rule Type
ruleType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='type'
		{
			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getTypeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTypeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				lv_description_3_0=RULE_STRING
				{
					newLeafNode(lv_description_3_0, grammarAccess.getTypeAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTypeRule());
					}
					setWithLastConsumed(
						$current,
						"description",
						lv_description_3_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getRightParenthesisKeyword_4());
		}
		(
			otherlv_5='['
			{
				newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTypeAccess().getImportInfoQualifiedNameParserRuleCall_5_1_0());
					}
					lv_importInfo_6_0=ruleQualifiedName
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTypeRule());
						}
						set(
							$current,
							"importInfo",
							lv_importInfo_6_0,
							"io.deniffel.dsl.useCase.UseCase.QualifiedName");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_7=']'
			{
				newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_5_2());
			}
		)?
	)
;

// Entry rule entryRuleInput
entryRuleInput returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInputRule()); }
	iv_ruleInput=ruleInput
	{ $current=$iv_ruleInput.current; }
	EOF;

// Rule Input
ruleInput returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_many_0_0='many'
				{
					newLeafNode(lv_many_0_0, grammarAccess.getInputAccess().getManyManyKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInputRule());
					}
					setWithLastConsumed($current, "many", true, "many");
				}
			)
		)?
		otherlv_1='-'
		{
			newLeafNode(otherlv_1, grammarAccess.getInputAccess().getHyphenMinusKeyword_1());
		}
		(
			(
				lv_content_2_0=RULE_STRING
				{
					newLeafNode(lv_content_2_0, grammarAccess.getInputAccess().getContentSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInputRule());
					}
					setWithLastConsumed(
						$current,
						"content",
						lv_content_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			otherlv_3='as'
			{
				newLeafNode(otherlv_3, grammarAccess.getInputAccess().getAsKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getInputRule());
						}
					}
					otherlv_4=RULE_ID
					{
						newLeafNode(otherlv_4, grammarAccess.getInputAccess().getTypeTypeCrossReference_3_1_0());
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleOutput
entryRuleOutput returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOutputRule()); }
	iv_ruleOutput=ruleOutput
	{ $current=$iv_ruleOutput.current; }
	EOF;

// Rule Output
ruleOutput returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_many_0_0='many'
				{
					newLeafNode(lv_many_0_0, grammarAccess.getOutputAccess().getManyManyKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOutputRule());
					}
					setWithLastConsumed($current, "many", true, "many");
				}
			)
		)?
		otherlv_1='-'
		{
			newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getHyphenMinusKeyword_1());
		}
		(
			(
				lv_content_2_0=RULE_STRING
				{
					newLeafNode(lv_content_2_0, grammarAccess.getOutputAccess().getContentSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOutputRule());
					}
					setWithLastConsumed(
						$current,
						"content",
						lv_content_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			otherlv_3='as'
			{
				newLeafNode(otherlv_3, grammarAccess.getOutputAccess().getAsKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getOutputRule());
						}
					}
					otherlv_4=RULE_ID
					{
						newLeafNode(otherlv_4, grammarAccess.getOutputAccess().getTypeTypeCrossReference_3_1_0());
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleAllowedUserGroups
entryRuleAllowedUserGroups returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAllowedUserGroupsRule()); }
	iv_ruleAllowedUserGroups=ruleAllowedUserGroups
	{ $current=$iv_ruleAllowedUserGroups.current; }
	EOF;

// Rule AllowedUserGroups
ruleAllowedUserGroups returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='allowed-usergroups:'
		{
			newLeafNode(otherlv_0, grammarAccess.getAllowedUserGroupsAccess().getAllowedUsergroupsKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAllowedUserGroupsAccess().getGroupsAllowedUserGroupParserRuleCall_1_0());
				}
				lv_groups_1_0=ruleAllowedUserGroup
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAllowedUserGroupsRule());
					}
					add(
						$current,
						"groups",
						lv_groups_1_0,
						"io.deniffel.dsl.useCase.UseCase.AllowedUserGroup");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleAllowedUserGroup
entryRuleAllowedUserGroup returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAllowedUserGroupRule()); }
	iv_ruleAllowedUserGroup=ruleAllowedUserGroup
	{ $current=$iv_ruleAllowedUserGroup.current; }
	EOF;

// Rule AllowedUserGroup
ruleAllowedUserGroup returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_many_0_0='many'
				{
					newLeafNode(lv_many_0_0, grammarAccess.getAllowedUserGroupAccess().getManyManyKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAllowedUserGroupRule());
					}
					setWithLastConsumed($current, "many", true, "many");
				}
			)
		)?
		otherlv_1='-'
		{
			newLeafNode(otherlv_1, grammarAccess.getAllowedUserGroupAccess().getHyphenMinusKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_STRING
				{
					newLeafNode(lv_name_2_0, grammarAccess.getAllowedUserGroupAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAllowedUserGroupRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			otherlv_3='as'
			{
				newLeafNode(otherlv_3, grammarAccess.getAllowedUserGroupAccess().getAsKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAllowedUserGroupRule());
						}
					}
					otherlv_4=RULE_ID
					{
						newLeafNode(otherlv_4, grammarAccess.getAllowedUserGroupAccess().getTypeTypeCrossReference_3_1_0());
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); }
	iv_ruleQualifiedName=ruleQualifiedName
	{ $current=$iv_ruleQualifiedName.current.getText(); }
	EOF;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
