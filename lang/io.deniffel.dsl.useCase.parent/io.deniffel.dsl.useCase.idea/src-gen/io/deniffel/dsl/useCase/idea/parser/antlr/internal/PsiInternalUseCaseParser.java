package io.deniffel.dsl.useCase.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import io.deniffel.dsl.useCase.idea.lang.UseCaseElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import io.deniffel.dsl.useCase.services.UseCaseGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PsiInternalUseCaseParser extends AbstractPsiAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'use-case'", "'end'", "'of'", "'description:'", "'attributes:'", "'type'", "'('", "')'", "'['", "']'", "'many'", "'-'", "'as'", "'allowed-usergroups:'", "'.'"
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
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public PsiInternalUseCaseParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalUseCaseParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalUseCaseParser.tokenNames; }
    public String getGrammarFileName() { return "PsiInternalUseCase.g"; }



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




    // $ANTLR start "entryRuleModel"
    // PsiInternalUseCase.g:52:1: entryRuleModel returns [Boolean current=false] : iv_ruleModel= ruleModel EOF ;
    public final Boolean entryRuleModel() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleModel = null;


        try {
            // PsiInternalUseCase.g:52:47: (iv_ruleModel= ruleModel EOF )
            // PsiInternalUseCase.g:53:2: iv_ruleModel= ruleModel EOF
            {
             markComposite(elementTypeProvider.getModelElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // PsiInternalUseCase.g:59:1: ruleModel returns [Boolean current=false] : ( ( (lv_types_0_0= ruleType ) )* ( (lv_useCases_1_0= ruleUseCase ) )* ) ;
    public final Boolean ruleModel() throws RecognitionException {
        Boolean current = false;

        Boolean lv_types_0_0 = null;

        Boolean lv_useCases_1_0 = null;


        try {
            // PsiInternalUseCase.g:60:1: ( ( ( (lv_types_0_0= ruleType ) )* ( (lv_useCases_1_0= ruleUseCase ) )* ) )
            // PsiInternalUseCase.g:61:2: ( ( (lv_types_0_0= ruleType ) )* ( (lv_useCases_1_0= ruleUseCase ) )* )
            {
            // PsiInternalUseCase.g:61:2: ( ( (lv_types_0_0= ruleType ) )* ( (lv_useCases_1_0= ruleUseCase ) )* )
            // PsiInternalUseCase.g:62:3: ( (lv_types_0_0= ruleType ) )* ( (lv_useCases_1_0= ruleUseCase ) )*
            {
            // PsiInternalUseCase.g:62:3: ( (lv_types_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // PsiInternalUseCase.g:63:4: (lv_types_0_0= ruleType )
            	    {
            	    // PsiInternalUseCase.g:63:4: (lv_types_0_0= ruleType )
            	    // PsiInternalUseCase.g:64:5: lv_types_0_0= ruleType
            	    {

            	    					markComposite(elementTypeProvider.getModel_TypesTypeParserRuleCall_0_0ElementType());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_types_0_0=ruleType();

            	    state._fsp--;


            	    					doneComposite();
            	    					if(!current) {
            	    						associateWithSemanticElement();
            	    						current = true;
            	    					}
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // PsiInternalUseCase.g:77:3: ( (lv_useCases_1_0= ruleUseCase ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // PsiInternalUseCase.g:78:4: (lv_useCases_1_0= ruleUseCase )
            	    {
            	    // PsiInternalUseCase.g:78:4: (lv_useCases_1_0= ruleUseCase )
            	    // PsiInternalUseCase.g:79:5: lv_useCases_1_0= ruleUseCase
            	    {

            	    					markComposite(elementTypeProvider.getModel_UseCasesUseCaseParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_useCases_1_0=ruleUseCase();

            	    state._fsp--;


            	    					doneComposite();
            	    					if(!current) {
            	    						associateWithSemanticElement();
            	    						current = true;
            	    					}
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleUseCase"
    // PsiInternalUseCase.g:96:1: entryRuleUseCase returns [Boolean current=false] : iv_ruleUseCase= ruleUseCase EOF ;
    public final Boolean entryRuleUseCase() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleUseCase = null;


        try {
            // PsiInternalUseCase.g:96:49: (iv_ruleUseCase= ruleUseCase EOF )
            // PsiInternalUseCase.g:97:2: iv_ruleUseCase= ruleUseCase EOF
            {
             markComposite(elementTypeProvider.getUseCaseElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleUseCase=ruleUseCase();

            state._fsp--;

             current =iv_ruleUseCase; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUseCase"


    // $ANTLR start "ruleUseCase"
    // PsiInternalUseCase.g:103:1: ruleUseCase returns [Boolean current=false] : (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_sections_3_0= ruleAttributes ) )? ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )? otherlv_5= 'end' otherlv_6= 'of' otherlv_7= 'use-case' ) ;
    public final Boolean ruleUseCase() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Boolean lv_descriptions_2_0 = null;

        Boolean lv_sections_3_0 = null;

        Boolean lv_allowedUserGroups_4_0 = null;


        try {
            // PsiInternalUseCase.g:104:1: ( (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_sections_3_0= ruleAttributes ) )? ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )? otherlv_5= 'end' otherlv_6= 'of' otherlv_7= 'use-case' ) )
            // PsiInternalUseCase.g:105:2: (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_sections_3_0= ruleAttributes ) )? ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )? otherlv_5= 'end' otherlv_6= 'of' otherlv_7= 'use-case' )
            {
            // PsiInternalUseCase.g:105:2: (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_sections_3_0= ruleAttributes ) )? ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )? otherlv_5= 'end' otherlv_6= 'of' otherlv_7= 'use-case' )
            // PsiInternalUseCase.g:106:3: otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_sections_3_0= ruleAttributes ) )? ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )? otherlv_5= 'end' otherlv_6= 'of' otherlv_7= 'use-case'
            {

            			markLeaf(elementTypeProvider.getUseCase_UseCaseKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:113:3: ( (lv_name_1_0= RULE_STRING ) )
            // PsiInternalUseCase.g:114:4: (lv_name_1_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:114:4: (lv_name_1_0= RULE_STRING )
            // PsiInternalUseCase.g:115:5: lv_name_1_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getUseCase_NameSTRINGTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }

            // PsiInternalUseCase.g:130:3: ( (lv_descriptions_2_0= ruleDescription ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // PsiInternalUseCase.g:131:4: (lv_descriptions_2_0= ruleDescription )
                    {
                    // PsiInternalUseCase.g:131:4: (lv_descriptions_2_0= ruleDescription )
                    // PsiInternalUseCase.g:132:5: lv_descriptions_2_0= ruleDescription
                    {

                    					markComposite(elementTypeProvider.getUseCase_DescriptionsDescriptionParserRuleCall_2_0ElementType());
                    				
                    pushFollow(FOLLOW_7);
                    lv_descriptions_2_0=ruleDescription();

                    state._fsp--;


                    					doneComposite();
                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:145:3: ( (lv_sections_3_0= ruleAttributes ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // PsiInternalUseCase.g:146:4: (lv_sections_3_0= ruleAttributes )
                    {
                    // PsiInternalUseCase.g:146:4: (lv_sections_3_0= ruleAttributes )
                    // PsiInternalUseCase.g:147:5: lv_sections_3_0= ruleAttributes
                    {

                    					markComposite(elementTypeProvider.getUseCase_SectionsAttributesParserRuleCall_3_0ElementType());
                    				
                    pushFollow(FOLLOW_8);
                    lv_sections_3_0=ruleAttributes();

                    state._fsp--;


                    					doneComposite();
                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:160:3: ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // PsiInternalUseCase.g:161:4: (lv_allowedUserGroups_4_0= ruleAllowedUserGroups )
                    {
                    // PsiInternalUseCase.g:161:4: (lv_allowedUserGroups_4_0= ruleAllowedUserGroups )
                    // PsiInternalUseCase.g:162:5: lv_allowedUserGroups_4_0= ruleAllowedUserGroups
                    {

                    					markComposite(elementTypeProvider.getUseCase_AllowedUserGroupsAllowedUserGroupsParserRuleCall_4_0ElementType());
                    				
                    pushFollow(FOLLOW_9);
                    lv_allowedUserGroups_4_0=ruleAllowedUserGroups();

                    state._fsp--;


                    					doneComposite();
                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getUseCase_EndKeyword_5ElementType());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_10); 

            			doneLeaf(otherlv_5);
            		

            			markLeaf(elementTypeProvider.getUseCase_OfKeyword_6ElementType());
            		
            otherlv_6=(Token)match(input,13,FOLLOW_11); 

            			doneLeaf(otherlv_6);
            		

            			markLeaf(elementTypeProvider.getUseCase_UseCaseKeyword_7ElementType());
            		
            otherlv_7=(Token)match(input,11,FOLLOW_2); 

            			doneLeaf(otherlv_7);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUseCase"


    // $ANTLR start "entryRuleDescription"
    // PsiInternalUseCase.g:200:1: entryRuleDescription returns [Boolean current=false] : iv_ruleDescription= ruleDescription EOF ;
    public final Boolean entryRuleDescription() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleDescription = null;


        try {
            // PsiInternalUseCase.g:200:53: (iv_ruleDescription= ruleDescription EOF )
            // PsiInternalUseCase.g:201:2: iv_ruleDescription= ruleDescription EOF
            {
             markComposite(elementTypeProvider.getDescriptionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // PsiInternalUseCase.g:207:1: ruleDescription returns [Boolean current=false] : (otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final Boolean ruleDescription() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

        try {
            // PsiInternalUseCase.g:208:1: ( (otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // PsiInternalUseCase.g:209:2: (otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // PsiInternalUseCase.g:209:2: (otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) ) )
            // PsiInternalUseCase.g:210:3: otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) )
            {

            			markLeaf(elementTypeProvider.getDescription_DescriptionKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:217:3: ( (lv_name_1_0= RULE_STRING ) )
            // PsiInternalUseCase.g:218:4: (lv_name_1_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:218:4: (lv_name_1_0= RULE_STRING )
            // PsiInternalUseCase.g:219:5: lv_name_1_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getDescription_NameSTRINGTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleAttributes"
    // PsiInternalUseCase.g:238:1: entryRuleAttributes returns [Boolean current=false] : iv_ruleAttributes= ruleAttributes EOF ;
    public final Boolean entryRuleAttributes() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAttributes = null;


        try {
            // PsiInternalUseCase.g:238:52: (iv_ruleAttributes= ruleAttributes EOF )
            // PsiInternalUseCase.g:239:2: iv_ruleAttributes= ruleAttributes EOF
            {
             markComposite(elementTypeProvider.getAttributesElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributes=ruleAttributes();

            state._fsp--;

             current =iv_ruleAttributes; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributes"


    // $ANTLR start "ruleAttributes"
    // PsiInternalUseCase.g:245:1: ruleAttributes returns [Boolean current=false] : (otherlv_0= 'attributes:' ( (lv_attrs_1_0= ruleAttribute ) )* ) ;
    public final Boolean ruleAttributes() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Boolean lv_attrs_1_0 = null;


        try {
            // PsiInternalUseCase.g:246:1: ( (otherlv_0= 'attributes:' ( (lv_attrs_1_0= ruleAttribute ) )* ) )
            // PsiInternalUseCase.g:247:2: (otherlv_0= 'attributes:' ( (lv_attrs_1_0= ruleAttribute ) )* )
            {
            // PsiInternalUseCase.g:247:2: (otherlv_0= 'attributes:' ( (lv_attrs_1_0= ruleAttribute ) )* )
            // PsiInternalUseCase.g:248:3: otherlv_0= 'attributes:' ( (lv_attrs_1_0= ruleAttribute ) )*
            {

            			markLeaf(elementTypeProvider.getAttributes_AttributesKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,15,FOLLOW_12); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:255:3: ( (lv_attrs_1_0= ruleAttribute ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=21 && LA6_0<=22)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // PsiInternalUseCase.g:256:4: (lv_attrs_1_0= ruleAttribute )
            	    {
            	    // PsiInternalUseCase.g:256:4: (lv_attrs_1_0= ruleAttribute )
            	    // PsiInternalUseCase.g:257:5: lv_attrs_1_0= ruleAttribute
            	    {

            	    					markComposite(elementTypeProvider.getAttributes_AttrsAttributeParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_attrs_1_0=ruleAttribute();

            	    state._fsp--;


            	    					doneComposite();
            	    					if(!current) {
            	    						associateWithSemanticElement();
            	    						current = true;
            	    					}
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributes"


    // $ANTLR start "entryRuleType"
    // PsiInternalUseCase.g:274:1: entryRuleType returns [Boolean current=false] : iv_ruleType= ruleType EOF ;
    public final Boolean entryRuleType() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleType = null;


        try {
            // PsiInternalUseCase.g:274:46: (iv_ruleType= ruleType EOF )
            // PsiInternalUseCase.g:275:2: iv_ruleType= ruleType EOF
            {
             markComposite(elementTypeProvider.getTypeElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // PsiInternalUseCase.g:281:1: ruleType returns [Boolean current=false] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) ;
    public final Boolean ruleType() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Boolean lv_importInfo_6_0 = null;


        try {
            // PsiInternalUseCase.g:282:1: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) )
            // PsiInternalUseCase.g:283:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            {
            // PsiInternalUseCase.g:283:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            // PsiInternalUseCase.g:284:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            {

            			markLeaf(elementTypeProvider.getType_TypeKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,16,FOLLOW_13); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:291:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalUseCase.g:292:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalUseCase.g:292:4: (lv_name_1_0= RULE_ID )
            // PsiInternalUseCase.g:293:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getType_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getType_LeftParenthesisKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalUseCase.g:315:3: ( (lv_description_3_0= RULE_STRING ) )
            // PsiInternalUseCase.g:316:4: (lv_description_3_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:316:4: (lv_description_3_0= RULE_STRING )
            // PsiInternalUseCase.g:317:5: lv_description_3_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getType_DescriptionSTRINGTerminalRuleCall_3_0ElementType());
            				
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_description_3_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getType_RightParenthesisKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_16); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalUseCase.g:339:3: (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // PsiInternalUseCase.g:340:4: otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']'
                    {

                    				markLeaf(elementTypeProvider.getType_LeftSquareBracketKeyword_5_0ElementType());
                    			
                    otherlv_5=(Token)match(input,19,FOLLOW_13); 

                    				doneLeaf(otherlv_5);
                    			
                    // PsiInternalUseCase.g:347:4: ( (lv_importInfo_6_0= ruleQualifiedName ) )
                    // PsiInternalUseCase.g:348:5: (lv_importInfo_6_0= ruleQualifiedName )
                    {
                    // PsiInternalUseCase.g:348:5: (lv_importInfo_6_0= ruleQualifiedName )
                    // PsiInternalUseCase.g:349:6: lv_importInfo_6_0= ruleQualifiedName
                    {

                    						markComposite(elementTypeProvider.getType_ImportInfoQualifiedNameParserRuleCall_5_1_0ElementType());
                    					
                    pushFollow(FOLLOW_17);
                    lv_importInfo_6_0=ruleQualifiedName();

                    state._fsp--;


                    						doneComposite();
                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getType_RightSquareBracketKeyword_5_2ElementType());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_2); 

                    				doneLeaf(otherlv_7);
                    			

                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleAttribute"
    // PsiInternalUseCase.g:374:1: entryRuleAttribute returns [Boolean current=false] : iv_ruleAttribute= ruleAttribute EOF ;
    public final Boolean entryRuleAttribute() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAttribute = null;


        try {
            // PsiInternalUseCase.g:374:51: (iv_ruleAttribute= ruleAttribute EOF )
            // PsiInternalUseCase.g:375:2: iv_ruleAttribute= ruleAttribute EOF
            {
             markComposite(elementTypeProvider.getAttributeElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // PsiInternalUseCase.g:381:1: ruleAttribute returns [Boolean current=false] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final Boolean ruleAttribute() throws RecognitionException {
        Boolean current = false;

        Token lv_many_0_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

        try {
            // PsiInternalUseCase.g:382:1: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) )
            // PsiInternalUseCase.g:383:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? )
            {
            // PsiInternalUseCase.g:383:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? )
            // PsiInternalUseCase.g:384:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            {
            // PsiInternalUseCase.g:384:3: ( (lv_many_0_0= 'many' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // PsiInternalUseCase.g:385:4: (lv_many_0_0= 'many' )
                    {
                    // PsiInternalUseCase.g:385:4: (lv_many_0_0= 'many' )
                    // PsiInternalUseCase.g:386:5: lv_many_0_0= 'many'
                    {

                    					markLeaf(elementTypeProvider.getAttribute_ManyManyKeyword_0_0ElementType());
                    				
                    lv_many_0_0=(Token)match(input,21,FOLLOW_18); 

                    					doneLeaf(lv_many_0_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getAttribute_HyphenMinusKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_5); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalUseCase.g:408:3: ( (lv_content_2_0= RULE_STRING ) )
            // PsiInternalUseCase.g:409:4: (lv_content_2_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:409:4: (lv_content_2_0= RULE_STRING )
            // PsiInternalUseCase.g:410:5: lv_content_2_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getAttribute_ContentSTRINGTerminalRuleCall_2_0ElementType());
            				
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_content_2_0);
            				

            }


            }

            // PsiInternalUseCase.g:425:3: (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // PsiInternalUseCase.g:426:4: otherlv_3= 'as' ( (otherlv_4= RULE_ID ) )
                    {

                    				markLeaf(elementTypeProvider.getAttribute_AsKeyword_3_0ElementType());
                    			
                    otherlv_3=(Token)match(input,23,FOLLOW_13); 

                    				doneLeaf(otherlv_3);
                    			
                    // PsiInternalUseCase.g:433:4: ( (otherlv_4= RULE_ID ) )
                    // PsiInternalUseCase.g:434:5: (otherlv_4= RULE_ID )
                    {
                    // PsiInternalUseCase.g:434:5: (otherlv_4= RULE_ID )
                    // PsiInternalUseCase.g:435:6: otherlv_4= RULE_ID
                    {

                    						if (!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						markLeaf(elementTypeProvider.getAttribute_TypeTypeCrossReference_3_1_0ElementType());
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						doneLeaf(otherlv_4);
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAllowedUserGroups"
    // PsiInternalUseCase.g:455:1: entryRuleAllowedUserGroups returns [Boolean current=false] : iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF ;
    public final Boolean entryRuleAllowedUserGroups() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAllowedUserGroups = null;


        try {
            // PsiInternalUseCase.g:455:59: (iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF )
            // PsiInternalUseCase.g:456:2: iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF
            {
             markComposite(elementTypeProvider.getAllowedUserGroupsElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllowedUserGroups=ruleAllowedUserGroups();

            state._fsp--;

             current =iv_ruleAllowedUserGroups; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAllowedUserGroups"


    // $ANTLR start "ruleAllowedUserGroups"
    // PsiInternalUseCase.g:462:1: ruleAllowedUserGroups returns [Boolean current=false] : (otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )* ) ;
    public final Boolean ruleAllowedUserGroups() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Boolean lv_groups_1_0 = null;


        try {
            // PsiInternalUseCase.g:463:1: ( (otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )* ) )
            // PsiInternalUseCase.g:464:2: (otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )* )
            {
            // PsiInternalUseCase.g:464:2: (otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )* )
            // PsiInternalUseCase.g:465:3: otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )*
            {

            			markLeaf(elementTypeProvider.getAllowedUserGroups_AllowedUsergroupsKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,24,FOLLOW_12); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:472:3: ( (lv_groups_1_0= ruleAllowedUserGroup ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=21 && LA10_0<=22)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // PsiInternalUseCase.g:473:4: (lv_groups_1_0= ruleAllowedUserGroup )
            	    {
            	    // PsiInternalUseCase.g:473:4: (lv_groups_1_0= ruleAllowedUserGroup )
            	    // PsiInternalUseCase.g:474:5: lv_groups_1_0= ruleAllowedUserGroup
            	    {

            	    					markComposite(elementTypeProvider.getAllowedUserGroups_GroupsAllowedUserGroupParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_groups_1_0=ruleAllowedUserGroup();

            	    state._fsp--;


            	    					doneComposite();
            	    					if(!current) {
            	    						associateWithSemanticElement();
            	    						current = true;
            	    					}
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAllowedUserGroups"


    // $ANTLR start "entryRuleAllowedUserGroup"
    // PsiInternalUseCase.g:491:1: entryRuleAllowedUserGroup returns [Boolean current=false] : iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF ;
    public final Boolean entryRuleAllowedUserGroup() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAllowedUserGroup = null;


        try {
            // PsiInternalUseCase.g:491:58: (iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF )
            // PsiInternalUseCase.g:492:2: iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF
            {
             markComposite(elementTypeProvider.getAllowedUserGroupElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllowedUserGroup=ruleAllowedUserGroup();

            state._fsp--;

             current =iv_ruleAllowedUserGroup; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAllowedUserGroup"


    // $ANTLR start "ruleAllowedUserGroup"
    // PsiInternalUseCase.g:498:1: ruleAllowedUserGroup returns [Boolean current=false] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final Boolean ruleAllowedUserGroup() throws RecognitionException {
        Boolean current = false;

        Token lv_many_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

        try {
            // PsiInternalUseCase.g:499:1: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) )
            // PsiInternalUseCase.g:500:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? )
            {
            // PsiInternalUseCase.g:500:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? )
            // PsiInternalUseCase.g:501:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            {
            // PsiInternalUseCase.g:501:3: ( (lv_many_0_0= 'many' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // PsiInternalUseCase.g:502:4: (lv_many_0_0= 'many' )
                    {
                    // PsiInternalUseCase.g:502:4: (lv_many_0_0= 'many' )
                    // PsiInternalUseCase.g:503:5: lv_many_0_0= 'many'
                    {

                    					markLeaf(elementTypeProvider.getAllowedUserGroup_ManyManyKeyword_0_0ElementType());
                    				
                    lv_many_0_0=(Token)match(input,21,FOLLOW_18); 

                    					doneLeaf(lv_many_0_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getAllowedUserGroup_HyphenMinusKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_5); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalUseCase.g:525:3: ( (lv_name_2_0= RULE_STRING ) )
            // PsiInternalUseCase.g:526:4: (lv_name_2_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:526:4: (lv_name_2_0= RULE_STRING )
            // PsiInternalUseCase.g:527:5: lv_name_2_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getAllowedUserGroup_NameSTRINGTerminalRuleCall_2_0ElementType());
            				
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_2_0);
            				

            }


            }

            // PsiInternalUseCase.g:542:3: (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // PsiInternalUseCase.g:543:4: otherlv_3= 'as' ( (otherlv_4= RULE_ID ) )
                    {

                    				markLeaf(elementTypeProvider.getAllowedUserGroup_AsKeyword_3_0ElementType());
                    			
                    otherlv_3=(Token)match(input,23,FOLLOW_13); 

                    				doneLeaf(otherlv_3);
                    			
                    // PsiInternalUseCase.g:550:4: ( (otherlv_4= RULE_ID ) )
                    // PsiInternalUseCase.g:551:5: (otherlv_4= RULE_ID )
                    {
                    // PsiInternalUseCase.g:551:5: (otherlv_4= RULE_ID )
                    // PsiInternalUseCase.g:552:6: otherlv_4= RULE_ID
                    {

                    						if (!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						markLeaf(elementTypeProvider.getAllowedUserGroup_TypeTypeCrossReference_3_1_0ElementType());
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						doneLeaf(otherlv_4);
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAllowedUserGroup"


    // $ANTLR start "entryRuleQualifiedName"
    // PsiInternalUseCase.g:572:1: entryRuleQualifiedName returns [Boolean current=false] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final Boolean entryRuleQualifiedName() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleQualifiedName = null;


        try {
            // PsiInternalUseCase.g:572:55: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // PsiInternalUseCase.g:573:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             markComposite(elementTypeProvider.getQualifiedNameElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // PsiInternalUseCase.g:579:1: ruleQualifiedName returns [Boolean current=false] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final Boolean ruleQualifiedName() throws RecognitionException {
        Boolean current = false;

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

        try {
            // PsiInternalUseCase.g:580:1: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // PsiInternalUseCase.g:581:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // PsiInternalUseCase.g:581:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // PsiInternalUseCase.g:582:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {

            			markLeaf(elementTypeProvider.getQualifiedName_IDTerminalRuleCall_0ElementType());
            		
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            			doneLeaf(this_ID_0);
            		
            // PsiInternalUseCase.g:589:3: (kw= '.' this_ID_2= RULE_ID )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // PsiInternalUseCase.g:590:4: kw= '.' this_ID_2= RULE_ID
            	    {

            	    				markLeaf(elementTypeProvider.getQualifiedName_FullStopKeyword_1_0ElementType());
            	    			
            	    kw=(Token)match(input,25,FOLLOW_13); 

            	    				doneLeaf(kw);
            	    			

            	    				markLeaf(elementTypeProvider.getQualifiedName_IDTerminalRuleCall_1_1ElementType());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            	    				doneLeaf(this_ID_2);
            	    			

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000100D000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001009000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000002L});

}