/*
 * generated by Xtext 2.13.0
 */
grammar InternalUseCase;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package io.deniffel.dsl.useCase.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package io.deniffel.dsl.useCase.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import io.deniffel.dsl.useCase.services.UseCaseGrammarAccess;

}
@parser::members {
	private UseCaseGrammarAccess grammarAccess;

	public void setGrammarAccess(UseCaseGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getGroup()); }
		(rule__Model__Group__0)
		{ after(grammarAccess.getModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleUseCase
entryRuleUseCase
:
{ before(grammarAccess.getUseCaseRule()); }
	 ruleUseCase
{ after(grammarAccess.getUseCaseRule()); } 
	 EOF 
;

// Rule UseCase
ruleUseCase 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getUseCaseAccess().getGroup()); }
		(rule__UseCase__Group__0)
		{ after(grammarAccess.getUseCaseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDescription
entryRuleDescription
:
{ before(grammarAccess.getDescriptionRule()); }
	 ruleDescription
{ after(grammarAccess.getDescriptionRule()); } 
	 EOF 
;

// Rule Description
ruleDescription 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDescriptionAccess().getGroup()); }
		(rule__Description__Group__0)
		{ after(grammarAccess.getDescriptionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttributes
entryRuleAttributes
:
{ before(grammarAccess.getAttributesRule()); }
	 ruleAttributes
{ after(grammarAccess.getAttributesRule()); } 
	 EOF 
;

// Rule Attributes
ruleAttributes 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributesAccess().getGroup()); }
		(rule__Attributes__Group__0)
		{ after(grammarAccess.getAttributesAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleType
entryRuleType
:
{ before(grammarAccess.getTypeRule()); }
	 ruleType
{ after(grammarAccess.getTypeRule()); } 
	 EOF 
;

// Rule Type
ruleType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeAccess().getGroup()); }
		(rule__Type__Group__0)
		{ after(grammarAccess.getTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttribute
entryRuleAttribute
:
{ before(grammarAccess.getAttributeRule()); }
	 ruleAttribute
{ after(grammarAccess.getAttributeRule()); } 
	 EOF 
;

// Rule Attribute
ruleAttribute 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeAccess().getGroup()); }
		(rule__Attribute__Group__0)
		{ after(grammarAccess.getAttributeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName
:
{ before(grammarAccess.getQualifiedNameRule()); }
	 ruleQualifiedName
{ after(grammarAccess.getQualifiedNameRule()); } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedNameAccess().getGroup()); }
		(rule__QualifiedName__Group__0)
		{ after(grammarAccess.getQualifiedNameAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__0__Impl
	rule__Model__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getTypesAssignment_0()); }
	(rule__Model__TypesAssignment_0)*
	{ after(grammarAccess.getModelAccess().getTypesAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getUseCasesAssignment_1()); }
	(rule__Model__UseCasesAssignment_1)*
	{ after(grammarAccess.getModelAccess().getUseCasesAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__UseCase__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UseCase__Group__0__Impl
	rule__UseCase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UseCase__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUseCaseAccess().getUseCaseKeyword_0()); }
	'use-case'
	{ after(grammarAccess.getUseCaseAccess().getUseCaseKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UseCase__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UseCase__Group__1__Impl
	rule__UseCase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__UseCase__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUseCaseAccess().getNameAssignment_1()); }
	(rule__UseCase__NameAssignment_1)
	{ after(grammarAccess.getUseCaseAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UseCase__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UseCase__Group__2__Impl
	rule__UseCase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__UseCase__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUseCaseAccess().getDescriptionsAssignment_2()); }
	(rule__UseCase__DescriptionsAssignment_2)*
	{ after(grammarAccess.getUseCaseAccess().getDescriptionsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UseCase__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UseCase__Group__3__Impl
	rule__UseCase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__UseCase__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUseCaseAccess().getSectionsAssignment_3()); }
	(rule__UseCase__SectionsAssignment_3)*
	{ after(grammarAccess.getUseCaseAccess().getSectionsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UseCase__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UseCase__Group__4__Impl
	rule__UseCase__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__UseCase__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUseCaseAccess().getEndKeyword_4()); }
	'end'
	{ after(grammarAccess.getUseCaseAccess().getEndKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UseCase__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UseCase__Group__5__Impl
	rule__UseCase__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__UseCase__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUseCaseAccess().getOfKeyword_5()); }
	'of'
	{ after(grammarAccess.getUseCaseAccess().getOfKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UseCase__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UseCase__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UseCase__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUseCaseAccess().getUseCaseKeyword_6()); }
	'use-case'
	{ after(grammarAccess.getUseCaseAccess().getUseCaseKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Description__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Description__Group__0__Impl
	rule__Description__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Description__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); }
	'description:'
	{ after(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Description__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Description__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Description__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDescriptionAccess().getNameAssignment_1()); }
	(rule__Description__NameAssignment_1)
	{ after(grammarAccess.getDescriptionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Attributes__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attributes__Group__0__Impl
	rule__Attributes__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attributes__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributesAccess().getAttributesKeyword_0()); }
	'attributes:'
	{ after(grammarAccess.getAttributesAccess().getAttributesKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attributes__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attributes__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attributes__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributesAccess().getAttrsAssignment_1()); }
	(rule__Attributes__AttrsAssignment_1)*
	{ after(grammarAccess.getAttributesAccess().getAttrsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group__0__Impl
	rule__Type__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getTypeKeyword_0()); }
	'type'
	{ after(grammarAccess.getTypeAccess().getTypeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group__1__Impl
	rule__Type__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getNameAssignment_1()); }
	(rule__Type__NameAssignment_1)
	{ after(grammarAccess.getTypeAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group__2__Impl
	rule__Type__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2()); }
	'('
	{ after(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group__3__Impl
	rule__Type__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getDescriptionAssignment_3()); }
	(rule__Type__DescriptionAssignment_3)
	{ after(grammarAccess.getTypeAccess().getDescriptionAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group__4__Impl
	rule__Type__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_4()); }
	')'
	{ after(grammarAccess.getTypeAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getGroup_5()); }
	(rule__Type__Group_5__0)?
	{ after(grammarAccess.getTypeAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_5__0__Impl
	rule__Type__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_5_0()); }
	'['
	{ after(grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_5__1__Impl
	rule__Type__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getImportInfoAssignment_5_1()); }
	(rule__Type__ImportInfoAssignment_5_1)
	{ after(grammarAccess.getTypeAccess().getImportInfoAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Type__Group_5__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_5_2()); }
	']'
	{ after(grammarAccess.getTypeAccess().getRightSquareBracketKeyword_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__0__Impl
	rule__Attribute__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getManyAssignment_0()); }
	(rule__Attribute__ManyAssignment_0)?
	{ after(grammarAccess.getAttributeAccess().getManyAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__1__Impl
	rule__Attribute__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getHyphenMinusKeyword_1()); }
	'-'
	{ after(grammarAccess.getAttributeAccess().getHyphenMinusKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__2__Impl
	rule__Attribute__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getContentAssignment_2()); }
	(rule__Attribute__ContentAssignment_2)
	{ after(grammarAccess.getAttributeAccess().getContentAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getGroup_3()); }
	(rule__Attribute__Group_3__0)?
	{ after(grammarAccess.getAttributeAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group_3__0__Impl
	rule__Attribute__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getAsKeyword_3_0()); }
	'as'
	{ after(grammarAccess.getAttributeAccess().getAsKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getTypeAssignment_3_1()); }
	(rule__Attribute__TypeAssignment_3_1)
	{ after(grammarAccess.getAttributeAccess().getTypeAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__0__Impl
	rule__QualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
	(rule__QualifiedName__Group_1__0)*
	{ after(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__0__Impl
	rule__QualifiedName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
	'.'
	{ after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__TypesAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_0_0()); }
		ruleType
		{ after(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__UseCasesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getUseCasesUseCaseParserRuleCall_1_0()); }
		ruleUseCase
		{ after(grammarAccess.getModelAccess().getUseCasesUseCaseParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UseCase__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUseCaseAccess().getNameSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getUseCaseAccess().getNameSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UseCase__DescriptionsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUseCaseAccess().getDescriptionsDescriptionParserRuleCall_2_0()); }
		ruleDescription
		{ after(grammarAccess.getUseCaseAccess().getDescriptionsDescriptionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UseCase__SectionsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUseCaseAccess().getSectionsAttributesParserRuleCall_3_0()); }
		ruleAttributes
		{ after(grammarAccess.getUseCaseAccess().getSectionsAttributesParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Description__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDescriptionAccess().getNameSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getDescriptionAccess().getNameSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attributes__AttrsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributesAccess().getAttrsAttributeParserRuleCall_1_0()); }
		ruleAttribute
		{ after(grammarAccess.getAttributesAccess().getAttrsAttributeParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__DescriptionAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); }
		RULE_STRING
		{ after(grammarAccess.getTypeAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__ImportInfoAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getImportInfoQualifiedNameParserRuleCall_5_1_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getTypeAccess().getImportInfoQualifiedNameParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__ManyAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getManyManyKeyword_0_0()); }
		(
			{ before(grammarAccess.getAttributeAccess().getManyManyKeyword_0_0()); }
			'many'
			{ after(grammarAccess.getAttributeAccess().getManyManyKeyword_0_0()); }
		)
		{ after(grammarAccess.getAttributeAccess().getManyManyKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__ContentAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getContentSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getAttributeAccess().getContentSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__TypeAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_3_1_0()); }
		(
			{ before(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_3_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_3_1_0_1()); }
		)
		{ after(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
