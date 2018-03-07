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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'use-case'", "'end'", "'of'", "'steps:'", "'.'", "'Raise'", "'On'", "'error'", "'raise'", "'description:'", "'notes:'", "'note:'", "'requires:'", "'require:'", "'requires'", "'the'", "'following'", "'input'", "':'", "'produces:'", "'produce:'", "'produces'", "'output'", "'type'", "'('", "')'", "'['", "']'", "'many'", "'-'", "'as'", "'e.g'", "'allowed-usergroups:'"
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

                if ( (LA1_0==34) ) {
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
    // PsiInternalUseCase.g:103:1: ruleUseCase returns [Boolean current=false] : (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )? ( (lv_inputs_4_0= ruleInputs ) )? ( (lv_outputs_5_0= ruleOutputs ) )? ( (lv_steps_6_0= ruleSteps ) )? ( (lv_notes_7_0= ruleNotes ) )? otherlv_8= 'end' otherlv_9= 'of' otherlv_10= 'use-case' ) ;
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
            // PsiInternalUseCase.g:104:1: ( (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )? ( (lv_inputs_4_0= ruleInputs ) )? ( (lv_outputs_5_0= ruleOutputs ) )? ( (lv_steps_6_0= ruleSteps ) )? ( (lv_notes_7_0= ruleNotes ) )? otherlv_8= 'end' otherlv_9= 'of' otherlv_10= 'use-case' ) )
            // PsiInternalUseCase.g:105:2: (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )? ( (lv_inputs_4_0= ruleInputs ) )? ( (lv_outputs_5_0= ruleOutputs ) )? ( (lv_steps_6_0= ruleSteps ) )? ( (lv_notes_7_0= ruleNotes ) )? otherlv_8= 'end' otherlv_9= 'of' otherlv_10= 'use-case' )
            {
            // PsiInternalUseCase.g:105:2: (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )? ( (lv_inputs_4_0= ruleInputs ) )? ( (lv_outputs_5_0= ruleOutputs ) )? ( (lv_steps_6_0= ruleSteps ) )? ( (lv_notes_7_0= ruleNotes ) )? otherlv_8= 'end' otherlv_9= 'of' otherlv_10= 'use-case' )
            // PsiInternalUseCase.g:106:3: otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )? ( (lv_inputs_4_0= ruleInputs ) )? ( (lv_outputs_5_0= ruleOutputs ) )? ( (lv_steps_6_0= ruleSteps ) )? ( (lv_notes_7_0= ruleNotes ) )? otherlv_8= 'end' otherlv_9= 'of' otherlv_10= 'use-case'
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

            if ( (LA3_0==20) ) {
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

            // PsiInternalUseCase.g:145:3: ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==43) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // PsiInternalUseCase.g:146:4: (lv_allowedUserGroups_3_0= ruleAllowedUserGroups )
                    {
                    // PsiInternalUseCase.g:146:4: (lv_allowedUserGroups_3_0= ruleAllowedUserGroups )
                    // PsiInternalUseCase.g:147:5: lv_allowedUserGroups_3_0= ruleAllowedUserGroups
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

            // PsiInternalUseCase.g:160:3: ( (lv_inputs_4_0= ruleInputs ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=23 && LA5_0<=25)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // PsiInternalUseCase.g:161:4: (lv_inputs_4_0= ruleInputs )
                    {
                    // PsiInternalUseCase.g:161:4: (lv_inputs_4_0= ruleInputs )
                    // PsiInternalUseCase.g:162:5: lv_inputs_4_0= ruleInputs
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

            // PsiInternalUseCase.g:175:3: ( (lv_outputs_5_0= ruleOutputs ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=30 && LA6_0<=32)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // PsiInternalUseCase.g:176:4: (lv_outputs_5_0= ruleOutputs )
                    {
                    // PsiInternalUseCase.g:176:4: (lv_outputs_5_0= ruleOutputs )
                    // PsiInternalUseCase.g:177:5: lv_outputs_5_0= ruleOutputs
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

            // PsiInternalUseCase.g:190:3: ( (lv_steps_6_0= ruleSteps ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // PsiInternalUseCase.g:191:4: (lv_steps_6_0= ruleSteps )
                    {
                    // PsiInternalUseCase.g:191:4: (lv_steps_6_0= ruleSteps )
                    // PsiInternalUseCase.g:192:5: lv_steps_6_0= ruleSteps
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

            // PsiInternalUseCase.g:205:3: ( (lv_notes_7_0= ruleNotes ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=21 && LA8_0<=22)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // PsiInternalUseCase.g:206:4: (lv_notes_7_0= ruleNotes )
                    {
                    // PsiInternalUseCase.g:206:4: (lv_notes_7_0= ruleNotes )
                    // PsiInternalUseCase.g:207:5: lv_notes_7_0= ruleNotes
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
    // PsiInternalUseCase.g:245:1: entryRuleSteps returns [Boolean current=false] : iv_ruleSteps= ruleSteps EOF ;
    public final Boolean entryRuleSteps() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleSteps = null;


        try {
            // PsiInternalUseCase.g:245:47: (iv_ruleSteps= ruleSteps EOF )
            // PsiInternalUseCase.g:246:2: iv_ruleSteps= ruleSteps EOF
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
    // PsiInternalUseCase.g:252:1: ruleSteps returns [Boolean current=false] : (otherlv_0= 'steps:' ( (lv_steps_1_0= ruleStep ) )* ) ;
    public final Boolean ruleSteps() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Boolean lv_steps_1_0 = null;


        try {
            // PsiInternalUseCase.g:253:1: ( (otherlv_0= 'steps:' ( (lv_steps_1_0= ruleStep ) )* ) )
            // PsiInternalUseCase.g:254:2: (otherlv_0= 'steps:' ( (lv_steps_1_0= ruleStep ) )* )
            {
            // PsiInternalUseCase.g:254:2: (otherlv_0= 'steps:' ( (lv_steps_1_0= ruleStep ) )* )
            // PsiInternalUseCase.g:255:3: otherlv_0= 'steps:' ( (lv_steps_1_0= ruleStep ) )*
            {

            			markLeaf(elementTypeProvider.getSteps_StepsKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,14,FOLLOW_15); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:262:3: ( (lv_steps_1_0= ruleStep ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_INT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // PsiInternalUseCase.g:263:4: (lv_steps_1_0= ruleStep )
            	    {
            	    // PsiInternalUseCase.g:263:4: (lv_steps_1_0= ruleStep )
            	    // PsiInternalUseCase.g:264:5: lv_steps_1_0= ruleStep
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
    // $ANTLR end "ruleSteps"


    // $ANTLR start "entryRuleStep"
    // PsiInternalUseCase.g:281:1: entryRuleStep returns [Boolean current=false] : iv_ruleStep= ruleStep EOF ;
    public final Boolean entryRuleStep() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleStep = null;


        try {
            // PsiInternalUseCase.g:281:46: (iv_ruleStep= ruleStep EOF )
            // PsiInternalUseCase.g:282:2: iv_ruleStep= ruleStep EOF
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
    // PsiInternalUseCase.g:288:1: ruleStep returns [Boolean current=false] : ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? ) ;
    public final Boolean ruleStep() throws RecognitionException {
        Boolean current = false;

        Token lv_action_1_0=null;
        Boolean lv_number_0_0 = null;

        Boolean lv_error_2_0 = null;


        try {
            // PsiInternalUseCase.g:289:1: ( ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? ) )
            // PsiInternalUseCase.g:290:2: ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? )
            {
            // PsiInternalUseCase.g:290:2: ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? )
            // PsiInternalUseCase.g:291:3: ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )?
            {
            // PsiInternalUseCase.g:291:3: ( (lv_number_0_0= ruleQualifiedNumber ) )
            // PsiInternalUseCase.g:292:4: (lv_number_0_0= ruleQualifiedNumber )
            {
            // PsiInternalUseCase.g:292:4: (lv_number_0_0= ruleQualifiedNumber )
            // PsiInternalUseCase.g:293:5: lv_number_0_0= ruleQualifiedNumber
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

            // PsiInternalUseCase.g:306:3: ( (lv_action_1_0= RULE_STRING ) )
            // PsiInternalUseCase.g:307:4: (lv_action_1_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:307:4: (lv_action_1_0= RULE_STRING )
            // PsiInternalUseCase.g:308:5: lv_action_1_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getStep_ActionSTRINGTerminalRuleCall_1_0ElementType());
            				
            lv_action_1_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_action_1_0);
            				

            }


            }

            // PsiInternalUseCase.g:323:3: ( (lv_error_2_0= ruleRaiseError ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // PsiInternalUseCase.g:324:4: (lv_error_2_0= ruleRaiseError )
                    {
                    // PsiInternalUseCase.g:324:4: (lv_error_2_0= ruleRaiseError )
                    // PsiInternalUseCase.g:325:5: lv_error_2_0= ruleRaiseError
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
    // PsiInternalUseCase.g:342:1: entryRuleRaiseError returns [Boolean current=false] : iv_ruleRaiseError= ruleRaiseError EOF ;
    public final Boolean entryRuleRaiseError() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleRaiseError = null;


        try {
            // PsiInternalUseCase.g:342:52: (iv_ruleRaiseError= ruleRaiseError EOF )
            // PsiInternalUseCase.g:343:2: iv_ruleRaiseError= ruleRaiseError EOF
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
    // PsiInternalUseCase.g:349:1: ruleRaiseError returns [Boolean current=false] : (otherlv_0= '.' (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) ) ( (lv_exception_5_0= ruleException ) ) ) ;
    public final Boolean ruleRaiseError() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Boolean lv_exception_5_0 = null;


        try {
            // PsiInternalUseCase.g:350:1: ( (otherlv_0= '.' (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) ) ( (lv_exception_5_0= ruleException ) ) ) )
            // PsiInternalUseCase.g:351:2: (otherlv_0= '.' (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) ) ( (lv_exception_5_0= ruleException ) ) )
            {
            // PsiInternalUseCase.g:351:2: (otherlv_0= '.' (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) ) ( (lv_exception_5_0= ruleException ) ) )
            // PsiInternalUseCase.g:352:3: otherlv_0= '.' (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) ) ( (lv_exception_5_0= ruleException ) )
            {

            			markLeaf(elementTypeProvider.getRaiseError_FullStopKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,15,FOLLOW_17); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:359:3: (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            else if ( (LA11_0==17) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // PsiInternalUseCase.g:360:4: otherlv_1= 'Raise'
                    {

                    				markLeaf(elementTypeProvider.getRaiseError_RaiseKeyword_1_0ElementType());
                    			
                    otherlv_1=(Token)match(input,16,FOLLOW_5); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:368:4: (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' )
                    {
                    // PsiInternalUseCase.g:368:4: (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' )
                    // PsiInternalUseCase.g:369:5: otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise'
                    {

                    					markLeaf(elementTypeProvider.getRaiseError_OnKeyword_1_1_0ElementType());
                    				
                    otherlv_2=(Token)match(input,17,FOLLOW_18); 

                    					doneLeaf(otherlv_2);
                    				

                    					markLeaf(elementTypeProvider.getRaiseError_ErrorKeyword_1_1_1ElementType());
                    				
                    otherlv_3=(Token)match(input,18,FOLLOW_19); 

                    					doneLeaf(otherlv_3);
                    				

                    					markLeaf(elementTypeProvider.getRaiseError_RaiseKeyword_1_1_2ElementType());
                    				
                    otherlv_4=(Token)match(input,19,FOLLOW_5); 

                    					doneLeaf(otherlv_4);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:392:3: ( (lv_exception_5_0= ruleException ) )
            // PsiInternalUseCase.g:393:4: (lv_exception_5_0= ruleException )
            {
            // PsiInternalUseCase.g:393:4: (lv_exception_5_0= ruleException )
            // PsiInternalUseCase.g:394:5: lv_exception_5_0= ruleException
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
    // PsiInternalUseCase.g:411:1: entryRuleException returns [Boolean current=false] : iv_ruleException= ruleException EOF ;
    public final Boolean entryRuleException() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleException = null;


        try {
            // PsiInternalUseCase.g:411:51: (iv_ruleException= ruleException EOF )
            // PsiInternalUseCase.g:412:2: iv_ruleException= ruleException EOF
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
    // PsiInternalUseCase.g:418:1: ruleException returns [Boolean current=false] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final Boolean ruleException() throws RecognitionException {
        Boolean current = false;

        Token lv_name_0_0=null;

        try {
            // PsiInternalUseCase.g:419:1: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // PsiInternalUseCase.g:420:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // PsiInternalUseCase.g:420:2: ( (lv_name_0_0= RULE_STRING ) )
            // PsiInternalUseCase.g:421:3: (lv_name_0_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:421:3: (lv_name_0_0= RULE_STRING )
            // PsiInternalUseCase.g:422:4: lv_name_0_0= RULE_STRING
            {

            				markLeaf(elementTypeProvider.getException_NameSTRINGTerminalRuleCall_0ElementType());
            			
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				if(!current) {
            					associateWithSemanticElement();
            					current = true;
            				}
            			

            				doneLeaf(lv_name_0_0);
            			

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
    // PsiInternalUseCase.g:440:1: entryRuleDescription returns [Boolean current=false] : iv_ruleDescription= ruleDescription EOF ;
    public final Boolean entryRuleDescription() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleDescription = null;


        try {
            // PsiInternalUseCase.g:440:53: (iv_ruleDescription= ruleDescription EOF )
            // PsiInternalUseCase.g:441:2: iv_ruleDescription= ruleDescription EOF
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
    // PsiInternalUseCase.g:447:1: ruleDescription returns [Boolean current=false] : (otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final Boolean ruleDescription() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

        try {
            // PsiInternalUseCase.g:448:1: ( (otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // PsiInternalUseCase.g:449:2: (otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // PsiInternalUseCase.g:449:2: (otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) ) )
            // PsiInternalUseCase.g:450:3: otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) )
            {

            			markLeaf(elementTypeProvider.getDescription_DescriptionKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:457:3: ( (lv_name_1_0= RULE_STRING ) )
            // PsiInternalUseCase.g:458:4: (lv_name_1_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:458:4: (lv_name_1_0= RULE_STRING )
            // PsiInternalUseCase.g:459:5: lv_name_1_0= RULE_STRING
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
    // PsiInternalUseCase.g:478:1: entryRuleNotes returns [Boolean current=false] : iv_ruleNotes= ruleNotes EOF ;
    public final Boolean entryRuleNotes() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleNotes = null;


        try {
            // PsiInternalUseCase.g:478:47: (iv_ruleNotes= ruleNotes EOF )
            // PsiInternalUseCase.g:479:2: iv_ruleNotes= ruleNotes EOF
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
    // PsiInternalUseCase.g:485:1: ruleNotes returns [Boolean current=false] : ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) ( (lv_content_2_0= RULE_STRING ) ) ) ;
    public final Boolean ruleNotes() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;

        try {
            // PsiInternalUseCase.g:486:1: ( ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) ( (lv_content_2_0= RULE_STRING ) ) ) )
            // PsiInternalUseCase.g:487:2: ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) ( (lv_content_2_0= RULE_STRING ) ) )
            {
            // PsiInternalUseCase.g:487:2: ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) ( (lv_content_2_0= RULE_STRING ) ) )
            // PsiInternalUseCase.g:488:3: (otherlv_0= 'notes:' | otherlv_1= 'note:' ) ( (lv_content_2_0= RULE_STRING ) )
            {
            // PsiInternalUseCase.g:488:3: (otherlv_0= 'notes:' | otherlv_1= 'note:' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            else if ( (LA12_0==22) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // PsiInternalUseCase.g:489:4: otherlv_0= 'notes:'
                    {

                    				markLeaf(elementTypeProvider.getNotes_NotesKeyword_0_0ElementType());
                    			
                    otherlv_0=(Token)match(input,21,FOLLOW_5); 

                    				doneLeaf(otherlv_0);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:497:4: otherlv_1= 'note:'
                    {

                    				markLeaf(elementTypeProvider.getNotes_NoteKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,22,FOLLOW_5); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;

            }

            // PsiInternalUseCase.g:505:3: ( (lv_content_2_0= RULE_STRING ) )
            // PsiInternalUseCase.g:506:4: (lv_content_2_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:506:4: (lv_content_2_0= RULE_STRING )
            // PsiInternalUseCase.g:507:5: lv_content_2_0= RULE_STRING
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
    // PsiInternalUseCase.g:526:1: entryRuleInputs returns [Boolean current=false] : iv_ruleInputs= ruleInputs EOF ;
    public final Boolean entryRuleInputs() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleInputs = null;


        try {
            // PsiInternalUseCase.g:526:48: (iv_ruleInputs= ruleInputs EOF )
            // PsiInternalUseCase.g:527:2: iv_ruleInputs= ruleInputs EOF
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
    // PsiInternalUseCase.g:533:1: ruleInputs returns [Boolean current=false] : ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) ( (lv_inputs_7_0= ruleInput ) )* ) ;
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
            // PsiInternalUseCase.g:534:1: ( ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) ( (lv_inputs_7_0= ruleInput ) )* ) )
            // PsiInternalUseCase.g:535:2: ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) ( (lv_inputs_7_0= ruleInput ) )* )
            {
            // PsiInternalUseCase.g:535:2: ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) ( (lv_inputs_7_0= ruleInput ) )* )
            // PsiInternalUseCase.g:536:3: (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) ( (lv_inputs_7_0= ruleInput ) )*
            {
            // PsiInternalUseCase.g:536:3: (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt13=1;
                }
                break;
            case 24:
                {
                alt13=2;
                }
                break;
            case 25:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // PsiInternalUseCase.g:537:4: otherlv_0= 'requires:'
                    {

                    				markLeaf(elementTypeProvider.getInputs_RequiresKeyword_0_0ElementType());
                    			
                    otherlv_0=(Token)match(input,23,FOLLOW_20); 

                    				doneLeaf(otherlv_0);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:545:4: otherlv_1= 'require:'
                    {

                    				markLeaf(elementTypeProvider.getInputs_RequireKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,24,FOLLOW_20); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;
                case 3 :
                    // PsiInternalUseCase.g:553:4: (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' )
                    {
                    // PsiInternalUseCase.g:553:4: (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' )
                    // PsiInternalUseCase.g:554:5: otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':'
                    {

                    					markLeaf(elementTypeProvider.getInputs_RequiresKeyword_0_2_0ElementType());
                    				
                    otherlv_2=(Token)match(input,25,FOLLOW_21); 

                    					doneLeaf(otherlv_2);
                    				

                    					markLeaf(elementTypeProvider.getInputs_TheKeyword_0_2_1ElementType());
                    				
                    otherlv_3=(Token)match(input,26,FOLLOW_22); 

                    					doneLeaf(otherlv_3);
                    				

                    					markLeaf(elementTypeProvider.getInputs_FollowingKeyword_0_2_2ElementType());
                    				
                    otherlv_4=(Token)match(input,27,FOLLOW_23); 

                    					doneLeaf(otherlv_4);
                    				

                    					markLeaf(elementTypeProvider.getInputs_InputKeyword_0_2_3ElementType());
                    				
                    otherlv_5=(Token)match(input,28,FOLLOW_24); 

                    					doneLeaf(otherlv_5);
                    				

                    					markLeaf(elementTypeProvider.getInputs_ColonKeyword_0_2_4ElementType());
                    				
                    otherlv_6=(Token)match(input,29,FOLLOW_20); 

                    					doneLeaf(otherlv_6);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:591:3: ( (lv_inputs_7_0= ruleInput ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=39 && LA14_0<=40)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // PsiInternalUseCase.g:592:4: (lv_inputs_7_0= ruleInput )
            	    {
            	    // PsiInternalUseCase.g:592:4: (lv_inputs_7_0= ruleInput )
            	    // PsiInternalUseCase.g:593:5: lv_inputs_7_0= ruleInput
            	    {

            	    					markComposite(elementTypeProvider.getInputs_InputsInputParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_20);
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
            	    break loop14;
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
    // PsiInternalUseCase.g:610:1: entryRuleOutputs returns [Boolean current=false] : iv_ruleOutputs= ruleOutputs EOF ;
    public final Boolean entryRuleOutputs() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleOutputs = null;


        try {
            // PsiInternalUseCase.g:610:49: (iv_ruleOutputs= ruleOutputs EOF )
            // PsiInternalUseCase.g:611:2: iv_ruleOutputs= ruleOutputs EOF
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
    // PsiInternalUseCase.g:617:1: ruleOutputs returns [Boolean current=false] : ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) ( (lv_outputs_7_0= ruleOutput ) )* ) ;
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
            // PsiInternalUseCase.g:618:1: ( ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) ( (lv_outputs_7_0= ruleOutput ) )* ) )
            // PsiInternalUseCase.g:619:2: ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) ( (lv_outputs_7_0= ruleOutput ) )* )
            {
            // PsiInternalUseCase.g:619:2: ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) ( (lv_outputs_7_0= ruleOutput ) )* )
            // PsiInternalUseCase.g:620:3: (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) ( (lv_outputs_7_0= ruleOutput ) )*
            {
            // PsiInternalUseCase.g:620:3: (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt15=1;
                }
                break;
            case 31:
                {
                alt15=2;
                }
                break;
            case 32:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // PsiInternalUseCase.g:621:4: otherlv_0= 'produces:'
                    {

                    				markLeaf(elementTypeProvider.getOutputs_ProducesKeyword_0_0ElementType());
                    			
                    otherlv_0=(Token)match(input,30,FOLLOW_20); 

                    				doneLeaf(otherlv_0);
                    			

                    }
                    break;
                case 2 :
                    // PsiInternalUseCase.g:629:4: otherlv_1= 'produce:'
                    {

                    				markLeaf(elementTypeProvider.getOutputs_ProduceKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,31,FOLLOW_20); 

                    				doneLeaf(otherlv_1);
                    			

                    }
                    break;
                case 3 :
                    // PsiInternalUseCase.g:637:4: (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' )
                    {
                    // PsiInternalUseCase.g:637:4: (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' )
                    // PsiInternalUseCase.g:638:5: otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':'
                    {

                    					markLeaf(elementTypeProvider.getOutputs_ProducesKeyword_0_2_0ElementType());
                    				
                    otherlv_2=(Token)match(input,32,FOLLOW_21); 

                    					doneLeaf(otherlv_2);
                    				

                    					markLeaf(elementTypeProvider.getOutputs_TheKeyword_0_2_1ElementType());
                    				
                    otherlv_3=(Token)match(input,26,FOLLOW_22); 

                    					doneLeaf(otherlv_3);
                    				

                    					markLeaf(elementTypeProvider.getOutputs_FollowingKeyword_0_2_2ElementType());
                    				
                    otherlv_4=(Token)match(input,27,FOLLOW_25); 

                    					doneLeaf(otherlv_4);
                    				

                    					markLeaf(elementTypeProvider.getOutputs_OutputKeyword_0_2_3ElementType());
                    				
                    otherlv_5=(Token)match(input,33,FOLLOW_24); 

                    					doneLeaf(otherlv_5);
                    				

                    					markLeaf(elementTypeProvider.getOutputs_ColonKeyword_0_2_4ElementType());
                    				
                    otherlv_6=(Token)match(input,29,FOLLOW_20); 

                    					doneLeaf(otherlv_6);
                    				

                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:675:3: ( (lv_outputs_7_0= ruleOutput ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=39 && LA16_0<=40)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // PsiInternalUseCase.g:676:4: (lv_outputs_7_0= ruleOutput )
            	    {
            	    // PsiInternalUseCase.g:676:4: (lv_outputs_7_0= ruleOutput )
            	    // PsiInternalUseCase.g:677:5: lv_outputs_7_0= ruleOutput
            	    {

            	    					markComposite(elementTypeProvider.getOutputs_OutputsOutputParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_20);
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
            	    break loop16;
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
    // PsiInternalUseCase.g:694:1: entryRuleType returns [Boolean current=false] : iv_ruleType= ruleType EOF ;
    public final Boolean entryRuleType() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleType = null;


        try {
            // PsiInternalUseCase.g:694:46: (iv_ruleType= ruleType EOF )
            // PsiInternalUseCase.g:695:2: iv_ruleType= ruleType EOF
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
    // PsiInternalUseCase.g:701:1: ruleType returns [Boolean current=false] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) ;
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
            // PsiInternalUseCase.g:702:1: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) )
            // PsiInternalUseCase.g:703:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            {
            // PsiInternalUseCase.g:703:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            // PsiInternalUseCase.g:704:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            {

            			markLeaf(elementTypeProvider.getType_TypeKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,34,FOLLOW_26); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:711:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalUseCase.g:712:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalUseCase.g:712:4: (lv_name_1_0= RULE_ID )
            // PsiInternalUseCase.g:713:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getType_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getType_LeftParenthesisKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_5); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalUseCase.g:735:3: ( (lv_description_3_0= RULE_STRING ) )
            // PsiInternalUseCase.g:736:4: (lv_description_3_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:736:4: (lv_description_3_0= RULE_STRING )
            // PsiInternalUseCase.g:737:5: lv_description_3_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getType_DescriptionSTRINGTerminalRuleCall_3_0ElementType());
            				
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_description_3_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getType_RightParenthesisKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,36,FOLLOW_29); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalUseCase.g:759:3: (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // PsiInternalUseCase.g:760:4: otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']'
                    {

                    				markLeaf(elementTypeProvider.getType_LeftSquareBracketKeyword_5_0ElementType());
                    			
                    otherlv_5=(Token)match(input,37,FOLLOW_26); 

                    				doneLeaf(otherlv_5);
                    			
                    // PsiInternalUseCase.g:767:4: ( (lv_importInfo_6_0= ruleQualifiedName ) )
                    // PsiInternalUseCase.g:768:5: (lv_importInfo_6_0= ruleQualifiedName )
                    {
                    // PsiInternalUseCase.g:768:5: (lv_importInfo_6_0= ruleQualifiedName )
                    // PsiInternalUseCase.g:769:6: lv_importInfo_6_0= ruleQualifiedName
                    {

                    						markComposite(elementTypeProvider.getType_ImportInfoQualifiedNameParserRuleCall_5_1_0ElementType());
                    					
                    pushFollow(FOLLOW_30);
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
                    			
                    otherlv_7=(Token)match(input,38,FOLLOW_2); 

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


    // $ANTLR start "entryRuleInput"
    // PsiInternalUseCase.g:794:1: entryRuleInput returns [Boolean current=false] : iv_ruleInput= ruleInput EOF ;
    public final Boolean entryRuleInput() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleInput = null;


        try {
            // PsiInternalUseCase.g:794:47: (iv_ruleInput= ruleInput EOF )
            // PsiInternalUseCase.g:795:2: iv_ruleInput= ruleInput EOF
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
    // PsiInternalUseCase.g:801:1: ruleInput returns [Boolean current=false] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? ) ;
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
            // PsiInternalUseCase.g:802:1: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? ) )
            // PsiInternalUseCase.g:803:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? )
            {
            // PsiInternalUseCase.g:803:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? )
            // PsiInternalUseCase.g:804:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )?
            {
            // PsiInternalUseCase.g:804:3: ( (lv_many_0_0= 'many' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==39) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // PsiInternalUseCase.g:805:4: (lv_many_0_0= 'many' )
                    {
                    // PsiInternalUseCase.g:805:4: (lv_many_0_0= 'many' )
                    // PsiInternalUseCase.g:806:5: lv_many_0_0= 'many'
                    {

                    					markLeaf(elementTypeProvider.getInput_ManyManyKeyword_0_0ElementType());
                    				
                    lv_many_0_0=(Token)match(input,39,FOLLOW_31); 

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
            		
            otherlv_1=(Token)match(input,40,FOLLOW_5); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalUseCase.g:828:3: ( (lv_content_2_0= RULE_STRING ) )
            // PsiInternalUseCase.g:829:4: (lv_content_2_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:829:4: (lv_content_2_0= RULE_STRING )
            // PsiInternalUseCase.g:830:5: lv_content_2_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getInput_ContentSTRINGTerminalRuleCall_2_0ElementType());
            				
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_content_2_0);
            				

            }


            }

            // PsiInternalUseCase.g:845:3: (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==41) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // PsiInternalUseCase.g:846:4: otherlv_3= 'as' ( (otherlv_4= RULE_ID ) )
                    {

                    				markLeaf(elementTypeProvider.getInput_AsKeyword_3_0ElementType());
                    			
                    otherlv_3=(Token)match(input,41,FOLLOW_26); 

                    				doneLeaf(otherlv_3);
                    			
                    // PsiInternalUseCase.g:853:4: ( (otherlv_4= RULE_ID ) )
                    // PsiInternalUseCase.g:854:5: (otherlv_4= RULE_ID )
                    {
                    // PsiInternalUseCase.g:854:5: (otherlv_4= RULE_ID )
                    // PsiInternalUseCase.g:855:6: otherlv_4= RULE_ID
                    {

                    						if (!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						markLeaf(elementTypeProvider.getInput_TypeTypeCrossReference_3_1_0ElementType());
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_33); 

                    						doneLeaf(otherlv_4);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:871:3: (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // PsiInternalUseCase.g:872:4: otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')'
                    {

                    				markLeaf(elementTypeProvider.getInput_LeftParenthesisKeyword_4_0ElementType());
                    			
                    otherlv_5=(Token)match(input,35,FOLLOW_34); 

                    				doneLeaf(otherlv_5);
                    			

                    				markLeaf(elementTypeProvider.getInput_EGKeyword_4_1ElementType());
                    			
                    otherlv_6=(Token)match(input,42,FOLLOW_5); 

                    				doneLeaf(otherlv_6);
                    			
                    // PsiInternalUseCase.g:886:4: ( (lv_example_7_0= RULE_STRING ) )
                    // PsiInternalUseCase.g:887:5: (lv_example_7_0= RULE_STRING )
                    {
                    // PsiInternalUseCase.g:887:5: (lv_example_7_0= RULE_STRING )
                    // PsiInternalUseCase.g:888:6: lv_example_7_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getInput_ExampleSTRINGTerminalRuleCall_4_2_0ElementType());
                    					
                    lv_example_7_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_example_7_0);
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getInput_RightParenthesisKeyword_4_3ElementType());
                    			
                    otherlv_8=(Token)match(input,36,FOLLOW_2); 

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
    // PsiInternalUseCase.g:915:1: entryRuleOutput returns [Boolean current=false] : iv_ruleOutput= ruleOutput EOF ;
    public final Boolean entryRuleOutput() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleOutput = null;


        try {
            // PsiInternalUseCase.g:915:48: (iv_ruleOutput= ruleOutput EOF )
            // PsiInternalUseCase.g:916:2: iv_ruleOutput= ruleOutput EOF
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
    // PsiInternalUseCase.g:922:1: ruleOutput returns [Boolean current=false] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? ) ;
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
            // PsiInternalUseCase.g:923:1: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? ) )
            // PsiInternalUseCase.g:924:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? )
            {
            // PsiInternalUseCase.g:924:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? )
            // PsiInternalUseCase.g:925:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )?
            {
            // PsiInternalUseCase.g:925:3: ( (lv_many_0_0= 'many' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // PsiInternalUseCase.g:926:4: (lv_many_0_0= 'many' )
                    {
                    // PsiInternalUseCase.g:926:4: (lv_many_0_0= 'many' )
                    // PsiInternalUseCase.g:927:5: lv_many_0_0= 'many'
                    {

                    					markLeaf(elementTypeProvider.getOutput_ManyManyKeyword_0_0ElementType());
                    				
                    lv_many_0_0=(Token)match(input,39,FOLLOW_31); 

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
            		
            otherlv_1=(Token)match(input,40,FOLLOW_5); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalUseCase.g:949:3: ( (lv_content_2_0= RULE_STRING ) )
            // PsiInternalUseCase.g:950:4: (lv_content_2_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:950:4: (lv_content_2_0= RULE_STRING )
            // PsiInternalUseCase.g:951:5: lv_content_2_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getOutput_ContentSTRINGTerminalRuleCall_2_0ElementType());
            				
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_content_2_0);
            				

            }


            }

            // PsiInternalUseCase.g:966:3: (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==41) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // PsiInternalUseCase.g:967:4: otherlv_3= 'as' ( (otherlv_4= RULE_ID ) )
                    {

                    				markLeaf(elementTypeProvider.getOutput_AsKeyword_3_0ElementType());
                    			
                    otherlv_3=(Token)match(input,41,FOLLOW_26); 

                    				doneLeaf(otherlv_3);
                    			
                    // PsiInternalUseCase.g:974:4: ( (otherlv_4= RULE_ID ) )
                    // PsiInternalUseCase.g:975:5: (otherlv_4= RULE_ID )
                    {
                    // PsiInternalUseCase.g:975:5: (otherlv_4= RULE_ID )
                    // PsiInternalUseCase.g:976:6: otherlv_4= RULE_ID
                    {

                    						if (!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						markLeaf(elementTypeProvider.getOutput_TypeTypeCrossReference_3_1_0ElementType());
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_33); 

                    						doneLeaf(otherlv_4);
                    					

                    }


                    }


                    }
                    break;

            }

            // PsiInternalUseCase.g:992:3: (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // PsiInternalUseCase.g:993:4: otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')'
                    {

                    				markLeaf(elementTypeProvider.getOutput_LeftParenthesisKeyword_4_0ElementType());
                    			
                    otherlv_5=(Token)match(input,35,FOLLOW_34); 

                    				doneLeaf(otherlv_5);
                    			

                    				markLeaf(elementTypeProvider.getOutput_EGKeyword_4_1ElementType());
                    			
                    otherlv_6=(Token)match(input,42,FOLLOW_5); 

                    				doneLeaf(otherlv_6);
                    			
                    // PsiInternalUseCase.g:1007:4: ( (lv_example_7_0= RULE_STRING ) )
                    // PsiInternalUseCase.g:1008:5: (lv_example_7_0= RULE_STRING )
                    {
                    // PsiInternalUseCase.g:1008:5: (lv_example_7_0= RULE_STRING )
                    // PsiInternalUseCase.g:1009:6: lv_example_7_0= RULE_STRING
                    {

                    						markLeaf(elementTypeProvider.getOutput_ExampleSTRINGTerminalRuleCall_4_2_0ElementType());
                    					
                    lv_example_7_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_example_7_0);
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getOutput_RightParenthesisKeyword_4_3ElementType());
                    			
                    otherlv_8=(Token)match(input,36,FOLLOW_2); 

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
    // PsiInternalUseCase.g:1036:1: entryRuleAllowedUserGroups returns [Boolean current=false] : iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF ;
    public final Boolean entryRuleAllowedUserGroups() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAllowedUserGroups = null;


        try {
            // PsiInternalUseCase.g:1036:59: (iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF )
            // PsiInternalUseCase.g:1037:2: iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF
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
    // PsiInternalUseCase.g:1043:1: ruleAllowedUserGroups returns [Boolean current=false] : (otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )* ) ;
    public final Boolean ruleAllowedUserGroups() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Boolean lv_groups_1_0 = null;


        try {
            // PsiInternalUseCase.g:1044:1: ( (otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )* ) )
            // PsiInternalUseCase.g:1045:2: (otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )* )
            {
            // PsiInternalUseCase.g:1045:2: (otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )* )
            // PsiInternalUseCase.g:1046:3: otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )*
            {

            			markLeaf(elementTypeProvider.getAllowedUserGroups_AllowedUsergroupsKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,43,FOLLOW_20); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalUseCase.g:1053:3: ( (lv_groups_1_0= ruleAllowedUserGroup ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=39 && LA24_0<=40)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // PsiInternalUseCase.g:1054:4: (lv_groups_1_0= ruleAllowedUserGroup )
            	    {
            	    // PsiInternalUseCase.g:1054:4: (lv_groups_1_0= ruleAllowedUserGroup )
            	    // PsiInternalUseCase.g:1055:5: lv_groups_1_0= ruleAllowedUserGroup
            	    {

            	    					markComposite(elementTypeProvider.getAllowedUserGroups_GroupsAllowedUserGroupParserRuleCall_1_0ElementType());
            	    				
            	    pushFollow(FOLLOW_20);
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
            	    break loop24;
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
    // PsiInternalUseCase.g:1072:1: entryRuleAllowedUserGroup returns [Boolean current=false] : iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF ;
    public final Boolean entryRuleAllowedUserGroup() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAllowedUserGroup = null;


        try {
            // PsiInternalUseCase.g:1072:58: (iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF )
            // PsiInternalUseCase.g:1073:2: iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF
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
    // PsiInternalUseCase.g:1079:1: ruleAllowedUserGroup returns [Boolean current=false] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final Boolean ruleAllowedUserGroup() throws RecognitionException {
        Boolean current = false;

        Token lv_many_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

        try {
            // PsiInternalUseCase.g:1080:1: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) )
            // PsiInternalUseCase.g:1081:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? )
            {
            // PsiInternalUseCase.g:1081:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? )
            // PsiInternalUseCase.g:1082:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            {
            // PsiInternalUseCase.g:1082:3: ( (lv_many_0_0= 'many' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // PsiInternalUseCase.g:1083:4: (lv_many_0_0= 'many' )
                    {
                    // PsiInternalUseCase.g:1083:4: (lv_many_0_0= 'many' )
                    // PsiInternalUseCase.g:1084:5: lv_many_0_0= 'many'
                    {

                    					markLeaf(elementTypeProvider.getAllowedUserGroup_ManyManyKeyword_0_0ElementType());
                    				
                    lv_many_0_0=(Token)match(input,39,FOLLOW_31); 

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
            		
            otherlv_1=(Token)match(input,40,FOLLOW_5); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalUseCase.g:1106:3: ( (lv_name_2_0= RULE_STRING ) )
            // PsiInternalUseCase.g:1107:4: (lv_name_2_0= RULE_STRING )
            {
            // PsiInternalUseCase.g:1107:4: (lv_name_2_0= RULE_STRING )
            // PsiInternalUseCase.g:1108:5: lv_name_2_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getAllowedUserGroup_NameSTRINGTerminalRuleCall_2_0ElementType());
            				
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_2_0);
            				

            }


            }

            // PsiInternalUseCase.g:1123:3: (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==41) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // PsiInternalUseCase.g:1124:4: otherlv_3= 'as' ( (otherlv_4= RULE_ID ) )
                    {

                    				markLeaf(elementTypeProvider.getAllowedUserGroup_AsKeyword_3_0ElementType());
                    			
                    otherlv_3=(Token)match(input,41,FOLLOW_26); 

                    				doneLeaf(otherlv_3);
                    			
                    // PsiInternalUseCase.g:1131:4: ( (otherlv_4= RULE_ID ) )
                    // PsiInternalUseCase.g:1132:5: (otherlv_4= RULE_ID )
                    {
                    // PsiInternalUseCase.g:1132:5: (otherlv_4= RULE_ID )
                    // PsiInternalUseCase.g:1133:6: otherlv_4= RULE_ID
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
    // PsiInternalUseCase.g:1153:1: entryRuleQualifiedName returns [Boolean current=false] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final Boolean entryRuleQualifiedName() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleQualifiedName = null;


        try {
            // PsiInternalUseCase.g:1153:55: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // PsiInternalUseCase.g:1154:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // PsiInternalUseCase.g:1160:1: ruleQualifiedName returns [Boolean current=false] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final Boolean ruleQualifiedName() throws RecognitionException {
        Boolean current = false;

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

        try {
            // PsiInternalUseCase.g:1161:1: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // PsiInternalUseCase.g:1162:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // PsiInternalUseCase.g:1162:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // PsiInternalUseCase.g:1163:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {

            			markLeaf(elementTypeProvider.getQualifiedName_IDTerminalRuleCall_0ElementType());
            		
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            			doneLeaf(this_ID_0);
            		
            // PsiInternalUseCase.g:1170:3: (kw= '.' this_ID_2= RULE_ID )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==15) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // PsiInternalUseCase.g:1171:4: kw= '.' this_ID_2= RULE_ID
            	    {

            	    				markLeaf(elementTypeProvider.getQualifiedName_FullStopKeyword_1_0ElementType());
            	    			
            	    kw=(Token)match(input,15,FOLLOW_26); 

            	    				doneLeaf(kw);
            	    			

            	    				markLeaf(elementTypeProvider.getQualifiedName_IDTerminalRuleCall_1_1ElementType());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    				doneLeaf(this_ID_2);
            	    			

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // PsiInternalUseCase.g:1190:1: entryRuleQualifiedNumber returns [Boolean current=false] : iv_ruleQualifiedNumber= ruleQualifiedNumber EOF ;
    public final Boolean entryRuleQualifiedNumber() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleQualifiedNumber = null;


        try {
            // PsiInternalUseCase.g:1190:57: (iv_ruleQualifiedNumber= ruleQualifiedNumber EOF )
            // PsiInternalUseCase.g:1191:2: iv_ruleQualifiedNumber= ruleQualifiedNumber EOF
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
    // PsiInternalUseCase.g:1197:1: ruleQualifiedNumber returns [Boolean current=false] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' ) ;
    public final Boolean ruleQualifiedNumber() throws RecognitionException {
        Boolean current = false;

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

        try {
            // PsiInternalUseCase.g:1198:1: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' ) )
            // PsiInternalUseCase.g:1199:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' )
            {
            // PsiInternalUseCase.g:1199:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' )
            // PsiInternalUseCase.g:1200:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.'
            {

            			markLeaf(elementTypeProvider.getQualifiedNumber_INTTerminalRuleCall_0ElementType());
            		
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_36); 

            			doneLeaf(this_INT_0);
            		
            // PsiInternalUseCase.g:1207:3: (kw= '.' this_INT_2= RULE_INT )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==15) ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==RULE_INT) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // PsiInternalUseCase.g:1208:4: kw= '.' this_INT_2= RULE_INT
            	    {

            	    				markLeaf(elementTypeProvider.getQualifiedNumber_FullStopKeyword_1_0ElementType());
            	    			
            	    kw=(Token)match(input,15,FOLLOW_37); 

            	    				doneLeaf(kw);
            	    			

            	    				markLeaf(elementTypeProvider.getQualifiedNumber_INTTerminalRuleCall_1_1ElementType());
            	    			
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_36); 

            	    				doneLeaf(this_INT_2);
            	    			

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            			markLeaf(elementTypeProvider.getQualifiedNumber_FullStopKeyword_2ElementType());
            		
            kw=(Token)match(input,15,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000400000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000801C3F05000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000801C3E05000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000001C3E05000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000001C0605000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000605000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000601000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020800000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000040L});

}