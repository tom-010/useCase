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
    // InternalUseCase.g:147:1: ruleUseCase returns [EObject current=null] : (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )? ( (lv_inputs_4_0= ruleInputs ) )? ( (lv_outputs_5_0= ruleOutputs ) )? ( (lv_steps_6_0= ruleSteps ) )? ( (lv_notes_7_0= ruleNotes ) )? otherlv_8= 'end' otherlv_9= 'of' otherlv_10= 'use-case' ) ;
    public final EObject ruleUseCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_descriptions_2_0 = null;

        EObject lv_allowedUserGroups_3_0 = null;

        EObject lv_inputs_4_0 = null;

        EObject lv_outputs_5_0 = null;

        EObject lv_steps_6_0 = null;

        EObject lv_notes_7_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:153:2: ( (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )? ( (lv_inputs_4_0= ruleInputs ) )? ( (lv_outputs_5_0= ruleOutputs ) )? ( (lv_steps_6_0= ruleSteps ) )? ( (lv_notes_7_0= ruleNotes ) )? otherlv_8= 'end' otherlv_9= 'of' otherlv_10= 'use-case' ) )
            // InternalUseCase.g:154:2: (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )? ( (lv_inputs_4_0= ruleInputs ) )? ( (lv_outputs_5_0= ruleOutputs ) )? ( (lv_steps_6_0= ruleSteps ) )? ( (lv_notes_7_0= ruleNotes ) )? otherlv_8= 'end' otherlv_9= 'of' otherlv_10= 'use-case' )
            {
            // InternalUseCase.g:154:2: (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )? ( (lv_inputs_4_0= ruleInputs ) )? ( (lv_outputs_5_0= ruleOutputs ) )? ( (lv_steps_6_0= ruleSteps ) )? ( (lv_notes_7_0= ruleNotes ) )? otherlv_8= 'end' otherlv_9= 'of' otherlv_10= 'use-case' )
            // InternalUseCase.g:155:3: otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )? ( (lv_inputs_4_0= ruleInputs ) )? ( (lv_outputs_5_0= ruleOutputs ) )? ( (lv_steps_6_0= ruleSteps ) )? ( (lv_notes_7_0= ruleNotes ) )? otherlv_8= 'end' otherlv_9= 'of' otherlv_10= 'use-case'
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

            if ( (LA2_0==23) ) {
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

            if ( (LA3_0==45) ) {
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

            if ( ((LA4_0>=26 && LA4_0<=28)) ) {
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

            if ( ((LA5_0>=33 && LA5_0<=35)) ) {
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

            // InternalUseCase.g:253:3: ( (lv_steps_6_0= ruleSteps ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUseCase.g:254:4: (lv_steps_6_0= ruleSteps )
                    {
                    // InternalUseCase.g:254:4: (lv_steps_6_0= ruleSteps )
                    // InternalUseCase.g:255:5: lv_steps_6_0= ruleSteps
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getStepsStepsParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_steps_6_0=ruleSteps();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    					}
                    					add(
                    						current,
                    						"steps",
                    						lv_steps_6_0,
                    						"io.deniffel.dsl.useCase.UseCase.Steps");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:272:3: ( (lv_notes_7_0= ruleNotes ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=24 && LA7_0<=25)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUseCase.g:273:4: (lv_notes_7_0= ruleNotes )
                    {
                    // InternalUseCase.g:273:4: (lv_notes_7_0= ruleNotes )
                    // InternalUseCase.g:274:5: lv_notes_7_0= ruleNotes
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getNotesNotesParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_notes_7_0=ruleNotes();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    					}
                    					add(
                    						current,
                    						"notes",
                    						lv_notes_7_0,
                    						"io.deniffel.dsl.useCase.UseCase.Notes");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getUseCaseAccess().getEndKeyword_8());
            		
            otherlv_9=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getUseCaseAccess().getOfKeyword_9());
            		
            otherlv_10=(Token)match(input,11,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getUseCaseAccess().getUseCaseKeyword_10());
            		

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


    // $ANTLR start "entryRuleSteps"
    // InternalUseCase.g:307:1: entryRuleSteps returns [EObject current=null] : iv_ruleSteps= ruleSteps EOF ;
    public final EObject entryRuleSteps() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSteps = null;


        try {
            // InternalUseCase.g:307:46: (iv_ruleSteps= ruleSteps EOF )
            // InternalUseCase.g:308:2: iv_ruleSteps= ruleSteps EOF
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
    // InternalUseCase.g:314:1: ruleSteps returns [EObject current=null] : (otherlv_0= 'steps:' ( (lv_steps_1_0= ruleStep ) )* ) ;
    public final EObject ruleSteps() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_steps_1_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:320:2: ( (otherlv_0= 'steps:' ( (lv_steps_1_0= ruleStep ) )* ) )
            // InternalUseCase.g:321:2: (otherlv_0= 'steps:' ( (lv_steps_1_0= ruleStep ) )* )
            {
            // InternalUseCase.g:321:2: (otherlv_0= 'steps:' ( (lv_steps_1_0= ruleStep ) )* )
            // InternalUseCase.g:322:3: otherlv_0= 'steps:' ( (lv_steps_1_0= ruleStep ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getStepsAccess().getStepsKeyword_0());
            		
            // InternalUseCase.g:326:3: ( (lv_steps_1_0= ruleStep ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_INT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalUseCase.g:327:4: (lv_steps_1_0= ruleStep )
            	    {
            	    // InternalUseCase.g:327:4: (lv_steps_1_0= ruleStep )
            	    // InternalUseCase.g:328:5: lv_steps_1_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getStepsAccess().getStepsStepParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_15);
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
            	    break loop8;
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
    // InternalUseCase.g:349:1: entryRuleUsedTypes returns [EObject current=null] : iv_ruleUsedTypes= ruleUsedTypes EOF ;
    public final EObject entryRuleUsedTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsedTypes = null;


        try {
            // InternalUseCase.g:349:50: (iv_ruleUsedTypes= ruleUsedTypes EOF )
            // InternalUseCase.g:350:2: iv_ruleUsedTypes= ruleUsedTypes EOF
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
    // InternalUseCase.g:356:1: ruleUsedTypes returns [EObject current=null] : (otherlv_0= 'used' otherlv_1= 'types:' ( (lv_types_2_0= ruleType ) )* ) ;
    public final EObject ruleUsedTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_types_2_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:362:2: ( (otherlv_0= 'used' otherlv_1= 'types:' ( (lv_types_2_0= ruleType ) )* ) )
            // InternalUseCase.g:363:2: (otherlv_0= 'used' otherlv_1= 'types:' ( (lv_types_2_0= ruleType ) )* )
            {
            // InternalUseCase.g:363:2: (otherlv_0= 'used' otherlv_1= 'types:' ( (lv_types_2_0= ruleType ) )* )
            // InternalUseCase.g:364:3: otherlv_0= 'used' otherlv_1= 'types:' ( (lv_types_2_0= ruleType ) )*
            {
            otherlv_0=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getUsedTypesAccess().getUsedKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getUsedTypesAccess().getTypesKeyword_1());
            		
            // InternalUseCase.g:372:3: ( (lv_types_2_0= ruleType ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==37) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalUseCase.g:373:4: (lv_types_2_0= ruleType )
            	    {
            	    // InternalUseCase.g:373:4: (lv_types_2_0= ruleType )
            	    // InternalUseCase.g:374:5: lv_types_2_0= ruleType
            	    {

            	    					newCompositeNode(grammarAccess.getUsedTypesAccess().getTypesTypeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_17);
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
    // $ANTLR end "ruleUsedTypes"


    // $ANTLR start "entryRuleUsedExceptions"
    // InternalUseCase.g:395:1: entryRuleUsedExceptions returns [EObject current=null] : iv_ruleUsedExceptions= ruleUsedExceptions EOF ;
    public final EObject entryRuleUsedExceptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsedExceptions = null;


        try {
            // InternalUseCase.g:395:55: (iv_ruleUsedExceptions= ruleUsedExceptions EOF )
            // InternalUseCase.g:396:2: iv_ruleUsedExceptions= ruleUsedExceptions EOF
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
    // InternalUseCase.g:402:1: ruleUsedExceptions returns [EObject current=null] : (otherlv_0= 'used' otherlv_1= 'errors:' ( (lv_exceptions_2_0= ruleExceptionDecleration ) )* ) ;
    public final EObject ruleUsedExceptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_exceptions_2_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:408:2: ( (otherlv_0= 'used' otherlv_1= 'errors:' ( (lv_exceptions_2_0= ruleExceptionDecleration ) )* ) )
            // InternalUseCase.g:409:2: (otherlv_0= 'used' otherlv_1= 'errors:' ( (lv_exceptions_2_0= ruleExceptionDecleration ) )* )
            {
            // InternalUseCase.g:409:2: (otherlv_0= 'used' otherlv_1= 'errors:' ( (lv_exceptions_2_0= ruleExceptionDecleration ) )* )
            // InternalUseCase.g:410:3: otherlv_0= 'used' otherlv_1= 'errors:' ( (lv_exceptions_2_0= ruleExceptionDecleration ) )*
            {
            otherlv_0=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getUsedExceptionsAccess().getUsedKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getUsedExceptionsAccess().getErrorsKeyword_1());
            		
            // InternalUseCase.g:418:3: ( (lv_exceptions_2_0= ruleExceptionDecleration ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==37) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalUseCase.g:419:4: (lv_exceptions_2_0= ruleExceptionDecleration )
            	    {
            	    // InternalUseCase.g:419:4: (lv_exceptions_2_0= ruleExceptionDecleration )
            	    // InternalUseCase.g:420:5: lv_exceptions_2_0= ruleExceptionDecleration
            	    {

            	    					newCompositeNode(grammarAccess.getUsedExceptionsAccess().getExceptionsExceptionDeclerationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_17);
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
    // $ANTLR end "ruleUsedExceptions"


    // $ANTLR start "entryRuleStep"
    // InternalUseCase.g:441:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalUseCase.g:441:45: (iv_ruleStep= ruleStep EOF )
            // InternalUseCase.g:442:2: iv_ruleStep= ruleStep EOF
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
    // InternalUseCase.g:448:1: ruleStep returns [EObject current=null] : ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token lv_action_1_0=null;
        AntlrDatatypeRuleToken lv_number_0_0 = null;

        EObject lv_error_2_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:454:2: ( ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? ) )
            // InternalUseCase.g:455:2: ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? )
            {
            // InternalUseCase.g:455:2: ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? )
            // InternalUseCase.g:456:3: ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )?
            {
            // InternalUseCase.g:456:3: ( (lv_number_0_0= ruleQualifiedNumber ) )
            // InternalUseCase.g:457:4: (lv_number_0_0= ruleQualifiedNumber )
            {
            // InternalUseCase.g:457:4: (lv_number_0_0= ruleQualifiedNumber )
            // InternalUseCase.g:458:5: lv_number_0_0= ruleQualifiedNumber
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

            // InternalUseCase.g:475:3: ( (lv_action_1_0= RULE_STRING ) )
            // InternalUseCase.g:476:4: (lv_action_1_0= RULE_STRING )
            {
            // InternalUseCase.g:476:4: (lv_action_1_0= RULE_STRING )
            // InternalUseCase.g:477:5: lv_action_1_0= RULE_STRING
            {
            lv_action_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

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

            // InternalUseCase.g:493:3: ( (lv_error_2_0= ruleRaiseError ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUseCase.g:494:4: (lv_error_2_0= ruleRaiseError )
                    {
                    // InternalUseCase.g:494:4: (lv_error_2_0= ruleRaiseError )
                    // InternalUseCase.g:495:5: lv_error_2_0= ruleRaiseError
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
    // InternalUseCase.g:516:1: entryRuleRaiseError returns [EObject current=null] : iv_ruleRaiseError= ruleRaiseError EOF ;
    public final EObject entryRuleRaiseError() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRaiseError = null;


        try {
            // InternalUseCase.g:516:51: (iv_ruleRaiseError= ruleRaiseError EOF )
            // InternalUseCase.g:517:2: iv_ruleRaiseError= ruleRaiseError EOF
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
    // InternalUseCase.g:523:1: ruleRaiseError returns [EObject current=null] : (otherlv_0= '.' (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) ) ( (lv_exception_5_0= ruleException ) ) ) ;
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
            // InternalUseCase.g:529:2: ( (otherlv_0= '.' (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) ) ( (lv_exception_5_0= ruleException ) ) ) )
            // InternalUseCase.g:530:2: (otherlv_0= '.' (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) ) ( (lv_exception_5_0= ruleException ) ) )
            {
            // InternalUseCase.g:530:2: (otherlv_0= '.' (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) ) ( (lv_exception_5_0= ruleException ) ) )
            // InternalUseCase.g:531:3: otherlv_0= '.' (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) ) ( (lv_exception_5_0= ruleException ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getRaiseErrorAccess().getFullStopKeyword_0());
            		
            // InternalUseCase.g:535:3: (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) )
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
                    // InternalUseCase.g:536:4: otherlv_1= 'Raise'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_21); 

                    				newLeafNode(otherlv_1, grammarAccess.getRaiseErrorAccess().getRaiseKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:541:4: (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' )
                    {
                    // InternalUseCase.g:541:4: (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' )
                    // InternalUseCase.g:542:5: otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_22); 

                    					newLeafNode(otherlv_2, grammarAccess.getRaiseErrorAccess().getOnKeyword_1_1_0());
                    				
                    otherlv_3=(Token)match(input,21,FOLLOW_23); 

                    					newLeafNode(otherlv_3, grammarAccess.getRaiseErrorAccess().getErrorKeyword_1_1_1());
                    				
                    otherlv_4=(Token)match(input,22,FOLLOW_21); 

                    					newLeafNode(otherlv_4, grammarAccess.getRaiseErrorAccess().getRaiseKeyword_1_1_2());
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:556:3: ( (lv_exception_5_0= ruleException ) )
            // InternalUseCase.g:557:4: (lv_exception_5_0= ruleException )
            {
            // InternalUseCase.g:557:4: (lv_exception_5_0= ruleException )
            // InternalUseCase.g:558:5: lv_exception_5_0= ruleException
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
    // InternalUseCase.g:579:1: entryRuleException returns [EObject current=null] : iv_ruleException= ruleException EOF ;
    public final EObject entryRuleException() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleException = null;


        try {
            // InternalUseCase.g:579:50: (iv_ruleException= ruleException EOF )
            // InternalUseCase.g:580:2: iv_ruleException= ruleException EOF
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
    // InternalUseCase.g:586:1: ruleException returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleException() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:592:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalUseCase.g:593:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalUseCase.g:593:2: ( (otherlv_0= RULE_ID ) )
            // InternalUseCase.g:594:3: (otherlv_0= RULE_ID )
            {
            // InternalUseCase.g:594:3: (otherlv_0= RULE_ID )
            // InternalUseCase.g:595:4: otherlv_0= RULE_ID
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
    // InternalUseCase.g:609:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalUseCase.g:609:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalUseCase.g:610:2: iv_ruleDescription= ruleDescription EOF
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
    // InternalUseCase.g:616:1: ruleDescription returns [EObject current=null] : (otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:622:2: ( (otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalUseCase.g:623:2: (otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalUseCase.g:623:2: (otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalUseCase.g:624:3: otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getDescriptionKeyword_0());
            		
            // InternalUseCase.g:628:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalUseCase.g:629:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalUseCase.g:629:4: (lv_name_1_0= RULE_STRING )
            // InternalUseCase.g:630:5: lv_name_1_0= RULE_STRING
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
    // InternalUseCase.g:650:1: entryRuleNotes returns [EObject current=null] : iv_ruleNotes= ruleNotes EOF ;
    public final EObject entryRuleNotes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotes = null;


        try {
            // InternalUseCase.g:650:46: (iv_ruleNotes= ruleNotes EOF )
            // InternalUseCase.g:651:2: iv_ruleNotes= ruleNotes EOF
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
    // InternalUseCase.g:657:1: ruleNotes returns [EObject current=null] : ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) ( (lv_content_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleNotes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:663:2: ( ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) ( (lv_content_2_0= RULE_STRING ) ) ) )
            // InternalUseCase.g:664:2: ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) ( (lv_content_2_0= RULE_STRING ) ) )
            {
            // InternalUseCase.g:664:2: ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) ( (lv_content_2_0= RULE_STRING ) ) )
            // InternalUseCase.g:665:3: (otherlv_0= 'notes:' | otherlv_1= 'note:' ) ( (lv_content_2_0= RULE_STRING ) )
            {
            // InternalUseCase.g:665:3: (otherlv_0= 'notes:' | otherlv_1= 'note:' )
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
                    // InternalUseCase.g:666:4: otherlv_0= 'notes:'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getNotesAccess().getNotesKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:671:4: otherlv_1= 'note:'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getNotesAccess().getNoteKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:676:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalUseCase.g:677:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalUseCase.g:677:4: (lv_content_2_0= RULE_STRING )
            // InternalUseCase.g:678:5: lv_content_2_0= RULE_STRING
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
    // InternalUseCase.g:698:1: entryRuleInputs returns [EObject current=null] : iv_ruleInputs= ruleInputs EOF ;
    public final EObject entryRuleInputs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputs = null;


        try {
            // InternalUseCase.g:698:47: (iv_ruleInputs= ruleInputs EOF )
            // InternalUseCase.g:699:2: iv_ruleInputs= ruleInputs EOF
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
    // InternalUseCase.g:705:1: ruleInputs returns [EObject current=null] : ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) ( (lv_inputs_7_0= ruleInput ) )* ) ;
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
            // InternalUseCase.g:711:2: ( ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) ( (lv_inputs_7_0= ruleInput ) )* ) )
            // InternalUseCase.g:712:2: ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) ( (lv_inputs_7_0= ruleInput ) )* )
            {
            // InternalUseCase.g:712:2: ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) ( (lv_inputs_7_0= ruleInput ) )* )
            // InternalUseCase.g:713:3: (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) ( (lv_inputs_7_0= ruleInput ) )*
            {
            // InternalUseCase.g:713:3: (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) )
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
                    // InternalUseCase.g:714:4: otherlv_0= 'requires:'
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_24); 

                    				newLeafNode(otherlv_0, grammarAccess.getInputsAccess().getRequiresKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:719:4: otherlv_1= 'require:'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_24); 

                    				newLeafNode(otherlv_1, grammarAccess.getInputsAccess().getRequireKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalUseCase.g:724:4: (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' )
                    {
                    // InternalUseCase.g:724:4: (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' )
                    // InternalUseCase.g:725:5: otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_25); 

                    					newLeafNode(otherlv_2, grammarAccess.getInputsAccess().getRequiresKeyword_0_2_0());
                    				
                    otherlv_3=(Token)match(input,29,FOLLOW_26); 

                    					newLeafNode(otherlv_3, grammarAccess.getInputsAccess().getTheKeyword_0_2_1());
                    				
                    otherlv_4=(Token)match(input,30,FOLLOW_27); 

                    					newLeafNode(otherlv_4, grammarAccess.getInputsAccess().getFollowingKeyword_0_2_2());
                    				
                    otherlv_5=(Token)match(input,31,FOLLOW_28); 

                    					newLeafNode(otherlv_5, grammarAccess.getInputsAccess().getInputKeyword_0_2_3());
                    				
                    otherlv_6=(Token)match(input,32,FOLLOW_24); 

                    					newLeafNode(otherlv_6, grammarAccess.getInputsAccess().getColonKeyword_0_2_4());
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:747:3: ( (lv_inputs_7_0= ruleInput ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==37||LA15_0==42) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalUseCase.g:748:4: (lv_inputs_7_0= ruleInput )
            	    {
            	    // InternalUseCase.g:748:4: (lv_inputs_7_0= ruleInput )
            	    // InternalUseCase.g:749:5: lv_inputs_7_0= ruleInput
            	    {

            	    					newCompositeNode(grammarAccess.getInputsAccess().getInputsInputParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_24);
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
            	    break loop15;
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
    // InternalUseCase.g:770:1: entryRuleOutputs returns [EObject current=null] : iv_ruleOutputs= ruleOutputs EOF ;
    public final EObject entryRuleOutputs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputs = null;


        try {
            // InternalUseCase.g:770:48: (iv_ruleOutputs= ruleOutputs EOF )
            // InternalUseCase.g:771:2: iv_ruleOutputs= ruleOutputs EOF
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
    // InternalUseCase.g:777:1: ruleOutputs returns [EObject current=null] : ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) ( (lv_outputs_7_0= ruleOutput ) )* ) ;
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
            // InternalUseCase.g:783:2: ( ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) ( (lv_outputs_7_0= ruleOutput ) )* ) )
            // InternalUseCase.g:784:2: ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) ( (lv_outputs_7_0= ruleOutput ) )* )
            {
            // InternalUseCase.g:784:2: ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) ( (lv_outputs_7_0= ruleOutput ) )* )
            // InternalUseCase.g:785:3: (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) ( (lv_outputs_7_0= ruleOutput ) )*
            {
            // InternalUseCase.g:785:3: (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) )
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
                    // InternalUseCase.g:786:4: otherlv_0= 'produces:'
                    {
                    otherlv_0=(Token)match(input,33,FOLLOW_24); 

                    				newLeafNode(otherlv_0, grammarAccess.getOutputsAccess().getProducesKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:791:4: otherlv_1= 'produce:'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_24); 

                    				newLeafNode(otherlv_1, grammarAccess.getOutputsAccess().getProduceKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalUseCase.g:796:4: (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' )
                    {
                    // InternalUseCase.g:796:4: (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' )
                    // InternalUseCase.g:797:5: otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':'
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_25); 

                    					newLeafNode(otherlv_2, grammarAccess.getOutputsAccess().getProducesKeyword_0_2_0());
                    				
                    otherlv_3=(Token)match(input,29,FOLLOW_26); 

                    					newLeafNode(otherlv_3, grammarAccess.getOutputsAccess().getTheKeyword_0_2_1());
                    				
                    otherlv_4=(Token)match(input,30,FOLLOW_29); 

                    					newLeafNode(otherlv_4, grammarAccess.getOutputsAccess().getFollowingKeyword_0_2_2());
                    				
                    otherlv_5=(Token)match(input,36,FOLLOW_28); 

                    					newLeafNode(otherlv_5, grammarAccess.getOutputsAccess().getOutputKeyword_0_2_3());
                    				
                    otherlv_6=(Token)match(input,32,FOLLOW_24); 

                    					newLeafNode(otherlv_6, grammarAccess.getOutputsAccess().getColonKeyword_0_2_4());
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:819:3: ( (lv_outputs_7_0= ruleOutput ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==37||LA17_0==42) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalUseCase.g:820:4: (lv_outputs_7_0= ruleOutput )
            	    {
            	    // InternalUseCase.g:820:4: (lv_outputs_7_0= ruleOutput )
            	    // InternalUseCase.g:821:5: lv_outputs_7_0= ruleOutput
            	    {

            	    					newCompositeNode(grammarAccess.getOutputsAccess().getOutputsOutputParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_24);
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
            	    break loop17;
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
    // InternalUseCase.g:842:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalUseCase.g:842:45: (iv_ruleType= ruleType EOF )
            // InternalUseCase.g:843:2: iv_ruleType= ruleType EOF
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
    // InternalUseCase.g:849:1: ruleType returns [EObject current=null] : (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) ;
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
            // InternalUseCase.g:855:2: ( (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) )
            // InternalUseCase.g:856:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            {
            // InternalUseCase.g:856:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            // InternalUseCase.g:857:3: otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getHyphenMinusKeyword_0());
            		
            // InternalUseCase.g:861:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUseCase.g:862:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUseCase.g:862:4: (lv_name_1_0= RULE_ID )
            // InternalUseCase.g:863:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_30); 

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

            otherlv_2=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2());
            		
            // InternalUseCase.g:883:3: ( (lv_description_3_0= RULE_STRING ) )
            // InternalUseCase.g:884:4: (lv_description_3_0= RULE_STRING )
            {
            // InternalUseCase.g:884:4: (lv_description_3_0= RULE_STRING )
            // InternalUseCase.g:885:5: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

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

            otherlv_4=(Token)match(input,39,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getRightParenthesisKeyword_4());
            		
            // InternalUseCase.g:905:3: (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==40) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUseCase.g:906:4: otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,40,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_5_0());
                    			
                    // InternalUseCase.g:910:4: ( (lv_importInfo_6_0= ruleQualifiedName ) )
                    // InternalUseCase.g:911:5: (lv_importInfo_6_0= ruleQualifiedName )
                    {
                    // InternalUseCase.g:911:5: (lv_importInfo_6_0= ruleQualifiedName )
                    // InternalUseCase.g:912:6: lv_importInfo_6_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getTypeAccess().getImportInfoQualifiedNameParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_33);
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

                    otherlv_7=(Token)match(input,41,FOLLOW_2); 

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
    // InternalUseCase.g:938:1: entryRuleExceptionDecleration returns [EObject current=null] : iv_ruleExceptionDecleration= ruleExceptionDecleration EOF ;
    public final EObject entryRuleExceptionDecleration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExceptionDecleration = null;


        try {
            // InternalUseCase.g:938:61: (iv_ruleExceptionDecleration= ruleExceptionDecleration EOF )
            // InternalUseCase.g:939:2: iv_ruleExceptionDecleration= ruleExceptionDecleration EOF
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
    // InternalUseCase.g:945:1: ruleExceptionDecleration returns [EObject current=null] : (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) ;
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
            // InternalUseCase.g:951:2: ( (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) )
            // InternalUseCase.g:952:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            {
            // InternalUseCase.g:952:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            // InternalUseCase.g:953:3: otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getExceptionDeclerationAccess().getHyphenMinusKeyword_0());
            		
            // InternalUseCase.g:957:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUseCase.g:958:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUseCase.g:958:4: (lv_name_1_0= RULE_ID )
            // InternalUseCase.g:959:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_30); 

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

            otherlv_2=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getExceptionDeclerationAccess().getLeftParenthesisKeyword_2());
            		
            // InternalUseCase.g:979:3: ( (lv_message_3_0= RULE_STRING ) )
            // InternalUseCase.g:980:4: (lv_message_3_0= RULE_STRING )
            {
            // InternalUseCase.g:980:4: (lv_message_3_0= RULE_STRING )
            // InternalUseCase.g:981:5: lv_message_3_0= RULE_STRING
            {
            lv_message_3_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

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

            otherlv_4=(Token)match(input,39,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getExceptionDeclerationAccess().getRightParenthesisKeyword_4());
            		
            // InternalUseCase.g:1001:3: (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==40) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUseCase.g:1002:4: otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,40,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getExceptionDeclerationAccess().getLeftSquareBracketKeyword_5_0());
                    			
                    // InternalUseCase.g:1006:4: ( (lv_importInfo_6_0= ruleQualifiedName ) )
                    // InternalUseCase.g:1007:5: (lv_importInfo_6_0= ruleQualifiedName )
                    {
                    // InternalUseCase.g:1007:5: (lv_importInfo_6_0= ruleQualifiedName )
                    // InternalUseCase.g:1008:6: lv_importInfo_6_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getExceptionDeclerationAccess().getImportInfoQualifiedNameParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_33);
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

                    otherlv_7=(Token)match(input,41,FOLLOW_2); 

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
    // InternalUseCase.g:1034:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalUseCase.g:1034:46: (iv_ruleInput= ruleInput EOF )
            // InternalUseCase.g:1035:2: iv_ruleInput= ruleInput EOF
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
    // InternalUseCase.g:1041:1: ruleInput returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? ) ;
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
            // InternalUseCase.g:1047:2: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? ) )
            // InternalUseCase.g:1048:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? )
            {
            // InternalUseCase.g:1048:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? )
            // InternalUseCase.g:1049:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )?
            {
            // InternalUseCase.g:1049:3: ( (lv_many_0_0= 'many' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==42) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUseCase.g:1050:4: (lv_many_0_0= 'many' )
                    {
                    // InternalUseCase.g:1050:4: (lv_many_0_0= 'many' )
                    // InternalUseCase.g:1051:5: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,42,FOLLOW_34); 

                    					newLeafNode(lv_many_0_0, grammarAccess.getInputAccess().getManyManyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInputRule());
                    					}
                    					setWithLastConsumed(current, "many", true, "many");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getInputAccess().getHyphenMinusKeyword_1());
            		
            // InternalUseCase.g:1067:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalUseCase.g:1068:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalUseCase.g:1068:4: (lv_content_2_0= RULE_STRING )
            // InternalUseCase.g:1069:5: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

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

            // InternalUseCase.g:1085:3: (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==43) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUseCase.g:1086:4: otherlv_3= 'as' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getInputAccess().getAsKeyword_3_0());
                    			
                    // InternalUseCase.g:1090:4: ( (otherlv_4= RULE_ID ) )
                    // InternalUseCase.g:1091:5: (otherlv_4= RULE_ID )
                    {
                    // InternalUseCase.g:1091:5: (otherlv_4= RULE_ID )
                    // InternalUseCase.g:1092:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInputRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_36); 

                    						newLeafNode(otherlv_4, grammarAccess.getInputAccess().getTypeTypeCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUseCase.g:1104:3: (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUseCase.g:1105:4: otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')'
                    {
                    otherlv_5=(Token)match(input,38,FOLLOW_37); 

                    				newLeafNode(otherlv_5, grammarAccess.getInputAccess().getLeftParenthesisKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,44,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getInputAccess().getEGKeyword_4_1());
                    			
                    // InternalUseCase.g:1113:4: ( (lv_example_7_0= RULE_STRING ) )
                    // InternalUseCase.g:1114:5: (lv_example_7_0= RULE_STRING )
                    {
                    // InternalUseCase.g:1114:5: (lv_example_7_0= RULE_STRING )
                    // InternalUseCase.g:1115:6: lv_example_7_0= RULE_STRING
                    {
                    lv_example_7_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

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

                    otherlv_8=(Token)match(input,39,FOLLOW_2); 

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
    // InternalUseCase.g:1140:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalUseCase.g:1140:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalUseCase.g:1141:2: iv_ruleOutput= ruleOutput EOF
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
    // InternalUseCase.g:1147:1: ruleOutput returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? ) ;
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
            // InternalUseCase.g:1153:2: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? ) )
            // InternalUseCase.g:1154:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? )
            {
            // InternalUseCase.g:1154:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? )
            // InternalUseCase.g:1155:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )?
            {
            // InternalUseCase.g:1155:3: ( (lv_many_0_0= 'many' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUseCase.g:1156:4: (lv_many_0_0= 'many' )
                    {
                    // InternalUseCase.g:1156:4: (lv_many_0_0= 'many' )
                    // InternalUseCase.g:1157:5: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,42,FOLLOW_34); 

                    					newLeafNode(lv_many_0_0, grammarAccess.getOutputAccess().getManyManyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOutputRule());
                    					}
                    					setWithLastConsumed(current, "many", true, "many");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getHyphenMinusKeyword_1());
            		
            // InternalUseCase.g:1173:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalUseCase.g:1174:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalUseCase.g:1174:4: (lv_content_2_0= RULE_STRING )
            // InternalUseCase.g:1175:5: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

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

            // InternalUseCase.g:1191:3: (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==43) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUseCase.g:1192:4: otherlv_3= 'as' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getOutputAccess().getAsKeyword_3_0());
                    			
                    // InternalUseCase.g:1196:4: ( (otherlv_4= RULE_ID ) )
                    // InternalUseCase.g:1197:5: (otherlv_4= RULE_ID )
                    {
                    // InternalUseCase.g:1197:5: (otherlv_4= RULE_ID )
                    // InternalUseCase.g:1198:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutputRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_36); 

                    						newLeafNode(otherlv_4, grammarAccess.getOutputAccess().getTypeTypeCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUseCase.g:1210:3: (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUseCase.g:1211:4: otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')'
                    {
                    otherlv_5=(Token)match(input,38,FOLLOW_37); 

                    				newLeafNode(otherlv_5, grammarAccess.getOutputAccess().getLeftParenthesisKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,44,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getOutputAccess().getEGKeyword_4_1());
                    			
                    // InternalUseCase.g:1219:4: ( (lv_example_7_0= RULE_STRING ) )
                    // InternalUseCase.g:1220:5: (lv_example_7_0= RULE_STRING )
                    {
                    // InternalUseCase.g:1220:5: (lv_example_7_0= RULE_STRING )
                    // InternalUseCase.g:1221:6: lv_example_7_0= RULE_STRING
                    {
                    lv_example_7_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

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

                    otherlv_8=(Token)match(input,39,FOLLOW_2); 

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
    // InternalUseCase.g:1246:1: entryRuleAllowedUserGroups returns [EObject current=null] : iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF ;
    public final EObject entryRuleAllowedUserGroups() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllowedUserGroups = null;


        try {
            // InternalUseCase.g:1246:58: (iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF )
            // InternalUseCase.g:1247:2: iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF
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
    // InternalUseCase.g:1253:1: ruleAllowedUserGroups returns [EObject current=null] : (otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )* ) ;
    public final EObject ruleAllowedUserGroups() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_groups_1_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:1259:2: ( (otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )* ) )
            // InternalUseCase.g:1260:2: (otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )* )
            {
            // InternalUseCase.g:1260:2: (otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )* )
            // InternalUseCase.g:1261:3: otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )*
            {
            otherlv_0=(Token)match(input,45,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getAllowedUserGroupsAccess().getAllowedUsergroupsKeyword_0());
            		
            // InternalUseCase.g:1265:3: ( (lv_groups_1_0= ruleAllowedUserGroup ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==37||LA26_0==42) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalUseCase.g:1266:4: (lv_groups_1_0= ruleAllowedUserGroup )
            	    {
            	    // InternalUseCase.g:1266:4: (lv_groups_1_0= ruleAllowedUserGroup )
            	    // InternalUseCase.g:1267:5: lv_groups_1_0= ruleAllowedUserGroup
            	    {

            	    					newCompositeNode(grammarAccess.getAllowedUserGroupsAccess().getGroupsAllowedUserGroupParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_24);
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
            	    break loop26;
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
    // InternalUseCase.g:1288:1: entryRuleAllowedUserGroup returns [EObject current=null] : iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF ;
    public final EObject entryRuleAllowedUserGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllowedUserGroup = null;


        try {
            // InternalUseCase.g:1288:57: (iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF )
            // InternalUseCase.g:1289:2: iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF
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
    // InternalUseCase.g:1295:1: ruleAllowedUserGroup returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final EObject ruleAllowedUserGroup() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalUseCase.g:1301:2: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) )
            // InternalUseCase.g:1302:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? )
            {
            // InternalUseCase.g:1302:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? )
            // InternalUseCase.g:1303:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            {
            // InternalUseCase.g:1303:3: ( (lv_many_0_0= 'many' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUseCase.g:1304:4: (lv_many_0_0= 'many' )
                    {
                    // InternalUseCase.g:1304:4: (lv_many_0_0= 'many' )
                    // InternalUseCase.g:1305:5: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,42,FOLLOW_34); 

                    					newLeafNode(lv_many_0_0, grammarAccess.getAllowedUserGroupAccess().getManyManyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAllowedUserGroupRule());
                    					}
                    					setWithLastConsumed(current, "many", true, "many");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAllowedUserGroupAccess().getHyphenMinusKeyword_1());
            		
            // InternalUseCase.g:1321:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalUseCase.g:1322:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalUseCase.g:1322:4: (lv_name_2_0= RULE_STRING )
            // InternalUseCase.g:1323:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

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

            // InternalUseCase.g:1339:3: (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==43) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalUseCase.g:1340:4: otherlv_3= 'as' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getAllowedUserGroupAccess().getAsKeyword_3_0());
                    			
                    // InternalUseCase.g:1344:4: ( (otherlv_4= RULE_ID ) )
                    // InternalUseCase.g:1345:5: (otherlv_4= RULE_ID )
                    {
                    // InternalUseCase.g:1345:5: (otherlv_4= RULE_ID )
                    // InternalUseCase.g:1346:6: otherlv_4= RULE_ID
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
    // InternalUseCase.g:1362:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalUseCase.g:1362:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalUseCase.g:1363:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalUseCase.g:1369:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalUseCase.g:1375:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalUseCase.g:1376:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalUseCase.g:1376:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalUseCase.g:1377:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalUseCase.g:1384:3: (kw= '.' this_ID_2= RULE_ID )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==18) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalUseCase.g:1385:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,18,FOLLOW_21); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNumber"
    // InternalUseCase.g:1402:1: entryRuleQualifiedNumber returns [String current=null] : iv_ruleQualifiedNumber= ruleQualifiedNumber EOF ;
    public final String entryRuleQualifiedNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNumber = null;


        try {
            // InternalUseCase.g:1402:55: (iv_ruleQualifiedNumber= ruleQualifiedNumber EOF )
            // InternalUseCase.g:1403:2: iv_ruleQualifiedNumber= ruleQualifiedNumber EOF
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
    // InternalUseCase.g:1409:1: ruleQualifiedNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalUseCase.g:1415:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' ) )
            // InternalUseCase.g:1416:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' )
            {
            // InternalUseCase.g:1416:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' )
            // InternalUseCase.g:1417:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.'
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_39); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getQualifiedNumberAccess().getINTTerminalRuleCall_0());
            		
            // InternalUseCase.g:1424:3: (kw= '.' this_INT_2= RULE_INT )*
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
            	    // InternalUseCase.g:1425:4: kw= '.' this_INT_2= RULE_INT
            	    {
            	    kw=(Token)match(input,18,FOLLOW_40); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNumberAccess().getFullStopKeyword_1_0());
            	    			
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_39); 

            	    				current.merge(this_INT_2);
            	    			

            	    				newLeafNode(this_INT_2, grammarAccess.getQualifiedNumberAccess().getINTTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            kw=(Token)match(input,18,FOLLOW_2); 

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