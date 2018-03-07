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

                if ( (LA1_0==34) ) {
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
    // InternalUseCase.g:128:1: ruleUseCase returns [EObject current=null] : (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )? ( (lv_inputs_4_0= ruleInputs ) )? ( (lv_outputs_5_0= ruleOutputs ) )? ( (lv_steps_6_0= ruleSteps ) )? ( (lv_notes_7_0= ruleNotes ) )? otherlv_8= 'end' otherlv_9= 'of' otherlv_10= 'use-case' ) ;
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
            // InternalUseCase.g:134:2: ( (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )? ( (lv_inputs_4_0= ruleInputs ) )? ( (lv_outputs_5_0= ruleOutputs ) )? ( (lv_steps_6_0= ruleSteps ) )? ( (lv_notes_7_0= ruleNotes ) )? otherlv_8= 'end' otherlv_9= 'of' otherlv_10= 'use-case' ) )
            // InternalUseCase.g:135:2: (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )? ( (lv_inputs_4_0= ruleInputs ) )? ( (lv_outputs_5_0= ruleOutputs ) )? ( (lv_steps_6_0= ruleSteps ) )? ( (lv_notes_7_0= ruleNotes ) )? otherlv_8= 'end' otherlv_9= 'of' otherlv_10= 'use-case' )
            {
            // InternalUseCase.g:135:2: (otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )? ( (lv_inputs_4_0= ruleInputs ) )? ( (lv_outputs_5_0= ruleOutputs ) )? ( (lv_steps_6_0= ruleSteps ) )? ( (lv_notes_7_0= ruleNotes ) )? otherlv_8= 'end' otherlv_9= 'of' otherlv_10= 'use-case' )
            // InternalUseCase.g:136:3: otherlv_0= 'use-case' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_descriptions_2_0= ruleDescription ) )? ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )? ( (lv_inputs_4_0= ruleInputs ) )? ( (lv_outputs_5_0= ruleOutputs ) )? ( (lv_steps_6_0= ruleSteps ) )? ( (lv_notes_7_0= ruleNotes ) )? otherlv_8= 'end' otherlv_9= 'of' otherlv_10= 'use-case'
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

            // InternalUseCase.g:158:3: ( (lv_descriptions_2_0= ruleDescription ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
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

            // InternalUseCase.g:177:3: ( (lv_allowedUserGroups_3_0= ruleAllowedUserGroups ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==43) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalUseCase.g:178:4: (lv_allowedUserGroups_3_0= ruleAllowedUserGroups )
                    {
                    // InternalUseCase.g:178:4: (lv_allowedUserGroups_3_0= ruleAllowedUserGroups )
                    // InternalUseCase.g:179:5: lv_allowedUserGroups_3_0= ruleAllowedUserGroups
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

            // InternalUseCase.g:196:3: ( (lv_inputs_4_0= ruleInputs ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=23 && LA5_0<=25)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalUseCase.g:197:4: (lv_inputs_4_0= ruleInputs )
                    {
                    // InternalUseCase.g:197:4: (lv_inputs_4_0= ruleInputs )
                    // InternalUseCase.g:198:5: lv_inputs_4_0= ruleInputs
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

            // InternalUseCase.g:215:3: ( (lv_outputs_5_0= ruleOutputs ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=30 && LA6_0<=32)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUseCase.g:216:4: (lv_outputs_5_0= ruleOutputs )
                    {
                    // InternalUseCase.g:216:4: (lv_outputs_5_0= ruleOutputs )
                    // InternalUseCase.g:217:5: lv_outputs_5_0= ruleOutputs
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

            // InternalUseCase.g:234:3: ( (lv_steps_6_0= ruleSteps ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUseCase.g:235:4: (lv_steps_6_0= ruleSteps )
                    {
                    // InternalUseCase.g:235:4: (lv_steps_6_0= ruleSteps )
                    // InternalUseCase.g:236:5: lv_steps_6_0= ruleSteps
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

            // InternalUseCase.g:253:3: ( (lv_notes_7_0= ruleNotes ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=21 && LA8_0<=22)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUseCase.g:254:4: (lv_notes_7_0= ruleNotes )
                    {
                    // InternalUseCase.g:254:4: (lv_notes_7_0= ruleNotes )
                    // InternalUseCase.g:255:5: lv_notes_7_0= ruleNotes
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
    // InternalUseCase.g:288:1: entryRuleSteps returns [EObject current=null] : iv_ruleSteps= ruleSteps EOF ;
    public final EObject entryRuleSteps() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSteps = null;


        try {
            // InternalUseCase.g:288:46: (iv_ruleSteps= ruleSteps EOF )
            // InternalUseCase.g:289:2: iv_ruleSteps= ruleSteps EOF
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
    // InternalUseCase.g:295:1: ruleSteps returns [EObject current=null] : (otherlv_0= 'steps:' ( (lv_steps_1_0= ruleStep ) )* ) ;
    public final EObject ruleSteps() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_steps_1_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:301:2: ( (otherlv_0= 'steps:' ( (lv_steps_1_0= ruleStep ) )* ) )
            // InternalUseCase.g:302:2: (otherlv_0= 'steps:' ( (lv_steps_1_0= ruleStep ) )* )
            {
            // InternalUseCase.g:302:2: (otherlv_0= 'steps:' ( (lv_steps_1_0= ruleStep ) )* )
            // InternalUseCase.g:303:3: otherlv_0= 'steps:' ( (lv_steps_1_0= ruleStep ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getStepsAccess().getStepsKeyword_0());
            		
            // InternalUseCase.g:307:3: ( (lv_steps_1_0= ruleStep ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_INT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalUseCase.g:308:4: (lv_steps_1_0= ruleStep )
            	    {
            	    // InternalUseCase.g:308:4: (lv_steps_1_0= ruleStep )
            	    // InternalUseCase.g:309:5: lv_steps_1_0= ruleStep
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
    // $ANTLR end "ruleSteps"


    // $ANTLR start "entryRuleStep"
    // InternalUseCase.g:330:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalUseCase.g:330:45: (iv_ruleStep= ruleStep EOF )
            // InternalUseCase.g:331:2: iv_ruleStep= ruleStep EOF
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
    // InternalUseCase.g:337:1: ruleStep returns [EObject current=null] : ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token lv_action_1_0=null;
        AntlrDatatypeRuleToken lv_number_0_0 = null;

        EObject lv_error_2_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:343:2: ( ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? ) )
            // InternalUseCase.g:344:2: ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? )
            {
            // InternalUseCase.g:344:2: ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? )
            // InternalUseCase.g:345:3: ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )?
            {
            // InternalUseCase.g:345:3: ( (lv_number_0_0= ruleQualifiedNumber ) )
            // InternalUseCase.g:346:4: (lv_number_0_0= ruleQualifiedNumber )
            {
            // InternalUseCase.g:346:4: (lv_number_0_0= ruleQualifiedNumber )
            // InternalUseCase.g:347:5: lv_number_0_0= ruleQualifiedNumber
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

            // InternalUseCase.g:364:3: ( (lv_action_1_0= RULE_STRING ) )
            // InternalUseCase.g:365:4: (lv_action_1_0= RULE_STRING )
            {
            // InternalUseCase.g:365:4: (lv_action_1_0= RULE_STRING )
            // InternalUseCase.g:366:5: lv_action_1_0= RULE_STRING
            {
            lv_action_1_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

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

            // InternalUseCase.g:382:3: ( (lv_error_2_0= ruleRaiseError ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUseCase.g:383:4: (lv_error_2_0= ruleRaiseError )
                    {
                    // InternalUseCase.g:383:4: (lv_error_2_0= ruleRaiseError )
                    // InternalUseCase.g:384:5: lv_error_2_0= ruleRaiseError
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
    // InternalUseCase.g:405:1: entryRuleRaiseError returns [EObject current=null] : iv_ruleRaiseError= ruleRaiseError EOF ;
    public final EObject entryRuleRaiseError() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRaiseError = null;


        try {
            // InternalUseCase.g:405:51: (iv_ruleRaiseError= ruleRaiseError EOF )
            // InternalUseCase.g:406:2: iv_ruleRaiseError= ruleRaiseError EOF
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
    // InternalUseCase.g:412:1: ruleRaiseError returns [EObject current=null] : (otherlv_0= '.' (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) ) ( (lv_exception_5_0= ruleException ) ) ) ;
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
            // InternalUseCase.g:418:2: ( (otherlv_0= '.' (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) ) ( (lv_exception_5_0= ruleException ) ) ) )
            // InternalUseCase.g:419:2: (otherlv_0= '.' (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) ) ( (lv_exception_5_0= ruleException ) ) )
            {
            // InternalUseCase.g:419:2: (otherlv_0= '.' (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) ) ( (lv_exception_5_0= ruleException ) ) )
            // InternalUseCase.g:420:3: otherlv_0= '.' (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) ) ( (lv_exception_5_0= ruleException ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getRaiseErrorAccess().getFullStopKeyword_0());
            		
            // InternalUseCase.g:424:3: (otherlv_1= 'Raise' | (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' ) )
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
                    // InternalUseCase.g:425:4: otherlv_1= 'Raise'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getRaiseErrorAccess().getRaiseKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:430:4: (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' )
                    {
                    // InternalUseCase.g:430:4: (otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise' )
                    // InternalUseCase.g:431:5: otherlv_2= 'On' otherlv_3= 'error' otherlv_4= 'raise'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_18); 

                    					newLeafNode(otherlv_2, grammarAccess.getRaiseErrorAccess().getOnKeyword_1_1_0());
                    				
                    otherlv_3=(Token)match(input,18,FOLLOW_19); 

                    					newLeafNode(otherlv_3, grammarAccess.getRaiseErrorAccess().getErrorKeyword_1_1_1());
                    				
                    otherlv_4=(Token)match(input,19,FOLLOW_5); 

                    					newLeafNode(otherlv_4, grammarAccess.getRaiseErrorAccess().getRaiseKeyword_1_1_2());
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:445:3: ( (lv_exception_5_0= ruleException ) )
            // InternalUseCase.g:446:4: (lv_exception_5_0= ruleException )
            {
            // InternalUseCase.g:446:4: (lv_exception_5_0= ruleException )
            // InternalUseCase.g:447:5: lv_exception_5_0= ruleException
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
    // InternalUseCase.g:468:1: entryRuleException returns [EObject current=null] : iv_ruleException= ruleException EOF ;
    public final EObject entryRuleException() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleException = null;


        try {
            // InternalUseCase.g:468:50: (iv_ruleException= ruleException EOF )
            // InternalUseCase.g:469:2: iv_ruleException= ruleException EOF
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
    // InternalUseCase.g:475:1: ruleException returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleException() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:481:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalUseCase.g:482:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalUseCase.g:482:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalUseCase.g:483:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalUseCase.g:483:3: (lv_name_0_0= RULE_STRING )
            // InternalUseCase.g:484:4: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getExceptionAccess().getNameSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getExceptionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // InternalUseCase.g:503:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalUseCase.g:503:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalUseCase.g:504:2: iv_ruleDescription= ruleDescription EOF
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
    // InternalUseCase.g:510:1: ruleDescription returns [EObject current=null] : (otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:516:2: ( (otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalUseCase.g:517:2: (otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalUseCase.g:517:2: (otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalUseCase.g:518:3: otherlv_0= 'description:' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getDescriptionKeyword_0());
            		
            // InternalUseCase.g:522:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalUseCase.g:523:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalUseCase.g:523:4: (lv_name_1_0= RULE_STRING )
            // InternalUseCase.g:524:5: lv_name_1_0= RULE_STRING
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
    // InternalUseCase.g:544:1: entryRuleNotes returns [EObject current=null] : iv_ruleNotes= ruleNotes EOF ;
    public final EObject entryRuleNotes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotes = null;


        try {
            // InternalUseCase.g:544:46: (iv_ruleNotes= ruleNotes EOF )
            // InternalUseCase.g:545:2: iv_ruleNotes= ruleNotes EOF
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
    // InternalUseCase.g:551:1: ruleNotes returns [EObject current=null] : ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) ( (lv_content_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleNotes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:557:2: ( ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) ( (lv_content_2_0= RULE_STRING ) ) ) )
            // InternalUseCase.g:558:2: ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) ( (lv_content_2_0= RULE_STRING ) ) )
            {
            // InternalUseCase.g:558:2: ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) ( (lv_content_2_0= RULE_STRING ) ) )
            // InternalUseCase.g:559:3: (otherlv_0= 'notes:' | otherlv_1= 'note:' ) ( (lv_content_2_0= RULE_STRING ) )
            {
            // InternalUseCase.g:559:3: (otherlv_0= 'notes:' | otherlv_1= 'note:' )
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
                    // InternalUseCase.g:560:4: otherlv_0= 'notes:'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getNotesAccess().getNotesKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:565:4: otherlv_1= 'note:'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getNotesAccess().getNoteKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:570:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalUseCase.g:571:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalUseCase.g:571:4: (lv_content_2_0= RULE_STRING )
            // InternalUseCase.g:572:5: lv_content_2_0= RULE_STRING
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
    // InternalUseCase.g:592:1: entryRuleInputs returns [EObject current=null] : iv_ruleInputs= ruleInputs EOF ;
    public final EObject entryRuleInputs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputs = null;


        try {
            // InternalUseCase.g:592:47: (iv_ruleInputs= ruleInputs EOF )
            // InternalUseCase.g:593:2: iv_ruleInputs= ruleInputs EOF
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
    // InternalUseCase.g:599:1: ruleInputs returns [EObject current=null] : ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) ( (lv_inputs_7_0= ruleInput ) )* ) ;
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
            // InternalUseCase.g:605:2: ( ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) ( (lv_inputs_7_0= ruleInput ) )* ) )
            // InternalUseCase.g:606:2: ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) ( (lv_inputs_7_0= ruleInput ) )* )
            {
            // InternalUseCase.g:606:2: ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) ( (lv_inputs_7_0= ruleInput ) )* )
            // InternalUseCase.g:607:3: (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) ( (lv_inputs_7_0= ruleInput ) )*
            {
            // InternalUseCase.g:607:3: (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) )
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
                    // InternalUseCase.g:608:4: otherlv_0= 'requires:'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_20); 

                    				newLeafNode(otherlv_0, grammarAccess.getInputsAccess().getRequiresKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:613:4: otherlv_1= 'require:'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_20); 

                    				newLeafNode(otherlv_1, grammarAccess.getInputsAccess().getRequireKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalUseCase.g:618:4: (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' )
                    {
                    // InternalUseCase.g:618:4: (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' )
                    // InternalUseCase.g:619:5: otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_21); 

                    					newLeafNode(otherlv_2, grammarAccess.getInputsAccess().getRequiresKeyword_0_2_0());
                    				
                    otherlv_3=(Token)match(input,26,FOLLOW_22); 

                    					newLeafNode(otherlv_3, grammarAccess.getInputsAccess().getTheKeyword_0_2_1());
                    				
                    otherlv_4=(Token)match(input,27,FOLLOW_23); 

                    					newLeafNode(otherlv_4, grammarAccess.getInputsAccess().getFollowingKeyword_0_2_2());
                    				
                    otherlv_5=(Token)match(input,28,FOLLOW_24); 

                    					newLeafNode(otherlv_5, grammarAccess.getInputsAccess().getInputKeyword_0_2_3());
                    				
                    otherlv_6=(Token)match(input,29,FOLLOW_20); 

                    					newLeafNode(otherlv_6, grammarAccess.getInputsAccess().getColonKeyword_0_2_4());
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:641:3: ( (lv_inputs_7_0= ruleInput ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=39 && LA14_0<=40)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalUseCase.g:642:4: (lv_inputs_7_0= ruleInput )
            	    {
            	    // InternalUseCase.g:642:4: (lv_inputs_7_0= ruleInput )
            	    // InternalUseCase.g:643:5: lv_inputs_7_0= ruleInput
            	    {

            	    					newCompositeNode(grammarAccess.getInputsAccess().getInputsInputParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_20);
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
            	    break loop14;
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
    // InternalUseCase.g:664:1: entryRuleOutputs returns [EObject current=null] : iv_ruleOutputs= ruleOutputs EOF ;
    public final EObject entryRuleOutputs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputs = null;


        try {
            // InternalUseCase.g:664:48: (iv_ruleOutputs= ruleOutputs EOF )
            // InternalUseCase.g:665:2: iv_ruleOutputs= ruleOutputs EOF
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
    // InternalUseCase.g:671:1: ruleOutputs returns [EObject current=null] : ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) ( (lv_outputs_7_0= ruleOutput ) )* ) ;
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
            // InternalUseCase.g:677:2: ( ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) ( (lv_outputs_7_0= ruleOutput ) )* ) )
            // InternalUseCase.g:678:2: ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) ( (lv_outputs_7_0= ruleOutput ) )* )
            {
            // InternalUseCase.g:678:2: ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) ( (lv_outputs_7_0= ruleOutput ) )* )
            // InternalUseCase.g:679:3: (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) ( (lv_outputs_7_0= ruleOutput ) )*
            {
            // InternalUseCase.g:679:3: (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) )
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
                    // InternalUseCase.g:680:4: otherlv_0= 'produces:'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_20); 

                    				newLeafNode(otherlv_0, grammarAccess.getOutputsAccess().getProducesKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:685:4: otherlv_1= 'produce:'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_20); 

                    				newLeafNode(otherlv_1, grammarAccess.getOutputsAccess().getProduceKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalUseCase.g:690:4: (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' )
                    {
                    // InternalUseCase.g:690:4: (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' )
                    // InternalUseCase.g:691:5: otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_21); 

                    					newLeafNode(otherlv_2, grammarAccess.getOutputsAccess().getProducesKeyword_0_2_0());
                    				
                    otherlv_3=(Token)match(input,26,FOLLOW_22); 

                    					newLeafNode(otherlv_3, grammarAccess.getOutputsAccess().getTheKeyword_0_2_1());
                    				
                    otherlv_4=(Token)match(input,27,FOLLOW_25); 

                    					newLeafNode(otherlv_4, grammarAccess.getOutputsAccess().getFollowingKeyword_0_2_2());
                    				
                    otherlv_5=(Token)match(input,33,FOLLOW_24); 

                    					newLeafNode(otherlv_5, grammarAccess.getOutputsAccess().getOutputKeyword_0_2_3());
                    				
                    otherlv_6=(Token)match(input,29,FOLLOW_20); 

                    					newLeafNode(otherlv_6, grammarAccess.getOutputsAccess().getColonKeyword_0_2_4());
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:713:3: ( (lv_outputs_7_0= ruleOutput ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=39 && LA16_0<=40)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalUseCase.g:714:4: (lv_outputs_7_0= ruleOutput )
            	    {
            	    // InternalUseCase.g:714:4: (lv_outputs_7_0= ruleOutput )
            	    // InternalUseCase.g:715:5: lv_outputs_7_0= ruleOutput
            	    {

            	    					newCompositeNode(grammarAccess.getOutputsAccess().getOutputsOutputParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_20);
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
            	    break loop16;
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
    // InternalUseCase.g:736:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalUseCase.g:736:45: (iv_ruleType= ruleType EOF )
            // InternalUseCase.g:737:2: iv_ruleType= ruleType EOF
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
    // InternalUseCase.g:743:1: ruleType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) ;
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
            // InternalUseCase.g:749:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) )
            // InternalUseCase.g:750:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            {
            // InternalUseCase.g:750:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            // InternalUseCase.g:751:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getTypeKeyword_0());
            		
            // InternalUseCase.g:755:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUseCase.g:756:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUseCase.g:756:4: (lv_name_1_0= RULE_ID )
            // InternalUseCase.g:757:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

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

            otherlv_2=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2());
            		
            // InternalUseCase.g:777:3: ( (lv_description_3_0= RULE_STRING ) )
            // InternalUseCase.g:778:4: (lv_description_3_0= RULE_STRING )
            {
            // InternalUseCase.g:778:4: (lv_description_3_0= RULE_STRING )
            // InternalUseCase.g:779:5: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

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

            otherlv_4=(Token)match(input,36,FOLLOW_29); 

            			newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getRightParenthesisKeyword_4());
            		
            // InternalUseCase.g:799:3: (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUseCase.g:800:4: otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_26); 

                    				newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_5_0());
                    			
                    // InternalUseCase.g:804:4: ( (lv_importInfo_6_0= ruleQualifiedName ) )
                    // InternalUseCase.g:805:5: (lv_importInfo_6_0= ruleQualifiedName )
                    {
                    // InternalUseCase.g:805:5: (lv_importInfo_6_0= ruleQualifiedName )
                    // InternalUseCase.g:806:6: lv_importInfo_6_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getTypeAccess().getImportInfoQualifiedNameParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_7=(Token)match(input,38,FOLLOW_2); 

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


    // $ANTLR start "entryRuleInput"
    // InternalUseCase.g:832:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalUseCase.g:832:46: (iv_ruleInput= ruleInput EOF )
            // InternalUseCase.g:833:2: iv_ruleInput= ruleInput EOF
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
    // InternalUseCase.g:839:1: ruleInput returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? ) ;
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
            // InternalUseCase.g:845:2: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? ) )
            // InternalUseCase.g:846:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? )
            {
            // InternalUseCase.g:846:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? )
            // InternalUseCase.g:847:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )?
            {
            // InternalUseCase.g:847:3: ( (lv_many_0_0= 'many' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==39) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUseCase.g:848:4: (lv_many_0_0= 'many' )
                    {
                    // InternalUseCase.g:848:4: (lv_many_0_0= 'many' )
                    // InternalUseCase.g:849:5: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,39,FOLLOW_31); 

                    					newLeafNode(lv_many_0_0, grammarAccess.getInputAccess().getManyManyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInputRule());
                    					}
                    					setWithLastConsumed(current, "many", true, "many");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,40,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getInputAccess().getHyphenMinusKeyword_1());
            		
            // InternalUseCase.g:865:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalUseCase.g:866:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalUseCase.g:866:4: (lv_content_2_0= RULE_STRING )
            // InternalUseCase.g:867:5: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

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

            // InternalUseCase.g:883:3: (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==41) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUseCase.g:884:4: otherlv_3= 'as' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getInputAccess().getAsKeyword_3_0());
                    			
                    // InternalUseCase.g:888:4: ( (otherlv_4= RULE_ID ) )
                    // InternalUseCase.g:889:5: (otherlv_4= RULE_ID )
                    {
                    // InternalUseCase.g:889:5: (otherlv_4= RULE_ID )
                    // InternalUseCase.g:890:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInputRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_33); 

                    						newLeafNode(otherlv_4, grammarAccess.getInputAccess().getTypeTypeCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUseCase.g:902:3: (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUseCase.g:903:4: otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')'
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_34); 

                    				newLeafNode(otherlv_5, grammarAccess.getInputAccess().getLeftParenthesisKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,42,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getInputAccess().getEGKeyword_4_1());
                    			
                    // InternalUseCase.g:911:4: ( (lv_example_7_0= RULE_STRING ) )
                    // InternalUseCase.g:912:5: (lv_example_7_0= RULE_STRING )
                    {
                    // InternalUseCase.g:912:5: (lv_example_7_0= RULE_STRING )
                    // InternalUseCase.g:913:6: lv_example_7_0= RULE_STRING
                    {
                    lv_example_7_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

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

                    otherlv_8=(Token)match(input,36,FOLLOW_2); 

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
    // InternalUseCase.g:938:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalUseCase.g:938:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalUseCase.g:939:2: iv_ruleOutput= ruleOutput EOF
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
    // InternalUseCase.g:945:1: ruleOutput returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? ) ;
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
            // InternalUseCase.g:951:2: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? ) )
            // InternalUseCase.g:952:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? )
            {
            // InternalUseCase.g:952:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )? )
            // InternalUseCase.g:953:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )?
            {
            // InternalUseCase.g:953:3: ( (lv_many_0_0= 'many' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUseCase.g:954:4: (lv_many_0_0= 'many' )
                    {
                    // InternalUseCase.g:954:4: (lv_many_0_0= 'many' )
                    // InternalUseCase.g:955:5: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,39,FOLLOW_31); 

                    					newLeafNode(lv_many_0_0, grammarAccess.getOutputAccess().getManyManyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOutputRule());
                    					}
                    					setWithLastConsumed(current, "many", true, "many");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,40,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getHyphenMinusKeyword_1());
            		
            // InternalUseCase.g:971:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalUseCase.g:972:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalUseCase.g:972:4: (lv_content_2_0= RULE_STRING )
            // InternalUseCase.g:973:5: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

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

            // InternalUseCase.g:989:3: (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==41) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUseCase.g:990:4: otherlv_3= 'as' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getOutputAccess().getAsKeyword_3_0());
                    			
                    // InternalUseCase.g:994:4: ( (otherlv_4= RULE_ID ) )
                    // InternalUseCase.g:995:5: (otherlv_4= RULE_ID )
                    {
                    // InternalUseCase.g:995:5: (otherlv_4= RULE_ID )
                    // InternalUseCase.g:996:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutputRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_33); 

                    						newLeafNode(otherlv_4, grammarAccess.getOutputAccess().getTypeTypeCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUseCase.g:1008:3: (otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUseCase.g:1009:4: otherlv_5= '(' otherlv_6= 'e.g' ( (lv_example_7_0= RULE_STRING ) ) otherlv_8= ')'
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_34); 

                    				newLeafNode(otherlv_5, grammarAccess.getOutputAccess().getLeftParenthesisKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,42,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getOutputAccess().getEGKeyword_4_1());
                    			
                    // InternalUseCase.g:1017:4: ( (lv_example_7_0= RULE_STRING ) )
                    // InternalUseCase.g:1018:5: (lv_example_7_0= RULE_STRING )
                    {
                    // InternalUseCase.g:1018:5: (lv_example_7_0= RULE_STRING )
                    // InternalUseCase.g:1019:6: lv_example_7_0= RULE_STRING
                    {
                    lv_example_7_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

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

                    otherlv_8=(Token)match(input,36,FOLLOW_2); 

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
    // InternalUseCase.g:1044:1: entryRuleAllowedUserGroups returns [EObject current=null] : iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF ;
    public final EObject entryRuleAllowedUserGroups() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllowedUserGroups = null;


        try {
            // InternalUseCase.g:1044:58: (iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF )
            // InternalUseCase.g:1045:2: iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF
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
    // InternalUseCase.g:1051:1: ruleAllowedUserGroups returns [EObject current=null] : (otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )* ) ;
    public final EObject ruleAllowedUserGroups() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_groups_1_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:1057:2: ( (otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )* ) )
            // InternalUseCase.g:1058:2: (otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )* )
            {
            // InternalUseCase.g:1058:2: (otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )* )
            // InternalUseCase.g:1059:3: otherlv_0= 'allowed-usergroups:' ( (lv_groups_1_0= ruleAllowedUserGroup ) )*
            {
            otherlv_0=(Token)match(input,43,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getAllowedUserGroupsAccess().getAllowedUsergroupsKeyword_0());
            		
            // InternalUseCase.g:1063:3: ( (lv_groups_1_0= ruleAllowedUserGroup ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=39 && LA24_0<=40)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalUseCase.g:1064:4: (lv_groups_1_0= ruleAllowedUserGroup )
            	    {
            	    // InternalUseCase.g:1064:4: (lv_groups_1_0= ruleAllowedUserGroup )
            	    // InternalUseCase.g:1065:5: lv_groups_1_0= ruleAllowedUserGroup
            	    {

            	    					newCompositeNode(grammarAccess.getAllowedUserGroupsAccess().getGroupsAllowedUserGroupParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_20);
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
            	    break loop24;
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
    // InternalUseCase.g:1086:1: entryRuleAllowedUserGroup returns [EObject current=null] : iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF ;
    public final EObject entryRuleAllowedUserGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllowedUserGroup = null;


        try {
            // InternalUseCase.g:1086:57: (iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF )
            // InternalUseCase.g:1087:2: iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF
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
    // InternalUseCase.g:1093:1: ruleAllowedUserGroup returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final EObject ruleAllowedUserGroup() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalUseCase.g:1099:2: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) )
            // InternalUseCase.g:1100:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? )
            {
            // InternalUseCase.g:1100:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? )
            // InternalUseCase.g:1101:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            {
            // InternalUseCase.g:1101:3: ( (lv_many_0_0= 'many' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUseCase.g:1102:4: (lv_many_0_0= 'many' )
                    {
                    // InternalUseCase.g:1102:4: (lv_many_0_0= 'many' )
                    // InternalUseCase.g:1103:5: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,39,FOLLOW_31); 

                    					newLeafNode(lv_many_0_0, grammarAccess.getAllowedUserGroupAccess().getManyManyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAllowedUserGroupRule());
                    					}
                    					setWithLastConsumed(current, "many", true, "many");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,40,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAllowedUserGroupAccess().getHyphenMinusKeyword_1());
            		
            // InternalUseCase.g:1119:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalUseCase.g:1120:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalUseCase.g:1120:4: (lv_name_2_0= RULE_STRING )
            // InternalUseCase.g:1121:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

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

            // InternalUseCase.g:1137:3: (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==41) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUseCase.g:1138:4: otherlv_3= 'as' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getAllowedUserGroupAccess().getAsKeyword_3_0());
                    			
                    // InternalUseCase.g:1142:4: ( (otherlv_4= RULE_ID ) )
                    // InternalUseCase.g:1143:5: (otherlv_4= RULE_ID )
                    {
                    // InternalUseCase.g:1143:5: (otherlv_4= RULE_ID )
                    // InternalUseCase.g:1144:6: otherlv_4= RULE_ID
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
    // InternalUseCase.g:1160:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalUseCase.g:1160:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalUseCase.g:1161:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalUseCase.g:1167:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalUseCase.g:1173:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalUseCase.g:1174:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalUseCase.g:1174:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalUseCase.g:1175:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalUseCase.g:1182:3: (kw= '.' this_ID_2= RULE_ID )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==15) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalUseCase.g:1183:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FOLLOW_26); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalUseCase.g:1200:1: entryRuleQualifiedNumber returns [String current=null] : iv_ruleQualifiedNumber= ruleQualifiedNumber EOF ;
    public final String entryRuleQualifiedNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNumber = null;


        try {
            // InternalUseCase.g:1200:55: (iv_ruleQualifiedNumber= ruleQualifiedNumber EOF )
            // InternalUseCase.g:1201:2: iv_ruleQualifiedNumber= ruleQualifiedNumber EOF
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
    // InternalUseCase.g:1207:1: ruleQualifiedNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalUseCase.g:1213:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' ) )
            // InternalUseCase.g:1214:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' )
            {
            // InternalUseCase.g:1214:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' )
            // InternalUseCase.g:1215:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.'
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_36); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getQualifiedNumberAccess().getINTTerminalRuleCall_0());
            		
            // InternalUseCase.g:1222:3: (kw= '.' this_INT_2= RULE_INT )*
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
            	    // InternalUseCase.g:1223:4: kw= '.' this_INT_2= RULE_INT
            	    {
            	    kw=(Token)match(input,15,FOLLOW_37); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNumberAccess().getFullStopKeyword_1_0());
            	    			
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_36); 

            	    				current.merge(this_INT_2);
            	    			

            	    				newLeafNode(this_INT_2, grammarAccess.getQualifiedNumberAccess().getINTTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            kw=(Token)match(input,15,FOLLOW_2); 

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