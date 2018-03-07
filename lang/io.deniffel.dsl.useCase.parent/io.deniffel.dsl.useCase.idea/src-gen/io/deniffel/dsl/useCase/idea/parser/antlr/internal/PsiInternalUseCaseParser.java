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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'use-case'", "'end'", "'of'", "'pre-condition:'", "'pre-conditions:'", "'-'", "'steps:'", "'used'", "'types:'", "'errors:'", "'.'", "'Raise'", "'On'", "'error'", "'raise'", "'description:'", "'notes:'", "'note:'", "'requires:'", "'require:'", "'requires'", "'the'", "'following'", "'input'", "':'", "'produces:'", "'produce:'", "'produces'", "'output'", "'('", "')'", "'['", "']'", "'optional'", "'many'", "'as'", "'e.g'", "'allowed-usergroups:'"
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
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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
    // PsiInternalUseCase.g:118:1: ruleUseCase returns [Boolean current=false] : (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )? ( (lv_inputs_4_0= ruleInputs ) )? ( (lv_outputs_5_0= ruleOutputs ) )? ( (lv_preconditions_6_0= rulePreConditions ) )? ( (lv_steps_7_0= ruleSteps ) )? ( (lv_notes_8_0= ruleNotes ) )? otherlv_9= 'end' otherlv_10= 'of' otherlv_11= 'use-case' ) ;
    public final Boolean ruleUseCase() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Boolean lv_descriptions_2_0 = null;

        Boolean lv_allowedUserGroups_3_0 = null;

        Boolean lv_inputs_4_0 = null;

        Boolean lv_outputs_5_0 = null;

        Boolean lv_preconditions_6_0 = null;

        Boolean lv_steps_7_0 = null;

        Boolean lv_notes_8_0 = null;


        try {
            // PsiInternalUseCase.g:119:1: ( (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )? ( (lv_inputs_4_0= ruleInputs ) )? ( (lv_outputs_5_0= ruleOutputs ) )? ( (lv_preconditions_6_0= rulePreConditions ) )? ( (lv_steps_7_0= ruleSteps ) )? ( (lv_notes_8_0= ruleNotes ) )? otherlv_9= 'end' otherlv_10= 'of' otherlv_11= 'use-case' ) )
            // PsiInternalUseCase.g:120:2: (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )? ( (lv_inputs_4_0= ruleInputs ) )? ( (lv_outputs_5_0= ruleOutputs ) )? ( (lv_preconditions_6_0= rulePreConditions ) )? ( (lv_steps_7_0= ruleSteps ) )? ( (lv_notes_8_0= ruleNotes ) )? otherlv_9= 'end' otherlv_10= 'of' otherlv_11= 'use-case' )
            {
            // PsiInternalUseCase.g:120:2: (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )? ( (lv_inputs_4_0= ruleInputs ) )? ( (lv_outputs_5_0= ruleOutputs ) )? ( (lv_preconditions_6_0= rulePreConditions ) )? ( (lv_steps_7_0= ruleSteps ) )? ( (lv_notes_8_0= ruleNotes ) )? otherlv_9= 'end' otherlv_10= 'of' otherlv_11= 'use-case' )
            // PsiInternalUseCase.g:121:3: otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )? ( (lv_inputs_4_0= ruleInputs ) )? ( (lv_outputs_5_0= ruleOutputs ) )? ( (lv_preconditions_6_0= rulePreConditions ) )? ( (lv_steps_7_0= ruleSteps ) )? ( (lv_notes_8_0= ruleNotes ) )? otherlv_9= 'end' otherlv_10= 'of' otherlv_11= 'use-case'
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

            if ( (LA2_0==26) ) {
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

            if ( (LA3_0==48) ) {
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

            if ( ((LA4_0>=29 && LA4_0<=31)) ) {
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

            if ( ((LA5_0>=36 && LA5_0<=38)) ) {
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

            // PsiInternalUseCase.g:205:3: ( (lv_preconditions_6_0= rulePreConditions ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=14 && LA6_0<=15)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // PsiInternalUseCase.g:206:4: (lv_preconditions_6_0= rulePreConditions )
                    {
                    // PsiInternalUseCase.g:206:4: (lv_preconditions_6_0= rulePreConditions )
                    // PsiInternalUseCase.g:207:5: lv_preconditions_6_0= rulePreConditions
                    {

                    					markComposite(elementTypeProvider.getUseCase_PreconditionsPreConditionsParserRuleCall_6_0ElementType());
                    				
                    pushFollow(FOLLOW_11);
                    lv_preconditions_6_0=rulePreConditions();

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

            // PsiInternalUseCase.g:220:3: ( (lv_steps_7_0= ruleSteps ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // PsiInternalUseCase.g:221:4: (lv_steps_7_0= ruleSteps )
                    {
                    // PsiInternalUseCase.g:221:4: (lv_steps_7_0= ruleSteps )
                    // PsiInternalUseCase.g:222:5: lv_steps_7_0= ruleSteps
                    {

                    					markComposite(elementTypeProvider.getUseCase_StepsStepsParserRuleCall_7_0ElementType());
                    				
                    pushFollow(FOLLOW_12);
                    lv_steps_7_0=ruleSteps();

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

            // PsiInternalUseCase.g:235:3: ( (lv_notes_8_0= ruleNotes ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=27 && LA8_0<=28)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // PsiInternalUseCase.g:236:4: (lv_notes_8_0= ruleNotes )
                    {
                    // PsiInternalUseCase.g:236:4: (lv_notes_8_0= ruleNotes )
                    // PsiInternalUseCase.g:237:5: lv_notes_8_0= ruleNotes
                    {

                    					markComposite(elementTypeProvider.getUseCase_NotesNotesParserRuleCall_8_0ElementType());
                    				
                    pushFollow(FOLLOW_13);
                    lv_notes_8_0=ruleNotes();

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


            			markLeaf(elementTypeProvider.getUseCase_EndKeyword_9ElementType());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_14); 

            			doneLeaf(otherlv_9);
            		

            			markLeaf(elementTypeProvider.getUseCase_OfKeyword_10ElementType());
            		
            otherlv_10=(Token)match(input,13,FOLLOW_15); 

            			doneLeaf(otherlv_10);
            		

            			markLeaf(elementTypeProvider.getUseCase_UseCaseKeyword_11ElementType());
            		
            otherlv_11=(Token)match(input,11,FOLLOW_2); 

            			doneLeaf(otherlv_11);
            		

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


    // $ANTLR start "entryRulePreConditions"
    // PsiInternalUseCase.g:275:1: entryRulePreConditions returns [Boolean current=false] : iv_rulePreConditions= rulePreConditions EOF ;
    public final Boolean entryRulePreConditions() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulePreConditions = null;


        try {
            // PsiInternalUseCase.g:275:55: (iv_rulePreConditions= rulePreConditions EOF )
            // PsiInternalUseCase.g:276:2: iv_rulePreConditions= rulePreConditions EOF
            {
             markComposite(elementTypeProvider.getPreConditionsElementType()); 
            pushFollow(FOLLOW_1);
            iv_rulePreConditions=rulePreConditions();

            state._fsp--;

             current =iv_rulePreConditions; 
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
    // $ANTLR end "entryRulePreConditions"


    // $ANTLR start "rulePreConditions"
    // PsiInternalUseCase.g:282:1: rulePreConditions returns [Boolean current=false] : ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) ( (lv_conditions_2_0= ruleCondition ) )* ) ;
    public final Boolean rulePreConditions() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Boolean lv_conditions_2_0 = null;


        try {
            // PsiInternalUseCase.g:283:1: ( ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) ( (lv_conditions_2_0= ruleCondition ) )* ) )
            // PsiInternalUseCase.g:284:2: ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) ( (lv_conditions_2_0= ruleCondition ) )* )
            {
            // PsiInternalUseCase.g:284:2: ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) ( (lv_conditions_2_0= ruleCondition ) )* )
            // PsiInternalUseCase.g:285:3: (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) ( (lv_conditions_2_0= ruleCondition ) )*
            {
            // PsiInternalUseCase.g:285:3: (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            else if ( (LA9_0==15) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // PsiInternalUseCase.g:286:4: otherlv_0= 'pre-condition:'
                    {

                    				markLeaf(elementTypeProvider.getPreConditions_PreConditionKeyword_0_0ElementType());
                    			
                    otherlv_0=(Token)match(input,14,FOLLOW_16); 

                    				doneLeaf(otherlv_0);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:294:4: otherlv_1= 'pre-conditions:'
                    {

                    				markLeaf(elementTypeProvider.getPreConditions_PreConditionsKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,15,FOLLOW_16); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;

            }

            // PsiInternalUseCase.g:302:3: ( (lv_conditions_2_0= ruleCondition ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // PsiInternalUseCase.g:303:4: (lv_conditions_2_0= ruleCondition )
            	    {
            	    // PsiInternalUseCase.g:303:4: (lv_conditions_2_0= ruleCondition )
            	    // PsiInternalUseCase.g:304:5: lv_conditions_2_0= ruleCondition
            	    {

            	    					markComposite(elementTypeProvider.getPreConditions_ConditionsConditionParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_conditions_2_0=ruleCondition();

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
    // $ANTLR end "rulePreConditions"


    // $ANTLR start "entryRuleCondition"
    // PsiInternalUseCase.g:321:1: entryRuleCondition returns [Boolean current=false] : iv_ruleCondition= ruleCondition EOF ;
    public final Boolean entryRuleCondition() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleCondition = null;


        try {
            // PsiInternalUseCase.g:321:51: (iv_ruleCondition= ruleCondition EOF )
            // PsiInternalUseCase.g:322:2: iv_ruleCondition= ruleCondition EOF
            {
             markComposite(elementTypeProvider.getConditionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // PsiInternalUseCase.g:328:1: ruleCondition returns [Boolean current=false] : (otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) ) ) ;
    public final Boolean ruleCondition() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_content_1_0=null;

        try {
            // PsiInternalUseCase.g:329:1: ( (otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) ) ) )
            // PsiInternalUseCase.g:330:2: (otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) ) )
            {
            // PsiInternalUseCase.g:330:2: (otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) ) )
            // PsiInternalUseCase.g:331:3: otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) )
            {

            			markLeaf(elementTypeProvider.getCondition_HyphenMinusKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:338:3: ( (lv_content_1_0= RULE_STRING ) )
            // PsiInternalUseCase.g:339:4: (lv_content_1_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:339:4: (lv_content_1_0= RULE_STRING )
            // PsiInternalUseCase.g:340:5: lv_content_1_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getCondition_ContentSTRINGTerminalRuleCall_1_0ElementType());
            				
            lv_content_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_content_1_0);
            				

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleSteps"
    // PsiInternalUseCase.g:359:1: entryRuleSteps returns [Boolean current=false] : iv_ruleSteps= ruleSteps EOF ;
    public final Boolean entryRuleSteps() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleSteps = null;


        try {
            // PsiInternalUseCase.g:359:47: (iv_ruleSteps= ruleSteps EOF )
            // PsiInternalUseCase.g:360:2: iv_ruleSteps= ruleSteps EOF
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
    // PsiInternalUseCase.g:366:1: ruleSteps returns [Boolean current=false] : (otherlv_0= 'steps:' ( (lv_steps_1_0= ruleStep ) )* ) ;
    public final Boolean ruleSteps() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Boolean lv_steps_1_0 = null;


        try {
            // PsiInternalUseCase.g:367:1: ( (otherlv_0= 'steps:' ( (lv_steps_1_0= ruleStep ) )* ) )
            // PsiInternalUseCase.g:368:2: (otherlv_0= 'steps:' ( (lv_steps_1_0= ruleStep ) )* )
            {
            // PsiInternalUseCase.g:368:2: (otherlv_0= 'steps:' ( (lv_steps_1_0= ruleStep ) )* )
            // PsiInternalUseCase.g:369:3: otherlv_0= 'steps:' ( (lv_steps_1_0= ruleStep ) )*
            {

            			markLeaf(elementTypeProvider.getSteps_StepsKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,17,FOLLOW_17); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:376:3: ( (lv_steps_1_0= ruleStep ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_INT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // PsiInternalUseCase.g:377:4: (lv_steps_1_0= ruleStep )
            	    {
            	    // PsiInternalUseCase.g:377:4: (lv_steps_1_0= ruleStep )
            	    // PsiInternalUseCase.g:378:5: lv_steps_1_0= ruleStep
            	    {

            	    					markComposite(elementTypeProvider.getSteps_StepsStepParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_17);
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
            	    break loop11;
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
    // PsiInternalUseCase.g:395:1: entryRuleUsedTypes returns [Boolean current=false] : iv_ruleUsedTypes= ruleUsedTypes EOF ;
    public final Boolean entryRuleUsedTypes() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleUsedTypes = null;


        try {
            // PsiInternalUseCase.g:395:51: (iv_ruleUsedTypes= ruleUsedTypes EOF )
            // PsiInternalUseCase.g:396:2: iv_ruleUsedTypes= ruleUsedTypes EOF
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
    // PsiInternalUseCase.g:402:1: ruleUsedTypes returns [Boolean current=false] : (otherlv_0= 'used' otherlv_1= 'types:' ( (lv_types_2_0= ruleType ) )* ) ;
    public final Boolean ruleUsedTypes() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Boolean lv_types_2_0 = null;


        try {
            // PsiInternalUseCase.g:403:1: ( (otherlv_0= 'used' otherlv_1= 'types:' ( (lv_types_2_0= ruleType ) )* ) )
            // PsiInternalUseCase.g:404:2: (otherlv_0= 'used' otherlv_1= 'types:' ( (lv_types_2_0= ruleType ) )* )
            {
            // PsiInternalUseCase.g:404:2: (otherlv_0= 'used' otherlv_1= 'types:' ( (lv_types_2_0= ruleType ) )* )
            // PsiInternalUseCase.g:405:3: otherlv_0= 'used' otherlv_1= 'types:' ( (lv_types_2_0= ruleType ) )*
            {

            			markLeaf(elementTypeProvider.getUsedTypes_UsedKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,18,FOLLOW_18); 

            			doneLeaf(otherlv_0);
            		

            			markLeaf(elementTypeProvider.getUsedTypes_TypesKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_16); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalUseCase.g:419:3: ( (lv_types_2_0= ruleType ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // PsiInternalUseCase.g:420:4: (lv_types_2_0= ruleType )
            	    {
            	    // PsiInternalUseCase.g:420:4: (lv_types_2_0= ruleType )
            	    // PsiInternalUseCase.g:421:5: lv_types_2_0= ruleType
            	    {

            	    					markComposite(elementTypeProvider.getUsedTypes_TypesTypeParserRuleCall_2_0ElementType());
            	    				
            	    pushFollow(FOLLOW_16);
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
            	    break loop12;
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
    // PsiInternalUseCase.g:438:1: entryRuleUsedExceptions returns [Boolean current=false] : iv_ruleUsedExceptions= ruleUsedExceptions EOF ;
    public final Boolean entryRuleUsedExceptions() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleUsedExceptions = null;


        try {
            // PsiInternalUseCase.g:438:56: (iv_ruleUsedExceptions= ruleUsedExceptions EOF )
            // PsiInternalUseCase.g:439:2: iv_ruleUsedExceptions= ruleUsedExceptions EOF
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
    // PsiInternalUseCase.g:445:1: ruleUsedExceptions returns [Boolean current=false] : (otherlv_0= 'used' otherlv_1= 'errors:' ( (lv_exceptions_2_0= ruleExceptionDecleration ) )* ) ;
    public final Boolean ruleUsedExceptions() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Boolean lv_exceptions_2_0 = null;


        try {
            // PsiInternalUseCase.g:446:1: ( (otherlv_0= 'used' otherlv_1= 'errors:' ( (lv_exceptions_2_0= ruleExceptionDecleration ) )* ) )
            // PsiInternalUseCase.g:447:2: (otherlv_0= 'used' otherlv_1= 'errors:' ( (lv_exceptions_2_0= ruleExceptionDecleration ) )* )
            {
            // PsiInternalUseCase.g:447:2: (otherlv_0= 'used' otherlv_1= 'errors:' ( (lv_exceptions_2_0= ruleExceptionDecleration ) )* )
            // PsiInternalUseCase.g:448:3: otherlv_0= 'used' otherlv_1= 'errors:' ( (lv_exceptions_2_0= ruleExceptionDecleration ) )*
            {

            			markLeaf(elementTypeProvider.getUsedExceptions_UsedKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,18,FOLLOW_19); 

            			doneLeaf(otherlv_0);
            		

            			markLeaf(elementTypeProvider.getUsedExceptions_ErrorsKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_16); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalUseCase.g:462:3: ( (lv_exceptions_2_0= ruleExceptionDecleration ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // PsiInternalUseCase.g:463:4: (lv_exceptions_2_0= ruleExceptionDecleration )
            	    {
            	    // PsiInternalUseCase.g:463:4: (lv_exceptions_2_0= ruleExceptionDecleration )
            	    // PsiInternalUseCase.g:464:5: lv_exceptions_2_0= ruleExceptionDecleration
            	    {

            	    					markComposite(elementTypeProvider.getUsedExceptions_ExceptionsExceptionDeclerationParserRuleCall_2_0ElementType());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_exceptions_2_0=ruleExceptionDecleration();

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
    // $ANTLR end "ruleUsedExceptions"


    // $ANTLR start "entryRuleStep"
    // PsiInternalUseCase.g:481:1: entryRuleStep returns [Boolean current=false] : iv_ruleStep= ruleStep EOF ;
    public final Boolean entryRuleStep() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleStep = null;


        try {
            // PsiInternalUseCase.g:481:46: (iv_ruleStep= ruleStep EOF )
            // PsiInternalUseCase.g:482:2: iv_ruleStep= ruleStep EOF
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
    // PsiInternalUseCase.g:488:1: ruleStep returns [Boolean current=false] : ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? ) ;
    public final Boolean ruleStep() throws RecognitionException {
        Boolean current = false;

        Token lv_action_1_0=null;
        Boolean lv_number_0_0 = null;

        Boolean lv_error_2_0 = null;


        try {
            // PsiInternalUseCase.g:489:1: ( ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? ) )
            // PsiInternalUseCase.g:490:2: ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? )
            {
            // PsiInternalUseCase.g:490:2: ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? )
            // PsiInternalUseCase.g:491:3: ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )?
            {
            // PsiInternalUseCase.g:491:3: ( (lv_number_0_0= ruleQualifiedNumber ) )
            // PsiInternalUseCase.g:492:4: (lv_number_0_0= ruleQualifiedNumber )
            {
            // PsiInternalUseCase.g:492:4: (lv_number_0_0= ruleQualifiedNumber )
            // PsiInternalUseCase.g:493:5: lv_number_0_0= ruleQualifiedNumber
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

            // PsiInternalUseCase.g:506:3: ( (lv_action_1_0= RULE_STRING ) )
            // PsiInternalUseCase.g:507:4: (lv_action_1_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:507:4: (lv_action_1_0= RULE_STRING )
            // PsiInternalUseCase.g:508:5: lv_action_1_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getStep_ActionSTRINGTerminalRuleCall_1_0ElementType());
            				
            lv_action_1_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_action_1_0);
            				

            }


            }

            // PsiInternalUseCase.g:523:3: ( (lv_error_2_0= ruleRaiseError ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // PsiInternalUseCase.g:524:4: (lv_error_2_0= ruleRaiseError )
                    {
                    // PsiInternalUseCase.g:524:4: (lv_error_2_0= ruleRaiseError )
                    // PsiInternalUseCase.g:525:5: lv_error_2_0= ruleRaiseError
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
    // PsiInternalUseCase.g:542:1: entryRuleRaiseError returns [Boolean current=false] : iv_ruleRaiseError= ruleRaiseError EOF ;
    public final Boolean entryRuleRaiseError() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleRaiseError = null;


        try {
            // PsiInternalUseCase.g:542:52: (iv_ruleRaiseError= ruleRaiseError EOF )
            // PsiInternalUseCase.g:543:2: iv_ruleRaiseError= ruleRaiseError EOF
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
    // PsiInternalUseCase.g:549:1: ruleRaiseError returns [Boolean current=false] : (otherlv_0= '.' (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) ) ( (lv_exception_5_0= ruleException ) ) ) ;
    public final Boolean ruleRaiseError() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Boolean lv_exception_5_0 = null;


        try {
            // PsiInternalUseCase.g:550:1: ( (otherlv_0= '.' (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) ) ( (lv_exception_5_0= ruleException ) ) ) )
            // PsiInternalUseCase.g:551:2: (otherlv_0= '.' (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) ) ( (lv_exception_5_0= ruleException ) ) )
            {
            // PsiInternalUseCase.g:551:2: (otherlv_0= '.' (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) ) ( (lv_exception_5_0= ruleException ) ) )
            // PsiInternalUseCase.g:552:3: otherlv_0= '.' (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) ) ( (lv_exception_5_0= ruleException ) )
            {

            			markLeaf(elementTypeProvider.getRaiseError_FullStopKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,21,FOLLOW_21); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:559:3: (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            else if ( (LA15_0==23) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // PsiInternalUseCase.g:560:4: otherlv_1= 'Raise'
                    {

                    				markLeaf(elementTypeProvider.getRaiseError_RaiseKeyword_1_0ElementType());
                    			
                    otherlv_1=(Token)match(input,22,FOLLOW_22); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:568:4: (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' )
                    {
                    // PsiInternalUseCase.g:568:4: (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' )
                    // PsiInternalUseCase.g:569:5: otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise'
                    {

                    					markLeaf(elementTypeProvider.getRaiseError_OnKeyword_1_1_0ElementType());
                    				
                    otherlv_2=(Token)match(input,23,FOLLOW_23); 

                    					doneLeaf(otherlv_2);
                    				

                    					markLeaf(elementTypeProvider.getRaiseError_ErrorKeyword_1_1_1ElementType());
                    				
                    otherlv_3=(Token)match(input,24,FOLLOW_24); 

                    					doneLeaf(otherlv_3);
                    				

                    					markLeaf(elementTypeProvider.getRaiseError_RaiseKeyword_1_1_2ElementType());
                    				
                    otherlv_4=(Token)match(input,25,FOLLOW_22); 

                    					doneLeaf(otherlv_4);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:592:3: ( (lv_exception_5_0= ruleException ) )
            // PsiInternalUseCase.g:593:4: (lv_exception_5_0= ruleException )
            {
            // PsiInternalUseCase.g:593:4: (lv_exception_5_0= ruleException )
            // PsiInternalUseCase.g:594:5: lv_exception_5_0= ruleException
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
    // PsiInternalUseCase.g:611:1: entryRuleException returns [Boolean current=false] : iv_ruleException= ruleException EOF ;
    public final Boolean entryRuleException() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleException = null;


        try {
            // PsiInternalUseCase.g:611:51: (iv_ruleException= ruleException EOF )
            // PsiInternalUseCase.g:612:2: iv_ruleException= ruleException EOF
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
    // PsiInternalUseCase.g:618:1: ruleException returns [Boolean current=false] : ( (otherlv_0= RULE_ID ) ) ;
    public final Boolean ruleException() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;

        try {
            // PsiInternalUseCase.g:619:1: ( ( (otherlv_0= RULE_ID ) ) )
            // PsiInternalUseCase.g:620:2: ( (otherlv_0= RULE_ID ) )
            {
            // PsiInternalUseCase.g:620:2: ( (otherlv_0= RULE_ID ) )
            // PsiInternalUseCase.g:621:3: (otherlv_0= RULE_ID )
            {
            // PsiInternalUseCase.g:621:3: (otherlv_0= RULE_ID )
            // PsiInternalUseCase.g:622:4: otherlv_0= RULE_ID
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
    // PsiInternalUseCase.g:640:1: entryRuleDescription returns [Boolean current=false] : iv_ruleDescription= ruleDescription EOF ;
    public final Boolean entryRuleDescription() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleDescription = null;


        try {
            // PsiInternalUseCase.g:640:53: (iv_ruleDescription= ruleDescription EOF )
            // PsiInternalUseCase.g:641:2: iv_ruleDescription= ruleDescription EOF
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
    // PsiInternalUseCase.g:647:1: ruleDescription returns [Boolean current=false] : (otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final Boolean ruleDescription() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

        try {
            // PsiInternalUseCase.g:648:1: ( (otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // PsiInternalUseCase.g:649:2: (otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // PsiInternalUseCase.g:649:2: (otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) ) )
            // PsiInternalUseCase.g:650:3: otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) )
            {

            			markLeaf(elementTypeProvider.getDescription_DescriptionKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,26,FOLLOW_5); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:657:3: ( (lv_name_1_0= RULE_STRING ) )
            // PsiInternalUseCase.g:658:4: (lv_name_1_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:658:4: (lv_name_1_0= RULE_STRING )
            // PsiInternalUseCase.g:659:5: lv_name_1_0= RULE_STRING
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
    // PsiInternalUseCase.g:678:1: entryRuleNotes returns [Boolean current=false] : iv_ruleNotes= ruleNotes EOF ;
    public final Boolean entryRuleNotes() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleNotes = null;


        try {
            // PsiInternalUseCase.g:678:47: (iv_ruleNotes= ruleNotes EOF )
            // PsiInternalUseCase.g:679:2: iv_ruleNotes= ruleNotes EOF
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
    // PsiInternalUseCase.g:685:1: ruleNotes returns [Boolean current=false] : ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) ( (lv_content_2_0= RULE_STRING ) ) ) ;
    public final Boolean ruleNotes() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;

        try {
            // PsiInternalUseCase.g:686:1: ( ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) ( (lv_content_2_0= RULE_STRING ) ) ) )
            // PsiInternalUseCase.g:687:2: ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) ( (lv_content_2_0= RULE_STRING ) ) )
            {
            // PsiInternalUseCase.g:687:2: ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) ( (lv_content_2_0= RULE_STRING ) ) )
            // PsiInternalUseCase.g:688:3: (otherlv_0= 'notes:' | otherlv_1= 'note:' ) ( (lv_content_2_0= RULE_STRING ) )
            {
            // PsiInternalUseCase.g:688:3: (otherlv_0= 'notes:' | otherlv_1= 'note:' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            else if ( (LA16_0==28) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // PsiInternalUseCase.g:689:4: otherlv_0= 'notes:'
                    {

                    				markLeaf(elementTypeProvider.getNotes_NotesKeyword_0_0ElementType());
                    			
                    otherlv_0=(Token)match(input,27,FOLLOW_5); 

                    				doneLeaf(otherlv_0);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:697:4: otherlv_1= 'note:'
                    {

                    				markLeaf(elementTypeProvider.getNotes_NoteKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,28,FOLLOW_5); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;

            }

            // PsiInternalUseCase.g:705:3: ( (lv_content_2_0= RULE_STRING ) )
            // PsiInternalUseCase.g:706:4: (lv_content_2_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:706:4: (lv_content_2_0= RULE_STRING )
            // PsiInternalUseCase.g:707:5: lv_content_2_0= RULE_STRING
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
    // PsiInternalUseCase.g:726:1: entryRuleInputs returns [Boolean current=false] : iv_ruleInputs= ruleInputs EOF ;
    public final Boolean entryRuleInputs() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleInputs = null;


        try {
            // PsiInternalUseCase.g:726:48: (iv_ruleInputs= ruleInputs EOF )
            // PsiInternalUseCase.g:727:2: iv_ruleInputs= ruleInputs EOF
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
    // PsiInternalUseCase.g:733:1: ruleInputs returns [Boolean current=false] : ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) ( (lv_inputs_7_0= ruleInput ) )* ) ;
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
            // PsiInternalUseCase.g:734:1: ( ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) ( (lv_inputs_7_0= ruleInput ) )* ) )
            // PsiInternalUseCase.g:735:2: ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) ( (lv_inputs_7_0= ruleInput ) )* )
            {
            // PsiInternalUseCase.g:735:2: ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) ( (lv_inputs_7_0= ruleInput ) )* )
            // PsiInternalUseCase.g:736:3: (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) ( (lv_inputs_7_0= ruleInput ) )*
            {
            // PsiInternalUseCase.g:736:3: (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt17=1;
                }
                break;
            case 30:
                {
                alt17=2;
                }
                break;
            case 31:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // PsiInternalUseCase.g:737:4: otherlv_0= 'requires:'
                    {

                    				markLeaf(elementTypeProvider.getInputs_RequiresKeyword_0_0ElementType());
                    			
                    otherlv_0=(Token)match(input,29,FOLLOW_25); 

                    				doneLeaf(otherlv_0);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:745:4: otherlv_1= 'require:'
                    {

                    				markLeaf(elementTypeProvider.getInputs_RequireKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,30,FOLLOW_25); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;
                case 3 :
                    // PsiInternalUseCase.g:753:4: (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' )
                    {
                    // PsiInternalUseCase.g:753:4: (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' )
                    // PsiInternalUseCase.g:754:5: otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':'
                    {

                    					markLeaf(elementTypeProvider.getInputs_RequiresKeyword_0_2_0ElementType());
                    				
                    otherlv_2=(Token)match(input,31,FOLLOW_26); 

                    					doneLeaf(otherlv_2);
                    				

                    					markLeaf(elementTypeProvider.getInputs_TheKeyword_0_2_1ElementType());
                    				
                    otherlv_3=(Token)match(input,32,FOLLOW_27); 

                    					doneLeaf(otherlv_3);
                    				

                    					markLeaf(elementTypeProvider.getInputs_FollowingKeyword_0_2_2ElementType());
                    				
                    otherlv_4=(Token)match(input,33,FOLLOW_28); 

                    					doneLeaf(otherlv_4);
                    				

                    					markLeaf(elementTypeProvider.getInputs_InputKeyword_0_2_3ElementType());
                    				
                    otherlv_5=(Token)match(input,34,FOLLOW_29); 

                    					doneLeaf(otherlv_5);
                    				

                    					markLeaf(elementTypeProvider.getInputs_ColonKeyword_0_2_4ElementType());
                    				
                    otherlv_6=(Token)match(input,35,FOLLOW_25); 

                    					doneLeaf(otherlv_6);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:791:3: ( (lv_inputs_7_0= ruleInput ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==16||LA18_0==45) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // PsiInternalUseCase.g:792:4: (lv_inputs_7_0= ruleInput )
            	    {
            	    // PsiInternalUseCase.g:792:4: (lv_inputs_7_0= ruleInput )
            	    // PsiInternalUseCase.g:793:5: lv_inputs_7_0= ruleInput
            	    {

            	    					markComposite(elementTypeProvider.getInputs_InputsInputParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_25);
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
            	    break loop18;
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
    // PsiInternalUseCase.g:810:1: entryRuleOutputs returns [Boolean current=false] : iv_ruleOutputs= ruleOutputs EOF ;
    public final Boolean entryRuleOutputs() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleOutputs = null;


        try {
            // PsiInternalUseCase.g:810:49: (iv_ruleOutputs= ruleOutputs EOF )
            // PsiInternalUseCase.g:811:2: iv_ruleOutputs= ruleOutputs EOF
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
    // PsiInternalUseCase.g:817:1: ruleOutputs returns [Boolean current=false] : ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) ( (lv_outputs_7_0= ruleOutput ) )* ) ;
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
            // PsiInternalUseCase.g:818:1: ( ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) ( (lv_outputs_7_0= ruleOutput ) )* ) )
            // PsiInternalUseCase.g:819:2: ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) ( (lv_outputs_7_0= ruleOutput ) )* )
            {
            // PsiInternalUseCase.g:819:2: ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) ( (lv_outputs_7_0= ruleOutput ) )* )
            // PsiInternalUseCase.g:820:3: (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) ( (lv_outputs_7_0= ruleOutput ) )*
            {
            // PsiInternalUseCase.g:820:3: (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt19=1;
                }
                break;
            case 37:
                {
                alt19=2;
                }
                break;
            case 38:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // PsiInternalUseCase.g:821:4: otherlv_0= 'produces:'
                    {

                    				markLeaf(elementTypeProvider.getOutputs_ProducesKeyword_0_0ElementType());
                    			
                    otherlv_0=(Token)match(input,36,FOLLOW_25); 

                    				doneLeaf(otherlv_0);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:829:4: otherlv_1= 'produce:'
                    {

                    				markLeaf(elementTypeProvider.getOutputs_ProduceKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,37,FOLLOW_25); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;
                case 3 :
                    // PsiInternalUseCase.g:837:4: (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' )
                    {
                    // PsiInternalUseCase.g:837:4: (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' )
                    // PsiInternalUseCase.g:838:5: otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':'
                    {

                    					markLeaf(elementTypeProvider.getOutputs_ProducesKeyword_0_2_0ElementType());
                    				
                    otherlv_2=(Token)match(input,38,FOLLOW_26); 

                    					doneLeaf(otherlv_2);
                    				

                    					markLeaf(elementTypeProvider.getOutputs_TheKeyword_0_2_1ElementType());
                    				
                    otherlv_3=(Token)match(input,32,FOLLOW_27); 

                    					doneLeaf(otherlv_3);
                    				

                    					markLeaf(elementTypeProvider.getOutputs_FollowingKeyword_0_2_2ElementType());
                    				
                    otherlv_4=(Token)match(input,33,FOLLOW_30); 

                    					doneLeaf(otherlv_4);
                    				

                    					markLeaf(elementTypeProvider.getOutputs_OutputKeyword_0_2_3ElementType());
                    				
                    otherlv_5=(Token)match(input,39,FOLLOW_29); 

                    					doneLeaf(otherlv_5);
                    				

                    					markLeaf(elementTypeProvider.getOutputs_ColonKeyword_0_2_4ElementType());
                    				
                    otherlv_6=(Token)match(input,35,FOLLOW_25); 

                    					doneLeaf(otherlv_6);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:875:3: ( (lv_outputs_7_0= ruleOutput ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==16||LA20_0==45) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // PsiInternalUseCase.g:876:4: (lv_outputs_7_0= ruleOutput )
            	    {
            	    // PsiInternalUseCase.g:876:4: (lv_outputs_7_0= ruleOutput )
            	    // PsiInternalUseCase.g:877:5: lv_outputs_7_0= ruleOutput
            	    {

            	    					markComposite(elementTypeProvider.getOutputs_OutputsOutputParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_25);
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
            	    break loop20;
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
    // PsiInternalUseCase.g:894:1: entryRuleType returns [Boolean current=false] : iv_ruleType= ruleType EOF ;
    public final Boolean entryRuleType() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleType = null;


        try {
            // PsiInternalUseCase.g:894:46: (iv_ruleType= ruleType EOF )
            // PsiInternalUseCase.g:895:2: iv_ruleType= ruleType EOF
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
    // PsiInternalUseCase.g:901:1: ruleType returns [Boolean current=false] : (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) ;
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
            // PsiInternalUseCase.g:902:1: ( (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) )
            // PsiInternalUseCase.g:903:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            {
            // PsiInternalUseCase.g:903:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            // PsiInternalUseCase.g:904:3: otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            {

            			markLeaf(elementTypeProvider.getType_HyphenMinusKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,16,FOLLOW_22); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:911:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalUseCase.g:912:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalUseCase.g:912:4: (lv_name_1_0= RULE_ID )
            // PsiInternalUseCase.g:913:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getType_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getType_LeftParenthesisKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,40,FOLLOW_5); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalUseCase.g:935:3: ( (lv_description_3_0= RULE_STRING ) )
            // PsiInternalUseCase.g:936:4: (lv_description_3_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:936:4: (lv_description_3_0= RULE_STRING )
            // PsiInternalUseCase.g:937:5: lv_description_3_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getType_DescriptionSTRINGTerminalRuleCall_3_0ElementType());
            				
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_description_3_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getType_RightParenthesisKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,41,FOLLOW_33); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalUseCase.g:959:3: (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==42) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // PsiInternalUseCase.g:960:4: otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']'
                    {

                    				markLeaf(elementTypeProvider.getType_LeftSquareBracketKeyword_5_0ElementType());
                    			
                    otherlv_5=(Token)match(input,42,FOLLOW_22); 

                    				doneLeaf(otherlv_5);
                    			
                    // PsiInternalUseCase.g:967:4: ( (lv_importInfo_6_0= ruleQualifiedName ) )
                    // PsiInternalUseCase.g:968:5: (lv_importInfo_6_0= ruleQualifiedName )
                    {
                    // PsiInternalUseCase.g:968:5: (lv_importInfo_6_0= ruleQualifiedName )
                    // PsiInternalUseCase.g:969:6: lv_importInfo_6_0= ruleQualifiedName
                    {

                    						markComposite(elementTypeProvider.getType_ImportInfoQualifiedNameParserRuleCall_5_1_0ElementType());
                    					
                    pushFollow(FOLLOW_34);
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
                    			
                    otherlv_7=(Token)match(input,43,FOLLOW_2); 

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
    // PsiInternalUseCase.g:994:1: entryRuleExceptionDecleration returns [Boolean current=false] : iv_ruleExceptionDecleration= ruleExceptionDecleration EOF ;
    public final Boolean entryRuleExceptionDecleration() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleExceptionDecleration = null;


        try {
            // PsiInternalUseCase.g:994:62: (iv_ruleExceptionDecleration= ruleExceptionDecleration EOF )
            // PsiInternalUseCase.g:995:2: iv_ruleExceptionDecleration= ruleExceptionDecleration EOF
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
    // PsiInternalUseCase.g:1001:1: ruleExceptionDecleration returns [Boolean current=false] : (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) ;
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
            // PsiInternalUseCase.g:1002:1: ( (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) )
            // PsiInternalUseCase.g:1003:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            {
            // PsiInternalUseCase.g:1003:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            // PsiInternalUseCase.g:1004:3: otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            {

            			markLeaf(elementTypeProvider.getExceptionDecleration_HyphenMinusKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,16,FOLLOW_22); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:1011:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalUseCase.g:1012:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalUseCase.g:1012:4: (lv_name_1_0= RULE_ID )
            // PsiInternalUseCase.g:1013:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getExceptionDecleration_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getExceptionDecleration_LeftParenthesisKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,40,FOLLOW_5); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalUseCase.g:1035:3: ( (lv_message_3_0= RULE_STRING ) )
            // PsiInternalUseCase.g:1036:4: (lv_message_3_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:1036:4: (lv_message_3_0= RULE_STRING )
            // PsiInternalUseCase.g:1037:5: lv_message_3_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getExceptionDecleration_MessageSTRINGTerminalRuleCall_3_0ElementType());
            				
            lv_message_3_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_message_3_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getExceptionDecleration_RightParenthesisKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,41,FOLLOW_33); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalUseCase.g:1059:3: (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==42) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // PsiInternalUseCase.g:1060:4: otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']'
                    {

                    				markLeaf(elementTypeProvider.getExceptionDecleration_LeftSquareBracketKeyword_5_0ElementType());
                    			
                    otherlv_5=(Token)match(input,42,FOLLOW_22); 

                    				doneLeaf(otherlv_5);
                    			
                    // PsiInternalUseCase.g:1067:4: ( (lv_importInfo_6_0= ruleQualifiedName ) )
                    // PsiInternalUseCase.g:1068:5: (lv_importInfo_6_0= ruleQualifiedName )
                    {
                    // PsiInternalUseCase.g:1068:5: (lv_importInfo_6_0= ruleQualifiedName )
                    // PsiInternalUseCase.g:1069:6: lv_importInfo_6_0= ruleQualifiedName
                    {

                    						markComposite(elementTypeProvider.getExceptionDecleration_ImportInfoQualifiedNameParserRuleCall_5_1_0ElementType());
                    					
                    pushFollow(FOLLOW_34);
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
                    			
                    otherlv_7=(Token)match(input,43,FOLLOW_2); 

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


    // $ANTLR start "entryRuleOptional"
    // PsiInternalUseCase.g:1094:1: entryRuleOptional returns [Boolean current=false] : iv_ruleOptional= ruleOptional EOF ;
    public final Boolean entryRuleOptional() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleOptional = null;


        try {
            // PsiInternalUseCase.g:1094:50: (iv_ruleOptional= ruleOptional EOF )
            // PsiInternalUseCase.g:1095:2: iv_ruleOptional= ruleOptional EOF
            {
             markComposite(elementTypeProvider.getOptionalElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptional=ruleOptional();

            state._fsp--;

             current =iv_ruleOptional; 
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
    // $ANTLR end "entryRuleOptional"


    // $ANTLR start "ruleOptional"
    // PsiInternalUseCase.g:1101:1: ruleOptional returns [Boolean current=false] : kw= 'optional' ;
    public final Boolean ruleOptional() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalUseCase.g:1102:1: (kw= 'optional' )
            // PsiInternalUseCase.g:1103:2: kw= 'optional'
            {

            		markLeaf(elementTypeProvider.getOptional_OptionalKeywordElementType());
            	
            kw=(Token)match(input,44,FOLLOW_2); 

            		doneLeaf(kw);
            	

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
    // $ANTLR end "ruleOptional"


    // $ANTLR start "entryRuleInput"
    // PsiInternalUseCase.g:1113:1: entryRuleInput returns [Boolean current=false] : iv_ruleInput= ruleInput EOF ;
    public final Boolean entryRuleInput() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleInput = null;


        try {
            // PsiInternalUseCase.g:1113:47: (iv_ruleInput= ruleInput EOF )
            // PsiInternalUseCase.g:1114:2: iv_ruleInput= ruleInput EOF
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
    // PsiInternalUseCase.g:1120:1: ruleInput returns [Boolean current=false] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) ( (lv_optional_3_0= ruleOptional ) )? (otherlv_4= 'as' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '(' otherlv_7= 'e.g' ( (lv_example_8_0= RULE_STRING ) ) otherlv_9= ')' )? ) ;
    public final Boolean ruleInput() throws RecognitionException {
        Boolean current = false;

        Token lv_many_0_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_example_8_0=null;
        Token otherlv_9=null;
        Boolean lv_optional_3_0 = null;


        try {
            // PsiInternalUseCase.g:1121:1: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) ( (lv_optional_3_0= ruleOptional ) )? (otherlv_4= 'as' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '(' otherlv_7= 'e.g' ( (lv_example_8_0= RULE_STRING ) ) otherlv_9= ')' )? ) )
            // PsiInternalUseCase.g:1122:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) ( (lv_optional_3_0= ruleOptional ) )? (otherlv_4= 'as' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '(' otherlv_7= 'e.g' ( (lv_example_8_0= RULE_STRING ) ) otherlv_9= ')' )? )
            {
            // PsiInternalUseCase.g:1122:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) ( (lv_optional_3_0= ruleOptional ) )? (otherlv_4= 'as' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '(' otherlv_7= 'e.g' ( (lv_example_8_0= RULE_STRING ) ) otherlv_9= ')' )? )
            // PsiInternalUseCase.g:1123:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) ( (lv_optional_3_0= ruleOptional ) )? (otherlv_4= 'as' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '(' otherlv_7= 'e.g' ( (lv_example_8_0= RULE_STRING ) ) otherlv_9= ')' )?
            {
            // PsiInternalUseCase.g:1123:3: ( (lv_many_0_0= 'many' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==45) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // PsiInternalUseCase.g:1124:4: (lv_many_0_0= 'many' )
                    {
                    // PsiInternalUseCase.g:1124:4: (lv_many_0_0= 'many' )
                    // PsiInternalUseCase.g:1125:5: lv_many_0_0= 'many'
                    {

                    					markLeaf(elementTypeProvider.getInput_ManyManyKeyword_0_0ElementType());
                    				
                    lv_many_0_0=(Token)match(input,45,FOLLOW_35); 

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
            		
            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalUseCase.g:1147:3: ( (lv_content_2_0= RULE_STRING ) )
            // PsiInternalUseCase.g:1148:4: (lv_content_2_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:1148:4: (lv_content_2_0= RULE_STRING )
            // PsiInternalUseCase.g:1149:5: lv_content_2_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getInput_ContentSTRINGTerminalRuleCall_2_0ElementType());
            				
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_content_2_0);
            				

            }


            }

            // PsiInternalUseCase.g:1164:3: ( (lv_optional_3_0= ruleOptional ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==44) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // PsiInternalUseCase.g:1165:4: (lv_optional_3_0= ruleOptional )
                    {
                    // PsiInternalUseCase.g:1165:4: (lv_optional_3_0= ruleOptional )
                    // PsiInternalUseCase.g:1166:5: lv_optional_3_0= ruleOptional
                    {

                    					markComposite(elementTypeProvider.getInput_OptionalOptionalParserRuleCall_3_0ElementType());
                    				
                    pushFollow(FOLLOW_37);
                    lv_optional_3_0=ruleOptional();

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

            // PsiInternalUseCase.g:1179:3: (otherlv_4= 'as' ( (otherlv_5= RULE_ID ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==46) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // PsiInternalUseCase.g:1180:4: otherlv_4= 'as' ( (otherlv_5= RULE_ID ) )
                    {

                    				markLeaf(elementTypeProvider.getInput_AsKeyword_4_0ElementType());
                    			
                    otherlv_4=(Token)match(input,46,FOLLOW_22); 

                    				doneLeaf(otherlv_4);
                    			
                    // PsiInternalUseCase.g:1187:4: ( (otherlv_5= RULE_ID ) )
                    // PsiInternalUseCase.g:1188:5: (otherlv_5= RULE_ID )
                    {
                    // PsiInternalUseCase.g:1188:5: (otherlv_5= RULE_ID )
                    // PsiInternalUseCase.g:1189:6: otherlv_5= RULE_ID
                    {

                    						if (!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						markLeaf(elementTypeProvider.getInput_TypeTypeCrossReference_4_1_0ElementType());
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_38); 

                    						doneLeaf(otherlv_5);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:1205:3: (otherlv_6= '(' otherlv_7= 'e.g' ( (lv_example_8_0= RULE_STRING ) ) otherlv_9= ')' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // PsiInternalUseCase.g:1206:4: otherlv_6= '(' otherlv_7= 'e.g' ( (lv_example_8_0= RULE_STRING ) ) otherlv_9= ')'
                    {

                    				markLeaf(elementTypeProvider.getInput_LeftParenthesisKeyword_5_0ElementType());
                    			
                    otherlv_6=(Token)match(input,40,FOLLOW_39); 

                    				doneLeaf(otherlv_6);
                    			

                    				markLeaf(elementTypeProvider.getInput_EGKeyword_5_1ElementType());
                    			
                    otherlv_7=(Token)match(input,47,FOLLOW_5); 

                    				doneLeaf(otherlv_7);
                    			
                    // PsiInternalUseCase.g:1220:4: ( (lv_example_8_0= RULE_STRING ) )
                    // PsiInternalUseCase.g:1221:5: (lv_example_8_0= RULE_STRING )
                    {
                    // PsiInternalUseCase.g:1221:5: (lv_example_8_0= RULE_STRING )
                    // PsiInternalUseCase.g:1222:6: lv_example_8_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getInput_ExampleSTRINGTerminalRuleCall_5_2_0ElementType());
                    					
                    lv_example_8_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_example_8_0);
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getInput_RightParenthesisKeyword_5_3ElementType());
                    			
                    otherlv_9=(Token)match(input,41,FOLLOW_2); 

                    				doneLeaf(otherlv_9);
                    			

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
    // PsiInternalUseCase.g:1249:1: entryRuleOutput returns [Boolean current=false] : iv_ruleOutput= ruleOutput EOF ;
    public final Boolean entryRuleOutput() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleOutput = null;


        try {
            // PsiInternalUseCase.g:1249:48: (iv_ruleOutput= ruleOutput EOF )
            // PsiInternalUseCase.g:1250:2: iv_ruleOutput= ruleOutput EOF
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
    // PsiInternalUseCase.g:1256:1: ruleOutput returns [Boolean current=false] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? ) ;
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
            // PsiInternalUseCase.g:1257:1: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? ) )
            // PsiInternalUseCase.g:1258:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? )
            {
            // PsiInternalUseCase.g:1258:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? )
            // PsiInternalUseCase.g:1259:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )?
            {
            // PsiInternalUseCase.g:1259:3: ( (lv_many_0_0= 'many' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // PsiInternalUseCase.g:1260:4: (lv_many_0_0= 'many' )
                    {
                    // PsiInternalUseCase.g:1260:4: (lv_many_0_0= 'many' )
                    // PsiInternalUseCase.g:1261:5: lv_many_0_0= 'many'
                    {

                    					markLeaf(elementTypeProvider.getOutput_ManyManyKeyword_0_0ElementType());
                    				
                    lv_many_0_0=(Token)match(input,45,FOLLOW_35); 

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
            		
            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalUseCase.g:1283:3: ( (lv_content_2_0= RULE_STRING ) )
            // PsiInternalUseCase.g:1284:4: (lv_content_2_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:1284:4: (lv_content_2_0= RULE_STRING )
            // PsiInternalUseCase.g:1285:5: lv_content_2_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getOutput_ContentSTRINGTerminalRuleCall_2_0ElementType());
            				
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_content_2_0);
            				

            }


            }

            // PsiInternalUseCase.g:1300:3: (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==46) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // PsiInternalUseCase.g:1301:4: otherlv_3= 'as' ( (otherlv_4= RULE_ID ) )
                    {

                    				markLeaf(elementTypeProvider.getOutput_AsKeyword_3_0ElementType());
                    			
                    otherlv_3=(Token)match(input,46,FOLLOW_22); 

                    				doneLeaf(otherlv_3);
                    			
                    // PsiInternalUseCase.g:1308:4: ( (otherlv_4= RULE_ID ) )
                    // PsiInternalUseCase.g:1309:5: (otherlv_4= RULE_ID )
                    {
                    // PsiInternalUseCase.g:1309:5: (otherlv_4= RULE_ID )
                    // PsiInternalUseCase.g:1310:6: otherlv_4= RULE_ID
                    {

                    						if (!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						markLeaf(elementTypeProvider.getOutput_TypeTypeCrossReference_3_1_0ElementType());
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_38); 

                    						doneLeaf(otherlv_4);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:1326:3: (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==40) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // PsiInternalUseCase.g:1327:4: otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')'
                    {

                    				markLeaf(elementTypeProvider.getOutput_LeftParenthesisKeyword_4_0ElementType());
                    			
                    otherlv_5=(Token)match(input,40,FOLLOW_39); 

                    				doneLeaf(otherlv_5);
                    			

                    				markLeaf(elementTypeProvider.getOutput_EGKeyword_4_1ElementType());
                    			
                    otherlv_6=(Token)match(input,47,FOLLOW_5); 

                    				doneLeaf(otherlv_6);
                    			
                    // PsiInternalUseCase.g:1341:4: ( (lv_example_7_0= RULE_STRING ) )
                    // PsiInternalUseCase.g:1342:5: (lv_example_7_0= RULE_STRING )
                    {
                    // PsiInternalUseCase.g:1342:5: (lv_example_7_0= RULE_STRING )
                    // PsiInternalUseCase.g:1343:6: lv_example_7_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getOutput_ExampleSTRINGTerminalRuleCall_4_2_0ElementType());
                    					
                    lv_example_7_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_example_7_0);
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getOutput_RightParenthesisKeyword_4_3ElementType());
                    			
                    otherlv_8=(Token)match(input,41,FOLLOW_2); 

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
    // PsiInternalUseCase.g:1370:1: entryRuleAllowedUserGroups returns [Boolean current=false] : iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF ;
    public final Boolean entryRuleAllowedUserGroups() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAllowedUserGroups = null;


        try {
            // PsiInternalUseCase.g:1370:59: (iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF )
            // PsiInternalUseCase.g:1371:2: iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF
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
    // PsiInternalUseCase.g:1377:1: ruleAllowedUserGroups returns [Boolean current=false] : (otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )* ) ;
    public final Boolean ruleAllowedUserGroups() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Boolean lv_groups_1_0 = null;


        try {
            // PsiInternalUseCase.g:1378:1: ( (otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )* ) )
            // PsiInternalUseCase.g:1379:2: (otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )* )
            {
            // PsiInternalUseCase.g:1379:2: (otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )* )
            // PsiInternalUseCase.g:1380:3: otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )*
            {

            			markLeaf(elementTypeProvider.getAllowedUserGroups_AllowedUsergroupsKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,48,FOLLOW_25); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:1387:3: ( (lv_groups_1_0= ruleAllowedUserGroup ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==16||LA30_0==45) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // PsiInternalUseCase.g:1388:4: (lv_groups_1_0= ruleAllowedUserGroup )
            	    {
            	    // PsiInternalUseCase.g:1388:4: (lv_groups_1_0= ruleAllowedUserGroup )
            	    // PsiInternalUseCase.g:1389:5: lv_groups_1_0= ruleAllowedUserGroup
            	    {

            	    					markComposite(elementTypeProvider.getAllowedUserGroups_GroupsAllowedUserGroupParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_25);
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
            	    break loop30;
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
    // PsiInternalUseCase.g:1406:1: entryRuleAllowedUserGroup returns [Boolean current=false] : iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF ;
    public final Boolean entryRuleAllowedUserGroup() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAllowedUserGroup = null;


        try {
            // PsiInternalUseCase.g:1406:58: (iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF )
            // PsiInternalUseCase.g:1407:2: iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF
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
    // PsiInternalUseCase.g:1413:1: ruleAllowedUserGroup returns [Boolean current=false] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final Boolean ruleAllowedUserGroup() throws RecognitionException {
        Boolean current = false;

        Token lv_many_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

        try {
            // PsiInternalUseCase.g:1414:1: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) )
            // PsiInternalUseCase.g:1415:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? )
            {
            // PsiInternalUseCase.g:1415:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? )
            // PsiInternalUseCase.g:1416:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            {
            // PsiInternalUseCase.g:1416:3: ( (lv_many_0_0= 'many' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==45) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // PsiInternalUseCase.g:1417:4: (lv_many_0_0= 'many' )
                    {
                    // PsiInternalUseCase.g:1417:4: (lv_many_0_0= 'many' )
                    // PsiInternalUseCase.g:1418:5: lv_many_0_0= 'many'
                    {

                    					markLeaf(elementTypeProvider.getAllowedUserGroup_ManyManyKeyword_0_0ElementType());
                    				
                    lv_many_0_0=(Token)match(input,45,FOLLOW_35); 

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
            		
            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalUseCase.g:1440:3: ( (lv_name_2_0= RULE_STRING ) )
            // PsiInternalUseCase.g:1441:4: (lv_name_2_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:1441:4: (lv_name_2_0= RULE_STRING )
            // PsiInternalUseCase.g:1442:5: lv_name_2_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getAllowedUserGroup_NameSTRINGTerminalRuleCall_2_0ElementType());
            				
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_2_0);
            				

            }


            }

            // PsiInternalUseCase.g:1457:3: (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==46) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // PsiInternalUseCase.g:1458:4: otherlv_3= 'as' ( (otherlv_4= RULE_ID ) )
                    {

                    				markLeaf(elementTypeProvider.getAllowedUserGroup_AsKeyword_3_0ElementType());
                    			
                    otherlv_3=(Token)match(input,46,FOLLOW_22); 

                    				doneLeaf(otherlv_3);
                    			
                    // PsiInternalUseCase.g:1465:4: ( (otherlv_4= RULE_ID ) )
                    // PsiInternalUseCase.g:1466:5: (otherlv_4= RULE_ID )
                    {
                    // PsiInternalUseCase.g:1466:5: (otherlv_4= RULE_ID )
                    // PsiInternalUseCase.g:1467:6: otherlv_4= RULE_ID
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
    // PsiInternalUseCase.g:1487:1: entryRuleQualifiedName returns [Boolean current=false] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final Boolean entryRuleQualifiedName() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleQualifiedName = null;


        try {
            // PsiInternalUseCase.g:1487:55: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // PsiInternalUseCase.g:1488:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // PsiInternalUseCase.g:1494:1: ruleQualifiedName returns [Boolean current=false] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final Boolean ruleQualifiedName() throws RecognitionException {
        Boolean current = false;

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

        try {
            // PsiInternalUseCase.g:1495:1: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // PsiInternalUseCase.g:1496:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // PsiInternalUseCase.g:1496:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // PsiInternalUseCase.g:1497:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {

            			markLeaf(elementTypeProvider.getQualifiedName_IDTerminalRuleCall_0ElementType());
            		
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            			doneLeaf(this_ID_0);
            		
            // PsiInternalUseCase.g:1504:3: (kw= '.' this_ID_2= RULE_ID )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==21) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // PsiInternalUseCase.g:1505:4: kw= '.' this_ID_2= RULE_ID
            	    {

            	    				markLeaf(elementTypeProvider.getQualifiedName_FullStopKeyword_1_0ElementType());
            	    			
            	    kw=(Token)match(input,21,FOLLOW_22); 

            	    				doneLeaf(kw);
            	    			

            	    				markLeaf(elementTypeProvider.getQualifiedName_IDTerminalRuleCall_1_1ElementType());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            	    				doneLeaf(this_ID_2);
            	    			

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // PsiInternalUseCase.g:1524:1: entryRuleQualifiedNumber returns [Boolean current=false] : iv_ruleQualifiedNumber= ruleQualifiedNumber EOF ;
    public final Boolean entryRuleQualifiedNumber() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleQualifiedNumber = null;


        try {
            // PsiInternalUseCase.g:1524:57: (iv_ruleQualifiedNumber= ruleQualifiedNumber EOF )
            // PsiInternalUseCase.g:1525:2: iv_ruleQualifiedNumber= ruleQualifiedNumber EOF
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
    // PsiInternalUseCase.g:1531:1: ruleQualifiedNumber returns [Boolean current=false] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' ) ;
    public final Boolean ruleQualifiedNumber() throws RecognitionException {
        Boolean current = false;

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

        try {
            // PsiInternalUseCase.g:1532:1: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' ) )
            // PsiInternalUseCase.g:1533:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' )
            {
            // PsiInternalUseCase.g:1533:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' )
            // PsiInternalUseCase.g:1534:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.'
            {

            			markLeaf(elementTypeProvider.getQualifiedNumber_INTTerminalRuleCall_0ElementType());
            		
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_41); 

            			doneLeaf(this_INT_0);
            		
            // PsiInternalUseCase.g:1541:3: (kw= '.' this_INT_2= RULE_INT )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==21) ) {
                    int LA34_1 = input.LA(2);

                    if ( (LA34_1==RULE_INT) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // PsiInternalUseCase.g:1542:4: kw= '.' this_INT_2= RULE_INT
            	    {

            	    				markLeaf(elementTypeProvider.getQualifiedNumber_FullStopKeyword_1_0ElementType());
            	    			
            	    kw=(Token)match(input,21,FOLLOW_42); 

            	    				doneLeaf(kw);
            	    			

            	    				markLeaf(elementTypeProvider.getQualifiedNumber_INTTerminalRuleCall_1_1ElementType());
            	    			
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_41); 

            	    				doneLeaf(this_INT_2);
            	    			

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            			markLeaf(elementTypeProvider.getQualifiedNumber_FullStopKeyword_2ElementType());
            		
            kw=(Token)match(input,21,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00010070FC02D000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00010070F802D000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000070F802D000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000701802D000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000001802D000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000018021000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000018001000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000200000010002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000510000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000410000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000040L});

}