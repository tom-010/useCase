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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'use-case'", "'Rezept'", "'end'", "'of'", "'Ende'", "'des'", "'Rezpets'", "'description:'", "'Kurzbeschreibung:'", "'Beschreibung'", "'allowed-usergroups:'", "'Erlaubt'", "'f\\u00FCr:'", "'many'", "'-'", "'as'", "'requires:'", "'require:'", "'requires'", "'the'", "'following'", "'input'", "':'", "'Ben\\u00F6tigte'", "'Zutaten'", "'als'", "'('", "'e.g'", "'z.B.'", "')'", "'produces:'", "'produce:'", "'produces'", "'output'", "'Ergebnis:'", "'optional'", "'pre-condition:'", "'pre-conditions:'", "'Vorbedingungen:'", "'steps:'", "'Schritte:'", "'Raise'", "'error'", "'On'", "'raise'", "'Melde'", "'Fehler'", "'Bei'", "'melde'", "'notes:'", "'note:'", "'Anmerkungen:'", "'Anmerkung:'", "'used'", "'types:'", "'Genutzte'", "'Typen:'", "'['", "']'", "'errors:'", "'Fehler:'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
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
    public static final int T__49=49;
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

                if ( ((LA1_0>=12 && LA1_0<=13)) ) {
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalUseCase.g:140:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalUseCase.g:140:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalUseCase.g:141:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalUseCase.g:147:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalUseCase.g:153:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalUseCase.g:154:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalUseCase.g:154:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalUseCase.g:155:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalUseCase.g:162:3: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUseCase.g:163:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,11,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNumber"
    // InternalUseCase.g:180:1: entryRuleQualifiedNumber returns [String current=null] : iv_ruleQualifiedNumber= ruleQualifiedNumber EOF ;
    public final String entryRuleQualifiedNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNumber = null;


        try {
            // InternalUseCase.g:180:55: (iv_ruleQualifiedNumber= ruleQualifiedNumber EOF )
            // InternalUseCase.g:181:2: iv_ruleQualifiedNumber= ruleQualifiedNumber EOF
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
    // InternalUseCase.g:187:1: ruleQualifiedNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalUseCase.g:193:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' ) )
            // InternalUseCase.g:194:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' )
            {
            // InternalUseCase.g:194:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.' )
            // InternalUseCase.g:195:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* kw= '.'
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getQualifiedNumberAccess().getINTTerminalRuleCall_0());
            		
            // InternalUseCase.g:202:3: (kw= '.' this_INT_2= RULE_INT )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1==RULE_INT) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalUseCase.g:203:4: kw= '.' this_INT_2= RULE_INT
            	    {
            	    kw=(Token)match(input,11,FOLLOW_8); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNumberAccess().getFullStopKeyword_1_0());
            	    			
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_7); 

            	    				current.merge(this_INT_2);
            	    			

            	    				newLeafNode(this_INT_2, grammarAccess.getQualifiedNumberAccess().getINTTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            kw=(Token)match(input,11,FOLLOW_2); 

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


    // $ANTLR start "entryRuleUseCase"
    // InternalUseCase.g:225:1: entryRuleUseCase returns [EObject current=null] : iv_ruleUseCase= ruleUseCase EOF ;
    public final EObject entryRuleUseCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCase = null;


        try {
            // InternalUseCase.g:225:48: (iv_ruleUseCase= ruleUseCase EOF )
            // InternalUseCase.g:226:2: iv_ruleUseCase= ruleUseCase EOF
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
    // InternalUseCase.g:232:1: ruleUseCase returns [EObject current=null] : ( (otherlv_0= 'use-case' | otherlv_1= 'Rezept' ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )? ( (lv_inputs_5_0= ruleInputs ) )? ( (lv_outputs_6_0= ruleOutputs ) )? ( (lv_preconditions_7_0= rulePreConditions ) )? ( (lv_steps_8_0= ruleSteps ) )? ( (lv_notes_9_0= ruleNotes ) )? ( (otherlv_10= 'end' otherlv_11= 'of' otherlv_12= 'use-case' ) | (otherlv_13= 'Ende' otherlv_14= 'des' otherlv_15= 'Rezpets' ) ) ) ;
    public final EObject ruleUseCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_descriptions_3_0 = null;

        EObject lv_allowedUserGroups_4_0 = null;

        EObject lv_inputs_5_0 = null;

        EObject lv_outputs_6_0 = null;

        EObject lv_preconditions_7_0 = null;

        EObject lv_steps_8_0 = null;

        EObject lv_notes_9_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:238:2: ( ( (otherlv_0= 'use-case' | otherlv_1= 'Rezept' ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )? ( (lv_inputs_5_0= ruleInputs ) )? ( (lv_outputs_6_0= ruleOutputs ) )? ( (lv_preconditions_7_0= rulePreConditions ) )? ( (lv_steps_8_0= ruleSteps ) )? ( (lv_notes_9_0= ruleNotes ) )? ( (otherlv_10= 'end' otherlv_11= 'of' otherlv_12= 'use-case' ) | (otherlv_13= 'Ende' otherlv_14= 'des' otherlv_15= 'Rezpets' ) ) ) )
            // InternalUseCase.g:239:2: ( (otherlv_0= 'use-case' | otherlv_1= 'Rezept' ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )? ( (lv_inputs_5_0= ruleInputs ) )? ( (lv_outputs_6_0= ruleOutputs ) )? ( (lv_preconditions_7_0= rulePreConditions ) )? ( (lv_steps_8_0= ruleSteps ) )? ( (lv_notes_9_0= ruleNotes ) )? ( (otherlv_10= 'end' otherlv_11= 'of' otherlv_12= 'use-case' ) | (otherlv_13= 'Ende' otherlv_14= 'des' otherlv_15= 'Rezpets' ) ) )
            {
            // InternalUseCase.g:239:2: ( (otherlv_0= 'use-case' | otherlv_1= 'Rezept' ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )? ( (lv_inputs_5_0= ruleInputs ) )? ( (lv_outputs_6_0= ruleOutputs ) )? ( (lv_preconditions_7_0= rulePreConditions ) )? ( (lv_steps_8_0= ruleSteps ) )? ( (lv_notes_9_0= ruleNotes ) )? ( (otherlv_10= 'end' otherlv_11= 'of' otherlv_12= 'use-case' ) | (otherlv_13= 'Ende' otherlv_14= 'des' otherlv_15= 'Rezpets' ) ) )
            // InternalUseCase.g:240:3: (otherlv_0= 'use-case' | otherlv_1= 'Rezept' ) ( (lv_name_2_0= RULE_STRING ) ) ( (lv_descriptions_3_0= ruleDescription ) )? ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )? ( (lv_inputs_5_0= ruleInputs ) )? ( (lv_outputs_6_0= ruleOutputs ) )? ( (lv_preconditions_7_0= rulePreConditions ) )? ( (lv_steps_8_0= ruleSteps ) )? ( (lv_notes_9_0= ruleNotes ) )? ( (otherlv_10= 'end' otherlv_11= 'of' otherlv_12= 'use-case' ) | (otherlv_13= 'Ende' otherlv_14= 'des' otherlv_15= 'Rezpets' ) )
            {
            // InternalUseCase.g:240:3: (otherlv_0= 'use-case' | otherlv_1= 'Rezept' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalUseCase.g:241:4: otherlv_0= 'use-case'
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getUseCaseAccess().getUseCaseKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:246:4: otherlv_1= 'Rezept'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getUseCaseAccess().getRezeptKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:251:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalUseCase.g:252:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalUseCase.g:252:4: (lv_name_2_0= RULE_STRING )
            // InternalUseCase.g:253:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getUseCaseAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUseCaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalUseCase.g:269:3: ( (lv_descriptions_3_0= ruleDescription ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=19 && LA5_0<=21)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalUseCase.g:270:4: (lv_descriptions_3_0= ruleDescription )
                    {
                    // InternalUseCase.g:270:4: (lv_descriptions_3_0= ruleDescription )
                    // InternalUseCase.g:271:5: lv_descriptions_3_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getDescriptionsDescriptionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_descriptions_3_0=ruleDescription();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    					}
                    					add(
                    						current,
                    						"descriptions",
                    						lv_descriptions_3_0,
                    						"io.deniffel.dsl.useCase.UseCase.Description");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:288:3: ( (lv_allowedUserGroups_4_0= ruleAllowedUserGroups ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=22 && LA6_0<=23)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUseCase.g:289:4: (lv_allowedUserGroups_4_0= ruleAllowedUserGroups )
                    {
                    // InternalUseCase.g:289:4: (lv_allowedUserGroups_4_0= ruleAllowedUserGroups )
                    // InternalUseCase.g:290:5: lv_allowedUserGroups_4_0= ruleAllowedUserGroups
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getAllowedUserGroupsAllowedUserGroupsParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_allowedUserGroups_4_0=ruleAllowedUserGroups();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    					}
                    					add(
                    						current,
                    						"allowedUserGroups",
                    						lv_allowedUserGroups_4_0,
                    						"io.deniffel.dsl.useCase.UseCase.AllowedUserGroups");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:307:3: ( (lv_inputs_5_0= ruleInputs ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=28 && LA7_0<=30)||LA7_0==35) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUseCase.g:308:4: (lv_inputs_5_0= ruleInputs )
                    {
                    // InternalUseCase.g:308:4: (lv_inputs_5_0= ruleInputs )
                    // InternalUseCase.g:309:5: lv_inputs_5_0= ruleInputs
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getInputsInputsParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_inputs_5_0=ruleInputs();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    					}
                    					add(
                    						current,
                    						"inputs",
                    						lv_inputs_5_0,
                    						"io.deniffel.dsl.useCase.UseCase.Inputs");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:326:3: ( (lv_outputs_6_0= ruleOutputs ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=42 && LA8_0<=44)||LA8_0==46) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUseCase.g:327:4: (lv_outputs_6_0= ruleOutputs )
                    {
                    // InternalUseCase.g:327:4: (lv_outputs_6_0= ruleOutputs )
                    // InternalUseCase.g:328:5: lv_outputs_6_0= ruleOutputs
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getOutputsOutputsParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_outputs_6_0=ruleOutputs();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    					}
                    					add(
                    						current,
                    						"outputs",
                    						lv_outputs_6_0,
                    						"io.deniffel.dsl.useCase.UseCase.Outputs");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:345:3: ( (lv_preconditions_7_0= rulePreConditions ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=48 && LA9_0<=50)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalUseCase.g:346:4: (lv_preconditions_7_0= rulePreConditions )
                    {
                    // InternalUseCase.g:346:4: (lv_preconditions_7_0= rulePreConditions )
                    // InternalUseCase.g:347:5: lv_preconditions_7_0= rulePreConditions
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getPreconditionsPreConditionsParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_preconditions_7_0=rulePreConditions();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    					}
                    					set(
                    						current,
                    						"preconditions",
                    						lv_preconditions_7_0,
                    						"io.deniffel.dsl.useCase.UseCase.PreConditions");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:364:3: ( (lv_steps_8_0= ruleSteps ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=51 && LA10_0<=52)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUseCase.g:365:4: (lv_steps_8_0= ruleSteps )
                    {
                    // InternalUseCase.g:365:4: (lv_steps_8_0= ruleSteps )
                    // InternalUseCase.g:366:5: lv_steps_8_0= ruleSteps
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getStepsStepsParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_steps_8_0=ruleSteps();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    					}
                    					add(
                    						current,
                    						"steps",
                    						lv_steps_8_0,
                    						"io.deniffel.dsl.useCase.UseCase.Steps");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:383:3: ( (lv_notes_9_0= ruleNotes ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=61 && LA11_0<=64)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUseCase.g:384:4: (lv_notes_9_0= ruleNotes )
                    {
                    // InternalUseCase.g:384:4: (lv_notes_9_0= ruleNotes )
                    // InternalUseCase.g:385:5: lv_notes_9_0= ruleNotes
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getNotesNotesParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_notes_9_0=ruleNotes();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    					}
                    					add(
                    						current,
                    						"notes",
                    						lv_notes_9_0,
                    						"io.deniffel.dsl.useCase.UseCase.Notes");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:402:3: ( (otherlv_10= 'end' otherlv_11= 'of' otherlv_12= 'use-case' ) | (otherlv_13= 'Ende' otherlv_14= 'des' otherlv_15= 'Rezpets' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==14) ) {
                alt12=1;
            }
            else if ( (LA12_0==16) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalUseCase.g:403:4: (otherlv_10= 'end' otherlv_11= 'of' otherlv_12= 'use-case' )
                    {
                    // InternalUseCase.g:403:4: (otherlv_10= 'end' otherlv_11= 'of' otherlv_12= 'use-case' )
                    // InternalUseCase.g:404:5: otherlv_10= 'end' otherlv_11= 'of' otherlv_12= 'use-case'
                    {
                    otherlv_10=(Token)match(input,14,FOLLOW_18); 

                    					newLeafNode(otherlv_10, grammarAccess.getUseCaseAccess().getEndKeyword_9_0_0());
                    				
                    otherlv_11=(Token)match(input,15,FOLLOW_19); 

                    					newLeafNode(otherlv_11, grammarAccess.getUseCaseAccess().getOfKeyword_9_0_1());
                    				
                    otherlv_12=(Token)match(input,12,FOLLOW_2); 

                    					newLeafNode(otherlv_12, grammarAccess.getUseCaseAccess().getUseCaseKeyword_9_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:418:4: (otherlv_13= 'Ende' otherlv_14= 'des' otherlv_15= 'Rezpets' )
                    {
                    // InternalUseCase.g:418:4: (otherlv_13= 'Ende' otherlv_14= 'des' otherlv_15= 'Rezpets' )
                    // InternalUseCase.g:419:5: otherlv_13= 'Ende' otherlv_14= 'des' otherlv_15= 'Rezpets'
                    {
                    otherlv_13=(Token)match(input,16,FOLLOW_20); 

                    					newLeafNode(otherlv_13, grammarAccess.getUseCaseAccess().getEndeKeyword_9_1_0());
                    				
                    otherlv_14=(Token)match(input,17,FOLLOW_21); 

                    					newLeafNode(otherlv_14, grammarAccess.getUseCaseAccess().getDesKeyword_9_1_1());
                    				
                    otherlv_15=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(otherlv_15, grammarAccess.getUseCaseAccess().getRezpetsKeyword_9_1_2());
                    				

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
    // $ANTLR end "ruleUseCase"


    // $ANTLR start "entryRuleDescription"
    // InternalUseCase.g:437:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalUseCase.g:437:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalUseCase.g:438:2: iv_ruleDescription= ruleDescription EOF
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
    // InternalUseCase.g:444:1: ruleDescription returns [EObject current=null] : ( (otherlv_0= 'description:' | otherlv_1= 'Kurzbeschreibung:' | otherlv_2= 'Beschreibung' ) ( (lv_name_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:450:2: ( ( (otherlv_0= 'description:' | otherlv_1= 'Kurzbeschreibung:' | otherlv_2= 'Beschreibung' ) ( (lv_name_3_0= RULE_STRING ) ) ) )
            // InternalUseCase.g:451:2: ( (otherlv_0= 'description:' | otherlv_1= 'Kurzbeschreibung:' | otherlv_2= 'Beschreibung' ) ( (lv_name_3_0= RULE_STRING ) ) )
            {
            // InternalUseCase.g:451:2: ( (otherlv_0= 'description:' | otherlv_1= 'Kurzbeschreibung:' | otherlv_2= 'Beschreibung' ) ( (lv_name_3_0= RULE_STRING ) ) )
            // InternalUseCase.g:452:3: (otherlv_0= 'description:' | otherlv_1= 'Kurzbeschreibung:' | otherlv_2= 'Beschreibung' ) ( (lv_name_3_0= RULE_STRING ) )
            {
            // InternalUseCase.g:452:3: (otherlv_0= 'description:' | otherlv_1= 'Kurzbeschreibung:' | otherlv_2= 'Beschreibung' )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt13=1;
                }
                break;
            case 20:
                {
                alt13=2;
                }
                break;
            case 21:
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
                    // InternalUseCase.g:453:4: otherlv_0= 'description:'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getDescriptionKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:458:4: otherlv_1= 'Kurzbeschreibung:'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getDescriptionAccess().getKurzbeschreibungKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalUseCase.g:463:4: otherlv_2= 'Beschreibung'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getDescriptionAccess().getBeschreibungKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:468:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalUseCase.g:469:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalUseCase.g:469:4: (lv_name_3_0= RULE_STRING )
            // InternalUseCase.g:470:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getDescriptionAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
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


    // $ANTLR start "entryRuleAllowedUserGroups"
    // InternalUseCase.g:490:1: entryRuleAllowedUserGroups returns [EObject current=null] : iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF ;
    public final EObject entryRuleAllowedUserGroups() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllowedUserGroups = null;


        try {
            // InternalUseCase.g:490:58: (iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF )
            // InternalUseCase.g:491:2: iv_ruleAllowedUserGroups= ruleAllowedUserGroups EOF
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
    // InternalUseCase.g:497:1: ruleAllowedUserGroups returns [EObject current=null] : ( (otherlv_0= 'allowed-usergroups:' | (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' ) ) ( (lv_groups_3_0= ruleAllowedUserGroup ) )* ) ;
    public final EObject ruleAllowedUserGroups() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_groups_3_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:503:2: ( ( (otherlv_0= 'allowed-usergroups:' | (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' ) ) ( (lv_groups_3_0= ruleAllowedUserGroup ) )* ) )
            // InternalUseCase.g:504:2: ( (otherlv_0= 'allowed-usergroups:' | (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' ) ) ( (lv_groups_3_0= ruleAllowedUserGroup ) )* )
            {
            // InternalUseCase.g:504:2: ( (otherlv_0= 'allowed-usergroups:' | (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' ) ) ( (lv_groups_3_0= ruleAllowedUserGroup ) )* )
            // InternalUseCase.g:505:3: (otherlv_0= 'allowed-usergroups:' | (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' ) ) ( (lv_groups_3_0= ruleAllowedUserGroup ) )*
            {
            // InternalUseCase.g:505:3: (otherlv_0= 'allowed-usergroups:' | (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            else if ( (LA14_0==23) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalUseCase.g:506:4: otherlv_0= 'allowed-usergroups:'
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_22); 

                    				newLeafNode(otherlv_0, grammarAccess.getAllowedUserGroupsAccess().getAllowedUsergroupsKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:511:4: (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' )
                    {
                    // InternalUseCase.g:511:4: (otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:' )
                    // InternalUseCase.g:512:5: otherlv_1= 'Erlaubt' otherlv_2= 'f\\u00FCr:'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_23); 

                    					newLeafNode(otherlv_1, grammarAccess.getAllowedUserGroupsAccess().getErlaubtKeyword_0_1_0());
                    				
                    otherlv_2=(Token)match(input,24,FOLLOW_22); 

                    					newLeafNode(otherlv_2, grammarAccess.getAllowedUserGroupsAccess().getFürKeyword_0_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:522:3: ( (lv_groups_3_0= ruleAllowedUserGroup ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=25 && LA15_0<=26)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalUseCase.g:523:4: (lv_groups_3_0= ruleAllowedUserGroup )
            	    {
            	    // InternalUseCase.g:523:4: (lv_groups_3_0= ruleAllowedUserGroup )
            	    // InternalUseCase.g:524:5: lv_groups_3_0= ruleAllowedUserGroup
            	    {

            	    					newCompositeNode(grammarAccess.getAllowedUserGroupsAccess().getGroupsAllowedUserGroupParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_groups_3_0=ruleAllowedUserGroup();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAllowedUserGroupsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"groups",
            	    						lv_groups_3_0,
            	    						"io.deniffel.dsl.useCase.UseCase.AllowedUserGroup");
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
    // $ANTLR end "ruleAllowedUserGroups"


    // $ANTLR start "entryRuleAllowedUserGroup"
    // InternalUseCase.g:545:1: entryRuleAllowedUserGroup returns [EObject current=null] : iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF ;
    public final EObject entryRuleAllowedUserGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllowedUserGroup = null;


        try {
            // InternalUseCase.g:545:57: (iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF )
            // InternalUseCase.g:546:2: iv_ruleAllowedUserGroup= ruleAllowedUserGroup EOF
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
    // InternalUseCase.g:552:1: ruleAllowedUserGroup returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final EObject ruleAllowedUserGroup() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalUseCase.g:558:2: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? ) )
            // InternalUseCase.g:559:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? )
            {
            // InternalUseCase.g:559:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )? )
            // InternalUseCase.g:560:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            {
            // InternalUseCase.g:560:3: ( (lv_many_0_0= 'many' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalUseCase.g:561:4: (lv_many_0_0= 'many' )
                    {
                    // InternalUseCase.g:561:4: (lv_many_0_0= 'many' )
                    // InternalUseCase.g:562:5: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,25,FOLLOW_24); 

                    					newLeafNode(lv_many_0_0, grammarAccess.getAllowedUserGroupAccess().getManyManyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAllowedUserGroupRule());
                    					}
                    					setWithLastConsumed(current, "many", true, "many");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getAllowedUserGroupAccess().getHyphenMinusKeyword_1());
            		
            // InternalUseCase.g:578:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalUseCase.g:579:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalUseCase.g:579:4: (lv_name_2_0= RULE_STRING )
            // InternalUseCase.g:580:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

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

            // InternalUseCase.g:596:3: (otherlv_3= 'as' ( (otherlv_4= RULE_ID ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUseCase.g:597:4: otherlv_3= 'as' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getAllowedUserGroupAccess().getAsKeyword_3_0());
                    			
                    // InternalUseCase.g:601:4: ( (otherlv_4= RULE_ID ) )
                    // InternalUseCase.g:602:5: (otherlv_4= RULE_ID )
                    {
                    // InternalUseCase.g:602:5: (otherlv_4= RULE_ID )
                    // InternalUseCase.g:603:6: otherlv_4= RULE_ID
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


    // $ANTLR start "entryRuleInputs"
    // InternalUseCase.g:619:1: entryRuleInputs returns [EObject current=null] : iv_ruleInputs= ruleInputs EOF ;
    public final EObject entryRuleInputs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputs = null;


        try {
            // InternalUseCase.g:619:47: (iv_ruleInputs= ruleInputs EOF )
            // InternalUseCase.g:620:2: iv_ruleInputs= ruleInputs EOF
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
    // InternalUseCase.g:626:1: ruleInputs returns [EObject current=null] : ( ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) | (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' ) ) ( (lv_inputs_10_0= ruleInput ) )* ) ;
    public final EObject ruleInputs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_inputs_10_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:632:2: ( ( ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) | (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' ) ) ( (lv_inputs_10_0= ruleInput ) )* ) )
            // InternalUseCase.g:633:2: ( ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) | (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' ) ) ( (lv_inputs_10_0= ruleInput ) )* )
            {
            // InternalUseCase.g:633:2: ( ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) | (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' ) ) ( (lv_inputs_10_0= ruleInput ) )* )
            // InternalUseCase.g:634:3: ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) | (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' ) ) ( (lv_inputs_10_0= ruleInput ) )*
            {
            // InternalUseCase.g:634:3: ( (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) ) | (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=28 && LA19_0<=30)) ) {
                alt19=1;
            }
            else if ( (LA19_0==35) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalUseCase.g:635:4: (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) )
                    {
                    // InternalUseCase.g:635:4: (otherlv_0= 'requires:' | otherlv_1= 'require:' | (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' ) )
                    int alt18=3;
                    switch ( input.LA(1) ) {
                    case 28:
                        {
                        alt18=1;
                        }
                        break;
                    case 29:
                        {
                        alt18=2;
                        }
                        break;
                    case 30:
                        {
                        alt18=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }

                    switch (alt18) {
                        case 1 :
                            // InternalUseCase.g:636:5: otherlv_0= 'requires:'
                            {
                            otherlv_0=(Token)match(input,28,FOLLOW_22); 

                            					newLeafNode(otherlv_0, grammarAccess.getInputsAccess().getRequiresKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUseCase.g:641:5: otherlv_1= 'require:'
                            {
                            otherlv_1=(Token)match(input,29,FOLLOW_22); 

                            					newLeafNode(otherlv_1, grammarAccess.getInputsAccess().getRequireKeyword_0_0_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalUseCase.g:646:5: (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' )
                            {
                            // InternalUseCase.g:646:5: (otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':' )
                            // InternalUseCase.g:647:6: otherlv_2= 'requires' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'input' otherlv_6= ':'
                            {
                            otherlv_2=(Token)match(input,30,FOLLOW_26); 

                            						newLeafNode(otherlv_2, grammarAccess.getInputsAccess().getRequiresKeyword_0_0_2_0());
                            					
                            otherlv_3=(Token)match(input,31,FOLLOW_27); 

                            						newLeafNode(otherlv_3, grammarAccess.getInputsAccess().getTheKeyword_0_0_2_1());
                            					
                            otherlv_4=(Token)match(input,32,FOLLOW_28); 

                            						newLeafNode(otherlv_4, grammarAccess.getInputsAccess().getFollowingKeyword_0_0_2_2());
                            					
                            otherlv_5=(Token)match(input,33,FOLLOW_29); 

                            						newLeafNode(otherlv_5, grammarAccess.getInputsAccess().getInputKeyword_0_0_2_3());
                            					
                            otherlv_6=(Token)match(input,34,FOLLOW_22); 

                            						newLeafNode(otherlv_6, grammarAccess.getInputsAccess().getColonKeyword_0_0_2_4());
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:670:4: (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' )
                    {
                    // InternalUseCase.g:670:4: (otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':' )
                    // InternalUseCase.g:671:5: otherlv_7= 'Ben\\u00F6tigte' otherlv_8= 'Zutaten' otherlv_9= ':'
                    {
                    otherlv_7=(Token)match(input,35,FOLLOW_30); 

                    					newLeafNode(otherlv_7, grammarAccess.getInputsAccess().getBenötigteKeyword_0_1_0());
                    				
                    otherlv_8=(Token)match(input,36,FOLLOW_29); 

                    					newLeafNode(otherlv_8, grammarAccess.getInputsAccess().getZutatenKeyword_0_1_1());
                    				
                    otherlv_9=(Token)match(input,34,FOLLOW_22); 

                    					newLeafNode(otherlv_9, grammarAccess.getInputsAccess().getColonKeyword_0_1_2());
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:685:3: ( (lv_inputs_10_0= ruleInput ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=25 && LA20_0<=26)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalUseCase.g:686:4: (lv_inputs_10_0= ruleInput )
            	    {
            	    // InternalUseCase.g:686:4: (lv_inputs_10_0= ruleInput )
            	    // InternalUseCase.g:687:5: lv_inputs_10_0= ruleInput
            	    {

            	    					newCompositeNode(grammarAccess.getInputsAccess().getInputsInputParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_inputs_10_0=ruleInput();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInputsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"inputs",
            	    						lv_inputs_10_0,
            	    						"io.deniffel.dsl.useCase.UseCase.Input");
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
    // $ANTLR end "ruleInputs"


    // $ANTLR start "entryRuleInput"
    // InternalUseCase.g:708:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalUseCase.g:708:46: (iv_ruleInput= ruleInput EOF )
            // InternalUseCase.g:709:2: iv_ruleInput= ruleInput EOF
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
    // InternalUseCase.g:715:1: ruleInput returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_optional_2_0= ruleOptional ) )? ( (lv_content_3_0= RULE_STRING ) ) ( (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')' )? ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token otherlv_1=null;
        Token lv_content_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_example_10_0=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_optional_2_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:721:2: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_optional_2_0= ruleOptional ) )? ( (lv_content_3_0= RULE_STRING ) ) ( (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')' )? ) )
            // InternalUseCase.g:722:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_optional_2_0= ruleOptional ) )? ( (lv_content_3_0= RULE_STRING ) ) ( (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')' )? )
            {
            // InternalUseCase.g:722:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_optional_2_0= ruleOptional ) )? ( (lv_content_3_0= RULE_STRING ) ) ( (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')' )? )
            // InternalUseCase.g:723:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_optional_2_0= ruleOptional ) )? ( (lv_content_3_0= RULE_STRING ) ) ( (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')' )?
            {
            // InternalUseCase.g:723:3: ( (lv_many_0_0= 'many' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUseCase.g:724:4: (lv_many_0_0= 'many' )
                    {
                    // InternalUseCase.g:724:4: (lv_many_0_0= 'many' )
                    // InternalUseCase.g:725:5: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,25,FOLLOW_24); 

                    					newLeafNode(lv_many_0_0, grammarAccess.getInputAccess().getManyManyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInputRule());
                    					}
                    					setWithLastConsumed(current, "many", true, "many");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,26,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getInputAccess().getHyphenMinusKeyword_1());
            		
            // InternalUseCase.g:741:3: ( (lv_optional_2_0= ruleOptional ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==47) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUseCase.g:742:4: (lv_optional_2_0= ruleOptional )
                    {
                    // InternalUseCase.g:742:4: (lv_optional_2_0= ruleOptional )
                    // InternalUseCase.g:743:5: lv_optional_2_0= ruleOptional
                    {

                    					newCompositeNode(grammarAccess.getInputAccess().getOptionalOptionalParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_optional_2_0=ruleOptional();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInputRule());
                    					}
                    					set(
                    						current,
                    						"optional",
                    						lv_optional_2_0,
                    						"io.deniffel.dsl.useCase.UseCase.Optional");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:760:3: ( (lv_content_3_0= RULE_STRING ) )
            // InternalUseCase.g:761:4: (lv_content_3_0= RULE_STRING )
            {
            // InternalUseCase.g:761:4: (lv_content_3_0= RULE_STRING )
            // InternalUseCase.g:762:5: lv_content_3_0= RULE_STRING
            {
            lv_content_3_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            					newLeafNode(lv_content_3_0, grammarAccess.getInputAccess().getContentSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalUseCase.g:778:3: ( (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==27||LA24_0==37) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUseCase.g:779:4: (otherlv_4= 'as' | otherlv_5= 'als' ) ( (otherlv_6= RULE_ID ) )
                    {
                    // InternalUseCase.g:779:4: (otherlv_4= 'as' | otherlv_5= 'als' )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==27) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==37) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalUseCase.g:780:5: otherlv_4= 'as'
                            {
                            otherlv_4=(Token)match(input,27,FOLLOW_6); 

                            					newLeafNode(otherlv_4, grammarAccess.getInputAccess().getAsKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUseCase.g:785:5: otherlv_5= 'als'
                            {
                            otherlv_5=(Token)match(input,37,FOLLOW_6); 

                            					newLeafNode(otherlv_5, grammarAccess.getInputAccess().getAlsKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalUseCase.g:790:4: ( (otherlv_6= RULE_ID ) )
                    // InternalUseCase.g:791:5: (otherlv_6= RULE_ID )
                    {
                    // InternalUseCase.g:791:5: (otherlv_6= RULE_ID )
                    // InternalUseCase.g:792:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInputRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_33); 

                    						newLeafNode(otherlv_6, grammarAccess.getInputAccess().getTypeTypeCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUseCase.g:804:3: (otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUseCase.g:805:4: otherlv_7= '(' (otherlv_8= 'e.g' | otherlv_9= 'z.B.' ) ( (lv_example_10_0= RULE_STRING ) ) otherlv_11= ')'
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_34); 

                    				newLeafNode(otherlv_7, grammarAccess.getInputAccess().getLeftParenthesisKeyword_5_0());
                    			
                    // InternalUseCase.g:809:4: (otherlv_8= 'e.g' | otherlv_9= 'z.B.' )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==39) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==40) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalUseCase.g:810:5: otherlv_8= 'e.g'
                            {
                            otherlv_8=(Token)match(input,39,FOLLOW_9); 

                            					newLeafNode(otherlv_8, grammarAccess.getInputAccess().getEGKeyword_5_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUseCase.g:815:5: otherlv_9= 'z.B.'
                            {
                            otherlv_9=(Token)match(input,40,FOLLOW_9); 

                            					newLeafNode(otherlv_9, grammarAccess.getInputAccess().getZBKeyword_5_1_1());
                            				

                            }
                            break;

                    }

                    // InternalUseCase.g:820:4: ( (lv_example_10_0= RULE_STRING ) )
                    // InternalUseCase.g:821:5: (lv_example_10_0= RULE_STRING )
                    {
                    // InternalUseCase.g:821:5: (lv_example_10_0= RULE_STRING )
                    // InternalUseCase.g:822:6: lv_example_10_0= RULE_STRING
                    {
                    lv_example_10_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

                    						newLeafNode(lv_example_10_0, grammarAccess.getInputAccess().getExampleSTRINGTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInputRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"example",
                    							lv_example_10_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,41,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getInputAccess().getRightParenthesisKeyword_5_3());
                    			

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


    // $ANTLR start "entryRuleOutputs"
    // InternalUseCase.g:847:1: entryRuleOutputs returns [EObject current=null] : iv_ruleOutputs= ruleOutputs EOF ;
    public final EObject entryRuleOutputs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputs = null;


        try {
            // InternalUseCase.g:847:48: (iv_ruleOutputs= ruleOutputs EOF )
            // InternalUseCase.g:848:2: iv_ruleOutputs= ruleOutputs EOF
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
    // InternalUseCase.g:854:1: ruleOutputs returns [EObject current=null] : ( ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) | otherlv_7= 'Ergebnis:' ) ( (lv_outputs_8_0= ruleOutput ) )* ) ;
    public final EObject ruleOutputs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_outputs_8_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:860:2: ( ( ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) | otherlv_7= 'Ergebnis:' ) ( (lv_outputs_8_0= ruleOutput ) )* ) )
            // InternalUseCase.g:861:2: ( ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) | otherlv_7= 'Ergebnis:' ) ( (lv_outputs_8_0= ruleOutput ) )* )
            {
            // InternalUseCase.g:861:2: ( ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) | otherlv_7= 'Ergebnis:' ) ( (lv_outputs_8_0= ruleOutput ) )* )
            // InternalUseCase.g:862:3: ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) | otherlv_7= 'Ergebnis:' ) ( (lv_outputs_8_0= ruleOutput ) )*
            {
            // InternalUseCase.g:862:3: ( (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) ) | otherlv_7= 'Ergebnis:' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=42 && LA28_0<=44)) ) {
                alt28=1;
            }
            else if ( (LA28_0==46) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalUseCase.g:863:4: (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) )
                    {
                    // InternalUseCase.g:863:4: (otherlv_0= 'produces:' | otherlv_1= 'produce:' | (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' ) )
                    int alt27=3;
                    switch ( input.LA(1) ) {
                    case 42:
                        {
                        alt27=1;
                        }
                        break;
                    case 43:
                        {
                        alt27=2;
                        }
                        break;
                    case 44:
                        {
                        alt27=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }

                    switch (alt27) {
                        case 1 :
                            // InternalUseCase.g:864:5: otherlv_0= 'produces:'
                            {
                            otherlv_0=(Token)match(input,42,FOLLOW_22); 

                            					newLeafNode(otherlv_0, grammarAccess.getOutputsAccess().getProducesKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUseCase.g:869:5: otherlv_1= 'produce:'
                            {
                            otherlv_1=(Token)match(input,43,FOLLOW_22); 

                            					newLeafNode(otherlv_1, grammarAccess.getOutputsAccess().getProduceKeyword_0_0_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalUseCase.g:874:5: (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' )
                            {
                            // InternalUseCase.g:874:5: (otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':' )
                            // InternalUseCase.g:875:6: otherlv_2= 'produces' otherlv_3= 'the' otherlv_4= 'following' otherlv_5= 'output' otherlv_6= ':'
                            {
                            otherlv_2=(Token)match(input,44,FOLLOW_26); 

                            						newLeafNode(otherlv_2, grammarAccess.getOutputsAccess().getProducesKeyword_0_0_2_0());
                            					
                            otherlv_3=(Token)match(input,31,FOLLOW_27); 

                            						newLeafNode(otherlv_3, grammarAccess.getOutputsAccess().getTheKeyword_0_0_2_1());
                            					
                            otherlv_4=(Token)match(input,32,FOLLOW_36); 

                            						newLeafNode(otherlv_4, grammarAccess.getOutputsAccess().getFollowingKeyword_0_0_2_2());
                            					
                            otherlv_5=(Token)match(input,45,FOLLOW_29); 

                            						newLeafNode(otherlv_5, grammarAccess.getOutputsAccess().getOutputKeyword_0_0_2_3());
                            					
                            otherlv_6=(Token)match(input,34,FOLLOW_22); 

                            						newLeafNode(otherlv_6, grammarAccess.getOutputsAccess().getColonKeyword_0_0_2_4());
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:898:4: otherlv_7= 'Ergebnis:'
                    {
                    otherlv_7=(Token)match(input,46,FOLLOW_22); 

                    				newLeafNode(otherlv_7, grammarAccess.getOutputsAccess().getErgebnisKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:903:3: ( (lv_outputs_8_0= ruleOutput ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=25 && LA29_0<=26)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalUseCase.g:904:4: (lv_outputs_8_0= ruleOutput )
            	    {
            	    // InternalUseCase.g:904:4: (lv_outputs_8_0= ruleOutput )
            	    // InternalUseCase.g:905:5: lv_outputs_8_0= ruleOutput
            	    {

            	    					newCompositeNode(grammarAccess.getOutputsAccess().getOutputsOutputParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_outputs_8_0=ruleOutput();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOutputsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"outputs",
            	    						lv_outputs_8_0,
            	    						"io.deniffel.dsl.useCase.UseCase.Output");
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
    // $ANTLR end "ruleOutputs"


    // $ANTLR start "entryRuleOutput"
    // InternalUseCase.g:926:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalUseCase.g:926:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalUseCase.g:927:2: iv_ruleOutput= ruleOutput EOF
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
    // InternalUseCase.g:933:1: ruleOutput returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) ( (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')' )? ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_example_9_0=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalUseCase.g:939:2: ( ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) ( (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')' )? ) )
            // InternalUseCase.g:940:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) ( (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')' )? )
            {
            // InternalUseCase.g:940:2: ( ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) ( (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')' )? )
            // InternalUseCase.g:941:3: ( (lv_many_0_0= 'many' ) )? otherlv_1= '-' ( (lv_content_2_0= RULE_STRING ) ) ( (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')' )?
            {
            // InternalUseCase.g:941:3: ( (lv_many_0_0= 'many' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==25) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalUseCase.g:942:4: (lv_many_0_0= 'many' )
                    {
                    // InternalUseCase.g:942:4: (lv_many_0_0= 'many' )
                    // InternalUseCase.g:943:5: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,25,FOLLOW_24); 

                    					newLeafNode(lv_many_0_0, grammarAccess.getOutputAccess().getManyManyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOutputRule());
                    					}
                    					setWithLastConsumed(current, "many", true, "many");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getHyphenMinusKeyword_1());
            		
            // InternalUseCase.g:959:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalUseCase.g:960:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalUseCase.g:960:4: (lv_content_2_0= RULE_STRING )
            // InternalUseCase.g:961:5: lv_content_2_0= RULE_STRING
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

            // InternalUseCase.g:977:3: ( (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==27||LA32_0==37) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalUseCase.g:978:4: (otherlv_3= 'as' | otherlv_4= 'als' ) ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalUseCase.g:978:4: (otherlv_3= 'as' | otherlv_4= 'als' )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==27) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==37) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalUseCase.g:979:5: otherlv_3= 'as'
                            {
                            otherlv_3=(Token)match(input,27,FOLLOW_6); 

                            					newLeafNode(otherlv_3, grammarAccess.getOutputAccess().getAsKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUseCase.g:984:5: otherlv_4= 'als'
                            {
                            otherlv_4=(Token)match(input,37,FOLLOW_6); 

                            					newLeafNode(otherlv_4, grammarAccess.getOutputAccess().getAlsKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalUseCase.g:989:4: ( (otherlv_5= RULE_ID ) )
                    // InternalUseCase.g:990:5: (otherlv_5= RULE_ID )
                    {
                    // InternalUseCase.g:990:5: (otherlv_5= RULE_ID )
                    // InternalUseCase.g:991:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutputRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_33); 

                    						newLeafNode(otherlv_5, grammarAccess.getOutputAccess().getTypeTypeCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUseCase.g:1003:3: (otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==38) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalUseCase.g:1004:4: otherlv_6= '(' (otherlv_7= 'e.g' | otherlv_8= 'z.B.' ) ( (lv_example_9_0= RULE_STRING ) ) otherlv_10= ')'
                    {
                    otherlv_6=(Token)match(input,38,FOLLOW_34); 

                    				newLeafNode(otherlv_6, grammarAccess.getOutputAccess().getLeftParenthesisKeyword_4_0());
                    			
                    // InternalUseCase.g:1008:4: (otherlv_7= 'e.g' | otherlv_8= 'z.B.' )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==39) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==40) ) {
                        alt33=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalUseCase.g:1009:5: otherlv_7= 'e.g'
                            {
                            otherlv_7=(Token)match(input,39,FOLLOW_9); 

                            					newLeafNode(otherlv_7, grammarAccess.getOutputAccess().getEGKeyword_4_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUseCase.g:1014:5: otherlv_8= 'z.B.'
                            {
                            otherlv_8=(Token)match(input,40,FOLLOW_9); 

                            					newLeafNode(otherlv_8, grammarAccess.getOutputAccess().getZBKeyword_4_1_1());
                            				

                            }
                            break;

                    }

                    // InternalUseCase.g:1019:4: ( (lv_example_9_0= RULE_STRING ) )
                    // InternalUseCase.g:1020:5: (lv_example_9_0= RULE_STRING )
                    {
                    // InternalUseCase.g:1020:5: (lv_example_9_0= RULE_STRING )
                    // InternalUseCase.g:1021:6: lv_example_9_0= RULE_STRING
                    {
                    lv_example_9_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

                    						newLeafNode(lv_example_9_0, grammarAccess.getOutputAccess().getExampleSTRINGTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutputRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"example",
                    							lv_example_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,41,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getOutputAccess().getRightParenthesisKeyword_4_3());
                    			

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


    // $ANTLR start "entryRuleOptional"
    // InternalUseCase.g:1046:1: entryRuleOptional returns [String current=null] : iv_ruleOptional= ruleOptional EOF ;
    public final String entryRuleOptional() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOptional = null;


        try {
            // InternalUseCase.g:1046:48: (iv_ruleOptional= ruleOptional EOF )
            // InternalUseCase.g:1047:2: iv_ruleOptional= ruleOptional EOF
            {
             newCompositeNode(grammarAccess.getOptionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptional=ruleOptional();

            state._fsp--;

             current =iv_ruleOptional.getText(); 
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
    // $ANTLR end "entryRuleOptional"


    // $ANTLR start "ruleOptional"
    // InternalUseCase.g:1053:1: ruleOptional returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'optional' ;
    public final AntlrDatatypeRuleToken ruleOptional() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUseCase.g:1059:2: (kw= 'optional' )
            // InternalUseCase.g:1060:2: kw= 'optional'
            {
            kw=(Token)match(input,47,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getOptionalAccess().getOptionalKeyword());
            	

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
    // $ANTLR end "ruleOptional"


    // $ANTLR start "entryRulePreConditions"
    // InternalUseCase.g:1068:1: entryRulePreConditions returns [EObject current=null] : iv_rulePreConditions= rulePreConditions EOF ;
    public final EObject entryRulePreConditions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreConditions = null;


        try {
            // InternalUseCase.g:1068:54: (iv_rulePreConditions= rulePreConditions EOF )
            // InternalUseCase.g:1069:2: iv_rulePreConditions= rulePreConditions EOF
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
    // InternalUseCase.g:1075:1: rulePreConditions returns [EObject current=null] : ( ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) | otherlv_2= 'Vorbedingungen:' ) ( (lv_conditions_3_0= ruleCondition ) )* ) ;
    public final EObject rulePreConditions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_conditions_3_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:1081:2: ( ( ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) | otherlv_2= 'Vorbedingungen:' ) ( (lv_conditions_3_0= ruleCondition ) )* ) )
            // InternalUseCase.g:1082:2: ( ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) | otherlv_2= 'Vorbedingungen:' ) ( (lv_conditions_3_0= ruleCondition ) )* )
            {
            // InternalUseCase.g:1082:2: ( ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) | otherlv_2= 'Vorbedingungen:' ) ( (lv_conditions_3_0= ruleCondition ) )* )
            // InternalUseCase.g:1083:3: ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) | otherlv_2= 'Vorbedingungen:' ) ( (lv_conditions_3_0= ruleCondition ) )*
            {
            // InternalUseCase.g:1083:3: ( (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' ) | otherlv_2= 'Vorbedingungen:' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=48 && LA36_0<=49)) ) {
                alt36=1;
            }
            else if ( (LA36_0==50) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalUseCase.g:1084:4: (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' )
                    {
                    // InternalUseCase.g:1084:4: (otherlv_0= 'pre-condition:' | otherlv_1= 'pre-conditions:' )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==48) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==49) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalUseCase.g:1085:5: otherlv_0= 'pre-condition:'
                            {
                            otherlv_0=(Token)match(input,48,FOLLOW_37); 

                            					newLeafNode(otherlv_0, grammarAccess.getPreConditionsAccess().getPreConditionKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUseCase.g:1090:5: otherlv_1= 'pre-conditions:'
                            {
                            otherlv_1=(Token)match(input,49,FOLLOW_37); 

                            					newLeafNode(otherlv_1, grammarAccess.getPreConditionsAccess().getPreConditionsKeyword_0_0_1());
                            				

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1096:4: otherlv_2= 'Vorbedingungen:'
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_37); 

                    				newLeafNode(otherlv_2, grammarAccess.getPreConditionsAccess().getVorbedingungenKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:1101:3: ( (lv_conditions_3_0= ruleCondition ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==26) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalUseCase.g:1102:4: (lv_conditions_3_0= ruleCondition )
            	    {
            	    // InternalUseCase.g:1102:4: (lv_conditions_3_0= ruleCondition )
            	    // InternalUseCase.g:1103:5: lv_conditions_3_0= ruleCondition
            	    {

            	    					newCompositeNode(grammarAccess.getPreConditionsAccess().getConditionsConditionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_37);
            	    lv_conditions_3_0=ruleCondition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPreConditionsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"conditions",
            	    						lv_conditions_3_0,
            	    						"io.deniffel.dsl.useCase.UseCase.Condition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalUseCase.g:1124:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalUseCase.g:1124:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalUseCase.g:1125:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalUseCase.g:1131:1: ruleCondition returns [EObject current=null] : (otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_content_1_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:1137:2: ( (otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) ) ) )
            // InternalUseCase.g:1138:2: (otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) ) )
            {
            // InternalUseCase.g:1138:2: (otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) ) )
            // InternalUseCase.g:1139:3: otherlv_0= '-' ( (lv_content_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getHyphenMinusKeyword_0());
            		
            // InternalUseCase.g:1143:3: ( (lv_content_1_0= RULE_STRING ) )
            // InternalUseCase.g:1144:4: (lv_content_1_0= RULE_STRING )
            {
            // InternalUseCase.g:1144:4: (lv_content_1_0= RULE_STRING )
            // InternalUseCase.g:1145:5: lv_content_1_0= RULE_STRING
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
    // InternalUseCase.g:1165:1: entryRuleSteps returns [EObject current=null] : iv_ruleSteps= ruleSteps EOF ;
    public final EObject entryRuleSteps() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSteps = null;


        try {
            // InternalUseCase.g:1165:46: (iv_ruleSteps= ruleSteps EOF )
            // InternalUseCase.g:1166:2: iv_ruleSteps= ruleSteps EOF
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
    // InternalUseCase.g:1172:1: ruleSteps returns [EObject current=null] : ( (otherlv_0= 'steps:' | otherlv_1= 'Schritte:' ) ( (lv_steps_2_0= ruleStep ) )* ) ;
    public final EObject ruleSteps() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_steps_2_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:1178:2: ( ( (otherlv_0= 'steps:' | otherlv_1= 'Schritte:' ) ( (lv_steps_2_0= ruleStep ) )* ) )
            // InternalUseCase.g:1179:2: ( (otherlv_0= 'steps:' | otherlv_1= 'Schritte:' ) ( (lv_steps_2_0= ruleStep ) )* )
            {
            // InternalUseCase.g:1179:2: ( (otherlv_0= 'steps:' | otherlv_1= 'Schritte:' ) ( (lv_steps_2_0= ruleStep ) )* )
            // InternalUseCase.g:1180:3: (otherlv_0= 'steps:' | otherlv_1= 'Schritte:' ) ( (lv_steps_2_0= ruleStep ) )*
            {
            // InternalUseCase.g:1180:3: (otherlv_0= 'steps:' | otherlv_1= 'Schritte:' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==51) ) {
                alt38=1;
            }
            else if ( (LA38_0==52) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalUseCase.g:1181:4: otherlv_0= 'steps:'
                    {
                    otherlv_0=(Token)match(input,51,FOLLOW_38); 

                    				newLeafNode(otherlv_0, grammarAccess.getStepsAccess().getStepsKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1186:4: otherlv_1= 'Schritte:'
                    {
                    otherlv_1=(Token)match(input,52,FOLLOW_38); 

                    				newLeafNode(otherlv_1, grammarAccess.getStepsAccess().getSchritteKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:1191:3: ( (lv_steps_2_0= ruleStep ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_INT) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalUseCase.g:1192:4: (lv_steps_2_0= ruleStep )
            	    {
            	    // InternalUseCase.g:1192:4: (lv_steps_2_0= ruleStep )
            	    // InternalUseCase.g:1193:5: lv_steps_2_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getStepsAccess().getStepsStepParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_38);
            	    lv_steps_2_0=ruleStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStepsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"steps",
            	    						lv_steps_2_0,
            	    						"io.deniffel.dsl.useCase.UseCase.Step");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalUseCase.g:1214:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalUseCase.g:1214:45: (iv_ruleStep= ruleStep EOF )
            // InternalUseCase.g:1215:2: iv_ruleStep= ruleStep EOF
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
    // InternalUseCase.g:1221:1: ruleStep returns [EObject current=null] : ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token lv_action_1_0=null;
        AntlrDatatypeRuleToken lv_number_0_0 = null;

        EObject lv_error_2_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:1227:2: ( ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? ) )
            // InternalUseCase.g:1228:2: ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? )
            {
            // InternalUseCase.g:1228:2: ( ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )? )
            // InternalUseCase.g:1229:3: ( (lv_number_0_0= ruleQualifiedNumber ) ) ( (lv_action_1_0= RULE_STRING ) ) ( (lv_error_2_0= ruleRaiseError ) )?
            {
            // InternalUseCase.g:1229:3: ( (lv_number_0_0= ruleQualifiedNumber ) )
            // InternalUseCase.g:1230:4: (lv_number_0_0= ruleQualifiedNumber )
            {
            // InternalUseCase.g:1230:4: (lv_number_0_0= ruleQualifiedNumber )
            // InternalUseCase.g:1231:5: lv_number_0_0= ruleQualifiedNumber
            {

            					newCompositeNode(grammarAccess.getStepAccess().getNumberQualifiedNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalUseCase.g:1248:3: ( (lv_action_1_0= RULE_STRING ) )
            // InternalUseCase.g:1249:4: (lv_action_1_0= RULE_STRING )
            {
            // InternalUseCase.g:1249:4: (lv_action_1_0= RULE_STRING )
            // InternalUseCase.g:1250:5: lv_action_1_0= RULE_STRING
            {
            lv_action_1_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

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

            // InternalUseCase.g:1266:3: ( (lv_error_2_0= ruleRaiseError ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==11||LA40_0==34) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalUseCase.g:1267:4: (lv_error_2_0= ruleRaiseError )
                    {
                    // InternalUseCase.g:1267:4: (lv_error_2_0= ruleRaiseError )
                    // InternalUseCase.g:1268:5: lv_error_2_0= ruleRaiseError
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
    // InternalUseCase.g:1289:1: entryRuleRaiseError returns [EObject current=null] : iv_ruleRaiseError= ruleRaiseError EOF ;
    public final EObject entryRuleRaiseError() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRaiseError = null;


        try {
            // InternalUseCase.g:1289:51: (iv_ruleRaiseError= ruleRaiseError EOF )
            // InternalUseCase.g:1290:2: iv_ruleRaiseError= ruleRaiseError EOF
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
    // InternalUseCase.g:1296:1: ruleRaiseError returns [EObject current=null] : ( (otherlv_0= '.' | otherlv_1= ':' ) ( ( (otherlv_2= 'Raise' (otherlv_3= 'error' )? ) | (otherlv_4= 'On' otherlv_5= 'error' otherlv_6= 'raise' ) ) | ( (otherlv_7= 'Melde' (otherlv_8= 'Fehler' )? ) | (otherlv_9= 'Bei' otherlv_10= 'Fehler' otherlv_11= 'melde' ) ) ) ( (lv_exception_12_0= ruleException ) ) ) ;
    public final EObject ruleRaiseError() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_exception_12_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:1302:2: ( ( (otherlv_0= '.' | otherlv_1= ':' ) ( ( (otherlv_2= 'Raise' (otherlv_3= 'error' )? ) | (otherlv_4= 'On' otherlv_5= 'error' otherlv_6= 'raise' ) ) | ( (otherlv_7= 'Melde' (otherlv_8= 'Fehler' )? ) | (otherlv_9= 'Bei' otherlv_10= 'Fehler' otherlv_11= 'melde' ) ) ) ( (lv_exception_12_0= ruleException ) ) ) )
            // InternalUseCase.g:1303:2: ( (otherlv_0= '.' | otherlv_1= ':' ) ( ( (otherlv_2= 'Raise' (otherlv_3= 'error' )? ) | (otherlv_4= 'On' otherlv_5= 'error' otherlv_6= 'raise' ) ) | ( (otherlv_7= 'Melde' (otherlv_8= 'Fehler' )? ) | (otherlv_9= 'Bei' otherlv_10= 'Fehler' otherlv_11= 'melde' ) ) ) ( (lv_exception_12_0= ruleException ) ) )
            {
            // InternalUseCase.g:1303:2: ( (otherlv_0= '.' | otherlv_1= ':' ) ( ( (otherlv_2= 'Raise' (otherlv_3= 'error' )? ) | (otherlv_4= 'On' otherlv_5= 'error' otherlv_6= 'raise' ) ) | ( (otherlv_7= 'Melde' (otherlv_8= 'Fehler' )? ) | (otherlv_9= 'Bei' otherlv_10= 'Fehler' otherlv_11= 'melde' ) ) ) ( (lv_exception_12_0= ruleException ) ) )
            // InternalUseCase.g:1304:3: (otherlv_0= '.' | otherlv_1= ':' ) ( ( (otherlv_2= 'Raise' (otherlv_3= 'error' )? ) | (otherlv_4= 'On' otherlv_5= 'error' otherlv_6= 'raise' ) ) | ( (otherlv_7= 'Melde' (otherlv_8= 'Fehler' )? ) | (otherlv_9= 'Bei' otherlv_10= 'Fehler' otherlv_11= 'melde' ) ) ) ( (lv_exception_12_0= ruleException ) )
            {
            // InternalUseCase.g:1304:3: (otherlv_0= '.' | otherlv_1= ':' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==11) ) {
                alt41=1;
            }
            else if ( (LA41_0==34) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalUseCase.g:1305:4: otherlv_0= '.'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_40); 

                    				newLeafNode(otherlv_0, grammarAccess.getRaiseErrorAccess().getFullStopKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1310:4: otherlv_1= ':'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_40); 

                    				newLeafNode(otherlv_1, grammarAccess.getRaiseErrorAccess().getColonKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:1315:3: ( ( (otherlv_2= 'Raise' (otherlv_3= 'error' )? ) | (otherlv_4= 'On' otherlv_5= 'error' otherlv_6= 'raise' ) ) | ( (otherlv_7= 'Melde' (otherlv_8= 'Fehler' )? ) | (otherlv_9= 'Bei' otherlv_10= 'Fehler' otherlv_11= 'melde' ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==53||LA46_0==55) ) {
                alt46=1;
            }
            else if ( (LA46_0==57||LA46_0==59) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalUseCase.g:1316:4: ( (otherlv_2= 'Raise' (otherlv_3= 'error' )? ) | (otherlv_4= 'On' otherlv_5= 'error' otherlv_6= 'raise' ) )
                    {
                    // InternalUseCase.g:1316:4: ( (otherlv_2= 'Raise' (otherlv_3= 'error' )? ) | (otherlv_4= 'On' otherlv_5= 'error' otherlv_6= 'raise' ) )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==53) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==55) ) {
                        alt43=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalUseCase.g:1317:5: (otherlv_2= 'Raise' (otherlv_3= 'error' )? )
                            {
                            // InternalUseCase.g:1317:5: (otherlv_2= 'Raise' (otherlv_3= 'error' )? )
                            // InternalUseCase.g:1318:6: otherlv_2= 'Raise' (otherlv_3= 'error' )?
                            {
                            otherlv_2=(Token)match(input,53,FOLLOW_41); 

                            						newLeafNode(otherlv_2, grammarAccess.getRaiseErrorAccess().getRaiseKeyword_1_0_0_0());
                            					
                            // InternalUseCase.g:1322:6: (otherlv_3= 'error' )?
                            int alt42=2;
                            int LA42_0 = input.LA(1);

                            if ( (LA42_0==54) ) {
                                alt42=1;
                            }
                            switch (alt42) {
                                case 1 :
                                    // InternalUseCase.g:1323:7: otherlv_3= 'error'
                                    {
                                    otherlv_3=(Token)match(input,54,FOLLOW_41); 

                                    							newLeafNode(otherlv_3, grammarAccess.getRaiseErrorAccess().getErrorKeyword_1_0_0_1());
                                    						

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalUseCase.g:1330:5: (otherlv_4= 'On' otherlv_5= 'error' otherlv_6= 'raise' )
                            {
                            // InternalUseCase.g:1330:5: (otherlv_4= 'On' otherlv_5= 'error' otherlv_6= 'raise' )
                            // InternalUseCase.g:1331:6: otherlv_4= 'On' otherlv_5= 'error' otherlv_6= 'raise'
                            {
                            otherlv_4=(Token)match(input,55,FOLLOW_42); 

                            						newLeafNode(otherlv_4, grammarAccess.getRaiseErrorAccess().getOnKeyword_1_0_1_0());
                            					
                            otherlv_5=(Token)match(input,54,FOLLOW_43); 

                            						newLeafNode(otherlv_5, grammarAccess.getRaiseErrorAccess().getErrorKeyword_1_0_1_1());
                            					
                            otherlv_6=(Token)match(input,56,FOLLOW_41); 

                            						newLeafNode(otherlv_6, grammarAccess.getRaiseErrorAccess().getRaiseKeyword_1_0_1_2());
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1346:4: ( (otherlv_7= 'Melde' (otherlv_8= 'Fehler' )? ) | (otherlv_9= 'Bei' otherlv_10= 'Fehler' otherlv_11= 'melde' ) )
                    {
                    // InternalUseCase.g:1346:4: ( (otherlv_7= 'Melde' (otherlv_8= 'Fehler' )? ) | (otherlv_9= 'Bei' otherlv_10= 'Fehler' otherlv_11= 'melde' ) )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==57) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==59) ) {
                        alt45=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalUseCase.g:1347:5: (otherlv_7= 'Melde' (otherlv_8= 'Fehler' )? )
                            {
                            // InternalUseCase.g:1347:5: (otherlv_7= 'Melde' (otherlv_8= 'Fehler' )? )
                            // InternalUseCase.g:1348:6: otherlv_7= 'Melde' (otherlv_8= 'Fehler' )?
                            {
                            otherlv_7=(Token)match(input,57,FOLLOW_44); 

                            						newLeafNode(otherlv_7, grammarAccess.getRaiseErrorAccess().getMeldeKeyword_1_1_0_0());
                            					
                            // InternalUseCase.g:1352:6: (otherlv_8= 'Fehler' )?
                            int alt44=2;
                            int LA44_0 = input.LA(1);

                            if ( (LA44_0==58) ) {
                                alt44=1;
                            }
                            switch (alt44) {
                                case 1 :
                                    // InternalUseCase.g:1353:7: otherlv_8= 'Fehler'
                                    {
                                    otherlv_8=(Token)match(input,58,FOLLOW_41); 

                                    							newLeafNode(otherlv_8, grammarAccess.getRaiseErrorAccess().getFehlerKeyword_1_1_0_1());
                                    						

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalUseCase.g:1360:5: (otherlv_9= 'Bei' otherlv_10= 'Fehler' otherlv_11= 'melde' )
                            {
                            // InternalUseCase.g:1360:5: (otherlv_9= 'Bei' otherlv_10= 'Fehler' otherlv_11= 'melde' )
                            // InternalUseCase.g:1361:6: otherlv_9= 'Bei' otherlv_10= 'Fehler' otherlv_11= 'melde'
                            {
                            otherlv_9=(Token)match(input,59,FOLLOW_45); 

                            						newLeafNode(otherlv_9, grammarAccess.getRaiseErrorAccess().getBeiKeyword_1_1_1_0());
                            					
                            otherlv_10=(Token)match(input,58,FOLLOW_46); 

                            						newLeafNode(otherlv_10, grammarAccess.getRaiseErrorAccess().getFehlerKeyword_1_1_1_1());
                            					
                            otherlv_11=(Token)match(input,60,FOLLOW_41); 

                            						newLeafNode(otherlv_11, grammarAccess.getRaiseErrorAccess().getMeldeKeyword_1_1_1_2());
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalUseCase.g:1376:3: ( (lv_exception_12_0= ruleException ) )
            // InternalUseCase.g:1377:4: (lv_exception_12_0= ruleException )
            {
            // InternalUseCase.g:1377:4: (lv_exception_12_0= ruleException )
            // InternalUseCase.g:1378:5: lv_exception_12_0= ruleException
            {

            					newCompositeNode(grammarAccess.getRaiseErrorAccess().getExceptionExceptionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_exception_12_0=ruleException();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRaiseErrorRule());
            					}
            					set(
            						current,
            						"exception",
            						lv_exception_12_0,
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


    // $ANTLR start "entryRuleNotes"
    // InternalUseCase.g:1399:1: entryRuleNotes returns [EObject current=null] : iv_ruleNotes= ruleNotes EOF ;
    public final EObject entryRuleNotes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotes = null;


        try {
            // InternalUseCase.g:1399:46: (iv_ruleNotes= ruleNotes EOF )
            // InternalUseCase.g:1400:2: iv_ruleNotes= ruleNotes EOF
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
    // InternalUseCase.g:1406:1: ruleNotes returns [EObject current=null] : ( ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) | (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' ) ) ( (lv_content_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleNotes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_content_4_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:1412:2: ( ( ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) | (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' ) ) ( (lv_content_4_0= RULE_STRING ) ) ) )
            // InternalUseCase.g:1413:2: ( ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) | (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' ) ) ( (lv_content_4_0= RULE_STRING ) ) )
            {
            // InternalUseCase.g:1413:2: ( ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) | (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' ) ) ( (lv_content_4_0= RULE_STRING ) ) )
            // InternalUseCase.g:1414:3: ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) | (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' ) ) ( (lv_content_4_0= RULE_STRING ) )
            {
            // InternalUseCase.g:1414:3: ( (otherlv_0= 'notes:' | otherlv_1= 'note:' ) | (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=61 && LA49_0<=62)) ) {
                alt49=1;
            }
            else if ( ((LA49_0>=63 && LA49_0<=64)) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalUseCase.g:1415:4: (otherlv_0= 'notes:' | otherlv_1= 'note:' )
                    {
                    // InternalUseCase.g:1415:4: (otherlv_0= 'notes:' | otherlv_1= 'note:' )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==61) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==62) ) {
                        alt47=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalUseCase.g:1416:5: otherlv_0= 'notes:'
                            {
                            otherlv_0=(Token)match(input,61,FOLLOW_9); 

                            					newLeafNode(otherlv_0, grammarAccess.getNotesAccess().getNotesKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUseCase.g:1421:5: otherlv_1= 'note:'
                            {
                            otherlv_1=(Token)match(input,62,FOLLOW_9); 

                            					newLeafNode(otherlv_1, grammarAccess.getNotesAccess().getNoteKeyword_0_0_1());
                            				

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1427:4: (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' )
                    {
                    // InternalUseCase.g:1427:4: (otherlv_2= 'Anmerkungen:' | otherlv_3= 'Anmerkung:' )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==63) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==64) ) {
                        alt48=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalUseCase.g:1428:5: otherlv_2= 'Anmerkungen:'
                            {
                            otherlv_2=(Token)match(input,63,FOLLOW_9); 

                            					newLeafNode(otherlv_2, grammarAccess.getNotesAccess().getAnmerkungenKeyword_0_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUseCase.g:1433:5: otherlv_3= 'Anmerkung:'
                            {
                            otherlv_3=(Token)match(input,64,FOLLOW_9); 

                            					newLeafNode(otherlv_3, grammarAccess.getNotesAccess().getAnmerkungKeyword_0_1_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalUseCase.g:1439:3: ( (lv_content_4_0= RULE_STRING ) )
            // InternalUseCase.g:1440:4: (lv_content_4_0= RULE_STRING )
            {
            // InternalUseCase.g:1440:4: (lv_content_4_0= RULE_STRING )
            // InternalUseCase.g:1441:5: lv_content_4_0= RULE_STRING
            {
            lv_content_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_content_4_0, grammarAccess.getNotesAccess().getContentSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNotesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_4_0,
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


    // $ANTLR start "entryRuleUsedTypes"
    // InternalUseCase.g:1461:1: entryRuleUsedTypes returns [EObject current=null] : iv_ruleUsedTypes= ruleUsedTypes EOF ;
    public final EObject entryRuleUsedTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsedTypes = null;


        try {
            // InternalUseCase.g:1461:50: (iv_ruleUsedTypes= ruleUsedTypes EOF )
            // InternalUseCase.g:1462:2: iv_ruleUsedTypes= ruleUsedTypes EOF
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
    // InternalUseCase.g:1468:1: ruleUsedTypes returns [EObject current=null] : ( ( (otherlv_0= 'used' otherlv_1= 'types:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Typen:' ) ) ( (lv_types_4_0= ruleType ) )* ) ;
    public final EObject ruleUsedTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_types_4_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:1474:2: ( ( ( (otherlv_0= 'used' otherlv_1= 'types:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Typen:' ) ) ( (lv_types_4_0= ruleType ) )* ) )
            // InternalUseCase.g:1475:2: ( ( (otherlv_0= 'used' otherlv_1= 'types:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Typen:' ) ) ( (lv_types_4_0= ruleType ) )* )
            {
            // InternalUseCase.g:1475:2: ( ( (otherlv_0= 'used' otherlv_1= 'types:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Typen:' ) ) ( (lv_types_4_0= ruleType ) )* )
            // InternalUseCase.g:1476:3: ( (otherlv_0= 'used' otherlv_1= 'types:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Typen:' ) ) ( (lv_types_4_0= ruleType ) )*
            {
            // InternalUseCase.g:1476:3: ( (otherlv_0= 'used' otherlv_1= 'types:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Typen:' ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==65) ) {
                alt50=1;
            }
            else if ( (LA50_0==67) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalUseCase.g:1477:4: (otherlv_0= 'used' otherlv_1= 'types:' )
                    {
                    // InternalUseCase.g:1477:4: (otherlv_0= 'used' otherlv_1= 'types:' )
                    // InternalUseCase.g:1478:5: otherlv_0= 'used' otherlv_1= 'types:'
                    {
                    otherlv_0=(Token)match(input,65,FOLLOW_47); 

                    					newLeafNode(otherlv_0, grammarAccess.getUsedTypesAccess().getUsedKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,66,FOLLOW_37); 

                    					newLeafNode(otherlv_1, grammarAccess.getUsedTypesAccess().getTypesKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1488:4: (otherlv_2= 'Genutzte' otherlv_3= 'Typen:' )
                    {
                    // InternalUseCase.g:1488:4: (otherlv_2= 'Genutzte' otherlv_3= 'Typen:' )
                    // InternalUseCase.g:1489:5: otherlv_2= 'Genutzte' otherlv_3= 'Typen:'
                    {
                    otherlv_2=(Token)match(input,67,FOLLOW_48); 

                    					newLeafNode(otherlv_2, grammarAccess.getUsedTypesAccess().getGenutzteKeyword_0_1_0());
                    				
                    otherlv_3=(Token)match(input,68,FOLLOW_37); 

                    					newLeafNode(otherlv_3, grammarAccess.getUsedTypesAccess().getTypenKeyword_0_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:1499:3: ( (lv_types_4_0= ruleType ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==26) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalUseCase.g:1500:4: (lv_types_4_0= ruleType )
            	    {
            	    // InternalUseCase.g:1500:4: (lv_types_4_0= ruleType )
            	    // InternalUseCase.g:1501:5: lv_types_4_0= ruleType
            	    {

            	    					newCompositeNode(grammarAccess.getUsedTypesAccess().getTypesTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_37);
            	    lv_types_4_0=ruleType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUsedTypesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"types",
            	    						lv_types_4_0,
            	    						"io.deniffel.dsl.useCase.UseCase.Type");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
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


    // $ANTLR start "entryRuleType"
    // InternalUseCase.g:1522:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalUseCase.g:1522:45: (iv_ruleType= ruleType EOF )
            // InternalUseCase.g:1523:2: iv_ruleType= ruleType EOF
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
    // InternalUseCase.g:1529:1: ruleType returns [EObject current=null] : (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) ;
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
            // InternalUseCase.g:1535:2: ( (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) )
            // InternalUseCase.g:1536:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            {
            // InternalUseCase.g:1536:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            // InternalUseCase.g:1537:3: otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getHyphenMinusKeyword_0());
            		
            // InternalUseCase.g:1541:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUseCase.g:1542:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUseCase.g:1542:4: (lv_name_1_0= RULE_ID )
            // InternalUseCase.g:1543:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_49); 

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

            otherlv_2=(Token)match(input,38,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_2());
            		
            // InternalUseCase.g:1563:3: ( (lv_description_3_0= RULE_STRING ) )
            // InternalUseCase.g:1564:4: (lv_description_3_0= RULE_STRING )
            {
            // InternalUseCase.g:1564:4: (lv_description_3_0= RULE_STRING )
            // InternalUseCase.g:1565:5: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

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

            otherlv_4=(Token)match(input,41,FOLLOW_50); 

            			newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getRightParenthesisKeyword_4());
            		
            // InternalUseCase.g:1585:3: (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==69) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalUseCase.g:1586:4: otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,69,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_5_0());
                    			
                    // InternalUseCase.g:1590:4: ( (lv_importInfo_6_0= ruleQualifiedName ) )
                    // InternalUseCase.g:1591:5: (lv_importInfo_6_0= ruleQualifiedName )
                    {
                    // InternalUseCase.g:1591:5: (lv_importInfo_6_0= ruleQualifiedName )
                    // InternalUseCase.g:1592:6: lv_importInfo_6_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getTypeAccess().getImportInfoQualifiedNameParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_51);
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

                    otherlv_7=(Token)match(input,70,FOLLOW_2); 

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


    // $ANTLR start "entryRuleUsedExceptions"
    // InternalUseCase.g:1618:1: entryRuleUsedExceptions returns [EObject current=null] : iv_ruleUsedExceptions= ruleUsedExceptions EOF ;
    public final EObject entryRuleUsedExceptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsedExceptions = null;


        try {
            // InternalUseCase.g:1618:55: (iv_ruleUsedExceptions= ruleUsedExceptions EOF )
            // InternalUseCase.g:1619:2: iv_ruleUsedExceptions= ruleUsedExceptions EOF
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
    // InternalUseCase.g:1625:1: ruleUsedExceptions returns [EObject current=null] : ( ( (otherlv_0= 'used' otherlv_1= 'errors:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' ) ) ( (lv_exceptions_4_0= ruleExceptionDecleration ) )* ) ;
    public final EObject ruleUsedExceptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_exceptions_4_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:1631:2: ( ( ( (otherlv_0= 'used' otherlv_1= 'errors:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' ) ) ( (lv_exceptions_4_0= ruleExceptionDecleration ) )* ) )
            // InternalUseCase.g:1632:2: ( ( (otherlv_0= 'used' otherlv_1= 'errors:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' ) ) ( (lv_exceptions_4_0= ruleExceptionDecleration ) )* )
            {
            // InternalUseCase.g:1632:2: ( ( (otherlv_0= 'used' otherlv_1= 'errors:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' ) ) ( (lv_exceptions_4_0= ruleExceptionDecleration ) )* )
            // InternalUseCase.g:1633:3: ( (otherlv_0= 'used' otherlv_1= 'errors:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' ) ) ( (lv_exceptions_4_0= ruleExceptionDecleration ) )*
            {
            // InternalUseCase.g:1633:3: ( (otherlv_0= 'used' otherlv_1= 'errors:' ) | (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==65) ) {
                alt53=1;
            }
            else if ( (LA53_0==67) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalUseCase.g:1634:4: (otherlv_0= 'used' otherlv_1= 'errors:' )
                    {
                    // InternalUseCase.g:1634:4: (otherlv_0= 'used' otherlv_1= 'errors:' )
                    // InternalUseCase.g:1635:5: otherlv_0= 'used' otherlv_1= 'errors:'
                    {
                    otherlv_0=(Token)match(input,65,FOLLOW_52); 

                    					newLeafNode(otherlv_0, grammarAccess.getUsedExceptionsAccess().getUsedKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,71,FOLLOW_37); 

                    					newLeafNode(otherlv_1, grammarAccess.getUsedExceptionsAccess().getErrorsKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCase.g:1645:4: (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' )
                    {
                    // InternalUseCase.g:1645:4: (otherlv_2= 'Genutzte' otherlv_3= 'Fehler:' )
                    // InternalUseCase.g:1646:5: otherlv_2= 'Genutzte' otherlv_3= 'Fehler:'
                    {
                    otherlv_2=(Token)match(input,67,FOLLOW_53); 

                    					newLeafNode(otherlv_2, grammarAccess.getUsedExceptionsAccess().getGenutzteKeyword_0_1_0());
                    				
                    otherlv_3=(Token)match(input,72,FOLLOW_37); 

                    					newLeafNode(otherlv_3, grammarAccess.getUsedExceptionsAccess().getFehlerKeyword_0_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalUseCase.g:1656:3: ( (lv_exceptions_4_0= ruleExceptionDecleration ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==26) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalUseCase.g:1657:4: (lv_exceptions_4_0= ruleExceptionDecleration )
            	    {
            	    // InternalUseCase.g:1657:4: (lv_exceptions_4_0= ruleExceptionDecleration )
            	    // InternalUseCase.g:1658:5: lv_exceptions_4_0= ruleExceptionDecleration
            	    {

            	    					newCompositeNode(grammarAccess.getUsedExceptionsAccess().getExceptionsExceptionDeclerationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_37);
            	    lv_exceptions_4_0=ruleExceptionDecleration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUsedExceptionsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"exceptions",
            	    						lv_exceptions_4_0,
            	    						"io.deniffel.dsl.useCase.UseCase.ExceptionDecleration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
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


    // $ANTLR start "entryRuleException"
    // InternalUseCase.g:1679:1: entryRuleException returns [EObject current=null] : iv_ruleException= ruleException EOF ;
    public final EObject entryRuleException() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleException = null;


        try {
            // InternalUseCase.g:1679:50: (iv_ruleException= ruleException EOF )
            // InternalUseCase.g:1680:2: iv_ruleException= ruleException EOF
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
    // InternalUseCase.g:1686:1: ruleException returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleException() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalUseCase.g:1692:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalUseCase.g:1693:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalUseCase.g:1693:2: ( (otherlv_0= RULE_ID ) )
            // InternalUseCase.g:1694:3: (otherlv_0= RULE_ID )
            {
            // InternalUseCase.g:1694:3: (otherlv_0= RULE_ID )
            // InternalUseCase.g:1695:4: otherlv_0= RULE_ID
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


    // $ANTLR start "entryRuleExceptionDecleration"
    // InternalUseCase.g:1709:1: entryRuleExceptionDecleration returns [EObject current=null] : iv_ruleExceptionDecleration= ruleExceptionDecleration EOF ;
    public final EObject entryRuleExceptionDecleration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExceptionDecleration = null;


        try {
            // InternalUseCase.g:1709:61: (iv_ruleExceptionDecleration= ruleExceptionDecleration EOF )
            // InternalUseCase.g:1710:2: iv_ruleExceptionDecleration= ruleExceptionDecleration EOF
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
    // InternalUseCase.g:1716:1: ruleExceptionDecleration returns [EObject current=null] : (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) ;
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
            // InternalUseCase.g:1722:2: ( (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? ) )
            // InternalUseCase.g:1723:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            {
            // InternalUseCase.g:1723:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )? )
            // InternalUseCase.g:1724:3: otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ')' (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExceptionDeclerationAccess().getHyphenMinusKeyword_0());
            		
            // InternalUseCase.g:1728:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUseCase.g:1729:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUseCase.g:1729:4: (lv_name_1_0= RULE_ID )
            // InternalUseCase.g:1730:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_49); 

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

            otherlv_2=(Token)match(input,38,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getExceptionDeclerationAccess().getLeftParenthesisKeyword_2());
            		
            // InternalUseCase.g:1750:3: ( (lv_message_3_0= RULE_STRING ) )
            // InternalUseCase.g:1751:4: (lv_message_3_0= RULE_STRING )
            {
            // InternalUseCase.g:1751:4: (lv_message_3_0= RULE_STRING )
            // InternalUseCase.g:1752:5: lv_message_3_0= RULE_STRING
            {
            lv_message_3_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

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

            otherlv_4=(Token)match(input,41,FOLLOW_50); 

            			newLeafNode(otherlv_4, grammarAccess.getExceptionDeclerationAccess().getRightParenthesisKeyword_4());
            		
            // InternalUseCase.g:1772:3: (otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==69) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalUseCase.g:1773:4: otherlv_5= '[' ( (lv_importInfo_6_0= ruleQualifiedName ) ) otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,69,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getExceptionDeclerationAccess().getLeftSquareBracketKeyword_5_0());
                    			
                    // InternalUseCase.g:1777:4: ( (lv_importInfo_6_0= ruleQualifiedName ) )
                    // InternalUseCase.g:1778:5: (lv_importInfo_6_0= ruleQualifiedName )
                    {
                    // InternalUseCase.g:1778:5: (lv_importInfo_6_0= ruleQualifiedName )
                    // InternalUseCase.g:1779:6: lv_importInfo_6_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getExceptionDeclerationAccess().getImportInfoQualifiedNameParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_51);
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

                    otherlv_7=(Token)match(input,70,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003000L,0x000000000000000AL});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0xE01F5C0870F94000L,0x0000000000000001L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0xE01F5C0870C14000L,0x0000000000000001L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0xE01F5C0870014000L,0x0000000000000001L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0xE01F5C0000014000L,0x0000000000000001L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0xE01F000000014000L,0x0000000000000001L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0xE018000000014000L,0x0000000000000001L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0xE000000000014000L,0x0000000000000001L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000800000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000006008000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000400000802L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0AA0000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0040000000000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0440000000000010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});

}