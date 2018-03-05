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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUseCaseParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'use-case'", "'end'", "'of'", "'description:'", "'attributes:'", "'type'", "'('", "')'", "'['", "']'", "'many'", "'-'", "'as'", "'.'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalUseCaseParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUseCaseParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUseCaseParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUseCase.g"; }



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




    // $ANTLR start "entryRuleModel"
    // InternalUseCase.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalUseCase.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalUseCase.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalUseCase.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_types_0_0= ruleType ) )* ( (lv_useCases_1_0= ruleUseCase ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_types_0_0 = null;

        EObject lv_useCases_1_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:77:2: ( ( ( (lv_types_0_0= ruleType ) )* ( (lv_useCases_1_0= ruleUseCase ) )* ) )
            // InternalUseCase.g:78:2: ( ( (lv_types_0_0= ruleType ) )* ( (lv_useCases_1_0= ruleUseCase ) )* )
            {
            // InternalUseCase.g:78:2: ( ( (lv_types_0_0= ruleType ) )* ( (lv_useCases_1_0= ruleUseCase ) )* )
            // InternalUseCase.g:79:3: ( (lv_types_0_0= ruleType ) )* ( (lv_useCases_1_0= ruleUseCase ) )*
            {
            // InternalUseCase.g:79:3: ( (lv_types_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUseCase.g:80:4: (lv_types_0_0= ruleType )
            	    {
            	    // InternalUseCase.g:80:4: (lv_types_0_0= ruleType )
            	    // InternalUseCase.g:81:5: lv_types_0_0= ruleType
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_types_0_0=ruleType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"types",
            	    						lv_types_0_0,
            	    						"io.deniffel.dsl.useCase.UseCase.Type");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalUseCase.g:98:3: ( (lv_useCases_1_0= ruleUseCase ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUseCase.g:99:4: (lv_useCases_1_0= ruleUseCase )
            	    {
            	    // InternalUseCase.g:99:4: (lv_useCases_1_0= ruleUseCase )
            	    // InternalUseCase.g:100:5: lv_useCases_1_0= ruleUseCase
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getUseCasesUseCaseParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_useCases_1_0=ruleUseCase();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"useCases",
            	    						lv_useCases_1_0,
            	    						"io.deniffel.dsl.useCase.UseCase.UseCase");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleUseCase"
    // InternalUseCase.g:121:1: entryRuleUseCase returns [EObject current=null] : iv_ruleUseCase= ruleUseCase EOF ;
    public final EObject entryRuleUseCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCase = null;


        try {
            // InternalUseCase.g:121:48: (iv_ruleUseCase= ruleUseCase EOF )
            // InternalUseCase.g:122:2: iv_ruleUseCase= ruleUseCase EOF
            {
             newCompositeNode(grammarAccess.getUseCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUseCase=ruleUseCase();

            state._fsp--;

             current =iv_ruleUseCase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUseCase"


    // $ANTLR start "ruleUseCase"
    // InternalUseCase.g:128:1: ruleUseCase returns [EObject current=null] : (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )* ( (lv_sections_3_0= ruleAttributes ) )* otherlv_4= 'end' otherlv_5= 'of' otherlv_6= 'use-case' ) ;
    public final EObject ruleUseCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_descriptions_2_0 = null;

        EObject lv_sections_3_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:134:2: ( (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )* ( (lv_sections_3_0= ruleAttributes ) )* otherlv_4= 'end' otherlv_5= 'of' otherlv_6= 'use-case' ) )
            // InternalUseCase.g:135:2: (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )* ( (lv_sections_3_0= ruleAttributes ) )* otherlv_4= 'end' otherlv_5= 'of' otherlv_6= 'use-case' )
            {
            // InternalUseCase.g:135:2: (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )* ( (lv_sections_3_0= ruleAttributes ) )* otherlv_4= 'end' otherlv_5= 'of' otherlv_6= 'use-case' )
            // InternalUseCase.g:136:3: otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )* ( (lv_sections_3_0= ruleAttributes ) )* otherlv_4= 'end' otherlv_5= 'of' otherlv_6= 'use-case'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getUseCaseAccess().getUseCaseKeyword_0());
            		
            // InternalUseCase.g:140:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalUseCase.g:141:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalUseCase.g:141:4: (lv_name_1_0= RULE_STRING )
            // InternalUseCase.g:142:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUseCaseAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUseCaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalUseCase.g:158:3: ( (lv_descriptions_2_0= ruleDescription ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUseCase.g:159:4: (lv_descriptions_2_0= ruleDescription )
            	    {
            	    // InternalUseCase.g:159:4: (lv_descriptions_2_0= ruleDescription )
            	    // InternalUseCase.g:160:5: lv_descriptions_2_0= ruleDescription
            	    {

            	    					newCompositeNode(grammarAccess.getUseCaseAccess().getDescriptionsDescriptionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_descriptions_2_0=ruleDescription();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUseCaseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"descriptions",
            	    						lv_descriptions_2_0,
            	    						"io.deniffel.dsl.useCase.UseCase.Description");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalUseCase.g:177:3: ( (lv_sections_3_0= ruleAttributes ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalUseCase.g:178:4: (lv_sections_3_0= ruleAttributes )
            	    {
            	    // InternalUseCase.g:178:4: (lv_sections_3_0= ruleAttributes )
            	    // InternalUseCase.g:179:5: lv_sections_3_0= ruleAttributes
            	    {

            	    					newCompositeNode(grammarAccess.getUseCaseAccess().getSectionsAttributesParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_sections_3_0=ruleAttributes();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUseCaseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sections",
            	    						lv_sections_3_0,
            	    						"io.deniffel.dsl.useCase.UseCase.Attributes");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getUseCaseAccess().getEndKeyword_4());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getUseCaseAccess().getOfKeyword_5());
            		
            otherlv_6=(Token)match(input,11,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getUseCaseAccess().getUseCaseKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUseCase"


    // $ANTLR start "entryRuleDescription"
    // InternalUseCase.g:212:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalUseCase.g:212:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalUseCase.g:213:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalUseCase.g:219:1: ruleDescription returns [EObject current=null] : (otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:225:2: ( (otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalUseCase.g:226:2: (otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalUseCase.g:226:2: (otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalUseCase.g:227:3: otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getDescriptionKeyword_0());
            		
            // InternalUseCase.g:231:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalUseCase.g:232:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalUseCase.g:232:4: (lv_name_1_0= RULE_STRING )
            // InternalUseCase.g:233:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDescriptionAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleAttributes"
    // InternalUseCase.g:253:1: entryRuleAttributes returns [EObject current=null] : iv_ruleAttributes= ruleAttributes EOF ;
    public final EObject entryRuleAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributes = null;


        try {
            // InternalUseCase.g:253:51: (iv_ruleAttributes= ruleAttributes EOF )
            // InternalUseCase.g:254:2: iv_ruleAttributes= ruleAttributes EOF
            {
             newCompositeNode(grammarAccess.getAttributesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributes=ruleAttributes();

            state._fsp--;

             current =iv_ruleAttributes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributes"


    // $ANTLR start "ruleAttributes"
    // InternalUseCase.g:260:1: ruleAttributes returns [EObject current=null] : (otherlv_0= 'attributes:' ( (lv_attrs_1_0= ruleAttribute ) )* ) ;
    public final EObject ruleAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_attrs_1_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:266:2: ( (otherlv_0= 'attributes:' ( (lv_attrs_1_0= ruleAttribute ) )* ) )
            // InternalUseCase.g:267:2: (otherlv_0= 'attributes:' ( (lv_attrs_1_0= ruleAttribute ) )* )
            {
            // InternalUseCase.g:267:2: (otherlv_0= 'attributes:' ( (lv_attrs_1_0= ruleAttribute ) )* )
            // InternalUseCase.g:268:3: otherlv_0= 'attributes:' ( (lv_attrs_1_0= ruleAttribute ) )*
            {
            otherlv_0=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributesAccess().getAttributesKeyword_0());
            		
            // InternalUseCase.g:272:3: ( (lv_attrs_1_0= ruleAttribute ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=21 && LA5_0<=22)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalUseCase.g:273:4: (lv_attrs_1_0= ruleAttribute )
            	    {
            	    // InternalUseCase.g:273:4: (lv_attrs_1_0= ruleAttribute )
            	    // InternalUseCase.g:274:5: lv_attrs_1_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getAttributesAccess().getAttrsAttributeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_attrs_1_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAttributesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attrs",
            	    						lv_attrs_1_0,
            	    						"io.deniffel.dsl.useCase.UseCase.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributes"


    // $ANTLR start "entryRuleType"
    // InternalUseCase.g:295:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalUseCase.g:295:45: (iv_ruleType= ruleType EOF )
            // InternalUseCase.g:296:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalUseCase.g:302:1: ruleType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_importInfo_6_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:308:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) )
            // InternalUseCase.g:309:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            {
            // InternalUseCase.g:309:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            // InternalUseCase.g:310:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getTypeKeyword_0());
            		
            // InternalUseCase.g:314:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUseCase.g:315:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUseCase.g:315:4: (lv_name_1_0= RULE_ID )
            // InternalUseCase.g:316:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2());
            		
            // InternalUseCase.g:336:3: ( (lv_description_3_0= RULE_STRING ) )
            // InternalUseCase.g:337:4: (lv_description_3_0= RULE_STRING )
            {
            // InternalUseCase.g:337:4: (lv_description_3_0= RULE_STRING )
            // InternalUseCase.g:338:5: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_description_3_0, grammarAccess.getTypeAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getRightParenthesisKeyword_4());
            		
            // InternalUseCase.g:358:3: (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUseCase.g:359:4: otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_5_0());
                    			
                    // InternalUseCase.g:363:4: ( (lv_importInfo_6_0= ruleQualifiedName ) )
                    // InternalUseCase.g:364:5: (lv_importInfo_6_0= ruleQualifiedName )
                    {
                    // InternalUseCase.g:364:5: (lv_importInfo_6_0= ruleQualifiedName )
                    // InternalUseCase.g:365:6: lv_importInfo_6_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getTypeAccess().getImportInfoQualifiedNameParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_importInfo_6_0=ruleQualifiedName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypeRule());
                    						}
                    						set(
                    							current,
                    							"importInfo",
                    							lv_importInfo_6_0,
                    							"io.deniffel.dsl.useCase.UseCase.QualifiedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_5_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleAttribute"
    // InternalUseCase.g:391:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalUseCase.g:391:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalUseCase.g:392:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalUseCase.g:398:1: ruleAttribute returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalUseCase.g:404:2: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) )
            // InternalUseCase.g:405:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? )
            {
            // InternalUseCase.g:405:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? )
            // InternalUseCase.g:406:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            {
            // InternalUseCase.g:406:3: ( (lv_many_0_0= 'many' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUseCase.g:407:4: (lv_many_0_0= 'many' )
                    {
                    // InternalUseCase.g:407:4: (lv_many_0_0= 'many' )
                    // InternalUseCase.g:408:5: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,21,FOLLOW_16); 

                    					newLeafNode(lv_many_0_0, grammarAccess.getAttributeAccess().getManyManyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "many", true, "many");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getHyphenMinusKeyword_1());
            		
            // InternalUseCase.g:424:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalUseCase.g:425:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalUseCase.g:425:4: (lv_content_2_0= RULE_STRING )
            // InternalUseCase.g:426:5: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_content_2_0, grammarAccess.getAttributeAccess().getContentSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalUseCase.g:442:3: (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUseCase.g:443:4: otherlv_3= 'as' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getAsKeyword_3_0());
                    			
                    // InternalUseCase.g:447:4: ( (otherlv_4= RULE_ID ) )
                    // InternalUseCase.g:448:5: (otherlv_4= RULE_ID )
                    {
                    // InternalUseCase.g:448:5: (otherlv_4= RULE_ID )
                    // InternalUseCase.g:449:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getTypeTypeCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalUseCase.g:465:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalUseCase.g:465:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalUseCase.g:466:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalUseCase.g:472:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalUseCase.g:478:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalUseCase.g:479:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalUseCase.g:479:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalUseCase.g:480:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalUseCase.g:487:3: (kw= '.' this_ID_2= RULE_ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalUseCase.g:488:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,24,FOLLOW_11); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_18); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000D000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000002L});

}