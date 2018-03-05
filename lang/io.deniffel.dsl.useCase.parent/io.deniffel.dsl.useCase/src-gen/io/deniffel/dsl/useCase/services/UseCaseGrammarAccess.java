/*
 * generated by Xtext 2.13.0
 */
package io.deniffel.dsl.useCase.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class UseCaseGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "io.deniffel.dsl.useCase.UseCase.Model");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsAbstractElementParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//Model:
		//	elements+=AbstractElement*;
		@Override public ParserRule getRule() { return rule; }
		
		//elements+=AbstractElement*
		public Assignment getElementsAssignment() { return cElementsAssignment; }
		
		//AbstractElement
		public RuleCall getElementsAbstractElementParserRuleCall_0() { return cElementsAbstractElementParserRuleCall_0; }
	}
	public class AbstractElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "io.deniffel.dsl.useCase.UseCase.AbstractElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cUseCaseParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTypeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractElement:
		//	UseCase | Type;
		@Override public ParserRule getRule() { return rule; }
		
		//UseCase | Type
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//UseCase
		public RuleCall getUseCaseParserRuleCall_0() { return cUseCaseParserRuleCall_0; }
		
		//Type
		public RuleCall getTypeParserRuleCall_1() { return cTypeParserRuleCall_1; }
	}
	public class UseCaseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "io.deniffel.dsl.useCase.UseCase.UseCase");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUseCaseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cDescriptionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDescriptionsDescriptionParserRuleCall_2_0 = (RuleCall)cDescriptionsAssignment_2.eContents().get(0);
		private final Assignment cSectionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSectionsAttributesParserRuleCall_3_0 = (RuleCall)cSectionsAssignment_3.eContents().get(0);
		private final Keyword cEndKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cOfKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cUseCaseKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//UseCase:
		//	'use-case' name=STRING
		//	descriptions+=Description*
		//	sections+=Attributes*
		//	'end' 'of' 'use-case';
		@Override public ParserRule getRule() { return rule; }
		
		//'use-case' name=STRING descriptions+=Description* sections+=Attributes* 'end' 'of' 'use-case'
		public Group getGroup() { return cGroup; }
		
		//'use-case'
		public Keyword getUseCaseKeyword_0() { return cUseCaseKeyword_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
		
		//descriptions+=Description*
		public Assignment getDescriptionsAssignment_2() { return cDescriptionsAssignment_2; }
		
		//Description
		public RuleCall getDescriptionsDescriptionParserRuleCall_2_0() { return cDescriptionsDescriptionParserRuleCall_2_0; }
		
		//sections+=Attributes*
		public Assignment getSectionsAssignment_3() { return cSectionsAssignment_3; }
		
		//Attributes
		public RuleCall getSectionsAttributesParserRuleCall_3_0() { return cSectionsAttributesParserRuleCall_3_0; }
		
		//'end'
		public Keyword getEndKeyword_4() { return cEndKeyword_4; }
		
		//'of'
		public Keyword getOfKeyword_5() { return cOfKeyword_5; }
		
		//'use-case'
		public Keyword getUseCaseKeyword_6() { return cUseCaseKeyword_6; }
	}
	public class DescriptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "io.deniffel.dsl.useCase.UseCase.Description");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDescriptionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Description:
		//	'description:' name=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'description:' name=STRING
		public Group getGroup() { return cGroup; }
		
		//'description:'
		public Keyword getDescriptionKeyword_0() { return cDescriptionKeyword_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
	}
	public class AttributesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "io.deniffel.dsl.useCase.UseCase.Attributes");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAttributesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cAttrsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAttrsAttributeParserRuleCall_1_0 = (RuleCall)cAttrsAssignment_1.eContents().get(0);
		
		//Attributes:
		//	'attributes:'
		//	attrs+=Attribute*;
		@Override public ParserRule getRule() { return rule; }
		
		//'attributes:' attrs+=Attribute*
		public Group getGroup() { return cGroup; }
		
		//'attributes:'
		public Keyword getAttributesKeyword_0() { return cAttributesKeyword_0; }
		
		//attrs+=Attribute*
		public Assignment getAttrsAssignment_1() { return cAttrsAssignment_1; }
		
		//Attribute
		public RuleCall getAttrsAttributeParserRuleCall_1_0() { return cAttrsAttributeParserRuleCall_1_0; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "io.deniffel.dsl.useCase.UseCase.Type");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDescriptionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_3_0 = (RuleCall)cDescriptionAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cLeftSquareBracketKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cImportInfoAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cImportInfoQualifiedNameParserRuleCall_5_1_0 = (RuleCall)cImportInfoAssignment_5_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_5_2 = (Keyword)cGroup_5.eContents().get(2);
		
		//Type:
		//	'type' name=ID '(' description=STRING ')' ('[' importInfo=QualifiedName ']')?;
		@Override public ParserRule getRule() { return rule; }
		
		//'type' name=ID '(' description=STRING ')' ('[' importInfo=QualifiedName ']')?
		public Group getGroup() { return cGroup; }
		
		//'type'
		public Keyword getTypeKeyword_0() { return cTypeKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//description=STRING
		public Assignment getDescriptionAssignment_3() { return cDescriptionAssignment_3; }
		
		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_3_0() { return cDescriptionSTRINGTerminalRuleCall_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
		
		//('[' importInfo=QualifiedName ']')?
		public Group getGroup_5() { return cGroup_5; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_5_0() { return cLeftSquareBracketKeyword_5_0; }
		
		//importInfo=QualifiedName
		public Assignment getImportInfoAssignment_5_1() { return cImportInfoAssignment_5_1; }
		
		//QualifiedName
		public RuleCall getImportInfoQualifiedNameParserRuleCall_5_1_0() { return cImportInfoQualifiedNameParserRuleCall_5_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_5_2() { return cRightSquareBracketKeyword_5_2; }
	}
	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "io.deniffel.dsl.useCase.UseCase.Attribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cManyAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cManyManyKeyword_0_0 = (Keyword)cManyAssignment_0.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cContentAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cContentSTRINGTerminalRuleCall_2_0 = (RuleCall)cContentAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cAsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cTypeAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cTypeTypeCrossReference_3_1_0 = (CrossReference)cTypeAssignment_3_1.eContents().get(0);
		private final RuleCall cTypeTypeIDTerminalRuleCall_3_1_0_1 = (RuleCall)cTypeTypeCrossReference_3_1_0.eContents().get(1);
		
		//Attribute:
		//	many?='many'? '-' content=STRING ('as' type=[Type])?;
		@Override public ParserRule getRule() { return rule; }
		
		//many?='many'? '-' content=STRING ('as' type=[Type])?
		public Group getGroup() { return cGroup; }
		
		//many?='many'?
		public Assignment getManyAssignment_0() { return cManyAssignment_0; }
		
		//'many'
		public Keyword getManyManyKeyword_0_0() { return cManyManyKeyword_0_0; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1() { return cHyphenMinusKeyword_1; }
		
		//content=STRING
		public Assignment getContentAssignment_2() { return cContentAssignment_2; }
		
		//STRING
		public RuleCall getContentSTRINGTerminalRuleCall_2_0() { return cContentSTRINGTerminalRuleCall_2_0; }
		
		//('as' type=[Type])?
		public Group getGroup_3() { return cGroup_3; }
		
		//'as'
		public Keyword getAsKeyword_3_0() { return cAsKeyword_3_0; }
		
		//type=[Type]
		public Assignment getTypeAssignment_3_1() { return cTypeAssignment_3_1; }
		
		//[Type]
		public CrossReference getTypeTypeCrossReference_3_1_0() { return cTypeTypeCrossReference_3_1_0; }
		
		//ID
		public RuleCall getTypeTypeIDTerminalRuleCall_3_1_0_1() { return cTypeTypeIDTerminalRuleCall_3_1_0_1; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "io.deniffel.dsl.useCase.UseCase.QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ('.' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	
	
	private final ModelElements pModel;
	private final AbstractElementElements pAbstractElement;
	private final UseCaseElements pUseCase;
	private final DescriptionElements pDescription;
	private final AttributesElements pAttributes;
	private final TypeElements pType;
	private final AttributeElements pAttribute;
	private final QualifiedNameElements pQualifiedName;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public UseCaseGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pAbstractElement = new AbstractElementElements();
		this.pUseCase = new UseCaseElements();
		this.pDescription = new DescriptionElements();
		this.pAttributes = new AttributesElements();
		this.pType = new TypeElements();
		this.pAttribute = new AttributeElements();
		this.pQualifiedName = new QualifiedNameElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("io.deniffel.dsl.useCase.UseCase".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	elements+=AbstractElement*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//AbstractElement:
	//	UseCase | Type;
	public AbstractElementElements getAbstractElementAccess() {
		return pAbstractElement;
	}
	
	public ParserRule getAbstractElementRule() {
		return getAbstractElementAccess().getRule();
	}
	
	//UseCase:
	//	'use-case' name=STRING
	//	descriptions+=Description*
	//	sections+=Attributes*
	//	'end' 'of' 'use-case';
	public UseCaseElements getUseCaseAccess() {
		return pUseCase;
	}
	
	public ParserRule getUseCaseRule() {
		return getUseCaseAccess().getRule();
	}
	
	//Description:
	//	'description:' name=STRING;
	public DescriptionElements getDescriptionAccess() {
		return pDescription;
	}
	
	public ParserRule getDescriptionRule() {
		return getDescriptionAccess().getRule();
	}
	
	//Attributes:
	//	'attributes:'
	//	attrs+=Attribute*;
	public AttributesElements getAttributesAccess() {
		return pAttributes;
	}
	
	public ParserRule getAttributesRule() {
		return getAttributesAccess().getRule();
	}
	
	//Type:
	//	'type' name=ID '(' description=STRING ')' ('[' importInfo=QualifiedName ']')?;
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//Attribute:
	//	many?='many'? '-' content=STRING ('as' type=[Type])?;
	public AttributeElements getAttributeAccess() {
		return pAttribute;
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}
	
	//QualifiedName:
	//	ID ('.' ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
