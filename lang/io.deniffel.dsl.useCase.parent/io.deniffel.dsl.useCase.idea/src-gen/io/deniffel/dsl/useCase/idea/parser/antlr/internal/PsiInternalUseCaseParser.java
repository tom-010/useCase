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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'use-case'", "'end'", "'of'", "'steps:'", "'used'", "'types:'", "'errors:'", "'.'", "'Raise'", "'On'", "'error'", "'raise'", "'description:'", "'notes:'", "'note:'", "'requires:'", "'require:'", "'requires'", "'the'", "'following'", "'input'", "':'", "'produces:'", "'produce:'", "'produces'", "'output'", "'-'", "'('", "')'", "'['", "']'", "'many'", "'as'", "'e.g'", "'allowed-usergroups:'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // PsiInternalUseCase.g:59:1: ruleModel returns [Boolean current=false] : ( ( (lv_useCases_0_0= ruleUseCase ) )* ( (lv_types_1_0= ruleUsedTypes ) ) ( (lv_exceptions_2_0= ruleUsedExceptions ) ) ) ;
    public final Boolean ruleModel() throws RecognitionException {
        Boolean current = false;

        Boolean lv_useCases_0_0 = null;

        Boolean lv_types_1_0 = null;

        Boolean lv_exceptions_2_0 = null;


        try {
            // PsiInternalUseCase.g:60:1: ( ( ( (lv_useCases_0_0= ruleUseCase ) )* ( (lv_types_1_0= ruleUsedTypes ) ) ( (lv_exceptions_2_0= ruleUsedExceptions ) ) ) )
            // PsiInternalUseCase.g:61:2: ( ( (lv_useCases_0_0= ruleUseCase ) )* ( (lv_types_1_0= ruleUsedTypes ) ) ( (lv_exceptions_2_0= ruleUsedExceptions ) ) )
            {
            // PsiInternalUseCase.g:61:2: ( ( (lv_useCases_0_0= ruleUseCase ) )* ( (lv_types_1_0= ruleUsedTypes ) ) ( (lv_exceptions_2_0= ruleUsedExceptions ) ) )
            // PsiInternalUseCase.g:62:3: ( (lv_useCases_0_0= ruleUseCase ) )* ( (lv_types_1_0= ruleUsedTypes ) ) ( (lv_exceptions_2_0= ruleUsedExceptions ) )
            {
            // PsiInternalUseCase.g:62:3: ( (lv_useCases_0_0= ruleUseCase ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // PsiInternalUseCase.g:63:4: (lv_useCases_0_0= ruleUseCase )
            	    {
            	    // PsiInternalUseCase.g:63:4: (lv_useCases_0_0= ruleUseCase )
            	    // PsiInternalUseCase.g:64:5: lv_useCases_0_0= ruleUseCase
            	    {

            	    					markComposite(elementTypeProvider.getModel_UseCasesUseCaseParserRuleCall_0_0ElementType());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_useCases_0_0=ruleUseCase();

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

            // PsiInternalUseCase.g:77:3: ( (lv_types_1_0= ruleUsedTypes ) )
            // PsiInternalUseCase.g:78:4: (lv_types_1_0= ruleUsedTypes )
            {
            // PsiInternalUseCase.g:78:4: (lv_types_1_0= ruleUsedTypes )
            // PsiInternalUseCase.g:79:5: lv_types_1_0= ruleUsedTypes
            {

            					markComposite(elementTypeProvider.getModel_TypesUsedTypesParserRuleCall_1_0ElementType());
            				
            pushFollow(FOLLOW_4);
            lv_types_1_0=ruleUsedTypes();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalUseCase.g:92:3: ( (lv_exceptions_2_0= ruleUsedExceptions ) )
            // PsiInternalUseCase.g:93:4: (lv_exceptions_2_0= ruleUsedExceptions )
            {
            // PsiInternalUseCase.g:93:4: (lv_exceptions_2_0= ruleUsedExceptions )
            // PsiInternalUseCase.g:94:5: lv_exceptions_2_0= ruleUsedExceptions
            {

            					markComposite(elementTypeProvider.getModel_ExceptionsUsedExceptionsParserRuleCall_2_0ElementType());
            				
            pushFollow(FOLLOW_2);
            lv_exceptions_2_0=ruleUsedExceptions();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleUseCase"
    // PsiInternalUseCase.g:111:1: entryRuleUseCase returns [Boolean current=false] : iv_ruleUseCase= ruleUseCase EOF ;
    public final Boolean entryRuleUseCase() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleUseCase = null;


        try {
            // PsiInternalUseCase.g:111:49: (iv_ruleUseCase= ruleUseCase EOF )
            // PsiInternalUseCase.g:112:2: iv_ruleUseCase= ruleUseCase EOF
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
    // PsiInternalUseCase.g:118:1: ruleUseCase returns [Boolean current=false] : (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )? ( (lv_inputs_4_0= ruleInputs ) )? ( (lv_outputs_5_0= ruleOutputs ) )? ( (lv_steps_6_0= ruleSteps ) )? ( (lv_notes_7_0= ruleNotes ) )? otherlv_8= 'end' otherlv_9= 'of' otherlv_10= 'use-case' ) ;
    public final Boolean ruleUseCase() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Boolean lv_descriptions_2_0 = null;

        Boolean lv_allowedUserGroups_3_0 = null;

        Boolean lv_inputs_4_0 = null;

        Boolean lv_outputs_5_0 = null;

        Boolean lv_steps_6_0 = null;

        Boolean lv_notes_7_0 = null;


        try {
            // PsiInternalUseCase.g:119:1: ( (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )? ( (lv_inputs_4_0= ruleInputs ) )? ( (lv_outputs_5_0= ruleOutputs ) )? ( (lv_steps_6_0= ruleSteps ) )? ( (lv_notes_7_0= ruleNotes ) )? otherlv_8= 'end' otherlv_9= 'of' otherlv_10= 'use-case' ) )
            // PsiInternalUseCase.g:120:2: (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )? ( (lv_inputs_4_0= ruleInputs ) )? ( (lv_outputs_5_0= ruleOutputs ) )? ( (lv_steps_6_0= ruleSteps ) )? ( (lv_notes_7_0= ruleNotes ) )? otherlv_8= 'end' otherlv_9= 'of' otherlv_10= 'use-case' )
            {
            // PsiInternalUseCase.g:120:2: (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )? ( (lv_inputs_4_0= ruleInputs ) )? ( (lv_outputs_5_0= ruleOutputs ) )? ( (lv_steps_6_0= ruleSteps ) )? ( (lv_notes_7_0= ruleNotes ) )? otherlv_8= 'end' otherlv_9= 'of' otherlv_10= 'use-case' )
            // PsiInternalUseCase.g:121:3: otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )? ( (lv_inputs_4_0= ruleInputs ) )? ( (lv_outputs_5_0= ruleOutputs ) )? ( (lv_steps_6_0= ruleSteps ) )? ( (lv_notes_7_0= ruleNotes ) )? otherlv_8= 'end' otherlv_9= 'of' otherlv_10= 'use-case'
            {

            			markLeaf(elementTypeProvider.getUseCase_UseCaseKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:128:3: ( (lv_name_1_0= RULE_STRING ) )
            // PsiInternalUseCase.g:129:4: (lv_name_1_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:129:4: (lv_name_1_0= RULE_STRING )
            // PsiInternalUseCase.g:130:5: lv_name_1_0= RULE_STRING
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

            // PsiInternalUseCase.g:145:3: ( (lv_descriptions_2_0= ruleDescription ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==23) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // PsiInternalUseCase.g:146:4: (lv_descriptions_2_0= ruleDescription )
                    {
                    // PsiInternalUseCase.g:146:4: (lv_descriptions_2_0= ruleDescription )
                    // PsiInternalUseCase.g:147:5: lv_descriptions_2_0= ruleDescription
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

            // PsiInternalUseCase.g:160:3: ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==45) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // PsiInternalUseCase.g:161:4: (lv_allowedUserGroups_3_0= ruleAllowedUserGroups )
                    {
                    // PsiInternalUseCase.g:161:4: (lv_allowedUserGroups_3_0= ruleAllowedUserGroups )
                    // PsiInternalUseCase.g:162:5: lv_allowedUserGroups_3_0= ruleAllowedUserGroups
                    {

                    					markComposite(elementTypeProvider.getUseCase_AllowedUserGroupsAllowedUserGroupsParserRuleCall_3_0ElementType());
                    				
                    pushFollow(FOLLOW_8);
                    lv_allowedUserGroups_3_0=ruleAllowedUserGroups();

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

            // PsiInternalUseCase.g:175:3: ( (lv_inputs_4_0= ruleInputs ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=26 && LA4_0<=28)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // PsiInternalUseCase.g:176:4: (lv_inputs_4_0= ruleInputs )
                    {
                    // PsiInternalUseCase.g:176:4: (lv_inputs_4_0= ruleInputs )
                    // PsiInternalUseCase.g:177:5: lv_inputs_4_0= ruleInputs
                    {

                    					markComposite(elementTypeProvider.getUseCase_InputsInputsParserRuleCall_4_0ElementType());
                    				
                    pushFollow(FOLLOW_9);
                    lv_inputs_4_0=ruleInputs();

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

            // PsiInternalUseCase.g:190:3: ( (lv_outputs_5_0= ruleOutputs ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=33 && LA5_0<=35)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // PsiInternalUseCase.g:191:4: (lv_outputs_5_0= ruleOutputs )
                    {
                    // PsiInternalUseCase.g:191:4: (lv_outputs_5_0= ruleOutputs )
                    // PsiInternalUseCase.g:192:5: lv_outputs_5_0= ruleOutputs
                    {

                    					markComposite(elementTypeProvider.getUseCase_OutputsOutputsParserRuleCall_5_0ElementType());
                    				
                    pushFollow(FOLLOW_10);
                    lv_outputs_5_0=ruleOutputs();

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

            // PsiInternalUseCase.g:205:3: ( (lv_steps_6_0= ruleSteps ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // PsiInternalUseCase.g:206:4: (lv_steps_6_0= ruleSteps )
                    {
                    // PsiInternalUseCase.g:206:4: (lv_steps_6_0= ruleSteps )
                    // PsiInternalUseCase.g:207:5: lv_steps_6_0= ruleSteps
                    {

                    					markComposite(elementTypeProvider.getUseCase_StepsStepsParserRuleCall_6_0ElementType());
                    				
                    pushFollow(FOLLOW_11);
                    lv_steps_6_0=ruleSteps();

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

            // PsiInternalUseCase.g:220:3: ( (lv_notes_7_0= ruleNotes ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=24 && LA7_0<=25)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // PsiInternalUseCase.g:221:4: (lv_notes_7_0= ruleNotes )
                    {
                    // PsiInternalUseCase.g:221:4: (lv_notes_7_0= ruleNotes )
                    // PsiInternalUseCase.g:222:5: lv_notes_7_0= ruleNotes
                    {

                    					markComposite(elementTypeProvider.getUseCase_NotesNotesParserRuleCall_7_0ElementType());
                    				
                    pushFollow(FOLLOW_12);
                    lv_notes_7_0=ruleNotes();

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


            			markLeaf(elementTypeProvider.getUseCase_EndKeyword_8ElementType());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_13); 

            			doneLeaf(otherlv_8);
            		

            			markLeaf(elementTypeProvider.getUseCase_OfKeyword_9ElementType());
            		
            otherlv_9=(Token)match(input,13,FOLLOW_14); 

            			doneLeaf(otherlv_9);
            		

            			markLeaf(elementTypeProvider.getUseCase_UseCaseKeyword_10ElementType());
            		
            otherlv_10=(Token)match(input,11,FOLLOW_2); 

            			doneLeaf(otherlv_10);
            		

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


    // $ANTLR start "entryRuleSteps"
    // PsiInternalUseCase.g:260:1: entryRuleSteps returns [Boolean current=false] : iv_ruleSteps= ruleSteps EOF ;
    public final Boolean entryRuleSteps() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleSteps = null;


        try {
            // PsiInternalUseCase.g:260:47: (iv_ruleSteps= ruleSteps EOF )
            // PsiInternalUseCase.g:261:2: iv_ruleSteps= ruleSteps EOF
            {
             markComposite(elementTypeProvider.getStepsElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleSteps=ruleSteps();

            state._fsp--;

             current =iv_ruleSteps; 
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
    // $ANTLR end "entryRuleSteps"


    // $ANTLR start "ruleSteps"
    // PsiInternalUseCase.g:267:1: ruleSteps returns [Boolean current=false] : (otherlv_0= 'steps:' ( (lv_steps_1_0= ruleStep ) )* ) ;
    public final Boolean ruleSteps() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Boolean lv_steps_1_0 = null;


        try {
            // PsiInternalUseCase.g:268:1: ( (otherlv_0= 'steps:' ( (lv_steps_1_0= ruleStep ) )* ) )
            // PsiInternalUseCase.g:269:2: (otherlv_0= 'steps:' ( (lv_steps_1_0= ruleStep ) )* )
            {
            // PsiInternalUseCase.g:269:2: (otherlv_0= 'steps:' ( (lv_steps_1_0= ruleStep ) )* )
            // PsiInternalUseCase.g:270:3: otherlv_0= 'steps:' ( (lv_steps_1_0= ruleStep ) )*
            {

            			markLeaf(elementTypeProvider.getSteps_StepsKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,14,FOLLOW_15); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:277:3: ( (lv_steps_1_0= ruleStep ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_INT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // PsiInternalUseCase.g:278:4: (lv_steps_1_0= ruleStep )
            	    {
            	    // PsiInternalUseCase.g:278:4: (lv_steps_1_0= ruleStep )
            	    // PsiInternalUseCase.g:279:5: lv_steps_1_0= ruleStep
            	    {

            	    					markComposite(elementTypeProvider.getSteps_StepsStepParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_steps_1_0=ruleStep();

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
            	    break loop8;
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
    // $ANTLR end "ruleSteps"


    // $ANTLR start "entryRuleUsedTypes"
    // PsiInternalUseCase.g:296:1: entryRuleUsedTypes returns [Boolean current=false] : iv_ruleUsedTypes= ruleUsedTypes EOF ;
    public final Boolean entryRuleUsedTypes() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleUsedTypes = null;


        try {
            // PsiInternalUseCase.g:296:51: (iv_ruleUsedTypes= ruleUsedTypes EOF )
            // PsiInternalUseCase.g:297:2: iv_ruleUsedTypes= ruleUsedTypes EOF
            {
             markComposite(elementTypeProvider.getUsedTypesElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleUsedTypes=ruleUsedTypes();

            state._fsp--;

             current =iv_ruleUsedTypes; 
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
    // $ANTLR end "entryRuleUsedTypes"


    // $ANTLR start "ruleUsedTypes"
    // PsiInternalUseCase.g:303:1: ruleUsedTypes returns [Boolean current=false] : (otherlv_0= 'used' otherlv_1= 'types:' ( (lv_types_2_0= ruleType ) )* ) ;
    public final Boolean ruleUsedTypes() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Boolean lv_types_2_0 = null;


        try {
            // PsiInternalUseCase.g:304:1: ( (otherlv_0= 'used' otherlv_1= 'types:' ( (lv_types_2_0= ruleType ) )* ) )
            // PsiInternalUseCase.g:305:2: (otherlv_0= 'used' otherlv_1= 'types:' ( (lv_types_2_0= ruleType ) )* )
            {
            // PsiInternalUseCase.g:305:2: (otherlv_0= 'used' otherlv_1= 'types:' ( (lv_types_2_0= ruleType ) )* )
            // PsiInternalUseCase.g:306:3: otherlv_0= 'used' otherlv_1= 'types:' ( (lv_types_2_0= ruleType ) )*
            {

            			markLeaf(elementTypeProvider.getUsedTypes_UsedKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,15,FOLLOW_16); 

            			doneLeaf(otherlv_0);
            		

            			markLeaf(elementTypeProvider.getUsedTypes_TypesKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_17); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalUseCase.g:320:3: ( (lv_types_2_0= ruleType ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==37) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // PsiInternalUseCase.g:321:4: (lv_types_2_0= ruleType )
            	    {
            	    // PsiInternalUseCase.g:321:4: (lv_types_2_0= ruleType )
            	    // PsiInternalUseCase.g:322:5: lv_types_2_0= ruleType
            	    {

            	    					markComposite(elementTypeProvider.getUsedTypes_TypesTypeParserRuleCall_2_0ElementType());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_types_2_0=ruleType();

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
            	    break loop9;
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
    // $ANTLR end "ruleUsedTypes"


    // $ANTLR start "entryRuleUsedExceptions"
    // PsiInternalUseCase.g:339:1: entryRuleUsedExceptions returns [Boolean current=false] : iv_ruleUsedExceptions= ruleUsedExceptions EOF ;
    public final Boolean entryRuleUsedExceptions() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleUsedExceptions = null;


        try {
            // PsiInternalUseCase.g:339:56: (iv_ruleUsedExceptions= ruleUsedExceptions EOF )
            // PsiInternalUseCase.g:340:2: iv_ruleUsedExceptions= ruleUsedExceptions EOF
            {
             markComposite(elementTypeProvider.getUsedExceptionsElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleUsedExceptions=ruleUsedExceptions();

            state._fsp--;

             current =iv_ruleUsedExceptions; 
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
    // $ANTLR end "entryRuleUsedExceptions"


    // $ANTLR start "ruleUsedExceptions"
    // PsiInternalUseCase.g:346:1: ruleUsedExceptions returns [Boolean current=false] : (otherlv_0= 'used' otherlv_1= 'errors:' ( (lv_exception_2_0= ruleExceptionDecleration ) )* ) ;
    public final Boolean ruleUsedExceptions() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Boolean lv_exception_2_0 = null;


        try {
            // PsiInternalUseCase.g:347:1: ( (otherlv_0= 'used' otherlv_1= 'errors:' ( (lv_exception_2_0= ruleExceptionDecleration ) )* ) )
            // PsiInternalUseCase.g:348:2: (otherlv_0= 'used' otherlv_1= 'errors:' ( (lv_exception_2_0= ruleExceptionDecleration ) )* )
            {
            // PsiInternalUseCase.g:348:2: (otherlv_0= 'used' otherlv_1= 'errors:' ( (lv_exception_2_0= ruleExceptionDecleration ) )* )
            // PsiInternalUseCase.g:349:3: otherlv_0= 'used' otherlv_1= 'errors:' ( (lv_exception_2_0= ruleExceptionDecleration ) )*
            {

            			markLeaf(elementTypeProvider.getUsedExceptions_UsedKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,15,FOLLOW_18); 

            			doneLeaf(otherlv_0);
            		

            			markLeaf(elementTypeProvider.getUsedExceptions_ErrorsKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_17); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalUseCase.g:363:3: ( (lv_exception_2_0= ruleExceptionDecleration ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==37) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // PsiInternalUseCase.g:364:4: (lv_exception_2_0= ruleExceptionDecleration )
            	    {
            	    // PsiInternalUseCase.g:364:4: (lv_exception_2_0= ruleExceptionDecleration )
            	    // PsiInternalUseCase.g:365:5: lv_exception_2_0= ruleExceptionDecleration
            	    {

            	    					markComposite(elementTypeProvider.getUsedExceptions_ExceptionExceptionDeclerationParserRuleCall_2_0ElementType());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_exception_2_0=ruleExceptionDecleration();

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
    // $ANTLR end "ruleUsedExceptions"


    // $ANTLR start "entryRuleStep"
    // PsiInternalUseCase.g:382:1: entryRuleStep returns [Boolean current=false] : iv_ruleStep= ruleStep EOF ;
    public final Boolean entryRuleStep() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleStep = null;


        try {
            // PsiInternalUseCase.g:382:46: (iv_ruleStep= ruleStep EOF )
            // PsiInternalUseCase.g:383:2: iv_ruleStep= ruleStep EOF
            {
             markComposite(elementTypeProvider.getStepElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
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
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // PsiInternalUseCase.g:389:1: ruleStep returns [Boolean current=false] : ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? ) ;
    public final Boolean ruleStep() throws RecognitionException {
        Boolean current = false;

        Token lv_action_1_0=null;
        Boolean lv_number_0_0 = null;

        Boolean lv_error_2_0 = null;


        try {
            // PsiInternalUseCase.g:390:1: ( ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? ) )
            // PsiInternalUseCase.g:391:2: ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? )
            {
            // PsiInternalUseCase.g:391:2: ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? )
            // PsiInternalUseCase.g:392:3: ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )?
            {
            // PsiInternalUseCase.g:392:3: ( (lv_number_0_0= ruleQualifiedNumber ) )
            // PsiInternalUseCase.g:393:4: (lv_number_0_0= ruleQualifiedNumber )
            {
            // PsiInternalUseCase.g:393:4: (lv_number_0_0= ruleQualifiedNumber )
            // PsiInternalUseCase.g:394:5: lv_number_0_0= ruleQualifiedNumber
            {

            					markComposite(elementTypeProvider.getStep_NumberQualifiedNumberParserRuleCall_0_0ElementType());
            				
            pushFollow(FOLLOW_5);
            lv_number_0_0=ruleQualifiedNumber();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalUseCase.g:407:3: ( (lv_action_1_0= RULE_STRING ) )
            // PsiInternalUseCase.g:408:4: (lv_action_1_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:408:4: (lv_action_1_0= RULE_STRING )
            // PsiInternalUseCase.g:409:5: lv_action_1_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getStep_ActionSTRINGTerminalRuleCall_1_0ElementType());
            				
            lv_action_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_action_1_0);
            				

            }


            }

            // PsiInternalUseCase.g:424:3: ( (lv_error_2_0= ruleRaiseError ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // PsiInternalUseCase.g:425:4: (lv_error_2_0= ruleRaiseError )
                    {
                    // PsiInternalUseCase.g:425:4: (lv_error_2_0= ruleRaiseError )
                    // PsiInternalUseCase.g:426:5: lv_error_2_0= ruleRaiseError
                    {

                    					markComposite(elementTypeProvider.getStep_ErrorRaiseErrorParserRuleCall_2_0ElementType());
                    				
                    pushFollow(FOLLOW_2);
                    lv_error_2_0=ruleRaiseError();

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
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleRaiseError"
    // PsiInternalUseCase.g:443:1: entryRuleRaiseError returns [Boolean current=false] : iv_ruleRaiseError= ruleRaiseError EOF ;
    public final Boolean entryRuleRaiseError() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleRaiseError = null;


        try {
            // PsiInternalUseCase.g:443:52: (iv_ruleRaiseError= ruleRaiseError EOF )
            // PsiInternalUseCase.g:444:2: iv_ruleRaiseError= ruleRaiseError EOF
            {
             markComposite(elementTypeProvider.getRaiseErrorElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleRaiseError=ruleRaiseError();

            state._fsp--;

             current =iv_ruleRaiseError; 
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
    // $ANTLR end "entryRuleRaiseError"


    // $ANTLR start "ruleRaiseError"
    // PsiInternalUseCase.g:450:1: ruleRaiseError returns [Boolean current=false] : (otherlv_0= '.' (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) ) ( (lv_exception_5_0= ruleException ) ) ) ;
    public final Boolean ruleRaiseError() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Boolean lv_exception_5_0 = null;


        try {
            // PsiInternalUseCase.g:451:1: ( (otherlv_0= '.' (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) ) ( (lv_exception_5_0= ruleException ) ) ) )
            // PsiInternalUseCase.g:452:2: (otherlv_0= '.' (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) ) ( (lv_exception_5_0= ruleException ) ) )
            {
            // PsiInternalUseCase.g:452:2: (otherlv_0= '.' (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) ) ( (lv_exception_5_0= ruleException ) ) )
            // PsiInternalUseCase.g:453:3: otherlv_0= '.' (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) ) ( (lv_exception_5_0= ruleException ) )
            {

            			markLeaf(elementTypeProvider.getRaiseError_FullStopKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,18,FOLLOW_20); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:460:3: (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            else if ( (LA12_0==20) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // PsiInternalUseCase.g:461:4: otherlv_1= 'Raise'
                    {

                    				markLeaf(elementTypeProvider.getRaiseError_RaiseKeyword_1_0ElementType());
                    			
                    otherlv_1=(Token)match(input,19,FOLLOW_21); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:469:4: (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' )
                    {
                    // PsiInternalUseCase.g:469:4: (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' )
                    // PsiInternalUseCase.g:470:5: otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise'
                    {

                    					markLeaf(elementTypeProvider.getRaiseError_OnKeyword_1_1_0ElementType());
                    				
                    otherlv_2=(Token)match(input,20,FOLLOW_22); 

                    					doneLeaf(otherlv_2);
                    				

                    					markLeaf(elementTypeProvider.getRaiseError_ErrorKeyword_1_1_1ElementType());
                    				
                    otherlv_3=(Token)match(input,21,FOLLOW_23); 

                    					doneLeaf(otherlv_3);
                    				

                    					markLeaf(elementTypeProvider.getRaiseError_RaiseKeyword_1_1_2ElementType());
                    				
                    otherlv_4=(Token)match(input,22,FOLLOW_21); 

                    					doneLeaf(otherlv_4);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:493:3: ( (lv_exception_5_0= ruleException ) )
            // PsiInternalUseCase.g:494:4: (lv_exception_5_0= ruleException )
            {
            // PsiInternalUseCase.g:494:4: (lv_exception_5_0= ruleException )
            // PsiInternalUseCase.g:495:5: lv_exception_5_0= ruleException
            {

            					markComposite(elementTypeProvider.getRaiseError_ExceptionExceptionParserRuleCall_2_0ElementType());
            				
            pushFollow(FOLLOW_2);
            lv_exception_5_0=ruleException();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

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
    // $ANTLR end "ruleRaiseError"


    // $ANTLR start "entryRuleException"
    // PsiInternalUseCase.g:512:1: entryRuleException returns [Boolean current=false] : iv_ruleException= ruleException EOF ;
    public final Boolean entryRuleException() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleException = null;


        try {
            // PsiInternalUseCase.g:512:51: (iv_ruleException= ruleException EOF )
            // PsiInternalUseCase.g:513:2: iv_ruleException= ruleException EOF
            {
             markComposite(elementTypeProvider.getExceptionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleException=ruleException();

            state._fsp--;

             current =iv_ruleException; 
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
    // $ANTLR end "entryRuleException"


    // $ANTLR start "ruleException"
    // PsiInternalUseCase.g:519:1: ruleException returns [Boolean current=false] : ( (otherlv_0= RULE_ID ) ) ;
    public final Boolean ruleException() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;

        try {
            // PsiInternalUseCase.g:520:1: ( ( (otherlv_0= RULE_ID ) ) )
            // PsiInternalUseCase.g:521:2: ( (otherlv_0= RULE_ID ) )
            {
            // PsiInternalUseCase.g:521:2: ( (otherlv_0= RULE_ID ) )
            // PsiInternalUseCase.g:522:3: (otherlv_0= RULE_ID )
            {
            // PsiInternalUseCase.g:522:3: (otherlv_0= RULE_ID )
            // PsiInternalUseCase.g:523:4: otherlv_0= RULE_ID
            {

            				if (!current) {
            					associateWithSemanticElement();
            					current = true;
            				}
            			

            				markLeaf(elementTypeProvider.getException_TypeExceptionDeclerationCrossReference_0ElementType());
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				doneLeaf(otherlv_0);
            			

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
    // $ANTLR end "ruleException"


    // $ANTLR start "entryRuleDescription"
    // PsiInternalUseCase.g:541:1: entryRuleDescription returns [Boolean current=false] : iv_ruleDescription= ruleDescription EOF ;
    public final Boolean entryRuleDescription() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleDescription = null;


        try {
            // PsiInternalUseCase.g:541:53: (iv_ruleDescription= ruleDescription EOF )
            // PsiInternalUseCase.g:542:2: iv_ruleDescription= ruleDescription EOF
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
    // PsiInternalUseCase.g:548:1: ruleDescription returns [Boolean current=false] : (otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final Boolean ruleDescription() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

        try {
            // PsiInternalUseCase.g:549:1: ( (otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // PsiInternalUseCase.g:550:2: (otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // PsiInternalUseCase.g:550:2: (otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) ) )
            // PsiInternalUseCase.g:551:3: otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) )
            {

            			markLeaf(elementTypeProvider.getDescription_DescriptionKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:558:3: ( (lv_name_1_0= RULE_STRING ) )
            // PsiInternalUseCase.g:559:4: (lv_name_1_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:559:4: (lv_name_1_0= RULE_STRING )
            // PsiInternalUseCase.g:560:5: lv_name_1_0= RULE_STRING
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


    // $ANTLR start "entryRuleNotes"
    // PsiInternalUseCase.g:579:1: entryRuleNotes returns [Boolean current=false] : iv_ruleNotes= ruleNotes EOF ;
    public final Boolean entryRuleNotes() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleNotes = null;


        try {
            // PsiInternalUseCase.g:579:47: (iv_ruleNotes= ruleNotes EOF )
            // PsiInternalUseCase.g:580:2: iv_ruleNotes= ruleNotes EOF
            {
             markComposite(elementTypeProvider.getNotesElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotes=ruleNotes();

            state._fsp--;

             current =iv_ruleNotes; 
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
    // $ANTLR end "entryRuleNotes"


    // $ANTLR start "ruleNotes"
    // PsiInternalUseCase.g:586:1: ruleNotes returns [Boolean current=false] : ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) ( (lv_content_2_0= RULE_STRING ) ) ) ;
    public final Boolean ruleNotes() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;

        try {
            // PsiInternalUseCase.g:587:1: ( ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) ( (lv_content_2_0= RULE_STRING ) ) ) )
            // PsiInternalUseCase.g:588:2: ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) ( (lv_content_2_0= RULE_STRING ) ) )
            {
            // PsiInternalUseCase.g:588:2: ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) ( (lv_content_2_0= RULE_STRING ) ) )
            // PsiInternalUseCase.g:589:3: (otherlv_0= 'notes:' | otherlv_1= 'note:' ) ( (lv_content_2_0= RULE_STRING ) )
            {
            // PsiInternalUseCase.g:589:3: (otherlv_0= 'notes:' | otherlv_1= 'note:' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            else if ( (LA13_0==25) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // PsiInternalUseCase.g:590:4: otherlv_0= 'notes:'
                    {

                    				markLeaf(elementTypeProvider.getNotes_NotesKeyword_0_0ElementType());
                    			
                    otherlv_0=(Token)match(input,24,FOLLOW_5); 

                    				doneLeaf(otherlv_0);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:598:4: otherlv_1= 'note:'
                    {

                    				markLeaf(elementTypeProvider.getNotes_NoteKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,25,FOLLOW_5); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;

            }

            // PsiInternalUseCase.g:606:3: ( (lv_content_2_0= RULE_STRING ) )
            // PsiInternalUseCase.g:607:4: (lv_content_2_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:607:4: (lv_content_2_0= RULE_STRING )
            // PsiInternalUseCase.g:608:5: lv_content_2_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getNotes_ContentSTRINGTerminalRuleCall_1_0ElementType());
            				
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_content_2_0);
            				

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
    // $ANTLR end "ruleNotes"


    // $ANTLR start "entryRuleInputs"
    // PsiInternalUseCase.g:627:1: entryRuleInputs returns [Boolean current=false] : iv_ruleInputs= ruleInputs EOF ;
    public final Boolean entryRuleInputs() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleInputs = null;


        try {
            // PsiInternalUseCase.g:627:48: (iv_ruleInputs= ruleInputs EOF )
            // PsiInternalUseCase.g:628:2: iv_ruleInputs= ruleInputs EOF
            {
             markComposite(elementTypeProvider.getInputsElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputs=ruleInputs();

            state._fsp--;

             current =iv_ruleInputs; 
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
    // $ANTLR end "entryRuleInputs"


    // $ANTLR start "ruleInputs"
    // PsiInternalUseCase.g:634:1: ruleInputs returns [Boolean current=false] : ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) ( (lv_inputs_7_0= ruleInput ) )* ) ;
    public final Boolean ruleInputs() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Boolean lv_inputs_7_0 = null;


        try {
            // PsiInternalUseCase.g:635:1: ( ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) ( (lv_inputs_7_0= ruleInput ) )* ) )
            // PsiInternalUseCase.g:636:2: ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) ( (lv_inputs_7_0= ruleInput ) )* )
            {
            // PsiInternalUseCase.g:636:2: ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) ( (lv_inputs_7_0= ruleInput ) )* )
            // PsiInternalUseCase.g:637:3: (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) ( (lv_inputs_7_0= ruleInput ) )*
            {
            // PsiInternalUseCase.g:637:3: (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt14=1;
                }
                break;
            case 27:
                {
                alt14=2;
                }
                break;
            case 28:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // PsiInternalUseCase.g:638:4: otherlv_0= 'requires:'
                    {

                    				markLeaf(elementTypeProvider.getInputs_RequiresKeyword_0_0ElementType());
                    			
                    otherlv_0=(Token)match(input,26,FOLLOW_24); 

                    				doneLeaf(otherlv_0);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:646:4: otherlv_1= 'require:'
                    {

                    				markLeaf(elementTypeProvider.getInputs_RequireKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,27,FOLLOW_24); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;
                case 3 :
                    // PsiInternalUseCase.g:654:4: (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' )
                    {
                    // PsiInternalUseCase.g:654:4: (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' )
                    // PsiInternalUseCase.g:655:5: otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':'
                    {

                    					markLeaf(elementTypeProvider.getInputs_RequiresKeyword_0_2_0ElementType());
                    				
                    otherlv_2=(Token)match(input,28,FOLLOW_25); 

                    					doneLeaf(otherlv_2);
                    				

                    					markLeaf(elementTypeProvider.getInputs_TheKeyword_0_2_1ElementType());
                    				
                    otherlv_3=(Token)match(input,29,FOLLOW_26); 

                    					doneLeaf(otherlv_3);
                    				

                    					markLeaf(elementTypeProvider.getInputs_FollowingKeyword_0_2_2ElementType());
                    				
                    otherlv_4=(Token)match(input,30,FOLLOW_27); 

                    					doneLeaf(otherlv_4);
                    				

                    					markLeaf(elementTypeProvider.getInputs_InputKeyword_0_2_3ElementType());
                    				
                    otherlv_5=(Token)match(input,31,FOLLOW_28); 

                    					doneLeaf(otherlv_5);
                    				

                    					markLeaf(elementTypeProvider.getInputs_ColonKeyword_0_2_4ElementType());
                    				
                    otherlv_6=(Token)match(input,32,FOLLOW_24); 

                    					doneLeaf(otherlv_6);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:692:3: ( (lv_inputs_7_0= ruleInput ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==37||LA15_0==42) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // PsiInternalUseCase.g:693:4: (lv_inputs_7_0= ruleInput )
            	    {
            	    // PsiInternalUseCase.g:693:4: (lv_inputs_7_0= ruleInput )
            	    // PsiInternalUseCase.g:694:5: lv_inputs_7_0= ruleInput
            	    {

            	    					markComposite(elementTypeProvider.getInputs_InputsInputParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_inputs_7_0=ruleInput();

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
            	    break loop15;
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
    // $ANTLR end "ruleInputs"


    // $ANTLR start "entryRuleOutputs"
    // PsiInternalUseCase.g:711:1: entryRuleOutputs returns [Boolean current=false] : iv_ruleOutputs= ruleOutputs EOF ;
    public final Boolean entryRuleOutputs() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleOutputs = null;


        try {
            // PsiInternalUseCase.g:711:49: (iv_ruleOutputs= ruleOutputs EOF )
            // PsiInternalUseCase.g:712:2: iv_ruleOutputs= ruleOutputs EOF
            {
             markComposite(elementTypeProvider.getOutputsElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutputs=ruleOutputs();

            state._fsp--;

             current =iv_ruleOutputs; 
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
    // $ANTLR end "entryRuleOutputs"


    // $ANTLR start "ruleOutputs"
    // PsiInternalUseCase.g:718:1: ruleOutputs returns [Boolean current=false] : ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) ( (lv_outputs_7_0= ruleOutput ) )* ) ;
    public final Boolean ruleOutputs() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Boolean lv_outputs_7_0 = null;


        try {
            // PsiInternalUseCase.g:719:1: ( ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) ( (lv_outputs_7_0= ruleOutput ) )* ) )
            // PsiInternalUseCase.g:720:2: ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) ( (lv_outputs_7_0= ruleOutput ) )* )
            {
            // PsiInternalUseCase.g:720:2: ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) ( (lv_outputs_7_0= ruleOutput ) )* )
            // PsiInternalUseCase.g:721:3: (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) ( (lv_outputs_7_0= ruleOutput ) )*
            {
            // PsiInternalUseCase.g:721:3: (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt16=1;
                }
                break;
            case 34:
                {
                alt16=2;
                }
                break;
            case 35:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // PsiInternalUseCase.g:722:4: otherlv_0= 'produces:'
                    {

                    				markLeaf(elementTypeProvider.getOutputs_ProducesKeyword_0_0ElementType());
                    			
                    otherlv_0=(Token)match(input,33,FOLLOW_24); 

                    				doneLeaf(otherlv_0);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:730:4: otherlv_1= 'produce:'
                    {

                    				markLeaf(elementTypeProvider.getOutputs_ProduceKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,34,FOLLOW_24); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;
                case 3 :
                    // PsiInternalUseCase.g:738:4: (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' )
                    {
                    // PsiInternalUseCase.g:738:4: (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' )
                    // PsiInternalUseCase.g:739:5: otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':'
                    {

                    					markLeaf(elementTypeProvider.getOutputs_ProducesKeyword_0_2_0ElementType());
                    				
                    otherlv_2=(Token)match(input,35,FOLLOW_25); 

                    					doneLeaf(otherlv_2);
                    				

                    					markLeaf(elementTypeProvider.getOutputs_TheKeyword_0_2_1ElementType());
                    				
                    otherlv_3=(Token)match(input,29,FOLLOW_26); 

                    					doneLeaf(otherlv_3);
                    				

                    					markLeaf(elementTypeProvider.getOutputs_FollowingKeyword_0_2_2ElementType());
                    				
                    otherlv_4=(Token)match(input,30,FOLLOW_29); 

                    					doneLeaf(otherlv_4);
                    				

                    					markLeaf(elementTypeProvider.getOutputs_OutputKeyword_0_2_3ElementType());
                    				
                    otherlv_5=(Token)match(input,36,FOLLOW_28); 

                    					doneLeaf(otherlv_5);
                    				

                    					markLeaf(elementTypeProvider.getOutputs_ColonKeyword_0_2_4ElementType());
                    				
                    otherlv_6=(Token)match(input,32,FOLLOW_24); 

                    					doneLeaf(otherlv_6);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:776:3: ( (lv_outputs_7_0= ruleOutput ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==37||LA17_0==42) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // PsiInternalUseCase.g:777:4: (lv_outputs_7_0= ruleOutput )
            	    {
            	    // PsiInternalUseCase.g:777:4: (lv_outputs_7_0= ruleOutput )
            	    // PsiInternalUseCase.g:778:5: lv_outputs_7_0= ruleOutput
            	    {

            	    					markComposite(elementTypeProvider.getOutputs_OutputsOutputParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_outputs_7_0=ruleOutput();

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
            	    break loop17;
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
    // $ANTLR end "ruleOutputs"


    // $ANTLR start "entryRuleType"
    // PsiInternalUseCase.g:795:1: entryRuleType returns [Boolean current=false] : iv_ruleType= ruleType EOF ;
    public final Boolean entryRuleType() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleType = null;


        try {
            // PsiInternalUseCase.g:795:46: (iv_ruleType= ruleType EOF )
            // PsiInternalUseCase.g:796:2: iv_ruleType= ruleType EOF
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
    // PsiInternalUseCase.g:802:1: ruleType returns [Boolean current=false] : (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) ;
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
            // PsiInternalUseCase.g:803:1: ( (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) )
            // PsiInternalUseCase.g:804:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            {
            // PsiInternalUseCase.g:804:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            // PsiInternalUseCase.g:805:3: otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            {

            			markLeaf(elementTypeProvider.getType_HyphenMinusKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,37,FOLLOW_21); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:812:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalUseCase.g:813:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalUseCase.g:813:4: (lv_name_1_0= RULE_ID )
            // PsiInternalUseCase.g:814:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getType_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getType_LeftParenthesisKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,38,FOLLOW_5); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalUseCase.g:836:3: ( (lv_description_3_0= RULE_STRING ) )
            // PsiInternalUseCase.g:837:4: (lv_description_3_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:837:4: (lv_description_3_0= RULE_STRING )
            // PsiInternalUseCase.g:838:5: lv_description_3_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getType_DescriptionSTRINGTerminalRuleCall_3_0ElementType());
            				
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_description_3_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getType_RightParenthesisKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,39,FOLLOW_32); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalUseCase.g:860:3: (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==40) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // PsiInternalUseCase.g:861:4: otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']'
                    {

                    				markLeaf(elementTypeProvider.getType_LeftSquareBracketKeyword_5_0ElementType());
                    			
                    otherlv_5=(Token)match(input,40,FOLLOW_21); 

                    				doneLeaf(otherlv_5);
                    			
                    // PsiInternalUseCase.g:868:4: ( (lv_importInfo_6_0= ruleQualifiedName ) )
                    // PsiInternalUseCase.g:869:5: (lv_importInfo_6_0= ruleQualifiedName )
                    {
                    // PsiInternalUseCase.g:869:5: (lv_importInfo_6_0= ruleQualifiedName )
                    // PsiInternalUseCase.g:870:6: lv_importInfo_6_0= ruleQualifiedName
                    {

                    						markComposite(elementTypeProvider.getType_ImportInfoQualifiedNameParserRuleCall_5_1_0ElementType());
                    					
                    pushFollow(FOLLOW_33);
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
                    			
                    otherlv_7=(Token)match(input,41,FOLLOW_2); 

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


    // $ANTLR start "entryRuleExceptionDecleration"
    // PsiInternalUseCase.g:895:1: entryRuleExceptionDecleration returns [Boolean current=false] : iv_ruleExceptionDecleration= ruleExceptionDecleration EOF ;
    public final Boolean entryRuleExceptionDecleration() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleExceptionDecleration = null;


        try {
            // PsiInternalUseCase.g:895:62: (iv_ruleExceptionDecleration= ruleExceptionDecleration EOF )
            // PsiInternalUseCase.g:896:2: iv_ruleExceptionDecleration= ruleExceptionDecleration EOF
            {
             markComposite(elementTypeProvider.getExceptionDeclerationElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleExceptionDecleration=ruleExceptionDecleration();

            state._fsp--;

             current =iv_ruleExceptionDecleration; 
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
    // $ANTLR end "entryRuleExceptionDecleration"


    // $ANTLR start "ruleExceptionDecleration"
    // PsiInternalUseCase.g:902:1: ruleExceptionDecleration returns [Boolean current=false] : (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) ;
    public final Boolean ruleExceptionDecleration() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_message_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Boolean lv_importInfo_6_0 = null;


        try {
            // PsiInternalUseCase.g:903:1: ( (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) )
            // PsiInternalUseCase.g:904:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            {
            // PsiInternalUseCase.g:904:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            // PsiInternalUseCase.g:905:3: otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            {

            			markLeaf(elementTypeProvider.getExceptionDecleration_HyphenMinusKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,37,FOLLOW_21); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:912:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalUseCase.g:913:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalUseCase.g:913:4: (lv_name_1_0= RULE_ID )
            // PsiInternalUseCase.g:914:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getExceptionDecleration_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getExceptionDecleration_LeftParenthesisKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,38,FOLLOW_5); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalUseCase.g:936:3: ( (lv_message_3_0= RULE_STRING ) )
            // PsiInternalUseCase.g:937:4: (lv_message_3_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:937:4: (lv_message_3_0= RULE_STRING )
            // PsiInternalUseCase.g:938:5: lv_message_3_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getExceptionDecleration_MessageSTRINGTerminalRuleCall_3_0ElementType());
            				
            lv_message_3_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_message_3_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getExceptionDecleration_RightParenthesisKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,39,FOLLOW_32); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalUseCase.g:960:3: (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==40) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // PsiInternalUseCase.g:961:4: otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']'
                    {

                    				markLeaf(elementTypeProvider.getExceptionDecleration_LeftSquareBracketKeyword_5_0ElementType());
                    			
                    otherlv_5=(Token)match(input,40,FOLLOW_21); 

                    				doneLeaf(otherlv_5);
                    			
                    // PsiInternalUseCase.g:968:4: ( (lv_importInfo_6_0= ruleQualifiedName ) )
                    // PsiInternalUseCase.g:969:5: (lv_importInfo_6_0= ruleQualifiedName )
                    {
                    // PsiInternalUseCase.g:969:5: (lv_importInfo_6_0= ruleQualifiedName )
                    // PsiInternalUseCase.g:970:6: lv_importInfo_6_0= ruleQualifiedName
                    {

                    						markComposite(elementTypeProvider.getExceptionDecleration_ImportInfoQualifiedNameParserRuleCall_5_1_0ElementType());
                    					
                    pushFollow(FOLLOW_33);
                    lv_importInfo_6_0=ruleQualifiedName();

                    state._fsp--;


                    						doneComposite();
                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getExceptionDecleration_RightSquareBracketKeyword_5_2ElementType());
                    			
                    otherlv_7=(Token)match(input,41,FOLLOW_2); 

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
    // $ANTLR end "ruleExceptionDecleration"


    // $ANTLR start "entryRuleInput"
    // PsiInternalUseCase.g:995:1: entryRuleInput returns [Boolean current=false] : iv_ruleInput= ruleInput EOF ;
    public final Boolean entryRuleInput() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleInput = null;


        try {
            // PsiInternalUseCase.g:995:47: (iv_ruleInput= ruleInput EOF )
            // PsiInternalUseCase.g:996:2: iv_ruleInput= ruleInput EOF
            {
             markComposite(elementTypeProvider.getInputElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // PsiInternalUseCase.g:1002:1: ruleInput returns [Boolean current=false] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? ) ;
    public final Boolean ruleInput() throws RecognitionException {
        Boolean current = false;

        Token lv_many_0_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_example_7_0=null;
        Token otherlv_8=null;

        try {
            // PsiInternalUseCase.g:1003:1: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? ) )
            // PsiInternalUseCase.g:1004:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? )
            {
            // PsiInternalUseCase.g:1004:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? )
            // PsiInternalUseCase.g:1005:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )?
            {
            // PsiInternalUseCase.g:1005:3: ( (lv_many_0_0= 'many' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==42) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // PsiInternalUseCase.g:1006:4: (lv_many_0_0= 'many' )
                    {
                    // PsiInternalUseCase.g:1006:4: (lv_many_0_0= 'many' )
                    // PsiInternalUseCase.g:1007:5: lv_many_0_0= 'many'
                    {

                    					markLeaf(elementTypeProvider.getInput_ManyManyKeyword_0_0ElementType());
                    				
                    lv_many_0_0=(Token)match(input,42,FOLLOW_34); 

                    					doneLeaf(lv_many_0_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getInput_HyphenMinusKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,37,FOLLOW_5); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalUseCase.g:1029:3: ( (lv_content_2_0= RULE_STRING ) )
            // PsiInternalUseCase.g:1030:4: (lv_content_2_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:1030:4: (lv_content_2_0= RULE_STRING )
            // PsiInternalUseCase.g:1031:5: lv_content_2_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getInput_ContentSTRINGTerminalRuleCall_2_0ElementType());
            				
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_content_2_0);
            				

            }


            }

            // PsiInternalUseCase.g:1046:3: (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==43) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // PsiInternalUseCase.g:1047:4: otherlv_3= 'as' ( (otherlv_4= RULE_ID ) )
                    {

                    				markLeaf(elementTypeProvider.getInput_AsKeyword_3_0ElementType());
                    			
                    otherlv_3=(Token)match(input,43,FOLLOW_21); 

                    				doneLeaf(otherlv_3);
                    			
                    // PsiInternalUseCase.g:1054:4: ( (otherlv_4= RULE_ID ) )
                    // PsiInternalUseCase.g:1055:5: (otherlv_4= RULE_ID )
                    {
                    // PsiInternalUseCase.g:1055:5: (otherlv_4= RULE_ID )
                    // PsiInternalUseCase.g:1056:6: otherlv_4= RULE_ID
                    {

                    						if (!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						markLeaf(elementTypeProvider.getInput_TypeTypeCrossReference_3_1_0ElementType());
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_36); 

                    						doneLeaf(otherlv_4);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:1072:3: (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // PsiInternalUseCase.g:1073:4: otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')'
                    {

                    				markLeaf(elementTypeProvider.getInput_LeftParenthesisKeyword_4_0ElementType());
                    			
                    otherlv_5=(Token)match(input,38,FOLLOW_37); 

                    				doneLeaf(otherlv_5);
                    			

                    				markLeaf(elementTypeProvider.getInput_EGKeyword_4_1ElementType());
                    			
                    otherlv_6=(Token)match(input,44,FOLLOW_5); 

                    				doneLeaf(otherlv_6);
                    			
                    // PsiInternalUseCase.g:1087:4: ( (lv_example_7_0= RULE_STRING ) )
                    // PsiInternalUseCase.g:1088:5: (lv_example_7_0= RULE_STRING )
                    {
                    // PsiInternalUseCase.g:1088:5: (lv_example_7_0= RULE_STRING )
                    // PsiInternalUseCase.g:1089:6: lv_example_7_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getInput_ExampleSTRINGTerminalRuleCall_4_2_0ElementType());
                    					
                    lv_example_7_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_example_7_0);
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getInput_RightParenthesisKeyword_4_3ElementType());
                    			
                    otherlv_8=(Token)match(input,39,FOLLOW_2); 

                    				doneLeaf(otherlv_8);
                    			

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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // PsiInternalUseCase.g:1116:1: entryRuleOutput returns [Boolean current=false] : iv_ruleOutput= ruleOutput EOF ;
    public final Boolean entryRuleOutput() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleOutput = null;


        try {
            // PsiInternalUseCase.g:1116:48: (iv_ruleOutput= ruleOutput EOF )
            // PsiInternalUseCase.g:1117:2: iv_ruleOutput= ruleOutput EOF
            {
             markComposite(elementTypeProvider.getOutputElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput; 
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
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // PsiInternalUseCase.g:1123:1: ruleOutput returns [Boolean current=false] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? ) ;
    public final Boolean ruleOutput() throws RecognitionException {
        Boolean current = false;

        Token lv_many_0_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_example_7_0=null;
        Token otherlv_8=null;

        try {
            // PsiInternalUseCase.g:1124:1: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? ) )
            // PsiInternalUseCase.g:1125:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? )
            {
            // PsiInternalUseCase.g:1125:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? )
            // PsiInternalUseCase.g:1126:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )?
            {
            // PsiInternalUseCase.g:1126:3: ( (lv_many_0_0= 'many' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // PsiInternalUseCase.g:1127:4: (lv_many_0_0= 'many' )
                    {
                    // PsiInternalUseCase.g:1127:4: (lv_many_0_0= 'many' )
                    // PsiInternalUseCase.g:1128:5: lv_many_0_0= 'many'
                    {

                    					markLeaf(elementTypeProvider.getOutput_ManyManyKeyword_0_0ElementType());
                    				
                    lv_many_0_0=(Token)match(input,42,FOLLOW_34); 

                    					doneLeaf(lv_many_0_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getOutput_HyphenMinusKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,37,FOLLOW_5); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalUseCase.g:1150:3: ( (lv_content_2_0= RULE_STRING ) )
            // PsiInternalUseCase.g:1151:4: (lv_content_2_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:1151:4: (lv_content_2_0= RULE_STRING )
            // PsiInternalUseCase.g:1152:5: lv_content_2_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getOutput_ContentSTRINGTerminalRuleCall_2_0ElementType());
            				
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_content_2_0);
            				

            }


            }

            // PsiInternalUseCase.g:1167:3: (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==43) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // PsiInternalUseCase.g:1168:4: otherlv_3= 'as' ( (otherlv_4= RULE_ID ) )
                    {

                    				markLeaf(elementTypeProvider.getOutput_AsKeyword_3_0ElementType());
                    			
                    otherlv_3=(Token)match(input,43,FOLLOW_21); 

                    				doneLeaf(otherlv_3);
                    			
                    // PsiInternalUseCase.g:1175:4: ( (otherlv_4= RULE_ID ) )
                    // PsiInternalUseCase.g:1176:5: (otherlv_4= RULE_ID )
                    {
                    // PsiInternalUseCase.g:1176:5: (otherlv_4= RULE_ID )
                    // PsiInternalUseCase.g:1177:6: otherlv_4= RULE_ID
                    {

                    						if (!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						markLeaf(elementTypeProvider.getOutput_TypeTypeCrossReference_3_1_0ElementType());
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_36); 

                    						doneLeaf(otherlv_4);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:1193:3: (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // PsiInternalUseCase.g:1194:4: otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')'
                    {

                    				markLeaf(elementTypeProvider.getOutput_LeftParenthesisKeyword_4_0ElementType());
                    			
                    otherlv_5=(Token)match(input,38,FOLLOW_37); 

                    				doneLeaf(otherlv_5);
                    			

                    				markLeaf(elementTypeProvider.getOutput_EGKeyword_4_1ElementType());
                    			
                    otherlv_6=(Token)match(input,44,FOLLOW_5); 

                    				doneLeaf(otherlv_6);
                    			
                    // PsiInternalUseCase.g:1208:4: ( (lv_example_7_0= RULE_STRING ) )
                    // PsiInternalUseCase.g:1209:5: (lv_example_7_0= RULE_STRING )
                    {
                    // PsiInternalUseCase.g:1209:5: (lv_example_7_0= RULE_STRING )
                    // PsiInternalUseCase.g:1210:6: lv_example_7_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getOutput_ExampleSTRINGTerminalRuleCall_4_2_0ElementType());
                    					
                    lv_example_7_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_example_7_0);
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getOutput_RightParenthesisKeyword_4_3ElementType());
                    			
                    otherlv_8=(Token)match(input,39,FOLLOW_2); 

                    				doneLeaf(otherlv_8);
                    			

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
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleAllowedUserGroups"
    // PsiInternalUseCase.g:1237:1: entryRuleAllowedUserGroups returns [Boolean current=false] : iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF ;
    public final Boolean entryRuleAllowedUserGroups() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAllowedUserGroups = null;


        try {
            // PsiInternalUseCase.g:1237:59: (iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF )
            // PsiInternalUseCase.g:1238:2: iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF
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
    // PsiInternalUseCase.g:1244:1: ruleAllowedUserGroups returns [Boolean current=false] : (otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )* ) ;
    public final Boolean ruleAllowedUserGroups() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Boolean lv_groups_1_0 = null;


        try {
            // PsiInternalUseCase.g:1245:1: ( (otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )* ) )
            // PsiInternalUseCase.g:1246:2: (otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )* )
            {
            // PsiInternalUseCase.g:1246:2: (otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )* )
            // PsiInternalUseCase.g:1247:3: otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )*
            {

            			markLeaf(elementTypeProvider.getAllowedUserGroups_AllowedUsergroupsKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,45,FOLLOW_24); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:1254:3: ( (lv_groups_1_0= ruleAllowedUserGroup ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==37||LA26_0==42) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // PsiInternalUseCase.g:1255:4: (lv_groups_1_0= ruleAllowedUserGroup )
            	    {
            	    // PsiInternalUseCase.g:1255:4: (lv_groups_1_0= ruleAllowedUserGroup )
            	    // PsiInternalUseCase.g:1256:5: lv_groups_1_0= ruleAllowedUserGroup
            	    {

            	    					markComposite(elementTypeProvider.getAllowedUserGroups_GroupsAllowedUserGroupParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_24);
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
            	    break loop26;
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
    // PsiInternalUseCase.g:1273:1: entryRuleAllowedUserGroup returns [Boolean current=false] : iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF ;
    public final Boolean entryRuleAllowedUserGroup() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAllowedUserGroup = null;


        try {
            // PsiInternalUseCase.g:1273:58: (iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF )
            // PsiInternalUseCase.g:1274:2: iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF
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
    // PsiInternalUseCase.g:1280:1: ruleAllowedUserGroup returns [Boolean current=false] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final Boolean ruleAllowedUserGroup() throws RecognitionException {
        Boolean current = false;

        Token lv_many_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

        try {
            // PsiInternalUseCase.g:1281:1: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) )
            // PsiInternalUseCase.g:1282:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? )
            {
            // PsiInternalUseCase.g:1282:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? )
            // PsiInternalUseCase.g:1283:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            {
            // PsiInternalUseCase.g:1283:3: ( (lv_many_0_0= 'many' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // PsiInternalUseCase.g:1284:4: (lv_many_0_0= 'many' )
                    {
                    // PsiInternalUseCase.g:1284:4: (lv_many_0_0= 'many' )
                    // PsiInternalUseCase.g:1285:5: lv_many_0_0= 'many'
                    {

                    					markLeaf(elementTypeProvider.getAllowedUserGroup_ManyManyKeyword_0_0ElementType());
                    				
                    lv_many_0_0=(Token)match(input,42,FOLLOW_34); 

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
            		
            otherlv_1=(Token)match(input,37,FOLLOW_5); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalUseCase.g:1307:3: ( (lv_name_2_0= RULE_STRING ) )
            // PsiInternalUseCase.g:1308:4: (lv_name_2_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:1308:4: (lv_name_2_0= RULE_STRING )
            // PsiInternalUseCase.g:1309:5: lv_name_2_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getAllowedUserGroup_NameSTRINGTerminalRuleCall_2_0ElementType());
            				
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_2_0);
            				

            }


            }

            // PsiInternalUseCase.g:1324:3: (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==43) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // PsiInternalUseCase.g:1325:4: otherlv_3= 'as' ( (otherlv_4= RULE_ID ) )
                    {

                    				markLeaf(elementTypeProvider.getAllowedUserGroup_AsKeyword_3_0ElementType());
                    			
                    otherlv_3=(Token)match(input,43,FOLLOW_21); 

                    				doneLeaf(otherlv_3);
                    			
                    // PsiInternalUseCase.g:1332:4: ( (otherlv_4= RULE_ID ) )
                    // PsiInternalUseCase.g:1333:5: (otherlv_4= RULE_ID )
                    {
                    // PsiInternalUseCase.g:1333:5: (otherlv_4= RULE_ID )
                    // PsiInternalUseCase.g:1334:6: otherlv_4= RULE_ID
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
    // PsiInternalUseCase.g:1354:1: entryRuleQualifiedName returns [Boolean current=false] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final Boolean entryRuleQualifiedName() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleQualifiedName = null;


        try {
            // PsiInternalUseCase.g:1354:55: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // PsiInternalUseCase.g:1355:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // PsiInternalUseCase.g:1361:1: ruleQualifiedName returns [Boolean current=false] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final Boolean ruleQualifiedName() throws RecognitionException {
        Boolean current = false;

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

        try {
            // PsiInternalUseCase.g:1362:1: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // PsiInternalUseCase.g:1363:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // PsiInternalUseCase.g:1363:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // PsiInternalUseCase.g:1364:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {

            			markLeaf(elementTypeProvider.getQualifiedName_IDTerminalRuleCall_0ElementType());
            		
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            			doneLeaf(this_ID_0);
            		
            // PsiInternalUseCase.g:1371:3: (kw= '.' this_ID_2= RULE_ID )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==18) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // PsiInternalUseCase.g:1372:4: kw= '.' this_ID_2= RULE_ID
            	    {

            	    				markLeaf(elementTypeProvider.getQualifiedName_FullStopKeyword_1_0ElementType());
            	    			
            	    kw=(Token)match(input,18,FOLLOW_21); 

            	    				doneLeaf(kw);
            	    			

            	    				markLeaf(elementTypeProvider.getQualifiedName_IDTerminalRuleCall_1_1ElementType());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    				doneLeaf(this_ID_2);
            	    			

            	    }
            	    break;

            	default :
            	    break loop29;
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


    // $ANTLR start "entryRuleQualifiedNumber"
    // PsiInternalUseCase.g:1391:1: entryRuleQualifiedNumber returns [Boolean current=false] : iv_ruleQualifiedNumber= ruleQualifiedNumber EOF ;
    public final Boolean entryRuleQualifiedNumber() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleQualifiedNumber = null;


        try {
            // PsiInternalUseCase.g:1391:57: (iv_ruleQualifiedNumber= ruleQualifiedNumber EOF )
            // PsiInternalUseCase.g:1392:2: iv_ruleQualifiedNumber= ruleQualifiedNumber EOF
            {
             markComposite(elementTypeProvider.getQualifiedNumberElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNumber=ruleQualifiedNumber();

            state._fsp--;

             current =iv_ruleQualifiedNumber; 
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
    // $ANTLR end "entryRuleQualifiedNumber"


    // $ANTLR start "ruleQualifiedNumber"
    // PsiInternalUseCase.g:1398:1: ruleQualifiedNumber returns [Boolean current=false] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' ) ;
    public final Boolean ruleQualifiedNumber() throws RecognitionException {
        Boolean current = false;

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

        try {
            // PsiInternalUseCase.g:1399:1: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' ) )
            // PsiInternalUseCase.g:1400:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' )
            {
            // PsiInternalUseCase.g:1400:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' )
            // PsiInternalUseCase.g:1401:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.'
            {

            			markLeaf(elementTypeProvider.getQualifiedNumber_INTTerminalRuleCall_0ElementType());
            		
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_39); 

            			doneLeaf(this_INT_0);
            		
            // PsiInternalUseCase.g:1408:3: (kw= '.' this_INT_2= RULE_INT )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==18) ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1==RULE_INT) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // PsiInternalUseCase.g:1409:4: kw= '.' this_INT_2= RULE_INT
            	    {

            	    				markLeaf(elementTypeProvider.getQualifiedNumber_FullStopKeyword_1_0ElementType());
            	    			
            	    kw=(Token)match(input,18,FOLLOW_40); 

            	    				doneLeaf(kw);
            	    			

            	    				markLeaf(elementTypeProvider.getQualifiedNumber_INTTerminalRuleCall_1_1ElementType());
            	    			
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_39); 

            	    				doneLeaf(this_INT_2);
            	    			

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            			markLeaf(elementTypeProvider.getQualifiedNumber_FullStopKeyword_2ElementType());
            		
            kw=(Token)match(input,18,FOLLOW_2); 

            			doneLeaf(kw);
            		

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
    // $ANTLR end "ruleQualifiedNumber"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000200E1F805000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000200E1F005000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000E1F005000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000E03005000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000003005000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000003001000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000042000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000084000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000040L});

}