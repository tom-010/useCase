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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'use-case'", "'end'", "'of'", "'pre-condition:'", "'pre-conditions:'", "'-'", "'steps:'", "'used'", "'types:'", "'errors:'", "'.'", "'Raise'", "'On'", "'error'", "'raise'", "'description:'", "'notes:'", "'note:'", "'requires:'", "'require:'", "'requires'", "'the'", "'following'", "'input'", "':'", "'produces:'", "'produce:'", "'produces'", "'output'", "'('", "')'", "'['", "']'", "'many'", "'as'", "'e.g'", "'allowed-usergroups:'"
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
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // InternalUseCase.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_useCases_0_0= ruleUseCase ) )* ( (lv_types_1_0= ruleUsedTypes ) ) ( (lv_exceptions_2_0= ruleUsedExceptions ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_useCases_0_0 = null;

        EObject lv_types_1_0 = null;

        EObject lv_exceptions_2_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:77:2: ( ( ( (lv_useCases_0_0= ruleUseCase ) )* ( (lv_types_1_0= ruleUsedTypes ) ) ( (lv_exceptions_2_0= ruleUsedExceptions ) ) ) )
            // InternalUseCase.g:78:2: ( ( (lv_useCases_0_0= ruleUseCase ) )* ( (lv_types_1_0= ruleUsedTypes ) ) ( (lv_exceptions_2_0= ruleUsedExceptions ) ) )
            {
            // InternalUseCase.g:78:2: ( ( (lv_useCases_0_0= ruleUseCase ) )* ( (lv_types_1_0= ruleUsedTypes ) ) ( (lv_exceptions_2_0= ruleUsedExceptions ) ) )
            // InternalUseCase.g:79:3: ( (lv_useCases_0_0= ruleUseCase ) )* ( (lv_types_1_0= ruleUsedTypes ) ) ( (lv_exceptions_2_0= ruleUsedExceptions ) )
            {
            // InternalUseCase.g:79:3: ( (lv_useCases_0_0= ruleUseCase ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUseCase.g:80:4: (lv_useCases_0_0= ruleUseCase )
            	    {
            	    // InternalUseCase.g:80:4: (lv_useCases_0_0= ruleUseCase )
            	    // InternalUseCase.g:81:5: lv_useCases_0_0= ruleUseCase
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getUseCasesUseCaseParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_useCases_0_0=ruleUseCase();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"useCases",
            	    						lv_useCases_0_0,
            	    						"io.deniffel.dsl.useCase.UseCase.UseCase");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalUseCase.g:98:3: ( (lv_types_1_0= ruleUsedTypes ) )
            // InternalUseCase.g:99:4: (lv_types_1_0= ruleUsedTypes )
            {
            // InternalUseCase.g:99:4: (lv_types_1_0= ruleUsedTypes )
            // InternalUseCase.g:100:5: lv_types_1_0= ruleUsedTypes
            {

            					newCompositeNode(grammarAccess.getModelAccess().getTypesUsedTypesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_types_1_0=ruleUsedTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"types",
            						lv_types_1_0,
            						"io.deniffel.dsl.useCase.UseCase.UsedTypes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUseCase.g:117:3: ( (lv_exceptions_2_0= ruleUsedExceptions ) )
            // InternalUseCase.g:118:4: (lv_exceptions_2_0= ruleUsedExceptions )
            {
            // InternalUseCase.g:118:4: (lv_exceptions_2_0= ruleUsedExceptions )
            // InternalUseCase.g:119:5: lv_exceptions_2_0= ruleUsedExceptions
            {

            					newCompositeNode(grammarAccess.getModelAccess().getExceptionsUsedExceptionsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_exceptions_2_0=ruleUsedExceptions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"exceptions",
            						lv_exceptions_2_0,
            						"io.deniffel.dsl.useCase.UseCase.UsedExceptions");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleUseCase"
    // InternalUseCase.g:140:1: entryRuleUseCase returns [EObject current=null] : iv_ruleUseCase= ruleUseCase EOF ;
    public final EObject entryRuleUseCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCase = null;


        try {
            // InternalUseCase.g:140:48: (iv_ruleUseCase= ruleUseCase EOF )
            // InternalUseCase.g:141:2: iv_ruleUseCase= ruleUseCase EOF
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
    // InternalUseCase.g:147:1: ruleUseCase returns [EObject current=null] : (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )? ( (lv_inputs_4_0= ruleInputs ) )? ( (lv_outputs_5_0= ruleOutputs ) )? ( (lv_preconditions_6_0= rulePreConditions ) )? ( (lv_steps_7_0= ruleSteps ) )? ( (lv_notes_8_0= ruleNotes ) )? otherlv_9= 'end' otherlv_10= 'of' otherlv_11= 'use-case' ) ;
    public final EObject ruleUseCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_descriptions_2_0 = null;

        EObject lv_allowedUserGroups_3_0 = null;

        EObject lv_inputs_4_0 = null;

        EObject lv_outputs_5_0 = null;

        EObject lv_preconditions_6_0 = null;

        EObject lv_steps_7_0 = null;

        EObject lv_notes_8_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:153:2: ( (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )? ( (lv_inputs_4_0= ruleInputs ) )? ( (lv_outputs_5_0= ruleOutputs ) )? ( (lv_preconditions_6_0= rulePreConditions ) )? ( (lv_steps_7_0= ruleSteps ) )? ( (lv_notes_8_0= ruleNotes ) )? otherlv_9= 'end' otherlv_10= 'of' otherlv_11= 'use-case' ) )
            // InternalUseCase.g:154:2: (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )? ( (lv_inputs_4_0= ruleInputs ) )? ( (lv_outputs_5_0= ruleOutputs ) )? ( (lv_preconditions_6_0= rulePreConditions ) )? ( (lv_steps_7_0= ruleSteps ) )? ( (lv_notes_8_0= ruleNotes ) )? otherlv_9= 'end' otherlv_10= 'of' otherlv_11= 'use-case' )
            {
            // InternalUseCase.g:154:2: (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )? ( (lv_inputs_4_0= ruleInputs ) )? ( (lv_outputs_5_0= ruleOutputs ) )? ( (lv_preconditions_6_0= rulePreConditions ) )? ( (lv_steps_7_0= ruleSteps ) )? ( (lv_notes_8_0= ruleNotes ) )? otherlv_9= 'end' otherlv_10= 'of' otherlv_11= 'use-case' )
            // InternalUseCase.g:155:3: otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )? ( (lv_inputs_4_0= ruleInputs ) )? ( (lv_outputs_5_0= ruleOutputs ) )? ( (lv_preconditions_6_0= rulePreConditions ) )? ( (lv_steps_7_0= ruleSteps ) )? ( (lv_notes_8_0= ruleNotes ) )? otherlv_9= 'end' otherlv_10= 'of' otherlv_11= 'use-case'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getUseCaseAccess().getUseCaseKeyword_0());
            		
            // InternalUseCase.g:159:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalUseCase.g:160:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalUseCase.g:160:4: (lv_name_1_0= RULE_STRING )
            // InternalUseCase.g:161:5: lv_name_1_0= RULE_STRING
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

            // InternalUseCase.g:177:3: ( (lv_descriptions_2_0= ruleDescription ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==26) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalUseCase.g:178:4: (lv_descriptions_2_0= ruleDescription )
                    {
                    // InternalUseCase.g:178:4: (lv_descriptions_2_0= ruleDescription )
                    // InternalUseCase.g:179:5: lv_descriptions_2_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getDescriptionsDescriptionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_7);
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

            }

            // InternalUseCase.g:196:3: ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==47) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalUseCase.g:197:4: (lv_allowedUserGroups_3_0= ruleAllowedUserGroups )
                    {
                    // InternalUseCase.g:197:4: (lv_allowedUserGroups_3_0= ruleAllowedUserGroups )
                    // InternalUseCase.g:198:5: lv_allowedUserGroups_3_0= ruleAllowedUserGroups
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getAllowedUserGroupsAllowedUserGroupsParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_allowedUserGroups_3_0=ruleAllowedUserGroups();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    					}
                    					add(
                    						current,
                    						"allowedUserGroups",
                    						lv_allowedUserGroups_3_0,
                    						"io.deniffel.dsl.useCase.UseCase.AllowedUserGroups");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:215:3: ( (lv_inputs_4_0= ruleInputs ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=29 && LA4_0<=31)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalUseCase.g:216:4: (lv_inputs_4_0= ruleInputs )
                    {
                    // InternalUseCase.g:216:4: (lv_inputs_4_0= ruleInputs )
                    // InternalUseCase.g:217:5: lv_inputs_4_0= ruleInputs
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getInputsInputsParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_inputs_4_0=ruleInputs();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    					}
                    					add(
                    						current,
                    						"inputs",
                    						lv_inputs_4_0,
                    						"io.deniffel.dsl.useCase.UseCase.Inputs");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:234:3: ( (lv_outputs_5_0= ruleOutputs ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=36 && LA5_0<=38)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalUseCase.g:235:4: (lv_outputs_5_0= ruleOutputs )
                    {
                    // InternalUseCase.g:235:4: (lv_outputs_5_0= ruleOutputs )
                    // InternalUseCase.g:236:5: lv_outputs_5_0= ruleOutputs
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getOutputsOutputsParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_outputs_5_0=ruleOutputs();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    					}
                    					add(
                    						current,
                    						"outputs",
                    						lv_outputs_5_0,
                    						"io.deniffel.dsl.useCase.UseCase.Outputs");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:253:3: ( (lv_preconditions_6_0= rulePreConditions ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=14 && LA6_0<=15)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUseCase.g:254:4: (lv_preconditions_6_0= rulePreConditions )
                    {
                    // InternalUseCase.g:254:4: (lv_preconditions_6_0= rulePreConditions )
                    // InternalUseCase.g:255:5: lv_preconditions_6_0= rulePreConditions
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getPreconditionsPreConditionsParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_preconditions_6_0=rulePreConditions();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    					}
                    					set(
                    						current,
                    						"preconditions",
                    						lv_preconditions_6_0,
                    						"io.deniffel.dsl.useCase.UseCase.PreConditions");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:272:3: ( (lv_steps_7_0= ruleSteps ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUseCase.g:273:4: (lv_steps_7_0= ruleSteps )
                    {
                    // InternalUseCase.g:273:4: (lv_steps_7_0= ruleSteps )
                    // InternalUseCase.g:274:5: lv_steps_7_0= ruleSteps
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getStepsStepsParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_steps_7_0=ruleSteps();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    					}
                    					add(
                    						current,
                    						"steps",
                    						lv_steps_7_0,
                    						"io.deniffel.dsl.useCase.UseCase.Steps");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:291:3: ( (lv_notes_8_0= ruleNotes ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=27 && LA8_0<=28)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUseCase.g:292:4: (lv_notes_8_0= ruleNotes )
                    {
                    // InternalUseCase.g:292:4: (lv_notes_8_0= ruleNotes )
                    // InternalUseCase.g:293:5: lv_notes_8_0= ruleNotes
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getNotesNotesParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_notes_8_0=ruleNotes();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    					}
                    					add(
                    						current,
                    						"notes",
                    						lv_notes_8_0,
                    						"io.deniffel.dsl.useCase.UseCase.Notes");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getUseCaseAccess().getEndKeyword_9());
            		
            otherlv_10=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_10, grammarAccess.getUseCaseAccess().getOfKeyword_10());
            		
            otherlv_11=(Token)match(input,11,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getUseCaseAccess().getUseCaseKeyword_11());
            		

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


    // $ANTLR start "entryRulePreConditions"
    // InternalUseCase.g:326:1: entryRulePreConditions returns [EObject current=null] : iv_rulePreConditions= rulePreConditions EOF ;
    public final EObject entryRulePreConditions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreConditions = null;


        try {
            // InternalUseCase.g:326:54: (iv_rulePreConditions= rulePreConditions EOF )
            // InternalUseCase.g:327:2: iv_rulePreConditions= rulePreConditions EOF
            {
             newCompositeNode(grammarAccess.getPreConditionsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePreConditions=rulePreConditions();

            state._fsp--;

             current =iv_rulePreConditions; 
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
    // $ANTLR end "entryRulePreConditions"


    // $ANTLR start "rulePreConditions"
    // InternalUseCase.g:333:1: rulePreConditions returns [EObject current=null] : ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) ( (lv_conditions_2_0= ruleCondition ) )* ) ;
    public final EObject rulePreConditions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_conditions_2_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:339:2: ( ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) ( (lv_conditions_2_0= ruleCondition ) )* ) )
            // InternalUseCase.g:340:2: ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) ( (lv_conditions_2_0= ruleCondition ) )* )
            {
            // InternalUseCase.g:340:2: ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) ( (lv_conditions_2_0= ruleCondition ) )* )
            // InternalUseCase.g:341:3: (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) ( (lv_conditions_2_0= ruleCondition ) )*
            {
            // InternalUseCase.g:341:3: (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' )
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
                    // InternalUseCase.g:342:4: otherlv_0= 'pre-condition:'
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_16); 

                    				newLeafNode(otherlv_0, grammarAccess.getPreConditionsAccess().getPreConditionKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:347:4: otherlv_1= 'pre-conditions:'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getPreConditionsAccess().getPreConditionsKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:352:3: ( (lv_conditions_2_0= ruleCondition ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalUseCase.g:353:4: (lv_conditions_2_0= ruleCondition )
            	    {
            	    // InternalUseCase.g:353:4: (lv_conditions_2_0= ruleCondition )
            	    // InternalUseCase.g:354:5: lv_conditions_2_0= ruleCondition
            	    {

            	    					newCompositeNode(grammarAccess.getPreConditionsAccess().getConditionsConditionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_conditions_2_0=ruleCondition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPreConditionsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"conditions",
            	    						lv_conditions_2_0,
            	    						"io.deniffel.dsl.useCase.UseCase.Condition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "rulePreConditions"


    // $ANTLR start "entryRuleCondition"
    // InternalUseCase.g:375:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalUseCase.g:375:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalUseCase.g:376:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalUseCase.g:382:1: ruleCondition returns [EObject current=null] : (otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_content_1_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:388:2: ( (otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) ) ) )
            // InternalUseCase.g:389:2: (otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) ) )
            {
            // InternalUseCase.g:389:2: (otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) ) )
            // InternalUseCase.g:390:3: otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getHyphenMinusKeyword_0());
            		
            // InternalUseCase.g:394:3: ( (lv_content_1_0= RULE_STRING ) )
            // InternalUseCase.g:395:4: (lv_content_1_0= RULE_STRING )
            {
            // InternalUseCase.g:395:4: (lv_content_1_0= RULE_STRING )
            // InternalUseCase.g:396:5: lv_content_1_0= RULE_STRING
            {
            lv_content_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_content_1_0, grammarAccess.getConditionAccess().getContentSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_1_0,
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleSteps"
    // InternalUseCase.g:416:1: entryRuleSteps returns [EObject current=null] : iv_ruleSteps= ruleSteps EOF ;
    public final EObject entryRuleSteps() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSteps = null;


        try {
            // InternalUseCase.g:416:46: (iv_ruleSteps= ruleSteps EOF )
            // InternalUseCase.g:417:2: iv_ruleSteps= ruleSteps EOF
            {
             newCompositeNode(grammarAccess.getStepsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSteps=ruleSteps();

            state._fsp--;

             current =iv_ruleSteps; 
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
    // $ANTLR end "entryRuleSteps"


    // $ANTLR start "ruleSteps"
    // InternalUseCase.g:423:1: ruleSteps returns [EObject current=null] : (otherlv_0= 'steps:' ( (lv_steps_1_0= ruleStep ) )* ) ;
    public final EObject ruleSteps() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_steps_1_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:429:2: ( (otherlv_0= 'steps:' ( (lv_steps_1_0= ruleStep ) )* ) )
            // InternalUseCase.g:430:2: (otherlv_0= 'steps:' ( (lv_steps_1_0= ruleStep ) )* )
            {
            // InternalUseCase.g:430:2: (otherlv_0= 'steps:' ( (lv_steps_1_0= ruleStep ) )* )
            // InternalUseCase.g:431:3: otherlv_0= 'steps:' ( (lv_steps_1_0= ruleStep ) )*
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getStepsAccess().getStepsKeyword_0());
            		
            // InternalUseCase.g:435:3: ( (lv_steps_1_0= ruleStep ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_INT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalUseCase.g:436:4: (lv_steps_1_0= ruleStep )
            	    {
            	    // InternalUseCase.g:436:4: (lv_steps_1_0= ruleStep )
            	    // InternalUseCase.g:437:5: lv_steps_1_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getStepsAccess().getStepsStepParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_steps_1_0=ruleStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStepsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"steps",
            	    						lv_steps_1_0,
            	    						"io.deniffel.dsl.useCase.UseCase.Step");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "ruleSteps"


    // $ANTLR start "entryRuleUsedTypes"
    // InternalUseCase.g:458:1: entryRuleUsedTypes returns [EObject current=null] : iv_ruleUsedTypes= ruleUsedTypes EOF ;
    public final EObject entryRuleUsedTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsedTypes = null;


        try {
            // InternalUseCase.g:458:50: (iv_ruleUsedTypes= ruleUsedTypes EOF )
            // InternalUseCase.g:459:2: iv_ruleUsedTypes= ruleUsedTypes EOF
            {
             newCompositeNode(grammarAccess.getUsedTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUsedTypes=ruleUsedTypes();

            state._fsp--;

             current =iv_ruleUsedTypes; 
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
    // $ANTLR end "entryRuleUsedTypes"


    // $ANTLR start "ruleUsedTypes"
    // InternalUseCase.g:465:1: ruleUsedTypes returns [EObject current=null] : (otherlv_0= 'used' otherlv_1= 'types:' ( (lv_types_2_0= ruleType ) )* ) ;
    public final EObject ruleUsedTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_types_2_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:471:2: ( (otherlv_0= 'used' otherlv_1= 'types:' ( (lv_types_2_0= ruleType ) )* ) )
            // InternalUseCase.g:472:2: (otherlv_0= 'used' otherlv_1= 'types:' ( (lv_types_2_0= ruleType ) )* )
            {
            // InternalUseCase.g:472:2: (otherlv_0= 'used' otherlv_1= 'types:' ( (lv_types_2_0= ruleType ) )* )
            // InternalUseCase.g:473:3: otherlv_0= 'used' otherlv_1= 'types:' ( (lv_types_2_0= ruleType ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getUsedTypesAccess().getUsedKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getUsedTypesAccess().getTypesKeyword_1());
            		
            // InternalUseCase.g:481:3: ( (lv_types_2_0= ruleType ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalUseCase.g:482:4: (lv_types_2_0= ruleType )
            	    {
            	    // InternalUseCase.g:482:4: (lv_types_2_0= ruleType )
            	    // InternalUseCase.g:483:5: lv_types_2_0= ruleType
            	    {

            	    					newCompositeNode(grammarAccess.getUsedTypesAccess().getTypesTypeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_types_2_0=ruleType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUsedTypesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"types",
            	    						lv_types_2_0,
            	    						"io.deniffel.dsl.useCase.UseCase.Type");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleUsedTypes"


    // $ANTLR start "entryRuleUsedExceptions"
    // InternalUseCase.g:504:1: entryRuleUsedExceptions returns [EObject current=null] : iv_ruleUsedExceptions= ruleUsedExceptions EOF ;
    public final EObject entryRuleUsedExceptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsedExceptions = null;


        try {
            // InternalUseCase.g:504:55: (iv_ruleUsedExceptions= ruleUsedExceptions EOF )
            // InternalUseCase.g:505:2: iv_ruleUsedExceptions= ruleUsedExceptions EOF
            {
             newCompositeNode(grammarAccess.getUsedExceptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUsedExceptions=ruleUsedExceptions();

            state._fsp--;

             current =iv_ruleUsedExceptions; 
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
    // $ANTLR end "entryRuleUsedExceptions"


    // $ANTLR start "ruleUsedExceptions"
    // InternalUseCase.g:511:1: ruleUsedExceptions returns [EObject current=null] : (otherlv_0= 'used' otherlv_1= 'errors:' ( (lv_exceptions_2_0= ruleExceptionDecleration ) )* ) ;
    public final EObject ruleUsedExceptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_exceptions_2_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:517:2: ( (otherlv_0= 'used' otherlv_1= 'errors:' ( (lv_exceptions_2_0= ruleExceptionDecleration ) )* ) )
            // InternalUseCase.g:518:2: (otherlv_0= 'used' otherlv_1= 'errors:' ( (lv_exceptions_2_0= ruleExceptionDecleration ) )* )
            {
            // InternalUseCase.g:518:2: (otherlv_0= 'used' otherlv_1= 'errors:' ( (lv_exceptions_2_0= ruleExceptionDecleration ) )* )
            // InternalUseCase.g:519:3: otherlv_0= 'used' otherlv_1= 'errors:' ( (lv_exceptions_2_0= ruleExceptionDecleration ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getUsedExceptionsAccess().getUsedKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getUsedExceptionsAccess().getErrorsKeyword_1());
            		
            // InternalUseCase.g:527:3: ( (lv_exceptions_2_0= ruleExceptionDecleration ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalUseCase.g:528:4: (lv_exceptions_2_0= ruleExceptionDecleration )
            	    {
            	    // InternalUseCase.g:528:4: (lv_exceptions_2_0= ruleExceptionDecleration )
            	    // InternalUseCase.g:529:5: lv_exceptions_2_0= ruleExceptionDecleration
            	    {

            	    					newCompositeNode(grammarAccess.getUsedExceptionsAccess().getExceptionsExceptionDeclerationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_exceptions_2_0=ruleExceptionDecleration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUsedExceptionsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"exceptions",
            	    						lv_exceptions_2_0,
            	    						"io.deniffel.dsl.useCase.UseCase.ExceptionDecleration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "ruleUsedExceptions"


    // $ANTLR start "entryRuleStep"
    // InternalUseCase.g:550:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalUseCase.g:550:45: (iv_ruleStep= ruleStep EOF )
            // InternalUseCase.g:551:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
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
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // InternalUseCase.g:557:1: ruleStep returns [EObject current=null] : ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token lv_action_1_0=null;
        AntlrDatatypeRuleToken lv_number_0_0 = null;

        EObject lv_error_2_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:563:2: ( ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? ) )
            // InternalUseCase.g:564:2: ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? )
            {
            // InternalUseCase.g:564:2: ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? )
            // InternalUseCase.g:565:3: ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )?
            {
            // InternalUseCase.g:565:3: ( (lv_number_0_0= ruleQualifiedNumber ) )
            // InternalUseCase.g:566:4: (lv_number_0_0= ruleQualifiedNumber )
            {
            // InternalUseCase.g:566:4: (lv_number_0_0= ruleQualifiedNumber )
            // InternalUseCase.g:567:5: lv_number_0_0= ruleQualifiedNumber
            {

            					newCompositeNode(grammarAccess.getStepAccess().getNumberQualifiedNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_number_0_0=ruleQualifiedNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStepRule());
            					}
            					set(
            						current,
            						"number",
            						lv_number_0_0,
            						"io.deniffel.dsl.useCase.UseCase.QualifiedNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUseCase.g:584:3: ( (lv_action_1_0= RULE_STRING ) )
            // InternalUseCase.g:585:4: (lv_action_1_0= RULE_STRING )
            {
            // InternalUseCase.g:585:4: (lv_action_1_0= RULE_STRING )
            // InternalUseCase.g:586:5: lv_action_1_0= RULE_STRING
            {
            lv_action_1_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_action_1_0, grammarAccess.getStepAccess().getActionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStepRule());
            					}
            					setWithLastConsumed(
            						current,
            						"action",
            						lv_action_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalUseCase.g:602:3: ( (lv_error_2_0= ruleRaiseError ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUseCase.g:603:4: (lv_error_2_0= ruleRaiseError )
                    {
                    // InternalUseCase.g:603:4: (lv_error_2_0= ruleRaiseError )
                    // InternalUseCase.g:604:5: lv_error_2_0= ruleRaiseError
                    {

                    					newCompositeNode(grammarAccess.getStepAccess().getErrorRaiseErrorParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_error_2_0=ruleRaiseError();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStepRule());
                    					}
                    					set(
                    						current,
                    						"error",
                    						lv_error_2_0,
                    						"io.deniffel.dsl.useCase.UseCase.RaiseError");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleRaiseError"
    // InternalUseCase.g:625:1: entryRuleRaiseError returns [EObject current=null] : iv_ruleRaiseError= ruleRaiseError EOF ;
    public final EObject entryRuleRaiseError() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRaiseError = null;


        try {
            // InternalUseCase.g:625:51: (iv_ruleRaiseError= ruleRaiseError EOF )
            // InternalUseCase.g:626:2: iv_ruleRaiseError= ruleRaiseError EOF
            {
             newCompositeNode(grammarAccess.getRaiseErrorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRaiseError=ruleRaiseError();

            state._fsp--;

             current =iv_ruleRaiseError; 
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
    // $ANTLR end "entryRuleRaiseError"


    // $ANTLR start "ruleRaiseError"
    // InternalUseCase.g:632:1: ruleRaiseError returns [EObject current=null] : (otherlv_0= '.' (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) ) ( (lv_exception_5_0= ruleException ) ) ) ;
    public final EObject ruleRaiseError() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_exception_5_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:638:2: ( (otherlv_0= '.' (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) ) ( (lv_exception_5_0= ruleException ) ) ) )
            // InternalUseCase.g:639:2: (otherlv_0= '.' (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) ) ( (lv_exception_5_0= ruleException ) ) )
            {
            // InternalUseCase.g:639:2: (otherlv_0= '.' (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) ) ( (lv_exception_5_0= ruleException ) ) )
            // InternalUseCase.g:640:3: otherlv_0= '.' (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) ) ( (lv_exception_5_0= ruleException ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getRaiseErrorAccess().getFullStopKeyword_0());
            		
            // InternalUseCase.g:644:3: (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) )
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
                    // InternalUseCase.g:645:4: otherlv_1= 'Raise'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getRaiseErrorAccess().getRaiseKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:650:4: (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' )
                    {
                    // InternalUseCase.g:650:4: (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' )
                    // InternalUseCase.g:651:5: otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23); 

                    					newLeafNode(otherlv_2, grammarAccess.getRaiseErrorAccess().getOnKeyword_1_1_0());
                    				
                    otherlv_3=(Token)match(input,24,FOLLOW_24); 

                    					newLeafNode(otherlv_3, grammarAccess.getRaiseErrorAccess().getErrorKeyword_1_1_1());
                    				
                    otherlv_4=(Token)match(input,25,FOLLOW_22); 

                    					newLeafNode(otherlv_4, grammarAccess.getRaiseErrorAccess().getRaiseKeyword_1_1_2());
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:665:3: ( (lv_exception_5_0= ruleException ) )
            // InternalUseCase.g:666:4: (lv_exception_5_0= ruleException )
            {
            // InternalUseCase.g:666:4: (lv_exception_5_0= ruleException )
            // InternalUseCase.g:667:5: lv_exception_5_0= ruleException
            {

            					newCompositeNode(grammarAccess.getRaiseErrorAccess().getExceptionExceptionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_exception_5_0=ruleException();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRaiseErrorRule());
            					}
            					set(
            						current,
            						"exception",
            						lv_exception_5_0,
            						"io.deniffel.dsl.useCase.UseCase.Exception");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleRaiseError"


    // $ANTLR start "entryRuleException"
    // InternalUseCase.g:688:1: entryRuleException returns [EObject current=null] : iv_ruleException= ruleException EOF ;
    public final EObject entryRuleException() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleException = null;


        try {
            // InternalUseCase.g:688:50: (iv_ruleException= ruleException EOF )
            // InternalUseCase.g:689:2: iv_ruleException= ruleException EOF
            {
             newCompositeNode(grammarAccess.getExceptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleException=ruleException();

            state._fsp--;

             current =iv_ruleException; 
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
    // $ANTLR end "entryRuleException"


    // $ANTLR start "ruleException"
    // InternalUseCase.g:695:1: ruleException returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleException() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:701:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalUseCase.g:702:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalUseCase.g:702:2: ( (otherlv_0= RULE_ID ) )
            // InternalUseCase.g:703:3: (otherlv_0= RULE_ID )
            {
            // InternalUseCase.g:703:3: (otherlv_0= RULE_ID )
            // InternalUseCase.g:704:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getExceptionRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getExceptionAccess().getTypeExceptionDeclerationCrossReference_0());
            			

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
    // $ANTLR end "ruleException"


    // $ANTLR start "entryRuleDescription"
    // InternalUseCase.g:718:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalUseCase.g:718:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalUseCase.g:719:2: iv_ruleDescription= ruleDescription EOF
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
    // InternalUseCase.g:725:1: ruleDescription returns [EObject current=null] : (otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:731:2: ( (otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalUseCase.g:732:2: (otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalUseCase.g:732:2: (otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalUseCase.g:733:3: otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getDescriptionKeyword_0());
            		
            // InternalUseCase.g:737:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalUseCase.g:738:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalUseCase.g:738:4: (lv_name_1_0= RULE_STRING )
            // InternalUseCase.g:739:5: lv_name_1_0= RULE_STRING
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


    // $ANTLR start "entryRuleNotes"
    // InternalUseCase.g:759:1: entryRuleNotes returns [EObject current=null] : iv_ruleNotes= ruleNotes EOF ;
    public final EObject entryRuleNotes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotes = null;


        try {
            // InternalUseCase.g:759:46: (iv_ruleNotes= ruleNotes EOF )
            // InternalUseCase.g:760:2: iv_ruleNotes= ruleNotes EOF
            {
             newCompositeNode(grammarAccess.getNotesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotes=ruleNotes();

            state._fsp--;

             current =iv_ruleNotes; 
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
    // $ANTLR end "entryRuleNotes"


    // $ANTLR start "ruleNotes"
    // InternalUseCase.g:766:1: ruleNotes returns [EObject current=null] : ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) ( (lv_content_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleNotes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:772:2: ( ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) ( (lv_content_2_0= RULE_STRING ) ) ) )
            // InternalUseCase.g:773:2: ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) ( (lv_content_2_0= RULE_STRING ) ) )
            {
            // InternalUseCase.g:773:2: ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) ( (lv_content_2_0= RULE_STRING ) ) )
            // InternalUseCase.g:774:3: (otherlv_0= 'notes:' | otherlv_1= 'note:' ) ( (lv_content_2_0= RULE_STRING ) )
            {
            // InternalUseCase.g:774:3: (otherlv_0= 'notes:' | otherlv_1= 'note:' )
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
                    // InternalUseCase.g:775:4: otherlv_0= 'notes:'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getNotesAccess().getNotesKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:780:4: otherlv_1= 'note:'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getNotesAccess().getNoteKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:785:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalUseCase.g:786:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalUseCase.g:786:4: (lv_content_2_0= RULE_STRING )
            // InternalUseCase.g:787:5: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_content_2_0, grammarAccess.getNotesAccess().getContentSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNotesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_2_0,
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
    // $ANTLR end "ruleNotes"


    // $ANTLR start "entryRuleInputs"
    // InternalUseCase.g:807:1: entryRuleInputs returns [EObject current=null] : iv_ruleInputs= ruleInputs EOF ;
    public final EObject entryRuleInputs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputs = null;


        try {
            // InternalUseCase.g:807:47: (iv_ruleInputs= ruleInputs EOF )
            // InternalUseCase.g:808:2: iv_ruleInputs= ruleInputs EOF
            {
             newCompositeNode(grammarAccess.getInputsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputs=ruleInputs();

            state._fsp--;

             current =iv_ruleInputs; 
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
    // $ANTLR end "entryRuleInputs"


    // $ANTLR start "ruleInputs"
    // InternalUseCase.g:814:1: ruleInputs returns [EObject current=null] : ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) ( (lv_inputs_7_0= ruleInput ) )* ) ;
    public final EObject ruleInputs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_inputs_7_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:820:2: ( ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) ( (lv_inputs_7_0= ruleInput ) )* ) )
            // InternalUseCase.g:821:2: ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) ( (lv_inputs_7_0= ruleInput ) )* )
            {
            // InternalUseCase.g:821:2: ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) ( (lv_inputs_7_0= ruleInput ) )* )
            // InternalUseCase.g:822:3: (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) ( (lv_inputs_7_0= ruleInput ) )*
            {
            // InternalUseCase.g:822:3: (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) )
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
                    // InternalUseCase.g:823:4: otherlv_0= 'requires:'
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_25); 

                    				newLeafNode(otherlv_0, grammarAccess.getInputsAccess().getRequiresKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:828:4: otherlv_1= 'require:'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_25); 

                    				newLeafNode(otherlv_1, grammarAccess.getInputsAccess().getRequireKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalUseCase.g:833:4: (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' )
                    {
                    // InternalUseCase.g:833:4: (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' )
                    // InternalUseCase.g:834:5: otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':'
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_26); 

                    					newLeafNode(otherlv_2, grammarAccess.getInputsAccess().getRequiresKeyword_0_2_0());
                    				
                    otherlv_3=(Token)match(input,32,FOLLOW_27); 

                    					newLeafNode(otherlv_3, grammarAccess.getInputsAccess().getTheKeyword_0_2_1());
                    				
                    otherlv_4=(Token)match(input,33,FOLLOW_28); 

                    					newLeafNode(otherlv_4, grammarAccess.getInputsAccess().getFollowingKeyword_0_2_2());
                    				
                    otherlv_5=(Token)match(input,34,FOLLOW_29); 

                    					newLeafNode(otherlv_5, grammarAccess.getInputsAccess().getInputKeyword_0_2_3());
                    				
                    otherlv_6=(Token)match(input,35,FOLLOW_25); 

                    					newLeafNode(otherlv_6, grammarAccess.getInputsAccess().getColonKeyword_0_2_4());
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:856:3: ( (lv_inputs_7_0= ruleInput ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==16||LA18_0==44) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalUseCase.g:857:4: (lv_inputs_7_0= ruleInput )
            	    {
            	    // InternalUseCase.g:857:4: (lv_inputs_7_0= ruleInput )
            	    // InternalUseCase.g:858:5: lv_inputs_7_0= ruleInput
            	    {

            	    					newCompositeNode(grammarAccess.getInputsAccess().getInputsInputParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_inputs_7_0=ruleInput();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInputsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"inputs",
            	    						lv_inputs_7_0,
            	    						"io.deniffel.dsl.useCase.UseCase.Input");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end "ruleInputs"


    // $ANTLR start "entryRuleOutputs"
    // InternalUseCase.g:879:1: entryRuleOutputs returns [EObject current=null] : iv_ruleOutputs= ruleOutputs EOF ;
    public final EObject entryRuleOutputs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputs = null;


        try {
            // InternalUseCase.g:879:48: (iv_ruleOutputs= ruleOutputs EOF )
            // InternalUseCase.g:880:2: iv_ruleOutputs= ruleOutputs EOF
            {
             newCompositeNode(grammarAccess.getOutputsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutputs=ruleOutputs();

            state._fsp--;

             current =iv_ruleOutputs; 
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
    // $ANTLR end "entryRuleOutputs"


    // $ANTLR start "ruleOutputs"
    // InternalUseCase.g:886:1: ruleOutputs returns [EObject current=null] : ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) ( (lv_outputs_7_0= ruleOutput ) )* ) ;
    public final EObject ruleOutputs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_outputs_7_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:892:2: ( ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) ( (lv_outputs_7_0= ruleOutput ) )* ) )
            // InternalUseCase.g:893:2: ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) ( (lv_outputs_7_0= ruleOutput ) )* )
            {
            // InternalUseCase.g:893:2: ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) ( (lv_outputs_7_0= ruleOutput ) )* )
            // InternalUseCase.g:894:3: (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) ( (lv_outputs_7_0= ruleOutput ) )*
            {
            // InternalUseCase.g:894:3: (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) )
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
                    // InternalUseCase.g:895:4: otherlv_0= 'produces:'
                    {
                    otherlv_0=(Token)match(input,36,FOLLOW_25); 

                    				newLeafNode(otherlv_0, grammarAccess.getOutputsAccess().getProducesKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:900:4: otherlv_1= 'produce:'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_25); 

                    				newLeafNode(otherlv_1, grammarAccess.getOutputsAccess().getProduceKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalUseCase.g:905:4: (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' )
                    {
                    // InternalUseCase.g:905:4: (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' )
                    // InternalUseCase.g:906:5: otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':'
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_26); 

                    					newLeafNode(otherlv_2, grammarAccess.getOutputsAccess().getProducesKeyword_0_2_0());
                    				
                    otherlv_3=(Token)match(input,32,FOLLOW_27); 

                    					newLeafNode(otherlv_3, grammarAccess.getOutputsAccess().getTheKeyword_0_2_1());
                    				
                    otherlv_4=(Token)match(input,33,FOLLOW_30); 

                    					newLeafNode(otherlv_4, grammarAccess.getOutputsAccess().getFollowingKeyword_0_2_2());
                    				
                    otherlv_5=(Token)match(input,39,FOLLOW_29); 

                    					newLeafNode(otherlv_5, grammarAccess.getOutputsAccess().getOutputKeyword_0_2_3());
                    				
                    otherlv_6=(Token)match(input,35,FOLLOW_25); 

                    					newLeafNode(otherlv_6, grammarAccess.getOutputsAccess().getColonKeyword_0_2_4());
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:928:3: ( (lv_outputs_7_0= ruleOutput ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==16||LA20_0==44) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalUseCase.g:929:4: (lv_outputs_7_0= ruleOutput )
            	    {
            	    // InternalUseCase.g:929:4: (lv_outputs_7_0= ruleOutput )
            	    // InternalUseCase.g:930:5: lv_outputs_7_0= ruleOutput
            	    {

            	    					newCompositeNode(grammarAccess.getOutputsAccess().getOutputsOutputParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_outputs_7_0=ruleOutput();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOutputsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"outputs",
            	    						lv_outputs_7_0,
            	    						"io.deniffel.dsl.useCase.UseCase.Output");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // $ANTLR end "ruleOutputs"


    // $ANTLR start "entryRuleType"
    // InternalUseCase.g:951:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalUseCase.g:951:45: (iv_ruleType= ruleType EOF )
            // InternalUseCase.g:952:2: iv_ruleType= ruleType EOF
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
    // InternalUseCase.g:958:1: ruleType returns [EObject current=null] : (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) ;
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
            // InternalUseCase.g:964:2: ( (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) )
            // InternalUseCase.g:965:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            {
            // InternalUseCase.g:965:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            // InternalUseCase.g:966:3: otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getHyphenMinusKeyword_0());
            		
            // InternalUseCase.g:970:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUseCase.g:971:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUseCase.g:971:4: (lv_name_1_0= RULE_ID )
            // InternalUseCase.g:972:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); 

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

            otherlv_2=(Token)match(input,40,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2());
            		
            // InternalUseCase.g:992:3: ( (lv_description_3_0= RULE_STRING ) )
            // InternalUseCase.g:993:4: (lv_description_3_0= RULE_STRING )
            {
            // InternalUseCase.g:993:4: (lv_description_3_0= RULE_STRING )
            // InternalUseCase.g:994:5: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

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

            otherlv_4=(Token)match(input,41,FOLLOW_33); 

            			newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getRightParenthesisKeyword_4());
            		
            // InternalUseCase.g:1014:3: (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==42) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUseCase.g:1015:4: otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_22); 

                    				newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_5_0());
                    			
                    // InternalUseCase.g:1019:4: ( (lv_importInfo_6_0= ruleQualifiedName ) )
                    // InternalUseCase.g:1020:5: (lv_importInfo_6_0= ruleQualifiedName )
                    {
                    // InternalUseCase.g:1020:5: (lv_importInfo_6_0= ruleQualifiedName )
                    // InternalUseCase.g:1021:6: lv_importInfo_6_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getTypeAccess().getImportInfoQualifiedNameParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_34);
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

                    otherlv_7=(Token)match(input,43,FOLLOW_2); 

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


    // $ANTLR start "entryRuleExceptionDecleration"
    // InternalUseCase.g:1047:1: entryRuleExceptionDecleration returns [EObject current=null] : iv_ruleExceptionDecleration= ruleExceptionDecleration EOF ;
    public final EObject entryRuleExceptionDecleration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExceptionDecleration = null;


        try {
            // InternalUseCase.g:1047:61: (iv_ruleExceptionDecleration= ruleExceptionDecleration EOF )
            // InternalUseCase.g:1048:2: iv_ruleExceptionDecleration= ruleExceptionDecleration EOF
            {
             newCompositeNode(grammarAccess.getExceptionDeclerationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExceptionDecleration=ruleExceptionDecleration();

            state._fsp--;

             current =iv_ruleExceptionDecleration; 
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
    // $ANTLR end "entryRuleExceptionDecleration"


    // $ANTLR start "ruleExceptionDecleration"
    // InternalUseCase.g:1054:1: ruleExceptionDecleration returns [EObject current=null] : (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) ;
    public final EObject ruleExceptionDecleration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_message_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_importInfo_6_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:1060:2: ( (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) )
            // InternalUseCase.g:1061:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            {
            // InternalUseCase.g:1061:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            // InternalUseCase.g:1062:3: otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getExceptionDeclerationAccess().getHyphenMinusKeyword_0());
            		
            // InternalUseCase.g:1066:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUseCase.g:1067:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUseCase.g:1067:4: (lv_name_1_0= RULE_ID )
            // InternalUseCase.g:1068:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExceptionDeclerationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExceptionDeclerationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,40,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getExceptionDeclerationAccess().getLeftParenthesisKeyword_2());
            		
            // InternalUseCase.g:1088:3: ( (lv_message_3_0= RULE_STRING ) )
            // InternalUseCase.g:1089:4: (lv_message_3_0= RULE_STRING )
            {
            // InternalUseCase.g:1089:4: (lv_message_3_0= RULE_STRING )
            // InternalUseCase.g:1090:5: lv_message_3_0= RULE_STRING
            {
            lv_message_3_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            					newLeafNode(lv_message_3_0, grammarAccess.getExceptionDeclerationAccess().getMessageSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExceptionDeclerationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"message",
            						lv_message_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_33); 

            			newLeafNode(otherlv_4, grammarAccess.getExceptionDeclerationAccess().getRightParenthesisKeyword_4());
            		
            // InternalUseCase.g:1110:3: (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==42) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUseCase.g:1111:4: otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_22); 

                    				newLeafNode(otherlv_5, grammarAccess.getExceptionDeclerationAccess().getLeftSquareBracketKeyword_5_0());
                    			
                    // InternalUseCase.g:1115:4: ( (lv_importInfo_6_0= ruleQualifiedName ) )
                    // InternalUseCase.g:1116:5: (lv_importInfo_6_0= ruleQualifiedName )
                    {
                    // InternalUseCase.g:1116:5: (lv_importInfo_6_0= ruleQualifiedName )
                    // InternalUseCase.g:1117:6: lv_importInfo_6_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getExceptionDeclerationAccess().getImportInfoQualifiedNameParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_importInfo_6_0=ruleQualifiedName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExceptionDeclerationRule());
                    						}
                    						set(
                    							current,
                    							"importInfo",
                    							lv_importInfo_6_0,
                    							"io.deniffel.dsl.useCase.UseCase.QualifiedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,43,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getExceptionDeclerationAccess().getRightSquareBracketKeyword_5_2());
                    			

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
    // $ANTLR end "ruleExceptionDecleration"


    // $ANTLR start "entryRuleInput"
    // InternalUseCase.g:1143:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalUseCase.g:1143:46: (iv_ruleInput= ruleInput EOF )
            // InternalUseCase.g:1144:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalUseCase.g:1150:1: ruleInput returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_example_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalUseCase.g:1156:2: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? ) )
            // InternalUseCase.g:1157:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? )
            {
            // InternalUseCase.g:1157:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? )
            // InternalUseCase.g:1158:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )?
            {
            // InternalUseCase.g:1158:3: ( (lv_many_0_0= 'many' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==44) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUseCase.g:1159:4: (lv_many_0_0= 'many' )
                    {
                    // InternalUseCase.g:1159:4: (lv_many_0_0= 'many' )
                    // InternalUseCase.g:1160:5: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,44,FOLLOW_35); 

                    					newLeafNode(lv_many_0_0, grammarAccess.getInputAccess().getManyManyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInputRule());
                    					}
                    					setWithLastConsumed(current, "many", true, "many");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getInputAccess().getHyphenMinusKeyword_1());
            		
            // InternalUseCase.g:1176:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalUseCase.g:1177:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalUseCase.g:1177:4: (lv_content_2_0= RULE_STRING )
            // InternalUseCase.g:1178:5: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

            					newLeafNode(lv_content_2_0, grammarAccess.getInputAccess().getContentSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalUseCase.g:1194:3: (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==45) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUseCase.g:1195:4: otherlv_3= 'as' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_22); 

                    				newLeafNode(otherlv_3, grammarAccess.getInputAccess().getAsKeyword_3_0());
                    			
                    // InternalUseCase.g:1199:4: ( (otherlv_4= RULE_ID ) )
                    // InternalUseCase.g:1200:5: (otherlv_4= RULE_ID )
                    {
                    // InternalUseCase.g:1200:5: (otherlv_4= RULE_ID )
                    // InternalUseCase.g:1201:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInputRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_37); 

                    						newLeafNode(otherlv_4, grammarAccess.getInputAccess().getTypeTypeCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUseCase.g:1213:3: (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUseCase.g:1214:4: otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')'
                    {
                    otherlv_5=(Token)match(input,40,FOLLOW_38); 

                    				newLeafNode(otherlv_5, grammarAccess.getInputAccess().getLeftParenthesisKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,46,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getInputAccess().getEGKeyword_4_1());
                    			
                    // InternalUseCase.g:1222:4: ( (lv_example_7_0= RULE_STRING ) )
                    // InternalUseCase.g:1223:5: (lv_example_7_0= RULE_STRING )
                    {
                    // InternalUseCase.g:1223:5: (lv_example_7_0= RULE_STRING )
                    // InternalUseCase.g:1224:6: lv_example_7_0= RULE_STRING
                    {
                    lv_example_7_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    						newLeafNode(lv_example_7_0, grammarAccess.getInputAccess().getExampleSTRINGTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInputRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"example",
                    							lv_example_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,41,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getInputAccess().getRightParenthesisKeyword_4_3());
                    			

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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // InternalUseCase.g:1249:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalUseCase.g:1249:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalUseCase.g:1250:2: iv_ruleOutput= ruleOutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput; 
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
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalUseCase.g:1256:1: ruleOutput returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_example_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalUseCase.g:1262:2: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? ) )
            // InternalUseCase.g:1263:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? )
            {
            // InternalUseCase.g:1263:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? )
            // InternalUseCase.g:1264:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )?
            {
            // InternalUseCase.g:1264:3: ( (lv_many_0_0= 'many' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==44) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUseCase.g:1265:4: (lv_many_0_0= 'many' )
                    {
                    // InternalUseCase.g:1265:4: (lv_many_0_0= 'many' )
                    // InternalUseCase.g:1266:5: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,44,FOLLOW_35); 

                    					newLeafNode(lv_many_0_0, grammarAccess.getOutputAccess().getManyManyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOutputRule());
                    					}
                    					setWithLastConsumed(current, "many", true, "many");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getHyphenMinusKeyword_1());
            		
            // InternalUseCase.g:1282:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalUseCase.g:1283:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalUseCase.g:1283:4: (lv_content_2_0= RULE_STRING )
            // InternalUseCase.g:1284:5: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

            					newLeafNode(lv_content_2_0, grammarAccess.getOutputAccess().getContentSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalUseCase.g:1300:3: (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUseCase.g:1301:4: otherlv_3= 'as' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_22); 

                    				newLeafNode(otherlv_3, grammarAccess.getOutputAccess().getAsKeyword_3_0());
                    			
                    // InternalUseCase.g:1305:4: ( (otherlv_4= RULE_ID ) )
                    // InternalUseCase.g:1306:5: (otherlv_4= RULE_ID )
                    {
                    // InternalUseCase.g:1306:5: (otherlv_4= RULE_ID )
                    // InternalUseCase.g:1307:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutputRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_37); 

                    						newLeafNode(otherlv_4, grammarAccess.getOutputAccess().getTypeTypeCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUseCase.g:1319:3: (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalUseCase.g:1320:4: otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')'
                    {
                    otherlv_5=(Token)match(input,40,FOLLOW_38); 

                    				newLeafNode(otherlv_5, grammarAccess.getOutputAccess().getLeftParenthesisKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,46,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getOutputAccess().getEGKeyword_4_1());
                    			
                    // InternalUseCase.g:1328:4: ( (lv_example_7_0= RULE_STRING ) )
                    // InternalUseCase.g:1329:5: (lv_example_7_0= RULE_STRING )
                    {
                    // InternalUseCase.g:1329:5: (lv_example_7_0= RULE_STRING )
                    // InternalUseCase.g:1330:6: lv_example_7_0= RULE_STRING
                    {
                    lv_example_7_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    						newLeafNode(lv_example_7_0, grammarAccess.getOutputAccess().getExampleSTRINGTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutputRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"example",
                    							lv_example_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,41,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getOutputAccess().getRightParenthesisKeyword_4_3());
                    			

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
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleAllowedUserGroups"
    // InternalUseCase.g:1355:1: entryRuleAllowedUserGroups returns [EObject current=null] : iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF ;
    public final EObject entryRuleAllowedUserGroups() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllowedUserGroups = null;


        try {
            // InternalUseCase.g:1355:58: (iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF )
            // InternalUseCase.g:1356:2: iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF
            {
             newCompositeNode(grammarAccess.getAllowedUserGroupsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllowedUserGroups=ruleAllowedUserGroups();

            state._fsp--;

             current =iv_ruleAllowedUserGroups; 
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
    // $ANTLR end "entryRuleAllowedUserGroups"


    // $ANTLR start "ruleAllowedUserGroups"
    // InternalUseCase.g:1362:1: ruleAllowedUserGroups returns [EObject current=null] : (otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )* ) ;
    public final EObject ruleAllowedUserGroups() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_groups_1_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:1368:2: ( (otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )* ) )
            // InternalUseCase.g:1369:2: (otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )* )
            {
            // InternalUseCase.g:1369:2: (otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )* )
            // InternalUseCase.g:1370:3: otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )*
            {
            otherlv_0=(Token)match(input,47,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getAllowedUserGroupsAccess().getAllowedUsergroupsKeyword_0());
            		
            // InternalUseCase.g:1374:3: ( (lv_groups_1_0= ruleAllowedUserGroup ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==16||LA29_0==44) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalUseCase.g:1375:4: (lv_groups_1_0= ruleAllowedUserGroup )
            	    {
            	    // InternalUseCase.g:1375:4: (lv_groups_1_0= ruleAllowedUserGroup )
            	    // InternalUseCase.g:1376:5: lv_groups_1_0= ruleAllowedUserGroup
            	    {

            	    					newCompositeNode(grammarAccess.getAllowedUserGroupsAccess().getGroupsAllowedUserGroupParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_groups_1_0=ruleAllowedUserGroup();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAllowedUserGroupsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"groups",
            	    						lv_groups_1_0,
            	    						"io.deniffel.dsl.useCase.UseCase.AllowedUserGroup");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // $ANTLR end "ruleAllowedUserGroups"


    // $ANTLR start "entryRuleAllowedUserGroup"
    // InternalUseCase.g:1397:1: entryRuleAllowedUserGroup returns [EObject current=null] : iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF ;
    public final EObject entryRuleAllowedUserGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllowedUserGroup = null;


        try {
            // InternalUseCase.g:1397:57: (iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF )
            // InternalUseCase.g:1398:2: iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF
            {
             newCompositeNode(grammarAccess.getAllowedUserGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllowedUserGroup=ruleAllowedUserGroup();

            state._fsp--;

             current =iv_ruleAllowedUserGroup; 
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
    // $ANTLR end "entryRuleAllowedUserGroup"


    // $ANTLR start "ruleAllowedUserGroup"
    // InternalUseCase.g:1404:1: ruleAllowedUserGroup returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final EObject ruleAllowedUserGroup() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalUseCase.g:1410:2: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) )
            // InternalUseCase.g:1411:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? )
            {
            // InternalUseCase.g:1411:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? )
            // InternalUseCase.g:1412:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            {
            // InternalUseCase.g:1412:3: ( (lv_many_0_0= 'many' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==44) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalUseCase.g:1413:4: (lv_many_0_0= 'many' )
                    {
                    // InternalUseCase.g:1413:4: (lv_many_0_0= 'many' )
                    // InternalUseCase.g:1414:5: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,44,FOLLOW_35); 

                    					newLeafNode(lv_many_0_0, grammarAccess.getAllowedUserGroupAccess().getManyManyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAllowedUserGroupRule());
                    					}
                    					setWithLastConsumed(current, "many", true, "many");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAllowedUserGroupAccess().getHyphenMinusKeyword_1());
            		
            // InternalUseCase.g:1430:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalUseCase.g:1431:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalUseCase.g:1431:4: (lv_name_2_0= RULE_STRING )
            // InternalUseCase.g:1432:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAllowedUserGroupAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAllowedUserGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalUseCase.g:1448:3: (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==45) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUseCase.g:1449:4: otherlv_3= 'as' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_22); 

                    				newLeafNode(otherlv_3, grammarAccess.getAllowedUserGroupAccess().getAsKeyword_3_0());
                    			
                    // InternalUseCase.g:1453:4: ( (otherlv_4= RULE_ID ) )
                    // InternalUseCase.g:1454:5: (otherlv_4= RULE_ID )
                    {
                    // InternalUseCase.g:1454:5: (otherlv_4= RULE_ID )
                    // InternalUseCase.g:1455:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAllowedUserGroupRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_4, grammarAccess.getAllowedUserGroupAccess().getTypeTypeCrossReference_3_1_0());
                    					

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
    // $ANTLR end "ruleAllowedUserGroup"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalUseCase.g:1471:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalUseCase.g:1471:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalUseCase.g:1472:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalUseCase.g:1478:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalUseCase.g:1484:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalUseCase.g:1485:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalUseCase.g:1485:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalUseCase.g:1486:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalUseCase.g:1493:3: (kw= '.' this_ID_2= RULE_ID )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==21) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalUseCase.g:1494:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,21,FOLLOW_22); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop32;
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


    // $ANTLR start "entryRuleQualifiedNumber"
    // InternalUseCase.g:1511:1: entryRuleQualifiedNumber returns [String current=null] : iv_ruleQualifiedNumber= ruleQualifiedNumber EOF ;
    public final String entryRuleQualifiedNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNumber = null;


        try {
            // InternalUseCase.g:1511:55: (iv_ruleQualifiedNumber= ruleQualifiedNumber EOF )
            // InternalUseCase.g:1512:2: iv_ruleQualifiedNumber= ruleQualifiedNumber EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNumber=ruleQualifiedNumber();

            state._fsp--;

             current =iv_ruleQualifiedNumber.getText(); 
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
    // $ANTLR end "entryRuleQualifiedNumber"


    // $ANTLR start "ruleQualifiedNumber"
    // InternalUseCase.g:1518:1: ruleQualifiedNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalUseCase.g:1524:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' ) )
            // InternalUseCase.g:1525:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' )
            {
            // InternalUseCase.g:1525:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' )
            // InternalUseCase.g:1526:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.'
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_40); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getQualifiedNumberAccess().getINTTerminalRuleCall_0());
            		
            // InternalUseCase.g:1533:3: (kw= '.' this_INT_2= RULE_INT )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==21) ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1==RULE_INT) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // InternalUseCase.g:1534:4: kw= '.' this_INT_2= RULE_INT
            	    {
            	    kw=(Token)match(input,21,FOLLOW_41); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNumberAccess().getFullStopKeyword_1_0());
            	    			
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_40); 

            	    				current.merge(this_INT_2);
            	    			

            	    				newLeafNode(this_INT_2, grammarAccess.getQualifiedNumberAccess().getINTTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            kw=(Token)match(input,21,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getQualifiedNumberAccess().getFullStopKeyword_2());
            		

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
    // $ANTLR end "ruleQualifiedNumber"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00008070FC02D000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00008070F802D000L});
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
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000010002L});
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
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000210000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000040L});

}